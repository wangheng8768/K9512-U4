package cn.kgc.service;

import cn.kgc.entity.Type;

import java.util.List;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:31
 * @Description :
 * @Created by 王恒
 */
public interface TypeService {

    /**
     * 功能:  获得所有类型
     * @author Mr.Wang
     * @date 2020/6/5 20:12
     * @params []
     * @return {@link List< Type>}
    */
    List<Type> getAllType();
}
