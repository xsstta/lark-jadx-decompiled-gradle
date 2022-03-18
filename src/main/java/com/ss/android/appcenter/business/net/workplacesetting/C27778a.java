package com.ss.android.appcenter.business.net.workplacesetting;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C1174u;
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
import com.ss.android.appcenter.common.util.C28186i;
import com.ss.android.appcenter.common.util.C28196n;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.tt.miniapp.util.ACache;

/* renamed from: com.ss.android.appcenter.business.net.workplacesetting.a */
public class C27778a {

    /* renamed from: a */
    public Context f69398a;

    /* renamed from: b */
    public C1174u<WorkplaceSetting> f69399b = new C1174u<>();

    /* renamed from: c */
    public boolean f69400c;

    /* renamed from: d */
    public String mo99150d() {
        return "GetWorkplaceSetting";
    }

    /* renamed from: a */
    public C1174u<WorkplaceSetting> mo99147a() {
        return this.f69399b;
    }

    /* renamed from: b */
    public void mo99148b() {
        C28196n.m103272a((C28196n.AbstractRunnableC28201b) new C28196n.AbstractC28200a<WorkplaceSetting>() {
            /* class com.ss.android.appcenter.business.net.workplacesetting.C27778a.C277791 */

            /* renamed from: a */
            public WorkplaceSetting mo98233b() {
                try {
                    return (WorkplaceSetting) new Gson().fromJson(ACache.m261150a(C27778a.this.f69398a, C27778a.this.mo99150d()).mo233093a(C27778a.this.mo99151e()), WorkplaceSetting.class);
                } catch (ACache.CacheException e) {
                    C28184h.m103247a("GetWorkplaceSetting", C27580h.m100668c(), e);
                    return null;
                }
            }

            /* renamed from: a */
            public void mo98231a(WorkplaceSetting workplaceSetting) {
                if (workplaceSetting != null && !C27778a.this.f69400c) {
                    C27778a.this.f69399b.mo5926a(workplaceSetting);
                    C28184h.m103250d("GetWorkplaceSetting", C27580h.m100669d());
                }
            }
        });
    }

    /* renamed from: c */
    public void mo99149c() {
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101337b(new AbstractC27713a() {
            /* class com.ss.android.appcenter.business.net.workplacesetting.C27778a.C277802 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                mo98874a("GetWorkplaceSetting", C27580h.m100661a(bVar.f69282a, errorResult), errorResult, C27778a.this.f69399b, a, C27702b.f69208E);
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                C27778a.this.f69400c = true;
                String str = sendHttpResponse.json_body;
                try {
                    Gson gson = new Gson();
                    C27781b bVar2 = (C27781b) gson.fromJson(str, C27781b.class);
                    if (!(bVar2 == null || bVar2.mo99154a() != 0 || bVar2.mo99155b() == null)) {
                        if (!TextUtils.isEmpty(bVar2.mo99155b().getWorkplaceSetting())) {
                            WorkplaceSetting workplaceSetting = (WorkplaceSetting) new Gson().fromJson(bVar2.mo99155b().getWorkplaceSetting(), WorkplaceSetting.class);
                            if (workplaceSetting == null) {
                                mo98873a("GetWorkplaceSetting", C27580h.m100663a(bVar.f69282a, bVar.f69283b, str), C27778a.this.f69399b, a, C27702b.f69208E);
                                return;
                            }
                            mo98872a("GetWorkplaceSetting", C27778a.this.f69399b, workplaceSetting, a, C27702b.f69207D);
                            ACache.m261150a(C27778a.this.f69398a, C27778a.this.mo99150d()).mo233095a(C27778a.this.mo99151e(), gson.toJson(bVar2.mo99155b()));
                            return;
                        }
                    }
                    mo98873a("GetWorkplaceSetting", C27580h.m100663a(bVar.f69282a, bVar.f69283b, str), C27778a.this.f69399b, a, C27702b.f69208E);
                } catch (JsonSyntaxException e) {
                    mo98874a("GetWorkplaceSetting", C27580h.m100667b(bVar.f69282a, bVar.f69283b, str), e, C27778a.this.f69399b, a, C27702b.f69208E);
                } catch (ACache.CacheException e2) {
                    C28184h.m103247a("GetWorkplaceSetting", C27580h.m100665b(), e2);
                }
            }
        });
    }

    /* renamed from: e */
    public String mo99151e() {
        return C28186i.m103256a(C27548m.m100547m().mo98221e().mo98213b());
    }

    public C27778a(Context context) {
        this.f69398a = context;
    }
}
