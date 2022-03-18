package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data;

import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import java.io.Serializable;
import java.util.List;

public class MmParticipantsSearchRes implements Serializable {
    private List<MmParticipants.MmParticipantInfo> list;

    public List<MmParticipants.MmParticipantInfo> getList() {
        return this.list;
    }

    public void setList(List<MmParticipants.MmParticipantInfo> list2) {
        this.list = list2;
    }
}
