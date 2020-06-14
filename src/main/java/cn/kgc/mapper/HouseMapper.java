package cn.kgc.mapper;

import cn.kgc.entity.House;
import cn.kgc.entity.HouseCondition;
import cn.kgc.entity.HouseExample;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


@Repository
public interface HouseMapper extends BaseMapper<House> {

    /**
     * 功能:  分页查询多表数据
     * @author Mr.Wang
     * @date 2020/6/10 9:11
     * @params [page, userId]
     * @return {@link Page< Map< String, Object>>}
    */
    IPage<Map<String, Object>> getHouseByCurrentUser(IPage<House> page, @Param(value = "userId")Integer userId);

    /**
     * 功能:  根据id更新出租放删除字段
     * @author Mr.Wang
     * @date 2020/6/11 20:24
     * @params [id]
     * @return {@link int}
    */
    @Update(" update house set isdel = 1 where ID = #{id} ")
    int updateHouseIsdel(String id);


    /**
     * 功能: 根据条件查询出租房
     * @author Mr.Wang
     * @date 2020/6/12 20:41
     * @params [page, houseCondition]
     * @return {@link IPage< Map< String, Object>>}
    */
    Page<Map<String, Object>> getHouseByCondition(Page page, @Param("houseCondition") HouseCondition houseCondition);
}