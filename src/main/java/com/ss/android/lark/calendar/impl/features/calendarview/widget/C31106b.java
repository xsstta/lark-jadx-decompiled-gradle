package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.b */
public class C31106b extends Drawable {

    /* renamed from: a */
    protected Paint f78566a = new Paint();

    /* renamed from: b */
    private int[] f78567b;

    /* renamed from: c */
    private float[] f78568c;

    /* renamed from: d */
    private int f78569d;

    /* renamed from: e */
    private int f78570e;

    /* renamed from: f */
    private Path f78571f;

    public int getOpacity() {
        return -3;
    }

    /* renamed from: a */
    private void m116101a() {
        int[] iArr = this.f78567b;
        if (iArr.length != this.f78568c.length || iArr.length < 2) {
            throw new IllegalArgumentException("widths must have same amount of elements as colors!");
        }
    }

    public void setAlpha(int i) {
        this.f78566a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f78566a.setColorFilter(colorFilter);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f = (float) (bounds.left + this.f78570e);
        float f2 = (float) (bounds.top + this.f78570e);
        float f3 = (float) (bounds.right - this.f78570e);
        float f4 = (float) (bounds.bottom - this.f78570e);
        RectF rectF = new RectF(f, f2, f3, f4);
        float[] fArr = new float[8];
        Arrays.fill(fArr, (float) this.f78569d);
        this.f78571f.reset();
        this.f78571f.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.f78571f);
        float sqrt = (float) Math.sqrt(2.0d);
        int i = 0;
        float f5 = f + ((this.f78568c[0] * sqrt) / 2.0f);
        float f6 = f4 - f2;
        float f7 = f5 - f6;
        while (true) {
            if (f5 < f3 || f7 < f3) {
                float[] fArr2 = this.f78568c;
                int length = i % fArr2.length;
                int i2 = i + 1;
                int length2 = i2 % fArr2.length;
                int[] iArr = this.f78567b;
                int length3 = i % iArr.length;
                float f8 = fArr2[length];
                this.f78566a.setColor(iArr[length3]);
                this.f78566a.setStrokeWidth(f8);
                canvas.drawLine(f5 + f8, f2 - f8, f7 - f8, f4 + f8, this.f78566a);
                float[] fArr3 = this.f78568c;
                f5 += ((fArr3[length] * sqrt) / 2.0f) + ((fArr3[length2] * sqrt) / 2.0f);
                f7 = f5 - f6;
                i = i2;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public C31106b(int[] iArr, float[] fArr, int i, int i2) {
        this.f78567b = iArr;
        this.f78568c = fArr;
        this.f78570e = i2;
        this.f78569d = i;
        this.f78571f = new Path();
        this.f78566a.setAntiAlias(true);
        m116101a();
    }
}
