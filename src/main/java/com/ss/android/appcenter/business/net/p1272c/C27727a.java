package com.ss.android.appcenter.business.net.p1272c;

import android.text.TextUtils;
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
import com.ss.android.appcenter.engine.p1300b.C28242b;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.net.c.a */
public class C27727a extends C27714b {

    /* renamed from: a */
    public OPTrace f69294a;

    /* renamed from: com.ss.android.appcenter.business.net.c.a$a */
    public interface AbstractC27730a {
        /* renamed from: a */
        void mo98901a();

        /* renamed from: a */
        void mo98902a(C28242b bVar);
    }

    /* renamed from: com.ss.android.appcenter.business.net.c.a$b */
    public interface AbstractC27731b {
        /* renamed from: a */
        void mo98903a();

        /* renamed from: a */
        void mo98904a(List<C27733c> list);

        /* renamed from: b */
        void mo98905b();
    }

    public C27727a(OPTrace oPTrace) {
        this.f69294a = oPTrace;
    }

    /* renamed from: a */
    public void mo98899a(final AbstractC27731b bVar) {
        C28184h.m103250d("WorkplaceTemplateService#Api", "requestWorkplaceTemplate>>>");
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101328a(new AbstractC27713a() {
            /* class com.ss.android.appcenter.business.net.p1272c.C27727a.C277281 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                C28184h.m103248b("WorkplaceTemplateService#Api", "requestWorkplaceTemplate>>> onError");
                mo98871a(a, C27702b.f69214K, errorResult, bVar, "-1002", C27727a.this.f69294a);
                bVar.mo98903a();
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                int i;
                C28184h.m103250d("WorkplaceTemplateService#Api", "requestWorkplaceTemplate>>> onSuccess");
                try {
                    C27735e eVar = (C27735e) C27579g.f68797a.fromJson(sendHttpResponse.json_body, C27735e.class);
                    if (eVar != null && eVar.f69309a == 0) {
                        if (eVar.f69310b != null) {
                            if (C28182f.m103238c(eVar.f69310b.f69308a)) {
                                C28184h.m103250d("WorkplaceTemplateService#Api", "available template is empty");
                                bVar.mo98905b();
                                a.setMonitorCode(C27702b.f69213J).timing().tracing(C27727a.this.f69294a).setErrorCode("-100").flush();
                                return;
                            }
                            C28184h.m103250d("WorkplaceTemplateService#Api", C27580h.m100660a());
                            bVar.mo98904a(eVar.f69310b.f69308a);
                            a.setMonitorCode(C27702b.f69213J).timing().tracing(C27727a.this.f69294a).flush();
                            return;
                        }
                    }
                    bVar.mo98903a();
                    if (eVar == null) {
                        i = -1;
                    } else {
                        i = eVar.f69309a;
                    }
                    mo98870a(a, C27702b.f69214K, sendHttpResponse, bVar, String.valueOf(i), C27727a.this.f69294a);
                } catch (Exception unused) {
                    mo98870a(a, C27702b.f69214K, sendHttpResponse, bVar, "-1001", C27727a.this.f69294a);
                    bVar.mo98903a();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo98900a(String str, final AbstractC27730a aVar) {
        C28184h.m103250d("WorkplaceTemplateService#Api", "downloadTemplate>>>");
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101330a(str, new AbstractC27713a() {
            /* class com.ss.android.appcenter.business.net.p1272c.C27727a.C277292 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                C28184h.m103248b("WorkplaceTemplateService#Api", "downloadTemplate>>> onError");
                aVar.mo98901a();
                mo98871a(a, C27702b.f69216M, errorResult, bVar, "-1002", C27727a.this.f69294a);
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                C28184h.m103250d("WorkplaceTemplateService#Api", "downloadTemplate>>> onSuccess");
                String str = sendHttpResponse.json_body;
                if (sendHttpResponse.http_status_code.intValue() != 200 || TextUtils.isEmpty(str)) {
                    aVar.mo98901a();
                    mo98870a(a, C27702b.f69216M, sendHttpResponse, bVar, "-1003", C27727a.this.f69294a);
                    return;
                }
                try {
                    C28242b bVar2 = (C28242b) C27579g.f68797a.fromJson(str, C28242b.class);
                    if (bVar2 != null) {
                        if (bVar2.f70878b != null) {
                            C28184h.m103250d("WorkplaceTemplateService#Api", C27580h.m100660a());
                            aVar.mo98902a(bVar2);
                            a.setMonitorCode(C27702b.f69215L).tracing(C27727a.this.f69294a).timing().flush();
                            return;
                        }
                    }
                    C28184h.m103248b("WorkplaceTemplateService#Api", "downloadTemplate>>> template is null");
                    mo98870a(a, C27702b.f69216M, sendHttpResponse, bVar, "-1003", C27727a.this.f69294a);
                    aVar.mo98901a();
                } catch (Exception unused) {
                    mo98870a(a, C27702b.f69216M, sendHttpResponse, bVar, "-1001", C27727a.this.f69294a);
                    aVar.mo98901a();
                }
            }
        });
    }
}
