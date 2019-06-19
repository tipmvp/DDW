package cn.ddw.apiService.goodsService.entity;

/**
 * @author XRZ
 * @date 2019/6/19
 * @Description :
 * 销量评价数量表
 */
public class Salesvolume {
    private int id;    //编号
    private String m_salesvolume;  //月销量
    private String sum_salesvolume;//总销量
    private String sum_evaluate;   //累计评价

    public void setId(int id) {
        this.id = id;
    }

    public void setM_salesvolume(String m_salesvolume) {
        this.m_salesvolume = m_salesvolume;
    }

    public void setSum_salesvolume(String sum_salesvolume) {
        this.sum_salesvolume = sum_salesvolume;
    }

    public void setSum_evaluate(String sum_evaluate) {
        this.sum_evaluate = sum_evaluate;
    }

    public int getId() {
        return id;
    }

    public String getM_salesvolume() {
        return m_salesvolume;
    }

    public String getSum_salesvolume() {
        return sum_salesvolume;
    }

    public String getSum_evaluate() {
        return sum_evaluate;
    }
}
