package com.ss.android.vc.entity.request;

import com.ss.android.vc.entity.ParticipantSettings;
import java.io.Serializable;

public class ParticipantSettingRequest implements Serializable {
    private static final long serialVersionUID = 1;
    private String meetingId;
    private ParticipantSettings participantSettings;

    public String getMeetingId() {
        return this.meetingId;
    }

    public ParticipantSettings getParticipantSettings() {
        return this.participantSettings;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{meetingId = ");
        sb.append(this.meetingId);
        sb.append(", participantSettings = ");
        ParticipantSettings participantSettings2 = this.participantSettings;
        if (participantSettings2 == null) {
            str = "null";
        } else {
            str = participantSettings2.toString();
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public void setMeetingId(String str) {
        this.meetingId = str;
    }

    public void setParticipantSettings(ParticipantSettings participantSettings2) {
        this.participantSettings = participantSettings2;
    }
}
