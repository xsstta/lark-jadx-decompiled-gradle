package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;
import java.util.List;

public class OverallReminderData implements Serializable {
    private static final long serialVersionUID = 1;
    private long arriveTime;
    private String calendarId;
    private long endTime;
    private String eventId;
    private boolean isAllDay;
    private String key;
    private String location;
    private List<String> meetingRooms;
    private List<Boolean> meetingRoomsDisabled;
    private int minutes;
    private long originalTime;
    private long startTime;
    private String title;

    public long getArriveTime() {
        return this.arriveTime;
    }

    public String getCalendarId() {
        return this.calendarId;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public String getEventId() {
        return this.eventId;
    }

    public boolean getIsAllDay() {
        return this.isAllDay;
    }

    public String getKey() {
        return this.key;
    }

    public String getLocation() {
        return this.location;
    }

    public List<String> getMeetingRooms() {
        return this.meetingRooms;
    }

    public List<Boolean> getMeetingRoomsDisabled() {
        return this.meetingRoomsDisabled;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public long getOriginalTime() {
        return this.originalTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getTitle() {
        return this.title;
    }

    public void setArriveTime(long j) {
        this.arriveTime = j;
    }

    public void setCalendarId(String str) {
        this.calendarId = str;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setEventId(String str) {
        this.eventId = str;
    }

    public void setIsAllDay(boolean z) {
        this.isAllDay = z;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setMeetingRooms(List<String> list) {
        this.meetingRooms = list;
    }

    public void setMeetingRoomsDisabled(List<Boolean> list) {
        this.meetingRoomsDisabled = list;
    }

    public void setMinutes(int i) {
        this.minutes = i;
    }

    public void setOriginalTime(long j) {
        this.originalTime = j;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
