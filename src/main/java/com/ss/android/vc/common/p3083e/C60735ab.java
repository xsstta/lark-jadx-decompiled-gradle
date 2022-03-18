package com.ss.android.vc.common.p3083e;

import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.vc.common.e.ab */
public class C60735ab {

    /* renamed from: a */
    private static Handler f151930a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static volatile Handler f151931b;

    /* renamed from: com.ss.android.vc.common.e.ab$a */
    public interface AbstractC60737a {
        /* renamed from: a */
        void mo208363a() throws InterruptedException;
    }

    /* renamed from: a */
    public static Handler m235994a() {
        return f151930a;
    }

    /* renamed from: a */
    public static boolean m236005a(boolean z) {
        boolean z2 = Thread.currentThread() == Looper.getMainLooper().getThread();
        if (!z2 && z) {
            C60871a.m236612c("VCThreadUtils", "Not on ui thread.");
        }
        return z2;
    }

    /* renamed from: d */
    public static final Handler m236015d() {
        return CoreThreadPool.getSerialTaskHandler();
    }

    /* renamed from: e */
    public static final Handler m236017e() {
        return CoreThreadPool.getBackgroundHandler();
    }

    /* renamed from: c */
    public static boolean m236014c() {
        return m236005a(true);
    }

    /* renamed from: b */
    public static synchronized Handler m236006b() {
        Handler handler;
        synchronized (C60735ab.class) {
            if (f151931b == null) {
                CoreThreadPool.getDefault();
                f151931b = CoreThreadPool.newThreadHandler("vc_inner_thread");
            }
            handler = f151931b;
        }
        return handler;
    }

    /* renamed from: a */
    public static final Handler m235995a(String str) {
        CoreThreadPool.getDefault();
        return CoreThreadPool.newThreadHandler(str);
    }

    /* renamed from: c */
    public static final void m236013c(Runnable runnable) {
        m236006b().post(runnable);
    }

    /* renamed from: b */
    public static final ScheduledExecutorService m236007b(String str) {
        return CoreThreadPool.getDefault().getSingleScheduledThreadPool(str);
    }

    /* renamed from: d */
    public static final void m236016d(Runnable runnable) {
        m236006b().post(runnable);
    }

    /* renamed from: e */
    public static final void m236018e(Runnable runnable) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(runnable);
    }

    /* renamed from: f */
    public static final void m236019f(Runnable runnable) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(runnable);
    }

    /* renamed from: a */
    public static final <T> Disposable m235996a(AbstractC60728a<T> aVar) {
        return Observable.create(new ObservableOnSubscribe() {
            /* class com.ss.android.vc.common.p3083e.$$Lambda$ab$KpKOcScr4xqZpetISa2CgJ5k5k */

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                AbstractC60728a.this.mo208349a((AbstractC60728a) observableEmitter);
            }
        }).subscribeOn(VCRxSchedulers.f151989a.mo208380a()).observeOn(VCRxSchedulers.f151989a.mo208381b()).subscribe(new Consumer() {
            /* class com.ss.android.vc.common.p3083e.$$Lambda$ab$hHLBc_5KQ9MvGr_vD9PDvOUjbZg */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC60728a.this.mo208350a((AbstractC60728a) obj);
            }
        }, $$Lambda$ab$9CNoPRknrgxZXpLLqsq67Q99h4.INSTANCE, new AbstractC68309a() {
            /* class com.ss.android.vc.common.p3083e.$$Lambda$ab$ZaJr1J73lI9DNBGh6gFGWMnz43I */

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                AbstractC60728a.this.mo208350a((AbstractC60728a) null);
            }
        });
    }

    /* renamed from: a */
    public static void m236000a(AbstractC60737a aVar) {
        boolean z = false;
        while (true) {
            try {
                aVar.mo208363a();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: b */
    public static void m236011b(Runnable runnable) {
        f151930a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public static void m236001a(Runnable runnable) {
        m236002a(runnable, -1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m236003a(Throwable th) {
        C60871a.m236610a("VCThreadUtils", "[assertDebugError]", th);
    }

    /* renamed from: a */
    public static void m236004a(final CountDownLatch countDownLatch) {
        m236000a(new AbstractC60737a() {
            /* class com.ss.android.vc.common.p3083e.C60735ab.C607361 */

            @Override // com.ss.android.vc.common.p3083e.C60735ab.AbstractC60737a
            /* renamed from: a */
            public void mo208363a() throws InterruptedException {
                countDownLatch.await();
            }
        });
    }

    /* renamed from: b */
    public static final ScheduledFuture<?> m236008b(Runnable runnable, long j) {
        return CoreThreadPool.getDefault().getScheduleThreadPool().schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public static void m236002a(Runnable runnable, long j) {
        if (j >= 0 || Looper.getMainLooper() != Looper.myLooper()) {
            f151930a.postDelayed(runnable, j);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static final ScheduledFuture<?> m235997a(Runnable runnable, long j, long j2) {
        return CoreThreadPool.getDefault().getScheduleThreadPool().scheduleAtFixedRate(runnable, j, j2, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public static final ScheduledFuture<?> m236009b(Runnable runnable, long j, long j2) {
        return CoreThreadPool.getDefault().getScheduleThreadPool().scheduleWithFixedDelay(runnable, j, j2, TimeUnit.MILLISECONDS);
    }
}
