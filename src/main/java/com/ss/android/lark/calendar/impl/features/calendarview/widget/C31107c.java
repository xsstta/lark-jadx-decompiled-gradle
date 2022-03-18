package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.c */
public class C31107c extends Drawable {

    /* renamed from: a */
    private int[] f78572a;

    /* renamed from: b */
    private float[] f78573b;

    /* renamed from: c */
    private float f78574c;

    /* renamed from: d */
    private int f78575d;

    /* renamed from: e */
    private int f78576e;

    /* renamed from: f */
    private Paint f78577f;

    public int getOpacity() {
        return -3;
    }

    /* renamed from: a */
    private void m116102a() {
        if (this.f78572a.length != this.f78573b.length) {
            throw new IllegalArgumentException("widths must have same amount of elements as colors!");
        }
    }

    /* renamed from: b */
    private void m116103b() {
        Paint paint = new Paint();
        this.f78577f = paint;
        paint.setAntiAlias(true);
        float[] fArr = this.f78573b;
        float f = BitmapDescriptorFactory.HUE_RED;
        for (float f2 : fArr) {
            f += f2;
        }
        double d = (double) f;
        float max = Math.max((float) (Math.sin(((double) (this.f78574c / 180.0f)) * 3.141592653589793d) * d), Float.MIN_VALUE);
        float max2 = Math.max((float) (d * Math.cos(((double) (this.f78574c / 180.0f)) * 3.141592653589793d)), Float.MIN_VALUE);
        int[] iArr = this.f78572a;
        int[] iArr2 = new int[(iArr.length * 2)];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int[] iArr3 = this.f78572a;
            iArr2[i2] = iArr3[i];
            iArr2[i2 + 1] = iArr3[i];
        }
        float[] fArr2 = this.f78573b;
        float[] fArr3 = new float[(fArr2.length * 2)];
        int length2 = fArr2.length;
        for (int i3 = 0; i3 < length2; i3++) {
            int i4 = i3 * 2;
            fArr3[i4] = 0.0f;
            if (f != BitmapDescriptorFactory.HUE_RED) {
                fArr3[i4 + 1] = this.f78573b[i3] / f;
            } else {
                fArr3[i4 + 1] = 0.0f;
            }
        }
        this.f78577f.setShader(new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, max, max2, iArr2, fArr3, Shader.TileMode.REPEAT));
    }

    public void setAlpha(int i) {
        this.f78577f.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f78577f.setColorFilter(colorFilter);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f = (float) (bounds.left + this.f78576e);
        float f2 = (float) (bounds.top + this.f78576e);
        float f3 = (float) (bounds.right - this.f78576e);
        float f4 = (float) (bounds.bottom - this.f78576e);
        int i = this.f78575d;
        canvas.drawRoundRect(f, f2, f3, f4, (float) i, (float) i, this.f78577f);
    }

    public C31107c(int[] iArr, float[] fArr, float f, int i, int i2) {
        this.f78572a = iArr;
        this.f78573b = fArr;
        this.f78574c = f;
        this.f78576e = i2;
        this.f78575d = i;
        m116102a();
        m116103b();
    }
}
