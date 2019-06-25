package cn.ddw.goodsServiceImpl.mapper;

import cn.ddw.apiService.goodsService.entity.Details;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author XRZ
 * @date 2019/6/22
 * @Description :
 */
@Mapper
public interface DetailsMapper {

    Details getDetailsById(Integer Id);
}
