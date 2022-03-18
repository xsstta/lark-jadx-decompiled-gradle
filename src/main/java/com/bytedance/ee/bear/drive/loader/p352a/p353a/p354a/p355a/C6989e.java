package com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;

/* renamed from: com.bytedance.ee.bear.drive.loader.a.a.a.a.e */
public class C6989e implements AbstractC6987c {

    /* renamed from: a */
    private boolean f18905a;

    public C6989e(boolean z) {
        this.f18905a = z;
    }

    /* renamed from: a */
    private boolean m27826a(String str) {
        return C13721c.m55646a(str, "pdf");
    }

    @Override // com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a.AbstractC6987c
    /* renamed from: a */
    public boolean mo27521a(AbstractC6949c cVar, AbstractC6949c cVar2) {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW", "vc handle, localPreviewExt: " + cVar.mo27380j());
        if (this.f18905a) {
            return !m27826a(cVar.mo27380j());
        }
        return false;
    }
}
