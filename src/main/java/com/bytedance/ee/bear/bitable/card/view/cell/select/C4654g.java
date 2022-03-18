package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.g */
public class C4654g extends LinearLayout implements Checkable {

    /* renamed from: b */
    private static final int[] f13750b = {16842912};

    /* renamed from: a */
    private boolean f13751a;

    public boolean isChecked() {
        return this.f13751a;
    }

    public View getSelectChildView() {
        return getChildAt(0);
    }

    public void toggle() {
        setChecked(!this.f13751a);
    }

    public C4654g(Context context) {
        super(context);
    }

    public void setChecked(boolean z) {
        if (this.f13751a != z) {
            this.f13751a = z;
            refreshDrawableState();
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f13750b);
        }
        return onCreateDrawableState;
    }
}
