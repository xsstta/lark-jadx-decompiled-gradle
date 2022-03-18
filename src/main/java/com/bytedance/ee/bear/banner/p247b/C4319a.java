package com.bytedance.ee.bear.banner.p247b;

import android.view.View;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.banner.export.AbstractC29483d;

/* renamed from: com.bytedance.ee.bear.banner.b.a */
public class C4319a implements AbstractC29483d {

    /* renamed from: a */
    protected final String f12924a = ("DocsBanner_" + getClass().getSimpleName());

    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16928a() {
        return true;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16929a(View view) {
        C13479a.m54764b(this.f12924a, "onBannerClose()...");
        return false;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16930a(View view, String str) {
        String a = C13598b.m55191a(str);
        String str2 = this.f12924a;
        C13479a.m54764b(str2, "onBannerClick()... url = " + a);
        return true;
    }
}
