package com.allen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {
    @Autowired
    private IdGenerateService idGenerateService;

    public void run(ApplicationArguments args) throws Exception {
        Long sysNo = idGenerateService.generate();
        System.out.println(sysNo);
    }
}