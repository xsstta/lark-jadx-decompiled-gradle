package com.ss.android.lark.calendar.impl.features.common.widget.calendar.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.C31185a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr;
import com.ss.android.lark.calendar.impl.utils.ao;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.a */
public class C31171a extends View {

    /* renamed from: a */
    protected AbstractC31174d f78773a;

    /* renamed from: b */
    protected float f78774b = ((float) ao.m125215a());

    /* renamed from: c */
    protected int f78775c;

    /* renamed from: d */
    protected int f78776d;

    /* renamed from: e */
    protected float f78777e;

    /* renamed from: f */
    protected float f78778f;

    /* renamed from: g */
    protected CalendarDate f78779g;

    /* renamed from: h */
    protected CalendarDate f78780h;

    /* renamed from: i */
    protected CalendarDate f78781i;

    /* renamed from: j */
    protected SparseArray<List<Integer>> f78782j;

    /* renamed from: k */
    protected CalendarDate f78783k;

    /* renamed from: l */
    protected CalendarDate f78784l;

    public CalendarDate getEndDate() {
        return this.f78784l;
    }

    public CalendarDate getStartDate() {
        return this.f78783k;
    }

    public void setCurrentDate(CalendarDate calendarDate) {
        this.f78780h = calendarDate;
    }

    public void setDayEventColors(SparseArray<List<Integer>> sparseArray) {
        this.f78782j = sparseArray;
    }

    public void setEndDate(CalendarDate calendarDate) {
        this.f78784l = calendarDate;
    }

    public void setSeedDate(CalendarDate calendarDate) {
        this.f78779g = calendarDate;
    }

    public void setSelectDate(CalendarDate calendarDate) {
        this.f78781i = calendarDate;
    }

    public void setStartDate(CalendarDate calendarDate) {
        this.f78783k = calendarDate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112911a(C31185a aVar, CalendarDate calendarDate) {
        aVar.mo112983a(calendarDate);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112912a(C31185a aVar, CalendarAttr.MonthState monthState) {
        aVar.mo112985a(monthState);
    }

    public C31171a(Context context, AbstractC31174d dVar) {
        super(context);
        this.f78773a = dVar;
        this.f78775c = dVar.getCellViewHeight();
        this.f78776d = dVar.getCellViewWidth();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo112913b(C31185a aVar, CalendarDate calendarDate) {
        if (calendarDate.sameDay(this.f78781i)) {
            aVar.mo112987a(CalendarAttr.SelectState.SELECT);
        } else {
            aVar.mo112987a(CalendarAttr.SelectState.UN_SELECT);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo112914c(C31185a aVar, CalendarDate calendarDate) {
        if (calendarDate.sameDay(this.f78780h)) {
            aVar.mo112984a(CalendarAttr.DateState.CURRENT_DATE);
        } else if (calendarDate.beforeDay(this.f78780h)) {
            aVar.mo112984a(CalendarAttr.DateState.PAST_DATE);
        } else {
            aVar.mo112984a(CalendarAttr.DateState.FUTURE_DATE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo112915d(C31185a aVar, CalendarDate calendarDate) {
        SparseArray<List<Integer>> sparseArray = this.f78782j;
        if (sparseArray == null || sparseArray.size() <= 0) {
            aVar.mo112988a((List<Integer>) null);
            return;
        }
        List<Integer> list = this.f78782j.get(calendarDate.getJulianDay());
        if (CollectionUtils.isNotEmpty(list)) {
            aVar.mo112988a(list);
        } else {
            aVar.mo112988a((List<Integer>) null);
        }
    }
}
