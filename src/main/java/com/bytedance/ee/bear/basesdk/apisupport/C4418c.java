package com.bytedance.ee.bear.basesdk.apisupport;

import com.bytedance.ee.bear.basesdk.api.AbstractC4377c;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.diskmanage.RemoteConfig;
import io.reactivex.AbstractC68307f;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.c */
final class C4418c implements AbstractC4377c {

    /* renamed from: a */
    private final AbstractC4431q f13028a;

    /* renamed from: b */
    private final AbstractC4377c f13029b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4377c
    /* renamed from: b */
    public AbstractC68307f<Long> mo17025b() {
        C13479a.m54764b("Apisupport", "api call: getCacheSize");
        this.f13028a.mo17158a();
        return this.f13029b.mo17025b();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4377c
    /* renamed from: c */
    public long mo17026c() {
        C13479a.m54764b("Apisupport", "api call: getManualCacheSize");
        this.f13028a.mo17158a();
        return this.f13029b.mo17026c();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4377c
    /* renamed from: d */
    public long mo17027d() {
        C13479a.m54764b("Apisupport", "api call: manualClean");
        this.f13028a.mo17158a();
        return this.f13029b.mo17027d();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4377c
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo17024a() {
        C13479a.m54764b("Apisupport", "api call: clearCache");
        this.f13028a.mo17158a();
        return this.f13029b.mo17024a();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4377c
    /* renamed from: a */
    public long mo17023a(RemoteConfig dVar) {
        C13479a.m54764b("Apisupport", "api call: remoteClean");
        this.f13028a.mo17158a();
        return this.f13029b.mo17023a(dVar);
    }

    C4418c(AbstractC4431q qVar, AbstractC4377c cVar) {
        this.f13028a = qVar;
        this.f13029b = cVar;
    }
}
