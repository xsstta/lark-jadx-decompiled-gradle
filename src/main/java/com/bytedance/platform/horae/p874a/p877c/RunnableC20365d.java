package com.bytedance.platform.horae.p874a.p877c;

import android.app.Application;
import android.os.HandlerThread;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.bytedance.platform.horae.AbstractC20367b;
import com.bytedance.platform.horae.common.Logger;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.platform.horae.a.c.d */
public class RunnableC20365d implements Runnable {

    /* renamed from: c */
    private static final Object f49701c = new Object();

    /* renamed from: i */
    private static RunnableC20365d f49702i;

    /* renamed from: a */
    public HandlerC20364c f49703a;

    /* renamed from: b */
    private Application f49704b;

    /* renamed from: d */
    private List<Message> f49705d = new ArrayList();

    /* renamed from: e */
    private long f49706e;

    /* renamed from: f */
    private boolean f49707f;

    /* renamed from: g */
    private AbstractC20367b f49708g;

    /* renamed from: h */
    private boolean f49709h;

    /* renamed from: j */
    private MessageQueue f49710j;

    /* renamed from: k */
    private Field f49711k;

    /* renamed from: l */
    private Field f49712l;

    /* renamed from: c */
    public AbstractC20367b mo68699c() {
        return this.f49708g;
    }

    private RunnableC20365d() {
    }

    /* renamed from: d */
    private void m74188d() {
        if (this.f49704b == null) {
            throw new RuntimeException("Must call start(Application context) first!!!");
        }
    }

    /* renamed from: b */
    public static RunnableC20365d m74187b() {
        if (f49702i == null) {
            synchronized (RunnableC20365d.class) {
                if (f49702i == null) {
                    f49702i = new RunnableC20365d();
                }
            }
        }
        return f49702i;
    }

    /* renamed from: a */
    public void mo68695a() {
        m74188d();
        synchronized (f49701c) {
            MessageQueue messageQueue = this.f49710j;
            if (messageQueue != null) {
                synchronized (messageQueue) {
                    for (Message message : this.f49705d) {
                        if (message.obj != null && message.arg2 == 9527) {
                            Message obtain = Message.obtain(message);
                            obtain.arg2 = 9528;
                            message.what *= -1;
                            Logger.m74201a("ServiceScheduleManager", "Handle pending message " + obtain.what);
                            C20363b.m74185a(obtain);
                        }
                    }
                }
                this.f49705d.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 249
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.horae.p874a.p877c.RunnableC20365d.run():void");
    }

    /* renamed from: b */
    public void mo68698b(Message message) {
        m74188d();
        synchronized (f49701c) {
            if (!this.f49705d.contains(message)) {
                this.f49705d.add(message);
            }
        }
    }

    /* renamed from: a */
    public void mo68697a(Message message) {
        long j;
        m74188d();
        if (message.arg2 == 9527 || message.arg2 == 9529) {
            Logger.m74201a("ServiceScheduleManager", "Current message " + message.what + " is already followed!");
            return;
        }
        WeakReference weakReference = new WeakReference(message);
        Message obtainMessage = this.f49703a.obtainMessage(100);
        obtainMessage.obj = weakReference;
        message.arg2 = 9527;
        if (SystemClock.uptimeMillis() - message.getWhen() > 1000) {
            Logger.m74201a("ServiceScheduleManager", "Current follow message " + message.what + " is already out of time.");
            j = SystemClock.uptimeMillis();
        } else {
            j = message.getWhen() + 1000;
        }
        long max = Math.max(this.f49706e + 30, j);
        this.f49703a.sendMessageAtTime(obtainMessage, max);
        this.f49706e = max;
        Logger.m74201a("ServiceScheduleManager", "Follow message " + message + " successful. Trigger at time = " + this.f49706e);
    }

    /* renamed from: a */
    public void mo68696a(Application application, String str, AbstractC20367b bVar, boolean z) {
        if (!this.f49707f) {
            this.f49708g = bVar;
            this.f49707f = true;
            this.f49704b = application;
            this.f49709h = z;
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            new C20356a().mo68670a(this.f49704b);
            C20366e.m74194a().mo68702b();
            HandlerC20364c cVar = new HandlerC20364c(handlerThread.getLooper());
            this.f49703a = cVar;
            cVar.postDelayed(this, 2000);
            AbstractC20367b bVar2 = this.f49708g;
            if (bVar2 != null) {
                bVar2.mo68704a();
            }
        }
    }
}
