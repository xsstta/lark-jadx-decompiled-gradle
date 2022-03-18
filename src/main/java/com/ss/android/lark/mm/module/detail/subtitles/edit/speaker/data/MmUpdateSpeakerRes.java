package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data;

import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import java.io.Serializable;

public class MmUpdateSpeakerRes implements Serializable {
    private MmUpdateSpeakerDenyRes error;
    private MmParticipants.MmParticipantInfo user;

    public MmUpdateSpeakerDenyRes getError() {
        return this.error;
    }

    public MmParticipants.MmParticipantInfo getUser() {
        return this.user;
    }

    public void setError(MmUpdateSpeakerDenyRes mmUpdateSpeakerDenyRes) {
        this.error = mmUpdateSpeakerDenyRes;
    }

    public void setUser(MmParticipants.MmParticipantInfo mmParticipantInfo) {
        this.user = mmParticipantInfo;
    }
}
