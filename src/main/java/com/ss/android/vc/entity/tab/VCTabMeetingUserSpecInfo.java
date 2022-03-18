package com.ss.android.vc.entity.tab;

import java.io.Serializable;
import java.util.List;

public class VCTabMeetingUserSpecInfo implements Serializable {
    private VCTabMeetingSourceAppLinkInfo appLinkInfo;
    private List<FollowAbbrInfo> followInfo;
    private List<HistoryInfo> historyInfos;
    private VCTabRecordInfo recordInfo;
    private VCTabStatisticsInfo statisticsInfo;
    private int version;

    public VCTabMeetingSourceAppLinkInfo getAppLinkInfo() {
        return this.appLinkInfo;
    }

    public List<FollowAbbrInfo> getFollowInfo() {
        return this.followInfo;
    }

    public List<HistoryInfo> getHistoryInfos() {
        return this.historyInfos;
    }

    public VCTabRecordInfo getRecordInfo() {
        return this.recordInfo;
    }

    public VCTabStatisticsInfo getStatisticsInfo() {
        return this.statisticsInfo;
    }

    public int getVersion() {
        return this.version;
    }

    public String toString() {
        return "VCTabMeetingUserSpecInfo{historyInfos=" + this.historyInfos + ", recordInfo=" + this.recordInfo + ", version=" + this.version + ", followInfo=" + this.followInfo + ", statisticsInfo=" + this.statisticsInfo + '}';
    }

    public void setAppLinkInfo(VCTabMeetingSourceAppLinkInfo vCTabMeetingSourceAppLinkInfo) {
        this.appLinkInfo = vCTabMeetingSourceAppLinkInfo;
    }

    public void setFollowInfo(List<FollowAbbrInfo> list) {
        this.followInfo = list;
    }

    public void setHistoryInfos(List<HistoryInfo> list) {
        this.historyInfos = list;
    }

    public void setRecordInfo(VCTabRecordInfo vCTabRecordInfo) {
        this.recordInfo = vCTabRecordInfo;
    }

    public void setStatisticsInfo(VCTabStatisticsInfo eVar) {
        this.statisticsInfo = eVar;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
