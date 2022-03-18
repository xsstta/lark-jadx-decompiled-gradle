package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

public class SurfaceTextureHelper {
    private final EglBase eglBase;
    private int frameRotation;
    public final Handler handler;
    public boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    public long lastDeliverTime;
    public VideoSink listener;
    public int maxDeliverTimerInternal;
    private final int oesTextureId;
    public VideoSink pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private int textureHeight;
    private int textureWidth;
    final Runnable timedDeliverRunnable;
    private final TimestampAligner timestampAligner;
    private final YuvConverter yuvConverter;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public /* synthetic */ void lambda$stopListening$1$SurfaceTextureHelper() {
        this.listener = null;
        this.pendingListener = null;
    }

    /* access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new Runnable() {
            /* class org.webrtc.$$Lambda$SurfaceTextureHelper$gmsH_Qw5kL7p_GZLbNGbZPnUnw */

            public final void run() {
                SurfaceTextureHelper.this.lambda$returnTextureFrame$4$SurfaceTextureHelper();
            }
        });
    }

    public /* synthetic */ void lambda$dispose$5$SurfaceTextureHelper() {
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            release();
        }
    }

    public /* synthetic */ void lambda$returnTextureFrame$4$SurfaceTextureHelper() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void dispose() {
        Logging.m268870d("SurfaceTextureHelper", "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() {
            /* class org.webrtc.$$Lambda$SurfaceTextureHelper$QOsXdullTzSqA2x92J8lBVucvxo */

            public final void run() {
                SurfaceTextureHelper.this.lambda$dispose$5$SurfaceTextureHelper();
            }
        });
    }

    public void stopListening() {
        Logging.m268870d("SurfaceTextureHelper", "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() {
            /* class org.webrtc.$$Lambda$SurfaceTextureHelper$Sh0ywtqKkQ0umpu9CzT8Hl__d1U */

            public final void run() {
                SurfaceTextureHelper.this.lambda$stopListening$1$SurfaceTextureHelper();
            }
        });
    }

    private void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            this.yuvConverter.release();
            GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
            this.surfaceTexture.release();
            this.eglBase.release();
            this.handler.getLooper().quit();
            TimestampAligner timestampAligner2 = this.timestampAligner;
            if (timestampAligner2 != null) {
                timestampAligner2.dispose();
            }
        }
    }

    public void tryDeliverTextureFrame() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
            this.isTextureInUse = true;
            this.hasPendingTexture = false;
            updateTexImage();
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            long timestamp = this.surfaceTexture.getTimestamp();
            TimestampAligner timestampAligner2 = this.timestampAligner;
            if (timestampAligner2 != null) {
                timestamp = timestampAligner2.translateTimestamp(timestamp);
            }
            if (this.textureWidth == 0 || this.textureHeight == 0) {
                throw new RuntimeException("Texture size has not been set.");
            }
            this.lastDeliverTime = System.currentTimeMillis();
            VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() {
                /* class org.webrtc.$$Lambda$SurfaceTextureHelper$tIum2FUOHJrTZT9xxedm9SolAuk */

                public final void run() {
                    SurfaceTextureHelper.this.returnTextureFrame();
                }
            }), this.frameRotation, timestamp);
            this.listener.onFrame(videoFrame);
            videoFrame.release();
        }
    }

    public /* synthetic */ void lambda$setFrameRotation$3$SurfaceTextureHelper(int i) {
        this.frameRotation = i;
    }

    public /* synthetic */ void lambda$new$0$SurfaceTextureHelper(SurfaceTexture surfaceTexture2) {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public void setFrameRotation(int i) {
        this.handler.post(new Runnable(i) {
            /* class org.webrtc.$$Lambda$SurfaceTextureHelper$s4LHzEMEIrIUoYtZ9hJ3WBkHmqU */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                SurfaceTextureHelper.this.lambda$setFrameRotation$3$SurfaceTextureHelper(this.f$1);
            }
        });
    }

    public void setMinFps(int i) {
        if (i > 0) {
            this.maxDeliverTimerInternal = (int) (1000.0f / ((float) i));
        } else {
            this.maxDeliverTimerInternal = 0;
        }
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
            this.handler.post(this.timedDeliverRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false);
    }

    public /* synthetic */ void lambda$setTextureSize$2$SurfaceTextureHelper(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
    }

    public void setTextureSize(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException("Texture width must be positive, but was " + i);
        } else if (i2 > 0) {
            this.surfaceTexture.setDefaultBufferSize(i, i2);
            this.handler.post(new Runnable(i, i2) {
                /* class org.webrtc.$$Lambda$SurfaceTextureHelper$BOw0CKPXmtvJTWQbaqJg5vLMZws */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    SurfaceTextureHelper.this.lambda$setTextureSize$2$SurfaceTextureHelper(this.f$1, this.f$2);
                }
            });
        } else {
            throw new IllegalArgumentException("Texture height must be positive, but was " + i2);
        }
    }

    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture2, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler2) {
        if (Build.VERSION.SDK_INT >= 21) {
            surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener, handler2);
        } else {
            surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener);
        }
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z) {
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot(str);
        new_android_os_HandlerThread_by_knot.start();
        final Handler handler2 = new Handler(new_android_os_HandlerThread_by_knot.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler2, new Callable<SurfaceTextureHelper>() {
            /* class org.webrtc.SurfaceTextureHelper.CallableC701311 */

            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(context, handler2, z);
                } catch (RuntimeException e) {
                    Logging.m268872e("SurfaceTextureHelper", str + " create failure", e);
                    return null;
                }
            }
        });
    }

    private SurfaceTextureHelper(EglBase.Context context, Handler handler2, boolean z) {
        TimestampAligner timestampAligner2;
        this.yuvConverter = new YuvConverter();
        this.setListenerRunnable = new Runnable() {
            /* class org.webrtc.SurfaceTextureHelper.RunnableC701322 */

            public void run() {
                Logging.m268870d("SurfaceTextureHelper", "Setting listener to " + SurfaceTextureHelper.this.pendingListener);
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        this.lastDeliverTime = 0;
        this.maxDeliverTimerInternal = -1;
        this.timedDeliverRunnable = new Runnable() {
            /* class org.webrtc.SurfaceTextureHelper.RunnableC701333 */

            public void run() {
                if (SurfaceTextureHelper.this.maxDeliverTimerInternal > 0 && SurfaceTextureHelper.this.handler != null && SurfaceTextureHelper.this.listener != null) {
                    if (!SurfaceTextureHelper.this.hasPendingTexture && System.currentTimeMillis() - SurfaceTextureHelper.this.lastDeliverTime > ((long) SurfaceTextureHelper.this.maxDeliverTimerInternal)) {
                        SurfaceTextureHelper.this.hasPendingTexture = true;
                        SurfaceTextureHelper.this.tryDeliverTextureFrame();
                    }
                    SurfaceTextureHelper.this.handler.postDelayed(this, (long) SurfaceTextureHelper.this.maxDeliverTimerInternal);
                }
            }
        };
        if (handler2.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler2;
            if (z) {
                timestampAligner2 = new TimestampAligner();
            } else {
                timestampAligner2 = null;
            }
            this.timestampAligner = timestampAligner2;
            EglBase create = EglBase.CC.create(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = create;
            try {
                create.createDummyPbufferSurface();
                create.makeCurrent();
                int generateTexture = GlUtil.generateTexture(36197);
                this.oesTextureId = generateTexture;
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(generateTexture);
                this.surfaceTexture = surfaceTexture2;
                setOnFrameAvailableListener(surfaceTexture2, new SurfaceTexture.OnFrameAvailableListener() {
                    /* class org.webrtc.$$Lambda$SurfaceTextureHelper$073Iq_oVBecUTQR2U0VmYQ8_7lM */

                    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                        SurfaceTextureHelper.this.lambda$new$0$SurfaceTextureHelper(surfaceTexture);
                    }
                }, handler2);
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler2.getLooper().quit();
                throw e;
            }
        } else {
            throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
        }
    }
}
