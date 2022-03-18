package com.larksuite.component.universe_design.ratingbar;

import android.view.animation.BaseInterpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/larksuite/component/universe_design/ratingbar/SpringInterpolator;", "Landroid/view/animation/BaseInterpolator;", "()V", "mFactor", "", "(F)V", "getInterpolation", "input", "universe-ui-ratingbar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.ratingbar.c */
public class SpringInterpolator extends BaseInterpolator {

    /* renamed from: a */
    private float f63560a;

    public SpringInterpolator() {
        this.f63560a = 0.5f;
    }

    public SpringInterpolator(float f) {
        this.f63560a = f;
    }

    public float getInterpolation(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED || f == 1.0f) {
            return f;
        }
        double d = (double) f;
        double pow = Math.pow(2.0d, ((double) -10) * d);
        float f2 = this.f63560a;
        return (float) ((pow * Math.sin(((d - (((double) f2) / 4.0d)) * 6.283185307179586d) / ((double) f2))) + ((double) 1));
    }
}
