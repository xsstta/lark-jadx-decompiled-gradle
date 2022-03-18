package com.bytedance.p754g.p755a;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;

/* renamed from: com.bytedance.g.a.b */
public class C14185b {

    /* renamed from: a */
    private int f37302a;

    public C14185b() {
        this(0);
    }

    /* renamed from: a */
    public void mo52031a(int i) {
        this.f37302a = i;
    }

    public C14185b(int i) {
        this.f37302a = i;
    }

    /* renamed from: a */
    public boolean mo52032a(Bitmap bitmap) {
        boolean z;
        if (bitmap == null) {
            return true;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return false;
        }
        int i = this.f37302a;
        if (i == 0) {
            i = bitmap.getPixel(0, 0);
        }
        int[] iArr = new int[width];
        Arrays.fill(iArr, i);
        int[] iArr2 = new int[width];
        int i2 = 0;
        while (true) {
            if (i2 >= height) {
                z = true;
                break;
            }
            bitmap.getPixels(iArr2, 0, width, 0, i2, width, 1);
            if (!Arrays.equals(iArr, iArr2)) {
                z = false;
                break;
            }
            i2++;
            iArr2 = iArr2;
        }
        if (z) {
            Log.i("PixBlankDetector", "PixBlankDetector detect white screen , color : " + Integer.toHexString(i));
        }
        return z;
    }
}
