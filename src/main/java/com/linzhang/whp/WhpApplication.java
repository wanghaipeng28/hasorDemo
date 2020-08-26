package com.linzhang.whp;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerException;

@EnableHasor()
@EnableHasorWeb()
@SpringBootApplication
public class WhpApplication {

	public static void main(String[] args) throws WebServerException {
		SpringApplication.run(WhpApplication.class, args);
	}

}
