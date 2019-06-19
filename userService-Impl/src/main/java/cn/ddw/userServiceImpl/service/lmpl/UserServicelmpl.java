package cn.ddw.userServiceImpl.service.lmpl;


import cn.ddw.apiService.userService.pojo.UserEntity;
import cn.ddw.userServiceImpl.Usermapper.Usermapper;
import cn.ddw.userServiceImpl.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicelmpl implements Userservice {

    @Autowired
   private Usermapper usermapper;

    @Override
    public Object insertUser(UserEntity userEntity) {
        return usermapper.insertUser(userEntity);
    }

    @Override
    public UserEntity login(String code, String pwd) {

        return usermapper.login(code,pwd);
    }

    @Override
    public Object inserPhomeUser(UserEntity userEntity) {
        return null;
    }


}
