package com.logging.logs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Import;
import org.springframework.boot.SpringApplication;

import com.logging.logs.classes.Logs;
import org.springframework.web.client.RestTemplate;

@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(Logs.class)
public class LoggingServer {

    //@Autowired
    //@LoadBalanced

    protected RestTemplate restTemplate;

    protected String serviceUrl;

//    public LoggingServer(String serviceUrl) {
//        this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
//                : "http://" + serviceUrl;
//    }

    public static void main(String[] args) {

        System.setProperty("spring.config.name", "logging-server");
        SpringApplication.run(LoggingServer.class, args);
    }

}
