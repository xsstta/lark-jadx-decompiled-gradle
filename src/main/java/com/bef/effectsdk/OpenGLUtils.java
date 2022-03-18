package com.bef.effectsdk;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;

public class OpenGLUtils {

    /* renamed from: a */
    private static final String f7150a = String.format(Locale.US, "{%s: false}", "\"res\"");

    /* renamed from: a */
    public static void m9042a(Bitmap bitmap, String str) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x001b A[SYNTHETIC, Splitter:B:14:0x001b] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0022 A[SYNTHETIC, Splitter:B:21:0x0022] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap loadBitmap(java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x001f, all -> 0x0018 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x001f, all -> 0x0018 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x001f, all -> 0x0018 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x001f, all -> 0x0018 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            r1.close()     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            return r3
        L_0x0013:
            r3 = move-exception
            r0 = r1
            goto L_0x0019
        L_0x0016:
            goto L_0x0020
        L_0x0018:
            r3 = move-exception
        L_0x0019:
            if (r0 == 0) goto L_0x001e
            r0.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            throw r3
        L_0x001f:
            r1 = r0
        L_0x0020:
            if (r1 == 0) goto L_0x0025
            r1.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.OpenGLUtils.loadBitmap(java.lang.String):android.graphics.Bitmap");
    }

    public static String loadTexture(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            return f7150a;
        }
        int a = m9041a(decodeFile, -1, false);
        return String.format(Locale.US, "{%s: true, %s: %d, %s: %d, %s: %d}", "\"res\"", "\"width\"", Integer.valueOf(decodeFile.getWidth()), "\"height\"", Integer.valueOf(decodeFile.getHeight()), "\"textureId\"", Integer.valueOf(a));
    }

    static Bitmap loadBitmap(FileDescriptor fileDescriptor, long j, long j2) throws IOException {
        FileInputStream createInputStream = new AssetFileDescriptor(ParcelFileDescriptor.dup(fileDescriptor), j, j2).createInputStream();
        try {
            return BitmapFactory.decodeStream(createInputStream);
        } finally {
            createInputStream.close();
        }
    }

    /* renamed from: a */
    public static int m9041a(Bitmap bitmap, int i, boolean z) {
        if (bitmap == null) {
            return -1;
        }
        int[] iArr = new int[1];
        if (i == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            iArr[0] = i;
        }
        if (z) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    public static void byte2Bitmap(byte[] bArr, int i, int i2, String str) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(-16776961);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        m9042a(createBitmap, str);
    }

    public static Bitmap loadBitmap(byte[] bArr, int i, int i2, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (Build.VERSION.SDK_INT >= 19) {
            options.inPremultiplied = z;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
        if (decodeByteArray == null || decodeByteArray.getConfig() == Bitmap.Config.ARGB_8888) {
            return decodeByteArray;
        }
        return decodeByteArray.copy(Bitmap.Config.ARGB_8888, true);
    }
}
