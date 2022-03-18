package com.ss.android.medialib.p2999b;

import android.opengl.GLES20;
import android.util.Log;

/* renamed from: com.ss.android.medialib.b.a */
public class C59376a {

    /* renamed from: a */
    public static final float[] f147412a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: com.ss.android.medialib.b.a$a */
    public interface AbstractC59377a {
        /* renamed from: a */
        void mo202210a(double d);
    }

    /* renamed from: com.ss.android.medialib.b.a$b */
    public interface AbstractC59378b {
        /* renamed from: a */
        void mo202211a();

        /* renamed from: b */
        void mo202212b();

        /* renamed from: c */
        int mo202213c();
    }

    /* renamed from: com.ss.android.medialib.b.a$c */
    public interface AbstractC59379c {
        /* renamed from: a */
        void mo202214a(int i);
    }

    /* renamed from: a */
    public static int m230508a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        m230510a(36197, 9729, 33071);
        return iArr[0];
    }

    /* renamed from: a */
    public static void m230509a(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
    }

    /* renamed from: a */
    public static void m230511a(String str) {
        String str2;
        int glGetError = GLES20.glGetError();
        for (int i = 0; i < 32 && glGetError != 0; i++) {
            switch (glGetError) {
                case 1280:
                    str2 = "invalid enum";
                    break;
                case 1281:
                    str2 = "invalid value";
                    break;
                case 1282:
                    str2 = "invalid operation";
                    break;
                case 1283:
                case 1284:
                default:
                    str2 = "unknown error";
                    break;
                case 1285:
                    str2 = "out of memory";
                    break;
                case 1286:
                    str2 = "invalid framebuffer operation";
                    break;
            }
            Log.e("WIX", String.format("After tag \"%s\" glGetError %s(0x%x) ", str, str2, Integer.valueOf(glGetError)));
            glGetError = GLES20.glGetError();
        }
    }

    /* renamed from: a */
    private static void m230510a(int i, int i2, int i3) {
        GLES20.glTexParameteri(i, 10241, i2);
        GLES20.glTexParameteri(i, 10240, i2);
        GLES20.glTexParameteri(i, 10242, i3);
        GLES20.glTexParameteri(i, 10243, i3);
    }
}
