package com.ss.android.ttve.nativePort;

import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.ttve.common.C60182a;
import com.ss.android.ttve.common.TEImageUtils;
import com.ss.android.ttve.model.C60214e;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.AbstractC64077u;
import com.ss.android.vesdk.C63929ab;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ttve.nativePort.a */
public class C60262a {

    /* renamed from: C */
    private static String f150414C;

    /* renamed from: D */
    private static String f150415D;

    /* renamed from: A */
    public boolean f150416A;

    /* renamed from: B */
    private long f150417B = Thread.currentThread().getId();

    /* renamed from: a */
    public String f150418a = "HwFrameExtractor2_";

    /* renamed from: b */
    String f150419b;

    /* renamed from: c */
    int[] f150420c;

    /* renamed from: d */
    int f150421d;

    /* renamed from: e */
    int f150422e;

    /* renamed from: f */
    boolean f150423f;

    /* renamed from: g */
    int f150424g;

    /* renamed from: h */
    AbstractC64077u f150425h;

    /* renamed from: i */
    VEFrame f150426i;

    /* renamed from: j */
    VEFrame f150427j;

    /* renamed from: k */
    VEFrame f150428k;

    /* renamed from: l */
    VEFrame f150429l;

    /* renamed from: m */
    MediaCodec f150430m = null;

    /* renamed from: n */
    long f150431n;

    /* renamed from: o */
    int f150432o;

    /* renamed from: p */
    public final Object f150433p = new Object();

    /* renamed from: q */
    public int f150434q;

    /* renamed from: r */
    public int f150435r;

    /* renamed from: s */
    HandlerThread f150436s;

    /* renamed from: t */
    HandlerThread f150437t;

    /* renamed from: u */
    ImageReader f150438u;

    /* renamed from: v */
    int f150439v;

    /* renamed from: w */
    boolean f150440w;

    /* renamed from: x */
    boolean f150441x;

    /* renamed from: y */
    boolean f150442y;

    /* renamed from: z */
    public boolean f150443z;

