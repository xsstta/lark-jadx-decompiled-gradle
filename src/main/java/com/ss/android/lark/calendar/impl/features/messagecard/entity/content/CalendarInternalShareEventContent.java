package com.ss.android.lark.calendar.impl.features.messagecard.entity.content;

import com.ss.android.lark.calendar.impl.features.messagecard.InternalContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;

public class CalendarInternalShareEventContent implements InternalContent {
    private static final long serialVersionUID = 3278253192592128060L;
    private int mAttendeesCount;
    private CalendarEvent mCalendarEvent;
    private long mConflictTime;
    private CalendarInternalContent.ConflictType mConflictType = CalendarInternalContent.ConflictType.NONE;
    private String mCurrentUserCalendarId;
    private boolean mIsJoined;
    private boolean mIsSharable;
    private CalendarEventAttendee.Status mSelfAttendeeState = CalendarEventAttendee.Status.NEEDS_ACTION;

    public int getAttendeesCount() {
        return this.mAttendeesCount;
    }

    public CalendarEvent getCalendarEvent() {
        return this.mCalendarEvent;
    }

    public long getConflictTime() {
        return this.mConflictTime;
    }

    public CalendarInternalContent.ConflictType getConflictType() {
        return this.mConflictType;
    }

    public String getCurrentUserCalendarId() {
        return this.mCurrentUserCalendarId;
    }

    public CalendarEventAttendee.Status getSelfAttendeeState() {
        return this.mSelfAttendeeState;
    }

    public boolean isJoined() {
        return this.mIsJoined;
    }

    public boolean isSharable() {
        return this.mIsSharable;
    }

    public int hashCode() {
        int i;
        CalendarEvent calendarEvent = this.mCalendarEvent;
        if (calendarEvent != null) {
            i = calendarEvent.hashCode();
        } else {
            i = 0;
        }
        return (((((i * 31) + this.mAttendeesCount) * 31) + (this.mIsJoined ? 1 : 0)) * 31) + (this.mIsSharable ? 1 : 0);
    }

    public void setAttendeesCount(int i) {
        this.mAttendeesCount = i;
    }

    public void setCalendarEvent(CalendarEvent calendarEvent) {
        this.mCalendarEvent = calendarEvent;
    }

    public void setConflictTime(long j) {
        this.mConflictTime = j;
    }

    public void setConflictType(CalendarInternalContent.ConflictType conflictType) {
        this.mConflictType = conflictType;
    }

    public void setCurrentUserCalendarId(String str) {
        this.mCurrentUserCalendarId = str;
    }

    public void setJoined(boolean z) {
        this.mIsJoined = z;
    }

    public void setSelfAttendeeState(CalendarEventAttendee.Status status) {
        this.mSelfAttendeeState = status;
    }

    public void setSharable(boolean z) {
        this.mIsSharable = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CalendarInternalShareEventContent calendarInternalShareEventContent = (CalendarInternalShareEventContent) obj;
        if (this.mAttendeesCount == calendarInternalShareEventContent.mAttendeesCount && this.mIsJoined == calendarInternalShareEventContent.mIsJoined && this.mIsSharable == calendarInternalShareEventContent.mIsSharable) {
            CalendarEvent calendarEvent = this.mCalendarEvent;
            CalendarEvent calendarEvent2 = calendarInternalShareEventContent.mCalendarEvent;
            if (calendarEvent == calendarEvent2) {
                return true;
            }
            if (calendarEvent == null || !calendarEvent.equals(calendarEvent2)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
