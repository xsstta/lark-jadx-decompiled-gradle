package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.general;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarCardContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalGeneralContent;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.CalendarGeneralContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.vo.CalendarGeneralContentVO;
import com.ss.android.lark.chat.export.entity.message.MessageType;
import com.ss.android.lark.chat.export.entity.message.OpenMessageInfo;
import com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/general/CalendarGeneralMsgConverter;", "Lcom/ss/android/lark/chat/export/vo/IOpenMsgVOConverter;", "Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/vo/CalendarGeneralContentVO;", "()V", "convert", "messageInfo", "Lcom/ss/android/lark/chat/export/entity/message/OpenMessageInfo;", "getReplyDisplayText", "", "supportType", "Lcom/ss/android/lark/chat/export/entity/message/MessageType;", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.b.c */
public final class CalendarGeneralMsgConverter implements IOpenMsgVOConverter<CalendarGeneralContentVO> {
    @Override // com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter
    /* renamed from: a */
    public MessageType mo120418a() {
        return MessageType.GENERAL_CALENDAR;
    }

    /* renamed from: a */
    public CalendarGeneralContentVO mo120419b(OpenMessageInfo cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "messageInfo");
        CalendarGeneralContent calendarGeneralContent = (CalendarGeneralContent) cVar.getMessage().getContent();
        CalendarInternalGeneralContent calendarInternalGeneralContent = calendarGeneralContent.getCalendarInternalGeneralContent();
        if (calendarInternalGeneralContent.getMessageType() == CalendarInternalGeneralContent.CalendarMessageType.TRANSFER_CALENDAR_EVENT || calendarInternalGeneralContent.getMessageType() == CalendarInternalGeneralContent.CalendarMessageType.SWITCH_CALENDAR || calendarInternalGeneralContent.getMessageType() == CalendarInternalGeneralContent.CalendarMessageType.RSVP_COMMENT) {
            return new CalendarGeneralContentVO(calendarGeneralContent);
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter
    /* renamed from: c */
    public CharSequence mo120420c(OpenMessageInfo cVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(cVar, "messageInfo");
        CalendarInternalGeneralContent calendarInternalGeneralContent = ((CalendarGeneralContent) cVar.getMessage().getContent()).getCalendarInternalGeneralContent();
        if (calendarInternalGeneralContent.getMessageType() != CalendarInternalGeneralContent.CalendarMessageType.RSVP_COMMENT) {
            return "";
        }
        CalendarCardContent calendarCardContent = calendarInternalGeneralContent.getCalendarCardContent();
        Intrinsics.checkExpressionValueIsNotNull(calendarCardContent, "internalContent.calendarCardContent");
        if (TextUtils.isEmpty(calendarCardContent.getSummary())) {
            str = C32634ae.m125182b(R.string.Calendar_Push_EventNoName);
        } else {
            CalendarCardContent calendarCardContent2 = calendarInternalGeneralContent.getCalendarCardContent();
            Intrinsics.checkExpressionValueIsNotNull(calendarCardContent2, "internalContent.calendarCardContent");
            str = UIHelper.mustacheFormat((int) R.string.Calendar_Push_EventName, "title", calendarCardContent2.getSummary());
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "if (TextUtils.isEmpty(in…nt.summary)\n            }");
        return str;
    }
}
