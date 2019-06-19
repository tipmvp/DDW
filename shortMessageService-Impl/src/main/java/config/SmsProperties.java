package config;
import lombok.Data;

@Data
public class SmsProperties {

    String accessKeyId;
    String accessKeySecret;
    String signName;
    String verifyCodeTemplate;

}
