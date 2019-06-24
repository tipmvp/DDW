package cn.ddw.goodsServiceImpl.service;

import cn.ddw.apiService.goodsService.entity.Com_type;

import java.util.List;

/**
 * @author XRZ
 * @date 2019/6/24
 * @Description :
 */

public interface Com_tService {
    /**
     * 根据Id查询味道集合
     * @param Id
     * @return
     */
    List<Com_type> com_t(Integer Id);
}
