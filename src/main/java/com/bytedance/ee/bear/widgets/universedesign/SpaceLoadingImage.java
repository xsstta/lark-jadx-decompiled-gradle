package com.bytedance.ee.bear.widgets.universedesign;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.loading.UDLoadingDrawable;
import com.larksuite.suite.R;

public class SpaceLoadingImage extends AppCompatImageView {
    public SpaceLoadingImage(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m49222a(Context context) {
        UDLoadingDrawable aVar = new UDLoadingDrawable(context);
        aVar.mo7701a(UDColorUtils.getColor(context, R.color.ud_N400));
        setImageDrawable(aVar);
        aVar.start();
    }

    public SpaceLoadingImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpaceLoadingImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49222a(context);
    }
}
