package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.bytedance.realx.base.RXLogging;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;

class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private VideoDecoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final RXVideoCodecStandard codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final Object dimensionLock = new Object();
    private int encoded_height;
    private int encoded_width;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    public ThreadUtils.ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private final Object renderedTextureMetadataLock = new Object();
    public volatile boolean running;
    private VideoDecoder.Settings settings;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    @Override // org.webrtc.VideoDecoder
    public /* synthetic */ long createNativeVideoDecoder() {
        return VideoDecoder.CC.$default$createNativeVideoDecoder(this);
    }

    @Override // org.webrtc.VideoDecoder
    public boolean getPrefersLateDecoding() {
        return true;
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    private Thread createOutputThread() {
        return new_insert_after_java_lang_Thread_by_knot(new Thread("AndroidVideoDecoder.outputThread") {
            /* class org.webrtc.AndroidVideoDecoder.C701011 */

            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        });
    }

    /* access modifiers changed from: protected */
    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        RXLogging.m74903d("AndroidVideoDecoder", "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        releaseSurface();
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        return releaseInternal;
    }

    /* access modifiers changed from: protected */
    public void releaseSurface() {
        Surface surface2 = this.surface;
        if (surface2 != null) {
            surface2.release();
            this.surface = null;
        }
        SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
        if (surfaceTextureHelper2 != null) {
            surfaceTextureHelper2.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        RXLogging.m74903d("AndroidVideoDecoder", "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            RXLogging.m74905e("AndroidVideoDecoder", "Media decoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            RXLogging.m74905e("AndroidVideoDecoder", "Media decoder release failed", e2);
            this.shutdownException = e2;
        }
        releaseSurface();
        RXLogging.m74903d("AndroidVideoDecoder", "Release on output thread done");
    }

    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            RXLogging.m74903d("AndroidVideoDecoder", "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000)) {
                RXLogging.m74905e("AndroidVideoDecoder", "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                RXLogging.m74905e("AndroidVideoDecoder", "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                VideoCodecStatus videoCodecStatus = VideoCodecStatus.ERROR;
                this.codec = null;
                this.outputThread = null;
                return videoCodecStatus;
            } else {
                this.codec = null;
                this.outputThread = null;
                return VideoCodecStatus.OK;
            }
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    /* access modifiers changed from: protected */
    public void deliverDecodedFrame() {
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
            } else if (dequeueOutputBuffer < 0) {
                RXLogging.m74906v("AndroidVideoDecoder", "dequeueOutputBuffer returned " + dequeueOutputBuffer);
            } else {
                this.hasDecodedFirstFrame = true;
                if (this.surfaceTextureHelper != null) {
                    deliverTextureFrame(dequeueOutputBuffer, bufferInfo);
                } else {
                    deliverByteFrame(dequeueOutputBuffer, bufferInfo);
                }
            }
        } catch (IllegalStateException e) {
            RXLogging.m74905e("AndroidVideoDecoder", "deliverDecodedFrame failed", e);
        }
    }

    /* access modifiers changed from: private */
    public static class DecodedTextureMetadata {
        final long presentationTimestampUs;

        DecodedTextureMetadata(long j) {
            this.presentationTimestampUs = j;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata != null) {
                j = decodedTextureMetadata.presentationTimestampUs * 1000;
                this.renderedTextureMetadata = null;
            } else {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), 0, j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bb, code lost:
        if (r5.surfaceTextureHelper != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c3, code lost:
        if (r6.containsKey("color-format") == false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c5, code lost:
        r5.colorFormat = r6.getInteger("color-format");
        com.bytedance.realx.base.RXLogging.m74903d("AndroidVideoDecoder", "Color: 0x" + java.lang.Integer.toHexString(r5.colorFormat));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ef, code lost:
        if (isSupportedColorFormat(r5.colorFormat) != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f1, code lost:
        stopOnOutputThread(new java.lang.IllegalStateException("Unsupported color format: " + r5.colorFormat));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010d, code lost:
        r0 = r5.dimensionLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010f, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0116, code lost:
        if (r6.containsKey("stride") == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0118, code lost:
        r5.stride = r6.getInteger("stride");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0126, code lost:
        if (r6.containsKey("slice-height") == false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0128, code lost:
        r5.sliceHeight = r6.getInteger("slice-height");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0130, code lost:
        com.bytedance.realx.base.RXLogging.m74903d("AndroidVideoDecoder", "Frame stride and slice height: " + r5.stride + " x " + r5.sliceHeight);
        r5.stride = java.lang.Math.max(r5.width, r5.stride);
        r5.sliceHeight = java.lang.Math.max(r5.height, r5.sliceHeight);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0166, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0167, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void reformat(android.media.MediaFormat r6) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.reformat(android.media.MediaFormat):void");
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage) {
        try {
            if (!(encodedImage.encodedWidth == this.encoded_width && encodedImage.encodedHeight == this.encoded_height)) {
                VideoCodecStatus reinitDecode = reinitDecode(encodedImage.encodedWidth, encodedImage.encodedHeight);
                if (reinitDecode != VideoCodecStatus.OK) {
                    return reinitDecode;
                }
                this.encoded_width = encodedImage.encodedWidth;
                this.encoded_height = encodedImage.encodedHeight;
                this.width = encodedImage.encodedWidth;
                this.height = encodedImage.encodedHeight;
            }
            this.decoderThreadChecker.checkIsOnValidThread();
            boolean z = false;
            if (this.codec != null) {
                if (this.callback != null) {
                    if (encodedImage.buffer == null) {
                        RXLogging.m74904e("AndroidVideoDecoder", "decode() - no input data");
                        return VideoCodecStatus.ERR_PARAMETER;
                    }
                    int remaining = encodedImage.buffer.remaining();
                    if (remaining == 0) {
                        RXLogging.m74904e("AndroidVideoDecoder", "decode() - input buffer empty");
                        return VideoCodecStatus.ERR_PARAMETER;
                    }
                    if (this.keyFrameRequired) {
                        if (encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
                            RXLogging.m74904e("AndroidVideoDecoder", "decode() - key frame required first");
                            return VideoCodecStatus.NO_OUTPUT;
                        } else if (!encodedImage.completeFrame) {
                            RXLogging.m74904e("AndroidVideoDecoder", "decode() - complete frame required first");
                            return VideoCodecStatus.NO_OUTPUT;
                        }
                    }
                    try {
                        int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000);
                        if (dequeueInputBuffer < 0) {
                            RXLogging.m74904e("AndroidVideoDecoder", "decode() - no HW buffers available; decoder falling behind");
                            return VideoCodecStatus.ERROR;
                        }
                        try {
                            ByteBuffer byteBuffer = this.codec.getInputBuffers()[dequeueInputBuffer];
                            if (byteBuffer.capacity() < remaining) {
                                RXLogging.m74904e("AndroidVideoDecoder", "decode() - HW buffer too small");
                                return VideoCodecStatus.ERROR;
                            }
                            byteBuffer.put(encodedImage.buffer);
                            try {
                                this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                                if (this.keyFrameRequired) {
                                    this.keyFrameRequired = false;
                                }
                                return VideoCodecStatus.OK;
                            } catch (IllegalStateException e) {
                                RXLogging.m74905e("AndroidVideoDecoder", "queueInputBuffer failed", e);
                                return VideoCodecStatus.ERROR;
                            }
                        } catch (IllegalStateException e2) {
                            RXLogging.m74905e("AndroidVideoDecoder", "getInputBuffers failed", e2);
                            return VideoCodecStatus.ERROR;
                        }
                    } catch (IllegalStateException e3) {
                        RXLogging.m74905e("AndroidVideoDecoder", "dequeueInputBuffer failed", e3);
                        return VideoCodecStatus.ERROR;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("decode uninitalized, codec: ");
            if (this.codec != null) {
                z = true;
            }
            sb.append(z);
            sb.append(", callback: ");
            sb.append(this.callback);
            RXLogging.m74903d("AndroidVideoDecoder", sb.toString());
            return VideoCodecStatus.UNINITIALIZED;
        } catch (Exception e4) {
            RXLogging.m74905e("AndroidVideoDecoder", "android decode err", e4);
            return VideoCodecStatus.ERROR;
        }
    }

    /* access modifiers changed from: protected */
    public VideoFrame.I420Buffer allocateI420Buffer(int i, int i2) {
        return JavaI420Buffer.allocate(i, i2);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings2, VideoDecoder.Callback callback2) {
        this.callback = callback2;
        this.settings = settings2;
        return VideoCodecStatus.OK;
    }

    private VideoCodecStatus reinitDecode(int i, int i2) {
        VideoCodecStatus releaseInternal = releaseInternal();
        if (releaseInternal != VideoCodecStatus.OK) {
            RXLogging.m74904e("AndroidVideoDecoder", "releaseInternal err");
            return releaseInternal;
        }
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.FALLBACK_SOFTWARE;
        for (int i3 = 0; i3 < 5 && VideoCodecStatus.OK != (videoCodecStatus = initDecodeInternal(i, i2)); i3++) {
        }
        return videoCodecStatus;
    }

    private void deliverTextureFrame(int i, MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        synchronized (this.dimensionLock) {
            i2 = this.width;
            i3 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                try {
                    this.codec.releaseOutputBuffer(i, false);
                } catch (IllegalStateException e) {
                    RXLogging.m74905e("AndroidVideoDecoder", "releaseOutputBuffer failed", e);
                }
                return;
            }
            this.surfaceTextureHelper.setTextureSize(i2, i3);
            this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs);
            try {
                this.codec.releaseOutputBuffer(i, true);
            } catch (IllegalStateException e2) {
                RXLogging.m74905e("AndroidVideoDecoder", "releaseOutputBuffer failed!", e2);
            }
        }
    }

    private void deliverByteFrame(int i, MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        VideoFrame.Buffer buffer;
        synchronized (this.dimensionLock) {
            i2 = this.width;
            i3 = this.height;
            i4 = this.stride;
            i5 = this.sliceHeight;
        }
        if (bufferInfo.size < ((i2 * i3) * 3) / 2) {
            RXLogging.m74904e("AndroidVideoDecoder", "Insufficient output buffer size: " + bufferInfo.size);
            return;
        }
        if (bufferInfo.size >= ((i4 * i3) * 3) / 2 || i5 != i3 || i4 <= i2) {
            i6 = i4;
        } else {
            i6 = (bufferInfo.size * 2) / (i3 * 3);
        }
        ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = byteBuffer.slice();
        if (this.colorFormat == 19) {
            buffer = copyI420Buffer(slice, i6, i5, i2, i3);
        } else {
            buffer = copyNV12ToI420Buffer(slice, i6, i5, i2, i3);
        }
        this.codec.releaseOutputBuffer(i, false);
        VideoFrame videoFrame = new VideoFrame(buffer, 0, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame);
        videoFrame.release();
    }

    private VideoCodecStatus initDecodeInternal(int i, int i2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        RXLogging.m74907w("AndroidVideoDecoder", "initDecodeInternal name: " + this.codecName + " type: " + this.codecType + " width: " + i + " height: " + i2 + " sharedContext:" + this.sharedContext + " output_by_dts: " + this.settings.output_by_dts);
        if (this.outputThread != null) {
            RXLogging.m74904e("AndroidVideoDecoder", "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i;
        this.height = i2;
        this.stride = i;
        this.sliceHeight = i2;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                if (this.sharedContext == null) {
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                if (this.settings.output_by_dts) {
                    createVideoFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
                }
                if (i < i2) {
                    createVideoFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
                }
                createVideoFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", 1);
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                VideoDecoderWrapper.SetDecoderInitCostTime(elapsedRealtime2);
                RXLogging.m74907w("AndroidVideoDecoder", "initDecodeInternal done,init video decoder cost time:" + elapsedRealtime2);
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException | IllegalStateException e) {
                RXLogging.m74905e("AndroidVideoDecoder", "initDecode failed", e);
                this.codec.release();
                releaseSurface();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException | NullPointerException unused) {
            RXLogging.m74904e("AndroidVideoDecoder", "Cannot create media decoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new NV12Buffer(i3, i4, i, i2, byteBuffer, null).toI420();
    }

    AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, RXVideoCodecStandard rXVideoCodecStandard, int i, EglBase.Context context) {
        if (isSupportedColorFormat(i)) {
            RXLogging.m74907w("AndroidVideoDecoder", "ctor name: " + str + " type: " + rXVideoCodecStandard + " color format: " + i + " context: " + context);
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
            this.codecName = str;
            this.codecType = rXVideoCodecStandard;
            this.colorFormat = i;
            this.sharedContext = context;
            this.width = 0;
            this.height = 0;
            return;
        }
        throw new IllegalArgumentException("Unsupported color format: " + i);
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5;
        if (i % 2 == 0) {
            int i6 = (i3 + 1) / 2;
            int i7 = i2 % 2;
            if (i7 == 0) {
                i5 = (i4 + 1) / 2;
            } else {
                i5 = i4 / 2;
            }
            int i8 = i / 2;
            int i9 = (i * i2) + 0;
            int i10 = i8 * i5;
            int i11 = i9 + ((i8 * i2) / 2);
            int i12 = i11 + i10;
            VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i3, i4);
            byteBuffer.limit((i * i4) + 0);
            byteBuffer.position(0);
            copyPlane(byteBuffer.slice(), i, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i3, i4);
            byteBuffer.limit(i9 + i10);
            byteBuffer.position(i9);
            copyPlane(byteBuffer.slice(), i8, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i6, i5);
            if (i7 == 1) {
                byteBuffer.position(i9 + ((i5 - 1) * i8));
                ByteBuffer dataU = allocateI420Buffer.getDataU();
                dataU.position(allocateI420Buffer.getStrideU() * i5);
                dataU.put(byteBuffer);
            }
            byteBuffer.limit(i12);
            byteBuffer.position(i11);
            copyPlane(byteBuffer.slice(), i8, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i6, i5);
            if (i7 == 1) {
                byteBuffer.position(i11 + (i8 * (i5 - 1)));
                ByteBuffer dataV = allocateI420Buffer.getDataV();
                dataV.position(allocateI420Buffer.getStrideV() * i5);
                dataV.put(byteBuffer);
            }
            return allocateI420Buffer;
        }
        throw new AssertionError("Stride is not divisible by two: " + i);
    }

    /* access modifiers changed from: protected */
    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.copyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }
}
