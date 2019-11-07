package net.lennan.demo.info.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("net.lennan.demo.info")
public class InfoServerApplication {

	public InfoServerApplication() {
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(InfoServerApplication.class, args);
	}
}
