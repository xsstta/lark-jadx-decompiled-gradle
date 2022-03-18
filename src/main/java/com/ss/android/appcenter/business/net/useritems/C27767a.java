package com.ss.android.appcenter.business.net.useritems;

import android.content.Context;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
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
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28186i;
import com.ss.android.appcenter.common.util.C28196n;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.tt.miniapp.util.ACache;

/* renamed from: com.ss.android.appcenter.business.net.useritems.a */
public class C27767a extends C27714b {

    /* renamed from: a */
    public Context f69372a;

    /* renamed from: b */
    public C1177w<UserItemsData> f69373b = new C1177w<>();

    /* renamed from: c */
    public boolean f69374c;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo99082g() {
        return "GetUserItems";
    }

    /* renamed from: d */
    public LiveData<UserItemsData> mo99079d() {
        return this.f69373b;
    }

    /* renamed from: e */
    public void mo99080e() {
        C28196n.m103272a((C28196n.AbstractRunnableC28201b) new C28196n.AbstractC28200a<UserItemsData>() {
            /* class com.ss.android.appcenter.business.net.useritems.C27767a.C277681 */

            /* renamed from: a */
            public UserItemsData mo98233b() {
                try {
                    return (UserItemsData) new Gson().fromJson(ACache.m261150a(C27767a.this.f69372a, C27767a.this.mo99082g()).mo233093a(C27767a.this.mo99083h()), new TypeToken<UserItemsData>() {
                        /* class com.ss.android.appcenter.business.net.useritems.C27767a.C277681.C277691 */
                    }.getType());
                } catch (ACache.CacheException e) {
                    C28184h.m103247a("GetUserItems", C27580h.m100668c(), e);
                    return null;
                }
            }

            /* renamed from: a */
            public void mo98231a(UserItemsData userItemsData) {
                if (userItemsData != null && !C27767a.this.f69374c) {
                    C27767a.this.f69373b.mo5926a(userItemsData);
                    C28184h.m103250d("GetUserItems", C27580h.m100669d());
                }
            }
        });
    }

    /* renamed from: f */
    public void mo99081f() {
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        if (C27548m.m100547m().mo98225i() == null) {
            this.f69373b.mo5926a((UserItemsData) null);
        } else {
            C27711a.m101339b(C27548m.m100547m().mo98225i().mo98187a("lark.appcenter.block.display"), new AbstractC27713a() {
                /* class com.ss.android.appcenter.business.net.useritems.C27767a.C277702 */

                @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
                /* renamed from: a */
                public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                    mo98874a("GetUserItems", C27580h.m100661a(bVar.f69282a, errorResult), errorResult, C27767a.this.f69373b, a, C27702b.f69248s);
                }

                @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
                /* renamed from: a */
                public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                    C27767a.this.f69374c = true;
                    String str = sendHttpResponse.json_body;
                    try {
                        Gson gson = new Gson();
                        UserItemsResponse userItemsResponse = (UserItemsResponse) gson.fromJson(str, UserItemsResponse.class);
                        if (userItemsResponse != null && userItemsResponse.getCode() == 0) {
                            if (userItemsResponse.getData() != null) {
                                UserItemsData data = userItemsResponse.getData();
                                mo98872a("GetUserItems", C27767a.this.f69373b, data, a, C27702b.f69247r);
                                ACache.m261150a(C27767a.this.f69372a, C27767a.this.mo99082g()).mo233095a(C27767a.this.mo99083h(), gson.toJson(data));
                                return;
                            }
                        }
                        mo98873a("GetUserItems", C27580h.m100663a(bVar.f69282a, bVar.f69283b, str), C27767a.this.f69373b, a, C27702b.f69248s);
                    } catch (JsonSyntaxException e) {
                        mo98874a("GetUserItems", C27580h.m100667b(bVar.f69282a, bVar.f69283b, str), e, C27767a.this.f69373b, a, C27702b.f69248s);
                    } catch (ACache.CacheException e2) {
                        C28184h.m103247a("GetUserItems", C27580h.m100665b(), e2);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo99083h() {
        return C28186i.m103256a(C27548m.m100547m().mo98221e().mo98213b() + C28183g.m103240a());
    }

    public C27767a(Context context) {
        this.f69372a = context;
    }
}
