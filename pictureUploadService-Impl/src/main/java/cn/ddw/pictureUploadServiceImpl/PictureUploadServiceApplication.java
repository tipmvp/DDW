package cn.ddw.pictureUploadServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZYF
 * @date 2019/6/10 11:24
 * @Description :
 */

@SpringBootApplication
@EnableEurekaClient
public class PictureUploadServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PictureUploadServiceApplication.class, args);
    }
}
