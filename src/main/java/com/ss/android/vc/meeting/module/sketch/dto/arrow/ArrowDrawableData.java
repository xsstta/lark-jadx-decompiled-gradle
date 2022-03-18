package com.ss.android.vc.meeting.module.sketch.dto.arrow;

import com.ss.android.vc.entity.sketch.SketchDataUnit;
import com.ss.android.vc.meeting.module.sketch.dto.ExtInfo;
import com.ss.android.vc.meeting.module.sketch.dto.UndoRedoInfo;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;

public class ArrowDrawableData implements Cloneable {
    public float[] end;
    public ExtInfo extInfo;
    public String id;
    public float[] origin;
    public ArrowStyle style;

    @Override // java.lang.Object
    public ArrowDrawableData clone() {
        return new ArrowDrawableData(this.id, (float[]) this.origin.clone(), (float[]) this.end.clone(), this.style, this.extInfo);
    }

    public SketchDataUnit.C60992a toArrow() {
        SketchDataUnit.C60992a aVar = new SketchDataUnit.C60992a();
        aVar.f152763a = SketchUtilKt.unflatCoord(this.origin);
        aVar.f152764b = SketchUtilKt.unflatCoord(this.end);
        aVar.f152765c = this.style.color;
        aVar.f152766d = this.style.size;
        return aVar;
    }

    public String toString() {
        return "ArrowDrawableData: { id:" + this.id + ", origin: { x:" + this.origin[0] + ", y: " + this.origin[1] + "}, end: { x: " + this.end[0] + ", y: " + this.end[1] + "}, style: " + this.style + ", extInfo: " + this.extInfo;
    }

    public ArrowDrawableData(SketchDataUnit sketchDataUnit) {
        if (sketchDataUnit.f152754a == SketchDataUnit.ShapeType.ARROW) {
            this.id = sketchDataUnit.f152755b;
            this.origin = SketchUtilKt.flatCoord(sketchDataUnit.f152760g.f152763a);
            this.end = SketchUtilKt.flatCoord(sketchDataUnit.f152760g.f152764b);
            this.style = new ArrowStyle(sketchDataUnit.f152760g.f152765c, sketchDataUnit.f152760g.f152766d);
            this.extInfo = new ExtInfo(sketchDataUnit.f152762i, sketchDataUnit.f152761h, new UndoRedoInfo(false, false), true);
        }
    }

    public ArrowDrawableData(String str, float[] fArr, float[] fArr2, ArrowStyle arrowStyle, ExtInfo extInfo2) {
        this.id = str;
        this.origin = fArr;
        this.end = fArr2;
        this.style = arrowStyle;
        this.extInfo = extInfo2;
    }
}
