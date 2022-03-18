package com.ss.videoarch.liveplayer.p3252c;

import com.ss.videoarch.liveplayer.AbstractC65627d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.ss.videoarch.liveplayer.c.c */
public final class C65623c {

    /* renamed from: a */
    public final AbstractC65627d f165186a;

    /* renamed from: b */
    private final ExecutorService f165187b;

    /* renamed from: c */
    private Future f165188c;

    /* renamed from: a */
    public void mo229641a() {
        Future future = this.f165188c;
        if (future != null && !future.isDone()) {
            this.f165188c.cancel(true);
            this.f165188c = null;
        }
    }

    public C65623c(ExecutorService executorService, AbstractC65627d dVar) {
        this.f165187b = executorService;
        this.f165186a = dVar;
    }
}
