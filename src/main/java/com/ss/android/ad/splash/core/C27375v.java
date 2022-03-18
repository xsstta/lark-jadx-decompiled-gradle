package com.ss.android.ad.splash.core;

import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.C27342j;
import com.ss.android.ad.splash.core.model.C27351q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;

/* renamed from: com.ss.android.ad.splash.core.v */
public class C27375v {

    /* renamed from: a */
    private static volatile C27375v f68370a;

    /* renamed from: b */
    private static volatile boolean f68371b;

    /* renamed from: c */
    private volatile C27351q f68372c;

    /* renamed from: d */
    private int f68373d;

    /* renamed from: e */
    private volatile boolean f68374e;

    /* renamed from: f */
    private volatile int f68375f;

    /* renamed from: g */
    private AtomicInteger f68376g;

    /* renamed from: h */
    private AtomicInteger f68377h;

    /* renamed from: i */
    private int f68378i;

    /* renamed from: j */
    private final List<Map<String, String>> f68379j;

    /* renamed from: k */
    private volatile long f68380k;

    /* renamed from: l */
    private long f68381l;

    /* renamed from: m */
    private boolean f68382m;

    /* renamed from: n */
    private boolean f68383n;

    /* renamed from: o */
    private boolean f68384o;

    /* renamed from: m */
    private void m99839m() {
        this.f68382m = true;
    }

    /* renamed from: k */
    private boolean m99837k() {
        return this.f68383n;
    }

    /* renamed from: l */
    private boolean m99838l() {
        return f68371b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo97749f() {
        return this.f68382m;
    }

    /* renamed from: g */
    public int mo97750g() {
        return this.f68375f;
    }

    /* renamed from: i */
    public long mo97752i() {
        return this.f68380k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo97753j() {
        this.f68374e = true;
        this.f68372c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C27342j> mo97745b() {
        if (!mo97747d()) {
            return null;
        }
        return this.f68372c.mo97586b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public LinkedHashMap<Long, String> mo97746c() {
        if (!mo97748e()) {
            return null;
        }
        return this.f68372c.mo97588c();
    }

    /* renamed from: h */
    public long mo97751h() {
        if (this.f68384o) {
            return -1;
        }
        return this.f68381l;
    }

    /* renamed from: a */
    public static C27375v m99833a() {
        if (f68370a == null) {
            synchronized (C27375v.class) {
                if (f68370a == null) {
                    f68370a = new C27375v();
                }
            }
        }
        return f68370a;
    }

    /* renamed from: p */
    private void m99842p() {
        if (this.f68372c != null) {
            m99835a(false, this.f68372c.mo97589d());
            for (int i = 2; i >= 0; i--) {
                m99834a(this.f68373d & (1 << i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo97747d() {
        if ((!(!this.f68374e) || !m99838l()) || this.f68372c == null || this.f68372c.mo97586b() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo97748e() {
        if ((!(!this.f68374e) || !m99838l()) || this.f68372c == null || this.f68372c.mo97588c() == null) {
            return false;
        }
        return true;
    }

    private C27375v() {
        this.f68375f = -1;
        this.f68376g = new AtomicInteger();
        this.f68377h = new AtomicInteger();
        this.f68378i = 0;
        this.f68379j = Collections.synchronizedList(new ArrayList());
        this.f68380k = 0;
        this.f68381l = -1;
        this.f68382m = false;
        this.f68383n = false;
        this.f68384o = false;
        this.f68372c = null;
        this.f68383n = false;
        this.f68373d = 0;
        this.f68382m = false;
        this.f68374e = false;
    }

    /* renamed from: n */
    private void m99840n() {
        if (!(this.f68372c == null || this.f68372c.mo97583a() == null || this.f68372c.mo97583a().size() <= 0)) {
            for (Long l : this.f68372c.mo97583a()) {
                C27325j.m99410a().mo97413a(l.longValue());
            }
        }
    }

    /* renamed from: o */
    private void m99841o() {
        try {
            JSONArray jSONArray = new JSONArray();
            C27368t.m99732a().mo97660c(jSONArray.toString()).mo97681l();
            C27368t.m99732a().mo97656b(jSONArray.toString()).mo97681l();
            C27319h.m99371a().mo97386a((List<C27331b>) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m99836b(C27351q qVar) {
        this.f68372c = qVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo97744a(boolean z) {
        this.f68384o = z;
    }

    /* renamed from: a */
    public void mo97743a(C27351q qVar) {
        m99836b(qVar);
        f68371b = true;
        m99842p();
    }

    /* renamed from: a */
    private void m99834a(int i) {
        if (i == 1) {
            m99840n();
        } else if (i == 2) {
            m99841o();
        } else if (i == 4) {
            m99839m();
            m99841o();
        }
    }

    /* renamed from: a */
    private void m99835a(boolean z, int i) {
        if (z) {
            this.f68373d = i;
            this.f68383n = true;
        } else if (!m99837k()) {
            this.f68373d = i;
            this.f68383n = false;
        }
    }
}
