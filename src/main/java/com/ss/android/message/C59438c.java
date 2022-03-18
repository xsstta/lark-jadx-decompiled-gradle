package com.ss.android.message;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;

/* renamed from: com.ss.android.message.c */
public class C59438c implements WeakHandler.IHandler {

    /* renamed from: a */
    private static C59438c f147560a;

    /* renamed from: c */
    private static HandlerThread f147561c;

    /* renamed from: d */
    private static boolean f147562d;

    /* renamed from: b */
    private final WeakHandler f147563b;

    /* renamed from: a */
    public static HandlerThread m230747a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    /* renamed from: c */
    public WeakHandler mo202706c() {
        return this.f147563b;
    }

    /* renamed from: b */
    public Looper mo202705b() {
        return f147561c.getLooper();
    }

    private C59438c() {
        if (f147561c == null) {
            HandlerThread a = m230747a("PushThreadHandler");
            f147561c = a;
            a.start();
            f147562d = true;
        }
        this.f147563b = new WeakHandler(f147561c.getLooper(), this);
    }

    /* renamed from: a */
    public static C59438c m230748a() {
        if (f147560a == null) {
            synchronized (C59438c.class) {
                if (f147560a == null) {
                    f147560a = new C59438c();
                }
            }
        }
        return f147560a;
    }

    /* renamed from: a */
    public void mo202703a(Runnable runnable) {
        mo202704a(runnable, 0);
    }

    /* renamed from: a */
    public void mo202704a(Runnable runnable, long j) {
        if (j <= 0) {
            this.f147563b.post(runnable);
        } else {
            this.f147563b.postDelayed(runnable, j);
        }
    }
}
