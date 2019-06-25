package cn.ddw.goodsServiceImpl.service.Imp;

import cn.ddw.apiService.goodsService.entity.Details;
import cn.ddw.goodsServiceImpl.mapper.DetailsMapper;
import cn.ddw.goodsServiceImpl.service.DetailsService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XRZ
 * @date 2019/6/22
 * @Description :
 */
@Service
public class DetailsServiceImp implements DetailsService_ {

    @Autowired
    private DetailsMapper detailsMapper;

    @Override
    public Details getDetailsById(Integer Id) {
        return detailsMapper.getDetailsById(Id);
    }
}
