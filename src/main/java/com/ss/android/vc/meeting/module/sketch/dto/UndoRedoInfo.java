package com.ss.android.vc.meeting.module.sketch.dto;

public class UndoRedoInfo {
    public boolean redoStatus;
    public boolean undoStatus;

    public String toString() {
        return "Undo { redoStatus: " + this.redoStatus + ", undoStatus: " + this.undoStatus + " } ";
    }

    public UndoRedoInfo(boolean z, boolean z2) {
        this.undoStatus = z;
        this.redoStatus = z2;
    }
}
