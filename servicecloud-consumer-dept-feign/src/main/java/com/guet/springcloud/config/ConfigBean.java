package com.guet.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {
	
	@Bean
	// 开启负载均衡
	@LoadBalanced
	public RestTemplate geRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public IRule customRule() {
		// IRule：ribbon的核心组件，根据特定算法从服务列表中选取一个要访问的服务
		// 达到的目的，用我们重新选择的随机算法替代默认的轮询算法
		return new RandomRule();
	}

}
