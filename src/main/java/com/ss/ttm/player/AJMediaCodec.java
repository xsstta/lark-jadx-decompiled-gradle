package com.ss.ttm.player;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.ss.ttm.utils.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

class AJMediaCodec {
    private static Object mCodecListLock = new Object();
    private static boolean mDeviceNeedsSetOutputSurfaceWorkaround = false;
    private static boolean mEvaluatedDeviceNeedsSetOutputSurfaceWorkaround = false;
    private static boolean mIsByteVC1Blocklist = false;
    private static int mIsByteVC1BlocklistEnable = 1;
    private static boolean mIsInitDetected = false;
    private static boolean mNeedByteVC1WorkAround = false;
    private static ArrayList<MediaCodecInfo> mVideoHWDecoderCodecs = new ArrayList<>();
    private MediaCodec.BufferInfo mBufferInfo;
    private Surface mDummySurface;
    private String mExceptionInfo;
    private ByteBuffer[] mInputBuffers;
    private boolean mInputBuffersValid;
    private MediaCodec mMediaCodec;
    private ByteBuffer[] mOutputBuffers;
    private MediaFormat mOutputMediaFormat;

    public boolean MTKByteVC1NeedWorkAround() {
        return mNeedByteVC1WorkAround;
    }

    public String getErrorInfo() {
        return this.mExceptionInfo;
    }

    public int getOSVerion() {
        return Util.SDK_INT;
    }

    private boolean supportSetSurface() {
        return !mDeviceNeedsSetOutputSurfaceWorkaround;
    }

    private void createDummySurface() {
        Log.d("aj_media_codec", "create dummy surface");
        this.mDummySurface = DummySurface.newInstanceV17(false);
    }

