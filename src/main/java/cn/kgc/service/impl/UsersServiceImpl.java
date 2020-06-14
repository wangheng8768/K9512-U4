package cn.kgc.service.impl;

import cn.kgc.entity.Users;
import cn.kgc.entity.UsersExample;
import cn.kgc.mapper.UsersMapper;
import cn.kgc.service.UsersService;
import cn.kgc.util.MD5Utils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:42
 * @Description :
 * @Created by 王恒
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int registerUser(Users users) {
        //密码不要以明文方式保存到数据中，这样做不安全
        //使用md5工具类对密码进行加密后存储到数据库
        //使用步骤:1.导入md5工具类  2.调用md5工具类的方法进行加密
        users.setPassword(MD5Utils.md5Encrypt(users.getPassword()));
        return  usersMapper.insert(users);
    }

    @Override
    public Users login(Users users) {

        //密码转为加密后的密码
        String password = MD5Utils.md5Encrypt(users.getPassword());
        //传入条件
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name",users.getName());
        queryWrapper.eq("password",password);
        return usersMapper.selectOne(queryWrapper);
    }
}
