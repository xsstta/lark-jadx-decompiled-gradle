package com.bytedance.ee.bear.middleground.comment.audio;

import android.view.MotionEvent;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.bear.middleground.comment.audio.a */
public abstract class AbstractC9037a implements AbstractC9039c {

    /* renamed from: a */
    public boolean f24361a = true;

    /* renamed from: b */
    public boolean f24362b;

    /* renamed from: c */
    private Disposable f24363c;

    /* renamed from: d */
    private long f24364d;

    /* renamed from: e */
    private Observable<Long> m37586e() {
        return Observable.timer(300, TimeUnit.MILLISECONDS).observeOn(C11678b.m48481e()).doOnComplete(new AbstractC68309a() {
            /* class com.bytedance.ee.bear.middleground.comment.audio.AbstractC9037a.C90381 */

            @Override // io.reactivex.functions.AbstractC68309a
            public void run() throws Exception {
                AbstractC9037a.this.f24361a = false;
                AbstractC9037a.this.f24362b = true;
                AbstractC9037a.this.mo34582c();
            }
        });
    }

    /* renamed from: a */
    public void mo34589a() {
        this.f24362b = false;
        Disposable disposable = this.f24363c;
        if (disposable != null && !disposable.isDisposed()) {
            this.f24363c.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34590a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f24363c = m37586e().subscribe();
            this.f24361a = true;
            this.f24362b = false;
        } else if (action == 1) {
            this.f24362b = false;
            if (this.f24361a) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f24364d > 210) {
                    this.f24364d = currentTimeMillis;
                    mo34581b();
                } else {
                    C13479a.m54775e("AbsMotionCallbackListener", "So fast click , ignored !");
                }
            } else {
                mo34583d();
            }
            mo34589a();
        }
    }
}
