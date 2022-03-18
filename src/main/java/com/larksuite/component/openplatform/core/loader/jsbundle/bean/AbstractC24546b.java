package com.larksuite.component.openplatform.core.loader.jsbundle.bean;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.bean.b */
public abstract class AbstractC24546b {
    @SerializedName("name")

    /* renamed from: a */
    protected String f60515a;
    @SerializedName(HiAnalyticsConstant.HaKey.BI_KEY_VERSION)

    /* renamed from: b */
    protected String f60516b;

    /* renamed from: c */
    public String mo87459c() {
        return this.f60515a;
    }

    /* renamed from: d */
    public String mo87461d() {
        return this.f60516b;
    }

    /* renamed from: c */
    public void mo87460c(String str) {
        this.f60515a = str;
    }

    /* renamed from: d */
    public void mo87462d(String str) {
        this.f60516b = str;
    }
}
