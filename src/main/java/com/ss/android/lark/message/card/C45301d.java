package com.ss.android.lark.message.card;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.message.card.p2264d.C45302a;
import com.ss.android.lark.message.card.p2264d.C45304b;
import com.ss.android.lark.opmonitor.service.OPMonitor;

/* renamed from: com.ss.android.lark.message.card.d */
public class C45301d {
    /* renamed from: a */
    public static boolean m179898a(Context context, String str) {
        if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("lark://msgcard/unsupported_action")) {
            return false;
        }
        OPMonitor a = C45302a.m179899a(C45304b.f114703i);
        a.setErrorMessage(C45304b.f114703i.message);
        a.flush();
        LKUIToast.show(context, (int) R.string.Lark_Legacy_MsgCardUnsupportedActionMobile);
        return true;
    }
}
