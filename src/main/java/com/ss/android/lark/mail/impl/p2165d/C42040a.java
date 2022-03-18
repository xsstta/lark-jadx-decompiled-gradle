package com.ss.android.lark.mail.impl.p2165d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.mail.impl.d.a */
public final class C42040a {

    /* renamed from: a */
    public final RelativeLayout f106679a;

    /* renamed from: b */
    public final UDBadgeView f106680b;

    /* renamed from: c */
    public final TextView f106681c;

    /* renamed from: d */
    public final AppCompatImageView f106682d;

    /* renamed from: e */
    private final RelativeLayout f106683e;

    /* renamed from: a */
    public RelativeLayout mo151055a() {
        return this.f106683e;
    }

    /* renamed from: a */
    public static C42040a m167224a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.mail_account_card_hint_dot;
        UDBadgeView uDBadgeView = (UDBadgeView) view.findViewById(R.id.mail_account_card_hint_dot);
        if (uDBadgeView != null) {
            i = R.id.mail_account_card_name;
            TextView textView = (TextView) view.findViewById(R.id.mail_account_card_name);
            if (textView != null) {
                i = R.id.mail_account_card_right_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.mail_account_card_right_icon);
                if (appCompatImageView != null) {
                    return new C42040a(relativeLayout, relativeLayout, uDBadgeView, textView, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: a */
    public static C42040a m167223a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mail_home_account_card_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m167224a(inflate);
    }

    private C42040a(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, UDBadgeView uDBadgeView, TextView textView, AppCompatImageView appCompatImageView) {
        this.f106683e = relativeLayout;
        this.f106679a = relativeLayout2;
        this.f106680b = uDBadgeView;
        this.f106681c = textView;
        this.f106682d = appCompatImageView;
    }
}
