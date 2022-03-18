package com.bytedance.apm6.util.timetask;

/* renamed from: com.bytedance.apm6.util.timetask.a */
public abstract class AbstractRunnableC3362a implements Runnable {

    /* renamed from: a */
    private final long f10652a;

    /* renamed from: b */
    private boolean f10653b;

    /* renamed from: c */
    private long f10654c;

    /* renamed from: a */
    public final long mo13582a() {
        return this.f10652a;
    }

    /* renamed from: b */
    public final boolean mo13583b() {
        return this.f10653b;
    }

    /* renamed from: c */
    public final long mo13584c() {
        return this.f10654c;
    }

    public AbstractRunnableC3362a() {
        this(0);
    }

    public AbstractRunnableC3362a(long j) {
        this(j, 0);
    }

    public AbstractRunnableC3362a(long j, long j2) {
        this.f10652a = j;
        this.f10654c = j2;
        if (j2 > 0) {
            this.f10653b = true;
        }
    }
}
