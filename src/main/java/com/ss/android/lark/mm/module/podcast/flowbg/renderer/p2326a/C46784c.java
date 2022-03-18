package com.ss.android.lark.mm.module.podcast.flowbg.renderer.p2326a;

import android.content.Context;
import android.opengl.GLES20;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.podcast.flowbg.renderer.p2327b.C46788b;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.lark.mm.module.podcast.flowbg.renderer.a.c */
public class C46784c {

    /* renamed from: c */
    private static ByteBuffer f117736c;

    /* renamed from: d */
    private static ByteBuffer f117737d;

    /* renamed from: a */
    private int f117738a;

    /* renamed from: b */
    private int f117739b;

    /* renamed from: e */
    private int f117740e;

    /* renamed from: f */
    private int f117741f;

    /* renamed from: g */
    private int f117742g;

    /* renamed from: h */
    private int f117743h;

    /* renamed from: i */
    private int f117744i;

    /* renamed from: j */
    private int f117745j;

    /* renamed from: k */
    private int f117746k;

    /* renamed from: l */
    private int f117747l;

    /* renamed from: m */
    private int f117748m;

    /* renamed from: n */
    private int f117749n;

    /* renamed from: o */
    private int f117750o;

    /* renamed from: p */
    private final int[] f117751p = new int[32];

    /* renamed from: q */
    private final C46781a f117752q = new C46781a();

    /* renamed from: a */
    private void m185400a() {
        m185402c();
        m185401b();
        m185403d();
    }

    /* renamed from: d */
    private void m185403d() {
        C46786e.m185410a(this.f117740e);
        C46786e.m185410a(this.f117741f);
        C46786e.m185410a(this.f117744i);
        C46786e.m185410a(this.f117745j);
    }

    /* renamed from: b */
    private void m185401b() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8);
        f117736c = allocateDirect;
        allocateDirect.put(new byte[]{1, -1, -1, -1, 1, 1, -1, 1}).position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(8);
        f117737d = allocateDirect2;
        allocateDirect2.put(new byte[]{1, 0, 0, 0, 1, 1, 0, 1}).position(0);
    }

    /* renamed from: c */
    private void m185402c() {
        this.f117740e = GLES20.glGetAttribLocation(this.f117738a, "a_position");
        this.f117741f = GLES20.glGetAttribLocation(this.f117738a, "a_texcoord");
        this.f117744i = GLES20.glGetAttribLocation(this.f117739b, "a_position");
        this.f117745j = GLES20.glGetAttribLocation(this.f117739b, "a_texcoord");
        this.f117743h = GLES20.glGetUniformLocation(this.f117738a, "u_frame");
        this.f117742g = GLES20.glGetUniformLocation(this.f117738a, "u_resolution");
        this.f117749n = GLES20.glGetUniformLocation(this.f117739b, "u_backbuffer");
        this.f117747l = GLES20.glGetUniformLocation(this.f117739b, "u_resolution");
        this.f117746k = GLES20.glGetUniformLocation(this.f117739b, "u_time");
        this.f117748m = GLES20.glGetUniformLocation(this.f117739b, "u_mouse");
        this.f117750o = GLES20.glGetUniformLocation(this.f117739b, "u_saturation");
    }

    public C46784c(Context context, int i, int i2) {
        if (this.f117738a != 0) {
            this.f117738a = 0;
        }
        if (this.f117739b != 0) {
            this.f117739b = 0;
        }
        this.f117739b = C46783b.m185397a(C46788b.m185413a(context, i), C46788b.m185413a(context, i2));
        this.f117738a = C46783b.m185397a(C46788b.m185413a(context, i), C46788b.m185413a(context, R.raw.finalpass));
        m185400a();
    }

    /* renamed from: a */
    public void mo164392a(float f, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, float f2) {
        if (this.f117738a == 0 || this.f117739b == 0) {
            GLES20.glClear(16640);
            return;
        }
        if (this.f117752q.mo164383a()[0] == 0) {
            this.f117752q.mo164382a((int) fArr[0], (int) fArr[1]);
        }
        GLES20.glUseProgram(this.f117739b);
        C46786e.m185411a(this.f117744i, f117736c);
        C46786e.m185411a(this.f117745j, f117737d);
        int i = this.f117746k;
        if (i > -1) {
            GLES20.glUniform1f(i, f);
        }
        int i2 = this.f117747l;
        if (i2 > -1) {
            GLES20.glUniform2fv(i2, 1, fArr, 0);
        }
        int i3 = this.f117748m;
        if (i3 > -1) {
            GLES20.glUniform2fv(i3, 1, fArr3, 0);
        }
        if (f2 > -1.0f) {
            GLES20.glUniform1f(this.f117750o, f2);
        }
        GLES20.glViewport(0, 0, (int) fArr[0], (int) fArr[1]);
        C46785d.m185409b();
        int i4 = this.f117749n;
        if (i4 > -1) {
            C46785d.m185407a(i4, this.f117752q.mo164385c());
        }
        if (iArr != null) {
            for (int i5 = 0; i5 < iArr.length; i5++) {
                int[] iArr2 = this.f117751p;
                int i6 = this.f117739b;
                iArr2[i5] = GLES20.glGetUniformLocation(i6, "u_tex" + i5);
                C46785d.m185407a(this.f117751p[i5], iArr[i5]);
            }
        }
        this.f117752q.mo164387e();
        GLES20.glDrawArrays(5, 0, 4);
        this.f117752q.mo164388f();
        GLES20.glUseProgram(this.f117738a);
        C46786e.m185411a(this.f117740e, f117736c);
        C46786e.m185411a(this.f117741f, f117737d);
        GLES20.glUniform2fv(this.f117742g, 1, fArr2, 0);
        GLES20.glViewport(0, 0, (int) fArr2[0], (int) fArr2[1]);
        int i7 = this.f117743h;
        if (i7 > -1) {
            C46785d.m185407a(i7, this.f117752q.mo164384b());
        }
        GLES20.glClear(16384);
        GLES20.glDrawArrays(5, 0, 4);
        this.f117752q.mo164386d();
    }
}
