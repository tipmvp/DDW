package cn.ddw.paymentServiceImpl.contorller;

/**
 * 快捷支付调用支付宝支付接口
 * @param model，id，payables，
 * @throws IOException，AlipayApiException
 * @return Object
 * @author AAA_有梦想一起实现
 * @date 2017年11月29日
 */

import cn.ddw.paymentServiceImpl.config.AlipayConfig;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class Parameter{
  private  static  String total_amount = "20";
    @RequestMapping("/jine")
    @ResponseBody
    public  String  jine(@RequestParam("a") String a){
        total_amount = a;
        return  total_amount;
    }
    @RequestMapping("/alipaySum")
    public Object alipayIumpSum(Model model, String payables, String subject, String body, HttpServletResponse response) throws Exception {
        // 获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,AlipayConfig.merchant_private_key, "json", AlipayConfig.charset,AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        // 设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        // 商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = sdf.format(new Date());

        // 付款金额，必填
        if (payables!=null){
            total_amount = payables.replace(",", "");
        }

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\"" + total_amount
                + "\"," + "\"subject\":\"" + subject + "\"," + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        // 请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        AlipayConfig.logResult(result);// 记录支付日志
        response.setContentType("text/html; charset=gbk");
        PrintWriter out = response.getWriter();
        out.print(result);
        return null;
    }

    @RequestMapping("/return_url")
    public String Return_url() throws InterruptedException {
        return "alipayexit";
    }
}
