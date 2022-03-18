package com.ss.android.lark.widget.flowlayout;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.lark.widget.flowlayout.b */
public class C58469b extends FrameLayout implements Checkable {

    /* renamed from: a */
    private static final int[] f144015a = {16842912};

    /* renamed from: b */
    private boolean f144016b;

    public boolean isChecked() {
        return this.f144016b;
    }

    public View getTagView() {
        return getChildAt(0);
    }

    public void toggle() {
        setChecked(!this.f144016b);
    }

    public C58469b(Context context) {
        super(context);
    }

    public void setChecked(boolean z) {
        if (this.f144016b != z) {
            this.f144016b = z;
            refreshDrawableState();
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f144015a);
        }
        return onCreateDrawableState;
    }
}
