package com.ss.android.lark.monitor;

import androidx.core.util.C0844e;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.monitor.b */
public class C48221b {

    /* renamed from: a */
    public final String f121369a;

    /* renamed from: b */
    public final double f121370b;

    /* renamed from: c */
    public final double f121371c;

    /* renamed from: d */
    public final double f121372d;

    /* renamed from: e */
    public final double f121373e;

    /* renamed from: f */
    public final double f121374f;

    /* renamed from: g */
    public final String f121375g;

    /* renamed from: h */
    public final int f121376h;

    /* renamed from: i */
    public final int f121377i;

    /* renamed from: j */
    public final int f121378j;

    /* renamed from: k */
    public final int f121379k;

    /* renamed from: l */
    public final long f121380l;

    /* renamed from: m */
    public final long f121381m;

    /* renamed from: n */
    public final double f121382n;

    /* renamed from: o */
    public final double f121383o;

    /* renamed from: p */
    public final List<C0844e<String, Double>> f121384p;

    /* renamed from: com.ss.android.lark.monitor.b$a */
    public static final class C48223a {

        /* renamed from: a */
        public String f121385a;

        /* renamed from: b */
        public double f121386b;

        /* renamed from: c */
        public double f121387c;

        /* renamed from: d */
        public double f121388d;

        /* renamed from: e */
        public double f121389e;

        /* renamed from: f */
        public double f121390f;

        /* renamed from: g */
        public double f121391g;

        /* renamed from: h */
        public String f121392h;

        /* renamed from: i */
        public int f121393i;

        /* renamed from: j */
        public int f121394j;

        /* renamed from: k */
        public int f121395k;

        /* renamed from: l */
        public int f121396l;

        /* renamed from: m */
        public double f121397m;

        /* renamed from: n */
        public long f121398n;

        /* renamed from: o */
        public double f121399o;

        /* renamed from: p */
        public final List<C0844e<String, Double>> f121400p;

        /* renamed from: a */
        public double mo168734a() {
            return this.f121397m;
        }

        /* renamed from: b */
        public double mo168740b() {
            return this.f121390f + this.f121391g;
        }

        private C48223a() {
            this.f121400p = new CopyOnWriteArrayList();
        }

        /* renamed from: c */
        public C48221b mo168746c() {
            return new C48221b(this);
        }

        /* renamed from: b */
        public C48223a mo168741b(double d) {
            this.f121387c = d;
            return this;
        }

        /* renamed from: c */
        public C48223a mo168744c(double d) {
            this.f121388d = d;
            return this;
        }

        /* renamed from: d */
        public C48223a mo168747d(double d) {
            this.f121389e = d;
            return this;
        }

        /* renamed from: e */
        public C48223a mo168749e(double d) {
            this.f121397m = d;
            return this;
        }

        /* renamed from: f */
        public C48223a mo168750f(double d) {
            this.f121390f = d;
            return this;
        }

        /* renamed from: g */
        public C48223a mo168751g(double d) {
            this.f121391g = d;
            return this;
        }

        /* renamed from: h */
        public C48223a mo168752h(double d) {
            this.f121399o = d;
            return this;
        }

        /* renamed from: a */
        public C48223a mo168735a(double d) {
            this.f121386b = d;
            return this;
        }

        /* renamed from: c */
        public C48223a mo168745c(int i) {
            this.f121395k = i;
            return this;
        }

        /* renamed from: d */
        public C48223a mo168748d(int i) {
            this.f121396l = i;
            return this;
        }

        /* renamed from: a */
        public C48223a mo168736a(int i) {
            this.f121393i = i;
            return this;
        }

        /* renamed from: b */
        public C48223a mo168742b(int i) {
            this.f121394j = i;
            return this;
        }

        /* renamed from: a */
        public C48223a mo168737a(long j) {
            this.f121398n = j;
            return this;
        }

        /* renamed from: b */
        public C48223a mo168743b(String str) {
            this.f121392h = str;
            return this;
        }

        /* renamed from: a */
        public C48223a mo168738a(String str) {
            this.f121385a = str;
            return this;
        }

        /* renamed from: a */
        public C48223a mo168739a(String str, double d) {
            this.f121400p.add(new C0844e<>(str, Double.valueOf(d)));
            return this;
        }
    }

    /* renamed from: a */
    public static C48223a m190293a() {
        return new C48223a();
    }

    public String toString() {
        return "MetricsPayload{startTime=" + this.f121380l + "endTime=" + this.f121381m + "duration=" + this.f121382n + "cpuTime=" + this.f121374f + "mobileKBTx=" + this.f121372d + ", mobileKBRx=" + this.f121373e + ", wifiKBTx=" + this.f121370b + ", wifiKBRx=" + this.f121371c + '}';
    }

    private C48221b(C48223a aVar) {
        this.f121369a = aVar.f121385a;
        this.f121370b = aVar.f121386b;
        this.f121371c = aVar.f121387c;
        this.f121372d = aVar.f121388d;
        this.f121373e = aVar.f121389e;
        this.f121375g = aVar.f121392h;
        this.f121376h = aVar.f121393i;
        this.f121377i = aVar.f121394j;
        this.f121378j = aVar.f121395k;
        this.f121379k = aVar.f121396l;
        this.f121374f = aVar.f121390f + aVar.f121391g;
        this.f121382n = aVar.f121397m;
        this.f121380l = aVar.f121398n - ((long) (aVar.f121397m * 1000.0d));
        this.f121381m = aVar.f121398n;
        this.f121384p = aVar.f121400p;
        this.f121383o = aVar.f121399o;
    }
}
