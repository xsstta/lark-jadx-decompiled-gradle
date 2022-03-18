package com.ss.android.lark.passport.kar.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class KaAuthUrlResponse implements Serializable {
    @JSONField(name = "pre_config")
    public KaConfig preConfig;
    public String url;
}
