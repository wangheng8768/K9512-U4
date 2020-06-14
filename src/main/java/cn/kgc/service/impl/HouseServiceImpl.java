package cn.kgc.service.impl;

import cn.kgc.entity.House;
import cn.kgc.entity.HouseCondition;
import cn.kgc.mapper.HouseMapper;
import cn.kgc.result.BaseResult;
import cn.kgc.service.HouseService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:41
 * @Description :
 * @Created by 王恒
 */
@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;

    /**
     * 功能:  添加出租的房屋
     * @author Mr.Wang
     * @date 2020/6/9 21:48
     * @params [house]
     * @return {@link int}
    */
    @Override
    public int publishHouse(House house) {

        return houseMapper.insert(house);
    }

    /**
     * 功能: 根据当前用户查询房子信息
     * @author Mr.Wang
     * @date 2020/6/9 22:03
     * @params []
     * @return {@link BaseResult}
    */
    @Override
    public BaseResult getHouseByCurrentUser(Integer currentPage, Integer userId) {

        //分页插件
        Page<House> page = new Page<>(currentPage,5);

        //获得当前用户
        IPage<Map<String, Object>> iPage = houseMapper.getHouseByCurrentUser(page, userId);
        //List<Map<String, Object>> houseList = iPage.getRecords();

        return new BaseResult(1,"成功",iPage);
    }

    @Override
    public House getHouseById(String id) {

        return houseMapper.selectById(id);
    }

    @Override
    public int updateHouseIsdel(String id) {

        return houseMapper.updateHouseIsdel(id);
    }

    @Override
    public Page<Map<String, Object>> getHouseByCondition(Integer currentPage, HouseCondition houseCondition) {

        //分页插件
        Page<Map<String, Object>> page = new Page<>(currentPage,2);

        Page<Map<String, Object>> iPage = houseMapper.getHouseByCondition(page,houseCondition);

        return iPage;
    }


}
