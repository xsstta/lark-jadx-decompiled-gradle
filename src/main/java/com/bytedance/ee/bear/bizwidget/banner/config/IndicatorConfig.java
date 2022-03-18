package com.bytedance.ee.bear.bizwidget.banner.config;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class IndicatorConfig {

    /* renamed from: a */
    private int f14323a;

    /* renamed from: b */
    private int f14324b;

    /* renamed from: c */
    private int f14325c = 1;

    /* renamed from: d */
    private int f14326d = C4873a.f14341c;

    /* renamed from: e */
    private int f14327e = C4873a.f14339a;

    /* renamed from: f */
    private int f14328f = C4873a.f14340b;

    /* renamed from: g */
    private int f14329g = -1996488705;

    /* renamed from: h */
    private int f14330h = 16777215;

    /* renamed from: i */
    private int f14331i = C4873a.f14344f;

    /* renamed from: j */
    private int f14332j = C4873a.f14343e;

    /* renamed from: k */
    private C4872a f14333k;

    /* renamed from: l */
    private boolean f14334l = true;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Direction {
    }

    /* renamed from: b */
    public int mo19098b() {
        return this.f14323a;
    }

    /* renamed from: c */
    public int mo19100c() {
        return this.f14329g;
    }

    /* renamed from: d */
    public int mo19102d() {
        return this.f14330h;
    }

    /* renamed from: e */
    public int mo19104e() {
        return this.f14326d;
    }

    /* renamed from: f */
    public int mo19106f() {
        return this.f14324b;
    }

    /* renamed from: g */
    public int mo19108g() {
        return this.f14327e;
    }

    /* renamed from: h */
    public int mo19110h() {
        return this.f14328f;
    }

    /* renamed from: i */
    public int mo19112i() {
        return this.f14325c;
    }

    /* renamed from: k */
    public int mo19116k() {
        return this.f14331i;
    }

    /* renamed from: l */
    public int mo19117l() {
        return this.f14332j;
    }

    /* renamed from: com.bytedance.ee.bear.bizwidget.banner.config.IndicatorConfig$a */
    public static class C4872a {

        /* renamed from: a */
        public int f14335a;

        /* renamed from: b */
        public int f14336b;

        /* renamed from: c */
        public int f14337c;

        /* renamed from: d */
        public int f14338d;

        public C4872a() {
            this(C4873a.f14342d);
        }

        public C4872a(int i) {
            this(i, i, i, i);
        }

        public C4872a(int i, int i2, int i3, int i4) {
            this.f14335a = i;
            this.f14336b = i2;
            this.f14337c = i3;
            this.f14338d = i4;
        }
    }

    /* renamed from: j */
    public boolean mo19115j() {
        return this.f14334l;
    }

    /* renamed from: a */
    public C4872a mo19094a() {
        if (this.f14333k == null) {
            mo19096a(new C4872a());
        }
        return this.f14333k;
    }

    /* renamed from: a */
    public IndicatorConfig mo19095a(int i) {
        this.f14323a = i;
        return this;
    }

    /* renamed from: j */
    public IndicatorConfig mo19114j(int i) {
        this.f14332j = i;
        return this;
    }

    /* renamed from: a */
    public IndicatorConfig mo19096a(C4872a aVar) {
        this.f14333k = aVar;
        return this;
    }

    /* renamed from: b */
    public IndicatorConfig mo19099b(int i) {
        this.f14329g = i;
        return this;
    }

    /* renamed from: c */
    public IndicatorConfig mo19101c(int i) {
        this.f14330h = i;
        return this;
    }

    /* renamed from: d */
    public IndicatorConfig mo19103d(int i) {
        this.f14326d = i;
        return this;
    }

    /* renamed from: e */
    public IndicatorConfig mo19105e(int i) {
        this.f14324b = i;
        return this;
    }

    /* renamed from: f */
    public IndicatorConfig mo19107f(int i) {
        this.f14327e = i;
        return this;
    }

    /* renamed from: g */
    public IndicatorConfig mo19109g(int i) {
        this.f14328f = i;
        return this;
    }

    /* renamed from: h */
    public IndicatorConfig mo19111h(int i) {
        this.f14325c = i;
        return this;
    }

    /* renamed from: i */
    public IndicatorConfig mo19113i(int i) {
        this.f14331i = i;
        return this;
    }

    /* renamed from: a */
    public IndicatorConfig mo19097a(boolean z) {
        this.f14334l = z;
        return this;
    }
}
