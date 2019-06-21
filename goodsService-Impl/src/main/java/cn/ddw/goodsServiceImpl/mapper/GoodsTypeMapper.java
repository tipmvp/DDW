package cn.ddw.goodsServiceImpl.mapper;

import cn.ddw.apiService.goodsService.entity.Type;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author XRZ
 * @date 2019/6/20
 * @Description :
 */
@Mapper
public interface GoodsTypeMapper {

    Type getGoodsType();
}
