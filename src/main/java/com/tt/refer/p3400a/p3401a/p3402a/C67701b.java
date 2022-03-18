package com.tt.refer.p3400a.p3401a.p3402a;

import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i;
import com.tt.refer.common.base.AppType;

/* renamed from: com.tt.refer.a.a.a.b */
public class C67701b {

    /* renamed from: a */
    private final AppType f170534a;

    /* renamed from: b */
    private final boolean f170535b;

    /* renamed from: c */
    private final String f170536c;

    /* renamed from: d */
    private final C67704c f170537d;

    /* renamed from: e */
    private AbstractC65805h f170538e;

    /* renamed from: f */
    private AbstractC65806i f170539f;

    /* renamed from: a */
    public AppType mo234983a() {
        return this.f170534a;
    }

    /* renamed from: b */
    public String mo234986b() {
        return this.f170536c;
    }

    /* renamed from: c */
    public C67704c mo234987c() {
        return this.f170537d;
    }

    /* renamed from: e */
    public AbstractC65806i mo234989e() {
        return this.f170539f;
    }

    /* renamed from: f */
    public AbstractC65805h mo234990f() {
        return this.f170538e;
    }

    /* renamed from: d */
    public String mo234988d() {
        return this.f170537d.mo234999a();
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: com.tt.refer.a.a.a.b$a */
    public static class C67703a {

        /* renamed from: a */
        private AppType f170540a = AppType.GadgetAPP;

        /* renamed from: b */
        private boolean f170541b;

        /* renamed from: c */
        private String f170542c;

        /* renamed from: d */
        private C67704c f170543d;

        /* renamed from: e */
        private AbstractC65805h f170544e;

        /* renamed from: f */
        private AbstractC65806i f170545f;

        /* renamed from: a */
        public C67701b mo234996a() {
            return new C67701b(this.f170542c, this.f170543d, this.f170540a, this.f170541b, this.f170544e, this.f170545f);
        }

        /* renamed from: a */
        public C67703a mo234992a(AbstractC65805h hVar) {
            this.f170544e = hVar;
            return this;
        }

        /* renamed from: a */
        public C67703a mo234993a(AbstractC65806i iVar) {
            this.f170545f = iVar;
            return this;
        }

        /* renamed from: a */
        public C67703a mo234994a(AppType appType) {
            this.f170540a = appType;
            return this;
        }

        /* renamed from: a */
        public C67703a mo234995a(boolean z) {
            this.f170541b = z;
            return this;
        }

        /* renamed from: a */
        public static C67703a m263358a(String str, C67704c cVar) {
            return new C67703a(str, cVar);
        }

        private C67703a(String str, C67704c cVar) {
            this.f170542c = str;
            this.f170543d = cVar;
        }
    }

    /* renamed from: a */
    public <T> T mo234984a(String str) {
        return (T) this.f170537d.mo234997a(str);
    }

    /* renamed from: a */
    public <T> T mo234985a(String str, T t) {
        return (T) this.f170537d.mo234998a(str, t);
    }

    private C67701b(String str, C67704c cVar, AppType appType, boolean z, AbstractC65805h hVar, AbstractC65806i iVar) {
        this.f170534a = appType;
        this.f170535b = z;
        this.f170536c = str;
        this.f170537d = cVar;
        this.f170538e = hVar;
        this.f170539f = iVar;
    }
}
