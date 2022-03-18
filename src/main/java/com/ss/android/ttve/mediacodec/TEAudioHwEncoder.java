package com.ss.android.ttve.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.ttve.monitor.C60229h;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.VERuntimeConfig;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

public class TEAudioHwEncoder {
    private static long INPUT_DEQUEUE_TIMEOUT_US = 10000;
    private static int TRY_AGAIN_LATER_COUNT_LIMIT = 5;
    private MediaCodec audioEncoder;
    private LinkedBlockingQueue<C60197a> audioQueue = new LinkedBlockingQueue<>();
    private int curBitrate = -1;
    private int curChannelCount = -1;
    private int curCodecInfoAACProfile = -1;
    private String curMimeType;
    private int curSampleNumPerChannel = -1;
    private int curSampleRate = -1;
    private volatile boolean encoderStarted;
    private volatile long inputCountDequeued;
    private volatile boolean inputEof;
    private MediaFormat inputFormat;
    private byte[] outputAsc;
    private MediaCodec.BufferInfo outputBufferInfo = new MediaCodec.BufferInfo();
    private volatile long outputCountDequeued;
    private volatile boolean outputEof;
    private MediaFormat outputFormat;
    private int recordInputBufferSize = -1;
    private LinkedBlockingQueue<C60198b> remainingPcmQueue = new LinkedBlockingQueue<>();
    private C60197a theOldestAudioData = null;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ttve.mediacodec.TEAudioHwEncoder$a */
    public static class C60197a {

        /* renamed from: a */
        public byte[] f150242a;

        /* renamed from: b */
        public long f150243b;

        /* renamed from: c */
        public int f150244c;

        private C60197a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ttve.mediacodec.TEAudioHwEncoder$b */
    public static class C60198b {

        /* renamed from: a */
        public byte[] f150245a;

        /* renamed from: b */
        public long f150246b;

        private C60198b() {
        }
    }

    private byte[] getOutputAsc() {
        return this.outputAsc;
    }

    private int restartEncoder() {
        releaseEncoder();
        return startEncoder();
    }

    private byte[] getAudioData() {
        C60197a aVar = this.theOldestAudioData;
        if (aVar != null) {
            return aVar.f150242a;
        }
        return null;
    }

    private long getAudioPts() {
        C60197a aVar = this.theOldestAudioData;
        if (aVar != null) {
            return aVar.f150243b;
        }
        return -1;
    }

    private void resetCodecInfo() {
        this.inputCountDequeued = 0;
        this.outputCountDequeued = 0;
        this.inputEof = false;
        this.outputEof = false;
        this.remainingPcmQueue.clear();
        this.audioQueue.clear();
    }

    private TEAudioHwEncoder() {
    }

    private int closeEncoder() {
        C63929ab.m250974a("TEAudioHwEncoder", "closeEncoder, remainingPcmQueue size: " + this.remainingPcmQueue.size() + ", audioQueue size: " + this.audioQueue.size() + ", inputCountDequeued: " + this.inputCountDequeued + ", outputCountDequeued: " + this.outputCountDequeued);
        releaseEncoder();
        this.curMimeType = null;
        this.curSampleRate = -1;
        this.curChannelCount = -1;
        this.curSampleRate = -1;
        this.curCodecInfoAACProfile = -1;
        this.curSampleNumPerChannel = -1;
        this.outputAsc = null;
        return 0;
    }

    private void releaseEncoder() {
        if (this.audioEncoder != null) {
            try {
                if (this.encoderStarted) {
                    try {
                        this.audioEncoder.stop();
                    } catch (Exception e) {
                        C63929ab.m250980d("TEAudioHwEncoder", "MediaCodec stop exception: " + e.getMessage());
                    }
                    this.encoderStarted = false;
                }
                this.audioEncoder.release();
                this.audioEncoder = null;
            } catch (Exception e2) {
                C63929ab.m250980d("TEAudioHwEncoder", "releaseEncoder: " + e2.getMessage());
            } catch (Throwable th) {
                resetCodecInfo();
                throw th;
            }
            resetCodecInfo();
        }
    }

