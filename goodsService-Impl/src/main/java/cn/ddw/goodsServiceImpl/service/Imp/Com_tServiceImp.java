package cn.ddw.goodsServiceImpl.service.Imp;

import cn.ddw.apiService.goodsService.entity.Com_type;
import cn.ddw.goodsServiceImpl.mapper.Com_typeMapper;
import cn.ddw.goodsServiceImpl.service.Com_tService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XRZ
 * @date 2019/6/24
 * @Description :
 */
@Service
public class Com_tServiceImp implements Com_tService {

    private Com_typeMapper com_typeMapper;

    @Override
    public List<Com_type> com_t(Integer Id) {
       return com_typeMapper.com_t(Id);
    }
}
