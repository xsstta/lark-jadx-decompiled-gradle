package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.animation.Animator;
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
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\b\u0016\u0018\u0000 >2\u00020\u0001:\u0003>?@B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\u0017J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J \u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0002J\"\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'J>\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0002J\b\u0010-\u001a\u00020\u0017H\u0002J\b\u0010.\u001a\u00020\u0017H\u0002J\u0010\u0010/\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u001cH\u0016J\u000e\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u0012J\u000e\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\nJ\u000e\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\nJ\u000e\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u0010J\u000e\u0010:\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u0012J\u0006\u0010;\u001a\u00020\u0017J\u000e\u0010<\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u0012J\b\u0010=\u001a\u00020\u0017H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "forbidMiddleStop", "", "isScrollingUp", "mDragLayoutType", "mIsDisableDrag", "mIsForceDismissWhenScrollDown", "mListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$ShrinkLayoutChangeListener;", "mMaxTranslationY", "", "mNormalTranslationY", "mPreY", "mStartY", "mTotalOffsetY", "", "isChildNeedScroll", "viewGroup", "Landroid/view/ViewGroup;", "ev", "Landroid/view/MotionEvent;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "isLocationInView", "view", "Landroid/view/View;", "x", "y", "makeAnimation", "start", "end", "animListener", "Landroid/animation/Animator$AnimatorListener;", "startType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$POSITION;", "endType", "animDuration", "", "moveToBottom", "moveToTop", "onInterceptTouchEvent", "onTouchEvent", "event", "setInitTranslationY", "translationY", "setIsDisableDrag", "isDisableDrag", "setIsForceDismissWhenScrollDown", "isDismissWhenScrollDown", "setListener", "listener", "setMaxTranslationY", "setMiddleDragType", "setMiddleTranslationY", "startDragAnim", "Companion", "POSITION", "ShrinkLayoutChangeListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public class VerticalDragLayout extends LinearLayout {

    /* renamed from: c */
    public static final Companion f80992c = new Companion(null);

    /* renamed from: a */
    public ShrinkLayoutChangeListener f80993a;

    /* renamed from: b */
    public float f80994b;

    /* renamed from: d */
    private float f80995d;

    /* renamed from: e */
    private float f80996e;

    /* renamed from: f */
    private float f80997f;

    /* renamed from: g */
    private boolean f80998g;

    /* renamed from: h */
    private boolean f80999h;

    /* renamed from: i */
    private float f81000i;

    /* renamed from: j */
    private boolean f81001j;

    /* renamed from: k */
    private int f81002k;

    /* renamed from: l */
    private boolean f81003l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$POSITION;", "", "(Ljava/lang/String;I)V", "TOP", "MIDDLE", "BOTTOM", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum POSITION {
        TOP,
        MIDDLE,
        BOTTOM
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$ShrinkLayoutChangeListener;", "", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutAnimCancel", "start", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$POSITION;", "end", "onLayoutAnimEnd", "onLayoutAnimStart", "startDrag", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout$b */
    public interface ShrinkLayoutChangeListener {
        /* renamed from: a */
        void mo110178a();

        /* renamed from: a */
        void mo110179a(float f, float f2);

        /* renamed from: a */
        void mo110180a(POSITION position, POSITION position2);

        /* renamed from: b */
        void mo110181b(POSITION position, POSITION position2);
    }

    public VerticalDragLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public VerticalDragLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: c */
    public final void mo115977c() {
        this.f81002k = 1;
    }

    /* renamed from: d */
    public final void mo115978d() {
        this.f81003l = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$Companion;", "", "()V", "DOWN", "", "MAX_OFFSET", "TAG", "", "TYPE_MIDDLE", "TYPE_TOP", "TYPE_TRIPLE", "UP", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void mo110174a() {
        m120742a(this, getTranslationY(), (float) getHeight(), POSITION.TOP, POSITION.BOTTOM, 0, null, 48, null);
    }

    /* renamed from: b */
    private final void mo110175b() {
        m120742a(this, getTranslationY(), BitmapDescriptorFactory.HUE_RED, POSITION.BOTTOM, POSITION.TOP, 0, null, 48, null);
    }

    /* renamed from: e */
    private final void m120746e() {
        long j;
        POSITION position;
        POSITION position2;
        float f;
        float f2;
        POSITION position3;
        POSITION position4;
        long j2 = 250;
        if (getTranslationY() > this.f81000i) {
            if (this.f80998g) {
                position4 = POSITION.BOTTOM;
                position3 = POSITION.MIDDLE;
                f2 = this.f81000i;
            } else {
                position4 = POSITION.MIDDLE;
                position3 = POSITION.BOTTOM;
                View rootView = getRootView();
                Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                f2 = (float) rootView.getHeight();
            }
        } else if (getTranslationY() > this.f81000i) {
            position4 = POSITION.TOP;
            position3 = POSITION.MIDDLE;
            f2 = this.f81000i;
        } else if (this.f80998g) {
            position2 = POSITION.MIDDLE;
            position = POSITION.TOP;
            j = 250;
            f = BitmapDescriptorFactory.HUE_RED;
            m120742a(this, getTranslationY(), f, position2, position, j, null, 32, null);
        } else if (this.f81001j) {
            position4 = POSITION.TOP;
            position3 = POSITION.BOTTOM;
            View rootView2 = getRootView();
            Intrinsics.checkExpressionValueIsNotNull(rootView2, "rootView");
            f2 = (float) rootView2.getHeight();
            j2 = 350;
        } else {
            position4 = POSITION.TOP;
            position3 = POSITION.MIDDLE;
            f2 = this.f81000i;
        }
        position2 = position4;
        position = position3;
        f = f2;
        j = j2;
        m120742a(this, getTranslationY(), f, position2, position, j, null, 32, null);
    }

    public final void setInitTranslationY(float f) {
        setTranslationY(f);
    }

    public final void setIsDisableDrag(boolean z) {
        this.f80999h = z;
    }

    public final void setIsForceDismissWhenScrollDown(boolean z) {
        this.f81001j = z;
    }

    public final void setMaxTranslationY(float f) {
        this.f80994b = f;
    }

    public final void setMiddleTranslationY(float f) {
        this.f81000i = f;
    }

    public final void setListener(ShrinkLayoutChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f80993a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$makeAnimation$4", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout$e */
    public static final class C31814e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ VerticalDragLayout f81006a;

        /* renamed from: b */
        final /* synthetic */ POSITION f81007b;

        /* renamed from: c */
        final /* synthetic */ POSITION f81008c;

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ShrinkLayoutChangeListener bVar = this.f81006a.f80993a;
            if (bVar != null) {
                bVar.mo110181b(this.f81007b, this.f81008c);
            }
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ShrinkLayoutChangeListener bVar = this.f81006a.f80993a;
            if (bVar != null) {
                bVar.mo110181b(this.f81007b, this.f81008c);
            }
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ShrinkLayoutChangeListener bVar = this.f81006a.f80993a;
            if (bVar != null) {
                bVar.mo110180a(this.f81007b, this.f81008c);
            }
        }

        C31814e(VerticalDragLayout verticalDragLayout, POSITION position, POSITION position2) {
            this.f81006a = verticalDragLayout;
            this.f81007b = position;
            this.f81008c = position2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout$c */
    public static final class C31812c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VerticalDragLayout f81004a;

        C31812c(VerticalDragLayout verticalDragLayout) {
            this.f81004a = verticalDragLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            VerticalDragLayout verticalDragLayout = this.f81004a;
            float f = verticalDragLayout.f80994b;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                verticalDragLayout.setTranslationY(Math.min(f, ((Float) animatedValue).floatValue()));
                ShrinkLayoutChangeListener bVar = this.f81004a.f80993a;
                if (bVar != null) {
                    View rootView = this.f81004a.getRootView();
                    Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                    float height = (float) rootView.getHeight();
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        bVar.mo110179a(height, ((Float) animatedValue2).floatValue());
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
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout$d */
    public static final class C31813d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VerticalDragLayout f81005a;

        C31813d(VerticalDragLayout verticalDragLayout) {
            this.f81005a = verticalDragLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            VerticalDragLayout verticalDragLayout = this.f81005a;
            float f = verticalDragLayout.f80994b;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                verticalDragLayout.setTranslationY(Math.min(f, ((Float) animatedValue).floatValue()));
                ShrinkLayoutChangeListener bVar = this.f81005a.f80993a;
                if (bVar != null) {
                    View rootView = this.f81005a.getRootView();
                    Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                    float height = (float) rootView.getHeight();
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        bVar.mo110179a(height, ((Float) animatedValue2).floatValue());
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
            this.f80996e = motionEvent.getRawY();
        } else if (!(motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float f = (float) 20;
            if ((Math.abs(motionEvent.getRawY() - this.f80996e) > f && getTranslationY() > BitmapDescriptorFactory.HUE_RED) || (getTranslationY() == BitmapDescriptorFactory.HUE_RED && motionEvent.getRawY() - this.f80996e > f && !m120744a(this, motionEvent, -1))) {
                this.f80995d = motionEvent.getRawY();
                this.f80997f = getTranslationY();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction();
        if (this.f80999h) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = true;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawY = motionEvent.getRawY() - this.f80995d;
                    float f = (float) 0;
                    if (rawY > f) {
                        z = false;
                    }
                    this.f80998g = z;
                    float f2 = this.f80997f + rawY;
                    this.f80997f = f2;
                    if (f2 < f) {
                        this.f80997f = BitmapDescriptorFactory.HUE_RED;
                    }
                    setTranslationY(Math.min(this.f80994b, this.f80997f));
                    ShrinkLayoutChangeListener bVar = this.f80993a;
                    if (bVar != null) {
                        View rootView = getRootView();
                        Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                        bVar.mo110179a((float) rootView.getHeight(), getTranslationY());
                    }
                    ShrinkLayoutChangeListener bVar2 = this.f80993a;
                    if (bVar2 != null) {
                        bVar2.mo110178a();
                    }
                    this.f80995d = motionEvent.getRawY();
                }
            } else if (this.f81002k != 1 && !this.f81003l) {
                m120746e();
            } else if (this.f80997f <= ((float) 240) || this.f80998g) {
                mo110175b();
            } else {
                mo110174a();
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f80996e = motionEvent.getRawY();
        this.f80997f = getTranslationY();
        this.f80995d = motionEvent.getRawY();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerticalDragLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f81000i = (float) UIHelper.dp2px(250.0f);
        this.f80994b = (float) DeviceUtils.getScreenHeight(context);
    }

    /* renamed from: a */
    private final boolean m120743a(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(f, f2);
    }

    /* renamed from: a */
    private final boolean m120744a(ViewGroup viewGroup, MotionEvent motionEvent, int i) {
        boolean z;
        if (viewGroup.canScrollVertically(i)) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null && m120743a(childAt, motionEvent.getRawX(), motionEvent.getRawY())) {
                if (childAt instanceof ViewGroup) {
                    z = m120744a((ViewGroup) childAt, motionEvent, i);
                } else {
                    z = childAt.canScrollVertically(i);
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo115976a(float f, float f2, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "anim");
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C31812c(this));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerticalDragLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    private final void m120741a(float f, float f2, POSITION position, POSITION position2, long j, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "anim");
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C31813d(this));
        ofFloat.addListener(new C31814e(this, position, position2));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.setDuration(j);
        ofFloat.start();
    }

    /* renamed from: a */
    static /* synthetic */ void m120742a(VerticalDragLayout verticalDragLayout, float f, float f2, POSITION position, POSITION position2, long j, Animator.AnimatorListener animatorListener, int i, Object obj) {
        long j2;
        Animator.AnimatorListener animatorListener2;
        if (obj == null) {
            if ((i & 16) != 0) {
                j2 = 250;
            } else {
                j2 = j;
            }
            if ((i & 32) != 0) {
                animatorListener2 = null;
            } else {
                animatorListener2 = animatorListener;
            }
            verticalDragLayout.m120741a(f, f2, position, position2, j2, animatorListener2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeAnimation");
    }
}
