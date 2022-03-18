package com.bytedance.frameworks.baselib.network.connectionclass;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.c */
public class C13952c {

    /* renamed from: a */
    private final double f36467a;

    /* renamed from: b */
    private final int f36468b;

    /* renamed from: c */
    private double f36469c = -1.0d;

    /* renamed from: d */
    private int f36470d;

    /* renamed from: a */
    public double mo51316a() {
        return this.f36469c;
    }

    public C13952c(double d) {
        int i;
        this.f36467a = d;
        if (d == 0.0d) {
            i = Integer.MAX_VALUE;
        } else {
            i = (int) Math.ceil(1.0d / d);
        }
        this.f36468b = i;
    }

    /* renamed from: a */
    public void mo51317a(double d) {
        double d2 = 1.0d - this.f36467a;
        int i = this.f36470d;
        if (i > this.f36468b) {
            this.f36469c = Math.exp((d2 * Math.log(this.f36469c)) + (this.f36467a * Math.log(d)));
        } else if (i > 0) {
            double d3 = (d2 * ((double) i)) / (((double) i) + 1.0d);
            this.f36469c = Math.exp((d3 * Math.log(this.f36469c)) + ((1.0d - d3) * Math.log(d)));
        } else {
            this.f36469c = d;
        }
        this.f36470d++;
    }
}
