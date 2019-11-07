package net.lennan.demo.info.server.controller;

import net.lennan.demo.info.server.impl.InfoServerImpl;
import net.lennan.demo.server.InfoServer;
import net.lennan.demo.server.domain.Info;
import org.springframework.web.bind.annotation.RestController;

// See InfoServer interface for web mappings
@RestController
public class InfoServerController extends InfoServerImpl {
}
