package com.ss.android.vc.entity;

import java.io.Serializable;

public class VideoChatCombinedInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private CalendarInfo calendarInfo;
    private VideoChatInMeetingInfo videoChatInMeetingInfo;

    public CalendarInfo getCalendarInfo() {
        return this.calendarInfo;
    }

    public VideoChatInMeetingInfo getVideoChatInMeetingInfo() {
        return this.videoChatInMeetingInfo;
    }

    public String toString() {
        VideoChatInMeetingInfo videoChatInMeetingInfo2 = this.videoChatInMeetingInfo;
        if (videoChatInMeetingInfo2 != null) {
            return videoChatInMeetingInfo2.toString();
        }
        return "{ videoChatInMeetingInfo = null }";
    }

    public void setCalendarInfo(CalendarInfo calendarInfo2) {
        this.calendarInfo = calendarInfo2;
    }

    public void setVideoChatInMeetingInfo(VideoChatInMeetingInfo videoChatInMeetingInfo2) {
        this.videoChatInMeetingInfo = videoChatInMeetingInfo2;
    }
}
