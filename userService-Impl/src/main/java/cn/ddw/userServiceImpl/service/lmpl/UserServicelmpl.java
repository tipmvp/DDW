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
    public UserEntity Login(String phone , String pwd) {

        return usermapper.Login(phone,pwd);
    }

    @Override
    public int modify( UserEntity userEntity) {
        return usermapper.modify(userEntity);
    }

    @Override
    public UserEntity selectID(Integer id) {
        return usermapper.selectID(id);
    }

    @Override
    public UserEntity selectPWD(Integer id) {
        return usermapper.selectPWD(id);
    }

    @Override
    public int modifyPWD(String pwd,Integer id) {
        return usermapper.modifyPWD(pwd, id);
    }

    @Override
    public UserEntity selectPhone(Integer id) {
        return usermapper.selectPhone(id);
    }

    @Override
    public int modifyPhone(Integer id,String phone) {
        return usermapper.modifyPhone(id, phone);
    }


}
