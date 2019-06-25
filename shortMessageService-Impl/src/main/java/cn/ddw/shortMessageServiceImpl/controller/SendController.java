package cn.ddw.shortMessageServiceImpl.controller;

import cn.ddw.shortMessageServiceImpl.utils.SmsUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XRZ
 * @date 2019/6/20
 * @Description :
 */
@RestController
@RequestMapping("/sms")
public class SendController {

    @GetMapping("/send/{phone}/{code}")
    public String send(@PathVariable("phone") String phone,@PathVariable("code") String code){
        return SmsUtils.sendSms(phone,code)+"";
    }
}
