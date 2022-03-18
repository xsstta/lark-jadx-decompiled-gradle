package com.ss.android.medialib.p2998a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.medialib.p2999b.C59381c;
import com.ss.android.vesdk.C63929ab;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.p3508c.p3509a.AbstractC70000a;

/* renamed from: com.ss.android.medialib.a.a */
public class RunnableC59370a implements Runnable {

    /* renamed from: a */
    public AbstractC59371a f147392a;

    /* renamed from: b */
    public AtomicInteger f147393b = new AtomicInteger(0);

    /* renamed from: c */
    public boolean f147394c = true;

    /* renamed from: d */
    private volatile HandlerC59372b f147395d;

    /* renamed from: e */
    private final Object f147396e = new Object();

    /* renamed from: f */
    private boolean f147397f;

    /* renamed from: g */
    private boolean f147398g;

    /* renamed from: h */
    private AbstractC70000a f147399h;

    /* renamed from: i */
    private boolean f147400i = false;

    /* renamed from: j */
    private boolean f147401j = false;

    /* renamed from: k */
    private final Object f147402k;

    /* renamed from: com.ss.android.medialib.a.a$a */
    public interface AbstractC59371a {
        /* renamed from: a */
        int mo202202a(byte[] bArr, int i);
    }

    /* renamed from: a */
    public static Thread m230490a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0010, code lost:
        if (r3.f147398g == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0014, code lost:
        if (r3.f147394c != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0016, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0017, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0018, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r1 = r3.f147402k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        monitor-enter(r1);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo202196c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f147396e
            monitor-enter(r0)
            boolean r1 = r3.f147397f     // Catch:{ all -> 0x001c }
            r2 = 0
            if (r1 != 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r2
        L_0x000a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            java.lang.Object r1 = r3.f147402k
            monitor-enter(r1)
            boolean r0 = r3.f147398g     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            boolean r0 = r3.f147394c     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0017
            r2 = 1
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r2
        L_0x0019:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.p2998a.RunnableC59370a.mo202196c():boolean");
    }

    /* renamed from: e */
    public boolean mo202198e() {
        boolean z;
        synchronized (this.f147396e) {
            if (!this.f147397f) {
                return false;
            }
            synchronized (this.f147402k) {
                z = this.f147401j;
            }
            return z;
        }
    }

    /* renamed from: b */
    public void mo202194b() {
        C63929ab.m250978c("AudioDataProcessThread", "stopFeeding");
        synchronized (this.f147396e) {
            if (!this.f147397f) {
                C63929ab.m250978c("AudioDataProcessThread", "startFeeding not ready");
            } else {
                this.f147395d.sendMessage(this.f147395d.obtainMessage(1));
            }
        }
    }

    /* renamed from: f */
    public void mo202199f() {
        synchronized (this.f147396e) {
            if (this.f147397f) {
                this.f147395d.sendMessage(this.f147395d.obtainMessage(2));
                C63929ab.m250976b("AudioDataProcessThread", "stop()");
            }
        }
    }

    /* renamed from: g */
    public void mo202200g() {
        synchronized (this.f147402k) {
            C63929ab.m250974a("AudioDataProcessThread", "handleStopFeeding() called");
            if (!this.f147394c) {
                AbstractC70000a aVar = this.f147399h;
                if (aVar != null) {
                    aVar.mo202623l(this.f147400i);
                } else {
                    C63929ab.m250980d("AudioDataProcessThread", "handleStop: Discard wav file");
                }
                this.f147394c = true;
                this.f147400i = false;
                this.f147402k.notify();
            }
        }
    }

    public void run() {
        Looper.prepare();
        synchronized (this.f147396e) {
            this.f147395d = new HandlerC59372b(this);
            this.f147397f = true;
            this.f147396e.notify();
        }
        Looper.loop();
        C63929ab.m250976b("AudioDataProcessThread", "Encoder thread exiting");
        synchronized (this.f147396e) {
            this.f147398g = false;
            this.f147397f = false;
            this.f147395d = null;
        }
    }

    /* renamed from: a */
    public void mo202191a() {
        C63929ab.m250974a("AudioDataProcessThread", C63929ab.m250975b() + ": " + C63929ab.m250979d());
        synchronized (this.f147396e) {
            if (this.f147398g) {
                C63929ab.m250978c("AudioDataProcessThread", "thread already running");
                return;
            }
            this.f147398g = true;
            m230490a(new Thread(this, "AudioDataProcessThread")).start();
            while (!this.f147397f) {
                try {
                    this.f147396e.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: d */
    public void mo202197d() {
        boolean hasMessages;
        long currentTimeMillis = System.currentTimeMillis();
        this.f147401j = false;
        synchronized (this.f147402k) {
            synchronized (this.f147396e) {
                hasMessages = this.f147395d.hasMessages(1);
            }
            if (hasMessages || !this.f147394c) {
                C59381c.m230519a("AudioDataProcessThread", "waiting audio process start");
                try {
                    this.f147402k.wait(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C59381c.m230519a("AudioDataProcessThread", "waiting audio process done");
            }
        }
        if (System.currentTimeMillis() - currentTimeMillis >= 5000) {
            this.f147401j = true;
        }
    }

    /* renamed from: com.ss.android.medialib.a.a$b */
    private static class HandlerC59372b extends Handler {

        /* renamed from: a */
        private WeakReference<RunnableC59370a> f147403a;

        public HandlerC59372b(RunnableC59370a aVar) {
            this.f147403a = new WeakReference<>(aVar);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            RunnableC59370a aVar = this.f147403a.get();
            if (aVar == null) {
                C63929ab.m250980d("AudioDataProcessThread", "EncoderHandler.handleMessage: encoder is null");
            } else if (i == 0) {
                aVar.mo202195b(message.arg1, message.arg2, ((Double) message.obj).doubleValue());
            } else if (i == 1) {
                aVar.mo202200g();
            } else if (i == 2) {
                C63929ab.m250974a("AudioDataProcessThread", "Exit loop");
                aVar.mo202200g();
                removeMessages(3);
                Looper.myLooper().quit();
            } else if (i == 3) {
                if (aVar.f147394c) {
                    C63929ab.m250978c("AudioDataProcessThread", "Cannot feed() after stopFeeding.");
                    return;
                }
                byte[] bArr = (byte[]) message.obj;
                int i2 = message.arg1;
                int decrementAndGet = aVar.f147393b.decrementAndGet();
                if (aVar.f147392a != null) {
                    aVar.f147392a.mo202202a(bArr, i2);
                    C63929ab.m250976b("AudioDataProcessThread", "Buffer processed, size=" + i2 + ", " + decrementAndGet + " buffers remaining");
                }
            }
        }
    }

    public RunnableC59370a(AbstractC70000a aVar, AbstractC59371a aVar2) {
        Object obj;
        if (aVar != null) {
            obj = aVar;
        } else {
            obj = new Object();
        }
        this.f147402k = obj;
        this.f147399h = aVar;
        this.f147392a = aVar2;
    }

    /* renamed from: a */
    public void mo202193a(byte[] bArr, int i) {
        synchronized (this.f147396e) {
            if (this.f147397f) {
                this.f147393b.incrementAndGet();
                this.f147395d.sendMessage(this.f147395d.obtainMessage(3, i, 0, Arrays.copyOf(bArr, i)));
                C63929ab.m250976b("AudioDataProcessThread", "feed audioData");
            }
        }
    }

    /* renamed from: a */
    public void mo202192a(int i, int i2, double d) {
        C63929ab.m250978c("AudioDataProcessThread", "startFeeding");
        synchronized (this.f147396e) {
            if (!this.f147397f) {
                C63929ab.m250978c("AudioDataProcessThread", "startFeeding not ready");
                return;
            }
            this.f147393b.set(0);
            this.f147395d.sendMessage(this.f147395d.obtainMessage(0, i, i2, Double.valueOf(d)));
            this.f147401j = false;
        }
    }

    /* renamed from: b */
    public void mo202195b(int i, int i2, double d) {
        if (this.f147399h != null) {
            C63929ab.m250974a("AudioDataProcessThread", "handleStartFeeding() called with: sampleRateInHz = [" + i + "], channels = [" + i2 + "], speed = [" + d + "]");
            if (this.f147399h.mo202522a(i, i2, d) != 0) {
                C63929ab.m250980d("AudioDataProcessThread", "init wav file failed");
            } else {
                this.f147394c = false;
            }
        }
    }
}
