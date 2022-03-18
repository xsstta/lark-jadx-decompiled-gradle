package com.ss.android.vc.meeting.module.sketch.utils;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C69321a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0014\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f\u001a\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e\u001a\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0007\u001a\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0007\u001a\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0013\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"MARK_REMOVE_DELAY", "", "argbToRgba", "color", "", "alpha", "flatCoord", "", "coord", "Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "flatCoords", "coords", "", "getDrawWidth", "", "pcWidth", "scale", "rgba2FloatArray", "", "arr", "rgbaToArgb", "unflatCoord", "unflatCoords", "lib_vc_entity_suiteRelease"}, mo238835k = 2, mv = {1, 1, 16})
public final class SketchUtilKt {
    public static final float getDrawWidth(float f, float f2) {
        return f * f2;
    }

    public static final int rgbaToArgb(long j) {
        return (int) (((j & 4294967040L) >> 8) | ((255 & j) << 24));
    }

    public static final float[] rgba2FloatArray(long j) {
        float[] fArr = new float[4];
        rgba2FloatArray(j, fArr);
        return fArr;
    }

    public static final float[] flatCoord(Coord coord) {
        Intrinsics.checkParameterIsNotNull(coord, "coord");
        return new float[]{coord.f159003x, coord.f159004y};
    }

    public static final Coord unflatCoord(float[] fArr) {
        Intrinsics.checkParameterIsNotNull(fArr, "arr");
        return new Coord(fArr[0], fArr[1]);
    }

    public static final float[] flatCoords(List<? extends Coord> list) {
        Intrinsics.checkParameterIsNotNull(list, "coords");
        float[] fArr = new float[(list.size() * 2)];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int i2 = i * 2;
            fArr[i2] = ((Coord) list.get(i)).f159003x;
            fArr[i2 + 1] = ((Coord) list.get(i)).f159004y;
        }
        return fArr;
    }

    public static final List<Coord> unflatCoords(float[] fArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(fArr, "arr");
        ArrayList arrayList = new ArrayList(fArr.length / 2);
        if (fArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return arrayList;
        }
        int length = fArr.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            arrayList.add(new Coord(fArr[i2], fArr[i2 + 1]));
        }
        return arrayList;
    }

    public static final void rgba2FloatArray(long j, float[] fArr) {
        Intrinsics.checkParameterIsNotNull(fArr, "arr");
        float f = (float) DynamicModule.f58006b;
        fArr[0] = ((float) ((4278190080L & j) >> 24)) / f;
        fArr[1] = ((float) ((16711680 & j) >> 16)) / f;
        fArr[2] = ((float) ((65280 & j) >> 8)) / f;
        fArr[3] = ((float) (j & 255)) / f;
    }

    public static final long argbToRgba(int i, int i2) {
        String str;
        String hexString = Integer.toHexString(i);
        try {
            Intrinsics.checkExpressionValueIsNotNull(hexString, "hexString");
            if (hexString != null) {
                str = hexString.substring(2);
                Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.String).substring(startIndex)");
                String str2 = str + Integer.toHexString(i2);
                Intrinsics.checkExpressionValueIsNotNull(str2, "hexString");
                return Long.parseLong(str2, C69321a.m266164a(16));
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            C60871a.m236612c("Sketch", "[argbToRgba] color = " + hexString);
            str = "f54a45";
        }
    }

    public static /* synthetic */ long argbToRgba$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 255;
        }
        return argbToRgba(i, i2);
    }
}
