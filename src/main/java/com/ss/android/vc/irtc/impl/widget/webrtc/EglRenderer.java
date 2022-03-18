package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.ss.android.vc.irtc.C61064p;
import com.ss.android.vc.irtc.C61065q;
import com.ss.android.vc.irtc.impl.widget.IRecalBaseFrameListener;
import com.ss.android.vc.irtc.impl.widget.IVideoRenderListener;
import com.ss.android.vc.irtc.impl.widget.utils.EglRenderScaleUtil;
import com.ss.android.vc.irtc.impl.widget.utils.EnvUtils;
import com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.EglBase;

/* access modifiers changed from: package-private */
public class EglRenderer {
    public static boolean DEBUG;
    public static AtomicInteger renderCount = new AtomicInteger(0);
    public final String TAG = ("EglRenderer#" + this);
    private long currentTime = 0;
    private final Matrix drawMatrix = new Matrix();
    private RendererCommon.GlDrawer drawer;
    public EglBase eglBase;
    public final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();
    private final Object fpsReductionLock = new Object();
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final Object frameLock = new Object();
    private int framesDropped;
    private int framesReceived;
    public final Object handlerLock = new Object();
    public boolean hasEglInit = false;
    private float layoutAspectRatio;
    private final Object layoutLock = new Object();
    private float mBgColorA;
    private float mBgColorB;
    private float mBgColorG;
    private float mBgColorR;
    private boolean mIsAutoRenderMode = true;
    public boolean mIsEverDraw = false;
    private BvVideoFrame mLastVideoFrame;
    private IVideoRenderListener mListener;
    private IRecalBaseFrameListener mRecalBaseFrameListener;
    private final RenderInfo mRenderInfo = new RenderInfo();
    private EglRenderScaleUtil mScaleUtil = new EglRenderScaleUtil();
    private long minRenderPeriodNs;
    protected final String name;
    private long nextFrameTimeNs;
    private BvVideoFrame pendingFrame;
    private RendererCommon.ScalingType renderMode = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
    public Handler renderThreadHandler;
    private long startTime = 0;
    private final Object statisticsLock = new Object();
    private volatile int surfaceHeight;
    private volatile int surfaceWidth;

    public RenderInfo getRenderInfo() {
        return this.mRenderInfo;
    }

    public RectF getOrgRect() {
        return this.mScaleUtil.getOrgRect();
    }

    public void reset() {
        this.mScaleUtil.reset();
        postInvalidateRender();
    }

    public String toString() {
        return String.valueOf(hashCode());
    }

