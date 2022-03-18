package com.ss.android.lark.core.p1772j.p1773a;

import com.ss.android.lark.biz.core.api.ar;
import com.ss.android.lark.main.interfaces.AbstractC44505h;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.core.j.a.d */
public class C36175d implements AbstractC44136a.AbstractC44169v {

    /* renamed from: a */
    private static Map<AbstractC44505h, ar> f93397a = new ConcurrentHashMap();

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44169v
    /* renamed from: a */
    public boolean mo133393a() {
        return SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186574g();
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44169v
    /* renamed from: a */
    public void mo133392a(final AbstractC44505h hVar) {
        if (hVar != null) {
            C361761 r0 = new ar() {
                /* class com.ss.android.lark.core.p1772j.p1773a.C36175d.C361761 */

                @Override // com.ss.android.lark.biz.core.api.ar
                /* renamed from: a */
                public void mo105603a(boolean z) {
                    hVar.mo157423a(z);
                }
            };
            SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186545a(r0);
            f93397a.put(hVar, r0);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44169v
    /* renamed from: b */
    public void mo133394b(AbstractC44505h hVar) {
        if (hVar != null) {
            SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186558b(f93397a.remove(hVar));
        }
    }
}
