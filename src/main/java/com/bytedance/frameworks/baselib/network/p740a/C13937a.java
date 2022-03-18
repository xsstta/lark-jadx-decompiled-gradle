package com.bytedance.frameworks.baselib.network.p740a;

/* renamed from: com.bytedance.frameworks.baselib.network.a.a */
final class C13937a {

    /* renamed from: a */
    private boolean f36434a;

    /* renamed from: b */
    private int f36435b = -1;

    /* renamed from: c */
    private long f36436c = -1;

    /* renamed from: d */
    private long f36437d = -1;

    /* renamed from: c */
    public int mo51291c() {
        return this.f36435b;
    }

    /* renamed from: b */
    public boolean mo51290b() {
        return this.f36434a;
    }

    C13937a() {
    }

    /* renamed from: a */
    public long mo51285a() {
        long j = this.f36436c;
        if (j < 0) {
            return -1;
        }
        long j2 = this.f36437d;
        if (j2 < 0 || j > j2) {
            return -1;
        }
        return j2 - j;
    }

    /* renamed from: a */
    public void mo51286a(int i) {
        this.f36435b = i;
    }

    /* renamed from: b */
    public void mo51289b(long j) {
        this.f36437d = j;
    }

    /* renamed from: a */
    public void mo51287a(long j) {
        this.f36436c = j;
    }

    /* renamed from: a */
    public void mo51288a(boolean z) {
        this.f36434a = z;
    }
}
