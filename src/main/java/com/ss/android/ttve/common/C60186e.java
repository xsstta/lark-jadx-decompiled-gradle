package com.ss.android.ttve.common;

import android.opengl.GLES20;
import android.util.Log;
import com.ss.android.vesdk.C63929ab;

/* renamed from: com.ss.android.ttve.common.e */
public class C60186e {

    /* renamed from: a */
    private int f150205a = GLES20.glCreateProgram();

    /* renamed from: b */
    private C60187a f150206b;

    /* renamed from: c */
    private C60187a f150207c;

    /* renamed from: com.ss.android.ttve.common.e$a */
    public static class C60187a {

        /* renamed from: a */
        private int f150208a;

        /* renamed from: b */
        private int f150209b;

        public C60187a() {
        }

        /* renamed from: a */
        public int mo205533a() {
            return this.f150209b;
        }

        /* renamed from: b */
        public final void mo205535b() {
            int i = this.f150209b;
            if (i != 0) {
                GLES20.glDeleteShader(i);
                this.f150209b = 0;
            }
        }

        public C60187a(String str, int i) {
            mo205534a(str, i);
        }

        /* renamed from: a */
        public boolean mo205534a(String str, int i) {
            this.f150208a = i;
            int a = m233937a(i, str);
            this.f150209b = a;
            if (a == 0) {
                throw new AssertionError("Shader Create Failed!");
            } else if (a != 0) {
                return true;
            } else {
                C63929ab.m250980d("TEProgramObject", "glCreateShader Failed!...");
                return false;
            }
        }

        /* renamed from: a */
        public static int m233937a(int i, String str) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                C63929ab.m250980d("TEProgramObject", "before glCreateShader, glError: " + glGetError);
            }
            int glCreateShader = GLES20.glCreateShader(i);
            int glGetError2 = GLES20.glGetError();
            if (glGetError2 != 0) {
                C63929ab.m250980d("TEProgramObject", "after glCreateShader, glError: " + glGetError2);
            }
            if (glCreateShader != 0) {
                GLES20.glShaderSource(glCreateShader, str);
                GLES20.glCompileShader(glCreateShader);
                int glGetError3 = GLES20.glGetError();
                if (glGetError3 != 0) {
                    C63929ab.m250980d("TEProgramObject", "after glCompileShader, glError: " + glGetError3);
                }
                int[] iArr = {0};
                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                if (iArr[0] != 1) {
                    C63929ab.m250980d("TEProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                    GLES20.glDeleteShader(glCreateShader);
                    return 0;
                }
            }
            return glCreateShader;
        }
    }

    /* renamed from: b */
    public void mo205532b() {
        GLES20.glUseProgram(this.f150205a);
    }

    /* renamed from: a */
    public final void mo205528a() {
        int i = this.f150205a;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f150205a = 0;
        }
    }

    /* renamed from: a */
    public int mo205527a(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f150205a, str);
        if (glGetUniformLocation < 0) {
            Log.e("TEProgramObject", String.format("uniform name %s does not exist", str));
        }
        return glGetUniformLocation;
    }

    /* renamed from: a */
    public void mo205529a(String str, int i) {
        GLES20.glBindAttribLocation(this.f150205a, i, str);
    }

    /* renamed from: a */
    public boolean mo205530a(String str, String str2) {
        return mo205531a(str, str2, this.f150205a);
    }

    /* renamed from: a */
    public boolean mo205531a(String str, String str2, int i) {
        if (i == 0) {
            i = GLES20.glCreateProgram();
        }
        if (i == 0) {
            Log.e("TEProgramObject", "Invalid Program ID! Check if the context is binded!");
        }
        C60187a aVar = this.f150206b;
        if (aVar != null) {
            aVar.mo205535b();
        }
        C60187a aVar2 = this.f150207c;
        if (aVar2 != null) {
            aVar2.mo205535b();
        }
        this.f150206b = new C60187a(str, 35633);
        this.f150207c = new C60187a(str2, 35632);
        GLES20.glAttachShader(i, this.f150206b.mo205533a());
        GLES20.glAttachShader(i, this.f150207c.mo205533a());
        C60183b.m233925a("AttachShaders...");
        GLES20.glLinkProgram(i);
        int[] iArr = {0};
        GLES20.glGetProgramiv(i, 35714, iArr, 0);
        this.f150206b.mo205535b();
        this.f150207c.mo205535b();
        this.f150206b = null;
        this.f150207c = null;
        if (iArr[0] != 1) {
            Log.e("TEProgramObject", GLES20.glGetProgramInfoLog(i));
            return false;
        }
        int i2 = this.f150205a;
        if (!(i2 == i || i2 == 0)) {
            GLES20.glDeleteProgram(i2);
        }
        this.f150205a = i;
        return true;
    }
}
