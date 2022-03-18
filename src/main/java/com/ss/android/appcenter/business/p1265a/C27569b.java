package com.ss.android.appcenter.business.p1265a;

import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27541f;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.tt.refer.impl.business.p3427a.p3429b.C67873a;

/* renamed from: com.ss.android.appcenter.business.a.b */
public class C27569b {
    /* renamed from: a */
    public static boolean m100618a() {
        AbstractC27541f i = C27548m.m100547m().mo98225i();
        if (i == null) {
            return false;
        }
        return i.mo98187a("gadget.open_app.badge");
    }

    /* renamed from: a */
    public static void m100617a(LKUIBadgeView lKUIBadgeView, int i) {
        if (lKUIBadgeView != null) {
            int i2 = 8;
            if (!m100618a()) {
                lKUIBadgeView.setVisibility(8);
                return;
            }
            C67873a.C67874a a = C67873a.m264045a(i);
            if (a.f170941c) {
                i2 = 0;
            }
            lKUIBadgeView.setVisibility(i2);
            lKUIBadgeView.mo89322b(a.f170939a).mo89319a(a.f170942d).mo89317a(a.f170940b).mo89316a(a.f170944f).mo89321b(a.f170943e).mo89320a();
        }
    }
}
