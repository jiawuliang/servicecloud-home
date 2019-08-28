package com.guet.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.guet.irule.SelfRule;

@SpringBootApplication
@EnableEurekaClient
// 在启动该微服务的时候，就能去加载我们的自定义Ribbon配置类，从而使配置生效
@RibbonClient(name = "SERVICECLOUD-DEPT", configuration = SelfRule.class)
public class DeptConsumer80App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80App.class, args);
	}

}
