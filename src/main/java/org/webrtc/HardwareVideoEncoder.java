package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.bytedance.realx.RXVideoSurfaceController;
import com.bytedance.realx.base.RXLogging;
import com.huawei.hms.feature.dynamic.DynamicModule;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

class HardwareVideoEncoder implements VideoEncoder {
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private VideoEncoder.Callback callback;
    private MediaCodecWrapper codec;
    private final RXVideoCodecDesc codecDesc;
    private final String codecName;
    private ByteBuffer configBuffer;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private final long forcedKeyFrameNs;
    private int height;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private final ThreadUtils.ThreadChecker outputThreadChecker;
    public volatile boolean running;
    private VideoEncoder.ScaleMode scaleMode;
    private VideoEncoder.Settings settings;
    private final EglBase14.Context sharedContext;
    private volatile Exception shutdownException;
    private final Integer surfaceColorFormat;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    private boolean canUseSurface() {
        if (this.sharedContext == null || this.surfaceColorFormat == null) {
            return false;
        }
        return true;
    }

    private Thread createOutputThread() {
        return new_insert_after_java_lang_Thread_by_knot(new Thread("video_encoded_thread") {
            /* class org.webrtc.HardwareVideoEncoder.C701211 */

            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        });
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus requestKeyFrame() {
        requestKeyFrame(System.currentTimeMillis());
        return VideoCodecStatus.OK;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.webrtc.HardwareVideoEncoder$2 */
    public static /* synthetic */ class C701222 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RXVideoCodecProfile;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.webrtc.RXVideoCodecProfile[] r0 = org.webrtc.RXVideoCodecProfile.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.webrtc.HardwareVideoEncoder.C701222.$SwitchMap$org$webrtc$RXVideoCodecProfile = r0
                org.webrtc.RXVideoCodecProfile r1 = org.webrtc.RXVideoCodecProfile.ProfileHigh     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = org.webrtc.HardwareVideoEncoder.C701222.$SwitchMap$org$webrtc$RXVideoCodecProfile     // Catch:{ NoSuchFieldError -> 0x001d }
                org.webrtc.RXVideoCodecProfile r1 = org.webrtc.RXVideoCodecProfile.ProfileConstrainedHigh     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = org.webrtc.HardwareVideoEncoder.C701222.$SwitchMap$org$webrtc$RXVideoCodecProfile     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.webrtc.RXVideoCodecProfile r1 = org.webrtc.RXVideoCodecProfile.ProfileBaseline     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = org.webrtc.HardwareVideoEncoder.C701222.$SwitchMap$org$webrtc$RXVideoCodecProfile     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.webrtc.RXVideoCodecProfile r1 = org.webrtc.RXVideoCodecProfile.ProfileConstrainedBaseline     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = org.webrtc.HardwareVideoEncoder.C701222.$SwitchMap$org$webrtc$RXVideoCodecProfile     // Catch:{ NoSuchFieldError -> 0x003e }
                org.webrtc.RXVideoCodecProfile r1 = org.webrtc.RXVideoCodecProfile.ProfileMain     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.C701222.<clinit>():void");
        }
    }

