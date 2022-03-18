package com.ss.android.ttve.mediacodec;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.core.p028b.C0745a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ttve.common.C60185d;
import com.ss.android.ttve.common.C60188f;
import com.ss.android.ttve.common.C60190h;
import com.ss.android.ttve.common.C60191i;
import com.ss.android.ttve.editorInfo.C60192a;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VERuntimeConfig;
import com.ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TEAvcEncoder {
    private static int CODEC_TYPE_AVC = 0;
    private static int CODEC_TYPE_BYTEVC1 = 1;
    private static boolean DEBUG = false;
    private static int ENCODE_RESOLUTION_ALIGN = 16;
    private static int MAX_FRAME_RATE = 2000;
    private static long MAX_PRODUCT_OF_SIZE_AND_FPS = -1;
    private static int MIN_FRAME_RATE = 7;
    private static final String TAG = "TEAvcEncoder";
    private static int avcqueuesize = 25;
    private static int file_count;
    public ArrayBlockingQueue<C60199a> AVCQueue = new ArrayBlockingQueue<>(avcqueuesize);
    private final int ENCODE_COUNT_DEFAULT = 10;
    private String VIDEO_MIME_TYPE = "video/avc";
    public byte[] configByte = null;
    private int mBufferIndex = -1;
    public ByteBuffer mByteBuf = null;
    int mEncodeBufferCount = 10;
    private boolean mEndOfStream = false;
    private boolean mFirstFrame = true;
    private TEMediaCodecDecoder m_MediaCodecDecInstance = null;
    private Queue<Long> m_PTSQueue = new LinkedList();
    private double m_TransitionKeyframeRatio = 1.0d;
    private boolean m_bByteVC110BitHWDecoder = false;
    private int m_bColorRangeFull = 0;
    private boolean m_bEncodeOESTexture = false;
    private boolean m_bEncoderGLContextReuse = false;
    private boolean m_bNeedSingalEnd = false;
    private boolean m_bSignalEndOfStream = false;
    private boolean m_bSuccessInit = false;
    private int m_bitRate = 0;
    private MediaFormat m_codecFormat = null;
    private int m_codec_type = 0;
    private int m_colorFormat = 0;
    private int m_colorTrc = 0;
    private int m_colorspace = 0;
    private int m_configStatus = 0;
    private double m_dHpBitrateRatio = 0.75d;
    private C60185d m_eglStateSaver;
    private long m_encodeStartTime = -1;
    private int m_frameRate = 0;
    private long m_getnerateIndex = 0;
    private int m_height = 0;
    private int m_height_align = 0;
    private int m_iFrameInternal = 0;
    private boolean m_isNeedReconfigure = false;
    private C60199a m_lastCodecData = null;
    private int m_level = 0;
    private int m_maxBitRate = 0;
    private MediaCodec m_mediaCodec = null;
    private String m_mime_type = this.VIDEO_MIME_TYPE;
    private int m_profile = 0;
    private C60188f m_sharedContext;
    private Surface m_surface = null;
    private C60190h m_textureDrawer;
    private C60191i m_textureOESDrawer = null;
    private boolean m_useInputSurface = true;
    private int m_width = 0;
    private int m_width_align = 0;
    private byte[] pps;
    private byte[] sps;

    /* renamed from: com.ss.android.ttve.mediacodec.TEAvcEncoder$a */
    public static class C60199a {

        /* renamed from: a */
        public byte[] f150247a;

        /* renamed from: b */
        public long f150248b;

        /* renamed from: c */
        public long f150249c;

        /* renamed from: d */
        public int f150250d;
    }

    /* renamed from: com.ss.android.ttve.mediacodec.TEAvcEncoder$b */
    public static class C60200b {

        /* renamed from: a */
        public long f150251a;
    }

    public Surface getInputSurface() {
        return this.m_surface;
    }

    public static TEAvcEncoder createEncoderObject() {
        return new TEAvcEncoder();
    }

    public byte[] getExtraData() {
        byte[] bArr = this.configByte;
        if (bArr != null) {
            return bArr;
        }
        return new byte[0];
    }

    public void setSharedEGLContext() {
        if (this.m_eglStateSaver == null) {
            C60185d dVar = new C60185d();
            this.m_eglStateSaver = dVar;
            dVar.mo205523a();
        }
    }

    public void releaseTextureDrawer() {
        if (this.m_bEncodeOESTexture) {
            C60191i iVar = this.m_textureOESDrawer;
            if (iVar != null) {
                iVar.mo205556b();
                this.m_textureOESDrawer = null;
                return;
            }
            return;
        }
        C60190h hVar = this.m_textureDrawer;
        if (hVar != null) {
            hVar.mo205552b();
            this.m_textureDrawer = null;
        }
    }

    private int forceToPrepareKeyFrame() {
        this.m_mediaCodec.signalEndOfInputStream();
        int i = 30;
        while (!this.mEndOfStream) {
            int drainOutputBuffer = drainOutputBuffer(10000);
            if (drainOutputBuffer == 0) {
                if (this.mBufferIndex >= 0) {
                    break;
                }
                i--;
                if (i <= 0) {
                    break;
                }
            } else {
                C63929ab.m250980d(TAG, "forceToPrepareKeyFrame failed ret: " + drainOutputBuffer);
                return drainOutputBuffer;
            }
        }
        restartEncoder();
        return 0;
    }

    public ByteBuffer getFrameCacheBuf() {
        if (this.mByteBuf == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.m_width * this.m_height * 4);
            this.mByteBuf = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.mByteBuf.position(0);
        return this.mByteBuf;
    }

    public boolean initTextureDrawer() {
        if (this.m_bEncodeOESTexture) {
            C60191i a = C60191i.m233960a();
            this.m_textureOESDrawer = a;
            if (a == null) {
                return false;
            }
            return true;
        }
        C60190h hVar = this.m_textureDrawer;
        if (hVar != null) {
            hVar.mo205552b();
            this.m_textureDrawer = null;
        }
        C60190h a2 = C60190h.m233952a();
        this.m_textureDrawer = a2;
        if (a2 == null) {
            return false;
        }
        a2.mo205546a(BitmapDescriptorFactory.HUE_RED);
        this.m_textureDrawer.mo205547a(1.0f, -1.0f);
        return true;
    }

    public int restartEncoder() {
        this.m_bNeedSingalEnd = false;
        stopEncoder();
        int configEncode = configEncode();
        if (configEncode >= 0) {
            return startEncoder();
        }
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
            C60205c.m233989b(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode());
        }
        return configEncode;
    }

    public void stopEncoder() {
        try {
            this.m_bByteVC110BitHWDecoder = false;
            C60188f fVar = this.m_sharedContext;
            if (fVar != null) {
                fVar.mo205541d();
            }
            C60190h hVar = this.m_textureDrawer;
            if (hVar != null) {
                hVar.mo205552b();
                this.m_textureDrawer = null;
            }
            C60191i iVar = this.m_textureOESDrawer;
            if (iVar != null) {
                iVar.mo205556b();
                this.m_textureOESDrawer = null;
            }
            MediaCodec mediaCodec = this.m_mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void releaseEncoder() {
        stopEncoder();
        C63929ab.m250974a(TAG, "releaseEncoder");
        C60188f fVar = this.m_sharedContext;
        if (fVar != null) {
            if (!this.m_bEncoderGLContextReuse) {
                fVar.mo205539b();
            } else {
                fVar.mo205540c();
            }
            this.m_sharedContext = null;
        }
        if (this.m_surface != null) {
            C63929ab.m250976b(TAG, "release surface");
            this.m_surface.release();
            this.m_surface = null;
        }
        if (this.m_mediaCodec != null) {
            C63929ab.m250976b(TAG, "release mediaCodec");
            this.m_mediaCodec.release();
            this.m_mediaCodec = null;
            if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
                C60205c.m233989b(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode());
            }
        }
    }

    public int startEncoder() {
        C63929ab.m250974a(TAG, "startEncoder...");
        try {
            if (Build.VERSION.SDK_INT >= 18 && this.m_useInputSurface) {
                if (this.m_bEncoderGLContextReuse) {
                    if (this.m_eglStateSaver == null) {
                        C60185d dVar = new C60185d();
                        this.m_eglStateSaver = dVar;
                        dVar.mo205523a();
                    }
                    if (this.m_sharedContext == null) {
                        this.m_sharedContext = C60188f.m233942a(this.m_eglStateSaver.mo205524b(), this.m_eglStateSaver.mo205525c(), (EGLSurface) null, 12610);
                    }
                    this.m_sharedContext.mo205538a(0, 0, 12610, this.m_surface);
                } else {
                    C60188f fVar = this.m_sharedContext;
                    if (fVar == null) {
                        C60188f a = C60188f.m233941a(this.m_eglStateSaver.mo205524b(), 64, 64, 12610, this.m_surface);
                        this.m_sharedContext = a;
                        if (a == null) {
                            return -2;
                        }
                    } else if (!fVar.mo205538a(0, 0, 12610, this.m_surface)) {
                        return -2;
                    }
                }
                if (!initTextureDrawer()) {
                    return -3;
                }
            }
            this.m_mediaCodec.start();
            this.m_encodeStartTime = System.nanoTime();
            this.m_isNeedReconfigure = false;
            this.mEndOfStream = false;
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    private int configEncode() {
        try {
            Surface surface = this.m_surface;
            if (surface != null) {
                surface.release();
                this.m_surface = null;
            }
            MediaCodec mediaCodec = this.m_mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            if (!((Boolean) VEConfigCenter.m250617a().mo220632a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue() || C60205c.m233986a(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode())) {
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(this.m_mime_type);
                this.m_mediaCodec = createEncoderByType;
                MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
                String[] supportedTypes = codecInfo.getSupportedTypes();
                String str = TAG;
                C63929ab.m250976b(str, "configEncode supports " + Arrays.toString(supportedTypes));
                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType(supportedTypes[0]);
                C63929ab.m250974a(str, "configEncode caps " + Arrays.toString(capabilitiesForType.colorFormats));
                if (codecInfo.getName().startsWith("OMX.google.")) {
                    C63929ab.m250978c(str, C63929ab.m250970a(str, "TEAvcEncoder mediaCodecInfo Name() startsWith OMX.google.", new C63929ab.C63930a[0]));
                    return -2;
                } else if (reconfigureMediaFormat(codecInfo) != 0) {
                    C63929ab.m250978c(str, C63929ab.m250970a(str, "TEAvcEncoder reconfigureMediaFormat failed", new C63929ab.C63930a[0]));
                    return -3;
                } else {
                    this.m_mediaCodec.configure(this.m_codecFormat, (Surface) null, (MediaCrypto) null, 1);
                    if (this.m_useInputSurface) {
                        C63929ab.m250980d(str, "m_mediaCodec.createInputSurface()");
                        this.m_surface = this.m_mediaCodec.createInputSurface();
                    }
                    return 0;
                }
            } else {
                String str2 = TAG;
                C63929ab.m250978c(str2, "ERROR_HW_OVERLOAD, MaxCodecBlocksSize is: " + C60205c.m233985a() + ", UsedCodecBlocksSize is: " + C60205c.m233988b());
                return -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str3 = TAG;
            C63929ab.m250978c(str3, C63929ab.m250970a(str3, "TEAvcEncoder configEncode Exception", new C63929ab.C63930a[0]));
            return -4;
        }
    }

    private void setByteVC110BitHWDecoderFlag(boolean z) {
        this.m_bByteVC110BitHWDecoder = z;
    }

    public static void setEncodeResolutionAlign(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            ENCODE_RESOLUTION_ALIGN = i;
        }
    }

    private void setMediaCodecDecInstance(Object obj) {
        TEMediaCodecDecoder tEMediaCodecDecoder = (TEMediaCodecDecoder) obj;
        this.m_MediaCodecDecInstance = tEMediaCodecDecoder;
        if (tEMediaCodecDecoder == null) {
            C63929ab.m250980d(TAG, "m_MediaCodecDecInstance is null");
        }
    }

    private void setProcessFlag(int i) {
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        this.m_bEncodeOESTexture = z;
    }

    public byte[] getCodecData(int i) {
        C60199a aVar = this.m_lastCodecData;
        if (aVar != null) {
            return aVar.f150247a;
        }
        return null;
    }

    private ByteBuffer getInputBufferByIdx(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.m_mediaCodec.getInputBuffer(i);
        }
        return this.m_mediaCodec.getInputBuffers()[i];
    }

    private ByteBuffer getOutputBufferByIdx(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.m_mediaCodec.getOutputBuffer(i);
        }
        return this.m_mediaCodec.getOutputBuffers()[i];
    }

    public static void setEncodeParams(C60200b bVar) {
        String str = TAG;
        C63929ab.m250974a(str, "setEncodeParams " + bVar.f150251a);
        MAX_PRODUCT_OF_SIZE_AND_FPS = bVar.f150251a;
    }

    private void setBitRateMode(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};
            MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
            for (int i = 0; i < 3; i++) {
                String str = TAG;
                C63929ab.m250976b(str, strArr[i] + ": " + encoderCapabilities.isBitrateModeSupported(i));
            }
            this.m_codecFormat.setInteger("bitrate-mode", 1);
        }
    }

    private void setProfile(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Build.VERSION.SDK_INT >= 24) {
            if (!this.m_useInputSurface) {
                this.m_codecFormat.setInteger("operating-rate", 240);
                this.m_codecFormat.setInteger("bitrate-mode", 1);
            }
            MediaCodecInfo.CodecProfileLevel a = C60204b.m233984a(codecCapabilities, this.m_profile, this.m_codec_type);
            if (this.VIDEO_MIME_TYPE.equals("video/avc") && a != null) {
                String str = TAG;
                C63929ab.m250976b(str, "Set Profile: " + a.profile + ", Level = " + a.level);
                this.m_codecFormat.setInteger("profile", a.profile);
                this.m_codecFormat.setInteger("level", a.level);
                if (this.m_codec_type == CODEC_TYPE_BYTEVC1) {
                    this.m_bitRate = (int) (((double) this.m_maxBitRate) * this.m_dHpBitrateRatio);
                    if ((a.profile & 89478485) != 0) {
                        C60192a.m233970a("te_composition_video_hw_profile", "main");
                    } else {
                        C60192a.m233970a("te_composition_video_hw_profile", "high");
                    }
                } else {
                    int i = a.profile;
                    if (i == 2) {
                        C63929ab.m250976b(str, "Set Main Profile");
                        this.m_bitRate = (int) (((double) this.m_maxBitRate) * this.m_dHpBitrateRatio);
                        C60192a.m233970a("te_composition_video_hw_profile", "main");
                    } else if (i == 8) {
                        C63929ab.m250976b(str, "Set High Profile");
                        this.m_bitRate = (int) (((double) this.m_maxBitRate) * this.m_dHpBitrateRatio);
                        C60192a.m233970a("te_composition_video_hw_profile", "high");
                    }
                }
                this.m_codecFormat.setInteger("bitrate", this.m_bitRate);
            } else if (this.VIDEO_MIME_TYPE.equals("video/mp4v-es")) {
                this.m_codecFormat.setInteger("profile", 1);
                this.m_codecFormat.setInteger("level", 1);
                this.m_codecFormat.setInteger("bitrate", this.m_bitRate * 2);
            }
        }
    }

    private int drainOutputBuffer(long j) {
        int i;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        String str = TAG;
        C63929ab.m250976b(str, "drainOutputBuffer before dequeueOutputBuffer");
        this.mBufferIndex = -1;
        try {
            int dequeueOutputBuffer = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            this.mBufferIndex = dequeueOutputBuffer;
            if (this.configByte == null && dequeueOutputBuffer == -1) {
                C63929ab.m250978c(str, "configByte = null and mBufferIndex = MediaCodec.INFO_TRY_AGAIN_LATER, timeoutUs: " + j);
            }
            C63929ab.m250976b(str, "drainOutputBuffer mBufferIndex " + this.mBufferIndex + " buffer-flag= " + bufferInfo.flags);
            while (true) {
                int i2 = this.mBufferIndex;
                if (i2 < 0) {
                    break;
                }
                ByteBuffer outputBufferByIdx = getOutputBufferByIdx(i2);
                int i3 = bufferInfo.size;
                byte[] bArr = new byte[i3];
                outputBufferByIdx.position(bufferInfo.offset);
                outputBufferByIdx.limit(bufferInfo.offset + bufferInfo.size);
                outputBufferByIdx.get(bArr);
                if (bufferInfo.flags == 2) {
                    this.configByte = bArr;
                } else if (bufferInfo.flags == 1) {
                    byte[] bArr2 = this.configByte;
                    if (bArr2 == null) {
                        C63929ab.m250980d(TAG, "I can't find configByte!!!! NEED extract from I frame!!!");
                    } else if (bArr[4] == bArr2[4] && (bArr[bArr2.length + 4] & 31) == 5) {
                        int length = i3 - bArr2.length;
                        byte[] bArr3 = new byte[length];
                        System.arraycopy(bArr, bArr2.length, bArr3, 0, length);
                        bArr = bArr3;
                    }
                    addOutputData(bArr, bufferInfo);
                } else if (bufferInfo.flags == 4) {
                    this.mEndOfStream = true;
                    C63929ab.m250974a(TAG, "bufferInfo.flags contain BUFFER_FLAG_END_OF_STREAM");
                    break;
                } else {
                    addOutputData(bArr, bufferInfo);
                }
                try {
                    this.m_mediaCodec.releaseOutputBuffer(this.mBufferIndex, false);
                    this.mBufferIndex = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j);
                } catch (Exception e) {
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    String str2 = TAG;
                    C63929ab.m250980d(str2, C63929ab.m250970a(str2, "drainOutputBuffer exception:" + stringWriter.toString(), new C63929ab.C63930a[0]));
                    return -214;
                }
            }
            if (this.mBufferIndex == -2) {
                MediaFormat outputFormat = this.m_mediaCodec.getOutputFormat();
                ByteBuffer byteBuffer = outputFormat.getByteBuffer("csd-0");
                ByteBuffer byteBuffer2 = outputFormat.getByteBuffer("csd-1");
                if (byteBuffer != null) {
                    byte[] bArr4 = (byte[]) byteBuffer.array().clone();
                    this.sps = bArr4;
                    i = bArr4.length + 0;
                } else {
                    i = 0;
                }
                if (byteBuffer2 != null) {
                    byte[] bArr5 = (byte[]) byteBuffer2.array().clone();
                    this.pps = bArr5;
                    i += bArr5.length;
                }
                byte[] bArr6 = new byte[i];
                this.configByte = bArr6;
                if (byteBuffer != null) {
                    byte[] bArr7 = this.sps;
                    System.arraycopy(bArr7, 0, bArr6, 0, bArr7.length);
                }
                if (byteBuffer2 != null) {
                    byte[] bArr8 = this.pps;
                    System.arraycopy(bArr8, 0, this.configByte, this.sps.length, bArr8.length);
                }
            }
            return 0;
        } catch (Exception e2) {
            StringWriter stringWriter2 = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter2));
            String str3 = TAG;
            C63929ab.m250980d(str3, C63929ab.m250970a(str3, "drainOutputBuffer exception:" + stringWriter2.toString(), new C63929ab.C63930a[0]));
            return -214;
        }
    }

    private int reconfigureMediaFormat(MediaCodecInfo mediaCodecInfo) {
        boolean z;
        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        C63929ab.m250976b(TAG, "CodecNames:");
        for (String str : supportedTypes) {
            C63929ab.m250976b(TAG, "Codec: " + str);
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.m_mime_type, this.m_width_align, this.m_height_align);
        this.m_codecFormat = createVideoFormat;
        createVideoFormat.setInteger("color-format", this.m_colorFormat);
        this.m_codecFormat.setInteger("bitrate", this.m_bitRate);
        int i = this.m_frameRate;
        long j = MAX_PRODUCT_OF_SIZE_AND_FPS;
        if (j > 0) {
            long j2 = j / ((long) (this.m_width_align * this.m_height_align));
            if (((long) i) > j2) {
                i = (int) j2;
            }
        }
        this.m_codecFormat.setInteger("frame-rate", i);
        this.m_codecFormat.setInteger("i-frame-interval", this.m_iFrameInternal);
        String str2 = TAG;
        C63929ab.m250978c(str2, " m_colorspace " + this.m_colorspace + " m_bColorRangeFull " + this.m_bColorRangeFull + " m_colorTrc " + this.m_colorTrc);
        VEConfigCenter.C63827a a = VEConfigCenter.m250617a().mo220631a("ve_color_space_for_2020");
        if (a == null || a.mo220637a() == null || !(a.mo220637a() instanceof Boolean)) {
            z = false;
        } else {
            z = ((Boolean) a.mo220637a()).booleanValue();
        }
        if (z || !this.m_useInputSurface) {
            this.m_codecFormat.setInteger("color-standard", this.m_colorspace);
            this.m_codecFormat.setInteger("color-range", this.m_bColorRangeFull);
            this.m_codecFormat.setInteger("color-transfer", this.m_colorTrc);
        }
        setProfile(mediaCodecInfo.getCapabilitiesForType(this.m_mime_type));
        C63929ab.m250978c(str2, String.format("width:[%d] height:[%d] frameRate:[%d] iFrameInternal:[%d] bitRate:[%d] colorFormat:[%d] codec_type:[%d]", Integer.valueOf(this.m_width_align), Integer.valueOf(this.m_height_align), Integer.valueOf(this.m_frameRate), Integer.valueOf(this.m_iFrameInternal), Integer.valueOf(this.m_bitRate), Integer.valueOf(this.m_colorFormat), Integer.valueOf(this.m_codec_type)));
        return 0;
    }

    public int getInfoByFlag(long[] jArr, int i) {
        if (i != 1) {
            return -1;
        }
        jArr[0] = this.m_lastCodecData.f150248b;
        jArr[1] = this.m_lastCodecData.f150249c;
        return 4;
    }

    private void addOutputData(byte[] bArr, MediaCodec.BufferInfo bufferInfo) {
        long j;
        String str = TAG;
        C63929ab.m250976b(str, "encode: pts queue size = " + this.m_PTSQueue.size() + " avc sdata size= " + this.AVCQueue.size());
        if (this.m_PTSQueue.size() <= 0 && this.m_profile >= 8) {
            C63929ab.m250978c(str, "encode: no available pts!!! profile " + this.m_profile);
        } else if (this.m_PTSQueue.size() <= 0) {
            C63929ab.m250978c(str, "encode: no available pts!!!");
        } else {
            long longValue = this.m_PTSQueue.poll().longValue();
            long j2 = 0;
            if (bufferInfo.presentationTimeUs > 0) {
                j2 = bufferInfo.presentationTimeUs;
            }
            if (this.m_profile >= 8) {
                j = longValue - 200000;
            } else {
                j = j2;
            }
            C63929ab.m250976b(str, "dts = " + j + ", pts = " + j2 + " add codecdata-encode AVCQueue-size= " + this.AVCQueue.size());
            C60199a aVar = new C60199a();
            aVar.f150247a = bArr;
            aVar.f150248b = j2;
            aVar.f150249c = j;
            aVar.f150250d = bufferInfo.flags;
            try {
                this.AVCQueue.add(aVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Bitmap convertTexToBitmap(int i, int i2, int i3) {
        ByteBuffer readTextureToByteBuffer = readTextureToByteBuffer(i, i2, i3);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(readTextureToByteBuffer);
        return createBitmap;
    }

    public static ByteBuffer readTextureToByteBuffer(int i, int i2, int i3) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, iArr2, 0);
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        ByteBuffer allocate = ByteBuffer.allocate(i2 * i3 * 4);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, allocate);
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        return allocate;
    }

    public void encoderYUV420(byte[] bArr, int i, long j) {
        this.mEncodeBufferCount = 10;
        int i2 = -1;
        while (i2 < 0) {
            try {
                if (this.mEncodeBufferCount <= 0) {
                    break;
                }
                i2 = this.m_mediaCodec.dequeueInputBuffer(-1);
                this.mEncodeBufferCount--;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (i2 >= 0) {
            ByteBuffer inputBufferByIdx = getInputBufferByIdx(i2);
            inputBufferByIdx.clear();
            C63929ab.m250976b(TAG, "inputBuffer " + inputBufferByIdx);
            if (i > inputBufferByIdx.capacity()) {
                i = inputBufferByIdx.capacity();
            }
            inputBufferByIdx.put(bArr, 4, i);
            this.m_mediaCodec.queueInputBuffer(i2, 0, i, j, 0);
        }
        drainOutputBuffer(0);
    }

    public static boolean saveFrameToFile(int i, int i2, int i3, long j) {
        Bitmap convertTexToBitmap = convertTexToBitmap(i, i2, i3);
        file_count++;
        File file = new File("sdcard/dump/" + file_count + "_" + j + ".jpg");
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            convertTexToBitmap.compress(Bitmap.CompressFormat.JPEG, 20, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            return false;
        } catch (Throwable th) {
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            throw th;
        }
    }

    public int encodeVideoFromBuffer(int i, long j, boolean z, boolean z2) {
        if (!this.m_bSuccessInit) {
            return 0;
        }
        this.m_PTSQueue.offer(Long.valueOf(j));
        if (this.m_isNeedReconfigure || (this.m_configStatus & 4) != 0) {
            if (this.m_mediaCodec == null || this.m_configStatus != 1 || Build.VERSION.SDK_INT < 19) {
                restartEncoder();
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", this.m_bitRate);
                this.m_mediaCodec.setParameters(bundle);
                this.m_configStatus = 0;
            }
            this.m_isNeedReconfigure = false;
        }
        if (Build.VERSION.SDK_INT >= 19 && z2 && VERuntime.m251382a().mo221786f()) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("request-sync", 0);
            bundle2.putInt("video-bitrate", (int) (((double) this.m_bitRate) * this.m_TransitionKeyframeRatio));
            this.m_mediaCodec.setParameters(bundle2);
        }
        if (this.m_encodeStartTime == -1) {
            this.m_encodeStartTime = System.nanoTime();
        }
        String str = TAG;
        C63929ab.m250976b(str, "drainOutputBuffer 1111 ");
        long j2 = 0;
        int drainOutputBuffer = drainOutputBuffer(0);
        if (drainOutputBuffer != 0) {
            return drainOutputBuffer;
        }
        C63929ab.m250976b(str, "drainOutputBuffer 1111 size= " + i);
        if (this.mByteBuf.capacity() > 0 && !this.m_bSignalEndOfStream) {
            encoderYUV420(this.mByteBuf.array(), i, j);
        } else if (this.m_mediaCodec != null && !this.m_bSignalEndOfStream && this.m_bNeedSingalEnd) {
            try {
                C63929ab.m250974a(str, "m_mediaCodec.flush()");
                this.m_bSignalEndOfStream = true;
                this.mEndOfStream = false;
                this.m_mediaCodec.signalEndOfInputStream();
            } catch (Exception e) {
                e.printStackTrace();
                return -213;
            }
        }
        if (this.m_bSignalEndOfStream) {
            int i2 = 30;
            while (!this.mEndOfStream) {
                C63929ab.m250976b(TAG, "drainOutputBuffer 44444 ");
                int drainOutputBuffer2 = drainOutputBuffer(10000);
                if (drainOutputBuffer2 == 0) {
                    if (this.mBufferIndex >= 0) {
                        break;
                    }
                    i2--;
                    if (i2 <= 0) {
                        break;
                    }
                } else {
                    return drainOutputBuffer2;
                }
            }
        } else {
            C63929ab.m250976b(str, "drainOutputBuffer 55555 ");
            if (this.AVCQueue.size() < 1) {
                j2 = 10000;
            }
            int drainOutputBuffer3 = drainOutputBuffer(j2);
            if (drainOutputBuffer3 != 0) {
                return drainOutputBuffer3;
            }
        }
        C60199a poll = this.AVCQueue.poll();
        this.m_lastCodecData = poll;
        if (poll != null) {
            return poll.f150247a.length;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x041a, code lost:
        if (r0 <= 0) goto L_0x041c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03e1 A[LOOP:1: B:129:0x03e1->B:137:0x03f5, LOOP_START, PHI: r5 
      PHI: (r5v10 int) = (r5v9 int), (r5v11 int) binds: [B:128:0x03df, B:137:0x03f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int encodeVideoFromTexture(int r27, long r28, boolean r30, boolean r31, boolean r32) {
        /*
        // Method dump skipped, instructions count: 1077
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAvcEncoder.encodeVideoFromTexture(int, long, boolean, boolean, boolean):int");
    }

    private void setEncoder(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d, int i9, int i10, int i11) {
        int i12;
        this.m_configStatus = 0;
        this.m_codec_type = i;
        if (i == CODEC_TYPE_BYTEVC1) {
            this.m_mime_type = "video/hevc";
        } else {
            this.m_mime_type = this.VIDEO_MIME_TYPE;
        }
        if (i2 > 0) {
            this.m_width = i2;
            this.m_width_align = i2;
        }
        if (i3 > 0) {
            this.m_height = i3;
            this.m_height_align = i3;
        }
        Math.min(this.m_width_align, this.m_height_align);
        if (this.m_useInputSurface) {
            int i13 = this.m_width_align;
            int i14 = ENCODE_RESOLUTION_ALIGN;
            if (i13 % i14 != 0) {
                this.m_width_align = ((i13 / i14) + 1) * i14;
            }
            int i15 = this.m_height_align;
            if (i15 % i14 != 0) {
                this.m_height_align = ((i15 / i14) + 1) * i14;
            }
            C63929ab.m250978c(TAG, "Encoder set OutResolution align: " + ENCODE_RESOLUTION_ALIGN + ", dstResolution: " + this.m_width_align + "*" + this.m_height_align + ", srcResolution: " + this.m_width + "*" + this.m_height);
        }
        if (i4 > 0) {
            if (i4 < MIN_FRAME_RATE) {
                C63929ab.m250978c(TAG, String.format(Locale.getDefault(), "_frameRate:[%d] is too small, change to %d", Integer.valueOf(i4), Integer.valueOf(MIN_FRAME_RATE)));
                i12 = MIN_FRAME_RATE;
            } else if (i4 > MAX_FRAME_RATE) {
                C63929ab.m250978c(TAG, String.format(Locale.getDefault(), "_frameRate:[%d] is too large, change to %d", Integer.valueOf(i4), Integer.valueOf(MAX_FRAME_RATE)));
                i12 = MAX_FRAME_RATE;
            } else {
                i12 = i4;
            }
            if (this.m_frameRate != i12) {
                this.m_frameRate = i12;
                if (i12 < this.m_iFrameInternal) {
                    this.m_iFrameInternal = i12;
                }
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 2;
            }
        }
        if (i5 > 0) {
            this.m_maxBitRate = i5;
            if (this.m_bitRate != i5) {
                this.m_bitRate = i5;
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 1;
            }
        }
        if (i6 >= 0) {
            this.m_iFrameInternal = i6;
        }
        if (i7 > 0) {
            this.m_colorFormat = i7;
        }
        if (this.m_codec_type == CODEC_TYPE_BYTEVC1) {
            this.m_profile = 1;
        } else {
            this.m_profile = C0745a.m3627a(i8, 1, 64);
        }
        this.m_dHpBitrateRatio = d;
        this.m_colorspace = i9;
        this.m_bColorRangeFull = i10;
        this.m_colorTrc = i11;
    }

    public int initEncoder(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d, boolean z, int i9, int i10, int i11, double d2, int i12, int i13, boolean z2) {
        TEAvcEncoder tEAvcEncoder;
        if (i13 > 0) {
            setEncodeResolutionAlign(i13);
        }
        String str = TAG;
        C63929ab.m250980d(str, "m_mediaCodec initEncoder == enter transitionRatio" + d2);
        if (!z || Build.VERSION.SDK_INT >= 18) {
            this.m_useInputSurface = z;
            if (z) {
                this.m_colorFormat = 2130708361;
            } else {
                this.m_colorFormat = i5;
            }
            setEncoder(i, i2, i3, i4, i7, i6, this.m_colorFormat, i8, d, i9, i10, i11);
            if (d2 <= 0.0d || d2 >= 5.0d) {
                tEAvcEncoder = this;
            } else {
                tEAvcEncoder = this;
                tEAvcEncoder.m_TransitionKeyframeRatio = d2;
            }
            tEAvcEncoder.m_isNeedReconfigure = true;
            tEAvcEncoder.m_bSuccessInit = true;
            tEAvcEncoder.m_bSignalEndOfStream = false;
            tEAvcEncoder.m_bEncoderGLContextReuse = z2;
            C63929ab.m250974a(str, "avcencoder glcontext reuse: " + tEAvcEncoder.m_bEncoderGLContextReuse);
            if (i12 == 2) {
                tEAvcEncoder.VIDEO_MIME_TYPE = "video/mp4v-es";
            } else {
                tEAvcEncoder.VIDEO_MIME_TYPE = "video/avc";
            }
            int configEncode = configEncode();
            if (configEncode < 0 && ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
                C60205c.m233989b(tEAvcEncoder.m_width_align * tEAvcEncoder.m_height_align * tEAvcEncoder.m_frameRate, hashCode());
            }
            if (VERuntimeConfig.f161380e != VERuntimeConfig.HwEncFallBackMode.VIDEO_ENC_INIT_FALLBACK.getValue()) {
                return configEncode;
            }
            C63929ab.m250980d(str, "TESTING! HW VIDEO ENC INIT FALLBACK");
            return -1;
        }
        C63929ab.m250980d(str, "m_mediaCodec initEncoder == useInputSurface and SDK version is invalid");
        return -1;
    }
}
