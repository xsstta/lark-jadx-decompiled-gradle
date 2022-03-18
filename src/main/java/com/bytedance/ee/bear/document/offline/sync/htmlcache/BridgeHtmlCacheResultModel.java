package com.bytedance.ee.bear.document.offline.sync.htmlcache;

import java.io.Serializable;

public class BridgeHtmlCacheResultModel implements Serializable {
    private boolean success;
    private String token;
    private String type;

    public String getToken() {
        return this.token;
    }

    public String getType() {
        return this.type;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String toString() {
        return "BridgeHtmlCacheResultModel{type='" + this.type + '\'' + ", token='" + '\'' + ", success=" + this.success + '}';
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
