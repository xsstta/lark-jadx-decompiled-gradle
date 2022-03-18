package com.ss.android.lark.passport.infra.entity;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class InputInfo implements Serializable {
    @JSONField(name = "placeholder")
    public String placeholder;
}
