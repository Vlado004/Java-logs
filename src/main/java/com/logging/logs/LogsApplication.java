package com.logging.logs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EntityScan("com.logging.logs.classes")
public class LogsApplication {

    public static void main(String[] args) {

        SpringApplication.run(LogsApplication.class, args);
    }

}
