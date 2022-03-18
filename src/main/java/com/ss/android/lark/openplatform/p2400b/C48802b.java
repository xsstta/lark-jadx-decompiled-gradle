package com.ss.android.lark.openplatform.p2400b;

import android.content.Context;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.openplatform.OpenPlatformModule;

/* renamed from: com.ss.android.lark.openplatform.b.b */
public class C48802b {
    /* renamed from: a */
    public static boolean m192258a(final Context context) {
        if (!(!OpenPlatformModule.m192198d().isFeatureOn("gadget"))) {
            return false;
        }
        UICallbackExecutor.post(new Runnable() {
            /* class com.ss.android.lark.openplatform.p2400b.C48802b.RunnableC488031 */

            public void run() {
                new C25639g(context).mo89246d(false).mo89247e(false).mo89238b(true).mo89250i(R.color.lkui_N900).mo89249h(17).mo89223a(-1, 24, -1, -1).mo89237b(context.getString(R.string.Lark_Legacy_MiniMode_AppForbid_Title)).mo89255n(16).mo89256o(R.color.lkui_N900).mo89242c(context.getString(R.string.Lark_Legacy_MiniMode_AppForbid_Detail)).mo89225a(R.id.lkui_dialog_btn_center, context.getString(R.string.Lark_Legacy_MiniMode_AppForbid_Button), $$Lambda$b$1$GfuncBjZW27EgCRNMaI9LbMhQk.INSTANCE).mo89233b().show();
            }
        });
        return true;
    }
}
