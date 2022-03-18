package com.bytedance.ee.webapp.api.bean;

import com.alibaba.fastjson.annotation.JSONField;

public class DataCodeInfo {
    @JSONField(name = "code")
    public String preAuthorizationCode;

    public String toString() {
        return "CodeDetailInfo{code='" + this.preAuthorizationCode + '\'' + '}';
    }
}
