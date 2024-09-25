package com.wms.e_wms_module.entity;

public class CakeClassInfo {
    private int id;
    private String className;
    private String createTime;
    private String modifyTime;

    public CakeClassInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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
        return "CakeClassInfo{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", createTime='" + createTime + '\'' +
                ", modifyTime='" + modifyTime + '\'' +
                '}';
    }
}
