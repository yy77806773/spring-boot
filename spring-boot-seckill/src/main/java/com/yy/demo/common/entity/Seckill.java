package com.yy.demo.common.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Seckill implements Serializable {
    private static final long serialVersionUID=1L;

    private long seckillId;
    private String name;
    private int number;
    private Timestamp startTime;
    private Timestamp endTime;
    private Timestamp createTime;
    private int version;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public int getVersion() {
        return version;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
