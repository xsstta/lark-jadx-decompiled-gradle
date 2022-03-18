package com.bytedance.frameworks.baselib.network.connectionclass;

import com.bytedance.common.utility.Logger;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.b */
public class C13949b {

    /* renamed from: a */
    private C13952c f36460a = new C13952c(0.05d);

    /* renamed from: b */
    private volatile boolean f36461b = false;

    /* renamed from: c */
    private AtomicReference<ConnectionQuality> f36462c = new AtomicReference<>(ConnectionQuality.UNKNOWN);

    /* renamed from: d */
    private AtomicReference<ConnectionQuality> f36463d;

    /* renamed from: e */
    private ArrayList<AbstractC13951b> f36464e = new ArrayList<>();

    /* renamed from: f */
    private int f36465f;

    /* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.b$a */
    private static class C13950a {

        /* renamed from: a */
        public static final C13949b f36466a = new C13949b();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.b$b */
    public interface AbstractC13951b {
        /* renamed from: a */
        void mo51315a(ConnectionQuality connectionQuality);
    }

    /* renamed from: b */
    public static C13949b m56438b() {
        return C13950a.f36466a;
    }

    /* renamed from: c */
    public synchronized ConnectionQuality mo51314c() {
        C13952c cVar = this.f36460a;
        if (cVar == null) {
            return ConnectionQuality.UNKNOWN;
        }
        try {
            return m56436a(cVar.mo51316a());
        } catch (Throwable th) {
            th.printStackTrace();
            return ConnectionQuality.UNKNOWN;
        }
    }

    protected C13949b() {
    }

    /* renamed from: d */
    private void m56439d() {
        try {
            int size = this.f36464e.size();
            for (int i = 0; i < size; i++) {
                this.f36464e.get(i).mo51315a(this.f36462c.get());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private boolean m56437a() {
        if (this.f36460a == null) {
            return false;
        }
        try {
            ConnectionQuality connectionQuality = this.f36462c.get();
            double d = 560.0d;
            double d2 = 112.0d;
            if (ConnectionQuality.POOR == connectionQuality) {
                d2 = 0.0d;
                d = 28.0d;
            } else if (ConnectionQuality.MODERATE == connectionQuality) {
                d = 112.0d;
                d2 = 28.0d;
            } else if (ConnectionQuality.GOOD != connectionQuality) {
                if (ConnectionQuality.EXCELLENT == connectionQuality) {
                    d = 3.4028234663852886E38d;
                    d2 = 560.0d;
                }
                return true;
            }
            double a = this.f36460a.mo51316a();
            if (a > d) {
                if (a > d * 1.25d) {
                    return true;
                }
            } else if (a < d2 * 0.8d) {
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    /* renamed from: a */
    public ConnectionQuality mo51312a(AbstractC13951b bVar) {
        if (bVar != null) {
            this.f36464e.add(bVar);
        }
        return this.f36462c.get();
    }

    /* renamed from: a */
    private ConnectionQuality m56436a(double d) {
        if (d < 0.0d) {
            return ConnectionQuality.UNKNOWN;
        }
        if (d < 28.0d) {
            return ConnectionQuality.POOR;
        }
        if (d < 112.0d) {
            return ConnectionQuality.MODERATE;
        }
        if (d < 560.0d) {
            return ConnectionQuality.GOOD;
        }
        return ConnectionQuality.EXCELLENT;
    }

    /* renamed from: a */
    public synchronized void mo51313a(long j, long j2) {
        double d = ((((double) j) * 1.0d) / ((double) j2)) * 8.0d;
        if (j2 != 0 && d >= 3.0d) {
            try {
                if (Logger.debug()) {
                    Logger.m15167d("ConnectionClassManager", "bytes = " + j + " timeInMs = " + j2 + " bandwidth = " + d);
                }
                this.f36460a.mo51317a(d);
                if (this.f36461b) {
                    this.f36465f++;
                    if (mo51314c() != this.f36463d.get()) {
                        this.f36461b = false;
                        this.f36465f = 1;
                    }
                    if (((double) this.f36465f) >= 5.0d && m56437a()) {
                        this.f36461b = false;
                        this.f36465f = 1;
                        this.f36462c.set(this.f36463d.get());
                        m56439d();
                    }
                    return;
                }
                if (this.f36462c.get() != mo51314c()) {
                    this.f36461b = true;
                    this.f36463d = new AtomicReference<>(mo51314c());
                }
            } catch (Throwable unused) {
            }
        }
    }
}
