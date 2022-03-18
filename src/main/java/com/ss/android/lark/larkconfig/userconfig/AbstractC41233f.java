package com.ss.android.lark.larkconfig.userconfig;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.lark.larkconfig.userconfig.f */
public abstract class AbstractC41233f<K, V> {

    /* renamed from: a */
    public AtomicInteger f105015a = new AtomicInteger(0);

    /* renamed from: b */
    private Map<K, V> f105016b = new ConcurrentHashMap();

    /* renamed from: c */
    private AtomicInteger f105017c = new AtomicInteger(0);

    /* renamed from: d */
    private Queue<C41236b> f105018d = new LinkedBlockingQueue();

    /* renamed from: com.ss.android.lark.larkconfig.userconfig.f$a */
    interface AbstractC41235a {
        /* renamed from: a */
        void mo148594a();

        /* renamed from: a */
        void mo148595a(ErrorResult errorResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo148548a(AbstractC41235a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo148592d() {
        return 2;
    }

    /* renamed from: e */
    public void mo148593e() {
        this.f105017c.compareAndSet(1, 2);
        mo148591c();
    }

    /* renamed from: c */
    public void mo148591c() {
        while (!this.f105018d.isEmpty()) {
            C41236b poll = this.f105018d.poll();
            if (poll != null) {
                poll.f105021b.onSuccess(this.f105016b.get(poll.f105020a));
            }
        }
    }

    /* renamed from: a */
    public final void mo148590a(Map<K, V> map) {
        this.f105016b.putAll(map);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.userconfig.f$b */
    public static class C41236b<K, V> {

        /* renamed from: a */
        public K f105020a;

        /* renamed from: b */
        public IGetDataCallback<V> f105021b;

        public C41236b(K k, IGetDataCallback<V> iGetDataCallback) {
            this.f105020a = k;
            this.f105021b = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public final void mo148589a(K k, IGetDataCallback<V> iGetDataCallback) {
        if (this.f105017c.compareAndSet(0, 1)) {
            mo148548a(new AbstractC41235a() {
                /* class com.ss.android.lark.larkconfig.userconfig.AbstractC41233f.C412341 */

                @Override // com.ss.android.lark.larkconfig.userconfig.AbstractC41233f.AbstractC41235a
                /* renamed from: a */
                public void mo148594a() {
                    AbstractC41233f.this.mo148593e();
                }

                @Override // com.ss.android.lark.larkconfig.userconfig.AbstractC41233f.AbstractC41235a
                /* renamed from: a */
                public void mo148595a(ErrorResult errorResult) {
                    String str;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onError:");
                    if (errorResult == null) {
                        str = "null";
                    } else {
                        str = errorResult.getDebugMsg();
                    }
                    sb.append(str);
                    sb.append("errorCount=");
                    Log.m165389i("BaseUserCache", sb.toString());
                    if (AbstractC41233f.this.f105015a.getAndAdd(1) <= AbstractC41233f.this.mo148592d()) {
                        AbstractC41233f.this.mo148548a(this);
                    } else {
                        AbstractC41233f.this.mo148593e();
                    }
                }
            });
        }
        if (this.f105017c.get() == 1) {
            this.f105018d.add(new C41236b(k, iGetDataCallback));
            return;
        }
        mo148591c();
        iGetDataCallback.onSuccess(this.f105016b.get(k));
    }
}
