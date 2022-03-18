package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.calendar.impl.utils.ao;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 $2\u00020\u0001:\u0002$%B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\fJ\b\u0010\"\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020 H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/DragShrinkLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isScrollingUp", "", "mListener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/DragShrinkLayout$ShrinkLayoutChangeListener;", "mPreY", "", "mStartY", "mTotalOffsetY", "mVerticalSlop", "isChildNeedScroll", "viewGroup", "Landroid/view/ViewGroup;", "ev", "Landroid/view/MotionEvent;", "isLocationInView", "view", "Landroid/view/View;", "x", "y", "onInterceptTouchEvent", "onTouchEvent", "event", "setListener", "", "listener", "startHideAnim", "startShowAnim", "Companion", "ShrinkLayoutChangeListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public class DragShrinkLayout extends LinearLayout {

    /* renamed from: b */
    public static final Companion f79706b = new Companion(null);

    /* renamed from: a */
    public ShrinkLayoutChangeListener f79707a;

    /* renamed from: c */
    private float f79708c;

    /* renamed from: d */
    private float f79709d;

    /* renamed from: e */
    private float f79710e;

    /* renamed from: f */
    private boolean f79711f;

    /* renamed from: g */
    private final int f79712g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/DragShrinkLayout$ShrinkLayoutChangeListener;", "", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutHideAnimEnd", "onLayoutHideAnimStart", "onLayoutShowAnimEnd", "onLayoutShowAnimStart", "startDrag", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout$b */
    public interface ShrinkLayoutChangeListener {
        /* renamed from: a */
        void mo114136a();

        /* renamed from: a */
        void mo114137a(float f, float f2);

        /* renamed from: b */
        void mo114138b();

        /* renamed from: c */
        void mo114139c();

        /* renamed from: d */
        void mo114140d();

        /* renamed from: e */
        void mo114141e();
    }

    public DragShrinkLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public DragShrinkLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/DragShrinkLayout$Companion;", "", "()V", "Down", "", "MAX_OFFSET", "TAG", "", "UP", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m118369a() {
        View rootView = getRootView();
        Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getTranslationY(), 0.0f);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "anim");
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C31457e(this, (float) rootView.getHeight()));
        ofFloat.addListener(new C31458f(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat);
        animatorSet.start();
    }

    /* renamed from: b */
    private final void m118372b() {
        float translationY = getTranslationY();
        View rootView = getRootView();
        Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
        float height = (float) rootView.getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "anim");
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C31455c(this, height));
        ofFloat.addListener(new C31456d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat);
        animatorSet.start();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/widget/DragShrinkLayout$startHideAnim$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout$d */
    public static final class C31456d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkLayout f79715a;

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31456d(DragShrinkLayout dragShrinkLayout) {
            this.f79715a = dragShrinkLayout;
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (this.f79715a.f79707a != null) {
                ShrinkLayoutChangeListener bVar = this.f79715a.f79707a;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                bVar.mo114141e();
            }
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (this.f79715a.f79707a != null) {
                ShrinkLayoutChangeListener bVar = this.f79715a.f79707a;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                bVar.mo114141e();
            }
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (this.f79715a.f79707a != null) {
                ShrinkLayoutChangeListener bVar = this.f79715a.f79707a;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                bVar.mo114140d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/widget/DragShrinkLayout$startShowAnim$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout$f */
    public static final class C31458f implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkLayout f79718a;

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31458f(DragShrinkLayout dragShrinkLayout) {
            this.f79718a = dragShrinkLayout;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (this.f79718a.f79707a != null) {
                ShrinkLayoutChangeListener bVar = this.f79718a.f79707a;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                bVar.mo114139c();
            }
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (this.f79718a.f79707a != null) {
                ShrinkLayoutChangeListener bVar = this.f79718a.f79707a;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                bVar.mo114138b();
            }
        }
    }

    public final void setListener(ShrinkLayoutChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f79707a = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout$c */
    public static final class C31455c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkLayout f79713a;

        /* renamed from: b */
        final /* synthetic */ float f79714b;

        C31455c(DragShrinkLayout dragShrinkLayout, float f) {
            this.f79713a = dragShrinkLayout;
            this.f79714b = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DragShrinkLayout dragShrinkLayout = this.f79713a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                dragShrinkLayout.setTranslationY(((Float) animatedValue).floatValue());
                if (this.f79713a.f79707a != null) {
                    ShrinkLayoutChangeListener bVar = this.f79713a.f79707a;
                    if (bVar == null) {
                        Intrinsics.throwNpe();
                    }
                    float f = this.f79714b;
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        bVar.mo114137a(f, ((Float) animatedValue2).floatValue());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout$e */
    public static final class C31457e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkLayout f79716a;

        /* renamed from: b */
        final /* synthetic */ float f79717b;

        C31457e(DragShrinkLayout dragShrinkLayout, float f) {
            this.f79716a = dragShrinkLayout;
            this.f79717b = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DragShrinkLayout dragShrinkLayout = this.f79716a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                dragShrinkLayout.setTranslationY(((Float) animatedValue).floatValue());
                if (this.f79716a.f79707a != null) {
                    ShrinkLayoutChangeListener bVar = this.f79716a.f79707a;
                    if (bVar == null) {
                        Intrinsics.throwNpe();
                    }
                    float f = this.f79717b;
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        bVar.mo114137a(f, ((Float) animatedValue2).floatValue());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        if (motionEvent.getAction() == 0) {
            this.f79709d = motionEvent.getRawY();
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3 && motionEvent.getRawY() - this.f79709d > ((float) 20) && !m118371a(this, motionEvent)) {
            this.f79708c = motionEvent.getRawY();
            this.f79710e = BitmapDescriptorFactory.HUE_RED;
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 1) {
            if (action == 2) {
                if (Math.abs(motionEvent.getRawY() - this.f79708c) > ((float) this.f79712g)) {
                    if (motionEvent.getRawY() - this.f79708c > ((float) 0)) {
                        z = false;
                    }
                    this.f79711f = z;
                }
                float rawY = this.f79710e + (motionEvent.getRawY() - this.f79708c);
                this.f79710e = rawY;
                if (rawY < ((float) 0)) {
                    this.f79710e = BitmapDescriptorFactory.HUE_RED;
                }
                ShrinkLayoutChangeListener bVar = this.f79707a;
                if (bVar != null) {
                    if (bVar == null) {
                        Intrinsics.throwNpe();
                    }
                    View rootView = getRootView();
                    Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                    bVar.mo114137a((float) rootView.getHeight(), this.f79710e);
                    ShrinkLayoutChangeListener bVar2 = this.f79707a;
                    if (bVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    bVar2.mo114136a();
                }
                setTranslationY(this.f79710e);
                this.f79708c = motionEvent.getRawY();
            }
        } else if (this.f79710e <= ((float) 240) || this.f79711f) {
            m118369a();
        } else {
            m118372b();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private final boolean m118371a(ViewGroup viewGroup, MotionEvent motionEvent) {
        boolean z;
        if (viewGroup.canScrollVertically(-1)) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && m118370a(childAt, motionEvent.getRawX(), motionEvent.getRawY())) {
                if (childAt instanceof ViewGroup) {
                    z = m118371a((ViewGroup) childAt, motionEvent);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragShrinkLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f79712g = ao.m125215a();
    }

    /* renamed from: a */
    private final boolean m118370a(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(f, f2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DragShrinkLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
