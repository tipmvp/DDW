package cn.ddw.userServiceImpl.service;

import cn.ddw.apiService.userService.pojo.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Userservice {

    public int insertUser(String code, String pwd);

    UserEntity insert(String code,String pwd);

    public int inserPhomeUser(String phone, String pwd);

    UserEntity Login(String phone,String pwd);

    int modify(UserEntity userEntity);

    UserEntity selectID(Integer id);

    UserEntity selectPWD(Integer id);

    int modifyPWD(String pwd,Integer id);

    UserEntity selectPhone(Integer id);

    int modifyPhone(Integer id,String phone);
}
