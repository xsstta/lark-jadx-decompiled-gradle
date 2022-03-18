package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0427af;

public class TabItem extends View {

    /* renamed from: a */
    public final CharSequence f55113a;

    /* renamed from: b */
    public final Drawable f55114b;

    /* renamed from: c */
    public final int f55115c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0427af a = C0427af.m1777a(context, attributeSet, new int[]{16842754, 16842994, 16843087});
        this.f55113a = a.mo2484c(2);
        this.f55114b = a.mo2477a(0);
        this.f55115c = a.mo2491g(1, 0);
        a.mo2482b();
    }
}
