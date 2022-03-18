package com.bytedance.ee.bear.lark.p417e;

import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.bytedance.ee.bear.lark.e.c */
public class C8035c {
    /* renamed from: a */
    public static String m32108a(boolean z, String str, String str2) {
        if (z) {
            return UIHelper.mustacheFormat((int) R.string.Lark_Docs_ChatDocPermSetText, "permission", str2);
        }
        return str + " " + str2.toLowerCase();
    }
}
