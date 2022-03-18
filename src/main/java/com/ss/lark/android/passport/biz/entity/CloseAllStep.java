package com.ss.lark.android.passport.biz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;

public class CloseAllStep extends BaseStepInfo {
    @JSONField(name = "toast_msg")
    private String toastMsg;

    public String getToastMsg() {
        return this.toastMsg;
    }

    public void setToastMsg(String str) {
        this.toastMsg = str;
    }
}
