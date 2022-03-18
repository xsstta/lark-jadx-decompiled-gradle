package com.lynx.react.bridge;

import com.lynx.tasm.behavior.AbstractC26672f;

/* renamed from: com.lynx.react.bridge.f */
public abstract class AbstractRunnableC26522f implements Runnable {

    /* renamed from: a */
    private final AbstractC26672f f65570a;

    /* renamed from: a */
    public abstract void mo93957a();

    public final void run() {
        try {
            mo93957a();
        } catch (RuntimeException e) {
            this.f65570a.mo94207a(e);
        }
    }

    public AbstractRunnableC26522f(AbstractC26672f fVar) {
        this.f65570a = fVar;
    }
}
