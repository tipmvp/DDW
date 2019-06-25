package cn.ddw.apiService.goodsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;

/**
 * @author XRZ
 * @date 2019/6/19
 * @Description :
 * 商品表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Commodity implements Serializable{
    private Integer id;  //商品id
    private String name;   //商品名称
    private double discount; //商品折扣
    private double price;    //商品价格
    private String type;  //商品状态
    private Integer c_id;   //品牌外键
    private Classification classf;   //商品品牌
    private Type goods;         //商品类型
    private Integer r_id;         //类型编号外键
    private Details deta;    //商品详情
    private Integer deid;    //商品详情外键
    private String image;    //商品图片
    private Salesvolume sid;   //评价销量数量
    private Integer said;    //评价销量数量id
    private Integer t_id;    //味道id
    private List<Com_type> com_t;   //味道

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                ", price=" + price +
                ", c_id=" + c_id +
                ", classf=" + classf +
                ", goods=" + goods +
                ", t_id=" + t_id +
                ", deta=" + deta +
                ", deid=" + deid +
                ", image='" + image + '\'' +
                ", sid=" + sid +
                ", said=" + said +
                '}';
    }
}
