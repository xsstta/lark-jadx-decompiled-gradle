package com.ss.android.vc.p3069b.p3070a;

import com.ss.android.vc.p3069b.p3070a.C60661b;
import java.util.TreeMap;

/* renamed from: com.ss.android.vc.b.a.c */
public class C60665c extends C60661b.AbstractC60662a {

    /* renamed from: a */
    private final C60661b f151730a;

    /* renamed from: b */
    private boolean f151731b;

    /* renamed from: c */
    private long f151732c = -1;

    /* renamed from: d */
    private long f151733d = -1;

    /* renamed from: e */
    private int f151734e;

    /* renamed from: f */
    private int f151735f;

    /* renamed from: g */
    private int f151736g;

    /* renamed from: h */
    private int f151737h;

    /* renamed from: i */
    private boolean f151738i;

    /* renamed from: j */
    private TreeMap<Long, C60666a> f151739j;

    /* renamed from: e */
    public void mo208213e() {
        this.f151731b = true;
    }

    /* renamed from: h */
    public int mo208216h() {
        return this.f151734e - 1;
    }

    /* renamed from: i */
    public int mo208217i() {
        return this.f151737h - 1;
    }

    /* renamed from: c */
    public void mo208211c() {
        this.f151731b = false;
        this.f151730a.mo208205a(this);
    }

    /* renamed from: d */
    public void mo208212d() {
        this.f151739j = new TreeMap<>();
        this.f151738i = true;
        mo208211c();
    }

    /* renamed from: j */
    public int mo208218j() {
        return (int) ((((double) mo208219k()) / 16.9d) + 1.0d);
    }

    /* renamed from: k */
    public int mo208219k() {
        return ((int) (((double) this.f151733d) - ((double) this.f151732c))) / 1000000;
    }

    /* renamed from: f */
    public double mo208214f() {
        if (this.f151733d == this.f151732c) {
            return 0.0d;
        }
        return (((double) mo208216h()) * 1.0E9d) / ((double) (this.f151733d - this.f151732c));
    }

    /* renamed from: g */
    public double mo208215g() {
        if (this.f151733d == this.f151732c) {
            return 0.0d;
        }
        return (((double) mo208217i()) * 1.0E9d) / ((double) (this.f151733d - this.f151732c));
    }

    /* renamed from: l */
    public void mo208220l() {
        this.f151732c = -1;
        this.f151733d = -1;
        this.f151734e = 0;
        this.f151736g = 0;
        this.f151737h = 0;
        this.f151738i = false;
        this.f151739j = null;
    }

    public C60665c(C60661b bVar) {
        this.f151730a = bVar;
    }

    @Override // com.ss.android.vc.p3069b.p3070a.C60661b.AbstractC60662a
    /* renamed from: a */
    public void mo208207a(long j) {
        if (!this.f151731b) {
            if (this.f151732c == -1) {
                this.f151732c = j;
            }
            this.f151733d = j;
            this.f151737h++;
            this.f151734e++;
            int j2 = mo208218j();
            if ((j2 - this.f151735f) - 1 >= 4) {
                this.f151736g++;
            }
            if (this.f151738i) {
                C60660a.m235736a(this.f151739j);
                this.f151739j.put(Long.valueOf(System.currentTimeMillis()), new C60666a(mo208216h(), mo208217i(), j2, this.f151736g, mo208214f(), mo208215g(), mo208219k()));
            }
            this.f151735f = j2;
            this.f151730a.mo208205a(this);
        }
    }

    /* renamed from: com.ss.android.vc.b.a.c$a */
    public static class C60666a {

        /* renamed from: a */
        public final int f151740a;

        /* renamed from: b */
        public final int f151741b;

        /* renamed from: c */
        public final int f151742c;

        /* renamed from: d */
        public final int f151743d;

        /* renamed from: e */
        public final double f151744e;

        /* renamed from: f */
        public final double f151745f;

        /* renamed from: g */
        public final int f151746g;

        public C60666a(int i, int i2, int i3, int i4, double d, double d2, int i5) {
            this.f151740a = i;
            this.f151741b = i2;
            this.f151742c = i3;
            this.f151743d = i4;
            this.f151744e = d;
            this.f151745f = d2;
            this.f151746g = i5;
        }
    }
}
