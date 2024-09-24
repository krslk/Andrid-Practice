package com.wms.e_wms_module.entity;

public class OrderDetail {
    private int id;
    private String orderNo;
    private int cakeCounts;
    private int size;
    private double price;
    private int cakeId;
    private String createTime;
    private String modifyTime;

    public OrderDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getCakeCounts() {
        return cakeCounts;
    }

    public void setCakeCounts(int cakeCounts) {
        this.cakeCounts = cakeCounts;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCakeId() {
        return cakeId;
    }

    public void setCakeId(int cakeId) {
        this.cakeId = cakeId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", cakeCounts=" + cakeCounts +
                ", size=" + size +
                ", price=" + price +
                ", cakeId=" + cakeId +
                ", createTime='" + createTime + '\'' +
                ", modifyTime='" + modifyTime + '\'' +
                '}';
    }
}
