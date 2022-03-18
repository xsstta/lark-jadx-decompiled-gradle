package com.ss.android.lark.mm.module.record.audiorecorder;

import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.mm.aac.MmAACEncoder;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.monitor.recording.MmAudioMonitor;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u0001:\u0003567B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0004H\u0002J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020#H\u0002J\"\u0010*\u001a\u0004\u0018\u00010\u00182\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fH\u0002J\u0018\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\fH\u0002J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000202J\u0006\u00104\u001a\u000202R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00060\u001bR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder;", "", "()V", "buffer", "", "callback", "Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder$IAudioRecordCallback;", "getCallback", "()Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder$IAudioRecordCallback;", "setCallback", "(Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder$IAudioRecordCallback;)V", "dbReadBufferSiz", "", "dbReadBufferSum", "", "encoder", "Lcom/ss/android/lark/mm/aac/MmAACEncoder;", "isMonitoredAudioEngine", "", "isMonitoredEncoder", "isRecording", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStarted", "micRecorder", "Landroid/media/AudioRecord;", "minBytes", "recorderHandler", "Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder$AudioRecordHandler;", "recorderThread", "Landroid/os/HandlerThread;", "getRecorderThread", "()Landroid/os/HandlerThread;", "recorderThread$delegate", "Lkotlin/Lazy;", "recordingTime", "", "totalBytes", "byteArrayToShortArray", "", "byteArray", "calculateFrameTimestampInSec", "totalBits", "createAudioRecord", "sampleRateInHz", "channelConfig", "audioFormat", "getDecibelLevel", "bufferSum", "bufferSize", "pauseRecording", "", "startRecording", "stopRecording", "AudioRecordHandler", "Companion", "IAudioRecordCallback", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.d */
public final class MmAudioRecorder {

    /* renamed from: m */
    public static final Companion f118001m = new Companion(null);

    /* renamed from: a */
    public AudioRecord f118002a;

    /* renamed from: b */
    public final AtomicBoolean f118003b = new AtomicBoolean(false);

    /* renamed from: c */
    public byte[] f118004c;

    /* renamed from: d */
    public long f118005d;

    /* renamed from: e */
    public long f118006e;

    /* renamed from: f */
    public final AtomicBoolean f118007f = new AtomicBoolean(false);

    /* renamed from: g */
    public MmAACEncoder f118008g;

    /* renamed from: h */
    public double f118009h;

    /* renamed from: i */
    public int f118010i;

    /* renamed from: j */
    public int f118011j;

    /* renamed from: k */
    public boolean f118012k;

    /* renamed from: l */
    public boolean f118013l;

    /* renamed from: n */
    private IAudioRecordCallback f118014n;

    /* renamed from: o */
    private AudioRecordHandler f118015o;

