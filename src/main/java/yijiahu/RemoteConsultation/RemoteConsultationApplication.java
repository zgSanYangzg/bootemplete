package yijiahu.RemoteConsultation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("yijiahu.RemoteConsultation.dao")
public class RemoteConsultationApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RemoteConsultationApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RemoteConsultationApplication.class);
	}
}
