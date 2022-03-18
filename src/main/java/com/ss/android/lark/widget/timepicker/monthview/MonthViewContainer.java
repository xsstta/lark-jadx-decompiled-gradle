package com.ss.android.lark.widget.timepicker.monthview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.timepicker.monthview.constants.MonthViewAttr;
import com.ss.android.lark.widget.timepicker.monthview.data.CalendarDate;
import com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59230a;
import com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59231b;
import com.ss.android.lark.widget.timepicker.monthview.p2981b.C59235a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 12\u00020\u0001:\u000212B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0006\u0010\u001d\u001a\u00020\u0010J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020\u001fJ\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\u0006\u0010#\u001a\u00020\u0012J\u0006\u0010$\u001a\u00020\u001fJ\u0006\u0010%\u001a\u00020\u001fJ\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u000eJ\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0010H\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\tH\u0002J&\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010/\u001a\u000200R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/widget/timepicker/monthview/MonthViewContainer;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mChangeListener", "Lcom/ss/android/lark/widget/timepicker/monthview/MonthViewContainer$MonthViewChangeListener;", "mCurrentDate", "Lcom/ss/android/lark/widget/timepicker/monthview/data/CalendarDate;", "mIsMonthShow", "", "mMonthLayoutHeight", "mMonthSizeChangeDuration", "", "mMonthValueAnimator", "Landroid/animation/ValueAnimator;", "mMonthViewAdapter", "Lcom/ss/android/lark/widget/timepicker/monthview/MonthCalendarViewAdapter;", "mMonthViewPagerHeight", "mSelectedDate", "mWeekHeight", "getCurrSelectedDate", "initAnimation", "", "initMonthView", "initRequiredHeight", "initViewPager", "isShow", "scrollToLeft", "scrollToRight", "setChangeListener", "listener", "setSelectDate", "selectDate", "updateMonthLayoutHeight", "offset", "updateMonthOptionalView", "startTime", "endTime", "selectTimeType", "Lcom/ss/android/lark/widget/timepicker/monthview/constants/MonthViewAttr$SelectTimeType;", "Companion", "MonthViewChangeListener", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
public final class MonthViewContainer extends LinearLayout {

    /* renamed from: h */
    public static final Companion f147068h = new Companion(null);

    /* renamed from: a */
    public MonthViewChangeListener f147069a;

    /* renamed from: b */
    public int f147070b;

    /* renamed from: c */
    public int f147071c;

    /* renamed from: d */
    public int f147072d;

    /* renamed from: e */
    public boolean f147073e;

    /* renamed from: f */
    public final CalendarDate f147074f;

    /* renamed from: g */
    public CalendarDate f147075g;

    /* renamed from: i */
    private final long f147076i;

    /* renamed from: j */
    private C59247g f147077j;

    /* renamed from: k */
    private ValueAnimator f147078k;

    /* renamed from: l */
    private HashMap f147079l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/widget/timepicker/monthview/MonthViewContainer$MonthViewChangeListener;", "", "onDateChange", "", "selectDate", "Lcom/ss/android/lark/widget/timepicker/monthview/data/CalendarDate;", "actionType", "", "MonthChangeAction", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    public interface MonthViewChangeListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/widget/timepicker/monthview/MonthViewContainer$MonthViewChangeListener$MonthChangeAction;", "", "Companion", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface MonthChangeAction {
            public static final Companion Companion = Companion.f147080a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/widget/timepicker/monthview/MonthViewContainer$MonthViewChangeListener$MonthChangeAction$Companion;", "", "()V", "SCROLL_PAGE", "", "SELECT_DATE", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.widget.timepicker.monthview.MonthViewContainer$MonthViewChangeListener$MonthChangeAction$a */
            public static final class Companion {

                /* renamed from: a */
                static final /* synthetic */ Companion f147080a = new Companion();

                private Companion() {
                }
            }
        }

