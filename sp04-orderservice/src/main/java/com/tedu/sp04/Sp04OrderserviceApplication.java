package com.tedu.sp04;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableDiscoveryClient	//标识服务发现客户端
//@SpringBootApplication	//标识springboot服务应用
@EnableFeignClients			//标识feign声明式客户端
@SpringCloudApplication		//标识springcloud服务应用,代替以上两个注解
public class Sp04OrderserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp04OrderserviceApplication.class, args);
	}

}
