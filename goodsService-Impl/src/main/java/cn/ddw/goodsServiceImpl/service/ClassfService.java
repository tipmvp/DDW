package cn.ddw.goodsServiceImpl.service;

import cn.ddw.apiService.goodsService.entity.Classification;

/**
 * @author XRZ
 * @date 2019/6/20
 * @Description :
 */
public interface ClassfService {
    //根据id查找商品品牌
    Classification getClassificationById(Integer Id);
}
