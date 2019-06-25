package cn.ddw.userServiceImpl.controller;
import cn.ddw.apiService.userService.pojo.UserEntity;
import cn.ddw.apiService.userService.service.Usermapper;
import cn.ddw.shortMessageServiceImpl.utils.SmsUtils;
import cn.ddw.userServiceImpl.service.Userservice;
import cn.ddw.userServiceImpl.service.lmpl.UserServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/user")
public class UserController implements Usermapper {

  @Autowired
  private Userservice userservice;

    @Override
    @RequestMapping("/insertuser/{code}/{pwd}")
    public int insertUser(@PathVariable("code")String code, @PathVariable("pwd")String pwd) {
        return userservice.insertUser(code,pwd);
    }


    @Override
    @RequestMapping("/insert")
    public UserEntity insert(String code, String pwd) {
        return userservice.insert("2296936033","123456");
    }



    @Override
    @RequestMapping("/inserPhomeUser/{phone}/{pwd}")
    public Object inserPhomeUser(@PathVariable("phone")String  phone,@PathVariable("pwd") String pwd) {
        return userservice.inserPhomeUser(phone,pwd);
    }

    @Override
    @RequestMapping("/Login")
    public UserEntity Login(String code, String pwd ,String phne) {
        return userservice.Login("369258","123465",null);
    }

}
