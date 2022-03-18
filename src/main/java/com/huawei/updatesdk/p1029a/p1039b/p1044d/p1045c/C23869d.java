package com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c;

/* renamed from: com.huawei.updatesdk.a.b.d.c.d */
public class C23869d extends AbstractC23866b {
    public static final int ERROR = 1;
    public static final int NETWORK_ERROR = 3;
    public static final int OK = 0;
    public static final int PROGUARD_ERROR = 6;
    public static final int REQ_PARAM_ERROR = 5;
    public static final int RTN_CODE_OK = 0;
    public static final int TIMEOUT = 2;
    private EnumC23870a errCause = EnumC23870a.NORMAL;
    private int httpRespondeCode = 0;
    private String reason;
    private int responseCode = 1;
    private int rtnCode_ = 0;

    /* renamed from: com.huawei.updatesdk.a.b.d.c.d$a */
    public enum EnumC23870a {
        NORMAL,
        NO_NETWORK,
        JSON_ERROR,
        PARAM_ERROR,
        IO_EXCEPTION,
        CONNECT_EXCEPTION,
        UNKNOWN_EXCEPTION,
        NO_PROGUARD
    }

    /* renamed from: a */
    public EnumC23870a mo85635a() {
        return this.errCause;
    }

    /* renamed from: a */
    public void mo85636a(int i) {
        this.httpRespondeCode = i;
    }

    /* renamed from: a */
    public void mo85637a(EnumC23870a aVar) {
        this.errCause = aVar;
    }

    /* renamed from: a */
    public void mo85638a(String str) {
        this.reason = str;
    }

    /* renamed from: b */
    public int mo85639b() {
        return this.httpRespondeCode;
    }

    /* renamed from: b */
    public void mo85640b(int i) {
        this.responseCode = i;
    }

    /* renamed from: c */
    public String mo85641c() {
        return this.reason;
    }

    /* renamed from: d */
    public int mo85642d() {
        return this.responseCode;
    }

    /* renamed from: e */
    public int mo85643e() {
        return this.rtnCode_;
    }

    public String toString() {
        return getClass().getName() + " { \n\tresponseCode: " + mo85642d() + "\n\trtnCode_: " + mo85643e() + "\n\terrCause: " + mo85635a() + "\n}";
    }
}
