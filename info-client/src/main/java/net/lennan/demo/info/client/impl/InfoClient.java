package net.lennan.demo.info.client.impl;

import net.lennan.demo.server.InfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import net.lennan.demo.server.domain.Info;

public class InfoClient implements InfoServer {
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void clearData() {
		restTemplate.getForObject("http://localhost:8081/info/populate", Void.class);
	}

	@Override
	public void populateData() {
		restTemplate.getForObject("http://localhost:8081/info/clear", Void.class);
	}

	@Override
	public Info getInfo() {
		Info info = restTemplate.getForObject("http://localhost:8081/info/", Info.class);
		return info;
	}
}
