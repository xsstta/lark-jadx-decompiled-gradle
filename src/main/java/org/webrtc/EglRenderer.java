package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlClearWorkaround;
import org.webrtc.RendererCommon;

public class EglRenderer implements VideoSink {
    private static GlClearWorkaround.WORKAROUND_STATUS enableGLWorkaround = GlClearWorkaround.WORKAROUND_STATUS.kStatusUnknown;
    private final GlTextureFrameBuffer bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
    private final Matrix drawMatrix = new Matrix();
    private RendererCommon.GlDrawer drawer;
    public EglBase eglBase;
    private final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();
    private final Object firstRenderLock = new Object();
    private final ArrayList<FirstVideoFrameRenderListener> firstVideoFrameListeners = new ArrayList<>();
    private final Object fpsReductionLock = new Object();
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final ArrayList<FrameListenerAndParams> frameListeners = new ArrayList<>();
    private final Object frameLock = new Object();
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private final GlClearWorkaround glClearWorkaround = new GlClearWorkaround();
    public final Object handlerLock = new Object();
    private boolean haveRenderFirstVideoFrame;
    private float layoutAspectRatio;
    private final Object layoutLock = new Object();
    public final Runnable logStatisticsRunnable = new Runnable() {
        /* class org.webrtc.EglRenderer.RunnableC701161 */

        public void run() {
            EglRenderer.this.logStatistics();
            synchronized (EglRenderer.this.handlerLock) {
                if (EglRenderer.this.renderThreadHandler != null) {
                    EglRenderer.this.renderThreadHandler.removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                    EglRenderer.this.renderThreadHandler.postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4));
                }
            }
        }
    };
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private volatile RendererCommon.ScalingType renderModel = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
    private long renderSwapBufferTimeNs;
    public Handler renderThreadHandler;
    private long renderTimeNs;
    private final Object statisticsLock = new Object();
    private long statisticsStartTimeNs;
    private boolean usePresentationTimeStamp;

    public interface FirstVideoFrameRenderListener {
        void onFirstVideoFrameRender();
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public void clearImage() {
        clearImage(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void pauseVideo() {
        setFpsReduction(BitmapDescriptorFactory.HUE_RED);
    }

    private void notifyFristRenderCallback() {
        synchronized (this.firstRenderLock) {
            Iterator<FirstVideoFrameRenderListener> it = this.firstVideoFrameListeners.iterator();
            while (it.hasNext()) {
                it.next().onFirstVideoFrameRender();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.webrtc.EglRenderer$3 */
    public static /* synthetic */ class C701183 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RendererCommon$ScalingType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.webrtc.RendererCommon$ScalingType[] r0 = org.webrtc.RendererCommon.ScalingType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.webrtc.EglRenderer.C701183.$SwitchMap$org$webrtc$RendererCommon$ScalingType = r0
                org.webrtc.RendererCommon$ScalingType r1 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = org.webrtc.EglRenderer.C701183.$SwitchMap$org$webrtc$RendererCommon$ScalingType     // Catch:{ NoSuchFieldError -> 0x001d }
                org.webrtc.RendererCommon$ScalingType r1 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = org.webrtc.EglRenderer.C701183.$SwitchMap$org$webrtc$RendererCommon$ScalingType     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.webrtc.RendererCommon$ScalingType r1 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.C701183.<clinit>():void");
        }
    }

    public void printStackTrace() {
        Thread thread;
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler == null) {
                thread = null;
            } else {
                thread = handler.getLooper().getThread();
            }
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    logW("EglRenderer stack trace:");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        logW(stackTraceElement.toString());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        public synchronized void run() {
            if (!(this.surface == null || EglRenderer.this.eglBase == null || EglRenderer.this.eglBase.hasSurface())) {
                Object obj = this.surface;
                if (obj instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                } else if (obj instanceof SurfaceTexture) {
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                } else {
                    throw new IllegalStateException("Invalid surface: " + this.surface);
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
        }

        private EglSurfaceCreation() {
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        org.webrtc.ThreadUtils.awaitUninterruptibly(r0);
        r0 = r5.frameLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1 = r5.pendingFrame;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r1.release();
        r5.pendingFrame = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        logD("Releasing done.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r5 = this;
            java.lang.String r0 = "Releasing."
            r5.logD(r0)
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.lang.Object r1 = r5.handlerLock
            monitor-enter(r1)
            android.os.Handler r2 = r5.renderThreadHandler     // Catch:{ all -> 0x0055 }
            if (r2 != 0) goto L_0x0019
            java.lang.String r0 = "Already released"
            r5.logD(r0)     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            return
        L_0x0019:
            java.lang.Runnable r3 = r5.logStatisticsRunnable     // Catch:{ all -> 0x0055 }
            r2.removeCallbacks(r3)     // Catch:{ all -> 0x0055 }
            android.os.Handler r2 = r5.renderThreadHandler     // Catch:{ all -> 0x0055 }
            org.webrtc.-$$Lambda$EglRenderer$dbZIvF-jDfWfAxWS6_OKLODul18 r3 = new org.webrtc.-$$Lambda$EglRenderer$dbZIvF-jDfWfAxWS6_OKLODul18     // Catch:{ all -> 0x0055 }
            r3.<init>(r0)     // Catch:{ all -> 0x0055 }
            r2.postAtFrontOfQueue(r3)     // Catch:{ all -> 0x0055 }
            android.os.Handler r2 = r5.renderThreadHandler     // Catch:{ all -> 0x0055 }
            android.os.Looper r2 = r2.getLooper()     // Catch:{ all -> 0x0055 }
            android.os.Handler r3 = r5.renderThreadHandler     // Catch:{ all -> 0x0055 }
            org.webrtc.-$$Lambda$EglRenderer$pvyzzKSwJYfQ10Yf4Pez7unf1S4 r4 = new org.webrtc.-$$Lambda$EglRenderer$pvyzzKSwJYfQ10Yf4Pez7unf1S4     // Catch:{ all -> 0x0055 }
            r4.<init>(r2)     // Catch:{ all -> 0x0055 }
            r3.post(r4)     // Catch:{ all -> 0x0055 }
            r2 = 0
            r5.renderThreadHandler = r2     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            org.webrtc.ThreadUtils.awaitUninterruptibly(r0)
            java.lang.Object r0 = r5.frameLock
            monitor-enter(r0)
            org.webrtc.VideoFrame r1 = r5.pendingFrame     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x004b
            r1.release()     // Catch:{ all -> 0x0052 }
            r5.pendingFrame = r2     // Catch:{ all -> 0x0052 }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "Releasing done."
            r5.logD(r0)
            return
        L_0x0052:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0055:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.release():void");
    }

    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            long j = nanoTime - this.statisticsStartTimeNs;
            if (j > 0) {
                float nanos = ((float) (((long) this.framesRendered) * TimeUnit.SECONDS.toNanos(1))) / ((float) j);
                logD("Duration: " + TimeUnit.NANOSECONDS.toMillis(j) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". Render fps: " + decimalFormat.format((double) nanos) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + ".");
                resetStatistics(nanoTime);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r1 == null) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1.hasSurface() != false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r1 = r22.fpsReductionLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = r22.minRenderPeriodNs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r2 != Long.MAX_VALUE) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        if (r2 > 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r2 = java.lang.System.nanoTime();
        r4 = r22.nextFrameTimeNs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        if (r2 >= r4) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        logD("Skipping frame rendering - fps reduction is active.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        r4 = r4 + r22.minRenderPeriodNs;
        r22.nextFrameTimeNs = r4;
        r22.nextFrameTimeNs = java.lang.Math.max(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r18 = java.lang.System.nanoTime();
        r1 = ((float) r0.getRotatedWidth()) / ((float) r0.getRotatedHeight());
        r2 = r22.layoutLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r3 = r22.layoutAspectRatio;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        if (r3 == com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006e, code lost:
        r2 = r22.eglBase.surfaceWidth();
        r4 = r22.eglBase.surfaceHeight();
        r5 = org.webrtc.EglRenderer.C701183.$SwitchMap$org$webrtc$RendererCommon$ScalingType[r22.renderModel.ordinal()];
        r8 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        if (r5 == 1) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r5 == 2) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r1 <= r3) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008f, code lost:
        r3 = r3 / r1;
        r20 = r2;
        r21 = r4;
        r1 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0097, code lost:
        r1 = r1 / r3;
        r20 = r2;
        r21 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        r20 = r2;
        r21 = r4;
        r1 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a3, code lost:
        r3 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a5, code lost:
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        r17 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ac, code lost:
        if (r1 <= r3) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ae, code lost:
        r1 = (int) (((float) r22.eglBase.surfaceWidth()) / r1);
        r21 = r1;
        r20 = r2;
        r17 = (r22.eglBase.surfaceHeight() - r1) / 2;
        r1 = 1.0f;
        r3 = 1.0f;
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cc, code lost:
        r1 = (int) (((float) r22.eglBase.surfaceHeight()) * r1);
        r20 = r1;
        r16 = (r22.eglBase.surfaceWidth() - r1) / 2;
        r21 = r4;
        r1 = 1.0f;
        r3 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        r22.drawMatrix.reset();
        r22.drawMatrix.preTranslate(0.5f, 0.5f);
        r2 = r22.drawMatrix;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fb, code lost:
        if (r22.mirrorHorizontally == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fd, code lost:
        r4 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0100, code lost:
        r4 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0104, code lost:
        if (r22.mirrorVertically == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0106, code lost:
        r8 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0108, code lost:
        r2.preScale(r4, r8);
        r22.drawMatrix.preScale(r3, r1);
        r22.drawMatrix.preTranslate(-0.5f, -0.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0117, code lost:
        if (r14 == false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0119, code lost:
        glClear(r22.eglBase.surfaceWidth(), r22.eglBase.surfaceHeight(), 16384, com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_RED, com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_RED, com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_RED, com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_RED);
        r6 = r14;
        r1 = true;
        r22.frameDrawer.drawFrame(r0, r22.drawer, r22.drawMatrix, r16, r17, r20, r21);
        r2 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014a, code lost:
        if (r22.usePresentationTimeStamp == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014c, code lost:
        r22.eglBase.swapBuffers(r0.getTimestampNs());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0156, code lost:
        r22.eglBase.swapBuffers();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015b, code lost:
        r4 = java.lang.System.nanoTime();
        r7 = r22.statisticsLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0161, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r22.framesRendered++;
        r22.renderTimeNs += r4 - r18;
        r22.renderSwapBufferTimeNs += r4 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0174, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0179, code lost:
        r6 = r14;
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017b, code lost:
        notifyCallbacks(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0180, code lost:
        if (r22.haveRenderFirstVideoFrame != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0182, code lost:
        notifyFristRenderCallback();
        r22.haveRenderFirstVideoFrame = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0187, code lost:
        r0.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0191, code lost:
        logD("Dropping frame - No surface");
        r0.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0199, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        r1 = r22.eglBase;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void renderFrameOnRenderThread() {
        /*
        // Method dump skipped, instructions count: 413
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.renderFrameOnRenderThread():void");
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void setRenderModel(RendererCommon.ScalingType scalingType) {
        this.renderModel = scalingType;
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    public void addFristFrameListener(FirstVideoFrameRenderListener firstVideoFrameRenderListener) {
        synchronized (this.firstRenderLock) {
            this.firstVideoFrameListeners.add(firstVideoFrameRenderListener);
        }
    }

    public /* synthetic */ void lambda$release$2$EglRenderer(Looper looper) {
        logD("Quitting render thread.");
        looper.quit();
    }

    public /* synthetic */ void lambda$releaseEglSurface$5$EglRenderer(Runnable runnable) {
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null) {
            eglBase2.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* access modifiers changed from: private */
    public static class HandlerWithExceptionCallback extends Handler {
        private final Runnable exceptionCallback;

        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                Logging.m268872e("EglRenderer", "Exception on EglRenderer thread", e);
                this.exceptionCallback.run();
                throw e;
            }
        }

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }
    }

    private void logD(String str) {
        Logging.m268870d("EglRenderer", this.name + str);
    }

    private void logW(String str) {
        Logging.m268874w("EglRenderer", this.name + str);
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0;
            this.renderSwapBufferTimeNs = 0;
        }
    }

    public void setLayoutAspectRatio(float f) {
        logD("setLayoutAspectRatio: " + f);
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setMirror(boolean z) {
        logD("setMirrorHorizontally: " + z);
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z;
        }
    }

    public void setMirrorVertically(boolean z) {
        logD("setMirrorVertically: " + z);
        synchronized (this.layoutLock) {
            this.mirrorVertically = z;
        }
    }

    public void releaseEglSurface(Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new Runnable(runnable) {
                    /* class org.webrtc.$$Lambda$EglRenderer$R0x5ZfZQGG1iI4I8rzhfrEW958 */
                    public final /* synthetic */ Runnable f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        EglRenderer.this.lambda$releaseEglSurface$5$EglRenderer(this.f$1);
                    }
                });
                return;
            }
            runnable.run();
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                if (Thread.currentThread() != this.renderThreadHandler.getLooper().getThread()) {
                    postToRenderThread(new Runnable(countDownLatch, frameListener) {
                        /* class org.webrtc.$$Lambda$EglRenderer$aWqqEBvqd4fvIvDBk5V3V8xkOJw */
                        public final /* synthetic */ CountDownLatch f$1;
                        public final /* synthetic */ EglRenderer.FrameListener f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            EglRenderer.this.lambda$removeFrameListener$4$EglRenderer(this.f$1, this.f$2);
                        }
                    });
                    ThreadUtils.awaitUninterruptibly(countDownLatch);
                    return;
                }
                throw new RuntimeException("removeFrameListener must not be called on the render thread.");
            }
        }
    }

    public EglRenderer(String str) {
        this.name = str;
        this.haveRenderFirstVideoFrame = false;
    }

    public /* synthetic */ void lambda$release$1$EglRenderer(CountDownLatch countDownLatch) {
        this.glClearWorkaround.release();
        GLES20.glUseProgram(0);
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        synchronized (this.firstRenderLock) {
            this.firstVideoFrameListeners.clear();
        }
        countDownLatch.countDown();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0038, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003a, code lost:
        r6 = r5.statisticsLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003c, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r5.framesDropped++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0042, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    @Override // org.webrtc.VideoSink
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrame(org.webrtc.VideoFrame r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.statisticsLock
            monitor-enter(r0)
            int r1 = r5.framesReceived     // Catch:{ all -> 0x004e }
            r2 = 1
            int r1 = r1 + r2
            r5.framesReceived = r1     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r5.handlerLock
            monitor-enter(r1)
            android.os.Handler r0 = r5.renderThreadHandler     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0018
            java.lang.String r6 = "Dropping frame - Not initialized or already released."
            r5.logD(r6)     // Catch:{ all -> 0x004b }
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            return
        L_0x0018:
            java.lang.Object r0 = r5.frameLock     // Catch:{ all -> 0x004b }
            monitor-enter(r0)     // Catch:{ all -> 0x004b }
            org.webrtc.VideoFrame r3 = r5.pendingFrame     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r4 == 0) goto L_0x0027
            r3.release()     // Catch:{ all -> 0x0048 }
        L_0x0027:
            r5.pendingFrame = r6     // Catch:{ all -> 0x0048 }
            r6.retain()     // Catch:{ all -> 0x0048 }
            android.os.Handler r6 = r5.renderThreadHandler     // Catch:{ all -> 0x0048 }
            org.webrtc.-$$Lambda$EglRenderer$im8Sa54i366ODPy-soB9Bg4O-w4 r3 = new org.webrtc.-$$Lambda$EglRenderer$im8Sa54i366ODPy-soB9Bg4O-w4     // Catch:{ all -> 0x0048 }
            r3.<init>()     // Catch:{ all -> 0x0048 }
            r6.post(r3)     // Catch:{ all -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)
            if (r4 == 0) goto L_0x0047
            java.lang.Object r6 = r5.statisticsLock
            monitor-enter(r6)
            int r0 = r5.framesDropped     // Catch:{ all -> 0x0044 }
            int r0 = r0 + r2
            r5.framesDropped = r0     // Catch:{ all -> 0x0044 }
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            goto L_0x0047
        L_0x0044:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            throw r0
        L_0x0047:
            return
        L_0x0048:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L_0x004b:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L_0x004e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.onFrame(org.webrtc.VideoFrame):void");
    }

    public void setFpsReduction(float f) {
        logD("setFpsReduction: " + f);
        synchronized (this.fpsReductionLock) {
            long j = this.minRenderPeriodNs;
            if (f <= BitmapDescriptorFactory.HUE_RED) {
                this.minRenderPeriodNs = Long.MAX_VALUE;
            } else {
                this.minRenderPeriodNs = (long) (((float) TimeUnit.SECONDS.toNanos(1)) / f);
            }
            if (this.minRenderPeriodNs != j) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        return TimeUnit.NANOSECONDS.toMicros(j / ((long) i)) + " us";
    }

    public /* synthetic */ void lambda$init$0$EglRenderer(EglBase.Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = EglBase.CC.createEgl10(iArr);
        } else {
            logD("EglBase.create shared context");
            this.eglBase = EglBase.CC.create(context, iArr);
        }
        this.glClearWorkaround.init();
    }

    public /* synthetic */ void lambda$removeFrameListener$4$EglRenderer(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        float f;
        float f2;
        if (!this.frameListeners.isEmpty()) {
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            Matrix matrix = this.drawMatrix;
            if (this.mirrorHorizontally) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            if (this.mirrorVertically) {
                f2 = -1.0f;
            } else {
                f2 = 1.0f;
            }
            matrix.preScale(f, f2);
            this.drawMatrix.preScale(1.0f, -1.0f);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
            while (it.hasNext()) {
                FrameListenerAndParams next = it.next();
                if (z || !next.applyFpsReduction) {
                    it.remove();
                    int rotatedWidth = (int) (next.scale * ((float) videoFrame.getRotatedWidth()));
                    int rotatedHeight = (int) (next.scale * ((float) videoFrame.getRotatedHeight()));
                    if (rotatedWidth == 0 || rotatedHeight == 0) {
                        next.listener.onFrame(null);
                    } else {
                        this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                        GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                        glClear(rotatedWidth, rotatedHeight, 16384, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                        this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                        GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                        GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                        GLES20.glBindFramebuffer(36160, 0);
                        GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                        Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(allocateDirect);
                        next.listener.onFrame(createBitmap);
                    }
                }
            }
        }
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    /* access modifiers changed from: private */
    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    public /* synthetic */ void lambda$addFrameListener$3$EglRenderer(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
        postToRenderThread(new Runnable(glDrawer, frameListener, f, z) {
            /* class org.webrtc.$$Lambda$EglRenderer$tlO7hICOsFJNVxM1OoLci4j1Lnc */
            public final /* synthetic */ RendererCommon.GlDrawer f$1;
            public final /* synthetic */ EglRenderer.FrameListener f$2;
            public final /* synthetic */ float f$3;
            public final /* synthetic */ boolean f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                EglRenderer.this.lambda$addFrameListener$3$EglRenderer(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    public void clearImage(float f, float f2, float f3, float f4) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.postAtFrontOfQueue(new Runnable(f, f2, f3, f4) {
                    /* class org.webrtc.$$Lambda$EglRenderer$YLaZEDK0BTvdaMEDE4KOForeEwY */
                    public final /* synthetic */ float f$1;
                    public final /* synthetic */ float f$2;
                    public final /* synthetic */ float f$3;
                    public final /* synthetic */ float f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                    }

                    public final void run() {
                        EglRenderer.this.lambda$clearImage$6$EglRenderer(this.f$1, this.f$2, this.f$3, this.f$4);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: clearSurfaceOnRenderThread */
    public void lambda$clearImage$6$EglRenderer(float f, float f2, float f3, float f4) {
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null && eglBase2.hasSurface()) {
            logD("clearSurface");
            glClear(this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), 16384, f, f2, f3, f4);
            this.eglBase.swapBuffers();
        }
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Initializing EglRenderer");
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z;
                HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot(this.name + "EglRenderer");
                new_android_os_HandlerThread_by_knot.start();
                HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(new_android_os_HandlerThread_by_knot.getLooper(), new Runnable() {
                    /* class org.webrtc.EglRenderer.RunnableC701172 */

                    public void run() {
                        synchronized (EglRenderer.this.handlerLock) {
                            EglRenderer.this.renderThreadHandler = null;
                        }
                    }
                });
                this.renderThreadHandler = handlerWithExceptionCallback;
                ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallback, new Runnable(context, iArr) {
                    /* class org.webrtc.$$Lambda$EglRenderer$miQc1F9Qqw0EkFhtMh5sNQ7uU */
                    public final /* synthetic */ EglBase.Context f$1;
                    public final /* synthetic */ int[] f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        EglRenderer.this.lambda$init$0$EglRenderer(this.f$1, this.f$2);
                    }
                });
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4));
            } else {
                throw new IllegalStateException(this.name + "Already initialized");
            }
        }
    }

    private void glClear(int i, int i2, int i3, float f, float f2, float f3, float f4) {
        if (enableGLWorkaround == GlClearWorkaround.WORKAROUND_STATUS.kStatusUnknown) {
            enableGLWorkaround = GlClearWorkaround.isNeedWorkaround();
        }
        if (enableGLWorkaround == GlClearWorkaround.WORKAROUND_STATUS.kStatusEnable) {
            this.glClearWorkaround.clear(i, i2, i3, f, f2, f3, f4, 1.0f, 8);
            return;
        }
        GLES20.glClearColor(f, f2, f3, f4);
        GLES20.glClear(16384);
    }
}
