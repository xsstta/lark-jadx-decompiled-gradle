package com.ss.android.appcenter.business.net.templatedata;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.p1270a.AbstractC27713a;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1265a.C27579g;
import com.ss.android.appcenter.business.p1265a.C27580h;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.net.templatedata.a */
public class C27754a extends C27714b {

    /* renamed from: a */
    public OPTrace f69344a;

    /* renamed from: com.ss.android.appcenter.business.net.templatedata.a$a */
    public interface AbstractC27757a {
        /* renamed from: a */
        void mo99063a();

        /* renamed from: a */
        void mo99064a(String str);
    }

    /* renamed from: com.ss.android.appcenter.business.net.templatedata.a$b */
    public interface AbstractC27758b {
        /* renamed from: a */
        void mo99065a();

        /* renamed from: a */
        void mo99066a(List<C27764g> list);
    }

    public C27754a(OPTrace oPTrace) {
        this.f69344a = oPTrace;
    }

    /* renamed from: a */
    public void mo99062a(List<C27763f> list, final AbstractC27758b bVar) {
        C28184h.m103250d("ApiTemplateDataService", "requestPlatformComponentData>>>");
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101334a(list, new AbstractC27713a() {
            /* class com.ss.android.appcenter.business.net.templatedata.C27754a.C277551 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                C28184h.m103248b("ApiTemplateDataService", "requestPlatformComponentData>>> onError");
                bVar.mo99065a();
                mo98871a(a, C27702b.f69218O, errorResult, bVar, "-1002", C27754a.this.f69344a);
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                int i;
                C28184h.m103250d("ApiTemplateDataService", "requestPlatformComponentData>>> onSuccess");
                try {
                    C27766i iVar = (C27766i) C27579g.f68797a.fromJson(sendHttpResponse.json_body, C27766i.class);
                    if (!(iVar == null || iVar.f69370a != 0 || iVar.f69371b == null)) {
                        if (!C28182f.m103238c(iVar.f69371b.f69369a)) {
                            List<C27764g> list = iVar.f69371b.f69369a;
                            C28184h.m103250d("ApiTemplateDataService", "biz success. url:" + bVar.f69282a + " id:" + bVar.f69283b);
                            bVar.mo99066a(list);
                            a.setMonitorCode(C27702b.f69217N).tracing(C27754a.this.f69344a).timing().flush();
                            return;
                        }
                    }
                    bVar.mo99065a();
                    if (iVar == null) {
                        i = -1;
                    } else {
                        i = iVar.f69370a;
                    }
                    mo98870a(a, C27702b.f69218O, sendHttpResponse, bVar, String.valueOf(i), C27754a.this.f69344a);
                } catch (Exception unused) {
                    bVar.mo99065a();
                    mo98870a(a, C27702b.f69218O, sendHttpResponse, bVar, "-1001", C27754a.this.f69344a);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo99061a(String str, String str2, boolean z, String str3, final AbstractC27757a aVar) {
        SendHttpRequest.Method method;
        C28184h.m103250d("ApiTemplateDataService", "requestExternalComponentData>>>");
        if (TextUtils.equals(str.toUpperCase(), "GET")) {
            method = SendHttpRequest.Method.GET;
        } else {
            method = SendHttpRequest.Method.POST;
        }
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101332a(str2, z, str3, method, new AbstractC27713a() {
            /* class com.ss.android.appcenter.business.net.templatedata.C27754a.C277562 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                C28184h.m103248b("ApiTemplateDataService", "requestExternalComponentData>>> onError");
                aVar.mo99063a();
                mo98871a(a, C27702b.f69220Q, errorResult, bVar, "-1002", C27754a.this.f69344a);
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                C28184h.m103250d("ApiTemplateDataService", "requestExternalComponentData>>> onSuccess");
                if (sendHttpResponse.http_status_code.intValue() != 200 || TextUtils.isEmpty(sendHttpResponse.json_body)) {
                    aVar.mo99063a();
                    mo98870a(a, C27702b.f69220Q, sendHttpResponse, bVar, "-1003", C27754a.this.f69344a);
                    return;
                }
                C28184h.m103250d("ApiTemplateDataService", C27580h.m100660a());
                aVar.mo99064a(sendHttpResponse.json_body);
                a.setMonitorCode(C27702b.f69219P).tracing(C27754a.this.f69344a).timing().flush();
            }
        });
    }
}
