package cn.ddw.shortMessageServiceImpl;
import cn.ddw.shortMessageServiceImpl.utils.SmsUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ShortMessageServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortMessageServiceApplication.class, args);
 /*       SmsUtils.sendSms("15118807375","123465");*/
    }

}
