package com.ss.android.lark.calendar.impl.features.messagecard.entity.content;

import com.ss.android.lark.calendar.impl.features.messagecard.InternalContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarCardContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.RSVPCommentCardInfo;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import java.util.Map;

public class CalendarInternalGeneralContent implements InternalContent {
    private CalendarCardContent mCalendarCardContent;
    private Map<String, AbstractC30026d> mMessageChatters;
    private CalendarMessageType mMessageType = CalendarMessageType.UNKNOWN;
    private RSVPCommentCardInfo mRSVPCommentCardInfo;

    public enum CalendarMessageType {
        UNKNOWN(0),
        TRANSFER_CALENDAR_EVENT(1),
        RSVP_COMMENT(2),
        SWITCH_CALENDAR(3);
        
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public static CalendarMessageType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TRANSFER_CALENDAR_EVENT;
            }
            if (i == 2) {
                return RSVP_COMMENT;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return SWITCH_CALENDAR;
        }

        private CalendarMessageType(int i) {
            this.value = i;
        }
    }

    public CalendarCardContent getCalendarCardContent() {
        return this.mCalendarCardContent;
    }

    public CalendarMessageType getMessageType() {
        return this.mMessageType;
    }

    public RSVPCommentCardInfo getRSVPCommentCardInfo() {
        return this.mRSVPCommentCardInfo;
    }

    public Map<String, AbstractC30026d> getmMessageChatters() {
        return this.mMessageChatters;
    }

    public void setCalendarCardContent(CalendarCardContent calendarCardContent) {
        this.mCalendarCardContent = calendarCardContent;
    }

    public void setMessageChatters(Map<String, AbstractC30026d> map) {
        this.mMessageChatters = map;
    }

    public void setMessageType(CalendarMessageType calendarMessageType) {
        this.mMessageType = calendarMessageType;
    }

    public void setRSVPCommentCardInfo(RSVPCommentCardInfo rSVPCommentCardInfo) {
        this.mRSVPCommentCardInfo = rSVPCommentCardInfo;
    }
}