    public VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            if (this.codecDesc.getStandard() == RXVideoCodecStandard.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (this.codecDesc.getStandard() == RXVideoCodecStandard.VP8) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        RXLogging.m74903d("HardwareVideoEncoder", "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            RXLogging.m74905e("HardwareVideoEncoder", "Media encoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            RXLogging.m74905e("HardwareVideoEncoder", "Media encoder release failed", e2);
            this.shutdownException = e2;
        }
        this.configBuffer = null;
        RXLogging.m74903d("HardwareVideoEncoder", "Release on output thread done");
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000)) {
                RXLogging.m74904e("HardwareVideoEncoder", "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                RXLogging.m74905e("HardwareVideoEncoder", "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = VideoCodecStatus.OK;
            }
        }
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        return videoCodecStatus;
    }

    /* access modifiers changed from: protected */
    public void deliverEncodedImage() {
        ByteBuffer byteBuffer;
        EncodedImage.FrameType frameType;
        this.outputThreadChecker.checkIsOnValidThread();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000);
            if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.codec.getOutputFormat();
                RXLogging.m74903d("HardwareVideoEncoder", "output format changed: " + outputFormat.toString());
            } else if (dequeueOutputBuffer != -1) {
                if (dequeueOutputBuffer != -3) {
                    if (dequeueOutputBuffer < 0) {
                        RXLogging.m74904e("HardwareVideoEncoder", "should not be here: index:" + dequeueOutputBuffer);
                        return;
                    }
                }
                ByteBuffer byteBuffer2 = this.codec.getOutputBuffers()[dequeueOutputBuffer];
                byteBuffer2.position(bufferInfo.offset);
                byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
                if ((bufferInfo.flags & 2) != 0) {
                    RXLogging.m74903d("HardwareVideoEncoder", "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    this.configBuffer = allocateDirect;
                    allocateDirect.put(byteBuffer2);
                } else {
                    boolean z = true;
                    if ((bufferInfo.flags & 1) == 0) {
                        z = false;
                    }
                    if (z) {
                        RXLogging.m74903d("HardwareVideoEncoder", "Sync frame generated");
                    }
                    if (!z || this.codecDesc.getStandard() != RXVideoCodecStandard.H264) {
                        byteBuffer = byteBuffer2.slice();
                    } else {
                        RXLogging.m74903d("HardwareVideoEncoder", "Prepending config frame of size " + this.configBuffer.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                        byteBuffer = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                        this.configBuffer.rewind();
                        byteBuffer.put(this.configBuffer);
                        byteBuffer.put(byteBuffer2);
                        byteBuffer.rewind();
                    }
                    if (z) {
                        frameType = EncodedImage.FrameType.VideoFrameKey;
                    } else {
                        frameType = EncodedImage.FrameType.VideoFrameDelta;
                    }
                    this.callback.onEncodedFrame(EncodedImage.builder().setEncodedWidth(this.width).setEncodedHeight(this.height).setCaptureTimeNs(bufferInfo.presentationTimeUs * 1000).setBuffer(byteBuffer).setFrameType(frameType).createEncodedImage(), new VideoEncoder.CodecSpecificInfo());
                }
                this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
        } catch (Exception e) {
            if (System.currentTimeMillis() - currentTimeMillis < 100) {
                RXLogging.m74905e("HardwareVideoEncoder", "deliverOutput failed", e);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private VideoCodecStatus initEncodeInternal() {
        Integer num;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.lastKeyFrameNs = -1;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            if (this.useSurfaceMode) {
                num = this.surfaceColorFormat;
            } else {
                num = this.yuvColorFormat;
            }
            int intValue = num.intValue();
            try {
                RXVideoCodecStandard standard = this.codecDesc.getStandard();
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(standard.mimeType(), this.width, this.height);
                createVideoFormat.setInteger("bitrate", this.settings.targetBps);
                createVideoFormat.setInteger("bitrate-mode", 1);
                createVideoFormat.setInteger("color-format", intValue);
                createVideoFormat.setInteger("frame-rate", this.settings.targetFps);
                createVideoFormat.setInteger("i-frame-interval", this.keyFrameIntervalSec);
                createVideoFormat.setInteger("max-bframes", 0);
                if (this.settings.rangeId == 1) {
                    createVideoFormat.setInteger("color-range", 1);
                } else {
                    createVideoFormat.setInteger("color-range", 2);
                }
                createVideoFormat.setInteger("color-standard", 4);
                createVideoFormat.setInteger("color-transfer", 3);
                if (standard == RXVideoCodecStandard.H264) {
                    RXVideoCodecProfile profile = this.codecDesc.getProfile();
                    int i = C701222.$SwitchMap$org$webrtc$RXVideoCodecProfile[profile.ordinal()];
                    if (i == 1 || i == 2) {
                        RXLogging.m74907w("HardwareVideoEncoder", "setting high profile ");
                        createVideoFormat.setInteger("profile", 8);
                        createVideoFormat.setInteger("level", DynamicModule.f58006b);
                    } else if (i == 3 || i == 4 || i == 5) {
                        RXLogging.m74907w("HardwareVideoEncoder", "setting baseline profile ");
                        createVideoFormat.setInteger("profile", 1);
                        createVideoFormat.setInteger("level", DynamicModule.f58006b);
                    } else {
                        RXLogging.m74907w("HardwareVideoEncoder", "Unknown profile level id: " + profile + "default to baseline profile");
                        createVideoFormat.setInteger("profile", 1);
                        createVideoFormat.setInteger("level", DynamicModule.f58006b);
                    }
                }
                createVideoFormat.setInteger("profile", 1);
                createVideoFormat.setInteger("level", DynamicModule.f58006b);
                RXLogging.m74907w("HardwareVideoEncoder", "maxqp:" + this.settings.maxQp + " minqp:" + this.settings.minQp);
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-min", this.settings.minQp);
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-max", this.settings.maxQp);
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-p-min", this.settings.minQp);
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-p-max", this.settings.maxQp);
                createVideoFormat.setInteger("vendor.rtc-ext-enc-qp-range.qp-i-min", this.settings.minQp);
                createVideoFormat.setInteger("vendor.rtc-ext-enc-qp-range.qp-i-max", this.settings.maxQp);
                createVideoFormat.setInteger("vendor.rtc-ext-enc-qp-range.qp-p-min", this.settings.minQp);
                createVideoFormat.setInteger("vendor.rtc-ext-enc-qp-range.qp-p-max", this.settings.maxQp);
                createVideoFormat.setInteger("vendor.rtc-ext-enc-low-latency.enable", 1);
                if (this.settings.temporalLayerNum > 1) {
                    createVideoFormat.setString("ts-schema", "android.generic." + this.settings.temporalLayerNum);
                }
                RXLogging.m74904e("HardwareVideoEncoder", "Format: " + createVideoFormat);
                this.codec.configure(createVideoFormat, null, null, 1);
                if (RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
                    this.textureInputSurface = this.codec.createInputSurface();
                    RXVideoSurfaceController.getInstance().setSurface(this.textureInputSurface);
                } else if (this.useSurfaceMode) {
                    this.textureInputSurface = this.codec.createInputSurface();
                    EglBase14 eglBase14 = new EglBase14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
                    this.textureEglBase = eglBase14;
                    eglBase14.createSurface(this.textureInputSurface);
                    this.textureEglBase.makeCurrent();
                }
                this.codec.start();
                this.running = true;
                this.outputThreadChecker.detachThread();
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                return VideoCodecStatus.OK;
            } catch (Exception e) {
                RXLogging.m74905e("HardwareVideoEncoder", "initEncodeInternal failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e2) {
            RXLogging.m74905e("HardwareVideoEncoder", "Cannot create media encoder " + this.codecName, e2);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        if (j2 <= 0 || j <= this.lastKeyFrameNs + j2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public enum YuvFormat {
        I420 {
            /* access modifiers changed from: package-private */
            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 {
            /* access modifiers changed from: package-private */
            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };

        /* access modifiers changed from: package-private */
        public abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);

        static YuvFormat valueOf(int i) {
            if (i == 19) {
                return I420;
            }
            if (i == 21 || i == 2141391872 || i == 2141391876) {
                return NV12;
            }
            throw new IllegalArgumentException("Unsupported colorFormat: " + i);
        }
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(videoFrame.getTimestampNs());
            return VideoCodecStatus.OK;
        } catch (Exception e) {
            RXLogging.m74905e("HardwareVideoEncoder", "encodeTexture failed", e);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (Exception e) {
            RXLogging.m74905e("HardwareVideoEncoder", "requestKeyFrame failed", e);
        }
    }

    private VideoCodecStatus updateBitrate(int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (Exception e) {
            RXLogging.m74905e("HardwareVideoEncoder", "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    /* access modifiers changed from: protected */
    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(int i, int i2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        updateBitrate(i);
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, boolean z) {
        boolean z2;
        VideoCodecStatus resetCodec;
        this.encodeThreadChecker.checkIsOnValidThread();
        GlUtil.clearGLES2Error("HardwareVideoEncoder");
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        boolean z3 = buffer instanceof VideoFrame.TextureBuffer;
        int width2 = videoFrame.getBuffer().getWidth();
        int height2 = videoFrame.getBuffer().getHeight();
        if (!canUseSurface() || !z3) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 != this.useSurfaceMode && (resetCodec = resetCodec(width2, height2, z2)) != VideoCodecStatus.OK) {
            return resetCodec;
        }
        if (z) {
            RXLogging.m74903d("HardwareVideoEncoder", "***** Request key frame ****");
        }
        if (z || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        int height3 = ((buffer.getHeight() * buffer.getWidth()) * 3) / 2;
        if (!this.useSurfaceMode) {
            return encodeByteBuffer(videoFrame, buffer, height3);
        }
        this.textureEglBase.makeCurrent();
        return encodeTextureBuffer(videoFrame);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings2, VideoEncoder.Callback callback2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback2;
        this.automaticResizeOn = true;
        this.width = settings2.width;
        this.height = settings2.height;
        this.scaleMode = settings2.scaleMode;
        if (RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
            RXLogging.m74904e("HardwareVideoEncoder", "using pass surface mode");
            this.useSurfaceMode = true;
        } else {
            this.useSurfaceMode = canUseSurface();
        }
        this.settings = settings2;
        RXLogging.m74903d("HardwareVideoEncoder", "initEncode: " + this.width + " x " + this.height + ". @ " + settings2.targetBps + "kbps. Fps: " + settings2.targetFps + " Use surface mode: " + this.useSurfaceMode);
        return initEncodeInternal();
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        this.width = i;
        this.height = i2;
        this.useSurfaceMode = z;
        return initEncodeInternal();
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, VideoFrame.Buffer buffer, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long timestampNs = videoFrame.getTimestampNs() / 1000;
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0);
            if (dequeueInputBuffer == -1) {
                RXLogging.m74903d("HardwareVideoEncoder", "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffers()[dequeueInputBuffer], buffer);
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, i, timestampNs, 0);
                    return VideoCodecStatus.OK;
                } catch (Exception e) {
                    RXLogging.m74905e("HardwareVideoEncoder", "queueInputBuffer failed", e);
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            } catch (Exception e2) {
                RXLogging.m74905e("HardwareVideoEncoder", "getInputBuffers failed", e2);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e3) {
            RXLogging.m74905e("HardwareVideoEncoder", "dequeueInputBuffer failed", e3);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, RXVideoCodecDesc rXVideoCodecDesc, Integer num, Integer num2, int i, int i2, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
        this.codecName = str;
        this.codecDesc = rXVideoCodecDesc;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos((long) i2);
        this.sharedContext = context;
        threadChecker.detachThread();
    }
}
