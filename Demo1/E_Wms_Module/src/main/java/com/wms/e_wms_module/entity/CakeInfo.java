package com.wms.e_wms_module.entity;

public class CakeInfo {
    private int id;
    private String cakeName;
    private String introduce;
    private String brand;
    private String cakePic;
    private String cakeDetailPic;
    private int cakeClassId;
    private String createTime;
    private String modifyTime;

    public CakeInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCakePic() {
        return cakePic;
    }

    public void setCakePic(String cakePic) {
        this.cakePic = cakePic;
    }

    public String getCakeDetailPic() {
        return cakeDetailPic;
    }

    public void setCakeDetailPic(String cakeDetailPic) {
        this.cakeDetailPic = cakeDetailPic;
    }

    public int getCakeClassId() {
        return cakeClassId;
    }

    public void setCakeClassId(int cakeClassId) {
        this.cakeClassId = cakeClassId;
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
        return "CakeInfo{" +
                "id=" + id +
                ", cakeName='" + cakeName + '\'' +
                ", introduce='" + introduce + '\'' +
                ", brand='" + brand + '\'' +
                ", cakePic='" + cakePic + '\'' +
                ", cakeDetailPic='" + cakeDetailPic + '\'' +
                ", cakeClassId=" + cakeClassId +
                ", createTime='" + createTime + '\'' +
                ", modifyTime='" + modifyTime + '\'' +
                '}';
    }
}
