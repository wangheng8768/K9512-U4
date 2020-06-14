package cn.kgc;

import cn.kgc.entity.Type;
import cn.kgc.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LethouseApplicationTests {

	@Autowired
	private TypeService typeService;

	@Test
	void contextLoads() {
		List<Type> typeList = typeService.getAllType();
		for (Type type : typeList) {
			System.out.println(type);
		}
	}

}
