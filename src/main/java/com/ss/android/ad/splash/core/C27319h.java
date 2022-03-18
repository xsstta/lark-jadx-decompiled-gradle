package com.ss.android.ad.splash.core;

import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.C27340h;
import com.ss.android.ad.splash.core.model.C27352r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.h */
public final class C27319h {

    /* renamed from: a */
    private static volatile C27319h f68098a;

    /* renamed from: b */
    private volatile List<C27331b> f68099b;

    /* renamed from: c */
    private volatile List<C27331b> f68100c;

    /* renamed from: d */
    private volatile C27340h f68101d;

    /* renamed from: e */
    private long f68102e = 1800000;

    /* renamed from: f */
    private long f68103f = 300000;

    /* renamed from: g */
    private volatile long f68104g = -1;

    /* renamed from: h */
    private volatile long f68105h = -1;

    /* renamed from: i */
    private boolean f68106i;

    /* renamed from: j */
    private long f68107j;

    /* renamed from: k */
    private int f68108k;

    /* renamed from: l */
    private volatile C27352r f68109l;

    /* renamed from: m */
    private List<String> f68110m = new ArrayList();

    /* renamed from: n */
    private String f68111n = "{}";

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo97388b() {
        return this.f68102e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo97391c() {
        return this.f68103f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo97393d() {
        return this.f68107j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<C27331b> mo97395e() {
        return this.f68099b;
    }

    /* renamed from: f */
    public C27340h mo97397f() {
        return this.f68101d;
    }

    /* renamed from: g */
    public long mo97398g() {
        return this.f68104g;
    }

    /* renamed from: h */
    public long mo97399h() {
        return this.f68105h;
    }

    /* renamed from: i */
    public String mo97400i() {
        return this.f68111n;
    }

    /* renamed from: j */
    public boolean mo97401j() {
        return this.f68106i;
    }

    /* renamed from: k */
    public List<C27331b> mo97402k() {
        return this.f68100c;
    }

    /* renamed from: l */
    public int mo97403l() {
        return this.f68108k;
    }

    /* renamed from: m */
    public C27352r mo97404m() {
        return this.f68109l;
    }

    /* renamed from: n */
    public void mo97405n() {
        this.f68110m.clear();
    }

    private C27319h() {
    }

    /* renamed from: a */
    public static C27319h m99371a() {
        if (f68098a == null) {
            synchronized (C27319h.class) {
                if (f68098a == null) {
                    f68098a = new C27319h();
                }
            }
        }
        return f68098a;
    }

    /* renamed from: o */
    public String mo97406o() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f68110m) {
            sb.append(str);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo97379a(int i) {
        this.f68108k = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo97380a(long j) {
        this.f68102e = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo97389b(long j) {
        this.f68103f = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo97392c(long j) {
        this.f68107j = j;
    }

    /* renamed from: a */
    public void mo97382a(C27340h hVar) {
        this.f68101d = hVar;
    }

    /* renamed from: b */
    public void mo97390b(List<C27331b> list) {
        this.f68100c = list;
    }

    /* renamed from: d */
    public void mo97394d(long j) {
        if (j > 0) {
            this.f68104g = j;
        }
    }

    /* renamed from: e */
    public void mo97396e(long j) {
        if (j > 0) {
            this.f68105h = j;
        }
    }

    /* renamed from: a */
    public void mo97383a(C27352r rVar) {
        this.f68109l = rVar;
    }

    /* renamed from: a */
    public void mo97384a(String str) {
        this.f68111n = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo97386a(List<C27331b> list) {
        this.f68099b = list;
    }

    /* renamed from: a */
    public void mo97387a(boolean z) {
        this.f68106i = z;
    }

    /* renamed from: a */
    public void mo97381a(long j, int i) {
        List<String> list = this.f68110m;
        list.add(j + ":" + i);
    }

    /* renamed from: a */
    public void mo97385a(String str, String str2) {
        C27326k.m99414a().mo97414a(str, str2);
    }
}
