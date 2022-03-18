package com.ss.android.vc.meeting.module.sketch.dto.comet;

import com.ss.android.vc.entity.sketch.SketchDataUnit;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.ExtInfo;
import com.ss.android.vc.meeting.module.sketch.dto.UndoRedoInfo;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;
import java.util.List;

public class CometDrawableData {
    public int duration;
    public boolean exit;
    public ExtInfo extInfo;
    public String id;
    public boolean pause;
    public float[] points;
    public float[] radii;
    public CometStyle style;

    public String toString() {
        String str = "[";
        for (int i = 0; i < this.points.length / 2; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("{x: ");
            int i2 = i * 2;
            sb.append(this.points[i2]);
            sb.append(", y: ");
            sb.append(this.points[i2 + 1]);
            sb.append(" }, ");
            str = sb.toString();
        }
        String str2 = str + "] ";
        String str3 = "[ ";
        for (float f : this.radii) {
            str3 = str3 + f + ", ";
        }
        return "CometDrawableData { id: " + this.id + ", style: " + this.style + ", duration: " + this.duration + ", extInfo: " + this.extInfo + ", pause = " + this.pause + ", exit = " + this.exit + ", points: " + str2 + ", raddii: " + (str3 + "] ") + "} ";
    }

    public static CometDrawableData parse(SketchDataUnit sketchDataUnit) {
        if (sketchDataUnit.f152754a != SketchDataUnit.ShapeType.COMET || sketchDataUnit.f152758e == null) {
            return null;
        }
        return new CometDrawableData(sketchDataUnit.f152755b, new CometStyle(sketchDataUnit.f152758e.f152771e, sketchDataUnit.f152758e.f152770d), sketchDataUnit.f152758e.f152767a, new float[0], sketchDataUnit.f152758e.f152768b, sketchDataUnit.f152758e.f152769c, new ExtInfo(sketchDataUnit.f152762i, sketchDataUnit.f152761h, new UndoRedoInfo(false, false), true));
    }

    public CometDrawableData(String str, CometStyle cometStyle, List<Coord> list, float[] fArr, int i, boolean z, ExtInfo extInfo2) {
        this.id = str;
        this.style = cometStyle;
        this.duration = i;
        this.extInfo = extInfo2;
        this.points = SketchUtilKt.flatCoords(list);
        this.radii = fArr;
        this.exit = z;
    }

    public CometDrawableData(String str, CometStyle cometStyle, float[] fArr, float[] fArr2, int i, boolean z, boolean z2, ExtInfo extInfo2) {
        this.id = str;
        this.style = cometStyle;
        this.duration = i;
        this.extInfo = extInfo2;
        this.points = fArr;
        this.radii = fArr2;
        this.pause = z;
        this.exit = z2;
    }
}
