package com.ss.android.lark.widget.timepicker.monthview.p2982c;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.widget.timepicker.monthview.AbstractC59229a;
import com.ss.android.lark.widget.timepicker.monthview.constants.MonthViewAttr;
import com.ss.android.lark.widget.timepicker.monthview.data.C59243a;
import com.ss.android.lark.widget.timepicker.monthview.data.CalendarDate;

/* renamed from: com.ss.android.lark.widget.timepicker.monthview.c.a */
public class C59240a extends View {

    /* renamed from: a */
    protected AbstractC59229a f147102a;

    /* renamed from: b */
    protected float f147103b;

    /* renamed from: c */
    protected int f147104c;

    /* renamed from: d */
    protected int f147105d;

    /* renamed from: e */
    protected float f147106e;

    /* renamed from: f */
    protected float f147107f;

    /* renamed from: g */
    protected CalendarDate f147108g;

    /* renamed from: h */
    protected CalendarDate f147109h;

    /* renamed from: i */
    protected CalendarDate f147110i;

    /* renamed from: j */
    protected CalendarDate f147111j;

    /* renamed from: k */
    protected CalendarDate f147112k;

    public CalendarDate getEndDate() {
        return this.f147112k;
    }

    public CalendarDate getStartDate() {
        return this.f147111j;
    }

    public void setCurrentDate(CalendarDate calendarDate) {
        this.f147109h = calendarDate;
    }

    public void setEndDate(CalendarDate calendarDate) {
        this.f147112k = calendarDate;
    }

    public void setSeedDate(CalendarDate calendarDate) {
        this.f147108g = calendarDate;
    }

    public void setSelectDate(CalendarDate calendarDate) {
        this.f147110i = calendarDate;
    }

    public void setStartDate(CalendarDate calendarDate) {
        this.f147111j = calendarDate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo201378a(C59243a aVar, MonthViewAttr.MonthState monthState) {
        aVar.mo201445a(monthState);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo201379a(C59243a aVar, CalendarDate calendarDate) {
        aVar.mo201448a(calendarDate);
    }

    public C59240a(Context context, AbstractC59229a aVar) {
        super(context);
        this.f147102a = aVar;
        this.f147103b = (float) UIUtils.getScaledTouchSlop(context);
        if (!DesktopUtil.m144307b()) {
            this.f147104c = aVar.getCellViewHeight();
            this.f147105d = aVar.getCellViewWidth();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo201380b(C59243a aVar, CalendarDate calendarDate) {
        if (calendarDate.sameDay(this.f147110i)) {
            aVar.mo201447a(MonthViewAttr.SelectState.SELECT);
        } else {
            aVar.mo201447a(MonthViewAttr.SelectState.UN_SELECT);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo201381c(C59243a aVar, CalendarDate calendarDate) {
        if (calendarDate.sameDay(this.f147109h)) {
            aVar.mo201444a(MonthViewAttr.DateState.CURRENT_DATE);
        } else if (calendarDate.beforeDay(this.f147109h)) {
            aVar.mo201444a(MonthViewAttr.DateState.PAST_DATE);
        } else {
            aVar.mo201444a(MonthViewAttr.DateState.FUTURE_DATE);
        }
    }
}
