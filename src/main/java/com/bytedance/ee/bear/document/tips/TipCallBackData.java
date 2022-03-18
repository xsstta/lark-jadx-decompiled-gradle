package com.bytedance.ee.bear.document.tips;

import com.bytedance.ee.util.io.NonProguard;

public class TipCallBackData implements NonProguard {
    private String id;
    private boolean needSendLark;

    public TipCallBackData() {
    }

    public String getId() {
        return this.id;
    }

    public boolean isNeedSendLark() {
        return this.needSendLark;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setNeedSendLark(boolean z) {
        this.needSendLark = z;
    }

    public TipCallBackData(String str, boolean z) {
        this.id = str;
        this.needSendLark = z;
    }
}
