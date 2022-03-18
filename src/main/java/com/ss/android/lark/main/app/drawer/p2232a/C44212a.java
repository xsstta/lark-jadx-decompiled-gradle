package com.ss.android.lark.main.app.drawer.p2232a;

import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.main.app.drawer.a.a */
public class C44212a {
    /* renamed from: a */
    public static void m175385a(LKUIBadgeView lKUIBadgeView, int i, boolean z) {
        String str;
        int i2 = R.drawable.tenant_badge_less_1000_count_bg;
        if (!z) {
            i2 = R.drawable.tenant_badge_un_show_bg;
            str = "";
        } else if (i < 10) {
            i2 = R.drawable.tenant_badge_less_10_count_bg;
            str = "+" + i;
        } else if (i < 100) {
            i2 = R.drawable.tenant_badge_less_100_count_bg;
            str = "+" + i;
        } else if (i < 1000) {
            str = "+" + i;
        } else {
            str = "+" + 999;
        }
        lKUIBadgeView.mo89319a(str).mo89316a(11.5f).mo89322b(i2).mo89320a();
    }
}
