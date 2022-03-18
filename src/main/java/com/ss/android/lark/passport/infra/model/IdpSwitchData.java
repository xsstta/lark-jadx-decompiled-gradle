package com.ss.android.lark.passport.infra.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class IdpSwitchData implements Serializable {
    @JSONField(name = "apple_id")
    public boolean appleId;
    public boolean facebook;
    public boolean google;
    @JSONField(name = "wechat")
    public boolean weChat;

    public IdpSwitchData() {
    }

    public boolean isEnableAppleId() {
        return this.appleId;
    }

    public boolean isEnableFacebook() {
        return this.facebook;
    }

    public boolean isEnableGoogle() {
        return this.google;
    }

    public boolean isEnableWeChat() {
        return this.weChat;
    }

    public IdpSwitchData(boolean z, boolean z2, boolean z3, boolean z4) {
        this.appleId = z;
        this.facebook = z2;
        this.google = z3;
        this.weChat = z4;
    }
}
