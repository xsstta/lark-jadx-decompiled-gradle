package com.bytedance.ee.bear.list.p427e;

import com.bytedance.ee.bear.list.p427e.C8288c;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;

/* renamed from: com.bytedance.ee.bear.list.e.a */
public abstract class AbstractC8278a implements AbstractC8287b {

    /* renamed from: a */
    protected static PersistenceSharedPreference f22387a = new PersistenceSharedPreference("debug_config");

    /* renamed from: b */
    protected C8288c.AbstractC8290a f22388b;

    /* renamed from: a */
    public void mo32567a() {
        C8288c.AbstractC8290a aVar = this.f22388b;
        if (aVar != null) {
            aVar.mo32583a();
        }
    }

    @Override // com.bytedance.ee.bear.list.p427e.AbstractC8287b
    /* renamed from: a */
    public void mo32568a(C8288c.AbstractC8290a aVar) {
        this.f22388b = aVar;
    }
}
