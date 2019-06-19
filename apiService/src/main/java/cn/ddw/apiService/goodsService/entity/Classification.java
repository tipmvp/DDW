package cn.ddw.apiService.goodsService.entity;

/**
 * @author XRZ
 * @date 2019/6/19
 * @Description :
 * 商品品牌
 */
public class Classification {
    private int id;
    private int c_code; //品牌编号
    private String c_name; //品牌名称

    public int getId() {
        return id;
    }

    public int getC_code() {
        return c_code;
    }

    public String getC_name() {
        return c_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setC_code(int c_code) {
        this.c_code = c_code;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
}
