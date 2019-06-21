package cn.ddw.goodsServiceImpl.service.Imp;

import cn.ddw.apiService.goodsService.entity.Classification;
import cn.ddw.goodsServiceImpl.mapper.ClassfMapper;
import cn.ddw.goodsServiceImpl.service.ClassfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XRZ
 * @date 2019/6/20
 * @Description :
 */
@Service
public class ClassfServiceImp implements ClassfService {
    @Autowired
    private ClassfMapper classfService;


    @Override
    public Classification getClassificationById(Integer Id) {
        return classfService.getClassfById(Id);
    }
}
