package com.ss.android.lark.setting.dto;

import java.io.Serializable;

public class SmsPhoneUrgentSetting implements Serializable {
    private boolean accept;
    private boolean canModify;
    private boolean canSend;
    private boolean needConfirm;

    public SmsPhoneUrgentSetting() {
    }

    public boolean isAccept() {
        return this.accept;
    }

    public boolean isCanModify() {
        return this.canModify;
    }

    public boolean isCanSend() {
        return this.canSend;
    }

    public boolean isNeedConfirm() {
        return this.needConfirm;
    }

    public void setAccept(boolean z) {
        this.accept = z;
    }

    public void setCanModify(boolean z) {
        this.canModify = z;
    }

    public void setCanSend(boolean z) {
        this.canSend = z;
    }

    public void setNeedConfirm(boolean z) {
        this.needConfirm = z;
    }

    public SmsPhoneUrgentSetting(boolean z, boolean z2, boolean z3, boolean z4) {
        this.accept = z;
        this.canModify = z2;
        this.needConfirm = z3;
        this.canSend = z4;
    }
}
