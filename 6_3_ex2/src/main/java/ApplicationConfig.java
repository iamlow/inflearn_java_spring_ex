import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.google.common.collect.Lists;

@Configuration
@ImportResource("classpath:application-context.xml")
public class ApplicationConfig {
	@Bean
	public Student student1() {
		ArrayList<String> hobbys = Lists.newArrayList();
		hobbys.add("수영");
		hobbys.add("요리");
		
		Student student = new Student("홍길동", 20, hobbys);
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}
}
