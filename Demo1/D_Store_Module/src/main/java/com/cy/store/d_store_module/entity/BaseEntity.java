package com.cy.store.d_store_module.entity;

import java.util.Date;
import java.util.Objects;

public class BaseEntity {
    private String createdUser;
    private Date createdTime;
    private String modifyUser;
    private Date modifyTime;

    public BaseEntity() {
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifyUser='" + modifyUser + '\'' +
                ", modifyTime=" + modifyTime +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BaseEntity that = (BaseEntity) object;
        return Objects.equals(createdUser, that.createdUser) && Objects.equals(createdTime, that.createdTime) && Objects.equals(modifyUser, that.modifyUser) && Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdUser, createdTime, modifyUser, modifyTime);
    }
}