        /* renamed from: a */
        void mo201309a(CalendarDate calendarDate, int i);
    }

    /* renamed from: b */
    public View mo201322b(int i) {
        if (this.f147079l == null) {
            this.f147079l = new HashMap();
        }
        View view = (View) this.f147079l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f147079l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/timepicker/monthview/MonthViewContainer$Companion;", "", "()V", "ROW_NUM", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.timepicker.monthview.MonthViewContainer$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final CalendarDate getCurrSelectedDate() {
        return this.f147075g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/widget/timepicker/monthview/MonthViewContainer$initViewPager$1", "Lcom/ss/android/lark/widget/timepicker/monthview/IMonthViewModelFetcher;", "fetchCurrentDate", "Lcom/ss/android/lark/widget/timepicker/monthview/data/CalendarDate;", "fetchSelectedDate", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.timepicker.monthview.MonthViewContainer$d */
    public static final class C59222d implements AbstractC59234b {

        /* renamed from: a */
        final /* synthetic */ MonthViewContainer f147083a;

        @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59234b
        /* renamed from: a */
        public CalendarDate mo201329a() {
            return this.f147083a.f147074f;
        }

        @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59234b
        /* renamed from: b */
        public CalendarDate mo201330b() {
            return this.f147083a.f147075g;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59222d(MonthViewContainer monthViewContainer) {
            this.f147083a = monthViewContainer;
        }
    }

    /* renamed from: a */
    public final void mo201319a() {
        m230018d();
        m230020f();
        m230019e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/widget/timepicker/monthview/MonthViewContainer$initAnimation$1", "Lcom/ss/android/lark/widget/timepicker/monthview/MonthViewListener;", "onMonthViewHide", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.timepicker.monthview.MonthViewContainer$b */
    public static final class C59220b implements MonthViewListener {

        /* renamed from: a */
        final /* synthetic */ MonthViewContainer f147081a;

        @Override // com.ss.android.lark.widget.timepicker.monthview.MonthViewListener
        /* renamed from: a */
        public void mo201327a() {
            MonthViewLayout monthViewLayout = (MonthViewLayout) this.f147081a.mo201322b(R.id.lookMonthLayout);
            Intrinsics.checkExpressionValueIsNotNull(monthViewLayout, "lookMonthLayout");
            monthViewLayout.setVisibility(4);
            this.f147081a.f147073e = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59220b(MonthViewContainer monthViewContainer) {
            this.f147081a = monthViewContainer;
        }
    }

    /* renamed from: d */
    private final void m230018d() {
        int dp2px = UIUtils.dp2px(getContext(), 243.0f);
        this.f147070b = dp2px;
        this.f147071c = dp2px / 6;
    }

    /* renamed from: b */
    public final void mo201323b() {
        CalendarDate addMonth = this.f147075g.addMonth(-1);
        Intrinsics.checkExpressionValueIsNotNull(addMonth, "lastDate");
        addMonth.setMonthDay(1);
        setSelectDate(addMonth);
    }

    /* renamed from: c */
    public final void mo201324c() {
        CalendarDate addMonth = this.f147075g.addMonth(1);
        Intrinsics.checkExpressionValueIsNotNull(addMonth, "nextDate");
        addMonth.setMonthDay(1);
        setSelectDate(addMonth);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/widget/timepicker/monthview/MonthViewContainer$initViewPager$3", "Lcom/ss/android/lark/widget/timepicker/monthview/listener/IOnListViewPageListener;", "onLeftScrollFinished", "", "onRightScrollFinished", "onSelectDateChanged", "selectDate", "Lcom/ss/android/lark/widget/timepicker/monthview/data/CalendarDate;", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.timepicker.monthview.MonthViewContainer$f */
    public static final class C59224f implements AbstractC59231b {

        /* renamed from: a */
        final /* synthetic */ MonthViewContainer f147086a;

        /* renamed from: b */
        final /* synthetic */ Ref.IntRef f147087b;

        @Override // com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59231b
        /* renamed from: a */
        public void mo201333a() {
            int min = Math.min(this.f147086a.f147071c * 6, this.f147086a.f147070b) - Math.min(this.f147086a.f147071c * 6, this.f147086a.f147070b);
            if (min != 0) {
                this.f147086a.mo201320a(min);
            }
        }

        @Override // com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59231b
        /* renamed from: b */
        public void mo201335b() {
            int min = Math.min(this.f147086a.f147071c * 6, this.f147086a.f147070b) - Math.min(this.f147086a.f147071c * 6, this.f147086a.f147070b);
            if (min != 0) {
                this.f147086a.mo201320a(min);
            }
        }

        @Override // com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59231b
        /* renamed from: a */
        public void mo201334a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            this.f147086a.f147075g = calendarDate;
            ((ListCalendarWeekIndicator) this.f147086a.mo201322b(R.id.lookWeekIndicator)).mo201318a(this.f147087b.element, C59235a.m230063a(this.f147086a.f147074f, calendarDate));
            MonthViewChangeListener monthViewChangeListener = this.f147086a.f147069a;
            if (monthViewChangeListener != null) {
                monthViewChangeListener.mo201309a(calendarDate, 0);
            }
        }

        C59224f(MonthViewContainer monthViewContainer, Ref.IntRef intRef) {
            this.f147086a = monthViewContainer;
            this.f147087b = intRef;
        }
    }

    /* renamed from: f */
    private final void m230020f() {
        ((MonthViewLayout) mo201322b(R.id.lookMonthLayout)).setMMonthViewListener(new C59220b(this));
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f147078k = valueAnimator;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthValueAnimator");
        }
        valueAnimator.addUpdateListener(new C59221c(this));
    }

    /* renamed from: e */
    private final void m230019e() {
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = this.f147074f.getWeeklyDayIndex();
        ((ListCalendarWeekIndicator) mo201322b(R.id.lookWeekIndicator)).mo201318a(intRef.element, true);
        C59247g gVar = new C59247g(getContext(), new C59222d(this));
        this.f147077j = gVar;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthViewAdapter");
        }
        gVar.mo201461a(new C59223e(this, intRef));
        MonthViewPager monthViewPager = (MonthViewPager) mo201322b(R.id.lookMonthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(monthViewPager, "lookMonthViewPager");
        C59247g gVar2 = this.f147077j;
        if (gVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthViewAdapter");
        }
        monthViewPager.setAdapter(gVar2);
        ((MonthViewPager) mo201322b(R.id.lookMonthViewPager)).setViewPageListener(new C59224f(this, intRef));
        MonthViewPager monthViewPager2 = (MonthViewPager) mo201322b(R.id.lookMonthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(monthViewPager2, "lookMonthViewPager");
        int rowNum = monthViewPager2.getRowNum() * this.f147071c;
        MonthViewLayout monthViewLayout = (MonthViewLayout) mo201322b(R.id.lookMonthLayout);
        Intrinsics.checkExpressionValueIsNotNull(monthViewLayout, "lookMonthLayout");
        ViewGroup.LayoutParams layoutParams = monthViewLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = rowNum + UIUtils.dp2px(getContext(), 32.0f);
            MonthViewLayout monthViewLayout2 = (MonthViewLayout) mo201322b(R.id.lookMonthLayout);
            Intrinsics.checkExpressionValueIsNotNull(monthViewLayout2, "lookMonthLayout");
            monthViewLayout2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public final void setChangeListener(MonthViewChangeListener monthViewChangeListener) {
        Intrinsics.checkParameterIsNotNull(monthViewChangeListener, "listener");
        this.f147069a = monthViewChangeListener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/widget/timepicker/monthview/MonthViewContainer$initViewPager$2", "Lcom/ss/android/lark/widget/timepicker/monthview/listener/IMonthViewStateChangeListener;", "onSelectDateChange", "", "selectDate", "Lcom/ss/android/lark/widget/timepicker/monthview/data/CalendarDate;", "onSelectOtherMonth", "offset", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.timepicker.monthview.MonthViewContainer$e */
    public static final class C59223e implements AbstractC59230a {

        /* renamed from: a */
        final /* synthetic */ MonthViewContainer f147084a;

        /* renamed from: b */
        final /* synthetic */ Ref.IntRef f147085b;

        @Override // com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59230a
        /* renamed from: a */
        public void mo201331a(int i) {
            ((MonthViewPager) this.f147084a.mo201322b(R.id.lookMonthViewPager)).mo201346a(i);
        }

        @Override // com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59230a
        /* renamed from: a */
        public void mo201332a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            ((ListCalendarWeekIndicator) this.f147084a.mo201322b(R.id.lookWeekIndicator)).mo201318a(this.f147085b.element, C59235a.m230063a(this.f147084a.f147074f, calendarDate));
            this.f147084a.f147075g = calendarDate;
            MonthViewChangeListener monthViewChangeListener = this.f147084a.f147069a;
            if (monthViewChangeListener != null) {
                monthViewChangeListener.mo201309a(calendarDate, 1);
            }
        }

        C59223e(MonthViewContainer monthViewContainer, Ref.IntRef intRef) {
            this.f147084a = monthViewContainer;
            this.f147085b = intRef;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MonthViewContainer(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    private final void setSelectDate(CalendarDate calendarDate) {
        this.f147075g = calendarDate;
        ((ListCalendarWeekIndicator) mo201322b(R.id.lookWeekIndicator)).mo201318a(this.f147074f.getWeeklyDayIndex(), C59235a.m230063a(this.f147074f, calendarDate));
        ((MonthViewPager) mo201322b(R.id.lookMonthViewPager)).mo201347a(calendarDate);
    }

    /* renamed from: a */
    public final void mo201320a(int i) {
        MonthViewLayout monthViewLayout = (MonthViewLayout) mo201322b(R.id.lookMonthLayout);
        Intrinsics.checkExpressionValueIsNotNull(monthViewLayout, "lookMonthLayout");
        this.f147072d = monthViewLayout.getHeight();
        MonthViewLayout monthViewLayout2 = (MonthViewLayout) mo201322b(R.id.lookMonthLayout);
        Intrinsics.checkExpressionValueIsNotNull(monthViewLayout2, "lookMonthLayout");
        ViewGroup.LayoutParams layoutParams = monthViewLayout2.getLayoutParams();
        layoutParams.height = this.f147072d + i;
        MonthViewLayout monthViewLayout3 = (MonthViewLayout) mo201322b(R.id.lookMonthLayout);
        Intrinsics.checkExpressionValueIsNotNull(monthViewLayout3, "lookMonthLayout");
        monthViewLayout3.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.timepicker.monthview.MonthViewContainer$c */
    public static final class C59221c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MonthViewContainer f147082a;

        C59221c(MonthViewContainer monthViewContainer) {
            this.f147082a = monthViewContainer;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                MonthViewLayout monthViewLayout = (MonthViewLayout) this.f147082a.mo201322b(R.id.lookMonthLayout);
                Intrinsics.checkExpressionValueIsNotNull(monthViewLayout, "lookMonthLayout");
                ViewGroup.LayoutParams layoutParams = monthViewLayout.getLayoutParams();
                layoutParams.height = this.f147082a.f147072d + intValue;
                MonthViewLayout monthViewLayout2 = (MonthViewLayout) this.f147082a.mo201322b(R.id.lookMonthLayout);
                Intrinsics.checkExpressionValueIsNotNull(monthViewLayout2, "lookMonthLayout");
                monthViewLayout2.setLayoutParams(layoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MonthViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MonthViewContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthViewContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f147074f = new CalendarDate();
        this.f147076i = 100;
        this.f147075g = new CalendarDate();
        LayoutInflater.from(context).inflate(R.layout.lark_arrange_top_month_view_container, (ViewGroup) this, true);
    }

    /* renamed from: a */
    public final void mo201321a(CalendarDate calendarDate, CalendarDate calendarDate2, CalendarDate calendarDate3, MonthViewAttr.SelectTimeType selectTimeType) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "startTime");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "endTime");
        Intrinsics.checkParameterIsNotNull(calendarDate3, "selectDate");
        Intrinsics.checkParameterIsNotNull(selectTimeType, "selectTimeType");
        ((MonthViewPager) mo201322b(R.id.lookMonthViewPager)).mo201348a(calendarDate, calendarDate2, calendarDate3, selectTimeType);
    }
}
