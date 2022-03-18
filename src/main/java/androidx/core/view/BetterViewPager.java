package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

public class BetterViewPager extends ViewPager {
    public BetterViewPager(Context context) {
        super(context);
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z) {
        setChildrenDrawingOrderEnabled(z);
    }

    public BetterViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
