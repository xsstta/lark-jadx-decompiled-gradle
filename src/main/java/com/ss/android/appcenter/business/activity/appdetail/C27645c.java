package com.ss.android.appcenter.business.activity.appdetail;

import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.google.gson.JsonObject;
import com.ss.android.appcenter.business.net.C27724c;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.HashMap;

/* renamed from: com.ss.android.appcenter.business.activity.appdetail.c */
public class C27645c extends C27714b {
    /* renamed from: a */
    public static void m100930a(String str, int i, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("cli_id", str);
        jsonObject.addProperty("notification_type", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        if (C27548m.m100547m().mo98221e() != null) {
            hashMap.put("Cookie", "session=" + C27548m.m100547m().mo98221e().mo98211a());
        }
        String b = C27724c.m101383b();
        m101358a(new SendHttpRequest.C15253a().mo55528a(b).mo55526a(SendHttpRequest.Method.POST).mo55529a(hashMap).mo55533c(jsonObject.toString()), b, aVar);
    }

    /* renamed from: a */
    public static void m100931a(String str, String str2, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bot_id", str);
        jsonObject.addProperty("chat_id", str2);
        jsonObject.addProperty("bot_type_id", (Number) 0);
        jsonObject.addProperty("i18n", C28183g.m103240a());
        HashMap hashMap = new HashMap();
        if (C27548m.m100547m().mo98221e() != null) {
            hashMap.put("Cookie", "session=" + C27548m.m100547m().mo98221e().mo98211a());
        }
        String d = C27724c.m101385d();
        m101358a(new SendHttpRequest.C15253a().mo55528a(d).mo55526a(SendHttpRequest.Method.POST).mo55529a(hashMap).mo55533c(jsonObject.toString()), d, aVar);
    }

    /* renamed from: a */
    public static void m100933a(String str, String str2, boolean z, C27714b.AbstractC27716a aVar) {
        String str3;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bot_id", str);
        jsonObject.addProperty("chat_id", str2);
        jsonObject.addProperty("i18n", C28183g.m103240a());
        HashMap hashMap = new HashMap();
        if (C27548m.m100547m().mo98221e() != null) {
            hashMap.put("Cookie", "session=" + C27548m.m100547m().mo98221e().mo98211a());
        }
        if (z) {
            str3 = C27724c.m101387f();
        } else {
            str3 = C27724c.m101386e();
        }
        m101358a(new SendHttpRequest.C15253a().mo55528a(str3).mo55526a(SendHttpRequest.Method.POST).mo55529a(hashMap).mo55533c(jsonObject.toString()), str3, aVar);
    }

    /* renamed from: a */
    public static void m100932a(String str, String str2, String str3, boolean z, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bot_id", str);
        jsonObject.addProperty("chat_id", str2);
        jsonObject.addProperty("bot_type_id", "0");
        jsonObject.addProperty("i18n", C28183g.m103240a());
        jsonObject.addProperty("check_mender", Boolean.valueOf(z));
        HashMap hashMap = new HashMap();
        if (C27548m.m100547m().mo98221e() != null) {
            hashMap.put("Cookie", "session=" + C27548m.m100547m().mo98221e().mo98211a());
        }
        String c = C27724c.m101384c();
        m101358a(new SendHttpRequest.C15253a().mo55528a(c).mo55526a(SendHttpRequest.Method.POST).mo55529a(hashMap).mo55533c(jsonObject.toString()), c, aVar);
    }

    /* renamed from: a */
    public static void m100934a(String str, String str2, boolean z, boolean z2, C27714b.AbstractC27716a aVar) {
        String str3;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bot_id", str);
        jsonObject.addProperty("chat_id", str2);
        jsonObject.addProperty("i18n", C28183g.m103240a());
        jsonObject.addProperty("check_mender", Boolean.valueOf(z2));
        HashMap hashMap = new HashMap();
        if (C27548m.m100547m().mo98221e() != null) {
            hashMap.put("Cookie", "session=" + C27548m.m100547m().mo98221e().mo98211a());
        }
        if (z) {
            str3 = C27724c.m101388g();
        } else {
            str3 = C27724c.m101389h();
        }
        m101358a(new SendHttpRequest.C15253a().mo55528a(str3).mo55526a(SendHttpRequest.Method.POST).mo55529a(hashMap).mo55533c(jsonObject.toString()), str3, aVar);
    }
}
