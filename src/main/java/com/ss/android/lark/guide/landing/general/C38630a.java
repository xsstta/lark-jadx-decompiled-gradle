package com.ss.android.lark.guide.landing.general;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.landing.general.ui.GuidePageActivity;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.PackageChannelManager;

/* renamed from: com.ss.android.lark.guide.landing.general.a */
public class C38630a {
    /* renamed from: b */
    private static boolean m152459b(Context context) {
        return TextUtils.equals(PackageChannelManager.getBuildPackageChannel(context), "tengxun");
    }

    /* renamed from: a */
    public static void m152457a(Context context) {
        if (context != null) {
            Intent intent = new Intent(context, GuidePageActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static boolean m152458a(Activity activity) {
        if (!m152460c(activity)) {
            return false;
        }
        activity.startActivity(new Intent(activity, GuidePageActivity.class));
        C57744a.m224104a().putBoolean("sp_key_before_login_show_guide_page", false);
        return true;
    }

    /* renamed from: c */
    private static boolean m152460c(Context context) {
        boolean z;
        boolean a = C38548a.m152027a().mo141250a();
        boolean z2 = C57744a.m224104a().getBoolean("sp_key_guide_page_clicked", false);
        boolean z3 = C57744a.m224104a().getBoolean("sp_key_guide_user_policy_agreed", false);
        boolean b = m152459b(context);
        if (z3 || !b) {
            z = false;
        } else {
            z = true;
        }
        if (a) {
            return false;
        }
        if (z || !z2) {
            return true;
        }
        return false;
    }
}
