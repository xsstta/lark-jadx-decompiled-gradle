package com.ss.android.lark.mm.module.floatwindow.view.progress.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mm.module.floatwindow.view.progress.ProgressSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J@\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J@\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0016J\"\u0010$\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\bH\u0016J\b\u0010%\u001a\u00020\bH\u0016J\b\u0010&\u001a\u00020\bH\u0016J\b\u0010'\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/mm/module/floatwindow/view/progress/drawable/CircularDrawable;", "Lcom/ss/android/lark/mm/module/floatwindow/view/progress/drawable/ProgressDrawable;", "spec", "Lcom/ss/android/lark/mm/module/floatwindow/view/progress/ProgressSpec;", "(Lcom/ss/android/lark/mm/module/floatwindow/view/progress/ProgressSpec;)V", "ROTATE_DEGREE", "", "ROTATE_DEGREE_HALF", "", "ROTATE_DEGREE_MAX", "ROTATE_DEGREE_QUARTER", "adjustedRadius", "arcDirectionFactor", "displayedCornerRadius", "displayedTrackThickness", "adjustCanvas", "", "canvas", "Landroid/graphics/Canvas;", "trackThicknessFraction", "drawRoundedEnd", "paint", "Landroid/graphics/Paint;", "trackSize", "cornerRadius", "positionInDeg", "isStartPosition", "", "cornerPatternRectBound", "Landroid/graphics/RectF;", "fillIndicator", "startFraction", "endFraction", "color", "startColor", "endColor", "fillTrack", "getPreferredHeight", "getPreferredWidth", "getTrackThicknessFraction", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.floatwindow.view.progress.a.a */
public final class CircularDrawable extends ProgressDrawable {

    /* renamed from: a */
    private final float f116696a = -90.0f;

    /* renamed from: b */
    private final int f116697b = 90;

    /* renamed from: c */
    private final int f116698c = 180;

    /* renamed from: d */
    private final int f116699d = 360;

    /* renamed from: e */
    private int f116700e = 1;

    /* renamed from: f */
    private float f116701f;

    /* renamed from: g */
    private float f116702g;

    /* renamed from: h */
    private float f116703h;

    @Override // com.ss.android.lark.mm.module.floatwindow.view.progress.drawable.ProgressDrawable
    /* renamed from: a */
    public int mo162841a() {
        return mo162848d().mo162838i();
    }

    @Override // com.ss.android.lark.mm.module.floatwindow.view.progress.drawable.ProgressDrawable
    /* renamed from: b */
    public int mo162845b() {
        return mo162848d().mo162838i();
    }

    @Override // com.ss.android.lark.mm.module.floatwindow.view.progress.drawable.ProgressDrawable
    /* renamed from: c */
    public float mo162846c() {
        return mo162848d().mo162839j();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircularDrawable(ProgressSpec aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "spec");
    }

    @Override // com.ss.android.lark.mm.module.floatwindow.view.progress.drawable.ProgressDrawable
    /* renamed from: a */
    public void mo162842a(Canvas canvas, float f) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        float i = ((float) mo162848d().mo162838i()) / 2.0f;
        canvas.translate(i, i);
        canvas.rotate(this.f116696a);
        float f2 = -i;
        canvas.clipRect(f2, f2, i, i);
        this.f116700e = 1;
        this.f116701f = ((float) mo162848d().mo162821b()) * f;
        this.f116702g = mo162848d().mo162833g();
        this.f116703h = ((float) (mo162848d().mo162838i() - mo162848d().mo162821b())) / 2.0f;
    }

    @Override // com.ss.android.lark.mm.module.floatwindow.view.progress.drawable.ProgressDrawable
    /* renamed from: a */
    public void mo162844a(Canvas canvas, Paint paint, int i) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f116701f);
        float f = this.f116703h;
        canvas.drawArc(new RectF(-f, -f, f, f), BitmapDescriptorFactory.HUE_RED, (float) this.f116699d, false, paint);
    }

    /* renamed from: a */
    private final void m183444a(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
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
        canvas.drawRect((this.f116703h - f6) + f2, Math.min((float) BitmapDescriptorFactory.HUE_RED, ((float) this.f116700e) * f7), (this.f116703h + f6) - f2, Math.max((float) BitmapDescriptorFactory.HUE_RED, f7 * ((float) this.f116700e)), paint);
        canvas.translate((this.f116703h - f6) + f2, BitmapDescriptorFactory.HUE_RED);
        canvas.drawArc(rectF, (float) this.f116698c, (-f4) * ((float) this.f116697b) * ((float) this.f116700e), true, paint);
        canvas.translate(f - (f5 * f2), BitmapDescriptorFactory.HUE_RED);
        canvas.drawArc(rectF, BitmapDescriptorFactory.HUE_RED, f4 * ((float) this.f116697b) * ((float) this.f116700e), true, paint);
        canvas.restore();
    }

    @Override // com.ss.android.lark.mm.module.floatwindow.view.progress.drawable.ProgressDrawable
    /* renamed from: a */
    public void mo162843a(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        float f3;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setStrokeWidth((float) mo162848d().mo162821b());
            int i4 = this.f116699d;
            int i5 = this.f116700e;
            float f4 = ((float) i4) * f * ((float) i5);
            if (f2 >= f) {
                f3 = f2 - f;
            } else {
                f3 = (((float) 1) + f2) - f;
            }
            float f5 = f3 * ((float) i4) * ((float) i5);
            float f6 = this.f116703h;
            RectF rectF = new RectF(-f6, -f6, f6, f6);
            if (i != 0) {
                paint.setColor(i);
            } else {
                float f7 = (float) 2;
                paint.setShader(new SweepGradient((rectF.width() / f7) - this.f116703h, (rectF.height() / f7) - this.f116703h, i2, i3));
                paint.setStrokeCap(Paint.Cap.ROUND);
            }
            canvas.drawArc(rectF, f4, f5, false, paint);
            paint.setShader(null);
            if (this.f116702g > ((float) 0) && Math.abs(f5) < ((float) this.f116699d)) {
                paint.setStyle(Paint.Style.FILL);
                float f8 = this.f116702g;
                RectF rectF2 = new RectF(-f8, -f8, f8, f8);
                if (i == 0) {
                    paint.setColor(i2);
                }
                m183444a(canvas, paint, (float) mo162848d().mo162821b(), this.f116702g, f4, true, rectF2);
                if (i != 0) {
                    m183444a(canvas, paint, (float) mo162848d().mo162821b(), this.f116702g, f4 + f5, false, rectF2);
                }
            }
        }
    }
}
