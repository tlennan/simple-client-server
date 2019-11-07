package net.lennan.demo.info.server.impl;

import net.lennan.demo.server.InfoServer;
import net.lennan.demo.server.domain.Info;
import org.springframework.web.bind.annotation.RestController;

public class InfoServerImpl implements InfoServer {
	@Override
	public void clearData() {
		System.out.println("clear");
	}

	@Override
	public void populateData() {
		System.out.println("populate");
	}

	@Override
	public Info getInfo() {
		return new Info("name", "desc");
	}
}
