package com.tt.refer.common.meta.fetch;

import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.tt.refer.common.meta.fetch.C67803g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.tt.refer.common.meta.fetch.e */
public class C67801e extends AbstractC67799c {
    @Override // com.tt.refer.common.meta.fetch.AbstractC67799c
    /* renamed from: a */
    public C12827e mo87492a(C67803g<? extends C67803g.AbstractC67804a> gVar) {
        long j;
        JSONArray jSONArray = new JSONArray();
        for (C67803g.AbstractC67804a aVar : gVar.mo235316g()) {
            jSONArray.put(aVar.mo50354a(gVar));
        }
        String str = gVar.mo235314e().f167670c;
        HashMap hashMap = new HashMap();
        hashMap.put("app_meta_requests", jSONArray);
        hashMap.put("ttcode", str);
        hashMap.put("sessionid", gVar.mo235313d());
        hashMap.put("language", gVar.mo235315f());
        hashMap.putAll(gVar.mo235310b());
        C12827e eVar = new C12827e(gVar.mo235312c(), "POST");
        gVar.mo235307a(eVar);
        eVar.mo48435a(hashMap);
        Map<String, String> a = gVar.mo235306a();
        if (a != null && a.size() > 0) {
            for (Map.Entry<String, String> entry : a.entrySet()) {
                if (entry != null) {
                    eVar.mo48434a(entry.getKey(), entry.getValue());
                }
            }
        }
        eVar.mo48434a("x-tma-host-sessionid", gVar.mo235313d());
        if (gVar.mo235317h() > 0) {
            j = gVar.mo235317h();
        } else {
            j = 15000;
        }
        eVar.mo48438b(j);
        eVar.mo48439c(j);
        eVar.mo48429a(j);
        return eVar;
    }
}
