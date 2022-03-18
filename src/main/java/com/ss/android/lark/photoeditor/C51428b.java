package com.ss.android.lark.photoeditor;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.photoeditor.impl.ui.C51443b;
import com.ss.android.lark.photoeditor.impl.ui.PhotoEditorActivity;

/* renamed from: com.ss.android.lark.photoeditor.b */
public class C51428b {
    /* renamed from: a */
    public static void m199363a(Context context, Fragment fragment, String str, String str2, String str3, int i, boolean z, boolean z2, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("key_image_url", str);
        bundle.putString("key_result_path", str2);
        bundle.putString("key_from", str3);
        bundle.putBoolean("key_show_save_btn", z);
        bundle.putBoolean("key_show_forward_btn", z2);
        bundle.putString("key_file_key", str4);
        if (DesktopUtil.m144301a(context) && (fragment instanceof C36516a)) {
            C51443b bVar = new C51443b();
            bVar.setArguments(bundle);
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
            bVar.setFragmentParams(a);
            C36512a.m144041a().mo134760a((C36516a) fragment, bVar, a, i);
        } else if (fragment.isAdded()) {
            Intent intent = new Intent(context, PhotoEditorActivity.class);
            intent.putExtras(bundle);
            ActivityOptions activityOptions = null;
            if (DesktopUtil.m144301a(context) && (context instanceof Activity)) {
                activityOptions = DesktopUtil.m144294a((Activity) context, UIUtils.dp2px(context, 566.0f), UIUtils.dp2px(context, 670.0f));
            }
            if (activityOptions != null) {
                fragment.startActivityForResult(intent, i, activityOptions.toBundle());
            } else {
                fragment.startActivityForResult(intent, i);
            }
        }
    }
}
