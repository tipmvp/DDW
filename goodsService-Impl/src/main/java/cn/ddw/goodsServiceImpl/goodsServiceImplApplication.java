package cn.ddw.goodsServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZYF
 * @date 2019/6/10 11:21
 * @Description :
 */

@SpringBootApplication
@EnableEurekaClient
public class goodsServiceImplApplication {
    public static void main(String[] args) {
        SpringApplication.run(goodsServiceImplApplication.class, args);
    }
}
