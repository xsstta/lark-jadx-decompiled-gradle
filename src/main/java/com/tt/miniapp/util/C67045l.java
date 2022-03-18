package com.tt.miniapp.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.ss.android.lark.utils.ImageUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.C69104g;

/* renamed from: com.tt.miniapp.util.l */
public class C67045l {

    /* renamed from: a */
    private static Map<String, Bitmap.CompressFormat> f169018a = new HashMap<String, Bitmap.CompressFormat>() {
        /* class com.tt.miniapp.util.C67045l.C670461 */

        {
            put("png", Bitmap.CompressFormat.PNG);
            put("jpg", Bitmap.CompressFormat.JPEG);
            put("jpeg", Bitmap.CompressFormat.JPEG);
            put("webp", Bitmap.CompressFormat.WEBP);
        }
    };

    /* renamed from: b */
    private static final String[] f169019b = {"_data"};

    /* renamed from: a */
    public static String m261303a(File file) {
        ImageUtils.ImageType a = ImageUtils.m224131a(file);
        String value = a.getValue();
        if (a != ImageUtils.ImageType.TYPE_UNKNOWN) {
            return value;
        }
        String d = C69104g.m265935d(file);
        return d.length() != 0 ? d : value;
    }

    /* renamed from: a */
    public static Bitmap.CompressFormat m261297a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return f169018a.get(C69104g.m265935d(new File(str)));
    }

    /* renamed from: a */
    public static Bitmap m261298a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= height) {
            width = height;
        }
        return Bitmap.createBitmap(bitmap, (bitmap.getWidth() - width) / 2, (bitmap.getHeight() - width) / 2, width, width);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m261302a(android.content.Context r7, int r8) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ all -> 0x0036 }
            android.net.Uri r2 = android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x0036 }
            java.lang.String[] r3 = com.tt.miniapp.util.C67045l.f169019b     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = "kind = 1 AND video_id = ?"
            r7 = 1
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ all -> 0x0036 }
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0036 }
            r8 = 0
            r5[r8] = r7     // Catch:{ all -> 0x0036 }
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0036 }
            if (r7 == 0) goto L_0x0030
            boolean r1 = r7.moveToFirst()     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0023
            goto L_0x0030
        L_0x0023:
            java.lang.String r8 = r7.getString(r8)     // Catch:{ all -> 0x002d }
            if (r7 == 0) goto L_0x002c
            r7.close()
        L_0x002c:
            return r8
        L_0x002d:
            r8 = move-exception
            r0 = r7
            goto L_0x0037
        L_0x0030:
            if (r7 == 0) goto L_0x0035
            r7.close()
        L_0x0035:
            return r0
        L_0x0036:
            r8 = move-exception
        L_0x0037:
            if (r0 == 0) goto L_0x003c
            r0.close()
        L_0x003c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.util.C67045l.m261302a(android.content.Context, int):java.lang.String");
    }

    /* renamed from: a */
    private static int m261296a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    public static Bitmap m261299a(File file, int i, int i2) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = m261296a(options, i, i2);
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (decodeFile == null) {
            return decodeFile;
        }
        Matrix matrix = new Matrix();
        int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
        if (attributeInt == 6) {
            matrix.postRotate(90.0f);
        } else if (attributeInt == 3) {
            matrix.postRotate(180.0f);
        } else if (attributeInt == 8) {
            matrix.postRotate(270.0f);
        }
        return Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
    }

    /* renamed from: a */
    public static File m261300a(File file, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, Context context) throws IOException {
        File b = C12791h.m52864b(context);
        return m261301a(file, i, i2, compressFormat, i3, new File(b, System.currentTimeMillis() + "." + C69104g.m265935d(file)).getAbsolutePath());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File m261301a(java.io.File r2, int r3, int r4, android.graphics.Bitmap.CompressFormat r5, int r6, java.lang.String r7) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            java.io.File r0 = r0.getParentFile()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0012
            r0.mkdirs()
        L_0x0012:
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0040 }
            r1.<init>(r7)     // Catch:{ all -> 0x0040 }
            android.graphics.Bitmap r3 = m261299a(r2, r3, r4)     // Catch:{ all -> 0x003d }
            if (r3 == 0) goto L_0x002d
            r3.compress(r5, r6, r1)     // Catch:{ all -> 0x003d }
            r1.flush()
            r1.close()
            java.io.File r2 = new java.io.File
            r2.<init>(r7)
            return r2
        L_0x002d:
            java.io.File r3 = new java.io.File
            r3.<init>(r7)
            r4 = 0
            com.bytedance.ee.lark.infra.foundation.utils.IOUtils.copyFile(r2, r3, r4)
            r1.flush()
            r1.close()
            return r3
        L_0x003d:
            r2 = move-exception
            r0 = r1
            goto L_0x0041
        L_0x0040:
            r2 = move-exception
        L_0x0041:
            if (r0 == 0) goto L_0x0049
            r0.flush()
            r0.close()
        L_0x0049:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.util.C67045l.m261301a(java.io.File, int, int, android.graphics.Bitmap$CompressFormat, int, java.lang.String):java.io.File");
    }
}
