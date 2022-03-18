package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCollection;", "Ljava/io/Serializable;", "uiItems", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/EntitySchema;", "compatibility", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCompatibility;", "(Ljava/util/List;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCompatibility;)V", "getCompatibility", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCompatibility;", "setCompatibility", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCompatibility;)V", "getUiItems", "()Ljava/util/List;", "setUiItems", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSchemaCollection implements Serializable {
    private CalendarSchemaCompatibility compatibility;
    private List<EntitySchema> uiItems;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarSchemaCollection copy$default(CalendarSchemaCollection calendarSchemaCollection, List list, CalendarSchemaCompatibility calendarSchemaCompatibility, int i, Object obj) {
        if ((i & 1) != 0) {
            list = calendarSchemaCollection.uiItems;
        }
        if ((i & 2) != 0) {
            calendarSchemaCompatibility = calendarSchemaCollection.compatibility;
        }
        return calendarSchemaCollection.copy(list, calendarSchemaCompatibility);
    }

    public final List<EntitySchema> component1() {
        return this.uiItems;
    }

    public final CalendarSchemaCompatibility component2() {
        return this.compatibility;
    }

    public final CalendarSchemaCollection copy(List<EntitySchema> list, CalendarSchemaCompatibility calendarSchemaCompatibility) {
        Intrinsics.checkParameterIsNotNull(list, "uiItems");
        return new CalendarSchemaCollection(list, calendarSchemaCompatibility);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarSchemaCollection)) {
            return false;
        }
        CalendarSchemaCollection calendarSchemaCollection = (CalendarSchemaCollection) obj;
        return Intrinsics.areEqual(this.uiItems, calendarSchemaCollection.uiItems) && Intrinsics.areEqual(this.compatibility, calendarSchemaCollection.compatibility);
    }

    public int hashCode() {
        List<EntitySchema> list = this.uiItems;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        CalendarSchemaCompatibility calendarSchemaCompatibility = this.compatibility;
        if (calendarSchemaCompatibility != null) {
            i = calendarSchemaCompatibility.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CalendarSchemaCollection(uiItems=" + this.uiItems + ", compatibility=" + this.compatibility + ")";
    }

    public final CalendarSchemaCompatibility getCompatibility() {
        return this.compatibility;
    }

    public final List<EntitySchema> getUiItems() {
        return this.uiItems;
    }

    public final void setCompatibility(CalendarSchemaCompatibility calendarSchemaCompatibility) {
        this.compatibility = calendarSchemaCompatibility;
    }

    public final void setUiItems(List<EntitySchema> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.uiItems = list;
    }

    public CalendarSchemaCollection(List<EntitySchema> list, CalendarSchemaCompatibility calendarSchemaCompatibility) {
        Intrinsics.checkParameterIsNotNull(list, "uiItems");
        this.uiItems = list;
        this.compatibility = calendarSchemaCompatibility;
    }
}
