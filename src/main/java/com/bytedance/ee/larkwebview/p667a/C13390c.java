package com.bytedance.ee.larkwebview.p667a;

import android.content.Context;
import com.bytedance.ee.larkwebview.p667a.C13388b;
import com.bytedance.ee.larkwebview.p667a.C13393d;
import com.bytedance.ee.larkwebview.p667a.C13395e;

/* renamed from: com.bytedance.ee.larkwebview.a.c */
public class C13390c {

    /* renamed from: a */
    public C13388b f35300a;

    /* renamed from: b */
    public C13395e f35301b;

    /* renamed from: c */
    public C13393d f35302c;

    private C13390c() {
    }

    /* renamed from: a */
    public C13388b mo49694a() {
        return this.f35300a;
    }

    /* renamed from: b */
    public C13395e mo49695b() {
        return this.f35301b;
    }

    /* renamed from: c */
    public C13393d mo49696c() {
        return this.f35302c;
    }

    /* renamed from: com.bytedance.ee.larkwebview.a.c$a */
    public static class C13392a {

        /* renamed from: a */
        C13388b.C13389a f35303a = new C13388b.C13389a(this);

        /* renamed from: b */
        C13395e.C13396a f35304b = new C13395e.C13396a(this);

        /* renamed from: c */
        C13393d.C13394a f35305c = new C13393d.C13394a(this);

        /* renamed from: a */
        public C13390c mo49697a() {
            C13390c cVar = new C13390c();
            cVar.f35300a = this.f35303a.mo49693a();
            cVar.f35301b = this.f35304b.mo49702a();
            cVar.f35302c = this.f35305c.mo49700a();
            return cVar;
        }

        public C13392a(Context context) {
            this.f35303a.mo49691a(context);
            this.f35304b.mo49691a(context);
            this.f35305c.mo49691a(context);
        }

        /* renamed from: a */
        public C13390c mo49698a(C13390c cVar) {
            C13388b bVar;
            C13395e eVar;
            C13393d dVar;
            C13390c cVar2 = new C13390c();
            if (cVar.f35300a != null) {
                bVar = cVar.f35300a;
            } else {
                bVar = this.f35303a.mo49693a();
            }
            cVar2.f35300a = bVar;
            if (cVar.f35301b != null) {
                eVar = cVar.f35301b;
            } else {
                eVar = this.f35304b.mo49702a();
            }
            cVar2.f35301b = eVar;
            if (cVar.f35302c != null) {
                dVar = cVar.f35302c;
            } else {
                dVar = this.f35305c.mo49700a();
            }
            cVar2.f35302c = dVar;
            return cVar2;
        }
    }

    /* renamed from: a */
    public static C13390c m54449a(Context context) {
        return new C13392a(context).mo49697a();
    }
}
