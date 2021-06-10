package springbasics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jspider.springbasics")
public class AppConfig {

	/*
	@Bean
	public Book getBookObject() {
		return new Book();
	}
	*/
}
