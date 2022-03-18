package com.ss.android.appcenter.business.net.searchitem;

import android.content.Context;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
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

/* renamed from: com.ss.android.appcenter.business.net.searchitem.b */
public class C27743b {

    /* renamed from: a */
    public Context f69327a;

    /* renamed from: b */
    public C1177w<SearchItemData> f69328b = new C1177w<>();

    /* renamed from: c */
    public boolean f69329c;

    /* renamed from: d */
    private String f69330d;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo99036c() {
        return "SearchItemByTag";
    }

    /* renamed from: a */
    public C1177w<SearchItemData> mo99033a() {
        return this.f69328b;
    }

    /* renamed from: b */
    public void mo99035b() {
        C28196n.m103272a((C28196n.AbstractRunnableC28201b) new C28196n.AbstractC28200a<SearchItemData>() {
            /* class com.ss.android.appcenter.business.net.searchitem.C27743b.C277441 */

            /* renamed from: a */
            public SearchItemData mo98233b() {
                try {
                    return (SearchItemData) new Gson().fromJson(ACache.m261150a(C27743b.this.f69327a, C27743b.this.mo99036c()).mo233093a(C27743b.this.mo99037d()), new TypeToken<SearchItemData>() {
                        /* class com.ss.android.appcenter.business.net.searchitem.C27743b.C277441.C277451 */
                    }.getType());
                } catch (Exception e) {
                    C28184h.m103247a("SearchItemByTag", C27580h.m100668c(), e);
                    return null;
                }
            }

            /* renamed from: a */
            public void mo98231a(SearchItemData searchItemData) {
                if (searchItemData != null && !C27743b.this.f69329c) {
                    C27743b.this.f69328b.mo5926a(searchItemData);
                    C28184h.m103250d("SearchItemByTag", C27580h.m100669d());
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo99037d() {
        return C28186i.m103256a(C27548m.m100547m().mo98221e().mo98213b() + this.f69330d);
    }

    /* renamed from: a */
    public void mo99034a(String str) {
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101345e(str, new AbstractC27713a() {
            /* class com.ss.android.appcenter.business.net.searchitem.C27743b.C277462 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                mo98874a("SearchItemByTag", C27580h.m100661a(bVar.f69282a, errorResult), errorResult, C27743b.this.f69328b, a, C27702b.f69250u);
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                C27743b.this.f69329c = true;
                String str = sendHttpResponse.json_body;
                try {
                    Gson gson = new Gson();
                    SearchItemResponse searchItemResponse = (SearchItemResponse) gson.fromJson(str, SearchItemResponse.class);
                    if (searchItemResponse != null && searchItemResponse.getCode() == 0) {
                        if (searchItemResponse.getData() != null) {
                            SearchItemData data = searchItemResponse.getData();
                            mo98872a("SearchItemByTag", C27743b.this.f69328b, data, a, C27702b.f69249t);
                            ACache.m261150a(C27743b.this.f69327a, C27743b.this.mo99036c()).mo233095a(C27743b.this.mo99037d(), gson.toJson(data));
                            return;
                        }
                    }
                    mo98873a("SearchItemByTag", C27580h.m100663a(bVar.f69282a, bVar.f69283b, str), C27743b.this.f69328b, a, C27702b.f69250u);
                } catch (JsonSyntaxException e) {
                    mo98874a("SearchItemByTag", C27580h.m100667b(bVar.f69282a, bVar.f69283b, str), e, C27743b.this.f69328b, a, C27702b.f69250u);
                } catch (ACache.CacheException e2) {
                    C28184h.m103247a("SearchItemByTag", C27580h.m100665b(), e2);
                }
            }
        });
    }

    public C27743b(Context context, String str) {
        this.f69327a = context;
        this.f69330d = str;
    }
}
