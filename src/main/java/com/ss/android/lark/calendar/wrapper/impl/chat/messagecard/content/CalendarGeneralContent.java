package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content;

import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalGeneralContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/content/CalendarGeneralContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "calendarInternalGeneralContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalGeneralContent;", "(Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalGeneralContent;)V", "getCalendarInternalGeneralContent", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalGeneralContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarGeneralContent extends Content {
    private final CalendarInternalGeneralContent calendarInternalGeneralContent;

    public CalendarGeneralContent() {
        this(null, 1, null);
    }

    public static /* synthetic */ CalendarGeneralContent copy$default(CalendarGeneralContent calendarGeneralContent, CalendarInternalGeneralContent calendarInternalGeneralContent2, int i, Object obj) {
        if ((i & 1) != 0) {
            calendarInternalGeneralContent2 = calendarGeneralContent.calendarInternalGeneralContent;
        }
        return calendarGeneralContent.copy(calendarInternalGeneralContent2);
    }

    public final CalendarInternalGeneralContent component1() {
        return this.calendarInternalGeneralContent;
    }

    public final CalendarGeneralContent copy(CalendarInternalGeneralContent calendarInternalGeneralContent2) {
        Intrinsics.checkParameterIsNotNull(calendarInternalGeneralContent2, "calendarInternalGeneralContent");
        return new CalendarGeneralContent(calendarInternalGeneralContent2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CalendarGeneralContent) && Intrinsics.areEqual(this.calendarInternalGeneralContent, ((CalendarGeneralContent) obj).calendarInternalGeneralContent);
        }
        return true;
    }

    public int hashCode() {
        CalendarInternalGeneralContent calendarInternalGeneralContent2 = this.calendarInternalGeneralContent;
        if (calendarInternalGeneralContent2 != null) {
            return calendarInternalGeneralContent2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CalendarGeneralContent(calendarInternalGeneralContent=" + this.calendarInternalGeneralContent + ")";
    }

    public final CalendarInternalGeneralContent getCalendarInternalGeneralContent() {
        return this.calendarInternalGeneralContent;
    }

    public CalendarGeneralContent(CalendarInternalGeneralContent calendarInternalGeneralContent2) {
        Intrinsics.checkParameterIsNotNull(calendarInternalGeneralContent2, "calendarInternalGeneralContent");
        this.calendarInternalGeneralContent = calendarInternalGeneralContent2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarGeneralContent(CalendarInternalGeneralContent calendarInternalGeneralContent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CalendarInternalGeneralContent() : calendarInternalGeneralContent2);
    }
}
