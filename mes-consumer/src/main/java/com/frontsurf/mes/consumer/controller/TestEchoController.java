package com.frontsurf.mes.consumer.controller;

import com.frontsurf.mes.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: YuKee Email: wang.zhen@frontsurf.com Date: 2019/9/26 Desc:
 */
@RestController
@RefreshScope  //动态刷新配置文件
public class TestEchoController {

	@Autowired
	private EchoService echoService;

	@Value("${user.name}")
	private String username;

	@GetMapping(value = "/feign/echo/{string}")
	public String echo(@PathVariable("string") String string) {
		return echoService.echo(string);
	}

	@GetMapping(value = "/feign/echo")
	public String echo() {
		return echoService.echo(username);
	}


}
