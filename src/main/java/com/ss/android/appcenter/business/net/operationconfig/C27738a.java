package com.ss.android.appcenter.business.net.operationconfig;

import androidx.lifecycle.C1174u;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.Gson;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.p1270a.AbstractC27713a;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1265a.C27580h;

/* renamed from: com.ss.android.appcenter.business.net.operationconfig.a */
public class C27738a extends C27714b {

    /* renamed from: a */
    public C1174u<OperationalConfigData> f69320a = new C1174u<>();

    /* renamed from: d */
    public C1174u<OperationalConfigData> mo98990d() {
        return this.f69320a;
    }

    /* renamed from: a */
    public void mo98989a(boolean z) {
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101344d(z, new AbstractC27713a() {
            /* class com.ss.android.appcenter.business.net.operationconfig.C27738a.C277391 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                mo98874a("GetOperationalConfig", C27580h.m100661a(bVar.f69282a, errorResult), errorResult, C27738a.this.f69320a, a, C27702b.f69212I);
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                C27738a.this.f69279e = true;
                String str = sendHttpResponse.json_body;
                try {
                    OperationalConfigResponse operationalConfigResponse = (OperationalConfigResponse) new Gson().fromJson(str, OperationalConfigResponse.class);
                    if (operationalConfigResponse != null && operationalConfigResponse.getCode() == 0) {
                        if (operationalConfigResponse.getData() != null) {
                            mo98872a("GetOperationalConfig", C27738a.this.f69320a, operationalConfigResponse.getData(), a, C27702b.f69211H);
                            return;
                        }
                    }
                    mo98873a("GetOperationalConfig", C27580h.m100663a(bVar.f69282a, bVar.f69283b, str), C27738a.this.f69320a, a, C27702b.f69212I);
                } catch (Exception e) {
                    mo98874a("GetOperationalConfig", C27580h.m100667b(bVar.f69282a, bVar.f69283b, str), e, C27738a.this.f69320a, a, C27702b.f69212I);
                }
            }
        });
    }
}
