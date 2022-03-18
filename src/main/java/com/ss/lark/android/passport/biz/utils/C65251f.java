package com.ss.lark.android.passport.biz.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.ss.android.lark.passport.infra.base.network.C49081e;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49157ai;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.lark.android.passport.biz.utils.f */
public class C65251f {
    /* renamed from: a */
    public static void m256141a(Context context, String str, PassportLog passportLog) {
        if (context == null || TextUtils.isEmpty(str)) {
            passportLog.mo171471d("PassportBizUtil", "can not openAccountRecoverUrl: " + str);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("op_platform_service", "hide_navigator");
        bundle.putBoolean("showTitle", false);
        C49157ai.m193847a(context, Uri.parse(str).buildUpon().appendQueryParameter("op_platform_service", "hide_navigator").appendQueryParameter("lang", C49081e.m193469b().toLowerCase()).build().toString(), bundle, true);
    }

    /* renamed from: b */
    public static void m256142b(Context context, String str, PassportLog passportLog) {
        String str2;
        if (context == null || TextUtils.isEmpty(str)) {
            passportLog.mo171471d("PassportBizUtil", "can not openAccountRecoverUrl: " + str);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("op_platform_service", "hide_navigator");
        bundle.putBoolean("showTitle", false);
        Uri parse = Uri.parse(str);
        boolean a = UDUiModeUtils.m93319a(LarkContext.getApplication());
        Uri.Builder appendQueryParameter = parse.buildUpon().appendQueryParameter("op_platform_service", "hide_navigator").appendQueryParameter("lang", C49081e.m193469b().toLowerCase());
        if (a) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C49157ai.m193847a(context, appendQueryParameter.appendQueryParameter("dark", str2).build().toString(), bundle, !ServiceFinder.m193748c().isLogin());
    }
}
