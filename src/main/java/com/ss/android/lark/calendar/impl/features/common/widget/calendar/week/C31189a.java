package com.ss.android.lark.calendar.impl.features.common.widget.calendar.week;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31179a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.a */
public class C31189a extends AbstractC31218b {

    /* renamed from: a */
    public AbstractC31179a f78842a;

    /* renamed from: d */
    private Context f78843d;

    /* renamed from: e */
    private AbstractC31180b f78844e;

    /* renamed from: f */
    private AbstractC31174d f78845f;

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b
    /* renamed from: b */
    public void mo108831b(int i) {
    }

    /* renamed from: a */
    public CalendarDate mo113005a() {
        return this.f78844e.mo111731b();
    }

    /* renamed from: b */
    public CalendarDate mo113009b() {
        return mo113005a().modifyWeek(-1).moveToDayStart();
    }

    /* renamed from: c */
    public CalendarDate mo113010c() {
        return mo113005a().modifyWeek(1).moveToDayStart();
    }

    /* renamed from: d */
    public void mo113011d() {
        for (int i = 0; i < getCount(); i++) {
            ((C31192c) mo113215d(i)).mo113016b();
        }
    }

    /* renamed from: f */
    public void mo113013f() {
        if (mo113217i()) {
            for (int i = 0; i < getCount(); i++) {
                ((C31192c) mo113215d(i)).invalidate();
            }
        }
    }

    /* renamed from: e */
    public void mo113012e() {
        if (mo113217i()) {
            for (int i = 0; i < getCount(); i++) {
                C31192c cVar = (C31192c) mo113215d(i);
                cVar.setSelectDate(mo113005a());
                cVar.mo113015a();
            }
        }
    }

    /* renamed from: g */
    public void mo113014g() {
        if (mo113217i()) {
            for (int i = 0; i < getCount(); i++) {
                C31192c cVar = (C31192c) mo113215d(i);
                CalendarDate modifyWeek = mo113005a().modifyWeek(i > 0 ? i - 1 : -1);
                cVar.setSeedDate(modifyWeek);
                cVar.setStartDate(C32647d.m125283d(modifyWeek));
                cVar.setEndDate(C32647d.m125285e(modifyWeek));
                cVar.setSelectDate(mo113005a());
                cVar.mo113015a();
            }
        }
    }

    /* renamed from: a */
    public void mo113008a(AbstractC31179a aVar) {
        this.f78842a = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b
    /* renamed from: a */
    public View mo108825a(int i) {
        C31192c cVar = new C31192c(this.f78843d, this.f78845f);
        m116469a(cVar, i);
        return cVar;
    }

    /* renamed from: a */
    public void mo113007a(CalendarDate calendarDate) {
        if (mo113217i()) {
            for (int i = 0; i < getCount(); i++) {
                C31192c cVar = (C31192c) mo113215d(i);
                cVar.setCurrentDate(calendarDate);
                cVar.mo113015a();
            }
        }
    }

    /* renamed from: a */
    private void m116469a(C31192c cVar, int i) {
        CalendarSetting.DayOfWeek weekStartDay = C30022a.f74884c.mo108456c().getWeekStartDay();
        m116470a(cVar, i, weekStartDay);
        C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a(weekStartDay, cVar, i) {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.$$Lambda$a$yz62MeEkJenAPNOwqdoMHlDRDqw */
            public final /* synthetic */ CalendarSetting.DayOfWeek f$1;
            public final /* synthetic */ C31192c f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
            public final void onGetSucceed(CalendarSetting calendarSetting) {
                C31189a.this.m116471a(this.f$1, this.f$2, this.f$3, calendarSetting);
            }
        });
    }

    public C31189a(Context context, AbstractC31180b bVar) {
        super(context);
        this.f78843d = context;
        C31191b bVar2 = new C31191b(context);
        this.f78845f = bVar2;
        bVar2.setDesktopWidth(C36512a.m144041a().mo134753a(ContainerType.Right).width());
        this.f78845f.setTypeFace(Typeface.createFromAsset(this.f78843d.getAssets(), "fonts/DINPro-Bold.ttf"));
        this.f78844e = bVar;
        mo113216h();
    }

    /* renamed from: a */
    private void m116470a(C31192c cVar, int i, CalendarSetting.DayOfWeek dayOfWeek) {
        int i2;
        CalendarDate a = mo113005a();
        if (i > 0) {
            i2 = i - 1;
        } else {
            i2 = -1;
        }
        CalendarDate modifyWeek = a.modifyWeek(i2);
        cVar.setSeedDate(modifyWeek);
        cVar.setStartDate(C32647d.m125284d(modifyWeek, dayOfWeek));
        cVar.setEndDate(C32647d.m125286e(modifyWeek, dayOfWeek));
        cVar.setSelectDate(mo113005a());
        cVar.setCurrentDate(this.f78844e.mo111730a());
        cVar.setOnMonthDayViewSelectListener(new AbstractC31175e() {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.C31189a.C311901 */

            @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
            /* renamed from: a */
            public void mo112939a() {
                C31189a.this.mo113011d();
            }

            @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
            /* renamed from: b */
            public void mo112942b() {
                C31189a.this.mo113012e();
            }

            @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
            /* renamed from: a */
            public void mo112940a(int i) {
                C31189a.this.f78842a.mo111732a(i);
            }

            @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
            /* renamed from: a */
            public void mo112941a(CalendarDate calendarDate) {
                C31189a.this.f78842a.mo111733a(calendarDate);
            }
        });
        cVar.mo113015a();
    }

    /* renamed from: a */
    public void mo113006a(SparseArray<List<Integer>> sparseArray, int i, int i2) {
        if (mo113217i()) {
            for (int i3 = 0; i3 < getCount(); i3++) {
                C31192c cVar = (C31192c) mo113215d(i3);
                if (cVar.getStartDate().getJulianDay() >= i && cVar.getEndDate().getJulianDay() <= i2) {
                    cVar.setDayEventColors(sparseArray);
                    cVar.mo113015a();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m116471a(CalendarSetting.DayOfWeek dayOfWeek, C31192c cVar, int i, CalendarSetting calendarSetting) {
        if (dayOfWeek != calendarSetting.getWeekStartDay()) {
            m116470a(cVar, i, calendarSetting.getWeekStartDay());
        }
    }
}
