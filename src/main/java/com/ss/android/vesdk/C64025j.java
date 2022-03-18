package com.ss.android.vesdk;

import com.bytedance.bpea.basics.PrivacyCert;
import com.ss.android.vesdk.audio.AbstractC63940a;
import com.ss.android.vesdk.audio.AbstractC63942c;
import com.ss.android.vesdk.audio.AbstractC63946e;
import com.ss.android.vesdk.audio.C63943d;
import com.ss.android.vesdk.audio.C63948g;

/* renamed from: com.ss.android.vesdk.j */
public class C64025j implements AbstractC63940a {

    /* renamed from: a */
    C63922a<AbstractC63946e> f161659a = new C63922a<>();

    /* renamed from: b */
    private C63943d f161660b;

    /* renamed from: a */
    public void mo221688a() {
        this.f161659a.mo221135a();
    }

    public C64025j() {
        C63943d dVar = new C63943d();
        this.f161660b = dVar;
        dVar.mo221297a(new AbstractC63942c() {
            /* class com.ss.android.vesdk.C64025j.C640261 */

            @Override // com.ss.android.vesdk.audio.AbstractC63942c
            /* renamed from: a */
            public void mo221294a(C63948g gVar) {
                for (AbstractC63946e eVar : C64025j.this.f161659a.mo221139c()) {
                    eVar.onReceive(gVar);
                }
            }

            @Override // com.ss.android.vesdk.audio.AbstractC63942c
            /* renamed from: a */
            public void mo221293a(int i, int i2, String str) {
                for (AbstractC63946e eVar : C64025j.this.f161659a.mo221139c()) {
                    eVar.onError(i, i2, str);
                }
            }

            @Override // com.ss.android.vesdk.audio.AbstractC63942c
            /* renamed from: a */
            public void mo221292a(int i, int i2, double d, Object obj) {
                for (AbstractC63946e eVar : C64025j.this.f161659a.mo221139c()) {
                    eVar.onInfo(i, i2, d, obj);
                }
            }
        });
    }

    /* renamed from: b */
    public boolean mo221690b(AbstractC63946e eVar) {
        return this.f161659a.mo221138b(eVar);
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public int init(C64027k kVar) {
        return this.f161660b.init(kVar);
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public void release(PrivacyCert privacyCert) {
        this.f161660b.release(privacyCert);
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public int start(PrivacyCert privacyCert) {
        return this.f161660b.start(privacyCert);
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public int stop(PrivacyCert privacyCert) {
        return this.f161660b.stop(privacyCert);
    }

    /* renamed from: a */
    public boolean mo221689a(AbstractC63946e eVar) {
        return this.f161659a.mo221136a(eVar);
    }
}