    public /* synthetic */ void lambda$releaseEglOnSurfaceSizeChanged$1$EglRenderer() {
        if (this.eglBase != null) {
            C61064p.m237485a(this.TAG, "[releaseEglOnSurfaceSizeChanged] detach and release");
            this.eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
    }

    public void postInvalidateRender() {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.ss.android.vc.irtc.impl.widget.webrtc.$$Lambda$EglRenderer$OdPTAoLdbYzBjOsypEJ1Hj_dqsw */

                    public final void run() {
                        EglRenderer.lambda$OdPTAoLdbYzBjOsypEJ1Hj_dqsw(EglRenderer.this);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer$2 */
    public static /* synthetic */ class C610502 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$android$vc$irtc$impl$widget$webrtc$RendererCommon$ScalingType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon$ScalingType[] r0 = com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.ScalingType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer.C610502.$SwitchMap$com$ss$android$vc$irtc$impl$widget$webrtc$RendererCommon$ScalingType = r0
                com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon$ScalingType r1 = com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer.C610502.$SwitchMap$com$ss$android$vc$irtc$impl$widget$webrtc$RendererCommon$ScalingType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon$ScalingType r1 = com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer.C610502.$SwitchMap$com$ss$android$vc$irtc$impl$widget$webrtc$RendererCommon$ScalingType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon$ScalingType r1 = com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer.C610502.<clinit>():void");
        }
    }

    public void releaseEglOnSurfaceSizeChanged() {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new Runnable() {
                    /* class com.ss.android.vc.irtc.impl.widget.webrtc.$$Lambda$EglRenderer$S5DIZDaMWkImtVQzslyTFXjNkOs */

                    public final void run() {
                        EglRenderer.this.lambda$releaseEglOnSurfaceSizeChanged$1$EglRenderer();
                    }
                });
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
                    if (!((Surface) obj).isValid()) {
                        C61064p.m237487c(EglRenderer.this.TAG, "[EglSurfaceCreation] run with invalid surface");
                        return;
                    }
                    C61064p.m237485a(EglRenderer.this.TAG, "[EglSurfaceCreation] run with surface");
                    try {
                        EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (Build.VERSION.SDK_INT == 28) {
                            String str = EglRenderer.this.TAG;
                            C61064p.m237487c(str, "[9.0]" + e.getMessage());
                            return;
                        }
                        throw e;
                    }
                } else if (obj instanceof SurfaceTexture) {
                    C61064p.m237485a(EglRenderer.this.TAG, "[EglSurfaceCreation] run with surface texture");
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                } else {
                    throw new IllegalStateException("Invalid surface: " + this.surface);
                }
                C61064p.m237485a(EglRenderer.this.TAG, "[EglSurfaceCreation] createSurface done");
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

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        android.opengl.GLES20.glClearColor(r7.mBgColorR, r7.mBgColorG, r7.mBgColorB, r7.mBgColorA);
        android.opengl.GLES20.glClear(16384);
        calDrawFrameViewPort(true);
        r7.eglBase.swapBuffers();
        r1 = r7.mListener;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        if (r1 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r2 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        if (r7.mIsEverDraw != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        r7.mIsEverDraw = true;
        r1.onBeginRender();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (r2.isTexture() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        com.ss.android.vc.irtc.C61064p.m237485a(r7.TAG, "[renderFrameOnRenderThread]Render with texture");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        com.ss.android.vc.irtc.C61064p.m237485a(r7.TAG, "[renderFrameOnRenderThread]Render with yuv array");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        r1.onRenderFrame();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
        if (r2 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0080, code lost:
        r7.mRenderInfo.statics(r2.getRenderTime());
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        r0 = com.ss.android.vc.irtc.impl.widget.utils.EnvUtils.getRtcConfig();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r0.f152927e == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        r0 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if ((r0 - r7.startTime) < 2000) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        com.ss.android.vc.irtc.C61064p.m237485a(r7.TAG, "[renderFrameOnRenderThread] render frame success");
        r7.startTime = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void renderFrameOnRenderThread() {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer.renderFrameOnRenderThread():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils.awaitUninterruptibly(r0);
        r0 = r5.frameLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = r5.pendingFrame;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        r1.release();
        r5.pendingFrame = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r5.mLastVideoFrame = null;
        r5.mRenderInfo.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer.release():void");
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void setAutoRenderMode(boolean z) {
        this.mIsAutoRenderMode = z;
    }

    public void setReCalBaseFrameListener(IRecalBaseFrameListener iRecalBaseFrameListener) {
        this.mRecalBaseFrameListener = iRecalBaseFrameListener;
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void setMaxScale(float f) {
        this.mScaleUtil.setMaxScale(f);
    }

    public void setRenderMode(RendererCommon.ScalingType scalingType) {
        this.renderMode = scalingType;
        this.mIsAutoRenderMode = false;
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
        this.mIsEverDraw = false;
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    public void createEglOnSurfaceSizeChanged(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    public void setListener(IVideoRenderListener iVideoRenderListener) {
        this.mListener = iVideoRenderListener;
        if (iVideoRenderListener == null) {
            C61064p.m237487c(this.TAG, "[setListener]Listener is null");
        }
    }

    public void setBgColor(int i) {
        float f = (((float) ((i >> 16) & 255)) * 1.0f) / 255.0f;
        setBgColor(f, (((float) ((i >> 8) & 255)) * 1.0f) / 255.0f, (((float) ((i >> 0) & 255)) * 1.0f) / 255.0f, (((float) ((i >> 24) & 255)) * 1.0f) / 255.0f);
    }

    public EglRenderer(String str) {
        this.name = str;
    }

    public /* synthetic */ void lambda$release$2$EglRenderer(CountDownLatch countDownLatch) {
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null) {
            eglBase2.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
            String str = this.TAG;
            C61064p.m237485a(str, "Egl-LifeCycle-Release: " + renderCount.decrementAndGet());
        }
        IVideoRenderListener iVideoRenderListener = this.mListener;
        if (this.mIsEverDraw && iVideoRenderListener != null) {
            C61064p.m237485a(this.TAG, "[release]onEndRender");
            iVideoRenderListener.onEndRender();
        }
        this.mIsEverDraw = false;
        countDownLatch.countDown();
    }

    public /* synthetic */ void lambda$releaseEglSurface$0$EglRenderer(Runnable runnable) {
        if (this.eglBase != null) {
            C61064p.m237485a(this.TAG, "[releaseEglSurface]Surface Destroyed");
            this.eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        synchronized (this.frameLock) {
            BvVideoFrame bvVideoFrame = this.pendingFrame;
            if (bvVideoFrame != null) {
                bvVideoFrame.release();
                this.pendingFrame = null;
            }
            this.mLastVideoFrame = null;
            this.mRenderInfo.reset();
        }
        if (runnable != null) {
            runnable.run();
        }
        IVideoRenderListener iVideoRenderListener = this.mListener;
        if (this.mIsEverDraw && iVideoRenderListener != null) {
            C61064p.m237485a(this.TAG, "[releaseEglSurface]onEndRender");
            iVideoRenderListener.onEndRender();
        }
        this.mIsEverDraw = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        r4.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseEglSurface(java.lang.Runnable r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[releaseEglSurface]"
            r1.append(r2)
            int r2 = r3.hashCode()
            r1.append(r2)
            java.lang.String r2 = ", mIsEverDraw = "
            r1.append(r2)
            boolean r2 = r3.mIsEverDraw
            r1.append(r2)
            java.lang.String r2 = ", listener is null:"
            r1.append(r2)
            com.ss.android.vc.irtc.impl.widget.IVideoRenderListener r2 = r3.mListener
            if (r2 != 0) goto L_0x0028
            r2 = 1
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.vc.irtc.C61064p.m237485a(r0, r1)
            com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer$EglSurfaceCreation r0 = r3.eglSurfaceCreationRunnable
            r1 = 0
            r0.setSurface(r1)
            java.lang.Object r0 = r3.handlerLock
            monitor-enter(r0)
            android.os.Handler r1 = r3.renderThreadHandler     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0051
            com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer$EglSurfaceCreation r2 = r3.eglSurfaceCreationRunnable     // Catch:{ all -> 0x0058 }
            r1.removeCallbacks(r2)     // Catch:{ all -> 0x0058 }
            android.os.Handler r1 = r3.renderThreadHandler     // Catch:{ all -> 0x0058 }
            com.ss.android.vc.irtc.impl.widget.webrtc.-$$Lambda$EglRenderer$_KnbLSvOUatbCrvJO_CqROmFF-0 r2 = new com.ss.android.vc.irtc.impl.widget.webrtc.-$$Lambda$EglRenderer$_KnbLSvOUatbCrvJO_CqROmFF-0     // Catch:{ all -> 0x0058 }
            r2.<init>(r4)     // Catch:{ all -> 0x0058 }
            r1.postAtFrontOfQueue(r2)     // Catch:{ all -> 0x0058 }
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            if (r4 == 0) goto L_0x0057
            r4.run()
        L_0x0057:
            return
        L_0x0058:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer.releaseEglSurface(java.lang.Runnable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r3 = r8.frameLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0 = r8.pendingFrame;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r0 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r1 == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        r0.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        r8.pendingFrame = r9;
        r9.retain();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        r9 = r8.handlerLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0 = r8.renderThreadHandler;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r0 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
        r0.post(new com.ss.android.vc.irtc.impl.widget.webrtc.$$Lambda$EglRenderer$OdPTAoLdbYzBjOsypEJ1Hj_dqsw());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008e, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0091, code lost:
        r9 = r8.statisticsLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0093, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r8.framesDropped++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0099, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrame(com.ss.android.vc.irtc.impl.widget.webrtc.BvVideoFrame r9) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer.onFrame(com.ss.android.vc.irtc.impl.widget.webrtc.BvVideoFrame):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r2 = r18.eglBase;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r2 == null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r2.hasSurface() == false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r18.surfaceWidth <= 0) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r18.surfaceHeight > 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        r2 = ((float) r4.getRotatedWidth()) / ((float) r4.getRotatedHeight());
        r5 = r18.layoutLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r6 = r18.layoutAspectRatio;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r6 == com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r18.mIsAutoRenderMode == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        if (r2 > 1.0f) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r6 <= 1.0f) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007f, code lost:
        if (r2 < 1.0f) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if (r6 < 1.0f) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        r18.renderMode = com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008a, code lost:
        r18.renderMode = com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008e, code lost:
        r5 = r18.surfaceWidth;
        r8 = r18.surfaceHeight;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        if (com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer.C610502.$SwitchMap$com$ss$android$vc$irtc$impl$widget$webrtc$RendererCommon$ScalingType[r18.renderMode.ordinal()] == 1) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009f, code lost:
        r14 = r5;
        r15 = r8;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a2, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a4, code lost:
        r5 = r4.getRotatedWidth();
        r5 = (float) r5;
        r8 = (float) r4.getRotatedHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        if ((((float) r18.surfaceWidth) / ((float) r18.surfaceHeight)) >= (r5 / r8)) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bb, code lost:
        r11 = r18.surfaceWidth;
        r15 = (int) ((((float) r18.surfaceWidth) * r8) / r5);
        r13 = (r18.surfaceHeight - ((int) ((((float) r18.surfaceWidth) * r8) / r5))) / 2;
        r14 = r11;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d4, code lost:
        r14 = (int) ((((float) r18.surfaceHeight) * r5) / r8);
        r15 = r18.surfaceHeight;
        r12 = (r18.surfaceWidth - ((int) ((((float) r18.surfaceHeight) * r5) / r8))) / 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ec, code lost:
        r3 = r18.mScaleUtil.getOrgRect().left;
        r5 = r18.mScaleUtil.getOrgRect().right;
        r8 = r18.mScaleUtil.getOrgRect().top;
        r9 = r18.mScaleUtil.getOrgRect().bottom;
        r7 = r18.mScaleUtil.recalForDraw(r12, r13, r14, r15, (float) r18.surfaceWidth, (float) r18.surfaceHeight);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0128, code lost:
        if (isFloatEqual(r3, r18.mScaleUtil.getOrgRect().left) == false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0136, code lost:
        if (isFloatEqual(r5, r18.mScaleUtil.getOrgRect().right) == false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0144, code lost:
        if (isFloatEqual(r8, r18.mScaleUtil.getOrgRect().top) == false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0152, code lost:
        if (isFloatEqual(r9, r18.mScaleUtil.getOrgRect().bottom) != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0154, code lost:
        r3 = r18.mRecalBaseFrameListener;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0156, code lost:
        if (r3 == null) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0158, code lost:
        r3.onBaseFrameRecal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015b, code lost:
        if (r19 != false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015e, code lost:
        r3 = r18.mRecalBaseFrameListener;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0160, code lost:
        if (r3 == null) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0162, code lost:
        r3.onContentBoundChanged(r18.mScaleUtil.getCurRect());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0171, code lost:
        if (r18.eglBase.hasSurface() != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0173, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0174, code lost:
        r3 = com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer.C610502.$SwitchMap$com$ss$android$vc$irtc$impl$widget$webrtc$RendererCommon$ScalingType[r18.renderMode.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017e, code lost:
        if (r3 == 1) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0181, code lost:
        if (r3 == 2) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0185, code lost:
        if (r2 <= r6) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0187, code lost:
        r6 = r6 / r2;
        r2 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018b, code lost:
        r2 = r2 / r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018d, code lost:
        r2 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018f, code lost:
        r6 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0191, code lost:
        r18.drawMatrix.reset();
        r18.drawMatrix.preTranslate(0.5f, 0.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019f, code lost:
        if (r4.flip == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a1, code lost:
        r18.drawMatrix.preScale(-1.0f, 1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01aa, code lost:
        r18.drawMatrix.preScale(r6, r2);
        r18.drawMatrix.preTranslate(-0.5f, -0.5f);
        r18.frameDrawer.drawFrame(r4, r18.drawer, r18.drawMatrix, r7.left, r7.top, r7.right - r7.left, r7.bottom - r7.top);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d4, code lost:
        r0 = r18.TAG;
        com.ss.android.vc.irtc.C61064p.m237485a(r0, "[calDrawFrameViewPort] Invalid context: surfaceWidth=" + r18.surfaceWidth + ", surfaceHeight=" + r18.surfaceHeight);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void calDrawFrameViewPort(boolean r19) {
        /*
        // Method dump skipped, instructions count: 508
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer.calDrawFrameViewPort(boolean):void");
    }

    private boolean isFloatEqual(float f, float f2) {
        if (Math.abs(f - f2) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    public void setLayoutAspectRatio(int i, int i2) {
        String str = this.TAG;
        C61064p.m237486b(str, "setLayoutAspectRatio: " + this.layoutAspectRatio);
        synchronized (this.layoutLock) {
            this.surfaceWidth = i;
            this.surfaceHeight = i2;
            this.layoutAspectRatio = ((float) i) / ((float) i2);
        }
    }

    public RectF setTranslate(float f, float f2, boolean z) {
        this.mScaleUtil.setTranslate(f, f2, z);
        calDrawFrameViewPort(false);
        postInvalidateRender();
        return this.mScaleUtil.getCurRect();
    }

    public void init(final EglBase.Context context, final int[] iArr, RendererCommon.GlDrawer glDrawer) {
        synchronized (this.handlerLock) {
            if (!this.hasEglInit) {
                if (this.mIsEverDraw) {
                    EnvUtils.throwException("[init] mIsEverDraw is true");
                }
                String str = this.TAG;
                C61064p.m237485a(str, "Initializing EglRenderer: " + this.mIsEverDraw);
                this.hasEglInit = true;
                this.drawer = glDrawer;
                new HandlerThread(this.name + "EglRenderer") {
                    /* class com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer.HandlerThreadC610491 */

                    /* access modifiers changed from: protected */
                    public void onLooperPrepared() {
                        C61065q rtcConfig;
                        super.onLooperPrepared();
                        synchronized (EglRenderer.this.handlerLock) {
                            if (EglRenderer.this.hasEglInit) {
                                if (EglRenderer.this.renderThreadHandler == null) {
                                    EglRenderer.this.renderThreadHandler = new Handler(getLooper());
                                    if (context == null) {
                                        C61064p.m237485a(EglRenderer.this.TAG, "EglBase10.create context");
                                        EglRenderer.this.eglBase = EglBase.CC.createEgl10(iArr);
                                    } else {
                                        String str = EglRenderer.this.TAG;
                                        C61064p.m237485a(str, getName() + ", EglBase.create shared context");
                                        EglRenderer.this.eglBase = EglBase.CC.create(context, iArr);
                                    }
                                    int incrementAndGet = EglRenderer.renderCount.incrementAndGet();
                                    String str2 = EglRenderer.this.TAG;
                                    C61064p.m237485a(str2, "Egl-LifeCycle-Create: " + incrementAndGet + ", drawn: " + EglRenderer.this.mIsEverDraw);
                                    if (EnvUtils.isApkInDebug() && (rtcConfig = EnvUtils.getRtcConfig()) != null && rtcConfig.f152925c > 0) {
                                        if (incrementAndGet > rtcConfig.f152925c) {
                                            throw new IllegalStateException("[Debug Crash] Too much egl context！Please check your code and set correct RtcConfig.renderUpperLimit if reasonable.");
                                        }
                                    }
                                    EglRenderer.this.renderThreadHandler.post(EglRenderer.this.eglSurfaceCreationRunnable);
                                    return;
                                }
                            }
                            quitSafely();
                            String str3 = EglRenderer.this.TAG;
                            C61064p.m237487c(str3, EglRenderer.this.hasEglInit + ", invalid context, " + EglRenderer.this.renderThreadHandler);
                        }
                    }
                }.start();
            } else {
                throw new IllegalStateException(this.name + " already initialized");
            }
        }
    }

    public void setBgColor(float f, float f2, float f3, float f4) {
        this.mBgColorR = f;
        this.mBgColorG = f2;
        this.mBgColorB = f3;
        this.mBgColorA = f4;
    }

    public RectF setScale(float f, float f2, float f3, boolean z) {
        this.mScaleUtil.setScale(f, f2, f3, z);
        calDrawFrameViewPort(false);
        postInvalidateRender();
        return this.mScaleUtil.getCurRect();
    }
}
