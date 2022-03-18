package com.ss.android.lark.passport.ka.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class InnerIdentify implements Serializable {
    public String identification;
    @JSONField(name = "X-Passport-Token")
    public String xPassportToken;
}
