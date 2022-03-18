package com.ss.android.appcenter.business.net.workplacehome;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1174u;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode;
import com.bytedance.lark.pb.openplatform.v1.SaveOpenAppBadgeNodeResponse;
import com.google.gson.JsonSyntaxException;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.C27718b;
import com.ss.android.appcenter.business.net.dto.AppBadgeNode;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.p1270a.AbstractC27713a;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1265a.C27568a;
import com.ss.android.appcenter.business.p1265a.C27569b;
import com.ss.android.appcenter.business.p1265a.C27579g;
import com.ss.android.appcenter.business.p1265a.C27580h;
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28186i;
import com.ss.android.appcenter.common.util.C28196n;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27534b;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.tt.miniapp.util.ACache;
import com.tt.refer.impl.business.p3427a.p3428a.C67869a;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.net.workplacehome.a */
public class C27771a {

    /* renamed from: d */
    private static C27771a f69379d;

    /* renamed from: a */
    public C1174u<WorkplaceHomeData> f69380a = new C1174u<>();

    /* renamed from: b */
    public boolean f69381b;

    /* renamed from: c */
    private final C67869a.AbstractC67871a f69382c;

    /* renamed from: b */
    public void mo99118b() {
        this.f69381b = false;
    }

    /* renamed from: g */
    public String mo99123g() {
        return "GetWorkplaceHome";
    }

    /* renamed from: c */
    public C1174u<WorkplaceHomeData> mo99119c() {
        return this.f69380a;
    }

