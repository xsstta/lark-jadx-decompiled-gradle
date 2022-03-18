package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class MmKeepEditResponse implements Serializable {
    @SerializedName("exit_edit")
    private int exitEdit;

    public int getExitEdit() {
        return this.exitEdit;
    }

    public void setExitEdit(int i) {
        this.exitEdit = i;
    }

    public enum EditStatus {
        KEEP(0),
        OCCUPIED(1),
        HEARTBEAT_EXPIRED(2),
        UNKNOWN(-1);
        
        public int status;

        public static EditStatus fromValue(int i) {
            if (i == 0) {
                return KEEP;
            }
            if (i == 1) {
                return OCCUPIED;
            }
            if (i == 2) {
                return HEARTBEAT_EXPIRED;
            }
            return UNKNOWN;
        }

        private EditStatus(int i) {
            this.status = i;
        }
    }
}
