package com.ss.android.appcenter.business.tab.business.widget;

import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.C27724c;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1265a.C27580h;
import com.ss.android.appcenter.business.p1265a.C27581i;
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.business.widget.k */
public class C27970k extends C27711a {
    /* renamed from: a */
    public static void m102125a(boolean z, List<C27965i> list, C27714b.AbstractC27716a aVar) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("session", C27548m.m100547m().mo98221e().mo98211a());
        hashMap.put("User-Agent", C27581i.m100670a());
        hashMap.put("Device-Id", C27548m.m100547m().mo98219c().mo98186a());
        hashMap.put("Platform", "android");
        hashMap.put("Lark-Version", C27548m.m100547m().mo98218b().mo98171b());
        hashMap.put("Locale", C28183g.m103240a());
        hashMap.put("Os", "android");
        if (z) {
            str = "preview";
        } else {
            str = "current";
        }
        hashMap.put("Version-Type", str);
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (C27965i iVar : list) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("CardID", iVar.mo99683a());
            jsonObject2.addProperty("Version", iVar.mo99685b());
            jsonArray.add(jsonObject2);
        }
        jsonObject.add("Widgets", jsonArray);
        String jsonObject3 = jsonObject.toString();
        String r = C27724c.m101399r();
        C28184h.m103250d("GetWidgetContent", C27580h.m100662a(r, jsonObject3));
        m101358a(new SendHttpRequest.C15253a().mo55528a(r).mo55526a(SendHttpRequest.Method.POST).mo55529a(hashMap).mo55533c(jsonObject3), r, aVar);
    }
}
