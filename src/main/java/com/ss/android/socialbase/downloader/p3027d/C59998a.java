package com.ss.android.socialbase.downloader.p3027d;

import android.os.Process;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.io.InputStream;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.socialbase.downloader.d.a */
public class C59998a implements AbstractC60001c {

    /* renamed from: a */
    public final InputStream f149583a;

    /* renamed from: b */
    public final Object f149584b = new Object();

    /* renamed from: c */
    public volatile boolean f149585c;

    /* renamed from: d */
    public volatile Throwable f149586d;

    /* renamed from: e */
    private final int f149587e;

    /* renamed from: f */
    private final int f149588f;

    /* renamed from: g */
    private final Object f149589g = new Object();

    /* renamed from: h */
    private C60000b f149590h;

    /* renamed from: i */
    private C60000b f149591i;

    /* renamed from: j */
    private C60000b f149592j;

    /* renamed from: k */
    private C60000b f149593k;

    /* renamed from: l */
    private C60000b f149594l;

    /* renamed from: m */
    private C60000b f149595m;

    /* renamed from: n */
    private volatile boolean f149596n;

    /* renamed from: o */
    private volatile Future f149597o;

    /* renamed from: p */
    private int f149598p;

    /* renamed from: q */
    private final Runnable f149599q = new Runnable() {
        /* class com.ss.android.socialbase.downloader.p3027d.C59998a.RunnableC599991 */

        public void run() {
            C60000b c;
            Process.setThreadPriority(10);
            do {
                try {
                    c = C59998a.this.mo204289c();
                    c.f149602b = C59998a.this.f149583a.read(c.f149601a);
                    C59998a.this.mo204288b(c);
                } catch (Throwable th) {
                    synchronized (C59998a.this.f149584b) {
                        C59998a.this.f149585c = true;
                        C59998a.this.f149584b.notify();
                        C60161d.m233767a(C59998a.this.f149583a);
                        throw th;
                    }
                }
            } while (c.f149602b != -1);
            synchronized (C59998a.this.f149584b) {
                C59998a.this.f149585c = true;
                C59998a.this.f149584b.notify();
            }
            C60161d.m233767a(C59998a.this.f149583a);
        }
    };

    @Override // com.ss.android.socialbase.downloader.p3027d.AbstractC60001c
    /* renamed from: a */
    public C60000b mo204285a() throws BaseException, InterruptedException {
        return m232865e();
    }

    /* renamed from: d */
    private void m232864d() throws Throwable {
        this.f149597o = C60046b.m233006p().submit(this.f149599q);
    }

    @Override // com.ss.android.socialbase.downloader.p3027d.AbstractC60001c
    /* renamed from: b */
    public void mo204287b() {
        synchronized (this.f149589g) {
            this.f149596n = true;
            this.f149589g.notify();
        }
        Future future = this.f149597o;
        if (future != null) {
            try {
                future.cancel(true);
            } catch (Throwable unused) {
            }
            this.f149597o = null;
        }
    }

    /* renamed from: e */
    private C60000b m232865e() throws BaseException, InterruptedException {
        C60000b bVar;
        C60000b bVar2 = this.f149595m;
        if (bVar2 != null) {
            this.f149595m = bVar2.f149603c;
            bVar2.f149603c = null;
            return bVar2;
        }
        synchronized (this.f149584b) {
            bVar = this.f149593k;
            if (bVar == null) {
                do {
                    if (this.f149585c) {
                        m232866f();
                    }
                    this.f149584b.wait();
                    bVar = this.f149593k;
                } while (bVar == null);
            }
            this.f149595m = bVar.f149603c;
            this.f149594l = null;
            this.f149593k = null;
            bVar.f149603c = null;
        }
        return bVar;
    }

    /* renamed from: f */
    private void m232866f() throws BaseException {
        Throwable th = this.f149586d;
        if (th != null) {
            if (th instanceof C60002d) {
                throw new BaseException(1068, "async reader closed!");
            }
            C60161d.m233765a(th, "async_read");
        }
        throw new BaseException(1069, "async reader terminated!");
    }

    /* renamed from: c */
    public C60000b mo204289c() throws C60002d, InterruptedException {
        int i;
        C60000b bVar = this.f149592j;
        if (bVar == null) {
            synchronized (this.f149589g) {
                if (!this.f149596n) {
                    C60000b bVar2 = this.f149590h;
                    if (bVar2 != null || (i = this.f149598p) >= this.f149588f) {
                        while (bVar2 == null) {
                            this.f149589g.wait();
                            if (!this.f149596n) {
                                bVar2 = this.f149590h;
                            } else {
                                throw new C60002d();
                            }
                        }
                        this.f149592j = bVar2.f149603c;
                        this.f149591i = null;
                        this.f149590h = null;
                        bVar2.f149603c = null;
                        return bVar2;
                    }
                    this.f149598p = i + 1;
                    return new C60000b(this.f149587e);
                }
                throw new C60002d();
            }
        } else if (!this.f149596n) {
            this.f149592j = bVar.f149603c;
            bVar.f149603c = null;
            return bVar;
        } else {
            throw new C60002d();
        }
    }

    @Override // com.ss.android.socialbase.downloader.p3027d.AbstractC60001c
    /* renamed from: a */
    public void mo204286a(C60000b bVar) {
        m232863c(bVar);
    }

    /* renamed from: c */
    private void m232863c(C60000b bVar) {
        synchronized (this.f149589g) {
            C60000b bVar2 = this.f149591i;
            if (bVar2 == null) {
                this.f149591i = bVar;
                this.f149590h = bVar;
                this.f149589g.notify();
            } else {
                bVar2.f149603c = bVar;
                this.f149591i = bVar;
            }
        }
    }

    /* renamed from: b */
    public void mo204288b(C60000b bVar) {
        synchronized (this.f149584b) {
            C60000b bVar2 = this.f149594l;
            if (bVar2 == null) {
                this.f149594l = bVar;
                this.f149593k = bVar;
                this.f149584b.notify();
            } else {
                bVar2.f149603c = bVar;
                this.f149594l = bVar;
            }
        }
    }

    public C59998a(InputStream inputStream, int i, int i2) throws Throwable {
        this.f149583a = inputStream;
        this.f149587e = i;
        if (i2 < 1) {
            i2 = 1;
        } else if (i2 > 64) {
            i2 = 64;
        }
        this.f149588f = i2;
        m232864d();
    }
}
