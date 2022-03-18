package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.google.android.material.internal.C22358l;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.b */
public class C22140b {

    /* renamed from: a */
    private static final int[] f53865a = {16843848};

    /* renamed from: a */
    static void m79793a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: a */
    public static int m79792a(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    /* renamed from: a */
    static void m79794a(View view, float f) {
        int a = m79792a(view.getResources(), (int) R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) a;
        stateListAnimator.addState(new int[]{16842766, R.attr.state_liftable, -2130970290}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: a */
    static void m79795a(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray a = C22358l.m80999a(context, attributeSet, f53865a, i, i2, new int[0]);
        try {
            if (a.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, a.getResourceId(0, 0)));
            }
        } finally {
            a.recycle();
        }
    }
}
