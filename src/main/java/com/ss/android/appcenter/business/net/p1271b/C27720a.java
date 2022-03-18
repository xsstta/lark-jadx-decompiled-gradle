package com.ss.android.appcenter.business.net.p1271b;

import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1265a.C27580h;
import com.ss.android.appcenter.common.util.C28184h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.appcenter.business.net.b.a */
public class C27720a {

    /* renamed from: com.ss.android.appcenter.business.net.b.a$a */
    public interface AbstractC27723a {
        /* renamed from: a */
        void mo98302a(boolean z);
    }

    /* renamed from: a */
    public static void m101369a(final String str, final AbstractC27723a aVar) {
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101338b(str, new C27714b.AbstractC27716a() {
            /* class com.ss.android.appcenter.business.net.p1271b.C27720a.C277211 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                aVar.mo98302a(false);
                String a = C27580h.m100661a(bVar.f69282a, errorResult);
                C28184h.m103247a("AddCommonItem", a + "itemId:" + str, errorResult);
                a.setMonitorCode(C27702b.f69254y).setError(errorResult).setErrorMessage(a).timing().flush();
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                String str = sendHttpResponse.json_body;
                try {
                    if (new JSONObject(str).getInt("code") == 0) {
                        aVar.mo98302a(true);
                        C28184h.m103250d("AddCommonItem", C27580h.m100660a() + "itemId:" + str);
                        a.setMonitorCode(C27702b.f69253x).timing().flush();
                        return;
                    }
                    aVar.mo98302a(false);
                    String a = C27580h.m100663a(bVar.f69282a, bVar.f69283b, str);
                    C28184h.m103248b("AddCommonItem", a + "itemId:" + str);
                    a.setMonitorCode(C27702b.f69254y).setErrorMessage(a).timing().flush();
                } catch (JSONException unused) {
                    String b = C27580h.m100667b(bVar.f69282a, bVar.f69283b, str);
                    C28184h.m103248b("AddCommonItem", b + "itemId:" + str);
                    aVar.mo98302a(false);
                    a.setMonitorCode(C27702b.f69254y).setErrorMessage(b).timing().flush();
                }
            }
        });
    }

    /* renamed from: b */
    public static void m101370b(final String str, final AbstractC27723a aVar) {
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101341c(str, new C27714b.AbstractC27716a() {
            /* class com.ss.android.appcenter.business.net.p1271b.C27720a.C277222 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                aVar.mo98302a(false);
                String a = C27580h.m100661a(bVar.f69282a, errorResult);
                C28184h.m103247a("DeleteCommonItem", a + "itemId:" + str, errorResult);
                a.setMonitorCode(C27702b.f69204A).setError(errorResult).setErrorMessage(a).timing().flush();
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                String str = sendHttpResponse.json_body;
                try {
                    if (new JSONObject(str).getInt("code") == 0) {
                        aVar.mo98302a(true);
                        C28184h.m103250d("DeleteCommonItem", C27580h.m100660a() + "itemId:" + str);
                        a.setMonitorCode(C27702b.f69255z).timing().flush();
                        return;
                    }
                    aVar.mo98302a(false);
                    String a = C27580h.m100663a(bVar.f69282a, bVar.f69283b, str);
                    C28184h.m103248b("DeleteCommonItem", a + "itemId:" + str);
                    a.setMonitorCode(C27702b.f69204A).setErrorMessage(a).timing().flush();
                } catch (JSONException unused) {
                    String b = C27580h.m100667b(bVar.f69282a, bVar.f69283b, str);
                    C28184h.m103248b("DeleteCommonItem", b + "itemId:" + str);
                    aVar.mo98302a(false);
                    a.setMonitorCode(C27702b.f69204A).setErrorMessage(b).timing().flush();
                }
            }
        });
    }
}
