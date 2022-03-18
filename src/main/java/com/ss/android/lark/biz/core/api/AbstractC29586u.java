package com.ss.android.lark.biz.core.api;

import java.util.Objects;

/* renamed from: com.ss.android.lark.biz.core.api.u */
public interface AbstractC29586u {
    void onAppLifecycleChanged(C29587a aVar, C29587a aVar2);

    /* renamed from: com.ss.android.lark.biz.core.api.u$a */
    public static class C29587a {

        /* renamed from: a */
        private final String f74021a;

        /* renamed from: b */
        private final String f74022b;

        /* renamed from: c */
        private final boolean f74023c;

        /* renamed from: d */
        private final boolean f74024d;

        /* renamed from: e */
        private final long f74025e;

        /* renamed from: a */
        public String mo105885a() {
            return this.f74021a;
        }

        /* renamed from: b */
        public String mo105886b() {
            return this.f74022b;
        }

        /* renamed from: c */
        public boolean mo105887c() {
            return this.f74023c;
        }

        /* renamed from: d */
        public boolean mo105888d() {
            return this.f74024d;
        }

        /* renamed from: e */
        public long mo105889e() {
            return this.f74025e;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public C29587a() {
            this(null, null, null, 0);
        }

        public String toString() {
            return String.format("topProc:%s, topAct: %s, appFront: %s, procFront: %s", this.f74021a, this.f74022b, Boolean.valueOf(this.f74023c), Boolean.valueOf(this.f74024d));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C29587a)) {
                return false;
            }
            C29587a aVar = (C29587a) obj;
            if (mo105887c() == aVar.mo105887c() && mo105888d() == aVar.mo105888d() && Objects.equals(this.f74022b, aVar.f74022b)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static C29587a m109237a(String str, String str2, String str3, long j) {
            return new C29587a(str, str2, str3, j);
        }

        private C29587a(String str, String str2, String str3, long j) {
            boolean z;
            this.f74021a = str;
            boolean z2 = true;
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            this.f74023c = z;
            this.f74022b = str2;
            this.f74024d = (str3 == null || !str3.equals(str)) ? false : z2;
            this.f74025e = j;
        }
    }
}
