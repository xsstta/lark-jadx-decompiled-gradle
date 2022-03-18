package com.ss.android.appcenter.common.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.C0768a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.appcenter.common.shadow.m */
public class C28159m {

    /* renamed from: g */
    private static final int[] f70593g = new int[3];

    /* renamed from: h */
    private static final float[] f70594h = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* renamed from: i */
    private static final int[] f70595i = new int[4];

    /* renamed from: j */
    private static final float[] f70596j = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f70597a;

    /* renamed from: b */
    private final Paint f70598b;

    /* renamed from: c */
    private final Paint f70599c;

    /* renamed from: d */
    private int f70600d;

    /* renamed from: e */
    private int f70601e;

    /* renamed from: f */
    private int f70602f;

    /* renamed from: k */
    private final Path f70603k;

    /* renamed from: l */
    private Paint f70604l;

    /* renamed from: a */
    public Paint mo100329a() {
        return this.f70597a;
    }

    public C28159m() {
        this(-16777216);
    }

    /* renamed from: a */
    public void mo100330a(int i) {
        this.f70600d = C0768a.m3716c(i, 68);
        this.f70601e = C0768a.m3716c(i, 20);
        this.f70602f = C0768a.m3716c(i, 0);
        this.f70597a.setColor(this.f70600d);
    }

    public C28159m(int i) {
        this.f70603k = new Path();
        this.f70604l = new Paint();
        this.f70597a = new Paint();
        mo100330a(i);
        this.f70604l.setColor(0);
        Paint paint = new Paint(4);
        this.f70598b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f70599c = new Paint(paint);
    }

    /* renamed from: a */
    public void mo100331a(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(BitmapDescriptorFactory.HUE_RED, (float) (-i));
        int[] iArr = f70593g;
        iArr[0] = this.f70602f;
        iArr[1] = this.f70601e;
        iArr[2] = this.f70600d;
        this.f70599c.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, f70594h, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f70599c);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo100332a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z;
        if (f2 < BitmapDescriptorFactory.HUE_RED) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.f70603k;
        if (z) {
            int[] iArr = f70595i;
            iArr[0] = 0;
            iArr[1] = this.f70602f;
            iArr[2] = this.f70601e;
            iArr[3] = this.f70600d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i);
            rectF.inset(f3, f3);
            int[] iArr2 = f70595i;
            iArr2[0] = 0;
            iArr2[1] = this.f70600d;
            iArr2[2] = this.f70601e;
            iArr2[3] = this.f70602f;
        }
        float width = rectF.width() / 2.0f;
        if (width > BitmapDescriptorFactory.HUE_RED) {
            float f4 = 1.0f - (((float) i) / width);
            float[] fArr = f70596j;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            this.f70598b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f70595i, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, this.f70604l);
            }
            canvas.drawArc(rectF, f, f2, true, this.f70598b);
            canvas.restore();
        }
    }
}
