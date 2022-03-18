package com.ss.android.bytedcert.p1308f.p1309a.p1312c;

import android.opengl.GLES20;
import com.bytedance.common.utility.Logger;

/* renamed from: com.ss.android.bytedcert.f.a.c.b */
public class C28372b {
    /* renamed from: a */
    public static int m104065a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    /* renamed from: a */
    private static int m104066a(String str, int i) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Logger.m15170e("Load Shader Failed", "Compilation\n" + GLES20.glGetShaderInfoLog(glCreateShader));
        return 0;
    }

    /* renamed from: a */
    public static int m104067a(String str, String str2) {
        int[] iArr = new int[1];
        int a = m104066a(str, 35633);
        if (a == 0) {
            Logger.m15167d("Load Program", "Vertex Shader Failed");
            return 0;
        }
        int a2 = m104066a(str2, 35632);
        if (a2 == 0) {
            Logger.m15167d("Load Program", "Fragment Shader Failed");
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a);
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            Logger.m15167d("Load Program", "Linking Failed");
            return 0;
        }
        GLES20.glDeleteShader(a);
        GLES20.glDeleteShader(a2);
        return glCreateProgram;
    }
}
