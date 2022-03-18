package com.bytedance.bdturing;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bdturing.p207c.C3534c;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;

/* renamed from: com.bytedance.bdturing.l */
public class C3567l {

    /* renamed from: a */
    private HandlerThread f11284a;

    /* renamed from: b */
    private HandlerC3570b f11285b;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.bdturing.l$a */
    public static class C3569a {

        /* renamed from: a */
        public static C3567l f11286a = new C3567l();
    }

    /* renamed from: a */
    public static HandlerThread m15029a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    private C3567l() {
    }

    /* renamed from: a */
    public static C3567l m15030a() {
        return C3569a.f11286a;
    }

    /* renamed from: c */
    public Looper mo14388c() {
        return this.f11284a.getLooper();
    }

    /* renamed from: b */
    public void mo14387b() {
        if (this.f11284a == null) {
            synchronized (C3567l.class) {
                if (this.f11284a == null) {
                    HandlerThread a = m15029a("TuringVerifyThread");
                    this.f11284a = a;
                    a.start();
                    this.f11285b = new HandlerC3570b(this.f11284a.getLooper());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo14386a(Runnable runnable) {
        HandlerC3570b bVar = this.f11285b;
        if (bVar != null) {
            bVar.post(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.bdturing.l$b */
    public class HandlerC3570b extends Handler {
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C3567l.this.mo14385a(message);
            } else if (i == 2) {
                C3558j.m15009a((C3534c) message.obj);
            } else if (i == 3) {
                C3558j.m15007a();
            }
        }

        private HandlerC3570b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public void mo14385a(Message message) {
        if (message.obj != null) {
            ((DialogC3559k) message.obj).mo14371b();
        }
    }

    /* renamed from: a */
    public void mo14383a(int i, Object obj) {
        HandlerC3570b bVar = this.f11285b;
        if (bVar != null) {
            this.f11285b.sendMessage(bVar.obtainMessage(i, obj));
        }
    }

    /* renamed from: a */
    public void mo14384a(int i, Object obj, long j) {
        HandlerC3570b bVar = this.f11285b;
        if (bVar != null) {
            this.f11285b.sendMessageDelayed(bVar.obtainMessage(i, obj), j);
        }
    }
}
