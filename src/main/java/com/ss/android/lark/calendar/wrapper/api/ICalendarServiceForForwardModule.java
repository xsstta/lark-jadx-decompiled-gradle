package com.ss.android.lark.calendar.wrapper.api;

import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.ShareCalendarEventContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/api/ICalendarServiceForForwardModule;", "", "calendarFilterOuterForForward", "", "shareCalendarEventContent", "Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/content/ShareCalendarEventContent;", "wrapShareCalendarEventContent", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "forwardSourceData", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.a.c */
public interface ICalendarServiceForForwardModule {
    /* renamed from: a */
    Content mo120374a(Object obj);

    /* renamed from: a */
    boolean mo120375a(ShareCalendarEventContent shareCalendarEventContent);
}
