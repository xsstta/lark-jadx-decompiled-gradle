package com.ss.android.appcenter.business.p1265a;

import com.larksuite.framework.callback.Entity.ErrorResult;

/* renamed from: com.ss.android.appcenter.business.a.h */
public class C27580h {
    /* renamed from: a */
    public static String m100660a() {
        return "biz success.";
    }

    /* renamed from: b */
    public static String m100665b() {
        return "update cache error";
    }

    /* renamed from: c */
    public static String m100668c() {
        return "read cache error";
    }

    /* renamed from: d */
    public static String m100669d() {
        return "read cache success";
    }

    /* renamed from: a */
    public static String m100662a(String str, String str2) {
        return String.format("invoke. url: %s. params: %s", str, str2);
    }

    /* renamed from: b */
    public static String m100666b(String str, String str2) {
        return String.format("get host: %s. from domain: %s", str, str2);
    }

    /* renamed from: a */
    public static String m100661a(String str, ErrorResult errorResult) {
        return String.format("onError. url: %s ,msg: %s", str, errorResult.getDebugMsg());
    }

    /* renamed from: b */
    public static String m100667b(String str, String str2, String str3) {
        return String.format("json error. url: %s, requestId: %s, jsonBody: %s", str, str2, str3);
    }

    /* renamed from: a */
    public static String m100663a(String str, String str2, String str3) {
        return String.format("biz error. url: %s, requestId: %s, jsonBody: %s", str, str2, str3);
    }

    /* renamed from: a */
    public static String m100664a(String str, String str2, String str3, int i) {
        return String.format("biz error. url: %s, requestId: %s, jsonBody: %s, statusCode: %d", str, str2, str3, Integer.valueOf(i));
    }
}
