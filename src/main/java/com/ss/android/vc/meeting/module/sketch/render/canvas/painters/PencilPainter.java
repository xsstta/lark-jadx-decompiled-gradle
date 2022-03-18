package com.ss.android.vc.meeting.module.sketch.render.canvas.painters;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.entity.sketch.SketchRange;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilType;
import com.ss.android.vc.meeting.module.sketch.utils.CoordinateUtil;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bJ\b\u0010\u0013\u001a\u0004\u0018\u00010\tJ \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010!\u001a\u00020\u0000J\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/PencilPainter;", "Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/BasePainter;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/vc/meeting/module/sketch/dto/pencil/PencilDrawableData;", "(Lcom/ss/android/vc/meeting/module/sketch/dto/pencil/PencilDrawableData;)V", "getData", "()Lcom/ss/android/vc/meeting/module/sketch/dto/pencil/PencilDrawableData;", "setData", "mBindedMarker", "Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/MarkerPainter;", "mMarkerExpireDelay", "", "mPaint", "Landroid/graphics/Paint;", "mPath", "Landroid/graphics/Path;", "bind", "marker", "timeMillsUpdateExpire", "binded", "draw", "", "canvas", "Landroid/graphics/Canvas;", "boundary", "Landroid/graphics/RectF;", "sketchRange", "Lcom/ss/android/vc/entity/sketch/SketchRange;", "getId", "", "makeNonRealBazierPath", "", "setPaintWidth", "unbind", "update", "newData", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class PencilPainter extends BasePainter {
    private PencilDrawableData data;
    private MarkerPainter mBindedMarker;
    private long mMarkerExpireDelay = -1;
    private final Paint mPaint;
    private final Path mPath = new Path();

    public final MarkerPainter binded() {
        return this.mBindedMarker;
    }

    public final PencilDrawableData getData() {
        return this.data;
    }

    public final PencilPainter unbind() {
        this.mBindedMarker = null;
        return this;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        String str = this.data.id;
        Intrinsics.checkExpressionValueIsNotNull(str, "data.id");
        return str;
    }

    public final void setData(PencilDrawableData pencilDrawableData) {
        Intrinsics.checkParameterIsNotNull(pencilDrawableData, "<set-?>");
        this.data = pencilDrawableData;
    }

    public final void update(PencilDrawableData pencilDrawableData) {
        Intrinsics.checkParameterIsNotNull(pencilDrawableData, "newData");
        PencilDrawableData pencilDrawableData2 = this.data;
        float[] fArr = pencilDrawableData2.points;
        float[] fArr2 = pencilDrawableData.points;
        Intrinsics.checkExpressionValueIsNotNull(fArr2, "newData.points");
        pencilDrawableData2.points = C69043h.m265723a(fArr, fArr2);
        MarkerPainter markerPainter = this.mBindedMarker;
        if (markerPainter != null) {
            float[] fArr3 = this.data.points;
            Intrinsics.checkExpressionValueIsNotNull(fArr3, "data.points");
            MarkerPainter update = markerPainter.update((Coord) CollectionsKt.last((List) SketchUtilKt.unflatCoords(fArr3)));
            if (update != null) {
                update.expiresAfter(this.mMarkerExpireDelay);
            }
        }
    }

    public PencilPainter(PencilDrawableData pencilDrawableData) {
        Intrinsics.checkParameterIsNotNull(pencilDrawableData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.data = pencilDrawableData;
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setAntiAlias(true);
        paint.setColor(SketchUtilKt.rgbaToArgb(this.data.style.color));
        paint.setStyle(Paint.Style.STROKE);
        if (this.data.style.pencilType == PencilType.MARKER.getNumber()) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
            paint.setStrokeCap(Paint.Cap.SQUARE);
        }
    }

    public final PencilPainter bind(MarkerPainter markerPainter, long j) {
        Intrinsics.checkParameterIsNotNull(markerPainter, "marker");
        this.mBindedMarker = markerPainter;
        this.mMarkerExpireDelay = j;
        return this;
    }

    private final void setPaintWidth(RectF rectF, SketchRange aVar) {
        this.mPaint.setStrokeWidth(SketchUtilKt.getDrawWidth(this.data.style.size, CoordinateUtil.pointScaleInPcDatum(rectF, aVar)));
    }

    private final void makeNonRealBazierPath(RectF rectF, SketchRange aVar) {
        boolean z;
        CoordinateUtil coordinateUtil = CoordinateUtil.INSTANCE;
        float[] fArr = this.data.points;
        Intrinsics.checkExpressionValueIsNotNull(fArr, "data.points");
        Object[] array = SketchUtilKt.unflatCoords(fArr).toArray(new Coord[0]);
        if (array != null) {
            Coord[] pcDatum2points = coordinateUtil.pcDatum2points((Coord[]) array, rectF, aVar);
            this.mPath.reset();
            if (pcDatum2points != null) {
                if (pcDatum2points.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.mPath.moveTo(pcDatum2points[0].f159003x, pcDatum2points[0].f159004y);
                    IntProgression step = RangesKt.step(RangesKt.until(1, pcDatum2points.length - 1), 3);
                    int a = step.mo239399a();
                    int b = step.mo239400b();
                    int c = step.mo239401c();
                    if (c >= 0) {
                        if (a > b) {
                            return;
                        }
                    } else if (a < b) {
                        return;
                    }
                    while (true) {
                        if (a < pcDatum2points.length - 2) {
                            Path path = this.mPath;
                            float f = pcDatum2points[a].f159003x;
                            float f2 = pcDatum2points[a].f159004y;
                            int i = a + 1;
                            float f3 = pcDatum2points[i].f159003x;
                            float f4 = pcDatum2points[i].f159004y;
                            int i2 = a + 2;
                            path.cubicTo(f, f2, f3, f4, pcDatum2points[i2].f159003x, pcDatum2points[i2].f159004y);
                        }
                        if (a != b) {
                            a += c;
                        } else {
                            return;
                        }
                    }
                }
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.canvas.painters.BasePainter
    public boolean draw(Canvas canvas, RectF rectF, SketchRange aVar) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(rectF, "boundary");
        Intrinsics.checkParameterIsNotNull(aVar, "sketchRange");
        setPaintWidth(rectF, aVar);
        makeNonRealBazierPath(rectF, aVar);
        canvas.drawPath(this.mPath, this.mPaint);
        return false;
    }
}
