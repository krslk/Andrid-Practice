package com.unjt.practice.mysyncdisk.entity;

public class UserInfo {
    private String id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private String qqOpenId;
    private String qqAvatar;
    private String createTime;
    private String lastLoginTime;
    private Integer status;
    private Integer useSpace;
    private Integer totalSpace;

    public UserInfo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQqOpenId() {
        return qqOpenId;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId;
    }

    public String getQqAvatar() {
        return qqAvatar;
    }

    public void setQqAvatar(String qqAvatar) {
        this.qqAvatar = qqAvatar;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUseSpace() {
        return useSpace;
    }

    public void setUseSpace(Integer useSpace) {
        this.useSpace = useSpace;
    }

    public Integer getTotalSpace() {
        return totalSpace;
    }

    public void setTotalSpace(Integer totalSpace) {
        this.totalSpace = totalSpace;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", email='" + email + '\'' +
                ", qqOpenId='" + qqOpenId + '\'' +
                ", qqAvatar='" + qqAvatar + '\'' +
                ", createTime='" + createTime + '\'' +
                ", lastLoginTime='" + lastLoginTime + '\'' +
                ", status=" + status +
                ", useSpace=" + useSpace +
                ", totalSpace=" + totalSpace +
                '}';
    }
}
