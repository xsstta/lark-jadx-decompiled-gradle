package com.ss.android.ttve.common;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Log;

/* renamed from: com.ss.android.ttve.common.f */
public class C60188f {

    /* renamed from: a */
    private static final String f150210a = "f";

    /* renamed from: b */
    private static int f150211b = 8;

    /* renamed from: c */
    private static int f150212c = 8;

    /* renamed from: d */
    private static int f150213d = 8;

    /* renamed from: e */
    private static int f150214e = 8;

    /* renamed from: f */
    private EGLContext f150215f;

    /* renamed from: g */
    private EGLConfig f150216g;

    /* renamed from: h */
    private EGLDisplay f150217h;

    /* renamed from: i */
    private EGLSurface f150218i;

    C60188f() {
    }

    /* renamed from: a */
    public EGLContext mo205536a() {
        return this.f150215f;
    }

    /* renamed from: c */
    public void mo205540c() {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay = this.f150217h;
        if (eGLDisplay != null && (eGLSurface = this.f150218i) != null) {
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* renamed from: e */
    public boolean mo205542e() {
        return EGL14.eglSwapBuffers(this.f150217h, this.f150218i);
    }

    /* renamed from: d */
    public boolean mo205541d() {
        EGLDisplay eGLDisplay = this.f150217h;
        EGLSurface eGLSurface = this.f150218i;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f150215f)) {
            return true;
        }
        m233943a("eglMakeCurrent");
        return false;
    }

    /* renamed from: b */
    public void mo205539b() {
        Log.i(f150210a, "#### CGESharedGLContext Destroying context... ####");
        if (this.f150217h != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglMakeCurrent(this.f150217h, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f150217h, this.f150215f);
            EGL14.eglDestroySurface(this.f150217h, this.f150218i);
            EGL14.eglTerminate(this.f150217h);
        }
        this.f150217h = EGL14.EGL_NO_DISPLAY;
        this.f150218i = EGL14.EGL_NO_SURFACE;
        this.f150215f = EGL14.EGL_NO_CONTEXT;
    }

    /* renamed from: a */
    public void mo205537a(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f150217h, this.f150218i, j);
        m233943a("eglPresentationTimeANDROID");
    }

    /* renamed from: a */
    private void m233943a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            String str2 = f150210a;
            Log.e(str2, str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
            if (eglGetError == 12294) {
                Log.e(str2, "gl error EGL_BAD_CONTEXT");
            }
        }
    }

    /* renamed from: a */
    public static C60188f m233942a(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i) {
        C60188f fVar = new C60188f();
        fVar.f150215f = eGLContext;
        fVar.f150217h = eGLDisplay;
        fVar.f150218i = eGLSurface;
        int[] iArr = {12352, 4, 12324, f150211b, 12323, f150212c, 12322, f150213d, 12321, f150214e, 12339, i, 12344};
        if (i == 12610) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0);
        fVar.f150216g = eGLConfigArr[0];
        return fVar;
    }

    /* renamed from: a */
    public boolean mo205538a(int i, int i2, int i3, Object obj) {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay = this.f150217h;
        if (!(eGLDisplay == null || (eGLSurface = this.f150218i) == null)) {
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        }
        int[] iArr = {12375, i, 12374, i2, 12344};
        if (i3 != 2) {
            if (i3 != 4) {
                if (i3 != 12610) {
                    this.f150218i = EGL14.eglCreatePbufferSurface(this.f150217h, this.f150216g, iArr, 0);
                } else {
                    iArr[0] = 12344;
                    iArr[2] = 12344;
                }
            }
            this.f150218i = EGL14.eglCreateWindowSurface(this.f150217h, this.f150216g, obj, iArr, 0);
        } else {
            this.f150218i = EGL14.eglCreatePixmapSurface(this.f150217h, this.f150216g, 0, iArr, 0);
        }
        if (this.f150218i != EGL14.EGL_NO_SURFACE) {
            return mo205541d();
        }
        m233943a("eglCreateSurface");
        return false;
    }

    /* renamed from: a */
    public static C60188f m233941a(EGLContext eGLContext, int i, int i2, int i3, Object obj) {
        C60188f fVar = new C60188f();
        if (fVar.m233944b(eGLContext, i, i2, i3, obj)) {
            return fVar;
        }
        fVar.mo205539b();
        return null;
    }

    /* renamed from: b */
    private boolean m233944b(EGLContext eGLContext, int i, int i2, int i3, Object obj) {
        EGLContext eGLContext2;
        String str;
        if (eGLContext == null) {
            eGLContext2 = EGL14.EGL_NO_CONTEXT;
        } else {
            eGLContext2 = eGLContext;
        }
        int[] iArr = {12440, 2, 12344};
        int[] iArr2 = {12352, 4, 12324, f150211b, 12323, f150212c, 12322, f150213d, 12321, f150214e, 12339, i3, 12344};
        if (i3 == 12610) {
            iArr2[10] = 12610;
            iArr2[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = {0, 1};
        int[] iArr5 = {12375, i, 12374, i2, 12344};
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f150217h = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            m233943a("eglGetDisplay");
            return false;
        }
        int[] iArr6 = new int[2];
        if (!eGLContext2.equals(EGL14.EGL_NO_CONTEXT) && EGL14.eglQueryContext(this.f150217h, eGLContext2, 12440, iArr6, 0)) {
            iArr[1] = iArr6[0];
        }
        if (!EGL14.eglInitialize(this.f150217h, iArr4, 0, iArr4, 1)) {
            m233943a("eglInitialize");
            return false;
        }
        String str2 = f150210a;
        Log.i(str2, String.format("eglInitialize - major: %d, minor: %d", Integer.valueOf(iArr4[0]), Integer.valueOf(iArr4[1])));
        if (!EGL14.eglChooseConfig(this.f150217h, iArr2, 0, eGLConfigArr, 0, 1, iArr3, 0)) {
            m233943a("eglChooseConfig");
            return false;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(iArr3[0]);
        if (eGLContext2 == EGL14.EGL_NO_CONTEXT) {
            str = "NO";
        } else {
            str = "YES";
        }
        objArr[1] = str;
        Log.i(str2, String.format("Config num: %d, has sharedContext: %s", objArr));
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f150216g = eGLConfig;
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f150217h, eGLConfig, eGLContext2, iArr, 0);
        this.f150215f = eglCreateContext;
        if (eglCreateContext == EGL14.EGL_NO_CONTEXT) {
            m233943a("eglCreateContext");
            return false;
        }
        if (i3 != 2) {
            if (i3 != 4) {
                if (i3 != 12610) {
                    this.f150218i = EGL14.eglCreatePbufferSurface(this.f150217h, this.f150216g, iArr5, 0);
                } else {
                    iArr5[0] = 12344;
                    iArr5[2] = 12344;
                }
            }
            this.f150218i = EGL14.eglCreateWindowSurface(this.f150217h, this.f150216g, obj, iArr5, 0);
        } else {
            this.f150218i = EGL14.eglCreatePixmapSurface(this.f150217h, this.f150216g, 0, iArr5, 0);
        }
        if (this.f150218i == EGL14.EGL_NO_SURFACE) {
            m233943a("eglCreateSurface");
            return false;
        } else if (!mo205541d()) {
            return false;
        } else {
            int[] iArr7 = new int[1];
            EGL14.eglQueryContext(this.f150217h, this.f150215f, 12440, iArr7, 0);
            Log.i(str2, "EGLContext created, client version " + iArr7[0]);
            return true;
        }
    }
}
