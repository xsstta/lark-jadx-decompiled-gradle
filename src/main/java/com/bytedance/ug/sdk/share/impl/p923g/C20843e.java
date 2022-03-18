package com.bytedance.ug.sdk.share.impl.p923g;

import com.bytedance.ug.sdk.share.impl.p918b.AbstractC20823a;
import com.bytedance.ug.sdk.share.impl.p918b.AbstractC20824b;
import com.bytedance.ug.sdk.share.impl.p919c.C20826a;

/* renamed from: com.bytedance.ug.sdk.share.impl.g.e */
public class C20843e {

    /* renamed from: a */
    public boolean f51019a;

    /* renamed from: b */
    public boolean f51020b;

    /* renamed from: c */
    public AbstractC20824b f51021c;

    /* renamed from: d */
    private AbstractC20823a f51022d;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ug.sdk.share.impl.g.e$a */
    public static class C20846a {

        /* renamed from: a */
        public static C20843e f51025a = new C20843e();
    }

    /* renamed from: a */
    public static C20843e m75897a() {
        return C20846a.f51025a;
    }

    /* renamed from: b */
    public void mo70325b() {
        mo70323a((AbstractC20824b) null);
    }

    private C20843e() {
        this.f51022d = new AbstractC20823a() {
            /* class com.bytedance.ug.sdk.share.impl.p923g.C20843e.C208441 */
        };
    }

    /* renamed from: c */
    public void mo70326c() {
        C20826a.m75837a().mo70292a(new Runnable() {
            /* class com.bytedance.ug.sdk.share.impl.p923g.C20843e.RunnableC208452 */

            public void run() {
                boolean z;
                if (C20843e.this.mo70328e()) {
                    C20836b.m75878a().mo70315c();
                }
                if (!C20843e.this.f51019a && C20843e.this.mo70327d()) {
                    C20826a.m75837a().mo70304h();
                }
                if (C20843e.this.f51021c != null) {
                    AbstractC20824b bVar = C20843e.this.f51021c;
                    if (C20843e.this.f51019a || C20843e.this.f51020b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.mo70284a(z);
                }
            }
        });
    }

    /* renamed from: d */
    public boolean mo70327d() {
        return C20826a.m75837a().mo70305i();
    }

    /* renamed from: e */
    public boolean mo70328e() {
        return C20826a.m75837a().mo70306j();
    }

    /* renamed from: a */
    public void mo70324a(boolean z) {
        this.f51019a = z;
    }

    /* renamed from: a */
    public void mo70323a(AbstractC20824b bVar) {
        if (!C20826a.m75837a().mo70308l()) {
            this.f51021c = bVar;
            if (!C20840d.m75892a().mo70321d()) {
                C20840d.m75892a().mo70318a(this.f51022d);
            } else {
                mo70326c();
            }
        }
    }
}
