package com.ss.android.lark.widget.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;

public class NavigationImageView extends LKUIRoundedImageView2 {
    public NavigationImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m229948a(Context context) {
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public NavigationImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m229948a(context);
    }
}
