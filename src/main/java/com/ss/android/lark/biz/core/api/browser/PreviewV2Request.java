package com.ss.android.lark.biz.core.api.browser;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import java.util.Map;

public class PreviewV2Request implements BaseJSModel {
    public String body;
    public Map<String, String> header;
    public String method;
    public String url;

    public PreviewV2Request() {
    }

    public PreviewV2Request(String str) {
        this.url = str;
    }

    public PreviewV2Request(String str, Map<String, String> map, String str2, String str3) {
        String str4;
        this.url = str;
        this.header = map;
        if (str2 != null) {
            str4 = str2.toUpperCase();
        } else {
            str4 = null;
        }
        this.method = str4;
        this.body = str3;
    }
}
