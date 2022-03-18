package com.larksuite.component.universe_design.datepicker.impl.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0003 !\"B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr;", "", "selectState", "Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$SelectState;", "dateState", "Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$DateState;", "monthState", "Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$MonthState;", "(Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$SelectState;Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$DateState;Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$MonthState;)V", "getDateState", "()Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$DateState;", "setDateState", "(Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$DateState;)V", "getMonthState", "()Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$MonthState;", "setMonthState", "(Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$MonthState;)V", "getSelectState", "()Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$SelectState;", "setSelectState", "(Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$SelectState;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DateState", "MonthState", "SelectState", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarAttr {

    /* renamed from: a */
    private SelectState f63224a;

    /* renamed from: b */
    private DateState f63225b;

    /* renamed from: c */
    private MonthState f63226c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$DateState;", "", "(Ljava/lang/String;I)V", "PAST_DATE", "FUTURE_DATE", "CURRENT_DATE", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DateState {
        PAST_DATE,
        FUTURE_DATE,
        CURRENT_DATE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$MonthState;", "", "(Ljava/lang/String;I)V", "CURRENT_MONTH", "LAST_MONTH", "NEXT_MONTH", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum MonthState {
        CURRENT_MONTH,
        LAST_MONTH,
        NEXT_MONTH
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$SelectState;", "", "(Ljava/lang/String;I)V", "SELECT", "UN_SELECT", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum SelectState {
        SELECT,
        UN_SELECT
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarAttr)) {
            return false;
        }
        CalendarAttr calendarAttr = (CalendarAttr) obj;
        return Intrinsics.areEqual(this.f63224a, calendarAttr.f63224a) && Intrinsics.areEqual(this.f63225b, calendarAttr.f63225b) && Intrinsics.areEqual(this.f63226c, calendarAttr.f63226c);
    }

    public int hashCode() {
        SelectState selectState = this.f63224a;
        int i = 0;
        int hashCode = (selectState != null ? selectState.hashCode() : 0) * 31;
        DateState dateState = this.f63225b;
        int hashCode2 = (hashCode + (dateState != null ? dateState.hashCode() : 0)) * 31;
        MonthState monthState = this.f63226c;
        if (monthState != null) {
            i = monthState.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CalendarAttr(selectState=" + this.f63224a + ", dateState=" + this.f63225b + ", monthState=" + this.f63226c + ")";
    }

    /* renamed from: a */
    public final SelectState mo90503a() {
        return this.f63224a;
    }

    /* renamed from: b */
    public final DateState mo90507b() {
        return this.f63225b;
    }

    /* renamed from: c */
    public final MonthState mo90508c() {
        return this.f63226c;
    }

    /* renamed from: a */
    public final void mo90504a(DateState dateState) {
        Intrinsics.checkParameterIsNotNull(dateState, "<set-?>");
        this.f63225b = dateState;
    }

    /* renamed from: a */
    public final void mo90505a(MonthState monthState) {
        Intrinsics.checkParameterIsNotNull(monthState, "<set-?>");
        this.f63226c = monthState;
    }

    /* renamed from: a */
    public final void mo90506a(SelectState selectState) {
        Intrinsics.checkParameterIsNotNull(selectState, "<set-?>");
        this.f63224a = selectState;
    }

    public CalendarAttr(SelectState selectState, DateState dateState, MonthState monthState) {
        Intrinsics.checkParameterIsNotNull(selectState, "selectState");
        Intrinsics.checkParameterIsNotNull(dateState, "dateState");
        Intrinsics.checkParameterIsNotNull(monthState, "monthState");
        this.f63224a = selectState;
        this.f63225b = dateState;
        this.f63226c = monthState;
    }
}
