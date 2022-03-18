package com.ss.android.medialib;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.Locale;

public class OpenGLUtils {
    private static final String FAIL_RES = String.format(Locale.US, "{%s: false}", "\"res\"");

    public static String loadTexture(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            return FAIL_RES;
        }
        int loadTexture = loadTexture(decodeFile, -1, false);
        return String.format(Locale.US, "{%s: true, %s: %d, %s: %d, %s: %d}", "\"res\"", "\"width\"", Integer.valueOf(decodeFile.getWidth()), "\"height\"", Integer.valueOf(decodeFile.getHeight()), "\"textureId\"", Integer.valueOf(loadTexture));
    }

    public static int loadTexture(Bitmap bitmap, int i) {
        return loadTexture(bitmap, i, false);
    }

    public static int loadTexture(Bitmap bitmap, int i, boolean z) {
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
}
