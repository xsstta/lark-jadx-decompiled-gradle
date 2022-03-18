package com.larksuite.framework.ui.flowlayout;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;

/* renamed from: com.larksuite.framework.ui.flowlayout.b */
public class C26227b extends FrameLayout implements Checkable {

    /* renamed from: a */
    private static final int[] f64774a = {16842912};

    /* renamed from: b */
    private boolean f64775b;

    public boolean isChecked() {
        return this.f64775b;
    }

    public View getTagView() {
        return getChildAt(0);
    }

    public void toggle() {
        setChecked(!this.f64775b);
    }

    public C26227b(Context context) {
        super(context);
    }

    public void setChecked(boolean z) {
        if (this.f64775b != z) {
            this.f64775b = z;
            refreshDrawableState();
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f64774a);
        }
        return onCreateDrawableState;
    }
}
