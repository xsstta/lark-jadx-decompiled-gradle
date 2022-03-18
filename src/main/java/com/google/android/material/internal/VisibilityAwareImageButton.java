package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: a */
    private int f54663a;

    public final int getUserSetVisibility() {
        return this.f54663a;
    }

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public void setVisibility(int i) {
        mo77767a(i, true);
    }

    /* renamed from: a */
    public final void mo77767a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f54663a = i;
        }
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54663a = getVisibility();
    }
}
