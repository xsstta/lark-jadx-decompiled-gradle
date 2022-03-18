package com.bytedance.apm6.cpu.exception.p171a;

import android.app.Activity;
import com.bytedance.apm6.cpu.exception.AbstractC3264f;
import com.bytedance.apm6.cpu.exception.AbstractC3265g;
import com.bytedance.apm6.cpu.exception.C3262d;
import com.bytedance.apm6.cpu.p169a.C3229c;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p191d.AbstractC3338a;
import com.bytedance.apm6.p187i.p191d.C3339b;

/* renamed from: com.bytedance.apm6.cpu.exception.a.d */
public class C3251d extends C3339b implements AbstractC3264f {

    /* renamed from: a */
    private volatile C3262d f10418a;

    /* renamed from: b */
    private AbstractC3338a f10419b;

    /* renamed from: c */
    private AbstractC3265g f10420c = new C3253f(this.f10418a);

    /* renamed from: d */
    private AbstractC3265g f10421d = new C3254g(this.f10418a);

    /* renamed from: e */
    private AbstractC3265g f10422e = new C3255h(this.f10418a);

    /* renamed from: f */
    private AbstractC3265g f10423f = new C3249c(this.f10418a);

    /* renamed from: g */
    private AbstractC3265g f10424g = new C3252e(this.f10418a);

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3264f
    /* renamed from: a */
    public void mo13428a() {
        this.f10418a.mo13439a();
    }

    public C3251d() {
        AbstractC3338a aVar = (AbstractC3338a) C3336c.m13901a(AbstractC3338a.class);
        this.f10419b = aVar;
        this.f10418a = new C3262d(aVar);
        this.f10418a.mo13441a(this.f10420c, this.f10421d, this.f10422e, this.f10423f, this.f10424g);
        this.f10419b.mo13547a(this);
    }

    @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c, com.bytedance.apm6.p187i.p191d.C3339b
    public void onBackground(Activity activity) {
        this.f10418a.mo13442a(true);
    }

    @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c, com.bytedance.apm6.p187i.p191d.C3339b
    public void onFront(Activity activity) {
        this.f10418a.mo13442a(false);
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3264f
    /* renamed from: a */
    public void mo13429a(C3229c cVar) {
        this.f10418a.mo13440a(cVar);
    }
}
