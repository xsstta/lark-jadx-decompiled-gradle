package com.ss.android.vc.meeting.module.sketch.dto.pencil;

public class CombinedAllPencilData {
    public PencilDrawableData transportData;

    public String toString() {
        return "CombinedALLPencilData { transportData: " + this.transportData + ", }";
    }

    public CombinedAllPencilData(PencilDrawableData pencilDrawableData) {
        this.transportData = pencilDrawableData;
    }
}
