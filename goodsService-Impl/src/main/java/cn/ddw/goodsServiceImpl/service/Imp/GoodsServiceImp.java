package cn.ddw.goodsServiceImpl.service.Imp;

import cn.ddw.apiService.goodsService.entity.Commodity;
import cn.ddw.apiService.goodsService.entity.Details;
import cn.ddw.goodsServiceImpl.mapper.ClassfMapper;
import cn.ddw.goodsServiceImpl.mapper.Com_typeMapper;
import cn.ddw.goodsServiceImpl.mapper.CommodityMapper;
import cn.ddw.goodsServiceImpl.mapper.DetailsMapper;
import cn.ddw.goodsServiceImpl.service.Com_tService;
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

    @Autowired
    private Com_typeMapper com_typeMapper;

    @Override
    public List<Commodity> getAll() {
        return commodityMapper.getCommodityAll();
    }

    @Override
    public Commodity getCommodityById(Integer Id) {
        Commodity comm=commodityMapper.getCommodityId(Id);
        comm.setCom_t(com_typeMapper.com_t(comm.getT_id()));
        return comm;
    }

    @Override
    public List<Commodity> getCommodityType(Integer t_id) {
//         System.out.println(commodityMapper.getCommodityType(t_id));
           return commodityMapper.getCommodityType(t_id);
    }

}
