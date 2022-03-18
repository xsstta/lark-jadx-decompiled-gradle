package com.bytedance.push.p884f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.f.i */
public final class C20430i implements Handler.Callback {

    /* renamed from: a */
    private final Handler f49924a = new Handler(Looper.getMainLooper(), this);

    /* renamed from: a */
    public void mo68871a() {
        this.f49924a.removeMessages(10101);
    }

    C20430i() {
    }

    public boolean handleMessage(Message message) {
        if (message == null || message.what != 10101 || !(message.obj instanceof Runnable)) {
            return false;
        }
        ((Runnable) message.obj).run();
        return false;
    }

    /* renamed from: a */
    public void mo68872a(long j, Runnable runnable) {
        this.f49924a.sendMessageDelayed(this.f49924a.obtainMessage(10101, runnable), j);
    }
}
