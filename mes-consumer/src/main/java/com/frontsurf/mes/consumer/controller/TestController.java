package com.frontsurf.mes.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: YuKee Email: wang.zhen@frontsurf.com Date: 2019/9/26 Desc:
 */
@RestController
public class TestController {

	private final RestTemplate restTemplate;

	@Autowired
	public TestController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@GetMapping(value = "/echo/{str}")
	public String echo(@PathVariable("str") String str) {
		return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
	}

}
