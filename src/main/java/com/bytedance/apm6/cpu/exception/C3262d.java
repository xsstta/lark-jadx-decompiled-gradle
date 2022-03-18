package com.bytedance.apm6.cpu.exception;

import com.bytedance.apm.C2785b;
import com.bytedance.apm6.cpu.C3223a;
import com.bytedance.apm6.cpu.p169a.C3229c;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p187i.p191d.AbstractC3338a;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.p725f.p726a.p727a.AbstractC13853c;
import com.bytedance.p725f.p726a.p727a.C13852b;

/* renamed from: com.bytedance.apm6.cpu.exception.d */
public class C3262d {

    /* renamed from: a */
    private boolean f10445a;

    /* renamed from: b */
    private boolean f10446b;

    /* renamed from: c */
    private boolean f10447c;

    /* renamed from: d */
    private AbstractC3338a f10448d;

    /* renamed from: e */
    private AbstractC13853c f10449e;

    /* renamed from: f */
    private AbstractC3265g f10450f;

    /* renamed from: g */
    private C3229c f10451g;

    /* renamed from: h */
    private AbstractC3265g f10452h;

    /* renamed from: i */
    private AbstractC3265g f10453i;

    /* renamed from: j */
    private AbstractC3265g f10454j;

    /* renamed from: k */
    private AbstractC3265g f10455k;

    /* renamed from: l */
    private AbstractC3265g f10456l;

    /* renamed from: g */
    public AbstractC13853c mo13448g() {
        return this.f10449e;
    }

    /* renamed from: b */
    public synchronized void mo13443b() {
        m13623a(this.f10456l);
    }

    /* renamed from: c */
    public synchronized void mo13444c() {
        m13623a(this.f10452h);
    }

    /* renamed from: d */
    public synchronized void mo13445d() {
        m13623a(this.f10453i);
    }

    /* renamed from: e */
    public synchronized void mo13446e() {
        m13623a(this.f10454j);
    }

    /* renamed from: f */
    public synchronized void mo13447f() {
        m13623a(this.f10455k);
    }

    /* renamed from: h */
    private void m13624h() {
        if (C3318a.m13915u()) {
            C3350b.m13934b("APM-CPU", "change cpu exception detect state: " + this.f10450f);
        }
    }

    /* renamed from: a */
    public synchronized void mo13439a() {
        AbstractC3265g gVar = this.f10450f;
        if (gVar != null) {
            if (this.f10445a) {
                gVar.mo13417a();
                this.f10445a = false;
            }
        }
    }

    public C3262d(AbstractC3338a aVar) {
        this.f10448d = aVar;
    }

    /* renamed from: a */
    private void m13623a(AbstractC3265g gVar) {
        boolean z;
        if (this.f10445a && this.f10446b) {
            this.f10450f = gVar;
            C3229c cVar = this.f10451g;
            AbstractC3338a aVar = this.f10448d;
            if (aVar == null || !aVar.mo13548a()) {
                z = true;
            } else {
                z = false;
            }
            gVar.mo13418a(cVar, z);
            m13624h();
        }
    }

    /* renamed from: a */
    public synchronized void mo13440a(C3229c cVar) {
        if (!this.f10445a) {
            if (this.f10446b) {
                this.f10451g = cVar;
                boolean z = true;
                this.f10445a = true;
                C3258b.m13612a(C3223a.m13484a().mo13338b());
                if (this.f10448d.mo13548a()) {
                    z = false;
                }
                this.f10447c = z;
                mo13444c();
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo13442a(boolean z) {
        AbstractC3265g gVar = this.f10450f;
        if (gVar != null) {
            if (this.f10445a) {
                if (this.f10447c != z) {
                    this.f10447c = z;
                    gVar.mo13420a(z);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo13441a(AbstractC3265g gVar, AbstractC3265g gVar2, AbstractC3265g gVar3, AbstractC3265g gVar4, AbstractC3265g gVar5) {
        if (!this.f10446b) {
            this.f10452h = gVar;
            this.f10453i = gVar2;
            this.f10454j = gVar3;
            this.f10455k = gVar4;
            this.f10456l = gVar5;
            try {
                this.f10449e = C13852b.m56165a(C2785b.m11735a());
            } catch (Throwable unused) {
            }
            this.f10446b = true;
        }
    }
}
