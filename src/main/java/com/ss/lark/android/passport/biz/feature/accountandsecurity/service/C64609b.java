package com.ss.lark.android.passport.biz.feature.accountandsecurity.service;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.service.response.QueryContactPointsResponse;

/* renamed from: com.ss.lark.android.passport.biz.feature.accountandsecurity.service.b */
public class C64609b {

    /* renamed from: a */
    private static C64609b f163071a;

    private C64609b() {
    }

    /* renamed from: a */
    public static C64609b m253863a() {
        if (f163071a == null) {
            synchronized (C64609b.class) {
                if (f163071a == null) {
                    f163071a = new C64609b();
                }
            }
        }
        return f163071a;
    }

    /* renamed from: a */
    public AbstractC49347c mo223369a(final AbstractC49352d<QueryContactPointsResponse> dVar) {
        return ContactPointApi.m253862a(null, new AbstractC49352d<QueryContactPointsResponse>() {
            /* class com.ss.lark.android.passport.biz.feature.accountandsecurity.service.C64609b.C646101 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(networkErrorResult);
                }
            }

            /* renamed from: a */
            public void mo145179a(QueryContactPointsResponse queryContactPointsResponse) {
                if (dVar == null) {
                    return;
                }
                if (queryContactPointsResponse == null || queryContactPointsResponse.cps == null) {
                    Log.m165383e("ContactPointsService", "asycQueryContactPoints response is null");
                    dVar.mo145178a(new NetworkErrorResult(-13, "Network error, please retry"));
                    return;
                }
                dVar.mo145179a(queryContactPointsResponse);
            }
        });
    }
}
