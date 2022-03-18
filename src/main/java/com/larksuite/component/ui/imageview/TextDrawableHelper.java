package com.larksuite.component.ui.imageview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006J\u0010\u0010\u0014\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/larksuite/component/ui/imageview/TextDrawableHelper;", "", "()V", "text", "", "textHeight", "", "textPaint", "Landroid/text/TextPaint;", "textWidth", "calculateTextWidth", "drawTextCenter", "", "canvas", "Landroid/graphics/Canvas;", "centerX", "", "centerY", "getTextHeight", "getTextWidth", "setText", "setTextColor", "color", "setTextSize", "textSize", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.imageview.c */
public final class TextDrawableHelper {

    /* renamed from: a */
    private final TextPaint f62677a;

    /* renamed from: b */
    private CharSequence f62678b;

    /* renamed from: c */
    private float f62679c = -1.0f;

    /* renamed from: d */
    private float f62680d = -1.0f;

    public TextDrawableHelper() {
        TextPaint textPaint = new TextPaint(1);
        this.f62677a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: a */
    public final float mo89426a() {
        float f = this.f62679c;
        if (f >= ((float) 0)) {
            return f;
        }
        float b = m91993b(this.f62678b);
        this.f62679c = b;
        return b;
    }

    /* renamed from: b */
    public final float mo89431b() {
        float f = this.f62680d;
        if (f > ((float) 0)) {
            return f;
        }
        Paint.FontMetrics fontMetrics = this.f62677a.getFontMetrics();
        return fontMetrics.descent - fontMetrics.ascent;
    }

    /* renamed from: a */
    public final void mo89428a(int i) {
        this.f62677a.setColor(i);
    }

    /* renamed from: b */
    private final float m91993b(CharSequence charSequence) {
        boolean z;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return this.f62677a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    public final void mo89427a(float f) {
        if (this.f62677a.getTextSize() != f) {
            this.f62677a.setTextSize(f);
            this.f62679c = -1.0f;
            this.f62680d = -1.0f;
        }
    }

    /* renamed from: a */
    public final void mo89430a(CharSequence charSequence) {
        if (!Intrinsics.areEqual(this.f62678b, charSequence)) {
            this.f62679c = -1.0f;
            this.f62678b = charSequence;
        }
    }

    /* renamed from: a */
    public final void mo89429a(Canvas canvas, int i, int i2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        CharSequence charSequence = this.f62678b;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f62677a.setTextAlign(Paint.Align.CENTER);
            CharSequence charSequence2 = this.f62678b;
            if (charSequence2 != null) {
                canvas.drawText((String) charSequence2, (float) i, ((float) i2) - ((this.f62677a.descent() + this.f62677a.ascent()) / ((float) 2)), this.f62677a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }
}
