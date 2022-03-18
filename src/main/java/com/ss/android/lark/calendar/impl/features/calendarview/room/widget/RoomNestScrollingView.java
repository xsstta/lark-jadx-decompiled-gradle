package com.ss.android.lark.calendar.impl.features.calendarview.room.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.NestedScrollingParent;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.CalendarWeekIndicator;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.MonthIndicator;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.WeekIndicator;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32670u;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0001cB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\u0018\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0002J\u000e\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u000fJ\u0010\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000bH\u0002J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u000bH\u0002J\u0010\u0010/\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u000bH\u0002J\u0010\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u000202H\u0016J0\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bH\u0014J\u0018\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000bH\u0014J(\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u000fH\u0016J \u0010C\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0016J(\u0010D\u001a\u00020\"2\u0006\u0010=\u001a\u00020>2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020FH\u0016J0\u0010G\u001a\u00020\"2\u0006\u0010=\u001a\u00020>2\u0006\u0010H\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u000bH\u0016J \u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020>2\u0006\u0010=\u001a\u00020>2\u0006\u0010N\u001a\u00020\u000bH\u0016J \u0010O\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020>2\u0006\u0010=\u001a\u00020>2\u0006\u0010P\u001a\u00020\u000bH\u0016J\u0010\u0010Q\u001a\u00020\"2\u0006\u0010M\u001a\u00020>H\u0016J\u0010\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u000202H\u0016J\u0016\u0010T\u001a\u00020\"2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020VJ\u000e\u0010X\u001a\u00020\"2\u0006\u0010Y\u001a\u00020\u000fJ\u0010\u0010Z\u001a\u00020\"2\u0006\u0010Y\u001a\u00020\u000fH\u0002J\b\u0010[\u001a\u00020\"H\u0002J\b\u0010\\\u001a\u00020\"H\u0002J(\u0010]\u001a\u00020\"2\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020\u000bH\u0002J\u0006\u0010b\u001a\u00020\"R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u0011\u0010\u001f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\r¨\u0006d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/widget/RoomNestScrollingView;", "Landroid/widget/FrameLayout;", "Landroidx/core/view/NestedScrollingParent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "calendarType", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/viewdata/CalendarAttr$CalendarType;", "eventContainerOffset", "", "getEventContainerOffset", "()I", "isMonthType", "", "()Z", "mChangedTop", "mContainerAnimator", "Landroid/animation/ValueAnimator;", "mDownX", "mDownY", "mIndicatorHeight", "mIsScrollingUp", "mLastY", "mMonthAnimator", "mMonthHeight", "mVerticalSlop", "mWeekHeight", "monthCalendarOffset", "getMonthCalendarOffset", "monthHeight", "getMonthHeight", "autoScroll", "", "changeToMonth", "changeToWeek", "checkStateChange", "getMoveOffset", "offset", "maxOffset", "initView", "isShowLunar", "isInCalendar", "downY", "moveMonthView", "dy", "moveWeekView", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onLayout", "changed", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onNestedFling", "target", "Landroid/view/View;", "velocityX", "", "velocityY", "consumed", "onNestedPreFling", "onNestedPreScroll", "dx", "", "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onNestedScrollAccepted", "child", "axes", "onStartNestedScroll", "nestedScrollAxes", "onStopNestedScroll", "onTouchEvent", "event", "refreshCalendarDate", "current", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "selected", "refreshLunarDay", "isShowLunarDay", "refreshWeekMonthViewHeight", "scrollToMonthView", "scrollToWeekView", "startScroll", "startMonth", "endMonth", "startChild", "endChild", "updateMonthViewHeight", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RoomNestScrollingView extends FrameLayout implements NestedScrollingParent {

    /* renamed from: c */
    public static final Companion f78317c = new Companion(null);

    /* renamed from: a */
    public CalendarAttr.CalendarType f78318a;

    /* renamed from: b */
    public boolean f78319b;

    /* renamed from: d */
    private ValueAnimator f78320d;

    /* renamed from: e */
    private ValueAnimator f78321e;

    /* renamed from: f */
    private int f78322f;

    /* renamed from: g */
    private int f78323g;

    /* renamed from: h */
    private int f78324h;

    /* renamed from: i */
    private int f78325i;

    /* renamed from: j */
    private int f78326j;

    /* renamed from: k */
    private int f78327k;

    /* renamed from: l */
    private int f78328l;

    /* renamed from: m */
    private boolean f78329m;

    /* renamed from: n */
    private HashMap f78330n;

    /* renamed from: a */
    private final int m115874a(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: a */
    public View mo112430a(int i) {
        if (this.f78330n == null) {
            this.f78330n = new HashMap();
        }
        View view = (View) this.f78330n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78330n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        Intrinsics.checkParameterIsNotNull(view2, "target");
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/widget/RoomNestScrollingView$Companion;", "", "()V", "ANIMATION_DURATION", "", "CHANGE_TOP_DURATION", "mRowSum", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.widget.RoomNestScrollingView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final int getEventContainerOffset() {
        return getMonthHeight() - this.f78323g;
    }

    /* renamed from: a */
    public final boolean mo112433a() {
        if (this.f78318a == CalendarAttr.CalendarType.MONTH) {
            return true;
        }
        return false;
    }

    private final int getMonthCalendarOffset() {
        return ((MonthIndicator) mo112430a(R.id.monthViewPager)).getRowIndex() * this.f78323g;
    }

    public final int getMonthHeight() {
        return Math.min(((MonthIndicator) mo112430a(R.id.monthViewPager)).getRowNum() * this.f78323g, this.f78324h);
    }

    /* renamed from: g */
    private final void m115880g() {
        LinearLayout linearLayout = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "roomAndStatusContainer");
        if (linearLayout.getTop() == this.f78323g + this.f78322f) {
            mo112437d();
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "roomAndStatusContainer");
        if (linearLayout2.getTop() == getMonthHeight() + this.f78322f) {
            mo112438e();
        }
    }

    /* renamed from: c */
    public final void mo112436c() {
        this.f78319b = true;
        int i = this.f78322f;
        LinearLayout linearLayout = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "roomAndStatusContainer");
        m115875a(i, i - getMonthCalendarOffset(), linearLayout.getTop(), this.f78322f + this.f78323g);
    }

    /* renamed from: d */
    public final void mo112437d() {
        this.f78318a = CalendarAttr.CalendarType.WEEK;
        WeekIndicator weekIndicator = (WeekIndicator) mo112430a(R.id.weekViewPager);
        Intrinsics.checkExpressionValueIsNotNull(weekIndicator, "weekViewPager");
        weekIndicator.setVisibility(0);
        MonthIndicator monthIndicator = (MonthIndicator) mo112430a(R.id.monthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(monthIndicator, "monthViewPager");
        monthIndicator.setVisibility(4);
        ((ImageView) mo112430a(R.id.statusIcon)).setImageResource(R.drawable.list_calendar_down);
    }

    /* renamed from: e */
    public final void mo112438e() {
        this.f78318a = CalendarAttr.CalendarType.MONTH;
        MonthIndicator monthIndicator = (MonthIndicator) mo112430a(R.id.monthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(monthIndicator, "monthViewPager");
        monthIndicator.setVisibility(0);
        WeekIndicator weekIndicator = (WeekIndicator) mo112430a(R.id.weekViewPager);
        Intrinsics.checkExpressionValueIsNotNull(weekIndicator, "weekViewPager");
        weekIndicator.setVisibility(4);
        ((ImageView) mo112430a(R.id.statusIcon)).setImageResource(R.drawable.ud_icon_vc_toolbar_up_filled);
    }

    /* renamed from: h */
    private final void m115881h() {
        MonthIndicator monthIndicator = (MonthIndicator) mo112430a(R.id.monthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(monthIndicator, "monthViewPager");
        int top = monthIndicator.getTop();
        LinearLayout linearLayout = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "roomAndStatusContainer");
        int top2 = linearLayout.getTop();
        if (top == this.f78322f && top2 == getMonthHeight() + this.f78322f) {
            mo112438e();
        } else if (top == this.f78322f - getMonthCalendarOffset() && top2 == this.f78323g + this.f78322f) {
            mo112437d();
        } else if (this.f78319b) {
            m115875a(top, this.f78322f - getMonthCalendarOffset(), top2, this.f78323g + this.f78322f);
        } else {
            m115875a(top, this.f78322f, top2, getMonthHeight() + this.f78322f);
        }
    }

    /* renamed from: b */
    public final void mo112434b() {
        int rowNum = ((MonthIndicator) mo112430a(R.id.monthViewPager)).getRowNum() * this.f78323g;
        this.f78319b = false;
        MonthIndicator monthIndicator = (MonthIndicator) mo112430a(R.id.monthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(monthIndicator, "monthViewPager");
        int top = monthIndicator.getTop();
        int i = this.f78322f;
        LinearLayout linearLayout = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "roomAndStatusContainer");
        m115875a(top, i, linearLayout.getTop(), rowNum + this.f78322f);
    }

    /* renamed from: f */
    public final void mo112439f() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.f78320d;
        if (!(valueAnimator3 == null || !valueAnimator3.isRunning() || (valueAnimator2 = this.f78320d) == null)) {
            valueAnimator2.end();
        }
        if (this.f78318a == CalendarAttr.CalendarType.MONTH) {
            ValueAnimator valueAnimator4 = this.f78321e;
            if (!(valueAnimator4 == null || !valueAnimator4.isRunning() || (valueAnimator = this.f78321e) == null)) {
                valueAnimator.end();
            }
            LinearLayout linearLayout = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "roomAndStatusContainer");
            int top = linearLayout.getTop();
            MonthIndicator monthIndicator = (MonthIndicator) mo112430a(R.id.monthViewPager);
            Intrinsics.checkExpressionValueIsNotNull(monthIndicator, "monthViewPager");
            int top2 = monthIndicator.getTop() + Math.min(((MonthIndicator) mo112430a(R.id.monthViewPager)).getRowNum() * this.f78323g, this.f78324h);
            ValueAnimator valueAnimator5 = this.f78321e;
            if (valueAnimator5 != null) {
                valueAnimator5.setIntValues(top, top2);
            }
            ValueAnimator valueAnimator6 = this.f78321e;
            if (valueAnimator6 != null) {
                valueAnimator6.setDuration((long) 100);
            }
            ValueAnimator valueAnimator7 = this.f78321e;
            if (valueAnimator7 != null) {
                valueAnimator7.start();
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        if (this.f78329m) {
            m115881h();
            this.f78329m = false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.widget.RoomNestScrollingView$b */
    public static final class View$OnClickListenerC31065b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomNestScrollingView f78334a;

        View$OnClickListenerC31065b(RoomNestScrollingView roomNestScrollingView) {
            this.f78334a = roomNestScrollingView;
        }

        public final void onClick(View view) {
            if (this.f78334a.f78318a == CalendarAttr.CalendarType.MONTH) {
                this.f78334a.mo112436c();
            } else {
                this.f78334a.mo112434b();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m115876b(int r6) {
        /*
            r5 = this;
            com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr$CalendarType r0 = r5.f78318a
            com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr$CalendarType r1 = com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr.CalendarType.MONTH
            r2 = 1
            r3 = 1105199104(0x41e00000, float:28.0)
            r4 = 0
            if (r0 != r1) goto L_0x001d
            if (r6 < 0) goto L_0x0030
            int r0 = r5.f78324h
            android.content.Context r1 = r5.getContext()
            int r1 = com.larksuite.framework.utils.UIUtils.dp2px(r1, r3)
            int r0 = r0 + r1
            int r1 = r5.f78322f
            int r0 = r0 + r1
            if (r6 >= r0) goto L_0x0030
            goto L_0x0031
        L_0x001d:
            if (r6 < 0) goto L_0x0030
            int r0 = r5.f78323g
            android.content.Context r1 = r5.getContext()
            int r1 = com.larksuite.framework.utils.UIUtils.dp2px(r1, r3)
            int r0 = r0 + r1
            int r1 = r5.f78322f
            int r0 = r0 + r1
            if (r6 >= r0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.room.widget.RoomNestScrollingView.m115876b(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 != 3) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == r1) goto L_0x002a
            r2 = 2
            if (r0 == r2) goto L_0x0013
            r4 = 3
            if (r0 == r4) goto L_0x002a
            goto L_0x0030
        L_0x0013:
            float r4 = r4.getY()
            int r4 = (int) r4
            int r0 = r3.f78327k
            int r0 = r0 - r4
            if (r0 <= 0) goto L_0x0021
            r3.m115877c(r0)
            goto L_0x0024
        L_0x0021:
            r3.m115879d(r0)
        L_0x0024:
            r3.m115880g()
            r3.f78327k = r4
            goto L_0x0030
        L_0x002a:
            r3.m115881h()
            r4 = 0
            r3.f78329m = r4
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.room.widget.RoomNestScrollingView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: c */
    private final void m115878c(boolean z) {
        if (z) {
            int dp2px = UIHelper.dp2px((float) 62);
            this.f78323g = dp2px;
            this.f78324h = dp2px * 6;
        } else {
            int dp2px2 = UIHelper.dp2px((float) 34);
            this.f78323g = dp2px2;
            this.f78324h = dp2px2 * 6;
        }
        MonthIndicator monthIndicator = (MonthIndicator) mo112430a(R.id.monthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(monthIndicator, "monthViewPager");
        ViewGroup.LayoutParams layoutParams = monthIndicator.getLayoutParams();
        layoutParams.height = this.f78324h;
        MonthIndicator monthIndicator2 = (MonthIndicator) mo112430a(R.id.monthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(monthIndicator2, "monthViewPager");
        monthIndicator2.setLayoutParams(layoutParams);
        WeekIndicator weekIndicator = (WeekIndicator) mo112430a(R.id.weekViewPager);
        Intrinsics.checkExpressionValueIsNotNull(weekIndicator, "weekViewPager");
        ViewGroup.LayoutParams layoutParams2 = weekIndicator.getLayoutParams();
        layoutParams2.height = this.f78323g;
        WeekIndicator weekIndicator2 = (WeekIndicator) mo112430a(R.id.weekViewPager);
        Intrinsics.checkExpressionValueIsNotNull(weekIndicator2, "weekViewPager");
        weekIndicator2.setLayoutParams(layoutParams2);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f78326j = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.f78325i = y;
            this.f78327k = y;
        } else if (action == 2) {
            int abs = Math.abs(this.f78325i - ((int) motionEvent.getY()));
            int abs2 = Math.abs(this.f78326j - ((int) motionEvent.getX()));
            boolean b = m115876b(this.f78325i);
            if (abs2 < abs && abs > this.f78328l && b) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: c */
    private final void m115877c(int i) {
        boolean z;
        if (Math.abs(i) > this.f78328l) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            this.f78319b = z;
        }
        this.f78329m = true;
        int monthHeight = getMonthHeight() - this.f78323g;
        double a = (((double) m115874a(Math.abs(i), monthHeight)) * 1.0d) / ((double) monthHeight);
        int ceil = (int) Math.ceil(((double) getMonthCalendarOffset()) * a);
        int monthCalendarOffset = getMonthCalendarOffset();
        MonthIndicator monthIndicator = (MonthIndicator) mo112430a(R.id.monthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(monthIndicator, "monthViewPager");
        int a2 = m115874a(ceil, (monthCalendarOffset + monthIndicator.getTop()) - this.f78322f);
        LinearLayout linearLayout = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "roomAndStatusContainer");
        int a3 = m115874a((int) (((double) getEventContainerOffset()) * a), (linearLayout.getTop() - this.f78323g) - this.f78322f);
        if (i > 0) {
            ((MonthIndicator) mo112430a(R.id.monthViewPager)).offsetTopAndBottom(-a2);
            ((LinearLayout) mo112430a(R.id.roomAndStatusContainer)).offsetTopAndBottom(-a3);
            return;
        }
        ((MonthIndicator) mo112430a(R.id.monthViewPager)).offsetTopAndBottom(a2);
        ((LinearLayout) mo112430a(R.id.roomAndStatusContainer)).offsetTopAndBottom(a3);
    }

    /* renamed from: d */
    private final void m115879d(int i) {
        boolean z;
        if (Math.abs(i) > this.f78328l) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            this.f78319b = z;
        }
        this.f78329m = true;
        MonthIndicator monthIndicator = (MonthIndicator) mo112430a(R.id.monthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(monthIndicator, "monthViewPager");
        monthIndicator.setVisibility(0);
        WeekIndicator weekIndicator = (WeekIndicator) mo112430a(R.id.weekViewPager);
        Intrinsics.checkExpressionValueIsNotNull(weekIndicator, "weekViewPager");
        weekIndicator.setVisibility(4);
        int monthHeight = getMonthHeight() - this.f78323g;
        float a = (((float) m115874a(Math.abs(i), monthHeight)) * 1.0f) / ((float) monthHeight);
        int ceil = (int) Math.ceil(((double) getMonthCalendarOffset()) * ((double) a));
        int i2 = this.f78322f;
        MonthIndicator monthIndicator2 = (MonthIndicator) mo112430a(R.id.monthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(monthIndicator2, "monthViewPager");
        int a2 = m115874a(ceil, i2 - monthIndicator2.getTop());
        int eventContainerOffset = (int) (((float) getEventContainerOffset()) * a);
        int monthHeight2 = getMonthHeight();
        LinearLayout linearLayout = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "roomAndStatusContainer");
        int a3 = m115874a(eventContainerOffset, (monthHeight2 - linearLayout.getTop()) + this.f78322f);
        if (i > 0) {
            ((MonthIndicator) mo112430a(R.id.monthViewPager)).offsetTopAndBottom(-a2);
            ((LinearLayout) mo112430a(R.id.roomAndStatusContainer)).offsetTopAndBottom(-a3);
            return;
        }
        ((MonthIndicator) mo112430a(R.id.monthViewPager)).offsetTopAndBottom(a2);
        ((LinearLayout) mo112430a(R.id.roomAndStatusContainer)).offsetTopAndBottom(a3);
    }

    /* renamed from: b */
    public final void mo112435b(boolean z) {
        m115878c(z);
        ((WeekIndicator) mo112430a(R.id.weekViewPager)).setShowLunarDay(z);
        ((MonthIndicator) mo112430a(R.id.monthViewPager)).setShowLunarDay(z);
        mo112439f();
        requestLayout();
    }

    /* renamed from: a */
    public final void mo112432a(boolean z) {
        int i;
        m115878c(z);
        if (this.f78318a == CalendarAttr.CalendarType.MONTH) {
            i = R.drawable.ud_icon_vc_toolbar_up_filled;
        } else {
            i = R.drawable.list_calendar_down;
        }
        ((ImageView) mo112430a(R.id.statusIcon)).setImageResource(i);
        ((ImageView) mo112430a(R.id.statusIcon)).setColorFilter(C32634ae.m125178a(R.color.ud_N400));
        ((LinearLayout) mo112430a(R.id.statusContainer)).setOnClickListener(new View$OnClickListenerC31065b(this));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        LinearLayout linearLayout = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "roomAndStatusContainer");
        linearLayout.getLayoutParams().height = (getMeasuredHeight() - this.f78323g) - this.f78322f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomNestScrollingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f78318a = CalendarAttr.CalendarType.WEEK;
        this.f78322f = UIHelper.dp2px(16.5f);
        C32670u.m125362a(context).inflate(R.layout.meeting_room_view, this);
        setMotionEventSplittingEnabled(false);
        this.f78328l = ao.m125215a();
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f78320d = valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.room.widget.RoomNestScrollingView.C310621 */

                /* renamed from: a */
                final /* synthetic */ RoomNestScrollingView f78331a;

                {
                    this.f78331a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        int intValue = ((Integer) animatedValue).intValue();
                        MonthIndicator monthIndicator = (MonthIndicator) this.f78331a.mo112430a(R.id.monthViewPager);
                        Intrinsics.checkExpressionValueIsNotNull(monthIndicator, "monthViewPager");
                        ((MonthIndicator) this.f78331a.mo112430a(R.id.monthViewPager)).offsetTopAndBottom(intValue - monthIndicator.getTop());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            });
        }
        ValueAnimator valueAnimator2 = this.f78320d;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new AnimatorListenerAdapter(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.room.widget.RoomNestScrollingView.C310632 */

                /* renamed from: a */
                final /* synthetic */ RoomNestScrollingView f78332a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f78332a = r1;
                }

                public void onAnimationEnd(Animator animator) {
                    Intrinsics.checkParameterIsNotNull(animator, "animation");
                    if (this.f78332a.f78319b) {
                        this.f78332a.mo112437d();
                    } else {
                        this.f78332a.mo112438e();
                    }
                }
            });
        }
        ValueAnimator valueAnimator3 = new ValueAnimator();
        this.f78321e = valueAnimator3;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.room.widget.RoomNestScrollingView.C310643 */

                /* renamed from: a */
                final /* synthetic */ RoomNestScrollingView f78333a;

                {
                    this.f78333a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        int intValue = ((Integer) animatedValue).intValue();
                        LinearLayout linearLayout = (LinearLayout) this.f78333a.mo112430a(R.id.roomAndStatusContainer);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "roomAndStatusContainer");
                        ((LinearLayout) this.f78333a.mo112430a(R.id.roomAndStatusContainer)).offsetTopAndBottom(intValue - linearLayout.getTop());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo112431a(CalendarDate calendarDate, CalendarDate calendarDate2) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "current");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "selected");
        int julianDay = calendarDate.getJulianDay();
        int julianDay2 = calendarDate2.getJulianDay();
        ((WeekIndicator) mo112430a(R.id.weekViewPager)).setCurrentDay(julianDay);
        ((WeekIndicator) mo112430a(R.id.weekViewPager)).setSelectedDay(julianDay2);
        ((MonthIndicator) mo112430a(R.id.monthViewPager)).setCurrentDay(julianDay);
        ((MonthIndicator) mo112430a(R.id.monthViewPager)).setSelectedDay(julianDay2);
        mo112439f();
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        Intrinsics.checkParameterIsNotNull(view2, "target");
        try {
            super.onNestedScrollAccepted(view, view2, i);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        if (f2 < ((float) 0)) {
            LinearLayout linearLayout = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "roomAndStatusContainer");
            if (linearLayout.getTop() == getMonthHeight()) {
                return true;
            }
        }
        try {
            return super.onNestedPreFling(view, f, f2);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomNestScrollingView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        try {
            return super.onNestedFling(view, f, f2, z);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private final void m115875a(int i, int i2, int i3, int i4) {
        ValueAnimator valueAnimator = this.f78320d;
        if (valueAnimator != null) {
            valueAnimator.setIntValues(i, i2);
        }
        ValueAnimator valueAnimator2 = this.f78320d;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration((long) 100);
        }
        ValueAnimator valueAnimator3 = this.f78320d;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
        ValueAnimator valueAnimator4 = this.f78321e;
        if (valueAnimator4 != null) {
            valueAnimator4.setIntValues(i3, i4);
        }
        ValueAnimator valueAnimator5 = this.f78321e;
        if (valueAnimator5 != null) {
            valueAnimator5.setDuration((long) 100);
        }
        ValueAnimator valueAnimator6 = this.f78321e;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        Intrinsics.checkParameterIsNotNull(iArr, "consumed");
        if (this.f78318a == CalendarAttr.CalendarType.MONTH) {
            if (i2 < 0) {
                LinearLayout linearLayout = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "roomAndStatusContainer");
                if (linearLayout.getTop() == getMonthHeight()) {
                    iArr[1] = i2;
                    return;
                }
            }
            if (i2 < 0) {
                LinearLayout linearLayout2 = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "roomAndStatusContainer");
                if (linearLayout2.getTop() < getMonthHeight()) {
                    m115877c(i2);
                    iArr[1] = i2;
                    return;
                }
            }
            if (i2 > 0) {
                m115877c(i2);
                iArr[1] = i2;
                m115880g();
                return;
            }
            iArr[1] = 0;
            return;
        }
        iArr[1] = 0;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        try {
            super.onNestedScroll(view, i, i2, i3, i4);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f78318a == CalendarAttr.CalendarType.MONTH) {
            MonthIndicator monthIndicator = (MonthIndicator) mo112430a(R.id.monthViewPager);
            Intrinsics.checkExpressionValueIsNotNull(monthIndicator, "monthViewPager");
            i6 = monthIndicator.getTop();
            LinearLayout linearLayout = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "roomAndStatusContainer");
            if (linearLayout.getTop() == 0) {
                i5 = this.f78324h + this.f78322f;
            } else {
                LinearLayout linearLayout2 = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "roomAndStatusContainer");
                i5 = linearLayout2.getTop();
            }
        } else {
            int i7 = this.f78322f;
            i6 = (-getMonthCalendarOffset()) + i7;
            i5 = i7 + this.f78323g;
        }
        LinearLayout linearLayout3 = (LinearLayout) mo112430a(R.id.roomAndStatusContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "roomAndStatusContainer");
        ((LinearLayout) mo112430a(R.id.roomAndStatusContainer)).layout(0, i5, i3, linearLayout3.getLayoutParams().height + i5);
        ((CalendarWeekIndicator) mo112430a(R.id.weekIndicator)).layout(0, 0, i3, this.f78322f);
        int i8 = this.f78322f;
        ((WeekIndicator) mo112430a(R.id.weekViewPager)).layout(0, i8, i3, this.f78323g + i8);
        ((MonthIndicator) mo112430a(R.id.monthViewPager)).layout(0, i6, i3, this.f78324h + i6);
    }
}
