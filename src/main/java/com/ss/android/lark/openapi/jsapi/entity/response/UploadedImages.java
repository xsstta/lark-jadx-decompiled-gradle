package com.ss.android.lark.openapi.jsapi.entity.response;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import java.util.List;

public class UploadedImages implements BaseJSModel {
    private List<String> urls;

    public List<String> getUrls() {
        return this.urls;
    }

    public void setUrls(List<String> list) {
        this.urls = list;
    }
}
