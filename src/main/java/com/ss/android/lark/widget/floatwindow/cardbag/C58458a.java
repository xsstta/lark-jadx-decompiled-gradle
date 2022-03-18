package com.ss.android.lark.widget.floatwindow.cardbag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.widget.floatwindow.cardbag.a */
public class C58458a {

    @FunctionalInterface
    /* renamed from: com.ss.android.lark.widget.floatwindow.cardbag.a$a */
    public interface AbstractC58463a {
        /* renamed from: a */
        void mo197929a();
    }

    /* renamed from: a */
    public static int m226662a(int i, int i2, int i3) {
        int i4 = i < i2 ? i2 - i : 0;
        if (i4 >= 3) {
            i4 = 3;
        }
        return i4 * i3 * 2;
    }

    /* renamed from: b */
    public static int m226668b(int i, int i2, int i3) {
        int i4 = i < i2 ? i2 - i : 0;
        if (i4 >= 3) {
            i4 = 3;
        }
        return i4 * i3 * 2;
    }

    /* renamed from: c */
    public static int m226669c(int i, int i2, int i3) {
        if (i >= i2) {
            i = i2;
        }
        if (i >= 2) {
            i = 2;
        }
        return i * i3;
    }

    /* renamed from: d */
    public static int m226670d(int i, int i2, int i3) {
        return (i < i2 ? i2 - i : 0) * i3;
    }

    /* renamed from: a */
    public static void m226667a(FrameLayout frameLayout) {
        if (frameLayout != null) {
            for (int i = 0; i < frameLayout.getChildCount(); i++) {
                View childAt = frameLayout.getChildAt(i);
                C58464b bVar = (C58464b) childAt.getTag();
                if (bVar == null) {
                    bVar = new C58464b();
                }
                bVar.mo197938a(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), childAt.getPaddingBottom());
            }
        }
    }

    /* renamed from: a */
    public static ValueAnimator m226664a(final FrameLayout frameLayout, final AbstractC58463a aVar) {
        final int dimension = (int) frameLayout.getResources().getDimension(R.dimen.card_dp_step);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.widget.floatwindow.cardbag.C58458a.C584613 */

            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                AbstractC58463a aVar = aVar;
                if (aVar != null) {
                    aVar.mo197929a();
                    C58458a.m226667a(frameLayout);
                }
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                AbstractC58463a aVar = aVar;
                if (aVar != null) {
                    aVar.mo197929a();
                    C58458a.m226667a(frameLayout);
                }
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.widget.floatwindow.cardbag.C58458a.C584624 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C58458a.m226665a(valueAnimator, frameLayout, dimension);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
        return ofFloat;
    }

    /* renamed from: a */
    public static ValueAnimator m226663a(final FrameLayout frameLayout, final int i, final AbstractC58463a aVar) {
        final int dimension = (int) frameLayout.getResources().getDimension(R.dimen.card_dp_step);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.widget.floatwindow.cardbag.C58458a.C584591 */

            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                AbstractC58463a aVar = aVar;
                if (aVar != null) {
                    aVar.mo197929a();
                }
                C58458a.m226667a(frameLayout);
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                AbstractC58463a aVar = aVar;
                if (aVar != null) {
                    aVar.mo197929a();
                }
                C58458a.m226667a(frameLayout);
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.widget.floatwindow.cardbag.C58458a.C584602 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C58458a.m226666a(valueAnimator, frameLayout, dimension, i);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
        return ofFloat;
    }

    /* renamed from: a */
    public static void m226665a(ValueAnimator valueAnimator, FrameLayout frameLayout, int i) {
        C58464b bVar;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int childCount = frameLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int i3 = childCount - 1;
            int i4 = i3 - i2;
            View childAt = frameLayout.getChildAt(i4);
            if (childAt != null && (bVar = (C58464b) childAt.getTag()) != null) {
                int c = bVar.mo197940c();
                int a = (int) (((float) c) + (((float) (m226662a(i4, i3, i) - c)) * floatValue));
                int b = bVar.mo197939b();
                childAt.setPadding(a, (int) (((float) b) + (((float) (m226669c(i4, i3, i) - b)) * floatValue)), a, 0);
                if (i4 == i3) {
                    if (bVar.mo197936a() > childAt.getHeight()) {
                        childAt.getLayoutParams().height = childAt.getHeight() + ((int) (((float) (bVar.mo197936a() - childAt.getHeight())) * floatValue));
                        childAt.requestLayout();
                    } else if (bVar.mo197936a() == 0 && childAt.getLayoutParams().height != -2) {
                        childAt.getLayoutParams().height = -2;
                        childAt.requestLayout();
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m226666a(ValueAnimator valueAnimator, FrameLayout frameLayout, int i, int i2) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int childCount = frameLayout.getChildCount();
        int i3 = childCount - 1;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (int) (((float) (((i3 - i4) - 1) * i * 2)) + (((float) (i * 2)) * floatValue));
            View childAt = frameLayout.getChildAt(i4);
            int i6 = i4 * i;
            if (childCount > 3) {
                i6 = (int) (((float) i6) - (((float) i) * floatValue));
            }
            childAt.setPadding(i5, i6, i5, 0);
            if (childAt.getHeight() > i2) {
                childAt.getLayoutParams().height = childAt.getHeight() + ((int) (((float) (i2 - childAt.getHeight())) * floatValue));
                childAt.requestLayout();
            }
        }
    }
}
