package com.ss.android.openbusiness.p3007d;

import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.google.gson.JsonObject;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.p3007d.C59558d;
import java.util.HashMap;

/* renamed from: com.ss.android.openbusiness.d.a */
public class C59550a extends C59558d {
    /* renamed from: a */
    public static void m231041a(String str, String str2, String str3, C59558d.AbstractC59560a aVar) {
        m231042a(str, str2, str3, false, aVar);
    }

    /* renamed from: a */
    public static void m231042a(String str, String str2, String str3, boolean z, C59558d.AbstractC59560a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bot_id", str);
        jsonObject.addProperty("chat_id", str2);
        jsonObject.addProperty("bot_type_id", "0");
        jsonObject.addProperty("i18n", C59480b.m230865a().mo144875b());
        jsonObject.addProperty("check_mender", Boolean.valueOf(z));
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + C59480b.m230865a().mo144880f());
        String str4 = "https://" + C59480b.m230865a().mo144868a(DomainSettings.Alias.OPEN) + "/open-apis/chatbot/api/SetBotAddConf";
        m231057a(new SendHttpRequest.C15253a().mo55528a(str4).mo55526a(SendHttpRequest.Method.POST).mo55529a(hashMap).mo55533c(jsonObject.toString()), str4, aVar);
    }
}
