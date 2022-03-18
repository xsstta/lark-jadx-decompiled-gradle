package com.ss.ugc.effectplatform.util;

import android.os.Build;
import bytekn.foundation.logger.Logger;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0015*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/ugc/effectplatform/util/EGLUtils;", "", "()V", "egl", "Ljavax/microedition/khronos/egl/EGL10;", "eglConfig", "Ljavax/microedition/khronos/egl/EGLConfig;", "eglContext", "Ljavax/microedition/khronos/egl/EGLContext;", "eglDisplay", "Ljavax/microedition/khronos/egl/EGLDisplay;", "eglSurface", "Ljavax/microedition/khronos/egl/EGLSurface;", "<set-?>", "Ljavax/microedition/khronos/opengles/GL10;", "gl10", "getGl10", "()Ljavax/microedition/khronos/opengles/GL10;", "isMiPlay", "", "shareContext", "kotlin.jvm.PlatformType", "checkError", "", "destroy", "eglInit", "width", "", "height", "logOrThrowException", "message", "", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.f */
public final class EGLUtils {

    /* renamed from: a */
    public static final Companion f165097a = new Companion(null);

    /* renamed from: b */
    private EGL10 f165098b;

    /* renamed from: c */
    private EGLDisplay f165099c;

    /* renamed from: d */
    private EGLConfig f165100d;

    /* renamed from: e */
    private EGLSurface f165101e;

    /* renamed from: f */
    private EGLContext f165102f;

    /* renamed from: g */
    private GL10 f165103g;

    /* renamed from: h */
    private final EGLContext f165104h = EGL10.EGL_NO_CONTEXT;

    /* renamed from: i */
    private final boolean f165105i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/ugc/effectplatform/util/EGLUtils$Companion;", "", "()V", "COLOR_CHANNEL_BITS", "", "EGL_CONTEXT_CLIENT_VERSION", "TAG", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.util.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final GL10 mo228298a() {
        return this.f165103g;
    }

    public EGLUtils() {
        String str;
        String str2 = Build.MODEL;
        if (str2 == null) {
            str = null;
        } else if (str2 != null) {
            str = str2.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.String).toLowerCase()");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        this.f165105i = Intrinsics.areEqual("mi play", str);
    }

    /* renamed from: b */
    public final void mo228300b() {
        EGL10 egl10 = this.f165098b;
        if (egl10 == null) {
            return;
        }
        if (!this.f165105i) {
            egl10.eglMakeCurrent(this.f165099c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(this.f165099c, this.f165101e);
            egl10.eglDestroyContext(this.f165099c, this.f165102f);
            egl10.eglTerminate(this.f165099c);
        } else if (this.f165099c != EGL10.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = this.f165101e;
            if (!(eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE)) {
                egl10.eglMakeCurrent(this.f165099c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                egl10.eglDestroySurface(this.f165099c, this.f165101e);
                this.f165101e = null;
            }
            EGLContext eGLContext = this.f165102f;
            if (eGLContext != null) {
                egl10.eglDestroyContext(this.f165099c, eGLContext);
                this.f165102f = null;
            }
            EGLDisplay eGLDisplay = this.f165099c;
            if (eGLDisplay != null) {
                egl10.eglTerminate(eGLDisplay);
                this.f165099c = null;
            }
        }
    }

    /* renamed from: a */
    private final void m257056a(String str) {
        if (!this.f165105i) {
            Logger bVar = Logger.f5760a;
            Logger.m7508a(bVar, "EGLUtils", "get gpu info error:" + str, null, 4, null);
            return;
        }
        throw new RuntimeException(str);
    }

    /* renamed from: a */
    private final void m257057a(EGL10 egl10) {
        int eglGetError;
        if (egl10 != null && (eglGetError = egl10.eglGetError()) != 12288) {
            m257056a("EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    /* renamed from: a */
    public final void mo228299a(int i, int i2) {
        GL gl;
        int[] iArr = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
        EGL egl = EGLContext.getEGL();
        GL10 gl10 = null;
        if (!(egl instanceof EGL10)) {
            egl = null;
        }
        EGL10 egl10 = (EGL10) egl;
        if (egl10 != null) {
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f165099c = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                m257056a("unable to get EGL10 display");
            }
            m257057a(egl10);
            if (!egl10.eglInitialize(this.f165099c, new int[2])) {
                m257056a("unable to initialize EGL10");
            }
            m257057a(egl10);
            int[] iArr2 = new int[1];
            if (!egl10.eglChooseConfig(this.f165099c, iArr, null, 0, iArr2)) {
                m257056a("eglChooseConfig failed");
            }
            m257057a(egl10);
            EGLConfig[] eGLConfigArr = new EGLConfig[iArr2[0]];
            if (!egl10.eglChooseConfig(this.f165099c, iArr, eGLConfigArr, iArr2[0], iArr2)) {
                m257056a("eglChooseConfig#2 failed");
            }
            m257057a(egl10);
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f165100d = eGLConfig;
            if (eGLConfig == null) {
                m257056a("Unable to find a suitable EGLConfig");
            }
            EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(this.f165099c, this.f165100d, new int[]{12375, i, 12374, i2, 12344});
            this.f165101e = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE || this.f165101e == null) {
                m257056a("surface was null");
            }
            m257057a(egl10);
            EGLContext eglCreateContext = egl10.eglCreateContext(this.f165099c, this.f165100d, this.f165104h, new int[]{12440, 2, 12344});
            this.f165102f = eglCreateContext;
            if (eglCreateContext == EGL10.EGL_NO_CONTEXT || this.f165102f == null) {
                m257056a("context was null");
            }
            m257057a(egl10);
            EGLDisplay eGLDisplay = this.f165099c;
            EGLSurface eGLSurface = this.f165101e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f165102f)) {
                m257056a("eglMakeCurrent failed");
            }
            m257057a(egl10);
            EGLContext eGLContext = this.f165102f;
            if (eGLContext != null) {
                gl = eGLContext.getGL();
            } else {
                gl = null;
            }
            if (gl instanceof GL10) {
                gl10 = gl;
            }
            this.f165103g = gl10;
            this.f165098b = egl10;
        }
    }
}
