package org.webrtc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase10;
import org.webrtc.EglBase14;

public interface EglBase {
    public static final int[] CONFIG_PIXEL_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_PLAIN = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static final int[] CONFIG_RECORDABLE = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};
    public static final int[] CONFIG_RGBA = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
    public static final Object lock = new Object();

    public interface Context {
        long getNativeEglContext();
    }

    public interface EglContextChecker {
        void EglContextDestoryEnd();

        void EglContextDestoryStart();
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i, int i2);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j);

    /* renamed from: org.webrtc.EglBase$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void eglContextDestoryEnd() {
            EglBaseCheckerHelper.EglContextDestoryEnd();
        }

        public static void eglContextDestoryStart() {
            EglBaseCheckerHelper.EglContextDestoryStart();
        }

        public static EglBase create() {
            return create(null, EglBase.CONFIG_PLAIN);
        }

        public static void setEglContextChecker(EglContextChecker eglContextChecker) {
            EglBaseCheckerHelper.setEglContextChecker(eglContextChecker);
        }

        public static EglBase createEgl10(int[] iArr) {
            return new EglBase10(null, iArr);
        }

        public static EglBase createEgl14(int[] iArr) {
            return new EglBase14(null, iArr);
        }

        public static EglBase create(Context context) {
            return create(context, EglBase.CONFIG_PLAIN);
        }

        public static EglBase createEgl10(EGLContext eGLContext, int[] iArr) {
            return new EglBase10(new EglBase10.Context(eGLContext), iArr);
        }

        public static EglBase createEgl14(android.opengl.EGLContext eGLContext, int[] iArr) {
            return new EglBase14(new EglBase14.Context(eGLContext), iArr);
        }

        public static EglBase create(Context context, int[] iArr) {
            if (!EglBase14.isEGL14Supported() || (context != null && !(context instanceof EglBase14.Context))) {
                return new EglBase10((EglBase10.Context) context, iArr);
            }
            return new EglBase14((EglBase14.Context) context, iArr);
        }
    }
}
