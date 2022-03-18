package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.CalendarWeekIndicator;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.MonthIndicator;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001<B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0002J\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020#H\u0002J\b\u0010(\u001a\u00020#H\u0002J\u0010\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0014H\u0002J\u000e\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u001dJ\u000e\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\tJ\u0006\u0010/\u001a\u00020#J\u0006\u00100\u001a\u00020#J\u000e\u00101\u001a\u00020#2\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020\u000eJ\u000e\u00106\u001a\u00020#2\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u00020#J\b\u0010:\u001a\u00020#H\u0002J\u0006\u0010;\u001a\u00020#R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TitleTimeBar;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mDownToUpAnimation", "Landroid/view/animation/RotateAnimation;", "mDrawerAnimator", "Landroid/animation/ValueAnimator;", "mIsMonthShow", "", "mMonthShowDuration", "", "mMonthSizeChangeDuration", "mMonthValueAnimator", "mRootView", "Landroid/view/View;", "mSelectedDate", "mTitleChangeListener", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TitleTimeBar$OnTitleChangeListener;", "mTitleHeight", "mUpToDownAnimation", "getMonthLayoutHeight", "monthIndicatorHeight", "hideMothView", "", "initAnimation", "initArrangeMonthView", "initRequiredHeight", "initTitleBar", "initViewPager", "menuPopAnimate", "isMonthShow", "setDateChangeListener", "listener", "setDesktopWith", "width", "setLeftIconAsArrow", "setLeftIconAsCross", "setMonthViewTopMargin", "size", "", "setSelectDate", "selectDate", "setTitleText", "text", "", "showAddGroupChatterIcon", "updateMonthLayoutHeight", "updateViewForDesktop", "OnTitleChangeListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TitleTimeBar extends RelativeLayout {

    /* renamed from: a */
    public View f75542a;

    /* renamed from: b */
    public boolean f75543b;

    /* renamed from: c */
    public final CalendarDate f75544c;

    /* renamed from: d */
    public CalendarDate f75545d;

    /* renamed from: e */
    public int f75546e;

    /* renamed from: f */
    public RotateAnimation f75547f;

    /* renamed from: g */
    public RotateAnimation f75548g;

    /* renamed from: h */
    public OnTitleChangeListener f75549h;

    /* renamed from: i */
    private final long f75550i;

    /* renamed from: j */
    private final long f75551j;

    /* renamed from: k */
    private ValueAnimator f75552k;

    /* renamed from: l */
    private ValueAnimator f75553l;

    /* renamed from: m */
    private HashMap f75554m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TitleTimeBar$OnTitleChangeListener;", "", "onAddAttendeeClick", "", "onDateChanged", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar$a */
    public interface OnTitleChangeListener {
        /* renamed from: a */
        void mo108573a();

        /* renamed from: a */
        void mo108574a(CalendarDate calendarDate);
    }

    /* renamed from: b */
    public View mo109102b(int i) {
        if (this.f75554m == null) {
            this.f75554m = new HashMap();
        }
        View view = (View) this.f75554m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75554m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setDesktopWith(int i) {
    }

    /* renamed from: f */
    private final void m112221f() {
        m112222g();
        m112223h();
        m112224i();
        m112225j();
    }

    /* renamed from: c */
    public final void mo109104c() {
        ((CommonTitleBar) mo109102b(R.id.commonTitleBar)).setLeftImageResource(R.drawable.ic_svg_titlebar_back_black);
    }

    /* renamed from: h */
    private final void m112223h() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f75542a.findViewById(R.id.titleBarContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.titleBarContainer");
        relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC30228d(this));
    }

    /* renamed from: b */
    public final void mo109103b() {
        ((CommonTitleBar) mo109102b(R.id.commonTitleBar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
    }

    /* renamed from: e */
    public final void mo109106e() {
        ImageView imageView = (ImageView) this.f75542a.findViewById(R.id.addGroupChatter);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mRootView.addGroupChatter");
        imageView.setVisibility(0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TitleTimeBar$initAnimation$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/MonthViewListener;", "onMonthViewHide", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar$b */
    public static final class C30226b implements MonthViewListener {

        /* renamed from: a */
        final /* synthetic */ TitleTimeBar f75555a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.MonthViewListener
        /* renamed from: a */
        public void mo109112a() {
            if (this.f75555a.f75543b) {
                MonthViewLayout monthViewLayout = (MonthViewLayout) this.f75555a.f75542a.findViewById(R.id.arrangeMonthLayout);
                Intrinsics.checkExpressionValueIsNotNull(monthViewLayout, "mRootView.arrangeMonthLayout");
                monthViewLayout.setVisibility(4);
                ((ImageView) this.f75555a.f75542a.findViewById(R.id.imgTimeTitle)).startAnimation(TitleTimeBar.m112219a(this.f75555a));
                this.f75555a.f75543b = false;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30226b(TitleTimeBar titleTimeBar) {
            this.f75555a = titleTimeBar;
        }
    }

    /* renamed from: g */
    private final void m112222g() {
        ((RelativeLayout) this.f75542a.findViewById(R.id.titleTouchArea)).setOnClickListener(new View$OnClickListenerC30229e(this));
        ((ImageView) this.f75542a.findViewById(R.id.addGroupChatter)).setOnClickListener(new View$OnClickListenerC30230f(this));
        ((CommonTitleBar) this.f75542a.findViewById(R.id.commonTitleBar)).setLeftVisible(true);
    }

    /* renamed from: d */
    public final void mo109105d() {
        if (this.f75543b) {
            mo109101a(true);
            ImageView imageView = (ImageView) this.f75542a.findViewById(R.id.imgTimeTitle);
            RotateAnimation rotateAnimation = this.f75548g;
            if (rotateAnimation == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUpToDownAnimation");
            }
            imageView.startAnimation(rotateAnimation);
            this.f75543b = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TitleTimeBar$initRequiredHeight$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC30228d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ TitleTimeBar f75557a;

        public void onGlobalLayout() {
            TitleTimeBar titleTimeBar = this.f75557a;
            RelativeLayout relativeLayout = (RelativeLayout) titleTimeBar.f75542a.findViewById(R.id.titleBarContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.titleBarContainer");
            titleTimeBar.f75546e = relativeLayout.getHeight();
            MonthViewLayout monthViewLayout = (MonthViewLayout) this.f75557a.f75542a.findViewById(R.id.arrangeMonthLayout);
            Intrinsics.checkExpressionValueIsNotNull(monthViewLayout, "mRootView.arrangeMonthLayout");
            ViewGroup.LayoutParams layoutParams = monthViewLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = this.f75557a.f75546e;
                MonthViewLayout monthViewLayout2 = (MonthViewLayout) this.f75557a.f75542a.findViewById(R.id.arrangeMonthLayout);
                Intrinsics.checkExpressionValueIsNotNull(monthViewLayout2, "mRootView.arrangeMonthLayout");
                monthViewLayout2.setLayoutParams(layoutParams2);
                ((MonthViewLayout) this.f75557a.f75542a.findViewById(R.id.arrangeMonthLayout)).setMTitleHeight(this.f75557a.f75546e);
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f75557a.f75542a.findViewById(R.id.titleBarContainer);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "mRootView.titleBarContainer");
                relativeLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC30228d(TitleTimeBar titleTimeBar) {
            this.f75557a = titleTimeBar;
        }
    }

    /* renamed from: a */
    public final void mo109100a() {
        MonthIndicator monthIndicator = (MonthIndicator) mo109102b(R.id.arrangeMonthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(monthIndicator, "arrangeMonthViewPager");
        int height = monthIndicator.getHeight();
        int rowNum = (((MonthIndicator) mo109102b(R.id.arrangeMonthViewPager)).getRowNum() * ((MonthIndicator) mo109102b(R.id.arrangeMonthViewPager)).getRowHeight()) + UIHelper.dp2px(32.0f);
        if (height != rowNum) {
            ValueAnimator valueAnimator = this.f75552k;
            if (valueAnimator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMonthValueAnimator");
            }
            valueAnimator.setIntValues(height, rowNum);
            ValueAnimator valueAnimator2 = this.f75552k;
            if (valueAnimator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMonthValueAnimator");
            }
            valueAnimator2.setDuration(this.f75550i);
            ValueAnimator valueAnimator3 = this.f75552k;
            if (valueAnimator3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMonthValueAnimator");
            }
            valueAnimator3.start();
        }
    }

    /* renamed from: i */
    private final void m112224i() {
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 180.0f, 1, 0.5f, 1, 0.5f);
        this.f75547f = rotateAnimation;
        if (rotateAnimation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDownToUpAnimation");
        }
        rotateAnimation.setFillAfter(true);
        RotateAnimation rotateAnimation2 = this.f75547f;
        if (rotateAnimation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDownToUpAnimation");
        }
        rotateAnimation2.setDuration(this.f75551j);
        RotateAnimation rotateAnimation3 = this.f75547f;
        if (rotateAnimation3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDownToUpAnimation");
        }
        rotateAnimation3.setInterpolator(new LinearInterpolator());
        RotateAnimation rotateAnimation4 = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f75548g = rotateAnimation4;
        if (rotateAnimation4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUpToDownAnimation");
        }
        rotateAnimation4.setFillAfter(true);
        RotateAnimation rotateAnimation5 = this.f75548g;
        if (rotateAnimation5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUpToDownAnimation");
        }
        rotateAnimation5.setDuration(this.f75551j);
        RotateAnimation rotateAnimation6 = this.f75548g;
        if (rotateAnimation6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUpToDownAnimation");
        }
        rotateAnimation6.setInterpolator(new LinearInterpolator());
        ((MonthViewLayout) this.f75542a.findViewById(R.id.arrangeMonthLayout)).setMMonthViewListener(new C30226b(this));
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f75552k = valueAnimator;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthValueAnimator");
        }
        valueAnimator.addUpdateListener(new C30227c(this));
    }

    /* renamed from: j */
    private final void m112225j() {
        int weeklyDayIndex = this.f75544c.getWeeklyDayIndex();
        ((CalendarWeekIndicator) this.f75542a.findViewById(R.id.arrangeWeekIndicator)).mo112908a(weeklyDayIndex, C32647d.m125278a(this.f75544c, this.f75545d));
        ((MonthIndicator) this.f75542a.findViewById(R.id.arrangeMonthViewPager)).setDateChangeListener(new C30231g(this, weeklyDayIndex));
        ((MonthIndicator) mo109102b(R.id.arrangeMonthViewPager)).setShowLunarDay(false);
        ((MonthIndicator) mo109102b(R.id.arrangeMonthViewPager)).setCurrentDay(this.f75544c.getJulianDay());
        ((MonthIndicator) mo109102b(R.id.arrangeMonthViewPager)).setSelectedDay(this.f75545d.getJulianDay());
        C30022a.f74884c.mo108450a(new C30232h(this));
        MonthViewLayout monthViewLayout = (MonthViewLayout) mo109102b(R.id.arrangeMonthLayout);
        Intrinsics.checkExpressionValueIsNotNull(monthViewLayout, "arrangeMonthLayout");
        ViewGroup.LayoutParams layoutParams = monthViewLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = mo109099a((((MonthIndicator) mo109102b(R.id.arrangeMonthViewPager)).getRowNum() * ((MonthIndicator) mo109102b(R.id.arrangeMonthViewPager)).getRowHeight()) + UIHelper.dp2px(32.0f));
        }
    }

    public final void setDateChangeListener(OnTitleChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f75549h = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar$f */
    public static final class View$OnClickListenerC30230f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleTimeBar f75559a;

        View$OnClickListenerC30230f(TitleTimeBar titleTimeBar) {
            this.f75559a = titleTimeBar;
        }

        public final void onClick(View view) {
            OnTitleChangeListener aVar = this.f75559a.f75549h;
            if (aVar != null) {
                aVar.mo108573a();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TitleTimeBar(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ RotateAnimation m112219a(TitleTimeBar titleTimeBar) {
        RotateAnimation rotateAnimation = titleTimeBar.f75548g;
        if (rotateAnimation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUpToDownAnimation");
        }
        return rotateAnimation;
    }

    /* renamed from: b */
    public static final /* synthetic */ RotateAnimation m112220b(TitleTimeBar titleTimeBar) {
        RotateAnimation rotateAnimation = titleTimeBar.f75547f;
        if (rotateAnimation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDownToUpAnimation");
        }
        return rotateAnimation;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar$h */
    public static final class C30232h implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ TitleTimeBar f75560a;

        C30232h(TitleTimeBar titleTimeBar) {
            this.f75560a = titleTimeBar;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "it");
            CalendarSetting.DayOfWeek weekStartDay = calendarSetting.getWeekStartDay();
            Intrinsics.checkExpressionValueIsNotNull(weekStartDay, "it.weekStartDay");
            ((MonthIndicator) this.f75560a.mo109102b(R.id.arrangeMonthViewPager)).setFirstDayOfWeek(weekStartDay);
        }
    }

    public final void setTitleText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        TextView textView = (TextView) mo109102b(R.id.tvTimeTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvTimeTitle");
        textView.setText(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TitleTimeBar$menuPopAnimate$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar$i */
    public static final class C30233i implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ TitleTimeBar f75561a;

        /* renamed from: b */
        final /* synthetic */ boolean f75562b;

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (this.f75562b) {
                MonthViewLayout monthViewLayout = (MonthViewLayout) this.f75561a.f75542a.findViewById(R.id.arrangeMonthLayout);
                Intrinsics.checkExpressionValueIsNotNull(monthViewLayout, "mRootView.arrangeMonthLayout");
                monthViewLayout.setVisibility(4);
                TitleTimeBar titleTimeBar = this.f75561a;
                titleTimeBar.setSelectDate(titleTimeBar.f75545d);
            }
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (!this.f75562b) {
                MonthViewLayout monthViewLayout = (MonthViewLayout) this.f75561a.f75542a.findViewById(R.id.arrangeMonthLayout);
                Intrinsics.checkExpressionValueIsNotNull(monthViewLayout, "mRootView.arrangeMonthLayout");
                monthViewLayout.setVisibility(0);
                ((MonthViewLayout) this.f75561a.f75542a.findViewById(R.id.arrangeMonthLayout)).bringToFront();
                ((RelativeLayout) this.f75561a.f75542a.findViewById(R.id.titleBarContainer)).bringToFront();
            }
        }

        C30233i(TitleTimeBar titleTimeBar, boolean z) {
            this.f75561a = titleTimeBar;
            this.f75562b = z;
        }
    }

    /* renamed from: a */
    public final int mo109099a(int i) {
        CalendarWeekIndicator calendarWeekIndicator = (CalendarWeekIndicator) this.f75542a.findViewById(R.id.arrangeWeekIndicator);
        Intrinsics.checkExpressionValueIsNotNull(calendarWeekIndicator, "mRootView.arrangeWeekIndicator");
        int bottom = i + calendarWeekIndicator.getBottom();
        ImageView imageView = (ImageView) this.f75542a.findViewById(R.id.divideShadow);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mRootView.divideShadow");
        return bottom + imageView.getHeight();
    }

    public final void setMonthViewTopMargin(float f) {
        CalendarWeekIndicator calendarWeekIndicator = (CalendarWeekIndicator) this.f75542a.findViewById(R.id.arrangeWeekIndicator);
        Intrinsics.checkExpressionValueIsNotNull(calendarWeekIndicator, "mRootView.arrangeWeekIndicator");
        ViewGroup.LayoutParams layoutParams = calendarWeekIndicator.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = UIHelper.dp2px(f);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar$c */
    public static final class C30227c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TitleTimeBar f75556a;

        C30227c(TitleTimeBar titleTimeBar) {
            this.f75556a = titleTimeBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                MonthViewLayout monthViewLayout = (MonthViewLayout) this.f75556a.mo109102b(R.id.arrangeMonthLayout);
                Intrinsics.checkExpressionValueIsNotNull(monthViewLayout, "arrangeMonthLayout");
                ViewGroup.LayoutParams layoutParams = monthViewLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = this.f75556a.mo109099a(intValue);
                    MonthViewLayout monthViewLayout2 = (MonthViewLayout) this.f75556a.mo109102b(R.id.arrangeMonthLayout);
                    Intrinsics.checkExpressionValueIsNotNull(monthViewLayout2, "arrangeMonthLayout");
                    monthViewLayout2.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar$e */
    public static final class View$OnClickListenerC30229e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleTimeBar f75558a;

        View$OnClickListenerC30229e(TitleTimeBar titleTimeBar) {
            this.f75558a = titleTimeBar;
        }

        public final void onClick(View view) {
            TitleTimeBar titleTimeBar = this.f75558a;
            titleTimeBar.mo109101a(titleTimeBar.f75543b);
            if (this.f75558a.f75543b) {
                ((ImageView) this.f75558a.f75542a.findViewById(R.id.imgTimeTitle)).startAnimation(TitleTimeBar.m112219a(this.f75558a));
            } else {
                ((ImageView) this.f75558a.f75542a.findViewById(R.id.imgTimeTitle)).startAnimation(TitleTimeBar.m112220b(this.f75558a));
            }
            TitleTimeBar titleTimeBar2 = this.f75558a;
            titleTimeBar2.f75543b = !titleTimeBar2.f75543b;
        }
    }

    public final void setSelectDate(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
        this.f75545d = calendarDate;
        ((CalendarWeekIndicator) mo109102b(R.id.arrangeWeekIndicator)).mo112908a(this.f75544c.getWeeklyDayIndex(), C32647d.m125278a(this.f75544c, calendarDate));
        ((MonthIndicator) mo109102b(R.id.arrangeMonthViewPager)).setCurrentDay(this.f75544c.getJulianDay());
        ((MonthIndicator) mo109102b(R.id.arrangeMonthViewPager)).setSelectedDay(this.f75545d.getJulianDay());
        mo109100a();
    }

    /* renamed from: a */
    public final void mo109101a(boolean z) {
        float f;
        MonthViewLayout monthViewLayout = (MonthViewLayout) this.f75542a.findViewById(R.id.arrangeMonthLayout);
        Intrinsics.checkExpressionValueIsNotNull(monthViewLayout, "mRootView.arrangeMonthLayout");
        float height = (float) monthViewLayout.getHeight();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = -height;
        }
        if (z) {
            f2 = -height;
        }
        ValueAnimator valueAnimator = this.f75553l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat((MonthViewLayout) this.f75542a.findViewById(R.id.arrangeMonthLayout), "translationY", f, f2).setDuration(this.f75551j);
        this.f75553l = duration;
        if (duration != null) {
            duration.addListener(new C30233i(this, z));
        }
        ValueAnimator valueAnimator2 = this.f75553l;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "selectedDay", "", "fromClick", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar$g */
    public static final class C30231g extends Lambda implements Function2<Integer, Boolean, Unit> {
        final /* synthetic */ int $weekDay;
        final /* synthetic */ TitleTimeBar this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30231g(TitleTimeBar titleTimeBar, int i) {
            super(2);
            this.this$0 = titleTimeBar;
            this.$weekDay = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, Boolean bool) {
            invoke(num.intValue(), bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i, boolean z) {
            CalendarDate julianDay = new CalendarDate().setJulianDay(i);
            ((CalendarWeekIndicator) this.this$0.f75542a.findViewById(R.id.arrangeWeekIndicator)).mo112908a(this.$weekDay, C32647d.m125278a(this.this$0.f75544c, julianDay));
            TitleTimeBar titleTimeBar = this.this$0;
            Intrinsics.checkExpressionValueIsNotNull(julianDay, "selectDate");
            titleTimeBar.f75545d = julianDay;
            OnTitleChangeListener aVar = this.this$0.f75549h;
            if (aVar != null) {
                aVar.mo108574a(julianDay);
            }
            if (z) {
                this.this$0.mo109105d();
            } else {
                this.this$0.mo109100a();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TitleTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TitleTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitleTimeBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f75550i = 100;
        this.f75551j = 200;
        this.f75544c = new CalendarDate();
        this.f75545d = new CalendarDate();
        View inflate = LayoutInflater.from(context).inflate(R.layout.arrange_title_bar, (ViewGroup) this, true);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…ge_title_bar, this, true)");
        this.f75542a = inflate;
        m112221f();
    }
}
