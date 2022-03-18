package com.bef.effectsdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.ArrayList;
import java.util.List;

public class MessageCenter {

    /* renamed from: a */
    private static Handler f7184a;

    /* renamed from: b */
    private static HandlerThread f7185b;

    /* renamed from: c */
    private static final Object f7186c = new Object();

    /* renamed from: d */
    private static final List<AbstractC2081a> f7187d = new ArrayList();

    /* renamed from: com.bef.effectsdk.message.MessageCenter$a */
    public interface AbstractC2081a {
        void onMessageReceived(int i, int i2, int i3, String str);
    }

    /* renamed from: a */
    public static HandlerThread m9046a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public static void m9047a() {
        synchronized (f7186c) {
            HandlerThread handlerThread = f7185b;
            if (handlerThread == null || !handlerThread.isAlive() || f7185b.getLooper() == null) {
                HandlerThread a = m9046a("MessageCenter");
                f7185b = a;
                a.start();
                f7184a = new HandlerC2082b(f7185b.getLooper());
            }
        }
    }

    /* renamed from: b */
    public static void m9050b() {
        List<AbstractC2081a> list = f7187d;
        synchronized (list) {
            if (list.isEmpty()) {
                synchronized (f7186c) {
                    Handler handler = f7184a;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        f7184a = null;
                    }
                    HandlerThread handlerThread = f7185b;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        f7185b = null;
                    }
                }
                list.clear();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bef.effectsdk.message.MessageCenter$b */
    public static class HandlerC2082b extends Handler {
        public HandlerC2082b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            MessageCenter.m9048a(message);
        }
    }

    /* renamed from: b */
    public static void m9051b(AbstractC2081a aVar) {
        List<AbstractC2081a> list = f7187d;
        synchronized (list) {
            list.remove(aVar);
            if (list.isEmpty()) {
                m9050b();
            }
        }
    }

    /* renamed from: a */
    public static void m9048a(Message message) {
        List<AbstractC2081a> list = f7187d;
        synchronized (list) {
            for (AbstractC2081a aVar : list) {
                aVar.onMessageReceived(message.what, message.arg1, message.arg2, (String) message.obj);
            }
        }
    }

    /* renamed from: a */
    public static void m9049a(AbstractC2081a aVar) {
        List<AbstractC2081a> list = f7187d;
        synchronized (list) {
            if (list.isEmpty()) {
                m9047a();
            }
            list.add(aVar);
        }
    }

    private static void postMessage(int i, int i2, int i3, String str) {
        synchronized (f7186c) {
            Handler handler = f7184a;
            if (handler != null) {
                Message.obtain(handler, i, i2, i3, str).sendToTarget();
            }
        }
    }
}
