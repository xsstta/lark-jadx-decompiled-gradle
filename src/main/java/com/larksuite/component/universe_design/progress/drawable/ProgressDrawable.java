package com.larksuite.component.universe_design.progress.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.C0768a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.progress.UDProgressSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0015H&J\u001a\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0004J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J6\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\u00152\b\b\u0001\u0010\u001c\u001a\u00020\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u000fH&J\"\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u001d\u001a\u00020\u000fH&J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\b\u0010 \u001a\u00020\u000fH\u0016J\b\u0010!\u001a\u00020\u000fH&J\b\u0010\"\u001a\u00020\u000fH&J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0012\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/larksuite/component/universe_design/progress/drawable/ProgressDrawable;", "Landroid/graphics/drawable/Drawable;", "spec", "Lcom/larksuite/component/universe_design/progress/UDProgressSpec;", "(Lcom/larksuite/component/universe_design/progress/UDProgressSpec;)V", "clipBounds", "Landroid/graphics/Rect;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "getSpec", "()Lcom/larksuite/component/universe_design/progress/UDProgressSpec;", "setSpec", "totalAlpha", "", "adjustCanvas", "", "canvas", "Landroid/graphics/Canvas;", "trackThicknessFraction", "", "compositeARGBWithAlpha", "originalARGB", "alpha", "draw", "fillIndicator", "startFraction", "endFraction", "color", "fillTrack", "getAlpha", "getOpacity", "getPreferredHeight", "getPreferredWidth", "setAlpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "universe-ui-progress_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.progress.a.c */
public abstract class ProgressDrawable extends Drawable {

    /* renamed from: a */
    private final Paint f63525a = new Paint();

    /* renamed from: b */
    private int f63526b = 255;

    /* renamed from: c */
    private Rect f63527c = new Rect();

    /* renamed from: d */
    private UDProgressSpec f63528d;

    /* renamed from: a */
    public abstract int mo91109a();

    /* renamed from: a */
    public abstract void mo91110a(Canvas canvas, float f);

    /* renamed from: a */
    public abstract void mo91111a(Canvas canvas, Paint paint, float f, float f2, int i);

    /* renamed from: a */
    public abstract void mo91112a(Canvas canvas, Paint paint, int i);

    /* renamed from: b */
    public abstract int mo91113b();

    public int getOpacity() {
        return -3;
    }

    /* renamed from: c */
    public final UDProgressSpec mo91115c() {
        return this.f63528d;
    }

    public int getAlpha() {
        return this.f63526b;
    }

    public void setAlpha(int i) {
        this.f63526b = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f63525a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public ProgressDrawable(UDProgressSpec aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "spec");
        this.f63528d = aVar;
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkExpressionValueIsNotNull(bounds, "bounds");
        if (!bounds.isEmpty() && isVisible() && canvas.getClipBounds(this.f63527c)) {
            canvas.save();
            mo91110a(canvas, 1.0f);
            mo91112a(canvas, this.f63525a, mo91114a(this.f63528d.mo91097c(), getAlpha()));
            mo91111a(canvas, this.f63525a, BitmapDescriptorFactory.HUE_RED, ((float) this.f63528d.mo91104f()) / 100.0f, mo91114a(this.f63528d.mo91099d(), getAlpha()));
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo91114a(int i, int i2) {
        return C0768a.m3716c(i, (Color.alpha(i) * i2) / 255);
    }
}
