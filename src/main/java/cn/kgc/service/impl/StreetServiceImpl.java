package cn.kgc.service.impl;

import cn.kgc.entity.Street;
import cn.kgc.entity.StreetExample;
import cn.kgc.mapper.StreetMapper;
import cn.kgc.service.StreetService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:41
 * @Description :
 * @Created by 王恒
 */
@Service
public class StreetServiceImpl implements StreetService {

    @Autowired
    private StreetMapper streetMapper;

    @Override
    public List<Street> getAllStreetByDistrict(Integer id) {
        //查询条件
        QueryWrapper<Street> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("district_Id",id);
        return streetMapper.selectList(queryWrapper);
    }
}
