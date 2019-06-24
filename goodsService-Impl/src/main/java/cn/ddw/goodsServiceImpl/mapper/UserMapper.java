package cn.ddw.goodsServiceImpl.mapper;

import cn.ddw.apiService.userService.pojo.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author XRZ
 * @date 2019/6/24
 * @Description :
 */
@Mapper
public interface UserMapper {

    UserEntity getUserById(Integer Id);
}
