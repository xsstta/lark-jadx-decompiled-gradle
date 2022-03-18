package com.ss.android.lark.badge.p1387b;

import com.larksuite.framework.utils.RomUtils;

/* renamed from: com.ss.android.lark.badge.b.a */
public class C29426a {

    /* renamed from: a */
    private volatile int f73542a;

    /* renamed from: b */
    private volatile int f73543b;

    /* renamed from: c */
    private boolean f73544c;

    /* renamed from: com.ss.android.lark.badge.b.a$a */
    private static final class C29428a {

        /* renamed from: a */
        public static final C29426a f73545a = new C29426a();
    }

    /* renamed from: a */
    public static C29426a m108335a() {
        return C29428a.f73545a;
    }

    /* renamed from: d */
    public int mo104306d() {
        return this.f73543b;
    }

    /* renamed from: b */
    public void mo104304b() {
        this.f73542a = this.f73543b;
    }

    private C29426a() {
        this.f73542a = -1;
        this.f73544c = RomUtils.m94933a();
    }

    /* renamed from: c */
    public boolean mo104305c() {
        if (this.f73544c || this.f73542a != this.f73543b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo104303a(int i) {
        this.f73543b = i;
    }
}
