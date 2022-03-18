package com.ss.android.vc.meeting.module.sketch.dto;

public class UndoRedoData {
    public RemoveData removeData;
    public boolean shouldFetchHistory;
    public StoreDrawableData storeDrawableData;
    public UndoRedoInfo undoRedoInfo;
    public int undoRedoType;

    public String toString() {
        return "Undo { removeData: " + this.removeData + ", storeDrawableData: " + this.storeDrawableData + ", undoRedoType: " + this.undoRedoType + ", shouldFetchHistory: " + this.shouldFetchHistory + ", undoRedoInfo: " + this.undoRedoInfo + " } ";
    }

    public UndoRedoData(RemoveData removeData2, StoreDrawableData storeDrawableData2, int i, boolean z, UndoRedoInfo undoRedoInfo2) {
        this.removeData = removeData2;
        this.storeDrawableData = storeDrawableData2;
        this.undoRedoType = i;
        this.shouldFetchHistory = z;
        this.undoRedoInfo = undoRedoInfo2;
    }
}
