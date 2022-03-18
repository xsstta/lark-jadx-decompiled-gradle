package com.ss.android.lark.sticker.ui.emoticon.preview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.sticker.dto.StickerSetInfo;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.preview.c */
public class C55188c {
    /* renamed from: a */
    public static void m214123a(Context context, StickerSetInfo stickerSetInfo) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_sticker_set_info", stickerSetInfo);
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, StickerPreviewActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtras(bundle);
            context.startActivity(intent);
            return;
        }
        C55186b bVar = new C55186b();
        bVar.setArguments(bundle);
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("StickerModule").mo134930b();
        bVar.setFragmentParams(a);
        C36512a.m144041a().mo134762a(bVar, a);
    }
}
