package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content;

import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalShareEventContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/content/ShareCalendarEventContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "calendarInternalShareEventContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalShareEventContent;", "(Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalShareEventContent;)V", "getCalendarInternalShareEventContent", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalShareEventContent;", "serialVersionUID", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ShareCalendarEventContent extends Content {
    private final CalendarInternalShareEventContent calendarInternalShareEventContent;
    private final long serialVersionUID;

    public ShareCalendarEventContent() {
        this(null, 1, null);
    }

    public static /* synthetic */ ShareCalendarEventContent copy$default(ShareCalendarEventContent shareCalendarEventContent, CalendarInternalShareEventContent calendarInternalShareEventContent2, int i, Object obj) {
        if ((i & 1) != 0) {
            calendarInternalShareEventContent2 = shareCalendarEventContent.calendarInternalShareEventContent;
        }
        return shareCalendarEventContent.copy(calendarInternalShareEventContent2);
    }

    public final CalendarInternalShareEventContent component1() {
        return this.calendarInternalShareEventContent;
    }

    public final ShareCalendarEventContent copy(CalendarInternalShareEventContent calendarInternalShareEventContent2) {
        Intrinsics.checkParameterIsNotNull(calendarInternalShareEventContent2, "calendarInternalShareEventContent");
        return new ShareCalendarEventContent(calendarInternalShareEventContent2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ShareCalendarEventContent) && Intrinsics.areEqual(this.calendarInternalShareEventContent, ((ShareCalendarEventContent) obj).calendarInternalShareEventContent);
        }
        return true;
    }

    public int hashCode() {
        CalendarInternalShareEventContent calendarInternalShareEventContent2 = this.calendarInternalShareEventContent;
        if (calendarInternalShareEventContent2 != null) {
            return calendarInternalShareEventContent2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ShareCalendarEventContent(calendarInternalShareEventContent=" + this.calendarInternalShareEventContent + ")";
    }

    public final CalendarInternalShareEventContent getCalendarInternalShareEventContent() {
        return this.calendarInternalShareEventContent;
    }

    public ShareCalendarEventContent(CalendarInternalShareEventContent calendarInternalShareEventContent2) {
        Intrinsics.checkParameterIsNotNull(calendarInternalShareEventContent2, "calendarInternalShareEventContent");
        this.calendarInternalShareEventContent = calendarInternalShareEventContent2;
        this.serialVersionUID = 3278253192592128036L;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareCalendarEventContent(CalendarInternalShareEventContent calendarInternalShareEventContent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CalendarInternalShareEventContent() : calendarInternalShareEventContent2);
    }
}
