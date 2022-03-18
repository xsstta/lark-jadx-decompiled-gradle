package com.ss.android.vc.meeting.module.sketch.dto;

public class ClearData {
    public RemoveData removeData;
    public StoreDrawableData storeDrawableData;

    public String toString() {
        return "Undo { removeData: " + this.removeData + ", storeDrawableData: " + this.storeDrawableData + " } ";
    }

    public ClearData(RemoveData removeData2, StoreDrawableData storeDrawableData2) {
        this.removeData = removeData2;
        this.storeDrawableData = storeDrawableData2;
    }
}