    /* renamed from: p */
    private final Lazy f118016p = LazyKt.lazy(C46871d.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0014\u0010\f\u001a\u00020\u00032\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder$IAudioRecordCallback;", "", "onEncoderOutBufferAvailable", "", "aacBytes", "", "ptsInMs", "", "onOutputVolumeData", "db", "", "onRecordAlmostReachLimit", "onRecordError", ApiHandler.API_CALLBACK_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "onRecordPause", "onRecordResume", "onRecordStart", "onRecordStop", "onRecording", "buffer", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.d$c */
    public interface IAudioRecordCallback {
        /* renamed from: a */
        void mo164572a();

        /* renamed from: a */
        void mo164573a(int i);

        /* renamed from: a */
        void mo164576a(Exception exc);

        /* renamed from: a */
        void mo164578a(byte[] bArr, long j);

        /* renamed from: b */
        void mo164579b();

        /* renamed from: c */
        void mo164580c();

        /* renamed from: d */
        void mo164581d();

        /* renamed from: e */
        void mo164582e();
    }

    /* renamed from: e */
    private final HandlerThread m185668e() {
        return (HandlerThread) this.f118016p.getValue();
    }

    /* renamed from: a */
    public final long mo164628a(long j) {
        return (long) ((((float) (j >> 4)) / ((float) 44100)) * ((float) 1000));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder$Companion;", "", "()V", "MAX_LIMIT_TIME", "", "MSG_PAUSE", "", "MSG_PREPARE", "MSG_START", "MSG_STOP", "TAG", "", "WARING_THRESHOLD_TIME", "audioFormat", "channelConfig", "sampleRateInHz", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.d$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final IAudioRecordCallback mo164630a() {
        return this.f118014n;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/HandlerThread;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.d$d */
    static final class C46871d extends Lambda implements Function0<HandlerThread> {
        public static final C46871d INSTANCE = new C46871d();

        C46871d() {
            super(0);
        }

        public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
            return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HandlerThread invoke() {
            return new_android_os_HandlerThread_by_knot("MmAudioRecorder");
        }
    }

    /* renamed from: b */
    public final void mo164633b() {
        if (this.f118003b.compareAndSet(false, true)) {
            this.f118015o.sendEmptyMessage(0);
            this.f118015o.sendEmptyMessage(1);
        }
    }

    /* renamed from: c */
    public final void mo164634c() {
        if (this.f118003b.compareAndSet(true, false)) {
            this.f118015o.sendEmptyMessage(2);
        }
    }

    /* renamed from: d */
    public final void mo164635d() {
        AudioRecord audioRecord = this.f118002a;
        if (audioRecord != null && audioRecord.getState() == 1) {
            this.f118015o.sendEmptyMessage(3);
        }
        this.f118003b.set(false);
        m185668e().quitSafely();
    }

    public MmAudioRecorder() {
        m185668e().start();
        Looper looper = m185668e().getLooper();
        Intrinsics.checkExpressionValueIsNotNull(looper, "recorderThread.looper");
        this.f118015o = new AudioRecordHandler(this, looper);
    }

    /* renamed from: a */
    public final void mo164631a(IAudioRecordCallback cVar) {
        this.f118014n = cVar;
    }

    /* renamed from: a */
    public final short[] mo164632a(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            sArr[i] = (short) ((UByte.m265949b(bArr[i2]) & 255) + (bArr[i2 + 1] << 8));
        }
        return sArr;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder$AudioRecordHandler;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "(Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder;Landroid/os/Looper;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.d$a */
    public final class AudioRecordHandler extends Handler {

        /* renamed from: a */
        final /* synthetic */ MmAudioRecorder f118017a;

        public void handleMessage(Message message) {
            byte[] bArr;
            int i;
            byte[] Enc;
            boolean z;
            Intrinsics.checkParameterIsNotNull(message, "msg");
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                if (this.f118017a.f118002a == null) {
                    MmAudioRecorder dVar = this.f118017a;
                    dVar.f118002a = dVar.mo164629a(44100, 16, 2);
                    IAudioRecordCallback a = this.f118017a.mo164630a();
                    if (a != null) {
                        a.mo164572a();
                    }
                } else {
                    IAudioRecordCallback a2 = this.f118017a.mo164630a();
                    if (a2 != null) {
                        a2.mo164579b();
                    }
                }
                if (this.f118017a.f118002a == null) {
                    C45855f.m181666e("MmAudioRecorder", "create audio recorder failed");
                    IAudioRecordCallback a3 = this.f118017a.mo164630a();
                    if (a3 != null) {
                        a3.mo164576a(new IllegalStateException("create audio recorder failed"));
                    }
                    MmAudioMonitor.f118586a.mo165445a(false, "create audio recorder failed");
                } else {
                    AudioRecord audioRecord = this.f118017a.f118002a;
                    if (audioRecord != null) {
                        audioRecord.startRecording();
                    }
                }
                if (this.f118017a.f118008g == null) {
                    this.f118017a.f118008g = new MmAACEncoder();
                }
                MmAACEncoder mmAACEncoder = this.f118017a.f118008g;
                if (mmAACEncoder != null) {
                    mmAACEncoder.Init(44100, 32000, 1, 1);
                }
            } else if (i2 == 1) {
                while (this.f118017a.f118003b.get()) {
                    if (this.f118017a.f118006e <= 14340000) {
                        if (!(this.f118017a.f118002a == null || (bArr = this.f118017a.f118004c) == null)) {
                            AudioRecord audioRecord2 = this.f118017a.f118002a;
                            if (audioRecord2 != null) {
                                i = audioRecord2.read(bArr, 0, bArr.length);
                            } else {
                                i = 0;
                            }
                            if (i > 0) {
                                if (!this.f118017a.f118012k) {
                                    this.f118017a.f118012k = true;
                                    MmAudioMonitor.m186475a(MmAudioMonitor.f118586a, true, null, 2, null);
                                }
                                this.f118017a.f118005d += (long) i;
                                MmAudioRecorder dVar2 = this.f118017a;
                                dVar2.f118006e = dVar2.mo164628a(dVar2.f118005d << 3);
                                C45855f.m181663b("MmAudioRecorder", "read size: " + i + "， time: " + this.f118017a.f118006e);
                                long currentTimeMillis = System.currentTimeMillis();
                                MmAACEncoder mmAACEncoder2 = this.f118017a.f118008g;
                                if (!(mmAACEncoder2 == null || (Enc = mmAACEncoder2.Enc(bArr)) == null)) {
                                    if (Enc.length == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!z) {
                                        IAudioRecordCallback a4 = this.f118017a.mo164630a();
                                        if (a4 != null) {
                                            a4.mo164578a(Enc, this.f118017a.f118006e);
                                        }
                                        if (!this.f118017a.f118013l) {
                                            this.f118017a.f118013l = true;
                                            MmAudioMonitor.m186478b(MmAudioMonitor.f118586a, true, null, 2, null);
                                        }
                                    }
                                    C45855f.m181663b("MmAudioRecorder", "encode success, spend time: " + (System.currentTimeMillis() - currentTimeMillis) + ", size: " + Enc.length);
                                    for (short s : this.f118017a.mo164632a(bArr)) {
                                        double d = ((double) s) / 32768.0d;
                                        this.f118017a.f118009h += d * d;
                                        this.f118017a.f118010i += 2;
                                        if (this.f118017a.f118010i >= this.f118017a.f118011j) {
                                            MmAudioRecorder dVar3 = this.f118017a;
                                            double a5 = dVar3.mo164627a(dVar3.f118009h, this.f118017a.f118010i);
                                            C45855f.m181663b("MmAudioRecorder", "onOutputVolumeData db: " + a5);
                                            IAudioRecordCallback a6 = this.f118017a.mo164630a();
                                            if (a6 != null) {
                                                a6.mo164573a(Math.abs((int) a5));
                                            }
                                            this.f118017a.f118009h = 0.0d;
                                            this.f118017a.f118010i = 0;
                                        }
                                    }
                                }
                            } else {
                                C45855f.m181666e("MmAudioRecorder", "read error, maybe microphones are preempted");
                            }
                        }
                        if (this.f118017a.f118006e >= 12540000) {
                            C45855f.m181664c("MmAudioRecorder", "almost reach max limit");
                            IAudioRecordCallback a7 = this.f118017a.mo164630a();
                            if (a7 != null) {
                                a7.mo164582e();
                            }
                        }
                    } else {
                        C45855f.m181664c("MmAudioRecorder", "reach max limit");
                        this.f118017a.mo164635d();
                    }
                }
            } else if (i2 == 2) {
                this.f118017a.f118007f.set(false);
                AudioRecord audioRecord3 = this.f118017a.f118002a;
                if (audioRecord3 != null) {
                    audioRecord3.stop();
                }
                MmAACEncoder mmAACEncoder3 = this.f118017a.f118008g;
                if (mmAACEncoder3 != null) {
                    mmAACEncoder3.Uninit();
                }
                this.f118017a.f118008g = null;
                IAudioRecordCallback a8 = this.f118017a.mo164630a();
                if (a8 != null) {
                    a8.mo164580c();
                }
            } else if (i2 == 3) {
                this.f118017a.f118007f.set(false);
                MmAACEncoder mmAACEncoder4 = this.f118017a.f118008g;
                if (mmAACEncoder4 != null) {
                    mmAACEncoder4.Uninit();
                }
                this.f118017a.f118008g = null;
                AudioRecord audioRecord4 = this.f118017a.f118002a;
                if (audioRecord4 != null) {
                    audioRecord4.stop();
                }
                AudioRecord audioRecord5 = this.f118017a.f118002a;
                if (audioRecord5 != null) {
                    audioRecord5.release();
                }
                this.f118017a.f118002a = null;
                IAudioRecordCallback a9 = this.f118017a.mo164630a();
                if (a9 != null) {
                    a9.mo164581d();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AudioRecordHandler(MmAudioRecorder dVar, Looper looper) {
            super(looper);
            Intrinsics.checkParameterIsNotNull(looper, "looper");
            this.f118017a = dVar;
        }
    }

    /* renamed from: a */
    public final double mo164627a(double d, int i) {
        double d2;
        double log10 = ((double) 20) * Math.log10(Math.sqrt(d / ((double) i)));
        if (!Double.isNaN(log10)) {
            if (log10 < ((double) -60)) {
                d2 = 0.06d;
            } else if (log10 < ((double) -50)) {
                d2 = 0.1d;
            } else if (log10 >= ((double) -20)) {
                d2 = 1.0d;
            } else {
                log10 = ((log10 * 0.8d) + ((double) 43)) / ((double) 30);
            }
            log10 = d2;
        }
        return log10 * ((double) 100);
    }

    /* renamed from: a */
    public final AudioRecord mo164629a(int i, int i2, int i3) {
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(i, i2, i3);
            this.f118011j = minBufferSize;
            if (minBufferSize <= 0) {
                StringCompanionObject mVar = StringCompanionObject.f173215a;
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                String format = String.format(locale, "Bad arguments: getMinBufferSize(%d, %d, %d)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
                C45855f.m181666e("MmAudioRecorder", format);
                return null;
            }
            this.f118004c = new byte[2048];
            AudioRecord audioRecord = new AudioRecord(1, i, i2, i3, this.f118011j);
            if (audioRecord.getState() == 0) {
                StringCompanionObject mVar2 = StringCompanionObject.f173215a;
                Locale locale2 = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.US");
                String format2 = String.format(locale2, "Bad arguments to new AudioRecord %d, %d, %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
                Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(locale, format, *args)");
                C45855f.m181666e("MmAudioRecorder", format2);
                return null;
            }
            C45855f.m181664c("MmAudioRecorder", "created AudioRecord " + audioRecord + ", MinBufferSize= " + this.f118011j);
            if (Build.VERSION.SDK_INT >= 24) {
                C45855f.m181663b("MmAudioRecorder", " size in frame " + audioRecord.getBufferSizeInFrames());
            }
            return audioRecord;
        } catch (Exception e) {
            C45855f.m181666e("MmAudioRecorder", "createAudioRecord failed: " + e);
            return null;
        }
    }
}
