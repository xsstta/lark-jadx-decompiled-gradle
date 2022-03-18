package com.ss.android.lark.mm.module.podcast.flowbg.renderer.p2326a;

import android.opengl.GLES20;

/* renamed from: com.ss.android.lark.mm.module.podcast.flowbg.renderer.a.a */
public class C46781a {

    /* renamed from: a */
    private final String f117727a = "FBOHelper";

    /* renamed from: b */
    private final int[] f117728b = {0, 0};

    /* renamed from: c */
    private final int[] f117729c = {0, 0};

    /* renamed from: d */
    private int f117730d = 1;

    /* renamed from: e */
    private final C46782a f117731e = new C46782a(0, "T-A");

    /* renamed from: f */
    private final C46782a f117732f = new C46782a(1, "T-B");

    /* renamed from: com.ss.android.lark.mm.module.podcast.flowbg.renderer.a.a$a */
    private class C46782a {

        /* renamed from: b */
        private int f117734b;

        /* renamed from: c */
        private String f117735c = "Target-A";

        /* renamed from: a */
        public int mo164389a() {
            return this.f117734b;
        }

        /* renamed from: a */
        public void mo164390a(int i) {
            this.f117734b = i;
        }

        /* renamed from: a */
        public void mo164391a(String str) {
            this.f117735c = str;
        }

        public C46782a(int i, String str) {
            mo164390a(i);
            mo164391a(str);
        }
    }

    /* renamed from: a */
    public int[] mo164383a() {
        return this.f117728b;
    }

    /* renamed from: f */
    public void mo164388f() {
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* renamed from: b */
    public int mo164384b() {
        return this.f117729c[this.f117731e.mo164389a()];
    }

    /* renamed from: c */
    public int mo164385c() {
        return this.f117729c[this.f117732f.mo164389a()];
    }

    /* renamed from: g */
    private void m185383g() {
        int[] iArr = this.f117728b;
        if (iArr[0] != 0) {
            GLES20.glDeleteFramebuffers(2, iArr, 0);
            GLES20.glDeleteTextures(2, this.f117729c, 0);
            this.f117728b[0] = 0;
        }
    }

    /* renamed from: d */
    public void mo164386d() {
        int a = this.f117731e.mo164389a();
        this.f117731e.mo164390a(this.f117732f.mo164389a());
        this.f117732f.mo164390a(a);
    }

    /* renamed from: e */
    public void mo164387e() {
        GLES20.glBindFramebuffer(36160, this.f117728b[this.f117731e.mo164389a()]);
    }

    /* renamed from: a */
    public void mo164382a(int i, int i2) {
        m185383g();
        GLES20.glGenFramebuffers(2, this.f117728b, 0);
        GLES20.glGenTextures(2, this.f117729c, 0);
        m185382a(this.f117731e.mo164389a(), i, i2);
        m185382a(this.f117732f.mo164389a(), i, i2);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* renamed from: a */
    private void m185382a(int i, int i2, int i3) {
        GLES20.glBindTexture(3553, this.f117729c[i]);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glGenerateMipmap(3553);
        GLES20.glBindFramebuffer(36160, this.f117728b[i]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f117729c[i], 0);
        GLES20.glClear(16640);
    }
}
