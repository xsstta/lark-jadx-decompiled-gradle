package com.ss.android.lark.widget.linked_emojicon.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.style.ReplacementSpan;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.a */
public class C58534a extends ReplacementSpan {

    /* renamed from: a */
    private int f144483a;

    /* renamed from: b */
    private int f144484b;

    /* renamed from: c */
    private int f144485c;

    /* renamed from: d */
    private String f144486d;

    /* renamed from: e */
    private float f144487e;

    /* renamed from: f */
    private float f144488f;

    /* renamed from: g */
    private int f144489g;

    /* renamed from: h */
    private int f144490h;

    /* renamed from: i */
    private Context f144491i;

    /* renamed from: j */
    private int f144492j;

    /* renamed from: k */
    private Path f144493k;

    public C58534a(String str, Context context) {
        this(str, context, 10, 10, 1.0f);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int measureText = (int) paint.measureText(charSequence, i, i2);
        this.f144485c = measureText;
        int i3 = this.f144484b;
        int i4 = this.f144483a;
        int i5 = measureText % (i3 + i4);
        if (i5 > i3) {
            this.f144492j = (i5 - i3) / 2;
        } else {
            this.f144492j = (i5 + i4) / 2;
        }
        return measureText;
    }

    public C58534a(String str, Context context, int i, int i2, float f) {
        this.f144483a = 10;
        this.f144484b = 10;
        this.f144487e = 1.0f;
        this.f144491i = context;
        this.f144486d = str;
        this.f144489g = UIUtils.dp2px(context, 1.0f);
        this.f144490h = UIUtils.dp2px(context, 3.0f);
        if (i > 0) {
            this.f144483a = i;
        }
        if (i2 > 0) {
            this.f144484b = i2;
        }
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            this.f144487e = f;
        }
        this.f144493k = new Path();
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(charSequence, i, i2, f, (float) i4, paint);
        this.f144488f = paint.measureText(this.f144486d);
        this.f144493k.reset();
        this.f144493k.moveTo(f, (float) (this.f144490h + i4));
        this.f144493k.lineTo(this.f144488f + f, (float) (this.f144490h + i4));
        paint.setAntiAlias(true);
        paint.setColor(this.f144491i.getResources().getColor(R.color.ud_N900));
        paint.setAlpha((int) (this.f144487e * 255.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{(float) this.f144484b, (float) this.f144483a}, (float) (-this.f144492j)));
        paint.setStrokeWidth((float) this.f144489g);
        canvas.drawPath(this.f144493k, paint);
    }
}
