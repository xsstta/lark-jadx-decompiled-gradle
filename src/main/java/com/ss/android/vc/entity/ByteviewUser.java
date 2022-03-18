package com.ss.android.vc.entity;

import java.io.Serializable;

public final class ByteviewUser implements Serializable {
    private String mDeviceId;
    private ParticipantType mParticipantType;
    private String mUserId;

    public ByteviewUser() {
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public ParticipantType getParticipantType() {
        return this.mParticipantType;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("userId " + this.mUserId);
        sb.append(" ");
        sb.append("deviceId " + this.mDeviceId);
        sb.append(" ");
        sb.append("type " + this.mParticipantType);
        sb.append(" ");
        return sb.toString();
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setParticipantType(ParticipantType participantType) {
        this.mParticipantType = participantType;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    public static ByteviewUser from(Participant participant) {
        return new ByteviewUser(participant);
    }

    public ByteviewUser(Participant participant) {
        this.mUserId = participant.getId();
        this.mDeviceId = participant.getDeviceId();
        this.mParticipantType = participant.getParticipantType();
    }

    public ByteviewUser(String str, String str2, ParticipantType participantType) {
        this.mUserId = str;
        this.mDeviceId = str2;
        this.mParticipantType = participantType;
    }
}
