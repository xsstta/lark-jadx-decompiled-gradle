package com.ss.android.lark.mm.module.record.audiorecorder;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.apm.p2285a.C45849a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.monitor.recording.MmAudioMonitor;
import com.ss.android.lark.mm.utils.C47115o;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 32\u00020\u0001:\u00013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020)J\u0016\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0006\u00101\u001a\u00020\u001fJ\b\u00102\u001a\u00020\u001fH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R|\u0010\u0017\u001ad\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioPartGenerator;", "", "context", "Landroid/content/Context;", "objectToken", "", "(Landroid/content/Context;Ljava/lang/String;)V", "aacBo", "Ljava/io/BufferedOutputStream;", "aacFile", "Ljava/io/File;", "bgHandler", "Landroid/os/Handler;", "getContext", "()Landroid/content/Context;", "currentIndex", "Ljava/util/concurrent/atomic/AtomicInteger;", "handlerThread", "Landroid/os/HandlerThread;", "isStopped", "", "getObjectToken", "()Ljava/lang/String;", "onPartFileGenerated", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "startMs", "", "index", "duration", "", "getOnPartFileGenerated", "()Lkotlin/jvm/functions/Function5;", "setOnPartFileGenerated", "(Lkotlin/jvm/functions/Function5;)V", "partDir", "partFile", "partOutBo", "doGeneratePartFile", "pcmData", "", "ptsInMs", "", "initAudioRootDir", "onAccBufferAvailable", "aacBytes", "onOutputBuffer", "buffer", "onStop", "processNoSpace", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.b */
public final class MmAudioPartGenerator {

    /* renamed from: f */
    public static final Companion f117982f = new Companion(null);

    /* renamed from: a */
    public final AtomicInteger f117983a = new AtomicInteger(0);

    /* renamed from: b */
    public final HandlerThread f117984b;

    /* renamed from: c */
    public BufferedOutputStream f117985c;

    /* renamed from: d */
    public File f117986d;

    /* renamed from: e */
    public BufferedOutputStream f117987e;

    /* renamed from: g */
    private File f117988g;

    /* renamed from: h */
    private Handler f117989h;

    /* renamed from: i */
    private File f117990i;

    /* renamed from: j */
    private boolean f117991j;

    /* renamed from: k */
    private Function5<? super String, ? super Integer, ? super File, ? super Integer, ? super Boolean, Unit> f117992k;

    /* renamed from: l */
    private final Context f117993l;

    /* renamed from: m */
    private final String f117994m;

    /* renamed from: a */
    public static HandlerThread m185658a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioPartGenerator$Companion;", "", "()V", "INTERVAL_MS", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.q<? super java.lang.String, ? super java.lang.Integer, ? super java.io.File, ? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.q<java.lang.String, java.lang.Integer, java.io.File, java.lang.Integer, java.lang.Boolean, kotlin.Unit> */
    /* renamed from: a */
    public final Function5<String, Integer, File, Integer, Boolean, Unit> mo164616a() {
        return this.f117992k;
    }

    /* renamed from: d */
    public final Context mo164622d() {
        return this.f117993l;
    }

