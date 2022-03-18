package com.ss.android.lark.mail.impl.p2165d;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.d.c */
public final class C42042c {

    /* renamed from: a */
    private final FrameLayout f106687a;

    /* renamed from: a */
    public FrameLayout mo151057a() {
        return this.f106687a;
    }

    private C42042c(FrameLayout frameLayout) {
        this.f106687a = frameLayout;
    }

    /* renamed from: a */
    public static C42042c m167229a(View view) {
        Objects.requireNonNull(view, "rootView");
        return new C42042c((FrameLayout) view);
    }
}
