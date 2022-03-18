package com.ss.android.medialib.p2998a;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.vesdk.C63929ab;
import org.p3508c.p3509a.AbstractC70000a;

/* renamed from: com.ss.android.medialib.a.b */
public class C59373b {

    /* renamed from: b */
    private static final String f147404b = "b";

    /* renamed from: a */
    public AbstractC70000a f147405a;

    /* renamed from: c */
    private HandlerThread f147406c;

    /* renamed from: d */
    private Handler f147407d;

    /* renamed from: e */
    private boolean f147408e;

    /* renamed from: a */
    public static HandlerThread m230502a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: b */
    public synchronized boolean mo202207b() {
        return this.f147408e;
    }

    /* renamed from: a */
    public int mo202204a() {
        int i;
        synchronized (this) {
            i = 0;
            this.f147408e = false;
            HandlerThread handlerThread = this.f147406c;
            if (handlerThread != null) {
                try {
                    handlerThread.join(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f147406c = null;
                this.f147407d = null;
            }
        }
        AbstractC70000a aVar = this.f147405a;
        if (!(aVar == null || (i = aVar.mo202623l(false)) == 0)) {
            C63929ab.m250980d(f147404b, "close wav file failed");
        }
        return i;
    }

    public C59373b(AbstractC70000a aVar) {
        this.f147405a = aVar;
    }

    /* renamed from: a */
    public int mo202206a(final byte[] bArr, final int i) {
        synchronized (this) {
            if (!this.f147408e) {
                return -108;
            }
            Handler handler = this.f147407d;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.ss.android.medialib.p2998a.C59373b.RunnableC593741 */

                    public void run() {
                        if (C59373b.this.f147405a != null) {
                            C59373b.this.f147405a.mo202591c(bArr, i);
                        }
                    }
                });
            } else {
                AbstractC70000a aVar = this.f147405a;
                if (aVar != null) {
                    aVar.mo202591c(bArr, i);
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    public int mo202205a(int i, int i2, double d) {
        synchronized (this) {
            try {
                HandlerThread a = m230502a(f147404b);
                this.f147406c = a;
                a.start();
                this.f147407d = new Handler(this.f147406c.getLooper());
            } catch (Exception unused) {
                this.f147407d = null;
                this.f147406c = null;
            }
            this.f147408e = true;
        }
        AbstractC70000a aVar = this.f147405a;
        if (aVar == null) {
            return 0;
        }
        int a2 = aVar.mo202522a(i, i2, d);
        if (a2 != 0) {
            C63929ab.m250980d(f147404b, "init wav file failed");
        }
        return a2;
    }
}