    /* renamed from: e */
    public final String mo164623e() {
        return this.f117994m;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.b$b */
    public static final class RunnableC46867b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmAudioPartGenerator f117995a;

        /* renamed from: b */
        final /* synthetic */ byte[] f117996b;

        /* renamed from: c */
        final /* synthetic */ long f117997c;

        RunnableC46867b(MmAudioPartGenerator bVar, byte[] bArr, long j) {
            this.f117995a = bVar;
            this.f117996b = bArr;
            this.f117997c = j;
        }

        public final void run() {
            this.f117995a.mo164620b(this.f117996b, this.f117997c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.b$d */
    public static final class RunnableC46869d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmAudioPartGenerator f117999a;

        RunnableC46869d(MmAudioPartGenerator bVar) {
            this.f117999a = bVar;
        }

        public final void run() {
            C45858j.m181677a((int) R.string.MMWeb_M_Record_InsufficientStorageRecordingStopped_Toast);
            new C47115o(this.f117999a.mo164622d()).mo165503a(500);
        }
    }

    /* renamed from: b */
    public final void mo164619b() {
        C45855f.m181664c("MmAudioPartGenerator", "onStop");
        this.f117989h.post(new RunnableC46868c(this));
    }

    /* renamed from: c */
    public final void mo164621c() {
        if (!this.f117991j) {
            this.f117991j = true;
            this.f117984b.quitSafely();
            if (C45849a.m181625j() <= 125829120) {
                C45855f.m181664c("MmAudioPartGenerator", "[processNoSpace]");
                MmAudioRecordService.f117956f.mo164590c(this.f117993l);
                C45859k.m181685a(new RunnableC46869d(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.b$c */
    public static final class RunnableC46868c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmAudioPartGenerator f117998a;

        RunnableC46868c(MmAudioPartGenerator bVar) {
            this.f117998a = bVar;
        }

        public final void run() {
            String a;
            try {
                BufferedOutputStream bufferedOutputStream = this.f117998a.f117985c;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.flush();
                }
                BufferedOutputStream bufferedOutputStream2 = this.f117998a.f117985c;
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
                BufferedOutputStream bufferedOutputStream3 = this.f117998a.f117987e;
                if (bufferedOutputStream3 != null) {
                    bufferedOutputStream3.flush();
                }
                BufferedOutputStream bufferedOutputStream4 = this.f117998a.f117987e;
                if (bufferedOutputStream4 != null) {
                    bufferedOutputStream4.close();
                }
                File file = this.f117998a.f117986d;
                if (!(file == null || (a = MmAudioFileHelper.f117976a.mo164599a(file)) == null)) {
                    int h = (int) MmAudioFileHelper.f117976a.mo164611h(file.getAbsolutePath());
                    int i = this.f117998a.f117983a.get();
                    C45855f.m181664c("MmAudioPartGenerator", "[onStop], index: " + i + ", size:" + file.length() + ", duration: " + h);
                    Function5<String, Integer, File, Integer, Boolean, Unit> a2 = this.f117998a.mo164616a();
                    if (a2 != null) {
                        a2.invoke(a, Integer.valueOf(i), file, Integer.valueOf(h), true);
                    }
                    if (h >= 500) {
                        MmAudioMonitor.m186476a(MmAudioMonitor.f118586a, true, (String) null, Integer.valueOf(i), Integer.valueOf(h), 2, (Object) null);
                    } else {
                        MmAudioMonitor mmAudioMonitor = MmAudioMonitor.f118586a;
                        mmAudioMonitor.mo165446a(false, "duration is " + h, Integer.valueOf(i), Integer.valueOf(h));
                    }
                }
                this.f117998a.f117984b.quitSafely();
            } catch (IOException e) {
                C45855f.m181666e("MmAudioPartGenerator", "[onStop] exception: " + e);
                this.f117998a.mo164621c();
            }
        }
    }

    /* renamed from: a */
    public final void mo164617a(Function5<? super String, ? super Integer, ? super File, ? super Integer, ? super Boolean, Unit> qVar) {
        this.f117992k = qVar;
    }

    /* renamed from: a */
    private final void m185659a(Context context) {
        File b = MmAudioFileHelper.f117976a.mo164603b(this.f117994m);
        if (b != null) {
            if (!b.mkdirs() && !b.exists()) {
                C45855f.m181666e("MmAudioPartGenerator", "make partDir failed");
            }
            File file = new File(b, "part");
            file.mkdirs();
            this.f117988g = file;
            File d = MmAudioFileHelper.f117976a.mo164607d(this.f117994m);
            if (d != null) {
                if (!d.mkdirs() && !d.exists()) {
                    C45855f.m181666e("MmAudioPartGenerator", "make aacFullDir failed");
                }
                this.f117990i = new File(d, System.currentTimeMillis() + ".aac");
                this.f117987e = new BufferedOutputStream(new FileOutputStream(this.f117990i));
            }
        }
    }

    public MmAudioPartGenerator(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        this.f117993l = context;
        this.f117994m = str;
        HandlerThread a = m185658a("multi-part");
        this.f117984b = a;
        a.start();
        this.f117989h = new Handler(a.getLooper());
        try {
            m185659a(context);
        } catch (Exception unused) {
            mo164621c();
        }
    }

    /* renamed from: a */
    public final void mo164618a(byte[] bArr, long j) {
        Intrinsics.checkParameterIsNotNull(bArr, "buffer");
        if (this.f117988g == null) {
            C45855f.m181666e("MmAudioPartGenerator", "audio dir create failed!");
            MmAudioMonitor.m186476a(MmAudioMonitor.f118586a, false, (String) null, (Integer) null, (Integer) null, 14, (Object) null);
            return;
        }
        this.f117989h.post(new RunnableC46867b(this, bArr, j));
    }

    /* renamed from: b */
    public final void mo164620b(byte[] bArr, long j) {
        String a;
        try {
            int i = (int) (j / ((long) 1000));
            int i2 = i + 1;
            if (this.f117983a.compareAndSet(i, i2)) {
                BufferedOutputStream bufferedOutputStream = this.f117985c;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                Long l = null;
                this.f117985c = null;
                File file = this.f117986d;
                if (!(file == null || file == null || (a = MmAudioFileHelper.f117976a.mo164599a(file)) == null)) {
                    int h = (int) MmAudioFileHelper.f117976a.mo164611h(file.getAbsolutePath());
                    StringBuilder sb = new StringBuilder();
                    sb.append("part file generated: ");
                    sb.append(System.currentTimeMillis());
                    sb.append(", index: ");
                    sb.append(i);
                    sb.append(", size:");
                    File file2 = this.f117986d;
                    if (file2 != null) {
                        l = Long.valueOf(file2.length());
                    }
                    sb.append(l);
                    sb.append(", duration: ");
                    sb.append(h);
                    C45855f.m181664c("MmAudioPartGenerator", sb.toString());
                    if (h > 0) {
                        MmAudioMonitor.m186476a(MmAudioMonitor.f118586a, true, (String) null, Integer.valueOf(i), Integer.valueOf(h), 2, (Object) null);
                        Function5<? super String, ? super Integer, ? super File, ? super Integer, ? super Boolean, Unit> qVar = this.f117992k;
                        if (qVar != null) {
                            qVar.invoke(a, Integer.valueOf(i), file, Integer.valueOf(h), false);
                        }
                    } else {
                        MmAudioMonitor.f118586a.mo165446a(false, "duration is 0!", Integer.valueOf(i), Integer.valueOf(h));
                        C45855f.m181666e("MmAudioPartGenerator", "generate audio part duration is 0!!!");
                    }
                }
                File file3 = this.f117988g;
                if (file3 != null) {
                    this.f117986d = new File(file3, String.valueOf(j) + "-" + i2 + ".aac");
                    try {
                        this.f117985c = new BufferedOutputStream(new FileOutputStream(this.f117986d));
                    } catch (FileNotFoundException unused) {
                        C45855f.m181666e("MmAudioPartGenerator", this.f117986d + " not found");
                    }
                }
            }
            BufferedOutputStream bufferedOutputStream2 = this.f117985c;
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.write(bArr);
            }
            BufferedOutputStream bufferedOutputStream3 = this.f117985c;
            if (bufferedOutputStream3 != null) {
                bufferedOutputStream3.flush();
            }
            BufferedOutputStream bufferedOutputStream4 = this.f117987e;
            if (bufferedOutputStream4 != null) {
                bufferedOutputStream4.write(bArr);
            }
            BufferedOutputStream bufferedOutputStream5 = this.f117987e;
            if (bufferedOutputStream5 != null) {
                bufferedOutputStream5.flush();
            }
        } catch (Exception e) {
            C45855f.m181666e("MmAudioPartGenerator", "[doGeneratePartFile] error: " + e);
            mo164621c();
        }
    }
}
