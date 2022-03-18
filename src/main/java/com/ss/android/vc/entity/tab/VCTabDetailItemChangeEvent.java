package com.ss.android.vc.entity.tab;

import java.io.Serializable;
import java.util.List;

public class VCTabDetailItemChangeEvent implements Serializable {
    private List<FollowAbbrInfo> followInfo;
    private HistoryInfo historyInfo;
    private String meetingId;
    private VCTabRecordInfo recordInfo;
    private List<HistoryInfo> replaceAllHistory;
    private int version;

    public List<FollowAbbrInfo> getFollowInfo() {
        return this.followInfo;
    }

    public HistoryInfo getHistoryInfo() {
        return this.historyInfo;
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public VCTabRecordInfo getRecordInfo() {
        return this.recordInfo;
    }

    public List<HistoryInfo> getReplaceAllHistory() {
        return this.replaceAllHistory;
    }

    public int getVersion() {
        return this.version;
    }

    public String toString() {
        return "VCTabDetailItemChangeEvent{meetingId='" + this.meetingId + '\'' + ", recordInfo=" + this.recordInfo + ", historyInfo=" + this.historyInfo + ", replaceAllHistory=" + this.replaceAllHistory + ", version=" + this.version + ", followInfo=" + this.followInfo + '}';
    }

    public void setFollowInfo(List<FollowAbbrInfo> list) {
        this.followInfo = list;
    }

    public void setHistoryInfo(HistoryInfo historyInfo2) {
        this.historyInfo = historyInfo2;
    }

    public void setMeetingId(String str) {
        this.meetingId = str;
    }

    public void setRecordInfo(VCTabRecordInfo vCTabRecordInfo) {
        this.recordInfo = vCTabRecordInfo;
    }

    public void setReplaceAllHistory(List<HistoryInfo> list) {
        this.replaceAllHistory = list;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
