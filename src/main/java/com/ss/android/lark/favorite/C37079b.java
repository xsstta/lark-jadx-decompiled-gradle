package com.ss.android.lark.favorite;

import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.favorite.list.FavoriteListActivity;

/* renamed from: com.ss.android.lark.favorite.b */
public class C37079b {
    /* renamed from: a */
    public static void m146273a(Context context) {
        if (DesktopUtil.m144301a(context)) {
            C29990c.m110930b().mo134592t().mo134413a(context, "favorite");
        } else {
            context.startActivity(new Intent(context, FavoriteListActivity.class));
        }
    }
}
