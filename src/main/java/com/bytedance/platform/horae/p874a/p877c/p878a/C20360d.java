package com.bytedance.platform.horae.p874a.p877c.p878a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.platform.horae.common.C20376g;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.platform.horae.a.c.a.d */
public class C20360d extends AbstractC20357a {

    /* renamed from: c */
    private HandlerC20361a f49696c;

    /* renamed from: d */
    private Method f49697d;

    /* renamed from: a */
    public void mo68689a() {
        this.f49696c = new HandlerC20361a(Looper.getMainLooper());
        mo68690b();
    }

    /* renamed from: b */
    public void mo68690b() {
        Message obtainMessage = this.f49696c.obtainMessage(101);
        if (Build.VERSION.SDK_INT >= 22) {
            obtainMessage.setAsynchronous(true);
        } else {
            if (this.f49697d == null) {
                this.f49697d = C20376g.m74228a((Class<?>) Message.class, "setAsynchronous", Boolean.TYPE);
            }
            try {
                this.f49697d.invoke(obtainMessage, true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.f49696c.sendMessageDelayed(obtainMessage, 3000);
    }

    public C20360d(AbstractC20358b bVar) {
        super("TimerInMessageQueue", bVar);
    }

    /* renamed from: com.bytedance.platform.horae.a.c.a.d$a */
    public class HandlerC20361a extends Handler {
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 101) {
                if (C20360d.this.f49692b != null) {
                    C20360d.this.f49692b.mo68671a(C20360d.this.f49691a);
                }
                C20360d.this.mo68690b();
            }
        }

        public HandlerC20361a(Looper looper) {
            super(looper);
        }
    }
}
