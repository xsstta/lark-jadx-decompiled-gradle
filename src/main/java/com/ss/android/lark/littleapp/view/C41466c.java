package com.ss.android.lark.littleapp.view;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.p653g.AbstractC13062a;
import com.bytedance.ee.larkbrand.p653g.C13063b;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.log.Log;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.refer.impl.business.p3433d.AbstractC67905a;

/* renamed from: com.ss.android.lark.littleapp.view.c */
public class C41466c {
    /* renamed from: a */
    public static AbstractC13062a m164526a(String str, int i, Context context, final String str2) {
        AppBrandLogger.m52830i("GadgetTabFragmentFactory", "gadget app for tab : " + str);
        long currentTimeMillis = System.currentTimeMillis();
        C41354g.m163939a().checkInitMainGadget();
        new AppInfoEntity().appId = str;
        C13063b a = C13063b.m53576a(str, i);
        a.mo49113a(new AbstractC67905a() {
            /* class com.ss.android.lark.littleapp.view.C41466c.C414671 */

            @Override // com.tt.refer.impl.business.p3433d.AbstractC67905a
            /* renamed from: a */
            public void mo149244a() {
                Log.m165389i("GadgetTabFragmentFactory", "onFirstFrameDraw");
                C41354g.m163939a().getMainDependency().mo144243c(str2);
            }

            @Override // com.tt.refer.impl.business.p3433d.AbstractC67905a
            /* renamed from: b */
            public void mo149245b() {
                Log.m165389i("GadgetTabFragmentFactory", "onFirstFrameShow");
                C41354g.m163939a().getMainDependency().mo144244d(str2);
            }
        });
        AppBrandLogger.m52828d("GadgetTabFragmentFactory", "newInstance " + (System.currentTimeMillis() - currentTimeMillis));
        return a;
    }
}
