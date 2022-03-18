package com.ss.android.lark.p1786d;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pools;
import com.larksuite.framework.thread.ThreadFactoryC26153m;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ss.android.lark.d.a */
public class C36421a {

    /* renamed from: a */
    public C36439j f93967a;

    /* renamed from: b */
    ExecutorService f93968b = Executors.newSingleThreadExecutor(new ThreadFactoryC26153m("AsyncLayoutInflater"));

    /* renamed from: c */
    public volatile boolean f93969c;

    /* renamed from: d */
    Pools.SynchronizedPool<C36422a> f93970d = new Pools.SynchronizedPool<>(25);

    /* renamed from: com.ss.android.lark.d.a$c */
    public interface AbstractC36424c extends AbstractC36425d {
        void onCreateFinished(View view, ViewGroup viewGroup);
    }

    /* renamed from: com.ss.android.lark.d.a$d */
    public interface AbstractC36425d {
    }

    /* renamed from: com.ss.android.lark.d.a$e */
    public interface AbstractC36426e extends AbstractC36425d {
        /* renamed from: a */
        void mo134291a(View view, int i, ViewGroup viewGroup);
    }

    /* renamed from: com.ss.android.lark.d.a$f */
    public interface AbstractC36427f {
        /* renamed from: a */
        View mo134292a(Context context);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.d.a$a */
    public static class C36422a {

        /* renamed from: a */
        int f93971a;

        /* renamed from: b */
        C36439j f93972b;

        /* renamed from: c */
        AbstractC36427f f93973c;

        /* renamed from: d */
        ViewGroup f93974d;

        /* renamed from: e */
        int f93975e;

        /* renamed from: f */
        View f93976f;

        /* renamed from: g */
        AbstractC36425d f93977g;

        C36422a() {
        }
    }

    /* renamed from: a */
    public C36422a mo134283a() {
        C36422a acquire = this.f93970d.acquire();
        if (acquire == null) {
            return new C36422a();
        }
        return acquire;
    }

    /* renamed from: b */
    public void mo134288b() {
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            declaredField.setAccessible(true);
            ((ThreadLocal) declaredField.get(null)).set(Looper.getMainLooper());
            Log.m165389i("AsyncLayoutInflater", "setMainLooper success");
        } catch (Throwable th) {
            Log.m165384e("AsyncLayoutInflater", "setMainLooper exception", th);
        }
        this.f93969c = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.d.a$b */
    public class RunnableC36423b implements Runnable {

        /* renamed from: b */
        private C36422a f93979b;

        public void run() {
            if (!C36421a.this.f93969c && Build.VERSION.SDK_INT <= 22) {
                C36421a.this.mo134288b();
            }
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            C36422a aVar = this.f93979b;
            if (aVar != null) {
                try {
                    if (aVar.f93971a != 1) {
                        aVar.f93976f = aVar.f93972b.inflate(aVar.f93975e, aVar.f93974d, false);
                    } else {
                        aVar.f93976f = aVar.f93973c.mo134292a(aVar.f93972b.mo134307a());
                    }
                } catch (RuntimeException e) {
                    Log.m165398w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e);
                }
                Log.m165379d("AsyncLayoutInflater", "InflateRunnable cost：" + aVar.f93975e + "/" + (SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
                m143565a(aVar);
            }
        }

        /* renamed from: a */
        private void m143565a(C36422a aVar) {
            if (aVar != null) {
                if (aVar.f93977g instanceof AbstractC36426e) {
                    ((AbstractC36426e) aVar.f93977g).mo134291a(aVar.f93976f, aVar.f93975e, aVar.f93974d);
                }
                if (aVar.f93977g instanceof AbstractC36424c) {
                    ((AbstractC36424c) aVar.f93977g).onCreateFinished(aVar.f93976f, aVar.f93974d);
                }
                C36421a.this.mo134286a(aVar);
            }
        }

        public RunnableC36423b(C36422a aVar) {
            this.f93979b = aVar;
        }
    }

    /* renamed from: b */
    public void mo134289b(C36422a aVar) {
        this.f93968b.execute(new RunnableC36423b(aVar));
    }

    public C36421a(Context context) {
        mo134285a(context);
    }

    /* renamed from: a */
    public void mo134285a(Context context) {
        this.f93967a = new C36439j(context, LayoutInflater.from(context));
    }

    /* renamed from: a */
    public void mo134286a(C36422a aVar) {
        aVar.f93977g = null;
        aVar.f93972b = null;
        aVar.f93974d = null;
        aVar.f93975e = 0;
        aVar.f93976f = null;
        aVar.f93971a = 0;
        aVar.f93973c = null;
        this.f93970d.release(aVar);
    }

    /* renamed from: a */
    public void mo134284a(int i, ViewGroup viewGroup, AbstractC36426e eVar) {
        Objects.requireNonNull(eVar, "callback argument may not be null!");
        C36422a a = mo134283a();
        a.f93972b = this.f93967a;
        a.f93971a = 0;
        a.f93975e = i;
        a.f93974d = viewGroup;
        a.f93977g = eVar;
        mo134289b(a);
    }

    /* renamed from: a */
    public void mo134287a(AbstractC36427f fVar, ViewGroup viewGroup, AbstractC36424c cVar) {
        C36422a a = mo134283a();
        a.f93973c = fVar;
        a.f93971a = 1;
        a.f93972b = this.f93967a;
        a.f93974d = viewGroup;
        a.f93977g = cVar;
        mo134289b(a);
    }
}
