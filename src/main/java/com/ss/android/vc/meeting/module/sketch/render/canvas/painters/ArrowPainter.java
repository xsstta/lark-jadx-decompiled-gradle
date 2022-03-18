package com.ss.android.vc.meeting.module.sketch.render.canvas.painters;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.entity.sketch.SketchRange;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.arrow.ArrowDrawableData;
import com.ss.android.vc.meeting.module.sketch.utils.CoordinateUtil;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ \u0010 \u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010!\u001a\u00020\"H\u0016J1\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0$2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0002\u0010'J1\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0$2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006¢\u0006\u0002\u0010'J1\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0$2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0002\u0010'J\u0010\u0010-\u001a\u00020\u00182\b\u0010.\u001a\u0004\u0018\u00010\u001aR\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/ArrowPainter;", "Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/BasePainter;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/vc/meeting/module/sketch/dto/arrow/ArrowDrawableData;", "(Lcom/ss/android/vc/meeting/module/sketch/dto/arrow/ArrowDrawableData;)V", "arrowEndWidth", "", "arrowHeight", "arrowStartArcHeight", "arrowStartWidth", "arrowWidth", "getData", "()Lcom/ss/android/vc/meeting/module/sketch/dto/arrow/ArrowDrawableData;", "paint", "Landroid/graphics/Paint;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "boundary", "Landroid/graphics/RectF;", "sketchRange", "Lcom/ss/android/vc/entity/sketch/SketchRange;", "drawArrowShape", "", "startDot", "Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "endDot", "scale", "", "getDistance", "startdot", "getDotOnLine", "getId", "", "getSymmetryLineDotsByDistance", "", "distance", "angle", "(Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;DD)[Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "getSymmetryLineDotsByHeight", "height", "arrowAngle", "getSymmetryLineDotsByWidthAndHeight", "width", "updateEnd", "coord", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ArrowPainter extends BasePainter {
    private final double arrowEndWidth = 9.0d;
    private final double arrowHeight = 21.0d;
    private final double arrowStartArcHeight = 1.0d;
    private final double arrowStartWidth = 3.0d;
    private final double arrowWidth = 21.0d;
    private final ArrowDrawableData data;
    private Paint paint;

    public final ArrowDrawableData getData() {
        return this.data;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        String str = this.data.id;
        Intrinsics.checkExpressionValueIsNotNull(str, "data.id");
        return str;
    }

    public final void updateEnd(Coord coord) {
        if (coord == null) {
            this.data.end = null;
            return;
        }
        this.data.end = SketchUtilKt.flatCoord(coord);
    }

    public ArrowPainter(ArrowDrawableData arrowDrawableData) {
        Intrinsics.checkParameterIsNotNull(arrowDrawableData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.data = arrowDrawableData;
        Paint paint2 = new Paint();
        this.paint = paint2;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.FILL);
        }
        Paint paint3 = this.paint;
        if (paint3 != null) {
            paint3.setColor(SketchUtilKt.rgbaToArgb(arrowDrawableData.style.color));
        }
        Paint paint4 = this.paint;
        if (paint4 != null) {
            paint4.setAntiAlias(true);
        }
        Paint paint5 = this.paint;
        if (paint5 != null) {
            paint5.setStrokeJoin(Paint.Join.ROUND);
        }
        Paint paint6 = this.paint;
        if (paint6 != null) {
            paint6.setStrokeCap(Paint.Cap.ROUND);
        }
    }

    public final double getDistance(Coord coord, Coord coord2) {
        Intrinsics.checkParameterIsNotNull(coord, "startdot");
        Intrinsics.checkParameterIsNotNull(coord2, "endDot");
        return Math.sqrt((double) (((coord.f159003x - coord2.f159003x) * (coord.f159003x - coord2.f159003x)) + ((coord.f159004y - coord2.f159004y) * (coord.f159004y - coord2.f159004y))));
    }

    private final Coord getDotOnLine(Coord coord, Coord coord2, double d) {
        double distance = getDistance(coord, coord2);
        double d2 = ((double) (coord2.f159004y - coord.f159004y)) / distance;
        return new Coord((float) (((double) coord.f159003x) + (d * (((double) (coord2.f159003x - coord.f159003x)) / distance))), (float) (((double) coord.f159004y) + (d2 * d)));
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.canvas.painters.BasePainter
    public boolean draw(Canvas canvas, RectF rectF, SketchRange aVar) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(rectF, "boundary");
        Intrinsics.checkParameterIsNotNull(aVar, "sketchRange");
        float[] fArr = this.data.origin;
        Intrinsics.checkExpressionValueIsNotNull(fArr, "data.origin");
        float[] fArr2 = this.data.end;
        Intrinsics.checkExpressionValueIsNotNull(fArr2, "data.end");
        Coord[] pcDatum2points = CoordinateUtil.INSTANCE.pcDatum2points(new Coord[]{SketchUtilKt.unflatCoord(fArr), SketchUtilKt.unflatCoord(fArr2)}, rectF, aVar);
        drawArrowShape(canvas, pcDatum2points[0], pcDatum2points[1], CoordinateUtil.pointScaleInPcDatum(rectF, aVar));
        return false;
    }

    public final Coord[] getSymmetryLineDotsByHeight(Coord coord, Coord coord2, double d, double d2) {
        Intrinsics.checkParameterIsNotNull(coord, "startDot");
        Intrinsics.checkParameterIsNotNull(coord2, "endDot");
        return getSymmetryLineDotsByDistance(coord, coord2, d / Math.cos(d2), d2);
    }

    public final Coord[] getSymmetryLineDotsByWidthAndHeight(Coord coord, Coord coord2, double d, double d2) {
        Intrinsics.checkParameterIsNotNull(coord, "startDot");
        Intrinsics.checkParameterIsNotNull(coord2, "endDot");
        return getSymmetryLineDotsByDistance(coord, coord2, Math.sqrt((d * d) + ((d2 * d2) / ((double) 4))), Math.atan((d2 / ((double) 2)) / d));
    }

    public final void drawArrowShape(Canvas canvas, Coord coord, Coord coord2, float f) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(coord, "startDot");
        Intrinsics.checkParameterIsNotNull(coord2, "endDot");
        double distance = getDistance(coord, coord2);
        double d = this.arrowHeight;
        if (distance < d) {
            coord2 = getDotOnLine(coord, coord2, d);
        }
        double d2 = (double) f;
        Coord[] symmetryLineDotsByWidthAndHeight = getSymmetryLineDotsByWidthAndHeight(coord2, coord, this.arrowStartArcHeight * d2, this.arrowStartWidth * d2);
        Coord[] symmetryLineDotsByWidthAndHeight2 = getSymmetryLineDotsByWidthAndHeight(coord, coord2, this.arrowHeight * d2, this.arrowEndWidth * d2);
        Coord[] symmetryLineDotsByWidthAndHeight3 = getSymmetryLineDotsByWidthAndHeight(coord, coord2, this.arrowHeight * d2, this.arrowWidth * d2);
        Path path = new Path();
        path.moveTo(symmetryLineDotsByWidthAndHeight[0].f159003x, symmetryLineDotsByWidthAndHeight[0].f159004y);
        path.quadTo(coord.f159003x, coord.f159004y, symmetryLineDotsByWidthAndHeight[1].f159003x, symmetryLineDotsByWidthAndHeight[1].f159004y);
        path.close();
        canvas.drawPath(path, this.paint);
        path.reset();
        path.moveTo(symmetryLineDotsByWidthAndHeight[0].f159003x, symmetryLineDotsByWidthAndHeight[0].f159004y);
        path.lineTo(symmetryLineDotsByWidthAndHeight2[1].f159003x, symmetryLineDotsByWidthAndHeight2[1].f159004y);
        path.lineTo(symmetryLineDotsByWidthAndHeight3[1].f159003x, symmetryLineDotsByWidthAndHeight3[1].f159004y);
        path.lineTo(coord2.f159003x, coord2.f159004y);
        path.lineTo(symmetryLineDotsByWidthAndHeight3[0].f159003x, symmetryLineDotsByWidthAndHeight3[0].f159004y);
        path.lineTo(symmetryLineDotsByWidthAndHeight2[0].f159003x, symmetryLineDotsByWidthAndHeight2[0].f159004y);
        path.lineTo(symmetryLineDotsByWidthAndHeight[1].f159003x, symmetryLineDotsByWidthAndHeight[1].f159004y);
        path.close();
        canvas.drawPath(path, this.paint);
    }

    public final Coord[] getSymmetryLineDotsByDistance(Coord coord, Coord coord2, double d, double d2) {
        Intrinsics.checkParameterIsNotNull(coord, "startDot");
        Intrinsics.checkParameterIsNotNull(coord2, "endDot");
        double distance = getDistance(coord, coord2);
        double d3 = ((double) (coord.f159004y - coord2.f159004y)) / distance;
        double d4 = ((double) (coord.f159003x - coord2.f159003x)) / distance;
        double cos = (Math.cos(d2) * d3) - (Math.sin(d2) * d4);
        return new Coord[]{new Coord((float) (((double) coord2.f159003x) + (((Math.cos(d2) * d4) + (Math.sin(d2) * d3)) * d)), (float) (((double) coord2.f159004y) + (cos * d))), new Coord((float) (((double) coord2.f159003x) + (d * ((d4 * Math.cos(d2)) - (d3 * Math.sin(d2))))), (float) (((double) coord2.f159004y) + (d * ((Math.cos(d2) * d3) + (Math.sin(d2) * d4)))))};
    }
}
