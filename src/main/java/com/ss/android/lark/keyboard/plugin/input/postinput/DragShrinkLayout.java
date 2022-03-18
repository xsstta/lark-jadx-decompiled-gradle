package com.ss.android.lark.keyboard.plugin.input.postinput;

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
import com.ss.android.lark.log.Log;

public class DragShrinkLayout extends LinearLayout {

    /* renamed from: a */
    public AbstractC40746a f103516a;

    /* renamed from: b */
    private float f103517b;

    /* renamed from: c */
    private float f103518c;

    /* renamed from: d */
    private float f103519d;

    /* renamed from: e */
    private float f103520e;

    /* renamed from: f */
    private VelocityTracker f103521f;

    /* renamed from: g */
    private int f103522g;

    /* renamed from: h */
    private boolean f103523h;

    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout$a */
    public interface AbstractC40746a {
        /* renamed from: a */
        void mo147092a();

        /* renamed from: a */
        void mo147093a(float f, float f2);

        /* renamed from: b */
        void mo147094b();

        /* renamed from: c */
        void mo147095c();

        /* renamed from: d */
        void mo147096d();

        /* renamed from: e */
        void mo147097e();
    }

    /* renamed from: c */
    private void m161242c() {
        ViewConfiguration.get(getContext());
        this.f103520e = (float) ViewConfiguration.getMaximumFlingVelocity();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f103521f = VelocityTracker.obtain();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        VelocityTracker velocityTracker = this.f103521f;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f103521f = null;
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public void mo147182a() {
        final float height = (float) getRootView().getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getTranslationY(), 0.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.C407421 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DragShrinkLayout.this.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (DragShrinkLayout.this.f103516a != null) {
                    DragShrinkLayout.this.f103516a.mo147093a(height, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.C407432 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (DragShrinkLayout.this.f103516a != null) {
                    DragShrinkLayout.this.f103516a.mo147095c();
                }
            }

            public void onAnimationStart(Animator animator) {
                if (DragShrinkLayout.this.f103516a != null) {
                    DragShrinkLayout.this.f103516a.mo147094b();
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat);
        animatorSet.start();
    }

    /* renamed from: b */
    public void mo147185b() {
        float translationY = getTranslationY();
        final float height = (float) getRootView().getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.C407443 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DragShrinkLayout.this.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (DragShrinkLayout.this.f103516a != null) {
                    DragShrinkLayout.this.f103516a.mo147093a(height, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.C407454 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationCancel(Animator animator) {
                if (DragShrinkLayout.this.f103516a != null) {
                    DragShrinkLayout.this.f103516a.mo147097e();
                }
            }

            public void onAnimationEnd(Animator animator) {
                if (DragShrinkLayout.this.f103516a != null) {
                    DragShrinkLayout.this.f103516a.mo147097e();
                }
            }

            public void onAnimationStart(Animator animator) {
                if (DragShrinkLayout.this.f103516a != null) {
                    DragShrinkLayout.this.f103516a.mo147096d();
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat);
        animatorSet.start();
    }

    public void setDragEnabled(boolean z) {
        this.f103523h = z;
    }

    public void setListener(AbstractC40746a aVar) {
        this.f103516a = aVar;
    }

    public DragShrinkLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f103523h) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        Log.m165379d("DragShrinkLayout", "onInterceptTouchEvent: " + motionEvent.getRawY());
        if (motionEvent.getAction() == 0) {
            this.f103518c = motionEvent.getRawY();
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3 && motionEvent.getRawY() - this.f103518c > 20.0f && !mo147184a(this, motionEvent)) {
            this.f103517b = motionEvent.getRawY();
            this.f103519d = BitmapDescriptorFactory.HUE_RED;
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        Log.m165379d("DragShrinkLayout", "onTouchEvent: " + motionEvent.getAction());
        if (this.f103521f == null) {
            this.f103521f = VelocityTracker.obtain();
        }
        this.f103521f.addMovement(motionEvent);
        VelocityTracker velocityTracker = this.f103521f;
        velocityTracker.computeCurrentVelocity(1000, this.f103520e);
        float xVelocity = velocityTracker.getXVelocity();
        float yVelocity = velocityTracker.getYVelocity();
        if (action != 1) {
            if (action == 2) {
                float rawY = this.f103519d + (motionEvent.getRawY() - this.f103517b);
                this.f103519d = rawY;
                if (rawY < BitmapDescriptorFactory.HUE_RED) {
                    this.f103519d = BitmapDescriptorFactory.HUE_RED;
                }
                setTranslationY(this.f103519d);
                this.f103516a.mo147093a((float) getRootView().getHeight(), this.f103519d);
                this.f103517b = motionEvent.getRawY();
                AbstractC40746a aVar = this.f103516a;
                if (aVar != null) {
                    aVar.mo147092a();
                }
            }
        } else if (yVelocity > 2000.0f || this.f103519d > 300.0f) {
            mo147185b();
        } else {
            mo147182a();
        }
        Log.m165379d("DragShrinkLayout", "onTouchEvent: " + xVelocity + "   " + yVelocity);
        Log.m165379d("DragShrinkLayout", "onTouchEvent: totaloffset=" + this.f103519d + " current=" + motionEvent.getRawY() + " pre=" + this.f103517b + " start=" + this.f103518c);
        return super.onTouchEvent(motionEvent);
    }

    public DragShrinkLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getSize(i2) == 0 && ((View.MeasureSpec.getMode(i2) == 1073741824 || View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) && this.f103522g != 0)) {
            post(new Runnable() {
                /* class com.ss.android.lark.keyboard.plugin.input.postinput.$$Lambda$XtW6_O0PnvhT3bYdDz_76aV3pxM */

                public final void run() {
                    DragShrinkLayout.this.requestLayout();
                }
            });
        }
        this.f103522g = getMeasuredHeight();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo147184a(ViewGroup viewGroup, MotionEvent motionEvent) {
        boolean z;
        if (viewGroup.canScrollVertically(-1)) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && mo147183a(childAt, motionEvent.getRawX(), motionEvent.getRawY())) {
                if (childAt instanceof ViewGroup) {
                    z = mo147184a((ViewGroup) childAt, motionEvent);
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
        this.f103523h = true;
        m161242c();
    }

    /* renamed from: a */
    public boolean mo147183a(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(f, f2);
    }
}
