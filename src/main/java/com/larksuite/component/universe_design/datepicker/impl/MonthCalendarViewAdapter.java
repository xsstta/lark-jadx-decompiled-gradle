package com.larksuite.component.universe_design.datepicker.impl;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.larksuite.component.universe_design.datepicker.impl.infinite.InfinitePagerAdapter;
import com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewDataFetcher;
import com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewStateChangeListener;
import com.larksuite.component.universe_design.datepicker.impl.listener.OnMonthDayViewSelectListener;
import com.larksuite.component.universe_design.datepicker.impl.monthview.MonthView;
import com.larksuite.component.universe_design.util.CalendarDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0010J\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u000eJ\u0006\u0010$\u001a\u00020\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/MonthCalendarViewAdapter;", "Lcom/larksuite/component/universe_design/datepicker/impl/infinite/InfinitePagerAdapter;", "context", "Landroid/content/Context;", "monthViewDataFetcher", "Lcom/larksuite/component/universe_design/datepicker/impl/listener/IMonthViewDataFetcher;", "(Landroid/content/Context;Lcom/larksuite/component/universe_design/datepicker/impl/listener/IMonthViewDataFetcher;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "monthViewStateChangeListener", "Lcom/larksuite/component/universe_design/datepicker/impl/listener/IMonthViewStateChangeListener;", "afterInstantiateItem", "", "position", "", "getFollowingStartDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "getPreviousStartDate", "getSelectedDate", "initMonthViewDate", "monthView", "Lcom/larksuite/component/universe_design/datepicker/impl/monthview/MonthView;", "onInstantiateItem", "Landroid/view/View;", "refreshPage", "pageIndex", "setMonthDateTextSize", "textSize", "", "setMonthViewStateChangeListener", "setTypeFace", "typeFace", "Landroid/graphics/Typeface;", "updateAllViews", "updateSelectState", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.datepicker.impl.a */
public final class MonthCalendarViewAdapter extends InfinitePagerAdapter {

    /* renamed from: a */
    public IMonthViewStateChangeListener f63194a;

    /* renamed from: c */
    private Context f63195c;

    /* renamed from: d */
    private IMonthViewDataFetcher f63196d;

    @Override // com.larksuite.component.universe_design.datepicker.impl.infinite.InfinitePagerAdapter
    /* renamed from: b */
    public void mo90466b(int i) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/larksuite/component/universe_design/datepicker/impl/MonthCalendarViewAdapter$initMonthViewDate$2", "Lcom/larksuite/component/universe_design/datepicker/impl/listener/OnMonthDayViewSelectListener;", "onSelectDateChanged", "", "selectDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "onSelectOtherMonth", "offset", "", "onUpdateSelectState", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.impl.a$a */
    public static final class C25739a implements OnMonthDayViewSelectListener {

        /* renamed from: a */
        final /* synthetic */ MonthCalendarViewAdapter f63197a;

        @Override // com.larksuite.component.universe_design.datepicker.impl.listener.OnMonthDayViewSelectListener
        /* renamed from: a */
        public void mo90470a() {
            this.f63197a.mo90461a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25739a(MonthCalendarViewAdapter aVar) {
            this.f63197a = aVar;
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.listener.OnMonthDayViewSelectListener
        /* renamed from: a */
        public void mo90471a(int i) {
            IMonthViewStateChangeListener dVar = this.f63197a.f63194a;
            if (dVar != null) {
                dVar.mo90442a(i);
            }
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.listener.OnMonthDayViewSelectListener
        /* renamed from: a */
        public void mo90472a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            IMonthViewStateChangeListener dVar = this.f63197a.f63194a;
            if (dVar != null) {
                dVar.mo90443a(calendarDate);
            }
        }
    }

    /* renamed from: c */
    public final CalendarDate mo90467c() {
        return this.f63196d.mo90439b();
    }

    /* renamed from: a */
    public final void mo90461a() {
        int count = getCount();
        for (int i = 0; i < count; i++) {
            MonthView cVar = (MonthView) mo90545c(i);
            if (cVar != null) {
                cVar.setSelectDate(mo90467c());
                cVar.mo90478a();
            }
        }
    }

    /* renamed from: d */
    public final CalendarDate mo90468d() {
        CalendarDate modifyMonth = mo90467c().modifyMonth(-1);
        Intrinsics.checkExpressionValueIsNotNull(modifyMonth, "getSelectedDate().modifyMonth(-1)");
        modifyMonth.setMonthDay(1);
        CalendarDate moveToDayStart = modifyMonth.moveToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "calendarDate.moveToDayStart()");
        return moveToDayStart;
    }

    /* renamed from: e */
    public final CalendarDate mo90469e() {
        CalendarDate modifyMonth = mo90467c().modifyMonth(1);
        Intrinsics.checkExpressionValueIsNotNull(modifyMonth, "getSelectedDate().modifyMonth(1)");
        modifyMonth.setMonthDay(1);
        CalendarDate moveToDayStart = modifyMonth.moveToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "calendarDate.moveToDayStart()");
        return moveToDayStart;
    }

    /* renamed from: b */
    public final void mo90465b() {
        int count = getCount();
        for (int i = 0; i < count; i++) {
            MonthView cVar = (MonthView) mo90545c(i);
            if (cVar != null) {
                CalendarDate modifyMonth = mo90467c().modifyMonth(i > 0 ? i - 1 : -1);
                if (modifyMonth != null) {
                    modifyMonth.setMonthDay(1);
                    cVar.setSeedDate(modifyMonth);
                    cVar.setSelectDate(mo90467c());
                    cVar.setCurrentDate(this.f63196d.mo90438a());
                    cVar.setFirstWeekDay(this.f63196d.mo90441d());
                    cVar.setMonthShowMode(this.f63196d.mo90440c());
                    cVar.mo90478a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo90464a(IMonthViewStateChangeListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "monthViewStateChangeListener");
        this.f63194a = dVar;
    }

    @Override // com.larksuite.component.universe_design.datepicker.impl.infinite.InfinitePagerAdapter
    /* renamed from: a */
    public View mo90460a(int i) {
        MonthView cVar = new MonthView(this.f63195c);
        m92611a(cVar, i);
        return cVar;
    }

    /* renamed from: a */
    public final void mo90462a(float f) {
        int count = getCount();
        for (int i = 0; i < count; i++) {
            MonthView cVar = (MonthView) mo90545c(i);
            if (cVar != null) {
                cVar.setMonthTextSize(f);
            }
        }
    }

    /* renamed from: a */
    public final void mo90463a(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeFace");
        int count = getCount();
        for (int i = 0; i < count; i++) {
            MonthView cVar = (MonthView) mo90545c(i);
            if (cVar != null) {
                cVar.setTypeFace(typeface);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthCalendarViewAdapter(Context context, IMonthViewDataFetcher bVar) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "monthViewDataFetcher");
        this.f63195c = context;
        this.f63196d = bVar;
        mo90546f();
    }

    /* renamed from: a */
    private final void m92611a(MonthView cVar, int i) {
        int i2;
        CalendarDate b = this.f63196d.mo90439b();
        if (i > 0) {
            i2 = i - 1;
        } else {
            i2 = -1;
        }
        CalendarDate modifyMonth = b.modifyMonth(i2);
        Intrinsics.checkExpressionValueIsNotNull(modifyMonth, "monthStartDate");
        modifyMonth.setMonthDay(1);
        cVar.setSeedDate(modifyMonth);
        cVar.setSelectDate(this.f63196d.mo90439b());
        cVar.setCurrentDate(this.f63196d.mo90438a());
        cVar.setFirstWeekDay(this.f63196d.mo90441d());
        cVar.setMonthShowMode(this.f63196d.mo90440c());
        cVar.setOnMonthDayViewSelectListener(new C25739a(this));
        cVar.mo90478a();
    }
}
