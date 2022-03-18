package com.bytedance.platform.horae.p874a.p875a;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.bytedance.platform.horae.AbstractC20367b;
import com.bytedance.platform.horae.common.C20371b;
import com.bytedance.platform.horae.common.Logger;
import com.bytedance.platform.horae.p874a.p876b.C20354a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.bytedance.platform.horae.a.a.c */
public class RunnableC20349c implements Runnable {

    /* renamed from: g */
    private static RunnableC20349c f49656g;

    /* renamed from: a */
    public Handler f49657a;

    /* renamed from: b */
    public AbstractC20367b f49658b;

    /* renamed from: c */
    private Application f49659c;

    /* renamed from: d */
    private boolean f49660d;

    /* renamed from: e */
    private Looper f49661e;

    /* renamed from: f */
    private boolean f49662f;

    /* renamed from: h */
    private MessageQueue f49663h;

    /* renamed from: i */
    private Field f49664i;

    /* renamed from: j */
    private Field f49665j;

    private RunnableC20349c() {
    }

    /* renamed from: b */
    public AbstractC20367b mo68656b() {
        return this.f49658b;
    }

    /* renamed from: a */
    public static RunnableC20349c m74162a() {
        if (f49656g == null) {
            synchronized (RunnableC20349c.class) {
                if (f49656g == null) {
                    f49656g = new RunnableC20349c();
                }
            }
        }
        return f49656g;
    }

    public void run() {
        long j;
        Exception e;
        int i;
        long j2;
        Logger.m74201a("ServiceScheduleManager", "Enter loop()!!! is sync = ");
        if (this.f49663h == null || this.f49664i == null || this.f49665j == null) {
            try {
                this.f49663h = (MessageQueue) C20371b.m74215a(Looper.class, "mQueue").get(Looper.getMainLooper());
                this.f49665j = C20371b.m74215a(MessageQueue.class, "mMessages");
                this.f49664i = C20371b.m74215a(Message.class, "next");
            } catch (Exception unused) {
                Logger.m74201a("ServiceScheduleManager", "Hook fail, stop loop()");
                return;
            }
        }
        if (this.f49662f) {
            C20354a.m74172a().mo68667b();
        }
        Message message = null;
        long j3 = 2000;
        try {
            synchronized (this.f49663h) {
                Message message2 = (Message) this.f49665j.get(this.f49663h);
                if (message2 == null || !this.f49662f) {
                    i = -1;
                } else {
                    i = C20354a.m74172a().mo68666a(new WeakReference<>(message2));
                }
                while (message2 != null) {
                    if (C20346a.m74158b(message2)) {
                        Message obtain = Message.obtain(message2);
                        message2.what *= -1;
                        Message obtain2 = Message.obtain(this.f49657a);
                        obtain2.obj = obtain;
                        this.f49657a.sendMessageAtTime(obtain2, message2.getWhen());
                        message = message2;
                    }
                    message2 = (Message) this.f49664i.get(message2);
                }
            }
            if (i != -1) {
                Logger.m74204a(true, "tt_removeBarrier", "remove last barrier token:" + i);
            }
            if (message != null) {
                j2 = message.getWhen() - SystemClock.uptimeMillis();
                if (j2 < 0) {
                    try {
                        Logger.m74201a("ServiceScheduleManager", "The last follow message is out of time ,It's dangerous now!");
                    } catch (Exception e2) {
                        e = e2;
                        j3 = j2;
                        Logger.m74201a("ServiceScheduleManager", "Something is wrong here " + e.toString());
                        j = j3;
                        this.f49657a.postDelayed(this, j);
                    }
                }
            } else {
                j2 = 2000;
            }
            j = Math.max(j2, 2000L);
        } catch (Exception e3) {
            e = e3;
            Logger.m74201a("ServiceScheduleManager", "Something is wrong here " + e.toString());
            j = j3;
            this.f49657a.postDelayed(this, j);
        }
        this.f49657a.postDelayed(this, j);
    }

    /* renamed from: a */
    public void mo68655a(Message message) {
        Message obtain = Message.obtain(message);
        Message obtain2 = Message.obtain(this.f49657a);
        obtain2.obj = obtain;
        this.f49657a.sendMessageAtTime(obtain2, message.getWhen());
    }

    /* renamed from: a */
    public void mo68654a(Application application, String str, AbstractC20367b bVar, boolean z) {
        if (!this.f49660d) {
            this.f49658b = bVar;
            this.f49660d = true;
            this.f49659c = application;
            this.f49662f = z;
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            C20352d.m74166a().mo68661b();
            this.f49661e = handlerThread.getLooper();
            this.f49657a = new HandlerC20347b(this.f49661e);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f49657a.post(new Runnable() {
                /* class com.bytedance.platform.horae.p874a.p875a.RunnableC20349c.RunnableC203501 */

                public void run() {
                    try {
                        Logger.m74201a("AsyncServiceScheduleManager", "start await!");
                        countDownLatch.await();
                        if (RunnableC20349c.this.f49658b != null) {
                            RunnableC20349c.this.f49658b.mo68705a(0);
                        }
                        Logger.m74201a("AsyncServiceScheduleManager", "end await!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() {
                /* class com.bytedance.platform.horae.p874a.p875a.RunnableC20349c.RunnableC203512 */

                public void run() {
                    countDownLatch.countDown();
                    Logger.m74201a("AsyncServiceScheduleManager", "UI thread execute countDown!");
                }
            });
            this.f49657a.postDelayed(this, 2000);
            AbstractC20367b bVar2 = this.f49658b;
            if (bVar2 != null) {
                bVar2.mo68704a();
            }
        }
    }
}
