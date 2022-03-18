package com.ss.android.lark.passport.ka.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class KaSsoStepInfo implements Serializable {
    @JSONField(name = "flow_type")
    private String flowType;
    @JSONField(name = "land_url")
    public String landUrl;
    @JSONField(name = "open_with")
    public String openWith;
    @JSONField(name = "pre_config")
    public KaConfig preConfig;
    @JSONField(name = "security_id")
    public String securityId;
    public String url;

    public String getFlowType() {
        return this.flowType;
    }

    public void setFlowType(String str) {
        this.flowType = str;
    }
}
