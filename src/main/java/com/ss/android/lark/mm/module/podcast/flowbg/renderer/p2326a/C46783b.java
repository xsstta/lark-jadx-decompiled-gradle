package com.ss.android.lark.mm.module.podcast.flowbg.renderer.p2326a;

import android.opengl.GLES20;
import android.util.Log;
import com.ss.android.lark.mm.p2288b.C45855f;

/* renamed from: com.ss.android.lark.mm.module.podcast.flowbg.renderer.a.b */
public class C46783b {
    /* renamed from: a */
    public static int m185396a(String str) {
        return m185395a(35633, str);
    }

    /* renamed from: b */
    public static int m185399b(String str) {
        return m185395a(35632, str);
    }

    /* renamed from: a */
    public static boolean m185398a(int i) {
        GLES20.glValidateProgram(i);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i, 35715, iArr, 0);
        Log.v("ShaderHelper", "Results of validating program: " + iArr[0] + "\nLog:" + GLES20.glGetProgramInfoLog(i));
        if (iArr[0] != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m185397a(String str, String str2) {
        int a = m185394a(m185396a(str), m185399b(str2));
        m185398a(a);
        return a;
    }

    /* renamed from: a */
    public static int m185394a(int i, int i2) {
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            C45855f.m181665d("ShaderHelper", "Could not create new program");
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, i);
        GLES20.glAttachShader(glCreateProgram, i2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        C45855f.m181662a("ShaderHelper", "Results of linking program:\n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        if (iArr[0] != 0) {
            return glCreateProgram;
        }
        GLES20.glDeleteProgram(glCreateProgram);
        C45855f.m181665d("ShaderHelper", "Linking of program failed");
        return 0;
    }

    /* renamed from: a */
    private static int m185395a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            C45855f.m181666e("ShaderHelper", "Could not create new shader");
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        C45855f.m181663b("ShaderHelper", "Results of compiling source:\n" + str + "\n:" + GLES20.glGetShaderInfoLog(glCreateShader));
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(glCreateShader);
            C45855f.m181666e("ShaderHelper", "Compilation of shader failed");
        }
        return glCreateShader;
    }
}
