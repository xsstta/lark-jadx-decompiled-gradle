package com.ss.android.lark.audit;

import com.larksuite.framework.http.p1191f.C26003a;
import com.larksuite.framework.thread.ThreadFactoryC26153m;
import com.ss.android.lark.audit.db.AbstractC29318e;
import com.ss.android.lark.audit.http.AbstractC29334c;
import com.ss.android.lark.audit.http.AuditRequest;
import com.ss.android.lark.audit.http.AuditResponseData;
import com.ss.android.lark.audit.http.C29331a;
import com.ss.android.lark.audit.http.C29333b;
import com.ss.android.lark.audit.model.AuditEvent;
import com.ss.android.lark.log.Log;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ss.android.lark.audit.d */
public class C29308d {

    /* renamed from: a */
    private C29323e f73351a;

    /* renamed from: b */
    private ExecutorService f73352b;

    public C29308d(AbstractC29324f fVar) {
        m107740a(fVar);
    }

    /* renamed from: a */
    public void mo103877a(AuditEvent auditEvent) {
        this.f73351a.mo103904a(auditEvent);
    }

    /* renamed from: a */
    private void m107740a(AbstractC29324f fVar) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC26153m("ws_recorder"));
        this.f73352b = newSingleThreadExecutor;
        C29323e eVar = new C29323e(newSingleThreadExecutor, fVar);
        this.f73351a = eVar;
        eVar.mo103903a(new AbstractC29318e<AuditEvent>() {
            /* class com.ss.android.lark.audit.C29308d.C293091 */

            @Override // com.ss.android.lark.audit.db.AbstractC29318e
            /* renamed from: a */
            public void mo103878a(List<AuditEvent> list, final AbstractC29334c<Boolean> cVar) {
                Log.m165389i("AuditRecordService", "processRecords " + C26003a.m94121a(list));
                AuditRequest auditRequest = new AuditRequest();
                auditRequest.events = list;
                C29331a.m107785a().mo103918a(auditRequest, new AbstractC29334c<AuditResponseData>() {
                    /* class com.ss.android.lark.audit.C29308d.C293091.C293101 */

                    /* renamed from: a */
                    public void mo103881a(AuditResponseData auditResponseData) {
                        String str;
                        AbstractC29334c cVar = cVar;
                        if (cVar != null) {
                            cVar.mo103881a((Object) true);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("upload audit data success: ");
                        if (auditResponseData != null) {
                            str = auditResponseData.successNum + "/" + auditResponseData.totalNum;
                        } else {
                            str = "null";
                        }
                        sb.append(str);
                        Log.m165389i("AuditRecordService", sb.toString());
                    }

                    @Override // com.ss.android.lark.audit.http.AbstractC29334c
                    /* renamed from: a */
                    public void mo103880a(C29333b bVar) {
                        AbstractC29334c cVar = cVar;
                        if (cVar != null) {
                            cVar.mo103881a((Object) false);
                        }
                        Log.m165383e("AuditRecordService", " upLoadAuditResponse error " + bVar.toString());
                    }
                });
            }
        });
    }
}
