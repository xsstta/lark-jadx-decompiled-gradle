package com.ss.android.vc.entity;

import java.io.Serializable;

public class PSTNInfo implements Serializable {
    public String displayName;
    public String mainAddress;
    public ParticipantType participantType;
    public String subAddress;

    public PSTNInfo() {
    }

    public String toString() {
        return "PSTNInfo{mainAddress='" + this.mainAddress + '\'' + ", subAddress='" + this.subAddress + '\'' + ", participantType=" + this.participantType + '}';
    }

    public PSTNInfo(String str, String str2, ParticipantType participantType2, String str3) {
        this.mainAddress = str;
        this.subAddress = str2;
        this.participantType = participantType2;
        this.displayName = str3;
    }
}
