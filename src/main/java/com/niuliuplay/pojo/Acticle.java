package com.niuliuplay.pojo;

import java.io.Serializable;
import java.util.Date;


public class Acticle implements Serializable {
    private String id;

    private String acticleName;

    private String userId;

    private Byte acticleTypeId;

    private String classifyId;

    private String tag;

    private Date createTime;

    private Date lastModifyTime;

    private Byte open;

    private String context;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActicleName() {
        return acticleName;
    }

    public void setActicleName(String acticleName) {
        this.acticleName = acticleName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Byte getActicleTypeId() {
        return acticleTypeId;
    }

    public void setActicleTypeId(Byte acticleTypeId) {
        this.acticleTypeId = acticleTypeId;
    }

    public String getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Byte getOpen() {
        return open;
    }

    public void setOpen(Byte open) {
        this.open = open;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", acticleName=").append(acticleName);
        sb.append(", userId=").append(userId);
        sb.append(", acticleTypeId=").append(acticleTypeId);
        sb.append(", classifyId=").append(classifyId);
        sb.append(", tag=").append(tag);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", open=").append(open);
        sb.append(", context=").append(context);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}