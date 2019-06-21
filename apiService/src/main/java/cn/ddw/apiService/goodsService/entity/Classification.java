package cn.ddw.apiService.goodsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author XRZ
 * @date 2019/6/19
 * @Description :
 * 商品品牌
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classification {
    private int id;
    private int code; //品牌编号
    private String name; //品牌名称


}
