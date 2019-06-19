package cn.ddw.apiService.goodsService.entity;

/**
 * @author XRZ
 * @date 2019/6/19
 * @Description :
 * 商品类型
 */
public class GoodsType {
    private int id;
    private int t_code;//类型编号
    private String t_name;//类型名称

    public int getId() {
        return id;
    }

    public int getT_code() {
        return t_code;
    }

    public String getT_name() {
        return t_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setT_code(int t_code) {
        this.t_code = t_code;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }
}
