package com.ss.android.lark.mm.module.podcast.flowbg.renderer.p2326a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.ss.android.lark.mm.p2288b.C45855f;

/* renamed from: com.ss.android.lark.mm.module.podcast.flowbg.renderer.a.d */
public class C46785d {

    /* renamed from: a */
    public static int f117753a;

    /* renamed from: b */
    private static int[] f117754b;

    /* renamed from: b */
    public static void m185409b() {
        f117753a = 0;
    }

    /* renamed from: a */
    public static void m185406a() {
        int[] iArr = f117754b;
        if (iArr != null && iArr[0] != 1) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
        }
    }

    /* renamed from: a */
    public static int[] m185408a(Context context, Bitmap bitmap) {
        m185406a();
        int[] iArr = new int[1];
        f117754b = iArr;
        GLES20.glGenTextures(1, iArr, 0);
        for (int i = 0; i < 1; i++) {
            m185405a(context, bitmap, f117754b[i]);
        }
        return f117754b;
    }

    /* renamed from: a */
    public static void m185407a(int i, int i2) {
        int i3;
        if (i >= 0 && (i3 = f117753a) < 32) {
            GLES20.glUniform1i(i, i3);
            GLES20.glActiveTexture(f117753a + 33984);
            GLES20.glBindTexture(3553, i2);
            f117753a++;
        }
    }

    /* renamed from: a */
    public static int m185405a(Context context, Bitmap bitmap, int i) {
        C45855f.m181666e("TextureHelper", "textId:" + i);
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexParameteri(3553, 10242, 33648);
        GLES20.glTexParameteri(3553, 10243, 33648);
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        GLUtils.texImage2D(3553, 0, 6408, createBitmap, 5121, 0);
        GLES20.glGenerateMipmap(3553);
        createBitmap.recycle();
        GLES20.glBindTexture(3553, 0);
        return i;
    }
}
