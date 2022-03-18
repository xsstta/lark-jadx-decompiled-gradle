package com.ss.video.rtc.engine.ui;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.ss.video.rtc.engine.mediaio.AutoReleaseJavaI420Buffer;
import com.ss.video.rtc.engine.mediaio.IVideoFrameConsumer;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import com.ss.video.rtc.engine.mediaio.SurfaceEglRender;
import com.ss.video.rtc.engine.mediaio.TextureEglRenderer;
import com.ss.video.rtc.engine.utils.ByteBufferUtils;
import com.ss.video.rtc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.JavaI420Buffer;
import org.webrtc.RendererCommon;
import org.webrtc.TextureBufferImpl;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.YuvConverter;

public class VideoFrameRender implements View.OnLayoutChangeListener, IVideoFrameConsumer, EglRenderer.FirstVideoFrameRenderListener, RendererCommon.RendererEvents {
    private boolean enableFixedSize;
    private boolean hasInit;
    private boolean hasRenderView;
    private EglRenderer mEglRenderer;
    private boolean mEglSurfaceCreated;
    private OnEglSurfaceCreated mOnEglSurfaceCreatedCallback = new OnEglSurfaceCreated() {
        /* class com.ss.video.rtc.engine.ui.$$Lambda$VideoFrameRender$98hF8hAPgAdC6NqwcmuRZ8_ye0A */

        @Override // com.ss.video.rtc.engine.ui.VideoFrameRender.OnEglSurfaceCreated
        public final void onCreated() {
            VideoFrameRender.this.lambda$new$0$VideoFrameRender();
        }
    };
    private String mRenderName;
    private Surface mSurface;
    private SurfaceView mSurfaceView;
    private Looper mTextureProcessLooper;
    private TextureView mTextureView;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;

    public interface OnEglSurfaceCreated {
        void onCreated();
    }

    static /* synthetic */ void lambda$renderTextureFrame$4() {
    }

    public /* synthetic */ void lambda$new$0$VideoFrameRender() {
        this.mEglSurfaceCreated = true;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
    }

    @Override // org.webrtc.EglRenderer.FirstVideoFrameRenderListener
    public void onFirstVideoFrameRender() {
    }

    public void release() {
        onDispose();
    }

    public void disableFpsReduction() {
        EglRenderer eglRenderer = this.mEglRenderer;
        if (eglRenderer != null) {
            eglRenderer.disableFpsReduction();
        }
    }

    private void initSurfaceView() {
        runOnUIThread(new Runnable() {
            /* class com.ss.video.rtc.engine.ui.$$Lambda$VideoFrameRender$awdNfNf0MbYTCjn8JzGV7qABMls */

            public final void run() {
                VideoFrameRender.this.lambda$initSurfaceView$1$VideoFrameRender();
            }
        });
    }

    public /* synthetic */ void lambda$initSurfaceView$1$VideoFrameRender() {
        EglRenderer eglRenderer;
        SurfaceView surfaceView = this.mSurfaceView;
        if (surfaceView != null && (eglRenderer = this.mEglRenderer) != null && this.hasInit && (eglRenderer instanceof SurfaceEglRender)) {
            ((SurfaceEglRender) eglRenderer).bind(surfaceView);
            this.mSurfaceView.addOnLayoutChangeListener(this);
        }
    }

    public void onStart() {
        if (this.hasRenderView && this.hasInit) {
            if (this.mTextureView != null) {
                initTextureView();
            } else if (this.mSurfaceView != null) {
                initSurfaceView();
            }
        }
    }

    private void initTextureView() {
        EglRenderer eglRenderer;
        TextureView textureView = this.mTextureView;
        if (textureView != null && (eglRenderer = this.mEglRenderer) != null && this.hasInit && (eglRenderer instanceof TextureEglRenderer)) {
            TextureEglRenderer textureEglRenderer = (TextureEglRenderer) eglRenderer;
            textureEglRenderer.bind(textureView, this.mOnEglSurfaceCreatedCallback);
            if (this.mTextureView.isShown()) {
                textureEglRenderer.setLayoutAspectRatio(((float) this.mTextureView.getMeasuredWidth()) / ((float) this.mTextureView.getMeasuredHeight()));
            }
            this.mTextureView.addOnLayoutChangeListener(this);
        }
    }

