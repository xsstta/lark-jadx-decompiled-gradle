package com.ss.android.ttve.mediacodec;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.view.Surface;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.medialib.util.C59431a;
import com.ss.android.medialib.util.VEPlatformUtils;
import com.ss.android.ttve.common.C60185d;
import com.ss.android.ttve.common.C60188f;
import com.ss.android.ttve.common.TEImageUtils;
import com.ss.android.ttve.model.C60214e;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.monitor.C60217b;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.C63933ad;
import com.ss.android.vesdk.VEConfigCenter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class TEMediaCodecDecoder implements SurfaceTexture.OnFrameAvailableListener, ImageReader.OnImageAvailableListener {
    private static int file_count = 0;
    private static Object mCodecListLock = new Object();
    private static boolean mIsByteVC1Blocklist = false;
    private static ArrayList<MediaCodecInfo> mVideoHWDecoderCodecs = new ArrayList<>();
    private static boolean m_useCreateDecoderByName = true;
    private static volatile boolean sDequeueHWDecodeInputBufferOpt = true;
    private static int sDequeueOutputTimeoutUs = 10000;
    private static boolean sHWDecodeSupportRtAndOr = false;
    private static int sPendingInputBufferThreshold = 5;
    private final int MAX_DELAY_COUNT = 10;
    private final long MAX_SLEEP_MS = 0;
    private String VIDEO_MIME_TYPE = "video/avc";
    private VEFrame mConvertFrame = null;
    private Image mImage = null;
    private ImageReader mImageReader = null;
    private int mMinCompressionRatio = 1;
    private HandlerThread mReaderHandlerThread = null;
    private VEFrame mScaleFrame = null;
    private Handler m_MediaCodechandler;
    private ConditionVariable m_ReEncodeOptCV = new ConditionVariable(true);
    private volatile boolean m_awaitNewImageSuccess = false;
    private boolean m_bNeedConfigure;
    private volatile boolean m_bReEnableOpt = false;
    private boolean m_bUseImageReader;
    private MediaCodec.BufferInfo m_bufferInfo = new MediaCodec.BufferInfo();
    private ByteBuffer m_codecSpecificData;
    private MediaCodec m_decoder = null;
    private volatile boolean m_decoderStarted = false;
    private C60185d m_eglStateSaver = null;
    private ByteBuffer m_extraDataBuf;
    private MediaFormat m_format;
    private boolean m_frameAvailable = false;
    private final Object m_frameSyncObject = new Object();
    private HandlerThread m_handleThread = new_android_os_HandlerThread_by_knot("mediacodec_callback");
    private int m_iCodecID = 28;
    private int m_iCurCount = 0;
    private int m_iFps;
    private int m_iHeight;
    private int m_iOutputHeight;
    private int m_iOutputWidth;
    private int m_iWidth;
    private int m_indexOfOutputBuffer = -1;
    private volatile boolean m_inputBufferQueued = false;
    private long m_nativeHandler;
    private boolean m_needSendPacketAgain = false;
    private volatile int m_pendingInputFrameCount = 0;
    private C60202b m_renderParam = new C60202b();
    private volatile boolean m_sawInputEOS = false;
    private volatile boolean m_sawOutputEOS = false;
    private C60188f m_sharedContext = null;
    private Surface m_surface;
    private int[] m_surfaceTexID = new int[1];
    private SurfaceTexture m_surfaceTexture;
    private C60201a m_textureRender = null;
    private volatile long m_timestampOfCurTexFrame = Long.MIN_VALUE;
    private volatile long m_timestampOfLastDecodedFrame = Long.MIN_VALUE;

    private native boolean nativeOnFrameAvailable(long j, ByteBuffer byteBuffer, int i);

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    private static void setHWDecodeBoolConfigFromNative(String str, boolean z) {
    }

    private static void setHWDecodeIntConfigFromNative(String str, int i) {
    }

    private boolean isNeedSendPacketAgain() {
        return this.m_needSendPacketAgain;
    }

    public C60202b getRenderParam() {
        return this.m_renderParam;
    }

    private boolean IsValid() {
        if (this.m_decoder != null) {
            return true;
        }
        return false;
    }

    private int restartDecoder() {
        stopDecoder();
        return startDecoder();
    }

    public int getOESTexture() {
        return this.m_surfaceTexID[0];
    }

    private void deleteTexture() {
        int[] iArr = this.m_surfaceTexID;
        if (iArr[0] != 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.m_surfaceTexID[0] = 0;
        }
    }

    public static boolean isSupportByteVC10bit() {
        return isSupportFormat("video/hevc", 2, 16384);
    }

    public int closeDecoder() {
        C63929ab.m250978c("TEMediaCodecDecoder", "TEMediaCodecDecoder closeDecoder");
        stopDecoder();
        deleteTexture();
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$a */
    public static class C60201a {

        /* renamed from: a */
        private final float[] f150252a;

        /* renamed from: b */
        private FloatBuffer f150253b;

        /* renamed from: c */
        private float[] f150254c = new float[16];

        /* renamed from: d */
        private float[] f150255d = new float[16];

        /* renamed from: e */
        private int f150256e;

        /* renamed from: f */
        private int f150257f;

        /* renamed from: g */
        private int f150258g;

        /* renamed from: h */
        private int f150259h;

        /* renamed from: i */
        private int f150260i;

        /* renamed from: j */
        private int[] f150261j = new int[1];

        /* renamed from: b */
        public void mo205593b() {
            int i = this.f150256e;
            if (i != 0) {
                GLES20.glDeleteProgram(i);
                this.f150256e = 0;
            }
            int[] iArr = this.f150261j;
            if (iArr[0] != 0) {
                GLES20.glDeleteFramebuffers(1, iArr, 0);
            }
        }

        /* renamed from: a */
        public void mo205590a() {
            int a = m233977a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
            this.f150256e = a;
            if (a == 0) {
                C63929ab.m250980d("TEMediaCodecDecoder", "failed create program");
            }
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f150256e, "aPosition");
            this.f150259h = glGetAttribLocation;
            if (glGetAttribLocation == -1) {
                C63929ab.m250980d("TEMediaCodecDecoder", "Could not get attrib location for aPosition");
            }
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f150256e, "aTextureCoord");
            this.f150260i = glGetAttribLocation2;
            if (glGetAttribLocation2 == -1) {
                C63929ab.m250980d("TEMediaCodecDecoder", "Could not get attrib location for aTextureCoord");
            }
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.f150256e, "uMVPMatrix");
            this.f150257f = glGetUniformLocation;
            if (glGetUniformLocation == -1) {
                C63929ab.m250980d("TEMediaCodecDecoder", "Could not get attrib location for uMVPMatrix");
            }
            this.f150258g = GLES20.glGetUniformLocation(this.f150256e, "uSTMatrix");
            C63929ab.m250976b("TEMediaCodecDecoder", "glGetUniformLocation uSTMatrix");
            if (this.f150258g != -1) {
                GLES20.glGenFramebuffers(1, this.f150261j, 0);
                C63929ab.m250976b("TEMediaCodecDecoder", "glGenFramebuffers");
                return;
            }
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }

        public C60201a(SurfaceTexture surfaceTexture) {
            float[] fArr = {-1.0f, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, -1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, -1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};
            this.f150252a = fArr;
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f150253b = asFloatBuffer;
            asFloatBuffer.put(fArr).position(0);
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.f150255d);
            } else {
                Matrix.setIdentityM(this.f150255d, 0);
            }
        }

        /* renamed from: a */
        private int m233976a(int i, String str) {
            int glCreateShader = GLES20.glCreateShader(i);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            Log.e("TEMediaCodecDecoder", "Could not compile shader " + i + ":");
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
            Log.e("TEMediaCodecDecoder", sb.toString());
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }

        /* renamed from: a */
        private int m233977a(String str, String str2) {
            int a;
            int a2 = m233976a(35633, str);
            if (a2 == 0 || (a = m233976a(35632, str2)) == 0) {
                return 0;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            if (glCreateProgram == 0) {
                C63929ab.m250980d("TEMediaCodecDecoder", "Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glAttachShader(glCreateProgram, a);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram;
            }
            C63929ab.m250980d("TEMediaCodecDecoder", "Could not link program: " + GLES20.glGetProgramInfoLog(glCreateProgram));
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        }

        /* renamed from: a */
        public void mo205591a(int i, int i2, int i3, int i4) {
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glBindFramebuffer(36160, this.f150261j[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i4, 0);
            GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f150256e);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i3);
            this.f150253b.position(0);
            GLES20.glVertexAttribPointer(this.f150259h, 3, 5126, false, 20, (Buffer) this.f150253b);
            GLES20.glEnableVertexAttribArray(this.f150259h);
            this.f150253b.position(3);
            GLES20.glVertexAttribPointer(this.f150260i, 2, 5126, false, 20, (Buffer) this.f150253b);
            GLES20.glEnableVertexAttribArray(this.f150260i);
            Matrix.setIdentityM(this.f150254c, 0);
            GLES20.glUniformMatrix4fv(this.f150257f, 1, false, this.f150254c, 0);
            GLES20.glUniformMatrix4fv(this.f150258g, 1, false, this.f150255d, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f150259h);
            GLES20.glDisableVertexAttribArray(this.f150260i);
            GLES20.glBindTexture(36197, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glFinish();
        }

        /* renamed from: a */
        public void mo205592a(int i, int i2, int i3, int i4, int i5, int i6) {
            if (i > 0 && i2 > 0 && i4 >= i3 && i6 >= i5 && i6 <= i && i4 <= i2) {
                float[] fArr = this.f150252a;
                float f = (float) i;
                float f2 = (((float) i5) * 1.0f) / f;
                fArr[3] = f2;
                float f3 = (float) i2;
                float f4 = (((float) i3) * 1.0f) / f3;
                fArr[4] = f4;
                float f5 = (((float) i6) * 1.0f) / f;
                fArr[8] = f5;
                fArr[9] = f4;
                fArr[13] = f2;
                float f6 = (((float) i4) * 1.0f) / f3;
                fArr[14] = f6;
                fArr[18] = f5;
                fArr[19] = f6;
                this.f150253b.clear();
                this.f150253b.put(this.f150252a).position(0);
            }
        }
    }

    /* renamed from: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$b */
    public class C60202b {

        /* renamed from: a */
        public RectF f150262a;

        /* renamed from: b */
        public int f150263b;

        /* renamed from: c */
        public int f150264c;

        /* renamed from: d */
        public int f150265d;

        public String toString() {
            return "cropRect: " + this.f150262a + ", rotate: " + this.f150263b;
        }

        public C60202b() {
        }
    }

    public void signalReEncodeOptCV() {
        if (this.m_bReEnableOpt) {
            this.m_ReEncodeOptCV.open();
            C63929ab.m250976b("TEMediaCodecDecoder", "signalReEncodeOptCV...");
        }
    }

    private int createTexture() {
        GLES20.glGenTextures(1, this.m_surfaceTexID, 0);
        int[] iArr = this.m_surfaceTexID;
        if (iArr[0] <= 0) {
            C63929ab.m250980d("TEMediaCodecDecoder", "createTexture failed");
            return 0;
        }
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return this.m_surfaceTexID[0];
    }

    public static int getMaxMediaCodecVideoDecoderCount() {
        MediaCodecInfo mediaCodecInfo21 = getMediaCodecInfo21("video/avc");
        if (mediaCodecInfo21 == null) {
            C63929ab.m250980d("TEMediaCodecDecoder", "MediaCodecInfo is null!");
            return -2;
        }
        int maxSupportedInstances = mediaCodecInfo21.getCapabilitiesForType("video/avc").getMaxSupportedInstances();
        C63929ab.m250974a("TEMediaCodecDecoder", "getMaxMediaCodecVideoDecoderCount " + maxSupportedInstances);
        return maxSupportedInstances;
    }

    private boolean isMtkByteVC1BlockList() {
        String lowerCase = Build.HARDWARE.toLowerCase(Locale.US);
        if (lowerCase.startsWith("mt6763") || lowerCase.startsWith("mt6757") || lowerCase.startsWith("mt6739") || lowerCase.startsWith("mt6750")) {
            return true;
        }
        return false;
    }

    private int stopDecoder() {
        cleanupDecoder();
        this.m_handleThread.quit();
        HandlerThread handlerThread = this.mReaderHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mReaderHandlerThread = null;
        }
        C60201a aVar = this.m_textureRender;
        if (aVar != null) {
            aVar.mo205593b();
            this.m_textureRender = null;
        }
        Surface surface = this.m_surface;
        if (surface != null) {
            surface.release();
            this.m_surface = null;
        }
        SurfaceTexture surfaceTexture = this.m_surfaceTexture;
        if (surfaceTexture == null) {
            return 0;
        }
        surfaceTexture.setOnFrameAvailableListener(null);
        this.m_surfaceTexture.release();
        this.m_surfaceTexture = null;
        return 0;
    }

    private boolean isHisiByteVC1BlockList() {
        String property = getProperty("ro.board.platform", null);
        if (Build.VERSION.SDK_INT != 26 || property == null) {
            return false;
        }
        if (!property.startsWith("kirin960") && !property.startsWith("hi3660")) {
            return false;
        }
        double d = 0.0d;
        try {
            d = Double.parseDouble(getProperty("ro.config.hw_codec_support", "0.0"));
        } catch (NumberFormatException unused) {
            Log.w("TEMediaCodecDecoder", "vendor property abnormal");
        }
        if (d < 0.18041d) {
            return true;
        }
        return false;
    }

    public void cleanupDecoder() {
        C63929ab.m250974a("TEMediaCodecDecoder", "cleanupDecoder");
        if (this.m_decoder != null) {
            if (this.m_decoderStarted) {
                try {
                    if (this.m_inputBufferQueued) {
                        this.m_decoder.flush();
                        this.m_inputBufferQueued = false;
                    }
                    this.m_decoder.stop();
                } catch (Exception e) {
                    C63929ab.m250980d("TEMediaCodecDecoder", "" + e.getMessage());
                    e.printStackTrace();
                }
                this.m_decoderStarted = false;
            }
            this.m_decoder.release();
            this.m_decoder = null;
        }
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
            C60205c.m233989b(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode());
        }
        this.m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
        this.m_timestampOfCurTexFrame = Long.MIN_VALUE;
        this.m_pendingInputFrameCount = 0;
        this.m_sawInputEOS = false;
        this.m_sawOutputEOS = false;
    }

    public static int getMaxBlocksSizePerSecond() {
        MediaCodecInfo mediaCodecInfo;
        if (VEPlatformUtils.m230717a() == VEPlatformUtils.VEPlatform.PLATFORM_HISI) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            mediaCodecInfo = getMediaCodecInfo21("video/avc");
        } else {
            mediaCodecInfo = getMediaCodecInfo("video/avc");
        }
        if (mediaCodecInfo != null) {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
            try {
                Method a = C59431a.m230720a(capabilitiesForType.getVideoCapabilities().getClass(), "getBlocksPerSecondRange", new Class[0]);
                a.setAccessible(true);
                Range range = (Range) a.invoke(capabilitiesForType.getVideoCapabilities(), new Object[0]);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("maxBlocksSizePerSecond", ((Long) range.getUpper()).longValue() * ((long) DynamicModule.f58006b));
                    C60217b.m234045a("vesdk_event_common_hw_resource_limit_size", jSONObject, "performance");
                } catch (JSONException e) {
                    C63929ab.m250980d("TEMediaCodecDecoder", "report maxBlocksSizePerSecond json err " + e.getMessage());
                }
                return (int) (((Long) range.getUpper()).longValue() * ((long) DynamicModule.f58006b));
            } catch (Exception e2) {
                C63929ab.m250980d("TEMediaCodecDecoder", e2.getMessage());
            }
        }
        return -1;
    }

    private int startDecoder() {
        int i;
        if (IsValid()) {
            C63929ab.m250980d("TEMediaCodecDecoder", "You can't call startDecoder() twice!");
            return -1;
        }
        if (!this.m_bUseImageReader) {
            i = this.m_surfaceTexID[0];
            if (i == 0) {
                i = createTexture();
            }
            if (i == 0) {
                return -1;
            }
        } else {
            i = 0;
        }
        try {
            if (!this.m_bUseImageReader) {
                this.m_surfaceTexture = new SurfaceTexture(i);
                C63929ab.m250974a("TEMediaCodecDecoder", "Surface texture with texture (id=" + i + ") has been created.");
            }
            this.m_handleThread.start();
            Handler handler = new Handler(this.m_handleThread.getLooper());
            this.m_MediaCodechandler = handler;
            if (!this.m_bUseImageReader) {
                this.m_surfaceTexture.setOnFrameAvailableListener(this, handler);
                this.m_surface = new Surface(this.m_surfaceTexture);
            } else {
                this.mReaderHandlerThread = new_android_os_HandlerThread_by_knot("ImageReader Callback");
                C63929ab.m250974a("TEMediaCodecDecoder", "getVideoFramesHW: mReaderHandlerThread = " + this.mReaderHandlerThread.getThreadId());
                this.mReaderHandlerThread.start();
                Handler handler2 = new Handler(this.mReaderHandlerThread.getLooper());
                ImageReader newInstance = ImageReader.newInstance(this.m_iWidth, this.m_iHeight, 35, 2);
                this.mImageReader = newInstance;
                newInstance.setOnImageAvailableListener(this, handler2);
            }
            if (!this.m_bUseImageReader) {
                C60201a aVar = new C60201a(this.m_surfaceTexture);
                this.m_textureRender = aVar;
                aVar.mo205590a();
            }
            if (setupDecoder(this.VIDEO_MIME_TYPE)) {
                return 0;
            }
            stopDecoder();
            return -1;
        } catch (Exception e) {
            C63929ab.m250980d("TEMediaCodecDecoder", "" + e.getMessage());
            e.printStackTrace();
            stopDecoder();
            return -1;
        }
    }

    private int configureMediaFormat() {
        MediaCodecInfo mediaCodecInfo;
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                mediaCodecInfo = getMediaCodecInfo21(this.VIDEO_MIME_TYPE);
            } else {
                mediaCodecInfo = getMediaCodecInfo(this.VIDEO_MIME_TYPE);
            }
            if (mediaCodecInfo == null) {
                C63929ab.m250980d("TEMediaCodecDecoder", "MediaCodecInfo is null!");
                return -2;
            }
            if (this.m_iCodecID == 28) {
                boolean isFeatureSupported = mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).isFeatureSupported("adaptive-playback");
                C63929ab.m250974a("TEMediaCodecDecoder", "mediacodec supports adaptive playback: " + isFeatureSupported);
            }
            C63929ab.m250976b("TEMediaCodecDecoder", "configureMediaFormat , size: " + this.m_iWidth + " x " + this.m_iHeight);
            int i = this.m_iCodecID;
            if (i == 28 || i == 174 || mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().isSizeSupported(this.m_iWidth, this.m_iHeight)) {
                this.m_format = MediaFormat.createVideoFormat(this.VIDEO_MIME_TYPE, this.m_iWidth, this.m_iHeight);
                boolean isSupportByteVC10bit = isSupportByteVC10bit();
                C63929ab.m250974a("TEMediaCodecDecoder", "isSupport10bit = " + isSupportByteVC10bit);
                ByteBuffer byteBuffer = this.m_codecSpecificData;
                if (byteBuffer != null) {
                    this.m_format.setByteBuffer("csd-0", byteBuffer);
                }
                if (this.m_bUseImageReader) {
                    this.m_format.setInteger("color-format", 2135033992);
                }
                if (Build.VERSION.SDK_INT == 16) {
                    this.m_format.setInteger("max-input-size", 0);
                } else if (Build.VERSION.SDK_INT > 16 && 174 == this.m_iCodecID) {
                    this.m_format.setInteger("max-input-size", this.m_iWidth * this.m_iHeight);
                } else if (Build.VERSION.SDK_INT > 16 && 28 == this.m_iCodecID) {
                    this.m_format.setInteger("max-input-size", C63933ad.m250985a(this.m_iWidth, 16) * C63933ad.m250985a(this.m_iHeight, 16) * 16 * 16);
                }
                boolean booleanValue = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_hwdecode_support_rt_and_or", (Object) false)).booleanValue();
                sHWDecodeSupportRtAndOr = booleanValue;
                if (booleanValue) {
                    this.m_format.setInteger("priority", 0);
                    C63929ab.m250974a("TEMediaCodecDecoder", "set real-time and operating-rate");
                }
                if (174 != this.m_iCodecID || isSupportSize(mediaCodecInfo)) {
                    return 0;
                }
                C63929ab.m250980d("TEMediaCodecDecoder", "configureMediaFormat, failed, case VIDEO_MIME_TYPE = " + this.VIDEO_MIME_TYPE + ", size = " + this.m_iWidth + " x " + this.m_iHeight + " is not supported.");
                return -5;
            }
            C63929ab.m250980d("TEMediaCodecDecoder", "is not size support! width: " + this.m_iWidth + " height: " + this.m_iHeight);
            return -3;
        } catch (Exception e) {
            C63929ab.m250980d("TEMediaCodecDecoder", "reconfigureMediaFormat: " + e.getMessage());
            e.printStackTrace();
            return -4;
        }
    }

    private void onImageFrameAvailable() {
        VEFrame vEFrame;
        if (this.mImage.getFormat() == 35) {
            int width = this.mImage.getWidth();
            int height = this.mImage.getHeight();
            if (this.mImage.getPlanes() == null || this.mImage.getPlanes()[1].getPixelStride() <= 1) {
                vEFrame = VEFrame.createYUVPlanFrame(new C60214e(this.mImage.getPlanes()), width, height, 0, 0, VEFrame.ETEPixelFormat.TEPixFmt_YUV420P);
            } else {
                VEFrame createYUVPlanFrame = VEFrame.createYUVPlanFrame(new C60214e(this.mImage.getPlanes()), width, height, 0, 0, VEFrame.ETEPixelFormat.TEPixFmt_NV12);
                if (this.mConvertFrame == null) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((width * height) * 3) / 2);
                    allocateDirect.clear();
                    this.mConvertFrame = VEFrame.createByteBufferFrame(allocateDirect, width, height, 0, 0, VEFrame.ETEPixelFormat.TEPixFmt_YUV420P);
                }
                TEImageUtils.m233918a(createYUVPlanFrame, this.mConvertFrame, VEFrame.Operation.OP_CONVERT);
                vEFrame = this.mConvertFrame;
            }
            if (width == this.m_iOutputWidth && height == this.m_iOutputHeight && (vEFrame.getFrame() instanceof VEFrame.ByteBufferFrame)) {
                ByteBuffer byteBuffer = ((VEFrame.ByteBufferFrame) vEFrame.getFrame()).getByteBuffer();
                nativeOnFrameAvailable(this.m_nativeHandler, byteBuffer, byteBuffer.remaining());
                return;
            }
            if (this.mScaleFrame == null) {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((this.m_iOutputWidth * this.m_iOutputHeight) * 3) / 2);
                allocateDirect2.clear();
                this.mScaleFrame = VEFrame.createByteBufferFrame(allocateDirect2, this.m_iOutputWidth, this.m_iOutputHeight, 0, 0, VEFrame.ETEPixelFormat.TEPixFmt_YUV420P);
            }
            if (this.m_iWidth == this.m_iOutputWidth && this.m_iHeight == this.m_iOutputHeight) {
                TEImageUtils.m233918a(vEFrame, this.mScaleFrame, VEFrame.Operation.OP_COPY);
            } else {
                TEImageUtils.m233918a(vEFrame, this.mScaleFrame, VEFrame.Operation.OP_SCALE);
            }
            ByteBuffer byteBuffer2 = ((VEFrame.ByteBufferFrame) this.mScaleFrame.getFrame()).getByteBuffer();
            nativeOnFrameAvailable(this.m_nativeHandler, byteBuffer2, byteBuffer2.remaining());
            return;
        }
        C63929ab.m250976b("TEMediaCodecDecoder", "image format: " + this.mImage.getFormat());
    }

    private void setRenderParam(int i) {
        this.m_renderParam.f150263b = i;
    }

    private void setProcessFlag(int i) {
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        this.m_bReEnableOpt = z;
    }

    private ByteBuffer getInputBufferByIdx(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.m_decoder.getInputBuffer(i);
        }
        return this.m_decoder.getInputBuffers()[i];
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.m_frameSyncObject) {
            if (this.m_frameAvailable) {
                C63929ab.m250976b("TEMediaCodecDecoder", "m_frameAvailable already set, frame could be dropped!");
            }
            this.m_frameAvailable = true;
            this.m_frameSyncObject.notifyAll();
        }
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        if (Build.VERSION.SDK_INT < 18 || ((Build.VERSION.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (Build.VERSION.SDK_INT == 19 && Build.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str))))) {
            return true;
        }
        return false;
    }

    public void onImageAvailable(ImageReader imageReader) {
        synchronized (this.m_frameSyncObject) {
            if (this.m_frameAvailable) {
                C63929ab.m250976b("TEMediaCodecDecoder", "m_frameAvailable already set, frame could be dropped!");
            }
            Image acquireNextImage = imageReader.acquireNextImage();
            Image image = this.mImage;
            if (image != null) {
                image.close();
            }
            this.mImage = acquireNextImage;
            this.m_frameAvailable = true;
            this.m_frameSyncObject.notifyAll();
        }
    }

    public int releaseOutBuffer(boolean z) {
        try {
            this.m_pendingInputFrameCount--;
            this.m_decoder.releaseOutputBuffer(this.m_indexOfOutputBuffer, z);
        } catch (Exception e) {
            e.printStackTrace();
            C63929ab.m250980d("TEMediaCodecDecoder", e.getMessage());
        }
        if (!z) {
            return 0;
        }
        if (!AwaitNewImage(ParticipantRepo.f117150c)) {
            C63929ab.m250980d("TEMediaCodecDecoder", "release output buffer to surface texture failed!");
            return -103;
        }
        this.m_awaitNewImageSuccess = true;
        return 0;
    }

    private boolean AwaitNewImage(int i) {
        synchronized (this.m_frameSyncObject) {
            do {
                if (!this.m_frameAvailable) {
                    try {
                        this.m_frameSyncObject.wait((long) i);
                    } catch (InterruptedException e) {
                        Log.e("TEMediaCodecDecoder", "" + e.getMessage());
                        e.printStackTrace();
                        return false;
                    }
                } else {
                    this.m_frameAvailable = false;
                    return true;
                }
            } while (this.m_frameAvailable);
            Log.e("TEMediaCodecDecoder", "Frame wait timed out!");
            return false;
        }
    }

    private static MediaCodecInfo getMediaCodecInfo(String str) {
        String[] supportedTypes;
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    for (String str2 : codecInfoAt.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private static MediaCodecInfo getMediaCodecInfo21(String str) {
        String[] supportedTypes;
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (!(codecInfos == null || codecInfos.length == 0)) {
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                    String name = mediaCodecInfo.getName();
                    if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                        for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(str)) {
                                return mediaCodecInfo;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int flushDecoder(boolean z) {
        if (this.m_decoder == null) {
            return -3;
        }
        if (z) {
            try {
                if (this.m_sawInputEOS || this.m_sawOutputEOS) {
                    cleanupDecoder();
                    if (!setupDecoder(this.VIDEO_MIME_TYPE)) {
                        return -2;
                    }
                    C63929ab.m250978c("TEMediaCodecDecoder", "Decoder has been recreated.");
                    return 0;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return -3;
            }
        }
        if (!this.m_inputBufferQueued) {
            return -3;
        }
        if (!z) {
            this.m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
            this.m_timestampOfCurTexFrame = Long.MIN_VALUE;
            this.m_pendingInputFrameCount = 0;
            this.m_sawInputEOS = false;
            this.m_sawOutputEOS = false;
        }
        this.m_decoder.flush();
        this.m_inputBufferQueued = false;
        this.m_pendingInputFrameCount = 0;
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
            C60205c.m233989b(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode());
        }
        C63929ab.m250976b("TEMediaCodecDecoder", "Video decoder has been flushed.");
        return 0;
    }

    private boolean isSupportSize(MediaCodecInfo mediaCodecInfo) {
        Range<Integer> range;
        Range<Integer> range2;
        int i;
        boolean z = false;
        if (mediaCodecInfo == null) {
            return false;
        }
        Range<Integer> supportedWidths = mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().getSupportedWidths();
        Range<Integer> supportedHeights = mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().getSupportedHeights();
        if (supportedWidths.getUpper().intValue() < supportedHeights.getUpper().intValue()) {
            range = supportedWidths;
        } else {
            range = supportedHeights;
        }
        if (supportedWidths.getUpper().intValue() > supportedHeights.getUpper().intValue()) {
            range2 = supportedWidths;
        } else {
            range2 = supportedHeights;
        }
        int i2 = this.m_iWidth;
        int i3 = this.m_iHeight;
        if (i2 < i3) {
            i = i2;
        } else {
            i = i3;
        }
        if (i2 <= i3) {
            i2 = i3;
        }
        if (range.contains(Integer.valueOf(i)) && range2.contains(Integer.valueOf(i2))) {
            z = true;
        }
        Log.i("TEMediaCodecDecoder", "isSupportSize, m_iWidth = " + this.m_iWidth + ", m_iHeight  = " + this.m_iHeight + ", widthRange = [" + supportedWidths.getLower() + ", " + supportedWidths.getUpper() + "], heightRange = [" + supportedHeights.getLower() + ", " + supportedHeights.getUpper() + "], bSupportSize = " + z);
        return z;
    }

    private boolean setupDecoder(String str) {
        if (!((Boolean) VEConfigCenter.m250617a().mo220632a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue() || C60205c.m233986a(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            try {
                if (!m_useCreateDecoderByName) {
                    this.m_decoder = MediaCodec.createDecoderByType(str);
                } else {
                    String bestCodecName = getBestCodecName(str);
                    this.m_decoder = MediaCodec.createByCodecName(bestCodecName);
                    C63929ab.m250974a("TEMediaCodecDecoder", "setupDecoder, codecName = " + bestCodecName);
                }
                C63929ab.m250974a("TEMediaCodecDecoder", "setupDecoder, m_useCreateDecoderByName = " + m_useCreateDecoderByName);
                Surface surface = this.m_surface;
                if (surface != null) {
                    this.m_decoder.configure(this.m_format, surface, (MediaCrypto) null, 0);
                } else {
                    this.m_decoder.configure(this.m_format, this.mImageReader.getSurface(), (MediaCrypto) null, 0);
                }
                this.m_decoder.start();
                this.m_decoderStarted = true;
                return true;
            } catch (Exception e) {
                C63929ab.m250980d("TEMediaCodecDecoder", "" + e.getMessage());
                e.printStackTrace();
                cleanupDecoder();
                return false;
            }
        } else {
            C63929ab.m250978c("TEMediaCodecDecoder", C63929ab.m250970a("TEMediaCodecDecoder", "setupDecoder ERROR_HW_OVERLOAD", new C63929ab.C63930a("MaxCodecBlocksSize is", Integer.valueOf(C60205c.m233985a()), ""), new C63929ab.C63930a("UsedCodecBlocksSize is", Integer.valueOf(C60205c.m233988b()), "")));
            return false;
        }
    }

    public String getBestCodecName(String str) {
        int i;
        MediaCodecInfo mediaCodecInfo;
        String[] supportedTypes;
        C60203a a;
        if (Build.VERSION.SDK_INT < 16) {
            Log.d("TEMediaCodecDecoder", "API < 16");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            if (!str.equals("video/hevc") || !mIsByteVC1Blocklist) {
                Log.i("TEMediaCodecDecoder", "detect hardware codec by codecType = " + str);
                ArrayList arrayList = new ArrayList();
                synchronized (mCodecListLock) {
                    boolean z = !mVideoHWDecoderCodecs.isEmpty();
                    if (z) {
                        try {
                            i = mVideoHWDecoderCodecs.size();
                        } catch (Exception unused) {
                            Log.w("TEMediaCodecDecoder", "mediaserver died");
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
                        Log.d("TEMediaCodecDecoder", "found codec name : " + name);
                        if (!mediaCodecInfo.isEncoder() && !name.startsWith("OMX.google") && !name.startsWith("c2.android") && (supportedTypes = mediaCodecInfo.getSupportedTypes()) != null) {
                            for (String str2 : supportedTypes) {
                                if (!TextUtils.isEmpty(str2)) {
                                    if (!z && str2.startsWith("video/")) {
                                        mVideoHWDecoderCodecs.add(mediaCodecInfo);
                                    }
                                    if (str2.equalsIgnoreCase(str)) {
                                        Log.d("TEMediaCodecDecoder", "codec types : " + str2);
                                        if ((name.startsWith("OMX.") || name.startsWith("c2.")) && !name.startsWith("OMX.pv") && !name.startsWith("OMX.ittiam") && !name.contains("ffmpeg") && !name.contains("avcodec") && !name.contains("secure") && ((!name.startsWith("OMX.MTK.") || Build.VERSION.SDK_INT >= 18) && !codecNeedsFlushWorkaround(name) && (a = C60203a.m233982a(mediaCodecInfo, str)) != null)) {
                                            Log.i("TEMediaCodecDecoder", "codec : " + a.f150268a.getName() + ",  rank : " + a.f150269b);
                                            if (a.f150269b == 40 && Build.VERSION.SDK_INT < 21) {
                                                Log.w("TEMediaCodecDecoder", "skip vendor mediacodec api impl ambiguous");
                                            } else if (a.f150269b == 20) {
                                                Log.w("TEMediaCodecDecoder", "skip vendor software codec");
                                            } else {
                                                arrayList.add(a);
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
                    C60203a aVar = (C60203a) arrayList.get(0);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C60203a aVar2 = (C60203a) it.next();
                        if (aVar2.f150269b > aVar.f150269b) {
                            aVar = aVar2;
                        }
                    }
                    return aVar.f150268a.getName();
                }
            }
            Log.w("TEMediaCodecDecoder", "the device is hw decoder blocklist," + Build.HARDWARE);
            return null;
        }
    }

    public int getInfoByFlag(long[] jArr, int i) {
        if (i == 1) {
            jArr[0] = this.m_timestampOfLastDecodedFrame;
        } else if (i == 2) {
            jArr[0] = this.m_timestampOfCurTexFrame;
        }
        return 0;
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

    public static Bitmap convertTexToBitmap(int i, int i2, int i3) {
        ByteBuffer readTextureToByteBuffer = readTextureToByteBuffer(i, i2, i3);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(readTextureToByteBuffer);
        return createBitmap;
    }

    public static boolean checkHDVideoCanFastImport(int i, int i2, int i3) {
        if (!((Boolean) VEConfigCenter.m250617a().mo220632a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
            return false;
        }
        return C60205c.m233987a(i, i2, i3);
    }

    private static boolean isSupportFormat(String str, int i, int i2) {
        MediaCodecInfo mediaCodecInfo21 = getMediaCodecInfo21(str);
        if (mediaCodecInfo21 == null) {
            C63929ab.m250980d("TEMediaCodecDecoder", "MediaCodecInfo is null!");
            return false;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecInfo21.getCapabilitiesForType(str).profileLevels;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == i && codecProfileLevel.level >= i2) {
                return true;
            }
        }
        return false;
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

    public static boolean saveFrameToFile(int i, int i2, int i3) {
        Bitmap convertTexToBitmap = convertTexToBitmap(i, i2, i3);
        file_count++;
        File file = new File("sdcard/dump/" + file_count + ".jpg");
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

    public int decodeFrameWithoutDraw(byte[] bArr, int i, long j) throws IOException {
        if (this.m_decoder == null) {
            return -2;
        }
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue() && !C60205c.m233986a(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            C63929ab.m250978c("TEMediaCodecDecoder", C63929ab.m250970a("TEMediaCodecDecoder", "decodeFrameWithoutDraw ERROR_HW_OVERLOAD", new C63929ab.C63930a("MaxCodecBlocksSize is", Integer.valueOf(C60205c.m233985a()), ""), new C63929ab.C63930a("UsedCodecBlocksSize is", Integer.valueOf(C60205c.m233988b()), "")));
        }
        try {
            return decodeFrameWithInputOutput(bArr, i, j);
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return -2;
        }
    }

    public void updateAndRenderOES(int i, int i2, int i3) {
        this.m_iOutputWidth = i2;
        this.m_iOutputHeight = i3;
        if (!this.m_bUseImageReader && this.m_eglStateSaver == null) {
            C60185d dVar = new C60185d();
            this.m_eglStateSaver = dVar;
            dVar.mo205523a();
        }
        if (!this.m_bUseImageReader && !EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.mo205524b())) {
            C63929ab.m250978c("TEMediaCodecDecoder", "eglGetCurrentContext = " + EGL14.eglGetCurrentContext() + " getSavedEGLContext = " + this.m_eglStateSaver.mo205524b());
        }
        if (!this.m_sawOutputEOS) {
            C63929ab.m250976b("TEMediaCodecDecoder", "Rendering decoded frame to surface texture.");
            if (this.m_awaitNewImageSuccess) {
                this.m_timestampOfCurTexFrame = this.m_bufferInfo.presentationTimeUs;
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.block();
                }
                SurfaceTexture surfaceTexture = this.m_surfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                }
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.close();
                    this.m_awaitNewImageSuccess = false;
                    return;
                }
                C60201a aVar = this.m_textureRender;
                if (aVar != null && i > 0) {
                    aVar.mo205591a(this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i);
                }
                if (this.m_bUseImageReader) {
                    onImageFrameAvailable();
                }
                this.m_awaitNewImageSuccess = false;
                return;
            }
            C63929ab.m250980d("TEMediaCodecDecoder", "Render OES to 2D texture failed: m_awaitNewImageSuccess is false!");
            return;
        }
        C63929ab.m250976b("TEMediaCodecDecoder", "Render OES to 2D texture failed: m_sawOutputEOS");
    }

    private int decodeFrame2Surface(byte[] bArr, int i, long j) throws IOException {
        int i2;
        int dequeueOutputBuffer;
        int i3;
        boolean z;
        int i4;
        long j2;
        int i5 = sPendingInputBufferThreshold;
        int i6 = sDequeueOutputTimeoutUs;
        this.m_needSendPacketAgain = false;
        if (i == 0) {
            i2 = i6;
        } else {
            i2 = 0;
        }
        if (!this.m_sawInputEOS) {
            MediaCodec mediaCodec = this.m_decoder;
            if (sDequeueHWDecodeInputBufferOpt) {
                j2 = (long) i2;
            } else {
                j2 = (long) i6;
            }
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j2);
            int i7 = 0;
            while (true) {
                if (dequeueInputBuffer >= 0 || (sDequeueHWDecodeInputBufferOpt && i != 0)) {
                    break;
                }
                try {
                    Thread.sleep(5, 0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dequeueInputBuffer = this.m_decoder.dequeueInputBuffer((long) i6);
                i7++;
                if (i7 >= 20) {
                    C63929ab.m250980d("TEMediaCodecDecoder", C63929ab.m250970a("TEMediaCodecDecoder", "decodeFrame2Surface try dequeueInputBuffer timeout --", new C63929ab.C63930a("tryCount =", Integer.valueOf(i7), "")));
                    break;
                }
            }
            if (dequeueInputBuffer >= 0) {
                ByteBuffer inputBufferByIdx = getInputBufferByIdx(dequeueInputBuffer);
                if (i == 0) {
                    this.m_decoder.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                    this.m_sawInputEOS = true;
                    C63929ab.m250976b("TEMediaCodecDecoder", "RenderInput EOS");
                } else {
                    inputBufferByIdx.clear();
                    if (inputBufferByIdx.capacity() < i) {
                        C63929ab.m250980d("TEMediaCodecDecoder", "inputBuf.capacity(): " + inputBufferByIdx.capacity() + " < inputSize: " + i + ", m_pendingInputFrameCount" + this.m_pendingInputFrameCount + ", width * height: " + this.m_iWidth + "*" + this.m_iHeight);
                    }
                    inputBufferByIdx.put(bArr, 0, i);
                    this.m_decoder.queueInputBuffer(dequeueInputBuffer, 0, i, j, 0);
                    this.m_inputBufferQueued = true;
                    this.m_pendingInputFrameCount++;
                }
            } else {
                this.m_needSendPacketAgain = true;
                C63929ab.m250976b("TEMediaCodecDecoder", "RenderInput buffer not available");
            }
        }
        if (this.m_sawOutputEOS) {
            i6 *= 20;
        } else if (this.m_pendingInputFrameCount <= i5) {
            i6 = 0;
        }
        while (true) {
            dequeueOutputBuffer = this.m_decoder.dequeueOutputBuffer(this.m_bufferInfo, (long) i6);
            if (dequeueOutputBuffer != -3) {
                if (dequeueOutputBuffer != -2) {
                    break;
                }
                MediaFormat outputFormat = this.m_decoder.getOutputFormat();
                int integer = outputFormat.getInteger("width");
                int integer2 = outputFormat.getInteger("height");
                int integer3 = outputFormat.getInteger("crop-left");
                int integer4 = outputFormat.getInteger("crop-right") + 1;
                int integer5 = outputFormat.getInteger("crop-top");
                int integer6 = outputFormat.getInteger("crop-bottom") + 1;
                if (!this.m_bReEnableOpt || integer <= 0 || integer2 <= 0) {
                    i4 = i6;
                } else {
                    float f = (float) integer;
                    float f2 = (float) integer2;
                    i4 = i6;
                    this.m_renderParam.f150262a = new RectF((((float) integer3) * 1.0f) / f, (((float) integer5) * 1.0f) / f2, (((float) integer4) * 1.0f) / f, (((float) integer6) * 1.0f) / f2);
                    this.m_renderParam.f150264c = integer4 - integer3;
                    this.m_renderParam.f150265d = integer6 - integer5;
                }
                C60201a aVar = this.m_textureRender;
                if (aVar != null) {
                    aVar.mo205592a(integer, integer2, integer5, integer6, integer3, integer4);
                }
                i6 = i4;
            }
        }
        if (dequeueOutputBuffer == -1) {
            C63929ab.m250976b("TEMediaCodecDecoder", "No output from decoder available");
            return -102;
        } else if (dequeueOutputBuffer < 0) {
            C63929ab.m250980d("TEMediaCodecDecoder", C63929ab.m250970a("TEMediaCodecDecoder", "Unexpected result from decoder.dequeueOutputBuffer", new C63929ab.C63930a("decoderStatus", Integer.valueOf(dequeueOutputBuffer), "")));
            return -2;
        } else {
            C63929ab.m250976b("TEMediaCodecDecoder", "Surface decoder given buffer " + dequeueOutputBuffer + " (size=" + this.m_bufferInfo.size + ")  (pts=" + this.m_bufferInfo.presentationTimeUs + ") ");
            if ((this.m_bufferInfo.flags & 4) != 0) {
                C63929ab.m250976b("TEMediaCodecDecoder", "DisplayView EOS");
                i3 = 1;
                this.m_sawOutputEOS = true;
            } else {
                i3 = 1;
            }
            if (!this.m_sawOutputEOS) {
                this.m_timestampOfLastDecodedFrame = this.m_bufferInfo.presentationTimeUs;
                this.m_pendingInputFrameCount -= i3;
                C63929ab.m250976b("TEMediaCodecDecoder", "Pending input frame count decreased: " + this.m_pendingInputFrameCount);
                z = true;
            } else {
                z = false;
            }
            this.m_decoder.releaseOutputBuffer(dequeueOutputBuffer, z);
            if (!z) {
                return -1;
            }
            C63929ab.m250976b("TEMediaCodecDecoder", "Rendering decoded frame to surface texture.");
            if (AwaitNewImage(ParticipantRepo.f117150c)) {
                this.m_timestampOfCurTexFrame = this.m_bufferInfo.presentationTimeUs;
                while (true) {
                    int glGetError = GLES20.glGetError();
                    if (glGetError != 0) {
                        C63929ab.m250980d("TEMediaCodecDecoder", ": glError " + glGetError);
                    } else {
                        C63929ab.m250976b("TEMediaCodecDecoder", "Surface texture updated, pts=" + this.m_timestampOfCurTexFrame);
                        return 0;
                    }
                }
            } else {
                C63929ab.m250980d("TEMediaCodecDecoder", C63929ab.m250970a("TEMediaCodecDecoder", "Render decoded frame to surface texture failed!", new C63929ab.C63930a[0]));
                return -103;
            }
        }
    }

    private int decodeFrameWithInputOutput(byte[] bArr, int i, long j) throws IOException {
        int i2;
        int dequeueOutputBuffer;
        boolean z;
        int i3;
        String str;
        long j2;
        int i4 = sPendingInputBufferThreshold;
        int i5 = sDequeueOutputTimeoutUs;
        this.m_needSendPacketAgain = false;
        if (i == 0) {
            i2 = i5;
        } else {
            i2 = 0;
        }
        String str2 = "";
        int i6 = 1;
        if (!this.m_sawInputEOS) {
            MediaCodec mediaCodec = this.m_decoder;
            if (sDequeueHWDecodeInputBufferOpt) {
                j2 = (long) i2;
            } else {
                j2 = (long) i5;
            }
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j2);
            int i7 = 0;
            while (true) {
                if (dequeueInputBuffer >= 0 || (sDequeueHWDecodeInputBufferOpt && i != 0)) {
                    break;
                }
                try {
                    Thread.sleep(5, 0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dequeueInputBuffer = this.m_decoder.dequeueInputBuffer((long) i5);
                i7++;
                if (i7 >= 20) {
                    C63929ab.m250980d("TEMediaCodecDecoder", C63929ab.m250970a("TEMediaCodecDecoder", "decodeFrameWithInputOutput", new C63929ab.C63930a("try dequeueInputBuffer timeout", i7 + str2, str2)));
                    break;
                }
            }
            if (dequeueInputBuffer >= 0) {
                ByteBuffer inputBufferByIdx = getInputBufferByIdx(dequeueInputBuffer);
                if (i == 0) {
                    this.m_decoder.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                    this.m_sawInputEOS = true;
                    C63929ab.m250974a("TEMediaCodecDecoder", "RenderInput EOS");
                } else {
                    inputBufferByIdx.clear();
                    if (inputBufferByIdx.capacity() < i) {
                        C63929ab.m250980d("TEMediaCodecDecoder", "inputBuf.capacity(): " + inputBufferByIdx.capacity() + " < inputSize: " + i + ", m_pendingInputFrameCount" + this.m_pendingInputFrameCount + ", width * height: " + this.m_iWidth + "*" + this.m_iHeight);
                    }
                    inputBufferByIdx.put(bArr, 0, i);
                    this.m_decoder.queueInputBuffer(dequeueInputBuffer, 0, i, j, 0);
                    this.m_inputBufferQueued = true;
                    this.m_pendingInputFrameCount++;
                }
            } else {
                this.m_needSendPacketAgain = true;
                C63929ab.m250976b("TEMediaCodecDecoder", "RenderInput buffer not available, inputSize:" + i);
            }
        }
        if (this.m_sawOutputEOS) {
            i5 *= 20;
        } else if (this.m_pendingInputFrameCount <= i4) {
            i5 = 0;
        }
        while (true) {
            dequeueOutputBuffer = this.m_decoder.dequeueOutputBuffer(this.m_bufferInfo, (long) i5);
            if (dequeueOutputBuffer != -3) {
                if (dequeueOutputBuffer != -2) {
                    break;
                }
                MediaFormat outputFormat = this.m_decoder.getOutputFormat();
                int integer = outputFormat.getInteger("width");
                int integer2 = outputFormat.getInteger("height");
                int integer3 = outputFormat.getInteger("crop-left");
                int integer4 = outputFormat.getInteger("crop-right") + i6;
                int integer5 = outputFormat.getInteger("crop-top");
                int integer6 = outputFormat.getInteger("crop-bottom") + i6;
                if (!this.m_bReEnableOpt || integer <= 0 || integer2 <= 0) {
                    i3 = i5;
                    str = str2;
                } else {
                    float f = (float) integer;
                    i3 = i5;
                    float f2 = (float) integer2;
                    str = str2;
                    this.m_renderParam.f150262a = new RectF((((float) integer3) * 1.0f) / f, (((float) integer5) * 1.0f) / f2, (((float) integer4) * 1.0f) / f, (((float) integer6) * 1.0f) / f2);
                    this.m_renderParam.f150264c = integer4 - integer3;
                    this.m_renderParam.f150265d = integer6 - integer5;
                }
                C60201a aVar = this.m_textureRender;
                if (aVar != null) {
                    aVar.mo205592a(integer, integer2, integer5, integer6, integer3, integer4);
                }
                i5 = i3;
                str2 = str;
                i6 = 1;
            }
        }
        if (dequeueOutputBuffer == -1) {
            C63929ab.m250976b("TEMediaCodecDecoder", "No output from decoder available, inputSize:" + i);
            return -102;
        } else if (dequeueOutputBuffer < 0) {
            C63929ab.m250980d("TEMediaCodecDecoder", C63929ab.m250970a("TEMediaCodecDecoder", "Unexpected result from decoder.dequeueOutputBuffer", new C63929ab.C63930a("decoderStatus", Integer.valueOf(dequeueOutputBuffer), str2)));
            return -2;
        } else {
            C63929ab.m250976b("TEMediaCodecDecoder", "Surface decoder given buffer " + dequeueOutputBuffer + " (size=" + this.m_bufferInfo.size + ")  (pts=" + this.m_bufferInfo.presentationTimeUs + ") ");
            this.m_indexOfOutputBuffer = dequeueOutputBuffer;
            if ((this.m_bufferInfo.flags & 4) == 0) {
                z = false;
            } else {
                z = true;
            }
            this.m_sawOutputEOS = z;
            if (this.m_sawOutputEOS) {
                Log.w("TEMediaCodecDecoder", "get MediaCodec BUFFER_FLAG_END_OF_STREAM");
            }
            if (!this.m_sawOutputEOS) {
                this.m_timestampOfLastDecodedFrame = this.m_bufferInfo.presentationTimeUs;
                this.m_timestampOfCurTexFrame = this.m_bufferInfo.presentationTimeUs;
                C63929ab.m250976b("TEMediaCodecDecoder", "Pending input frame count decreased: " + this.m_pendingInputFrameCount);
            }
            if (!this.m_sawOutputEOS) {
                return 0;
            }
            return -1;
        }
    }

    public int decodeFrame(byte[] bArr, int i, long j, int i2, int i3, int i4) throws IOException {
        this.m_iOutputWidth = i3;
        this.m_iOutputHeight = i4;
        if (!this.m_bUseImageReader && this.m_eglStateSaver == null) {
            C60185d dVar = new C60185d();
            this.m_eglStateSaver = dVar;
            dVar.mo205523a();
        }
        if (!this.m_bUseImageReader && !EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.mo205524b())) {
            Log.e("TEMediaCodecDecoder", "eglGetCurrentContext = " + EGL14.eglGetCurrentContext() + " getSavedEGLContext = " + this.m_eglStateSaver.mo205524b());
            this.m_bNeedConfigure = true;
        }
        if (this.m_bNeedConfigure) {
            restartDecoder();
            this.m_bNeedConfigure = false;
            if (!this.m_bUseImageReader) {
                this.m_eglStateSaver.mo205523a();
            }
        }
        int i5 = -2;
        if (this.m_decoder == null) {
            return -2;
        }
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue() && !C60205c.m233986a(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            C63929ab.m250978c("TEMediaCodecDecoder", C63929ab.m250970a("TEMediaCodecDecoder", "decodeFrame ERROR_HW_OVERLOAD", new C63929ab.C63930a("MaxCodecBlocksSize is", Integer.valueOf(C60205c.m233985a()), ""), new C63929ab.C63930a("UsedCodecBlocksSize is", Integer.valueOf(C60205c.m233988b()), "")));
        }
        try {
            i5 = decodeFrame2Surface(bArr, i, j);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        if (i5 == 0) {
            if (this.m_bReEnableOpt) {
                this.m_ReEncodeOptCV.block();
            }
            SurfaceTexture surfaceTexture = this.m_surfaceTexture;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
            if (this.m_bReEnableOpt) {
                this.m_ReEncodeOptCV.close();
                return i5;
            }
            C60201a aVar = this.m_textureRender;
            if (aVar != null && i2 > 0) {
                aVar.mo205591a(this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i2);
            }
            if (this.m_bUseImageReader) {
                onImageFrameAvailable();
            }
        }
        return i5;
    }

    public int setDecoderParams(int i, int i2, int i3, byte[] bArr, int i4, int i5, int i6, int i7) {
        this.m_iWidth = i;
        this.m_iHeight = i2;
        this.m_iFps = i3;
        this.m_iOutputWidth = i5;
        this.m_iOutputHeight = i6;
        this.m_codecSpecificData = null;
        this.m_iCodecID = i7;
        if (i7 == 2) {
            this.VIDEO_MIME_TYPE = "video/mpeg2";
        } else if (i7 == 13) {
            this.VIDEO_MIME_TYPE = "video/mp4v-es";
        } else if (i7 == 28) {
            this.VIDEO_MIME_TYPE = "video/avc";
            this.mMinCompressionRatio = 2;
        } else if (i7 == 140) {
            this.VIDEO_MIME_TYPE = "video/x-vnd.on2.vp8";
        } else if (i7 == 168) {
            this.VIDEO_MIME_TYPE = "video/x-vnd.on2.vp9";
        } else if (i7 == 174) {
            this.VIDEO_MIME_TYPE = "video/hevc";
            this.mMinCompressionRatio = 4;
        }
        if (i4 > 0) {
            this.m_codecSpecificData = ByteBuffer.wrap(bArr, 0, i4);
        }
        this.m_bNeedConfigure = true;
        return 0;
    }

    public int initDecoder(long j, int i, int i2, int i3, byte[] bArr, int i4, int i5, int i6, int i7, boolean z, boolean z2) {
        this.m_nativeHandler = j;
        this.m_bUseImageReader = z2;
        if (Build.VERSION.SDK_INT < 21) {
            C63929ab.m250978c("TEMediaCodecDecoder", "VERSION less then 21, disable HWDecoder");
            return -1;
        }
        m_useCreateDecoderByName = z;
        if (174 == i7 && (isHisiByteVC1BlockList() || isMtkByteVC1BlockList())) {
            mIsByteVC1Blocklist = true;
        }
        int decoderParams = setDecoderParams(i, i2, i3, bArr, i4, i5, i6, i7);
        if (this.m_bNeedConfigure) {
            decoderParams = configureMediaFormat();
        }
        if (decoderParams != 0) {
            return decoderParams;
        }
        if (this.m_eglStateSaver == null && !this.m_bUseImageReader) {
            C60185d dVar = new C60185d();
            this.m_eglStateSaver = dVar;
            dVar.mo205523a();
        }
        if (this.m_bNeedConfigure && (decoderParams = restartDecoder()) == 0) {
            this.m_bNeedConfigure = false;
        }
        C63929ab.m250978c("TEMediaCodecDecoder", "TEMediaCodecDecoder initDecoder width =" + i + " height = " + i2 + " ret=" + decoderParams);
        return decoderParams;
    }
}
