package com.bytedance.ee.bear.widgets.universedesign;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;

public class SpaceButton extends UDButton {
    public SpaceButton(Context context) {
        this(context, null);
    }

    public SpaceButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.style.SpaceButtonStyle);
    }

    public SpaceButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
