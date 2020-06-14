package cn.kgc.controller;

import cn.kgc.entity.Street;
import cn.kgc.result.BaseResult;
import cn.kgc.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
public class StreetController {
    @Autowired
    private StreetService streetService;

    @RequestMapping("/getAllStreetByDistrict/{id}")
    public BaseResult getAllStreetByDistrict(@PathVariable("id")Integer id){

        List<Street> streetList = streetService.getAllStreetByDistrict(id);
        BaseResult baseResult = new BaseResult(404,"无数据");
        if (streetList!=null && !streetList.isEmpty()){
            baseResult = new BaseResult(200,"成功", streetList);

        }
        return baseResult;
    }
}
