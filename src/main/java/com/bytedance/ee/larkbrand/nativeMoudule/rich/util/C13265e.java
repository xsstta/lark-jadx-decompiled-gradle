package com.bytedance.ee.larkbrand.nativeMoudule.rich.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.util.e */
public class C13265e {
    /* renamed from: a */
    public static Bitmap m54037a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0) {
            Matrix matrix = new Matrix();
            float f = (((float) i) * 1.0f) / ((float) width);
            float f2 = (((float) i2) * 1.0f) / ((float) height);
            if (f > BitmapDescriptorFactory.HUE_RED && f2 > BitmapDescriptorFactory.HUE_RED) {
                matrix.postScale(f, f2);
                return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            }
        }
        return null;
    }
}
