package com.ss.android.vc.meeting.module.sketch.dto.rect;

import com.ss.android.vc.entity.sketch.SketchDataUnit;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.ExtInfo;
import com.ss.android.vc.meeting.module.sketch.dto.UndoRedoInfo;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;

public class RectangleDrawableData {
    public ExtInfo extInfo;
    public String id;
    public float[] leftTop;
    public float[] rightBottom;
    public RectangleStyle style;

    public RectangleDrawableData clone() {
        return new RectangleDrawableData(this.id, SketchUtilKt.unflatCoord(this.leftTop), SketchUtilKt.unflatCoord(this.rightBottom), this.style, this.extInfo);
    }

    public String toString() {
        return "RectangleDrawableData { id: " + this.id + ", style: " + this.style + ", leftTop: " + this.leftTop + ", extInfo: " + this.extInfo + ", rightBottom: " + this.rightBottom + "} ";
    }

    public RectangleDrawableData(SketchDataUnit sketchDataUnit) {
        if (sketchDataUnit.f152754a == SketchDataUnit.ShapeType.RECTANGLE) {
            this.id = sketchDataUnit.f152755b;
            this.leftTop = SketchUtilKt.flatCoord(sketchDataUnit.f152757d.f152784a);
            this.rightBottom = SketchUtilKt.flatCoord(sketchDataUnit.f152757d.f152785b);
            this.style = new RectangleStyle(sketchDataUnit.f152757d.f152786c, sketchDataUnit.f152757d.f152787d);
            this.extInfo = new ExtInfo(sketchDataUnit.f152762i, sketchDataUnit.f152761h, new UndoRedoInfo(false, false), true);
        }
    }

    public RectangleDrawableData(String str, Coord coord, Coord coord2, RectangleStyle rectangleStyle, ExtInfo extInfo2) {
        this(str, SketchUtilKt.flatCoord(coord), SketchUtilKt.flatCoord(coord2), rectangleStyle, extInfo2);
    }

    public RectangleDrawableData(String str, float[] fArr, float[] fArr2, RectangleStyle rectangleStyle, ExtInfo extInfo2) {
        this.id = str;
        this.leftTop = fArr;
        this.rightBottom = fArr2;
        this.style = rectangleStyle;
        this.extInfo = extInfo2;
    }
}
