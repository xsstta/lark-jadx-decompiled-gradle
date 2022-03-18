package com.ss.android.vc.meeting.module.sketch.render.canvas.painters;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.sketch.SketchRange;
import com.ss.android.vc.meeting.module.sketch.Sketch;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.comet.CometDrawableData;
import com.ss.android.vc.meeting.module.sketch.render.ICometRender;
import com.ss.android.vc.meeting.module.sketch.utils.CoordinateUtil;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J(\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\u0006\u0010\u001f\u001a\u00020\u001bJ\b\u0010 \u001a\u00020\u0014H\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006#"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/CometPainter;", "Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/BasePainter;", "Lcom/ss/android/vc/meeting/module/sketch/render/ICometRender;", "shapeId", "", "sketchInstanceId", "(Ljava/lang/String;Ljava/lang/String;)V", "mFinished", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mPaint", "Landroid/graphics/Paint;", "mPaused", "mPausedData", "Lcom/ss/android/vc/meeting/module/sketch/dto/comet/CometDrawableData;", "mRect", "Landroid/graphics/RectF;", "getShapeId", "()Ljava/lang/String;", "getSketchInstanceId", "draw", "", "canvas", "Landroid/graphics/Canvas;", "boundary", "sketchRange", "Lcom/ss/android/vc/entity/sketch/SketchRange;", "drawInternal", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "finish", "getId", "pause", "paused", "resume", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CometPainter extends BasePainter implements ICometRender {
    public static final Companion Companion = new Companion(null);
    private AtomicBoolean mFinished = new AtomicBoolean(false);
    private final Paint mPaint;
    private AtomicBoolean mPaused = new AtomicBoolean(false);
    private CometDrawableData mPausedData;
    private final RectF mRect = new RectF();
    private final String shapeId;
    private final String sketchInstanceId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/CometPainter$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        return this.shapeId;
    }

    public final String getShapeId() {
        return this.shapeId;
    }

    public final String getSketchInstanceId() {
        return this.sketchInstanceId;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.ICometRender
    public void finish() {
        this.mFinished.set(true);
    }

    public final void pause() {
        this.mPaused.set(true);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.ICometRender
    public boolean paused() {
        return this.mPaused.get();
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.ICometRender
    public void resume() {
        this.mPaused.set(false);
    }

    public CometPainter(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "shapeId");
        this.shapeId = str;
        this.sketchInstanceId = str2;
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.canvas.painters.BasePainter
    public synchronized boolean draw(Canvas canvas, RectF rectF, SketchRange aVar) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(rectF, "boundary");
        Intrinsics.checkParameterIsNotNull(aVar, "sketchRange");
        if (this.mFinished.get()) {
            return true;
        }
        if (this.mPaused.get()) {
            CometDrawableData cometDrawableData = this.mPausedData;
            if (cometDrawableData != null) {
                drawInternal(canvas, cometDrawableData, rectF, aVar);
            }
            return false;
        }
        CometDrawableData cometGetRemoteSnippet = Sketch.cometGetRemoteSnippet(this.sketchInstanceId);
        if (cometGetRemoteSnippet == null) {
            C60700b.m235861e("[Sketch] [CometPainter]", "[draw]", "[cometGetRemoteSnippet] get null");
            return false;
        } else if (cometGetRemoteSnippet.exit) {
            C60700b.m235843a("[Sketch] [CometPainter]", "[draw2]", "comet paused");
            finish();
            return true;
        } else {
            if (cometGetRemoteSnippet.pause) {
                pause();
                this.mPausedData = cometGetRemoteSnippet;
            }
            drawInternal(canvas, cometGetRemoteSnippet, rectF, aVar);
            return false;
        }
    }

    private final void drawInternal(Canvas canvas, CometDrawableData cometDrawableData, RectF rectF, SketchRange aVar) {
        boolean z;
        if (!(cometDrawableData.points == null || cometDrawableData.radii == null)) {
            float[] fArr = cometDrawableData.points;
            Intrinsics.checkExpressionValueIsNotNull(fArr, "data.points");
            boolean z2 = true;
            if (fArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                float[] fArr2 = cometDrawableData.radii;
                Intrinsics.checkExpressionValueIsNotNull(fArr2, "data.radii");
                if (fArr2.length != 0) {
                    z2 = false;
                }
                if (!z2) {
                    float pointScaleInPcDatum = CoordinateUtil.pointScaleInPcDatum(rectF, aVar);
                    CoordinateUtil coordinateUtil = CoordinateUtil.INSTANCE;
                    float[] fArr3 = cometDrawableData.points;
                    Intrinsics.checkExpressionValueIsNotNull(fArr3, "data.points");
                    Object[] array = SketchUtilKt.unflatCoords(fArr3).toArray(new Coord[0]);
                    if (array != null) {
                        Coord[] pcDatum2points = coordinateUtil.pcDatum2points((Coord[]) array, rectF, aVar);
                        this.mPaint.setColor(SketchUtilKt.rgbaToArgb(cometDrawableData.style.color));
                        int length = pcDatum2points.length;
                        for (int i = 0; i < length; i++) {
                            this.mPaint.setAlpha((int) (Math.pow(((double) cometDrawableData.radii[i]) / ((double) cometDrawableData.style.size), (double) 2) * ((double) 255)));
                            Coord coord = pcDatum2points[i];
                            float f = cometDrawableData.radii[i] * pointScaleInPcDatum;
                            this.mRect.left = coord.f159003x - f;
                            this.mRect.right = coord.f159003x + f;
                            this.mRect.top = coord.f159004y - f;
                            this.mRect.bottom = coord.f159004y + f;
                            canvas.drawOval(this.mRect, this.mPaint);
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }
        C60700b.m235861e("[Sketch] [CometPainter]", "[drawInternal]", " data error");
    }
}
