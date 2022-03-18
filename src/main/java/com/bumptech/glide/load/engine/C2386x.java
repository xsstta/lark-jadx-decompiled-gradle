package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.x */
public class C2386x {

    /* renamed from: a */
    private boolean f7920a;

    /* renamed from: b */
    private final Handler f7921b = new Handler(Looper.getMainLooper(), new C2387a());

    /* renamed from: com.bumptech.glide.load.engine.x$a */
    private static final class C2387a implements Handler.Callback {
        C2387a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((AbstractC2383u) message.obj).mo10880f();
            return true;
        }
    }

    C2386x() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo10894a(AbstractC2383u<?> uVar, boolean z) {
        if (!this.f7920a) {
            if (!z) {
                this.f7920a = true;
                uVar.mo10880f();
                this.f7920a = false;
            }
        }
        this.f7921b.obtainMessage(1, uVar).sendToTarget();
    }
}
