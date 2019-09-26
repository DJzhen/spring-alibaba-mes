package com.frontsurf.mes.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Author: YuKee
 * Email: wang.zhen@frontsurf.com
 * Date: 2019/9/26
 * Desc:
 */
@FeignClient(name = "service-provider")
public interface EchoService {

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string") String string);
}
