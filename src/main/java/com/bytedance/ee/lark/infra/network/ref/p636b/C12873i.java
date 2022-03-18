package com.bytedance.ee.lark.infra.network.ref.p636b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.ref.entity.C12874a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.entity.C12880g;
import com.bytedance.ee.lark.infra.network.ref.entity.C12883i;
import com.bytedance.ee.lark.infra.network.ref.entity.ECONetworkException;
import com.bytedance.ee.lark.infra.network.ref.entity.ECOTaskState;
import java.util.List;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.b.i */
public class C12873i {
    /* renamed from: a */
    private String m53127a(String str, int i) {
        return "current network life cycle intercept:" + str + " interceptor index " + i;
    }

    /* renamed from: b */
    private ECONetworkException m53128b(String str, int i) {
        return new ECONetworkException(m53127a(str, i) + "cancel current process");
    }

    /* renamed from: a */
    public C12874a<C12867c> mo48540a(List<C12872h> list, C12878e eVar, C12867c cVar) {
        int i = 0;
        AppBrandLogger.m52830i("ECORequestLifeCycle", " start process request ");
        C12874a<C12867c> aVar = new C12874a<>(cVar);
        while (true) {
            if (i >= list.size()) {
                break;
            }
            aVar = list.get(i).mo48533a(eVar, cVar);
            cVar = aVar.mo48549b();
            if (aVar.mo48548a()) {
                aVar.mo48550c().appendPrefixMsg(m53127a("process_request_intercept", i));
                break;
            }
            i++;
        }
        return aVar;
    }

    /* renamed from: a */
    public C12874a mo48537a(C12870f fVar, List<C12872h> list, C12878e eVar, C12880g gVar) {
        AppBrandLogger.m52830i("ECORequestLifeCycle", " request start task " + fVar.mo48516a());
        C12874a aVar = new C12874a("");
        for (int i = 0; i < list.size(); i++) {
            C12872h hVar = list.get(i);
            if (fVar.mo48518b() == ECOTaskState.TASK_CANCELED) {
                return new C12874a(m53128b("request_start_intercept", i));
            }
            aVar = hVar.mo48534a(eVar, gVar);
            if (aVar.mo48548a()) {
                aVar.mo48550c().appendPrefixMsg(m53127a("request_start_intercept", i));
                return aVar;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public <T> C12874a<C12868d<T>> mo48538a(C12870f fVar, List<C12872h> list, C12878e eVar, C12880g gVar, C12868d<T> dVar) {
        AppBrandLogger.m52830i("ECORequestLifeCycle", "process response task" + fVar.mo48516a());
        C12874a<C12868d<T>> aVar = new C12874a<>(dVar);
        for (int i = 0; i < list.size(); i++) {
            C12872h hVar = list.get(i);
            if (fVar.mo48518b() == ECOTaskState.TASK_CANCELED) {
                return new C12874a<>(m53128b("process_response_intercept", i));
            }
            aVar = hVar.mo48535a(eVar, gVar, dVar);
            if (aVar.mo48548a()) {
                aVar.mo48550c().appendPrefixMsg(m53127a("process_response_intercept", i));
                return aVar;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public C12874a mo48539a(C12870f fVar, List<C12872h> list, C12878e eVar, C12880g gVar, C12883i iVar) {
        AppBrandLogger.m52830i("ECORequestLifeCycle", " request end task " + fVar.mo48516a());
        C12874a aVar = new C12874a("");
        for (int i = 0; i < list.size(); i++) {
            C12872h hVar = list.get(i);
            if (fVar.mo48518b() == ECOTaskState.TASK_CANCELED) {
                return new C12874a(m53128b("request_end_intercept", i));
            }
            aVar = hVar.mo48536a(eVar, gVar, iVar);
            if (aVar.mo48548a()) {
                aVar.mo48550c().appendPrefixMsg(m53127a("request_end_intercept", i));
                return aVar;
            }
        }
        return aVar;
    }
}
