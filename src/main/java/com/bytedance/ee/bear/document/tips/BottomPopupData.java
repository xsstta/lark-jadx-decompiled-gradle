package com.bytedance.ee.bear.document.tips;

import com.bytedance.ee.util.io.NonProguard;

public class BottomPopupData implements NonProguard {
    private String cancelBtnText;
    private String confirmBtnText;
    private String des;
    private String sendLarkText;
    private String title;

    public String getCancelBtnText() {
        return this.cancelBtnText;
    }

    public String getConfirmBtnText() {
        return this.confirmBtnText;
    }

    public String getDes() {
        return this.des;
    }

    public String getSendLarkText() {
        return this.sendLarkText;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCancelBtnText(String str) {
        this.cancelBtnText = str;
    }

    public void setConfirmBtnText(String str) {
        this.confirmBtnText = str;
    }

    public void setDes(String str) {
        this.des = str;
    }

    public void setSendLarkText(String str) {
        this.sendLarkText = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
