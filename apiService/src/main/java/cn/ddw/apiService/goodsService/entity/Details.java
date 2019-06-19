package cn.ddw.apiService.goodsService.entity;

/**
 * @author XRZ
 * @date 2019/6/19
 * @Description :
 * 商品详情
 */
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

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getMixedingredients() {
        return mixedingredients;
    }

    public String getSpecifications() {
        return specifications;
    }

    public String getTime() {
        return time;
    }

    public String getNumber() {
        return number;
    }

    public String getL_umber() {
        return L_umber;
    }

    public String getStoragemode() {
        return storagemode;
    }

    public String getEdiblemethod() {
        return ediblemethod;
    }

    public String getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMixedingredients(String mixedingredients) {
        this.mixedingredients = mixedingredients;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setL_umber(String l_umber) {
        L_umber = l_umber;
    }

    public void setStoragemode(String storagemode) {
        this.storagemode = storagemode;
    }

    public void setEdiblemethod(String ediblemethod) {
        this.ediblemethod = ediblemethod;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
