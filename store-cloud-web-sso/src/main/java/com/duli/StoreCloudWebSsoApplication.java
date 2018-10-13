package com.duli;

import com.duli.utils.JedisClient;
import com.duli.utils.impl.JedisClientSingle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Configuration
//@EnableApolloConfig
@EnableHystrix
public class StoreCloudWebSsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreCloudWebSsoApplication.class, args);
    }

    @Bean
    public JedisClient jedisClient() {
        return new JedisClientSingle();
    }
}
