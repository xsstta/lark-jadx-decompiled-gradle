package com.bytedance.ee.bear.p511n;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5470j;
import com.bytedance.ee.bear.p397h.AbstractC7825c;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.n.b */
public class C10264b implements AbstractC5470j {

    /* renamed from: a */
    private C10917c f27738a = new C10917c(new C10929e());

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: a */
    public String mo21877a() {
        return C4511g.m18594d().mo17369s();
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: b */
    public int mo21879b() {
        return C4511g.m18594d().mo17341B();
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: c */
    public String mo21880c() {
        return C4511g.m18594d().mo17340A();
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: e */
    public boolean mo21882e() {
        return C4511g.m18594d().mo17345F();
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: f */
    public boolean mo21883f() {
        return ((AbstractC7825c) KoinJavaComponent.m268610a(AbstractC7825c.class)).mo8426a("tt_gecko_hotfix");
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: d */
    public long mo21881d() {
        return ((Long) C4211a.m17514a().mo16533a("offline_res_interval", (Object) 300000L)).longValue();
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: a */
    public void mo21878a(String str, JSONObject jSONObject) {
        C5234y.m21391b().mo21080a(str, jSONObject);
    }
}
