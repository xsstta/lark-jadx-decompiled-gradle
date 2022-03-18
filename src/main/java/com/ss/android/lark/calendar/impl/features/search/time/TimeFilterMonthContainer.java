package com.ss.android.lark.calendar.impl.features.search.time;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.CalendarWeekIndicator;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31179a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b;
import com.ss.android.lark.calendar.impl.features.search.time.TimeFilterAttr;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u0002-.B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0006\u0010\u0017\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0006\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u0019J\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000eJ\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0010H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\tH\u0002J6\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010+\u001a\u00020,R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mChangeListener", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthContainer$MonthViewChangeListener;", "mCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mMonthLayoutHeight", "mMonthViewAdapter", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthViewAdapter;", "mMonthViewPagerHeight", "mSelectedDate", "mWeekHeight", "getCurrSelectedDate", "initMonthView", "", "currentSelectedDate", "initRequiredHeight", "initViewPager", "scrollToLeft", "scrollToRight", "setChangeListener", "listener", "setSelectDate", "selectDate", "updateMonthLayoutHeight", "offset", "updateMonthOptionalView", "startTime", "startTimeNoLimit", "", "endTime", "endTimeNoLimit", "selectTimeType", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterAttr$SelectTimeType;", "Companion", "MonthViewChangeListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeFilterMonthContainer extends FrameLayout {

    /* renamed from: f */
    public static final Companion f82895f = new Companion(null);

    /* renamed from: a */
    public MonthViewChangeListener f82896a;

    /* renamed from: b */
    public int f82897b;

    /* renamed from: c */
    public int f82898c;

    /* renamed from: d */
    public final CalendarDate f82899d;

    /* renamed from: e */
    public CalendarDate f82900e;

    /* renamed from: g */
    private int f82901g;

    /* renamed from: h */
    private TimeFilterMonthViewAdapter f82902h;

    /* renamed from: i */
    private HashMap f82903i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthContainer$MonthViewChangeListener;", "", "onDateChange", "", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "actionType", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterAttr$MonthChangeAction;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.TimeFilterMonthContainer$b */
    public interface MonthViewChangeListener {
        /* renamed from: a */
        void mo118218a(CalendarDate calendarDate, TimeFilterAttr.MonthChangeAction monthChangeAction);
    }

    /* renamed from: b */
    public View mo118214b(int i) {
        if (this.f82903i == null) {
            this.f82903i = new HashMap();
        }
        View view = (View) this.f82903i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82903i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthContainer$Companion;", "", "()V", "ROW_NUM", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.TimeFilterMonthContainer$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final CalendarDate getCurrSelectedDate() {
        return this.f82900e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthContainer$initViewPager$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/IMonthDateFetcher;", "fetchCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "fetchSelectedDate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.TimeFilterMonthContainer$c */
    public static final class C32357c implements AbstractC31180b {

        /* renamed from: a */
        final /* synthetic */ TimeFilterMonthContainer f82904a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b
        /* renamed from: a */
        public CalendarDate mo111730a() {
            return this.f82904a.f82899d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b
        /* renamed from: b */
        public CalendarDate mo111731b() {
            return this.f82904a.f82900e;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32357c(TimeFilterMonthContainer timeFilterMonthContainer) {
            this.f82904a = timeFilterMonthContainer;
        }
    }

    /* renamed from: c */
    private final void m123500c() {
        int dp2px = UIUtils.dp2px(getContext(), 243.0f);
        this.f82897b = dp2px;
        this.f82898c = dp2px / 6;
    }

    /* renamed from: a */
    public final void mo118210a() {
        CalendarDate addMonth = this.f82900e.addMonth(-1);
        Intrinsics.checkExpressionValueIsNotNull(addMonth, "lastDate");
        addMonth.setMonthDay(1);
        setSelectDate(addMonth);
    }

    /* renamed from: b */
    public final void mo118215b() {
        CalendarDate addMonth = this.f82900e.addMonth(1);
        Intrinsics.checkExpressionValueIsNotNull(addMonth, "nextDate");
        addMonth.setMonthDay(1);
        setSelectDate(addMonth);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthContainer$initViewPager$3", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/IOnViewPageListener;", "onLeftScrollFinished", "", "onRightScrollFinished", "onSelectDateChanged", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.TimeFilterMonthContainer$e */
    public static final class C32359e implements AbstractC31169a {

        /* renamed from: a */
        final /* synthetic */ TimeFilterMonthContainer f82907a;

        /* renamed from: b */
        final /* synthetic */ Ref.IntRef f82908b;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a
        /* renamed from: a */
        public void mo111724a() {
            int min = Math.min(this.f82907a.f82898c * 6, this.f82907a.f82897b) - Math.min(this.f82907a.f82898c * 6, this.f82907a.f82897b);
            if (min != 0) {
                this.f82907a.mo118211a(min);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a
        /* renamed from: b */
        public void mo111726b() {
            int min = Math.min(this.f82907a.f82898c * 6, this.f82907a.f82897b) - Math.min(this.f82907a.f82898c * 6, this.f82907a.f82897b);
            if (min != 0) {
                this.f82907a.mo118211a(min);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a
        /* renamed from: a */
        public void mo111725a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            this.f82907a.f82900e = calendarDate;
            ((CalendarWeekIndicator) this.f82907a.mo118214b(R.id.weekIndicator)).mo112908a(this.f82908b.element, C32647d.m125278a(this.f82907a.f82899d, calendarDate));
            MonthViewChangeListener bVar = this.f82907a.f82896a;
            if (bVar != null) {
                bVar.mo118218a(calendarDate, TimeFilterAttr.MonthChangeAction.SCROLL_PAGE);
            }
        }

        C32359e(TimeFilterMonthContainer timeFilterMonthContainer, Ref.IntRef intRef) {
            this.f82907a = timeFilterMonthContainer;
            this.f82908b = intRef;
        }
    }

    /* renamed from: d */
    private final void m123501d() {
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = this.f82899d.getWeeklyDayIndex();
        ((CalendarWeekIndicator) mo118214b(R.id.weekIndicator)).mo112908a(intRef.element, true);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        TimeFilterMonthViewAdapter dVar = new TimeFilterMonthViewAdapter(context, new C32357c(this));
        this.f82902h = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthViewAdapter");
        }
        dVar.mo118235a(new C32358d(this, intRef));
        TimeFilterMonthViewPager timeFilterMonthViewPager = (TimeFilterMonthViewPager) mo118214b(R.id.monthViewPager);
        Intrinsics.checkExpressionValueIsNotNull(timeFilterMonthViewPager, "monthViewPager");
        TimeFilterMonthViewAdapter dVar2 = this.f82902h;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMonthViewAdapter");
        }
        timeFilterMonthViewPager.setAdapter(dVar2);
        ((TimeFilterMonthViewPager) mo118214b(R.id.monthViewPager)).setViewPageListener(new C32359e(this, intRef));
        int rowNum = ((TimeFilterMonthViewPager) mo118214b(R.id.monthViewPager)).getRowNum() * this.f82898c;
        LinearLayout linearLayout = (LinearLayout) mo118214b(R.id.monthLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "monthLayout");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = rowNum + UIUtils.dp2px(getContext(), 32.0f);
            LinearLayout linearLayout2 = (LinearLayout) mo118214b(R.id.monthLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "monthLayout");
            linearLayout2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void setChangeListener(MonthViewChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f82896a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthContainer$initViewPager$2", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/IDateSelectListener;", "onSelectDateChange", "", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "onSelectOtherMonth", "offset", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.TimeFilterMonthContainer$d */
    public static final class C32358d implements AbstractC31179a {

        /* renamed from: a */
        final /* synthetic */ TimeFilterMonthContainer f82905a;

        /* renamed from: b */
        final /* synthetic */ Ref.IntRef f82906b;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31179a
        /* renamed from: a */
        public void mo111732a(int i) {
            ((TimeFilterMonthViewPager) this.f82905a.mo118214b(R.id.monthViewPager)).mo118219a(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31179a
        /* renamed from: a */
        public void mo111733a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            ((CalendarWeekIndicator) this.f82905a.mo118214b(R.id.weekIndicator)).mo112908a(this.f82906b.element, C32647d.m125278a(this.f82905a.f82899d, calendarDate));
            this.f82905a.f82900e = calendarDate;
            MonthViewChangeListener bVar = this.f82905a.f82896a;
            if (bVar != null) {
                bVar.mo118218a(calendarDate, TimeFilterAttr.MonthChangeAction.SELECT_DATE);
            }
        }

        C32358d(TimeFilterMonthContainer timeFilterMonthContainer, Ref.IntRef intRef) {
            this.f82905a = timeFilterMonthContainer;
            this.f82906b = intRef;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TimeFilterMonthContainer(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo118212a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "currentSelectedDate");
        this.f82900e = calendarDate;
        m123500c();
        m123501d();
    }

    private final void setSelectDate(CalendarDate calendarDate) {
        this.f82900e = calendarDate;
        ((CalendarWeekIndicator) mo118214b(R.id.weekIndicator)).mo112908a(this.f82899d.getWeeklyDayIndex(), C32647d.m125278a(this.f82899d, calendarDate));
        ((TimeFilterMonthViewPager) mo118214b(R.id.monthViewPager)).mo118220a(calendarDate);
    }

    /* renamed from: a */
    public final void mo118211a(int i) {
        LinearLayout linearLayout = (LinearLayout) mo118214b(R.id.monthLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "monthLayout");
        this.f82901g = linearLayout.getHeight();
        LinearLayout linearLayout2 = (LinearLayout) mo118214b(R.id.monthLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "monthLayout");
        ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
        layoutParams.height = this.f82901g + i;
        LinearLayout linearLayout3 = (LinearLayout) mo118214b(R.id.monthLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "monthLayout");
        linearLayout3.setLayoutParams(layoutParams);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TimeFilterMonthContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TimeFilterMonthContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeFilterMonthContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f82899d = new CalendarDate();
        this.f82900e = new CalendarDate();
        LayoutInflater.from(context).inflate(R.layout.calendar_search_time_month_view, (ViewGroup) this, true);
    }

    /* renamed from: a */
    public final void mo118213a(CalendarDate calendarDate, boolean z, CalendarDate calendarDate2, boolean z2, CalendarDate calendarDate3, TimeFilterAttr.SelectTimeType selectTimeType) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "startTime");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "endTime");
        Intrinsics.checkParameterIsNotNull(calendarDate3, "selectDate");
        Intrinsics.checkParameterIsNotNull(selectTimeType, "selectTimeType");
        ((TimeFilterMonthViewPager) mo118214b(R.id.monthViewPager)).mo118221a(calendarDate, z, calendarDate2, z2, calendarDate3, selectTimeType);
    }
}
