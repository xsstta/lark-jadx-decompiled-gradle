package com.lark.falcon.engine.p1060d;

import com.larksuite.component.openplatform.api.p1105d.AbstractC24373b;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.ss.android.lark.sdk.C53241h;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.lark.falcon.engine.d.a */
public class C23972a implements AbstractC24373b {

    /* renamed from: a */
    private final Map<String, AbstractC25558a> f59302a = new ConcurrentHashMap();

    @Override // com.larksuite.component.openplatform.api.p1105d.AbstractC24373b
    /* renamed from: a */
    public AbstractC25558a mo86073a(String str) {
        synchronized (C23972a.class) {
            if (!this.f59302a.containsKey(str)) {
                return null;
            }
            return this.f59302a.get(str);
        }
    }

    @Override // com.larksuite.component.openplatform.api.p1105d.AbstractC24373b
    /* renamed from: a */
    public void mo86075a(List<AbstractC25558a> list) {
        for (AbstractC25558a aVar : list) {
            mo86074a(aVar);
        }
    }

    /* renamed from: a */
    public void mo86074a(AbstractC25558a aVar) {
        if (aVar == null) {
            C53241h.m205894a("OPBizWorkerManagerProvi", "provider is null");
            return;
        }
        C53241h.m205898b("OPBizWorkerManagerProvi", "register key:" + aVar.mo88702c());
        synchronized (C23972a.class) {
            String c = aVar.mo88702c();
            if (!this.f59302a.containsKey(c)) {
                this.f59302a.put(c, aVar);
            } else {
                String str = "workKey:" + c + " already register";
                C48936b.m192783a(str);
                C53241h.m205900d("OPBizWorkerManagerProvi", str);
            }
        }
    }
}
