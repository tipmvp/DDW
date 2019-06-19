package cn.ddw.userServiceImpl.controller;


import cn.ddw.apiService.userService.pojo.UserEntity;
import cn.ddw.apiService.userService.service.Usermapper;
import cn.ddw.userServiceImpl.service.Userservice;
import cn.ddw.userServiceImpl.service.lmpl.UserServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController implements Usermapper {

  @Autowired
  private Userservice userservice;

    @Override
    @RequestMapping("/insertuser")
    public Object insertUser(UserEntity userEntity) {
        userEntity.setCode("tttp");
        userEntity.setPwd("1234567");
        return userservice.insertUser(userEntity);
    }

    @Override
    @RequestMapping("/login1")
    public UserEntity login(String code, String pwd) {
        UserEntity ue=new UserEntity();
        ue.setCode("tttp");
        ue.setPwd("1234567");
        return ue;
    }

    @Override
    public Object inserPhomeUser(UserEntity userEntity) {
        return null;
    }


}
