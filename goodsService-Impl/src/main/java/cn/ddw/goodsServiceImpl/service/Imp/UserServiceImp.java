package cn.ddw.goodsServiceImpl.service.Imp;

import cn.ddw.apiService.goodsService.entity.Arrays;
import cn.ddw.apiService.userService.pojo.UserEntity;
import cn.ddw.goodsServiceImpl.mapper.ArraysMapper;
import cn.ddw.goodsServiceImpl.mapper.UserMapper;
import cn.ddw.goodsServiceImpl.service.ArraysService;
import cn.ddw.goodsServiceImpl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XRZ
 * @date 2019/6/24
 * @Description :
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public UserEntity getUserById(Integer Id) {
        return userMapper.getUserById(Id);
    }
}
