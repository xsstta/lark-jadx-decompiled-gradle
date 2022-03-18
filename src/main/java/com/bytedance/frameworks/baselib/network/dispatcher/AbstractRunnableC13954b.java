package com.bytedance.frameworks.baselib.network.dispatcher;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.b */
public abstract class AbstractRunnableC13954b implements IRequest, Comparable<IRequest>, Runnable {

    /* renamed from: a */
    protected final AtomicBoolean f36475a = new AtomicBoolean(false);

    /* renamed from: b */
    protected final AtomicBoolean f36476b = new AtomicBoolean(false);

    /* renamed from: c */
    protected int f36477c = 0;

    /* renamed from: d */
    protected int f36478d;

    /* renamed from: c */
    public boolean mo51325c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo51326d() {
        return false;
    }

    /* renamed from: f */
    public int mo51328f() {
        return this.f36477c;
    }

    /* renamed from: e */
    public boolean mo51327e() {
        return this.f36476b.get();
    }

    /* renamed from: b */
    public AbstractRunnableC13954b mo51322b(int i) {
        this.f36478d = i;
        return this;
    }
}
