package com.ss.android.vc.p3069b.p3070a;

import com.ss.android.vc.p3069b.AbstractC60659a;
import com.ss.android.vc.p3069b.C60674c;

/* renamed from: com.ss.android.vc.b.a.d */
public class C60667d implements AbstractC60659a {

    /* renamed from: a */
    private C60674c f151747a = new C60674c();

    /* renamed from: b */
    private int f151748b;

    /* renamed from: c */
    private C60665c f151749c;

    @Override // com.ss.android.vc.p3069b.AbstractC60659a
    /* renamed from: b */
    public C60674c mo208204b() {
        return this.f151747a.mo208227a(this.f151748b);
    }

    @Override // com.ss.android.vc.p3069b.AbstractC60659a
    /* renamed from: a */
    public C60674c mo208203a() {
        double f = this.f151749c.mo208214f();
        if (f > 0.0d) {
            this.f151747a.mo208232a(f);
            this.f151748b++;
        }
        C60674c cVar = new C60674c();
        cVar.f151774a = f;
        return cVar;
    }

    public C60667d(C60665c cVar) {
        this.f151749c = cVar;
        cVar.mo208220l();
        this.f151749c.mo208212d();
    }
}
