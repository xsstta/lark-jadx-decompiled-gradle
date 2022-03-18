package com.bytedance.ee.falcon.openplugin.p605a;

import android.text.TextUtils;
import com.larksuite.framework.apiplugin.LKEvent;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.falcon.openplugin.a.b */
public interface AbstractC12706b {

    /* renamed from: com.bytedance.ee.falcon.openplugin.a.b$a */
    public static class C12708a {

        /* renamed from: a */
        public String f34010a;

        /* renamed from: b */
        public LKEvent f34011b;

        /* renamed from: c */
        public String f34012c;

        /* renamed from: d */
        public long f34013d;

        /* renamed from: e */
        public int f34014e;

        /* renamed from: f */
        public JSONObject f34015f;

        /* renamed from: g */
        public OPTrace f34016g;

        /* renamed from: h */
        public boolean f34017h;

        /* renamed from: i */
        public String f34018i;

        /* renamed from: j */
        public JSONObject f34019j;

        /* renamed from: k */
        public Object f34020k;

        /* renamed from: com.bytedance.ee.falcon.openplugin.a.b$a$a */
        public static final class C12709a {

            /* renamed from: a */
            private String f34021a;

            /* renamed from: b */
            private LKEvent f34022b;

            /* renamed from: c */
            private String f34023c;

            /* renamed from: d */
            private long f34024d;

            /* renamed from: e */
            private int f34025e;

            /* renamed from: f */
            private JSONObject f34026f;

            /* renamed from: g */
            private OPTrace f34027g;

            /* renamed from: h */
            private boolean f34028h;

            /* renamed from: i */
            private String f34029i;

            /* renamed from: j */
            private JSONObject f34030j;

            /* renamed from: k */
            private Object f34031k;

            private C12709a() {
            }

            /* renamed from: a */
            public static C12709a m52604a() {
                return new C12709a();
            }

            /* renamed from: b */
            public C12708a mo48131b() {
                C12708a aVar = new C12708a();
                aVar.f34010a = this.f34021a;
                aVar.f34013d = this.f34024d;
                aVar.f34019j = this.f34030j;
                aVar.f34016g = this.f34027g;
                aVar.f34018i = this.f34029i;
                aVar.f34012c = this.f34023c;
                aVar.f34011b = this.f34022b;
                aVar.f34015f = this.f34026f;
                aVar.f34014e = this.f34025e;
                aVar.f34017h = this.f34028h;
                aVar.f34020k = this.f34031k;
                return aVar;
            }

            /* renamed from: a */
            public C12709a mo48121a(int i) {
                this.f34025e = i;
                return this;
            }

            /* renamed from: b */
            public C12709a mo48129b(String str) {
                this.f34023c = str;
                return this;
            }

            /* renamed from: c */
            public C12709a mo48132c(String str) {
                this.f34029i = str;
                return this;
            }

            /* renamed from: b */
            public C12709a mo48130b(JSONObject jSONObject) {
                this.f34030j = jSONObject;
                return this;
            }

            /* renamed from: a */
            public C12709a mo48122a(long j) {
                this.f34024d = j;
                return this;
            }

            /* renamed from: a */
            public C12709a mo48123a(LKEvent lKEvent) {
                this.f34022b = lKEvent;
                return this;
            }

            /* renamed from: a */
            public C12709a mo48124a(OPTrace oPTrace) {
                this.f34027g = oPTrace;
                return this;
            }

            /* renamed from: a */
            public C12709a mo48125a(Object obj) {
                this.f34031k = obj;
                return this;
            }

            /* renamed from: a */
            public C12709a mo48126a(String str) {
                this.f34021a = str;
                return this;
            }

            /* renamed from: a */
            public C12709a mo48127a(JSONObject jSONObject) {
                this.f34026f = jSONObject;
                return this;
            }

            /* renamed from: a */
            public C12709a mo48128a(boolean z) {
                this.f34028h = z;
                return this;
            }
        }

        private C12708a() {
        }

        /* renamed from: b */
        public LKEvent mo48112b() {
            return this.f34011b;
        }

        /* renamed from: c */
        public String mo48113c() {
            return this.f34012c;
        }

        /* renamed from: d */
        public long mo48114d() {
            return this.f34013d;
        }

        /* renamed from: e */
        public int mo48115e() {
            return this.f34014e;
        }

        /* renamed from: f */
        public JSONObject mo48116f() {
            return this.f34015f;
        }

        /* renamed from: g */
        public OPTrace mo48117g() {
            return this.f34016g;
        }

        /* renamed from: h */
        public boolean mo48118h() {
            return this.f34017h;
        }

        /* renamed from: i */
        public String mo48119i() {
            return this.f34018i;
        }

        /* renamed from: j */
        public Object mo48120j() {
            return this.f34020k;
        }

        /* renamed from: a */
        public String mo48111a() {
            LKEvent lKEvent;
            if (!TextUtils.isEmpty(this.f34010a) || (lKEvent = this.f34011b) == null) {
                return this.f34010a;
            }
            return lKEvent.mo92146m();
        }
    }

    /* renamed from: a */
    OPTrace mo48106a(String str);

    /* renamed from: a */
    void mo48107a(C12708a aVar);

    /* renamed from: a */
    void mo48108a(C12708a aVar, boolean z, boolean z2);

    /* renamed from: a */
    void mo48109a(LKEvent lKEvent);

    /* renamed from: b */
    void mo48110b(LKEvent lKEvent);
}
