package cn.ddw.apiService.goodsService.entity;

/**
 * @author XRZ
 * @date 2019/6/19
 * @Description :
 * 商品表
 */
public class Commodity {
    private int id;  //商品id
    private String name;   //商品名称
    private double discount; //商品折扣
    private double price;   //商品价格
    private Classification c_id;    //品牌类型
    private GoodsType t_id;    //商品类型
    private Details deid;    //商品详情
    private String image;    //商品图片
    private Salesvolume said;   //评价销量数量

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }

    public Classification getC_id() {
        return c_id;
    }

    public GoodsType getT_id() {
        return t_id;
    }

    public Details getDeid() {
        return deid;
    }

    public String getImage() {
        return image;
    }

    public Salesvolume getSaid() {
        return said;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setC_id(Classification c_id) {
        this.c_id = c_id;
    }

    public void setT_id(GoodsType t_id) {
        this.t_id = t_id;
    }

    public void setDeid(Details deid) {
        this.deid = deid;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setSaid(Salesvolume said) {
        this.said = said;
    }
}
