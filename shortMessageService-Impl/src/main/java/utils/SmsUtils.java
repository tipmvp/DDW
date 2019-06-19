package utils;


import config.SmsProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;
@Slf4j
@Component
public class SmsUtils {

    @Autowired
    private SmsProperties prop; //注入配置文件，提高灵活性

    /**
     *  发送短信
     * @param phomeNumber 手机号码
     * @param signName    签名
     * @param templateCode  模板
     * @param templateParm  发送的参数（JSON） {"code":"123456"}
     * @throws ClientException
     */
    public void sendSms(String phomeNumber,String signName,String templateCode,String templateParm){
        DefaultProfile profile = DefaultProfile.getProfile("default",prop.getAccessKeyId(),prop.getAccessKeySecret());
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        //request.setProtocol(ProtocolType.HTTPS);
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("PhoneNumbers",phomeNumber);
        request.putQueryParameter("SignName",signName);
        request.putQueryParameter("TemplateCode", templateCode);
        request.putQueryParameter("TemplateParam", templateParm);
        try {
            CommonResponse response = client.getCommonResponse(request);
            String data = response.getData(); //获取返回结果
            //转换为Map对象
            Map<String, String> map = JsonUtils.parseMap(data, String.class, String.class);
            if(!map.get("Code").equals("OK")){ //验证是否发送成功
                log.error("【短信服务】短信发送失败=============>手机号码为：{},原因：{}",phomeNumber,map.get("Message"));
            }
        } catch (ClientException e) {
            log.error("【短信服务】短信发送出现异常=============>手机号码为：{},原因：{}",phomeNumber,e.getMessage());
        }
    }

}
