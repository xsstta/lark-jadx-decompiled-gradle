package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C23211b;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.p1003a.C23217b;
import com.google.zxing.qrcode.p1003a.C23218c;
import com.google.zxing.qrcode.p1003a.C23222f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.zxing.qrcode.b */
public final class C23223b {
    /* renamed from: a */
    public C23211b mo80542a(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        HashMap hashMap = new HashMap();
        hashMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        return mo80543a(str, barcodeFormat, i, i2, hashMap);
    }

    /* renamed from: a */
    private static C23211b m84145a(C23222f fVar, int i, int i2, int i3) {
        C23217b a = fVar.mo80535a();
        if (a != null) {
            int b = a.mo80532b();
            int a2 = a.mo80528a();
            int i4 = i3 * 2;
            int i5 = b + i4;
            int i6 = i4 + a2;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (b * min)) / 2;
            int i8 = (max2 - (a2 * min)) / 2;
            C23211b bVar = new C23211b(max, max2);
            int i9 = 0;
            while (i9 < a2) {
                int i10 = i7;
                int i11 = 0;
                while (i11 < b) {
                    if (a.mo80527a(i11, i9) == 1) {
                        bVar.mo80495a(i10, i8, min, min);
                    }
                    i11++;
                    i10 += min;
                }
                i9++;
                i8 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C23211b mo80543a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + barcodeFormat);
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
            int i3 = 4;
            if (map != null) {
                if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                    errorCorrectionLevel = ErrorCorrectionLevel.valueOf(map.get(EncodeHintType.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(EncodeHintType.MARGIN)) {
                    i3 = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
                }
            }
            return m84145a(C23218c.m84094a(str, errorCorrectionLevel, map), i, i2, i3);
        }
    }
}
