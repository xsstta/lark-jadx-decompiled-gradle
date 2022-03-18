package com.ss.android.ugc.p3041a;

/* renamed from: com.ss.android.ugc.a.c */
public class C60450c implements Comparable<C60450c> {

    /* renamed from: a */
    public static boolean f151043a = true;

    /* renamed from: b */
    double f151044b;

    /* renamed from: c */
    double f151045c;

    /* renamed from: d */
    long f151046d;

    /* renamed from: e */
    long f151047e;

    public String toString() {
        return "SpeedRecord{mSpeed=" + this.f151044b + ", mWeight=" + this.f151045c + ", mCostTime=" + this.f151046d + ", currentTime=" + this.f151047e + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo206941a(double d) {
        this.f151044b = d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo206943b(double d) {
        this.f151045c = d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo206942a(long j) {
        this.f151046d = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo206944b(long j) {
        this.f151047e = j;
    }

    /* renamed from: a */
    public int compareTo(C60450c cVar) {
        double d = this.f151044b;
        double d2 = cVar.f151044b;
        if (d == d2) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        return 1;
    }

    public C60450c(double d, double d2, long j, long j2) {
        this.f151044b = d;
        this.f151045c = d2;
        this.f151046d = j;
        this.f151047e = j2;
        if (!f151043a) {
            return;
        }
        if (d < 0.0d || d2 < 0.0d) {
            throw new IllegalArgumentException(toString());
        }
    }
}
