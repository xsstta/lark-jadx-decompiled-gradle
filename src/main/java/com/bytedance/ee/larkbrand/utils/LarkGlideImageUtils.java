package com.bytedance.ee.larkbrand.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.p088b.C2311e;
import com.bumptech.glide.p082c.C2119c;
import java.io.File;

public final class LarkGlideImageUtils {

    public enum ImageType {
        TYPE_JPG("jpg"),
        TYPE_PNG("png"),
        TYPE_GIF("gif"),
        TYPE_TIFF("tiff"),
        TYPE_BMP("bmp"),
        TYPE_WEBP("webp"),
        TYPE_ICO("ico"),
        TYPE_UNKNOWN("unknown");
        
        private String value;

        public String getValue() {
            return this.value;
        }

        private ImageType(String str) {
            this.value = str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002e A[SYNTHETIC, Splitter:B:22:0x002e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.ee.larkbrand.utils.LarkGlideImageUtils.ImageType m54239a(java.io.File r3) {
        /*
            r0 = 12
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0019 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0019 }
            r2.read(r0)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r2.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0027
        L_0x0011:
            r3 = move-exception
            r1 = r2
            goto L_0x002c
        L_0x0014:
            r3 = move-exception
            r1 = r2
            goto L_0x001a
        L_0x0017:
            r3 = move-exception
            goto L_0x002c
        L_0x0019:
            r3 = move-exception
        L_0x001a:
            r3.printStackTrace()     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0027
            r1.close()
            goto L_0x0027
        L_0x0023:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0027:
            com.bytedance.ee.larkbrand.utils.LarkGlideImageUtils$ImageType r3 = m54240a(r0)
            return r3
        L_0x002c:
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0036:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.larkbrand.utils.LarkGlideImageUtils.m54239a(java.io.File):com.bytedance.ee.larkbrand.utils.LarkGlideImageUtils$ImageType");
    }

    /* renamed from: b */
    private static String m54242b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static ImageType m54240a(byte[] bArr) {
        String str;
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 0, bArr2, 0, 12);
        String b = m54242b(bArr2);
        if (b != null) {
            str = b.toUpperCase();
        } else {
            str = "";
        }
        if (str.contains("FFD8FF")) {
            return ImageType.TYPE_JPG;
        }
        if (str.contains("89504E47")) {
            return ImageType.TYPE_PNG;
        }
        if (str.contains("47494638")) {
            return ImageType.TYPE_GIF;
        }
        if (str.contains("49492A00") || str.contains("4D4D002A")) {
            return ImageType.TYPE_TIFF;
        }
        if (str.contains("424D")) {
            return ImageType.TYPE_BMP;
        }
        if (str.contains("524946461C57000057454250")) {
            return ImageType.TYPE_WEBP;
        }
        if (str.contains("00000100") || str.contains("00000200")) {
            return ImageType.TYPE_ICO;
        }
        return ImageType.TYPE_UNKNOWN;
    }

    /* renamed from: a */
    public static File m54241a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return C2311e.m9861a(ComponentCallbacks2C2115c.m9144a(context), 262144000).mo10722a(new C13379w(str, C2119c.m9172a()));
    }
}
