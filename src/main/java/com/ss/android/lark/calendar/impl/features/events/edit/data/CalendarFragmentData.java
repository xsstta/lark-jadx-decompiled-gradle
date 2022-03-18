package com.ss.android.lark.calendar.impl.features.events.edit.data;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/CalendarFragmentData;", "Ljava/io/Serializable;", "calendarList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventCalendarData;", "Lkotlin/collections/ArrayList;", "currentIndex", "", "(Ljava/util/ArrayList;I)V", "getCalendarList", "()Ljava/util/ArrayList;", "setCalendarList", "(Ljava/util/ArrayList;)V", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarFragmentData implements Serializable {
    private ArrayList<EventCalendarData> calendarList;
    private int currentIndex;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.events.edit.data.CalendarFragmentData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarFragmentData copy$default(CalendarFragmentData calendarFragmentData, ArrayList arrayList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arrayList = calendarFragmentData.calendarList;
        }
        if ((i2 & 2) != 0) {
            i = calendarFragmentData.currentIndex;
        }
        return calendarFragmentData.copy(arrayList, i);
    }

    public final ArrayList<EventCalendarData> component1() {
        return this.calendarList;
    }

    public final int component2() {
        return this.currentIndex;
    }

    public final CalendarFragmentData copy(ArrayList<EventCalendarData> arrayList, int i) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        return new CalendarFragmentData(arrayList, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarFragmentData)) {
            return false;
        }
        CalendarFragmentData calendarFragmentData = (CalendarFragmentData) obj;
        return Intrinsics.areEqual(this.calendarList, calendarFragmentData.calendarList) && this.currentIndex == calendarFragmentData.currentIndex;
    }

    public int hashCode() {
        ArrayList<EventCalendarData> arrayList = this.calendarList;
        return ((arrayList != null ? arrayList.hashCode() : 0) * 31) + this.currentIndex;
    }

    public String toString() {
        return "CalendarFragmentData(calendarList=" + this.calendarList + ", currentIndex=" + this.currentIndex + ")";
    }

    public final ArrayList<EventCalendarData> getCalendarList() {
        return this.calendarList;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    public final void setCalendarList(ArrayList<EventCalendarData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.calendarList = arrayList;
    }

    public CalendarFragmentData(ArrayList<EventCalendarData> arrayList, int i) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        this.calendarList = arrayList;
        this.currentIndex = i;
    }
}
