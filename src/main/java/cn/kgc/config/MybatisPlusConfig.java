package cn.kgc.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 王恒
 * @Date 2020/6/9 21:54
 * @Description :   返回一个分页拦截器
 * @Created by 王恒
 */
@Configuration
@MapperScan("cn.kgc.mapper")
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor interceptor = new PaginationInterceptor();

        interceptor.setOverflow(true);
        return interceptor;
    }
}
