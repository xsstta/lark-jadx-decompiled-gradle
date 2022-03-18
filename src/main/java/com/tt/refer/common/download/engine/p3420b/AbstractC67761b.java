package com.tt.refer.common.download.engine.p3420b;

/* renamed from: com.tt.refer.common.download.engine.b.b */
public abstract class AbstractC67761b<T> implements AbstractRunnableC67760a<T> {

    /* renamed from: a */
    private volatile boolean f170647a = true;

    /* renamed from: b */
    private int f170648b;

    /* renamed from: c */
    private int f170649c = 0;

    /* renamed from: d */
    public void mo235169d() {
        this.f170647a = false;
    }

    /* renamed from: b */
    public int mo235167b() {
        return this.f170649c;
    }

    /* renamed from: c */
    public boolean mo235168c() {
        return this.f170647a;
    }

    public final void run() {
        T a = mo235161a();
        if (mo235162a(a)) {
            while (this.f170647a && this.f170649c <= this.f170648b && !mo235164c(a) && this.f170647a) {
                int i = this.f170649c + 1;
                this.f170649c = i;
                if (i > this.f170648b) {
                    break;
                }
                try {
                    int i2 = 0;
                    long max = Math.max(mo235160a((long) mo235167b()), 0L) / 100;
                    while (this.f170647a && ((long) i2) < max) {
                        Thread.sleep(100);
                        i2++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
            if (this.f170647a) {
                mo235165d(a);
            } else {
                mo235166e(a);
            }
        } else if (!this.f170647a) {
            mo235166e(a);
        } else {
            mo235163b(a);
        }
    }

    protected AbstractC67761b(int i) {
        this.f170648b = Math.max(i, 0);
    }
}
