package com.ss.video.rtc.base.net;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;
import okhttp3.RequestBody;

public abstract class RtcNetBaseRequestModel {
    private String mCallDnsLog = "";
    private HashMap<String, String> queryParameter = new HashMap<>();
    private HashMap<String, String> requestHeader = new HashMap<>();

    /* access modifiers changed from: protected */
    public abstract void addQueryParameter(HashMap<String, String> hashMap);

    /* access modifiers changed from: protected */
    public void addRequestHeader(HashMap<String, String> hashMap) {
    }

    /* access modifiers changed from: protected */
    public int connectTimeout() {
        return 5;
    }

    public RequestBody getRequestBody() throws Exception {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getRequestMethod() {
        return "GET";
    }

    /* access modifiers changed from: protected */
    public abstract String getRequestUrl();

    /* access modifiers changed from: protected */
    public List<InetAddress> setCustomDnsReslov(String str) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public String getCallDnsLog() {
        return this.mCallDnsLog;
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, String> getQueryParameter() {
        return this.queryParameter;
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, String> getRequestHeader() {
        return this.requestHeader;
    }

    /* access modifiers changed from: package-private */
    public void setHeaderParameter() {
        addRequestHeader(this.requestHeader);
    }

    /* access modifiers changed from: package-private */
    public void setQueryParameter() {
        addQueryParameter(this.queryParameter);
    }

    /* access modifiers changed from: package-private */
    public void setCallDnsLog(String str, String str2) {
        this.mCallDnsLog = String.format(" lookupDns:{%s:%s}", str, str2);
    }
}
