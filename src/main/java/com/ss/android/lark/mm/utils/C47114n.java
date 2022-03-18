package com.ss.android.lark.mm.utils;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.location.LocationRequest;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.mm.utils.n */
public class C47114n {

    /* renamed from: a */
    private int f118649a;

    /* renamed from: b */
    private Handler f118650b;

    /* renamed from: c */
    private volatile Runnable f118651c;

    /* renamed from: d */
    private AtomicBoolean f118652d;

    public C47114n() {
        this(LocationRequest.PRIORITY_HD_ACCURACY);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m186578a() {
        this.f118652d.set(false);
        Runnable runnable = this.f118651c;
        this.f118651c = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    public C47114n(int i) {
        this.f118652d = new AtomicBoolean(false);
        this.f118649a = i;
        this.f118650b = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public void mo165502a(Runnable runnable) {
        this.f118651c = runnable;
        if (this.f118652d.compareAndSet(false, true)) {
            this.f118650b.postDelayed(new Runnable() {
                /* class com.ss.android.lark.mm.utils.$$Lambda$n$42_rkU582G_btrjKWooGWHBJA */

                public final void run() {
                    C47114n.this.m186578a();
                }
            }, (long) this.f118649a);
        }
    }
}
