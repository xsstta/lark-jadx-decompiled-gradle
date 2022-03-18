package com.ss.android.vc.entity;

import java.io.Serializable;

public class InviteDialogBean implements Serializable {
    private String breakoutRoomId;
    private String chatId;
    private fromType from;
    private int inMeetingUserCount;
    private Boolean isHalfShow;
    private int maxMeetingUserCount;
    private String meetingId;
    private int vendorType;

    public enum fromType {
        singleUpgrade,
        normal,
        calendar
    }

    public String getBreakoutRoomId() {
        return this.breakoutRoomId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public fromType getFrom() {
        return this.from;
    }

    public Boolean getHalfShow() {
        return this.isHalfShow;
    }

    public int getInMeetingUserCount() {
        return this.inMeetingUserCount;
    }

    public int getMaxMeetingUserCount() {
        return this.maxMeetingUserCount;
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public int getVendorType() {
        return this.vendorType;
    }

    public String toString() {
        return "InviteDialogBean{meetingId='" + this.meetingId + '\'' + ", chatId='" + this.chatId + '\'' + ", maxMeetingUserCount=" + this.maxMeetingUserCount + ", inMeetingUserCount=" + this.inMeetingUserCount + ", from=" + this.from + ", vendorType=" + this.vendorType + ", isHalfShow=" + this.isHalfShow + ", breakoutRoomId='" + this.breakoutRoomId + '\'' + '}';
    }

    public void setBreakoutRoomId(String str) {
        this.breakoutRoomId = str;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setFrom(fromType fromtype) {
        this.from = fromtype;
    }

    public void setHalfShow(Boolean bool) {
        this.isHalfShow = bool;
    }

    public void setInMeetingUserCount(int i) {
        this.inMeetingUserCount = i;
    }

    public void setMaxMeetingUserCount(int i) {
        this.maxMeetingUserCount = i;
    }

    public void setMeetingId(String str) {
        this.meetingId = str;
    }

    public void setVendorType(int i) {
        this.vendorType = i;
    }

    public InviteDialogBean(String str, String str2, int i, int i2, fromType fromtype, int i3, Boolean bool) {
        this.meetingId = str;
        this.chatId = str2;
        this.maxMeetingUserCount = i;
        this.inMeetingUserCount = i2;
        this.from = fromtype;
        this.vendorType = i3;
        this.isHalfShow = bool;
    }
}
