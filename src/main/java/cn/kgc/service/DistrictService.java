package cn.kgc.service;

import cn.kgc.entity.District;

import java.util.List;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:24
 * @Description :
 * @Created by 王恒
 */
public interface DistrictService {

    /**
     * 功能: 获得所有区域
     * @author Mr.Wang
     * @date 2020/6/6 17:17
     * @params []
     * @return {@link List<District>}
    */
    List<District> getAllDistrict();
}
