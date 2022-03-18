package com.ss.android.lark.mail.impl.widget.time;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ListenableLinearLayout extends LinearLayout {

    /* renamed from: a */
    private AbstractC44099l f111838a;

    public ListenableLinearLayout(Context context) {
        super(context);
    }

    public void setOnSizeChangedListener(AbstractC44099l lVar) {
        this.f111838a = lVar;
    }

    public ListenableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListenableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        AbstractC44099l lVar = this.f111838a;
        if (lVar != null) {
            lVar.mo156910a(i, i2, i3, i4);
        }
    }
}
