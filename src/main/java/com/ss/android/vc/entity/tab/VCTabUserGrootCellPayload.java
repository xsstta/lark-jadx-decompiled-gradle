package com.ss.android.vc.entity.tab;

import java.io.Serializable;
import java.util.List;

public class VCTabUserGrootCellPayload implements Serializable {
    private List<VCTabDetailItemChangeEvent> changeEvents;
    private VCTabUserChangeType changeType;
    private VCTabTotalMissedCallInfoEntity missedCallInfo;
    private VCTabStatisticsInfo statisticsInfo;

    public List<VCTabDetailItemChangeEvent> getChangeEvents() {
        return this.changeEvents;
    }

    public VCTabUserChangeType getChangeType() {
        return this.changeType;
    }

    public VCTabTotalMissedCallInfoEntity getMissedCallInfo() {
        return this.missedCallInfo;
    }

    public VCTabStatisticsInfo getStatisticsInfo() {
        return this.statisticsInfo;
    }

    public String toString() {
        return "VCTabUserGrootCellPayload{changeEvents=" + this.changeEvents + ", missedCallInfo=" + this.missedCallInfo + ", changeType=" + this.changeType + ", statisticsInfo=" + this.statisticsInfo + '}';
    }

    public void setChangeEvents(List<VCTabDetailItemChangeEvent> list) {
        this.changeEvents = list;
    }

    public void setChangeType(VCTabUserChangeType vCTabUserChangeType) {
        this.changeType = vCTabUserChangeType;
    }

    public void setMissedCallInfo(VCTabTotalMissedCallInfoEntity vCTabTotalMissedCallInfoEntity) {
        this.missedCallInfo = vCTabTotalMissedCallInfoEntity;
    }

    public void setStatisticsInfo(VCTabStatisticsInfo eVar) {
        this.statisticsInfo = eVar;
    }
}
