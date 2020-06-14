package cn.kgc.controller;

import cn.kgc.entity.Users;
import cn.kgc.result.BaseResult;
import cn.kgc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:22
 * @Description :
 * @Created by 王恒
 */
@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;

    /**
     * 功能: 组测用户
     * @author Mr.Wang
     * @date 2020/6/7 21:26
     * @params [users]
     * @return {@link BaseResult}
    */
    @RequestMapping("/registerUser")
    public BaseResult registerUser(Users users){
        //调用业务
        int temp = usersService.registerUser(users);
        if(temp>0){
            return new BaseResult(temp,"");
        }
        return new BaseResult(temp,"出错啦!");
    }


    /**
     * 功能:  用户登录
     * @author Mr.Wang
     * @date 2020/6/7 21:27
     * @params [users]
     * @return {@link BaseResult}
    */
    @RequestMapping("/login")
    public BaseResult login(HttpSession session, Users users){

        Users user = usersService.login(users);

        if (user!=null){
            session.setAttribute("user",user);
            return  new BaseResult(1,"登录成功");

        }

        return new BaseResult(0,"登录失败");
    }

}
