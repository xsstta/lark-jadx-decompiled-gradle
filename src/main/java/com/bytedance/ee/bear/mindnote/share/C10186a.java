package com.bytedance.ee.bear.mindnote.share;

import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.share.C6155b;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;

/* renamed from: com.bytedance.ee.bear.mindnote.share.a */
public class C10186a extends C6155b {

    /* renamed from: b */
    private PersistenceSharedPreference f27481b = new PersistenceSharedPreference("mindnote");

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.share.C6155b
    /* renamed from: a */
    public String mo24847a() {
        return (String) this.f27481b.mo34038b("mindnote_view_type", "OUTLINE");
    }

    public C10186a(C6095s sVar) {
        super(sVar);
    }
}
