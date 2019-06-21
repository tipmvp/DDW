package cn.ddw.goodsServiceImpl.service.Imp;

import cn.ddw.apiService.goodsService.entity.Commodity;
import cn.ddw.goodsServiceImpl.mapper.ClassfMapper;
import cn.ddw.goodsServiceImpl.mapper.CommodityMapper;
import cn.ddw.goodsServiceImpl.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XRZ
 * @date 2019/6/20
 * @Description :
 */
@Service
public class GoodsServiceImp implements GoodService {

    @Autowired
    private CommodityMapper commodityMapper;

    @Autowired
    private ClassfMapper classfMapper;


    @Override
    public List<Commodity> getAll() {
        return commodityMapper.getCommodityAll();
    }

    @Override
    public Commodity getCommodityById(Integer Id) {
        Commodity commodity=commodityMapper.getCommodityId(Id);
        commodity.setClassf(classfMapper.getClassfById(commodity.getC_id()));
        return commodity;
    }

    @Override
    public List<Commodity> getCommodityType(Integer t_id) {
        System.out.println(commodityMapper.getCommodityType(t_id));
        return commodityMapper.getCommodityType(t_id);
    }
}
