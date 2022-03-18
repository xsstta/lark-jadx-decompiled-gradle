package com.ss.android.lark.passport.signinsdk_api.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.contants.ButtonType;
import java.io.Serializable;

public class ButtonInfo implements Serializable {
    @JSONField(name = "action_type")
    public int actionType;
    @JSONField(name = "next")
    public BaseStepData next;
    public String text;

    public ButtonType getButtonType() {
        return ButtonType.fromValue(this.actionType);
    }
}
