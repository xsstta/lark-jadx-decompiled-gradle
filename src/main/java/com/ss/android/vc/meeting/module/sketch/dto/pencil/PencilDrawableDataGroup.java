package com.ss.android.vc.meeting.module.sketch.dto.pencil;

public class PencilDrawableDataGroup {
    public PencilDrawableData[] datas;
    public boolean isEnd;

    public PencilDrawableDataGroup(PencilDrawableData[] pencilDrawableDataArr, boolean z) {
        this.datas = pencilDrawableDataArr;
        this.isEnd = z;
    }
}
