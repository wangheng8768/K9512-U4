package cn.kgc;


import cn.kgc.entity.Type;
import cn.kgc.service.impl.TypeServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;


@SpringBootApplication
@ServletComponentScan("cn,kgc.filter")
public class LethouseApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LethouseApplication.class, args);


		/**
		 * 功能: 纯java项目
		 * @author Mr.Wang
		 * @date 2020/6/7 11:09
		 * @params [args]
		 * @return
		ConfigurableApplicationContext context = SpringApplication.run(LethouseApplication.class, args);
		TypeServiceImpl typeServiceImpl = (TypeServiceImpl)context.getBean("typeServiceImpl");
        List<Type> typeList = typeServiceImpl.getAllType();
        typeList.forEach(s-> System.out.println(s.getName()));*/

		/**
		 * 功能: 关掉Spring 视图打印
		 * @author Mr.Wang
		 * @date 2020/6/7 11:13
		 * @params [args]
		 * @return
		*/
        SpringApplication springApplication = new SpringApplication(LethouseApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }

}
