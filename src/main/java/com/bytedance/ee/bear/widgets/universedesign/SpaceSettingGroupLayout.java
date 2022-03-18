package com.bytedance.ee.bear.widgets.universedesign;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupLayout;
import com.larksuite.suite.R;

public class SpaceSettingGroupLayout extends SettingGroupLayout {
    public SpaceSettingGroupLayout(Context context) {
        this(context, null);
    }

    public SpaceSettingGroupLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpaceSettingGroupLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.SpaceSettingGroupLayoutStyle);
    }

    public SpaceSettingGroupLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
