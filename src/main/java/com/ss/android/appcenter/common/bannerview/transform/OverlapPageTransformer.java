package com.ss.android.appcenter.common.bannerview.transform;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.appcenter.common.bannerview.indicator.utils.IndicatorUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/transform/OverlapPageTransformer;", "Landroidx/viewpager2/widget/ViewPager2$PageTransformer;", "orientation", "", "minScale", "", "unSelectedItemRotation", "unSelectedItemAlpha", "itemGap", "(IFFFF)V", "scalingValue", "transformPage", "", "page", "Landroid/view/View;", "position", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.bannerview.b.a */
public final class OverlapPageTransformer implements ViewPager2.AbstractC1608g {

    /* renamed from: a */
    private final float f70490a;

    /* renamed from: b */
    private final int f70491b;

    /* renamed from: c */
    private final float f70492c;

    /* renamed from: d */
    private final float f70493d;

    /* renamed from: e */
    private final float f70494e;

    /* renamed from: f */
    private final float f70495f;

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1608g
    /* renamed from: a */
    public void mo8353a(View view, float f) {
        float f2;
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(view, "page");
        view.setElevation(-Math.abs(f));
        float max = Math.max(1.0f - Math.abs(f * 0.5f), 0.5f);
        float f3 = this.f70493d;
        if (f3 != BitmapDescriptorFactory.HUE_RED) {
            float f4 = ((float) 1) - max;
            if (f <= ((float) 0)) {
                f3 = -f3;
            }
            view.setRotationY(f4 * f3);
        }
        float max2 = Math.max(1.0f - Math.abs(this.f70490a * f), this.f70492c);
        view.setScaleX(max2);
        view.setScaleY(max2);
        int a = IndicatorUtils.m103048a((float) (((int) this.f70495f) / 2));
        int i3 = this.f70491b;
        if (i3 == 0) {
            float f5 = ((float) a) * f;
            if (f > ((float) 0)) {
                i = -view.getWidth();
            } else {
                i = view.getWidth();
            }
            view.setTranslationX(f5 + (((float) i) * (1.0f - max2)));
        } else if (i3 == 1) {
            float f6 = ((float) a) * f;
            if (f > ((float) 0)) {
                i2 = -view.getWidth();
            } else {
                i2 = view.getWidth();
            }
            view.setTranslationY(f6 + (((float) i2) * (1.0f - max2)));
        } else {
            throw new IllegalArgumentException("Gives correct orientation value, ViewPager2.ORIENTATION_HORIZONTAL or ViewPager2.ORIENTATION_VERTICAL");
        }
        if (this.f70494e != 1.0f) {
            if (f < -1.0f || f > 1.0f) {
                f2 = 0.5f / Math.abs(f * f);
            } else {
                f2 = ((((float) 1) - Math.abs(f)) * 0.5f) + 0.5f;
            }
            view.setAlpha(f2);
        }
    }

    public OverlapPageTransformer(int i, float f, float f2, float f3, float f4) {
        boolean z;
        this.f70491b = i;
        this.f70492c = f;
        this.f70493d = f2;
        this.f70494e = f3;
        this.f70495f = f4;
        boolean z2 = true;
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if ((f3 < BitmapDescriptorFactory.HUE_RED || f3 > 1.0f) ? false : z2) {
                this.f70490a = 0.2f;
                return;
            }
            throw new IllegalArgumentException("unSelectedItemAlpha value should be between 1.0 to 0.0".toString());
        }
        throw new IllegalArgumentException("minScale value should be between 1.0 to 0.0".toString());
    }
}
