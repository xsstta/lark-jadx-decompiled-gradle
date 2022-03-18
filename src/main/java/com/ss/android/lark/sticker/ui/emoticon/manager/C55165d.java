package com.ss.android.lark.sticker.ui.emoticon.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.d */
public class C55165d {
    /* renamed from: a */
    public static void m214063a(Activity activity) {
        if (!DesktopUtil.m144301a((Context) activity)) {
            Intent intent = new Intent(activity, StickerSetManagerActivity.class);
            intent.addFlags(268435456);
            activity.startActivity(intent);
            return;
        }
        C55163c cVar = new C55163c();
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("StickerModule").mo134930b();
        cVar.setFragmentParams(a);
        C36512a.m144041a().mo134762a(cVar, a);
    }
}
