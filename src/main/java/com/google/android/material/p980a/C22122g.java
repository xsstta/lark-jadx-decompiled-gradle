package com.google.android.material.p980a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: com.google.android.material.a.g */
public class C22122g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f53789a = new float[9];

    /* renamed from: b */
    private final float[] f53790b = new float[9];

    /* renamed from: c */
    private final Matrix f53791c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f53789a);
        matrix2.getValues(this.f53790b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f53790b;
            float f2 = fArr[i];
            float[] fArr2 = this.f53789a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f53791c.setValues(this.f53790b);
        return this.f53791c;
    }
}
