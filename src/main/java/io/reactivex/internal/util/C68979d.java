package io.reactivex.internal.util;

import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import java.util.concurrent.CountDownLatch;

/* renamed from: io.reactivex.internal.util.d */
public final class C68979d extends CountDownLatch implements Consumer<Throwable>, AbstractC68309a {

    /* renamed from: a */
    public Throwable f172983a;

    @Override // io.reactivex.functions.AbstractC68309a
    public void run() {
        countDown();
    }

    public C68979d() {
        super(1);
    }

    /* renamed from: a */
    public void accept(Throwable th) {
        this.f172983a = th;
        countDown();
    }
}
