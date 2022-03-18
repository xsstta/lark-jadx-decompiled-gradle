package com.ss.android.lark.passport.infra.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ICommonService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;

/* renamed from: com.ss.android.lark.passport.infra.util.ai */
public class C49157ai {

    /* renamed from: a */
    private static final PassportLog f123438a = PassportLog.f123351c.mo171474a();

    /* renamed from: a */
    public static void m193846a(Context context, String str) {
        m193848a(context, str, "", false);
    }

    /* renamed from: a */
    public static void m193848a(Context context, String str, String str2, boolean z) {
        if (context != null && !TextUtils.isEmpty(str)) {
            C49218u.m194042a(context, m193844a(context, str, str2, "", z), f123438a);
        }
    }

    /* renamed from: a */
    public static void m193847a(Context context, String str, Bundle bundle, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("isRunMain", z);
        bundle2.putString("u", str);
        bundle2.putBoolean("inl", false);
        bundle2.putBoolean("icb", false);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        ServiceFinder.m193752g().openH5Url(context, bundle2);
    }

    /* renamed from: a */
    public static Intent m193844a(Context context, String str, String str2, String str3, boolean z) {
        return m193845a(context, str, str2, str3, z, true, true);
    }

    /* renamed from: a */
    public static Intent m193845a(Context context, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        Intent intent;
        ICommonService c = ServiceFinder.m193748c();
        if (c == null) {
            return null;
        }
        if (z) {
            intent = new Intent(context, c.getSigninClearTaskActivityClass());
            intent.addFlags(268468224);
        } else {
            intent = new Intent(context, c.getSigninActivityClass());
            intent.addFlags(67141632);
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("title", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("user_agent", str2);
            }
            bundle.putBoolean("initback", z2);
            bundle.putBoolean("titlebg", z3);
            intent.putExtras(bundle);
        }
        return intent;
    }
}
