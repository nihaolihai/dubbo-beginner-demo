package com.hcb;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableDubboConfiguration
public class ApplicationProvider {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ApplicationProvider.class,args);
        new CountDownLatch(1).await();
    }
}
