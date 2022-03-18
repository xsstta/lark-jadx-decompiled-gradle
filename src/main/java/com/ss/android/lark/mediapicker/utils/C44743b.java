package com.ss.android.lark.mediapicker.utils;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;

/* renamed from: com.ss.android.lark.mediapicker.utils.b */
public class C44743b {
    /* renamed from: a */
    public static int m177483a(String str) {
        try {
            int a = new ExifInterface(str).mo4995a("Orientation", 1);
            if (a == 3) {
                return 180;
            }
            if (a == 6) {
                return 90;
            }
            if (a != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static int[] m177484a(View view, int i, int i2, int i3, int i4) {
        int[] iArr = new int[2];
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 <= 0 || i <= 0) {
            iArr[0] = i3;
            iArr[1] = i4;
            return iArr;
        }
        if (width <= 0) {
            width = i3;
        }
        if (height <= 0) {
            height = i4;
        }
        if (i2 >= height || i >= width) {
            float f = ((float) i) / ((float) i2);
            float f2 = (float) height;
            float f3 = f2 * f;
            if (f3 > f2) {
                iArr[0] = width;
                iArr[1] = (int) (((float) width) / f);
            } else {
                iArr[1] = height;
                iArr[0] = (int) f3;
            }
        } else {
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] > i3 / 2 && iArr[1] > i4 / 4) {
            iArr[0] = iArr[0] / 2;
            iArr[1] = iArr[1] / 2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            return null;
        }
        return iArr;
    }
}
