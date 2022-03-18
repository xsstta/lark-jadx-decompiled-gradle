package com.ss.android.medialib.p2999b;

import android.media.ExifInterface;
import java.io.IOException;

/* renamed from: com.ss.android.medialib.b.b */
public class C59380b {

    /* renamed from: a */
    private static final String f147413a = "b";

    /* renamed from: a */
    public static int m230517a(String str) {
        ExifInterface exifInterface;
        try {
            exifInterface = new ExifInterface(str);
        } catch (IOException e) {
            e.printStackTrace();
            exifInterface = null;
        }
        if (exifInterface == null) {
            return 0;
        }
        int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt == 6) {
            return 90;
        }
        if (attributeInt != 8) {
            return 0;
        }
        return 270;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071 A[SYNTHETIC, Splitter:B:30:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b A[SYNTHETIC, Splitter:B:35:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087 A[SYNTHETIC, Splitter:B:41:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091 A[SYNTHETIC, Splitter:B:46:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m230518a(android.graphics.Bitmap r4, java.lang.String r5, android.graphics.Bitmap.CompressFormat r6) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.p2999b.C59380b.m230518a(android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap$CompressFormat):void");
    }
}
