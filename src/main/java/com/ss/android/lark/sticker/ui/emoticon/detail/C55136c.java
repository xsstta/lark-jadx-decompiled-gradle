package com.ss.android.lark.sticker.ui.emoticon.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.detail.c */
public class C55136c {
    /* renamed from: a */
    public static void m213981a(Context context, StickerSet stickerSet) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("sticker_set", stickerSet);
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, StickerSetDetailActivity.class);
            intent.putExtras(bundle);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return;
        }
        C55134b bVar = new C55134b();
        bVar.setArguments(bundle);
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("StickerModule").mo134930b();
        bVar.setFragmentParams(a);
        C36512a.m144041a().mo134762a(bVar, a);
    }

    /* renamed from: a */
    public static void m213982a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("sticker_set_id", str);
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, StickerSetDetailActivity.class);
            intent.putExtras(bundle);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return;
        }
        C55134b bVar = new C55134b();
        bVar.setArguments(bundle);
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("StickerModule").mo134930b();
        bVar.setFragmentParams(a);
        C36512a.m144041a().mo134762a(bVar, a);
    }
}
