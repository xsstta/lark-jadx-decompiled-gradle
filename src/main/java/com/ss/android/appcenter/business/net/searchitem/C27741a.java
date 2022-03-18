package com.ss.android.appcenter.business.net.searchitem;

import androidx.lifecycle.C1174u;
import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.p1270a.AbstractC27713a;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1265a.C27580h;
import com.ss.android.appcenter.common.util.C28184h;

/* renamed from: com.ss.android.appcenter.business.net.searchitem.a */
public class C27741a extends C27714b {

    /* renamed from: a */
    public C1174u<SearchItemData> f69323a = new C1174u<>();

    /* renamed from: d */
    public LiveData<SearchItemData> mo99032d() {
        return this.f69323a;
    }

    /* renamed from: a */
    public void mo99031a(final String str) {
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101343d(str, new AbstractC27713a() {
            /* class com.ss.android.appcenter.business.net.searchitem.C27741a.C277421 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                mo98874a("SearchItemByQuery", C27580h.m100661a(bVar.f69282a, errorResult) + "key:" + str, errorResult, C27741a.this.f69323a, a, C27702b.f69250u);
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                String str = sendHttpResponse.json_body;
                try {
                    SearchItemResponse searchItemResponse = (SearchItemResponse) new Gson().fromJson(str, SearchItemResponse.class);
                    if (searchItemResponse != null && searchItemResponse.getCode() == 0) {
                        if (searchItemResponse.getData() != null) {
                            C28184h.m103250d("SearchItemByQuery", C27580h.m100660a() + "key:" + str);
                            C27741a.this.f69323a.mo5926a(searchItemResponse.getData());
                            a.setMonitorCode(C27702b.f69249t).timing().flush();
                            return;
                        }
                    }
                    mo98873a("SearchItemByQuery", C27580h.m100663a(bVar.f69282a, bVar.f69283b, str) + "key:" + str, C27741a.this.f69323a, a, C27702b.f69250u);
                } catch (JsonSyntaxException e) {
                    mo98874a("SearchItemByQuery", C27580h.m100667b(bVar.f69282a, bVar.f69283b, str) + "key:" + str, e, C27741a.this.f69323a, a, C27702b.f69250u);
                }
            }
        });
    }
}
