package com.ss.android.lark.setting.service.usersetting.base;

import java.io.Serializable;

public class SmartReplySetting implements Serializable, Comparable<SmartReplySetting> {
    private boolean isSmartActionEnable;
    private boolean isSmartReplyEnable;
    private Long updateTime;

    public SmartReplySetting() {
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isSmartActionEnable() {
        return this.isSmartActionEnable;
    }

    public boolean isSmartReplyEnable() {
        return this.isSmartReplyEnable;
    }

    public void setSmartActionEnable(boolean z) {
        this.isSmartActionEnable = z;
    }

    public void setSmartReplyEnable(boolean z) {
        this.isSmartReplyEnable = z;
    }

    public void setUpdateTime(Long l) {
        this.updateTime = l;
    }

    public int compareTo(SmartReplySetting smartReplySetting) {
        return Long.compare(this.updateTime.longValue(), smartReplySetting.updateTime.longValue());
    }

    public SmartReplySetting(boolean z, boolean z2, Long l) {
        this.isSmartReplyEnable = z;
        this.isSmartActionEnable = z2;
        this.updateTime = l;
    }
}
