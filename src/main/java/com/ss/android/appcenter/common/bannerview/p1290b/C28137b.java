package com.ss.android.appcenter.common.bannerview.p1290b;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.appcenter.common.bannerview.b.b */
public class C28137b implements ViewPager2.AbstractC1608g {

    /* renamed from: a */
    private final float f70496a;

    public C28137b(float f) {
        this.f70496a = f;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1608g
    /* renamed from: a */
    public void mo8353a(View view, float f) {
        int width = view.getWidth();
        view.setPivotY(((float) view.getHeight()) / 2.0f);
        float f2 = (float) width;
        view.setPivotX(f2 / 2.0f);
        if (f < -1.0f) {
            view.setScaleX(this.f70496a);
            view.setScaleY(this.f70496a);
            view.setPivotX(f2);
        } else if (f > 1.0f) {
            view.setPivotX(BitmapDescriptorFactory.HUE_RED);
            view.setScaleX(this.f70496a);
            view.setScaleY(this.f70496a);
        } else if (f < BitmapDescriptorFactory.HUE_RED) {
            float f3 = this.f70496a;
            float f4 = ((f + 1.0f) * (1.0f - f3)) + f3;
            view.setScaleX(f4);
            view.setScaleY(f4);
            view.setPivotX(f2 * (((-f) * 0.5f) + 0.5f));
        } else {
            float f5 = 1.0f - f;
            float f6 = this.f70496a;
            float f7 = ((1.0f - f6) * f5) + f6;
            view.setScaleX(f7);
            view.setScaleY(f7);
            view.setPivotX(f2 * f5 * 0.5f);
        }
    }
}
