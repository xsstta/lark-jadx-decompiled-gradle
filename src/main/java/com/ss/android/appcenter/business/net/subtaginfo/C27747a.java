package com.ss.android.appcenter.business.net.subtaginfo;

import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1265a.C27580h;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;

/* renamed from: com.ss.android.appcenter.business.net.subtaginfo.a */
public class C27747a {

    /* renamed from: com.ss.android.appcenter.business.net.subtaginfo.a$a */
    public interface AbstractC27749a {
        /* renamed from: a */
        void mo99045a(SubTagData subTagData);
    }

    /* renamed from: a */
    public static void m101450a(int i, final AbstractC27749a aVar) {
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101335a(C27548m.m100547m().mo98225i().mo98187a("lark.appcenter.block.display"), i, new C27714b.AbstractC27716a() {
            /* class com.ss.android.appcenter.business.net.subtaginfo.C27747a.C277481 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                aVar.mo99045a(null);
                C28184h.m103248b("GetWorkplaceSubTagItemInfo", C27580h.m100661a(bVar.f69282a, errorResult));
                a.setMonitorCode(C27702b.f69210G).setError(errorResult).setErrorMessage(C27580h.m100661a(bVar.f69282a, errorResult)).timing().flush();
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                String str = sendHttpResponse.json_body;
                try {
                    SubTagResponse subTagResponse = (SubTagResponse) new Gson().fromJson(str, SubTagResponse.class);
                    if (subTagResponse != null && subTagResponse.getCode() == 0) {
                        if (subTagResponse.getData() != null) {
                            aVar.mo99045a(subTagResponse.getData());
                            C28184h.m103250d("GetWorkplaceSubTagItemInfo", C27580h.m100660a());
                            a.setMonitorCode(C27702b.f69209F).timing().flush();
                            return;
                        }
                    }
                    aVar.mo99045a(null);
                    C28184h.m103248b("GetWorkplaceSubTagItemInfo", C27580h.m100663a(bVar.f69282a, bVar.f69283b, str));
                    a.setMonitorCode(C27702b.f69210G).setErrorMessage(C27580h.m100663a(bVar.f69282a, bVar.f69283b, str)).timing().flush();
                } catch (JsonSyntaxException unused) {
                    aVar.mo99045a(null);
                    C28184h.m103248b("GetWorkplaceSubTagItemInfo", C27580h.m100667b(bVar.f69282a, bVar.f69283b, str));
                    a.setMonitorCode(C27702b.f69210G).setErrorMessage(C27580h.m100663a(bVar.f69282a, bVar.f69283b, str)).timing().flush();
                }
            }
        });
    }
}
