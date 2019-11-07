package net.lennan.demo.info.server.secured;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("net.lennan.demo.info")
@ComponentScan("net.lennan.demo.security")
public class InfoServerSecuredApplication {

	public InfoServerSecuredApplication() {
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(InfoServerSecuredApplication.class, args);
	}
}
