package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.C1562y;
import androidx.transition.Transition;
import java.util.Map;

/* renamed from: com.google.android.material.internal.k */
public class C22356k extends Transition {
    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        m80995d(yVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: b */
    public void mo7810b(C1562y yVar) {
        m80995d(yVar);
    }

    /* renamed from: d */
    private void m80995d(C1562y yVar) {
        if (yVar.f5459b instanceof TextView) {
            yVar.f5458a.put("android:textscale:scale", Float.valueOf(((TextView) yVar.f5459b).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public Animator mo7806a(ViewGroup viewGroup, C1562y yVar, C1562y yVar2) {
        float f;
        if (yVar == null || yVar2 == null || !(yVar.f5459b instanceof TextView) || !(yVar2.f5459b instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) yVar2.f5459b;
        Map<String, Object> map = yVar.f5458a;
        Map<String, Object> map2 = yVar2.f5458a;
        float f2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f = ((Float) map.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.google.android.material.internal.C22356k.C223571 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }
}
