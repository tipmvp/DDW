package cn.ddw.goodsServiceImpl.service;

import cn.ddw.apiService.goodsService.entity.Arrays;

import java.util.List;

/**
 * @author XRZ
 * @date 2019/6/24
 * @Description :
 */
public interface ArraysService {

    /**
     * 根据商品Id查询商品评论
     * @param Id
     * @return
     */
    List<Arrays> getArryById(Integer Id);

    Integer getCountByTypeAndComid(Integer type,Integer comId);
}
