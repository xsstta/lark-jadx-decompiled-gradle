package com.ss.android.lark.integrator.ccm.config.p2011e;

import com.ss.android.lark.integrator.ccm.p2006c.C39242e;
import com.ss.android.lark.preload.AbstractC52220a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.ccm.config.e.a */
public class C39263a implements AbstractC52220a {
    @Override // com.ss.android.lark.preload.AbstractC52220a
    public void doPreload() {
        C53241h.m205898b("DocsIdlePreloadAction", "shouldDocsIdlePreload true");
        C39242e.m154771a().mo143080a(LarkContext.getApplication(), 0);
        UserSP.getInstance().putBoolean("docs_idle_preload_hit_rate", true);
    }
}
