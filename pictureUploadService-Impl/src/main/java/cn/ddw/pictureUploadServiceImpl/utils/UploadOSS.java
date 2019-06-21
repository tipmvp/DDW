package cn.ddw.pictureUploadServiceImpl.utils;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.ClientException;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

/**
 * @author CF
 * @date 2019/6/13
 * @Description :
 */
public class UploadOSS {
    public static String getUrl(MultipartFile fileupload) throws OSSException, ClientException, IOException {
        //填写自己的帐号信息
        String endpoint = "oss-cn-shenzhen.aliyuncs.com";
        String accessKeyId = "LTAIRr6OCgXK4sJa";
        String accessKeySecret = "htC7GKAAowAwNKfNxOMxiyDmgJgsI1";

        // 创建OSSClient实例
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

        // 文件桶
        String bucketName = "ddw";
        // 文件名格式
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        // 该桶中的文件key
        String dateString = System.currentTimeMillis() + ".jpg";// 20180322010634.jpg

//        String dz="home/"+dateString;
        // 上传文件
        ossClient.putObject(bucketName, dateString, new ByteArrayInputStream(fileupload.getBytes()));

        // 设置URL过期时间为100年，默认这里是int型，转换为long型即可
        Date expiration = new Date(new Date().getTime() + 3600l * 1000 * 24 * 365 * 100);
        // 生成URL
        URL url = ossClient.generatePresignedUrl(bucketName, dateString, expiration);
//        int index=url.toString().indexOf("?");
        String url_1=url.toString().substring(0,url.toString().indexOf("?")).trim();
//        http://ddw.oss-cn-shenzhen.aliyuncs.com/home/1560739760639.jpg?Expires=4714192587&OSSAccessKeyId=LTAIRr6OCgXK4sJa&Signature=054VqD490vqAd5
//        截取?之前的字符串
        System.out.println(url_1);
        return url_1;
    }
}
