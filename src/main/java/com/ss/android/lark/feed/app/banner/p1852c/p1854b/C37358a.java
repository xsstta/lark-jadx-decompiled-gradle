package com.ss.android.lark.feed.app.banner.p1852c.p1854b;

import android.view.View;
import com.ss.android.lark.banner.export.AbstractC29483d;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.feed.app.banner.c.b.a */
public class C37358a implements AbstractC29483d {
    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16930a(View view, String str) {
        return false;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16928a() {
        boolean z;
        if (UserSP.getInstance().getBoolean("spIsClickInviterBannerClose") || UserSP.getInstance().getBoolean("spIsDirectHide")) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16929a(View view) {
        UserSP.getInstance().putBoolean("spIsClickInviterBannerClose", true);
        return false;
    }
}
