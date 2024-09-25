package com.wms.e_wms_module.entity;

public class Orders {
    private int id;
    private String orderNo;//订单编号
    private String tradeNo;//交易编号
    private int status;//订单状态
    private double payAmount;//支付金额
    private int linkUserId;
    private int userId;
    private String createTime;
    private String modifyTime;

    public Orders() {
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

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public int getLinkUserId() {
        return linkUserId;
    }

    public void setLinkUserId(int linkUserId) {
        this.linkUserId = linkUserId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
        return "Orders{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", status=" + status +
                ", payaMount=" + payAmount +
                ", linkUserId=" + linkUserId +
                ", userId=" + userId +
                ", createTime='" + createTime + '\'' +
                ", modifyTime='" + modifyTime + '\'' +
                '}';
    }
}
