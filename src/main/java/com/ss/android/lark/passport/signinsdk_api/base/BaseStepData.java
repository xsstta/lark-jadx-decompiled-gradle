package com.ss.android.lark.passport.signinsdk_api.base;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class BaseStepData implements Serializable {
    @JSONField(name = "back_first")
    public boolean backFirst;
    public String message;
    @JSONField(name = "next_step")
    public String nextStep;
    @JSONField(name = "step_info")
    public JSONObject stepInfo;

    public String getNextStep() {
        return this.nextStep;
    }

    public JSONObject getStepInfo() {
        return this.stepInfo;
    }

    public boolean isBackFirst() {
        return this.backFirst;
    }

    public void setBackFirst(boolean z) {
        this.backFirst = z;
    }

    public void setNextStep(String str) {
        this.nextStep = str;
    }

    public void setStepInfo(JSONObject jSONObject) {
        this.stepInfo = jSONObject;
    }
}
