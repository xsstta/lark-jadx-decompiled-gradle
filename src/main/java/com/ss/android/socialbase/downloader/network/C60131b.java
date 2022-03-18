package com.ss.android.socialbase.downloader.network;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.socialbase.downloader.network.b */
public class C60131b {

    /* renamed from: a */
    private static final String f150060a = "b";

    /* renamed from: f */
    private static long f150061f = -1;

    /* renamed from: g */
    private static volatile C60131b f150062g;

    /* renamed from: b */
    private final C60139i f150063b = C60139i.m233697a();

    /* renamed from: c */
    private final AtomicInteger f150064c = new AtomicInteger();

    /* renamed from: d */
    private final HandlerC60132a f150065d;

    /* renamed from: e */
    private long f150066e;

    /* renamed from: a */
    public static HandlerThread m233678a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.socialbase.downloader.network.b$a */
    public class HandlerC60132a extends Handler {
        /* renamed from: a */
        public void mo205443a() {
            sendEmptyMessage(1);
        }

        /* renamed from: b */
        public void mo205444b() {
            removeMessages(1);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C60131b.this.mo205441e();
                sendEmptyMessageDelayed(1, 1000);
            }
        }

        public HandlerC60132a(Looper looper) {
            super(looper);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo205442f() {
        mo205441e();
        f150061f = -1;
    }

    /* renamed from: d */
    public static long m233680d() {
        return TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
    }

    /* renamed from: c */
    public void mo205440c() {
        try {
            if (this.f150064c.decrementAndGet() == 0) {
                if (C59990a.m232836a()) {
                    C59990a.m232838b(f150060a, "stopSampling");
                }
                this.f150065d.mo205444b();
                mo205442f();
            }
        } catch (Throwable unused) {
        }
    }

    private C60131b() {
        HandlerThread a = m233678a("ParseThread");
        a.start();
        this.f150065d = new HandlerC60132a(a.getLooper());
    }

    /* renamed from: a */
    public static C60131b m233679a() {
        if (f150062g == null) {
            synchronized (C60131b.class) {
                if (f150062g == null) {
                    f150062g = new C60131b();
                }
            }
        }
        return f150062g;
    }

    /* renamed from: b */
    public void mo205439b() {
        try {
            if (this.f150064c.getAndIncrement() == 0) {
                if (C59990a.m232836a()) {
                    C59990a.m232838b(f150060a, "startSampling");
                }
                this.f150065d.mo205443a();
                this.f150066e = SystemClock.uptimeMillis();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo205441e() {
        long j;
        try {
            if (C60161d.m233772a(C60046b.m232945G())) {
                j = m233680d();
            } else {
                j = TrafficStats.getMobileRxBytes();
            }
            long j2 = f150061f;
            long j3 = j - j2;
            if (j2 >= 0) {
                synchronized (this) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f150063b.mo205448a(j3, uptimeMillis - this.f150066e);
                    this.f150066e = uptimeMillis;
                }
            }
            f150061f = j;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
