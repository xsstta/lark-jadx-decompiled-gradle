package com.bytedance.ee.bear.appsetting;

import com.bytedance.ee.bear.appsetting.p242a.C4214a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: com.bytedance.ee.bear.appsetting.a */
public class C4211a {

    /* renamed from: a */
    private final Set<AbstractC4216b> f12720a;

    /* renamed from: b */
    private final C4214a f12721b;

    /* renamed from: com.bytedance.ee.bear.appsetting.a$a */
    private static class C4213a {

        /* renamed from: a */
        public static final C4211a f12722a = new C4211a();
    }

    /* renamed from: a */
    public static C4211a m17514a() {
        return C4213a.f12722a;
    }

    private C4211a() {
        ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet($$Lambda$a$kMipPkGjd9PsOkbyUQy9srC5m9c.INSTANCE);
        this.f12720a = concurrentSkipListSet;
        this.f12721b = new C4214a(concurrentSkipListSet);
    }

    /* renamed from: b */
    public void mo16537b() {
        C13479a.m54764b("AppSetting", "fetch app setting");
        for (AbstractC4216b bVar : this.f12720a) {
            bVar.mo16546a();
        }
    }

    /* renamed from: c */
    public void mo16539c() {
        C13479a.m54764b("AppSetting", "clear cache");
        this.f12721b.mo16543a();
        for (AbstractC4216b bVar : this.f12720a) {
            bVar.mo16550c();
        }
    }

    /* renamed from: a */
    public void mo16535a(AbstractC4216b bVar) {
        this.f12720a.add(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m17513a(AbstractC4216b bVar, AbstractC4216b bVar2) {
        return bVar2.mo16549b() - bVar.mo16549b();
    }

    /* renamed from: a */
    public <T> T mo16533a(String str, T t) {
        if (t != null) {
            return (T) this.f12721b.mo16541a(str, (Object) t, true);
        }
        C13479a.m54775e("AppSetting", "getValue, defValue is null");
        return null;
    }

    /* renamed from: b */
    public boolean mo16538b(String str, boolean z) {
        return ((Boolean) this.f12721b.mo16541a(str, (Object) Boolean.valueOf(z), false)).booleanValue();
    }

    /* renamed from: a */
    public boolean mo16536a(String str, boolean z) {
        return ((Boolean) this.f12721b.mo16541a(str, (Object) Boolean.valueOf(z), true)).booleanValue();
    }

    /* renamed from: a */
    public <T extends NonProguard> T mo16532a(String str, Class<T> cls, T t) {
        return (T) this.f12721b.mo16540a(str, cls, t);
    }

    /* renamed from: a */
    public <T> List<T> mo16534a(String str, Class<T> cls, List<T> list) {
        return this.f12721b.mo16542a(str, cls, list);
    }
}
