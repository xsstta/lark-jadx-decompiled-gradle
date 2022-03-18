package com.ss.android.lark.mm.module.record;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.NetworkUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.apm.MmApmAgent;
import com.ss.android.lark.mm.apm.MmApmDataInfo;
import com.ss.android.lark.mm.apm.p2285a.C45849a;
import com.ss.android.lark.mm.apm.power.MmPowerDataInfo;
import com.ss.android.lark.mm.apm.scene.MmApmMonitorScene;
import com.ss.android.lark.mm.base.MmActiveStateObservable;
import com.ss.android.lark.mm.depend.AbstractC45897a;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.external.MmSp;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.floatwindow.api.ForbiddenMini;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.list.base.MinutesListActivity;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.minifloatwindow.C46490a;
import com.ss.android.lark.mm.module.minifloatwindow.control.MiniControl;
import com.ss.android.lark.mm.module.minifloatwindow.control.MiniViewControl;
import com.ss.android.lark.mm.module.minifloatwindow.control.MiniViewControlAdapter;
import com.ss.android.lark.mm.module.minifloatwindow.floating.MiniType;
import com.ss.android.lark.mm.module.record.audiorecorder.MmAudioFileHelper;
import com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService;
import com.ss.android.lark.mm.module.record.audiorecorder.MmPhoneStateListener;
import com.ss.android.lark.mm.module.record.detail.MmRecordDetailActivity;
import com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleControl;
import com.ss.android.lark.mm.module.record.detail.tips.MmRecordTipsControl;
import com.ss.android.lark.mm.module.record.detail.titlebar.MmRecordTitleBarControl;
import com.ss.android.lark.mm.module.record.detail.toolbar.MmRecordToolbarControl;
import com.ss.android.lark.mm.module.record.model.Language;
import com.ss.android.lark.mm.module.record.model.MmRecordingLangSp;
import com.ss.android.lark.mm.module.record.model.MmUpdateStatus;
import com.ss.android.lark.mm.module.record.model.RecordRepo;
import com.ss.android.lark.mm.module.share.model.PermissionStatus;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.net.task.MmBizTask;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableRecordTracker;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.monitor.MmMonitorUtils;
import com.ss.android.lark.mm.statistics.monitor.recording.MmAudioMonitor;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import io.reactivex.p3457e.C68294a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ]2\u00020\u0001:\u0003\\]^B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020/H\u0002J\u0006\u00100\u001a\u00020/J\u0012\u00101\u001a\u00020+2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u0004\u0018\u00010\u000fJ\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000208H\u0016J\r\u00109\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010:J\u0006\u0010;\u001a\u00020<J\b\u0010=\u001a\u00020>H\u0016J\n\u0010?\u001a\u0004\u0018\u00010&H\u0002J\u0016\u0010@\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010A\u001a\u00020<J\u0018\u0010B\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010A\u001a\u00020<H\u0002J\u0006\u0010C\u001a\u00020/J\u0017\u0010D\u001a\u00020/2\b\u0010E\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0002\u0010FJ\b\u0010G\u001a\u00020+H\u0002J\b\u0010H\u001a\u00020+H\u0002J\u0006\u0010I\u001a\u00020+J\u0006\u0010J\u001a\u00020+J\u000e\u0010K\u001a\u00020+2\u0006\u0010L\u001a\u00020\u001bJ\u0006\u0010M\u001a\u00020+J\u0006\u0010N\u001a\u00020+J\u0006\u0010O\u001a\u00020+J\b\u0010P\u001a\u00020+H\u0002J\b\u0010Q\u001a\u00020+H\u0002J\u0006\u0010R\u001a\u00020+J\u000e\u0010S\u001a\u00020+2\u0006\u0010T\u001a\u00020/J\u000e\u0010U\u001a\u00020+2\u0006\u0010V\u001a\u00020WJ\u000e\u0010X\u001a\u00020+2\u0006\u0010Y\u001a\u00020\u001eJ\u000e\u0010Z\u001a\u00020+2\u0006\u0010[\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R#\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00190\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R#\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e0\u00190\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R#\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!0\u00190\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R#\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00190\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030)0(X\u0004¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/ss/android/lark/mm/module/record/MmRecordManager;", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "()V", "apmListener", "Lcom/ss/android/lark/mm/apm/MmApmAgent$IMmApmDataListener;", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getBaseInfo", "()Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "setBaseInfo", "(Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;)V", "bizTask", "Lcom/ss/android/lark/mm/net/task/MmBizTask;", "", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "currentDisplayMode", "Lcom/ss/android/lark/mm/module/record/DisplayMode;", "displayModeSub", "Lio/reactivex/subjects/BehaviorSubject;", "getDisplayModeSub", "()Lio/reactivex/subjects/BehaviorSubject;", "hitPointContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "recordVolumeSub", "Lkotlin/Pair;", "", "", "getRecordVolumeSub", "recordingDurationSub", "", "getRecordingDurationSub", "recordingStateSub", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "getRecordingStateSub", "topicSub", "getTopicSub", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "viewControls", "", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "changeAudioStatusServer", "", UpdateKey.STATUS, "Lcom/ss/android/lark/mm/module/record/model/MmUpdateStatus;", "checkAllowShowDetail", "", "checkAllowShowFloatWindow", "generateHitPointContext", "getCategoryJsonObject", "Lorg/json/JSONObject;", "getControlRegister", "getMContext", "Landroid/content/Context;", "getMmTimeExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "getRecordingDuration", "()Ljava/lang/Long;", "getRecordingLang", "Lcom/ss/android/lark/mm/module/record/model/Language;", "getRootView", "Landroid/view/View;", "getViewControlRegister", "initBaseInfo", "recordingLan", "initControls", "isFloatWindowMode", "isRecordingFinish", "objectStatus", "(Ljava/lang/Integer;)Z", "jumpToList", "loadStatus", "onActivityStop", "onDestroy", "onOutputVolumeData", "volume", "onRecordAlmostReachLimit", "onStopRecording", "pollStatus", "startMonitorPerformance", "stopPerfMonitor", "trySwitchToDetailActivity", "trySwitchToFloatWindow", "requestPermission", "updateRecordState", "action", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$Action;", "updateRecordingDuration", "ptsInMs", "updateTopic", "title", "Action", "Companion", "RecordState", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmRecordManager implements IMmViewControlContext {

    /* renamed from: e */
    public static final AtomicBoolean f117916e = new AtomicBoolean(false);

    /* renamed from: f */
    public static String f117917f;

    /* renamed from: g */
    public static final Companion f117918g = new Companion(null);

    /* renamed from: q */
    private static Disposable f117919q;

    /* renamed from: a */
    public final List<MmBaseViewControl<?, ?>> f117920a = new ArrayList();

    /* renamed from: b */
    public DisplayMode f117921b = DisplayMode.ACTIVITY;

    /* renamed from: c */
    public C47084f f117922c;

    /* renamed from: d */
    public final MmApmAgent.IMmApmDataListener f117923d;

    /* renamed from: h */
    private MmBaseInfo f117924h;

    /* renamed from: i */
    private MmControlRegister f117925i;

    /* renamed from: j */
    private MmViewControlRegister f117926j;

    /* renamed from: k */
    private final C68294a<Pair<String, RecordState>> f117927k;

    /* renamed from: l */
    private final C68294a<Pair<String, Integer>> f117928l;

    /* renamed from: m */
    private final C68294a<Pair<String, Long>> f117929m;

    /* renamed from: n */
    private final C68294a<Pair<String, String>> f117930n;

    /* renamed from: o */
    private final C68294a<DisplayMode> f117931o;

    /* renamed from: p */
    private MmBizTask<Object> f117932p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "RECORDING", "PAUSED", "DISABLED_BY_PHONE", "STOPPED", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum RecordState {
        UNKNOWN(-1),
        RECORDING(0),
        PAUSED(1),
        DISABLED_BY_PHONE(2),
        STOPPED(3);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "mValue", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.MmRecordManager$RecordState$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final RecordState mo164545a(int i) {
                if (i == 0) {
                    return RecordState.RECORDING;
                }
                if (i == 1) {
                    return RecordState.PAUSED;
                }
                if (i == 2) {
                    return RecordState.DISABLED_BY_PHONE;
                }
                if (i != 3) {
                    return RecordState.UNKNOWN;
                }
                return RecordState.STOPPED;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private RecordState(int i) {
            this.value = i;
        }
    }

    @JvmStatic
    /* renamed from: y */
    public static final boolean m185552y() {
        return f117918g.mo164549a();
    }

    @JvmStatic
    /* renamed from: z */
    public static final String m185553z() {
        return f117918g.mo164550b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/module/record/MmRecordManager$Action;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ACTION_STAT_RECORDING", "ACTION_PAUSED", "ACTION_RESUME", "ACTION_INTERRUPTED_BY_PHONE", "ACTION_PHONE_END", "ACTION_STOPPED", "ACTION_WEAK_NETWORK", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Action {
        ACTION_STAT_RECORDING(0),
        ACTION_PAUSED(1),
        ACTION_RESUME(2),
        ACTION_INTERRUPTED_BY_PHONE(3),
        ACTION_PHONE_END(4),
        ACTION_STOPPED(5),
        ACTION_WEAK_NETWORK(6);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00110\u0017H\u0002J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0004J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0007J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u0004J\b\u0010\u000b\u001a\u00020\u0015H\u0007J\u000e\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0004J<\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110%J\u0016\u0010'\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/mm/module/record/MmRecordManager$Companion;", "", "()V", "AUDIO_RECORD_LOCAL_STATE_PREFIX", "", "Audio_RECORD_STATE_PREFIX", "INTERVAL_POLL_STATUS", "", "INTERVAL_POLL_STATUS_DELAY", "STORAGE_THRESHOLD", "TAG", "isRecording", "Ljava/util/concurrent/atomic/AtomicBoolean;", "recordingToken", "timerPollStatus", "Lio/reactivex/disposables/Disposable;", "checkHasEnoughSpace", "", "context", "Landroid/content/Context;", "isForced", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isCanRecord", "checkIsLocalUploaded", "objectToken", "findLocalRecordingObjectToken", "getRecordState", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "newRecord", "activity", "Landroidx/fragment/app/FragmentActivity;", "listRepoId", "onCreated", "Lkotlin/Function0;", "onError", "putLocalState", UpdateKey.STATUS, "Lcom/ss/android/lark/mm/module/detail/baseinfo/ObjectStatus;", "setRecordStopped", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.MmRecordManager$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: b */
        public final String mo164550b() {
            return MmRecordManager.f117917f;
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo164549a() {
            return MmRecordManager.f117916e.get();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.MmRecordManager$a$a */
        public static final class RunnableC46832a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ boolean f117933a;

            /* renamed from: b */
            final /* synthetic */ Function1 f117934b;

            /* renamed from: c */
            final /* synthetic */ Context f117935c;

            RunnableC46832a(boolean z, Function1 function1, Context context) {
                this.f117933a = z;
                this.f117934b = function1;
                this.f117935c = context;
            }

            public final void run() {
                if (this.f117933a) {
                    C45859k.m181685a(new Runnable(this) {
                        /* class com.ss.android.lark.mm.module.record.MmRecordManager.Companion.RunnableC46832a.RunnableC468331 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC46832a f117936a;

                        {
                            this.f117936a = r1;
                        }

                        public final void run() {
                            this.f117936a.f117934b.invoke(true);
                        }
                    });
                } else if (C45849a.m181625j() >= 125829120) {
                    C45859k.m181685a(new Runnable(this) {
                        /* class com.ss.android.lark.mm.module.record.MmRecordManager.Companion.RunnableC46832a.RunnableC468342 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC46832a f117937a;

                        {
                            this.f117937a = r1;
                        }

                        public final void run() {
                            this.f117937a.f117934b.invoke(true);
                        }
                    });
                } else {
                    C45859k.m181685a(new Runnable(this) {
                        /* class com.ss.android.lark.mm.module.record.MmRecordManager.Companion.RunnableC46832a.RunnableC468353 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC46832a f117938a;

                        {
                            this.f117938a = r1;
                        }

                        public final void run() {
                            if (C47098d.m186535b(this.f117938a.f117935c)) {
                                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f117938a.f117935c).titleBold(true)).title(R.string.MMWeb_M_Record_InsufficientStorage_PopupTitle)).message(R.string.MMWeb_M_Record_InsufficientStorage_PopupText)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_Cancel, new DialogInterface.OnClickListener(this) {
                                    /* class com.ss.android.lark.mm.module.record.MmRecordManager.Companion.RunnableC46832a.RunnableC468353.DialogInterface$OnClickListenerC468361 */

                                    /* renamed from: a */
                                    final /* synthetic */ RunnableC468353 f117939a;

                                    {
                                        this.f117939a = r1;
                                    }

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        this.f117939a.f117938a.f117934b.invoke(false);
                                    }
                                })).onDismissListener(new DialogInterface.OnDismissListener(this) {
                                    /* class com.ss.android.lark.mm.module.record.MmRecordManager.Companion.RunnableC46832a.RunnableC468353.DialogInterface$OnDismissListenerC468372 */

                                    /* renamed from: a */
                                    final /* synthetic */ RunnableC468353 f117940a;

                                    {
                                        this.f117940a = r1;
                                    }

                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        this.f117940a.f117938a.f117934b.invoke(false);
                                    }
                                })).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.MMWeb_M_Record_InsufficientStorageRecordAnyway_PopupButton).mo90710d(R.color.primary_pri_500).mo90703a(new DialogInterface.OnClickListener(this) {
                                    /* class com.ss.android.lark.mm.module.record.MmRecordManager.Companion.RunnableC46832a.RunnableC468353.DialogInterface$OnClickListenerC468383 */

                                    /* renamed from: a */
                                    final /* synthetic */ RunnableC468353 f117941a;

                                    {
                                        this.f117941a = r1;
                                    }

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        this.f117941a.f117938a.f117934b.invoke(true);
                                    }
                                }))).show();
                            }
                        }
                    });
                }
            }
        }

        /* renamed from: c */
        public final void mo164552c() {
            boolean z;
            C45855f.m181664c("MmRecordManager", "[setRecordStopped]");
            List<String> b = MmAudioFileHelper.f117976a.mo164604b();
            if (b != null) {
                C45855f.m181664c("MmRecordManager", "[setRecordStopped], size: " + b.size());
                ArrayList arrayList = new ArrayList();
                for (T t : b) {
                    if (MmRecordManager.f117918g.mo164546a(t) != RecordState.STOPPED) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(t);
                    }
                }
                ArrayList<String> arrayList2 = arrayList;
                if (!arrayList2.isEmpty()) {
                    for (String str : arrayList2) {
                        MmSp.m181668a("audio_record_state_prefix" + str, RecordState.STOPPED.getValue());
                        C47057a.m186244a(str, MmUpdateStatus.RECORD_FINISH, new C46844c(str));
                    }
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/record/MmRecordManager$Companion$setRecordStopped$1$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.MmRecordManager$a$c */
        public static final class C46844c extends AbstractC47070c<String> {

            /* renamed from: a */
            final /* synthetic */ String f117942a;

            C46844c(String str) {
                this.f117942a = str;
            }

            /* renamed from: a */
            public void mo161289a(String str) {
                C45855f.m181664c("MmRecordManager", "[setRecordStopped] succeed");
                MmAudioMonitor.m186477a(MmAudioMonitor.f118586a, true, this.f117942a, (String) null, (Integer) null, 12, (Object) null);
            }

            @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
            /* renamed from: a */
            public void mo161288a(C47068a aVar) {
                String str;
                MmAudioMonitor mmAudioMonitor = MmAudioMonitor.f118586a;
                String str2 = this.f117942a;
                Integer num = null;
                if (aVar != null) {
                    str = aVar.mo165308c();
                } else {
                    str = null;
                }
                if (aVar != null) {
                    num = Integer.valueOf(aVar.mo165306a());
                }
                mmAudioMonitor.mo165447a(false, str2, str, num);
                C45855f.m181666e("TAG", "[setRecordStopped] error: " + aVar);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isRecord", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.MmRecordManager$a$b */
        public static final class C46839b extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ FragmentActivity $activity;
            final /* synthetic */ boolean $isForced;
            final /* synthetic */ String $listRepoId;
            final /* synthetic */ Function0 $onCreated;
            final /* synthetic */ Function0 $onError;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46839b(Function0 function0, FragmentActivity fragmentActivity, boolean z, String str, Function0 function02) {
                super(1);
                this.$onError = function0;
                this.$activity = fragmentActivity;
                this.$isForced = z;
                this.$listRepoId = str;
                this.$onCreated = function02;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (!z) {
                    this.$onError.invoke();
                    return;
                }
                final MmRecordLoadingDialog bVar = new MmRecordLoadingDialog();
                if (!NetworkUtils.m94915b(this.$activity)) {
                    C45858j.m181677a((int) R.string.MMWeb_G_NoInternetConnectionTryAgainLater);
                    MmAudioMonitor.f118586a.mo165448b("network is unavailable");
                    this.$onError.invoke();
                    AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.VideoConference, Scene.MinutesRecorder, Event.minutes_create_audio_record_error, ErrorType.Network, ErrorLevel.Exception, 0, null, null, "network is unavailable", false, null, null, null, 6144, null));
                    return;
                }
                if (C47098d.m186535b(this.$activity)) {
                    FragmentManager supportFragmentManager = this.$activity.getSupportFragmentManager();
                    Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
                    if (!supportFragmentManager.isDestroyed()) {
                        bVar.mo5511a(this.$activity.getSupportFragmentManager(), "");
                    }
                }
                IMmDepend a = C45899c.m181859a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                IMmDepend.AbstractC45896v videoChatDependency = a.getVideoChatDependency();
                if (videoChatDependency != null) {
                    if (videoChatDependency.mo144589a()) {
                        bVar.mo5513b();
                        C45858j.m181677a((int) R.string.MMWeb_G_CanNotRecordWatchingLive);
                        MmAudioMonitor.f118586a.mo165448b("Couldn't start recording because you're watching a livestream");
                        this.$onError.invoke();
                        return;
                    } else if (videoChatDependency.mo144590b()) {
                        bVar.mo5513b();
                        C45858j.m181677a((int) R.string.MMWeb_G_CanNotRecordInMeeting);
                        MmAudioMonitor.f118586a.mo165448b("Couldn't start recording because you're in a meeting");
                        this.$onError.invoke();
                        return;
                    }
                }
                if (MmPhoneStateListener.f118018a.mo164641a()) {
                    bVar.mo5513b();
                    C45858j.m181677a((int) R.string.MMWeb_G_CanNotRecordInCall);
                    MmAudioMonitor.f118586a.mo165448b("Couldn't start recording because you're in a call");
                    this.$onError.invoke();
                } else if (this.$isForced || !MmRecordManager.f117918g.mo164549a()) {
                    MmAppreciableRecordTracker.TrackDetailInitTime.f118539a.mo165397b();
                    if (z) {
                        new RecordRepo().mo164884a(this.$activity, this.$isForced, new Function2<MmBaseInfo, Language, Unit>(this) {
                            /* class com.ss.android.lark.mm.module.record.MmRecordManager.Companion.C46839b.C468401 */
                            final /* synthetic */ C46839b this$0;

                            {
                                this.this$0 = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(MmBaseInfo mmBaseInfo, Language language) {
                                invoke(mmBaseInfo, language);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(MmBaseInfo mmBaseInfo, Language language) {
                                Intrinsics.checkParameterIsNotNull(language, "recordingLan");
                                bVar.mo5513b();
                                if (mmBaseInfo == null) {
                                    DialogHelper.f117950a.mo164569a(this.this$0.$activity, new Function0<Unit>(this) {
                                        /* class com.ss.android.lark.mm.module.record.MmRecordManager.Companion.C46839b.C468401.C468411 */
                                        final /* synthetic */ C468401 this$0;

                                        {
                                            this.this$0 = r1;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final void invoke() {
                                            MmRecordManager.f117918g.mo164547a(this.this$0.this$0.$activity, this.this$0.this$0.$listRepoId, true, this.this$0.this$0.$onCreated, this.this$0.this$0.$onError);
                                        }
                                    }, new Function0<Unit>(this) {
                                        /* class com.ss.android.lark.mm.module.record.MmRecordManager.Companion.C46839b.C468401.C468422 */
                                        final /* synthetic */ C468401 this$0;

                                        {
                                            this.this$0 = r1;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final void invoke() {
                                            this.this$0.this$0.$onError.invoke();
                                        }
                                    });
                                    return;
                                }
                                this.this$0.$onCreated.invoke();
                                MmAudioMonitor mmAudioMonitor = MmAudioMonitor.f118586a;
                                String objectToken = mmBaseInfo.getObjectToken();
                                Intrinsics.checkExpressionValueIsNotNull(objectToken, "baseInfo.objectToken");
                                mmAudioMonitor.mo165443a(objectToken);
                                MmAppreciableRecordTracker.TrackDetailInitTime.f118539a.mo165399d();
                                MmRecordManager a = C45852d.m181651a().mo161150a(mmBaseInfo.getObjectToken());
                                a.mo164519a(mmBaseInfo, language);
                                a.mo164529h();
                                MmListControl b = MmListControl.f116817j.mo163013b(this.this$0.$listRepoId);
                                if (b != null) {
                                    b.mo162977a(mmBaseInfo);
                                }
                            }
                        }, new Function0<Unit>(this) {
                            /* class com.ss.android.lark.mm.module.record.MmRecordManager.Companion.C46839b.C468432 */
                            final /* synthetic */ C46839b this$0;

                            {
                                this.this$0 = r1;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final void invoke() {
                                this.this$0.$onError.invoke();
                                bVar.mo5513b();
                                MmAudioMonitor.f118586a.mo165448b("api request failed");
                            }
                        });
                        return;
                    }
                    bVar.mo5513b();
                    this.$onError.invoke();
                } else {
                    C45855f.m181664c("MmRecordManager", "[newRecord] isForced=false isRecord=true");
                    bVar.mo5513b();
                    MmAudioMonitor.f118586a.mo165448b("Couldn't start recording because you're already in recording");
                    this.$onError.invoke();
                }
            }
        }

        /* renamed from: a */
        public final RecordState mo164546a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "objectToken");
            MmSp hVar = MmSp.f115679a;
            return RecordState.Companion.mo164545a(hVar.mo161160b("audio_record_state_prefix" + str, -1));
        }

        /* renamed from: b */
        public final boolean mo164551b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "objectToken");
            RecordState.Companion aVar = RecordState.Companion;
            MmSp hVar = MmSp.f115679a;
            RecordState a = aVar.mo164545a(hVar.mo161160b("audio_record_state_prefix" + str, -1));
            if (a == RecordState.UNKNOWN || a == RecordState.STOPPED) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final boolean mo164553c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "objectToken");
            MmSp hVar = MmSp.f115679a;
            if (hVar.mo161160b("audio_record_local_state_prefix_" + str, -1) == ObjectStatus.RealTimeCompleteUpload.getValue()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo164548a(String str, ObjectStatus objectStatus) {
            Intrinsics.checkParameterIsNotNull(str, "objectToken");
            Intrinsics.checkParameterIsNotNull(objectStatus, UpdateKey.STATUS);
            MmSp.m181668a("audio_record_local_state_prefix_" + str, objectStatus.getValue());
        }

        /* renamed from: a */
        private final void m185587a(Context context, boolean z, Function1<? super Boolean, Unit> function1) {
            C45857i.m181676a(new RunnableC46832a(z, function1, context));
        }

        /* renamed from: a */
        public final void mo164547a(FragmentActivity fragmentActivity, String str, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(str, "listRepoId");
            Intrinsics.checkParameterIsNotNull(function0, "onCreated");
            Intrinsics.checkParameterIsNotNull(function02, "onError");
            m185587a(fragmentActivity, z, new C46839b(function02, fragmentActivity, z, str, function0));
        }

        /* renamed from: a */
        public static /* synthetic */ void m185588a(Companion aVar, FragmentActivity fragmentActivity, String str, boolean z, Function0 function0, Function0 function02, int i, Object obj) {
            boolean z2;
            if ((i & 4) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            aVar.mo164547a(fragmentActivity, str, z2, function0, function02);
        }
    }

    /* renamed from: a */
    public final MmBaseInfo mo164515a() {
        return this.f117924h;
    }

    /* renamed from: b */
    public final C68294a<Pair<String, RecordState>> mo164524b() {
        return this.f117927k;
    }

    /* renamed from: c */
    public final C68294a<Pair<String, Integer>> mo164525c() {
        return this.f117928l;
    }

    /* renamed from: d */
    public final C68294a<Pair<String, Long>> mo164526d() {
        return this.f117929m;
    }

    /* renamed from: f */
    public final C68294a<Pair<String, String>> mo164527f() {
        return this.f117930n;
    }

    /* renamed from: g */
    public final C68294a<DisplayMode> mo164528g() {
        return this.f117931o;
    }

    /* renamed from: a */
    public final void mo164522a(boolean z) {
        MiniControl dVar;
        MmViewControlRegister B;
        if (mo164531j()) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = false;
            MmControlRegister m = mo164534m();
            if (m != null && (dVar = (MiniControl) m.mo161912a(MiniControl.class)) != null && (B = m185547B()) != null) {
                MiniViewControl eVar = new MiniViewControl(this, new MiniViewControlAdapter(B, m, dVar));
                eVar.be_();
                synchronized (this.f117920a) {
                    this.f117920a.add(eVar);
                }
                eVar.mo163384a(MiniType.MINUTES_RECORDING, z, new C46849f(this, booleanRef, eVar), new C46850g(this, eVar));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo164523a(Integer num) {
        int value = ObjectStatus.RealTimeCompleteUpload.getValue();
        if ((num == null || num.intValue() != value) && !ObjectStatus.Companion.mo161607b(num)) {
            int value2 = ObjectStatus.Complete.getValue();
            if (num == null || num.intValue() != value2) {
                return num != null && num.intValue() == ObjectStatus.WaitASR.getValue();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.MmRecordManager$h */
    public static final class RunnableC46851h implements Runnable {

        /* renamed from: a */
        public static final RunnableC46851h f117949a = new RunnableC46851h();

        RunnableC46851h() {
        }

        public final void run() {
            C45858j.m181677a((int) R.string.MMWeb_G_RecordingStoppedWhenCalling);
        }
    }

    /* renamed from: C */
    private final void m185548C() {
        MmApmAgent.f115638a.mo161102a(this.f117923d);
    }

    /* renamed from: D */
    private final void m185549D() {
        MmApmAgent.f115638a.mo161104b(this.f117923d);
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: e */
    public C47084f mo161231e() {
        return IMmViewControlContext.C45904a.m181880a(this);
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: p */
    public C47096b mo161234p() {
        return new C47096b();
    }

    /* renamed from: u */
    public final void mo164539u() {
        mo164520a(Action.ACTION_STOPPED);
    }

    /* renamed from: B */
    private final MmViewControlRegister m185547B() {
        if (this.f117926j == null) {
            this.f117926j = new MmViewControlRegister();
        }
        return this.f117926j;
    }

    /* renamed from: k */
    public final boolean mo164532k() {
        if (this.f117921b == DisplayMode.FLOAT_WINDOW) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: n */
    public Context mo161232n() {
        Context a = C45851c.m181646a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
        return a;
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: o */
    public View mo161233o() {
        return new View(C45851c.m181646a());
    }

    /* renamed from: m */
    public final MmControlRegister mo164534m() {
        String str;
        if (this.f117925i == null) {
            MmBaseInfo mmBaseInfo = this.f117924h;
            if (mmBaseInfo == null || (str = mmBaseInfo.getObjectToken()) == null) {
                str = "";
            }
            MmControlRegister eVar = new MmControlRegister(str);
            this.f117925i = eVar;
            if (eVar != null) {
                eVar.mo161913a();
            }
        }
        return this.f117925i;
    }

    /* renamed from: t */
    public final void mo164538t() {
        MmRecordTipsControl dVar;
        MmControlRegister m = mo164534m();
        if (m != null && (dVar = (MmRecordTipsControl) m.mo161912a(MmRecordTipsControl.class)) != null) {
            dVar.mo164734a();
        }
    }

    /* renamed from: w */
    public final Long mo164541w() {
        Pair<String, Long> b = this.f117929m.mo237947b();
        if (b != null) {
            return b.getSecond();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.MmRecordManager$g */
    public static final class C46850g extends Lambda implements Function0<Unit> {
        final /* synthetic */ MiniViewControl $miniViewControl;
        final /* synthetic */ MmRecordManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46850g(MmRecordManager mmRecordManager, MiniViewControl eVar) {
            super(0);
            this.this$0 = mmRecordManager;
            this.$miniViewControl = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C45855f.m181664c("MmRecordManager", "[trySwitchToFloatWindow] record float window is forced to dismiss");
            this.$miniViewControl.mo163386b();
            synchronized (this.this$0.f117920a) {
                this.this$0.f117920a.remove(this.$miniViewControl);
            }
            MmAudioRecordService.Companion aVar = MmAudioRecordService.f117956f;
            Context a = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
            aVar.mo164590c(a);
        }
    }

    /* renamed from: A */
    private final boolean m185546A() {
        String objectToken;
        boolean z;
        MmBaseInfo mmBaseInfo = this.f117924h;
        if (mmBaseInfo == null || (objectToken = mmBaseInfo.getObjectToken()) == null) {
            return false;
        }
        RecordState a = f117918g.mo164546a(objectToken);
        if (a == RecordState.UNKNOWN || a == RecordState.STOPPED) {
            z = false;
        } else {
            z = true;
        }
        if (this.f117921b != DisplayMode.FLOAT_WINDOW || z) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo164530i() {
        if (mo164531j()) {
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            AbstractC45897a lifecycleDependency = a.getLifecycleDependency();
            Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
            Activity a2 = lifecycleDependency.mo144570a();
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl().lifecycl…ncy.topActivity ?: return");
                if (((ForbiddenMini) a2.getClass().getAnnotation(ForbiddenMini.class)) == null) {
                    mo164522a(true);
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean mo164531j() {
        String objectToken;
        MmBaseInfo mmBaseInfo;
        RecordState a;
        MmBaseInfo mmBaseInfo2 = this.f117924h;
        if (mmBaseInfo2 == null || (objectToken = mmBaseInfo2.getObjectToken()) == null || (((mmBaseInfo = this.f117924h) != null && !mmBaseInfo.isRecordingDevice()) || (a = f117918g.mo164546a(objectToken)) == RecordState.STOPPED || a == RecordState.UNKNOWN || this.f117921b == DisplayMode.FLOAT_WINDOW)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final Language mo164533l() {
        MmRecordToolbarControl dVar;
        Language c;
        MmControlRegister m = mo164534m();
        if (m == null || (dVar = (MmRecordToolbarControl) m.mo161912a(MmRecordToolbarControl.class)) == null || (c = dVar.mo164807c()) == null) {
            return new Language("chinese", "zh_cn");
        }
        return c;
    }

    /* renamed from: q */
    public final void mo164535q() {
        long j;
        Disposable disposable = f117919q;
        if (disposable != null) {
            disposable.dispose();
        }
        MmBaseInfo mmBaseInfo = this.f117924h;
        if (mmBaseInfo == null || !mmBaseInfo.isRecordingDevice()) {
            j = 10;
        } else {
            j = 0;
        }
        f117919q = Observable.interval(j, 30, TimeUnit.SECONDS).subscribeOn(C68279a.m265023b()).unsubscribeOn(AndroidSchedulers.mainThread()).subscribe(new C46848e(this));
    }

    /* renamed from: r */
    public final void mo164536r() {
        String objectToken;
        MmBaseInfo mmBaseInfo = this.f117924h;
        if (mmBaseInfo != null && (objectToken = mmBaseInfo.getObjectToken()) != null) {
            MmBizTask<Object> mmBizTask = this.f117932p;
            if (mmBizTask != null) {
                mmBizTask.mo165339a();
            }
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
            Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
            this.f117932p = C47057a.m186236a(domainDepend.mo144616a(), objectToken).mo165337a(new C46847d(this, objectToken));
        }
    }

    /* renamed from: s */
    public final void mo164537s() {
        MmBaseInfo mmBaseInfo = this.f117924h;
        if (mmBaseInfo == null || !mmBaseInfo.isOwner()) {
            MinutesListActivity.Companion aVar = MinutesListActivity.f116750b;
            Context a = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
            aVar.mo162920a(a, "", 17, "home");
            C45858j.m181677a((int) R.string.MMWeb_G_RecordingSavedShared);
            return;
        }
        MinutesListActivity.Companion aVar2 = MinutesListActivity.f116750b;
        Context a2 = C45851c.m181646a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmContext.getContext()");
        aVar2.mo162920a(a2, "", 17, "my");
        C45858j.m181677a((int) R.string.MMWeb_G_RecordingSaved);
    }

    public MmRecordManager() {
        C68294a<Pair<String, RecordState>> a = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a, "BehaviorSubject.create()");
        this.f117927k = a;
        C68294a<Pair<String, Integer>> a2 = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "BehaviorSubject.create()");
        this.f117928l = a2;
        C68294a<Pair<String, Long>> a3 = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "BehaviorSubject.create()");
        this.f117929m = a3;
        C68294a<Pair<String, String>> a4 = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "BehaviorSubject.create()");
        this.f117930n = a4;
        C68294a<DisplayMode> a5 = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a5, "BehaviorSubject.create()");
        this.f117931o = a5;
        this.f117923d = new C46845b(this);
    }

    /* renamed from: h */
    public final void mo164529h() {
        MmBaseInfo mmBaseInfo;
        String objectToken;
        synchronized (this.f117920a) {
            Iterator<MmBaseViewControl<?, ?>> it = this.f117920a.iterator();
            while (it.hasNext()) {
                MmBaseViewControl<?, ?> next = it.next();
                if (next instanceof MiniViewControl) {
                    next.mo161245h();
                    it.remove();
                }
            }
        }
        if (m185546A() && (mmBaseInfo = this.f117924h) != null && (objectToken = mmBaseInfo.getObjectToken()) != null) {
            MmRecordDetailActivity.Companion aVar = MmRecordDetailActivity.f118026b;
            Context a = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
            aVar.mo164653a(a, objectToken);
            DisplayMode displayMode = DisplayMode.ACTIVITY;
            this.f117921b = displayMode;
            this.f117931o.onNext(displayMode);
        }
    }

    /* renamed from: v */
    public final void mo164540v() {
        List<MmBaseControl> b;
        C45855f.m181664c("MmRecordManager", "onDestroy");
        m185549D();
        MmBizTask<Object> mmBizTask = this.f117932p;
        if (mmBizTask != null) {
            mmBizTask.mo165339a();
        }
        this.f117932p = null;
        f117916e.set(false);
        f117917f = null;
        synchronized (this.f117920a) {
            Iterator<T> it = this.f117920a.iterator();
            while (it.hasNext()) {
                it.next().mo161245h();
            }
            this.f117920a.clear();
            Unit unit = Unit.INSTANCE;
        }
        MmControlRegister eVar = this.f117925i;
        if (eVar != null) {
            eVar.mo161920d();
        }
        MmControlRegister eVar2 = this.f117925i;
        if (!(eVar2 == null || (b = eVar2.mo161917b()) == null)) {
            Iterator<T> it2 = b.iterator();
            while (it2.hasNext()) {
                it2.next().mo161235k();
            }
        }
        Disposable disposable = f117919q;
        if (disposable != null) {
            disposable.dispose();
        }
        f117919q = null;
    }

    /* renamed from: x */
    public final JSONObject mo164542x() {
        boolean z;
        if (this.f117921b == DisplayMode.FLOAT_WINDOW) {
            z = true;
        } else {
            z = false;
        }
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        AbstractC45897a lifecycleDependency = a.getLifecycleDependency();
        Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
        Activity a2 = lifecycleDependency.mo144570a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scene", MmApmMonitorScene.MinutesRecording.name());
        if (z && a2 != null) {
            jSONObject.put("sub_scene", a2.getClass().getName());
        }
        jSONObject.put("floating", z);
        return jSONObject;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/record/MmRecordManager$apmListener$1", "Lcom/ss/android/lark/mm/apm/MmApmAgent$IMmApmDataListener;", "onOutputApmData", "", "apmData", "Lcom/ss/android/lark/mm/apm/MmApmDataInfo;", "onOutputPowerData", "powerData", "Lcom/ss/android/lark/mm/apm/power/MmPowerDataInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.MmRecordManager$b */
    public static final class C46845b implements MmApmAgent.IMmApmDataListener {

        /* renamed from: a */
        final /* synthetic */ MmRecordManager f117943a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46845b(MmRecordManager mmRecordManager) {
            this.f117943a = mmRecordManager;
        }

        @Override // com.ss.android.lark.mm.apm.MmApmAgent.IMmApmDataListener
        /* renamed from: a */
        public void mo161111a(MmApmDataInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "apmData");
            MmMonitorUtils.m186469a(MmMonitorUtils.f118585a, this.f117943a.mo164542x(), bVar, (JSONObject) null, 4, (Object) null);
        }

        @Override // com.ss.android.lark.mm.apm.MmApmAgent.IMmApmDataListener
        /* renamed from: a */
        public void mo161112a(MmPowerDataInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "powerData");
            MmMonitorUtils.m186470a(MmMonitorUtils.f118585a, this.f117943a.mo164542x(), bVar, (JSONObject) null, 4, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/record/MmRecordManager$loadStatus$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", "response", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.MmRecordManager$d */
    public static final class C46847d extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ MmRecordManager f117946a;

        /* renamed from: b */
        final /* synthetic */ String f117947b;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181666e("MmRecordManager", "[loadStatus] onError");
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            boolean z;
            String str2;
            try {
                if (this.f117946a.mo164515a() != null) {
                    PermissionStatus permissionStatus = (PermissionStatus) new Gson().fromJson(str, PermissionStatus.class);
                    C45855f.m181664c("MmRecordManager", "[loadStatus] success status: " + permissionStatus.getObjectStatus());
                    IMmDepend a = C45899c.m181859a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                    AbstractC45897a lifecycleDependency = a.getLifecycleDependency();
                    Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
                    Activity a2 = lifecycleDependency.mo144570a();
                    if (a2 == null || !Intrinsics.areEqual(a2.getClass().getName(), MmRecordDetailActivity.class.getName())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    MmBaseInfo a3 = this.f117946a.mo164515a();
                    if (a3 != null && !a3.isRecordingDevice()) {
                        if (!z) {
                            C45855f.m181664c("MmRecordManager", "no on recordingPage, clearRecordManager");
                            C45852d a4 = C45852d.m181651a();
                            MmBaseInfo a5 = this.f117946a.mo164515a();
                            if (a5 != null) {
                                str2 = a5.getObjectToken();
                            } else {
                                str2 = null;
                            }
                            a4.mo161152b(str2);
                        } else if (this.f117946a.mo164523a(permissionStatus.getObjectStatus())) {
                            C45855f.m181664c("MmRecordManager", "notify viewer recording upload finished");
                            this.f117946a.mo164524b().onNext(TuplesKt.to(this.f117947b, RecordState.STOPPED));
                            this.f117946a.mo164537s();
                        }
                    }
                }
            } catch (Exception e) {
                C45855f.m181666e("MmRecordManager", "[loadStatus] parse PermissionStatus error: " + e);
            }
        }

        C46847d(MmRecordManager mmRecordManager, String str) {
            this.f117946a = mmRecordManager;
            this.f117947b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.MmRecordManager$e */
    static final class C46848e<T> implements Consumer<Long> {

        /* renamed from: a */
        final /* synthetic */ MmRecordManager f117948a;

        C46848e(MmRecordManager mmRecordManager) {
            this.f117948a = mmRecordManager;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f117948a.mo164536r();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isSuccess", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.MmRecordManager$f */
    public static final class C46849f extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ Ref.BooleanRef $isMakeCountChanged;
        final /* synthetic */ MiniViewControl $miniViewControl;
        final /* synthetic */ MmRecordManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46849f(MmRecordManager mmRecordManager, Ref.BooleanRef booleanRef, MiniViewControl eVar) {
            super(1);
            this.this$0 = mmRecordManager;
            this.$isMakeCountChanged = booleanRef;
            this.$miniViewControl = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                this.this$0.f117921b = DisplayMode.FLOAT_WINDOW;
                this.this$0.mo164528g().onNext(this.this$0.f117921b);
                MmRecordManager mmRecordManager = this.this$0;
                mmRecordManager.mo164518a(mmRecordManager.mo164515a());
                C47083e.m186425a(this.this$0.f117922c, "vc_minutes_recording_mini_view", C47086i.m186432a().mo165421c());
                if (!this.$isMakeCountChanged.element) {
                    this.$isMakeCountChanged.element = true;
                    MmApmAgent.f115638a.mo161106c(this.this$0.f117923d);
                    MmActiveStateObservable.f115698a.mo161186a();
                    return;
                }
                return;
            }
            C45855f.m181664c("MmRecordManager", "[trySwitchToFloatWindow] failed");
            this.$miniViewControl.mo161245h();
            synchronized (this.this$0.f117920a) {
                this.this$0.f117920a.remove(this.$miniViewControl);
            }
            MmAudioRecordService.Companion aVar = MmAudioRecordService.f117956f;
            Context a = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
            aVar.mo164590c(a);
        }
    }

    /* renamed from: a */
    public final void mo164516a(int i) {
        String objectToken;
        MmBaseInfo mmBaseInfo = this.f117924h;
        if (mmBaseInfo != null && (objectToken = mmBaseInfo.getObjectToken()) != null) {
            this.f117928l.onNext(TuplesKt.to(objectToken, Integer.valueOf(i)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/record/MmRecordManager$changeAudioStatusServer$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.MmRecordManager$c */
    public static final class C46846c extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ MmRecordManager f117944a;

        /* renamed from: b */
        final /* synthetic */ MmUpdateStatus f117945b;

        /* renamed from: a */
        public void mo161289a(String str) {
            String str2;
            if (this.f117945b == MmUpdateStatus.RECORD_FINISH) {
                MmAudioMonitor mmAudioMonitor = MmAudioMonitor.f118586a;
                MmBaseInfo a = this.f117944a.mo164515a();
                if (a != null) {
                    str2 = a.getObjectToken();
                } else {
                    str2 = null;
                }
                MmAudioMonitor.m186477a(mmAudioMonitor, true, str2, (String) null, (Integer) null, 12, (Object) null);
            }
            C45855f.m181663b("MmRecordManager", "[changeAudioStatusServer] succeed, status: " + this.f117945b.getValue());
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str;
            String str2;
            if (this.f117945b == MmUpdateStatus.RECORD_FINISH) {
                MmAudioMonitor mmAudioMonitor = MmAudioMonitor.f118586a;
                MmBaseInfo a = this.f117944a.mo164515a();
                Integer num = null;
                if (a != null) {
                    str = a.getObjectToken();
                } else {
                    str = null;
                }
                if (aVar != null) {
                    str2 = aVar.mo165308c();
                } else {
                    str2 = null;
                }
                if (aVar != null) {
                    num = Integer.valueOf(aVar.mo165306a());
                }
                mmAudioMonitor.mo165447a(false, str, str2, num);
            }
            C45855f.m181663b("MmRecordManager", "[changeAudioStatusServer] status: " + this.f117945b.getValue() + "  onError:" + aVar + ' ');
        }

        C46846c(MmRecordManager mmRecordManager, MmUpdateStatus mmUpdateStatus) {
            this.f117944a = mmRecordManager;
            this.f117945b = mmUpdateStatus;
        }
    }

    /* renamed from: a */
    private final void m185550a(MmUpdateStatus mmUpdateStatus) {
        String str;
        C45855f.m181663b("MmRecordManager", "[changeAudioStatusServer] status: " + mmUpdateStatus.getValue());
        MmBaseInfo mmBaseInfo = this.f117924h;
        if (mmBaseInfo == null || (str = mmBaseInfo.getObjectToken()) == null) {
            str = "";
        }
        C47057a.m186244a(str, mmUpdateStatus, new C46846c(this, mmUpdateStatus));
    }

    /* renamed from: a */
    public final void mo164517a(long j) {
        String objectToken;
        MmBaseInfo mmBaseInfo = this.f117924h;
        if (mmBaseInfo != null && (objectToken = mmBaseInfo.getObjectToken()) != null) {
            this.f117929m.onNext(TuplesKt.to(objectToken, Long.valueOf(j)));
        }
    }

    /* renamed from: a */
    public final void mo164518a(MmBaseInfo mmBaseInfo) {
        if (mmBaseInfo != null) {
            this.f117922c = new C47084f(mmBaseInfo.getMeetingId(), mmBaseInfo.isOwner(), mmBaseInfo.getObjectToken(), mmBaseInfo.getObjectType(), mmBaseInfo.isCanModify());
        }
    }

    /* renamed from: a */
    public final void mo164520a(Action action) {
        String objectToken;
        String str;
        MmRecordTipsControl dVar;
        Intrinsics.checkParameterIsNotNull(action, "action");
        C45855f.m181664c("MmRecordManager", "updateRecordState action: " + action);
        MmBaseInfo mmBaseInfo = this.f117924h;
        if (mmBaseInfo != null && (objectToken = mmBaseInfo.getObjectToken()) != null) {
            switch (C46873c.f118025a[action.ordinal()]) {
                case 1:
                    MmSp.m181668a("audio_record_state_prefix" + objectToken, RecordState.RECORDING.getValue());
                    this.f117927k.onNext(TuplesKt.to(objectToken, RecordState.RECORDING));
                    return;
                case 2:
                    MmSp.m181668a("audio_record_state_prefix" + objectToken, RecordState.PAUSED.getValue());
                    this.f117927k.onNext(TuplesKt.to(objectToken, RecordState.PAUSED));
                    this.f117928l.onNext(TuplesKt.to(objectToken, -1));
                    m185550a(MmUpdateStatus.RECORD_PAUSE);
                    return;
                case 3:
                    MmSp.m181668a("audio_record_state_prefix" + objectToken, RecordState.RECORDING.getValue());
                    this.f117927k.onNext(TuplesKt.to(objectToken, RecordState.RECORDING));
                    m185550a(MmUpdateStatus.RECORD_RESUME);
                    return;
                case 4:
                    MmBaseInfo mmBaseInfo2 = this.f117924h;
                    if (mmBaseInfo2 == null) {
                        C45855f.m181666e("MmRecordManager", "[ACTION_STOPPED] baseInfo is null");
                    } else {
                        if (mmBaseInfo2 == null || (str = mmBaseInfo2.getObjectToken()) == null) {
                            str = "";
                        }
                        MmAppreciableRecordTracker.TrackFinishUploadTime.m186415a(MmAudioFileHelper.f117976a.mo164608e(str), str);
                    }
                    MmSp.m181668a("audio_record_state_prefix" + objectToken, RecordState.STOPPED.getValue());
                    this.f117927k.onNext(TuplesKt.to(objectToken, RecordState.STOPPED));
                    m185550a(MmUpdateStatus.RECORD_FINISH);
                    return;
                case 5:
                    C45859k.m181685a(RunnableC46851h.f117949a);
                    MmSp.m181668a("audio_record_state_prefix" + objectToken, RecordState.PAUSED.getValue());
                    this.f117927k.onNext(TuplesKt.to(objectToken, RecordState.DISABLED_BY_PHONE));
                    return;
                case 6:
                    this.f117927k.onNext(TuplesKt.to(objectToken, RecordState.PAUSED));
                    return;
                case 7:
                    MmControlRegister m = mo164534m();
                    if (m != null && (dVar = (MmRecordTipsControl) m.mo161912a(MmRecordTipsControl.class)) != null) {
                        dVar.mo164736b();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public final void mo164521a(String str) {
        String objectToken;
        Intrinsics.checkParameterIsNotNull(str, "title");
        MmBaseInfo mmBaseInfo = this.f117924h;
        if (mmBaseInfo != null && (objectToken = mmBaseInfo.getObjectToken()) != null) {
            this.f117930n.onNext(TuplesKt.to(objectToken, str));
        }
    }

    /* renamed from: b */
    private final void m185551b(MmBaseInfo mmBaseInfo, Language language) {
        List<MmBaseControl> b;
        MmRecordingLangSp aVar = MmRecordingLangSp.f118185a;
        String objectToken = mmBaseInfo.getObjectToken();
        Intrinsics.checkExpressionValueIsNotNull(objectToken, "baseInfo.objectToken");
        aVar.mo164881a(objectToken, language);
        MmControlRegister m = mo164534m();
        if (m != null) {
            m.mo161914a(new MmRecordTitleBarControl(mmBaseInfo));
        }
        MmControlRegister m2 = mo164534m();
        if (m2 != null) {
            m2.mo161914a(new MmRecordSubtitleControl(mmBaseInfo));
        }
        MmControlRegister m3 = mo164534m();
        if (m3 != null) {
            m3.mo161914a(new MmRecordTipsControl(mmBaseInfo));
        }
        MmControlRegister m4 = mo164534m();
        if (m4 != null) {
            m4.mo161914a(new MmRecordToolbarControl(mmBaseInfo, language));
        }
        MmControlRegister m5 = mo164534m();
        if (m5 != null) {
            m5.mo161914a(new MiniControl(mmBaseInfo));
        }
        MmControlRegister m6 = mo164534m();
        if (m6 != null) {
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
            Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
            String a2 = domainDepend.mo144616a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl().domainDepend.host");
            String objectToken2 = mmBaseInfo.getObjectToken();
            Intrinsics.checkExpressionValueIsNotNull(objectToken2, "baseInfo.objectToken");
            m6.mo161914a(new MmTranslateControl(a2, objectToken2));
        }
        MmControlRegister m7 = mo164534m();
        if (m7 != null && (b = m7.mo161917b()) != null) {
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                it.next().mo161236m();
            }
        }
    }

    /* renamed from: a */
    public final void mo164519a(MmBaseInfo mmBaseInfo, Language language) {
        Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
        Intrinsics.checkParameterIsNotNull(language, "recordingLan");
        this.f117924h = mmBaseInfo;
        m185551b(mmBaseInfo, language);
        if (mmBaseInfo.isRecordingDevice()) {
            f117917f = mmBaseInfo.getObjectToken();
            MmAudioRecordService.Companion aVar = MmAudioRecordService.f117956f;
            Context a = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
            String objectToken = mmBaseInfo.getObjectToken();
            Intrinsics.checkExpressionValueIsNotNull(objectToken, "baseInfo.objectToken");
            aVar.mo164588a(a, objectToken);
            f117916e.set(true);
        }
        m185548C();
        IMmDepend a2 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
        a2.getContextDepend().mo144560a(C46490a.m183861a());
    }
}
