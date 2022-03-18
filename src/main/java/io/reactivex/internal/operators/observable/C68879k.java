package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.util.C68978c;
import io.reactivex.internal.util.C68979d;
import io.reactivex.internal.util.C68981f;

/* renamed from: io.reactivex.internal.operators.observable.k */
public final class C68879k {
    /* renamed from: a */
    public static <T> void m265447a(ObservableSource<? extends T> observableSource) {
        C68979d dVar = new C68979d();
        LambdaObserver lambdaObserver = new LambdaObserver(C68326a.m265193b(), dVar, dVar, C68326a.m265193b());
        observableSource.subscribe(lambdaObserver);
        C68978c.m265551a(dVar, lambdaObserver);
        Throwable th = dVar.f172983a;
        if (th != null) {
            throw C68981f.m265557a(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0017  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void m265449a(io.reactivex.ObservableSource<? extends T> r4, io.reactivex.AbstractC69009q<? super T> r5) {
        /*
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            io.reactivex.internal.observers.BlockingObserver r1 = new io.reactivex.internal.observers.BlockingObserver
            r1.<init>(r0)
            r5.onSubscribe(r1)
            r4.subscribe(r1)
        L_0x0010:
            boolean r2 = r1.isDisposed()
            if (r2 == 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            java.lang.Object r2 = r0.poll()
            if (r2 != 0) goto L_0x002a
            java.lang.Object r2 = r0.take()     // Catch:{ InterruptedException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r4 = move-exception
            r1.dispose()
            r5.onError(r4)
            return
        L_0x002a:
            boolean r3 = r1.isDisposed()
            if (r3 != 0) goto L_0x003a
            java.lang.Object r3 = io.reactivex.internal.observers.BlockingObserver.TERMINATED
            if (r4 == r3) goto L_0x003a
            boolean r2 = io.reactivex.internal.util.NotificationLite.acceptFull(r2, r5)
            if (r2 == 0) goto L_0x0010
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.C68879k.m265449a(io.reactivex.ObservableSource, io.reactivex.q):void");
    }

    /* renamed from: a */
    public static <T> void m265448a(ObservableSource<? extends T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar) {
        C68362b.m265229a((Object) consumer, "onNext is null");
        C68362b.m265229a((Object) consumer2, "onError is null");
        C68362b.m265229a((Object) aVar, "onComplete is null");
        m265449a(observableSource, new LambdaObserver(consumer, consumer2, aVar, C68326a.m265193b()));
    }
}
