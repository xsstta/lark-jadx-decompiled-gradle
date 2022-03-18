package com.larksuite.component.universe_design.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.datepicker.api.IDatePickerDelegate;
import com.larksuite.component.universe_design.datepicker.impl.MonthCalendarViewAdapter;
import com.larksuite.component.universe_design.datepicker.impl.MonthViewPager;
import com.larksuite.component.universe_design.datepicker.impl.data.MonthShowMode;
import com.larksuite.component.universe_design.datepicker.impl.header.MonthPickerDefaultHead;
import com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewDataFetcher;
import com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewListener;
import com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewStateChangeListener;
import com.larksuite.component.universe_design.datepicker.impl.week.WeekIndicator;
import com.larksuite.component.universe_design.util.CalendarDate;
import com.larksuite.component.universe_design.util.DateTimeUtils;
import com.larksuite.component.universe_design.util.TypefaceHelper;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0016\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\"\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\"\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u000fH\u0016J\u0010\u00103\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u001cH\u0016J\u0010\u00106\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u0017H\u0002J\b\u00107\u001a\u00020\u001eH\u0002J\b\u00108\u001a\u00020\u001eH\u0002J\b\u00109\u001a\u00020\u001eH\u0002J\b\u0010:\u001a\u00020\u001eH\u0002J\b\u0010;\u001a\u00020\u001eH\u0002R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/UDDatePicker;", "Landroid/widget/RelativeLayout;", "Lcom/larksuite/component/universe_design/datepicker/api/IDatePickerDelegate;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "datePickerListener", "Lcom/larksuite/component/universe_design/datepicker/api/IDatePickerDelegate$DatePickerListener;", "firstDayOfWeek", "Lcom/larksuite/component/universe_design/util/CalendarDate$DayOfWeek;", "monthCalendarViewAdapter", "Lcom/larksuite/component/universe_design/datepicker/impl/MonthCalendarViewAdapter;", "monthShowMode", "Lcom/larksuite/component/universe_design/datepicker/impl/data/MonthShowMode;", "selectedDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "selectedTimeZone", "Ljava/util/TimeZone;", "getFirstDayOfWeek", "getSelectedCalendar", "Ljava/util/Calendar;", "initData", "", "initFromAttributes", "initHeader", "initMonthViewPager", "initView", "initViewData", "initWeekIndicator", "setFirstDayOfWeek", "setMonthDateTextSize", "textSize", "", "setMonthDateTypeFace", "typeFace", "Landroid/graphics/Typeface;", "setMonthHeadTextSize", "setMonthHeadTypeFace", "setMonthPageScrollEnable", "scrollEnable", "", "setMonthPickerListener", "listener", "setMonthShowMode", "setSelectedCalendar", "date", "setSelectedDate", "triggerSelectedDatChanged", "updateHeadViews", "updateMonthText", "updateViewPagerHeight", "updateWeekColorAndText", "Companion", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDDatePicker extends RelativeLayout implements IDatePickerDelegate {

    /* renamed from: d */
    public static final Companion f63178d = new Companion(null);

    /* renamed from: a */
    public CalendarDate f63179a;

    /* renamed from: b */
    public MonthShowMode f63180b;

    /* renamed from: c */
    public CalendarDate.DayOfWeek f63181c;

    /* renamed from: e */
    private MonthCalendarViewAdapter f63182e;

    /* renamed from: f */
    private IDatePickerDelegate.DatePickerListener f63183f;

    /* renamed from: g */
    private TimeZone f63184g;

    /* renamed from: h */
    private HashMap f63185h;

    /* renamed from: a */
    public View mo90420a(int i) {
        if (this.f63185h == null) {
            this.f63185h = new HashMap();
        }
        View view = (View) this.f63185h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f63185h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/UDDatePicker$Companion;", "", "()V", "DEFAULT_BODY_MONTH_DATE_TEXT_SIZE", "", "DEFAULT_HEAD_MONTH_TEXT_SIZE", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.UDDatePicker$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    private final void m92583g() {
        m92584h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/universe_design/datepicker/UDDatePicker$initMonthViewPager$1", "Lcom/larksuite/component/universe_design/datepicker/impl/listener/IMonthViewDataFetcher;", "getCurrentDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "getFirstDayOfWeek", "Lcom/larksuite/component/universe_design/util/CalendarDate$DayOfWeek;", "getMonthShowMode", "Lcom/larksuite/component/universe_design/datepicker/impl/data/MonthShowMode;", "getSelectedDate", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.UDDatePicker$c */
    public static final class C25734c implements IMonthViewDataFetcher {

        /* renamed from: a */
        final /* synthetic */ UDDatePicker f63187a;

        @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewDataFetcher
        /* renamed from: a */
        public CalendarDate mo90438a() {
            return new CalendarDate();
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewDataFetcher
        /* renamed from: b */
        public CalendarDate mo90439b() {
            return this.f63187a.f63179a;
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewDataFetcher
        /* renamed from: c */
        public MonthShowMode mo90440c() {
            return this.f63187a.f63180b;
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewDataFetcher
        /* renamed from: d */
        public CalendarDate.DayOfWeek mo90441d() {
            return this.f63187a.f63181c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25734c(UDDatePicker uDDatePicker) {
            this.f63187a = uDDatePicker;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/larksuite/component/universe_design/datepicker/UDDatePicker$initMonthViewPager$3", "Lcom/larksuite/component/universe_design/datepicker/impl/listener/IMonthViewListener;", "onLeftScrollFinished", "", "onRightScrollFinished", "onSelectDateChanged", "selectDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.UDDatePicker$e */
    public static final class C25736e implements IMonthViewListener {

        /* renamed from: a */
        final /* synthetic */ UDDatePicker f63189a;

        @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewListener
        /* renamed from: a */
        public void mo90444a() {
            this.f63189a.mo90422b();
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewListener
        /* renamed from: b */
        public void mo90446b() {
            this.f63189a.mo90422b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25736e(UDDatePicker uDDatePicker) {
            this.f63189a = uDDatePicker;
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewListener
        /* renamed from: a */
        public void mo90445a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            this.f63189a.setSelectedDate(calendarDate);
        }
    }

    /* renamed from: c */
    public final void mo90423c() {
        m92586j();
        m92584h();
    }

    public int getFirstDayOfWeek() {
        return this.f63181c.getValue() + 1;
    }

    /* renamed from: d */
    private final void m92580d() {
        m92585i();
        m92583g();
        m92581e();
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        setBackgroundColor(UDColorUtils.getColor(context, R.color.bg_body));
        m92582f();
    }

    /* renamed from: f */
    private final void m92582f() {
        TypefaceHelper eVar = TypefaceHelper.f63885a;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        setMonthDateTypeFace(eVar.mo91838a(context, "fonts/DINAlternateBold.ttf"));
    }

    /* renamed from: h */
    private final void m92584h() {
        CalendarDate calendarDate = new CalendarDate();
        ((WeekIndicator) mo90420a(R.id.month_picker_week)).mo90549a(calendarDate.getWeeklyDayIndex(this.f63181c), DateTimeUtils.m93292a(calendarDate, this.f63179a), this.f63181c);
    }

    /* renamed from: i */
    private final void m92585i() {
        ((MonthPickerDefaultHead) mo90420a(R.id.month_picker_head)).setMonthPickerActionListener(new C25733b(this));
        m92586j();
    }

    /* renamed from: j */
    private final void m92586j() {
        ((MonthPickerDefaultHead) mo90420a(R.id.month_picker_head)).setMonthText(DateTimeUtils.f63877a.mo91834a(this.f63179a));
    }

    public Calendar getSelectedCalendar() {
        DateTimeUtils aVar = DateTimeUtils.f63877a;
        Calendar calendar = this.f63179a.getCalendar();
        Intrinsics.checkExpressionValueIsNotNull(calendar, "selectedDate.calendar");
        return aVar.mo91836a(calendar, this.f63184g);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/larksuite/component/universe_design/datepicker/UDDatePicker$initHeader$1", "Lcom/larksuite/component/universe_design/datepicker/impl/header/MonthPickerDefaultHead$MonthPickerActionListener;", "onClickLeftArrow", "", "onClickRightArrow", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.UDDatePicker$b */
    public static final class C25733b implements MonthPickerDefaultHead.MonthPickerActionListener {

        /* renamed from: a */
        final /* synthetic */ UDDatePicker f63186a;

        @Override // com.larksuite.component.universe_design.datepicker.impl.header.MonthPickerDefaultHead.MonthPickerActionListener
        /* renamed from: a */
        public void mo90436a() {
            this.f63186a.f63179a = DateTimeUtils.m93293b(new CalendarDate(this.f63186a.f63179a));
            this.f63186a.mo90423c();
            this.f63186a.mo90421a();
            ((MonthViewPager) this.f63186a.mo90420a(R.id.month_viewpager)).mo90448a(-1);
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.header.MonthPickerDefaultHead.MonthPickerActionListener
        /* renamed from: b */
        public void mo90437b() {
            this.f63186a.f63179a = DateTimeUtils.m93294c(new CalendarDate(this.f63186a.f63179a));
            this.f63186a.mo90423c();
            this.f63186a.mo90421a();
            ((MonthViewPager) this.f63186a.mo90420a(R.id.month_viewpager)).mo90448a(1);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25733b(UDDatePicker uDDatePicker) {
            this.f63186a = uDDatePicker;
        }
    }

    /* renamed from: b */
    public final void mo90422b() {
        MonthViewPager monthViewPager = (MonthViewPager) mo90420a(R.id.month_viewpager);
        Intrinsics.checkExpressionValueIsNotNull(monthViewPager, "month_viewpager");
        ViewGroup.LayoutParams layoutParams = monthViewPager.getLayoutParams();
        layoutParams.height = ((MonthViewPager) mo90420a(R.id.month_viewpager)).getCenterViewHeight();
        MonthViewPager monthViewPager2 = (MonthViewPager) mo90420a(R.id.month_viewpager);
        Intrinsics.checkExpressionValueIsNotNull(monthViewPager2, "month_viewpager");
        monthViewPager2.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    private final void m92581e() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        MonthCalendarViewAdapter aVar = new MonthCalendarViewAdapter(context, new C25734c(this));
        this.f63182e = aVar;
        if (aVar != null) {
            aVar.mo90464a(new C25735d(this));
        }
        MonthViewPager monthViewPager = (MonthViewPager) mo90420a(R.id.month_viewpager);
        Intrinsics.checkExpressionValueIsNotNull(monthViewPager, "month_viewpager");
        monthViewPager.setAdapter(this.f63182e);
        ((MonthViewPager) mo90420a(R.id.month_viewpager)).setViewPageListener(new C25736e(this));
        mo90422b();
    }

    /* renamed from: a */
    public final void mo90421a() {
        IDatePickerDelegate.DatePickerListener aVar = this.f63183f;
        if (aVar != null) {
            aVar.mo90447a(this.f63179a.getYear(), this.f63179a.getMonth() - 1, this.f63179a.getMonthDay());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/universe_design/datepicker/UDDatePicker$initMonthViewPager$2", "Lcom/larksuite/component/universe_design/datepicker/impl/listener/IMonthViewStateChangeListener;", "onSelectDateChange", "", "selectDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "onSelectOtherMonth", "offset", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.UDDatePicker$d */
    public static final class C25735d implements IMonthViewStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ UDDatePicker f63188a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25735d(UDDatePicker uDDatePicker) {
            this.f63188a = uDDatePicker;
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewStateChangeListener
        /* renamed from: a */
        public void mo90442a(int i) {
            ((MonthViewPager) this.f63188a.mo90420a(R.id.month_viewpager)).mo90448a(i);
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewStateChangeListener
        /* renamed from: a */
        public void mo90443a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            this.f63188a.f63179a = calendarDate;
            this.f63188a.mo90423c();
            this.f63188a.mo90421a();
        }
    }

    public void setMonthDateTextSize(float f) {
        MonthCalendarViewAdapter aVar = this.f63182e;
        if (aVar != null) {
            aVar.mo90462a(f);
        }
    }

    public void setMonthPickerListener(IDatePickerDelegate.DatePickerListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f63183f = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDDatePicker(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void setMonthDateTypeFace(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeFace");
        MonthCalendarViewAdapter aVar = this.f63182e;
        if (aVar != null) {
            aVar.mo90463a(typeface);
        }
    }

    public void setMonthHeadTextSize(float f) {
        ((MonthPickerDefaultHead) mo90420a(R.id.month_picker_head)).setMonthTextSize(f);
    }

    public void setMonthPageScrollEnable(boolean z) {
        ((MonthViewPager) mo90420a(R.id.month_viewpager)).setPageEnabled(z);
    }

    public void setMonthHeadTypeFace(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeFace");
        ((MonthPickerDefaultHead) mo90420a(R.id.month_picker_head)).setTypeFace(typeface);
    }

    public void setMonthShowMode(MonthShowMode monthShowMode) {
        Intrinsics.checkParameterIsNotNull(monthShowMode, "monthShowMode");
        this.f63180b = monthShowMode;
        m92584h();
        MonthCalendarViewAdapter aVar = this.f63182e;
        if (aVar != null) {
            aVar.mo90465b();
        }
        mo90422b();
    }

    public final void setSelectedDate(CalendarDate calendarDate) {
        this.f63179a = calendarDate;
        mo90423c();
        MonthCalendarViewAdapter aVar = this.f63182e;
        if (aVar != null) {
            aVar.mo90465b();
        }
        invalidate();
        mo90421a();
    }

    public void setFirstDayOfWeek(int i) {
        if (i >= 1 && i <= 7) {
            CalendarDate.DayOfWeek valueOf = CalendarDate.DayOfWeek.valueOf(i - 1);
            Intrinsics.checkExpressionValueIsNotNull(valueOf, "DayOfWeek.valueOf(firstDayOfWeek - 1)");
            this.f63181c = valueOf;
            m92584h();
            MonthCalendarViewAdapter aVar = this.f63182e;
            if (aVar != null) {
                aVar.mo90465b();
            }
            mo90422b();
        }
    }

    public void setSelectedCalendar(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        TimeZone timeZone = calendar.getTimeZone();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "date.timeZone");
        this.f63184g = timeZone;
        this.f63179a = new CalendarDate(new CalendarDate(calendar));
        mo90423c();
        MonthCalendarViewAdapter aVar = this.f63182e;
        if (aVar != null) {
            aVar.mo90465b();
        }
        ((MonthViewPager) mo90420a(R.id.month_viewpager)).setCurrentItem(1, false);
        mo90422b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDDatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m92578a(AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(getContext()).inflate(R.layout.ud_datepicker_default_root, (ViewGroup) this, true);
        m92580d();
        m92579b(attributeSet, i, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDDatePicker(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: b */
    private final void m92579b(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_datePicker_bodyMonthDateTextSize, R.attr.ud_datePicker_defaultHeadHeight, R.attr.ud_datePicker_firstDayOfWeek, R.attr.ud_datePicker_headMonthTextSize, R.attr.ud_datePicker_monthShowMode, R.attr.ud_datePicker_weekIndicatorBottomMargin, R.attr.ud_datePicker_weekIndicatorTopMargin}, i, i2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, -1);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(5, -1);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(0, (int) UDDimenUtils.m93307a(context, 16.0f));
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(3, (int) UDDimenUtils.m93307a(context2, 26.0f));
        int i3 = obtainStyledAttributes.getInt(4, 0);
        int integer = obtainStyledAttributes.getInteger(2, 1);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize > 0) {
            MonthPickerDefaultHead monthPickerDefaultHead = (MonthPickerDefaultHead) mo90420a(R.id.month_picker_head);
            Intrinsics.checkExpressionValueIsNotNull(monthPickerDefaultHead, "month_picker_head");
            monthPickerDefaultHead.getLayoutParams().height = dimensionPixelSize;
        }
        WeekIndicator weekIndicator = (WeekIndicator) mo90420a(R.id.month_picker_week);
        Intrinsics.checkExpressionValueIsNotNull(weekIndicator, "month_picker_week");
        ViewGroup.LayoutParams layoutParams = weekIndicator.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            layoutParams = null;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (dimensionPixelSize2 > 0 && layoutParams2 != null) {
            layoutParams2.topMargin = dimensionPixelSize2;
        }
        if (dimensionPixelSize3 > 0 && layoutParams2 != null) {
            layoutParams2.bottomMargin = dimensionPixelSize3;
        }
        if (layoutParams2 != null) {
            WeekIndicator weekIndicator2 = (WeekIndicator) mo90420a(R.id.month_picker_week);
            Intrinsics.checkExpressionValueIsNotNull(weekIndicator2, "month_picker_week");
            weekIndicator2.setLayoutParams(layoutParams2);
        }
        setMonthDateTextSize((float) dimensionPixelSize4);
        setMonthHeadTextSize((float) dimensionPixelSize5);
        setFirstDayOfWeek(integer);
        setMonthShowMode(MonthShowMode.Companion.mo90513a(i3));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDDatePicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63179a = new CalendarDate();
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        this.f63184g = timeZone;
        this.f63180b = MonthShowMode.AUTO_HEIGHT;
        this.f63181c = CalendarDate.DayOfWeek.SUNDAY;
        m92578a(attributeSet, i, i2);
    }
}
