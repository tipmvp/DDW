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
     * 登陆根据密码手机号查询用户
     * @param code
     * @param pwd
     * @param phone
     * @return
     */
    public  UserEntity  Login(@Param("phone") String phone,@Param("pwd") String pwd);

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

    int modify(UserEntity userEntity);
    /**
     * 更具ID查询全部
     * @param id
     */
    UserEntity selectID(@Param("id") Integer id);

    /**
     * 根据ID查询密码
     * @param id
     * @return
     */
    UserEntity selectPWD(@Param("id") Integer id);

    /**
     * 根据ID修改密码
     * @param id
     * @return
     */
    int modifyPWD(@Param("pwd")String pwd,@Param("id")Integer id);

    /**
     * 根据ID查询号码
     * @param id
     * @param phone
     * @return
     */
    UserEntity selectPhone(@Param("id")Integer id);

    /**
     * 根据ID修改密码
     * @param id
     * @param phone
     * @return
     */
    int modifyPhone(@Param("id") Integer id,@Param("phone") String phone);
}


