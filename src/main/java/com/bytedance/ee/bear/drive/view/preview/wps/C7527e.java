package com.bytedance.ee.bear.drive.view.preview.wps;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.drive.view.preview.wps.e */
public class C7527e {

    /* renamed from: a */
    private Runnable f20339a;

    /* renamed from: b */
    private long f20340b;

    /* renamed from: c */
    private PointF f20341c;

    /* renamed from: d */
    private PointF f20342d;

    /* renamed from: e */
    private Runnable f20343e = new Runnable() {
        /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$e$RVzvT1uIlQNcCdEAxtYU6qrwJs */

        public final void run() {
            C7527e.m269503lambda$RVzvT1uIlQNcCdEAxtYU6qrwJs(C7527e.this);
        }
    };

    /* renamed from: f */
    private Handler f20344f = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30141a() {
        Runnable runnable = this.f20339a;
        if (runnable != null) {
            runnable.run();
        }
    }

    C7527e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29403a(Runnable runnable) {
        this.f20339a = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29402a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f20340b = System.currentTimeMillis();
            this.f20341c = new PointF(motionEvent.getX(), motionEvent.getY());
        } else if (action == 1) {
            this.f20342d = new PointF(motionEvent.getX(), motionEvent.getY());
            m30142a(System.currentTimeMillis() - this.f20340b);
        }
    }

    /* renamed from: a */
    private void m30142a(long j) {
        this.f20344f.removeCallbacks(this.f20343e);
        PointF pointF = this.f20341c;
        if (pointF != null && this.f20342d != null) {
            float abs = Math.abs(pointF.x - this.f20342d.x);
            float abs2 = Math.abs(this.f20341c.y - this.f20342d.y);
            if (j <= 150 && Math.max(abs, abs2) <= 10.0f) {
                this.f20344f.postDelayed(this.f20343e, 150);
            }
        }
    }
}
