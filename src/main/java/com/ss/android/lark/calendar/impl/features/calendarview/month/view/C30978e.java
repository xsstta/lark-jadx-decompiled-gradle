package com.ss.android.lark.calendar.impl.features.calendarview.month.view;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramModel;
import com.ss.android.lark.calendar.impl.features.calendarview.month.listener.IMonthDayViewListener;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31111g;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import com.ss.android.lark.calendar.p1430a.C30022a;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.view.e */
public class C30978e extends AbstractC31218b {

    /* renamed from: a */
    private AbstractC31180b f78130a;

    /* renamed from: d */
    private IMonthDayViewListener f78131d;

    /* renamed from: e */
    private AbstractC30969a f78132e;

    /* renamed from: f */
    private AbstractC31111g f78133f;

    /* renamed from: g */
    private int f78134g;

    /* renamed from: h */
    private int f78135h;

    /* renamed from: a */
    public void mo112166a(AbstractC31111g gVar) {
        this.f78133f = gVar;
    }

    /* renamed from: a */
    public CalendarDate mo112160a() {
        return this.f78130a.mo111731b();
    }

    /* renamed from: b */
    public CalendarDate mo112167b() {
        return this.f78130a.mo111730a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo112169c() {
        for (int i = 0; i < getCount(); i++) {
            ((View$OnTouchListenerC30971c) mo113215d(i)).mo112120e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public CalendarDate mo112171d() {
        CalendarDate firstDateOfMonth = ((View$OnTouchListenerC30971c) mo113215d(1)).getFirstDateOfMonth();
        CalendarDate b = mo112167b();
        if (firstDateOfMonth.getMonth() == b.getMonth() && firstDateOfMonth.getYear() == b.getYear()) {
            return new CalendarDate(b);
        }
        return new CalendarDate(firstDateOfMonth);
    }

    /* renamed from: a */
    public void mo112165a(AbstractC30969a aVar) {
        this.f78132e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m115638b(CalendarDate calendarDate) {
        this.f78132e.mo112071a(calendarDate);
    }

    /* renamed from: a */
    private void m115635a(View$OnTouchListenerC30971c cVar) {
        cVar.setMonthDayViewListener(this.f78131d);
        cVar.setMonthDaySelectListener(new AbstractC30979f() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.$$Lambda$e$g1V4v0jYp4eA3KA7erYfHZSuRfc */

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.view.AbstractC30979f
            public final void onSelectDateChanged(CalendarDate calendarDate) {
                C30978e.this.m115638b((C30978e) calendarDate);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo112170c(int i) {
        View$OnTouchListenerC30971c cVar = (View$OnTouchListenerC30971c) mo113215d(i);
        cVar.mo112115a(false);
        cVar.mo112121f();
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b
    /* renamed from: b */
    public void mo108831b(int i) {
        AbstractC31111g gVar;
        int i2 = this.f78134g + 1;
        this.f78134g = i2;
        if (this.f78135h == 3 && i2 == 3 && (gVar = this.f78133f) != null) {
            gVar.mo108584a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo112168b(MonthDiagramModel.SettingItemsData dVar) {
        mo112161a(0, dVar);
        mo112161a(2, dVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b
    /* renamed from: a */
    public View mo108825a(int i) {
        View$OnTouchListenerC30971c cVar = new View$OnTouchListenerC30971c(this.f78951b);
        m115635a(cVar);
        m115636a(cVar, i);
        return cVar;
    }

    /* renamed from: a */
    public void mo112163a(CalendarDate calendarDate) {
        if (mo113217i()) {
            for (int i = 0; i < getCount(); i++) {
                View$OnTouchListenerC30971c cVar = (View$OnTouchListenerC30971c) mo113215d(i);
                cVar.setCurrentDate(calendarDate);
                cVar.mo112129i();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo112164a(MonthDiagramModel.SettingItemsData dVar) {
        mo112161a(0, dVar);
        mo112161a(1, dVar);
        mo112161a(2, dVar);
    }

    /* renamed from: a */
    private void m115636a(View$OnTouchListenerC30971c cVar, int i) {
        CalendarSetting c = C30022a.f74884c.mo108456c();
        m115634a(i, cVar, c.getWeekStartDay());
        C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a(c, i, cVar) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.$$Lambda$e$QYIeWArBJxiyRSKDnbsnNO3woQ */
            public final /* synthetic */ CalendarSetting f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ View$OnTouchListenerC30971c f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
            public final void onGetSucceed(CalendarSetting calendarSetting) {
                C30978e.this.m115637a(this.f$1, this.f$2, this.f$3, calendarSetting);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo112161a(int i, MonthDiagramModel.SettingItemsData dVar) {
        mo112162a(i, true, dVar);
    }

    public C30978e(Context context, AbstractC31180b bVar, IMonthDayViewListener aVar) {
        super(context);
        this.f78130a = bVar;
        this.f78131d = aVar;
        mo113216h();
    }

    /* renamed from: a */
    private void m115634a(int i, View$OnTouchListenerC30971c cVar, CalendarSetting.DayOfWeek dayOfWeek) {
        int i2;
        CalendarDate a = mo112160a();
        if (i > 0) {
            i2 = i - 1;
        } else {
            i2 = -1;
        }
        CalendarDate modifyMonth = a.modifyMonth(i2);
        modifyMonth.setMonthDay(1);
        cVar.setFirstDateOfMonth(modifyMonth);
        cVar.setStartDate(C32647d.m125280b(modifyMonth, dayOfWeek));
        cVar.setSelectDate(mo112160a());
        cVar.setCurrentDate(mo112167b());
        cVar.mo112122g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo112162a(int i, boolean z, MonthDiagramModel.SettingItemsData dVar) {
        int i2;
        View$OnTouchListenerC30971c cVar = (View$OnTouchListenerC30971c) mo113215d(i);
        if (cVar != null) {
            CalendarDate a = mo112160a();
            if (z) {
                if (i > 0) {
                    i2 = i - 1;
                } else {
                    i2 = -1;
                }
                a = a.modifyMonth(i2);
            }
            a.setMonthDay(1);
            cVar.setFirstDateOfMonth(a);
            cVar.setStartDate(C32647d.m125279b(a));
            cVar.setCurrentDate(mo112167b());
            cVar.setSelectDate(mo112160a());
            cVar.setDayOfWeek(dVar.mo112043a());
            cVar.setIsShowLunarCalendar(dVar.mo112044b());
            cVar.mo112122g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m115637a(CalendarSetting calendarSetting, int i, View$OnTouchListenerC30971c cVar, CalendarSetting calendarSetting2) {
        AbstractC31111g gVar;
        if (calendarSetting2.getWeekStartDay() != calendarSetting.getWeekStartDay()) {
            m115634a(i, cVar, calendarSetting2.getWeekStartDay());
        }
        int i2 = this.f78135h + 1;
        this.f78135h = i2;
        if (i2 == 3 && this.f78134g == 3 && (gVar = this.f78133f) != null) {
            gVar.mo108584a();
        }
    }
}
