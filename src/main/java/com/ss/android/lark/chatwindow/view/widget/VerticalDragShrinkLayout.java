package com.ss.android.lark.chatwindow.view.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class VerticalDragShrinkLayout extends LinearLayout {

    /* renamed from: a */
    public float f91320a;

    /* renamed from: b */
    public AbstractC35334a f91321b;

    /* renamed from: c */
    private VelocityTracker f91322c;

    /* renamed from: d */
    private float f91323d;

    /* renamed from: e */
    private float f91324e;

    /* renamed from: f */
    private float f91325f;

    /* renamed from: g */
    private float f91326g;

    /* renamed from: com.ss.android.lark.chatwindow.view.widget.VerticalDragShrinkLayout$a */
    public interface AbstractC35334a {
        /* renamed from: a */
        void mo130031a();

        /* renamed from: a */
        void mo130032a(float f, float f2);

        /* renamed from: b */
        void mo130033b();

        /* renamed from: c */
        void mo130034c();

        /* renamed from: d */
        void mo130035d();

        /* renamed from: e */
        void mo130036e();
    }

    /* renamed from: c */
    private void m138041c() {
        ViewConfiguration.get(getContext());
        this.f91325f = (float) ViewConfiguration.getMaximumFlingVelocity();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f91322c = VelocityTracker.obtain();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        VelocityTracker velocityTracker = this.f91322c;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f91322c = null;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo130010a() {
        final float height = (float) getRootView().getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getTranslationY(), 0.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.chatwindow.view.widget.VerticalDragShrinkLayout.C353291 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                VerticalDragShrinkLayout.this.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (VerticalDragShrinkLayout.this.f91321b != null) {
                    VerticalDragShrinkLayout.this.f91321b.mo130032a(height, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.chatwindow.view.widget.VerticalDragShrinkLayout.C353302 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                if (VerticalDragShrinkLayout.this.f91321b != null) {
                    VerticalDragShrinkLayout.this.f91321b.mo130033b();
                }
            }

            public void onAnimationEnd(Animator animator) {
                if (VerticalDragShrinkLayout.this.f91321b != null) {
                    VerticalDragShrinkLayout.this.f91321b.mo130034c();
                }
                VerticalDragShrinkLayout.this.f91320a = BitmapDescriptorFactory.HUE_RED;
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat);
        animatorSet.start();
    }

    /* renamed from: b */
    public void mo130014b() {
        float translationY = getTranslationY();
        final float height = (float) getRootView().getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.chatwindow.view.widget.VerticalDragShrinkLayout.C353313 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                VerticalDragShrinkLayout.this.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (VerticalDragShrinkLayout.this.f91321b != null) {
                    VerticalDragShrinkLayout.this.f91321b.mo130032a(height, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.chatwindow.view.widget.VerticalDragShrinkLayout.C353324 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationCancel(Animator animator) {
                if (VerticalDragShrinkLayout.this.f91321b != null) {
                    VerticalDragShrinkLayout.this.f91321b.mo130036e();
                }
            }

            public void onAnimationStart(Animator animator) {
                if (VerticalDragShrinkLayout.this.f91321b != null) {
                    VerticalDragShrinkLayout.this.f91321b.mo130035d();
                }
            }

            public void onAnimationEnd(Animator animator) {
                if (VerticalDragShrinkLayout.this.f91321b != null) {
                    VerticalDragShrinkLayout.this.f91321b.mo130036e();
                }
                VerticalDragShrinkLayout.this.f91320a = height;
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat);
        animatorSet.start();
    }

    public void setListener(AbstractC35334a aVar) {
        this.f91321b = aVar;
    }

    public VerticalDragShrinkLayout(Context context) {
        this(context, null);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f91323d = motionEvent.getRawY();
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3 && Math.abs(motionEvent.getRawY() - this.f91323d) > 20.0f && !mo130013a(this, motionEvent, -1)) {
            this.f91326g = motionEvent.getRawY();
            this.f91324e = getTranslationY();
            this.f91320a = getTranslationY();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f91322c == null) {
            this.f91322c = VelocityTracker.obtain();
        }
        this.f91322c.addMovement(motionEvent);
        VelocityTracker velocityTracker = this.f91322c;
        velocityTracker.computeCurrentVelocity(1000, this.f91325f);
        float yVelocity = velocityTracker.getYVelocity();
        if (action == 0) {
            this.f91326g = motionEvent.getRawY();
        } else if (action == 1) {
            float translationY = getTranslationY();
            int i = (yVelocity > 2000.0f ? 1 : (yVelocity == 2000.0f ? 0 : -1));
            if (i <= 0 || this.f91320a <= translationY) {
                float f = this.f91320a;
                if (f - translationY <= 150.0f) {
                    if ((i <= 0 || f >= translationY) && translationY - f <= 150.0f) {
                        mo130011a(translationY, f);
                    } else {
                        mo130014b();
                    }
                }
            }
            mo130010a();
        } else if (action == 2) {
            float rawY = this.f91324e + (motionEvent.getRawY() - this.f91326g);
            this.f91324e = rawY;
            if (rawY < BitmapDescriptorFactory.HUE_RED) {
                this.f91324e = BitmapDescriptorFactory.HUE_RED;
            }
            setTranslationY(this.f91324e);
            this.f91326g = motionEvent.getRawY();
            AbstractC35334a aVar = this.f91321b;
            if (aVar != null) {
                aVar.mo130032a((float) getRootView().getHeight(), this.f91324e);
                this.f91321b.mo130031a();
            }
        }
        return true;
    }

    public VerticalDragShrinkLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo130011a(float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.chatwindow.view.widget.VerticalDragShrinkLayout.C353335 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                VerticalDragShrinkLayout.this.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.playTogether(ofFloat);
        animatorSet.start();
    }

    public VerticalDragShrinkLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m138041c();
    }

    /* renamed from: a */
    public boolean mo130012a(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(f, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo130013a(ViewGroup viewGroup, MotionEvent motionEvent, int i) {
        boolean z;
        if (viewGroup.canScrollVertically(i)) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null && mo130012a(childAt, motionEvent.getRawX(), motionEvent.getRawY())) {
                if (childAt instanceof ViewGroup) {
                    z = mo130013a((ViewGroup) childAt, motionEvent, i);
                } else {
                    z = childAt.canScrollVertically(-1);
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }
}
