package com.bytedance.ies.xelement.banner;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ies.xelement.banner.a */
public class C14463a implements ViewPager.AbstractC1579d {
    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579d
    /* renamed from: a */
    public void mo8241a(View view, float f) {
        float f2;
        ViewPager viewPager = (ViewPager) view.getParent();
        int left = (view.getLeft() - viewPager.getPaddingLeft()) - viewPager.getScrollX();
        int measuredWidth = (viewPager.getMeasuredWidth() - viewPager.getPaddingLeft()) - viewPager.getPaddingRight();
        if (measuredWidth != 0) {
            f2 = ((float) left) / ((float) measuredWidth);
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        float a = m58549a(f2 * 9.0f, -9.0f, 9.0f);
        view.setCameraDistance(1280.0f);
        view.setRotationY(-a);
    }

    /* renamed from: a */
    private static float m58549a(float f, float f2, float f3) {
        return Math.min(f3, Math.max(f2, f));
    }
}
