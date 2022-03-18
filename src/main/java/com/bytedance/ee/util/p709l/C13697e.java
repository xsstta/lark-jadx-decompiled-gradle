package com.bytedance.ee.util.p709l;

import android.content.Context;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.util.p709l.AbstractC13688a;
import com.bytedance.ee.util.p709l.C13703h;

/* renamed from: com.bytedance.ee.util.l.e */
public class C13697e implements AbstractC13688a {

    /* renamed from: a */
    private final AbstractC13688a.AbstractC13689a f35890a;

    /* renamed from: b */
    private C13698f f35891b;

    /* renamed from: c */
    private C13703h f35892c;

    /* renamed from: d */
    private final C1177w<AbstractC13696d> f35893d = new C1177w<>();

    @Override // com.bytedance.ee.util.p709l.AbstractC13688a
    /* renamed from: a */
    public void mo50649a() {
        C13703h hVar = this.f35892c;
        if (hVar != null) {
            hVar.disable();
            this.f35892c = null;
        }
        C13698f fVar = this.f35891b;
        if (fVar != null) {
            fVar.onCleared();
            this.f35891b = null;
        }
    }

    public C13697e(AbstractC13688a.AbstractC13689a aVar) {
        this.f35890a = aVar;
    }

    @Override // com.bytedance.ee.util.p709l.AbstractC13688a
    /* renamed from: a */
    public void mo50650a(AbstractC13688a.AbstractC13690b bVar) {
        this.f35891b = (C13698f) this.f35890a.mo26373a(C13698f.class);
        Context a = this.f35890a.mo26372a();
        C1177w<AbstractC13696d> wVar = this.f35893d;
        wVar.getClass();
        this.f35892c = new C13703h(a, new C13703h.AbstractC13704a() {
            /* class com.bytedance.ee.util.p709l.$$Lambda$TFLfQXHrocC3xfG7S4rZLn9BAPg */

            @Override // com.bytedance.ee.util.p709l.C13703h.AbstractC13704a
            public final void onOrientationChanged(AbstractC13696d dVar) {
                C1177w.this.mo5926a(dVar);
            }
        });
        this.f35893d.mo5923a(this.f35890a.mo26374b(), new AbstractC1178x(bVar) {
            /* class com.bytedance.ee.util.p709l.$$Lambda$e$mt4UZB8UkIkFBqonoVLtncLyCAM */
            public final /* synthetic */ AbstractC13688a.AbstractC13690b f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C13697e.this.m55588a((C13697e) this.f$1, (AbstractC13688a.AbstractC13690b) ((AbstractC13696d) obj));
            }
        });
        this.f35892c.enable();
        this.f35891b.getLocked().mo5923a(this.f35890a.mo26374b(), new AbstractC1178x(bVar) {
            /* class com.bytedance.ee.util.p709l.$$Lambda$e$KhB9Oz44xCEB8fJMRvN1hWRpdM */
            public final /* synthetic */ AbstractC13688a.AbstractC13690b f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C13697e.this.m55589a((C13697e) this.f$1, (AbstractC13688a.AbstractC13690b) ((Boolean) obj));
            }
        });
        this.f35891b.registerLockObserver(this.f35890a.mo26372a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m55589a(AbstractC13688a.AbstractC13690b bVar, Boolean bool) {
        if (bVar != null) {
            bVar.mo26377a(this.f35893d.mo5927b(), bool);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m55588a(AbstractC13688a.AbstractC13690b bVar, AbstractC13696d dVar) {
        C13698f fVar;
        if (bVar != null && (fVar = this.f35891b) != null) {
            bVar.mo26377a(dVar, fVar.getLocked().mo5927b());
        }
    }
}
