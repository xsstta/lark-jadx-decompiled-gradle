package com.ss.android.socialbase.downloader.network;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.socialbase.downloader.network.c */
public class C60133c {

    /* renamed from: a */
    private final double f150068a;

    /* renamed from: b */
    private final int f150069b;

    /* renamed from: c */
    private double f150070c = -1.0d;

    /* renamed from: d */
    private int f150071d;

    /* renamed from: a */
    public double mo205446a() {
        return this.f150070c;
    }

    public C60133c(double d) {
        int i;
        this.f150068a = d;
        if (d == 0.0d) {
            i = Integer.MAX_VALUE;
        } else {
            i = (int) Math.ceil(1.0d / d);
        }
        this.f150069b = i;
    }

    /* renamed from: a */
    public void mo205447a(double d) {
        double d2 = 1.0d - this.f150068a;
        int i = this.f150071d;
        if (i > this.f150069b) {
            this.f150070c = Math.exp((d2 * Math.log(this.f150070c)) + (this.f150068a * Math.log(d)));
        } else if (i > 0) {
            double d3 = (d2 * ((double) i)) / (((double) i) + 1.0d);
            this.f150070c = Math.exp((d3 * Math.log(this.f150070c)) + ((1.0d - d3) * Math.log(d)));
        } else {
            this.f150070c = d;
        }
        this.f150071d++;
    }
}
