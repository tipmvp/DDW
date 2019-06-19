package cn.ddw.userServiceImpl.service;


import cn.ddw.apiService.userService.pojo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Userservice {

    public Object insertUser(UserEntity userEntity);

    UserEntity login(String code,String pwd);

    public Object inserPhomeUser(UserEntity userEntity);

}
