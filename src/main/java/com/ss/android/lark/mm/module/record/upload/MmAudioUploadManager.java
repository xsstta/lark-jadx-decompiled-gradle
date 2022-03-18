package com.ss.android.lark.mm.module.record.upload;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.audiorecorder.MmAudioFileHelper;
import com.ss.android.lark.mm.module.record.model.MmUpdateStatus;
import com.ss.android.lark.mm.module.record.upload.MmAudioUploadCenter;
import com.ss.android.lark.mm.module.record.upload.model.C46974a;
import com.ss.android.lark.mm.module.record.upload.model.MmAudioUploadResponse;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableRecordTracker;
import com.ss.android.lark.mm.statistics.monitor.recording.MmAudioMonitor;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 22\u00020\u0001:\u000523456B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0012H\u0002J\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0012J\u0006\u0010#\u001a\u00020\u001eJ\u001f\u0010$\u001a\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u0006H\u0002J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020&H\u0002J\u000e\u0010-\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015J\u0014\u0010.\u001a\u00020\u001e2\n\u0010/\u001a\u00060\u001cR\u00020\u0000H\u0002J\u0006\u00100\u001a\u00020\u001eJ\u0010\u00101\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u001cR\u00020\u00000\u001bX\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager;", "", "()V", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "isChangedStatus", "", "isForceTerminate", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInterrupted", "isRecordingStopped", "isStarting", "lastProgress", "Lkotlin/Pair;", "", "lastShowWeakNetworkTime", "", "lastUploadRequest", "Lcom/ss/android/lark/mm/module/record/upload/model/MmAudioUploadRequest;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$IUploadStateChangeListener;", "queueHandler", "Landroid/os/Handler;", "queueHandlerThread", "Landroid/os/HandlerThread;", "uploadTaskQueue", "Ljava/util/concurrent/LinkedBlockingQueue;", "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$UploadTask;", "addListener", "", "listener", "doAllPartsUploaded", "uploadRequest", "doUpload", "forceTerminate", "getUploadProgress", "token", "", "index", "(Ljava/lang/String;I)Ljava/lang/Integer;", "isNetworkAvailable", "notifyUploadCompletedToServer", "notifyWeakNetwork", "objectToken", "removeListener", "retry", "task", "setRecordingStopped", "uploadFinished", "Companion", "IUploadStateChangeListener", "PollTaskRunnable", "UploadState", "UploadTask", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmAudioUploadManager {

    /* renamed from: j */
    public static final Companion f118198j = new Companion(null);

    /* renamed from: a */
    public final HandlerThread f118199a;

    /* renamed from: b */
    public final LinkedBlockingQueue<UploadTask> f118200b = new LinkedBlockingQueue<>(5);

    /* renamed from: c */
    public final AtomicBoolean f118201c = new AtomicBoolean(false);

    /* renamed from: d */
    public CountDownLatch f118202d = new CountDownLatch(1);

    /* renamed from: e */
    public final AtomicBoolean f118203e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f118204f = new AtomicBoolean(false);

    /* renamed from: g */
    public final AtomicBoolean f118205g = new AtomicBoolean(false);

    /* renamed from: h */
    public final CopyOnWriteArrayList<IUploadStateChangeListener> f118206h = new CopyOnWriteArrayList<>();

    /* renamed from: i */
    public C46974a f118207i;

    /* renamed from: k */
    private Handler f118208k;

    /* renamed from: l */
    private long f118209l = -1;

    /* renamed from: m */
    private Pair<Integer, Integer> f118210m;

    /* renamed from: n */
    private boolean f118211n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$UploadState;", "", "(Ljava/lang/String;I)V", "UPLOADING", "WEAK_NETWORK", "INTERRUPTED", "COMPLETE", "SINGLE_PART_UPLOADED", "UPLOAD_FINISHED", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum UploadState {
        UPLOADING,
        WEAK_NETWORK,
        INTERRUPTED,
        COMPLETE,
        SINGLE_PART_UPLOADED,
        UPLOAD_FINISHED
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$IUploadStateChangeListener;", "", "onUploadStateChange", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadCenter$MmAudioUploadData;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager$b */
    public interface IUploadStateChangeListener {
        /* renamed from: a */
        void mo164575a(MmAudioUploadCenter.MmAudioUploadData aVar);
    }

    /* renamed from: b */
    public static HandlerThread m185942b(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$Companion;", "", "()V", "RETRY_TASK_NAME", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$UploadTask;", "Ljava/lang/Runnable;", "uploadRequest", "Lcom/ss/android/lark/mm/module/record/upload/model/MmAudioUploadRequest;", "(Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager;Lcom/ss/android/lark/mm/module/record/upload/model/MmAudioUploadRequest;)V", "getUploadRequest", "()Lcom/ss/android/lark/mm/module/record/upload/model/MmAudioUploadRequest;", "setUploadRequest", "(Lcom/ss/android/lark/mm/module/record/upload/model/MmAudioUploadRequest;)V", "run", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager$d */
    public final class UploadTask implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmAudioUploadManager f118213a;

        /* renamed from: b */
        private C46974a f118214b;

        /* renamed from: a */
        public final C46974a mo164902a() {
            return this.f118214b;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$UploadTask$run$3", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", "code", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager$d$b */
        public static final class C46964b extends AbstractC47070c<String> {

            /* renamed from: a */
            final /* synthetic */ UploadTask f118216a;

            /* renamed from: b */
            final /* synthetic */ long f118217b;

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager$d$b$a */
            public static final class RunnableC46965a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C46964b f118218a;

                RunnableC46965a(C46964b bVar) {
                    this.f118218a = bVar;
                }

                public final void run() {
                    MmRecordManager.Companion aVar = MmRecordManager.f117918g;
                    String a = this.f118218a.f118216a.mo164902a().mo164928a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "uploadRequest.object_token");
                    if (aVar.mo164551b(a)) {
                        C45858j.m181677a((int) R.string.MMWeb_G_RecordingStopped);
                    }
                }
            }

            @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
            /* renamed from: a */
            public void mo161288a(C47068a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
                MmAppreciableRecordTracker.TrackFinishUploadTime.m186414a(System.currentTimeMillis() - this.f118217b);
                C45855f.m181666e("MmAudioUploadManager", "audio upload error: " + aVar + ", token:" + this.f118216a.mo164902a().mo164928a());
                AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.VideoConference, Scene.MinutesRecorder, Event.minutes_upload_audio_data_error, ErrorType.Network, ErrorLevel.Exception, aVar.mo165306a(), null, null, aVar.mo165308c(), false, MapsKt.mapOf(TuplesKt.to("objecttoken", this.f118216a.mo164902a().mo164928a())), null, null, 6144, null));
                MmAudioMonitor.f118586a.mo165444a(false, this.f118216a.mo164902a(), aVar.mo165308c(), Integer.valueOf(aVar.mo165306a()));
                if (aVar.mo165306a() == MmAudioUploadResponse.AudioUploadCodeEnum.COMPLETED.code) {
                    this.f118216a.f118213a.f118200b.clear();
                    this.f118216a.f118213a.mo164892a();
                    this.f118216a.f118213a.mo164899b(this.f118216a.mo164902a());
                    return;
                }
                this.f118216a.f118213a.mo164894a(this.f118216a);
                MmAudioUploadManager mmAudioUploadManager = this.f118216a.f118213a;
                String a = this.f118216a.mo164902a().mo164928a();
                Intrinsics.checkExpressionValueIsNotNull(a, "uploadRequest.object_token");
                mmAudioUploadManager.mo164896a(a);
            }

            /* renamed from: a */
            public void mo161289a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "code");
                long currentTimeMillis = System.currentTimeMillis() - this.f118217b;
                MmAppreciableRecordTracker.TrackFinishUploadTime.m186414a(currentTimeMillis);
                C45855f.m181664c("MmAudioUploadManager", "onSuccess: " + str + ", spend Time: " + currentTimeMillis);
                if (currentTimeMillis >= ((long) 1000)) {
                    MmAudioUploadManager mmAudioUploadManager = this.f118216a.f118213a;
                    String a = this.f118216a.mo164902a().mo164928a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "uploadRequest.object_token");
                    mmAudioUploadManager.mo164896a(a);
                }
                if (Intrinsics.areEqual(str, String.valueOf(MmAudioUploadResponse.AudioUploadCodeEnum.INTERRUPTED.code))) {
                    C45855f.m181664c("MmAudioUploadManager", "token:" + this.f118216a.mo164902a().mo164928a() + ",  interrupted");
                    if (this.f118216a.f118213a.f118205g.compareAndSet(false, true)) {
                        C45859k.m181685a(new RunnableC46965a(this));
                        Iterator<T> it = this.f118216a.f118213a.f118206h.iterator();
                        while (it.hasNext()) {
                            String a2 = this.f118216a.mo164902a().mo164928a();
                            Intrinsics.checkExpressionValueIsNotNull(a2, "uploadRequest.object_token");
                            it.next().mo164575a(new MmAudioUploadCenter.MmAudioUploadData(a2, UploadState.INTERRUPTED, null, 4, null));
                        }
                    }
                    this.f118216a.f118213a.mo164899b(this.f118216a.mo164902a());
                    MmAudioMonitor.f118586a.mo165444a(false, this.f118216a.mo164902a(), "interrupted", Integer.valueOf(Integer.parseInt(str)));
                } else if (Intrinsics.areEqual(str, String.valueOf(MmAudioUploadResponse.AudioUploadCodeEnum.REACH_MAX_LIMIT.code))) {
                    C45855f.m181664c("MmAudioUploadManager", "token:" + this.f118216a.mo164902a().mo164928a() + ",  reach max duration limit");
                    Iterator<T> it2 = this.f118216a.f118213a.f118206h.iterator();
                    while (it2.hasNext()) {
                        String a3 = this.f118216a.mo164902a().mo164928a();
                        Intrinsics.checkExpressionValueIsNotNull(a3, "uploadRequest.object_token");
                        it2.next().mo164575a(new MmAudioUploadCenter.MmAudioUploadData(a3, UploadState.COMPLETE, null, 4, null));
                    }
                    MmAudioMonitor.f118586a.mo165444a(false, this.f118216a.mo164902a(), "reach max duration limit", Integer.valueOf(Integer.parseInt(str)));
                } else if (Intrinsics.areEqual(str, String.valueOf(MmAudioUploadResponse.AudioUploadCodeEnum.COMPLETED.code))) {
                    C45855f.m181664c("MmAudioUploadManager", "token:" + this.f118216a.mo164902a().mo164928a() + ",  Upload Finished");
                    this.f118216a.f118213a.mo164897b();
                    Iterator<T> it3 = this.f118216a.f118213a.f118206h.iterator();
                    while (it3.hasNext()) {
                        String a4 = this.f118216a.mo164902a().mo164928a();
                        Intrinsics.checkExpressionValueIsNotNull(a4, "uploadRequest.object_token");
                        it3.next().mo164575a(new MmAudioUploadCenter.MmAudioUploadData(a4, UploadState.COMPLETE, null, 4, null));
                    }
                    this.f118216a.f118213a.mo164899b(this.f118216a.mo164902a());
                } else if (Intrinsics.areEqual(str, String.valueOf(MmAudioUploadResponse.AudioUploadCodeEnum.SUCCESS.code))) {
                    C46974a aVar = this.f118216a.f118213a.f118207i;
                    if (aVar != null) {
                        aVar.mo164931a(true);
                    }
                    MmAudioMonitor.m186474a(MmAudioMonitor.f118586a, true, this.f118216a.mo164902a(), (String) null, (Integer) null, 12, (Object) null);
                    this.f118216a.f118213a.mo164899b(this.f118216a.mo164902a());
                } else if (Intrinsics.areEqual(str, String.valueOf(MmAudioUploadResponse.AudioUploadCodeEnum.NO_AUTH.code))) {
                    C45855f.m181666e("MmAudioUploadManager", "upload failed code: " + str + ", NO_AUTH, token:" + this.f118216a.mo164902a().mo164928a());
                    this.f118216a.f118213a.mo164897b();
                    MmAudioMonitor.f118586a.mo165444a(false, this.f118216a.mo164902a(), "no auth", Integer.valueOf(Integer.parseInt(str)));
                } else {
                    C45855f.m181666e("MmAudioUploadManager", "upload failed code: " + str + ", token:" + this.f118216a.mo164902a().mo164928a());
                    try {
                        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.VideoConference, Scene.MinutesRecorder, Event.minutes_upload_audio_data_error, ErrorType.Network, ErrorLevel.Exception, Integer.parseInt(str), null, null, null, false, MapsKt.mapOf(TuplesKt.to("objecttoken", this.f118216a.mo164902a().mo164928a())), null, null, 6144, null));
                    } catch (Exception e) {
                        C45855f.m181666e("MmAudioUploadManager", "AppreciableKit error :" + e);
                    }
                    MmAudioMonitor.f118586a.mo165444a(false, this.f118216a.mo164902a(), (String) null, Integer.valueOf(Integer.parseInt(str)));
                }
                this.f118216a.f118213a.f118202d.countDown();
            }

            C46964b(UploadTask dVar, long j) {
                this.f118216a = dVar;
                this.f118217b = j;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager$d$a */
        public static final class RunnableC46963a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ UploadTask f118215a;

            RunnableC46963a(UploadTask dVar) {
                this.f118215a = dVar;
            }

            public final void run() {
                this.f118215a.f118213a.f118207i = this.f118215a.mo164902a();
                C46974a aVar = this.f118215a.f118213a.f118207i;
                if (aVar != null) {
                    aVar.mo164931a(false);
                }
            }
        }

        public void run() {
            boolean z;
            C45859k.m181685a(new RunnableC46963a(this));
            C45855f.m181664c("MmAudioUploadManager", "[UploadTask] run token: " + this.f118214b.mo164928a() + ", " + "index:" + this.f118214b.mo164937d() + ", pcmFilePath: " + this.f118214b.mo164939e() + ", startMs:" + this.f118214b.mo164932b() + ", duration: " + this.f118214b.mo164935c() + ", lang: " + this.f118214b.mo164940f());
            String f = this.f118214b.mo164940f();
            if (f == null || StringsKt.isBlank(f)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                IMmDepend a = C45899c.m181859a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
                Intrinsics.checkExpressionValueIsNotNull(hostDepend, "MmDepend.impl().hostDepend");
                if (!hostDepend.mo144643k()) {
                    this.f118214b.mo164938d("zh_cn");
                } else {
                    throw new IllegalStateException("upload lang is empty, please check!!!");
                }
            }
            Iterator<T> it = this.f118213a.f118206h.iterator();
            while (it.hasNext()) {
                String a2 = this.f118214b.mo164928a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "uploadRequest.object_token");
                UploadState uploadState = UploadState.UPLOADING;
                MmAudioUploadManager mmAudioUploadManager = this.f118213a;
                String a3 = this.f118214b.mo164928a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "uploadRequest.object_token");
                it.next().mo164575a(new MmAudioUploadCenter.MmAudioUploadData(a2, uploadState, mmAudioUploadManager.mo164891a(a3, this.f118214b.mo164937d())));
            }
            C47057a.m186247a(this.f118214b.mo164928a(), this.f118214b.mo164932b(), this.f118214b.mo164935c(), this.f118214b.mo164937d(), new File(this.f118214b.mo164939e()), this.f118214b.mo164940f(), new C46964b(this, System.currentTimeMillis()));
        }

        public UploadTask(MmAudioUploadManager mmAudioUploadManager, C46974a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "uploadRequest");
            this.f118213a = mmAudioUploadManager;
            this.f118214b = aVar;
        }
    }

    /* renamed from: c */
    private final boolean m185944c() {
        return NetworkUtils.m153070c(C45851c.m181646a());
    }

    /* renamed from: a */
    public final void mo164892a() {
        C45859k.m181685a(new RunnableC46969h(this));
    }

    /* renamed from: b */
    public final void mo164897b() {
        C45859k.m181685a(new RunnableC46967f(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager$f */
    public static final class RunnableC46967f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmAudioUploadManager f118221a;

        RunnableC46967f(MmAudioUploadManager mmAudioUploadManager) {
            this.f118221a = mmAudioUploadManager;
        }

        public final void run() {
            C45855f.m181664c("MmAudioUploadManager", "forceTerminate");
            this.f118221a.mo164892a();
            this.f118221a.f118204f.set(true);
            this.f118221a.f118199a.quit();
            this.f118221a.f118200b.clear();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager$h */
    public static final class RunnableC46969h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmAudioUploadManager f118223a;

        RunnableC46969h(MmAudioUploadManager mmAudioUploadManager) {
            this.f118223a = mmAudioUploadManager;
        }

        public final void run() {
            C46974a aVar;
            C46974a aVar2;
            C45855f.m181664c("MmAudioUploadManager", "setRecordingStopped");
            this.f118223a.f118203e.set(true);
            if (this.f118223a.f118200b.isEmpty() && (aVar = this.f118223a.f118207i) != null && aVar.mo164941g() && (aVar2 = this.f118223a.f118207i) != null) {
                this.f118223a.mo164900c(aVar2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$PollTaskRunnable;", "Ljava/lang/Runnable;", "(Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager;)V", "run", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager$c */
    public final class PollTaskRunnable implements Runnable {
        public void run() {
            while (!MmAudioUploadManager.this.f118204f.get()) {
                if (!MmAudioUploadManager.this.f118200b.isEmpty() || !MmAudioUploadManager.this.f118203e.get()) {
                    MmAudioUploadManager.this.f118202d = new CountDownLatch(1);
                    UploadTask take = MmAudioUploadManager.this.f118200b.take();
                    if (take == null) {
                        C45855f.m181666e("MmAudioUploadManager", "upload task is null");
                        MmAudioUploadManager.this.f118202d.countDown();
                    } else {
                        take.run();
                        MmAudioUploadManager.this.f118202d.await();
                    }
                } else {
                    return;
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PollTaskRunnable() {
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager$e */
    public static final class RunnableC46966e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmAudioUploadManager f118219a;

        /* renamed from: b */
        final /* synthetic */ C46974a f118220b;

        RunnableC46966e(MmAudioUploadManager mmAudioUploadManager, C46974a aVar) {
            this.f118219a = mmAudioUploadManager;
            this.f118220b = aVar;
        }

        public final void run() {
            C45855f.m181664c("MmAudioUploadManager", "[doUpload]!!! token: " + this.f118220b.mo164928a() + ",  index: " + this.f118220b.mo164937d());
            this.f118219a.f118200b.put(new UploadTask(this.f118219a, this.f118220b));
            if (this.f118219a.f118201c.compareAndSet(false, true)) {
                C45857i.m181676a(new PollTaskRunnable());
            }
        }
    }

    public MmAudioUploadManager() {
        HandlerThread b = m185942b("mm_task_enqueue");
        this.f118199a = b;
        b.start();
        this.f118208k = new Handler(b.getLooper());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$notifyUploadCompletedToServer$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager$g */
    public static final class C46968g extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ String f118222a;

        C46968g(String str) {
            this.f118222a = str;
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            C45855f.m181664c("MmAudioUploadManager", "[notifyUploadCompletedToServer] succeed");
            MmAudioMonitor.m186479b(MmAudioMonitor.f118586a, true, this.f118222a, null, null, 12, null);
            MmRecordManager.f117918g.mo164548a(this.f118222a, ObjectStatus.Recording);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str;
            C45855f.m181666e("MmAudioUploadManager", "[notifyUploadCompletedToServer] onError:" + aVar + ' ');
            MmAudioMonitor mmAudioMonitor = MmAudioMonitor.f118586a;
            String str2 = this.f118222a;
            Integer num = null;
            if (aVar != null) {
                str = aVar.mo165308c();
            } else {
                str = null;
            }
            if (aVar != null) {
                num = Integer.valueOf(aVar.mo165306a());
            }
            mmAudioMonitor.mo165450b(false, str2, str, num);
        }
    }

    /* renamed from: a */
    public final void mo164893a(IUploadStateChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f118206h.add(bVar);
    }

    /* renamed from: c */
    private final void m185943c(String str) {
        C45855f.m181664c("MmAudioUploadManager", "[notifyUploadCompletedToServer] start, " + this.f118211n + ", token: " + str);
        if (!this.f118211n) {
            this.f118211n = true;
            C47057a.m186244a(str, MmUpdateStatus.UPLOAD_COMPLETED, new C46968g(str));
        }
    }

    /* renamed from: a */
    public final void mo164894a(UploadTask dVar) {
        if (this.f118204f.get()) {
            C45855f.m181664c("MmAudioUploadManager", "[retry] stopped, because force to stopped");
            return;
        }
        C45855f.m181664c("MmAudioUploadManager", "retry start");
        if (m185944c()) {
            C45859k.m181686a(dVar, 1000);
        } else {
            C45859k.m181686a(dVar, 5000);
        }
    }

    /* renamed from: b */
    public final void mo164898b(IUploadStateChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f118206h.remove(bVar);
    }

    /* renamed from: a */
    public final void mo164895a(C46974a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "uploadRequest");
        this.f118208k.post(new RunnableC46966e(this, aVar));
    }

    /* renamed from: b */
    public final void mo164899b(C46974a aVar) {
        C45855f.m181664c("MmAudioUploadManager", "uploadTaskQueue size: " + this.f118200b.size() + ", isRecordingStopped:" + this.f118203e.get() + ' ');
        if (!this.f118200b.isEmpty() || !this.f118203e.get()) {
            C45855f.m181664c("MmAudioUploadManager", aVar.mo164928a() + ", index: " + aVar.mo164937d() + " part send succeed!");
            MmAudioFileHelper aVar2 = MmAudioFileHelper.f117976a;
            String e = aVar.mo164939e();
            Intrinsics.checkExpressionValueIsNotNull(e, "uploadRequest.aacPartFilePath");
            aVar2.mo164600a(e);
            if (this.f118203e.get()) {
                String a = aVar.mo164928a();
                Intrinsics.checkExpressionValueIsNotNull(a, "uploadRequest.object_token");
                Integer a2 = mo164891a(a, aVar.mo164937d());
                if (a2 != null) {
                    int intValue = a2.intValue();
                    Iterator<T> it = this.f118206h.iterator();
                    while (it.hasNext()) {
                        String a3 = aVar.mo164928a();
                        Intrinsics.checkExpressionValueIsNotNull(a3, "uploadRequest.object_token");
                        it.next().mo164575a(new MmAudioUploadCenter.MmAudioUploadData(a3, UploadState.SINGLE_PART_UPLOADED, Integer.valueOf(intValue)));
                    }
                    return;
                }
                return;
            }
            return;
        }
        C45855f.m181664c("MmAudioUploadManager", "last part send succeed! ");
        mo164900c(aVar);
    }

    /* renamed from: c */
    public final void mo164900c(C46974a aVar) {
        String str;
        File parentFile;
        this.f118199a.quit();
        MmAudioFileHelper aVar2 = MmAudioFileHelper.f117976a;
        File parentFile2 = new File(aVar.mo164939e()).getParentFile();
        if (parentFile2 == null || (parentFile = parentFile2.getParentFile()) == null || (str = parentFile.getAbsolutePath()) == null) {
            str = "";
        }
        aVar2.mo164600a(str);
        MmAudioUploadCenter aVar3 = MmAudioUploadCenter.f118224a;
        String a = aVar.mo164928a();
        Intrinsics.checkExpressionValueIsNotNull(a, "uploadRequest.object_token");
        aVar3.mo164913b(a);
        MmAppreciableRecordTracker.TrackFinishUploadTime.m186413a();
        MmRecordManager.Companion aVar4 = MmRecordManager.f117918g;
        String a2 = aVar.mo164928a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "uploadRequest.object_token");
        aVar4.mo164548a(a2, ObjectStatus.RealTimeCompleteUpload);
        String a3 = aVar.mo164928a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "uploadRequest.object_token");
        m185943c(a3);
        Iterator<T> it = this.f118206h.iterator();
        while (it.hasNext()) {
            String a4 = aVar.mo164928a();
            Intrinsics.checkExpressionValueIsNotNull(a4, "uploadRequest.object_token");
            it.next().mo164575a(new MmAudioUploadCenter.MmAudioUploadData(a4, UploadState.SINGLE_PART_UPLOADED, Integer.valueOf((int) 99.0f)));
        }
        Iterator<T> it2 = this.f118206h.iterator();
        while (it2.hasNext()) {
            String a5 = aVar.mo164928a();
            Intrinsics.checkExpressionValueIsNotNull(a5, "uploadRequest.object_token");
            it2.next().mo164575a(new MmAudioUploadCenter.MmAudioUploadData(a5, UploadState.UPLOAD_FINISHED, null, 4, null));
        }
        this.f118206h.clear();
    }

    /* renamed from: a */
    public final void mo164896a(String str) {
        if (System.currentTimeMillis() - this.f118209l > 120000) {
            this.f118209l = System.currentTimeMillis();
            Iterator<T> it = this.f118206h.iterator();
            while (it.hasNext()) {
                it.next().mo164575a(new MmAudioUploadCenter.MmAudioUploadData(str, UploadState.WEAK_NETWORK, null, 4, null));
            }
        }
    }

    /* renamed from: a */
    public final Integer mo164891a(String str, int i) {
        if (!this.f118203e.get()) {
            return null;
        }
        Pair<Integer, Integer> pair = this.f118210m;
        if (pair == null || pair.getFirst().intValue() != i) {
            int min = (int) Math.min(99.0f, (((float) 1) - (((float) MmAudioFileHelper.f117976a.mo164608e(str)) / ((float) MmAudioFileHelper.f117976a.mo164609f(str)))) * ((float) 100));
            this.f118210m = TuplesKt.to(Integer.valueOf(i), Integer.valueOf(min));
            C45855f.m181664c("MmAudioUploadManager", "token: " + str + ", progress: " + min);
            return Integer.valueOf(min);
        }
        Pair<Integer, Integer> pair2 = this.f118210m;
        if (pair2 != null) {
            return pair2.getSecond();
        }
        return null;
    }
}
