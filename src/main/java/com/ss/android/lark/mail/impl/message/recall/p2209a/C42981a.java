package com.ss.android.lark.mail.impl.message.recall.p2209a;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43771m;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.recall.a.a */
public class C42981a {

    /* renamed from: com.ss.android.lark.mail.impl.message.recall.a.a$a */
    private static final class C42983a {

        /* renamed from: a */
        static C42981a f109456a = new C42981a();
    }

    private C42981a() {
    }

    /* renamed from: a */
    public static C42981a m171084a() {
        return C42983a.f109456a;
    }

    /* renamed from: a */
    public DialogC25637f mo154135a(Context context, int i, DialogInterface.OnClickListener onClickListener) {
        String str;
        if (i == 1) {
            str = C43819s.m173684a((int) R.string.Mail_Recall_DilaogHasBeenRecalled);
        } else {
            String a = C43819s.m173684a((int) R.string.Mail_Recall_DilaogMultiRecalled);
            str = a.replace("{{num}}", "" + i);
        }
        return C43771m.m173504a(context, R.string.Mail_Recall_DilaogHasBeenRecalled, R.string.Mail_Alert_OK, R.color.primary_pri_500, onClickListener).mo89246d(false).mo89247e(false).mo89242c(str).mo89239c();
    }
}
