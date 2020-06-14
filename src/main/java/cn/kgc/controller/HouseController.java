package cn.kgc.controller;

import cn.kgc.entity.House;
import cn.kgc.entity.Users;
import cn.kgc.entity.HouseCondition;
import cn.kgc.result.BaseResult;
import cn.kgc.service.HouseService;
import cn.kgc.util.FileUploadUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:21
 * @Description :
 * @Created by 王恒
 */
@RestController
public class HouseController {

    @Autowired
    private HouseService houseService;

    /**
     * 功能: 发布房屋
     * @author Mr.Wang
     * @date 2020/6/8 20:10
     * @params []
     * @return {@link BaseResult}
    */
    @RequestMapping("/publishHouse")
    public BaseResult publishHouse(HttpSession session, House house, @RequestParam(value = "file") MultipartFile file){

        //接收图片的文件服务器
        String path = "D:\\VSCodePractice\\lethouse\\images";
        String newName = "";
        try {
            newName = FileUploadUtil.upload(file, path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        house.setId(String.valueOf(System.currentTimeMillis()));
        house.setPath(newName);
        Users user = (Users)session.getAttribute("user");
        house.setUserId(user.getId());
        int i = houseService.publishHouse(house);
        return new BaseResult(i,"成功");
    }

    /**
     * 功能: 获得当前用户的出租房
     * @author Mr.Wang
     * @date 2020/6/10 20:32
     * @params [currentPage, session]
     * @return {@link BaseResult}
    */
    @RequestMapping("/getHouseByCurrentUser/{currentPage}")
    public BaseResult getHouseByCurrentUser(@PathVariable("currentPage") Integer currentPage, HttpSession session) {
        //获得当前用户
        Users user = (Users)session.getAttribute("user");
        return houseService.getHouseByCurrentUser(currentPage,user.getId());
    }

    /**
     * 功能: 根据id查询出租房
     * @author Mr.Wang
     * @date 2020/6/10 20:33
     * @params []
     * @return {@link BaseResult}
    */
    @RequestMapping("/getHouseById/{id}")
    public  BaseResult getHouseById(@PathVariable("id")String id){

        House house = houseService.getHouseById(id);
        //System.out.println(house);
        return new BaseResult(1,"成功",house);
    }


    /**
     * 功能: 根据id删除出租房
     * @author Mr.Wang
     * @date 2020/6/10 20:42
     * @params [id]
     * @return {@link BaseResult}
    */
    @RequestMapping("/updateHouseIsdel/{id}")
    public  BaseResult updateHouseIsdel(@PathVariable("id")String id){

        int i = houseService.updateHouseIsdel(id);

        return new BaseResult(1,"成功",i);
    }

    /**
     * 功能: 获得出租放根据搜索条件
     * @author Mr.Wang
     * @date 2020/6/12 16:06
     * @params [houseCondition]
     * @return {@link BaseResult}
    */
    @RequestMapping("/getHouseByCondition/{currentPage}")
    public  BaseResult getHouseByCondition(@PathVariable("currentPage") Integer currentPage, HouseCondition houseCondition){

        //System.out.println(houseCondition);
        IPage<Map<String, Object>> house = houseService.getHouseByCondition(currentPage,houseCondition);
        return new BaseResult(1,"成功",house);
    }
}
