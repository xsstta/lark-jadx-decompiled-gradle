package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.b */
class C22438b {

    /* renamed from: a */
    private static C22438b f55097a;

    /* renamed from: b */
    private final Object f55098b = new Object();

    /* renamed from: c */
    private final Handler f55099c = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        /* class com.google.android.material.snackbar.C22438b.C224391 */

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C22438b.this.mo78209a((C22441b) message.obj);
            return true;
        }
    });

    /* renamed from: d */
    private C22441b f55100d;

    /* renamed from: e */
    private C22441b f55101e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.b$a */
    public interface AbstractC22440a {
        /* renamed from: a */
        void mo78215a();

        /* renamed from: a */
        void mo78216a(int i);
    }

    /* renamed from: a */
    static C22438b m81375a() {
        if (f55097a == null) {
            f55097a = new C22438b();
        }
        return f55097a;
    }

    private C22438b() {
    }

    /* renamed from: b */
    private void m81377b() {
        C22441b bVar = this.f55101e;
        if (bVar != null) {
            this.f55100d = bVar;
            this.f55101e = null;
            AbstractC22440a aVar = bVar.f55103a.get();
            if (aVar != null) {
                aVar.mo78215a();
            } else {
                this.f55100d = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.snackbar.b$b */
    public static class C22441b {

        /* renamed from: a */
        final WeakReference<AbstractC22440a> f55103a;

        /* renamed from: b */
        int f55104b;

        /* renamed from: c */
        boolean f55105c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo78217a(AbstractC22440a aVar) {
            if (aVar == null || this.f55103a.get() != aVar) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: f */
    private boolean m81379f(AbstractC22440a aVar) {
        C22441b bVar = this.f55100d;
        if (bVar == null || !bVar.mo78217a(aVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private boolean m81380g(AbstractC22440a aVar) {
        C22441b bVar = this.f55101e;
        if (bVar == null || !bVar.mo78217a(aVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo78211c(AbstractC22440a aVar) {
        synchronized (this.f55098b) {
            if (m81379f(aVar) && !this.f55100d.f55105c) {
                this.f55100d.f55105c = true;
                this.f55099c.removeCallbacksAndMessages(this.f55100d);
            }
        }
    }

    /* renamed from: d */
    public void mo78212d(AbstractC22440a aVar) {
        synchronized (this.f55098b) {
            if (m81379f(aVar) && this.f55100d.f55105c) {
                this.f55100d.f55105c = false;
                m81378b(this.f55100d);
            }
        }
    }

    /* renamed from: e */
    public boolean mo78213e(AbstractC22440a aVar) {
        boolean z;
        synchronized (this.f55098b) {
            if (!m81379f(aVar)) {
                if (!m81380g(aVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private void m81378b(C22441b bVar) {
        if (bVar.f55104b != -2) {
            int i = 2750;
            if (bVar.f55104b > 0) {
                i = bVar.f55104b;
            } else if (bVar.f55104b == -1) {
                i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            }
            this.f55099c.removeCallbacksAndMessages(bVar);
            Handler handler = this.f55099c;
            handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), (long) i);
        }
    }

    /* renamed from: a */
    public void mo78207a(AbstractC22440a aVar) {
        synchronized (this.f55098b) {
            if (m81379f(aVar)) {
                this.f55100d = null;
                if (this.f55101e != null) {
                    m81377b();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo78210b(AbstractC22440a aVar) {
        synchronized (this.f55098b) {
            if (m81379f(aVar)) {
                m81378b(this.f55100d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78209a(C22441b bVar) {
        synchronized (this.f55098b) {
            if (this.f55100d == bVar || this.f55101e == bVar) {
                m81376a(bVar, 2);
            }
        }
    }

    /* renamed from: a */
    private boolean m81376a(C22441b bVar, int i) {
        AbstractC22440a aVar = bVar.f55103a.get();
        if (aVar == null) {
            return false;
        }
        this.f55099c.removeCallbacksAndMessages(bVar);
        aVar.mo78216a(i);
        return true;
    }

    /* renamed from: a */
    public void mo78208a(AbstractC22440a aVar, int i) {
        synchronized (this.f55098b) {
            if (m81379f(aVar)) {
                m81376a(this.f55100d, i);
            } else if (m81380g(aVar)) {
                m81376a(this.f55101e, i);
            }
        }
    }
}
