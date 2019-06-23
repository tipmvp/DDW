package cn.ddw.apiService.goodsService.entity;

import cn.ddw.apiService.userService.pojo.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author XRZ
 * @date 2019/6/24
 * @Description :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Arrays implements Serializable {
    private int id;
    private Integer comid; //商品id
    private Integer userid;  //用户id
    private String name; //匿名
    private Date time;  //评论时间
    private String content;    //评论内容
    private int type;  //评论类型
    private UserEntity user;//用户对象
    private Commodity comm;//商品对象
}
