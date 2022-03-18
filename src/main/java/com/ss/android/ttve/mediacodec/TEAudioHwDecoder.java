package com.ss.android.ttve.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.vesdk.C63929ab;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

public class TEAudioHwDecoder {
    private static long INPUT_DEQUEUE_TIMEOUT_US = 10000;
    private MediaCodec audioDecoder;
    private byte[] curAsc;
    private int curChannelCount = -1;
    private String curMimeType;
    private int curSampleRate = -1;
    private volatile boolean decoderStarted;
    private volatile long inputCountQueued;
    private volatile boolean inputEof;
    private MediaFormat inputFormat;
    private MediaCodec.BufferInfo outputBufferInfo = new MediaCodec.BufferInfo();
    private volatile long outputCountDequeued;
    private volatile boolean outputEof;
    private MediaFormat outputFormat;
    private LinkedBlockingQueue<C60195a> pcmQueue = new LinkedBlockingQueue<>();
    private C60195a theOldestPcmData;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ttve.mediacodec.TEAudioHwDecoder$a */
    public static class C60195a {

        /* renamed from: a */
        public byte[] f150239a;

        /* renamed from: b */
        public long f150240b;

        /* renamed from: c */
        public int f150241c;

        private C60195a() {
        }
    }

    private int restartDecoder() {
        releaseDecoder();
        return startDecoder();
    }

    private byte[] getPcmData() {
        C60195a aVar = this.theOldestPcmData;
        if (aVar != null) {
            return aVar.f150239a;
        }
        return null;
    }

    private long getPcmPts() {
        C60195a aVar = this.theOldestPcmData;
        if (aVar != null) {
            return aVar.f150240b;
        }
        return -1;
    }

    private void resetCodecInfo() {
        this.inputCountQueued = 0;
        this.outputCountDequeued = 0;
        this.inputEof = false;
        this.outputEof = false;
    }

    private TEAudioHwDecoder() {
    }

    private int closeDecoder() {
        C63929ab.m250974a("TEAudioHwDecoder", "closeDecoder, " + hashCode());
        releaseDecoder();
        this.curMimeType = null;
        this.curSampleRate = -1;
        this.curChannelCount = -1;
        this.curAsc = null;
        return 0;
    }

    private void releaseDecoder() {
        if (this.audioDecoder != null) {
            if (this.decoderStarted) {
                try {
                    this.audioDecoder.stop();
                } catch (Exception e) {
                    C63929ab.m250980d("TEAudioHwDecoder", "MediaCodec stop exception: " + e.getMessage());
                }
                this.decoderStarted = false;
            }
            this.audioDecoder.release();
            this.audioDecoder = null;
            resetCodecInfo();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039 A[SYNTHETIC, Splitter:B:11:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.media.MediaCodec selectMediaCodec() {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwDecoder.selectMediaCodec():android.media.MediaCodec");
    }

    private int startDecoder() {
        try {
            MediaCodec selectMediaCodec = selectMediaCodec();
            this.audioDecoder = selectMediaCodec;
            if (selectMediaCodec == null) {
                C63929ab.m250980d("TEAudioHwDecoder", "create decoder failure, mime: " + this.curMimeType);
                return -201;
            }
            selectMediaCodec.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 0);
            this.audioDecoder.start();
            this.decoderStarted = true;
            return 0;
        } catch (Exception e) {
            C63929ab.m250980d("TEAudioHwDecoder", "startDecoder: " + e.getMessage());
            return -203;
        }
    }

    private int drainOutputBuffer() {
        while (true) {
            try {
                if (this.outputEof) {
                    break;
                }
                int dequeueOutputBuffer = this.audioDecoder.dequeueOutputBuffer(this.outputBufferInfo, 0);
                if (dequeueOutputBuffer >= 0) {
                    if (this.outputBufferInfo.size > 0) {
                        ByteBuffer geOutputBufferByIndex = geOutputBufferByIndex(dequeueOutputBuffer);
                        geOutputBufferByIndex.position(this.outputBufferInfo.offset);
                        geOutputBufferByIndex.limit(this.outputBufferInfo.offset + this.outputBufferInfo.size);
                        byte[] bArr = new byte[this.outputBufferInfo.size];
                        geOutputBufferByIndex.get(bArr);
                        addPcmData(bArr);
                        this.outputCountDequeued++;
                    }
                    this.audioDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.outputBufferInfo.flags & 4) != 0) {
                        C63929ab.m250974a("TEAudioHwDecoder", "output buffer eof");
                        this.outputEof = true;
                        break;
                    }
                } else if (dequeueOutputBuffer == -3) {
                    C63929ab.m250974a("TEAudioHwDecoder", "output buffer changed, need to getOutputBuffers again");
                } else if (dequeueOutputBuffer == -2) {
                    this.outputFormat = this.audioDecoder.getOutputFormat();
                    C63929ab.m250974a("TEAudioHwDecoder", "output buffer format changed: " + this.outputFormat);
                    int integer = this.outputFormat.getInteger("sample-rate");
                    int integer2 = this.outputFormat.getInteger("channel-count");
                    if (this.curSampleRate != integer || this.curChannelCount != integer2) {
                        C63929ab.m250980d("TEAudioHwDecoder", "audio meta info changed, error error error !!!");
                    }
                } else if (dequeueOutputBuffer != -1) {
                    C63929ab.m250976b("TEAudioHwDecoder", "not available output buffer");
                }
            } catch (Throwable th) {
                C63929ab.m250980d("TEAudioHwDecoder", "drainOutputBuffer error: " + th.getMessage());
                return -6000;
            }
        }
        return 0;
    }

