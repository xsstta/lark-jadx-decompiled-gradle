package com.ss.android.lark.larkconfig.p2098a;

import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.larkconfig.p2098a.p2101c.C41134a;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.larkconfig.a.a */
public final class C41128a {
    /* renamed from: a */
    public static final void m163206a(AppConfig appConfig) {
        UserSP.getInstance().putBoolean("app_config_sso", C41134a.m163226c().mo148371a("sso"));
        C41133c.m163221a().mo148362a(appConfig);
    }
}
