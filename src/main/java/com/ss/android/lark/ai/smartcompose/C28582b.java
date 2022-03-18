package com.ss.android.lark.ai.smartcompose;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import com.ss.android.lark.keyboard.plugin.input.AbstractC40729d;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.ai.smartcompose.b */
public class C28582b extends DynamicDrawableSpan implements AbstractC40729d {

    /* renamed from: a */
    private final Context f71923a;

    /* renamed from: b */
    private int f71924b;

    /* renamed from: c */
    private Drawable f71925c;

    /* renamed from: d */
    private int f71926d;

    /* renamed from: e */
    private int f71927e;

    /* renamed from: f */
    private WeakReference<Drawable> f71928f;

    /* renamed from: a */
    private Drawable m104809a() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f71928f;
        if (weakReference != null) {
            drawable = weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.f71928f = new WeakReference<>(drawable2);
        return drawable2;
    }

    public Drawable getDrawable() {
        if (this.f71925c == null) {
            try {
                Drawable drawable = this.f71923a.getResources().getDrawable(this.f71926d);
                this.f71925c = drawable;
                this.f71925c.setBounds(0, 0, (this.f71924b * drawable.getIntrinsicWidth()) / this.f71925c.getIntrinsicHeight(), this.f71924b);
            } catch (Exception unused) {
            }
        }
        return this.f71925c;
    }

    public C28582b(Context context, int i, int i2, int i3, int i4) {
        super(i2);
        this.f71923a = context;
        this.f71924b = i;
        this.f71926d = i3;
        this.f71927e = i4;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + (this.f71927e * 2);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable a = m104809a();
        canvas.save();
        int i6 = i5 - a.getBounds().bottom;
        if (this.mVerticalAlignment == 1) {
            i6 -= paint.getFontMetricsInt().descent;
        } else if (this.mVerticalAlignment == 2) {
            i6 = ((i5 - i3) / 2) - (a.getBounds().height() / 2);
        }
        canvas.translate(f + ((float) this.f71927e), (float) i6);
        a.draw(canvas);
        canvas.restore();
    }
}
