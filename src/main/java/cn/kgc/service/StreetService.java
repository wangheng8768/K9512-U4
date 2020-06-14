package cn.kgc.service;

import cn.kgc.entity.Street;

import java.util.List;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:30
 * @Description :
 * @Created by 王恒
 */
public interface StreetService {

    /**
     * 功能: 根据区域获取街道
     * @author Mr.Wang
     * @date 2020/6/6 17:25
     * @params [id]
     * @return {@link List< Street>}
    */
    List<Street> getAllStreetByDistrict(Integer id);
}
