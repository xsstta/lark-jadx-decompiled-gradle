package com.ss.android.vc.meeting.module.sketch.render.gl.util;

public class VertexUtils {
    public static String floatArr2Str(float[] fArr) {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < fArr.length; i++) {
            sb.append(fArr[i]);
            if (i != fArr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
