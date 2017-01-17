package com.li.it.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class BootStrapApplication {

	@RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(BootStrapApplication.class, args);
    }
}
