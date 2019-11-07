package net.lennan.demo.server;

import net.lennan.demo.server.domain.Info;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/info")
public interface InfoServer
{
	@GetMapping("/clear")
	public void clearData();

	@GetMapping("/populate")
	public void populateData();

	@GetMapping("/")
	public Info getInfo();
}
