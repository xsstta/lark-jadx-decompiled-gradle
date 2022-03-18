package com.ss.android.shapeimage.p3021a.p3022a;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.shapeimage.a.a.g */
public class C59980g {

    /* renamed from: a */
    private final float f149525a;

    /* renamed from: b */
    private final float f149526b;

    /* renamed from: c */
    private final Path f149527c;

    /* renamed from: a */
    public float mo204239a() {
        return this.f149525a;
    }

    /* renamed from: b */
    public float mo204241b() {
        return this.f149526b;
    }

    /* renamed from: a */
    public void mo204240a(Matrix matrix, Path path) {
        this.f149527c.transform(matrix, path);
    }

    C59980g(Path path, float f, float f2) {
        this.f149527c = path;
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        if (f <= BitmapDescriptorFactory.HUE_RED && f2 <= BitmapDescriptorFactory.HUE_RED) {
            f = (float) Math.ceil((double) rectF.width());
            f2 = (float) Math.ceil((double) rectF.height());
            path.offset(((float) Math.floor((double) rectF.left)) * -1.0f, ((float) Math.round(rectF.top)) * -1.0f);
        }
        this.f149525a = f;
        this.f149526b = f2;
    }
}
