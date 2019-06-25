package cn.ddw.paymentServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author zjc
 * @date 2019/6/10 11:22
 * @Description :
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class aliApplication {
    public static void main(String[] args) {
        SpringApplication.run(aliApplication.class, args);
    }
}
