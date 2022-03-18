package com.ss.android.lark.mail.impl.widget.time.multitimezone;

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
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0016\u0018\u0000 42\u00020\u0001:\u0003456B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J \u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J\"\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$J>\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020)2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0010\u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0018H\u0016J\u000e\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020\nJ\u000e\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020\nJ\u000e\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u000eJ\b\u00103\u001a\u00020 H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/VerticalDragLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isScrollingUp", "", "mIsDisableDrag", "mIsForceDismissWhenScrollDown", "mListener", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/VerticalDragLayout$ShrinkLayoutChangeListener;", "mNormalTranslationY", "", "mPreY", "mStartY", "mTotalOffsetY", "isChildNeedScroll", "viewGroup", "Landroid/view/ViewGroup;", "ev", "Landroid/view/MotionEvent;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "isLocationInView", "view", "Landroid/view/View;", "x", "y", "makeAnimation", "", "start", "end", "animListener", "Landroid/animation/Animator$AnimatorListener;", "startType", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/VerticalDragLayout$POSITION;", "endType", "animDuration", "", "onInterceptTouchEvent", "onTouchEvent", "event", "setIsDisableDrag", "isDisableDrag", "setIsForceDismissWhenScrollDown", "isDismissWhenScrollDown", "setListener", "listener", "startDragAnim", "Companion", "POSITION", "ShrinkLayoutChangeListener", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public class VerticalDragLayout extends LinearLayout {

    /* renamed from: b */
    public static final Companion f111978b = new Companion(null);

    /* renamed from: a */
    public ShrinkLayoutChangeListener f111979a;

    /* renamed from: c */
    private float f111980c;

    /* renamed from: d */
    private float f111981d;

    /* renamed from: e */
    private float f111982e;

    /* renamed from: f */
    private boolean f111983f;

    /* renamed from: g */
    private boolean f111984g;

    /* renamed from: h */
    private float f111985h;

    /* renamed from: i */
    private boolean f111986i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/VerticalDragLayout$POSITION;", "", "(Ljava/lang/String;I)V", "TOP", "MIDDLE", "BOTTOM", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum POSITION {
        TOP,
        MIDDLE,
        BOTTOM
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/VerticalDragLayout$ShrinkLayoutChangeListener;", "", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutAnimCancel", "start", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/VerticalDragLayout$POSITION;", "end", "onLayoutAnimEnd", "onLayoutAnimStart", "startDrag", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.VerticalDragLayout$b */
    public interface ShrinkLayoutChangeListener {
        /* renamed from: a */
        void mo156927a();

        /* renamed from: a */
        void mo156928a(float f, float f2);

        /* renamed from: a */
        void mo156929a(POSITION position, POSITION position2);

        /* renamed from: b */
        void mo156930b(POSITION position, POSITION position2);
    }

    public VerticalDragLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public VerticalDragLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/VerticalDragLayout$Companion;", "", "()V", "DOWN", "", "MAX_OFFSET", "TAG", "", "UP", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.VerticalDragLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m174679a() {
        long j;
        POSITION position;
        POSITION position2;
        float f;
        float f2;
        POSITION position3;
        POSITION position4;
        long j2 = 250;
        if (getTranslationY() > this.f111985h) {
            if (this.f111983f) {
                position4 = POSITION.BOTTOM;
                position3 = POSITION.MIDDLE;
                f2 = this.f111985h;
            } else {
                position4 = POSITION.MIDDLE;
                position3 = POSITION.BOTTOM;
                View rootView = getRootView();
                Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                f2 = (float) rootView.getHeight();
            }
        } else if (getTranslationY() > this.f111985h) {
            position4 = POSITION.TOP;
            position3 = POSITION.MIDDLE;
            f2 = this.f111985h;
        } else if (this.f111983f) {
            position2 = POSITION.MIDDLE;
            position = POSITION.TOP;
            j = 250;
            f = BitmapDescriptorFactory.HUE_RED;
            m174681a(this, getTranslationY(), f, position2, position, j, null, 32, null);
        } else if (this.f111986i) {
            position4 = POSITION.TOP;
            position3 = POSITION.BOTTOM;
            View rootView2 = getRootView();
            Intrinsics.checkExpressionValueIsNotNull(rootView2, "rootView");
            f2 = (float) rootView2.getHeight();
            j2 = 350;
        } else {
            position4 = POSITION.TOP;
            position3 = POSITION.MIDDLE;
            f2 = this.f111985h;
        }
        position2 = position4;
        position = position3;
        f = f2;
        j = j2;
        m174681a(this, getTranslationY(), f, position2, position, j, null, 32, null);
    }

    public final void setIsDisableDrag(boolean z) {
        this.f111984g = z;
    }

    public final void setIsForceDismissWhenScrollDown(boolean z) {
        this.f111986i = z;
    }

    public final void setListener(ShrinkLayoutChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f111979a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/VerticalDragLayout$makeAnimation$4", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.VerticalDragLayout$e */
    public static final class C44102e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ VerticalDragLayout f111989a;

        /* renamed from: b */
        final /* synthetic */ POSITION f111990b;

        /* renamed from: c */
        final /* synthetic */ POSITION f111991c;

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ShrinkLayoutChangeListener bVar = this.f111989a.f111979a;
            if (bVar != null) {
                bVar.mo156930b(this.f111990b, this.f111991c);
            }
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ShrinkLayoutChangeListener bVar = this.f111989a.f111979a;
            if (bVar != null) {
                bVar.mo156930b(this.f111990b, this.f111991c);
            }
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ShrinkLayoutChangeListener bVar = this.f111989a.f111979a;
            if (bVar != null) {
                bVar.mo156929a(this.f111990b, this.f111991c);
            }
        }

        C44102e(VerticalDragLayout verticalDragLayout, POSITION position, POSITION position2) {
            this.f111989a = verticalDragLayout;
            this.f111990b = position;
            this.f111991c = position2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.VerticalDragLayout$c */
    static final class C44100c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VerticalDragLayout f111987a;

        C44100c(VerticalDragLayout verticalDragLayout) {
            this.f111987a = verticalDragLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            VerticalDragLayout verticalDragLayout = this.f111987a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                verticalDragLayout.setTranslationY(((Float) animatedValue).floatValue());
                ShrinkLayoutChangeListener bVar = this.f111987a.f111979a;
                if (bVar != null) {
                    View rootView = this.f111987a.getRootView();
                    Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                    float height = (float) rootView.getHeight();
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        bVar.mo156928a(height, ((Float) animatedValue2).floatValue());
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
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.VerticalDragLayout$d */
    public static final class C44101d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VerticalDragLayout f111988a;

        C44101d(VerticalDragLayout verticalDragLayout) {
            this.f111988a = verticalDragLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            VerticalDragLayout verticalDragLayout = this.f111988a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                verticalDragLayout.setTranslationY(((Float) animatedValue).floatValue());
                ShrinkLayoutChangeListener bVar = this.f111988a.f111979a;
                if (bVar != null) {
                    View rootView = this.f111988a.getRootView();
                    Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                    float height = (float) rootView.getHeight();
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        bVar.mo156928a(height, ((Float) animatedValue2).floatValue());
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
            this.f111981d = motionEvent.getRawY();
        } else if (!(motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float f = (float) 20;
            if ((Math.abs(motionEvent.getRawY() - this.f111981d) > f && getTranslationY() > BitmapDescriptorFactory.HUE_RED) || (getTranslationY() == BitmapDescriptorFactory.HUE_RED && motionEvent.getRawY() - this.f111981d > f && !m174683a(this, motionEvent, -1))) {
                this.f111980c = motionEvent.getRawY();
                this.f111982e = getTranslationY();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction();
        if (this.f111984g) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = true;
        if (action != 0) {
            if (action == 1) {
                m174679a();
            } else if (action == 2) {
                float rawY = motionEvent.getRawY() - this.f111980c;
                float f = (float) 0;
                if (rawY > f) {
                    z = false;
                }
                this.f111983f = z;
                float f2 = this.f111982e + rawY;
                this.f111982e = f2;
                if (f2 < f) {
                    this.f111982e = BitmapDescriptorFactory.HUE_RED;
                }
                setTranslationY(this.f111982e);
                ShrinkLayoutChangeListener bVar = this.f111979a;
                if (bVar != null) {
                    View rootView = getRootView();
                    Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                    bVar.mo156928a((float) rootView.getHeight(), getTranslationY());
                }
                ShrinkLayoutChangeListener bVar2 = this.f111979a;
                if (bVar2 != null) {
                    bVar2.mo156927a();
                }
                this.f111980c = motionEvent.getRawY();
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f111981d = motionEvent.getRawY();
        this.f111982e = getTranslationY();
        this.f111980c = motionEvent.getRawY();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerticalDragLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f111985h = (float) UIHelper.dp2px(250.0f);
    }

    /* renamed from: a */
    private final boolean m174682a(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(f, f2);
    }

    /* renamed from: a */
    private final boolean m174683a(ViewGroup viewGroup, MotionEvent motionEvent, int i) {
        boolean z;
        if (viewGroup.canScrollVertically(i)) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null && m174682a(childAt, motionEvent.getRawX(), motionEvent.getRawY())) {
                if (childAt instanceof ViewGroup) {
                    z = m174683a((ViewGroup) childAt, motionEvent, i);
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
    public final void mo156921a(float f, float f2, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "anim");
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C44100c(this));
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
    private final void m174680a(float f, float f2, POSITION position, POSITION position2, long j, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "anim");
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C44101d(this));
        ofFloat.addListener(new C44102e(this, position, position2));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.setDuration(j);
        ofFloat.start();
    }

    /* renamed from: a */
    static /* synthetic */ void m174681a(VerticalDragLayout verticalDragLayout, float f, float f2, POSITION position, POSITION position2, long j, Animator.AnimatorListener animatorListener, int i, Object obj) {
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
            verticalDragLayout.m174680a(f, f2, position, position2, j2, animatorListener2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeAnimation");
    }
}
