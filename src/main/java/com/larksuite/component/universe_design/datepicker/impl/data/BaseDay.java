package com.larksuite.component.universe_design.datepicker.impl.data;

import com.larksuite.component.universe_design.util.CalendarDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006#"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/data/BaseDay;", "", "posRow", "", "posCol", "date", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "calendarAttr", "Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr;", "(IILcom/larksuite/component/universe_design/util/CalendarDate;Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr;)V", "getCalendarAttr", "()Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr;", "setCalendarAttr", "(Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr;)V", "getDate", "()Lcom/larksuite/component/universe_design/util/CalendarDate;", "setDate", "(Lcom/larksuite/component/universe_design/util/CalendarDate;)V", "getPosCol", "()I", "setPosCol", "(I)V", "getPosRow", "setPosRow", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.datepicker.impl.data.a */
public final class BaseDay {

    /* renamed from: a */
    private int f63227a;

    /* renamed from: b */
    private int f63228b;

    /* renamed from: c */
    private CalendarDate f63229c;

    /* renamed from: d */
    private CalendarAttr f63230d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseDay)) {
            return false;
        }
        BaseDay aVar = (BaseDay) obj;
        return this.f63227a == aVar.f63227a && this.f63228b == aVar.f63228b && Intrinsics.areEqual(this.f63229c, aVar.f63229c) && Intrinsics.areEqual(this.f63230d, aVar.f63230d);
    }

    public int hashCode() {
        int i = ((this.f63227a * 31) + this.f63228b) * 31;
        CalendarDate calendarDate = this.f63229c;
        int i2 = 0;
        int hashCode = (i + (calendarDate != null ? calendarDate.hashCode() : 0)) * 31;
        CalendarAttr calendarAttr = this.f63230d;
        if (calendarAttr != null) {
            i2 = calendarAttr.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "BaseDay(posRow=" + this.f63227a + ", posCol=" + this.f63228b + ", date=" + this.f63229c + ", calendarAttr=" + this.f63230d + ")";
    }

    /* renamed from: a */
    public final int mo90514a() {
        return this.f63227a;
    }

    /* renamed from: b */
    public final int mo90516b() {
        return this.f63228b;
    }

    /* renamed from: c */
    public final CalendarDate mo90517c() {
        return this.f63229c;
    }

    /* renamed from: d */
    public final CalendarAttr mo90518d() {
        return this.f63230d;
    }

    /* renamed from: a */
    public final void mo90515a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "<set-?>");
        this.f63229c = calendarDate;
    }

    public BaseDay(int i, int i2, CalendarDate calendarDate, CalendarAttr calendarAttr) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        Intrinsics.checkParameterIsNotNull(calendarAttr, "calendarAttr");
        this.f63227a = i;
        this.f63228b = i2;
        this.f63229c = calendarDate;
        this.f63230d = calendarAttr;
    }
}
