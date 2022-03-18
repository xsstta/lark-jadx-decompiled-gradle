package com.ss.android.bytedcert.p1308f.p1309a.p1312c;

import android.opengl.GLES20;

/* renamed from: com.ss.android.bytedcert.f.a.c.a */
public class C28371a {
    /* renamed from: a */
    public static void m104064a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw new RuntimeException(str + ": glError 0x" + Integer.toHexString(glGetError));
        }
    }

    /* renamed from: a */
    public static int m104063a(int i, int i2, int[] iArr, int i3) {
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(i3, iArr[0]);
        GLES20.glTexParameterf(i3, 10240, 9729.0f);
        GLES20.glTexParameterf(i3, 10241, 9729.0f);
        GLES20.glTexParameterf(i3, 10242, 33071.0f);
        GLES20.glTexParameterf(i3, 10243, 33071.0f);
        GLES20.glTexImage2D(i3, 0, 6408, i, i2, 0, 6408, 5121, null);
        return iArr[0];
    }
}
