package com.ss.android.lark.todo.impl.features.mainview.widget.sort;

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
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0016\u0018\u0000 22\u00020\u0001:\u0003234B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J \u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0002J\"\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%J>\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0002J\b\u0010+\u001a\u00020!H\u0002J\u0010\u0010,\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u0019H\u0016J\u000e\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\u000fJ\b\u00101\u001a\u00020!H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/VerticalDragLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isScrollingUp", "", "mDragLayoutType", "mIsDisableDrag", "mIsForceDismissWhenScrollDown", "mListener", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/VerticalDragLayout$ShrinkLayoutChangeListener;", "mNormalTranslationY", "", "mPreY", "mStartY", "mTotalOffsetY", "isChildNeedScroll", "viewGroup", "Landroid/view/ViewGroup;", "ev", "Landroid/view/MotionEvent;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "isLocationInView", "view", "Landroid/view/View;", "x", "y", "makeAnimation", "", "start", "end", "animListener", "Landroid/animation/Animator$AnimatorListener;", "startType", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/VerticalDragLayout$POSITION;", "endType", "animDuration", "", "moveToBottom", "onInterceptTouchEvent", "onTouchEvent", "event", "setListener", "listener", "startDragAnim", "Companion", "POSITION", "ShrinkLayoutChangeListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public class VerticalDragLayout extends LinearLayout {

    /* renamed from: b */
    public static final Companion f140524b = new Companion(null);

    /* renamed from: a */
    public ShrinkLayoutChangeListener f140525a;

    /* renamed from: c */
    private float f140526c;

    /* renamed from: d */
    private float f140527d;

    /* renamed from: e */
    private float f140528e;

    /* renamed from: f */
    private boolean f140529f;

    /* renamed from: g */
    private boolean f140530g;

    /* renamed from: h */
    private float f140531h;

    /* renamed from: i */
    private boolean f140532i;

    /* renamed from: j */
    private int f140533j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/VerticalDragLayout$POSITION;", "", "(Ljava/lang/String;I)V", "TOP", "MIDDLE", "BOTTOM", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum POSITION {
        TOP,
        MIDDLE,
        BOTTOM
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/VerticalDragLayout$ShrinkLayoutChangeListener;", "", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutAnimCancel", "start", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/VerticalDragLayout$POSITION;", "end", "onLayoutAnimEnd", "onLayoutAnimStart", "startDrag", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.VerticalDragLayout$b */
    public interface ShrinkLayoutChangeListener {
        /* renamed from: a */
        void mo193459a();

        /* renamed from: a */
        void mo193460a(float f, float f2);

        /* renamed from: a */
        void mo193461a(POSITION position, POSITION position2);

        /* renamed from: b */
        void mo193462b(POSITION position, POSITION position2);
    }

    public VerticalDragLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public VerticalDragLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/VerticalDragLayout$Companion;", "", "()V", "TAG", "", "TYPE_MIDDLE", "", "TYPE_TRIPLE", "UP", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.VerticalDragLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m221028a() {
        m221030a(this, getTranslationY(), (float) getHeight(), POSITION.TOP, POSITION.BOTTOM, 0, null, 48, null);
    }

    /* renamed from: b */
    private final void m221033b() {
        float f;
        POSITION position;
        POSITION position2;
        long j = 250;
        if (getTranslationY() > this.f140531h) {
            if (this.f140529f) {
                position2 = POSITION.BOTTOM;
                position = POSITION.MIDDLE;
                f = this.f140531h;
            } else {
                position2 = POSITION.MIDDLE;
                position = POSITION.BOTTOM;
                View rootView = getRootView();
                Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                f = (float) rootView.getHeight();
            }
        } else if (getTranslationY() > this.f140531h) {
            position2 = POSITION.TOP;
            position = POSITION.MIDDLE;
            f = this.f140531h;
        } else if (this.f140532i) {
            position2 = POSITION.TOP;
            position = POSITION.BOTTOM;
            View rootView2 = getRootView();
            Intrinsics.checkExpressionValueIsNotNull(rootView2, "rootView");
            f = (float) rootView2.getHeight();
            j = 350;
        } else {
            position2 = POSITION.TOP;
            position = POSITION.MIDDLE;
            f = this.f140531h;
        }
        m221030a(this, getTranslationY(), f, position2, position, j, null, 32, null);
    }

    public final void setListener(ShrinkLayoutChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f140525a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/widget/sort/VerticalDragLayout$makeAnimation$4", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.VerticalDragLayout$e */
    public static final class C56941e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ VerticalDragLayout f140536a;

        /* renamed from: b */
        final /* synthetic */ POSITION f140537b;

        /* renamed from: c */
        final /* synthetic */ POSITION f140538c;

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ShrinkLayoutChangeListener bVar = this.f140536a.f140525a;
            if (bVar != null) {
                bVar.mo193462b(this.f140537b, this.f140538c);
            }
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ShrinkLayoutChangeListener bVar = this.f140536a.f140525a;
            if (bVar != null) {
                bVar.mo193462b(this.f140537b, this.f140538c);
            }
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ShrinkLayoutChangeListener bVar = this.f140536a.f140525a;
            if (bVar != null) {
                bVar.mo193461a(this.f140537b, this.f140538c);
            }
        }

        C56941e(VerticalDragLayout verticalDragLayout, POSITION position, POSITION position2) {
            this.f140536a = verticalDragLayout;
            this.f140537b = position;
            this.f140538c = position2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.VerticalDragLayout$c */
    public static final class C56939c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VerticalDragLayout f140534a;

        C56939c(VerticalDragLayout verticalDragLayout) {
            this.f140534a = verticalDragLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            VerticalDragLayout verticalDragLayout = this.f140534a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                verticalDragLayout.setTranslationY(((Float) animatedValue).floatValue());
                ShrinkLayoutChangeListener bVar = this.f140534a.f140525a;
                if (bVar != null) {
                    View rootView = this.f140534a.getRootView();
                    Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                    float height = (float) rootView.getHeight();
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        bVar.mo193460a(height, ((Float) animatedValue2).floatValue());
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
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.VerticalDragLayout$d */
    public static final class C56940d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VerticalDragLayout f140535a;

        C56940d(VerticalDragLayout verticalDragLayout) {
            this.f140535a = verticalDragLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            VerticalDragLayout verticalDragLayout = this.f140535a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                verticalDragLayout.setTranslationY(((Float) animatedValue).floatValue());
                ShrinkLayoutChangeListener bVar = this.f140535a.f140525a;
                if (bVar != null) {
                    View rootView = this.f140535a.getRootView();
                    Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                    float height = (float) rootView.getHeight();
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        bVar.mo193460a(height, ((Float) animatedValue2).floatValue());
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
            this.f140527d = motionEvent.getRawY();
        } else if (!(motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float f = (float) 20;
            if ((Math.abs(motionEvent.getRawY() - this.f140527d) > f && getTranslationY() > BitmapDescriptorFactory.HUE_RED) || (getTranslationY() == BitmapDescriptorFactory.HUE_RED && motionEvent.getRawY() - this.f140527d > f && !m221032a(this, motionEvent, -1))) {
                this.f140526c = motionEvent.getRawY();
                this.f140528e = getTranslationY();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction();
        if (this.f140530g) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = true;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawY = motionEvent.getRawY() - this.f140526c;
                    float f = (float) 0;
                    if (rawY > f) {
                        z = false;
                    }
                    this.f140529f = z;
                    if (!z) {
                        this.f140528e += rawY;
                    }
                    if (this.f140528e < f) {
                        this.f140528e = BitmapDescriptorFactory.HUE_RED;
                    }
                    setTranslationY(this.f140528e);
                    if (!this.f140529f) {
                        ShrinkLayoutChangeListener bVar = this.f140525a;
                        if (bVar != null) {
                            View rootView = getRootView();
                            Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
                            bVar.mo193460a((float) rootView.getHeight(), getTranslationY());
                        }
                        ShrinkLayoutChangeListener bVar2 = this.f140525a;
                        if (bVar2 != null) {
                            bVar2.mo193459a();
                        }
                    }
                    this.f140526c = motionEvent.getRawY();
                }
            } else if (this.f140533j != 1) {
                m221033b();
            } else if (this.f140528e > ((float) LocationRequest.PRIORITY_INDOOR) && !this.f140529f) {
                m221028a();
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f140527d = motionEvent.getRawY();
        this.f140528e = getTranslationY();
        this.f140526c = motionEvent.getRawY();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerticalDragLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f140531h = (float) UIHelper.dp2px(250.0f);
    }

    /* renamed from: a */
    private final boolean m221031a(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(f, f2);
    }

    /* renamed from: a */
    private final boolean m221032a(ViewGroup viewGroup, MotionEvent motionEvent, int i) {
        boolean z;
        if (viewGroup.canScrollVertically(i)) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null && m221031a(childAt, motionEvent.getRawX(), motionEvent.getRawY())) {
                if (childAt instanceof ViewGroup) {
                    z = m221032a((ViewGroup) childAt, motionEvent, i);
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
    public final void mo193455a(float f, float f2, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "anim");
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C56939c(this));
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
    private final void m221029a(float f, float f2, POSITION position, POSITION position2, long j, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "anim");
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C56940d(this));
        ofFloat.addListener(new C56941e(this, position, position2));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.setDuration(j);
        ofFloat.start();
    }

    /* renamed from: a */
    static /* synthetic */ void m221030a(VerticalDragLayout verticalDragLayout, float f, float f2, POSITION position, POSITION position2, long j, Animator.AnimatorListener animatorListener, int i, Object obj) {
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
            verticalDragLayout.m221029a(f, f2, position, position2, j2, animatorListener2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeAnimation");
    }
}
