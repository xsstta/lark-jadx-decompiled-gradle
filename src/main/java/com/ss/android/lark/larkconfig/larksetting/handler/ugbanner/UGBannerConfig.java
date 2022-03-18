package com.ss.android.lark.larkconfig.larksetting.handler.ugbanner;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class UGBannerConfig {
    @SerializedName("support_source")
    @JSONField(name = "support_source")
    private List<String> supportSource;

    public List<String> getSupportSource() {
        return this.supportSource;
    }

    public void setSupportSource(List<String> list) {
        this.supportSource = list;
    }
}
