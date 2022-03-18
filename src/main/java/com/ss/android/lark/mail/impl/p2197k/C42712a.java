package com.ss.android.lark.mail.impl.p2197k;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.by.inflate_lib.p099a.C2600a;
import com.by.inflate_lib.p100b.C2605a;
import com.larksuite.component.universe_design.badge.UDBadge;
import com.larksuite.component.universe_design.badge.UDBadgeView;

/* renamed from: com.ss.android.lark.mail.impl.k.a */
public class C42712a {
    /* renamed from: a */
    public void mo153390a(UDBadgeView uDBadgeView, ViewGroup.LayoutParams layoutParams) {
        uDBadgeView.mo90238b();
    }

    /* renamed from: a */
    public boolean mo153391a(String str, C2600a aVar, UDBadgeView uDBadgeView, ViewGroup.LayoutParams layoutParams) {
        String a = C2605a.m10962a(str);
        a.hashCode();
        if (!a.equals("ud_badge_type")) {
            return false;
        }
        if (TextUtils.equals("dot", aVar.f8294a)) {
            uDBadgeView.setBadgeType(UDBadge.BadgeType.DOT);
            return true;
        } else if (TextUtils.equals("text", aVar.f8294a)) {
            uDBadgeView.setBadgeType(UDBadge.BadgeType.TEXT);
            return true;
        } else if (!TextUtils.equals("icon", aVar.f8294a)) {
            return true;
        } else {
            uDBadgeView.setBadgeType(UDBadge.BadgeType.ICON);
            return true;
        }
    }
}
