package com.bytedance.ee.bear.widgets.universedesign;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.suite.R;

public class SpaceEmptyState extends UDEmptyState {
    public SpaceEmptyState(Context context) {
        this(context, null);
    }

    public SpaceEmptyState(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpaceEmptyState(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.SpaceEmptyStatusStyle);
    }

    public SpaceEmptyState(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