    private int flushDecoder() {
        int i;
        C63929ab.m250974a("TEAudioHwDecoder", "flushDecoder, inputEof: " + this.inputEof + ", outputEof: " + this.outputEof + ", inputCountQueued: " + this.inputCountQueued + ", " + hashCode());
        if (this.audioDecoder == null) {
            return -204;
        }
        try {
            if (!this.inputEof) {
                if (!this.outputEof) {
                    if (this.inputCountQueued > 0) {
                        this.audioDecoder.flush();
                        this.inputCountQueued = 0;
                        this.outputCountDequeued = 0;
                    }
                    this.pcmQueue.clear();
                    this.theOldestPcmData = null;
                    return 0;
                }
            }
            i = restartDecoder();
        } catch (Throwable th) {
            this.pcmQueue.clear();
            this.theOldestPcmData = null;
            throw th;
        }
        this.pcmQueue.clear();
        this.theOldestPcmData = null;
        return i;
    }

    private MediaCodecInfo getGoogleMediaCodecInfo() {
        boolean z;
        if (TextUtils.isEmpty(this.curMimeType)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (!mediaCodecInfo.isEncoder() && mediaCodecInfo.getName().contains("OMX.google")) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        } else if (supportedTypes[i].equalsIgnoreCase(this.curMimeType)) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (z) {
                        MediaCodecInfo.AudioCapabilities audioCapabilities = mediaCodecInfo.getCapabilitiesForType(this.curMimeType).getAudioCapabilities();
                        if (!audioCapabilities.isSampleRateSupported(this.curSampleRate)) {
                            C63929ab.m250980d("TEAudioHwDecoder", mediaCodecInfo.getName() + " not support SampleRate: " + this.curSampleRate);
                        } else if (this.curChannelCount <= audioCapabilities.getMaxInputChannelCount()) {
                            return mediaCodecInfo;
                        } else {
                            C63929ab.m250980d("TEAudioHwDecoder", mediaCodecInfo.getName() + " not support ChannelCount: " + this.curChannelCount + ", max channel count is " + audioCapabilities.getMaxInputChannelCount());
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < codecCount; i2++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                if (!codecInfoAt.isEncoder() && codecInfoAt.getName().contains("OMX.google")) {
                    for (String str : codecInfoAt.getSupportedTypes()) {
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

    private void addPcmData(byte[] bArr) {
        C60195a aVar = new C60195a();
        aVar.f150239a = bArr;
        aVar.f150240b = this.outputBufferInfo.presentationTimeUs;
        aVar.f150241c = this.outputBufferInfo.flags;
        this.pcmQueue.add(aVar);
    }

    private ByteBuffer geOutputBufferByIndex(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.audioDecoder.getOutputBuffer(i);
        }
        return this.audioDecoder.getOutputBuffers()[i];
    }

    private ByteBuffer getInputBufferByIndex(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.audioDecoder.getInputBuffer(i);
        }
        return this.audioDecoder.getInputBuffers()[i];
    }

    private boolean sameAsc(byte[] bArr) {
        byte[] bArr2 = this.curAsc;
        if (bArr2 == null && bArr == null) {
            return true;
        }
        if (bArr2 == null || bArr == null || bArr2.length != bArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr3 = this.curAsc;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr3[i] != bArr[i]) {
                return false;
            }
            i++;
        }
    }

    private int[] decodeFrame(byte[] bArr, long j) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        if (bArr == null || bArr.length <= 0) {
            i2 = 0;
            i = 0;
            z = true;
        } else {
            i2 = bArr.length;
            i = 0;
            z = false;
        }
        while (true) {
            try {
                if (this.inputEof || (i >= i2 && !z)) {
                    break;
                }
                int dequeueInputBuffer = this.audioDecoder.dequeueInputBuffer(INPUT_DEQUEUE_TIMEOUT_US);
                if (dequeueInputBuffer >= 0) {
                    if (z) {
                        this.audioDecoder.queueInputBuffer(dequeueInputBuffer, 0, 0, j, 4);
                        this.inputEof = true;
                        C63929ab.m250974a("TEAudioHwDecoder", "input buffer eof");
                        break;
                    }
                    ByteBuffer inputBufferByIndex = getInputBufferByIndex(dequeueInputBuffer);
                    inputBufferByIndex.clear();
                    int min = Math.min(i2 - i, inputBufferByIndex.remaining());
                    inputBufferByIndex.put(bArr, i, min);
                    i += min;
                    this.audioDecoder.queueInputBuffer(dequeueInputBuffer, 0, min, j, 0);
                    this.inputCountQueued++;
                } else if (dequeueInputBuffer == -1) {
                    C63929ab.m250976b("TEAudioHwDecoder", "dequeue input buffer timeout, try again later");
                } else {
                    C63929ab.m250976b("TEAudioHwDecoder", "not available input buffer");
                }
            } catch (Throwable th) {
                C63929ab.m250980d("TEAudioHwDecoder", "drainOutputBuffer error: " + th.getMessage());
                i3 = -5000;
            }
        }
        i3 = drainOutputBuffer();
        C60195a poll = this.pcmQueue.poll();
        this.theOldestPcmData = poll;
        if (poll != null) {
            i4 = poll.f150239a.length;
        } else {
            i4 = 0;
        }
        return new int[]{i3, i, i4};
    }

    private int initDecoder(String str, int i, int i2, byte[] bArr) {
        boolean z;
        int i3;
        if (TextUtils.isEmpty(str) || i <= 0 || i2 <= 0) {
            return -101;
        }
        if (!str.equals(this.curMimeType) || this.curSampleRate != i || this.curChannelCount != i2 || !sameAsc(bArr)) {
            z = true;
        } else {
            z = false;
        }
        this.curMimeType = str;
        this.curSampleRate = i;
        this.curChannelCount = i2;
        this.curAsc = bArr;
        StringBuilder sb = new StringBuilder();
        sb.append("initDecoder, mimeType: ");
        sb.append(str);
        sb.append(", sampleRate: ");
        sb.append(i);
        sb.append(", channelCount: ");
        sb.append(i2);
        sb.append(", asc size: ");
        if (bArr != null) {
            i3 = bArr.length;
        } else {
            i3 = -1;
        }
        sb.append(i3);
        sb.append(", this: ");
        sb.append(hashCode());
        C63929ab.m250974a("TEAudioHwDecoder", sb.toString());
        if (!z && this.decoderStarted) {
            return 0;
        }
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i, i2);
        this.inputFormat = createAudioFormat;
        if (bArr == null || bArr.length <= 0) {
            createAudioFormat.setInteger("is-adts", 1);
        } else {
            createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
        }
        if (Build.VERSION.SDK_INT == 16) {
            this.inputFormat.setInteger("max-input-size", 0);
        }
        return restartDecoder();
    }
}
