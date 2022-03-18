package com.ss.android.lark.mm.net;

import android.os.Looper;
import com.ss.android.lark.mm.net.AbstractRunnableC47072d;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;

/* renamed from: com.ss.android.lark.mm.net.d */
public interface AbstractRunnableC47072d extends Runnable {
    /* renamed from: a */
    void mo165318a(boolean z);

    /* renamed from: com.ss.android.lark.mm.net.d$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(AbstractRunnableC47072d dVar, boolean z) {
            if (z) {
                C45859k.m181685a(new Runnable() {
                    /* class com.ss.android.lark.mm.net.$$Lambda$d$WbOhMJsO5QOINfUKbQPnA_FuXTE */

                    public final void run() {
                        AbstractRunnableC47072d.CC.lambda$WbOhMJsO5QOINfUKbQPnA_FuXTE(AbstractRunnableC47072d.this);
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                C45857i.m181676a(new Runnable() {
                    /* class com.ss.android.lark.mm.net.$$Lambda$d$xe5VBWv1kjWJQfjCdUMt3b35prI */

                    public final void run() {
                        AbstractRunnableC47072d.CC.lambda$xe5VBWv1kjWJQfjCdUMt3b35prI(AbstractRunnableC47072d.this);
                    }
                });
            } else {
                dVar.run();
            }
        }
    }
}
