package com.ss.android.lark.passport.infra.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.log.PassportLog;

/* renamed from: com.ss.android.lark.passport.infra.util.u */
public class C49218u {
    /* renamed from: a */
    public static boolean m194042a(Context context, Intent intent, PassportLog passportLog) {
        if (!(context == null || intent == null)) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Exception e) {
                passportLog.mo171471d("NavigationUtils", e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m194041a(Context context, String str, PassportLog passportLog) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            Intent createChooser = Intent.createChooser(intent, C49154ag.m193830a(context, (int) R.string.Lark_Login_SelectWebExplorer));
            if (!(context instanceof Activity)) {
                createChooser.addFlags(268435456);
            }
            context.startActivity(createChooser);
        } catch (Exception e) {
            passportLog.mo171471d("NavigationUtils", e.getMessage());
            LKUIToast.show(context, (int) R.string.Lark_Login_NoWebExplorer, 3500L);
        }
    }
}
