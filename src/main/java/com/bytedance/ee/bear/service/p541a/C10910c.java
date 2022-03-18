package com.bytedance.ee.bear.service.p541a;

import android.app.Application;
import android.os.SystemClock;
import com.bytedance.ee.bear.service.AbstractC10928d;
import com.bytedance.ee.bear.service.AbstractC10933f;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.base.AbstractC10913a;
import com.bytedance.ee.bear.service.base.AbstractC10914b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.service.a.c */
public class C10910c implements AbstractC10914b<AbstractC10909b, AbstractC10909b> {

    /* renamed from: a */
    private Application f29374a;

    /* renamed from: b */
    private C10907a f29375b;

    /* renamed from: c */
    private AbstractC10914b.AbstractC10915a f29376c;

    /* renamed from: d */
    private final Map<AbstractC10909b, Boolean> f29377d = new ConcurrentHashMap();

    /* renamed from: e */
    private final Map<Class<?>, AbstractC10909b> f29378e = new ConcurrentHashMap();

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: a */
    public void mo41484a() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: a */
    public void mo41485a(Application application) {
        this.f29374a = application;
        this.f29375b = new C10907a();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: b */
    public void mo41492b(AbstractC10913a aVar) {
        aVar.init(this.f29374a);
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: c */
    public AbstractC68307f<AbstractC10909b> mo41493c(Class<AbstractC10909b> cls) {
        return AbstractC68307f.m265083a(mo41491b(cls));
    }

    /* renamed from: a */
    private boolean m45378a(AbstractC10909b bVar) {
        Boolean bool = this.f29377d.get(bVar);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: a */
    public void mo41488a(AbstractC10914b.AbstractC10915a aVar) {
        this.f29376c = aVar;
    }

    /* renamed from: d */
    public AbstractC10909b mo41491b(Class<AbstractC10909b> cls) {
        AbstractC10909b bVar = this.f29378e.get(cls);
        if (!m45378a(bVar)) {
            synchronized (bVar) {
                if (!m45378a(bVar)) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    bVar.lazyInit(this.f29374a);
                    this.f29377d.put(bVar, true);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    C13479a.m54764b("LocalServiceFacade", cls.getSimpleName() + " lazy init time: " + elapsedRealtime2 + " thread: " + Thread.currentThread().getName());
                    C10906a.m45376a(C10929e.m45432a(), "2", bVar.getClass().getName(), elapsedRealtime2, "local");
                }
            }
        }
        return this.f29375b.mo41482a(cls, bVar);
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: a */
    public boolean mo41489a(AbstractC10913a aVar) {
        return aVar instanceof AbstractC10909b;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: a */
    public boolean mo41490a(Class<?> cls) {
        return this.f29378e.containsKey(cls);
    }

    /* renamed from: a */
    public void mo41487a(AbstractC10909b bVar, AbstractC10928d dVar) {
        Class<?>[] a;
        if ((bVar instanceof AbstractC10933f) && (a = ((AbstractC10933f) bVar).mo16350a()) != null && a.length > 0) {
            this.f29378e.put(a[0], bVar);
        }
    }
}