    public synchronized void onDispose() {
        this.hasInit = false;
        EglRenderer eglRenderer = this.mEglRenderer;
        if (eglRenderer != null) {
            eglRenderer.release();
        }
        SurfaceView surfaceView = this.mSurfaceView;
        if (surfaceView != null) {
            surfaceView.removeOnLayoutChangeListener(this);
        } else {
            TextureView textureView = this.mTextureView;
            if (textureView != null) {
                textureView.setSurfaceTextureListener(null);
                this.mTextureView.removeOnLayoutChangeListener(this);
            }
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || this.mSurfaceView.getWidth() == 0 || this.mSurfaceView.getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            this.mSurfaceView.getHolder().setSizeFromLayout();
            return;
        }
        float width = ((float) this.mSurfaceView.getWidth()) / ((float) this.mSurfaceView.getHeight());
        int i = this.rotatedFrameWidth;
        int i2 = this.rotatedFrameHeight;
        if (((float) i) / ((float) i2) > width) {
            i = (int) (((float) i2) * width);
        } else {
            i2 = (int) (((float) i) / width);
        }
        int min = Math.min(this.mSurfaceView.getWidth(), i);
        int min2 = Math.min(this.mSurfaceView.getHeight(), i2);
        LogUtil.m257129d("VideoFrameRender", "updateSurfaceSize. Layout size: " + this.mSurfaceView.getWidth() + "x" + this.mSurfaceView.getHeight() + ", frame size: " + this.rotatedFrameWidth + "x" + this.rotatedFrameHeight + ", requested surface size: " + min + "x" + min2 + ", old surface size: " + this.surfaceWidth + "x" + this.surfaceHeight);
        if (min != this.surfaceWidth || min2 != this.surfaceHeight) {
            this.surfaceWidth = min;
            this.surfaceHeight = min2;
            this.mSurfaceView.getHolder().setFixedSize(min, min2);
        }
    }

    public void setProcessTextureLopper(Looper looper) {
        this.mTextureProcessLooper = looper;
    }

    public void setFpsReduction(float f) {
        EglRenderer eglRenderer = this.mEglRenderer;
        if (eglRenderer != null) {
            eglRenderer.setFpsReduction(f);
        }
    }

    public void setMirror(boolean z) {
        this.mEglRenderer.setMirror(z);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        this.mEglRenderer.setRenderModel(scalingType);
    }

    public VideoFrameRender(String str) {
        this.mRenderName = str;
    }

    private void onVideoFrame(VideoFrame videoFrame) {
        if (this.mEglSurfaceCreated) {
            this.mEglRenderer.onFrame(videoFrame);
        }
    }

    public /* synthetic */ void lambda$init$2$VideoFrameRender(EglBase.Context context) {
        this.mEglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        if (this.mSurfaceView != null) {
            updateSurfaceSize();
        }
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        }
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void setRenderView(Surface surface) {
        if (!this.mEglSurfaceCreated && surface != null && !this.hasRenderView) {
            this.hasRenderView = true;
            this.mSurface = surface;
            new EglRenderer(this.mRenderName).createEglSurface(surface);
            this.mEglSurfaceCreated = true;
        }
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoFrameConsumer
    public void consumeVideoFrame(RtcVideoFrame rtcVideoFrame) {
        if (rtcVideoFrame != null) {
            if (rtcVideoFrame.format == 1) {
                renderI420Frame(rtcVideoFrame, rtcVideoFrame.stride, rtcVideoFrame.height, rtcVideoFrame.rotation, rtcVideoFrame.timestamp);
            } else if (rtcVideoFrame.format == 10) {
                if (this.mTextureProcessLooper == null) {
                    this.mTextureProcessLooper = Looper.getMainLooper();
                }
                renderTextureFrame(rtcVideoFrame.textureId, VideoFrame.TextureBuffer.Type.RGB, rtcVideoFrame.stride, rtcVideoFrame.height, rtcVideoFrame.rotation, rtcVideoFrame.timestamp, rtcVideoFrame.transform, this.mTextureProcessLooper);
            }
        }
    }

    public void init(EglBase.Context context) {
        if (this.hasInit) {
            throw new IllegalStateException("Already initialized");
        } else if (this.mSurfaceView != null || this.mSurface != null || this.mTextureView != null || this.mEglRenderer != null) {
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            EglRenderer eglRenderer = this.mEglRenderer;
            if (eglRenderer instanceof SurfaceEglRender) {
                ThreadUtils.invokeAtFrontUninterruptibly(new Handler(Looper.getMainLooper()), new Runnable(context) {
                    /* class com.ss.video.rtc.engine.ui.$$Lambda$VideoFrameRender$tXW_N1uvibB3kTU5PIL3GEuni_Y */
                    public final /* synthetic */ EglBase.Context f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        VideoFrameRender.this.lambda$init$2$VideoFrameRender(this.f$1);
                    }
                });
            } else {
                eglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
            }
            this.hasInit = true;
        }
    }

