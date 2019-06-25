package cn.ddw.userServiceImpl.Usermapper;
        import cn.ddw.apiService.userService.pojo.UserEntity;
        import org.apache.ibatis.annotations.Param;
        import java.util.List;

public interface Usermapper {
    /**
     *账号注册
     * @param userEntity
     * @return
     */
    public  int insertUser(@Param("code") String code, @Param("pwd") String  pwd);

    /**
     * 根据账号密码查询用户
     * @param code
     * @param pwd
     * @return
     */
    public UserEntity insert(@Param("code") String code, @Param("pwd") String pwd);

    /**
     * 手机号注册
     * @param userEntity
     * @return
     */
    public int inserPhomeUser(@Param("phone") String phone,@Param("pwd") String pwd);

    /**
     * 登陆根据账号密码手机号查询用户
     * @param code
     * @param pwd
     * @param phone
     * @return
     */
    public UserEntity Login(@Param("code") String code,@Param("pwd") String pwd,@Param("phone") String phone);
}
