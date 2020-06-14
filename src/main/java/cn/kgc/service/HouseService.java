package cn.kgc.service;

import cn.kgc.entity.House;
import cn.kgc.entity.HouseCondition;
import cn.kgc.result.BaseResult;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:30
 * @Description :
 * @Created by 王恒
 */
public interface HouseService {

    /**
     * 功能: 发布房屋
     * @author Mr.Wang
     * @date 2020/6/8 20:07
     * @params [house]
     * @return {@link int}
    */
    public int publishHouse(House house);

    /**
     * 功能: 获得当前用户下的出租房
     * @author Mr.Wang
     * @date 2020/6/9 21:50
     * @params []
     * @return {@link Page< House>}
    */
    public BaseResult getHouseByCurrentUser(Integer currentPage, Integer userId);


    /**
     * 功能: 根据id查询当前出租房
     * @author Mr.Wang
     * @date 2020/6/10 20:35
     * @params [id]
     * @return {@link House}
    */
    public  House getHouseById(String id);


    /**
     * 功能: 根据id删除当前出租房
     * @author Mr.Wang
     * @date 2020/6/10 20:43
     * @params [id]
     * @return {@link int}
    */
    public  int updateHouseIsdel(String id);

    IPage<Map<String, Object>> getHouseByCondition(Integer currentPage, HouseCondition houseCondition);
}
