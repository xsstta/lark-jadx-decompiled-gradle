package com.tt.miniapp.video.p3341d.p3342a;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: com.tt.miniapp.video.d.a.a */
public class C67095a implements AbstractC67097c {

    /* renamed from: a */
    private AbstractC67100f f169151a;

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67097c
    /* renamed from: a */
    public boolean mo233309a(AbstractC67099e eVar) {
        return false;
    }

    /* renamed from: a */
    public AbstractC67100f mo233307a() {
        return this.f169151a;
    }

    /* renamed from: b */
    public ViewGroup mo233310b() {
        AbstractC67100f a = mo233307a();
        if (a != null) {
            return a.mo233296C();
        }
        return null;
    }

    /* renamed from: c */
    public Context mo233312c() {
        if (mo233307a() != null) {
            return mo233307a().mo233297D();
        }
        return null;
    }

    /* renamed from: b */
    public void mo233311b(AbstractC67100f fVar) {
        this.f169151a = fVar;
    }

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67097c
    /* renamed from: a */
    public void mo233308a(AbstractC67100f fVar) {
        mo233311b(fVar);
    }
}
