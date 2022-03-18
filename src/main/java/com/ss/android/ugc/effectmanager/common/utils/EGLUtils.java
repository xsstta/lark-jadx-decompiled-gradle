package com.ss.android.ugc.effectmanager.common.utils;

import android.os.Build;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0015*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/utils/EGLUtils;", "", "()V", "egl", "Ljavax/microedition/khronos/egl/EGL10;", "eglConfig", "Ljavax/microedition/khronos/egl/EGLConfig;", "eglContext", "Ljavax/microedition/khronos/egl/EGLContext;", "eglDisplay", "Ljavax/microedition/khronos/egl/EGLDisplay;", "eglSurface", "Ljavax/microedition/khronos/egl/EGLSurface;", "<set-?>", "Ljavax/microedition/khronos/opengles/GL10;", "gl10", "getGl10", "()Ljavax/microedition/khronos/opengles/GL10;", "isMiPlay", "", "shareContext", "kotlin.jvm.PlatformType", "checkError", "", "destroy", "eglInit", "width", "", "height", "logOrThrowException", "message", "", "Companion", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.h.e */
public final class EGLUtils {

    /* renamed from: a */
    public static final Companion f151330a = new Companion(null);

    /* renamed from: b */
    private EGL10 f151331b;

    /* renamed from: c */
    private EGLDisplay f151332c;

    /* renamed from: d */
    private EGLConfig f151333d;

    /* renamed from: e */
    private EGLSurface f151334e;

    /* renamed from: f */
    private EGLContext f151335f;

    /* renamed from: g */
    private GL10 f151336g;

    /* renamed from: h */
    private final EGLContext f151337h = EGL10.EGL_NO_CONTEXT;

    /* renamed from: i */
    private final boolean f151338i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/utils/EGLUtils$Companion;", "", "()V", "COLOR_CHANNEL_BITS", "", "EGL_CONTEXT_CLIENT_VERSION", "TAG", "", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.common.h.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final GL10 mo207235a() {
        return this.f151336g;
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
        this.f151338i = Intrinsics.areEqual("mi play", str);
    }

    /* renamed from: b */
    public final void mo207237b() {
        EGL10 egl10 = this.f151331b;
        if (egl10 == null) {
            return;
        }
        if (!this.f151338i) {
            egl10.eglMakeCurrent(this.f151332c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(this.f151332c, this.f151334e);
            egl10.eglDestroyContext(this.f151332c, this.f151335f);
            egl10.eglTerminate(this.f151332c);
        } else if (this.f151332c != EGL10.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = this.f151334e;
            if (!(eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE)) {
                egl10.eglMakeCurrent(this.f151332c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                egl10.eglDestroySurface(this.f151332c, this.f151334e);
                this.f151334e = null;
            }
            EGLContext eGLContext = this.f151335f;
            if (eGLContext != null) {
                egl10.eglDestroyContext(this.f151332c, eGLContext);
                this.f151335f = null;
            }
            EGLDisplay eGLDisplay = this.f151332c;
            if (eGLDisplay != null) {
                egl10.eglTerminate(eGLDisplay);
                this.f151332c = null;
            }
        }
    }

    /* renamed from: a */
    private final void m235248a(String str) {
        if (!this.f151338i) {
            EPLog.m235180c("EGLUtils", "get gpu info error:" + str);
            return;
        }
        throw new RuntimeException(str);
    }

    /* renamed from: a */
    private final void m235249a(EGL10 egl10) {
        int eglGetError;
        if (egl10 != null && (eglGetError = egl10.eglGetError()) != 12288) {
            m235248a("EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    /* renamed from: a */
    public final void mo207236a(int i, int i2) {
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
            this.f151332c = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                m235248a("unable to get EGL10 display");
            }
            m235249a(egl10);
            if (!egl10.eglInitialize(this.f151332c, new int[2])) {
                m235248a("unable to initialize EGL10");
            }
            m235249a(egl10);
            int[] iArr2 = new int[1];
            if (!egl10.eglChooseConfig(this.f151332c, iArr, null, 0, iArr2)) {
                m235248a("eglChooseConfig failed");
            }
            m235249a(egl10);
            EGLConfig[] eGLConfigArr = new EGLConfig[iArr2[0]];
            if (!egl10.eglChooseConfig(this.f151332c, iArr, eGLConfigArr, iArr2[0], iArr2)) {
                m235248a("eglChooseConfig#2 failed");
            }
            m235249a(egl10);
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f151333d = eGLConfig;
            if (eGLConfig == null) {
                m235248a("Unable to find a suitable EGLConfig");
            }
            EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(this.f151332c, this.f151333d, new int[]{12375, i, 12374, i2, 12344});
            this.f151334e = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE || this.f151334e == null) {
                m235248a("surface was null");
            }
            m235249a(egl10);
            EGLContext eglCreateContext = egl10.eglCreateContext(this.f151332c, this.f151333d, this.f151337h, new int[]{12440, 2, 12344});
            this.f151335f = eglCreateContext;
            if (eglCreateContext == EGL10.EGL_NO_CONTEXT || this.f151335f == null) {
                m235248a("context was null");
            }
            m235249a(egl10);
            EGLDisplay eGLDisplay = this.f151332c;
            EGLSurface eGLSurface = this.f151334e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f151335f)) {
                m235248a("eglMakeCurrent failed");
            }
            m235249a(egl10);
            EGLContext eGLContext = this.f151335f;
            if (eGLContext != null) {
                gl = eGLContext.getGL();
            } else {
                gl = null;
            }
            if (gl instanceof GL10) {
                gl10 = gl;
            }
            this.f151336g = gl10;
            this.f151331b = egl10;
        }
    }
}
