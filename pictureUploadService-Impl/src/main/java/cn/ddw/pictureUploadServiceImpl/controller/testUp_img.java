package cn.ddw.pictureUploadServiceImpl.controller;

import cn.ddw.pictureUploadServiceImpl.entity.Picture;
import cn.ddw.pictureUploadServiceImpl.serivce.PictureService;
import cn.ddw.pictureUploadServiceImpl.utils.UploadOSS;
import com.aliyun.oss.OSSException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.aliyun.oss.ClientException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author XRZ
 * @date 2019/6/15
 * @Description :
 */
@RestController
@RequestMapping("/picture")
public class testUp_img {
    @Autowired
    private PictureService pictureService;

    @PostMapping("/insert")
    public String insertPicture(@RequestParam("fileupload") MultipartFile fileupload,@RequestParam("picName") String picName, HttpServletRequest request) throws OSSException, ClientException, IOException {
        Picture picture=new Picture();
        picture.setPicName(picName);
        picture.setUrl(UploadOSS.getUrl(fileupload));//虽然传来的是文件，但是保存到数据库的是路径
        pictureService.insertPicture(picture);
        return "123";
    }
}
