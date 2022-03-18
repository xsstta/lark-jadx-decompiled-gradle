package com.ss.android.lark.passport.ka.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class InternalData implements Serializable {
    @JSONField(name = "user_agent")
    public String userAgent;
}
