package com.bytedance.ee.bear.document.imageviewer.bean;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class DeleteImageData implements BaseJSModel {
    private boolean success;
    private String uuid;

    public String getUuid() {
        return this.uuid;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }
}
