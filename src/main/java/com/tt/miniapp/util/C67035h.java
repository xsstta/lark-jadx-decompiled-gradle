package com.tt.miniapp.util;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.tt.miniapp.util.h */
public class C67035h {

    /* renamed from: a */
    public long f169004a;

    /* renamed from: b */
    public Object f169005b;

    /* renamed from: c */
    public AbstractC67041a f169006c;

    /* renamed from: d */
    private Handler f169007d = new Handler(Looper.getMainLooper());

    /* renamed from: com.tt.miniapp.util.h$a */
    public interface AbstractC67041a {
        /* renamed from: a */
        void mo230394a();
    }

    /* renamed from: a */
    public void mo233142a() {
        this.f169007d.post(new Runnable() {
            /* class com.tt.miniapp.util.C67035h.RunnableC670372 */

            public void run() {
                if (C67035h.this.f169005b != null) {
                    ((CountDownTimer) C67035h.this.f169005b).cancel();
                }
            }
        });
    }

    /* renamed from: b */
    public void mo233145b() {
        this.f169007d.post(new Runnable() {
            /* class com.tt.miniapp.util.C67035h.RunnableC670383 */

            public void run() {
                C67035h hVar = C67035h.this;
                hVar.mo233146b(hVar.f169004a);
                if (C67035h.this.f169005b != null) {
                    ((CountDownTimer) C67035h.this.f169005b).start();
                }
            }
        });
    }

    /* renamed from: c */
    public void mo233147c() {
        this.f169007d.post(new Runnable() {
            /* class com.tt.miniapp.util.C67035h.RunnableC670394 */

            public void run() {
                if (C67035h.this.f169005b != null) {
                    ((CountDownTimer) C67035h.this.f169005b).cancel();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo233144a(AbstractC67041a aVar) {
        this.f169006c = aVar;
    }

    /* renamed from: a */
    public void mo233143a(final long j) {
        this.f169007d.post(new Runnable() {
            /* class com.tt.miniapp.util.C67035h.RunnableC670361 */

            public void run() {
                C67035h.this.mo233146b(j);
                if (C67035h.this.f169005b != null) {
                    ((CountDownTimer) C67035h.this.f169005b).start();
                }
            }
        });
    }

    /* renamed from: b */
    public void mo233146b(long j) {
        this.f169005b = new CountDownTimer(j, 100) {
            /* class com.tt.miniapp.util.C67035h.CountDownTimerC670405 */

            public void onFinish() {
                if (C67035h.this.f169006c != null) {
                    C67035h.this.f169006c.mo230394a();
                }
            }

            public void onTick(long j) {
                C67035h.this.f169004a = j;
            }
        };
    }
}
