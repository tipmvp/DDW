package cn.ddw.goodsServiceImpl.service.Imp;

import cn.ddw.apiService.goodsService.entity.Arrays;
import cn.ddw.goodsServiceImpl.mapper.ArraysMapper;
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
public class ArraysServiceImp implements ArraysService {

    @Autowired
    private ArraysMapper arraysMapper;


    @Override
    public List<Arrays> getArryById(Integer Id) {
        System.out.println(arraysMapper.getArryById(Id));
        return arraysMapper.getArryById(Id);
    }

    @Override
    public Integer getCountByTypeAndComid(Integer type, Integer comId) {
        return arraysMapper.getCountByTypeAndComid(type,comId);
    }
}
