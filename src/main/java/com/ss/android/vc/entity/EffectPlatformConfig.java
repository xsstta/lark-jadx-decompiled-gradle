package com.ss.android.vc.entity;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class EffectPlatformConfig implements Serializable {
    @JSONField(name = "feishuHost")
    public String feishuHost;
    @JSONField(name = "larkHost")
    public String larkHost;
}
