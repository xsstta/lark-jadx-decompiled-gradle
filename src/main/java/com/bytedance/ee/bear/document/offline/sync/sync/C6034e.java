package com.bytedance.ee.bear.document.offline.sync.sync;

import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.sync.e */
public class C6034e implements AbstractC7945d<SyncStatusModel> {

    /* renamed from: a */
    private WeakReference<AbstractC6033d> f16904a;

    public C6034e(AbstractC6033d dVar) {
        this.f16904a = new WeakReference<>(dVar);
    }

    /* renamed from: a */
    public void handle(SyncStatusModel syncStatusModel, AbstractC7947h hVar) {
        AbstractC6033d dVar;
        WeakReference<AbstractC6033d> weakReference = this.f16904a;
        if (weakReference != null && (dVar = weakReference.get()) != null) {
            dVar.mo24349a(syncStatusModel);
        }
    }
}
