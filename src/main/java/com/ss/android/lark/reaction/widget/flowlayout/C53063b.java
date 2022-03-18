package com.ss.android.lark.reaction.widget.flowlayout;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.lark.reaction.widget.flowlayout.b */
public class C53063b extends FrameLayout implements Checkable {

    /* renamed from: a */
    private static final int[] f131140a = {16842912};

    /* renamed from: b */
    private boolean f131141b;

    public boolean isChecked() {
        return this.f131141b;
    }

    public View getTagView() {
        return getChildAt(0);
    }

    public void toggle() {
        setChecked(!this.f131141b);
    }

    public C53063b(Context context) {
        super(context);
    }

    public void setChecked(boolean z) {
        if (this.f131141b != z) {
            this.f131141b = z;
            refreshDrawableState();
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f131140a);
        }
        return onCreateDrawableState;
    }
}
