package cn.ddw.paymentServiceImpl.config;


import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016093000629828";

	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQChW3x2Zkl7Cydi6U2GAwnTg7d+8XKo61K3ovx3rtpnNcDr2jt5VJ0s+wXOG8KCVHdbuRgVQFEIcB36b2VdizLKq69GJLeoxT5AV4Vbp4aEkorposzwDFrc5v4ud0Zu1YwcZD/8YsmPZtZQxOWbQ8NGavmoPTer4dZrd48z8SlLWcQUmc+kQOS75fTcqtb4wys7USbITaHigJrIy1/nVL50F4wJdSrN9UE9bkhLY2sIgR6XM76V6nIqadJ+RHOIHewJfZ02xRADI1B5YuzY+H5W/e+/5L15rVfhk1Ata9+lFTfEeFb7kWUp+SPHMSqaKVS5G23HiXLydseQTs58aCPZAgMBAAECggEBAJsB9ikPzltDtcyRb4Xj+VaWXHq4nHulxUrgakTXVrx7qR9qAGRoYq3JYCRGCq+FUTxuLbKMnMvMWSAyT2BzzpFgKPrrXvvksA7DhTstTk6hMI2Nde7ND6TSyy/8KU9kGjtUGxvsEtGN6yigXiqwCDHnpnp2hLq8M2395zXw4MiepTPJPUCiqKrrQFVJl6qdXtR3t8ohYFEAVsavZ2RXEGxK6cYlPk8llYdA1dN/55IWHHkry8h/iIjOmRZstdTu7Hw0M5Abj2y0v5fcov66u67ZR71XmfOGrHv48aUEWvnhNuaW3OhwBd6yAOy5prjqChKYeo3rvxdaVsGAF/qoA2ECgYEA36vtif1yxzVkSn0vKX6+a8JsN+C4tPNhRfnq6mTSi3oMWRmjXQrFy8mujNqVw7s8MZ/JfBvqtH1swUZIC9HIBuNJSW/8rBMluNP7NrhDL5UM0AyFER/M8q9A4grhXYdkuKWiyZTMyDP+9XWFIohKCbwTj45Lxcmu5Y9BjXI5m/0CgYEAuK3eqhREhqedJeCswLmmgPWHf7w5IAdH9jEIwTk5wrxi9JsRTtBifKVa6yLGJJkMXMxP7mLjtE5KSwL0kpRhMYIIYXQ1u4OmZT9C3CplIOq66SudMIwAjQCHk7kaunbmsiTaZrwU0Ew8+2g+xl+6kjOIKQQFb8u7bG0rLOBhmA0CgYEAsvZoYDFnJdclgKg7FRNxHt14IxluEHJvkULO4G59O9YSjTQDTw2wh0a+n7rBe9OS7Q2xc9kOaQ2198rZGIPobQJsgBLXc4L6erE53mV+dFLo5oot6i6smDz7SCF2gpQzVb5JysqBM2rPA+zc8m1j9/gBGqq7G+0sQEboJ1mOmK0CgYB4xiQm4ChMU1M/ESaIxyBvl6JsU8CcBIb4JusNygnPI3oncz2naDnwQAcsXMpt5rUh/u+K+5rkMIr/cUhWj7jcMqieauw03Ay2i9+Csir+kuN3V3Ft7TDzBVSks9oZ9WY7PESkCP4nlqQO2garnrEZqZ+zCxEvInJIn0AsEfVhBQKBgENu8R9Q8ywYJqKyRdtIouNMSTxICSD3A32tuhc7KJUcoRjDwmBMiX6ycMRDahpWK0YshEyXFkoowN2VOnefJc8jgOb1g3mATlCKrp8olSVZIXvheRWVVnBlASBN5foK7PT5f7gnpe+7CZPXOlTBi1VH505k5cziM0geWQn/8HLo";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvjmHBpvTTHWTSzMOiKlfQnFQBUcGygjEQzXNB7kT6/OWERKKrTxIuEAlz34eDq6pTNHgAZVHkOoMntQDwUTSojCvBtO6S9AxUGqizRKD6In8+k85Xj3/hAXtnpNQpm093RrxJbwdgXiQNJ93Jdj6po6gWzGSKMPDVBk29N8FBpg4W2IfeNc5mfCvDh5at5+keImddqeQlAigP82kIttK+/gJpWzs4xao6N0BqMfHDoCr8ZhTZ3WQTNBsxJIPNllNm0rp6GWv+STeZW3KDp3JntPdEBuxZ2tHyvU34QxJ6gHvitjHYWvrqcxtd81xXjHe5AxKOzmERTPoHddcodlIJwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关

	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * @param sWord 要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

