package com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.C0768a;
import com.bytedance.common.utility.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 02\u00020\u0001:\u000201B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u001dJ\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0007H\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$H\u0016J0\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0014J\u0018\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007H\u0014J\u0010\u0010.\u001a\u00020\n2\u0006\u0010#\u001a\u00020$H\u0016J\u0006\u0010/\u001a\u00020\u001dR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00062"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SidebarScrollLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isHandleMotion", "", "()Z", "setHandleMotion", "(Z)V", "mEnterAnimator", "Landroid/animation/ValueAnimator;", "mLastMoveX", "mLastMoveY", "mMarginLeft", "mOutAnimator", "mShadowColor", "minMoveSlop", "scrollListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SidebarScrollLayout$IScrollListener;", "getScrollListener", "()Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SidebarScrollLayout$IScrollListener;", "setScrollListener", "(Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SidebarScrollLayout$IScrollListener;)V", "autoScroll", "", "enterAnimation", "handleContent", "dx", "handleShadow", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onLayout", "changed", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "outAnimation", "Companion", "IScrollListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SidebarScrollLayout extends FrameLayout {

    /* renamed from: a */
    public static final Companion f76464a = new Companion(null);

    /* renamed from: b */
    private final int f76465b;

    /* renamed from: c */
    private final int f76466c;

    /* renamed from: d */
    private final int f76467d;

    /* renamed from: e */
    private final ValueAnimator f76468e;

    /* renamed from: f */
    private final ValueAnimator f76469f;

    /* renamed from: g */
    private int f76470g;

    /* renamed from: h */
    private int f76471h;

    /* renamed from: i */
    private boolean f76472i;

    /* renamed from: j */
    private IScrollListener f76473j;

    /* renamed from: k */
    private HashMap f76474k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SidebarScrollLayout$IScrollListener;", "", "onScrollOut", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SidebarScrollLayout$b */
    public interface IScrollListener {
        /* renamed from: a */
        void mo110205a();
    }

    public SidebarScrollLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public SidebarScrollLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    public View mo110276b(int i) {
        if (this.f76474k == null) {
            this.f76474k = new HashMap();
        }
        View view = (View) this.f76474k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76474k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SidebarScrollLayout$Companion;", "", "()V", "ANIM_DURATION", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SidebarScrollLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final IScrollListener getScrollListener() {
        return this.f76473j;
    }

    /* renamed from: d */
    private final void m113605d() {
        LinearLayout linearLayout = (LinearLayout) mo110276b(R.id.contentLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentLayout");
        int left = linearLayout.getLeft();
        int measuredWidth = (getMeasuredWidth() / 2) + this.f76466c;
        if (measuredWidth > 0) {
            if (left < measuredWidth) {
                mo110277b();
            } else {
                mo110278c();
            }
        }
    }

    /* renamed from: c */
    public final void mo110278c() {
        int screenWidth = DeviceUtils.getScreenWidth(getContext());
        this.f76469f.cancel();
        ValueAnimator valueAnimator = this.f76469f;
        LinearLayout linearLayout = (LinearLayout) mo110276b(R.id.contentLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentLayout");
        valueAnimator.setIntValues(linearLayout.getLeft(), screenWidth);
        this.f76469f.start();
    }

    /* renamed from: a */
    public final void mo110274a() {
        int i;
        LinearLayout linearLayout = (LinearLayout) mo110276b(R.id.contentLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentLayout");
        int left = linearLayout.getLeft();
        if (getMeasuredWidth() > 0 && left > 0 && getMeasuredWidth() >= left) {
            float measuredWidth = ((float) this.f76466c) / ((float) getMeasuredWidth());
            float f = (float) 1;
            float measuredWidth2 = ((f - (((float) left) / ((float) getMeasuredWidth()))) / (f - measuredWidth)) * 0.7f;
            if (measuredWidth2 <= f && measuredWidth2 >= ((float) 0)) {
                i = (int) (measuredWidth2 * ((float) 255));
                ((FrameLayout) mo110276b(R.id.shadowLayout)).setBackgroundColor(C0768a.m3716c(this.f76467d, i));
            }
        }
        i = (int) 178.5f;
        ((FrameLayout) mo110276b(R.id.shadowLayout)).setBackgroundColor(C0768a.m3716c(this.f76467d, i));
    }

    /* renamed from: b */
    public final void mo110277b() {
        this.f76469f.cancel();
        ValueAnimator valueAnimator = this.f76468e;
        LinearLayout linearLayout = (LinearLayout) mo110276b(R.id.contentLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentLayout");
        valueAnimator.setIntValues(linearLayout.getLeft(), this.f76466c);
        this.f76468e.start();
    }

    public final void setHandleMotion(boolean z) {
        this.f76472i = z;
    }

    public final void setScrollListener(IScrollListener bVar) {
        this.f76473j = bVar;
    }

    /* renamed from: a */
    public final void mo110275a(int i) {
        LinearLayout linearLayout = (LinearLayout) mo110276b(R.id.contentLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentLayout");
        int left = linearLayout.getLeft();
        int i2 = this.f76466c;
        if (left < i2) {
            ((LinearLayout) mo110276b(R.id.contentLayout)).offsetLeftAndRight(this.f76466c - left);
        } else if (left != i2 || i >= 0) {
            ((LinearLayout) mo110276b(R.id.contentLayout)).offsetLeftAndRight(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r0 != 3) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            boolean r0 = r3.f76472i
            if (r0 != 0) goto L_0x000e
            boolean r4 = super.onTouchEvent(r4)
            return r4
        L_0x000e:
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == r1) goto L_0x002e
            r2 = 2
            if (r0 == r2) goto L_0x001c
            r4 = 3
            if (r0 == r4) goto L_0x002e
            goto L_0x0031
        L_0x001c:
            float r4 = r4.getX()
            int r4 = (int) r4
            int r0 = r3.f76470g
            int r0 = r4 - r0
            r3.mo110275a(r0)
            r3.mo110274a()
            r3.f76470g = r4
            goto L_0x0031
        L_0x002e:
            r3.m113605d()
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SidebarScrollLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r0 != 3) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            boolean r0 = r5.f76472i
            if (r0 != 0) goto L_0x000e
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        L_0x000e:
            int r0 = r6.getAction()
            if (r0 == 0) goto L_0x0048
            r1 = 1
            if (r0 == r1) goto L_0x0044
            r2 = 2
            if (r0 == r2) goto L_0x001e
            r1 = 3
            if (r0 == r1) goto L_0x0044
            goto L_0x0056
        L_0x001e:
            float r0 = r6.getX()
            int r0 = (int) r0
            float r2 = r6.getY()
            int r2 = (int) r2
            int r3 = r5.f76470g
            int r3 = r3 - r0
            int r3 = java.lang.Math.abs(r3)
            int r4 = r5.f76471h
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            r5.mo110274a()
            r5.f76470g = r0
            r5.f76471h = r2
            if (r4 >= r3) goto L_0x0056
            int r0 = r5.f76465b
            if (r3 <= r0) goto L_0x0056
            return r1
        L_0x0044:
            r5.m113605d()
            goto L_0x0056
        L_0x0048:
            float r0 = r6.getX()
            int r0 = (int) r0
            r5.f76470g = r0
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f76471h = r0
        L_0x0056:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SidebarScrollLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        LinearLayout linearLayout = (LinearLayout) mo110276b(R.id.contentLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentLayout");
        linearLayout.getLayoutParams().width = getMeasuredWidth() - this.f76466c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SidebarScrollLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(context)");
        this.f76465b = viewConfiguration.getScaledTouchSlop();
        this.f76466c = UIHelper.dp2px(55.0f);
        this.f76467d = UIHelper.getColor(R.color.bg_mask);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f76468e = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.f76469f = valueAnimator2;
        this.f76472i = true;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SidebarScrollLayout.C305681 */

            /* renamed from: a */
            final /* synthetic */ SidebarScrollLayout f76475a;

            {
                this.f76475a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    int intValue = ((Integer) animatedValue).intValue();
                    SidebarScrollLayout sidebarScrollLayout = this.f76475a;
                    LinearLayout linearLayout = (LinearLayout) sidebarScrollLayout.mo110276b(R.id.contentLayout);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentLayout");
                    sidebarScrollLayout.mo110275a(intValue - linearLayout.getLeft());
                    this.f76475a.mo110274a();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        });
        valueAnimator.setDuration(300L);
        valueAnimator.addListener(new Animator.AnimatorListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SidebarScrollLayout.C305692 */

            /* renamed from: a */
            final /* synthetic */ SidebarScrollLayout f76476a;

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SidebarScrollLayout$2$a */
            static final class View$OnClickListenerC30570a implements View.OnClickListener {

                /* renamed from: a */
                final /* synthetic */ C305692 f76477a;

                View$OnClickListenerC30570a(C305692 r1) {
                    this.f76477a = r1;
                }

                public final void onClick(View view) {
                    this.f76477a.f76476a.mo110278c();
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f76476a = r1;
            }

            public void onAnimationEnd(Animator animator) {
                FrameLayout frameLayout = (FrameLayout) this.f76476a.mo110276b(R.id.shadowLayout);
                if (frameLayout != null) {
                    frameLayout.setOnClickListener(new View$OnClickListenerC30570a(this));
                }
            }
        });
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SidebarScrollLayout.C305713 */

            /* renamed from: a */
            final /* synthetic */ SidebarScrollLayout f76478a;

            {
                this.f76478a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    int intValue = ((Integer) animatedValue).intValue();
                    SidebarScrollLayout sidebarScrollLayout = this.f76478a;
                    LinearLayout linearLayout = (LinearLayout) sidebarScrollLayout.mo110276b(R.id.contentLayout);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentLayout");
                    sidebarScrollLayout.mo110275a(intValue - linearLayout.getLeft());
                    this.f76478a.mo110274a();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        });
        valueAnimator2.addListener(new Animator.AnimatorListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SidebarScrollLayout.C305724 */

            /* renamed from: a */
            final /* synthetic */ SidebarScrollLayout f76479a;

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f76479a = r1;
            }

            public void onAnimationEnd(Animator animator) {
                IScrollListener scrollListener = this.f76479a.getScrollListener();
                if (scrollListener != null) {
                    scrollListener.mo110205a();
                }
                this.f76479a.setScrollListener(null);
            }
        });
        valueAnimator2.setDuration(300L);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SidebarScrollLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        LinearLayout linearLayout = (LinearLayout) mo110276b(R.id.contentLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentLayout");
        if (linearLayout.getLeft() == 0) {
            i5 = getMeasuredWidth();
        } else {
            LinearLayout linearLayout2 = (LinearLayout) mo110276b(R.id.contentLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "contentLayout");
            i5 = linearLayout2.getLeft();
        }
        LinearLayout linearLayout3 = (LinearLayout) mo110276b(R.id.contentLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "contentLayout");
        ((LinearLayout) mo110276b(R.id.contentLayout)).layout(i5, 0, linearLayout3.getLayoutParams().width + i5, getMeasuredHeight());
        ((FrameLayout) mo110276b(R.id.shadowLayout)).layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        ((FrameLayout) mo110276b(R.id.fragmentContainer)).layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
