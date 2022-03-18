package com.ss.android.lark.utils.p2904a;

import android.app.Application;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.aj;

/* renamed from: com.ss.android.lark.utils.a.b */
public class C57761b {
    /* renamed from: a */
    public static void m224182a() {
        Application a = aj.m224263a();
        if (a != null) {
            new C25639g(a).mo89248g(R.string.Lark_Chat_CloudDiskFullTitle).mo89254m(R.string.Lark_Chat_CloudDiskFull).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ApplicationPhoneCallTimeButtonKnow, (DialogInterface.OnClickListener) null).mo89247e(false).mo89244d();
        }
    }
}
