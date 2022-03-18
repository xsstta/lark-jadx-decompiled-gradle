package com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a;

import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p716r.C13721c;

/* renamed from: com.bytedance.ee.bear.drive.loader.a.a.a.a.b */
public class C6986b implements AbstractC6987c {

    /* renamed from: a */
    private AbstractC6927d f18902a;

    /* renamed from: b */
    private C6880a f18903b;

    /* renamed from: a */
    private void m27821a(AbstractC6949c cVar) {
        try {
            boolean booleanValue = this.f18903b.mo27089b(this.f18902a.mo27240a(cVar.mo27371a()), cVar.mo27372b(), cVar.mo27375e()).mo238023d().booleanValue();
            C13479a.m54764b("DRIVE_PREVIEW_FLOW", C13598b.m55197d(cVar.mo27372b()) + " clear cache result " + booleanValue);
        } catch (Exception e) {
            C13479a.m54766b("DRIVE_PREVIEW_FLOW", e);
        }
    }

    public C6986b(AbstractC6927d dVar, C6880a aVar) {
        this.f18902a = dVar;
        this.f18903b = aVar;
    }

    @Override // com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a.AbstractC6987c
    /* renamed from: a */
    public boolean mo27521a(AbstractC6949c cVar, AbstractC6949c cVar2) {
        if (C13721c.m55646a(cVar.mo27373c(), cVar2.mo27373c())) {
            return false;
        }
        m27821a(cVar);
        return true;
    }
}
