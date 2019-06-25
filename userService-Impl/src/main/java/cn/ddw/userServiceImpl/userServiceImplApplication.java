package cn.ddw.userServiceImpl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.ddw.userServiceImpl.Usermapper")
public class userServiceImplApplication {
    public static void main(String[] args) {
        SpringApplication.run(userServiceImplApplication.class, args);
    }


}
