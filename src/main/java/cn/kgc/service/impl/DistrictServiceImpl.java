package cn.kgc.service.impl;

import cn.kgc.entity.District;
import cn.kgc.entity.DistrictExample;
import cn.kgc.mapper.DistrictMapper;
import cn.kgc.service.DistrictService;
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
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public List<District> getAllDistrict() {

        return districtMapper.selectList(null);
    }
}
