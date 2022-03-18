package com.bytedance.apm.trace;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.block.evil.EvilMethodSwitcher;
import com.bytedance.apm.launch.C3024a;
import com.bytedance.apm.launch.p151a.C3029b;
import com.bytedance.apm.p124a.p125a.C2744d;

/* renamed from: com.bytedance.apm.trace.b */
public final class C3088b {

    /* renamed from: a */
    private static C3098f f9927a;

    /* renamed from: b */
    private static boolean f9928b;

    /* renamed from: com.bytedance.apm.trace.b$a */
    public static class C3090a {

        /* renamed from: a */
        private boolean f9929a;

        /* renamed from: b */
        private boolean f9930b;

        /* renamed from: c */
        private boolean f9931c;

        /* renamed from: d */
        private boolean f9932d;

        /* renamed from: a */
        public boolean mo12966a() {
            return this.f9930b;
        }

        /* renamed from: b */
        public boolean mo12967b() {
            return this.f9931c;
        }

        /* renamed from: c */
        public boolean mo12968c() {
            return this.f9932d;
        }

        /* renamed from: com.bytedance.apm.trace.b$a$a */
        public static class C3091a {

            /* renamed from: a */
            public boolean f9933a;

            /* renamed from: b */
            public boolean f9934b;

            /* renamed from: c */
            public boolean f9935c;

            /* renamed from: d */
            public boolean f9936d;

            /* renamed from: a */
            public C3090a mo12969a() {
                return new C3090a(this);
            }
        }

        private C3090a(C3091a aVar) {
            this.f9929a = aVar.f9933a;
            this.f9930b = aVar.f9934b;
            this.f9931c = aVar.f9935c;
            this.f9932d = aVar.f9936d;
        }
    }

    /* renamed from: c */
    public static long m12873c() {
        C3098f fVar = f9927a;
        if (fVar == null) {
            return 0;
        }
        return fVar.mo12988b();
    }

    /* renamed from: a */
    public static void m12865a() {
        C3098f fVar = new C3098f("start_trace", "launch_stats");
        f9927a = fVar;
        fVar.mo12990c();
        if (C2785b.m11764f()) {
            boolean isOpenLaunchEvilMethod = EvilMethodSwitcher.isOpenLaunchEvilMethod();
            f9928b = isOpenLaunchEvilMethod;
            if (isOpenLaunchEvilMethod) {
                C3029b.m12707a();
            }
        }
    }

    /* renamed from: b */
    public static void m12871b() {
        if (f9928b) {
            C3029b.m12708b();
        }
        C3098f fVar = f9927a;
        if (fVar != null) {
            fVar.mo12991d();
            f9927a = null;
        }
    }

    /* renamed from: a */
    public static void m12869a(long j) {
        C2744d.m11635a(j);
    }

    /* renamed from: a */
    public static void m12866a(int i) {
        boolean z = true;
        if ((i & 1) != 0 && !C3024a.m12698a().mo12840b().mo12850b()) {
            z = false;
        }
        C2744d.m11642b(z);
    }

    /* renamed from: a */
    public static void m12870a(String str, String str2) {
        C3098f fVar = f9927a;
        if (fVar != null) {
            fVar.mo12985a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m12872b(String str, String str2) {
        C3098f fVar = f9927a;
        if (fVar != null) {
            fVar.mo12989b(str, str2);
        }
    }

    /* renamed from: a */
    public static void m12867a(int i, String str, long j) {
        m12868a(i, str, j, 0);
    }

    /* renamed from: a */
    public static void m12868a(int i, String str, long j, long j2) {
        if (f9928b) {
            C3029b.m12708b();
        }
        C3098f fVar = f9927a;
        if (fVar != null) {
            fVar.mo12983a(i, str, j, j2);
        }
    }
}
