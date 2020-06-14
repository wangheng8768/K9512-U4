package cn.kgc.controller;

import cn.kgc.entity.Type;
import cn.kgc.result.BaseResult;
import cn.kgc.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:22
 * @Description :
 * @Created by 王恒
 */


@RestController
@RequestMapping("/type/")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @RequestMapping("getTypeData")
    public BaseResult getTypeData(){
        List<Type> list = typeService.getAllType();
        return new BaseResult(200,list);
    }
}