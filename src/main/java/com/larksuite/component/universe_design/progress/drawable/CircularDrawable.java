package com.larksuite.component.universe_design.progress.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.progress.UDProgressSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J@\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J0\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\bH\u0016J\"\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\bH\u0016J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/larksuite/component/universe_design/progress/drawable/CircularDrawable;", "Lcom/larksuite/component/universe_design/progress/drawable/ProgressDrawable;", "spec", "Lcom/larksuite/component/universe_design/progress/UDProgressSpec;", "(Lcom/larksuite/component/universe_design/progress/UDProgressSpec;)V", "ROTATE_DEGREE", "", "ROTATE_DEGREE_HALF", "", "ROTATE_DEGREE_MAX", "ROTATE_DEGREE_QUARTER", "adjustedRadius", "arcDirectionFactor", "displayedCornerRadius", "displayedTrackThickness", "adjustCanvas", "", "canvas", "Landroid/graphics/Canvas;", "trackThicknessFraction", "drawRoundedEnd", "paint", "Landroid/graphics/Paint;", "trackSize", "cornerRadius", "positionInDeg", "isStartPosition", "", "cornerPatternRectBound", "Landroid/graphics/RectF;", "fillIndicator", "startFraction", "endFraction", "color", "fillTrack", "getPreferredHeight", "getPreferredWidth", "universe-ui-progress_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.progress.a.a */
public final class CircularDrawable extends ProgressDrawable {

    /* renamed from: a */
    private final float f63514a = -90.0f;

    /* renamed from: b */
    private final int f63515b = 90;

    /* renamed from: c */
    private final int f63516c = 180;

    /* renamed from: d */
    private final int f63517d = 360;

    /* renamed from: e */
    private int f63518e = 1;

    /* renamed from: f */
    private float f63519f;

    /* renamed from: g */
    private float f63520g;

    /* renamed from: h */
    private float f63521h;

    @Override // com.larksuite.component.universe_design.progress.drawable.ProgressDrawable
    /* renamed from: a */
    public int mo91109a() {
        return mo91115c().mo91106g();
    }

    @Override // com.larksuite.component.universe_design.progress.drawable.ProgressDrawable
    /* renamed from: b */
    public int mo91113b() {
        return mo91115c().mo91106g();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircularDrawable(UDProgressSpec aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "spec");
    }

    @Override // com.larksuite.component.universe_design.progress.drawable.ProgressDrawable
    /* renamed from: a */
    public void mo91110a(Canvas canvas, float f) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        float g = ((float) mo91115c().mo91106g()) / 2.0f;
        canvas.translate(g, g);
        canvas.rotate(this.f63514a);
        float f2 = -g;
        canvas.clipRect(f2, f2, g, g);
        this.f63518e = 1;
        this.f63519f = ((float) mo91115c().mo91095b()) * f;
        this.f63520g = mo91115c().mo91101e();
        this.f63521h = ((float) (mo91115c().mo91106g() - mo91115c().mo91095b())) / 2.0f;
    }

    @Override // com.larksuite.component.universe_design.progress.drawable.ProgressDrawable
    /* renamed from: a */
    public void mo91112a(Canvas canvas, Paint paint, int i) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        int a = mo91114a(mo91115c().mo91097c(), getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.f63519f);
        float f = this.f63521h;
        canvas.drawArc(new RectF(-f, -f, f, f), BitmapDescriptorFactory.HUE_RED, (float) this.f63517d, false, paint);
    }

    @Override // com.larksuite.component.universe_design.progress.drawable.ProgressDrawable
    /* renamed from: a */
    public void mo91111a(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f63519f);
            int i2 = this.f63517d;
            int i3 = this.f63518e;
            float f4 = ((float) i2) * f * ((float) i3);
            if (f2 >= f) {
                f3 = f2 - f;
            } else {
                f3 = (((float) 1) + f2) - f;
            }
            float f5 = f3 * ((float) i2) * ((float) i3);
            float f6 = this.f63521h;
            canvas.drawArc(new RectF(-f6, -f6, f6, f6), f4, f5, false, paint);
            if (this.f63520g > ((float) 0) && Math.abs(f5) < ((float) this.f63517d)) {
                paint.setStyle(Paint.Style.FILL);
                float f7 = this.f63520g;
                RectF rectF = new RectF(-f7, -f7, f7, f7);
                m92919a(canvas, paint, this.f63519f, this.f63520g, f4, true, rectF);
                m92919a(canvas, paint, this.f63519f, this.f63520g, f4 + f5, false, rectF);
            }
        }
    }

    /* renamed from: a */
    private final void m92919a(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        int i;
        if (z) {
            i = -1;
        } else {
            i = 1;
        }
        float f4 = (float) i;
        canvas.save();
        canvas.rotate(f3);
        float f5 = (float) 2;
        float f6 = f / f5;
        float f7 = f4 * f2;
        canvas.drawRect((this.f63521h - f6) + f2, Math.min((float) BitmapDescriptorFactory.HUE_RED, ((float) this.f63518e) * f7), (this.f63521h + f6) - f2, Math.max((float) BitmapDescriptorFactory.HUE_RED, f7 * ((float) this.f63518e)), paint);
        canvas.translate((this.f63521h - f6) + f2, BitmapDescriptorFactory.HUE_RED);
        canvas.drawArc(rectF, (float) this.f63516c, (-f4) * ((float) this.f63515b) * ((float) this.f63518e), true, paint);
        canvas.translate(f - (f5 * f2), BitmapDescriptorFactory.HUE_RED);
        canvas.drawArc(rectF, BitmapDescriptorFactory.HUE_RED, f4 * ((float) this.f63515b) * ((float) this.f63518e), true, paint);
        canvas.restore();
    }
}
