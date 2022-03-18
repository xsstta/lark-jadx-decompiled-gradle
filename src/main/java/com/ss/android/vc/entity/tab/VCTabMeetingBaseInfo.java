package com.ss.android.vc.entity.tab;

import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import java.io.Serializable;
import java.util.List;

public class VCTabMeetingBaseInfo implements Serializable {
    private int downVersion;
    private VCTabHistoryCommonInfo historyCommonInfo;
    private List<VCParticipantAbbrInfo> participants;
    private ByteviewUser sponsorUser;

    public int getDownVersion() {
        return this.downVersion;
    }

    public VCTabHistoryCommonInfo getHistoryCommonInfo() {
        return this.historyCommonInfo;
    }

    public List<VCParticipantAbbrInfo> getParticipants() {
        return this.participants;
    }

    public ByteviewUser getSponsorUser() {
        return this.sponsorUser;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("VCTabMeetingBaseInfo{historyCommonInfo=");
        sb.append(this.historyCommonInfo);
        sb.append(", sponsorUser=");
        sb.append(this.sponsorUser);
        sb.append(", participants size =");
        List<VCParticipantAbbrInfo> list = this.participants;
        if (list == null) {
            obj = "0";
        } else {
            obj = Integer.valueOf(list.size());
        }
        sb.append(obj);
        sb.append(", downVersion=");
        sb.append(this.downVersion);
        sb.append('}');
        return sb.toString();
    }

    public void setDownVersion(int i) {
        this.downVersion = i;
    }

    public void setHistoryCommonInfo(VCTabHistoryCommonInfo cVar) {
        this.historyCommonInfo = cVar;
    }

    public void setParticipants(List<VCParticipantAbbrInfo> list) {
        this.participants = list;
    }

    public void setSponsorUser(ByteviewUser byteviewUser) {
        this.sponsorUser = byteviewUser;
    }
}
