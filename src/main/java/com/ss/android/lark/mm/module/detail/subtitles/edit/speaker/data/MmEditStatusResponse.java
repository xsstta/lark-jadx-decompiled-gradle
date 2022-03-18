package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class MmEditStatusResponse implements Serializable {
    @SerializedName("can_edit")
    private String canEdit;
    @SerializedName("deny_type")
    private String denyType;
    @SerializedName("editor_name")
    private String editorName;
    @SerializedName("last_edit_version")
    private int lastEditVersion;
    @SerializedName("object_version")
    private int objectVersion;

    public String getCanEdit() {
        return this.canEdit;
    }

    public String getDenyType() {
        return this.denyType;
    }

    public String getEditorName() {
        return this.editorName;
    }

    public int getLastEditVersion() {
        return this.lastEditVersion;
    }

    public int getObjectVersion() {
        return this.objectVersion;
    }

    public void setCanEdit(String str) {
        this.canEdit = str;
    }

    public void setDenyType(String str) {
        this.denyType = str;
    }

    public void setEditorName(String str) {
        this.editorName = str;
    }

    public void setLastEditVersion(int i) {
        this.lastEditVersion = i;
    }

    public void setObjectVersion(int i) {
        this.objectVersion = i;
    }

    public enum EditDenyType {
        SUCCEED("0"),
        USED_BY_OTHERS("1"),
        LOWER_VERSION("2");
        
        public String value;

        private EditDenyType(String str) {
            this.value = str;
        }
    }
}
