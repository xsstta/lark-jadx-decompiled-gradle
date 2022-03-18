package com.bytedance.ee.bear.slide.browse.navbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class SlideNavBarContainer extends LinearLayout {

    /* renamed from: a */
    private AbstractC11375a f30548a;

    /* renamed from: com.bytedance.ee.bear.slide.browse.navbar.SlideNavBarContainer$a */
    public interface AbstractC11375a {
        void onSizeChanged(int i, int i2, int i3, int i4);
    }

    public SlideNavBarContainer(Context context) {
        super(context);
    }

    public void setOnSizeChangedListener(AbstractC11375a aVar) {
        this.f30548a = aVar;
    }

    public SlideNavBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SlideNavBarContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        AbstractC11375a aVar = this.f30548a;
        if (aVar != null) {
            aVar.onSizeChanged(i, i2, i3, i4);
        }
    }
}
