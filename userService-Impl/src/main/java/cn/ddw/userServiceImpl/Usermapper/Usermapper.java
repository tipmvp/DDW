package cn.ddw.userServiceImpl.Usermapper;

import cn.ddw.apiService.userService.pojo.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Usermapper {
    /**
     *注册加用户
     * @param userEntity
     * @return
     */
    public  int insertUser(UserEntity userEntity);

    /**
     * 账号登陆
     */
    public UserEntity login(@Param("code") String code, @Param("pwd") String pwd);

    /**
     * 手机号注册
     */
    public Object inserPhomeUser(UserEntity userEntity);
}
