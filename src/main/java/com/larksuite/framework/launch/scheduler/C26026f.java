package com.larksuite.framework.launch.scheduler;

import android.content.Context;
import com.larksuite.framework.launch.scheduler.p1192a.C26018a;

/* renamed from: com.larksuite.framework.launch.scheduler.f */
public class C26026f {

    /* renamed from: a */
    private Context f64413a;

    /* renamed from: b */
    private boolean f64414b;

    /* renamed from: c */
    private boolean f64415c;

    /* renamed from: d */
    private AbstractC26023d f64416d;

    /* renamed from: e */
    private AbstractC26021b f64417e;

    /* renamed from: f */
    private C26018a f64418f;

    /* renamed from: a */
    public C26024e mo92532a() {
        if (this.f64418f == null) {
            this.f64418f = new C26018a.C26019a().mo92525a();
        }
        C26024e eVar = new C26024e(this.f64413a, this.f64414b, this.f64415c, this.f64418f.mo92523a(), this.f64416d);
        AbstractC26021b bVar = this.f64417e;
        if (bVar != null) {
            C26027g.m94197a(bVar);
        }
        return eVar;
    }

    /* renamed from: a */
    public C26026f mo92533a(Context context) {
        this.f64413a = context;
        return this;
    }

    /* renamed from: a */
    public C26026f mo92534a(C26018a aVar) {
        this.f64418f = aVar;
        return this;
    }

    /* renamed from: a */
    public C26026f mo92535a(AbstractC26023d dVar) {
        this.f64416d = dVar;
        return this;
    }

    /* renamed from: a */
    public C26026f mo92536a(boolean z) {
        this.f64415c = z;
        return this;
    }

    /* renamed from: a */
    public void mo92537a(AbstractC26021b bVar) {
        this.f64417e = bVar;
    }
}
