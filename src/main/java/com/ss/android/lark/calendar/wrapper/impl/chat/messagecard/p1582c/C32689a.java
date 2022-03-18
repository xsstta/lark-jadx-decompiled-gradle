package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1582c;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Content;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalGeneralContent;
import com.ss.android.lark.calendar.impl.features.messagecard.p1553a.p1555b.C32183b;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.CalendarContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.CalendarGeneralContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.ShareCalendarEventContent;
import com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32678b;

/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.c.a */
public class C32689a implements AbstractC32678b {
    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32678b
    /* renamed from: a */
    public ShareCalendarEventContent mo120377a(Content content) {
        return new ShareCalendarEventContent(C32183b.m122667a(content));
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32678b
    /* renamed from: a */
    public CalendarContent mo120376a(C14928Entity entity, Content content) {
        return new CalendarContent(C32183b.m122666a(entity, content));
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32678b
    /* renamed from: b */
    public CalendarGeneralContent mo120378b(C14928Entity entity, Content content) {
        CalendarInternalGeneralContent b = C32183b.m122668b(entity, content);
        if (b == null) {
            return null;
        }
        return new CalendarGeneralContent(b);
    }
}
