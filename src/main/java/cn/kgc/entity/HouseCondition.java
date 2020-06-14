package cn.kgc.entity;

/**
 * @Author 王恒
 * @Date 2020/6/12 16:04
 * @Description :
 * @Created by 王恒
 */
public class HouseCondition {

    private String title; //标题
    private Integer did;  //区域编号
    private Integer sid; //街道编号
    private Integer tid; //类型编号
    private Long startPrice; //开始价格
    private Long endPrice; //结束价格

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Long getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Long startPrice) {
        this.startPrice = startPrice;
    }

    public Long getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(Long endPrice) {
        this.endPrice = endPrice;
    }

    @Override
    public String toString() {
        return "HouseCondition{" +
                "title='" + title + '\'' +
                ", did=" + did +
                ", sid=" + sid +
                ", tid=" + tid +
                ", startPrice=" + startPrice +
                ", endPrice=" + endPrice +
                '}';
    }
}
