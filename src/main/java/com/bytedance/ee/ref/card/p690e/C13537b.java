package com.bytedance.ee.ref.card.p690e;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import com.bytedance.ee.ref.card.p687b.C13523c;
import com.google.gson.Gson;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.tt.miniapphost.p3371e.AbstractC67510c;
import com.tt.refer.common.pkg.PackageEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.ee.ref.card.e.b */
public class C13537b extends AbstractC67510c {

    /* renamed from: b */
    private static C48924d f35634b;

    /* renamed from: c */
    private CardAppInfo f35635c;

    /* renamed from: d */
    private C13523c.C13524a f35636d;

    /* renamed from: e */
    private PackageEntity f35637e;

    /* renamed from: f */
    private List<CardAppInfo> f35638f;

    /* renamed from: g */
    private List<C13523c.C13524a> f35639g;

    /* renamed from: b */
    public static C48924d m54952b() {
        if (f35634b == null) {
            synchronized (C13537b.class) {
                if (f35634b == null) {
                    f35634b = m262592c();
                }
            }
        }
        return f35634b;
    }

    @Override // com.tt.miniapphost.p3371e.AbstractC67510c
    /* renamed from: a */
    public HashMap<String, Object> mo50294a() {
        HashMap<String, Object> a = super.mo50294a();
        CardAppInfo cardAppInfo = this.f35635c;
        if (cardAppInfo != null) {
            a.put("app_id", cardAppInfo.getAppId());
            a.put("card_id", this.f35635c.getIdentifier());
        } else {
            C13523c.C13524a aVar = this.f35636d;
            if (aVar != null) {
                a.put("app_id", aVar.getAppId());
                a.put("card_id", this.f35636d.getIdentifier());
            } else {
                PackageEntity packageEntity = this.f35637e;
                if (packageEntity != null) {
                    a.put("app_id", packageEntity.getAppId());
                    a.put("card_id", this.f35637e.getIdentifier());
                } else if (this.f35638f != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (CardAppInfo cardAppInfo2 : this.f35638f) {
                        if (cardAppInfo2 != null) {
                            arrayList.add(cardAppInfo2.getAppId());
                            arrayList.add(cardAppInfo2.getIdentifier());
                        }
                    }
                    Gson gson = new Gson();
                    a.put("app_ids", gson.toJson(arrayList));
                    a.put("card_ids", gson.toJson(arrayList2));
                } else if (this.f35639g != null) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (C13523c.C13524a aVar2 : this.f35639g) {
                        if (aVar2 != null) {
                            arrayList3.add(aVar2.getAppId());
                            arrayList3.add(aVar2.getIdentifier());
                        }
                    }
                    Gson gson2 = new Gson();
                    a.put("app_ids", gson2.toJson(arrayList3));
                    a.put("card_ids", gson2.toJson(arrayList4));
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public C13537b mo50290a(C13523c.C13524a aVar) {
        this.f35636d = aVar;
        return this;
    }

    /* renamed from: b */
    public C13537b mo50295b(List<C13523c.C13524a> list) {
        this.f35639g = list;
        return this;
    }

    /* renamed from: a */
    public C13537b mo50291a(CardAppInfo cardAppInfo) {
        this.f35635c = cardAppInfo;
        return this;
    }

    /* renamed from: a */
    public C13537b mo50292a(PackageEntity packageEntity) {
        this.f35637e = packageEntity;
        return this;
    }

    /* renamed from: a */
    public C13537b mo50293a(List<CardAppInfo> list) {
        this.f35638f = list;
        return this;
    }

    public C13537b(String str, OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        super(m54952b(), str, oPMonitorCode, iAppContext);
    }
}
