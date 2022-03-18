package com.ss.android.medialib;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.medialib.p2999b.C59384e;
import com.ss.android.ttve.monitor.C60227g;
import com.ss.android.ttve.monitor.C60229h;
import com.ss.android.vesdk.C63929ab;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

public class AVCEncoder {

    /* renamed from: a */
    static AbstractC59369a f147362a;

    /* renamed from: h */
    private static final String[] f147363h = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};

    /* renamed from: i */
    private static int f147364i = 5000;

    /* renamed from: j */
    private static int f147365j;

    /* renamed from: b */
    MediaCodec.BufferInfo f147366b;

    /* renamed from: c */
    ByteBuffer[] f147367c;

    /* renamed from: d */
    ByteBuffer[] f147368d;

    /* renamed from: e */
    int f147369e = 0;

    /* renamed from: f */
    int f147370f = 30;

    /* renamed from: g */
    BufferedOutputStream f147371g = null;

    /* renamed from: k */
    private MediaCodec f147372k;

    /* renamed from: l */
    private String f147373l = "video/avc";

    /* renamed from: m */
    private MediaCodecInfo f147374m;

    /* renamed from: n */
    private Surface f147375n;

    /* renamed from: o */
    private C59384e f147376o;

    /* renamed from: p */
    private int f147377p;

    /* renamed from: q */
    private int f147378q;

    /* renamed from: r */
    private boolean f147379r;

    /* renamed from: s */
    private Queue<Pair<Integer, Integer>> f147380s = new LinkedList();

    /* renamed from: t */
    private int f147381t = 1;

    /* renamed from: u */
    private int f147382u;

    /* renamed from: v */
    private kCodecType f147383v = kCodecType.H264;

    /* renamed from: w */
    private boolean f147384w = false;

    /* renamed from: x */
    private int f147385x = -1;

    /* renamed from: y */
    private int f147386y = 0;

    /* renamed from: z */
    private int f147387z = 0;

    public enum kCodecType {
        H264,
        ByteVC1,
        MPEG4
    }

    /* renamed from: a */
    public static Thread m230448a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: c */
    public int mo201730c() {
        return this.f147381t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo201737i() {
        return this.f147385x;
    }

    /* renamed from: f */
    public void mo201734f() {
        C59384e eVar = this.f147376o;
        if (eVar != null) {
            eVar.mo202229b();
            this.f147376o = null;
        }
    }

    /* renamed from: a */
    public static int m230447a() {
        try {
            return MediaCodecList.getCodecCount();
        } catch (Exception e) {
            C63929ab.m250980d("AVCEncoder", Log.getStackTraceString(e));
            return 0;
        }
    }

    static {
        m230448a(new Thread(new Runnable() {
            /* class com.ss.android.medialib.AVCEncoder.RunnableC593651 */

            public void run() {
                synchronized (AVCEncoder.class) {
                    AVCEncoder.m230447a();
                }
            }
        })).start();
    }

    /* renamed from: l */
    private int m230454l() {
        int[] b = mo201729b();
        if (b == null) {
            return -1;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 2130708361) {
                C63929ab.m250974a("AVCEncoder", "====== mColorFormat support COLOR_FormatSurface ======");
                return b[i];
            }
        }
        return -1;
    }

    /* renamed from: e */
    public boolean mo201733e() {
        if (this.f147375n == null) {
            C63929ab.m250980d("AVCEncoder", "initEGLCtx: MediaCodec should initialized ahead.");
            return false;
        }
        C59384e a = C59384e.m230531a();
        this.f147376o = a;
        a.mo202224a(BitmapDescriptorFactory.HUE_RED);
        this.f147376o.mo202225a(1.0f, -1.0f);
        return true;
    }

    /* renamed from: g */
    public void mo201735g() {
        MediaCodec mediaCodec;
        C63929ab.m250974a("AVCEncoder", "uninitAVCEncoder == enter");
        synchronized (this) {
            int i = this.f147369e;
            if (i != 0 && (mediaCodec = this.f147372k) != null) {
                if (i == 2) {
                    try {
                        mediaCodec.stop();
                    } catch (Exception unused) {
                        C63929ab.m250980d("AVCEncoder", "MediaCodec Exception");
                    }
                }
                this.f147369e = 3;
                Surface surface = this.f147375n;
                if (surface != null) {
                    surface.release();
                }
                mo201736h();
                C63929ab.m250974a("AVCEncoder", "uninitAVCEncoder == exit");
            }
        }
    }

    /* renamed from: h */
    public synchronized void mo201736h() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f147372k.release();
        } catch (Exception unused) {
        }
        this.f147372k = null;
        this.f147369e = 0;
        C63929ab.m250974a("AVCEncoder", "time cost: " + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: j */
    private MediaCodecInfo m230452j() {
        String[] supportedTypes;
        int a = m230447a();
        for (int i = 0; i < a; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    for (String str : codecInfoAt.getSupportedTypes()) {
                        if (str.equalsIgnoreCase(this.f147373l)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    private MediaCodecInfo m230453k() {
        String[] supportedTypes;
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (!(codecInfos == null || codecInfos.length == 0)) {
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                    String name = mediaCodecInfo.getName();
                    if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                        for (String str : mediaCodecInfo.getSupportedTypes()) {
                            if (str.equalsIgnoreCase(this.f147373l)) {
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

    /* renamed from: b */
    public int[] mo201729b() {
        MediaCodecInfo mediaCodecInfo;
        C63929ab.m250974a("AVCEncoder", "start == ");
        if (Build.VERSION.SDK_INT >= 21) {
            mediaCodecInfo = m230453k();
        } else {
            mediaCodecInfo = m230452j();
        }
        this.f147374m = mediaCodecInfo;
        C63929ab.m250974a("AVCEncoder", "end == ");
        if (this.f147374m == null) {
            C63929ab.m250980d("AVCEncoder", "mMediaCodecInfo failed");
            return null;
        }
        C63929ab.m250974a("AVCEncoder", "mMediaCodecInfo name = " + this.f147374m.getName());
        MediaCodecInfo.CodecCapabilities capabilitiesForType = this.f147374m.getCapabilitiesForType(this.f147373l);
        int length = capabilitiesForType.colorFormats.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = capabilitiesForType.colorFormats[i];
        }
        return iArr;
    }

    /* renamed from: d */
    public synchronized int mo201732d() {
        if (this.f147369e != 0) {
            C63929ab.m250980d("AVCEncoder", "createEncoder is wrong status: " + this.f147369e);
            return -302;
        }
        int l = m230454l();
        this.f147382u = l;
        if (l < 0) {
            C63929ab.m250980d("AVCEncoder", "get color format failed");
            return -100;
        }
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(this.f147373l);
            this.f147372k = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            if (codecInfo.getName().startsWith("OMX.google.")) {
                C63929ab.m250980d("AVCEncoder", "find OMX.google encode...");
                return -608;
            }
            String[] supportedTypes = codecInfo.getSupportedTypes();
            for (String str : supportedTypes) {
                C63929ab.m250974a("AVCEncoder", "CodecNames: " + str);
            }
            this.f147369e = 1;
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
            C63929ab.m250980d("AVCEncoder", "createEncoderByTyp: " + e.getMessage());
            C60227g.m234084a(e);
            return -607;
        }
    }

    /* renamed from: a */
    public static void m230449a(int i) {
        f147364i = i;
    }

    /* renamed from: b */
    public static void m230450b(int i) {
        f147365j = i;
    }

    /* renamed from: a */
    public void mo201728a(AbstractC59369a aVar) {
        f147362a = aVar;
    }

    /* renamed from: c */
    public void mo201731c(int i) {
        this.f147383v = kCodecType.values()[i];
        kCodecType kcodectype = kCodecType.MPEG4;
        kCodecType kcodectype2 = this.f147383v;
        if (kcodectype == kcodectype2) {
            this.f147373l = "video/mp4v-es";
        } else if (kcodectype2 == kCodecType.ByteVC1) {
            this.f147373l = "video/hevc";
        } else {
            this.f147373l = "video/avc";
        }
        C63929ab.m250974a("AVCEncoder", "setCodecType on AVCEncoder " + this.f147383v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
        if (r8.profile < 2) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c8, code lost:
        if (r8.profile < 8) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d0 A[LOOP:2: B:18:0x0082->B:33:0x00d0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d3 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.media.MediaCodecInfo.CodecProfileLevel m230451d(int r12) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.AVCEncoder.m230451d(int):android.media.MediaCodecInfo$CodecProfileLevel");
    }

    /* renamed from: a */
    public int mo201726a(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (this) {
            if (this.f147369e == 2) {
                if (this.f147372k != null) {
                    C63929ab.m250976b("AVCEncoder", "encodeBuffer pts: " + i + "  isEndStream = " + z);
                    if (Build.VERSION.SDK_INT >= 21) {
                        int dequeueInputBuffer = this.f147372k.dequeueInputBuffer(-1);
                        if (dequeueInputBuffer >= 0) {
                            ByteBuffer inputBuffer = this.f147372k.getInputBuffer(dequeueInputBuffer);
                            inputBuffer.clear();
                            inputBuffer.put(bArr, 0, bArr.length);
                            MediaCodec mediaCodec = this.f147372k;
                            int length = bArr.length;
                            long j = (long) i;
                            if (z) {
                                i5 = 4;
                            } else {
                                i5 = 0;
                            }
                            mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, length, j, i5);
                        }
                        int dequeueOutputBuffer = this.f147372k.dequeueOutputBuffer(this.f147366b, (long) f147364i);
                        C63929ab.m250976b("AVCEncoder", "outputBufferIndex = " + dequeueOutputBuffer);
                        C63929ab.m250976b("AVCEncoder", "mBufferInfo.flags = " + this.f147366b.flags);
                        while (dequeueOutputBuffer >= 0) {
                            ByteBuffer outputBuffer = this.f147372k.getOutputBuffer(dequeueOutputBuffer);
                            outputBuffer.position(this.f147366b.offset);
                            outputBuffer.limit(this.f147366b.offset + this.f147366b.size);
                            if ((this.f147366b.flags & 2) != 0) {
                                C63929ab.m250976b("AVCEncoder", "mEncoderCaller.onSetCodecConfig");
                                AbstractC59369a aVar = f147362a;
                                if (aVar != null) {
                                    aVar.mo202160a(outputBuffer);
                                }
                                this.f147366b.size = 0;
                            } else {
                                int i6 = (int) this.f147366b.presentationTimeUs;
                                if ((this.f147366b.flags & 1) != 0) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                C63929ab.m250976b("AVCEncoder", "mEncoderCaller.onWriteFile");
                                AbstractC59369a aVar2 = f147362a;
                                if (aVar2 != null) {
                                    aVar2.mo202161a(outputBuffer, i6, 0, i4);
                                }
                            }
                            this.f147372k.releaseOutputBuffer(dequeueOutputBuffer, false);
                            dequeueOutputBuffer = this.f147372k.dequeueOutputBuffer(this.f147366b, 0);
                        }
                    } else {
                        int dequeueInputBuffer2 = this.f147372k.dequeueInputBuffer(-1);
                        if (dequeueInputBuffer2 >= 0) {
                            ByteBuffer byteBuffer = this.f147367c[dequeueInputBuffer2];
                            byteBuffer.clear();
                            byteBuffer.put(bArr, 0, bArr.length);
                            MediaCodec mediaCodec2 = this.f147372k;
                            int length2 = bArr.length;
                            long j2 = (long) i;
                            if (z) {
                                i3 = 4;
                            } else {
                                i3 = 0;
                            }
                            mediaCodec2.queueInputBuffer(dequeueInputBuffer2, 0, length2, j2, i3);
                        }
                        int dequeueOutputBuffer2 = this.f147372k.dequeueOutputBuffer(this.f147366b, (long) f147364i);
                        while (dequeueOutputBuffer2 >= 0) {
                            if (dequeueOutputBuffer2 == -3) {
                                this.f147368d = this.f147372k.getOutputBuffers();
                            } else if (dequeueOutputBuffer2 != -2) {
                                ByteBuffer byteBuffer2 = this.f147368d[dequeueOutputBuffer2];
                                byteBuffer2.position(this.f147366b.offset);
                                byteBuffer2.limit(this.f147366b.offset + this.f147366b.size);
                                if ((this.f147366b.flags & 2) != 0) {
                                    C63929ab.m250976b("AVCEncoder", "mEncoderCaller.onSetCodecConfig");
                                    AbstractC59369a aVar3 = f147362a;
                                    if (aVar3 != null) {
                                        aVar3.mo202160a(byteBuffer2);
                                    }
                                    this.f147366b.size = 0;
                                } else {
                                    int i7 = (int) this.f147366b.presentationTimeUs;
                                    if ((this.f147366b.flags & 1) != 0) {
                                        i2 = 1;
                                    } else {
                                        i2 = 0;
                                    }
                                    C63929ab.m250976b("AVCEncoder", "mEncoderCaller.onWriteFile");
                                    AbstractC59369a aVar4 = f147362a;
                                    if (aVar4 != null) {
                                        aVar4.mo202161a(byteBuffer2, i7, 0, i2);
                                    }
                                }
                                this.f147372k.releaseOutputBuffer(dequeueOutputBuffer2, false);
                            }
                            dequeueOutputBuffer2 = this.f147372k.dequeueOutputBuffer(this.f147366b, 0);
                        }
                    }
                    return 0;
                }
            }
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014e, code lost:
        if (r9 >= 0) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0150, code lost:
        com.ss.android.vesdk.C63929ab.m250976b("AVCEncoder", "encode: error.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0160, code lost:
        if (android.os.Build.VERSION.SDK_INT < 21) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0162, code lost:
        r4 = r18.f147372k.getOutputBuffer(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0169, code lost:
        r4 = r18.f147368d[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016d, code lost:
        r4.position(r18.f147366b.offset);
        r4.limit(r18.f147366b.offset + r18.f147366b.size);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0186, code lost:
        if ((r18.f147366b.flags & 2) == 0) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0188, code lost:
        com.ss.android.vesdk.C63929ab.m250976b("AVCEncoder", "mEncoderCaller.onSetCodecConfig");
        r4 = com.ss.android.medialib.AVCEncoder.f147362a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0191, code lost:
        if (r4 == null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0193, code lost:
        r4.mo202160a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0196, code lost:
        r18.f147366b.size = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a1, code lost:
        if ((r18.f147366b.flags & 1) == 0) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a3, code lost:
        r16 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a6, code lost:
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a8, code lost:
        com.ss.android.vesdk.C63929ab.m250976b("AVCEncoder", "mEncoderCaller.onWriteFile");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b1, code lost:
        if (com.ss.android.medialib.AVCEncoder.f147362a == null) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b3, code lost:
        com.ss.android.vesdk.C63929ab.m250976b("AVCEncoder", "encode: pts queue size = " + r18.f147380s.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d5, code lost:
        if (r18.f147380s.size() <= 0) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d7, code lost:
        r18.f147387z++;
        r4 = r18.f147380s.poll();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ec, code lost:
        if (r18.f147366b.presentationTimeUs <= 0) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ee, code lost:
        r14 = r18.f147366b.presentationTimeUs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f2, code lost:
        r10 = com.ss.android.medialib.AVCEncoder.f147362a;
        r12 = r14 / 1000;
        r14 = (long) ((java.lang.Integer) r4.first).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0201, code lost:
        if (r22 == false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0209, code lost:
        if (r18.f147380s.isEmpty() == false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020b, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x020e, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0210, code lost:
        r10.mo202162a(r4, r12, r14, r16, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0214, code lost:
        com.ss.android.vesdk.C63929ab.m250978c("AVCEncoder", "encode: no available pts!!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x021c, code lost:
        com.ss.android.vesdk.C63929ab.m250976b("AVCEncoder", "encode: no output.");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo201725a(int r19, int r20, int r21, boolean r22) {
        /*
        // Method dump skipped, instructions count: 636
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.AVCEncoder.mo201725a(int, int, int, boolean):int");
    }

    /* renamed from: a */
    public Surface mo201727a(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        int i7;
        float f;
        int i8 = i4;
        int i9 = i5;
        this.f147385x = -1;
        if (!z || Build.VERSION.SDK_INT < 18) {
            return null;
        }
        this.f147386y = 0;
        this.f147387z = 0;
        C63929ab.m250974a("AVCEncoder", "initAVCEncoder == enter");
        if (i8 < 0 || i8 > 2) {
            C63929ab.m250974a("AVCEncoder", "Do not support bitrate mode " + i8 + ", set VBR mode");
            i8 = 1;
        }
        if (i9 < 1 || i9 > 64) {
            C63929ab.m250974a("AVCEncoder", "Do not support profile " + i9 + ", use baseline");
            i9 = 1;
        }
        C63929ab.m250974a("AVCEncoder", "width + " + i + "\theight = " + i2 + "\tbitrate = " + i3 + "\tuseTextureInput = " + z);
        if (i <= 0 || i2 <= 0) {
            this.f147385x = -100;
            return null;
        }
        this.f147377p = i;
        this.f147378q = i2;
        synchronized (this) {
            try {
                if (mo201732d() != 0) {
                    C63929ab.m250980d("AVCEncoder", "create encoder failed");
                    return null;
                }
                AbstractC59369a aVar = f147362a;
                if (aVar != null) {
                    aVar.mo202159a(this.f147382u);
                }
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.f147373l, i, i2);
                MediaCodecInfo.CodecProfileLevel d = m230451d(i9);
                MediaCodecInfo.CodecCapabilities capabilitiesForType = this.f147372k.getCodecInfo().getCapabilitiesForType(this.f147373l);
                if (Build.VERSION.SDK_INT >= 21) {
                    MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
                    int i10 = 0;
                    for (int i11 = 3; i10 < i11; i11 = 3) {
                        C63929ab.m250976b("AVCEncoder", f147363h[i10] + ": " + encoderCapabilities.isBitrateModeSupported(i10));
                        i10++;
                    }
                }
                if (Build.VERSION.SDK_INT < 24 || d == null) {
                    C63929ab.m250978c("AVCEncoder", "Do not support profile " + i9 + ", use baseline");
                    C60229h.m234090a(0, "te_mediacodec_profile", 1L);
                    C60229h.m234095a("iesve_record_mediacodec_profile", 1L);
                    i7 = i3;
                } else {
                    C63929ab.m250974a("AVCEncoder", "Set Profile: " + d.profile + ", Level = " + d.level);
                    this.f147381t = d.profile;
                    createVideoFormat.setInteger("profile", d.profile);
                    createVideoFormat.setInteger("level", d.level);
                    if (this.f147383v == kCodecType.H264) {
                        int i12 = d.profile;
                        if (i12 != 2) {
                            if (i12 == 8) {
                                C63929ab.m250974a("AVCEncoder", "Set High Profile");
                            }
                            i7 = i3;
                            C60229h.m234090a(0, "te_mediacodec_profile", (long) d.profile);
                            C60229h.m234095a("iesve_record_mediacodec_profile", (long) d.profile);
                        } else {
                            C63929ab.m250974a("AVCEncoder", "Set Main Profile");
                            f = ((float) i3) * 0.85f;
                            i7 = (int) f;
                            C60229h.m234090a(0, "te_mediacodec_profile", (long) d.profile);
                            C60229h.m234095a("iesve_record_mediacodec_profile", (long) d.profile);
                        }
                    } else {
                        if (this.f147383v == kCodecType.ByteVC1) {
                            C63929ab.m250974a("AVCEncoder", "Set ByteVC1 Main Profile");
                        }
                        i7 = i3;
                        C60229h.m234090a(0, "te_mediacodec_profile", (long) d.profile);
                        C60229h.m234095a("iesve_record_mediacodec_profile", (long) d.profile);
                    }
                    f = ((float) i3) * 0.75f;
                    i7 = (int) f;
                    C60229h.m234090a(0, "te_mediacodec_profile", (long) d.profile);
                    C60229h.m234095a("iesve_record_mediacodec_profile", (long) d.profile);
                }
                if (i7 > 20000000) {
                    i7 = 20000000;
                }
                C63929ab.m250974a("AVCEncoder", "bitrate = " + ((((float) i7) * 1.0f) / 1000000.0f) + "Mb/s");
                StringBuilder sb = new StringBuilder();
                sb.append("speed = ");
                sb.append(i6);
                C63929ab.m250974a("AVCEncoder", sb.toString());
                if (kCodecType.MPEG4 == this.f147383v) {
                    createVideoFormat.setInteger("profile", 1);
                    createVideoFormat.setInteger("level", 1);
                    int i13 = i7 * 2;
                    createVideoFormat.setInteger("bitrate", i13);
                    C60229h.m234090a(0, "te_record_hard_encode_bitrate", (long) i13);
                } else {
                    createVideoFormat.setInteger("bitrate", i7);
                    C60229h.m234090a(0, "te_record_hard_encode_bitrate", (long) i7);
                }
                if (kCodecType.MPEG4 != this.f147383v && Build.VERSION.SDK_INT >= 21) {
                    MediaCodecInfo.EncoderCapabilities encoderCapabilities2 = capabilitiesForType.getEncoderCapabilities();
                    for (int i14 = 0; i14 < 3; i14++) {
                        C63929ab.m250974a("AVCEncoder", f147363h[i14] + ": " + encoderCapabilities2.isBitrateModeSupported(i14));
                    }
                    createVideoFormat.setInteger("bitrate-mode", i8);
                    C63929ab.m250974a("AVCEncoder", "Bitrate mode = " + i8);
                    C60229h.m234090a(0, "te_record_mediacodec_rate_control", (long) i8);
                    createVideoFormat.setInteger("max-bitrate", i3);
                    C63929ab.m250974a("AVCEncoder", "Encoder ComplexityRange: " + encoderCapabilities2.getComplexityRange().toString());
                }
                createVideoFormat.setInteger("color-format", this.f147382u);
                createVideoFormat.setInteger("frame-rate", this.f147370f);
                createVideoFormat.setInteger("i-frame-interval", 1);
                C60229h.m234090a(0, "te_record_video_encode_gop", (long) (this.f147370f * 1));
                C63929ab.m250974a("AVCEncoder", "initAVCEncoder: format = " + createVideoFormat);
                this.f147372k.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.f147375n = this.f147372k.createInputSurface();
                this.f147372k.start();
                this.f147369e = 2;
                if (Build.VERSION.SDK_INT < 21) {
                    this.f147367c = this.f147372k.getInputBuffers();
                    this.f147368d = this.f147372k.getOutputBuffers();
                }
                this.f147366b = new MediaCodec.BufferInfo();
                if (this.f147375n == null) {
                    return null;
                }
                this.f147385x = 0;
                C63929ab.m250974a("AVCEncoder", "initAVCEncoder == exit");
                return this.f147375n;
            } catch (Exception e) {
                e.printStackTrace();
                this.f147385x = -222;
                C60227g.m234084a(e);
                return null;
            }
        }
    }
}
