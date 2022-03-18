package com.ss.android.lark.mm.module.record.audiorecorder;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecorder;
import com.ss.android.lark.mm.module.record.audiorecorder.MmPhoneStateListener;
import com.ss.android.lark.mm.module.record.upload.MmAudioUploadCenter;
import com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager;
import com.ss.android.lark.mm.module.record.upload.model.C46974a;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.C47099f;
import com.ss.android.lark.mm.utils.MmDateUtil;
import com.tt.frontendapiinterface.ApiHandler;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import me.ele.lancet.base.annotations.Skip;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001EB\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010 \u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0011H\u0002J\u0014\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\"H\u0016J\b\u0010)\u001a\u00020\"H\u0016J\u0018\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020\u0011H\u0016J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\"H\u0016J\u0014\u00104\u001a\u00020\"2\n\u00105\u001a\u000606j\u0002`7H\u0016J\b\u00108\u001a\u00020\"H\u0016J\b\u00109\u001a\u00020\"H\u0016J\b\u0010:\u001a\u00020\"H\u0016J\b\u0010;\u001a\u00020\"H\u0016J\u0018\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020,2\u0006\u0010#\u001a\u00020\u0011H\u0016J\"\u0010>\u001a\u00020/2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020/H\u0016J\u0010\u0010A\u001a\u00020\"2\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0015H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecordService;", "Landroid/app/Service;", "Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder$IAudioRecordCallback;", "Lcom/ss/android/lark/mm/module/record/audiorecorder/MmPhoneStateListener$IPhoneStateListener;", "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$IUploadStateChangeListener;", "()V", "audioPartGenerator", "Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioPartGenerator;", "audioRecorder", "Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder;", "getAudioRecorder", "()Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder;", "audioRecorder$delegate", "Lkotlin/Lazy;", "audioUploadManager", "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager;", "lastUpdateNotificationTime", "", "notificationBuilder", "Landroid/app/Notification$Builder;", "objectToken", "", "phoneStateListener", "Lcom/ss/android/lark/mm/module/record/audiorecorder/MmPhoneStateListener;", "getPhoneStateListener", "()Lcom/ss/android/lark/mm/module/record/audiorecorder/MmPhoneStateListener;", "phoneStateListener$delegate", "recordManager", "Lcom/ss/android/lark/mm/module/record/MmRecordManager;", "wakeupReceiver", "Landroid/content/BroadcastReceiver;", "getNotificationBuilder", "action", "notifyNotification", "", "ptsInMs", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onEncoderOutBufferAvailable", "aacBytes", "", "onOutputVolumeData", "db", "", "onPhoneStateChange", "isCalling", "", "onRecordAlmostReachLimit", "onRecordError", ApiHandler.API_CALLBACK_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "onRecordPause", "onRecordResume", "onRecordStart", "onRecordStop", "onRecording", "buffer", "onStartCommand", "flags", "startId", "onUploadStateChange", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadCenter$MmAudioUploadData;", "startForeground", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmAudioRecordService extends Service implements MmAudioRecorder.IAudioRecordCallback, MmPhoneStateListener.IPhoneStateListener, MmAudioUploadManager.IUploadStateChangeListener {

    /* renamed from: c */
    public static final String f117953c;

    /* renamed from: d */
    public static final String f117954d;

    /* renamed from: e */
    public static final String f117955e;

    /* renamed from: f */
    public static final Companion f117956f = new Companion(null);

    /* renamed from: n */
    private static final String f117957n;

    /* renamed from: a */
    public MmRecordManager f117958a;

    /* renamed from: b */
    public MmAudioUploadManager f117959b;

    /* renamed from: g */
    private String f117960g = "";

    /* renamed from: h */
    private BroadcastReceiver f117961h;

    /* renamed from: i */
    private final Lazy f117962i = LazyKt.lazy(C46858b.INSTANCE);

    /* renamed from: j */
    private final Lazy f117963j = LazyKt.lazy(new C46862f(this));

    /* renamed from: k */
    private MmAudioPartGenerator f117964k;

    /* renamed from: l */
    private Notification.Builder f117965l;

    /* renamed from: m */
    private long f117966m;

    /* renamed from: f */
    private final MmAudioRecorder m185613f() {
        return (MmAudioRecorder) this.f117962i.getValue();
    }

    /* renamed from: g */
    private final MmPhoneStateListener m185614g() {
        return (MmPhoneStateListener) this.f117963j.getValue();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecordService$Companion;", "", "()V", "ACTION_PAUSE", "", "ACTION_RESUME", "ACTION_START", "MINIMUM_RECORDING_SEGMENT_DURATION", "", "NOTIFICATION_ID", "OBJECT_TOKEN_EXTRA", "OPEN_AND_DO_NOTHING", "TAG", "WAKE_UP_ACTION", "pause", "", "context", "Landroid/content/Context;", "resume", "start", "objectToken", "stop", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService$a$d */
        public static final class RunnableC46857d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f117971a;

            RunnableC46857d(Context context) {
                this.f117971a = context;
            }

            public final void run() {
                this.f117971a.stopService(new Intent(this.f117971a, MmAudioRecordService.class));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecordService$Companion$pause$1", "Lcom/ss/android/lark/mm/utils/MmIdleHandlerManager$Task;", "run", "", "timeOut", "", "taskTime", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService$a$a */
        public static final class C46854a extends C47099f.AbstractC47102b {

            /* renamed from: a */
            final /* synthetic */ Context f117967a;

            C46854a(Context context) {
                this.f117967a = context;
            }

            @Override // com.ss.android.lark.mm.utils.C47099f.AbstractC47102b
            /* renamed from: a */
            public void mo164591a(boolean z, long j) {
                Intent intent = new Intent(this.f117967a, MmAudioRecordService.class);
                intent.setAction(MmAudioRecordService.f117954d);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f117967a.startForegroundService(intent);
                } else {
                    this.f117967a.startService(intent);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecordService$Companion$resume$1", "Lcom/ss/android/lark/mm/utils/MmIdleHandlerManager$Task;", "run", "", "timeOut", "", "taskTime", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService$a$b */
        public static final class C46855b extends C47099f.AbstractC47102b {

            /* renamed from: a */
            final /* synthetic */ Context f117968a;

            C46855b(Context context) {
                this.f117968a = context;
            }

            @Override // com.ss.android.lark.mm.utils.C47099f.AbstractC47102b
            /* renamed from: a */
            public void mo164591a(boolean z, long j) {
                Intent intent = new Intent(this.f117968a, MmAudioRecordService.class);
                intent.setAction(MmAudioRecordService.f117955e);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f117968a.startForegroundService(intent);
                } else {
                    this.f117968a.startService(intent);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo164587a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C45855f.m181664c("MmAudioRecordService", "resume");
            C47099f.m186541a().mo165485a(new C46855b(context));
        }

        /* renamed from: b */
        public final void mo164589b(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C45855f.m181664c("MmAudioRecordService", "pause");
            C47099f.m186541a().mo165485a(new C46854a(context));
        }

        /* renamed from: c */
        public final void mo164590c(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C45855f.m181664c("MmAudioRecordService", "stop");
            C45859k.m181686a(new RunnableC46857d(context), (long) ParticipantRepo.f117150c);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecordService$Companion$start$1", "Lcom/ss/android/lark/mm/utils/MmIdleHandlerManager$Task;", "run", "", "timeOut", "", "taskTime", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService$a$c */
        public static final class C46856c extends C47099f.AbstractC47102b {

            /* renamed from: a */
            final /* synthetic */ Context f117969a;

            /* renamed from: b */
            final /* synthetic */ String f117970b;

            C46856c(Context context, String str) {
                this.f117969a = context;
                this.f117970b = str;
            }

            @Override // com.ss.android.lark.mm.utils.C47099f.AbstractC47102b
            /* renamed from: a */
            public void mo164591a(boolean z, long j) {
                Intent intent = new Intent(this.f117969a, MmAudioRecordService.class);
                intent.putExtra("object_token_extra", this.f117970b);
                intent.setAction(MmAudioRecordService.f117953c);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f117969a.startForegroundService(intent);
                } else {
                    this.f117969a.startService(intent);
                }
            }
        }

        /* renamed from: a */
        public final void mo164588a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "objectToken");
            C45855f.m181664c("MmAudioRecordService", "start " + str);
            C47099f.m186541a().mo165485a(new C46856c(context, str));
        }
    }

    @Override // com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecorder.IAudioRecordCallback
    /* renamed from: a */
    public void mo164578a(byte[] bArr, long j) {
        Intrinsics.checkParameterIsNotNull(bArr, "buffer");
        C45859k.m181685a(new RunnableC46860d(this, j));
        MmRecordManager mmRecordManager = this.f117958a;
        if (mmRecordManager != null) {
            mmRecordManager.mo164517a(j);
        }
        MmAudioPartGenerator bVar = this.f117964k;
        if (bVar != null) {
            bVar.mo164618a(bArr, j);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecorder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService$b */
    static final class C46858b extends Lambda implements Function0<MmAudioRecorder> {
        public static final C46858b INSTANCE = new C46858b();

        C46858b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmAudioRecorder invoke() {
            return new MmAudioRecorder();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService$d */
    static final class RunnableC46860d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmAudioRecordService f117973a;

        /* renamed from: b */
        final /* synthetic */ long f117974b;

        RunnableC46860d(MmAudioRecordService mmAudioRecordService, long j) {
            this.f117973a = mmAudioRecordService;
            this.f117974b = j;
        }

        public final void run() {
            this.f117973a.mo164574a(this.f117974b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService$c */
    static final class RunnableC46859c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmAudioRecordService f117972a;

        RunnableC46859c(MmAudioRecordService mmAudioRecordService) {
            this.f117972a = mmAudioRecordService;
        }

        public final void run() {
            MmRecordManager mmRecordManager = this.f117972a.f117958a;
            if (mmRecordManager != null) {
                mmRecordManager.mo164520a(MmRecordManager.Action.ACTION_INTERRUPTED_BY_PHONE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/record/audiorecorder/MmPhoneStateListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService$f */
    static final class C46862f extends Lambda implements Function0<MmPhoneStateListener> {
        final /* synthetic */ MmAudioRecordService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46862f(MmAudioRecordService mmAudioRecordService) {
            super(0);
            this.this$0 = mmAudioRecordService;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmPhoneStateListener invoke() {
            return new MmPhoneStateListener(this.this$0);
        }
    }

    @Override // com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecorder.IAudioRecordCallback
    /* renamed from: e */
    public void mo164582e() {
        C45855f.m181664c("MmAudioRecordService", "onRecordAlmostReachLimit");
        MmRecordManager mmRecordManager = this.f117958a;
        if (mmRecordManager != null) {
            mmRecordManager.mo164538t();
        }
    }

    @Override // com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecorder.IAudioRecordCallback
    /* renamed from: b */
    public void mo164579b() {
        C45855f.m181664c("MmAudioRecordService", "onRecordResume");
        MmRecordManager mmRecordManager = this.f117958a;
        if (mmRecordManager != null) {
            mmRecordManager.mo164520a(MmRecordManager.Action.ACTION_RESUME);
        }
    }

    @Override // com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecorder.IAudioRecordCallback
    /* renamed from: c */
    public void mo164580c() {
        C45855f.m181664c("MmAudioRecordService", "onRecordPause");
        MmRecordManager mmRecordManager = this.f117958a;
        if (mmRecordManager != null) {
            mmRecordManager.mo164520a(MmRecordManager.Action.ACTION_PAUSED);
        }
    }

    @Override // com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecorder.IAudioRecordCallback
    /* renamed from: d */
    public void mo164581d() {
        C45855f.m181664c("MmAudioRecordService", "onRecordStop");
        MmAudioPartGenerator bVar = this.f117964k;
        if (bVar != null) {
            bVar.mo164619b();
        }
        MmRecordManager mmRecordManager = this.f117958a;
        if (mmRecordManager != null) {
            mmRecordManager.mo164539u();
        }
        C45852d.m181651a().mo161152b(this.f117960g);
    }

    public void onCreate() {
        super.onCreate();
        MmAudioRecordService$onCreate$1 mmAudioRecordService$onCreate$1 = new MmAudioRecordService$onCreate$1(this);
        this.f117961h = mmAudioRecordService$onCreate$1;
        m185610a(this, mmAudioRecordService$onCreate$1, new IntentFilter(f117957n));
    }

    public void onDestroy() {
        super.onDestroy();
        C45855f.m181664c("MmAudioRecordService", "onDestroy");
        MmAudioUploadManager mmAudioUploadManager = this.f117959b;
        if (mmAudioUploadManager != null) {
            mmAudioUploadManager.mo164898b(this);
        }
        m185613f().mo164635d();
        m185614g().mo164639b();
        BroadcastReceiver broadcastReceiver = this.f117961h;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        stopForeground(true);
    }

    @Override // com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecorder.IAudioRecordCallback
    /* renamed from: a */
    public void mo164572a() {
        C45855f.m181664c("MmAudioRecordService", "onRecordStart");
        MmRecordManager mmRecordManager = this.f117958a;
        if (mmRecordManager != null) {
            mmRecordManager.mo164520a(MmRecordManager.Action.ACTION_STAT_RECORDING);
        }
    }

    static {
        String str;
        String str2;
        String str3;
        String str4 = null;
        StringBuilder sb = new StringBuilder();
        String canonicalName = MmAudioRecordService.class.getCanonicalName();
        if (canonicalName == null) {
            str = null;
        } else if (canonicalName != null) {
            str = canonicalName.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.String).toLowerCase()");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        sb.append(str);
        sb.append(".Start");
        f117953c = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        String canonicalName2 = MmAudioRecordService.class.getCanonicalName();
        if (canonicalName2 == null) {
            str2 = null;
        } else if (canonicalName2 != null) {
            str2 = canonicalName2.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).toLowerCase()");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        sb2.append(str2);
        sb2.append(".PAUSE");
        f117954d = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        String canonicalName3 = MmAudioRecordService.class.getCanonicalName();
        if (canonicalName3 == null) {
            str3 = null;
        } else if (canonicalName3 != null) {
            str3 = canonicalName3.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(str3, "(this as java.lang.String).toLowerCase()");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        sb3.append(str3);
        sb3.append(".RESUME");
        f117955e = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        String canonicalName4 = MmAudioRecordService.class.getCanonicalName();
        if (canonicalName4 != null) {
            if (canonicalName4 != null) {
                str4 = canonicalName4.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(str4, "(this as java.lang.String).toLowerCase()");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        sb4.append(str4);
        sb4.append(".WakeUpAction");
        f117957n = sb4.toString();
    }

    @Override // com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecorder.IAudioRecordCallback
    /* renamed from: a */
    public void mo164573a(int i) {
        MmRecordManager mmRecordManager = this.f117958a;
        if (mmRecordManager != null) {
            mmRecordManager.mo164516a(i);
        }
    }

    /* renamed from: a */
    private final void m185611a(String str) {
        Notification notification;
        Notification.Builder b = m185612b(str);
        if (b != null) {
            notification = b.build();
        } else {
            notification = null;
        }
        startForeground(1, notification);
    }

    /* renamed from: b */
    private final Notification.Builder m185612b(String str) {
        String str2;
        Notification.Builder builder;
        if (Intrinsics.areEqual(str, f117953c) || Intrinsics.areEqual(str, f117955e)) {
            str2 = getBaseContext().getString(R.string.MMWeb_G_Recording);
            Intrinsics.checkExpressionValueIsNotNull(str2, "baseContext.getString(R.string.MMWeb_G_Recording)");
        } else if (Intrinsics.areEqual(str, f117954d)) {
            str2 = getBaseContext().getString(R.string.MMWeb_G_RecordingPaused);
            Intrinsics.checkExpressionValueIsNotNull(str2, "baseContext.getString(R.….MMWeb_G_RecordingPaused)");
        } else {
            str2 = "";
        }
        if (this.f117965l == null) {
            Intent intent = new Intent();
            intent.setAction(f117957n);
            PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, intent, 134217728);
            if (Build.VERSION.SDK_INT >= 26) {
                IMmDepend a = C45899c.m181859a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
                Intrinsics.checkExpressionValueIsNotNull(hostDepend, "MmDepend.impl().hostDepend");
                builder = new Notification.Builder(getApplication(), hostDepend.mo144645m()).setShowWhen(false).setPriority(0).setContentIntent(broadcast).setSmallIcon(R.drawable.ic_notify);
            } else {
                builder = new Notification.Builder(getApplication()).setPriority(0).setShowWhen(false).setContentIntent(broadcast).setSmallIcon(R.drawable.ic_notify);
            }
            this.f117965l = builder;
        }
        Notification.Builder builder2 = this.f117965l;
        if (builder2 != null) {
            builder2.setContentTitle(str2);
        }
        return this.f117965l;
    }

    /* renamed from: a */
    public final void mo164574a(long j) {
        Notification notification;
        Notification.Builder contentText;
        Notification.Builder showWhen;
        if (System.currentTimeMillis() - this.f117966m > 1000) {
            Notification.Builder b = m185612b(f117953c);
            NotificationManager notificationManager = null;
            if (b == null || (contentText = b.setContentText(MmDateUtil.m186539b(j))) == null || (showWhen = contentText.setShowWhen(false)) == null) {
                notification = null;
            } else {
                notification = showWhen.build();
            }
            Object systemService = getBaseContext().getSystemService("notification");
            if (systemService instanceof NotificationManager) {
                notificationManager = systemService;
            }
            NotificationManager notificationManager2 = notificationManager;
            if (notificationManager2 != null) {
                notificationManager2.notify(1, notification);
            }
            this.f117966m = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager.IUploadStateChangeListener
    /* renamed from: a */
    public void mo164575a(MmAudioUploadCenter.MmAudioUploadData aVar) {
        MmRecordManager mmRecordManager;
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C45855f.m181664c("MmAudioRecordService", "[subscribeUploadStates] " + aVar);
        if (Intrinsics.areEqual(aVar.mo164914a(), this.f117960g)) {
            int i = C46870c.f118000a[aVar.mo164915b().ordinal()];
            if (i == 1) {
                Companion aVar2 = f117956f;
                Context a = C45851c.m181646a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
                aVar2.mo164590c(a);
            } else if (i == 2) {
                Companion aVar3 = f117956f;
                Context a2 = C45851c.m181646a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "MmContext.getContext()");
                aVar3.mo164590c(a2);
            } else if (i == 3 && (mmRecordManager = this.f117958a) != null) {
                mmRecordManager.mo164520a(MmRecordManager.Action.ACTION_WEAK_NETWORK);
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecorder.IAudioRecordCallback
    /* renamed from: a */
    public void mo164576a(Exception exc) {
        Intrinsics.checkParameterIsNotNull(exc, ApiHandler.API_CALLBACK_EXCEPTION);
        C45855f.m181666e("MmAudioRecordService", "onRecordError: " + exc);
    }

    @Override // com.ss.android.lark.mm.module.record.audiorecorder.MmPhoneStateListener.IPhoneStateListener
    /* renamed from: a */
    public void mo164577a(boolean z) {
        if (z) {
            m185613f().mo164634c();
            C45859k.m181686a(new RunnableC46859c(this), 200);
            return;
        }
        MmRecordManager mmRecordManager = this.f117958a;
        if (mmRecordManager != null) {
            mmRecordManager.mo164520a(MmRecordManager.Action.ACTION_PHONE_END);
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m185610a(MmAudioRecordService mmAudioRecordService, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return mmAudioRecordService.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            stopSelf();
            return 2;
        }
        String action = intent.getAction();
        if (StringsKt.isBlank(this.f117960g)) {
            String stringExtra = intent.getStringExtra("object_token_extra");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f117960g = stringExtra;
        }
        if (StringsKt.isBlank(this.f117960g)) {
            stopSelf();
            return 2;
        }
        m185613f().mo164631a(this);
        this.f117958a = C45852d.m181651a().mo161150a(this.f117960g);
        MmAudioUploadManager a = MmAudioUploadCenter.f118224a.mo164911a(this.f117960g);
        this.f117959b = a;
        if (a != null) {
            a.mo164893a(this);
        }
        if (this.f117964k == null) {
            MmAudioPartGenerator bVar = new MmAudioPartGenerator(this, this.f117960g);
            bVar.mo164617a(new C46861e(bVar, this));
            this.f117964k = bVar;
        }
        if (Intrinsics.areEqual(action, f117953c)) {
            m185613f().mo164633b();
        } else if (Intrinsics.areEqual(action, f117954d)) {
            m185613f().mo164634c();
        } else if (Intrinsics.areEqual(action, f117955e)) {
            m185613f().mo164633b();
        }
        if (action == null) {
            action = "";
        }
        m185611a(action);
        m185614g().mo164638a(this);
        m185614g().mo164637a();
        return 1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"<anonymous>", "", "startMs", "", "index", "", "file", "Ljava/io/File;", "duration", "isStopped", "", "invoke", "com/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecordService$onStartCommand$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService$e */
    static final class C46861e extends Lambda implements Function5<String, Integer, File, Integer, Boolean, Unit> {
        final /* synthetic */ MmAudioPartGenerator $this_apply;
        final /* synthetic */ MmAudioRecordService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46861e(MmAudioPartGenerator bVar, MmAudioRecordService mmAudioRecordService) {
            super(5);
            this.$this_apply = bVar;
            this.this$0 = mmAudioRecordService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function5
        public /* synthetic */ Unit invoke(String str, Integer num, File file, Integer num2, Boolean bool) {
            invoke(str, num.intValue(), file, num2.intValue(), bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String str, int i, File file, int i2, boolean z) {
            MmAudioUploadManager mmAudioUploadManager;
            Intrinsics.checkParameterIsNotNull(str, "startMs");
            Intrinsics.checkParameterIsNotNull(file, "file");
            MmRecordManager mmRecordManager = this.this$0.f117958a;
            if (mmRecordManager != null) {
                C45855f.m181664c("MmAudioRecordService", "[onPartFileGenerated] duration: " + i2 + ", isStopped:" + z);
                if (i2 < 500) {
                    MmAudioFileHelper aVar = MmAudioFileHelper.f117976a;
                    String absolutePath = file.getAbsolutePath();
                    Intrinsics.checkExpressionValueIsNotNull(absolutePath, "file.absolutePath");
                    aVar.mo164600a(absolutePath);
                } else {
                    MmAudioUploadManager mmAudioUploadManager2 = this.this$0.f117959b;
                    if (mmAudioUploadManager2 != null) {
                        C46974a aVar2 = new C46974a();
                        aVar2.mo164933b(i);
                        aVar2.mo164930a(this.$this_apply.mo164623e());
                        aVar2.mo164936c(file.getAbsolutePath());
                        aVar2.mo164929a(i2);
                        aVar2.mo164934b(str);
                        aVar2.mo164938d(mmRecordManager.mo164533l().getLanguage());
                        mmAudioUploadManager2.mo164895a(aVar2);
                    }
                }
                if (z && (mmAudioUploadManager = this.this$0.f117959b) != null) {
                    mmAudioUploadManager.mo164892a();
                }
            }
        }
    }
}
