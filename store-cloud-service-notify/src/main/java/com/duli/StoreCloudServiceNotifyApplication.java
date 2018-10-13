package com.duli;

import com.duli.utils.JedisClient;
import com.duli.utils.impl.JedisClientSingle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;

@SpringBootApplication
@EnableHystrix
@Configuration
//@EnableApolloConfig
@EnableDiscoveryClient
public class StoreCloudServiceNotifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreCloudServiceNotifyApplication.class, args);
    }

    @Bean
    public JedisClient jedisClient() {
        return new JedisClientSingle();
    }
    @Bean
    public JedisPool jedisPool(){
        return new JedisPool();
    }
}
