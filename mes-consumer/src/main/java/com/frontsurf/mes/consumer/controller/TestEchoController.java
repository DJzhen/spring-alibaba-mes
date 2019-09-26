package com.frontsurf.mes.consumer.controller;

import com.frontsurf.mes.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: YuKee
 * Email: wang.zhen@frontsurf.com
 * Date: 2019/9/26
 * Desc:
 */
@RestController
public class TestEchoController {
    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/feign/echo/{string}")
    public String echo(@PathVariable("string") String string) {
        return echoService.echo(string);
    }
}
