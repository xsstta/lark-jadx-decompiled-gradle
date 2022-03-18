package com.ss.android.lark.mail.impl.p2165d;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.progress.UDProgress;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.mail.impl.d.d */
public final class C42043d {

    /* renamed from: a */
    public final TextView f106688a;

    /* renamed from: b */
    public final UDProgress f106689b;

    /* renamed from: c */
    public final TextView f106690c;

    /* renamed from: d */
    public final AppCompatImageView f106691d;

    /* renamed from: e */
    private final ConstraintLayout f106692e;

    /* renamed from: a */
    public ConstraintLayout mo151058a() {
        return this.f106692e;
    }

    /* renamed from: a */
    public static C42043d m167231a(View view) {
        int i = R.id.mail_migration_detail;
        TextView textView = (TextView) view.findViewById(R.id.mail_migration_detail);
        if (textView != null) {
            i = R.id.mail_migration_progress;
            UDProgress uDProgress = (UDProgress) view.findViewById(R.id.mail_migration_progress);
            if (uDProgress != null) {
                i = R.id.mail_migration_tip;
                TextView textView2 = (TextView) view.findViewById(R.id.mail_migration_tip);
                if (textView2 != null) {
                    i = R.id.mail_migration_tip_icon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.mail_migration_tip_icon);
                    if (appCompatImageView != null) {
                        return new C42043d((ConstraintLayout) view, textView, uDProgress, textView2, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    private C42043d(ConstraintLayout constraintLayout, TextView textView, UDProgress uDProgress, TextView textView2, AppCompatImageView appCompatImageView) {
        this.f106692e = constraintLayout;
        this.f106688a = textView;
        this.f106689b = uDProgress;
        this.f106690c = textView2;
        this.f106691d = appCompatImageView;
    }
}
