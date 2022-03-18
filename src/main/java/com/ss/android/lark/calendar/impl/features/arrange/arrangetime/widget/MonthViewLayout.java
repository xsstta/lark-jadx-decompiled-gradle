package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.ss.android.lark.calendar.impl.utils.ao;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\tH\u0002J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020$H\u0016J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/MonthViewLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDownX", "", "mDownY", "mIsScrollingUp", "", "mLastY", "mMonthValueAnimator", "Landroid/animation/ValueAnimator;", "mMonthViewListener", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/MonthViewListener;", "getMMonthViewListener", "()Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/MonthViewListener;", "setMMonthViewListener", "(Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/MonthViewListener;)V", "mTitleHeight", "getMTitleHeight", "()I", "setMTitleHeight", "(I)V", "mVerticalSlop", "autoScroll", "", "hideMonthView", "dy", "isInCalendar", "downY", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "event", "spreadMonthView", "startScroll", "start", "end", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MonthViewLayout extends LinearLayout {

    /* renamed from: b */
    public static final Companion f75518b = new Companion(null);

    /* renamed from: a */
    public boolean f75519a;

    /* renamed from: c */
    private int f75520c;

    /* renamed from: d */
    private int f75521d;

    /* renamed from: e */
    private int f75522e;

    /* renamed from: f */
    private int f75523f;

    /* renamed from: g */
    private ValueAnimator f75524g;

    /* renamed from: h */
    private MonthViewListener f75525h;

    /* renamed from: i */
    private int f75526i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/MonthViewLayout$Companion;", "", "()V", "ANIMATION_DURATION", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.MonthViewLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final MonthViewListener getMMonthViewListener() {
        return this.f75525h;
    }

    public final int getMTitleHeight() {
        return this.f75526i;
    }

    /* renamed from: a */
    private final void m112192a() {
        if (getBottom() > ((getHeight() / 3) * 2) + this.f75526i) {
            this.f75519a = false;
            m112193a(getTop(), this.f75526i);
            return;
        }
        this.f75519a = true;
        m112193a(getTop(), (-getHeight()) + this.f75526i);
    }

    public final void setMMonthViewListener(MonthViewListener bVar) {
        this.f75525h = bVar;
    }

    public final void setMTitleHeight(int i) {
        this.f75526i = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthViewLayout(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final boolean m112194a(int i) {
        int height = (getHeight() + this.f75526i) - 1;
        if (i >= 0 && height >= i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final void m112195b(int i) {
        offsetTopAndBottom(-Math.min(Math.abs(i), getTop() - (this.f75526i - getHeight())));
    }

    /* renamed from: c */
    private final void m112196c(int i) {
        offsetTopAndBottom(Math.min(Math.abs(i), this.f75526i - getTop()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 != 3) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == r1) goto L_0x0027
            r2 = 2
            if (r0 == r2) goto L_0x0013
            r4 = 3
            if (r0 == r4) goto L_0x0027
            goto L_0x002a
        L_0x0013:
            float r4 = r4.getRawY()
            int r4 = (int) r4
            int r0 = r3.f75522e
            int r0 = r0 - r4
            if (r0 <= 0) goto L_0x0021
            r3.m112195b(r0)
            goto L_0x0024
        L_0x0021:
            r3.m112196c(r0)
        L_0x0024:
            r3.f75522e = r4
            goto L_0x002a
        L_0x0027:
            r3.m112192a()
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.MonthViewLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f75521d = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            this.f75520c = rawY;
            this.f75522e = rawY;
        } else if (action == 2) {
            int abs = Math.abs(this.f75520c - ((int) motionEvent.getRawY()));
            int abs2 = Math.abs(this.f75521d - ((int) motionEvent.getRawX()));
            boolean a = m112194a(this.f75520c);
            if (abs2 < abs && abs > this.f75523f && a) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f75523f = ao.m125215a();
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f75524g = valueAnimator;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthValueAnimator");
        }
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.MonthViewLayout.C302231 */

            /* renamed from: a */
            final /* synthetic */ MonthViewLayout f75527a;

            {
                this.f75527a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    this.f75527a.offsetTopAndBottom(((Integer) animatedValue).intValue() - this.f75527a.getTop());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        });
        ValueAnimator valueAnimator2 = this.f75524g;
        if (valueAnimator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthValueAnimator");
        }
        valueAnimator2.addListener(new Animator.AnimatorListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.MonthViewLayout.C302242 */

            /* renamed from: a */
            final /* synthetic */ MonthViewLayout f75528a;

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
                this.f75528a = r1;
            }

            public void onAnimationEnd(Animator animator) {
                MonthViewListener mMonthViewListener;
                Intrinsics.checkParameterIsNotNull(animator, "animation");
                if (this.f75528a.f75519a && (mMonthViewListener = this.f75528a.getMMonthViewListener()) != null) {
                    mMonthViewListener.mo109112a();
                }
            }
        });
    }

    /* renamed from: a */
    private final void m112193a(int i, int i2) {
        ValueAnimator valueAnimator = this.f75524g;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthValueAnimator");
        }
        valueAnimator.setIntValues(i, i2);
        ValueAnimator valueAnimator2 = this.f75524g;
        if (valueAnimator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthValueAnimator");
        }
        valueAnimator2.setDuration(150L);
        ValueAnimator valueAnimator3 = this.f75524g;
        if (valueAnimator3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthValueAnimator");
        }
        valueAnimator3.start();
    }
}
