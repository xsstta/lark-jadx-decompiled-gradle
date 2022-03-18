package com.ss.android.lark.favorite.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.favorite.detail.b */
public class C37190b {
    /* renamed from: a */
    public static void m146498a(Activity activity, FavoriteMessageInfo favoriteMessageInfo, int i) {
        Intent intent = new Intent(activity, FavoriteDetailActivity.class);
        intent.putExtra("params_favorites", favoriteMessageInfo);
        if (!DesktopUtil.m144301a((Context) activity)) {
            activity.startActivityForResult(intent, i);
            return;
        }
        intent.addFlags(402653184);
        C36512a.m144041a().mo134756a(activity, new StandAloneParam.C36572a(intent).mo134969c(i).mo134967a());
    }
}
