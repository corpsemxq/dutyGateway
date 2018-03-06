package com.duty.dutyGateway.test;

import com.duty.dutyGateway.DutyGatewayApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@EnableAutoConfiguration
@RestController
public class SampleController {

    private static final Logger log = LogManager.getLogger(SampleController.class);


    @RequestMapping("/")
    @ResponseBody
    Map<String, String> home() {
        log.info("hhahahah");
        Map<String, String> result = new HashMap<>();
        result.put("message","Hello World");
        return result;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}