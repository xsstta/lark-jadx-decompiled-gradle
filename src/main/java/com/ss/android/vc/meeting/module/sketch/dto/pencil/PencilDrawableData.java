package com.ss.android.vc.meeting.module.sketch.dto.pencil;

import com.ss.android.vc.entity.sketch.SketchDataUnit;
import com.ss.android.vc.meeting.module.sketch.dto.ExtInfo;
import com.ss.android.vc.meeting.module.sketch.dto.UndoRedoInfo;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;

public class PencilDrawableData implements Cloneable {
    public int dimension;
    public int duration;
    public ExtInfo extInfo;
    public boolean finish;
    public String id;
    public boolean pause;
    public float[] points;
    public PencilStyle style;

    @Override // java.lang.Object
    public PencilDrawableData clone() {
        return new PencilDrawableData(this.id, this.style, (float[]) this.points.clone(), this.duration, this.extInfo, this.finish, this.dimension, this.pause);
    }

    public SketchDataUnit.C60995d toPencil() {
        SketchDataUnit.C60995d dVar = new SketchDataUnit.C60995d();
        dVar.f152782f = this.style.color;
        dVar.f152777a = SketchUtilKt.unflatCoords(this.points);
        dVar.f152780d = this.dimension;
        dVar.f152779c = this.finish;
        dVar.f152781e = this.style.size;
        dVar.f152778b = this.duration;
        dVar.f152783g = PencilType.valueOf(this.style.pencilType);
        return dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        float[] fArr = this.points;
        if (fArr != null) {
            for (float f : fArr) {
                sb.append(f);
                sb.append(",");
            }
        }
        sb.append("]");
        return "(id = " + this.id + ", style = " + this.style + ", pointSize = " + this.points.length + ", points = " + ((Object) sb) + ", duration = " + this.duration + ", ExtInfo = " + this.extInfo + ", pause = " + this.pause + ", finish = " + this.finish + ", dimension = " + this.dimension + ")";
    }

    public PencilDrawableData(SketchDataUnit sketchDataUnit) {
        if (sketchDataUnit.f152754a == SketchDataUnit.ShapeType.PENCIL) {
            this.id = sketchDataUnit.f152755b;
            this.style = new PencilStyle(sketchDataUnit.f152756c.f152782f, sketchDataUnit.f152756c.f152781e, sketchDataUnit.f152756c.f152783g.getNumber());
            this.points = SketchUtilKt.flatCoords(sketchDataUnit.f152756c.f152777a);
            this.duration = sketchDataUnit.f152756c.f152778b;
            this.extInfo = new ExtInfo(sketchDataUnit.f152762i, sketchDataUnit.f152761h, new UndoRedoInfo(false, false), true);
            this.finish = sketchDataUnit.f152756c.f152779c;
            this.dimension = sketchDataUnit.f152756c.f152780d;
        }
    }

    public PencilDrawableData(String str, PencilStyle pencilStyle, float[] fArr, int i, ExtInfo extInfo2, boolean z, int i2, boolean z2) {
        this.id = str;
        this.style = pencilStyle;
        this.points = fArr;
        this.duration = i;
        this.extInfo = extInfo2;
        this.finish = z;
        this.dimension = i2;
        this.pause = z2;
    }
}
