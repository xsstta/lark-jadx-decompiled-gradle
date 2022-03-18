package com.ss.android.lark.monitor.p2372a;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.apm.trace.C3093c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.AbstractC48230h;

/* renamed from: com.ss.android.lark.monitor.a.b */
public class C48211b {

    /* renamed from: b */
    private static C48211b f121326b;

    /* renamed from: c */
    private static C48211b f121327c = new C48211b("");

    /* renamed from: d */
    private static AbstractC48230h f121328d = null;

    /* renamed from: a */
    public String f121329a;

    /* renamed from: e */
    private long f121330e = -1;

    /* renamed from: f */
    private C3093c f121331f;

    /* renamed from: g */
    private C48208a f121332g;

    /* renamed from: c */
    public void mo168690c() {
        C48208a aVar = this.f121332g;
        if (aVar != null) {
            aVar.mo168680a();
        }
    }

    /* renamed from: d */
    public void mo168692d() {
        mo168686a(2, 10000);
    }

    /* renamed from: a */
    public static synchronized C48211b m190251a() {
        synchronized (C48211b.class) {
            C48211b bVar = f121326b;
            if (bVar != null) {
                return bVar;
            }
            return f121327c;
        }
    }

    /* renamed from: e */
    public void mo168693e() {
        C3093c cVar = this.f121331f;
        if (cVar != null) {
            cVar.mo12973b();
        }
        m190255g();
    }

    /* renamed from: com.ss.android.lark.monitor.a.b$a */
    private static class C48212a {

        /* renamed from: a */
        private final View f121333a;

        /* renamed from: b */
        private View.OnAttachStateChangeListener f121334b = new View.OnAttachStateChangeListener() {
            /* class com.ss.android.lark.monitor.p2372a.C48211b.C48212a.View$OnAttachStateChangeListenerC482131 */

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                C48212a.this.mo168694a();
            }
        };

        /* renamed from: c */
        private ViewTreeObserver.OnPreDrawListener f121335c;

        /* renamed from: a */
        public void mo168694a() {
            if (this.f121333a.getViewTreeObserver().isAlive()) {
                this.f121333a.getViewTreeObserver().removeOnPreDrawListener(this.f121335c);
            }
            this.f121333a.removeOnAttachStateChangeListener(this.f121334b);
        }

        C48212a(final String str, View view) {
            this.f121333a = view;
            this.f121335c = new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.lark.monitor.p2372a.C48211b.C48212a.ViewTreeObserver$OnPreDrawListenerC482142 */

                public boolean onPreDraw() {
                    C48212a.this.mo168694a();
                    String str = str;
                    if (str == null || !str.equals(C48211b.m190251a().f121329a)) {
                        return true;
                    }
                    C48211b.m190251a().mo168692d();
                    return true;
                }
            };
            view.getViewTreeObserver().addOnPreDrawListener(this.f121335c);
            view.addOnAttachStateChangeListener(this.f121334b);
        }
    }

    /* renamed from: f */
    private void m190254f() {
        C48208a aVar;
        if (f121328d != null && (aVar = this.f121332g) != null) {
            f121328d.mo168771c("ee_lark_android_page_load", aVar.mo168684c());
        }
    }

    /* renamed from: g */
    private static synchronized void m190255g() {
        synchronized (C48211b.class) {
            C48211b bVar = f121326b;
            if (bVar != null) {
                bVar.f121331f = null;
                bVar.f121332g = null;
            }
            f121326b = null;
        }
    }

    /* renamed from: b */
    public void mo168688b() {
        if (!TextUtils.isEmpty(this.f121329a)) {
            this.f121330e = System.nanoTime();
            C3093c cVar = new C3093c(this.f121329a);
            this.f121331f = cVar;
            cVar.mo12970a();
            C48208a aVar = new C48208a();
            this.f121332g = aVar;
            aVar.mo168681a(this.f121329a);
        }
    }

    /* renamed from: a */
    public static void m190253a(AbstractC48230h hVar) {
        if (f121328d == null) {
            f121328d = hVar;
        }
    }

    private C48211b(String str) {
        this.f121329a = str;
    }

    /* renamed from: b */
    public void mo168689b(String str) {
        C3093c cVar = this.f121331f;
        if (cVar != null) {
            cVar.mo12972a(str);
        }
        C48208a aVar = this.f121332g;
        if (aVar != null) {
            aVar.mo168683b(str);
        }
    }

    /* renamed from: c */
    public void mo168691c(String str) {
        C3093c cVar = this.f121331f;
        if (cVar != null) {
            cVar.mo12974b(str);
        }
        C48208a aVar = this.f121332g;
        if (aVar != null) {
            aVar.mo168685c(str);
        }
    }

    /* renamed from: a */
    public static synchronized C48211b m190252a(String str) {
        C48211b bVar;
        synchronized (C48211b.class) {
            C48211b bVar2 = f121326b;
            if (bVar2 == null || !str.equals(bVar2.f121329a)) {
                m190255g();
                f121326b = new C48211b(str);
            }
            bVar = f121326b;
        }
        return bVar;
    }

    /* renamed from: a */
    public void mo168687a(View view) {
        if (view == null) {
            Log.m165398w("PageLoadMonitor", "Trying to monitor a null view", new Exception());
        } else if (!TextUtils.isEmpty(this.f121329a)) {
            new C48212a(this.f121329a, view);
        }
    }

    /* renamed from: a */
    public void mo168686a(int i, long j) {
        C3093c cVar = this.f121331f;
        if (cVar != null) {
            cVar.mo12971a(i, j);
        }
        C48208a aVar = this.f121332g;
        if (aVar != null) {
            aVar.mo168682b();
        }
        if (j == -1 || (System.nanoTime() - this.f121330e) / 1000000 < j) {
            m190254f();
        }
        m190255g();
    }
}
