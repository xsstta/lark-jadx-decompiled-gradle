package com.google.android.play.core.splitinstall.p994a;

import com.google.android.play.core.splitinstall.AbstractC22722t;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.a.j */
final class C22691j implements AbstractC22722t {

    /* renamed from: a */
    final /* synthetic */ List f56147a;

    /* renamed from: b */
    final /* synthetic */ List f56148b;

    /* renamed from: c */
    final /* synthetic */ long f56149c;

    /* renamed from: d */
    final /* synthetic */ boolean f56150d;

    /* renamed from: e */
    final /* synthetic */ List f56151e;

    /* renamed from: f */
    final /* synthetic */ C22682a f56152f;

    C22691j(C22682a aVar, List list, List list2, long j, boolean z, List list3) {
        this.f56152f = aVar;
        this.f56147a = list;
        this.f56148b = list2;
        this.f56149c = j;
        this.f56150d = z;
        this.f56151e = list3;
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC22722t
    /* renamed from: a */
    public final void mo79039a() {
        this.f56152f.f56124k.addAll(this.f56147a);
        this.f56152f.f56125l.addAll(this.f56148b);
        C22682a.m82557a(this.f56152f, 5, Long.valueOf(this.f56149c));
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC22722t
    /* renamed from: a */
    public final void mo79040a(int i) {
        C22682a.m82556a(this.f56152f, i);
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC22722t
    /* renamed from: b */
    public final void mo79041b() {
        if (!this.f56150d) {
            C22682a.m82564b(this.f56152f, this.f56151e, this.f56147a, this.f56148b, this.f56149c);
        }
    }
}
