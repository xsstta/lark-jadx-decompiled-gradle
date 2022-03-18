package com.ss.android.lark.inv.export.util;

import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.inv.export.util.x */
public class C40145x {
    /* renamed from: a */
    public static String m159157a() {
        if (C40147z.m159160a().isLarkEnv()) {
            return UIHelper.getString(R.string.Lark_Invitation_BrandNameLark);
        }
        return UIHelper.getString(R.string.Lark_Invitation_BrandNameFeishu);
    }

    /* renamed from: a */
    public static String m159158a(int i) {
        return UIHelper.mustacheFormat(i, "ENV_DISPLAY_NAME", m159157a());
    }
}
