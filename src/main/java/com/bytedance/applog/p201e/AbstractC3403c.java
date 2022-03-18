package com.bytedance.applog.p201e;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.applog.util.C3470s;

/* renamed from: com.bytedance.applog.e.c */
public abstract class AbstractC3403c {

    /* renamed from: a */
    private AbstractC3403c f10788a;

    /* renamed from: c */
    Handler f10789c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.applog.e.c$a */
    public interface AbstractC3407a<L> {
        /* renamed from: a */
        L mo13680a(L l, L l2, AbstractC3403c cVar);

        /* renamed from: a */
        void mo13683a(L l);

        /* renamed from: a */
        boolean mo13684a(L l, L l2);

        /* renamed from: b */
        L mo13687b();

        /* renamed from: b */
        boolean mo13689b(L l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo13653a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13655a(String str, String str2);

    /* renamed from: a */
    private AbstractC3403c m14214a() {
        return this.f10788a;
    }

    /* renamed from: a */
    public void mo13675a(Handler handler) {
        AbstractC3403c a = m14214a();
        if (a != null) {
            a.mo13675a(handler);
        }
        this.f10789c = handler;
    }

    /* renamed from: a */
    public void mo13676a(AbstractC3403c cVar) {
        this.f10788a = cVar;
    }

    /* renamed from: b */
    public void mo13656b(String str) {
        AbstractC3403c a = m14214a();
        if (a != null) {
            a.mo13656b(str);
        }
    }

    /* renamed from: b */
    public String mo13677b(String str, String str2) {
        return (String) m14215a(str, str2, new AbstractC3407a<String>() {
            /* class com.bytedance.applog.p201e.AbstractC3403c.C34041 */

            /* renamed from: a */
            public String mo13687b() {
                return AbstractC3403c.this.mo13653a("openudid");
            }

            /* renamed from: b */
            public void mo13683a(String str) {
                AbstractC3403c.this.mo13655a("openudid", str);
            }

            /* renamed from: a */
            public boolean mo13689b(String str) {
                return C3470s.m14677a(str);
            }

            /* renamed from: a */
            public boolean mo13684a(String str, String str2) {
                return C3470s.m14678a(str, str2);
            }

            /* renamed from: a */
            public String mo13680a(String str, String str2, AbstractC3403c cVar) {
                if (cVar == null) {
                    return str;
                }
                return cVar.mo13677b(str, str2);
            }
        });
    }

    /* renamed from: c */
    public String mo13678c(String str, String str2) {
        return (String) m14215a(str, str2, new AbstractC3407a<String>() {
            /* class com.bytedance.applog.p201e.AbstractC3403c.C34052 */

            /* renamed from: a */
            public String mo13687b() {
                return AbstractC3403c.this.mo13653a("clientudid");
            }

            /* renamed from: b */
            public void mo13683a(String str) {
                AbstractC3403c.this.mo13655a("clientudid", str);
            }

            /* renamed from: a */
            public boolean mo13689b(String str) {
                return C3470s.m14677a(str);
            }

            /* renamed from: a */
            public boolean mo13684a(String str, String str2) {
                return C3470s.m14678a(str, str2);
            }

            /* renamed from: a */
            public String mo13680a(String str, String str2, AbstractC3403c cVar) {
                if (cVar == null) {
                    return str;
                }
                return cVar.mo13678c(str, str2);
            }
        });
    }

    /* renamed from: d */
    public String mo13679d(String str, String str2) {
        return (String) m14215a(str, str2, new AbstractC3407a<String>() {
            /* class com.bytedance.applog.p201e.AbstractC3403c.C34063 */

            /* renamed from: a */
            public String mo13687b() {
                return AbstractC3403c.this.mo13653a("device_id");
            }

            /* renamed from: b */
            public void mo13683a(String str) {
                AbstractC3403c.this.mo13655a("device_id", str);
            }

            /* renamed from: a */
            public boolean mo13689b(String str) {
                return !TextUtils.isEmpty(str);
            }

            /* renamed from: a */
            public boolean mo13684a(String str, String str2) {
                return C3470s.m14678a(str, str2);
            }

            /* renamed from: a */
            public String mo13680a(String str, String str2, AbstractC3403c cVar) {
                if (cVar == null) {
                    return str;
                }
                return cVar.mo13679d(str, str2);
            }
        });
    }

    /* renamed from: a */
    private <T> T m14215a(T t, T t2, AbstractC3407a<T> aVar) {
        if (aVar != null) {
            AbstractC3403c a = m14214a();
            T b = aVar.mo13687b();
            boolean b2 = aVar.mo13689b(t);
            boolean b3 = aVar.mo13689b(b);
            if (!b2 && b3) {
                t = b;
            }
            if (a != null) {
                T a2 = aVar.mo13680a(t, t2, a);
                if (!aVar.mo13684a(a2, b)) {
                    aVar.mo13683a(a2);
                }
                return a2;
            }
            boolean z = false;
            if (b2 || b3) {
                t2 = t;
            } else {
                z = true;
            }
            if ((z && aVar.mo13689b(t2)) || (b2 && !aVar.mo13684a(t2, b))) {
                aVar.mo13683a(t2);
            }
            return t2;
        }
        throw new IllegalArgumentException("agent == null");
    }
}
