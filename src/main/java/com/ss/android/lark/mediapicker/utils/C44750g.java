package com.ss.android.lark.mediapicker.utils;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.mediapicker.utils.g */
public class C44750g {
    /* renamed from: a */
    public static void m177492a(final Context context) {
        new C25639g(context).mo89237b(context.getString(R.string.Lark_MediaPicker_PermissionsTitle)).mo89238b(true).mo89249h(17).mo89242c(context.getString(R.string.Lark_MediaPicker_OpenPermissionsMessage)).mo89255n(17).mo89245d(0.3f).mo89225a(R.id.lkui_dialog_btn_right, context.getString(R.string.Lark_MediaPicker_Setting), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mediapicker.utils.C44750g.DialogInterface$OnClickListenerC447522 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C26323w.m95322a(context);
                dialogInterface.dismiss();
            }
        }).mo89225a(R.id.lkui_dialog_btn_left, context.getString(R.string.Lark_MediaPicker_Cancel), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mediapicker.utils.C44750g.DialogInterface$OnClickListenerC447511 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo89239c();
    }
}
