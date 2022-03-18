package com.bytedance.ee.bear.widgets.universedesign;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.suite.R;
import java.util.Arrays;

public class SpaceShadowLayout extends UDShadowLayout {
    public SpaceShadowLayout(Context context) {
        this(context, null);
    }

    public void childDrawableStateChanged(View view) {
        super.childDrawableStateChanged(view);
        int[] drawableState = view.getDrawableState();
        C13479a.m54772d("SpaceShadowLayout", "childDrawableStateChanged: " + Arrays.toString(drawableState));
    }

    public SpaceShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpaceShadowLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.SpaceShadowLayoutStyle);
    }

    public SpaceShadowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
