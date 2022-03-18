package com.ss.android.lark.sticker.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.sticker.ui.e */
public class C55117e {
    /* renamed from: a */
    public static void m213925a(Context context, Fragment fragment) {
        m213926a(context, fragment, -1);
    }

    /* renamed from: a */
    public static void m213926a(Context context, Fragment fragment, int i) {
        if (fragment == null) {
            Intent intent = new Intent(context, LarkStickerManagerActivity.class);
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, i);
            }
        } else if (!DesktopUtil.m144301a(context)) {
            fragment.startActivityForResult(new Intent(context, LarkStickerManagerActivity.class), i);
        } else {
            C55090b bVar = new C55090b();
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("StickerModule").mo134930b();
            bVar.setFragmentParams(a);
            if (fragment instanceof C36516a) {
                C36512a.m144041a().mo134760a((C36516a) fragment, bVar, a, i);
            }
        }
    }
}
