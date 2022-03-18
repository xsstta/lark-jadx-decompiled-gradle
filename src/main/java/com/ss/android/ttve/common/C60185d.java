package com.ss.android.ttve.common;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;

/* renamed from: com.ss.android.ttve.common.d */
public class C60185d {

    /* renamed from: a */
    private EGLContext f150201a = EGL14.EGL_NO_CONTEXT;

    /* renamed from: b */
    private EGLSurface f150202b = EGL14.EGL_NO_SURFACE;

    /* renamed from: c */
    private EGLSurface f150203c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d */
    private EGLDisplay f150204d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b */
    public EGLContext mo205524b() {
        return this.f150201a;
    }

    /* renamed from: c */
    public EGLDisplay mo205525c() {
        return this.f150204d;
    }

    /* renamed from: d */
    public void mo205526d() {
        EGL14.eglMakeCurrent(this.f150204d, this.f150202b, this.f150203c, this.f150201a);
    }

    /* renamed from: a */
    public void mo205523a() {
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        this.f150201a = eglGetCurrentContext;
        if (eglGetCurrentContext.equals(EGL14.EGL_NO_CONTEXT)) {
            Log.e("TEEglStateSaver", "Saved EGL_NO_CONTEXT");
        }
        EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
        this.f150202b = eglGetCurrentSurface;
        if (eglGetCurrentSurface.equals(EGL14.EGL_NO_SURFACE)) {
            Log.e("TEEglStateSaver", "Saved EGL_NO_SURFACE");
        }
        EGLSurface eglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
        this.f150203c = eglGetCurrentSurface2;
        if (eglGetCurrentSurface2.equals(EGL14.EGL_NO_SURFACE)) {
            Log.e("TEEglStateSaver", "Saved EGL_NO_SURFACE");
        }
        EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        this.f150204d = eglGetCurrentDisplay;
        if (eglGetCurrentDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            Log.e("TEEglStateSaver", "Saved EGL_NO_DISPLAY");
        }
    }
}
