package cn.ddw.apiService.goodsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author XRZ
 * @date 2019/6/19
 * @Description :
 * 销量评价数量表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salesvolume implements Serializable {
    private int id;    //编号
    private String m_salesvolume;  //月销量
    private String sum_salesvolume;//总销量
    private String sum_evaluate;   //累计评价


}
