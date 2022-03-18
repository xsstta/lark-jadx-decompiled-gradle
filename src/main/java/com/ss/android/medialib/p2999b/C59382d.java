package com.ss.android.medialib.p2999b;

import android.opengl.GLES20;
import com.ss.android.vesdk.C63929ab;

/* renamed from: com.ss.android.medialib.b.d */
public class C59382d {

    /* renamed from: a */
    private int f147421a = GLES20.glCreateProgram();

    /* renamed from: b */
    private C59383a f147422b;

    /* renamed from: c */
    private C59383a f147423c;

    /* renamed from: com.ss.android.medialib.b.d$a */
    public static class C59383a {

        /* renamed from: a */
        static final /* synthetic */ boolean f147424a = true;

        /* renamed from: b */
        private int f147425b;

        /* renamed from: c */
        private int f147426c;

        public C59383a() {
        }

        /* renamed from: a */
        public int mo202221a() {
            return this.f147426c;
        }

        /* renamed from: b */
        public final void mo202223b() {
            int i = this.f147426c;
            if (i != 0) {
                GLES20.glDeleteShader(i);
                this.f147426c = 0;
            }
        }

        public C59383a(String str, int i) {
            mo202222a(str, i);
        }

        /* renamed from: a */
        public static int m230527a(int i, String str) {
            int glCreateShader = GLES20.glCreateShader(i);
            if (glCreateShader != 0) {
                GLES20.glShaderSource(glCreateShader, str);
                GLES20.glCompileShader(glCreateShader);
                int[] iArr = {0};
                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                if (iArr[0] != 1) {
                    C63929ab.m250980d("ProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                    GLES20.glDeleteShader(glCreateShader);
                    return 0;
                }
            }
            return glCreateShader;
        }

        /* renamed from: a */
        public boolean mo202222a(String str, int i) {
            this.f147425b = i;
            int a = m230527a(i, str);
            this.f147426c = a;
            if (!f147424a && a == 0) {
                throw new AssertionError("Shader Create Failed!");
            } else if (a != 0) {
                return true;
            } else {
                C63929ab.m250980d("ProgramObject", "glCreateShader Failed!...");
                return false;
            }
        }
    }

    /* renamed from: b */
    public void mo202220b() {
        GLES20.glUseProgram(this.f147421a);
    }

    /* renamed from: a */
    public final void mo202216a() {
        int i = this.f147421a;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f147421a = 0;
        }
    }

    /* renamed from: a */
    public int mo202215a(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f147421a, str);
        if (glGetUniformLocation < 0) {
            C63929ab.m250980d("ProgramObject", String.format("uniform name %s does not exist", str));
        }
        return glGetUniformLocation;
    }

    /* renamed from: a */
    public void mo202217a(String str, int i) {
        GLES20.glBindAttribLocation(this.f147421a, i, str);
    }

    /* renamed from: a */
    public boolean mo202218a(String str, String str2) {
        return mo202219a(str, str2, this.f147421a);
    }

    /* renamed from: a */
    public boolean mo202219a(String str, String str2, int i) {
        if (i == 0) {
            i = GLES20.glCreateProgram();
        }
        if (i == 0) {
            C63929ab.m250980d("ProgramObject", "Invalid Program ID! Check if the context is binded!");
        }
        C59383a aVar = this.f147422b;
        if (aVar != null) {
            aVar.mo202223b();
        }
        C59383a aVar2 = this.f147423c;
        if (aVar2 != null) {
            aVar2.mo202223b();
        }
        this.f147422b = new C59383a(str, 35633);
        this.f147423c = new C59383a(str2, 35632);
        GLES20.glAttachShader(i, this.f147422b.mo202221a());
        GLES20.glAttachShader(i, this.f147423c.mo202221a());
        C59376a.m230511a("AttachShaders...");
        GLES20.glLinkProgram(i);
        int[] iArr = {0};
        GLES20.glGetProgramiv(i, 35714, iArr, 0);
        this.f147422b.mo202223b();
        this.f147423c.mo202223b();
        this.f147422b = null;
        this.f147423c = null;
        if (iArr[0] != 1) {
            C63929ab.m250980d("ProgramObject", GLES20.glGetProgramInfoLog(i));
            return false;
        }
        int i2 = this.f147421a;
        if (!(i2 == i || i2 == 0)) {
            GLES20.glDeleteProgram(i2);
        }
        this.f147421a = i;
        return true;
    }
}
