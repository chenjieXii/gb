package com.ckf.gbgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author HouYouWeng
 * @ProjectName gb
 * @Description TODO
 * @time 2023/4/10 22:00
 */

@SpringBootApplication
@EnableDiscoveryClient
public class GbGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GbGateWayApplication.class);
    }
}
