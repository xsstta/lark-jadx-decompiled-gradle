package com.ss.android.vc.meeting.module.sketch.utils;

import android.graphics.RectF;
import android.view.MotionEvent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.entity.sketch.SketchRange;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0007J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018J/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u001bJ \u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0007J\u0018\u0010!\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J \u0010\"\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/utils/CoordinateUtil;", "", "()V", "TAG", "", "calcuCrossPoint", "Lkotlin/Pair;", "", "firstX", "firstY", "second", "Landroid/view/MotionEvent;", "contentBound", "Landroid/graphics/RectF;", "getContentScale", "originRectF", "isInContent", "", "x", "y", "pcDatum2point", "Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "pcDatums", "sketchRange", "Lcom/ss/android/vc/entity/sketch/SketchRange;", "pcDatum2points", "", "([Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;Landroid/graphics/RectF;Lcom/ss/android/vc/entity/sketch/SketchRange;)[Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "percent2PCDatum", "percentPoint", "width", "", "height", "pointScaleInPcDatum", "pointToPercent", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CoordinateUtil {
    public static final CoordinateUtil INSTANCE = new CoordinateUtil();

    private CoordinateUtil() {
    }

    @JvmStatic
    public static final float getContentScale(RectF rectF, RectF rectF2) {
        Intrinsics.checkParameterIsNotNull(rectF, "contentBound");
        Intrinsics.checkParameterIsNotNull(rectF2, "originRectF");
        return (rectF.right - rectF.left) / (rectF2.right - rectF2.left);
    }

    @JvmStatic
    public static final float pointScaleInPcDatum(RectF rectF, SketchRange aVar) {
        Intrinsics.checkParameterIsNotNull(rectF, "contentBound");
        Intrinsics.checkParameterIsNotNull(aVar, "sketchRange");
        return (rectF.right - rectF.left) / ((float) aVar.mo210163b());
    }

    @JvmStatic
    public static final Coord percent2PCDatum(Coord coord, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(coord, "percentPoint");
        return new Coord(((float) i) * coord.f159003x, ((float) i2) * coord.f159004y);
    }

    @JvmStatic
    public static final Coord pointToPercent(float f, float f2, RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "contentBound");
        return new Coord((f - rectF.left) / (rectF.right - rectF.left), (f2 - rectF.top) / (rectF.bottom - rectF.top));
    }

    @JvmStatic
    public static final boolean isInContent(float f, float f2, RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "contentBound");
        if (f > rectF.right || f < rectF.left || f2 > rectF.bottom || f2 < rectF.top) {
            return false;
        }
        return true;
    }

    public final Coord pcDatum2point(Coord coord, RectF rectF, SketchRange aVar) {
        Intrinsics.checkParameterIsNotNull(coord, "pcDatums");
        Intrinsics.checkParameterIsNotNull(rectF, "contentBound");
        Intrinsics.checkParameterIsNotNull(aVar, "sketchRange");
        return new Coord((coord.f159003x / ((float) aVar.mo210163b())) * (rectF.right - rectF.left), (coord.f159004y / ((float) aVar.mo210165c())) * (rectF.bottom - rectF.top));
    }

    public final Coord[] pcDatum2points(Coord[] coordArr, RectF rectF, SketchRange aVar) {
        Intrinsics.checkParameterIsNotNull(coordArr, "pcDatums");
        Intrinsics.checkParameterIsNotNull(rectF, "contentBound");
        Intrinsics.checkParameterIsNotNull(aVar, "sketchRange");
        int length = coordArr.length;
        Coord[] coordArr2 = new Coord[length];
        for (int i = 0; i < length; i++) {
            coordArr2[i] = new Coord(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        int length2 = coordArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            coordArr2[i2] = pcDatum2point(coordArr[i2], rectF, aVar);
        }
        return coordArr2;
    }

    @JvmStatic
    public static final Pair<Float, Float> calcuCrossPoint(float f, float f2, MotionEvent motionEvent, RectF rectF) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "second");
        Intrinsics.checkParameterIsNotNull(rectF, "contentBound");
        float min = Math.min(f, motionEvent.getX());
        float max = Math.max(f, motionEvent.getX());
        float min2 = Math.min(f2, motionEvent.getY());
        float max2 = Math.max(f2, motionEvent.getY());
        float f3 = rectF.left;
        if (f3 >= min && f3 <= max) {
            float f4 = rectF.left;
            float y = (((motionEvent.getY() - f2) / (motionEvent.getX() - f)) * (rectF.left - f)) + f2;
            float f5 = rectF.top;
            float f6 = rectF.bottom;
            if (y >= f5 && y <= f6) {
                return new Pair<>(Float.valueOf(f4), Float.valueOf(y));
            }
        }
        float f7 = rectF.right;
        if (f7 >= min && f7 <= max) {
            float f8 = rectF.right;
            float y2 = (((motionEvent.getY() - f2) / (motionEvent.getX() - f)) * (rectF.right - f)) + f2;
            float f9 = rectF.top;
            float f10 = rectF.bottom;
            if (y2 >= f9 && y2 <= f10) {
                return new Pair<>(Float.valueOf(f8), Float.valueOf(y2));
            }
        }
        float f11 = rectF.top;
        if (f11 >= min2 && f11 <= max2) {
            float f12 = rectF.top;
            float x = (((motionEvent.getX() - f) / (motionEvent.getY() - f2)) * (rectF.top - f2)) + f;
            float f13 = rectF.left;
            float f14 = rectF.right;
            if (x >= f13 && x <= f14) {
                return new Pair<>(Float.valueOf(x), Float.valueOf(f12));
            }
        }
        float f15 = rectF.bottom;
        if (f15 >= min2 && f15 <= max2) {
            float f16 = rectF.bottom;
            float x2 = (((motionEvent.getX() - f) / (motionEvent.getY() - f2)) * (rectF.bottom - f2)) + f;
            float f17 = rectF.left;
            float f18 = rectF.right;
            if (x2 >= f17 && x2 <= f18) {
                return new Pair<>(Float.valueOf(x2), Float.valueOf(f16));
            }
        }
        return new Pair<>(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
    }
}
