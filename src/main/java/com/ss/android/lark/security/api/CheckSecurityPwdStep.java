package com.ss.android.lark.security.api;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;

public class CheckSecurityPwdStep extends BaseStepInfo {
    @JSONField(name = "is_open")
    private boolean isOpen;
    @JSONField(name = "next_step")
    private BaseStepData nextStep;

    public BaseStepData getNextStep() {
        return this.nextStep;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public void setNextStep(BaseStepData baseStepData) {
        this.nextStep = baseStepData;
    }

    public void setOpen(boolean z) {
        this.isOpen = z;
    }
}
