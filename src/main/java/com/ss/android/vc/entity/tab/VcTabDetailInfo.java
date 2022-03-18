package com.ss.android.vc.entity.tab;

import java.io.Serializable;

public class VcTabDetailInfo implements Serializable {
    VCTabMeetingBaseInfo meetingBaseInfo;
    String meetingId;
    VCTabMeetingUserSpecInfo meetingUserSpecInfo;

    public VcTabDetailInfo() {
    }

    public VCTabMeetingBaseInfo getMeetingBaseInfo() {
        return this.meetingBaseInfo;
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public VCTabMeetingUserSpecInfo getMeetingUserSpecInfo() {
        return this.meetingUserSpecInfo;
    }

    public String toString() {
        return "VcTabDetailInfo{meetingId='" + this.meetingId + '\'' + ", meetingBaseInfo=" + this.meetingBaseInfo.toString() + ", userSpecInfo=" + this.meetingUserSpecInfo.toString() + '}';
    }

    public void setMeetingBaseInfo(VCTabMeetingBaseInfo vCTabMeetingBaseInfo) {
        this.meetingBaseInfo = vCTabMeetingBaseInfo;
    }

    public void setMeetingId(String str) {
        this.meetingId = str;
    }

    public void setMeetingUserSpecInfo(VCTabMeetingUserSpecInfo vCTabMeetingUserSpecInfo) {
        this.meetingUserSpecInfo = vCTabMeetingUserSpecInfo;
    }

    public VcTabDetailInfo(String str, VCTabMeetingBaseInfo vCTabMeetingBaseInfo, VCTabMeetingUserSpecInfo vCTabMeetingUserSpecInfo) {
        this.meetingId = str;
        this.meetingBaseInfo = vCTabMeetingBaseInfo;
        this.meetingUserSpecInfo = vCTabMeetingUserSpecInfo;
    }
}
