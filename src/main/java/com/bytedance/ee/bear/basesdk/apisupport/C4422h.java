package com.bytedance.ee.bear.basesdk.apisupport;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ee.bear.basesdk.api.AbstractC4382g;
import com.bytedance.ee.bear.contract.route.lark.SpaceRouteBean;
import com.bytedance.ee.log.C13479a;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.h */
final class C4422h implements AbstractC4382g {

    /* renamed from: a */
    private final AbstractC4431q f13050a;

    /* renamed from: b */
    private final AbstractC4382g f13051b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public boolean mo17048a(String str, String str2, String str3) {
        C13479a.m54764b("Apisupport", "api call: canOpen");
        return this.f13051b.mo17048a(str, str2, str3);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public boolean mo17049a(String str, Map<String, String> map) {
        C13479a.m54764b("Apisupport", "api call: open");
        this.f13050a.mo17158a();
        return this.f13051b.mo17049a(str, map);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public void mo17041a() {
        C13479a.m54764b("Apisupport", "api call: preloadTemplate");
        this.f13050a.mo17158a();
        this.f13051b.mo17041a();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public void mo17043a(AbstractC4382g.AbstractC4383a aVar) {
        C13479a.m54764b("Apisupport", "api call: setOnWebViewCreateListener");
        this.f13051b.mo17043a(aVar);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public String mo17040a(String str) {
        C13479a.m54764b("Apisupport", "api call: getDocType");
        this.f13050a.mo17158a();
        return this.f13051b.mo17040a(str);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: b */
    public String mo17050b(String str) {
        C13479a.m54764b("Apisupport", "api call: getDocToken");
        this.f13050a.mo17158a();
        return this.f13051b.mo17050b(str);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public void mo17042a(Activity activity) {
        C13479a.m54764b("Apisupport", "api call: createDoc");
        this.f13050a.mo17158a();
        this.f13051b.mo17042a(activity);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public void mo17044a(List<String> list) {
        C13479a.m54764b("Apisupport", "api call: preloadDocs");
        this.f13050a.mo17158a();
        this.f13051b.mo17044a(list);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public boolean mo17047a(SpaceRouteBean spaceRouteBean) {
        C13479a.m54764b("Apisupport", "api call: open");
        this.f13050a.mo17158a();
        return this.f13051b.mo17047a(spaceRouteBean);
    }

    C4422h(AbstractC4431q qVar, AbstractC4382g gVar) {
        this.f13050a = qVar;
        this.f13051b = gVar;
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: b */
    public void mo17051b(String str, String str2, String str3) {
        C13479a.m54764b("Apisupport", "api call: jumpSearch");
        this.f13050a.mo17158a();
        this.f13051b.mo17051b(str, str2, str3);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public boolean mo17046a(Context context, String str, Map<String, String> map) {
        C13479a.m54764b("Apisupport", "api call: open");
        this.f13050a.mo17158a();
        return this.f13051b.mo17046a(context, str, map);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public boolean mo17045a(Context context, String str, int i, int i2, Map<String, String> map) {
        C13479a.m54764b("Apisupport", "api call: open");
        this.f13050a.mo17158a();
        return this.f13051b.mo17045a(context, str, i, i2, map);
    }
}
