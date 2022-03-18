package com.ss.android.vc.meeting.module.sketch.dto.line;

import com.ss.android.vc.meeting.module.sketch.dto.ExtInfo;

public class LineDrawableData {
    public float[] end;
    public ExtInfo extInfo;
    public String id;
    public float[] origin;
    public LineStyle style;

    public String toString() {
        return "LineDrawableData: { id:" + this.id + ", origin: { x:" + this.origin[0] + ", y: " + this.origin[0] + "}, end: { x: " + this.end[0] + ", y: " + this.end[0] + "}, style: " + this.style + ", extInfo: " + this.extInfo;
    }

    public LineDrawableData(String str, float[] fArr, float[] fArr2, LineStyle lineStyle, ExtInfo extInfo2) {
        this.id = str;
        this.origin = fArr;
        this.end = fArr2;
        this.style = lineStyle;
        this.extInfo = extInfo2;
    }
}
