package com.ss.android.vc.meeting.module.sketch.render.canvas.painters;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.sketch.SketchRange;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.MarkerDrawableData;
import com.ss.android.vc.meeting.module.sketch.render.IMarkRender;
import com.ss.android.vc.meeting.module.sketch.utils.CoordinateUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u0013J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J(\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0011H\u0002J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/MarkerPainter;", "Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/BasePainter;", "Lcom/ss/android/vc/meeting/module/sketch/render/IMarkRender;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/vc/meeting/module/sketch/dto/MarkerDrawableData;", "(Lcom/ss/android/vc/meeting/module/sketch/dto/MarkerDrawableData;)V", "backgroundPaint", "Landroid/graphics/Paint;", "getData", "()Lcom/ss/android/vc/meeting/module/sketch/dto/MarkerDrawableData;", "expireTime", "", "fontSize", "", "padding", "roundCorner", "textPaint", "Landroid/text/TextPaint;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "boundary", "Landroid/graphics/RectF;", "sketchRange", "Lcom/ss/android/vc/entity/sketch/SketchRange;", "expired", "expiresAfter", "timeMills", "getId", "", "getTextBackgroundSize", "x", "", "y", "text", "paint", "update", "position", "Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MarkerPainter extends BasePainter implements IMarkRender {
    private final Paint backgroundPaint;
    private final MarkerDrawableData data;
    private long expireTime = -1;
    private final int fontSize = C60773o.m236115a(12.0d);
    private final int padding = C60773o.m236115a(4.0d);
    private final int roundCorner = C60773o.m236115a(2.0d);
    private final TextPaint textPaint;

    public final MarkerDrawableData getData() {
        return this.data;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        String str = this.data.id;
        Intrinsics.checkExpressionValueIsNotNull(str, "data.id");
        return str;
    }

    public final boolean expired() {
        if (this.expireTime <= 0 || System.currentTimeMillis() <= this.expireTime) {
            return false;
        }
        return true;
    }

    public final MarkerPainter update(Coord coord) {
        Intrinsics.checkParameterIsNotNull(coord, "position");
        this.data.position = coord;
        return this;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.IMarkRender
    public IMarkRender expiresAfter(long j) {
        if (j <= 0) {
            return this;
        }
        this.expireTime = System.currentTimeMillis() + j;
        return this;
    }

    public MarkerPainter(MarkerDrawableData markerDrawableData) {
        Intrinsics.checkParameterIsNotNull(markerDrawableData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.data = markerDrawableData;
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        TextPaint textPaint2 = new TextPaint(1);
        this.textPaint = textPaint2;
        textPaint2.setColor(C60773o.m236126d(R.color.ud_N00));
        paint.setColor(C60773o.m236126d(R.color.ud_N900));
        paint.setAlpha(178);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.canvas.painters.BasePainter
    public boolean draw(Canvas canvas, RectF rectF, SketchRange aVar) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(rectF, "boundary");
        Intrinsics.checkParameterIsNotNull(aVar, "sketchRange");
        if (TextUtils.isEmpty(this.data.username) || this.data.position == null) {
            return false;
        }
        CoordinateUtil coordinateUtil = CoordinateUtil.INSTANCE;
        Coord coord = this.data.position;
        Intrinsics.checkExpressionValueIsNotNull(coord, "data.position");
        Coord pcDatum2point = coordinateUtil.pcDatum2point(coord, rectF, aVar);
        this.textPaint.setTextSize((float) this.fontSize);
        pcDatum2point.f159003x += (float) this.padding;
        pcDatum2point.f159004y += (this.textPaint.getFontMetrics().bottom - this.textPaint.getFontMetrics().top) / ((float) 2);
        float f = pcDatum2point.f159003x;
        float f2 = pcDatum2point.f159004y;
        String str = this.data.username;
        Intrinsics.checkExpressionValueIsNotNull(str, "data.username");
        RectF textBackgroundSize = getTextBackgroundSize(f, f2, str, this.textPaint);
        int i = this.roundCorner;
        canvas.drawRoundRect(textBackgroundSize, (float) i, (float) i, this.backgroundPaint);
        canvas.drawText(this.data.username, pcDatum2point.f159003x, pcDatum2point.f159004y, this.textPaint);
        return expired();
    }

    private final RectF getTextBackgroundSize(float f, float f2, String str, TextPaint textPaint2) {
        Paint.FontMetrics fontMetrics = textPaint2.getFontMetrics();
        float measureText = textPaint2.measureText(str);
        int i = this.padding;
        return new RectF(f - ((float) this.padding), (fontMetrics.top + f2) - ((float) (i / 2)), f + measureText + ((float) i), f2 + fontMetrics.bottom + ((float) (this.padding / 2)));
    }
}
