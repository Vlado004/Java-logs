package com.logging.logs.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import org.springframework.boot.SpringApplication;

import com.logging.logs.classes.Logs;

@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(Logs.class)
public class LoggingServer {

    public static void main(String[] args) {

        System.setProperty("spring.config.name", "logging-server");
        SpringApplication.run(LoggingServer.class, args);
    }
}
