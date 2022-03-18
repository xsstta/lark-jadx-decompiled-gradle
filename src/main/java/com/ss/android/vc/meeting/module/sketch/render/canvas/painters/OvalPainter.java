package com.ss.android.vc.meeting.module.sketch.render.canvas.painters;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.entity.sketch.SketchRange;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.oval.OvalDrawableData;
import com.ss.android.vc.meeting.module.sketch.utils.CoordinateUtil;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/OvalPainter;", "Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/BasePainter;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/vc/meeting/module/sketch/dto/oval/OvalDrawableData;", "(Lcom/ss/android/vc/meeting/module/sketch/dto/oval/OvalDrawableData;)V", "getData", "()Lcom/ss/android/vc/meeting/module/sketch/dto/oval/OvalDrawableData;", "mPaint", "Landroid/graphics/Paint;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "boundary", "Landroid/graphics/RectF;", "sketchRange", "Lcom/ss/android/vc/entity/sketch/SketchRange;", "getId", "", "resetPaintStyle", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class OvalPainter extends BasePainter {
    private final OvalDrawableData data;
    private final Paint mPaint = new Paint(1);

    public final OvalDrawableData getData() {
        return this.data;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        String str = this.data.id;
        Intrinsics.checkExpressionValueIsNotNull(str, "data.id");
        return str;
    }

    public OvalPainter(OvalDrawableData ovalDrawableData) {
        Intrinsics.checkParameterIsNotNull(ovalDrawableData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.data = ovalDrawableData;
    }

    private final void resetPaintStyle(RectF rectF, SketchRange aVar) {
        Paint paint = this.mPaint;
        paint.setColor(SketchUtilKt.rgbaToArgb(this.data.style.color));
        paint.setStrokeWidth(this.data.style.size * CoordinateUtil.pointScaleInPcDatum(rectF, aVar));
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.canvas.painters.BasePainter
    public boolean draw(Canvas canvas, RectF rectF, SketchRange aVar) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(rectF, "boundary");
        Intrinsics.checkParameterIsNotNull(aVar, "sketchRange");
        resetPaintStyle(rectF, aVar);
        CoordinateUtil coordinateUtil = CoordinateUtil.INSTANCE;
        float[] fArr = this.data.origin;
        Intrinsics.checkExpressionValueIsNotNull(fArr, "data.origin");
        Coord pcDatum2point = coordinateUtil.pcDatum2point(SketchUtilKt.unflatCoord(fArr), rectF, aVar);
        float pointScaleInPcDatum = this.data.longAxis * CoordinateUtil.pointScaleInPcDatum(rectF, aVar);
        float pointScaleInPcDatum2 = this.data.shortAxis * CoordinateUtil.pointScaleInPcDatum(rectF, aVar);
        canvas.drawOval(pcDatum2point.f159003x - pointScaleInPcDatum, pcDatum2point.f159004y - pointScaleInPcDatum2, pcDatum2point.f159003x + pointScaleInPcDatum, pcDatum2point.f159004y + pointScaleInPcDatum2, this.mPaint);
        return false;
    }
}
