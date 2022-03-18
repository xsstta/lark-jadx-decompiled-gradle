package com.ss.android.lark.forward.dto;

import java.io.Serializable;

public class CalendarForwardData implements Serializable {
    private String calendarId;
    private boolean crossTenant;
    private boolean hasMeetingMinute;
    private boolean isQuit = true;
    private boolean isShareCalendarEvent;
    private String key;
    private String localizedDisplayName;
    private boolean meeting;
    private long originalTime;
    private Object sourceData;

    public String getCalendarId() {
        return this.calendarId;
    }

    public String getKey() {
        return this.key;
    }

    public String getLocalizedDisplayName() {
        return this.localizedDisplayName;
    }

    public long getOriginalTime() {
        return this.originalTime;
    }

    public Object getSourceData() {
        return this.sourceData;
    }

    public boolean hasMeetingMinute() {
        return this.hasMeetingMinute;
    }

    public boolean isCrossTenant() {
        return this.crossTenant;
    }

    public boolean isMeeting() {
        return this.meeting;
    }

    public boolean isQuit() {
        return this.isQuit;
    }

    public boolean isShareCalendarEvent() {
        return this.isShareCalendarEvent;
    }

    public void setCalendarId(String str) {
        this.calendarId = str;
    }

    public void setCrossTenant(boolean z) {
        this.crossTenant = z;
    }

    public void setIsQuit(boolean z) {
        this.isQuit = z;
    }

    public void setIsShareCalendarEvent(boolean z) {
        this.isShareCalendarEvent = z;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLocalizedDisplayName(String str) {
        this.localizedDisplayName = str;
    }

    public void setMeeting(boolean z) {
        this.meeting = z;
    }

    public void setMeetingMinute(boolean z) {
        this.hasMeetingMinute = z;
    }

    public void setOriginalTime(long j) {
        this.originalTime = j;
    }

    public void setSourceData(Object obj) {
        this.sourceData = obj;
    }
}
