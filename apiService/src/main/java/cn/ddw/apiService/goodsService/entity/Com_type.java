package cn.ddw.apiService.goodsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author XRZ
 * @date 2019/6/24
 * @Description :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Com_type implements Serializable {

    private Integer id;//味道id
    private Integer comid;//味道id
    private String type;//味道id

    @Override
    public String toString() {
        return "Com_type{" +
                "id=" + id +
                ", comid=" + comid +
                ", type='" + type + '\'' +
                '}';
    }
}
