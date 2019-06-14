package com.service.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author domain
 * @date 2019-06-13
 */
@FeignClient(value = "service-hi")
public interface ServiceHi {

    /**
     * say
     * @param name
     * @return
     */
    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
