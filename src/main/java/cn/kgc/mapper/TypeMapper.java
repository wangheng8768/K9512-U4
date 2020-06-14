package cn.kgc.mapper;

import cn.kgc.entity.Type;
import cn.kgc.entity.TypeExample;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TypeMapper extends BaseMapper<Type> {



}