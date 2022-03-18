package com.ss.android.lark.phone.impl.service.entity;

import java.io.Serializable;

public class PhoneQueryDailyAmountInfo implements Serializable {
    private int dailyQuota;
    private int maxLimit;

    public int getDailyQuota() {
        return this.dailyQuota;
    }

    public int getMaxLimit() {
        return this.maxLimit;
    }

    public void setDailyQuota(int i) {
        this.dailyQuota = i;
    }

    public void setMaxLimit(int i) {
        this.maxLimit = i;
    }
}
