package com.bytedance.dr;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.dr.n */
public final class C4019n<SERVICE, RESULT> {

    /* renamed from: a */
    private final CountDownLatch f12183a = new CountDownLatch(1);

    /* renamed from: b */
    private final Intent f12184b;

    /* renamed from: c */
    private final AbstractC4021b<SERVICE, RESULT> f12185c;

    /* renamed from: d */
    private final Context f12186d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.dr.n$b */
    public interface AbstractC4021b<T, RESULT> {
        /* renamed from: a */
        RESULT mo15744a(T t) throws Exception;

        /* renamed from: b */
        T mo15745b(IBinder iBinder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public RESULT mo15756a() {
        Throwable th;
        ServiceConnectionC4020a aVar;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return null;
        }
        try {
            aVar = new ServiceConnectionC4020a(this.f12183a, this.f12185c);
            this.f12186d.bindService(this.f12184b, aVar, 1);
            this.f12183a.await();
            try {
                RESULT a = this.f12185c.mo15744a(aVar.f12187a);
                m16699a(aVar);
                return a;
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    m16699a(aVar);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = null;
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private void m16699a(C4019n<SERVICE, RESULT>.ServiceConnectionC4020a aVar) {
        if (aVar != null) {
            try {
                this.f12186d.unbindService(aVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.dr.n$a */
    public class ServiceConnectionC4020a implements ServiceConnection {

        /* renamed from: a */
        SERVICE f12187a;

        /* renamed from: c */
        private final CountDownLatch f12189c;

        /* renamed from: d */
        private final AbstractC4021b<SERVICE, RESULT> f12190d;

        public void onServiceDisconnected(ComponentName componentName) {
            String str = C4011h.f12160a;
            C4002d.m16661b(str, "ServiceBlockBinder#onServiceDisconnected" + componentName);
            try {
                this.f12189c.countDown();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str = C4011h.f12160a;
            C4002d.m16661b(str, "ServiceBlockBinder#onServiceConnected " + componentName);
            try {
                this.f12187a = this.f12190d.mo15745b(iBinder);
                try {
                    this.f12189c.countDown();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                try {
                    this.f12189c.countDown();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
        }

        ServiceConnectionC4020a(CountDownLatch countDownLatch, AbstractC4021b<SERVICE, RESULT> bVar) {
            this.f12189c = countDownLatch;
            this.f12190d = bVar;
        }
    }

    C4019n(Context context, Intent intent, AbstractC4021b<SERVICE, RESULT> bVar) {
        this.f12186d = context;
        this.f12184b = intent;
        this.f12185c = bVar;
    }
}
