package com.ss.android.lark.mm.utils.p2335a;

import android.text.TextUtils;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.p2288b.C45850b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.mm.utils.a.b */
public final class C47096b {

    /* renamed from: a */
    private List<C47097c> f118599a = new ArrayList();

    /* renamed from: c */
    public synchronized void mo165476c() {
        m186510g("mm_ui_activity_group");
    }

    /* renamed from: d */
    public synchronized void mo165478d() {
        m186508e("mm_ui_activity_group");
    }

    /* renamed from: e */
    public synchronized void mo165480e() {
        m186509f("mm_ui_activity_group");
    }

    /* renamed from: b */
    public synchronized void mo165474b() {
        for (C47097c cVar : this.f118599a) {
            if (cVar.f118605f != null) {
                cVar.f118605f.cancel(true);
                cVar.f118605f = null;
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo165470a() {
        mo165474b();
        this.f118599a.clear();
    }

    /* renamed from: a */
    private void m186505a(C47097c cVar) {
        if (cVar != null && cVar.f118605f != null) {
            cVar.f118605f.cancel(true);
            cVar.f118605f = null;
        }
    }

    /* renamed from: b */
    private void m186507b(C47097c cVar) {
        m186505a(cVar);
        if (cVar != null && cVar.f118605f == null) {
            cVar.f118605f = m186503a(cVar.f118604e, cVar.f118603d, cVar.f118602c);
        }
    }

    /* renamed from: c */
    public synchronized void mo165477c(String str) {
        m186507b(m186511h(str));
    }

    /* renamed from: d */
    public synchronized void mo165479d(String str) {
        C47097c h = m186511h(str);
        if (h != null) {
            h.f118603d = 0;
            m186507b(h);
        }
    }

    /* renamed from: e */
    private synchronized void m186508e(String str) {
        for (C47097c cVar : this.f118599a) {
            if (cVar.f118605f != null && m186506a(cVar, str)) {
                cVar.f118605f.cancel(true);
                cVar.f118605f = null;
            }
        }
    }

    /* renamed from: f */
    private synchronized void m186509f(String str) {
        m186508e(str);
        for (C47097c cVar : this.f118599a) {
            if (cVar.f118605f == null && m186506a(cVar, str)) {
                cVar.f118605f = m186503a(cVar.f118604e, cVar.f118603d, cVar.f118602c);
            }
        }
    }

    /* renamed from: g */
    private synchronized void m186510g(String str) {
        m186508e(str);
        Iterator<C47097c> it = this.f118599a.iterator();
        while (it.hasNext()) {
            if (m186506a(it.next(), str)) {
                it.remove();
            }
        }
    }

    /* renamed from: h */
    private C47097c m186511h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C47097c cVar : this.f118599a) {
            if (str.equals(cVar.f118601b)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public synchronized void mo165475b(String str) {
        m186505a(m186511h(str));
    }

    /* renamed from: a */
    public synchronized boolean mo165471a(String str) {
        C47097c h = m186511h(str);
        if (h == null) {
            return false;
        }
        m186505a(h);
        this.f118599a.remove(h);
        return true;
    }

    /* renamed from: a */
    private boolean m186506a(C47097c cVar, String str) {
        if (cVar == null || !cVar.f118600a.equals(str)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m186504a(AbstractC47095a aVar, String str, int i) {
        if (aVar != null) {
            aVar.mo161113a(str, i);
        }
    }

    /* renamed from: b */
    public synchronized C47096b mo165473b(String str, int i, AbstractC47095a aVar) {
        return mo165472b(str, 0, i, aVar);
    }

    /* renamed from: a */
    private ScheduledFuture m186503a(Runnable runnable, int i, int i2) {
        return C45899c.m181859a().getThreadDepend().mo144602c().scheduleAtFixedRate(runnable, (long) i, (long) i2, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public synchronized C47096b mo165468a(String str, int i, AbstractC47095a aVar) {
        return mo165469a("", str, 0, i, aVar);
    }

    /* renamed from: b */
    public synchronized C47096b mo165472b(String str, int i, int i2, AbstractC47095a aVar) {
        return mo165469a("mm_ui_activity_group", str, i, i2, aVar);
    }

    /* renamed from: a */
    public synchronized C47096b mo165467a(String str, int i, int i2, AbstractC47095a aVar) {
        return mo165469a("", str, i, i2, aVar);
    }

    /* renamed from: a */
    public synchronized C47096b mo165469a(String str, String str2, int i, int i2, AbstractC47095a aVar) {
        if (TextUtils.isEmpty(str2) || i2 <= 0) {
            throw new IllegalArgumentException("taskName null or peroid <= 0");
        }
        if (mo165471a(str2) && C45850b.m181645a()) {
            if (m186511h(str2) != null) {
                throw new IllegalArgumentException("task is already exist");
            }
        }
        this.f118599a.add(new C47097c(str, str2, i, i2, new Runnable(str2, i2) {
            /* class com.ss.android.lark.mm.utils.p2335a.$$Lambda$b$aD4LQTOIETgcNa8ctLefMYW3WKM */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C47096b.m186504a(AbstractC47095a.this, this.f$1, this.f$2);
            }
        }));
        return this;
    }
}
