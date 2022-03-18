package com.ss.android.vc.meeting.module.sketch.dto.oval;

import android.graphics.PointF;
import com.ss.android.vc.entity.sketch.SketchDataUnit;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.ExtInfo;
import com.ss.android.vc.meeting.module.sketch.dto.UndoRedoInfo;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;

public class OvalDrawableData {
    public ExtInfo extInfo;
    public String id;
    public float longAxis;
    public float[] origin;
    public float shortAxis;
    public OvalStyle style;

    public OvalDrawableData clone() {
        return new OvalDrawableData(this.id, SketchUtilKt.unflatCoord(this.origin), this.longAxis, this.shortAxis, this.style, this.extInfo);
    }

    public PointF getEndPoint() {
        float[] fArr = this.origin;
        return new PointF(fArr[0] + this.longAxis, fArr[1] + this.shortAxis);
    }

    public PointF getStartPoint() {
        float[] fArr = this.origin;
        return new PointF(fArr[0] - this.longAxis, fArr[1] - this.shortAxis);
    }

    public String toString() {
        return "OvalDrawableData { id: " + this.id + ", style: " + this.style + ", origin: " + this.origin + ", extInfo: " + this.extInfo + ", logAxis: " + this.longAxis + ", shortAxis: " + this.shortAxis + "} ";
    }

    public OvalDrawableData(SketchDataUnit sketchDataUnit) {
        if (sketchDataUnit.f152754a == SketchDataUnit.ShapeType.OVAL) {
            this.id = sketchDataUnit.f152755b;
            this.style = new OvalStyle(sketchDataUnit.f152759f.f152775d, sketchDataUnit.f152759f.f152776e);
            this.longAxis = sketchDataUnit.f152759f.f152773b;
            this.shortAxis = sketchDataUnit.f152759f.f152774c;
            this.origin = SketchUtilKt.flatCoord(sketchDataUnit.f152759f.f152772a);
            this.extInfo = new ExtInfo(sketchDataUnit.f152762i, sketchDataUnit.f152761h, new UndoRedoInfo(false, false), true);
        }
    }

    public OvalDrawableData(String str, Coord coord, float f, float f2, OvalStyle ovalStyle, ExtInfo extInfo2) {
        this(str, SketchUtilKt.flatCoord(coord), f, f2, ovalStyle, extInfo2);
    }

    public OvalDrawableData(String str, float[] fArr, float f, float f2, OvalStyle ovalStyle, ExtInfo extInfo2) {
        this.id = str;
        this.origin = fArr;
        this.longAxis = f;
        this.shortAxis = f2;
        this.style = ovalStyle;
        this.extInfo = extInfo2;
    }
}
