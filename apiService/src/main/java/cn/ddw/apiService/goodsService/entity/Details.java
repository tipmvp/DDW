package cn.ddw.apiService.goodsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author XRZ
 * @date 2019/6/19
 * @Description :
 * 商品详情
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Details {
    private int id;
    private String type; //商品类型
    private String address;  //产地
    private String mixedingredients; //配料
    private String specifications;  //产品规格
    private String time;    //保质期
    private String number;  //产品标准号
    private String L_umber;  //许可证编号
    private String storagemode; //储存方式
    private String ediblemethod; //食用方式
    private String image;     //商品详情图


}