    private int startEncoder() {
        try {
            MediaCodec selectMediaCodec = selectMediaCodec();
            this.audioEncoder = selectMediaCodec;
            if (selectMediaCodec == null) {
                C63929ab.m250980d("TEAudioHwEncoder", "create encoder failure, mime: " + this.curMimeType);
                return -201;
            }
            selectMediaCodec.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 1);
            this.audioEncoder.start();
            this.encoderStarted = true;
            return 0;
        } catch (Exception e) {
            C63929ab.m250980d("TEAudioHwEncoder", "startEncoder: " + e.getMessage());
            return -203;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039 A[SYNTHETIC, Splitter:B:11:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.media.MediaCodec selectMediaCodec() {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwEncoder.selectMediaCodec():android.media.MediaCodec");
    }

    private MediaCodecInfo getGoogleEncoderCodecInfo() {
        String[] supportedTypes;
        boolean z;
        if (TextUtils.isEmpty(this.curMimeType)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (mediaCodecInfo.isEncoder() && mediaCodecInfo.getName().contains("OMX.google")) {
                    String[] supportedTypes2 = mediaCodecInfo.getSupportedTypes();
                    if (supportedTypes2 != null) {
                        int length = supportedTypes2.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (supportedTypes2[i].equalsIgnoreCase(this.curMimeType)) {
                                z = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                        continue;
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities = mediaCodecInfo.getCapabilitiesForType(this.curMimeType).getAudioCapabilities();
                        if (audioCapabilities == null) {
                            C63929ab.m250980d("TEAudioHwEncoder", mediaCodecInfo.getName() + " null audio capabilities");
                        } else if (!audioCapabilities.isSampleRateSupported(this.curSampleRate)) {
                            C63929ab.m250980d("TEAudioHwEncoder", mediaCodecInfo.getName() + " not support SampleRate: " + this.curSampleRate);
                        } else if (this.curChannelCount <= audioCapabilities.getMaxInputChannelCount()) {
                            return mediaCodecInfo;
                        } else {
                            C63929ab.m250980d("TEAudioHwEncoder", mediaCodecInfo.getName() + " not support ChannelCount: " + this.curChannelCount + ", max channel count is " + audioCapabilities.getMaxInputChannelCount());
                        }
                    }
                }
            }
        } else {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < codecCount; i2++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                if (codecInfoAt.isEncoder() && codecInfoAt.getName().contains("OMX.google") && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str : supportedTypes) {
                        if (str.equalsIgnoreCase(this.curMimeType)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private void addAudioData(byte[] bArr) {
        C60197a aVar = new C60197a();
        aVar.f150242a = bArr;
        aVar.f150243b = this.outputBufferInfo.presentationTimeUs;
        aVar.f150244c = this.outputBufferInfo.flags;
        this.audioQueue.add(aVar);
    }

    private ByteBuffer geOutputBufferByIndex(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.audioEncoder.getOutputBuffer(i);
        }
        return this.audioEncoder.getOutputBuffers()[i];
    }

    private ByteBuffer getInputBufferByIndex(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.audioEncoder.getInputBuffer(i);
        }
        return this.audioEncoder.getInputBuffers()[i];
    }

    private int drainOutputBuffer(boolean z) {
        long j;
        byte[] bArr;
        loop0:
        while (true) {
            int i = 0;
            while (true) {
                try {
                    if (this.outputEof) {
                        break loop0;
                    }
                    MediaCodec mediaCodec = this.audioEncoder;
                    MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
                    if (i > 0) {
                        j = 10000;
                    } else {
                        j = 0;
                    }
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
                    if (dequeueOutputBuffer < 0) {
                        if (dequeueOutputBuffer != -3) {
                            if (dequeueOutputBuffer != -2) {
                                if (dequeueOutputBuffer != -1) {
                                    C63929ab.m250976b("TEAudioHwEncoder", "not available output buffer");
                                    break loop0;
                                }
                                if (z) {
                                    C63929ab.m250976b("TEAudioHwEncoder", "dequeue output buffer timeout, try again later");
                                }
                                if (!this.inputEof && (!z || ((bArr = this.outputAsc) != null && bArr.length > 0))) {
                                    break loop0;
                                }
                                i++;
                                C63929ab.m250974a("TEAudioHwEncoder", "inputEof, tryAgainLaterCount: " + i);
                                if (i > TRY_AGAIN_LATER_COUNT_LIMIT) {
                                    C63929ab.m250976b("TEAudioHwEncoder", "dequeue output buffer timeout, tryAgainLaterCount: " + i);
                                    break loop0;
                                }
                            } else {
                                this.outputFormat = this.audioEncoder.getOutputFormat();
                                C63929ab.m250974a("TEAudioHwEncoder", "output buffer format changed: " + this.outputFormat);
                                int integer = this.outputFormat.getInteger("sample-rate");
                                int integer2 = this.outputFormat.getInteger("channel-count");
                                if (!(this.curSampleRate == integer && this.curChannelCount == integer2)) {
                                    C63929ab.m250980d("TEAudioHwEncoder", "audio meta info changed, error error error !!!");
                                }
                                ByteBuffer byteBuffer = this.outputFormat.getByteBuffer("csd-0");
                                if (byteBuffer.remaining() > 0) {
                                    byte[] bArr2 = new byte[byteBuffer.remaining()];
                                    byteBuffer.get(bArr2);
                                    this.outputAsc = bArr2;
                                }
                            }
                        } else {
                            C63929ab.m250974a("TEAudioHwEncoder", "output buffer changed, need to getOutputBuffers again");
                            break;
                        }
                    } else {
                        if (this.outputBufferInfo.size > 0) {
                            ByteBuffer geOutputBufferByIndex = geOutputBufferByIndex(dequeueOutputBuffer);
                            geOutputBufferByIndex.position(this.outputBufferInfo.offset);
                            geOutputBufferByIndex.limit(this.outputBufferInfo.offset + this.outputBufferInfo.size);
                            byte[] bArr3 = new byte[this.outputBufferInfo.size];
                            geOutputBufferByIndex.get(bArr3);
                            if ((this.outputBufferInfo.flags & 2) != 0) {
                                this.outputAsc = bArr3;
                                C63929ab.m250974a("TEAudioHwEncoder", "output BUFFER_FLAG_CODEC_CONFIG, asc size: " + this.outputBufferInfo.size + ", pts: " + this.outputBufferInfo.presentationTimeUs);
                            } else {
                                if (this.outputCountDequeued > 0 && this.outputBufferInfo.presentationTimeUs <= 0) {
                                    C63929ab.m250980d("TEAudioHwEncoder", "outputCountDequeued: " + this.outputCountDequeued + ", size: " + this.outputBufferInfo.size + ", pts: " + this.outputBufferInfo.presentationTimeUs);
                                }
                                addAudioData(bArr3);
                                this.outputCountDequeued++;
                            }
                        }
                        this.audioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                        if ((this.outputBufferInfo.flags & 4) != 0) {
                            C63929ab.m250974a("TEAudioHwEncoder", "output buffer eof");
                            this.outputEof = true;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    C63929ab.m250980d("TEAudioHwEncoder", "drainOutputBuffer error: " + th.getMessage());
                    return -60010;
                }
            }
        }
        return 0;
    }

    private void addPcmData(byte[] bArr, long j) {
        C60198b bVar = new C60198b();
        bVar.f150245a = bArr;
        bVar.f150246b = j;
        this.remainingPcmQueue.add(bVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b8, code lost:
        r16.audioEncoder.queueInputBuffer(r10, 0, 0, r5.f150246b, 4);
        r16.inputEof = true;
        com.ss.android.vesdk.C63929ab.m250974a("TEAudioHwEncoder", "input buffer eof, remainingPcmQueue size: " + r16.remainingPcmQueue.size());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int encodeFrame(byte[] r17, long r18) {
        /*
        // Method dump skipped, instructions count: 333
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwEncoder.encodeFrame(byte[], long):int");
    }

    private int initEncoder(String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        if (VERuntimeConfig.f161380e == VERuntimeConfig.HwEncFallBackMode.AUDIO_ENC_INIT_FALLBACK.getValue()) {
            C63929ab.m250980d("TEAudioHwEncoder", "TESTING! HW AUDIO ENC INIT FALLBACK");
            return -203;
        } else if (TextUtils.isEmpty(str) || i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            C63929ab.m250980d("TEAudioHwEncoder", "initEncoder invalid param, mimeType: " + str + ", profile: " + i + ", sampleRate: " + i2 + ", channelCount: " + i3 + ", bitrate: " + i4 + ", sampleNumPerChannel: " + i5);
            C60229h.m234090a(1, "te_composition_audio_create_hw_encoder", 2L);
            return -101;
        } else {
            if (i == 2) {
                i6 = 5;
            } else {
                i6 = 2;
            }
            if (str.equals(this.curMimeType) && this.curCodecInfoAACProfile == i6 && this.curSampleRate == i2 && this.curChannelCount == i3 && this.curSampleNumPerChannel == i5) {
                z = false;
            } else {
                z = true;
            }
            this.curMimeType = str;
            this.curCodecInfoAACProfile = i6;
            this.curSampleRate = i2;
            this.curChannelCount = i3;
            this.curBitrate = i4;
            this.curSampleNumPerChannel = i5;
            C63929ab.m250974a("TEAudioHwEncoder", "initEncoder, mimeType: " + str + ", codecInfoAACProfile: " + i6 + ", sampleRate: " + i2 + ", channelCount: " + i3 + ", bitrate: " + i4 + ", sampleNumPerChannel: " + i5);
            if (z || !this.encoderStarted) {
                MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i2, i3);
                this.inputFormat = createAudioFormat;
                createAudioFormat.setInteger("bitrate", i4);
                this.inputFormat.setInteger("aac-profile", 2);
                int i10 = this.curChannelCount * i5 * 2 * 2;
                this.inputFormat.setInteger("max-input-size", i10);
                C63929ab.m250974a("TEAudioHwEncoder", "KEY_MAX_INPUT_SIZE: " + i10);
                i7 = restartEncoder();
            } else {
                i7 = 0;
            }
            if (i7 == 0) {
                C63929ab.m250974a("TEAudioHwEncoder", "initEncoder, try to get asc start");
                i9 = 1;
                i7 = drainOutputBuffer(true);
                C63929ab.m250974a("TEAudioHwEncoder", "initEncoder, try to get asc end");
                if (i7 == 0) {
                    i8 = 0;
                } else {
                    i8 = 3;
                }
            } else {
                i9 = 1;
                i8 = 1;
            }
            C60229h.m234090a(i9, "te_composition_audio_create_hw_encoder", (long) i8);
            C63929ab.m250974a("TEAudioHwEncoder", "initEncoder, result: " + i7 + ", monitor: " + i8);
            return i7;
        }
    }
}
