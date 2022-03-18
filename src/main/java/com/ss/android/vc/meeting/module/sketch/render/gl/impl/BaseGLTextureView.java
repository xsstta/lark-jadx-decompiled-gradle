package com.ss.android.vc.meeting.module.sketch.render.gl.impl;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.util.AttributeSet;
import android.view.TextureView;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.sketch.render.gl.util.GLUtils;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

public class BaseGLTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public static final RectF sContentBound = new RectF();
    public static final Object sContentCoundMutex = new Object();
    public static final GLThreadManager sGLThreadManager = new GLThreadManager();
    public int mDebugFlags;
    private boolean mDetached;
    public EGLConfigChooser mEGLConfigChooser;
    public int mEGLContextClientVersion;
    public EGLContextFactory mEGLContextFactory;
    public EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
    private GLThread mGLThread;
    public GLWrapper mGLWrapper;
    public boolean mPreserveEGLContextOnPause;
    public Renderer mRenderer;
    private final WeakReference<BaseGLTextureView> mThisWeakRef = new WeakReference<>(this);

    public interface EGLConfigChooser {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    public interface EGLContextFactory {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    public interface EGLWindowSurfaceFactory {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    public interface GLWrapper {
        GL wrap(GL gl);
    }

    public interface Renderer {
        void onContentBoundChanged(RectF rectF);

        void onDrawFrame(GL10 gl10);

        void onSurfaceChanged(GL10 gl10, int i, int i2);

        void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);
    }

    private static class DefaultWindowSurfaceFactory implements EGLWindowSurfaceFactory {
        private DefaultWindowSurfaceFactory() {
        }

        @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                C60700b.m235864f("[Sketch] [BaseGLTextureView]", "[createWindowSurface]", e.toString());
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class EglHelper {
        EGL10 mEgl;
        EGLConfig mEglConfig;
        EGLContext mEglContext;
        EGLDisplay mEglDisplay;
        EGLSurface mEglSurface;
        private WeakReference<BaseGLTextureView> mGLSurfaceViewWeakRef;

        public void destroySurface() {
            destroySurfaceImp();
        }

        public int swap() {
            if (!this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
                return this.mEgl.eglGetError();
            }
            return 12288;
        }

        private void destroySurfaceImp() {
            EGLSurface eGLSurface = this.mEglSurface;
            if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                this.mEgl.eglMakeCurrent(this.mEglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                BaseGLTextureView baseGLTextureView = this.mGLSurfaceViewWeakRef.get();
                if (baseGLTextureView != null) {
                    baseGLTextureView.mEGLWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
                }
                this.mEglSurface = null;
            }
        }

        /* access modifiers changed from: package-private */
        public GL createGL() {
            GL gl = this.mEglContext.getGL();
            BaseGLTextureView baseGLTextureView = this.mGLSurfaceViewWeakRef.get();
            if (baseGLTextureView == null) {
                return gl;
            }
            if (baseGLTextureView.mGLWrapper != null) {
                gl = baseGLTextureView.mGLWrapper.wrap(gl);
            }
            if ((baseGLTextureView.mDebugFlags & 3) == 0) {
                return gl;
            }
            int i = 0;
            LogWriter logWriter = null;
            if ((baseGLTextureView.mDebugFlags & 1) != 0) {
                i = 1;
            }
            if ((baseGLTextureView.mDebugFlags & 2) != 0) {
                logWriter = new LogWriter();
            }
            return GLDebugHelper.wrap(gl, i, logWriter);
        }

        public void finish() {
            if (this.mEglContext != null) {
                BaseGLTextureView baseGLTextureView = this.mGLSurfaceViewWeakRef.get();
                if (baseGLTextureView != null) {
                    baseGLTextureView.mEGLContextFactory.destroyContext(this.mEgl, this.mEglDisplay, this.mEglContext);
                }
                this.mEglContext = null;
            }
            EGLDisplay eGLDisplay = this.mEglDisplay;
            if (eGLDisplay != null) {
                this.mEgl.eglTerminate(eGLDisplay);
                this.mEglDisplay = null;
            }
        }

        public void start() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.mEgl = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.mEglDisplay = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.mEgl.eglInitialize(this.mEglDisplay, new int[2])) {
                    BaseGLTextureView baseGLTextureView = this.mGLSurfaceViewWeakRef.get();
                    if (baseGLTextureView == null) {
                        this.mEglConfig = null;
                        this.mEglContext = null;
                    } else {
                        this.mEglConfig = baseGLTextureView.mEGLConfigChooser.chooseConfig(this.mEgl, this.mEglDisplay);
                        this.mEglContext = baseGLTextureView.mEGLContextFactory.createContext(this.mEgl, this.mEglDisplay, this.mEglConfig);
                    }
                    EGLContext eGLContext = this.mEglContext;
                    if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                        this.mEglContext = null;
                        throwEglException("createContext");
                    }
                    this.mEglSurface = null;
                    return;
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }

        public boolean createSurface() {
            if (this.mEgl == null) {
                throw new RuntimeException("egl not initialized");
            } else if (this.mEglDisplay == null) {
                throw new RuntimeException("eglDisplay not initialized");
            } else if (this.mEglConfig != null) {
                destroySurfaceImp();
                BaseGLTextureView baseGLTextureView = this.mGLSurfaceViewWeakRef.get();
                if (baseGLTextureView != null) {
                    this.mEglSurface = baseGLTextureView.mEGLWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, baseGLTextureView.getSurfaceTexture());
                } else {
                    this.mEglSurface = null;
                }
                EGLSurface eGLSurface = this.mEglSurface;
                if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                    if (this.mEgl.eglGetError() == 12299) {
                        C60700b.m235864f("EglHelper", "[createSurface2]", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                    }
                    return false;
                }
                EGL10 egl10 = this.mEgl;
                EGLDisplay eGLDisplay = this.mEglDisplay;
                EGLSurface eGLSurface2 = this.mEglSurface;
                if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.mEglContext)) {
                    return true;
                }
                logEglErrorAsWarning("EglHelper", "eglMakeCurrent", this.mEgl.eglGetError());
                return false;
            } else {
                throw new RuntimeException("mEglConfig not initialized");
            }
        }

        public EglHelper(WeakReference<BaseGLTextureView> weakReference) {
            this.mGLSurfaceViewWeakRef = weakReference;
        }

        private void throwEglException(String str) {
            throwEglException(str, this.mEgl.eglGetError());
        }

        public static String formatEglError(String str, int i) {
            return str + " failed: " + GLUtils.getErrorString(i);
        }

        public static void throwEglException(String str, int i) {
            throw new RuntimeException(formatEglError(str, i));
        }

        public static void logEglErrorAsWarning(String str, String str2, int i) {
            C60700b.m235861e(str, "[logEglErrorAsWarning]", formatEglError(str2, i));
        }
    }

    /* access modifiers changed from: private */
    public static class GLThreadManager {
        private static String TAG = "GLThreadManager";

        private GLThreadManager() {
        }

        public void releaseEglContextLocked(GLThread gLThread) {
            notifyAll();
        }

        public synchronized void threadExiting(GLThread gLThread) {
            gLThread.mExited = true;
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public static class LogWriter extends Writer {
        private StringBuilder mBuilder = new StringBuilder();

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public void close() {
            flushBuilder();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            flushBuilder();
        }

        LogWriter() {
        }

        private void flushBuilder() {
            if (this.mBuilder.length() > 0) {
                C60700b.m235843a("[Sketch] [BaseGLTextureView]", "[finishBuilder]", this.mBuilder.toString());
                StringBuilder sb = this.mBuilder;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    flushBuilder();
                } else {
                    this.mBuilder.append(c);
                }
            }
        }
    }

    private void init() {
        setSurfaceTextureListener(this);
    }

    public int getDebugFlags() {
        return this.mDebugFlags;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.mPreserveEGLContextOnPause;
    }

    public int getRenderMode() {
        return this.mGLThread.getRenderMode();
    }

    public void onPause() {
        this.mGLThread.onPause();
    }

    public void onResume() {
        this.mGLThread.onResume();
    }

    public void requestRender() {
        this.mGLThread.requestRender();
    }

    /* access modifiers changed from: package-private */
    public static class GLThread extends Thread {
        private boolean mContentBoundChanged = true;
        private EglHelper mEglHelper;
        private ArrayList<Runnable> mEventQueue = new ArrayList<>();
        public boolean mExited;
        private Runnable mFinishDrawingRunnable = null;
        private boolean mFinishedCreatingEglSurface;
        private WeakReference<BaseGLTextureView> mGLSurfaceViewWeakRef;
        private boolean mHasSurface;
        private boolean mHaveEglContext;
        private boolean mHaveEglSurface;
        private int mHeight = 0;
        private boolean mPaused;
        private boolean mRenderComplete;
        private int mRenderMode = 1;
        private boolean mRequestPaused;
        private boolean mRequestRender = true;
        private boolean mShouldExit;
        private boolean mShouldReleaseEglContext;
        private boolean mSizeChanged = true;
        private boolean mSurfaceIsBad;
        private boolean mWaitingForSurface;
        private boolean mWantRenderNotification = false;
        private int mWidth = 0;

        private void stopEglSurfaceLocked() {
            if (this.mHaveEglSurface) {
                this.mHaveEglSurface = false;
                this.mEglHelper.destroySurface();
            }
        }

        public int getRenderMode() {
            int i;
            synchronized (BaseGLTextureView.sGLThreadManager) {
                i = this.mRenderMode;
            }
            return i;
        }

        public void requestReleaseEglContextLocked() {
            this.mShouldReleaseEglContext = true;
            BaseGLTextureView.sGLThreadManager.notifyAll();
        }

        public void requestRender() {
            synchronized (BaseGLTextureView.sGLThreadManager) {
                this.mRequestRender = true;
                BaseGLTextureView.sGLThreadManager.notifyAll();
            }
        }

        private boolean readyToDraw() {
            if (this.mPaused || !this.mHasSurface || this.mSurfaceIsBad || this.mWidth <= 0 || this.mHeight <= 0 || (!this.mRequestRender && this.mRenderMode != 1)) {
                return false;
            }
            return true;
        }

        private void stopEglContextLocked() {
            if (this.mHaveEglContext) {
                this.mEglHelper.finish();
                this.mHaveEglContext = false;
                BaseGLTextureView.sGLThreadManager.releaseEglContextLocked(this);
            }
        }

        public boolean ableToDraw() {
            if (!this.mHaveEglContext || !this.mHaveEglSurface || !readyToDraw()) {
                return false;
            }
            return true;
        }

        public void onPause() {
            synchronized (BaseGLTextureView.sGLThreadManager) {
                this.mRequestPaused = true;
                BaseGLTextureView.sGLThreadManager.notifyAll();
                while (!this.mExited && !this.mPaused) {
                    try {
                        BaseGLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onResume() {
            synchronized (BaseGLTextureView.sGLThreadManager) {
                this.mRequestPaused = false;
                this.mRequestRender = true;
                this.mRenderComplete = false;
                BaseGLTextureView.sGLThreadManager.notifyAll();
                while (!this.mExited && this.mPaused && !this.mRenderComplete) {
                    try {
                        BaseGLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void requestExitAndWait() {
            synchronized (BaseGLTextureView.sGLThreadManager) {
                this.mShouldExit = true;
                BaseGLTextureView.sGLThreadManager.notifyAll();
                while (!this.mExited) {
                    try {
                        BaseGLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void run() {
            setName("GLThread " + getId());
            try {
                guardedRun();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                BaseGLTextureView.sGLThreadManager.threadExiting(this);
                throw th;
            }
            BaseGLTextureView.sGLThreadManager.threadExiting(this);
        }

        public void surfaceCreated() {
            synchronized (BaseGLTextureView.sGLThreadManager) {
                this.mHasSurface = true;
                this.mFinishedCreatingEglSurface = false;
                BaseGLTextureView.sGLThreadManager.notifyAll();
                while (this.mWaitingForSurface && !this.mFinishedCreatingEglSurface && !this.mExited) {
                    try {
                        BaseGLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void surfaceDestroyed() {
            synchronized (BaseGLTextureView.sGLThreadManager) {
                this.mHasSurface = false;
                BaseGLTextureView.sGLThreadManager.notifyAll();
                while (!this.mWaitingForSurface && !this.mExited) {
                    try {
                        BaseGLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:102:0x019f, code lost:
            if (r18 == null) goto L_0x01ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ae, code lost:
            if (r11 == false) goto L_0x01f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b6, code lost:
            if (r25.mEglHelper.createSurface() == false) goto L_0x01cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b8, code lost:
            r11 = com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.sGLThreadManager;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ba, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x01bb, code lost:
            r16 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
            r25.mFinishedCreatingEglSurface = true;
            com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.sGLThreadManager.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c5, code lost:
            monitor-exit(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c6, code lost:
            r17 = r7;
            r11 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x01cd, code lost:
            r6 = com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.sGLThreadManager;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d1, code lost:
            monitor-enter(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
            r25.mFinishedCreatingEglSurface = true;
            r25.mSurfaceIsBad = true;
            com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.sGLThreadManager.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x01de, code lost:
            monitor-exit(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x01df, code lost:
            r0 = r5;
            r6 = r6;
            r7 = r7;
            r16 = r2;
            r17 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x01f0, code lost:
            r16 = r6;
            r17 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f4, code lost:
            if (r12 == false) goto L_0x0200;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x01f6, code lost:
            r9 = (javax.microedition.khronos.opengles.GL10) r25.mEglHelper.createGL();
            r12 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x0200, code lost:
            if (r10 == false) goto L_0x0239;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x0202, code lost:
            r0 = r25.mGLSurfaceViewWeakRef.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x020a, code lost:
            if (r0 == null) goto L_0x0235;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
            r0.mRenderer.onSurfaceCreated(r9, r25.mEglHelper.mEglConfig);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x0216, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x0217, code lost:
            r0.printStackTrace();
            r10 = new java.lang.StringBuilder();
            r21 = r8;
            r10.append("onSurfaceChanged error: ");
            r10.append(r0);
            com.ss.android.vc.common.p3077b.C60700b.m235864f("GLThread", "[guardedRun13]", r10.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x0235, code lost:
            r21 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0239, code lost:
            r21 = r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x026c  */
        /* JADX WARNING: Removed duplicated region for block: B:159:0x02a3 A[SYNTHETIC, Splitter:B:159:0x02a3] */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x02da  */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x02f8  */
        /* JADX WARNING: Removed duplicated region for block: B:185:0x02fd  */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x0300  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void guardedRun() throws java.lang.InterruptedException {
            /*
            // Method dump skipped, instructions count: 845
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.GLThread.guardedRun():void");
        }

        GLThread(WeakReference<BaseGLTextureView> weakReference) {
            this.mGLSurfaceViewWeakRef = weakReference;
        }

        public void queueEvent(Runnable runnable) {
            if (runnable != null) {
                synchronized (BaseGLTextureView.sGLThreadManager) {
                    this.mEventQueue.add(runnable);
                    BaseGLTextureView.sGLThreadManager.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }

        public void requestRenderAndNotify(Runnable runnable) {
            synchronized (BaseGLTextureView.sGLThreadManager) {
                if (Thread.currentThread() != this) {
                    this.mWantRenderNotification = true;
                    this.mRequestRender = true;
                    this.mRenderComplete = false;
                    this.mFinishDrawingRunnable = runnable;
                    BaseGLTextureView.sGLThreadManager.notifyAll();
                }
            }
        }

        public void setRenderMode(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (BaseGLTextureView.sGLThreadManager) {
                this.mRenderMode = i;
                BaseGLTextureView.sGLThreadManager.notifyAll();
            }
        }

        public void onWindowResize(int i, int i2) {
            synchronized (BaseGLTextureView.sGLThreadManager) {
                this.mWidth = i;
                this.mHeight = i2;
                this.mSizeChanged = true;
                this.mRequestRender = true;
                this.mRenderComplete = false;
                if (Thread.currentThread() != this) {
                    BaseGLTextureView.sGLThreadManager.notifyAll();
                    while (!this.mExited && !this.mPaused && !this.mRenderComplete && ableToDraw()) {
                        try {
                            BaseGLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }
    }

    private void checkRenderThreadState() {
        if (this.mGLThread != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() throws Throwable {
        try {
            GLThread gLThread = this.mGLThread;
            if (gLThread != null) {
                gLThread.requestExitAndWait();
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            gLThread.requestExitAndWait();
        }
        this.mDetached = true;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (this.mDetached && this.mRenderer != null) {
            GLThread gLThread = this.mGLThread;
            if (gLThread != null) {
                i = gLThread.getRenderMode();
            } else {
                i = 1;
            }
            GLThread gLThread2 = new GLThread(this.mThisWeakRef);
            this.mGLThread = gLThread2;
            if (i != 1) {
                gLThread2.setRenderMode(i);
            }
            this.mGLThread.start();
        }
        this.mDetached = false;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        requestRender();
    }

    public void setDebugFlags(int i) {
        this.mDebugFlags = i;
    }

    public void setGLWrapper(GLWrapper gLWrapper) {
        this.mGLWrapper = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.mPreserveEGLContextOnPause = z;
    }

    public void queueEvent(Runnable runnable) {
        this.mGLThread.queueEvent(runnable);
    }

    public void setEGLConfigChooser(EGLConfigChooser eGLConfigChooser) {
        checkRenderThreadState();
        this.mEGLConfigChooser = eGLConfigChooser;
    }

    public void setEGLContextClientVersion(int i) {
        checkRenderThreadState();
        this.mEGLContextClientVersion = i;
    }

    public void setEGLContextFactory(EGLContextFactory eGLContextFactory) {
        checkRenderThreadState();
        this.mEGLContextFactory = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        checkRenderThreadState();
        this.mEGLWindowSurfaceFactory = eGLWindowSurfaceFactory;
    }

    public void setRenderMode(int i) {
        this.mGLThread.setRenderMode(i);
    }

    private class DefaultContextFactory implements EGLContextFactory {
        private int EGL_CONTEXT_CLIENT_VERSION;

        private DefaultContextFactory() {
            this.EGL_CONTEXT_CLIENT_VERSION = 12440;
        }

        @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.EGL_CONTEXT_CLIENT_VERSION, BaseGLTextureView.this.mEGLContextClientVersion, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (BaseGLTextureView.this.mEGLContextClientVersion == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                C60700b.m235864f("DefaultContextFactory", "[destroyContext]", "display:" + eGLDisplay + " context: " + eGLContext);
                EglHelper.throwEglException("eglDestroyContext", egl10.eglGetError());
            }
        }
    }

    public BaseGLTextureView(Context context) {
        super(context);
        init();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C60700b.m235851b("[Sketch] [BaseGLTextureView]", "[onSurfaceTextureDestroyed]", "onSurfaceTextureDestroyed");
        this.mGLThread.surfaceDestroyed();
        return true;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new SimpleEGLConfigChooser(z));
    }

    private abstract class BaseConfigChooser implements EGLConfigChooser {
        protected int[] mConfigSpec;

        /* access modifiers changed from: package-private */
        public abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        private int[] filterConfigSpec(int[] iArr) {
            if (BaseGLTextureView.this.mEGLContextClientVersion != 2 && BaseGLTextureView.this.mEGLContextClientVersion != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[(length + 2)];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            if (BaseGLTextureView.this.mEGLContextClientVersion == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        public BaseConfigChooser(int[] iArr) {
            this.mConfigSpec = filterConfigSpec(iArr);
        }

        @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, null, 0, iArr)) {
                int i = iArr[0];
                if (i > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i];
                    if (egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, eGLConfigArr, i, iArr)) {
                        EGLConfig chooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
                        if (chooseConfig != null) {
                            return chooseConfig;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    public void onContentBoundChanged(RectF rectF) {
        C60700b.m235851b("[Sketch] [BaseGLTextureView]", "[onContentBoundChanged]", "bound = " + rectF);
        if (rectF != null) {
            synchronized (sContentCoundMutex) {
                sContentBound.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
        }
    }

    public void setRenderer(Renderer renderer) {
        checkRenderThreadState();
        if (this.mEGLConfigChooser == null) {
            this.mEGLConfigChooser = new SimpleEGLConfigChooser(true);
        }
        if (this.mEGLContextFactory == null) {
            this.mEGLContextFactory = new DefaultContextFactory();
        }
        if (this.mEGLWindowSurfaceFactory == null) {
            this.mEGLWindowSurfaceFactory = new DefaultWindowSurfaceFactory();
        }
        this.mRenderer = renderer;
        GLThread gLThread = new GLThread(this.mThisWeakRef);
        this.mGLThread = gLThread;
        gLThread.start();
    }

    private class SimpleEGLConfigChooser extends ComponentSizeChooser {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SimpleEGLConfigChooser(boolean r10) {
            /*
                r8 = this;
                com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.this = r9
                if (r10 == 0) goto L_0x0009
                r10 = 16
                r6 = 16
                goto L_0x000b
            L_0x0009:
                r10 = 0
                r6 = 0
            L_0x000b:
                r7 = 0
                r2 = 8
                r3 = 8
                r4 = 8
                r5 = 8
                r0 = r8
                r1 = r9
                r0.<init>(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.SimpleEGLConfigChooser.<init>(com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView, boolean):void");
        }
    }

    public BaseGLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C60700b.m235851b("[Sketch] [BaseGLTextureView]", "[onSurfaceTextureAvailable]", "onSurfaceTextureAvailable");
        this.mGLThread.surfaceCreated();
        this.mGLThread.onWindowResize(i, i2);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C60700b.m235851b("[Sketch] [BaseGLTextureView]", "[onSurfaceTextureSizeChanged]", "[w]" + i + "  [h]" + i2);
        this.mGLThread.onWindowResize(i, i2);
    }

    private class ComponentSizeChooser extends BaseConfigChooser {
        protected int mAlphaSize;
        protected int mBlueSize;
        protected int mDepthSize;
        protected int mGreenSize;
        protected int mRedSize;
        protected int mStencilSize;
        private int[] mValue = new int[1];

        @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.BaseConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int findConfigAttrib = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int findConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (findConfigAttrib >= this.mDepthSize && findConfigAttrib2 >= this.mStencilSize) {
                    int findConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int findConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int findConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int findConfigAttrib6 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (findConfigAttrib3 == this.mRedSize && findConfigAttrib4 == this.mGreenSize && findConfigAttrib5 == this.mBlueSize && findConfigAttrib6 == this.mAlphaSize) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue)) {
                return this.mValue[0];
            }
            return i2;
        }

        public ComponentSizeChooser(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.mRedSize = i;
            this.mGreenSize = i2;
            this.mBlueSize = i3;
            this.mAlphaSize = i4;
            this.mDepthSize = i5;
            this.mStencilSize = i6;
        }
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        setEGLConfigChooser(new ComponentSizeChooser(i, i2, i3, i4, i5, i6));
    }
}
