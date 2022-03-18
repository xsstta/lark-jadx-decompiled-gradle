package com.ss.android.lark.feed.app.banner.p1852c.p1854b;

import android.app.Activity;
import android.view.View;
import com.ss.android.lark.banner.export.AbstractC29483d;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.banner.apm.BannerAPM;
import com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37343c;
import com.ss.android.lark.feed.app.banner.statistics.BannerHitPoint;
import com.ss.android.lark.feed.app.banner.ug_banner.helper.MainTitleFinder;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.feed.app.banner.c.b.b */
public class C37359b implements AbstractC29483d {
    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16930a(View view, String str) {
        return false;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16928a() {
        return new C37343c.C37346b().mo137200a(C37262a.m146726a().mo139170a());
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16929a(View view) {
        Activity activity;
        UserSP.getInstance().putBoolean("ug_close_c2b_banner", true);
        View a = new MainTitleFinder().mo137213a(view);
        if (a == null || !(a.getContext() instanceof Activity)) {
            activity = null;
        } else {
            activity = (Activity) a.getContext();
        }
        if (activity != null) {
            C37262a.m146726a().mo139181b().mo139258a(a, activity);
            BannerHitPoint.f95814a.mo137165f();
        } else {
            BannerAPM.f95813a.mo137154a();
            Log.m165389i("UpgradeTeamBannerHandler", "user avatar find failed");
        }
        BannerHitPoint.f95814a.mo137164e();
        return false;
    }
}
