package cn.kgc.service;

import cn.kgc.entity.Users;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:31
 * @Description :
 * @Created by 王恒
 */
public interface UsersService {

    /**
     * 功能: 注册用户
     * @author Mr.Wang
     * @date 2020/6/7 16:03
     * @params [users]
     * @return {@link int}
    */
    public int registerUser(Users users);

    /**
     * 功能: 用户登录
     * @author Mr.Wang
     * @date 2020/6/7 21:30
     * @params [users]
     * @return {@link Users}
    */
    public Users login(Users users);
}
