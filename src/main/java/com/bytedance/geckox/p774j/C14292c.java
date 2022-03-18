package com.bytedance.geckox.p774j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;

/* renamed from: com.bytedance.geckox.j.c */
public class C14292c {

    /* renamed from: c */
    private static C14292c f37556c;

    /* renamed from: a */
    public Handler f37557a;

    /* renamed from: b */
    private HandlerThread f37558b;

    /* renamed from: a */
    public static HandlerThread m57662a(String str, int i) {
        return C20341a.m74147a() ? C20339a.m74145a(str, i, C20341a.f49621b) : new HandlerThread(str, i);
    }

    private C14292c() {
        m57665b();
    }

    /* renamed from: a */
    public static C14292c m57663a() {
        if (f37556c == null) {
            synchronized (C14292c.class) {
                if (f37556c == null) {
                    f37556c = new C14292c();
                }
            }
        }
        return f37556c;
    }

    /* renamed from: b */
    private void m57665b() {
        if (this.f37557a == null || this.f37558b.getLooper() == null) {
            HandlerThread a = m57662a("timer-task", 4);
            this.f37558b = a;
            a.start();
            this.f37557a = new HandlerC14293a(this.f37558b.getLooper());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.geckox.j.c$a */
    public class HandlerC14293a extends Handler {
        public void handleMessage(Message message) {
            AbstractC14289a aVar = (AbstractC14289a) message.obj;
            C14276b.m57604a("gecko-debug-tag", "handler timer task execute", Integer.valueOf(aVar.mo52256a()), Long.valueOf(aVar.f37549b));
            aVar.mo52257b();
            if (aVar.f37549b > 0) {
                Message obtainMessage = C14292c.this.f37557a.obtainMessage(message.what);
                obtainMessage.obj = aVar;
                C14292c.this.f37557a.sendMessageDelayed(obtainMessage, aVar.f37549b);
            }
        }

        public HandlerC14293a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public void mo52259a(AbstractC14289a aVar, long j) {
        if (j >= 0) {
            m57664a(aVar, j, 0);
        }
    }

    /* renamed from: a */
    private void m57664a(AbstractC14289a aVar, long j, long j2) {
        m57665b();
        int a = aVar.mo52256a();
        aVar.f37549b = j2;
        Message obtainMessage = this.f37557a.obtainMessage(a);
        obtainMessage.obj = aVar;
        obtainMessage.what = a;
        this.f37557a.sendMessageDelayed(obtainMessage, j);
    }
}
