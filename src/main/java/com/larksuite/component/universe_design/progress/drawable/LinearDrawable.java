package com.larksuite.component.universe_design.progress.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.progress.UDProgressSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J@\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J0\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\"\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/larksuite/component/universe_design/progress/drawable/LinearDrawable;", "Lcom/larksuite/component/universe_design/progress/drawable/ProgressDrawable;", "spec", "Lcom/larksuite/component/universe_design/progress/UDProgressSpec;", "(Lcom/larksuite/component/universe_design/progress/UDProgressSpec;)V", "displayedCornerRadius", "", "displayedTrackThickness", "trackLength", "adjustCanvas", "", "canvas", "Landroid/graphics/Canvas;", "trackThicknessFraction", "drawRoundedEnd", "paint", "Landroid/graphics/Paint;", "trackSize", "cornerRadius", "x", "isStartPosition", "", "cornerPatternRectBound", "Landroid/graphics/RectF;", "fillIndicator", "startFraction", "endFraction", "color", "", "fillTrack", "getPreferredHeight", "getPreferredWidth", "universe-ui-progress_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.progress.a.b */
public final class LinearDrawable extends ProgressDrawable {

    /* renamed from: a */
    private float f63522a = 300.0f;

    /* renamed from: b */
    private float f63523b;

    /* renamed from: c */
    private float f63524c;

    @Override // com.larksuite.component.universe_design.progress.drawable.ProgressDrawable
    /* renamed from: a */
    public int mo91109a() {
        return -1;
    }

    @Override // com.larksuite.component.universe_design.progress.drawable.ProgressDrawable
    /* renamed from: b */
    public int mo91113b() {
        return mo91115c().mo91095b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinearDrawable(UDProgressSpec aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "spec");
    }

    @Override // com.larksuite.component.universe_design.progress.drawable.ProgressDrawable
    /* renamed from: a */
    public void mo91110a(Canvas canvas, float f) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Rect clipBounds = canvas.getClipBounds();
        Intrinsics.checkExpressionValueIsNotNull(clipBounds, "canvas.clipBounds");
        this.f63522a = (float) clipBounds.width();
        float b = (float) mo91115c().mo91095b();
        canvas.translate(((float) clipBounds.width()) / 2.0f, (((float) clipBounds.height()) / 2.0f) + Math.max((float) BitmapDescriptorFactory.HUE_RED, ((float) (clipBounds.height() - mo91115c().mo91095b())) / 2.0f));
        float f2 = this.f63522a;
        float f3 = (float) 2;
        canvas.clipRect((-f2) / f3, (-b) / f3, f2 / f3, b / f3);
        this.f63523b = ((float) mo91115c().mo91095b()) * f;
        this.f63524c = mo91115c().mo91101e();
    }

    @Override // com.larksuite.component.universe_design.progress.drawable.ProgressDrawable
    /* renamed from: a */
    public void mo91112a(Canvas canvas, Paint paint, int i) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        float f = (float) 2;
        float f2 = ((-this.f63522a) / f) + this.f63524c;
        float f3 = -f2;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f4 = this.f63523b;
        canvas.drawRect(f2, (-f4) / f, f3, f4 / f, paint);
        float f5 = this.f63524c;
        RectF rectF = new RectF(-f5, -f5, f5, f5);
        m92925a(canvas, paint, this.f63523b, this.f63524c, f2, true, rectF);
        m92925a(canvas, paint, this.f63523b, this.f63524c, f3, false, rectF);
    }

    @Override // com.larksuite.component.universe_design.progress.drawable.ProgressDrawable
    /* renamed from: a */
    public void mo91111a(Canvas canvas, Paint paint, float f, float f2, int i) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        if (f != f2) {
            float f3 = this.f63522a;
            float f4 = (float) 2;
            float f5 = this.f63524c;
            float f6 = ((-f3) / f4) + f5 + ((f3 - (f4 * f5)) * f);
            float f7 = ((-f3) / f4) + f5 + ((f3 - (f5 * f4)) * f2);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i);
            float f8 = this.f63523b;
            canvas.drawRect(f6, (-f8) / f4, f7, f8 / f4, paint);
            float f9 = this.f63524c;
            RectF rectF = new RectF(-f9, -f9, f9, f9);
            m92925a(canvas, paint, this.f63523b, this.f63524c, f6, true, rectF);
            m92925a(canvas, paint, this.f63523b, this.f63524c, f7 - ((float) 1), false, rectF);
        }
    }

    /* renamed from: a */
    private final void m92925a(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        canvas.save();
        canvas.translate(f3, BitmapDescriptorFactory.HUE_RED);
        if (!z) {
            canvas.rotate(180.0f);
        }
        float f4 = (float) 2;
        float f5 = ((-f) / f4) + f2;
        float f6 = (f / f4) - f2;
        canvas.drawRect(-f2, f5, BitmapDescriptorFactory.HUE_RED, f6, paint);
        canvas.save();
        canvas.translate(BitmapDescriptorFactory.HUE_RED, f5);
        canvas.drawArc(rectF, 180.0f, 90.0f, true, paint);
        canvas.restore();
        canvas.translate(BitmapDescriptorFactory.HUE_RED, f6);
        canvas.drawArc(rectF, 180.0f, -90.0f, true, paint);
        canvas.restore();
    }
}