    /* renamed from: a */
    public static HandlerThread m234165a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: e */
    private void m234166e() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f150421d * this.f150422e * 4);
        allocateDirect.clear();
        this.f150426i = VEFrame.createByteBufferFrame(allocateDirect, this.f150421d, this.f150422e, 0, 0, VEFrame.ETEPixelFormat.TEPixFmt_ARGB8);
    }

    /* renamed from: c */
    public void mo206302c() {
        this.f150441x = true;
        if (this.f150436s != null) {
            try {
                new Handler(this.f150436s.getLooper()).post(new Runnable() {
                    /* class com.ss.android.ttve.nativePort.C60262a.RunnableC602663 */

                    public void run() {
                        synchronized (C60262a.this.f150433p) {
                            C60262a.this.mo206301b();
                            C60262a.this.f150433p.notify();
                        }
                    }
                });
                synchronized (this.f150433p) {
                    if (!this.f150440w) {
                        this.f150433p.wait();
                    }
                }
                this.f150436s.quitSafely();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    private void m234167f() {
        if (f150414C == null || f150415D == null) {
            String lowerCase = C60182a.m233924a().toLowerCase();
            if (lowerCase.contains("qualcomm")) {
                f150414C = "qualcomm";
                if (lowerCase.contains("sdm660")) {
                    f150415D = "sdm660";
                } else if (lowerCase.contains("msm8994")) {
                    f150415D = "msm8994";
                } else if (lowerCase.contains("sdm845")) {
                    f150415D = "sdm845";
                } else if (lowerCase.contains("sm8150")) {
                    f150415D = "sm8150";
                } else {
                    f150415D = "";
                }
            }
        }
    }

    /* renamed from: b */
    public void mo206301b() {
        try {
            C63929ab.m250974a(this.f150418a, "stop begin");
            if (!this.f150440w) {
                this.f150440w = true;
                if (this.f150438u != null) {
                    this.f150430m.reset();
                    this.f150430m.release();
                }
                ImageReader imageReader = this.f150438u;
                if (imageReader != null) {
                    imageReader.close();
                }
                HandlerThread handlerThread = this.f150437t;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                C63929ab.m250974a(this.f150418a, "stop end");
            }
        } catch (Exception e) {
            C63929ab.m250974a(this.f150418a, "stop crash");
            Log.e(this.f150418a, Log.getStackTraceString(e));
            mo206303d();
        }
    }

    /* renamed from: d */
    public void mo206303d() {
        if (!this.f150440w) {
            while (this.f150439v < this.f150420c.length * this.f150424g) {
                C63929ab.m250974a(this.f150418a, "processFrameLast processing hasProcxessCount:" + this.f150439v + " ptsMsLength: " + this.f150420c.length);
                if (!this.f150425h.processFrame(null, this.f150421d, this.f150422e, 0)) {
                    C63929ab.m250974a(this.f150418a, "processFrameLast stop hasProcxessCount:" + this.f150439v + " ptsMsLength: " + this.f150420c.length);
                    return;
                }
                this.f150439v++;
            }
        }
    }

    /* renamed from: a */
    public void mo206299a() {
        boolean z;
        MediaFormat mediaFormat;
        int i;
        boolean z2;
        try {
            C63929ab.m250974a(this.f150418a, "method start begin");
            if (this.f150420c.length <= 0) {
                C63929ab.m250974a(this.f150418a, "ptsMs.length is wrong: " + this.f150420c.length);
                return;
            }
            this.f150441x = false;
            m234167f();
            this.f150431n = System.currentTimeMillis();
            final MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(this.f150419b);
            int i2 = this.f150421d;
            int i3 = this.f150422e;
            MediaFormat mediaFormat2 = null;
            for (int i4 = 0; i4 < mediaExtractor.getTrackCount(); i4++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i4);
                String string = trackFormat.getString("mime");
                if (string.startsWith("video")) {
                    if (string.equals("video/avc")) {
                        this.f150443z = true;
                    } else {
                        this.f150443z = false;
                    }
                    if (string.equals("video/hevc")) {
                        this.f150416A = true;
                    } else {
                        this.f150416A = false;
                    }
                    this.f150434q = trackFormat.getInteger("width");
                    this.f150435r = trackFormat.getInteger("height");
                    int integer = trackFormat.getInteger("rotation-degrees");
                    this.f150432o = integer;
                    if (integer != 0) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((this.f150421d * this.f150422e) * 3) / 2);
                        allocateDirect.clear();
                        this.f150429l = VEFrame.createByteBufferFrame(allocateDirect, this.f150421d, this.f150422e, 0, 0, VEFrame.ETEPixelFormat.TEPixFmt_YUV420P);
                        int i5 = this.f150432o;
                        if (i5 == 90 || i5 == 270) {
                            i2 = this.f150422e;
                            i3 = this.f150421d;
                        }
                    }
                    mediaExtractor.selectTrack(i4);
                    mediaFormat2 = trackFormat;
                }
            }
            if (this.f150427j == null) {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((i2 * i3) * 3) / 2);
                allocateDirect2.clear();
                z = true;
                this.f150427j = VEFrame.createByteBufferFrame(allocateDirect2, i2, i3, this.f150432o, 0, VEFrame.ETEPixelFormat.TEPixFmt_YUV420P);
            } else {
                z = true;
            }
            this.f150430m = MediaCodec.createDecoderByType("video/avc");
            final ArrayList arrayList = new ArrayList();
            mediaExtractor.seekTo((long) this.f150420c[0], 2);
            ArrayList arrayList2 = new ArrayList();
            int i6 = this.f150424g;
            while (true) {
                long sampleTime = mediaExtractor.getSampleTime();
                if (sampleTime < 0 && mediaExtractor.advance()) {
                    this.f150442y = z;
                    mediaFormat = mediaFormat2;
                    break;
                }
                arrayList2.add(Long.valueOf(sampleTime));
                if (mediaExtractor.getSampleFlags() == z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(Long.valueOf(sampleTime));
                }
                int[] iArr = this.f150420c;
                int length = iArr.length;
                int i7 = z ? 1 : 0;
                int i8 = z ? 1 : 0;
                int i9 = z ? 1 : 0;
                int i10 = iArr[length - i7];
                mediaFormat = mediaFormat2;
                if (sampleTime > ((long) i10) && z2) {
                    i6--;
                }
                if (!mediaExtractor.advance() || i6 <= 0) {
                    break;
                }
                mediaFormat2 = mediaFormat;
            }
            if (this.f150442y) {
                C63929ab.m250974a(this.f150418a, "start wrong");
                mo206303d();
                return;
            }
            Collections.sort(arrayList2);
            final ArrayList arrayList3 = new ArrayList();
            int length2 = this.f150420c.length;
            final List[] listArr = new List[length2];
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            while (i11 < size && i12 < this.f150420c.length) {
                if (((Long) arrayList2.get(i11)).longValue() < ((long) this.f150420c[i12])) {
                    i11++;
                } else {
                    if (listArr[i12] == null) {
                        listArr[i12] = new ArrayList();
                    }
                    for (int i13 = 0; i13 < this.f150424g; i13++) {
                        int i14 = i11 + i13;
                        if (i14 < size) {
                            Long l = (Long) arrayList2.get(i14);
                            listArr[i12].add(l);
                            arrayList3.add(l);
                        }
                    }
                    i11++;
                    i12++;
                }
            }
            int[] iArr2 = this.f150420c;
            if (listArr[iArr2.length - 1] == null || listArr[iArr2.length - 1].size() != 1) {
                i = 2;
            } else {
                int[] iArr3 = this.f150420c;
                listArr[iArr3.length - 1].add(listArr[iArr3.length - 1].get(0));
                i = 2;
                listArr[this.f150420c.length - 1].set(0, arrayList2.get(arrayList2.size() - 2));
                arrayList3.add(arrayList3.get(arrayList3.size() - 1));
            }
            for (int i15 = 0; i15 < length2; i15++) {
                List list = listArr[i15];
                for (int i16 = 0; i16 < list.size(); i16++) {
                    C63929ab.m250974a(this.f150418a, "sensArray i: " + i16 + " value: " + list.get(i16).toString());
                }
            }
            mediaExtractor.seekTo((long) this.f150420c[0], 0);
            this.f150436s = m234165a("MediaCodec Callback");
            C63929ab.m250974a(this.f150418a, "getVideoFramesHW: mCodecHandlerThread = " + this.f150436s.getThreadId() + ", curr-threadId = " + this.f150417B);
            this.f150436s.start();
            this.f150430m.setCallback(new MediaCodec.Callback() {
                /* class com.ss.android.ttve.nativePort.C60262a.C602631 */

                /* renamed from: a */
                int f150444a;

                /* renamed from: b */
                int f150445b;

                /* renamed from: c */
                List<Long> f150446c = new ArrayList();

                /* renamed from: d */
                List<Long> f150447d = new ArrayList();

                /* renamed from: e */
                long f150448e = 0;

                public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
                }

                public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
                }

                public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
                    long j;
                    try {
                        if (this.f150444a >= C60262a.this.f150420c.length) {
                            C60262a.this.f150430m.queueInputBuffer(i, 0, 0, 0, 4);
                            C63929ab.m250974a(C60262a.this.f150418a, "onInputBufferAvailable end");
                            return;
                        }
                        ByteBuffer inputBuffer = C60262a.this.f150430m.getInputBuffer(i);
                        int readSampleData = mediaExtractor.readSampleData(inputBuffer, 0);
                        long sampleTime = mediaExtractor.getSampleTime();
                        int sampleFlags = mediaExtractor.getSampleFlags();
                        if (C60262a.this.f150443z || C60262a.this.f150416A) {
                            System.currentTimeMillis();
                            while (true) {
                                if (C60262a.this.f150441x || sampleTime < 0 || sampleFlags == 1 || !TEVideoUtils.isFrameCanDrop(inputBuffer, inputBuffer.remaining(), C60262a.this.f150416A) || arrayList3.contains(Long.valueOf(sampleTime))) {
                                    break;
                                }
                                System.currentTimeMillis();
                                if (!mediaExtractor.advance()) {
                                    C63929ab.m250980d(C60262a.this.f150418a, "onInputBufferAvailable end");
                                    break;
                                }
                                inputBuffer.clear();
                                mediaExtractor.readSampleData(inputBuffer, 0);
                                sampleTime = mediaExtractor.getSampleTime();
                                sampleFlags = mediaExtractor.getSampleFlags();
                            }
                        }
                        if (sampleFlags == 1) {
                            this.f150448e = sampleTime;
                        }
                        this.f150446c.add(Long.valueOf(sampleTime));
                        if (readSampleData <= 0 || sampleTime < 0) {
                            String str = C60262a.this.f150418a;
                            C63929ab.m250974a(str, "onInputBufferAvailable sampSize<0 or time<0 sampSize" + readSampleData + " time: " + sampleTime);
                            C60262a.this.mo206303d();
                            C60262a.this.mo206301b();
                            return;
                        }
                        C60262a.this.f150430m.queueInputBuffer(i, 0, readSampleData, sampleTime, 0);
                        if (!this.f150446c.containsAll(listArr[this.f150444a])) {
                            mediaExtractor.advance();
                            return;
                        }
                        this.f150446c.clear();
                        int i2 = this.f150444a + 1;
                        this.f150444a = i2;
                        if (i2 < C60262a.this.f150420c.length) {
                            int indexOf = arrayList.indexOf(Long.valueOf(this.f150448e));
                            long longValue = ((Long) listArr[this.f150444a].get(0)).longValue();
                            if (indexOf == -1 || indexOf >= arrayList.size() - 1) {
                                j = Long.MAX_VALUE;
                            } else {
                                j = ((Long) arrayList.get(indexOf + 1)).longValue();
                            }
                            if (longValue <= sampleTime || longValue >= j) {
                                mediaExtractor.seekTo(longValue, 0);
                            } else {
                                mediaExtractor.advance();
                            }
                        } else {
                            C63929ab.m250974a(C60262a.this.f150418a, "timer begin");
                            new Handler().postDelayed(new Runnable() {
                                /* class com.ss.android.ttve.nativePort.C60262a.C602631.RunnableC602641 */

                                public void run() {
                                    Log.i(C60262a.this.f150418a, "timer done");
                                    C60262a.this.mo206303d();
                                    C60262a.this.mo206301b();
                                }
                            }, 1000);
                        }
                    } catch (Exception e) {
                        C63929ab.m250974a(C60262a.this.f150418a, "onInputBufferAvailable crash");
                        Log.e(C60262a.this.f150418a, Log.getStackTraceString(e));
                        C60262a.this.mo206303d();
                        C60262a.this.mo206301b();
                    }
                }

                public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
                    try {
                        if (bufferInfo.flags != 4) {
                            int i2 = this.f150445b;
                            if (i2 < listArr.length) {
                                if (i2 >= C60262a.this.f150420c.length || !listArr[this.f150445b].contains(Long.valueOf(bufferInfo.presentationTimeUs))) {
                                    mediaCodec.releaseOutputBuffer(i, false);
                                    return;
                                }
                                this.f150447d.add(Long.valueOf(bufferInfo.presentationTimeUs));
                                synchronized (C60262a.this) {
                                    if (Build.VERSION.SDK_INT >= 23) {
                                        mediaCodec.releaseOutputBuffer(i, true);
                                    } else {
                                        mediaCodec.releaseOutputBuffer(i, bufferInfo.presentationTimeUs * 1000);
                                    }
                                    Log.i(C60262a.this.f150418a, "out waiting before time: " + bufferInfo.presentationTimeUs);
                                    C60262a.this.wait(0);
                                    Log.i(C60262a.this.f150418a, "out waiting after time: " + bufferInfo.presentationTimeUs);
                                }
                                if (this.f150447d.containsAll(listArr[this.f150445b])) {
                                    this.f150445b++;
                                    this.f150447d.clear();
                                }
                                if (this.f150445b >= C60262a.this.f150420c.length) {
                                    Log.i(C60262a.this.f150418a, "HwFrameExtractor2 end");
                                    C60262a.this.mo206301b();
                                    return;
                                }
                                return;
                            }
                        }
                        Log.i(C60262a.this.f150418a, "onOutputBufferAvailable hw finish.");
                        C60262a.this.mo206303d();
                        C60262a.this.mo206301b();
                    } catch (Exception e) {
                        Log.i(C60262a.this.f150418a, "onOutputBufferAvailable crash");
                        Log.e(C60262a.this.f150418a, Log.getStackTraceString(e));
                        C60262a.this.mo206303d();
                        C60262a.this.mo206301b();
                    }
                }
            }, new Handler(this.f150436s.getLooper()));
            this.f150437t = m234165a("ImageReader Callback");
            C63929ab.m250974a(this.f150418a, "getVideoFramesHW: mReaderHandlerThread = " + this.f150437t.getThreadId() + ", curr-threadId = " + this.f150417B);
            this.f150437t.start();
            Handler handler = new Handler(this.f150437t.getLooper());
            ImageReader newInstance = ImageReader.newInstance(this.f150434q, this.f150435r, 35, i);
            this.f150438u = newInstance;
            newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
                /* class com.ss.android.ttve.nativePort.C60262a.C602652 */

                /* renamed from: a */
                int f150455a;

                /* renamed from: b */
                List<Long> f150456b = new ArrayList();

                public void onImageAvailable(ImageReader imageReader) {
                    VEFrame vEFrame;
                    VEFrame vEFrame2;
                    try {
                        synchronized (C60262a.this) {
                            Image acquireNextImage = imageReader.acquireNextImage();
                            long timestamp = acquireNextImage.getTimestamp() / 1000;
                            if (listArr[this.f150455a].contains(Long.valueOf(timestamp))) {
                                if (C60262a.this.f150425h != null) {
                                    if (acquireNextImage.getFormat() == 35) {
                                        if (acquireNextImage.getPlanes() == null || acquireNextImage.getPlanes()[1].getPixelStride() <= 1) {
                                            vEFrame = VEFrame.createYUVPlanFrame(new C60214e(acquireNextImage.getPlanes()), C60262a.this.f150434q, C60262a.this.f150435r, C60262a.this.f150432o, 0, VEFrame.ETEPixelFormat.TEPixFmt_YUV420P);
                                        } else {
                                            VEFrame createYUVPlanFrame = VEFrame.createYUVPlanFrame(new C60214e(acquireNextImage.getPlanes()), C60262a.this.f150434q, C60262a.this.f150435r, C60262a.this.f150432o, 0, VEFrame.ETEPixelFormat.TEPixFmt_NV12);
                                            if (C60262a.this.f150428k == null) {
                                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((C60262a.this.f150434q * C60262a.this.f150435r) * 3) / 2);
                                                allocateDirect.clear();
                                                C60262a aVar = C60262a.this;
                                                aVar.f150428k = VEFrame.createByteBufferFrame(allocateDirect, aVar.f150434q, C60262a.this.f150435r, C60262a.this.f150432o, 0, VEFrame.ETEPixelFormat.TEPixFmt_YUV420P);
                                            }
                                            TEImageUtils.m233918a(createYUVPlanFrame, C60262a.this.f150428k, VEFrame.Operation.OP_CONVERT);
                                            vEFrame = C60262a.this.f150428k;
                                        }
                                        if (C60262a.this.f150427j != null) {
                                            TEImageUtils.m233918a(vEFrame, C60262a.this.f150427j, VEFrame.Operation.OP_SCALE);
                                        }
                                        if (C60262a.this.f150432o != 0) {
                                            vEFrame2 = C60262a.this.f150429l;
                                            TEImageUtils.m233918a(C60262a.this.f150427j, vEFrame2, VEFrame.Operation.OP_ROTATION);
                                        } else {
                                            vEFrame2 = C60262a.this.f150427j;
                                        }
                                        TEImageUtils.m233918a(vEFrame2, C60262a.this.f150426i, VEFrame.Operation.OP_CONVERT);
                                        ((VEFrame.ByteBufferFrame) C60262a.this.f150426i.getFrame()).getByteBuffer().clear();
                                    }
                                    C60262a aVar2 = C60262a.this;
                                    aVar2.mo206300a(((VEFrame.ByteBufferFrame) aVar2.f150426i.getFrame()).getByteBuffer(), C60262a.this.f150426i.getWidth(), C60262a.this.f150426i.getHeight(), (int) (((double) acquireNextImage.getTimestamp()) / 1000000.0d));
                                }
                                this.f150456b.add(Long.valueOf(timestamp));
                                if (this.f150456b.containsAll(listArr[this.f150455a])) {
                                    this.f150456b.clear();
                                    this.f150455a++;
                                }
                                C60262a.this.notify();
                            }
                            acquireNextImage.close();
                        }
                    } catch (OutOfMemoryError e) {
                        Runtime.getRuntime().gc();
                        Log.e(C60262a.this.f150418a, Log.getStackTraceString(e));
                        C60262a.this.mo206303d();
                        C60262a.this.notify();
                        C60262a.this.mo206301b();
                    } catch (Exception e2) {
                        Log.e(C60262a.this.f150418a, Log.getStackTraceString(e2));
                        C60262a.this.mo206303d();
                        C60262a.this.notify();
                        C60262a.this.mo206301b();
                    }
                }
            }, handler);
            mediaFormat.setInteger("color-format", 2135033992);
            int a = (((C60182a.m233923a(f150415D) * 1080) * 1920) / this.f150434q) / this.f150435r;
            if (a > 0) {
                C63929ab.m250974a(this.f150418a, "extract frame targetFps:" + a);
                mediaFormat.setInteger("operating-rate", a);
            }
            this.f150430m.configure(mediaFormat, this.f150438u.getSurface(), (MediaCrypto) null, 0);
            this.f150430m.start();
            Log.i(this.f150418a, "mMediaCodec start");
        } catch (OutOfMemoryError e) {
            C63929ab.m250974a(this.f150418a, "start crash oom");
            Log.e(this.f150418a, Log.getStackTraceString(e));
            Runtime.getRuntime().gc();
            mo206303d();
            mo206301b();
        } catch (Exception e2) {
            C63929ab.m250974a(this.f150418a, "start crash");
            Log.e(this.f150418a, Log.getStackTraceString(e2));
            mo206303d();
            mo206301b();
        }
    }

    /* renamed from: a */
    public void mo206300a(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (this.f150439v < this.f150420c.length * this.f150424g && !this.f150440w) {
            if (!this.f150425h.processFrame(byteBuffer, i, i2, i3)) {
                C63929ab.m250974a(this.f150418a, "processFrame right stop hasProcxessCount:" + this.f150439v + " ptsMsLength: " + this.f150420c.length);
                mo206301b();
            }
            this.f150439v++;
        }
    }

    public C60262a(String str, int[] iArr, int i, int i2, boolean z, int i3, int i4, AbstractC64077u uVar) {
        this.f150439v = 0;
        this.f150440w = false;
        this.f150441x = false;
        this.f150442y = false;
        this.f150443z = false;
        this.f150416A = false;
        this.f150418a += i4 + "_" + this.f150417B;
        this.f150419b = str;
        this.f150420c = iArr;
        this.f150421d = i;
        this.f150422e = i2;
        this.f150423f = z;
        this.f150424g = i3;
        this.f150425h = uVar;
        try {
            m234166e();
        } catch (OutOfMemoryError unused) {
            C63929ab.m250978c(this.f150418a, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                m234166e();
            } catch (Exception unused2) {
                mo206303d();
                return;
            }
        }
        this.f150420c = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.f150420c[i5] = iArr[i5] * 1000;
            C63929ab.m250974a(this.f150418a, "ptsMS: " + this.f150420c[i5]);
        }
    }
}
