package cn.ddw.apiService.goodsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author XRZ
 * @date 2019/6/19
 * @Description :
 * 商品类型
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type {
    private int id;
    private int code;//类型编号
    private String name;//类型名称

}
