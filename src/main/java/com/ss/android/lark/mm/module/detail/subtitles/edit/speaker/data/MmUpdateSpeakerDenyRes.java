package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data;

import java.io.Serializable;

public class MmUpdateSpeakerDenyRes implements Serializable {
    private int deny_type;
    private String editor_name;

    public int getDeny_type() {
        return this.deny_type;
    }

    public String getEditor_name() {
        return this.editor_name;
    }

    public void setDeny_type(int i) {
        this.deny_type = i;
    }

    public void setEditor_name(String str) {
        this.editor_name = str;
    }
}
