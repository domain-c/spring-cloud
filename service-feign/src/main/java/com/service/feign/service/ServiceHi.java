package com.service.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author domain
 * @date 2019-06-14
 */
@FeignClient(value = "service-hi")
public interface ServiceHi {

    /**
     * 调用
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
