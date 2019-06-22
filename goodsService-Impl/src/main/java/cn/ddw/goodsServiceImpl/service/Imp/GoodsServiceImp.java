package cn.ddw.goodsServiceImpl.service.Imp;

import cn.ddw.apiService.goodsService.entity.Commodity;
import cn.ddw.apiService.goodsService.entity.Details;
import cn.ddw.goodsServiceImpl.mapper.ClassfMapper;
import cn.ddw.goodsServiceImpl.mapper.CommodityMapper;
import cn.ddw.goodsServiceImpl.mapper.DetailsMapper;
import cn.ddw.goodsServiceImpl.service.GoodService;
import lombok.Data;
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

    @Autowired
    private DetailsMapper detailsMapper;

    @Override
    public List<Commodity> getAll() {
        return commodityMapper.getCommodityAll();
    }

    @Override
    public Commodity getCommodityById(Integer Id) {
        return commodityMapper.getCommodityId(Id);
    }

    @Override
    public List<Commodity> getCommodityType(Integer t_id) {
//        System.out.println(commodityMapper.getCommodityType(t_id));
        return commodityMapper.getCommodityType(t_id);
    }

//    @Override
//    public Details getComByDe(Integer Id) {
//        return commodityMapper.getComByDe(Id);
//    }
}
