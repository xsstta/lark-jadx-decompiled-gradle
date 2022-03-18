package com.bytedance.ee.bear.service.remote;

import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.service.remote.f */
public class C10959f<T extends IInterface> {

    /* renamed from: a */
    public final ConcurrentHashMap<IBinder, C10959f<T>.C10960a> f29463a = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.ee.bear.service.remote.f$b */
    public interface AbstractC10961b<T extends IInterface> {
        void notify(T t) throws Exception;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.service.remote.f$a */
    public final class C10960a implements IBinder.DeathRecipient {

        /* renamed from: a */
        final T f29464a;

        public void binderDied() {
            C10959f.this.f29463a.remove(this.f29464a.asBinder());
        }

        C10960a(T t) {
            this.f29464a = t;
            try {
                t.asBinder().linkToDeath(this, 0);
            } catch (Exception e) {
                C13479a.m54761a("SafeRemoteCallbackList", e);
            }
        }
    }

    /* renamed from: a */
    public void mo41594a() {
        for (IBinder iBinder : this.f29463a.keySet()) {
            try {
                iBinder.unlinkToDeath(this.f29463a.get(iBinder), 0);
            } catch (Exception e) {
                C13479a.m54761a("SafeRemoteCallbackList", e);
            }
        }
        this.f29463a.clear();
    }

    /* renamed from: a */
    public void mo41595a(T t) {
        if (t != null) {
            this.f29463a.put(t.asBinder(), new C10960a(t));
        }
    }

    /* renamed from: b */
    public void mo41597b(T t) {
        if (t != null) {
            try {
                t.asBinder().unlinkToDeath(this.f29463a.remove(t.asBinder()), 0);
            } catch (Exception e) {
                C13479a.m54761a("SafeRemoteCallbackList", e);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.ee.bear.service.remote.f$b<T extends android.os.IInterface> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo41596a(AbstractC10961b<T> bVar) {
        try {
            for (IBinder iBinder : this.f29463a.keySet()) {
                bVar.notify(this.f29463a.get(iBinder).f29464a);
            }
        } catch (Exception e) {
            C13479a.m54761a("SafeRemoteCallbackList", e);
        }
    }
}
