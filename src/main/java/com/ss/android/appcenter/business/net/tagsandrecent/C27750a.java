package com.ss.android.appcenter.business.net.tagsandrecent;

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
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28186i;
import com.ss.android.appcenter.common.util.C28196n;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.tt.miniapp.util.ACache;

/* renamed from: com.ss.android.appcenter.business.net.tagsandrecent.a */
public class C27750a extends C27714b {

    /* renamed from: a */
    public Context f69337a;

    /* renamed from: b */
    public C1177w<TagsAndRecentData> f69338b = new C1177w<>();

    /* renamed from: c */
    public boolean f69339c;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo99057g() {
        return "GetTagsAndRecent";
    }

    /* renamed from: d */
    public C1177w<TagsAndRecentData> mo99054d() {
        return this.f69338b;
    }

    /* renamed from: e */
    public void mo99055e() {
        C28196n.m103272a((C28196n.AbstractRunnableC28201b) new C28196n.AbstractC28200a<TagsAndRecentData>() {
            /* class com.ss.android.appcenter.business.net.tagsandrecent.C27750a.C277511 */

            /* renamed from: a */
            public TagsAndRecentData mo98233b() {
                try {
                    return (TagsAndRecentData) new Gson().fromJson(ACache.m261150a(C27750a.this.f69337a, C27750a.this.mo99057g()).mo233093a(C27750a.this.mo99058h()), new TypeToken<TagsAndRecentData>() {
                        /* class com.ss.android.appcenter.business.net.tagsandrecent.C27750a.C277511.C277521 */
                    }.getType());
                } catch (Exception e) {
                    C28184h.m103247a("GetTagsAndRecent", C27580h.m100668c(), e);
                    return null;
                }
            }

            /* renamed from: a */
            public void mo98231a(TagsAndRecentData tagsAndRecentData) {
                if (tagsAndRecentData != null && !C27750a.this.f69339c) {
                    C28184h.m103250d("GetTagsAndRecent", C27580h.m100669d());
                    C27750a.this.f69338b.mo5926a(tagsAndRecentData);
                }
            }
        });
    }

    /* renamed from: f */
    public void mo99056f() {
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        if (C27548m.m100547m().mo98216a() == null) {
            this.f69338b.mo5926a((TagsAndRecentData) null);
        } else {
            C27711a.m101342c(C27548m.m100547m().mo98225i().mo98187a("lark.appcenter.block.display"), new AbstractC27713a() {
                /* class com.ss.android.appcenter.business.net.tagsandrecent.C27750a.C277532 */

                @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
                /* renamed from: a */
                public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                    mo98874a("GetTagsAndRecent", C27580h.m100661a(bVar.f69282a, errorResult), errorResult, C27750a.this.f69338b, a, C27702b.f69252w);
                }

                @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
                /* renamed from: a */
                public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                    C27750a.this.f69339c = true;
                    String str = sendHttpResponse.json_body;
                    try {
                        Gson gson = new Gson();
                        TagsAndRecentResponse tagsAndRecentResponse = (TagsAndRecentResponse) gson.fromJson(str, TagsAndRecentResponse.class);
                        if (tagsAndRecentResponse != null && tagsAndRecentResponse.getCode() == 0) {
                            if (tagsAndRecentResponse.getData() != null) {
                                TagsAndRecentData data = tagsAndRecentResponse.getData();
                                mo98872a("GetTagsAndRecent", C27750a.this.f69338b, data, a, C27702b.f69251v);
                                ACache.m261150a(C27750a.this.f69337a, C27750a.this.mo99057g()).mo233095a(C27750a.this.mo99058h(), gson.toJson(data));
                                return;
                            }
                        }
                        mo98873a("GetTagsAndRecent", C27580h.m100663a(bVar.f69282a, bVar.f69283b, str), C27750a.this.f69338b, a, C27702b.f69252w);
                    } catch (JsonSyntaxException e) {
                        mo98874a("GetTagsAndRecent", C27580h.m100667b(bVar.f69282a, bVar.f69283b, str), e, C27750a.this.f69338b, a, C27702b.f69252w);
                    } catch (ACache.CacheException e2) {
                        C28184h.m103247a("GetTagsAndRecent", C27580h.m100665b(), e2);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo99058h() {
        return C28186i.m103256a(C27548m.m100547m().mo98221e().mo98213b() + C28183g.m103240a());
    }

    public C27750a(Context context) {
        this.f69337a = context;
    }
}