    /* renamed from: i */
    private void m101490i() {
        this.f69380a.mo5925a(new AbstractC1178x() {
            /* class com.ss.android.appcenter.business.net.workplacehome.$$Lambda$a$iKmwg8fCDjY9Q2qNpYmZGwjkIag */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C27771a.lambda$iKmwg8fCDjY9Q2qNpYmZGwjkIag(C27771a.this, (WorkplaceHomeData) obj);
            }
        });
    }

    /* renamed from: d */
    public void mo99120d() {
        C28196n.m103272a((C28196n.AbstractRunnableC28201b) new C28196n.AbstractC28200a<WorkplaceHomeData>() {
            /* class com.ss.android.appcenter.business.net.workplacehome.C27771a.C277721 */

            /* renamed from: a */
            public WorkplaceHomeData mo98233b() {
                try {
                    WorkplaceHomeData workplaceHomeData = (WorkplaceHomeData) C27579g.f68797a.fromJson(ACache.m261150a(C27528a.m100471a().mo98143b(), C27771a.this.mo99123g()).mo233093a(C27771a.this.mo99124h()), WorkplaceHomeData.class);
                    if (workplaceHomeData != null) {
                        workplaceHomeData.parseBadges();
                    }
                    return workplaceHomeData;
                } catch (ACache.CacheException e) {
                    C28184h.m103247a("GetWorkplaceHome", C27580h.m100668c(), e);
                    return null;
                }
            }

            @Override // com.ss.android.appcenter.common.util.C28196n.AbstractRunnableC28201b, com.ss.android.appcenter.common.util.C28196n.AbstractC28200a
            /* renamed from: a */
            public void mo99127a(Throwable th) {
                C27568a.m100610a(3, null, false, "WorkplaceHome load local failed:" + th);
            }

            /* renamed from: a */
            public void mo98231a(WorkplaceHomeData workplaceHomeData) {
                if (workplaceHomeData != null) {
                    if (!C27771a.this.f69381b) {
                        workplaceHomeData.setFromCache(true);
                        C27771a.this.f69380a.mo5926a(workplaceHomeData);
                        C28184h.m103250d("GetWorkplaceHome", C27580h.m100669d());
                    }
                    C27568a.m100610a(3, workplaceHomeData.rawBadgeNodes(), true, "");
                }
            }
        });
    }

    /* renamed from: e */
    public void mo99121e() {
        C27718b.m101366a("GetWorkplaceHome", new Runnable() {
            /* class com.ss.android.appcenter.business.net.workplacehome.C27771a.RunnableC277732 */

            public void run() {
                C27771a.this.mo99122f();
            }
        });
    }

    private C27771a() {
        $$Lambda$a$XGTSBLNujyev5tT7B655PkHJjoQ r0 = new C67869a.AbstractC67871a() {
            /* class com.ss.android.appcenter.business.net.workplacehome.$$Lambda$a$XGTSBLNujyev5tT7B655PkHJjoQ */

            @Override // com.tt.refer.impl.business.p3427a.p3428a.C67869a.AbstractC67871a
            public final void onBadgePush(List list, boolean z, boolean z2) {
                C27771a.lambda$XGTSBLNujyev5tT7B655PkHJjoQ(C27771a.this, list, z, z2);
            }
        };
        this.f69382c = r0;
        m101490i();
        C67869a.m264034a().mo235508a(r0);
    }

    /* renamed from: a */
    public static synchronized C27771a m101486a() {
        C27771a aVar;
        synchronized (C27771a.class) {
            if (f69379d == null) {
                f69379d = new C27771a();
            }
            aVar = f69379d;
        }
        return aVar;
    }

    /* renamed from: f */
    public void mo99122f() {
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101336a(C27548m.m100547m().mo98225i().mo98187a("lark.appcenter.block.display"), new AbstractC27713a() {
            /* class com.ss.android.appcenter.business.net.workplacehome.C27771a.C277743 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                C27568a.m100610a(4, null, false, errorResult.toString());
                C27718b.m101365a("GetWorkplaceHome");
                mo98874a("GetWorkplaceHome", C27580h.m100661a(bVar.f69282a, errorResult), errorResult, C27771a.this.f69380a, a, C27702b.f69233d);
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                C27718b.m101365a("GetWorkplaceHome");
                C27771a.this.f69381b = true;
                String str = sendHttpResponse.json_body;
                try {
                    WorkplaceHomeResponse workplaceHomeResponse = (WorkplaceHomeResponse) C27579g.f68797a.fromJson(str, WorkplaceHomeResponse.class);
                    if (workplaceHomeResponse != null && workplaceHomeResponse.getCode() == 0) {
                        if (workplaceHomeResponse.getData() != null) {
                            WorkplaceHomeData data = workplaceHomeResponse.getData();
                            data.parseBadges();
                            mo98872a("GetWorkplaceHome", C27771a.this.f69380a, data, a, C27702b.f69232c);
                            C27771a.this.mo99117a(data);
                            ACache.m261150a(C27528a.m100471a().mo98143b(), C27771a.this.mo99123g()).mo233095a(C27771a.this.mo99124h(), C27579g.f68797a.toJson(data));
                            return;
                        }
                    }
                    mo98873a("GetWorkplaceHome", C27580h.m100663a(bVar.f69282a, bVar.f69283b, str), C27771a.this.f69380a, a, C27702b.f69233d);
                    C27568a.m100610a(4, null, false, "response's data is empty");
                } catch (JsonSyntaxException e) {
                    mo98874a("GetWorkplaceHome", C27580h.m100667b(bVar.f69282a, bVar.f69283b, str), e, C27771a.this.f69380a, a, C27702b.f69233d);
                    C27568a.m100610a(4, null, false, e.toString());
                } catch (ACache.CacheException e2) {
                    C28184h.m103247a("GetWorkplaceHome", C27580h.m100665b(), e2);
                    C27568a.m100610a(4, null, false, e2.toString());
                }
            }
        });
    }

    /* renamed from: h */
    public String mo99124h() {
        return C28186i.m103256a(C27548m.m100547m().mo98221e().mo98213b() + C28183g.m103240a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m101489b(WorkplaceHomeData workplaceHomeData) {
        if (workplaceHomeData != null) {
            m101487a(workplaceHomeData.badgeSum());
        }
    }

    /* renamed from: a */
    private void m101487a(int i) {
        AbstractC27534b l;
        if (C27569b.m100618a() && (l = C27548m.m100547m().mo98228l()) != null) {
            l.mo98166a(i);
        }
    }

    /* renamed from: a */
    public void mo99117a(WorkplaceHomeData workplaceHomeData) {
        if (C27569b.m100618a() && workplaceHomeData != null) {
            final List<OpenAppBadgeNode> rawBadgeNodes = workplaceHomeData.rawBadgeNodes();
            C67869a.m264039a(rawBadgeNodes, new IGetDataCallback<SaveOpenAppBadgeNodeResponse>() {
                /* class com.ss.android.appcenter.business.net.workplacehome.C27771a.C277754 */

                /* renamed from: a */
                public void onSuccess(SaveOpenAppBadgeNodeResponse saveOpenAppBadgeNodeResponse) {
                    C28184h.m103250d("app-center:ApiGetWorkplaceHome", "saveAppBadges success:" + saveOpenAppBadgeNodeResponse.toString());
                    C27568a.m100613a((List<OpenAppBadgeNode>) rawBadgeNodes, true, "");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C28184h.m103248b("app-center:ApiGetWorkplaceHome", "saveAppBadges error:" + errorResult);
                    C27568a.m100613a((List<OpenAppBadgeNode>) rawBadgeNodes, false, errorResult.toString());
                }
            });
            C27568a.m100610a(4, rawBadgeNodes, true, "");
        }
    }

    /* renamed from: a */
    public void mo99116a(ItemInfo itemInfo, boolean z) {
        WorkplaceHomeData b = this.f69380a.mo5927b();
        if (b != null && b.dealItemCommonStatusChanged(itemInfo, z)) {
            this.f69380a.mo5929b(b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m101488a(List<OpenAppBadgeNode> list, boolean z, boolean z2) {
        if (C27569b.m100618a() && list != null && !list.isEmpty()) {
            C27568a.m100612a(list);
            WorkplaceHomeData b = this.f69380a.mo5927b();
            if (b != null) {
                boolean z3 = false;
                for (OpenAppBadgeNode openAppBadgeNode : list) {
                    boolean updateBadge = b.updateBadge(AppBadgeNode.fromRawAppBadgeNode(openAppBadgeNode));
                    if (!z3 && updateBadge) {
                        z3 = true;
                    }
                }
                if (z3) {
                    this.f69380a.mo5926a(b);
                    m101487a(b.badgeSum());
                    try {
                        ACache.m261150a(C27528a.m100471a().mo98143b(), mo99123g()).mo233095a(mo99124h(), C27579g.f68797a.toJson(b));
                    } catch (ACache.CacheException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
