package com.ss.android.vc.entity;

import java.io.Serializable;

public class ParticipantRoleSettings implements Serializable {
    private boolean isMeetingOwner;
    private ParticipantMeetingRole meetingRole;

    public ParticipantMeetingRole getMeetingRole() {
        return this.meetingRole;
    }

    public boolean isMeetingOwner() {
        return this.isMeetingOwner;
    }

    public void setMeetingOwner(boolean z) {
        this.isMeetingOwner = z;
    }

    public void setMeetingRole(ParticipantMeetingRole participantMeetingRole) {
        this.meetingRole = participantMeetingRole;
    }
}
