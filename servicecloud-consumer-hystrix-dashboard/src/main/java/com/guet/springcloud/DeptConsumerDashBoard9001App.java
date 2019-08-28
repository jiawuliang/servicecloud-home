package com.guet.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashBoard9001App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerDashBoard9001App.class, args);
	}

}
