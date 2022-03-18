package org.p3508c.p3509a;

import android.media.AudioRecord;
import android.util.Log;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.ss.android.medialib.p2998a.RunnableC59370a;
import com.ss.android.medialib.presenter.C59423f;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ttve.monitor.C60217b;
import com.ss.android.ttve.monitor.C60229h;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.VESensService;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: org.c.a.c */
public class C70002c {

    /* renamed from: a */
    protected static int f174954a = -1;

    /* renamed from: b */
    protected static int[] f174955b = {44100, JosStatusCodes.RTN_CODE_COMMON_ERROR, 11025, 16000, 22050};

    /* renamed from: c */
    protected static int f174956c = -1;

    /* renamed from: d */
    protected static int[] f174957d = {12, 16, 1};

    /* renamed from: e */
    AudioRecord f174958e;

    /* renamed from: f */
    int f174959f = -1;

    /* renamed from: g */
    int f174960g;

    /* renamed from: h */
    int f174961h = -1;

    /* renamed from: i */
    final int f174962i = 2;

    /* renamed from: j */
    boolean f174963j;

    /* renamed from: k */
    RunnableC59370a f174964k;

    /* renamed from: l */
    AbstractC70001b f174965l;

    /* renamed from: m */
    boolean f174966m;

    /* renamed from: n */
    boolean f174967n;

    /* renamed from: o */
    int f174968o = 1;

    /* renamed from: p */
    public long f174969p;

    /* renamed from: q */
    private int f174970q;

    /* renamed from: r */
    private MediaRecordPresenter.AbstractC59413b f174971r;

    /* renamed from: s */
    private final int f174972s;

    /* renamed from: t */
    private final int f174973t;

    /* renamed from: u */
    private final int f174974u;

    /* renamed from: v */
    private int f174975v = 10;

    /* renamed from: w */
    private ConcurrentHashMap f174976w = new ConcurrentHashMap();

    /* renamed from: x */
    private C59423f f174977x;

    /* renamed from: y */
    private C70004b f174978y = new C70004b();

    /* renamed from: a */
    public static Thread m268495a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: a */
    public int mo246350a(int i) {
        return 16 == i ? 1 : 2;
    }

    /* renamed from: i */
    public void mo246365i() {
        RunnableC59370a aVar = this.f174964k;
        if (aVar != null) {
            aVar.mo202197d();
        }
    }

    /* renamed from: b */
    public void mo246356b() {
        synchronized (this) {
            this.f174966m = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo246359d() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_RELEASE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo246360e() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_USING);
    }

