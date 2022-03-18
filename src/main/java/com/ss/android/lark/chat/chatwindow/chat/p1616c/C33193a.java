package com.ss.android.lark.chat.chatwindow.chat.p1616c;

import android.util.LruCache;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1618b.AbstractC33208c;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.AbstractC33211a;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33214d;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33215e;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.c.a */
public class C33193a {

    /* renamed from: a */
    private final Executor f85395a = CoreThreadPool.getDefault().getCachedThreadPool();

    /* renamed from: b */
    private final Map<String, C33215e> f85396b = new ConcurrentHashMap();

    /* renamed from: c */
    private final LruCache<String, C33214d> f85397c = new LruCache<>(20);

    /* renamed from: d */
    private final Lock f85398d = new ReentrantLock();

    C33193a() {
    }

    /* renamed from: a */
    public void mo122406a(C33214d dVar, AbstractC33208c cVar) {
        String b = dVar.mo122441b();
        this.f85397c.put(b, dVar);
        Log.m165389i("DataPreLoadEngine", "Execute：" + b);
        this.f85395a.execute(new Runnable(cVar, dVar, b) {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1616c.$$Lambda$a$3G30qlvDeg1piQVFRe8_xBrdco */
            public final /* synthetic */ AbstractC33208c f$1;
            public final /* synthetic */ C33214d f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C33193a.m270360lambda$3G30qlvDeg1piQVFRe8_xBrdco(C33193a.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128262a(AbstractC33208c cVar, C33214d dVar, String str) {
        C33215e a = cVar.mo122423a(dVar.mo122442c());
        this.f85398d.lock();
        try {
            IGetDataCallback<C33215e> a2 = dVar.mo122439a();
            if (a2 == null) {
                Log.m165389i("DataPreLoadEngine", "Task：" + str + " finish before fetch data, cache result");
                this.f85396b.put(str, a);
            } else if (a.mo122447c()) {
                Log.m165389i("DataPreLoadEngine", "Task：" + str + " finish after fetch data，return result");
                a2.onSuccess(a);
            } else {
                Log.m165389i("DataPreLoadEngine", "Task：" + str + " finish after fetch data，return error:" + a.mo122446b());
                a2.onError(a.mo122446b());
            }
        } finally {
            this.f85397c.remove(str);
            this.f85398d.unlock();
        }
    }

    /* renamed from: a */
    public void mo122407a(String str, AbstractC33211a aVar, IGetDataCallback<C33215e> iGetDataCallback) {
        this.f85398d.lock();
        try {
            C33215e remove = this.f85396b.remove(str);
            if (remove != null) {
                if (remove.mo122447c()) {
                    Log.m165389i("DataPreLoadEngine", "Task:" + str + " Fetch data after task finish, return result");
                    iGetDataCallback.onSuccess(remove);
                } else {
                    Log.m165383e("DataPreLoadEngine", "Task:" + str + " Fetch data after task finish, return error:" + remove.mo122446b());
                    iGetDataCallback.onError(remove.mo122446b());
                }
                return;
            }
            C33214d dVar = this.f85397c.get(str);
            if (dVar != null) {
                dVar.mo122440a(iGetDataCallback);
            } else {
                Log.m165383e("DataPreLoadEngine", "Failed to find task when fetch data：" + str + "");
                C33214d dVar2 = new C33214d(str, aVar);
                dVar2.mo122440a(iGetDataCallback);
                AbstractC33208c a = C33201b.m128282a().mo122417a(aVar);
                if (a != null) {
                    mo122406a(dVar2, a);
                }
            }
            this.f85398d.unlock();
        } finally {
            this.f85398d.unlock();
        }
    }
}
