package com.ss.android.lark.widget.linked_emojicon.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.base.c */
public class C58504c extends DynamicDrawableSpan {

    /* renamed from: a */
    private final Context f144352a;

    /* renamed from: b */
    private int f144353b;

    /* renamed from: c */
    private final int f144354c;

    /* renamed from: d */
    private final int f144355d;

    /* renamed from: e */
    private int f144356e;

    /* renamed from: f */
    private int f144357f;

    /* renamed from: g */
    private int f144358g;

    /* renamed from: h */
    private Drawable f144359h;

    /* renamed from: i */
    private WeakReference<Drawable> f144360i;

    /* renamed from: j */
    private String f144361j;

    /* renamed from: k */
    private int f144362k;

    /* renamed from: a */
    public String mo198296a() {
        return this.f144361j;
    }

    /* renamed from: b */
    private Drawable m226969b() {
        WeakReference<Drawable> weakReference = this.f144360i;
        if (weakReference == null || weakReference.get() == null) {
            this.f144360i = new WeakReference<>(getDrawable());
        }
        return this.f144360i.get();
    }

    public Drawable getDrawable() {
        try {
            if (this.f144359h == null && this.f144353b > 0) {
                this.f144359h = this.f144352a.getResources().getDrawable(this.f144353b);
            }
            int i = this.f144354c;
            this.f144356e = i;
            int intrinsicWidth = (i * this.f144359h.getIntrinsicWidth()) / this.f144359h.getIntrinsicHeight();
            this.f144357f = intrinsicWidth;
            int i2 = this.f144355d;
            int i3 = this.f144356e;
            int i4 = (i2 - i3) / 2;
            this.f144358g = i4;
            this.f144359h.setBounds(0, i4, intrinsicWidth, i3 + i4);
        } catch (Exception unused) {
        }
        return this.f144359h;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f144353b), Integer.valueOf(this.f144354c), Integer.valueOf(this.f144355d), Integer.valueOf(this.f144356e), Integer.valueOf(this.f144357f), Integer.valueOf(this.f144358g), this.f144361j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58504c)) {
            return false;
        }
        C58504c cVar = (C58504c) obj;
        if (this.f144353b == cVar.f144353b && this.f144354c == cVar.f144354c && this.f144355d == cVar.f144355d && this.f144356e == cVar.f144356e && this.f144357f == cVar.f144357f && this.f144358g == cVar.f144358g && Objects.equals(this.f144361j, cVar.f144361j)) {
            return true;
        }
        return false;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + (this.f144362k * 2);
    }

    public C58504c(Context context, Drawable drawable, String str, int i, int i2, int i3) {
        this(context, drawable, str, i, i2, i3, UIHelper.dp2px(1.0f));
    }

    public C58504c(Context context, int i, String str, int i2, int i3, int i4, int i5) {
        super(i3);
        this.f144352a = context;
        this.f144353b = i;
        this.f144354c = i2;
        this.f144356e = i2;
        this.f144357f = i2;
        this.f144355d = i4;
        this.f144361j = str;
        this.f144362k = i5;
    }

    public C58504c(Context context, Drawable drawable, String str, int i, int i2, int i3, int i4) {
        super(i2);
        this.f144352a = context;
        this.f144359h = drawable;
        this.f144354c = i;
        this.f144356e = i;
        this.f144357f = i;
        this.f144355d = i3;
        this.f144361j = str;
        this.f144362k = i4;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable b = m226969b();
        canvas.save();
        int i6 = i5 - b.getBounds().bottom;
        if (this.mVerticalAlignment == 1) {
            i6 = ((i3 + ((i5 - i3) / 2)) - ((b.getBounds().bottom - b.getBounds().top) / 2)) - this.f144358g;
        } else if (this.mVerticalAlignment == 2) {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (b.getBounds().bottom / 2);
        }
        canvas.translate(f + ((float) this.f144362k), (float) i6);
        b.draw(canvas);
        canvas.restore();
    }
}
