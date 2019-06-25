package cn.ddw.shortMessageServiceImpl.utils;



import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
public class SmsUtils {

    static final String accessKeyId="LTAIRr6OCgXK4sJa";
    static final String accessKeySecret="htC7GKAAowAwNKfNxOMxiyDmgJgsI1";
    static final String signName="叮当网";
    static final String verifyCodeTemplate="SMS_167180351";

    /**
     * 发送短信
     *
     * @param phomeNumber  手机号码
     * @param signName     签名
     * @param templateCode 模板
     * @param templateParm 发送的参数（JSON） {"code":"123456"}
     * @throws ClientException
     */
    public static boolean sendSms(String phomeNumber, String code) {
        DefaultProfile profile = DefaultProfile.getProfile("default", accessKeyId, accessKeySecret);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("PhoneNumbers", phomeNumber);
        request.putQueryParameter("SignName", signName);
        request.putQueryParameter("TemplateCode", verifyCodeTemplate);
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            String data = response.getData(); //获取返回结果

            log.info("【短信服务】短信发送成功=============>手机号码为：{},", phomeNumber);
            return true;
        } catch (ClientException e) {
            log.error("【短信服务】短信发送出现异常=============>手机号码为：{},原因：{}", phomeNumber,e.getMessage());
        }
        return false;
    }
}

