package cn.kgc.service.impl;

import cn.kgc.entity.Type;
import cn.kgc.entity.TypeExample;
import cn.kgc.mapper.TypeMapper;
import cn.kgc.service.TypeService;
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
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> getAllType() {

        return typeMapper.selectList(null);
    }
}
