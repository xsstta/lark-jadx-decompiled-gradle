package com.bytedance.ee.bear.p519p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.ee.bear.p519p.AbstractC10466g;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.p.b */
public class C10462b extends ImageSpan implements AbstractC10466g {

    /* renamed from: a */
    private Context f28127a;

    /* renamed from: b */
    private int f28128b;

    /* renamed from: c */
    private String f28129c;

    /* renamed from: d */
    private ColorMatrix f28130d = new ColorMatrix();

    /* renamed from: e */
    private boolean f28131e;

    /* renamed from: f */
    private int f28132f = -1;

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: e */
    public boolean mo39745e() {
        return false;
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: f */
    public boolean mo39746f() {
        return false;
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: o */
    public /* synthetic */ int mo39738o() {
        return AbstractC10466g.CC.$default$o(this);
    }

    /* renamed from: a */
    public int mo39740a() {
        return this.f28128b;
    }

    /* renamed from: b */
    public String mo39742b() {
        return this.f28129c;
    }

    /* renamed from: c */
    public boolean mo39743c() {
        return this.f28131e;
    }

    /* renamed from: a */
    public void mo39741a(boolean z) {
        this.f28131e = z;
    }

    /* renamed from: a */
    private void m43402a(int i, String str) {
        this.f28128b = i;
        this.f28129c = str;
        this.f28130d.setSaturation(BitmapDescriptorFactory.HUE_RED);
    }

    public C10462b(Context context, int i) {
        super(context, i);
        this.f28127a = context;
        m43402a(0, "");
    }

    public C10462b(Context context, int i, int i2, String str) {
        super(context, i);
        this.f28127a = context;
        m43402a(i2, str);
    }

    public C10462b(Context context, Drawable drawable, int i, String str) {
        super(drawable);
        drawable.setBounds(0, 0, C13749l.m55738a(14), C13749l.m55738a(14));
        this.f28127a = context;
        m43402a(i, str);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right + this.f28127a.getResources().getDimensionPixelSize(R.dimen.doc_file_prefix_space);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        if (this.f28132f != -1) {
            paint.setColorFilter(new PorterDuffColorFilter(this.f28132f, PorterDuff.Mode.SRC_IN));
        } else if (mo39743c()) {
            paint.setColorFilter(new PorterDuffColorFilter(this.f28127a.getResources().getColor(R.color.space_kit_n400), PorterDuff.Mode.SRC_IN));
        } else {
            paint.setColorFilter(null);
        }
        canvas.saveLayer(null, paint, 31);
        canvas.translate(f + ((float) (this.f28127a.getResources().getDimensionPixelSize(R.dimen.doc_file_prefix_space) / 2)), (float) ((((i5 - i3) - drawable.getBounds().bottom) / 2) + i3));
        drawable.draw(canvas);
        canvas.restore();
    }
}
