package cn.ddw.goodsServiceImpl.service;

import cn.ddw.apiService.goodsService.entity.Commodity;
import cn.ddw.apiService.goodsService.entity.Details;

import java.util.List;

/**
 * @author CF
 * @date 2019/6/11 13:47
 * @Description :
 */
public interface GoodService {

//    获取信息商品
    List<Commodity> getAll();

//    根据id获取商品
    Commodity getCommodityById(Integer id);

//   根据商品类型查询商品
    List<Commodity> getCommodityType(Integer t_id);


}
