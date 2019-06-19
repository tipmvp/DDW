package cn.ddw.apiService.userService.service;

import cn.ddw.apiService.userService.pojo.UserEntity;

import java.util.List;

public interface Usermapper {
    /**
     * 账号注册
     * @param userEntity
     * @return
     */
    public  Object insertUser(UserEntity userEntity);

    /**
     * 账号登陆
     * @param code
     * @param pwd
     * @return
     */
    UserEntity login(String code,String pwd);

    /**
     * 手机号登陆
     * @param userEntity
     * @return
     */
    public  Object inserPhomeUser(UserEntity userEntity);
}
