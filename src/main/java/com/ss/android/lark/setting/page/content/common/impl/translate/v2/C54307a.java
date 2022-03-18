package com.ss.android.lark.setting.page.content.common.impl.translate.v2;

import android.text.TextUtils;
import com.ss.android.lark.setting.C54115c;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.a */
public class C54307a {
    /* renamed from: a */
    public static boolean m210866a() {
        return C54115c.m210080a().mo178291e().mo178337a("translate.settings.v2.auto_translate.web.enable");
    }

    /* renamed from: b */
    public static boolean m210867b() {
        String B = C54115c.m210080a().mo178266B();
        if (TextUtils.isEmpty(B)) {
            return false;
        }
        return C54115c.m210080a().mo178291e().mo178337a(B);
    }
}
