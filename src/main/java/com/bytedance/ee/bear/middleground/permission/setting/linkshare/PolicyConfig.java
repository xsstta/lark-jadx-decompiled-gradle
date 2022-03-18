package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;

@AppConfig(key = "policy_config")
public class PolicyConfig implements NonProguard {
    private String privacy_url;
    private String service_term_url;

    public String getPrivacy_url() {
        return this.privacy_url;
    }

    public String getService_term_url() {
        return this.service_term_url;
    }

    public String toString() {
        return "PolicyConfig{service_term_url='" + this.service_term_url + '\'' + ", privacy_url='" + this.privacy_url + '\'' + '}';
    }

    public void setPrivacy_url(String str) {
        this.privacy_url = str;
    }

    public void setService_term_url(String str) {
        this.service_term_url = str;
    }
}
