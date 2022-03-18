package com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.a */
public class C31185a {

    /* renamed from: a */
    private CalendarAttr.SelectState f78819a;

    /* renamed from: b */
    private CalendarAttr.DateState f78820b;

    /* renamed from: c */
    private CalendarAttr.MonthState f78821c;

    /* renamed from: d */
    private CalendarAttr.OptionalState f78822d = CalendarAttr.OptionalState.OPTIONAL;

    /* renamed from: e */
    private CalendarDate f78823e;

    /* renamed from: f */
    private int f78824f;

    /* renamed from: g */
    private int f78825g;

    /* renamed from: h */
    private List<Integer> f78826h;

    /* renamed from: a */
    public CalendarAttr.SelectState mo112982a() {
        return this.f78819a;
    }

    /* renamed from: b */
    public CalendarAttr.DateState mo112989b() {
        return this.f78820b;
    }

    /* renamed from: c */
    public CalendarAttr.MonthState mo112990c() {
        return this.f78821c;
    }

    /* renamed from: d */
    public CalendarAttr.OptionalState mo112991d() {
        return this.f78822d;
    }

    /* renamed from: e */
    public CalendarDate mo112992e() {
        return this.f78823e;
    }

    /* renamed from: f */
    public int mo112993f() {
        return this.f78824f;
    }

    /* renamed from: g */
    public int mo112994g() {
        return this.f78825g;
    }

    /* renamed from: h */
    public List<Integer> mo112995h() {
        return this.f78826h;
    }

    /* renamed from: a */
    public void mo112983a(CalendarDate calendarDate) {
        this.f78823e = calendarDate;
    }

    /* renamed from: a */
    public void mo112984a(CalendarAttr.DateState dateState) {
        this.f78820b = dateState;
    }

    /* renamed from: a */
    public void mo112985a(CalendarAttr.MonthState monthState) {
        this.f78821c = monthState;
    }

    /* renamed from: a */
    public void mo112986a(CalendarAttr.OptionalState optionalState) {
        this.f78822d = optionalState;
    }

    /* renamed from: a */
    public void mo112987a(CalendarAttr.SelectState selectState) {
        this.f78819a = selectState;
    }

    /* renamed from: a */
    public void mo112988a(List<Integer> list) {
        this.f78826h = list;
    }

    public C31185a(CalendarAttr.SelectState selectState, CalendarAttr.DateState dateState, CalendarAttr.MonthState monthState, CalendarDate calendarDate, int i, int i2) {
        this.f78819a = selectState;
        this.f78820b = dateState;
        this.f78821c = monthState;
        this.f78823e = calendarDate;
        this.f78824f = i;
        this.f78825g = i2;
    }
}
