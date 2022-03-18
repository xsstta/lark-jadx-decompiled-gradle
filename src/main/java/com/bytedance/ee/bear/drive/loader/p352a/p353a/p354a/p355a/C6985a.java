package com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;

/* renamed from: com.bytedance.ee.bear.drive.loader.a.a.a.a.a */
public class C6985a implements AbstractC6987c {

    /* renamed from: a */
    private AbstractC6927d f18900a;

    /* renamed from: b */
    private C6880a f18901b;

    /* renamed from: a */
    private void m27819a(AbstractC6949c cVar) {
        try {
            boolean booleanValue = this.f18901b.mo27089b(this.f18900a.mo27240a(cVar.mo27371a()), cVar.mo27372b(), cVar.mo27375e()).mo238023d().booleanValue();
            C13479a.m54764b("DRIVE_PREVIEW_FLOW", C13598b.m55197d(cVar.mo27372b()) + " clear cache result " + booleanValue);
        } catch (Exception e) {
            C13479a.m54766b("DRIVE_PREVIEW_FLOW", e);
        }
    }

    public C6985a(AbstractC6927d dVar, C6880a aVar) {
        this.f18900a = dVar;
        this.f18901b = aVar;
    }

    @Override // com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a.AbstractC6987c
    /* renamed from: a */
    public boolean mo27521a(AbstractC6949c cVar, AbstractC6949c cVar2) {
        if (TextUtils.equals(cVar.mo27375e(), cVar2.mo27375e())) {
            return false;
        }
        m27819a(cVar);
        return true;
    }
}
