package cn.ddw.goodsServiceImpl.mapper;

import cn.ddw.apiService.goodsService.entity.Arrays;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author XRZ
 * @date 2019/6/24
 * @Description :
 */
@Mapper
public interface ArraysMapper {

    /**
     * 根据商品Id查询商品评论
     * @param Id
     * @return
     */
    List<Arrays> getArryById(Integer Id);

    Integer getCountByTypeAndComid(Integer type,Integer comId);
}
