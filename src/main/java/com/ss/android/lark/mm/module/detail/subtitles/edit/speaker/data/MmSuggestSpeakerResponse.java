package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data;

import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import java.io.Serializable;
import java.util.List;

public class MmSuggestSpeakerResponse implements Serializable {
    private boolean has_more;
    private List<MmParticipants.MmParticipantInfo> list;
    private int offset;
    private int size;
    private int total;

    public List<MmParticipants.MmParticipantInfo> getList() {
        return this.list;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getSize() {
        return this.size;
    }

    public int getTotal() {
        return this.total;
    }

    public boolean isHas_more() {
        return this.has_more;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setList(List<MmParticipants.MmParticipantInfo> list2) {
        this.list = list2;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
