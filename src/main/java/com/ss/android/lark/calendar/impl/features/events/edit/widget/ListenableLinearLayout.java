package com.ss.android.lark.calendar.impl.features.events.edit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31542e;

public class ListenableLinearLayout extends LinearLayout {

    /* renamed from: a */
    private AbstractC31542e f81376a;

    public ListenableLinearLayout(Context context) {
        super(context);
    }

    public void setOnSizeChangedListener(AbstractC31542e eVar) {
        this.f81376a = eVar;
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
        AbstractC31542e eVar = this.f81376a;
        if (eVar != null) {
            eVar.mo114659a(i, i2, i3, i4);
        }
    }
}
