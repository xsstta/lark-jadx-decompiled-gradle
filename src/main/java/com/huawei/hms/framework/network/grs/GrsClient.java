package com.huawei.hms.framework.network.grs;

import android.content.Context;
import java.util.Map;

public class GrsClient {
    private C23576d grsClientGlobal;

    public GrsClient(Context context, GrsBaseInfo grsBaseInfo) {
        if (context == null || grsBaseInfo == null) {
            throw new NullPointerException("invalid init params for context is null or GrsBaseInfo instance is null Object.");
        }
        this.grsClientGlobal = C23588e.m85568a(grsBaseInfo, context);
    }

    public void ayncGetGrsUrl(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        this.grsClientGlobal.mo82923a(str, str2, iQueryUrlCallBack);
    }

    public void ayncGetGrsUrls(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        this.grsClientGlobal.mo82922a(str, iQueryUrlsCallBack);
    }

    public void clearSp() {
        this.grsClientGlobal.mo82921a();
    }

    public boolean forceExpire() {
        return this.grsClientGlobal.mo82925b();
    }

    public String synGetGrsUrl(String str, String str2) {
        return this.grsClientGlobal.mo82919a(str, str2);
    }

    public Map<String, String> synGetGrsUrls(String str) {
        return this.grsClientGlobal.mo82920a(str);
    }
}
