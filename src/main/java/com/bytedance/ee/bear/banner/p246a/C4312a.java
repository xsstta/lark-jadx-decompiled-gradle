package com.bytedance.ee.bear.banner.p246a;

import android.view.View;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.ug.banner.BannerHandler;

/* renamed from: com.bytedance.ee.bear.banner.a.a */
public class C4312a implements BannerHandler {

    /* renamed from: a */
    protected final String f12913a = ("DocsBanner_" + getClass().getSimpleName());

    @Override // com.ss.android.lark.ug.banner.BannerHandler
    /* renamed from: a */
    public boolean mo16910a(View view) {
        C13479a.m54764b(this.f12913a, "onBannerClose()...");
        return false;
    }

    @Override // com.ss.android.lark.ug.banner.BannerHandler
    /* renamed from: a */
    public boolean mo16911a(View view, String str) {
        String a = C13598b.m55191a(str);
        String str2 = this.f12913a;
        C13479a.m54764b(str2, "onBannerClick()... url = " + a);
        return true;
    }
}
