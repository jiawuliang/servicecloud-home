package com.guet.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
// 本服务提供后会自动注册进eureka服务列表中
@EnableEurekaClient
// 服务发现
@EnableDiscoveryClient
// 开启熔断
@EnableCircuitBreaker
public class DeptProviderHystrix8001App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProviderHystrix8001App.class, args);
	}

}
