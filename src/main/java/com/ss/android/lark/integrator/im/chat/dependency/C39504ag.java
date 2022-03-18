package com.ss.android.lark.integrator.im.chat.dependency;

import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.biz.im.api.param.IMConstants;
import com.ss.android.lark.dependency.ar;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.p2392o.AbstractC48698d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.ag */
class C39504ag implements ar {

    /* renamed from: a */
    private static Map<AbstractC48698d, WSConnState.AbstractC29537a> f100930a = new ConcurrentHashMap();

    C39504ag() {
    }

    @Override // com.ss.android.lark.dependency.ar
    /* renamed from: a */
    public IMConstants.NetworkLevel mo134481a() {
        return IMConstants.NetworkLevel.forNumber(C39603g.m157159a().getCoreDependency().mo143395U().getValue());
    }

    @Override // com.ss.android.lark.dependency.ar
    /* renamed from: b */
    public void mo134483b(AbstractC48698d dVar) {
        WSConnState.AbstractC29537a aVar = f100930a.get(dVar);
        if (aVar != null) {
            f100930a.remove(dVar);
            C39603g.m157159a().getCoreDependency().mo143534b(aVar);
        }
    }

    @Override // com.ss.android.lark.dependency.ar
    /* renamed from: a */
    public void mo134482a(final AbstractC48698d dVar) {
        C395051 r0 = new WSConnState.AbstractC29537a() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39504ag.C395051 */

            @Override // com.ss.android.lark.biz.core.api.WSConnState.AbstractC29537a
            /* renamed from: a */
            public void mo102563a(WSConnState.ConnState connState) {
                boolean z;
                AbstractC48698d dVar = dVar;
                if (connState == null || connState != WSConnState.ConnState.Connected) {
                    z = false;
                } else {
                    z = true;
                }
                dVar.mo123499a(z);
            }
        };
        f100930a.put(dVar, r0);
        C39603g.m157159a().getCoreDependency().mo143464a(r0);
    }
}
