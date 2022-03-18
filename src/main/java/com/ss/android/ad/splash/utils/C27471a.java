package com.ss.android.ad.splash.utils;

import android.text.TextUtils;
import com.ss.android.ad.splash.core.C27287e;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.utils.a */
public class C27471a {
    /* renamed from: a */
    public static void m100283a(String str) {
        m100281a(0, str);
    }

    /* renamed from: b */
    public static void m100287b(String str) {
        m100285b(0, str);
    }

    /* renamed from: c */
    public static void m100290c(String str) {
        m100288c(0, str);
    }

    /* renamed from: d */
    public static void m100293d(String str) {
        m100291d(0, str);
    }

    /* renamed from: a */
    public static void m100281a(long j, String str) {
        m100282a(j, str, null, null);
    }

    /* renamed from: b */
    public static void m100285b(long j, String str) {
        m100286b(j, str, null, null);
    }

    /* renamed from: c */
    public static void m100288c(long j, String str) {
        m100289c(j, str, null, null);
    }

    /* renamed from: d */
    public static void m100291d(long j, String str) {
        m100292d(j, str, null, null);
    }

    /* renamed from: a */
    public static void m100282a(long j, String str, Throwable th, JSONObject jSONObject) {
        if (C27287e.m99271k() != null) {
            StringBuilder sb = new StringBuilder();
            m100284a(sb, j, str, th, jSONObject);
            C27287e.m99271k().mo97114a("[BDASplash]", sb.toString(), th, jSONObject);
        }
    }

    /* renamed from: b */
    public static void m100286b(long j, String str, Throwable th, JSONObject jSONObject) {
        if (C27287e.m99271k() != null) {
            StringBuilder sb = new StringBuilder();
            m100284a(sb, j, str, th, jSONObject);
            C27287e.m99271k().mo97115b("[BDASplash]", sb.toString(), th, jSONObject);
        }
    }

    /* renamed from: c */
    public static void m100289c(long j, String str, Throwable th, JSONObject jSONObject) {
        if (C27287e.m99271k() != null) {
            StringBuilder sb = new StringBuilder();
            m100284a(sb, j, str, th, jSONObject);
            C27287e.m99271k().mo97116c("[BDASplash]", sb.toString(), th, jSONObject);
        }
    }

    /* renamed from: d */
    public static void m100292d(long j, String str, Throwable th, JSONObject jSONObject) {
        if (C27287e.m99271k() != null) {
            StringBuilder sb = new StringBuilder();
            m100284a(sb, j, str, th, jSONObject);
            C27287e.m99271k().mo97117d("[BDASplash]", sb.toString(), th, jSONObject);
        }
    }

    /* renamed from: a */
    private static void m100284a(StringBuilder sb, long j, String str, Throwable th, JSONObject jSONObject) {
        sb.append("[BDASplash]");
        if (j > 0) {
            sb.append(", ");
            sb.append("SplashAdId");
            sb.append("= ");
            sb.append(j);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(", message: ");
            sb.append(str);
        }
        if (th != null) {
            sb.append(", tr: ");
            sb.append(th.getMessage());
        }
        if (jSONObject != null) {
            sb.append(", json: ");
            sb.append(jSONObject.toString());
        }
    }
}
