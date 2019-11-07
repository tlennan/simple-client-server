package net.lennan.demo.info.client.controller;

import net.lennan.demo.info.client.impl.InfoClient;
import net.lennan.demo.server.domain.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoClientController {
	@Autowired
	private InfoClient infoClient;

	@GetMapping("/do")
	public Info doIt()
	{
		return infoClient.getInfo();
	}
}
