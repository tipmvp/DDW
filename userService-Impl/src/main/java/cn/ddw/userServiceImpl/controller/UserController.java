package cn.ddw.userServiceImpl.controller;
import ch.qos.logback.core.net.SyslogOutputStream;
import cn.ddw.apiService.userService.pojo.UserEntity;
import cn.ddw.apiService.userService.service.Usermapper;
import cn.ddw.shortMessageServiceImpl.utils.SmsUtils;
import cn.ddw.userServiceImpl.service.Userservice;
import cn.ddw.userServiceImpl.service.lmpl.UserServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
        return userservice.insert("369258","123456");
    }



    @Override
    @RequestMapping("/inserPhomeUser/{phone}/{pwd}")
    public Object inserPhomeUser(@PathVariable("phone")String  phone,@PathVariable("pwd") String pwd) {
        return userservice.inserPhomeUser(phone,pwd);
    }

    @Override
    @RequestMapping("/Login/{phone}/{pwd}")
    public UserEntity Login(@PathVariable("phone")String phone,@PathVariable("pwd")String pwd ) {
        return userservice.Login(phone,pwd);
    }

    @Override
    @PostMapping("/modify")
    public int modify(UserEntity userEntity) {
        userEntity.setId(1002);       //获取cookie
        return userservice.modify(userEntity);
    }


    @Override
    @RequestMapping("/selectID/{id}")
    public UserEntity selectID(@PathVariable("id")Integer id) {
        return userservice.selectID(id);
    }

    @Override
    @RequestMapping("/selectPWD/{id}")
    public UserEntity selectPWD(@PathVariable("id")Integer id) {
        return userservice.selectPWD(1034);
    }

    @Override
    @PostMapping("/updatePwd/{pwd}")
    public int modifyPWD(@PathVariable("pwd") String pwd) {
        Integer id = 1034;         //获取cookie
        return userservice.modifyPWD(pwd,id);
    }

    @Override
    @RequestMapping("/selectPhone/{id}")
    public UserEntity selectPhone(@PathVariable("id")Integer id) {
        //获取cookie
        return userservice.selectPhone(id);
    }

    @Override
    @RequestMapping("/modifyPhone/{id}/{phone}")
    public int modifyPhone(@PathVariable Integer id,@PathVariable String phone) {
        return userservice.modifyPhone(id,phone);
    }


}