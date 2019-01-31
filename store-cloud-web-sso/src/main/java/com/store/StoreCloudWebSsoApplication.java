package com.store;

import com.store.utils.JedisClient;
import com.store.utils.impl.JedisClientSingle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;

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
    public JedisPool jedisPool(){
        return new JedisPool();
    }
    @Bean
    public JedisClient jedisClient() {
        return new JedisClientSingle();
    }
}
