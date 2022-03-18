package com.ss.android.appcenter.common.util;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.appcenter.common.util.b */
public class C28177b {
    /* renamed from: b */
    public static void m103225b(final Context context, final String str, final String str2, final String str3, final String str4, final DialogInterface.OnClickListener onClickListener, final DialogInterface.OnClickListener onClickListener2) {
        UICallbackExecutor.post(new Runnable() {
            /* class com.ss.android.appcenter.common.util.C28177b.RunnableC281781 */

            public void run() {
                UDDialog build = ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(str)).titleGravity(17)).titleColor(R.color.text_title)).titleSize(17)).message(str2)).messageGravity(17)).messageTextColor(R.color.text_title)).messageTextSize(16)).addActionButton(R.id.ud_dialog_btn_secondary, str4, onClickListener2)).addActionButton(R.id.ud_dialog_btn_primary, str3, onClickListener)).build();
                build.setCancelable(false);
                build.setCanceledOnTouchOutside(false);
                build.show();
            }
        });
    }

    /* renamed from: a */
    public static UDDialog m103224a(Context context, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        UDDialog build = ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(str)).titleColor(R.color.text_title)).message(str2)).messageTextSize(17)).messageTextColor(R.color.text_title)).addActionButton(R.id.ud_dialog_btn_primary, str3, onClickListener)).addActionButton(R.id.ud_dialog_btn_secondary, str4, onClickListener2)).build();
        build.show();
        return build;
    }
}
