package cn.ddw.apiService.goodsService.serivce;

import cn.ddw.apiService.goodsService.entity.Commodity;
import cn.ddw.apiService.goodsService.entity.Details;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author XRZ
 * @date 2019/6/19
 * @Description :
 * 商品服务asASsdadsa
 */
@RequestMapping("/com")
public interface CommodityService {
    /**
     * 根据Id查询商品
     * @return
     */
    @RequestMapping("/getCom/{uid}")
    Commodity getCommodityById(Integer Id);

    /**
     * 查询所有商品
     * @return
     */
    @RequestMapping("/get/all")
    List<Commodity> getCommodityAll();

    /**
     * 根据商品类型查找商品
     * @return
     */
    @GetMapping("/goods/typeAll/{tid}")
    List<Commodity>getCommodityType(Integer t_id);


//    /**
//     * 根据id查询商品详情
//     */
//    Details getComByDe(Integer Id);
}
