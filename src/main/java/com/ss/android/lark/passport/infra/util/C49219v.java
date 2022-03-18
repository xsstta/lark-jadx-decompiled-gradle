package com.ss.android.lark.passport.infra.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.passport.infra.util.v */
public class C49219v {

    /* renamed from: a */
    public Map<String, C49222a> f123536a;

    /* renamed from: b */
    private long f123537b;

    /* renamed from: c */
    private int f123538c;

    /* renamed from: d */
    private Runnable f123539d;

    /* renamed from: e */
    private Runnable f123540e;

    /* renamed from: f */
    private Handler f123541f;

    /* renamed from: g */
    private Runnable f123542g;

    /* renamed from: com.ss.android.lark.passport.infra.util.v$a */
    public static class C49222a<T> {

        /* renamed from: a */
        public static final C49222a f123545a = new C49222a();

        /* renamed from: b */
        public T f123546b;

        /* renamed from: c */
        public ErrorResult f123547c;

        /* renamed from: a */
        public T mo171750a() {
            return this.f123546b;
        }
    }

    /* renamed from: d */
    private void m194043d() {
        this.f123538c = 3;
        Runnable runnable = this.f123539d;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: c */
    public synchronized void mo171747c() {
        this.f123538c = 2;
        this.f123541f.postDelayed(this.f123542g, this.f123537b);
    }

    /* renamed from: a */
    public void mo171744a() {
        this.f123538c = 4;
        Runnable runnable = this.f123540e;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public void mo171746b() {
        int i = this.f123538c;
        if (!(i == 4 || i == 3)) {
            for (Map.Entry<String, C49222a> entry : this.f123536a.entrySet()) {
                if (entry.getValue() == C49222a.f123545a) {
                    return;
                }
            }
            this.f123541f.removeCallbacks(this.f123542g);
            m194043d();
        }
    }

    public C49219v(long j) {
        this(j, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.passport.infra.util.v$b */
    public class C49223b<T> implements IGetDataCallback<T> {

        /* renamed from: b */
        private String f123549b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            C49222a aVar = new C49222a();
            aVar.f123547c = errorResult;
            synchronized (C49219v.this) {
                C49219v.this.f123536a.put(this.f123549b, aVar);
                C49219v.this.mo171746b();
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(T t) {
            C49222a aVar = new C49222a();
            aVar.f123546b = t;
            synchronized (C49219v.this) {
                C49219v.this.f123536a.put(this.f123549b, aVar);
                C49219v.this.mo171746b();
            }
        }

        public C49223b(String str) {
            this.f123549b = str;
        }
    }

    /* renamed from: a */
    public <T> C49222a<T> mo171743a(String str) {
        return this.f123536a.get(str);
    }

    /* renamed from: a */
    public void mo171745a(Runnable runnable, Runnable runnable2) {
        this.f123539d = runnable;
        this.f123540e = runnable2;
    }

    /* renamed from: a */
    public <T> IGetDataCallback<T> mo171742a(String str, Class<T> cls) {
        this.f123536a.put(str, C49222a.f123545a);
        return new C49223b(str);
    }

    public C49219v(long j, TimeUnit timeUnit) {
        this.f123538c = 1;
        this.f123541f = new Handler(Looper.getMainLooper()) {
            /* class com.ss.android.lark.passport.infra.util.C49219v.HandlerC492201 */

            public void handleMessage(Message message) {
                super.handleMessage(message);
            }
        };
        this.f123542g = new Runnable() {
            /* class com.ss.android.lark.passport.infra.util.C49219v.RunnableC492212 */

            public void run() {
                synchronized (C49219v.this) {
                    C49219v.this.mo171744a();
                }
            }
        };
        this.f123537b = timeUnit.toMillis(j);
        this.f123536a = new ConcurrentHashMap();
    }
}