    public int getChannelCount() {
        MediaFormat mediaFormat = this.mOutputMediaFormat;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("channel-count");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public ByteBuffer[] getInputBuffers() {
        if (this.mInputBuffersValid) {
            return this.mInputBuffers;
        }
        return null;
    }

    public int getSampleRate() {
        MediaFormat mediaFormat = this.mOutputMediaFormat;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("sample-rate");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getSliceHeight() {
        MediaFormat mediaFormat = this.mOutputMediaFormat;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("slice-height");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getStride() {
        MediaFormat mediaFormat = this.mOutputMediaFormat;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("stride");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public void flush() {
        Log.i("aj_media_codec", "flush");
        try {
            this.mMediaCodec.flush();
        } catch (Exception unused) {
        }
        Log.i("aj_media_codec", "flush done");
    }

    public int getColorFormat() {
        MediaFormat mediaFormat = this.mOutputMediaFormat;
        if (mediaFormat != null) {
            try {
                int integer = mediaFormat.getInteger("color-format");
                if (integer == 21 || integer == 2130706688 || integer == 2141391872) {
                    return 3;
                }
                return 0;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getColorTransfer() {
        MediaFormat mediaFormat = this.mOutputMediaFormat;
        if (mediaFormat != null) {
            try {
                int integer = mediaFormat.getInteger("color-transfer");
                if (integer == 6) {
                    return 16;
                }
                if (integer != 7) {
                    return 0;
                }
                return 18;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int stop() {
        if (this.mInputBuffersValid) {
            Log.i("aj_media_codec", "stop");
            try {
                this.mInputBuffersValid = false;
                this.mMediaCodec.stop();
            } catch (Exception unused) {
                Log.d("aj_media_codec", "mediacodec stop exception");
                return -1;
            }
        }
        return 0;
    }

    private boolean isMtkByteVC1BlockList() {
        String lowerCase = Util.HARDWARE.toLowerCase(Locale.US);
        if (lowerCase.startsWith("mt6763") || lowerCase.startsWith("mt6757") || lowerCase.startsWith("mt6739") || lowerCase.startsWith("mt6750")) {
            return true;
        }
        return false;
    }

    public void close() {
        Log.i("aj_media_codec", "close start");
        if (this.mMediaCodec != null) {
            stop();
            final MediaCodec mediaCodec = this.mMediaCodec;
            this.mInputBuffers = null;
            this.mOutputBuffers = null;
            this.mMediaCodec = null;
            try {
                AVThreadPool.addTask(new Runnable() {
                    /* class com.ss.ttm.player.AJMediaCodec.RunnableC654091 */

                    public void run() {
                        Log.i("aj_media_codec", "start releaseCodec task");
                        AJMediaCodec.this.releaseCodec(mediaCodec);
                    }
                });
            } catch (Throwable unused) {
                Log.w("aj_media_codec", "new thread failed");
                releaseCodec(mediaCodec);
            }
        }
        Log.i("aj_media_codec", "close end");
    }

    public int start() {
        Log.i("aj_media_codec", "start");
        try {
            this.mMediaCodec.start();
            this.mInputBuffers = this.mMediaCodec.getInputBuffers();
            if (Util.SDK_INT >= 21) {
                this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
            }
            this.mInputBuffersValid = true;
            this.mBufferInfo = new MediaCodec.BufferInfo();
            Log.i("aj_media_codec", "start end");
            return 0;
        } catch (Exception e) {
            handleCodecException(e);
            return -1;
        }
    }

    public int vendorOppoHWEnable() {
        if (Util.BARND.equals("OPPO")) {
            String property = getProperty("persist.sys.aweme.hdsupport", "1");
            Log.i("aj_media_codec", "oppo property = " + property);
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException unused) {
                Log.w("aj_media_codec", "vendor oppo property abnormal");
            }
        }
        return 1;
    }

    public AJMediaCodec() {
        boolean z;
        if (!mIsInitDetected) {
            if (!Util.HARDWARE.toLowerCase(Locale.US).startsWith("mt") || Util.SDK_INT >= 26) {
                z = false;
            } else {
                z = true;
            }
            mNeedByteVC1WorkAround = z;
            if (isHisiByteVC1BlockList() || isMtkByteVC1BlockList()) {
                mIsByteVC1Blocklist = true;
            }
        }
        codecNeedsSetOutputSurfaceWorkaround();
        mIsInitDetected = true;
        Log.i("aj_media_codec", "initialize, need workaround " + mDeviceNeedsSetOutputSurfaceWorkaround);
    }

    private boolean isHisiByteVC1BlockList() {
        String property = getProperty("ro.board.platform", null);
        if (Util.SDK_INT != 26 || property == null) {
            return false;
        }
        if (!property.startsWith("kirin960") && !property.startsWith("hi3660")) {
            return false;
        }
        double d = 0.0d;
        try {
            d = Double.parseDouble(getProperty("ro.config.hw_codec_support", "0.0"));
        } catch (NumberFormatException unused) {
            Log.w("aj_media_codec", "vendor property abnormal");
        }
        if (d < 0.18041d) {
            return true;
        }
        return false;
    }

    public int getFormatHeight() {
        boolean z;
        MediaFormat mediaFormat = this.mOutputMediaFormat;
        if (mediaFormat != null) {
            try {
                if (!mediaFormat.containsKey("crop-right") || !this.mOutputMediaFormat.containsKey("crop-left") || !this.mOutputMediaFormat.containsKey("crop-bottom") || !this.mOutputMediaFormat.containsKey("crop-top")) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return (this.mOutputMediaFormat.getInteger("crop-bottom") - this.mOutputMediaFormat.getInteger("crop-top")) + 1;
                }
                return this.mOutputMediaFormat.getInteger("height");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getFormatWidth() {
        boolean z;
        MediaFormat mediaFormat = this.mOutputMediaFormat;
        if (mediaFormat != null) {
            try {
                if (!mediaFormat.containsKey("crop-right") || !this.mOutputMediaFormat.containsKey("crop-left") || !this.mOutputMediaFormat.containsKey("crop-bottom") || !this.mOutputMediaFormat.containsKey("crop-top")) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return (this.mOutputMediaFormat.getInteger("crop-right") - this.mOutputMediaFormat.getInteger("crop-left")) + 1;
                }
                return this.mOutputMediaFormat.getInteger("width");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean codecNeedsSetOutputSurfaceWorkaround() {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.codecNeedsSetOutputSurfaceWorkaround():boolean");
    }

    public void setEnableVC1BlockList(int i) {
        mIsByteVC1BlocklistEnable = i;
    }

    public int handleCodecException(Exception exc) {
        this.mExceptionInfo = exc.toString();
        if (Util.SDK_INT >= 21) {
            return handleCodecExceptionV21(exc);
        }
        if (exc instanceof IllegalStateException) {
            return -10002;
        }
        return -10000;
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        if (Util.SDK_INT < 18 || ((Util.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (Util.SDK_INT == 19 && Util.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str))))) {
            return true;
        }
        return false;
    }

    public int createByCodecName(String str) {
        Log.i("aj_media_codec", "createByCodecName = " + str);
        try {
            this.mMediaCodec = MediaCodec.createByCodecName(str);
            return 0;
        } catch (Exception e) {
            handleCodecException(e);
            Log.d("aj_media_codec", "createByCodecName fail = " + e.toString());
            return -1;
        }
    }

    public int dequeueInputBuffer(long j) {
        try {
            return this.mMediaCodec.dequeueInputBuffer(j);
        } catch (Exception e) {
            Log.d("aj_media_codec", "dequeueInputBuffer failed, exception: " + e);
            return handleCodecException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r5 != null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseCodec(android.media.MediaCodec r5) {
        /*
            r4 = this;
            java.lang.String r0 = "codec release end"
            java.lang.String r1 = "aj_media_codec"
            if (r5 != 0) goto L_0x0007
            return
        L_0x0007:
            r2 = 0
            r5.release()     // Catch:{ Exception -> 0x0028, all -> 0x0018 }
            android.view.Surface r5 = r4.mDummySurface
            if (r5 == 0) goto L_0x0014
        L_0x000f:
            r5.release()
            r4.mDummySurface = r2
        L_0x0014:
            android.util.Log.i(r1, r0)
            goto L_0x002f
        L_0x0018:
            r5 = move-exception
            android.view.Surface r3 = r4.mDummySurface
            if (r3 == 0) goto L_0x0024
            android.view.Surface r3 = r4.mDummySurface
            r3.release()
            r4.mDummySurface = r2
        L_0x0024:
            android.util.Log.i(r1, r0)
            throw r5
        L_0x0028:
            android.view.Surface r5 = r4.mDummySurface
            if (r5 == 0) goto L_0x0014
            android.view.Surface r5 = r4.mDummySurface
            goto L_0x000f
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.releaseCodec(android.media.MediaCodec):void");
    }

    public void decodeFRC(int i) {
        if (this.mMediaCodec != null && this.mInputBuffersValid && Util.SDK_INT >= 23) {
            Log.i("aj_media_codec", "frc level = " + i);
            Bundle bundle = new Bundle();
            bundle.putInt("vivo.video-dec.dynamic-frc", i);
            try {
                this.mMediaCodec.setParameters(bundle);
            } catch (Exception e) {
                Log.w("aj_media_codec", "setParameters failed ret = " + e);
            }
        }
    }

    public int handleCodecExceptionV21(Exception exc) {
        if (exc instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) exc;
            if (Util.SDK_INT >= 23) {
                Log.d("aj_media_codec", "exception codecExc isRecoverable: " + codecException.isRecoverable() + ", errorcode: " + codecException.getErrorCode());
                if (!(codecException.isRecoverable() || codecException.getErrorCode() == 1100 || codecException.getErrorCode() == 1101)) {
                    return -10001;
                }
            } else {
                Log.d("aj_media_codec", "exception codecExc isRecoverable: " + codecException.isRecoverable());
                if (!codecException.isRecoverable()) {
                    return -10001;
                }
            }
        }
        if (exc instanceof IllegalStateException) {
            return -10002;
        }
        return -10000;
    }

    public int setOutputSurface(Surface surface) {
        Log.d("aj_media_codec", "setoutput surface = " + surface);
        if (mDeviceNeedsSetOutputSurfaceWorkaround || !this.mInputBuffersValid) {
            return -1;
        }
        if (surface == null) {
            if (this.mDummySurface == null) {
                createDummySurface();
            }
            surface = this.mDummySurface;
            Log.i("aj_media_codec", "use dummy surface");
        }
        Log.d("aj_media_codec", "setoutputSurface = " + surface);
        return setOutputSurfaceV23(this.mMediaCodec, surface);
    }

    public void speedEnhance(float f) {
        if (this.mMediaCodec != null && this.mInputBuffersValid && Util.SDK_INT >= 23 && f > 30.0f) {
            Log.i("aj_media_codec", "rate " + f);
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", f);
            try {
                this.mMediaCodec.setParameters(bundle);
            } catch (Exception e) {
                Log.w("aj_media_codec", "setParameters failed ret = " + e);
            }
        }
    }

    public int write(AJMediaCodecFrame aJMediaCodecFrame) {
        if (aJMediaCodecFrame == null || aJMediaCodecFrame.data == null) {
            Log.d("aj_media_codec", "buffer is nullpoint");
            return -1;
        }
        try {
            int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(30000);
            if (dequeueInputBuffer >= 0) {
                this.mInputBuffers[dequeueInputBuffer].put(aJMediaCodecFrame.data);
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, aJMediaCodecFrame.size, aJMediaCodecFrame.pts, 0);
                return 0;
            } else if (dequeueInputBuffer == -1) {
                return 4;
            } else {
                return -1;
            }
        } catch (Exception e) {
            Log.e("aj_media_codec", "write meet exception =" + e);
            return -1;
        }
    }

    public String getBestCodecName(String str) {
        int i;
        MediaCodecInfo mediaCodecInfo;
        String[] supportedTypes;
        AJMediaCodecRank aJMediaCodecRank;
        if (Util.SDK_INT < 16) {
            Log.d("aj_media_codec", "API < 16");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            if (!str.equals("video/hevc") || !mIsByteVC1Blocklist || mIsByteVC1BlocklistEnable <= 0) {
                Log.i("aj_media_codec", "detect hardware codec by codecType = " + str);
                ArrayList arrayList = new ArrayList();
                synchronized (mCodecListLock) {
                    boolean z = !mVideoHWDecoderCodecs.isEmpty();
                    if (z) {
                        try {
                            i = mVideoHWDecoderCodecs.size();
                        } catch (Exception unused) {
                            Log.w("aj_media_codec", "mediaserver died");
                            return null;
                        }
                    } else {
                        i = MediaCodecList.getCodecCount();
                    }
                    for (int i2 = 0; i2 < i && (!z || arrayList.isEmpty()); i2++) {
                        if (z) {
                            mediaCodecInfo = mVideoHWDecoderCodecs.get(i2);
                        } else {
                            mediaCodecInfo = MediaCodecList.getCodecInfoAt(i2);
                        }
                        String name = mediaCodecInfo.getName();
                        Log.d("aj_media_codec", "found codec name : " + name);
                        if (!mediaCodecInfo.isEncoder() && !name.startsWith("OMX.google") && !name.startsWith("c2.android") && (supportedTypes = mediaCodecInfo.getSupportedTypes()) != null) {
                            for (String str2 : supportedTypes) {
                                if (!TextUtils.isEmpty(str2)) {
                                    if (!z && str2.startsWith("video/")) {
                                        mVideoHWDecoderCodecs.add(mediaCodecInfo);
                                    }
                                    if (str2.equalsIgnoreCase(str)) {
                                        Log.d("aj_media_codec", "codec types : " + str2);
                                        if ((name.startsWith("OMX.") || name.startsWith("c2.")) && !name.startsWith("OMX.pv") && !name.startsWith("OMX.ittiam") && !name.contains("ffmpeg") && !name.contains("avcodec") && !name.contains("secure") && ((!name.startsWith("OMX.MTK.") || Util.SDK_INT >= 18) && !codecNeedsFlushWorkaround(name) && (aJMediaCodecRank = AJMediaCodecRank.setupRank(mediaCodecInfo, str)) != null)) {
                                            Log.i("aj_media_codec", "codec : " + aJMediaCodecRank.mMediaCodecInfo.getName() + ",  rank : " + aJMediaCodecRank.mRank);
                                            if (aJMediaCodecRank.mRank == 40 && Util.SDK_INT < 21) {
                                                Log.w("aj_media_codec", "skip vendor mediacodec api impl ambiguous");
                                            } else if (aJMediaCodecRank.mRank == 20) {
                                                Log.w("aj_media_codec", "skip vendor software codec");
                                            } else {
                                                arrayList.add(aJMediaCodecRank);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    AJMediaCodecRank aJMediaCodecRank2 = (AJMediaCodecRank) arrayList.get(0);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AJMediaCodecRank aJMediaCodecRank3 = (AJMediaCodecRank) it.next();
                        if (aJMediaCodecRank3.mRank > aJMediaCodecRank2.mRank) {
                            aJMediaCodecRank2 = aJMediaCodecRank3;
                        }
                    }
                    return aJMediaCodecRank2.mMediaCodecInfo.getName();
                }
            }
            Log.w("aj_media_codec", "the device is hw decoder blocklist," + Util.HARDWARE);
            return null;
        }
    }

    public static int ceilDivide(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    private int renderOutputBufferV21(int i, long j) {
        try {
            this.mMediaCodec.releaseOutputBuffer(i, j);
            return 0;
        } catch (Exception unused) {
            return -10000;
        }
    }

    public static String getProperty(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return str2;
    }

    private int setOutputSurfaceV23(MediaCodec mediaCodec, Surface surface) {
        try {
            mediaCodec.setOutputSurface(surface);
            return 0;
        } catch (Exception e) {
            handleCodecException(e);
            Log.w("aj_media_codec", "setoutputsurface failed = " + e);
            return -1;
        }
    }

    public int read(AJMediaCodecFrame aJMediaCodecFrame, long j) {
        while (true) {
            try {
                int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, j);
                if (dequeueOutputBuffer >= 0) {
                    aJMediaCodecFrame.data = this.mOutputBuffers[dequeueOutputBuffer];
                    aJMediaCodecFrame.pts = this.mBufferInfo.presentationTimeUs;
                    aJMediaCodecFrame.index = dequeueOutputBuffer;
                    aJMediaCodecFrame.size = this.mBufferInfo.size;
                    aJMediaCodecFrame.flags = this.mBufferInfo.flags;
                    return 0;
                } else if (dequeueOutputBuffer == -3) {
                    Log.i("aj_media_codec", "INFO_OUTPUT_BUFFERS_CHANGED");
                    try {
                        this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
                    } catch (Exception e) {
                        Log.i("aj_media_codec", "getOutputBuffers e = " + e);
                        return handleCodecException(e);
                    }
                } else if (dequeueOutputBuffer == -2) {
                    Log.i("aj_media_codec", "INFO_OUTPUT_FORMAT_CHANGED");
                    try {
                        this.mOutputMediaFormat = this.mMediaCodec.getOutputFormat();
                        if (this.mOutputBuffers == null) {
                            try {
                                this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
                            } catch (Exception e2) {
                                Log.i("aj_media_codec", "getOutputBuffers e = " + e2);
                                return handleCodecException(e2);
                            }
                        }
                        return dequeueOutputBuffer;
                    } catch (Exception e3) {
                        Log.i("aj_media_codec", "getOutputFormat e =" + e3);
                        return handleCodecException(e3);
                    }
                } else {
                    if (dequeueOutputBuffer != -1) {
                        Log.e("aj_media_codec", "error, idx = " + dequeueOutputBuffer);
                    }
                    return -1;
                }
            } catch (Exception e4) {
                Log.i("aj_media_codec", "dequeueOutputBuffer e :" + e4);
                return handleCodecException(e4);
            }
        }
    }

    private static void maybeSetInteger(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    private static void maybeSetCsdBuffers(MediaFormat mediaFormat, ByteBuffer byteBuffer, int i) {
        if (byteBuffer != null) {
            mediaFormat.setByteBuffer("csd-" + i, byteBuffer);
        }
    }

    public int releaseBuffer(int i, boolean z, long j) {
        if (Util.SDK_INT >= 21 && z) {
            return renderOutputBufferV21(i, j);
        }
        try {
            this.mMediaCodec.releaseOutputBuffer(i, z);
            return 0;
        } catch (Exception e) {
            return handleCodecException(e);
        }
    }

    private static int getMaxInputSize(String str, int i, int i2) {
        int i3;
        int i4;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        if (!str.equals("video/3gpp") && !str.equals("video/mp4v-es")) {
            if (str.equals("video/avc")) {
                if ("BRAVIA 4K 2015".equals(Util.MODEL)) {
                    return -1;
                }
                i3 = ceilDivide(i, 16) * ceilDivide(i2, 16) * 16 * 16;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            } else if (!str.equals("video/x-vnd.on2.vp8")) {
                if (!str.equals("video/hevc") && !str.equals("video/x-vnd.on2.vp9")) {
                    return -1;
                }
                i3 = i * i2;
                i4 = 4;
                return (i3 * 3) / (i4 * 2);
            }
        }
        i3 = i * i2;
        i4 = 2;
        return (i3 * 3) / (i4 * 2);
    }

    public int queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        try {
            this.mMediaCodec.queueInputBuffer(i, i2, i3, j, i4);
            return 0;
        } catch (Exception e) {
            Log.d("aj_media_codec", "queueInputBuffer failed, exception: " + e);
            return handleCodecException(e);
        }
    }

    public int open(int i, int i2, int i3, String str, String str2, ByteBuffer byteBuffer, Surface surface) {
        Log.i("aj_media_codec", "open, rotation = " + i3 + "; codecName = " + str + "; codecType =" + str2);
        try {
            this.mMediaCodec = MediaCodec.createByCodecName(str);
            Log.i("aj_media_codec", "configure mediacodec");
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", str2);
            maybeSetInteger(mediaFormat, "width", i);
            maybeSetInteger(mediaFormat, "height", i2);
            if (byteBuffer != null) {
                mediaFormat.setByteBuffer("csd-0", byteBuffer);
            }
            if (surface != null && Util.SDK_INT >= 21) {
                maybeSetInteger(mediaFormat, "rotation-degrees", i3);
            }
            try {
                this.mMediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, 0);
                Log.i("aj_media_codec", "mediacodec start");
                try {
                    this.mMediaCodec.start();
                    this.mInputBuffers = this.mMediaCodec.getInputBuffers();
                    this.mInputBuffersValid = true;
                    Log.d("aj_media_codec", String.format(Locale.US, "open() input params. width:%d,height:%d", Integer.valueOf(i), Integer.valueOf(i2)));
                    return 0;
                } catch (Exception e) {
                    Log.d("aj_media_codec", e.toString());
                    return -1;
                }
            } catch (Exception e2) {
                Log.d("aj_media_codec", e2.toString());
                return -1;
            }
        } catch (Exception e3) {
            Log.d("aj_media_codec", e3.toString());
            return -1;
        }
    }

    public int configure(int i, int i2, int i3, int i4, int i5, String str, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, Surface surface, boolean z, boolean z2, int i6, int i7, boolean z3, int i8, boolean z4, boolean z5, int i9, int i10) {
        Surface surface2 = surface;
        int i11 = i6;
        int i12 = i7;
        Log.i("aj_media_codec", "configure =" + surface2 + ", surfaceConfigure =" + z);
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        maybeSetInteger(mediaFormat, "width", i);
        maybeSetInteger(mediaFormat, "height", i2);
        if (!(i11 == -1 || i12 == -1)) {
            if (i11 <= i) {
                i11 = i;
            }
            maybeSetInteger(mediaFormat, "max-width", i11);
            if (i12 <= i2) {
                i12 = i2;
            }
            maybeSetInteger(mediaFormat, "max-height", i12);
        }
        maybeSetInteger(mediaFormat, "sample-rate", i4);
        maybeSetInteger(mediaFormat, "channel-count", i5);
        Log.i("aj_media_codec", "format  = " + mediaFormat);
        int maxInputSize = getMaxInputSize(str, i, i2);
        Log.i("aj_media_codec", "max input = " + maxInputSize);
        maybeSetInteger(mediaFormat, "max-input-size", maxInputSize);
        maybeSetCsdBuffers(mediaFormat, byteBuffer, 0);
        maybeSetCsdBuffers(mediaFormat, byteBuffer2, 1);
        maybeSetCsdBuffers(mediaFormat, byteBuffer3, 2);
        if (z) {
            if (Util.SDK_INT >= 21) {
                maybeSetInteger(mediaFormat, "rotation-degrees", i3);
            }
            if ((surface2 == null || !surface.isValid()) && this.mDummySurface == null && Util.SDK_INT >= 23 && !mDeviceNeedsSetOutputSurfaceWorkaround) {
                Log.i("aj_media_codec", "create dummy surface");
                createDummySurface();
                surface2 = this.mDummySurface;
            }
            if (surface2 == null) {
                this.mExceptionInfo = "Error: configure with null surface";
                return -10003;
            }
        }
        if (Util.SDK_INT >= 23 && z2) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z3) {
            VendorQTI.setupVpp(mediaFormat, i8);
        }
        if (z4) {
            VendorQTI.debugEffect(mediaFormat);
        }
        if (z5) {
            VendorQTI.enableLowLatency(mediaFormat);
        }
        if (i10 > 0 && i9 >= 0) {
            String dolbyCodecs = MediaCodecUtil.getDolbyCodecs(i9, i10);
            Log.d("aj_media_codec", "dv codecs = " + dolbyCodecs);
            Pair<Integer, Integer> dolbyVisionProfileAndLevel = MediaCodecUtil.getDolbyVisionProfileAndLevel(dolbyCodecs, dolbyCodecs.split("\\."));
            if (dolbyVisionProfileAndLevel != null) {
                Log.d("aj_media_codec", "dv profile & level  = " + dolbyVisionProfileAndLevel.toString());
                maybeSetInteger(mediaFormat, "profile", ((Integer) dolbyVisionProfileAndLevel.first).intValue());
            }
        }
        try {
            this.mMediaCodec.configure(mediaFormat, surface2, (MediaCrypto) null, 0);
            return 0;
        } catch (Exception e) {
            handleCodecException(e);
            Log.d("aj_media_codec", "configure failed = " + this.mMediaCodec + ", ex=" + e.toString());
            if (e instanceof IllegalArgumentException) {
                return -10003;
            }
            return -1;
        }
    }
}
