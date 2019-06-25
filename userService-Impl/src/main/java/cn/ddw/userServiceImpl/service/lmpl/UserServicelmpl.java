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
    public int insertUser(String code, String pwd) {
        return usermapper.insertUser(code,pwd);
    }

    @Override
    public UserEntity insert(String code, String pwd) {

        return usermapper.insert(code,pwd);
    }

    @Override
    public int inserPhomeUser(String phone,String pwd) {
        return usermapper.inserPhomeUser(phone, pwd);
    }

    @Override
    public UserEntity Login(String code, String pwd,String phone ) {

        return usermapper.Login(code,pwd,phone);
    }

}
