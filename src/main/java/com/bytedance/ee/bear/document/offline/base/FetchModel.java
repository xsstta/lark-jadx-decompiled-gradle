package com.bytedance.ee.bear.document.offline.base;

import java.io.Serializable;
import java.util.Map;

public class FetchModel implements Serializable {
    public String body;
    public boolean checkResponseDataJSONValid;
    public Map<String, String> headers;
    public boolean isProxy;
    public String key;
    public String method;
    public int priority;
    public int retryCount = 3;
    public String url;

    public String toString() {
        return "{key='" + this.key + '\'' + ", url='" + this.url + '\'' + "isProxy='" + this.isProxy + '\'' + ", method='" + this.method + '\'' + ", headers=" + this.headers + ", body='" + this.body + '\'' + ", priority='" + this.priority + "', retryCount=" + this.retryCount + "', checkResponseDataJSONValid=" + this.checkResponseDataJSONValid + "'" + '}';
    }
}
