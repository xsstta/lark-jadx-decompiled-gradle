package com.bytedance.ee.lark.infra.network.ref.p636b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p627b.C12822a;
import com.bytedance.ee.lark.infra.network.ref.entity.AbstractC12876c;
import com.bytedance.ee.lark.infra.network.ref.entity.C12874a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.entity.C12880g;
import com.bytedance.ee.lark.infra.network.ref.entity.C12883i;
import com.bytedance.ee.lark.infra.network.ref.entity.ECONetworkException;
import com.bytedance.ee.lark.infra.network.ref.entity.ECOTaskState;
import com.bytedance.ee.lark.infra.network.ref.p635a.AbstractC12855g;
import com.bytedance.ee.lark.infra.network.ref.p635a.C12847a;
import com.bytedance.ee.lark.infra.network.ref.p635a.C12859i;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.b.e */
public class C12869e {

    /* renamed from: a */
    public C12873i f34350a;

    /* renamed from: b */
    private C12866b f34351b;

    /* renamed from: c */
    private AbstractC12855g f34352c;

    public C12869e() {
        this(new C12866b());
    }

    public C12869e(C12866b bVar) {
        this.f34351b = bVar;
        this.f34350a = new C12873i();
        this.f34352c = C12859i.m53076a(bVar.mo48499b(), bVar.mo48498a(), bVar.mo48500c());
    }

    /* renamed from: a */
    public <T> C12868d<T> mo48514a(C12870f fVar) throws ECONetworkException {
        AppBrandLogger.m52830i("ECONetworkService", "start executeTask , task id " + fVar.mo48516a());
        C12878e e = fVar.mo48521e();
        C12880g d = fVar.mo48520d();
        List<C12872h> c = fVar.mo48519c();
        try {
            if (fVar.mo48518b() == ECOTaskState.TASK_INIT) {
                fVar.mo48517a(ECOTaskState.TASK_EXECUTED);
                C12874a a = this.f34350a.mo48537a(fVar, c, e, d.mo48566e().mo48570a());
                if (!a.mo48548a()) {
                    try {
                        C12883i g = fVar.mo48523g();
                        if (g != null) {
                            C12874a a2 = this.f34350a.mo48539a(fVar, c, e, d.mo48566e().mo48570a(), g.mo48578e().mo48584a());
                            if (!a2.mo48548a()) {
                                C12868d<T> dVar = new C12868d<>(g);
                                if (fVar.mo48522f() != null) {
                                    try {
                                        AppBrandLogger.m52830i("ECONetworkService", " convert response task " + fVar.mo48516a());
                                        dVar.mo48509a((T) fVar.mo48522f().mo48551a(e, dVar));
                                    } catch (ECONetworkException e2) {
                                        throw e2.appendPrefixMsg("convert response err ");
                                    }
                                }
                                C12874a<C12868d<T>> a3 = this.f34350a.mo48538a(fVar, c, e, d.mo48566e().mo48570a(), dVar);
                                if (!a3.mo48548a()) {
                                    C12868d<T> b = a3.mo48549b();
                                    C12847a.m53055a(e, fVar.mo48516a(), true, b.mo48510b(), "type_sync");
                                    return b;
                                }
                                throw a3.mo48550c();
                            }
                            throw a2.mo48550c();
                        }
                        throw new ECONetworkException("execute err, response is null");
                    } catch (Exception e3) {
                        throw new ECONetworkException(" real execute task err ", e3);
                    }
                } else {
                    throw a.mo48550c();
                }
            } else {
                throw new ECONetworkException(" task can not be executed, task state " + fVar.mo48518b().getState());
            }
        } catch (ECONetworkException e4) {
            AppBrandLogger.eWithThrowable("ECONetworkService", "execute task id  " + fVar.mo48516a() + " err" + e4.getErrorMsg(), e4);
            C12847a.m53055a(e, fVar.mo48516a(), false, e4.getErrorMsg(), "type_sync");
            throw e4;
        }
    }

    /* renamed from: a */
    public C12870f mo48515a(C12878e eVar, Class<? extends AbstractC12871g> cls, Object... objArr) throws ECONetworkException {
        AppBrandLogger.m52830i("ECONetworkService", " create econetwork service task start ");
        try {
            AbstractC12871g gVar = (AbstractC12871g) cls.newInstance();
            try {
                C12847a.m53052a(eVar);
                List<C12872h> g = gVar.mo48530g();
                if (g == null) {
                    g = new ArrayList<>();
                    AppBrandLogger.m52830i("ECONetworkService", " interceptors is null ");
                }
                C12867c cVar = new C12867c(gVar);
                C12874a<C12867c> a = this.f34350a.mo48540a(g, eVar, cVar);
                if (!a.mo48548a()) {
                    AbstractC12876c h = gVar.mo48531h();
                    if (h != null) {
                        AppBrandLogger.m52830i("ECONetworkService", "start  request convert ");
                        C12874a<C12867c> a2 = h.mo48497a(eVar, a.mo48549b(), objArr);
                        if (!a2.mo48548a()) {
                            cVar = a2.mo48549b();
                        } else {
                            ECONetworkException c = a2.mo48550c();
                            c.appendPrefixMsg(" request convert error ");
                            throw c;
                        }
                    }
                    try {
                        C12880g c2 = cVar.mo48506c();
                        AppBrandLogger.m52830i("ECONetworkService", "start create real task  ");
                        C12870f fVar = new C12870f(eVar, gVar.mo48532i(), this.f34352c.mo48483a(eVar, c2), c2, g);
                        AppBrandLogger.m52830i("ECONetworkService", " create ecoNetworkServiceTask id " + fVar.mo48516a());
                        return fVar;
                    } catch (Exception e) {
                        throw new ECONetworkException(" build network request err ", e);
                    }
                } else {
                    throw a.mo48550c();
                }
            } catch (ECONetworkException e2) {
                AppBrandLogger.eWithThrowable("ECONetworkService", " create task error,error msg  " + e2.getErrorMsg(), e2);
                throw e2;
            }
        } catch (IllegalAccessException | InstantiationException e3) {
            new OPMonitor(C12822a.f34250f).setError(e3).flush();
            throw new ECONetworkException("create request config err ", e3);
        }
    }
}
