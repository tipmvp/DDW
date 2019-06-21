package cn.ddw.apiService.goodsService.serivce;

import cn.ddw.apiService.goodsService.entity.Commodity;

import java.util.List;

/**
 * @author XRZ
 * @date 2019/6/19
 * @Description :
 * 商品服务asASsdadsa
 */
public interface CommodityService {
    /**
     * 根据Id查询商品
     * @return
     */

    Commodity getCommodityById(Integer Id);

    /**
     * 查询所有商品
     * @return
     */
    List<Commodity> getCommodityAll();

    /**
     * 根据商品类型查找商品
     * @return
     */
    List<Commodity>getCommodityType(Integer t_id);
}
