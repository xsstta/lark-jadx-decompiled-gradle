package com.ss.android.appcenter;

import android.content.Context;
import com.ss.android.appcenter.business.activity.appdetail.C27637b;
import com.ss.android.appcenter.business.monitor.statistics.C27709a;
import com.ss.android.appcenter.business.p1265a.C27570c;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.CategoryGroupData;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.AbstractC27551b;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.appcenter.a */
public class C27528a {

    /* renamed from: a */
    private AtomicBoolean f68753a;

    /* renamed from: b */
    private Context f68754b;

    /* renamed from: c */
    private boolean f68755c;

    /* renamed from: d */
    private List<AbstractC27531b> f68756d;

    /* renamed from: e */
    private Object f68757e;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.appcenter.a$a */
    public static class C27530a {

        /* renamed from: a */
        public static final C27528a f68758a = new C27528a();
    }

    /* renamed from: com.ss.android.appcenter.a$b */
    public interface AbstractC27531b {
        /* renamed from: a */
        void mo98150a();
    }

    /* renamed from: c */
    public String mo98145c() {
        return "";
    }

    /* renamed from: a */
    public static C27528a m100471a() {
        return C27530a.f68758a;
    }

    /* renamed from: e */
    public boolean mo98147e() {
        boolean z = this.f68755c;
        if (z) {
            this.f68755c = false;
        }
        return z;
    }

    /* renamed from: g */
    public boolean mo98149g() {
        return this.f68753a.get();
    }

    private C27528a() {
        this.f68753a = new AtomicBoolean(false);
        this.f68755c = false;
        this.f68757e = new Object();
        this.f68756d = new ArrayList();
    }

    /* renamed from: b */
    public Context mo98143b() {
        Context context;
        if (this.f68753a.get()) {
            return this.f68754b;
        }
        C28184h.m103249c("AppCenter", "context not inited");
        synchronized (this) {
            context = this.f68754b;
        }
        return context;
    }

    /* renamed from: f */
    public void mo98148f() {
        if (this.f68753a.get()) {
            C27637b.m100906a().mo98432c();
            C27570c.m100619a();
        }
        synchronized (this.f68757e) {
            this.f68756d.clear();
        }
    }

    /* renamed from: d */
    public void mo98146d() {
        if (this.f68753a.get()) {
            C27637b.m100906a().mo98432c();
            C27570c.m100619a();
            this.f68755c = true;
            CategoryGroupData.f70088a = -1;
        }
        synchronized (this.f68757e) {
            for (AbstractC27531b bVar : this.f68756d) {
                bVar.mo98150a();
            }
        }
    }

    /* renamed from: a */
    public void mo98142a(C28184h.AbstractC28185a aVar) {
        C28184h.m103245a(aVar);
    }

    /* renamed from: a */
    public void mo98141a(AbstractC27531b bVar) {
        synchronized (this.f68757e) {
            this.f68756d.add(bVar);
        }
    }

    /* renamed from: b */
    public void mo98144b(AbstractC27531b bVar) {
        synchronized (this.f68757e) {
            this.f68756d.remove(bVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo98140a(Context context, AbstractC27551b bVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f68753a.get()) {
            this.f68754b = context.getApplicationContext();
            C27548m.m100547m().mo98217a(bVar);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            new C27709a("appcenter_page_spec_init").mo98866a(currentTimeMillis2).mo98868a();
            C28184h.m103250d("AppCenter", "appcenter page spec init duration :" + currentTimeMillis2);
            this.f68753a.set(true);
        }
    }
}
