package com.ss.android.shapeimage.p3021a.p3022a;

import android.graphics.Matrix;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.shapeimage.a.a.j */
public class C59983j {

    /* renamed from: a */
    private static final String f149544a = C59982i.class.getSimpleName();

    /* renamed from: a */
    static Matrix m232797a(String str) {
        int i;
        Matrix matrix = new Matrix();
        while (true) {
            m232798a(str, matrix);
            int indexOf = str.indexOf(")");
            if (indexOf <= 0 || str.length() <= (i = indexOf + 1)) {
                return matrix;
            }
            str = str.substring(i).replaceFirst("[\\s,]*", "");
        }
        return matrix;
    }

    /* renamed from: a */
    private static void m232798a(String str, Matrix matrix) {
        float f;
        float f2;
        boolean startsWith = str.startsWith("matrix(");
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (startsWith) {
            C59977d a = C59977d.m232765a(str.substring(7));
            if (a.f149518a.size() == 6) {
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{a.f149518a.get(0).floatValue(), a.f149518a.get(2).floatValue(), a.f149518a.get(4).floatValue(), a.f149518a.get(1).floatValue(), a.f149518a.get(3).floatValue(), a.f149518a.get(5).floatValue(), 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            }
        } else if (str.startsWith("translate(")) {
            C59977d a2 = C59977d.m232765a(str.substring(10));
            if (a2.f149518a.size() > 0) {
                float floatValue = a2.f149518a.get(0).floatValue();
                if (a2.f149518a.size() > 1) {
                    f3 = a2.f149518a.get(1).floatValue();
                }
                matrix.preTranslate(floatValue, f3);
            }
        } else if (str.startsWith("scale(")) {
            C59977d a3 = C59977d.m232765a(str.substring(6));
            if (a3.f149518a.size() > 0) {
                float floatValue2 = a3.f149518a.get(0).floatValue();
                if (a3.f149518a.size() > 1) {
                    f2 = a3.f149518a.get(1).floatValue();
                } else {
                    f2 = floatValue2;
                }
                matrix.preScale(floatValue2, f2);
            }
        } else if (str.startsWith("skewX(")) {
            C59977d a4 = C59977d.m232765a(str.substring(6));
            if (a4.f149518a.size() > 0) {
                matrix.preSkew((float) Math.tan((double) a4.f149518a.get(0).floatValue()), BitmapDescriptorFactory.HUE_RED);
            }
        } else if (str.startsWith("skewY(")) {
            C59977d a5 = C59977d.m232765a(str.substring(6));
            if (a5.f149518a.size() > 0) {
                matrix.preSkew(BitmapDescriptorFactory.HUE_RED, (float) Math.tan((double) a5.f149518a.get(0).floatValue()));
            }
        } else if (str.startsWith("rotate(")) {
            C59977d a6 = C59977d.m232765a(str.substring(7));
            if (a6.f149518a.size() > 0) {
                float floatValue3 = a6.f149518a.get(0).floatValue();
                if (a6.f149518a.size() > 2) {
                    f3 = a6.f149518a.get(1).floatValue();
                    f = a6.f149518a.get(2).floatValue();
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                matrix.preTranslate(f3, f);
                matrix.preRotate(floatValue3);
                matrix.preTranslate(-f3, -f);
            }
        } else {
            String str2 = f149544a;
            Log.m165397w(str2, "Invalid transform (" + str + ")");
        }
    }
}