    /* renamed from: g */
    public synchronized boolean mo246363g() {
        boolean z;
        RunnableC59370a aVar = this.f174964k;
        if (aVar == null || !aVar.mo202196c()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public synchronized boolean mo246364h() {
        boolean z;
        RunnableC59370a aVar = this.f174964k;
        if (aVar == null || !aVar.mo202198e()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo246361f() {
        RunnableC59370a aVar;
        C63929ab.m250974a("BufferedAudioRecorder", "stopFeeding() called");
        boolean z = this.f174963j;
        if (z && this.f174958e == null) {
            C63929ab.m250980d("BufferedAudioRecorder", "StopFeeding: State anomaly, reset state!");
            this.f174978y.mo246368a(false);
            this.f174966m = true;
            RunnableC59370a aVar2 = this.f174964k;
            if (aVar2 != null) {
                aVar2.mo202199f();
            }
            return false;
        } else if (!z || (aVar = this.f174964k) == null) {
            C63929ab.m250980d("BufferedAudioRecorder", "Stop Feeding failed, call startRecording first!");
            return false;
        } else if (!aVar.mo202196c()) {
            C63929ab.m250980d("BufferedAudioRecorder", "Stop Feeding failed, please start Feeding and then stop Feeding.");
            return false;
        } else {
            this.f174964k.mo202194b();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        AudioRecord audioRecord = this.f174958e;
        if (audioRecord != null) {
            try {
                if (audioRecord.getState() != 0) {
                    C60217b.m234045a("vesdk_event_will_stop_mic", m268496a("finalize will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                    this.f174958e.stop();
                    C60217b.m234045a("vesdk_event_did_stop_mic", m268496a("finalize did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                    mo246359d();
                    this.f174970q = 3;
                }
                this.f174958e.release();
            } catch (Exception unused) {
            }
            this.f174958e = null;
            this.f174970q = 0;
        }
        super.finalize();
    }

    /* access modifiers changed from: private */
    /* renamed from: org.c.a.c$a */
    public class RunnableC70003a implements Runnable {

        /* renamed from: a */
        boolean f174979a;

        /* renamed from: c */
        private double f174981c;

        public void run() {
            byte[] bArr = new byte[C70002c.this.f174960g];
            int i = 0;
            boolean z = false;
            while (C70002c.this.f174963j) {
                if (C70002c.this.f174958e != null) {
                    i = C70002c.this.f174958e.read(bArr, 0, C70002c.this.f174960g);
                }
                if (-3 == i) {
                    C63929ab.m250980d("BufferedAudioRecorder", "bad audio buffer len " + i);
                } else if (i > 0) {
                    if (C70002c.this.f174969p != 0) {
                        C60229h.m234090a(0, "te_record_audio_first_frame", System.currentTimeMillis() - C70002c.this.f174969p);
                        C70002c.this.f174969p = 0;
                    }
                    try {
                        if (C70002c.this.f174963j && !C70002c.this.f174967n) {
                            C70002c.this.f174965l.mo202591c(bArr, i);
                        }
                        if (C70002c.this.f174964k.mo202196c() && !C70002c.this.f174966m) {
                            C70002c.this.f174964k.mo202193a(bArr, i);
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    if (!(C70002c.this.f174958e == null || C70002c.this.f174958e.getRecordingState() == 3 || z)) {
                        z = true;
                        C70002c.this.f174965l.mo202626m(false);
                    }
                    Thread.sleep(50);
                }
            }
        }

        public RunnableC70003a(double d, boolean z) {
            this.f174981c = d;
            this.f174979a = z;
        }
    }

    /* renamed from: j */
    private synchronized int m268499j() {
        try {
            AudioRecord audioRecord = this.f174958e;
            if (audioRecord == null || audioRecord.getState() == 0) {
                C59423f fVar = this.f174977x;
                if (fVar != null) {
                    fVar.mo202663a(this.f174958e, 1, -1, "start failed");
                }
                return -1;
            }
            C60217b.m234045a("vesdk_event_will_start_mic", m268496a("will start mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
            this.f174958e.startRecording();
            C60217b.m234045a("vesdk_event_did_start_mic", m268496a("did start mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
            mo246360e();
            C59423f fVar2 = this.f174977x;
            if (fVar2 != null) {
                fVar2.mo202663a(this.f174958e, 1, 0, "start success");
            }
            this.f174970q = 2;
            AudioRecord audioRecord2 = this.f174958e;
            if (audioRecord2 == null || audioRecord2.getRecordingState() == 3) {
                return 0;
            }
            C63929ab.m250980d("BufferedAudioRecorder", "audio starRecording failed! Stop immediately! cur status " + this.f174958e.getRecordingState());
            mo246351a();
            this.f174970q = 0;
            return -2;
        } catch (Exception e) {
            try {
                AudioRecord audioRecord3 = this.f174958e;
                if (audioRecord3 != null) {
                    audioRecord3.release();
                }
            } catch (Exception unused) {
            }
            this.f174958e = null;
            this.f174970q = 0;
            C63929ab.m250980d("BufferedAudioRecorder", "audio recording failed!" + e);
            return -3;
        }
    }

    /* renamed from: a */
    public void mo246351a() {
        if (this.f174963j) {
            mo246358c();
        }
        synchronized (this) {
            AudioRecord audioRecord = this.f174958e;
            if (audioRecord != null) {
                try {
                    if (!(audioRecord.getState() == 0 || this.f174958e.getRecordingState() == 1)) {
                        C60217b.m234045a("vesdk_event_will_stop_mic", m268496a("uninit will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                        this.f174958e.stop();
                        C60217b.m234045a("vesdk_event_did_stop_mic", m268496a("uninit did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                        mo246359d();
                        this.f174970q = 3;
                    }
                    this.f174958e.release();
                    C59423f fVar = this.f174977x;
                    if (fVar != null) {
                        fVar.mo202663a(this.f174958e, 3, 0, "release success");
                    }
                } catch (Exception e) {
                    String message = e.getMessage();
                    C59423f fVar2 = this.f174977x;
                    if (fVar2 != null) {
                        AudioRecord audioRecord2 = this.f174958e;
                        StringBuilder sb = new StringBuilder();
                        sb.append("release failed ");
                        if (message == null) {
                            message = "";
                        }
                        sb.append(message);
                        fVar2.mo202663a(audioRecord2, 3, -1, sb.toString());
                    }
                }
                this.f174958e = null;
                this.f174970q = 0;
            } else {
                C59423f fVar3 = this.f174977x;
                if (fVar3 != null) {
                    fVar3.mo202663a(audioRecord, 3, -1, "release failed, audio is null");
                }
            }
        }
        C63929ab.m250974a("BufferedAudioRecorder", "unInit()");
    }

    /* renamed from: c */
    public boolean mo246358c() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            Log.d("BufferedAudioRecorder", "stopRecording() called");
            if (!this.f174963j) {
                return false;
            }
            this.f174978y.mo246368a(false);
            AudioRecord audioRecord = this.f174958e;
            if (audioRecord != null) {
                if (!(audioRecord.getState() == 0 || this.f174958e.getRecordingState() == 1)) {
                    C60217b.m234045a("vesdk_event_will_stop_mic", m268496a("stopRecording will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                    this.f174958e.stop();
                    C60217b.m234045a("vesdk_event_did_stop_mic", m268496a("stopRecording did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                    mo246359d();
                    this.f174970q = 3;
                }
                C59423f fVar = this.f174977x;
                if (fVar != null) {
                    fVar.mo202663a(this.f174958e, 2, 0, "stop success");
                }
            } else {
                C63929ab.m250980d("BufferedAudioRecorder", "The audio module is not activated but stopRecording is called!");
                C59423f fVar2 = this.f174977x;
                if (fVar2 != null) {
                    fVar2.mo202663a(this.f174958e, 2, -1, "stop error audio is null");
                }
            }
            RunnableC59370a aVar = this.f174964k;
            if (aVar != null) {
                aVar.mo202199f();
            }
            C60229h.m234090a(0, "te_record_audio_stop_record_time", System.currentTimeMillis() - currentTimeMillis);
            return true;
        }
    }

    /* renamed from: org.c.a.c$b */
    public class C70004b {

        /* renamed from: a */
        AbstractC1178x<Boolean> f174982a;

        /* renamed from: a */
        public void mo246367a(AbstractC1178x<Boolean> xVar) {
            this.f174982a = xVar;
        }

        public C70004b() {
        }

        /* renamed from: a */
        public void mo246368a(boolean z) {
            C70002c.this.f174963j = z;
            AbstractC1178x<Boolean> xVar = this.f174982a;
            if (xVar != null) {
                xVar.onChanged(Boolean.valueOf(C70002c.this.f174963j));
            }
        }
    }

    /* renamed from: a */
    public void mo246354a(MediaRecordPresenter.AbstractC59413b bVar) {
        this.f174971r = bVar;
    }

    /* renamed from: a */
    public void mo246353a(AbstractC1178x<Boolean> xVar) {
        this.f174978y.mo246367a(xVar);
    }

    /* renamed from: a */
    public boolean mo246355a(double d) {
        RunnableC59370a aVar;
        C63929ab.m250974a("BufferedAudioRecorder", "startFeeding() called with: speed = [" + d + "]");
        if (!this.f174963j || (aVar = this.f174964k) == null) {
            C63929ab.m250978c("BufferedAudioRecorder", "Start Feeding recording is not activated, start Recording will be activated first!");
            mo246352a(d, true);
            return true;
        } else if (aVar.mo202196c()) {
            C63929ab.m250978c("BufferedAudioRecorder", "StartFeeding failed. It's been called once.");
            return false;
        } else {
            this.f174966m = false;
            this.f174967n = false;
            this.f174964k.mo202192a(this.f174959f, mo246350a(this.f174961h), d);
            return true;
        }
    }

    /* renamed from: b */
    public synchronized void mo246357b(int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        Exception e;
        int i7;
        this.f174968o = i;
        if (this.f174958e != null) {
            C63929ab.m250980d("BufferedAudioRecorder", "second time audio init(), skip");
            return;
        }
        int i8 = 2;
        int i9 = -1;
        try {
            int i10 = f174956c;
            if (!(i10 == -1 || (i7 = f174954a) == -1)) {
                int i11 = f174957d[i10];
                this.f174961h = i11;
                int i12 = f174955b[i7];
                this.f174959f = i12;
                this.f174960g = AudioRecord.getMinBufferSize(i12, i11, 2);
                this.f174958e = new AudioRecord(i, this.f174959f, this.f174961h, 2, this.f174960g);
            }
        } catch (Exception e2) {
            C63929ab.m250980d("BufferedAudioRecorder", "Use default configuration " + f174956c + "," + f174954a + "Instantiation audio recorder failed, retest configuration. " + e2);
            this.f174958e = null;
            this.f174965l.mo202617i();
        }
        if (this.f174958e == null) {
            f174956c = -1;
            int[] iArr2 = f174957d;
            int length = iArr2.length;
            int i13 = 0;
            boolean z = false;
            while (i13 < length) {
                this.f174961h = iArr2[i13];
                f174956c++;
                f174954a = i9;
                int[] iArr3 = f174955b;
                int length2 = iArr3.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length2) {
                        i3 = i13;
                        break;
                    }
                    int i15 = iArr3[i14];
                    f174954a++;
                    try {
                        this.f174960g = AudioRecord.getMinBufferSize(i15, this.f174961h, i8);
                        C63929ab.m250980d("BufferedAudioRecorder", "Try hz  " + i15 + " " + this.f174961h + " " + i8);
                        if (this.f174960g > 0) {
                            this.f174959f = i15;
                            i6 = i15;
                            i4 = i14;
                            i5 = length2;
                            iArr = iArr3;
                            i3 = i13;
                            try {
                                this.f174958e = new AudioRecord(i, this.f174959f, this.f174961h, 2, this.f174960g);
                                z = true;
                                break;
                            } catch (Exception e3) {
                                e = e3;
                                this.f174959f = 0;
                                this.f174958e = null;
                                C63929ab.m250980d("BufferedAudioRecorder", "apply audio record sample rate " + i6 + " failed: " + e.getMessage());
                                f174954a = f174954a + 1;
                                i14 = i4 + 1;
                                length2 = i5;
                                i13 = i3;
                                iArr3 = iArr;
                                i8 = 2;
                            }
                        } else {
                            i4 = i14;
                            i5 = length2;
                            iArr = iArr3;
                            i3 = i13;
                            f174954a++;
                            i14 = i4 + 1;
                            length2 = i5;
                            i13 = i3;
                            iArr3 = iArr;
                            i8 = 2;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        i6 = i15;
                        i4 = i14;
                        i5 = length2;
                        iArr = iArr3;
                        i3 = i13;
                        this.f174959f = 0;
                        this.f174958e = null;
                        C63929ab.m250980d("BufferedAudioRecorder", "apply audio record sample rate " + i6 + " failed: " + e.getMessage());
                        f174954a = f174954a + 1;
                        i14 = i4 + 1;
                        length2 = i5;
                        i13 = i3;
                        iArr3 = iArr;
                        i8 = 2;
                    }
                }
                if (z) {
                    break;
                }
                i13 = i3 + 1;
                i8 = 2;
                i9 = -1;
            }
        }
        int i16 = this.f174959f;
        if (i16 <= 0) {
            C63929ab.m250980d("BufferedAudioRecorder", "!Init audio recorder failed, hz " + this.f174959f);
            C59423f fVar = this.f174977x;
            if (fVar != null) {
                fVar.mo202663a(this.f174958e, 0, -1, "init failed, sampleRate error");
            }
            return;
        }
        if (this.f174961h == 16) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f174965l.mo202523a(i16, i2, this.f174972s, this.f174973t, this.f174974u);
        C63929ab.m250974a("BufferedAudioRecorder", "Init audio recorder succeed, apply audio record sample rate " + this.f174959f + " channels " + i2 + " buffer " + this.f174960g + " state " + this.f174958e.getState() + " encodeSampleRate " + this.f174972s + " encodeChannels " + this.f174973t);
        this.f174970q = 1;
        C59423f fVar2 = this.f174977x;
        if (fVar2 != null) {
            fVar2.mo202663a(this.f174958e, 0, 0, "init success, audio recorder succeed");
        }
        AudioRecord audioRecord = this.f174958e;
        if (audioRecord != null && audioRecord.getState() == 0) {
            this.f174958e = null;
            C59423f fVar3 = this.f174977x;
            if (fVar3 != null) {
                fVar3.mo202663a(null, 0, -1, "init failed, audio Recorder state at STATE_UNINITIALIZED");
            }
            C63929ab.m250980d("BufferedAudioRecorder", "AudioRecord state at STATE_UNINITIALIZED! Will try init when start recording.");
        }
    }

    /* renamed from: b */
    private boolean m268498b(double d, boolean z) {
        this.f174966m = false;
        this.f174967n = false;
        AbstractC70001b bVar = this.f174965l;
        RunnableC59370a aVar = new RunnableC59370a(bVar, bVar);
        this.f174964k = aVar;
        aVar.mo202191a();
        if (z) {
            this.f174964k.mo202192a(this.f174959f, mo246350a(this.f174961h), d);
        }
        long currentTimeMillis = System.currentTimeMillis();
        int j = m268499j();
        m268497a(0, j, System.currentTimeMillis() - currentTimeMillis);
        if (j != 0) {
            int i = 0;
            while (true) {
                if (i < this.f174975v) {
                    if (this.f174958e == null) {
                        mo246357b(this.f174968o);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    int j2 = m268499j();
                    int i2 = i + 1;
                    m268497a(i2, j2, System.currentTimeMillis() - currentTimeMillis2);
                    if (j2 == 0) {
                        j = j2;
                        break;
                    }
                    C63929ab.m250980d("BufferedAudioRecorder", "retry start mic times : " + i);
                    j = j2;
                    i = i2;
                } else {
                    break;
                }
            }
        }
        C60229h.m234091a(0, "te_record_audio_mic_start_info", this.f174976w.toString());
        if (j != 0) {
            this.f174976w.clear();
            MediaRecordPresenter.AbstractC59413b bVar2 = this.f174971r;
            if (bVar2 != null) {
                bVar2.mo202646a(-603);
            }
            this.f174965l.mo202626m(false);
            return false;
        }
        MediaRecordPresenter.AbstractC59413b bVar3 = this.f174971r;
        if (bVar3 == null) {
            return true;
        }
        bVar3.mo202646a(3);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (m268498b(r5, r7) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        com.ss.android.vesdk.C63929ab.m250974a("BufferedAudioRecorder", "start mic ok, ready to run AudioRecorderRunnable");
        m268495a(new java.lang.Thread(new org.p3508c.p3509a.C70002c.RunnableC70003a(r4, r5, r7))).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        java.lang.Runtime.getRuntime().gc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        java.lang.Thread.sleep(100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        java.lang.System.runFinalization();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (m268498b(r5, r7) != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        com.ss.android.vesdk.C63929ab.m250974a("BufferedAudioRecorder", "after gc, start mic ok, ready to run AudioRecorderRunnable");
        m268495a(new java.lang.Thread(new org.p3508c.p3509a.C70002c.RunnableC70003a(r4, r5, r7))).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        com.ss.android.ttve.monitor.C60229h.m234090a(0, "te_record_audio_start_record_time", java.lang.System.currentTimeMillis() - r4.f174969p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo246352a(double r5, boolean r7) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p3508c.p3509a.C70002c.mo246352a(double, boolean):void");
    }

    /* renamed from: a */
    private JSONObject m268496a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldState", "");
            jSONObject.put("newState", "");
            jSONObject.put("error", str);
            jSONObject.put("startTime", str2);
            jSONObject.put("endTime", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    private void m268497a(int i, int i2, long j) {
        ConcurrentHashMap concurrentHashMap = this.f174976w;
        concurrentHashMap.put("micStartRet" + i, Integer.valueOf(i2));
        ConcurrentHashMap concurrentHashMap2 = this.f174976w;
        concurrentHashMap2.put("micStartCost" + i, Long.valueOf(j));
    }

    public C70002c(AbstractC70001b bVar, int i, int i2, int i3, C59423f fVar) {
        this.f174965l = bVar;
        this.f174972s = i;
        this.f174973t = i2;
        this.f174974u = i3;
        this.f174977x = fVar;
    }
}
