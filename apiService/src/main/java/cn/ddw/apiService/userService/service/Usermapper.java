package cn.ddw.apiService.userService.service;

import cn.ddw.apiService.userService.pojo.UserEntity;

import java.util.List;

public interface Usermapper {
    /**
     * 账号注册
     * @param userEntity
     * @return
     */
    public int insertUser(String code,String pwd);

    /**
     * 账号登陆
     * @param code
     * @param pwd
     * @return
     */
    UserEntity insert(String code,String pwd);

    /**
     * 手机号登陆
     * @param userEntity
     * @return
     */
    public  Object inserPhomeUser(String phone ,String pwd);


    public  UserEntity  Login(String phone, String pwd);

    /**
     * 修改个人信息
     * @param name
     * @param nickname
     * @param sex
     * @param birthday
     * @param phone
     * @param email
     * @return
     */

    public  int modify(UserEntity userEntity);

    /**
     * 根据ID查询
     * @param id
     * @param name
     * @param nickname
     * @param sex
     * @param birthday
     * @param phone
     * @param email
     * @return
     */
    public  UserEntity selectID(Integer id);

    /**
     * 更据ID查询密码
     * @param id
     * @return
     */
    public UserEntity selectPWD(Integer id);

    /**
     * 根据ID修改密码
     * @param id
     * @return
     */
    public int modifyPWD(String pwd);

    /**
     *
     * 根据ID查询号码
     * @param id
     * @param phone
     * @return
     */
    public UserEntity selectPhone(Integer id);

    /**
     * 根据ID修改号码
     * @param phone
     * @return
     */
    public int modifyPhone(Integer id,String phone);
}
