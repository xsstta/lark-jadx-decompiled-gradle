package com.larksuite.component.metriclogger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.larksuite.component.metriclogger.g */
public class C24345g {

    /* renamed from: a */
    public AbstractC24337b f60040a;

    /* renamed from: b */
    long f60041b;

    /* renamed from: c */
    String f60042c;

    /* renamed from: d */
    int[] f60043d;

    /* renamed from: e */
    int f60044e;

    /* renamed from: f */
    int f60045f;

    /* renamed from: g */
    Map<String, Object> f60046g = new HashMap();

    /* renamed from: h */
    int f60047h;

    /* renamed from: i */
    long f60048i;

    /* renamed from: com.larksuite.component.metriclogger.g$a */
    public static class C24346a implements AbstractC24339c {

        /* renamed from: a */
        private C24345g f60049a;

        /* renamed from: b */
        private List<AbstractC24342d> f60050b = new ArrayList();

        /* renamed from: b */
        private C24345g m88866b() {
            return this.f60049a.clone();
        }

        @Override // com.larksuite.component.metriclogger.AbstractC24339c
        /* renamed from: a */
        public void mo87079a() {
            C24345g b = m88866b();
            synchronized (this) {
                for (AbstractC24342d dVar : this.f60050b) {
                    dVar.mo87094a(b);
                }
            }
            b.mo87096b();
        }

        @Override // com.larksuite.component.metriclogger.AbstractC24339c
        /* renamed from: a */
        public AbstractC24339c mo87073a(int i) {
            this.f60049a.f60047h = i;
            return this;
        }

        /* renamed from: c */
        public C24346a mo87080b(int i) {
            mo87077a("error_code", Integer.valueOf(i));
            return this;
        }

        @Override // com.larksuite.component.metriclogger.AbstractC24339c
        /* renamed from: a */
        public AbstractC24339c mo87075a(AbstractC24342d dVar) {
            if (dVar != null) {
                synchronized (this) {
                    if (!this.f60050b.contains(dVar)) {
                        this.f60050b.add(dVar);
                    }
                }
            }
            return this;
        }

        /* renamed from: b */
        public C24346a mo87074a(long j) {
            this.f60049a.f60048i = j;
            return this;
        }

        /* renamed from: b */
        public C24346a mo87076a(String str) {
            mo87077a("error_msg", str);
            return this;
        }

        /* renamed from: b */
        public C24346a mo87078a(int... iArr) {
            if (!(iArr == null || iArr.length == 0)) {
                int[] iArr2 = new int[(this.f60049a.f60043d.length + iArr.length)];
                System.arraycopy(this.f60049a.f60043d, 0, iArr2, 0, this.f60049a.f60043d.length);
                System.arraycopy(iArr, 0, iArr2, this.f60049a.f60043d.length, iArr.length);
                this.f60049a.f60043d = iArr2;
            }
            return this;
        }

        /* renamed from: a */
        public C24346a mo87098a(AbstractC24337b bVar) {
            this.f60049a.f60040a = bVar;
            return this;
        }

        /* renamed from: b */
        public C24346a mo87077a(String str, Object obj) {
            if (obj != null) {
                this.f60049a.f60046g.put(str, obj);
            } else {
                this.f60049a.f60046g.remove(str);
            }
            return this;
        }

        public C24346a(int i, int i2, int... iArr) {
            C24345g gVar = new C24345g();
            this.f60049a = gVar;
            gVar.f60041b = System.currentTimeMillis();
            this.f60049a.f60043d = iArr;
            this.f60049a.f60044e = i;
            this.f60049a.f60045f = i2;
            this.f60049a.f60042c = C24348i.m88896g();
            this.f60049a.f60041b = System.currentTimeMillis();
            mo87077a("device_id", C24348i.m88897h());
            mo87077a("cp", C24348i.m88895f());
            mo87077a("cp_id", C24348i.m88894e());
            mo87077a("env", C24348i.m88893d());
            mo87077a("lark_install_id", C24348i.m88892c());
            mo87077a("app_type", C24348i.m88891b());
            mo87077a("app_env", C24348i.m88888a());
        }
    }

    /* renamed from: b */
    public void mo87096b() {
        AbstractC24337b bVar = this.f60040a;
        if (bVar != null) {
            bVar.mo87089a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C24345g clone() {
        C24345g gVar = new C24345g();
        gVar.f60040a = this.f60040a;
        gVar.f60041b = this.f60041b;
        gVar.f60042c = this.f60042c;
        gVar.f60043d = this.f60043d;
        gVar.f60044e = this.f60044e;
        gVar.f60045f = this.f60045f;
        gVar.f60046g = this.f60046g;
        gVar.f60048i = this.f60048i;
        gVar.f60047h = this.f60047h;
        return gVar;
    }

    /* renamed from: a */
    static C24346a m88863a(AbstractC24337b bVar, int i, int i2, int... iArr) {
        return new C24346a(i, i2, iArr).mo87098a(bVar);
    }
}