    public /* synthetic */ void lambda$onFrameResolutionChanged$3$VideoFrameRender(int i, int i2) {
        this.rotatedFrameWidth = i;
        this.rotatedFrameHeight = i2;
    }

    public void setRenderView(SurfaceView surfaceView, SurfaceHolder.Callback callback) {
        if (!this.mEglSurfaceCreated && surfaceView != null && !this.hasRenderView) {
            this.hasRenderView = true;
            this.mSurfaceView = surfaceView;
            SurfaceEglRender surfaceEglRender = new SurfaceEglRender(this.mRenderName);
            surfaceEglRender.setSurfaceHolderCallback(callback);
            surfaceEglRender.setOnEglSurfaceCreated(this.mOnEglSurfaceCreatedCallback);
            this.mEglRenderer = surfaceEglRender;
            surfaceEglRender.addFristFrameListener(this);
        }
    }

    public void setRenderView(TextureView textureView, TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (!this.mEglSurfaceCreated && textureView != null && !this.hasRenderView) {
            this.hasRenderView = true;
            this.mTextureView = textureView;
            TextureEglRenderer textureEglRenderer = new TextureEglRenderer(this.mRenderName);
            textureEglRenderer.setSurfaceTextureListener(surfaceTextureListener);
            this.mEglRenderer = textureEglRenderer;
            textureEglRenderer.addFristFrameListener(this);
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(int i, int i2, int i3) {
        int i4;
        if (i3 == 0 || i3 == 180) {
            i4 = i;
        } else {
            i4 = i2;
        }
        if (i3 == 0 || i3 == 180) {
            i = i2;
        }
        postOrRun(new Runnable(i4, i) {
            /* class com.ss.video.rtc.engine.ui.$$Lambda$VideoFrameRender$Jw8BfO18vKe4rs5OVOmzQDekuk0 */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                VideoFrameRender.this.lambda$onFrameResolutionChanged$3$VideoFrameRender(this.f$1, this.f$2);
            }
        });
    }

    private VideoFrame.Buffer createYUV(final RtcVideoFrame rtcVideoFrame, int i, int i2) {
        if (rtcVideoFrame == null || rtcVideoFrame.buffer == null || rtcVideoFrame.buffer.remaining() <= 0) {
            return null;
        }
        int i3 = (i + 1) / 2;
        int i4 = (i * i2) + 0;
        int i5 = ((i2 + 1) / 2) * i3;
        int i6 = i4 + i5;
        rtcVideoFrame.buffer.position(0);
        rtcVideoFrame.buffer.limit(i4);
        ByteBuffer slice = rtcVideoFrame.buffer.slice();
        rtcVideoFrame.buffer.position(i4);
        rtcVideoFrame.buffer.limit(i6);
        ByteBuffer slice2 = rtcVideoFrame.buffer.slice();
        rtcVideoFrame.buffer.position(i6);
        rtcVideoFrame.buffer.limit(i6 + i5);
        ByteBuffer slice3 = rtcVideoFrame.buffer.slice();
        rtcVideoFrame.retain();
        EglRenderer eglRenderer = this.mEglRenderer;
        if (eglRenderer instanceof TextureEglRenderer) {
            return AutoReleaseJavaI420Buffer.wrap(i, i2, slice, i, slice2, i3, slice3, i3, (TextureEglRenderer) eglRenderer, new Runnable() {
                /* class com.ss.video.rtc.engine.ui.VideoFrameRender.RunnableC655845 */

                public void run() {
                    rtcVideoFrame.release();
                }
            });
        }
        return JavaI420Buffer.wrap(i, i2, slice, i, slice2, i3, slice3, i3, new Runnable() {
            /* class com.ss.video.rtc.engine.ui.VideoFrameRender.RunnableC655856 */

            public void run() {
                rtcVideoFrame.release();
            }
        });
    }

    private VideoFrame.Buffer createYUV(ByteBuffer byteBuffer, int i, int i2) {
        if (byteBuffer == null || byteBuffer.capacity() <= 0) {
            return null;
        }
        int i3 = (i + 1) / 2;
        int i4 = i2 * i;
        int i5 = ((i2 + 1) / 2) * i3;
        int i6 = i4 + i5;
        int i7 = (i5 * 2) + i4;
        final ByteBuffer nativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer(i7);
        if (nativeAllocateBuffer == null) {
            return null;
        }
        byteBuffer.rewind();
        byteBuffer.limit(i7);
        nativeAllocateBuffer.rewind();
        nativeAllocateBuffer.put(byteBuffer);
        byteBuffer.rewind();
        nativeAllocateBuffer.rewind();
        nativeAllocateBuffer.position(0);
        nativeAllocateBuffer.limit(i4);
        ByteBuffer slice = nativeAllocateBuffer.slice();
        nativeAllocateBuffer.position(i4);
        nativeAllocateBuffer.limit(i6);
        ByteBuffer slice2 = nativeAllocateBuffer.slice();
        nativeAllocateBuffer.position(i6);
        nativeAllocateBuffer.limit(i7);
        ByteBuffer slice3 = nativeAllocateBuffer.slice();
        EglRenderer eglRenderer = this.mEglRenderer;
        if (eglRenderer instanceof TextureEglRenderer) {
            return AutoReleaseJavaI420Buffer.wrap(i, i2, slice, i, slice2, i3, slice3, i3, (TextureEglRenderer) eglRenderer, new Runnable() {
                /* class com.ss.video.rtc.engine.ui.VideoFrameRender.RunnableC655801 */

                public void run() {
                    ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer);
                }
            });
        }
        return JavaI420Buffer.wrap(i, i2, slice, i, slice2, i3, slice3, i3, new Runnable() {
            /* class com.ss.video.rtc.engine.ui.VideoFrameRender.RunnableC655812 */

            public void run() {
                ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer);
            }
        });
    }

    private VideoFrame.Buffer createYUV(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        int i3 = (i + 1) / 2;
        int i4 = i * i2;
        int i5 = ((i2 + 1) / 2) * i3;
        final ByteBuffer nativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer(i4);
        final ByteBuffer nativeAllocateBuffer2 = ByteBufferUtils.nativeAllocateBuffer(i5);
        final ByteBuffer nativeAllocateBuffer3 = ByteBufferUtils.nativeAllocateBuffer(i5);
        nativeAllocateBuffer.put(bArr, 0, i4);
        nativeAllocateBuffer2.put(bArr, i4, i5);
        nativeAllocateBuffer3.put(bArr, i4 + i5, i5);
        nativeAllocateBuffer.position(0);
        nativeAllocateBuffer2.position(0);
        nativeAllocateBuffer3.position(0);
        EglRenderer eglRenderer = this.mEglRenderer;
        if (eglRenderer instanceof TextureEglRenderer) {
            return AutoReleaseJavaI420Buffer.wrap(i, i2, nativeAllocateBuffer, i, nativeAllocateBuffer2, i3, nativeAllocateBuffer3, i3, (TextureEglRenderer) eglRenderer, new Runnable() {
                /* class com.ss.video.rtc.engine.ui.VideoFrameRender.RunnableC655823 */

                public void run() {
                    ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer);
                    ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer2);
                    ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer3);
                }
            });
        }
        return JavaI420Buffer.wrap(i, i2, nativeAllocateBuffer, i, nativeAllocateBuffer2, i3, nativeAllocateBuffer3, i3, new Runnable() {
            /* class com.ss.video.rtc.engine.ui.VideoFrameRender.RunnableC655834 */

            public void run() {
                ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer);
                ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer2);
                ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer3);
            }
        });
    }

    private void renderI420Frame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        VideoFrame.Buffer createYUV;
        if (byteBuffer != null && (createYUV = createYUV(byteBuffer, i, i2)) != null) {
            VideoFrame videoFrame = new VideoFrame(createYUV, i3, j);
            onVideoFrame(videoFrame);
            videoFrame.release();
        }
    }

    private void renderI420Frame(RtcVideoFrame rtcVideoFrame, int i, int i2, int i3, long j) {
        VideoFrame.Buffer buffer;
        if (rtcVideoFrame != null && rtcVideoFrame.buffer != null) {
            if (rtcVideoFrame.buffer.isDirect()) {
                buffer = createYUV(rtcVideoFrame, i, i2);
            } else {
                buffer = createYUV(rtcVideoFrame.buffer.array(), i, i2);
            }
            if (buffer != null) {
                VideoFrame videoFrame = new VideoFrame(buffer, i3, j);
                onVideoFrame(videoFrame);
                videoFrame.release();
            }
        }
    }

    private void renderI420Frame(byte[] bArr, int i, int i2, int i3, long j) {
        VideoFrame.Buffer createYUV;
        if (bArr != null && (createYUV = createYUV(bArr, i, i2)) != null) {
            VideoFrame videoFrame = new VideoFrame(createYUV, i3, j);
            onVideoFrame(videoFrame);
            videoFrame.release();
        }
    }

    public void consumeByteArrayFrame(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (i == 1) {
            renderI420Frame(bArr, i2, i3, i4, j);
        }
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, long j) {
        if (i == 1) {
            renderI420Frame(byteBuffer, i2, i3, i4, j);
        }
    }

    private void renderTextureFrame(int i, VideoFrame.TextureBuffer.Type type, int i2, int i3, int i4, long j, float[] fArr, Looper looper) {
        VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(i2, i3, type, i, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), new Handler(looper), new YuvConverter(), $$Lambda$VideoFrameRender$nUcmx6SNo4MnU2pbpd1MGDJhtgo.INSTANCE), i4, j);
        onVideoFrame(videoFrame);
        videoFrame.release();
    }

    public void consumeTextureFrame(int i, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        if (i2 == 10) {
            if (this.mTextureProcessLooper == null) {
                this.mTextureProcessLooper = Looper.getMainLooper();
            }
            renderTextureFrame(i, VideoFrame.TextureBuffer.Type.RGB, i3, i4, i5, j, fArr, this.mTextureProcessLooper);
        }
    }

    private VideoFrame.Buffer createYUV(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5) {
        int i6 = (i5 + 1) / 2;
        int i7 = i * i5;
        int i8 = i2 * i6;
        int i9 = i6 * i3;
        final ByteBuffer nativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer(i7);
        final ByteBuffer nativeAllocateBuffer2 = ByteBufferUtils.nativeAllocateBuffer(i8);
        final ByteBuffer nativeAllocateBuffer3 = ByteBufferUtils.nativeAllocateBuffer(i9);
        if (bArr != null) {
            nativeAllocateBuffer.put(bArr, 0, i7);
        }
        if (bArr2 != null) {
            nativeAllocateBuffer2.put(bArr2, i7, i8);
        }
        if (bArr3 != null) {
            nativeAllocateBuffer3.put(bArr3, i7 + i8, i9);
        }
        nativeAllocateBuffer.position(0);
        nativeAllocateBuffer2.position(0);
        nativeAllocateBuffer3.position(0);
        EglRenderer eglRenderer = this.mEglRenderer;
        if (eglRenderer instanceof TextureEglRenderer) {
            return AutoReleaseJavaI420Buffer.wrap(i4, i5, nativeAllocateBuffer, i4, nativeAllocateBuffer2, i2, nativeAllocateBuffer3, i3, (TextureEglRenderer) eglRenderer, new Runnable() {
                /* class com.ss.video.rtc.engine.ui.VideoFrameRender.RunnableC655867 */

                public void run() {
                    ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer);
                    ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer2);
                    ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer3);
                }
            });
        }
        return JavaI420Buffer.wrap(i4, i5, nativeAllocateBuffer, i4, nativeAllocateBuffer2, i2, nativeAllocateBuffer3, i3, new Runnable() {
            /* class com.ss.video.rtc.engine.ui.VideoFrameRender.RunnableC655878 */

            public void run() {
                ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer);
                ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer2);
                ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer3);
            }
        });
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ThreadUtils.checkIsOnMainThread();
        this.mEglRenderer.setLayoutAspectRatio(((float) (i3 - i)) / ((float) (i4 - i2)));
        if (this.mSurfaceView != null) {
            updateSurfaceSize();
        }
    }

    private void renderI420Frame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        VideoFrame.Buffer createYUV;
        if (bArr != null && (createYUV = createYUV(bArr, bArr2, bArr3, i, i2, i3, i4, i5)) != null) {
            VideoFrame videoFrame = new VideoFrame(createYUV, i6, j);
            onVideoFrame(videoFrame);
            videoFrame.release();
        }
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j, ByteBuffer byteBuffer) {
        renderI420Frame(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, j);
    }
}
