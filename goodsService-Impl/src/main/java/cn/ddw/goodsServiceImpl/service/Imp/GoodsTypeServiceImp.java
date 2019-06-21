package cn.ddw.goodsServiceImpl.service.Imp;

import cn.ddw.apiService.goodsService.entity.Type;
import cn.ddw.goodsServiceImpl.mapper.GoodsTypeMapper;
import cn.ddw.goodsServiceImpl.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XRZ
 * @date 2019/6/20
 * @Description :
 */
@Service
public class GoodsTypeServiceImp implements GoodsTypeService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public Type getGoodsType() {
        return goodsTypeMapper.getGoodsType();
    }
}
