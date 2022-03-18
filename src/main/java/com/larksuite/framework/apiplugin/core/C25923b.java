package com.larksuite.framework.apiplugin.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.ss.android.lark.log.Log;

/* renamed from: com.larksuite.framework.apiplugin.core.b */
public class C25923b implements AbstractC25890a {

    /* renamed from: b */
    private static AbstractC25890a f64221b;

    /* renamed from: a */
    private HandlerC25924a f64222a;

    /* renamed from: a */
    public static HandlerThread m93868a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    private C25923b() {
        if (this.f64222a == null) {
            synchronized (LKEvent.class) {
                if (this.f64222a == null) {
                    HandlerThread a = m93868a("innerDefaultAsyncHandler");
                    a.start();
                    this.f64222a = new HandlerC25924a(a.getLooper());
                }
            }
        }
    }

    /* renamed from: a */
    public static AbstractC25890a m93869a() {
        if (f64221b == null) {
            synchronized (C25923b.class) {
                if (f64221b == null) {
                    f64221b = new C25923b();
                }
            }
        }
        return f64221b;
    }

    /* renamed from: com.larksuite.framework.apiplugin.core.b$a */
    private static class HandlerC25924a extends Handler {
        public HandlerC25924a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100 && message.obj != null) {
                ((Runnable) message.obj).run();
                Log.m165389i("LKDefaultAsyncHandleEve", "success run");
            }
        }
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25890a
    public void executeAsyncApiHandle(String str, Runnable runnable) {
        this.f64222a.obtainMessage(100, runnable).sendToTarget();
    }
}
