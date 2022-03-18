package com.google.android.material.p990k;

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

/* renamed from: com.google.android.material.k.a */
public class C22376a {

    /* renamed from: g */
    private static final int[] f54817g = new int[3];

    /* renamed from: h */
    private static final float[] f54818h = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* renamed from: i */
    private static final int[] f54819i = new int[4];

    /* renamed from: j */
    private static final float[] f54820j = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f54821a;

    /* renamed from: b */
    private final Paint f54822b;

    /* renamed from: c */
    private final Paint f54823c;

    /* renamed from: d */
    private int f54824d;

    /* renamed from: e */
    private int f54825e;

    /* renamed from: f */
    private int f54826f;

    /* renamed from: k */
    private final Path f54827k;

    /* renamed from: l */
    private Paint f54828l;

    /* renamed from: a */
    public Paint mo77891a() {
        return this.f54821a;
    }

    public C22376a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void mo77892a(int i) {
        this.f54824d = C0768a.m3716c(i, 68);
        this.f54825e = C0768a.m3716c(i, 20);
        this.f54826f = C0768a.m3716c(i, 0);
        this.f54821a.setColor(this.f54824d);
    }

    public C22376a(int i) {
        this.f54827k = new Path();
        this.f54828l = new Paint();
        this.f54821a = new Paint();
        mo77892a(i);
        this.f54828l.setColor(0);
        Paint paint = new Paint(4);
        this.f54822b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f54823c = new Paint(paint);
    }

    /* renamed from: a */
    public void mo77893a(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(BitmapDescriptorFactory.HUE_RED, (float) (-i));
        int[] iArr = f54817g;
        iArr[0] = this.f54826f;
        iArr[1] = this.f54825e;
        iArr[2] = this.f54824d;
        this.f54823c.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, f54818h, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f54823c);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo77894a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z;
        if (f2 < BitmapDescriptorFactory.HUE_RED) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.f54827k;
        if (z) {
            int[] iArr = f54819i;
            iArr[0] = 0;
            iArr[1] = this.f54826f;
            iArr[2] = this.f54825e;
            iArr[3] = this.f54824d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i);
            rectF.inset(f3, f3);
            int[] iArr2 = f54819i;
            iArr2[0] = 0;
            iArr2[1] = this.f54824d;
            iArr2[2] = this.f54825e;
            iArr2[3] = this.f54826f;
        }
        float width = rectF.width() / 2.0f;
        if (width > BitmapDescriptorFactory.HUE_RED) {
            float f4 = 1.0f - (((float) i) / width);
            float[] fArr = f54820j;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            this.f54822b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f54819i, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, this.f54828l);
            }
            canvas.drawArc(rectF, f, f2, true, this.f54822b);
            canvas.restore();
        }
    }
}
