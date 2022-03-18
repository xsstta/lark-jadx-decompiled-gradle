package com.ss.android.lark.sticker.ui.emoticon.shop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.c */
public class C55213c {
    /* renamed from: a */
    public static void m214194a(Activity activity) {
        if (!DesktopUtil.m144301a((Context) activity)) {
            Intent intent = new Intent(activity, StickerSetShopActivity.class);
            intent.addFlags(268435456);
            activity.startActivity(intent);
            return;
        }
        C55211b bVar = new C55211b();
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("StickerModule").mo134930b();
        bVar.setFragmentParams(a);
        C36512a.m144041a().mo134762a(bVar, a);
    }
}
