package com.ss.p3204b;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.b.a */
public class C64196a {

    /* renamed from: a */
    public static AbstractC64198b f162290a;

    /* renamed from: b */
    public static int f162291b;

    /* renamed from: c */
    public static AtomicInteger f162292c = new AtomicInteger(0);

    /* renamed from: d */
    private static HandlerThread f162293d;

    /* renamed from: e */
    private static HandlerC64197a f162294e;

    /* renamed from: a */
    public static HandlerThread m252464a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public static void m252465a() {
        HandlerThread handlerThread = f162293d;
        if (handlerThread != null) {
            handlerThread.quit();
            f162290a.mo12111b();
            f162293d = null;
            f162294e = null;
            f162290a = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.b.a$a */
    public static class HandlerC64197a extends Handler {
        public HandlerC64197a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (C64196a.f162290a != null) {
                int i = message.what;
                Context context = (Context) message.obj;
                if (i == 1) {
                    C64196a.f162290a.mo12110a(C64199c.m252472b(context), -1.0f, -1);
                } else if (i == 2) {
                    C64196a.f162290a.mo12110a(-1.0f, C64199c.m252470a(context), -1);
                } else if (i == 3) {
                    C64196a.f162290a.mo12110a(-1.0f, -1.0f, C64199c.m252473c(context));
                } else if (i == 4) {
                    C64196a.f162290a.mo12110a(C64199c.m252472b(context), C64199c.m252470a(context), -1);
                } else if (i == 5) {
                    try {
                        C64196a.f162290a.mo12110a(C64199c.m252472b(context), C64199c.m252470a(context), C64199c.m252473c(context));
                    } catch (NullPointerException unused) {
                    }
                }
                sendMessageDelayed(obtainMessage(i, context), (long) C64196a.f162291b);
            }
        }
    }

    /* renamed from: a */
    public static void m252466a(Context context, AbstractC64198b bVar, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (f162293d == null) {
                HandlerThread a = m252464a("Thor-Handler-Thread");
                f162293d = a;
                a.start();
                f162294e = new HandlerC64197a(f162293d.getLooper());
                f162290a = bVar;
                bVar.mo12109a();
                f162291b = i2;
            }
            HandlerC64197a aVar = f162294e;
            aVar.sendMessage(aVar.obtainMessage(i, context));
        }
    }
}
