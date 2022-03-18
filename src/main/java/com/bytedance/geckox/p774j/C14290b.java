package com.bytedance.geckox.p774j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;

/* renamed from: com.bytedance.geckox.j.b */
public class C14290b {

    /* renamed from: a */
    public Handler f37551a;

    /* renamed from: b */
    private HandlerThread f37552b;

    /* renamed from: c */
    private final String f37553c;

    /* renamed from: d */
    private final int f37554d;

    /* renamed from: a */
    public static HandlerThread m57660a(String str, int i) {
        return C20341a.m74147a() ? C20339a.m74145a(str, i, C20341a.f49621b) : new HandlerThread(str, i);
    }

    /* renamed from: a */
    private void m57661a() {
        if (this.f37551a == null || this.f37552b.getLooper() == null) {
            HandlerThread a = m57660a(this.f37553c, this.f37554d);
            this.f37552b = a;
            a.start();
            this.f37551a = new HandlerC14291a(this.f37552b.getLooper());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.geckox.j.b$a */
    public class HandlerC14291a extends Handler {
        public void handleMessage(Message message) {
            AbstractC14289a aVar = (AbstractC14289a) message.obj;
            C14276b.m57604a("gecko-debug-tag", "handler timer task execute", Integer.valueOf(aVar.mo52256a()), Long.valueOf(aVar.f37549b));
            aVar.mo52257b();
            if (aVar.f37549b > 0) {
                Message obtainMessage = C14290b.this.f37551a.obtainMessage(message.what);
                obtainMessage.obj = aVar;
                C14290b.this.f37551a.sendMessageDelayed(obtainMessage, aVar.f37549b);
            }
        }

        public HandlerC14291a(Looper looper) {
            super(looper);
        }
    }

    public C14290b(String str, int i) {
        this.f37553c = str;
        this.f37554d = i;
        m57661a();
    }
}
