package com.frontsurf.mes.provider.controller;

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
public class EchoController {

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string") String string) {
        return "hello Nacos Provider" + string;
    }
}
