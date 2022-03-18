package com.ss.ttm.player;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import java.util.Objects;

public final class DummySurface extends Surface {
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final DummySurfaceThread thread;
    private boolean threadReleased;

    private static class DummySurfaceThread extends HandlerThread implements Handler.Callback {
        private EGLSurfaceTexture eglSurfaceTexture;
        private Handler handler;
        private Error initError;
        private RuntimeException initException;
        private DummySurface surface;

        public DummySurfaceThread() {
            super("dummySurface");
        }

        private void releaseInternal() {
            EGLSurfaceTexture eGLSurfaceTexture = this.eglSurfaceTexture;
            Objects.requireNonNull(eGLSurfaceTexture);
            eGLSurfaceTexture.release();
        }

        public void release() {
            Handler handler2 = this.handler;
            Objects.requireNonNull(handler2);
            handler2.sendEmptyMessage(2);
        }

        private void initInternal(int i) {
            boolean z;
            EGLSurfaceTexture eGLSurfaceTexture = this.eglSurfaceTexture;
            Objects.requireNonNull(eGLSurfaceTexture);
            eGLSurfaceTexture.init(i);
            SurfaceTexture surfaceTexture = this.eglSurfaceTexture.getSurfaceTexture();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.surface = new DummySurface(this, surfaceTexture, z);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    initInternal(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e);
                    this.initException = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                        this.initError = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    releaseInternal();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }

        public DummySurface init(int i) {
            boolean z;
            start();
            Handler handler2 = new Handler(getLooper(), this);
            this.handler = handler2;
            this.eglSurfaceTexture = new EGLSurfaceTexture(handler2);
            synchronized (this) {
                z = false;
                this.handler.obtainMessage(1, i, 0).sendToTarget();
                while (this.surface == null && this.initException == null && this.initError == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.initException;
            if (runtimeException == null) {
                Error error = this.initError;
                if (error == null) {
                    DummySurface dummySurface = this.surface;
                    Objects.requireNonNull(dummySurface);
                    return dummySurface;
                }
                throw error;
            }
            throw runtimeException;
        }
    }

    private static void assertApiLevel17OrHigher() {
        if (Build.VERSION.SDK_INT < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    public void release() {
        super.release();
        synchronized (this.thread) {
            if (!this.threadReleased) {
                this.thread.release();
                this.threadReleased = true;
            }
        }
    }

    public static DummySurface newInstanceV17(boolean z) {
        int i;
        assertApiLevel17OrHigher();
        DummySurfaceThread dummySurfaceThread = new DummySurfaceThread();
        if (z) {
            i = secureMode;
        } else {
            i = 0;
        }
        return dummySurfaceThread.init(i);
    }

    private static int getSecureModeV24(Context context) {
        String eglQueryString;
        if ((Build.VERSION.SDK_INT < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content")) {
            return 0;
        }
        if (eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        boolean z;
        int i;
        synchronized (DummySurface.class) {
            z = true;
            if (!secureModeInitialized) {
                if (Build.VERSION.SDK_INT < 24) {
                    i = 0;
                } else {
                    i = getSecureModeV24(context);
                }
                secureMode = i;
                secureModeInitialized = true;
            }
            if (secureMode == 0) {
                z = false;
            }
        }
        return z;
    }

    private DummySurface(DummySurfaceThread dummySurfaceThread, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = dummySurfaceThread;
        this.secure = z;
    }
}
