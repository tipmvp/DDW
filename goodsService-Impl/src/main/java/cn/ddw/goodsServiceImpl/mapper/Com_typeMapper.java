package cn.ddw.goodsServiceImpl.mapper;

import cn.ddw.apiService.goodsService.entity.Com_type;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author XRZ
 * @date 2019/6/24
 * @Description :
 */
@Mapper
public interface Com_typeMapper {

    /**
     * 根据Id查询味道集合
     * @param Id
     * @return
     */
     List<Com_type> com_t(Integer Id);
}
