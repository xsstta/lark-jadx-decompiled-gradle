package com.ss.android.lark.voip.service.impl.service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.voip.service.impl.service.b */
public class C58170b {

    /* renamed from: a */
    private List<AbstractC58172b> f143087a = new CopyOnWriteArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.voip.service.impl.service.b$a */
    public static final class C58171a {

        /* renamed from: a */
        public static final C58170b f143088a = new C58170b();
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.service.b$b */
    public interface AbstractC58172b {
        /* renamed from: a */
        void mo196977a(boolean z);
    }

    /* renamed from: a */
    public static C58170b m225706a() {
        return C58171a.f143088a;
    }

    /* renamed from: a */
    public void mo197127a(AbstractC58172b bVar) {
        if (bVar != null) {
            this.f143087a.add(bVar);
        }
    }

    /* renamed from: b */
    public void mo197129b(AbstractC58172b bVar) {
        if (bVar != null) {
            this.f143087a.remove(bVar);
        }
    }

    /* renamed from: a */
    public void mo197128a(boolean z) {
        for (AbstractC58172b bVar : this.f143087a) {
            bVar.mo196977a(z);
        }
    }
}
