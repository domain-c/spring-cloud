package com.service.feign.controller;

import com.service.feign.service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author domain
 * @date 2019-06-14
 */
@RestController
public class HiController {

    /**
     * 编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
     */
    @Autowired
    ServiceHi serviceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return serviceHi.sayHiFromClientOne(name);
    }

}
