package pl.droidsonroids.gif;

/* renamed from: pl.droidsonroids.gif.b */
class C70148b {

    /* renamed from: a */
    private volatile boolean f175247a;

    C70148b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo247266a() {
        boolean z = this.f175247a;
        this.f175247a = true;
        if (!z) {
            notify();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo247268b() {
        this.f175247a = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo247269c() throws InterruptedException {
        while (!this.f175247a) {
            wait();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo247267a(boolean z) {
        if (z) {
            mo247266a();
        } else {
            mo247268b();
        }
    }
}
