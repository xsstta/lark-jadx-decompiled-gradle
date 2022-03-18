package com.ss.android.lark.widget.timepicker.monthview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0002J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\tH\u0002J\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\tH\u0002J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/widget/timepicker/monthview/MonthViewLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDownX", "", "mDownY", "mIsScrollingUp", "", "mLastY", "mMonthValueAnimator", "Landroid/animation/ValueAnimator;", "mMonthViewListener", "Lcom/ss/android/lark/widget/timepicker/monthview/MonthViewListener;", "getMMonthViewListener", "()Lcom/ss/android/lark/widget/timepicker/monthview/MonthViewListener;", "setMMonthViewListener", "(Lcom/ss/android/lark/widget/timepicker/monthview/MonthViewListener;)V", "mTitleHeight", "getMTitleHeight", "()I", "setMTitleHeight", "(I)V", "mVerticalSlop", "autoScroll", "", "getMoveOffset", "offset", "maxOffset", "getScaledTouchSlop", "hideMonthView", "dy", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "spreadMonthView", "startScroll", "start", "end", "Companion", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
public final class MonthViewLayout extends LinearLayout {

    /* renamed from: c */
    public static final Companion f147088c = new Companion(null);

    /* renamed from: a */
    public boolean f147089a;

    /* renamed from: b */
    public MonthViewListener f147090b;

    /* renamed from: d */
    private int f147091d;

    /* renamed from: e */
    private ValueAnimator f147092e;

    /* renamed from: f */
    private int f147093f;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/timepicker/monthview/MonthViewLayout$Companion;", "", "()V", "ANIMATION_DURATION", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.timepicker.monthview.MonthViewLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getMTitleHeight() {
        return this.f147093f;
    }

    public final MonthViewListener getMMonthViewListener() {
        MonthViewListener iVar = this.f147090b;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthViewListener");
        }
        return iVar;
    }

    public final void setMTitleHeight(int i) {
        this.f147093f = i;
    }

    public final void setMMonthViewListener(MonthViewListener iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "<set-?>");
        this.f147090b = iVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthViewLayout(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final int m230036a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(context)");
        return viewConfiguration.getScaledTouchSlop();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f147091d = m230036a(context);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f147092e = valueAnimator;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthValueAnimator");
        }
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.ss.android.lark.widget.timepicker.monthview.MonthViewLayout.C592251 */

            /* renamed from: a */
            final /* synthetic */ MonthViewLayout f147094a;

            {
                this.f147094a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    this.f147094a.offsetTopAndBottom(((Integer) animatedValue).intValue() - this.f147094a.getTop());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        });
        ValueAnimator valueAnimator2 = this.f147092e;
        if (valueAnimator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthValueAnimator");
        }
        valueAnimator2.addListener(new Animator.AnimatorListener(this) {
            /* class com.ss.android.lark.widget.timepicker.monthview.MonthViewLayout.C592262 */

            /* renamed from: a */
            final /* synthetic */ MonthViewLayout f147095a;

            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkParameterIsNotNull(animator, "animation");
            }

            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkParameterIsNotNull(animator, "animation");
            }

            public void onAnimationStart(Animator animator) {
                Intrinsics.checkParameterIsNotNull(animator, "animation");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f147095a = r1;
            }

            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkParameterIsNotNull(animator, "animation");
                if (this.f147095a.f147089a) {
                    this.f147095a.getMMonthViewListener().mo201327a();
                }
            }
        });
    }
}
