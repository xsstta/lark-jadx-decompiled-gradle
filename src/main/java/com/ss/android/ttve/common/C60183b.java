package com.ss.android.ttve.common;

import android.opengl.GLES20;
import android.util.Log;

/* renamed from: com.ss.android.ttve.common.b */
public class C60183b {

    /* renamed from: a */
    public static final float[] f150200a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: a */
    public static void m233925a(String str) {
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
}
