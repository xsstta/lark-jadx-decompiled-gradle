package com.google.android.material.p980a;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: com.google.android.material.a.f */
public class C22121f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f53788a = new Matrix();

    public C22121f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f53788a.set(imageView.getImageMatrix());
        return this.f53788a;
    }

    /* renamed from: a */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
