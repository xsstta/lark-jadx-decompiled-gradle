package com.bytedance.apm.battery.p132c;

import com.bytedance.apm.battery.p131b.C2803a;
import com.bytedance.apm.battery.p132c.p133a.AbstractC2814b;
import com.bytedance.apm.p137c.C2878a;
import com.bytedance.apm.p153n.C3047b;

/* renamed from: com.bytedance.apm.battery.c.a */
public abstract class AbstractC2811a<T extends AbstractC2814b> extends AbstractC2818c<T> implements AbstractC2823h {

    /* renamed from: d */
    private volatile int f8992d;

    /* renamed from: e */
    private long f8993e;

    /* renamed from: f */
    private int f8994f;

    /* renamed from: g */
    private long f8995g;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo12163a(double d, double d2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12165a(T t, long j);

    @Override // com.bytedance.apm.battery.p132c.AbstractC2818c, com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: b */
    public void mo12167b() {
        if (this.f8992d > 0 && this.f8995g > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            m11885a(currentTimeMillis - this.f8995g, this.f9014b);
            this.f8995g = currentTimeMillis;
        }
        super.mo12167b();
    }

    @Override // com.bytedance.apm.battery.p132c.AbstractC2818c, com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: c */
    public void mo12168c() {
        if (this.f8992d > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            m11885a(currentTimeMillis - this.f8995g, this.f9014b);
            this.f8995g = currentTimeMillis;
        }
        super.mo12168c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo12169d() {
        this.f8992d++;
        if (this.f8992d == 1) {
            this.f8995g = System.currentTimeMillis();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo12170e() {
        this.f8992d--;
        if (this.f8992d == 0) {
            m11885a(System.currentTimeMillis() - this.f8995g, this.f9014b);
            this.f8995g = -1;
        }
    }

    AbstractC2811a(String str) {
        super(str);
    }

    /* renamed from: a */
    private void m11885a(final long j, final boolean z) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.battery.p132c.AbstractC2811a.RunnableC28121 */

            public void run() {
                C2803a.m11844a().mo12133a(new C2878a(z, System.currentTimeMillis(), AbstractC2811a.this.mo12185f(), j));
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p132c.AbstractC2818c
    /* renamed from: a */
    public void mo12164a(long j, long j2) {
        this.f8994f = 0;
        this.f8993e = 0;
        if (this.f8992d > 0 && this.f8995g > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            m11885a(currentTimeMillis - this.f8995g, this.f9014b);
            this.f8995g = currentTimeMillis;
        }
        super.mo12164a(j, j2);
        long currentTimeMillis2 = System.currentTimeMillis();
        mo12163a((((double) this.f8993e) / ((double) (currentTimeMillis2 - this.f9013a))) * 60000.0d * 10.0d, (((double) this.f8994f) / ((double) (currentTimeMillis2 - this.f9013a))) * 60000.0d * 10.0d);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p132c.AbstractC2818c
    /* renamed from: a */
    public void mo12166a(T t, long j, long j2) {
        this.f8994f++;
        long j3 = t.f9002d;
        if (j3 >= j) {
            j = j3;
        }
        long j4 = t.f9003e;
        if (j4 > 0 && j2 >= j4) {
            j2 = j4;
        }
        mo12165a(t, j2 - t.f9002d);
        long j5 = j2 - j;
        if (j5 > 0) {
            this.f8993e += j5;
        }
    }
}
