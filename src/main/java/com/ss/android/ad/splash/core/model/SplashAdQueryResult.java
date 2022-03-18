package com.ss.android.ad.splash.core.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class SplashAdQueryResult {

    /* renamed from: a */
    private C27331b f68135a;

    /* renamed from: b */
    private int f68136b;

    /* renamed from: c */
    private long f68137c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface QueryResultCode {
    }

    /* renamed from: a */
    public long mo97428a() {
        return this.f68137c;
    }

    /* renamed from: b */
    public int mo97432b() {
        return this.f68136b;
    }

    /* renamed from: c */
    public C27331b mo97433c() {
        return this.f68135a;
    }

    /* renamed from: a */
    public void mo97429a(int i) {
        this.f68136b = i;
    }

    /* renamed from: a */
    public void mo97430a(long j) {
        this.f68137c = j;
    }

    /* renamed from: a */
    public void mo97431a(C27331b bVar) {
        this.f68135a = bVar;
    }
}
