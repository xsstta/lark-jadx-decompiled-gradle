package com.ss.android.lark.mail.impl.p2165d;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.mail.impl.d.f */
public final class C42045f {

    /* renamed from: a */
    public final AppCompatImageView f106694a;

    /* renamed from: b */
    public final View f106695b;

    /* renamed from: c */
    public final TextView f106696c;

    /* renamed from: d */
    public final RelativeLayout f106697d;

    /* renamed from: e */
    public final AppCompatImageView f106698e;

    /* renamed from: f */
    public final TextView f106699f;

    /* renamed from: g */
    private final RelativeLayout f106700g;

    /* renamed from: a */
    public RelativeLayout mo151060a() {
        return this.f106700g;
    }

    /* renamed from: a */
    public static C42045f m167235a(View view) {
        int i = R.id.mail_smartinbox_card_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.mail_smartinbox_card_close);
        if (appCompatImageView != null) {
            i = R.id.mail_smartinbox_card_divider;
            View findViewById = view.findViewById(R.id.mail_smartinbox_card_divider);
            if (findViewById != null) {
                i = R.id.mail_smartinbox_card_from;
                TextView textView = (TextView) view.findViewById(R.id.mail_smartinbox_card_from);
                if (textView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.mail_smartinbox_card_icon;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.mail_smartinbox_card_icon);
                    if (appCompatImageView2 != null) {
                        i = R.id.mail_smartinbox_card_label;
                        TextView textView2 = (TextView) view.findViewById(R.id.mail_smartinbox_card_label);
                        if (textView2 != null) {
                            return new C42045f(relativeLayout, appCompatImageView, findViewById, textView, relativeLayout, appCompatImageView2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    private C42045f(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, View view, TextView textView, RelativeLayout relativeLayout2, AppCompatImageView appCompatImageView2, TextView textView2) {
        this.f106700g = relativeLayout;
        this.f106694a = appCompatImageView;
        this.f106695b = view;
        this.f106696c = textView;
        this.f106697d = relativeLayout2;
        this.f106698e = appCompatImageView2;
        this.f106699f = textView2;
    }
}
