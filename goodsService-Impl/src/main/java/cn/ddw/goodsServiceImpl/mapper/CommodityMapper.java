package cn.ddw.goodsServiceImpl.mapper;

import cn.ddw.apiService.goodsService.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommodityMapper {
    //根据id查询商品
    Commodity getCommodityId(Integer Id);

    //查询所有商品
    List<Commodity> getCommodityAll();

    //根据商品类型查询商品
    List<Commodity> getCommodityType(Integer t_id);
}