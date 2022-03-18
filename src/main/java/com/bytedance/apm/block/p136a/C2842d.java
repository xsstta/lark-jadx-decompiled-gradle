package com.bytedance.apm.block.p136a;

/* renamed from: com.bytedance.apm.block.a.d */
public class C2842d {

    /* renamed from: b */
    private static volatile C2842d f9071b;

    /* renamed from: c */
    private static volatile boolean f9072c;

    /* renamed from: a */
    public AbstractC2846b f9073a = new C2845a();

    /* renamed from: com.bytedance.apm.block.a.d$b */
    public interface AbstractC2846b {
        /* renamed from: a */
        void mo12235a(long j, long[] jArr);

        /* renamed from: a */
        boolean mo12236a();

        /* renamed from: b */
        void mo12237b();
    }

    /* renamed from: com.bytedance.apm.block.a.d$a */
    static class C2845a implements AbstractC2846b {
        @Override // com.bytedance.apm.block.p136a.C2842d.AbstractC2846b
        /* renamed from: a */
        public void mo12235a(long j, long[] jArr) {
        }

        @Override // com.bytedance.apm.block.p136a.C2842d.AbstractC2846b
        /* renamed from: a */
        public boolean mo12236a() {
            return false;
        }

        @Override // com.bytedance.apm.block.p136a.C2842d.AbstractC2846b
        /* renamed from: b */
        public void mo12237b() {
        }

        C2845a() {
        }
    }

    private C2842d() {
    }

    /* renamed from: a */
    public static C2842d m11997a() {
        if (f9071b == null) {
            synchronized (C2842d.class) {
                if (f9071b == null) {
                    f9071b = new C2842d();
                }
            }
        }
        return f9071b;
    }

    /* renamed from: a */
    public void mo12232a(final long[] jArr, final long j) {
        if (!this.f9073a.mo12236a()) {
            C2848f.m12008a().f9090j.mo12901a(new Runnable() {
                /* class com.bytedance.apm.block.p136a.C2842d.RunnableC28431 */

                public void run() {
                    C2842d.this.f9073a.mo12235a(j, jArr);
                }
            });
            f9072c = true;
        } else if (f9072c) {
            C2848f.m12008a().f9090j.mo12901a(new Runnable() {
                /* class com.bytedance.apm.block.p136a.C2842d.RunnableC28442 */

                public void run() {
                    C2842d.this.f9073a.mo12237b();
                }
            });
            f9072c = false;
        }
    }
}
