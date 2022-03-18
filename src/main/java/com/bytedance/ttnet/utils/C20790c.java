package com.bytedance.ttnet.utils;

import com.bytedance.frameworks.baselib.network.http.util.C14091i;
import com.bytedance.ttnet.C20741b;
import com.bytedance.ttnet.http.HttpRequestInfo;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.utils.c */
public class C20790c {

    /* renamed from: a */
    private static AbstractC20792b f50955a = null;

    /* renamed from: b */
    private static AbstractC20791a f50956b = null;

    /* renamed from: c */
    private static volatile boolean f50957c = true;

    /* renamed from: com.bytedance.ttnet.utils.c$a */
    public interface AbstractC20791a {
        /* renamed from: a */
        void mo70068a(String str, HttpRequestInfo httpRequestInfo);
    }

    /* renamed from: com.bytedance.ttnet.utils.c$b */
    public interface AbstractC20792b {
        /* renamed from: a */
        void mo69963a(String str, String str2, int i, boolean z, JSONObject jSONObject);

        /* renamed from: a */
        void mo69964a(String str, String str2, String str3, HttpRequestInfo httpRequestInfo);
    }

    /* renamed from: a */
    public static AbstractC20792b m75733a() {
        return f50955a;
    }

    /* renamed from: b */
    public static AbstractC20791a m75739b() {
        return f50956b;
    }

    /* renamed from: a */
    public static void m75735a(AbstractC20792b bVar) {
        f50955a = bVar;
    }

    /* renamed from: a */
    public static String m75734a(String str) {
        if (!f50957c) {
            return null;
        }
        try {
            if (C14091i.m57053a(str).getHost().endsWith(C20741b.m75547a())) {
                return String.valueOf(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static void m75738a(boolean z) {
        f50957c = z;
    }

    /* renamed from: a */
    public static void m75737a(String str, String str2, String str3, HttpRequestInfo httpRequestInfo) {
        AbstractC20792b bVar = f50955a;
        if (bVar != null) {
            bVar.mo69964a(str, str2, str3, httpRequestInfo);
        }
    }

    /* renamed from: a */
    public static void m75736a(String str, String str2, int i, boolean z, JSONObject jSONObject) {
        AbstractC20792b bVar = f50955a;
        if (bVar != null) {
            bVar.mo69963a(str, str2, i, z, jSONObject);
        }
    }
}
