package cn.ddw.goodsServiceImpl.mapper;

import cn.ddw.apiService.goodsService.entity.Classification;
import cn.ddw.apiService.goodsService.entity.Details;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author XRZ
 * @date 2019/6/20
 * @Description :
 */
@Mapper
public interface ClassfMapper {

    //根据id查找商品品牌
    Classification getClassfById(Integer Id);
}
