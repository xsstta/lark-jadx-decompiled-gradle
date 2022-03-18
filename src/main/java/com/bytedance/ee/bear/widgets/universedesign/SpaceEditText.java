package com.bytedance.ee.bear.widgets.universedesign;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.suite.R;

public class SpaceEditText extends UDEditText {
    public SpaceEditText(Context context) {
        this(context, null);
    }

    public SpaceEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpaceEditText(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.SpaceEditTextStyle);
    }

    public SpaceEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
