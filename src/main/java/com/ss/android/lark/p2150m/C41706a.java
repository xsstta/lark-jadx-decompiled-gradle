package com.ss.android.lark.p2150m;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36474h;

/* renamed from: com.ss.android.lark.m.a */
public class C41706a {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m165542a(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface) {
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -1);
        }
    }

    /* renamed from: a */
    public static void m165543a(String str, DialogInterface.OnClickListener onClickListener) {
        AbstractC36474h b;
        Context a;
        if (!TextUtils.isEmpty(str) && (b = C29990c.m110930b()) != null && (a = b.mo134528a()) != null) {
            new C25639g(a).mo89242c(str).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_IKnow, onClickListener).mo89227a(new DialogInterface.OnDismissListener(onClickListener) {
                /* class com.ss.android.lark.p2150m.$$Lambda$a$Y3CIb4bzaDMHXuVNSZ0yQW_NlAI */
                public final /* synthetic */ DialogInterface.OnClickListener f$0;

                {
                    this.f$0 = r1;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    C41706a.m165542a(this.f$0, dialogInterface);
                }
            }).mo89247e(false).mo89244d();
        }
    }
}
