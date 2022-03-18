package com.ss.android.vc.meeting.module.subtitle.widget;

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

public class DragShrinkLayout extends LinearLayout {

    /* renamed from: a */
    public AbstractC63204a f159332a;

    /* renamed from: b */
    private float f159333b;

    /* renamed from: c */
    private float f159334c;

    /* renamed from: d */
    private float f159335d;

    /* renamed from: e */
    private float f159336e;

    /* renamed from: f */
    private VelocityTracker f159337f;

    /* renamed from: com.ss.android.vc.meeting.module.subtitle.widget.DragShrinkLayout$a */
    public interface AbstractC63204a {
        /* renamed from: a */
        void mo218766a();

        /* renamed from: a */
        void mo218767a(float f, float f2);

        /* renamed from: b */
        void mo218768b();

        /* renamed from: c */
        void mo218769c();

        /* renamed from: d */
        void mo218770d();

        /* renamed from: e */
        void mo218771e();
    }

    /* renamed from: c */
    private void m247509c() {
        ViewConfiguration.get(getContext());
        this.f159336e = (float) ViewConfiguration.getMaximumFlingVelocity();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f159337f = VelocityTracker.obtain();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        VelocityTracker velocityTracker = this.f159337f;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f159337f = null;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo218746a() {
        final float height = (float) getRootView().getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getTranslationY(), 0.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.widget.DragShrinkLayout.C632001 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DragShrinkLayout.this.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (DragShrinkLayout.this.f159332a != null) {
                    DragShrinkLayout.this.f159332a.mo218767a(height, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.widget.DragShrinkLayout.C632012 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (DragShrinkLayout.this.f159332a != null) {
                    DragShrinkLayout.this.f159332a.mo218769c();
                }
            }

            public void onAnimationStart(Animator animator) {
                if (DragShrinkLayout.this.f159332a != null) {
                    DragShrinkLayout.this.f159332a.mo218768b();
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat);
        animatorSet.start();
    }

    /* renamed from: b */
    public void mo218749b() {
        float translationY = getTranslationY();
        final float height = (float) getRootView().getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.widget.DragShrinkLayout.C632023 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DragShrinkLayout.this.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (DragShrinkLayout.this.f159332a != null) {
                    DragShrinkLayout.this.f159332a.mo218767a(height, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.widget.DragShrinkLayout.C632034 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationCancel(Animator animator) {
                if (DragShrinkLayout.this.f159332a != null) {
                    DragShrinkLayout.this.f159332a.mo218771e();
                }
            }

            public void onAnimationEnd(Animator animator) {
                if (DragShrinkLayout.this.f159332a != null) {
                    DragShrinkLayout.this.f159332a.mo218771e();
                }
            }

            public void onAnimationStart(Animator animator) {
                if (DragShrinkLayout.this.f159332a != null) {
                    DragShrinkLayout.this.f159332a.mo218770d();
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat);
        animatorSet.start();
    }

    public void setListener(AbstractC63204a aVar) {
        this.f159332a = aVar;
    }

    public DragShrinkLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f159334c = motionEvent.getRawY();
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3 && motionEvent.getRawY() - this.f159334c > 20.0f && !mo218748a(this, motionEvent)) {
            this.f159333b = motionEvent.getRawY();
            this.f159335d = BitmapDescriptorFactory.HUE_RED;
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f159337f == null) {
            this.f159337f = VelocityTracker.obtain();
        }
        this.f159337f.addMovement(motionEvent);
        VelocityTracker velocityTracker = this.f159337f;
        velocityTracker.computeCurrentVelocity(1000, this.f159336e);
        velocityTracker.getXVelocity();
        float yVelocity = velocityTracker.getYVelocity();
        if (action != 1) {
            if (action == 2) {
                float rawY = this.f159335d + (motionEvent.getRawY() - this.f159333b);
                this.f159335d = rawY;
                if (rawY < BitmapDescriptorFactory.HUE_RED) {
                    this.f159335d = BitmapDescriptorFactory.HUE_RED;
                }
                setTranslationY(this.f159335d);
                this.f159332a.mo218767a((float) getRootView().getHeight(), this.f159335d);
                this.f159333b = motionEvent.getRawY();
                AbstractC63204a aVar = this.f159332a;
                if (aVar != null) {
                    aVar.mo218766a();
                }
            }
        } else if (yVelocity > 2000.0f || this.f159335d > 300.0f) {
            mo218749b();
        } else {
            mo218746a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public DragShrinkLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo218748a(ViewGroup viewGroup, MotionEvent motionEvent) {
        boolean z;
        if (viewGroup.canScrollVertically(-1)) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && mo218747a(childAt, motionEvent.getRawX(), motionEvent.getRawY())) {
                if (childAt instanceof ViewGroup) {
                    z = mo218748a((ViewGroup) childAt, motionEvent);
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

    public DragShrinkLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m247509c();
    }

    /* renamed from: a */
    public boolean mo218747a(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(f, f2);
    }
}
