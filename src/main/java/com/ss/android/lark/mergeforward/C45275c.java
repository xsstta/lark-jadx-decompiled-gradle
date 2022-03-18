package com.ss.android.lark.mergeforward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.navigation.Navigation;

/* renamed from: com.ss.android.lark.mergeforward.c */
public class C45275c {
    /* renamed from: a */
    public static void m179793a(Context context, String str, MergeForwardContent mergeForwardContent, MergeForwardContent mergeForwardContent2) {
        m179792a((Activity) context, null, mergeForwardContent, mergeForwardContent2, null, str, -1, -1);
    }

    /* renamed from: a */
    public static void m179791a(Activity activity, Fragment fragment, MergeForwardContent mergeForwardContent, FavoriteMessageInfo favoriteMessageInfo, int i, int i2, String str) {
        m179792a(activity, fragment, mergeForwardContent, null, favoriteMessageInfo, str, i, i2);
    }

    /* renamed from: a */
    public static void m179792a(Activity activity, Fragment fragment, MergeForwardContent mergeForwardContent, MergeForwardContent mergeForwardContent2, FavoriteMessageInfo favoriteMessageInfo, String str, int i, int i2) {
        Intent intent = new Intent(activity, MergeForwardDetailActivity.class);
        if (i != -1) {
            intent.putExtra("serializable_from_type", i);
        }
        if (str != null) {
            intent.putExtra("key_merge_forward_chat_id", str);
        }
        if (mergeForwardContent != null) {
            intent.putExtra("key_merge_forward_message", mergeForwardContent);
        }
        if (mergeForwardContent2 != null) {
            intent.putExtra("key_merge_forward_translate_message", mergeForwardContent2);
        }
        if (favoriteMessageInfo != null) {
            intent.putExtra("serializable_favorite", favoriteMessageInfo);
        }
        if (DesktopUtil.m144301a((Context) activity)) {
            intent.setFlags(402653184);
            C36512a.m144041a().mo134755a(activity, fragment, new StandAloneParam.C36572a(intent, 2, DesktopConstants.UIType.WINDOW_NORMAL_D1).mo134969c(i2).mo134967a());
        } else if (fragment == null) {
            Navigation.from(activity).openActivity(intent, i2);
        } else {
            Navigation.from((Context) activity, fragment).openActivity(intent, i2);
        }
    }
}
