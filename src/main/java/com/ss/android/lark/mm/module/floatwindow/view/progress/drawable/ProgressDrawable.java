package com.ss.android.lark.mm.module.floatwindow.view.progress.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.C0768a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mm.module.floatwindow.view.progress.ProgressSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0015H&J\u001a\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0004J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016JJ\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\u00152\b\b\u0001\u0010\u001c\u001a\u00020\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u000f2\b\b\u0001\u0010\u001f\u001a\u00020\u000fH&J\"\u0010 \u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u001d\u001a\u00020\u000fH&J\b\u0010!\u001a\u00020\u000fH\u0016J\b\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010#\u001a\u00020\u000fH&J\b\u0010$\u001a\u00020\u000fH&J\b\u0010%\u001a\u00020\u0015H\u0016J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0012\u0010'\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/mm/module/floatwindow/view/progress/drawable/ProgressDrawable;", "Landroid/graphics/drawable/Drawable;", "spec", "Lcom/ss/android/lark/mm/module/floatwindow/view/progress/ProgressSpec;", "(Lcom/ss/android/lark/mm/module/floatwindow/view/progress/ProgressSpec;)V", "clipBounds", "Landroid/graphics/Rect;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "getSpec", "()Lcom/ss/android/lark/mm/module/floatwindow/view/progress/ProgressSpec;", "setSpec", "totalAlpha", "", "adjustCanvas", "", "canvas", "Landroid/graphics/Canvas;", "trackThicknessFraction", "", "compositeARGBWithAlpha", "originalARGB", "alpha", "draw", "fillIndicator", "startFraction", "endFraction", "color", "startColor", "endColor", "fillTrack", "getAlpha", "getOpacity", "getPreferredHeight", "getPreferredWidth", "getTrackThicknessFraction", "setAlpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.floatwindow.view.progress.a.c */
public abstract class ProgressDrawable extends Drawable {

    /* renamed from: a */
    private final Paint f116707a = new Paint();

    /* renamed from: b */
    private int f116708b = 255;

    /* renamed from: c */
    private Rect f116709c = new Rect();

    /* renamed from: d */
    private ProgressSpec f116710d;

    /* renamed from: a */
    public abstract int mo162841a();

    /* renamed from: a */
    public abstract void mo162842a(Canvas canvas, float f);

    /* renamed from: a */
    public abstract void mo162843a(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    /* renamed from: a */
    public abstract void mo162844a(Canvas canvas, Paint paint, int i);

    /* renamed from: b */
    public abstract int mo162845b();

    /* renamed from: c */
    public float mo162846c() {
        return 1.0f;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: d */
    public final ProgressSpec mo162848d() {
        return this.f116710d;
    }

    public int getAlpha() {
        return this.f116708b;
    }

    public void setAlpha(int i) {
        this.f116708b = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f116707a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public ProgressDrawable(ProgressSpec aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "spec");
        this.f116710d = aVar;
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkExpressionValueIsNotNull(bounds, "bounds");
        if (!bounds.isEmpty() && isVisible() && canvas.getClipBounds(this.f116709c)) {
            canvas.save();
            mo162842a(canvas, mo162846c());
            mo162844a(canvas, this.f116707a, mo162847a(this.f116710d.mo162824c(), getAlpha()));
            int a = mo162847a(this.f116710d.mo162826d(), getAlpha());
            int a2 = mo162847a(this.f116710d.mo162828e(), getAlpha());
            int a3 = mo162847a(this.f116710d.mo162831f(), getAlpha());
            this.f116707a.setAlpha(255);
            mo162843a(canvas, this.f116707a, BitmapDescriptorFactory.HUE_RED, ((float) this.f116710d.mo162835h()) / 100.0f, a, a2, a3);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo162847a(int i, int i2) {
        return C0768a.m3716c(i, (Color.alpha(i) * i2) / 255);
    }
}
