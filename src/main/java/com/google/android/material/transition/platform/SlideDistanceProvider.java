package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SlideDistanceProvider implements AbstractC22563l {

    /* renamed from: a */
    private int f55578a;

    /* renamed from: b */
    private int f55579b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    /* renamed from: a */
    private static boolean m81823a(View view) {
        if (ViewCompat.m4082h(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private int m81820a(Context context) {
        int i = this.f55579b;
        if (i != -1) {
            return i;
        }
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    @Override // com.google.android.material.transition.platform.AbstractC22563l
    /* renamed from: b */
    public Animator mo78640b(ViewGroup viewGroup, View view) {
        return m81825b(viewGroup, view, this.f55578a, m81820a(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.AbstractC22563l
    /* renamed from: a */
    public Animator mo78639a(ViewGroup viewGroup, View view) {
        return m81822a(viewGroup, view, this.f55578a, m81820a(view.getContext()));
    }

    /* renamed from: b */
    private static Animator m81824b(View view, float f, float f2) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f, f2));
    }

    /* renamed from: a */
    private static Animator m81821a(View view, float f, float f2) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f, f2));
    }

    /* renamed from: a */
    private static Animator m81822a(View view, View view2, int i, int i2) {
        float f;
        float f2;
        if (i == 3) {
            return m81821a(view2, (float) i2, BitmapDescriptorFactory.HUE_RED);
        }
        if (i == 5) {
            return m81821a(view2, (float) (-i2), BitmapDescriptorFactory.HUE_RED);
        }
        if (i == 48) {
            return m81824b(view2, (float) (-i2), BitmapDescriptorFactory.HUE_RED);
        }
        if (i == 80) {
            return m81824b(view2, (float) i2, BitmapDescriptorFactory.HUE_RED);
        }
        if (i == 8388611) {
            if (m81823a(view)) {
                f = (float) i2;
            } else {
                f = (float) (-i2);
            }
            return m81821a(view2, f, BitmapDescriptorFactory.HUE_RED);
        } else if (i == 8388613) {
            if (m81823a(view)) {
                f2 = (float) (-i2);
            } else {
                f2 = (float) i2;
            }
            return m81821a(view2, f2, BitmapDescriptorFactory.HUE_RED);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    /* renamed from: b */
    private static Animator m81825b(View view, View view2, int i, int i2) {
        float f;
        float f2;
        if (i == 3) {
            return m81821a(view2, BitmapDescriptorFactory.HUE_RED, (float) (-i2));
        }
        if (i == 5) {
            return m81821a(view2, BitmapDescriptorFactory.HUE_RED, (float) i2);
        }
        if (i == 48) {
            return m81824b(view2, BitmapDescriptorFactory.HUE_RED, (float) i2);
        }
        if (i == 80) {
            return m81824b(view2, BitmapDescriptorFactory.HUE_RED, (float) (-i2));
        }
        if (i == 8388611) {
            if (m81823a(view)) {
                f = (float) (-i2);
            } else {
                f = (float) i2;
            }
            return m81821a(view2, BitmapDescriptorFactory.HUE_RED, f);
        } else if (i == 8388613) {
            if (m81823a(view)) {
                f2 = (float) i2;
            } else {
                f2 = (float) (-i2);
            }
            return m81821a(view2, BitmapDescriptorFactory.HUE_RED, f2);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }
}
