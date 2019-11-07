package net.lennan.demo.info.client.secured;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("net.lennan.demo.info")
@ComponentScan("net.lennan.demo.security")
public class InfoClientSecuredApplication {

	public InfoClientSecuredApplication() {
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(InfoClientSecuredApplication.class, args);
	}
}
