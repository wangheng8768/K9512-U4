package cn.kgc.controller;

import cn.kgc.entity.District;
import cn.kgc.result.BaseResult;
import cn.kgc.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:21
 * @Description :
 * @Created by 王恒
 */
@RestController
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    /**
     * 功能: 获取所有区域
     * @author Mr.Wang
     * @date 2020/6/6 17:23
     * @params []
     * @return {@link BaseResult}
    */
    @RequestMapping("/getAllDistrict")
    public BaseResult getAllDistrict(){

        List<District> districtList = districtService.getAllDistrict();
        BaseResult baseResult = new BaseResult(404,"失败");
        if (districtList!=null && !districtList.isEmpty()){
            baseResult = new BaseResult(200,"成功",districtList);
        }


        return baseResult;

    }


}
