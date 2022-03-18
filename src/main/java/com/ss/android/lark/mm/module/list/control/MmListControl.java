package com.ss.android.lark.mm.module.list.control;

import android.content.Context;
import android.os.SystemClock;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.base.p2289a.C45861b;
import com.ss.android.lark.mm.depend.AbstractC45897a;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.list.data.ListModel;
import com.ss.android.lark.mm.module.list.data.MinutesListResponse;
import com.ss.android.lark.mm.module.list.data.MinutesStatusData;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;
import com.ss.android.lark.mm.module.list.data.MinutesTranscriptProgress;
import com.ss.android.lark.mm.module.list.data.MmListRankType;
import com.ss.android.lark.mm.module.list.data.MmOwnerType;
import com.ss.android.lark.mm.module.list.data.StatusResponse;
import com.ss.android.lark.mm.module.list.my.MmListFilterPreference;
import com.ss.android.lark.mm.module.list.repo.IMmListDataRepo;
import com.ss.android.lark.mm.module.list.repo.MmListDataRepo;
import com.ss.android.lark.mm.module.list.widget.CompleteProgressCalculatorImpl;
import com.ss.android.lark.mm.module.list.widget.IProgressCalculator;
import com.ss.android.lark.mm.module.list.widget.ProcessingProgressCalculatorImpl;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.model.MmUpdateStatus;
import com.ss.android.lark.mm.module.record.upload.MmAudioUploadCenter;
import com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.AbstractC47071d;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.net.parse.MmStringResp;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableListTracker;
import com.ss.android.lark.mm.statistics.monitor.recording.MmAudioMonitor;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vesdk.p3188b.C63954b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 \u00012\u00020\u0001:\u0006\u0001\u0001\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)J\"\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\nH\u0002JN\u0010.\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00072\u000e\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001002\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020&\u0018\u0001032\u001e\u00104\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002080605J\u000e\u00109\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0007J&\u0010:\u001a\u00020$2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020&\u0018\u0001002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000403H\u0002J\u000e\u0010=\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0006\u0010>\u001a\u00020$J$\u0010?\u001a\u0004\u0018\u00010&2\b\u0010@\u001a\u0004\u0018\u00010\u00042\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020&\u0018\u000100H\u0002J\u000e\u0010B\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020&\u0018\u000100J\u0016\u0010D\u001a\n\u0012\u0004\u0012\u00020&\u0018\u0001002\u0006\u0010+\u001a\u00020\u0007J\u0010\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010+\u001a\u00020\u0007J&\u0010G\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000207060H2\u0006\u0010+\u001a\u00020\u0007J\b\u0010I\u001a\u0004\u0018\u00010&J\r\u0010J\u001a\u0004\u0018\u000107¢\u0006\u0002\u0010KJ\b\u0010L\u001a\u0004\u0018\u00010\u0004J\u000e\u0010M\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0007J\u0018\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020QH\u0002J\u000e\u0010R\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0007J \u0010S\u001a\u00020$2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010T\u001a\u0002072\u0006\u0010U\u001a\u00020\nH\u0002J\u000e\u0010V\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0007J\u0010\u0010W\u001a\u00020$2\u0006\u0010,\u001a\u00020\u0004H\u0002J\u0010\u0010X\u001a\u00020$2\u0006\u0010,\u001a\u00020\u0004H\u0002J\u0018\u0010Y\u001a\u00020$2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u0004H\u0002J\u0010\u0010]\u001a\u00020$2\u0006\u0010@\u001a\u00020\u0004H\u0002J&\u0010^\u001a\u00020$2\u0006\u0010Z\u001a\u00020[2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\nJA\u0010`\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00042\u0006\u0010a\u001a\u00020\u00042!\u0010b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bd\u0012\b\be\u0012\u0004\b\b(\\\u0012\u0004\u0012\u00020$0cJ\u000e\u0010f\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000e\u0010g\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0018\u0010h\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00072\b\b\u0002\u0010i\u001a\u00020jJ\u0010\u0010k\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0007H\u0002J\u0012\u0010l\u001a\u00020$2\b\b\u0002\u0010m\u001a\u00020\nH\u0002J\u000e\u0010n\u001a\u00020$2\u0006\u0010,\u001a\u00020\u0004J \u0010o\u001a\u00020$2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010p\u001a\u0002072\u0006\u0010U\u001a\u00020\nH\u0002J\b\u0010q\u001a\u00020$H\u0002J\u001c\u0010r\u001a\u00020\u001f2\u0006\u0010s\u001a\u00020\u00072\f\u0010t\u001a\b\u0012\u0004\u0012\u00020$0uJ\u0010\u0010v\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0007H\u0002J\u0010\u0010w\u001a\u00020$2\u0006\u0010O\u001a\u00020\u0004H\u0002J\u000e\u0010x\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000e\u0010y\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\b\u0010z\u001a\u00020$H\u0002J\b\u0010{\u001a\u00020$H\u0002JK\u0010|\u001a\u00020$2\u001e\u00104\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020806052\u0006\u0010}\u001a\u00020&2\u0006\u0010~\u001a\u0002012\u0007\u0010\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/mm/module/list/control/MmListControl;", "", "()V", "TAG", "", "dataSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "kotlin.jvm.PlatformType", "disposed", "", "isHomeListFirstPage", "isMyListFirstPage", "isShareListFirstPage", "isTrashListFirstPage", "listDataRepo", "Lcom/ss/android/lark/mm/module/list/repo/IMmListDataRepo;", "getListDataRepo", "()Lcom/ss/android/lark/mm/module/list/repo/IMmListDataRepo;", "listDataRepo$delegate", "Lkotlin/Lazy;", "listFilterPreference", "Lcom/ss/android/lark/mm/module/list/my/MmListFilterPreference;", "getListFilterPreference", "()Lcom/ss/android/lark/mm/module/list/my/MmListFilterPreference;", "listFilterPreference$delegate", "model", "Lcom/ss/android/lark/mm/module/list/data/ListModel;", "recordingDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "timerSyncStatus", "Lio/reactivex/disposables/Disposable;", "timerUpdateDuration", "timerUpdateProgress", "uploadDisposable", "addOrDeleteHomeListItem", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "addRecord", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "afterDelete", "ds", "token", "isPermanentlyDelete", "bindStatus", "statusList", "", "Lcom/ss/android/lark/mm/module/list/data/MinutesStatusData;", "items", "", "progressMap", "", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mm/module/list/widget/IProgressCalculator;", "clear", "collectNotCompleteTokens", "sourceList", "tokens", "deleteMyListItem", "dispose", "findListItemByToken", "objectToken", "list", "firstPage", "getDuration", "getList", "getListResponse", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "getProgress", "", "getRecording", "getUploadingProgress", "()Ljava/lang/Integer;", "getUploadingToken", "hasMore", "homeList", "timestamp", "ownerType", "Lcom/ss/android/lark/mm/module/list/data/MmOwnerType;", "isFirstPage", "myList", "rank", "isAsc", "nextPage", "notifyAudioFinishedToServer", "notifyUploadCompletedToServer", "onDeleteFailed", "context", "Landroid/content/Context;", "errorMsg", "pollRecordingStatus", "removeOrDelete", "isDelete", "rename", "title", "onResponse", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "renameHomeListItem", "renameMyListItem", "restartPollStatus", "delay", "", "restartUpdateDuration", "restartUpdateProgressTask", "forceUpdate", "restore", "shareList", "rankType", "stopPollStatus", "subscribeData", ShareHitPoint.f121868c, "onChanged", "Lkotlin/Function0;", "syncStatus", "trashList", "updateDataOpenTimeOrderInMyList", "updateDataOpenTimeOrderInShareList", "updateHomListFirstPageData", "updateMyListFirstPageData", "updateProgress", "oldItem", "newItem", "serverProgress", "", "serverRate", "Companion", "DataError", "DataSource", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmListControl {

    /* renamed from: f */
    public static final int f116813f = 50;

    /* renamed from: g */
    public static final long f116814g = 10;

    /* renamed from: h */
    public static final long f116815h = 1;

    /* renamed from: i */
    public static final ConcurrentHashMap<String, MmListControl> f116816i = new ConcurrentHashMap<>();

    /* renamed from: j */
    public static final Companion f116817j = new Companion(null);

    /* renamed from: a */
    public final String f116818a = "ListRepo";

    /* renamed from: b */
    public ListModel f116819b = new ListModel(null, null, null, null, null, null, null, null, null, null, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);

    /* renamed from: c */
    public final C68296b<DataSource> f116820c;

    /* renamed from: d */
    public Disposable f116821d;

    /* renamed from: e */
    public Disposable f116822e;

    /* renamed from: k */
    private Disposable f116823k;

    /* renamed from: l */
    private Disposable f116824l;

    /* renamed from: m */
    private C68289a f116825m;

    /* renamed from: n */
    private final Lazy f116826n;

    /* renamed from: o */
    private final Lazy f116827o;

    /* renamed from: p */
    private boolean f116828p;

    /* renamed from: q */
    private boolean f116829q;

    /* renamed from: r */
    private boolean f116830r;

    /* renamed from: s */
    private boolean f116831s;

    /* renamed from: t */
    private boolean f116832t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataError;", "", "(Ljava/lang/String;I)V", "None", "EmptyHomeList", "EmptyMyList", "EmptyShareList", "EmptyTrashList", "EmptyAndRetry", "EmptySearch", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DataError {
        None,
        EmptyHomeList,
        EmptyMyList,
        EmptyShareList,
        EmptyTrashList,
        EmptyAndRetry,
        EmptySearch
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "", "(Ljava/lang/String;I)V", "HomeList", "MyList", "ShareList", "TrashList", "Status", "Recording", "Uploading", "RecordReady", "Duration", "Progress", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DataSource {
        HomeList,
        MyList,
        ShareList,
        TrashList,
        Status,
        Recording,
        Uploading,
        RecordReady,
        Duration,
        Progress
    }

    /* renamed from: a */
    public final IMmListDataRepo mo162972a() {
        return (IMmListDataRepo) this.f116826n.getValue();
    }

    /* renamed from: a */
    public final void mo162976a(Context context, String str) {
    }

    /* renamed from: b */
    public final MmListFilterPreference mo162986b() {
        return (MmListFilterPreference) this.f116827o.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0010R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/list/control/MmListControl$Companion;", "", "()V", "INTERVAL_SYNC_STATUS", "", "getINTERVAL_SYNC_STATUS", "()J", "INTERVAL_UPDATE_DURATION", "getINTERVAL_UPDATE_DURATION", "MAX_BATCH_STATUS_SIZE", "", "PAGE_SIZE", "getPAGE_SIZE", "()I", "repos", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/lark/mm/module/list/control/MmListControl;", "create", "delete", "", "id", "get", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo163011a() {
            return MmListControl.f116813f;
        }

        /* renamed from: b */
        public final synchronized String mo163014b() {
            String str;
            str = "ListRepo@" + SystemClock.elapsedRealtime();
            MmListControl.f116816i.put(str, new MmListControl());
            return str;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final MmListControl mo163013b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            return MmListControl.f116816i.get(str);
        }

        /* renamed from: a */
        public final void mo163012a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            MmListControl mmListControl = MmListControl.f116816i.get(str);
            if (mmListControl != null) {
                mmListControl.mo162990c();
                MmListControl.f116816i.remove(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo162977a(MmBaseInfo mmBaseInfo) {
        List<MinutesSummaryData> list;
        List<MinutesSummaryData> list2;
        List<MinutesSummaryData> list3;
        Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
        MinutesListResponse myList = this.f116819b.getMyList();
        MinutesSummaryData minutesSummaryData = null;
        if (!(myList == null || (list3 = myList.getList()) == null)) {
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (Intrinsics.areEqual(next.getObjectToken(), mmBaseInfo.getObjectToken())) {
                    minutesSummaryData = next;
                    break;
                }
            }
            minutesSummaryData = minutesSummaryData;
        }
        if (minutesSummaryData == null) {
            String objectToken = mmBaseInfo.getObjectToken();
            Integer valueOf = Integer.valueOf(ObjectStatus.RealTimeRecording.getValue());
            Integer valueOf2 = Integer.valueOf(mmBaseInfo.getReviewStatus());
            String mediaType = mmBaseInfo.getMediaType();
            Long valueOf3 = Long.valueOf(System.currentTimeMillis());
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.ILoginDepend loginDepend = a.getLoginDepend();
            Intrinsics.checkExpressionValueIsNotNull(loginDepend, "MmDepend.impl().loginDepend");
            String a2 = loginDepend.mo144647a();
            IMmDepend a3 = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "MmDepend.impl()");
            IMmDepend.ILoginDepend loginDepend2 = a3.getLoginDepend();
            Intrinsics.checkExpressionValueIsNotNull(loginDepend2, "MmDepend.impl().loginDepend");
            MinutesSummaryData minutesSummaryData2 = new MinutesSummaryData(objectToken, null, null, valueOf, valueOf2, mediaType, null, mmBaseInfo.getTopic(), mmBaseInfo.getVideoCover(), Long.valueOf(mmBaseInfo.getStartTime()), null, Long.valueOf(mmBaseInfo.getStopTime()), Long.valueOf(mmBaseInfo.getDuration()), null, null, Boolean.valueOf(mmBaseInfo.isShowExternalTag()), true, Integer.valueOf(MmBaseInfo.MMObjectType.RECORDING.value), null, true, valueOf3, loginDepend2.mo144651c(), a2, null, false, null, null, null, 260334662, null);
            this.f116819b.setRecording(minutesSummaryData2);
            MinutesListResponse myList2 = this.f116819b.getMyList();
            if (!(myList2 == null || (list2 = myList2.getList()) == null)) {
                list2.add(0, minutesSummaryData2);
            }
            MinutesListResponse homeList = this.f116819b.getHomeList();
            if (!(homeList == null || (list = homeList.getList()) == null)) {
                list.add(0, minutesSummaryData2);
            }
            mo163006h();
            mo163008i();
            String objectToken2 = mmBaseInfo.getObjectToken();
            Intrinsics.checkExpressionValueIsNotNull(objectToken2, "baseInfo.objectToken");
            mo162983a(objectToken2);
            this.f116820c.onNext(DataSource.MyList);
            this.f116820c.onNext(DataSource.HomeList);
        }
    }

    /* renamed from: a */
    public final void mo162985a(boolean z) {
        if (!this.f116829q) {
            Disposable disposable = this.f116822e;
            if (disposable != null) {
                disposable.dispose();
            }
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = z;
            Observable<Long> interval = Observable.interval(0, 1, TimeUnit.SECONDS);
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45893s threadDepend = a.getThreadDepend();
            Intrinsics.checkExpressionValueIsNotNull(threadDepend, "MmDepend.impl().threadDepend");
            this.f116822e = interval.subscribeOn(threadDepend.mo144600b()).subscribe(new C46385ag(this, booleanRef));
        }
    }

    /* renamed from: a */
    public final void mo162983a(String str) {
        MmRecordManager a = C45852d.m181651a().mo161150a(str);
        C68289a aVar = this.f116825m;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f116825m = new C68289a();
        this.f116819b.setRecording(new MinutesSummaryData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268435455, null));
        Disposable subscribe = a.mo164524b().subscribe(new C46407n(this));
        C68289a aVar2 = this.f116825m;
        if (aVar2 != null) {
            aVar2.mo237937a(subscribe);
        }
        Disposable subscribe2 = a.mo164527f().subscribe(new C46408o(this));
        C68289a aVar3 = this.f116825m;
        if (aVar3 != null) {
            aVar3.mo237937a(subscribe2);
        }
        Disposable subscribe3 = a.mo164526d().throttleFirst(1, TimeUnit.SECONDS).subscribe(new C46409p(this));
        C68289a aVar4 = this.f116825m;
        if (aVar4 != null) {
            aVar4.mo237937a(subscribe3);
        }
    }

    /* renamed from: a */
    public final void mo162975a(Context context, DataSource dataSource, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(str, "token");
        if (dataSource == DataSource.MyList || z) {
            mo162972a().mo163242a(dataSource, str, false, (Function0<Unit>) new C46410q(this, dataSource, str), (Function1<? super String, Unit>) new C46411r(this, context));
        } else if (dataSource == DataSource.HomeList) {
            mo162972a().mo163248a(str, new C46412s(this, dataSource, str), new C46413t(this, context));
        } else if (dataSource == DataSource.ShareList) {
            mo162972a().mo163251b(str, new C46414u(this, dataSource, str), new C46415v(this, context));
        } else if (dataSource == DataSource.TrashList) {
            mo162972a().mo163242a(dataSource, str, true, (Function0<Unit>) new C46416w(this, dataSource, str), (Function1<? super String, Unit>) new C46417x(this, context));
        }
    }

    /* renamed from: a */
    public final void mo162979a(DataSource dataSource, String str, String str2, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "title");
        Intrinsics.checkParameterIsNotNull(function1, "onResponse");
        mo162972a().mo163241a(dataSource, str, str2, new C46418y(function1), new C46419z(function1));
    }

    /* renamed from: a */
    public final void mo162978a(DataSource dataSource, long j) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Disposable disposable = this.f116824l;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f116824l = MmAudioUploadCenter.f118224a.mo164912a().mo237998a(C46381ac.f116837a).mo237985a(AndroidSchedulers.mainThread()).mo238018d(new C46382ad(this, dataSource));
        Disposable disposable2 = this.f116823k;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        Observable<Long> interval = Observable.interval(j, f116814g, TimeUnit.SECONDS);
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45893s threadDepend = a.getThreadDepend();
        Intrinsics.checkExpressionValueIsNotNull(threadDepend, "MmDepend.impl().threadDepend");
        this.f116823k = interval.subscribeOn(threadDepend.mo144598a()).subscribe(new C46383ae(this, dataSource));
    }

    /* renamed from: a */
    public final void mo162980a(DataSource dataSource, String str, boolean z) {
        C45859k.m181685a(new RunnableC46395c(this, dataSource, str, z));
    }

    /* renamed from: a */
    public final void mo162981a(DataSource dataSource, List<MinutesStatusData> list, List<MinutesSummaryData> list2, Map<String, Pair<Integer, IProgressCalculator>> map) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(map, "progressMap");
        C45859k.m181685a(new RunnableC46396d(this, list, list2, dataSource, map));
    }

    /* renamed from: a */
    public final void mo162984a(Map<String, Pair<Integer, IProgressCalculator>> map, MinutesSummaryData minutesSummaryData, MinutesStatusData minutesStatusData, float f, float f2) {
        String objectToken;
        IProgressCalculator second;
        IProgressCalculator second2;
        ar arVar = ar.INSTANCE;
        Integer status = minutesSummaryData.getStatus();
        int value = ObjectStatus.Complete.getValue();
        if (status == null || status.intValue() != value) {
            if (arVar.invoke(minutesSummaryData.getStatus())) {
                Integer status2 = minutesSummaryData.getStatus();
                if (status2 != null && (objectToken = minutesSummaryData.getObjectToken()) != null) {
                    Integer objectStatus = minutesStatusData.getObjectStatus();
                    int value2 = ObjectStatus.Complete.getValue();
                    if (objectStatus != null && objectStatus.intValue() == value2) {
                        Pair<Integer, IProgressCalculator> pair = map.get(objectToken);
                        float c = (pair == null || (second2 = pair.getSecond()) == null) ? BitmapDescriptorFactory.HUE_RED : ((float) second2.mo163323c()) / 100.0f;
                        if (c < 0.8f) {
                            String str = this.f116818a;
                            C45855f.m181663b(str, "[updateProgress] token:" + objectToken + " progress is " + c + ", change to CompleteProgressCalculatorImpl");
                            CompleteProgressCalculatorImpl aVar = new CompleteProgressCalculatorImpl(c, f);
                            aVar.mo163319a();
                            map.put(objectToken, TuplesKt.to(status2, aVar));
                        } else {
                            String str2 = this.f116818a;
                            C45855f.m181663b(str2, "[updateProgress2] remove token:" + objectToken);
                            map.remove(objectToken);
                        }
                    } else {
                        Integer objectStatus2 = minutesStatusData.getObjectStatus();
                        int value3 = ObjectStatus.Failed.getValue();
                        if (objectStatus2 != null && objectStatus2.intValue() == value3) {
                            String str3 = this.f116818a;
                            C45855f.m181663b(str3, "[updateProgress3] remove token:" + objectToken);
                            map.remove(objectToken);
                        } else if (map.get(objectToken) == null) {
                            String str4 = this.f116818a;
                            C45855f.m181663b(str4, "[updateProgress4] token:" + objectToken + ", change to ProcessingProgressCalculatorImpl");
                            ProcessingProgressCalculatorImpl fVar = new ProcessingProgressCalculatorImpl(f, f2);
                            fVar.mo163341a();
                            map.put(objectToken, TuplesKt.to(status2, fVar));
                        } else if (minutesStatusData.getObjectStatus() != null) {
                            Pair<Integer, IProgressCalculator> pair2 = map.get(objectToken);
                            if (!Intrinsics.areEqual(pair2 != null ? pair2.getFirst() : null, minutesStatusData.getObjectStatus())) {
                                String str5 = this.f116818a;
                                C45855f.m181663b(str5, "[updateProgress5] token:" + objectToken + ", update status");
                                Pair<Integer, IProgressCalculator> pair3 = map.get(objectToken);
                                if (pair3 != null) {
                                    map.put(objectToken, Pair.copy$default(pair3, minutesStatusData.getObjectStatus(), null, 2, null));
                                }
                            }
                        }
                    }
                    Pair<Integer, IProgressCalculator> pair4 = map.get(objectToken);
                    if (pair4 != null && (second = pair4.getSecond()) != null) {
                        second.mo163320a(f, f2);
                    }
                }
            } else if (arVar.invoke(minutesStatusData.getObjectStatus())) {
                String objectToken2 = minutesSummaryData.getObjectToken();
                Integer objectStatus3 = minutesStatusData.getObjectStatus();
                if (objectToken2 != null && objectStatus3 != null) {
                    String str6 = this.f116818a;
                    C45855f.m181663b(str6, "[updateProgress6] token:" + objectToken2 + ", change to ProcessingProgressCalculatorImpl");
                    ProcessingProgressCalculatorImpl fVar2 = new ProcessingProgressCalculatorImpl(f, f2);
                    fVar2.mo163341a();
                    map.put(objectToken2, TuplesKt.to(objectStatus3, fVar2));
                }
            } else {
                Integer objectStatus4 = minutesStatusData.getObjectStatus();
                int value4 = ObjectStatus.Failed.getValue();
                if (objectStatus4 != null && objectStatus4.intValue() == value4) {
                    String str7 = this.f116818a;
                    C45855f.m181663b(str7, "[updateProgress3] remove token:" + minutesSummaryData.getObjectToken());
                    String objectToken3 = minutesSummaryData.getObjectToken();
                    if (map != null) {
                        C69121n.m265993j(map).remove(objectToken3);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo162982a(MinutesSummaryData minutesSummaryData) {
        Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (mo162986b().mo162890a() != MmOwnerType.SHARED_WITH_ME) {
            C45859k.m181685a(new RunnableC46393b(this, minutesSummaryData));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/list/repo/MmListDataRepo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$h */
    static final class C46400h extends Lambda implements Function0<MmListDataRepo> {
        public static final C46400h INSTANCE = new C46400h();

        C46400h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmListDataRepo invoke() {
            return new MmListDataRepo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/list/my/MmListFilterPreference;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$i */
    static final class C46401i extends Lambda implements Function0<MmListFilterPreference> {
        public static final C46401i INSTANCE = new C46401i();

        C46401i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmListFilterPreference invoke() {
            return new MmListFilterPreference();
        }
    }

    /* renamed from: e */
    public final String mo162998e() {
        return this.f116819b.getUploadingToken();
    }

    /* renamed from: f */
    public final Integer mo163001f() {
        return this.f116819b.getUploadingProgress();
    }

    /* renamed from: g */
    public final MinutesSummaryData mo163004g() {
        return this.f116819b.getRecording();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$ah */
    static final class C46387ah extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $token;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46387ah(MmListControl mmListControl, String str) {
            super(0);
            this.this$0 = mmListControl;
            this.$token = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            MmListControl.m183599a(this.this$0, DataSource.TrashList, this.$token, false, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$y */
    static final class C46418y extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function1 $onResponse;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46418y(Function1 function1) {
            super(0);
            this.$onResponse = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.$onResponse.invoke("");
        }
    }

    /* renamed from: d */
    public final List<MinutesSummaryData> mo162994d() {
        return this.f116819b.getDuration();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$q */
    static final class C46410q extends Lambda implements Function0<Unit> {
        final /* synthetic */ DataSource $ds;
        final /* synthetic */ String $token;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46410q(MmListControl mmListControl, DataSource dataSource, String str) {
            super(0);
            this.this$0 = mmListControl;
            this.$ds = dataSource;
            this.$token = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C45858j.m181677a((int) R.string.MMWeb_G_My_FileDeletedSingular_Toast);
            MmListControl.m183599a(this.this$0, this.$ds, this.$token, false, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$s */
    static final class C46412s extends Lambda implements Function0<Unit> {
        final /* synthetic */ DataSource $ds;
        final /* synthetic */ String $token;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46412s(MmListControl mmListControl, DataSource dataSource, String str) {
            super(0);
            this.this$0 = mmListControl;
            this.$ds = dataSource;
            this.$token = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C45858j.m181677a((int) R.string.MMWeb_G_Home_FileRemovedSingular_Toast);
            MmListControl.m183599a(this.this$0, this.$ds, this.$token, false, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$u */
    static final class C46414u extends Lambda implements Function0<Unit> {
        final /* synthetic */ DataSource $ds;
        final /* synthetic */ String $token;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46414u(MmListControl mmListControl, DataSource dataSource, String str) {
            super(0);
            this.this$0 = mmListControl;
            this.$ds = dataSource;
            this.$token = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C45858j.m181677a((int) R.string.MMWeb_G_Home_FileRemovedSingular_Toast);
            MmListControl.m183599a(this.this$0, this.$ds, this.$token, false, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$w */
    static final class C46416w extends Lambda implements Function0<Unit> {
        final /* synthetic */ DataSource $ds;
        final /* synthetic */ String $token;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46416w(MmListControl mmListControl, DataSource dataSource, String str) {
            super(0);
            this.this$0 = mmListControl;
            this.$ds = dataSource;
            this.$token = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C45858j.m181677a((int) R.string.MMWeb_G_My_FileDeletedSingular_Toast);
            this.this$0.mo162980a(this.$ds, this.$token, true);
        }
    }

    /* renamed from: j */
    private final void m183605j() {
        Disposable disposable = this.f116824l;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = null;
        this.f116824l = disposable2;
        Disposable disposable3 = this.f116823k;
        if (disposable3 != null) {
            disposable3.dispose();
        }
        this.f116823k = disposable2;
    }

    /* renamed from: i */
    public final void mo163008i() {
        if (mo162986b().mo162894b() == MmOwnerType.OWNED_BY_ANYONE) {
            mo162972a().mo163243a(this.f116819b.getHomeList());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/control/MmListControl$syncStatus$3", "Lcom/ss/android/lark/mm/net/callback/IHttpRespCallback;", "Lcom/ss/android/lark/mm/net/parse/MmStringResp;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", "resp", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class am extends AbstractC47071d<MmStringResp> {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116848a;

        /* renamed from: b */
        final /* synthetic */ DataSource f116849b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$am$a */
        public static final class RunnableC46389a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ am f116850a;

            /* renamed from: b */
            final /* synthetic */ MmStringResp f116851b;

            RunnableC46389a(am amVar, MmStringResp mmStringResp) {
                this.f116850a = amVar;
                this.f116851b = mmStringResp;
            }

            public final void run() {
                String str;
                Gson gson = new Gson();
                MmStringResp mmStringResp = this.f116851b;
                if (mmStringResp != null) {
                    str = (String) mmStringResp.data;
                } else {
                    str = null;
                }
                final StatusResponse statusResponse = (StatusResponse) gson.fromJson(str, StatusResponse.class);
                C45859k.m181685a(new Runnable(this) {
                    /* class com.ss.android.lark.mm.module.list.control.MmListControl.am.RunnableC46389a.RunnableC463901 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC46389a f116852a;

                    {
                        this.f116852a = r1;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:101:0x0134 A[SYNTHETIC] */
                    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ef  */
                    /* JADX WARNING: Removed duplicated region for block: B:62:0x0164  */
                    /* JADX WARNING: Removed duplicated region for block: B:94:0x00c1 A[SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                        // Method dump skipped, instructions count: 664
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.list.control.MmListControl.am.RunnableC46389a.RunnableC463901.run():void");
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$am$a$1$a */
                    static final class C46391a extends Lambda implements Function1<MinutesSummaryData, Boolean> {
                        final /* synthetic */ MinutesStatusData $item;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C46391a(MinutesStatusData minutesStatusData) {
                            super(1);
                            this.$item = minutesStatusData;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public /* synthetic */ Boolean invoke(MinutesSummaryData minutesSummaryData) {
                            return Boolean.valueOf(invoke(minutesSummaryData));
                        }

                        public final boolean invoke(MinutesSummaryData minutesSummaryData) {
                            Intrinsics.checkParameterIsNotNull(minutesSummaryData, "it");
                            return Intrinsics.areEqual(minutesSummaryData.getObjectToken(), this.$item.getObjectToken());
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f116848a.f116818a;
            C45855f.m181666e(str, "syncStatus error: " + aVar);
        }

        /* renamed from: a */
        public void mo161289a(MmStringResp mmStringResp) {
            try {
                C45857i.m181676a(new RunnableC46389a(this, mmStringResp));
            } catch (JsonSyntaxException e) {
                String str = this.f116848a.f116818a;
                C45855f.m181666e(str, "[syncStatus] JsonSyntaxException ex: " + e);
            }
        }

        am(MmListControl mmListControl, DataSource dataSource) {
            this.f116848a = mmListControl;
            this.f116849b = dataSource;
        }
    }

    /* renamed from: c */
    public final void mo162990c() {
        this.f116829q = true;
        this.f116820c.onComplete();
        Disposable disposable = this.f116823k;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.f116824l;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        C68289a aVar = this.f116825m;
        if (aVar != null) {
            aVar.dispose();
        }
        Disposable disposable3 = this.f116821d;
        if (disposable3 != null) {
            disposable3.dispose();
        }
        mo162972a().mo163240a();
        Disposable disposable4 = this.f116822e;
        if (disposable4 != null) {
            disposable4.dispose();
        }
    }

    /* renamed from: h */
    public final void mo163006h() {
        if (!mo162986b().mo162898d() && mo162986b().mo162897c() == MmListRankType.CREATE_TIME) {
            mo162972a().mo163250b(this.f116819b.getMyList());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$aa */
    static final class RunnableC46379aa implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116833a;

        /* renamed from: b */
        final /* synthetic */ MinutesSummaryData f116834b;

        RunnableC46379aa(MmListControl mmListControl, MinutesSummaryData minutesSummaryData) {
            this.f116833a = mmListControl;
            this.f116834b = minutesSummaryData;
        }

        public final void run() {
            List<MinutesSummaryData> list;
            T t;
            MinutesListResponse homeList = this.f116833a.f116819b.getHomeList();
            if (!(homeList == null || (list = homeList.getList()) == null)) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getObjectToken(), this.f116834b.getObjectToken())) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    t2.setTopic(this.f116834b.getTopic());
                    t2.setHasChanged(true);
                }
            }
            this.f116833a.mo163008i();
            this.f116833a.f116820c.onNext(DataSource.HomeList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$ab */
    static final class RunnableC46380ab implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116835a;

        /* renamed from: b */
        final /* synthetic */ MinutesSummaryData f116836b;

        RunnableC46380ab(MmListControl mmListControl, MinutesSummaryData minutesSummaryData) {
            this.f116835a = mmListControl;
            this.f116836b = minutesSummaryData;
        }

        public final void run() {
            List<MinutesSummaryData> list;
            T t;
            MinutesListResponse myList = this.f116835a.f116819b.getMyList();
            if (!(myList == null || (list = myList.getList()) == null)) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getObjectToken(), this.f116836b.getObjectToken())) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    t2.setTopic(this.f116836b.getTopic());
                    t2.setHasChanged(true);
                }
            }
            this.f116835a.mo163006h();
            this.f116835a.f116820c.onNext(DataSource.MyList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$e */
    static final class RunnableC46397e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116871a;

        /* renamed from: b */
        final /* synthetic */ MinutesSummaryData f116872b;

        RunnableC46397e(MmListControl mmListControl, MinutesSummaryData minutesSummaryData) {
            this.f116871a = mmListControl;
            this.f116872b = minutesSummaryData;
        }

        public final void run() {
            List<MinutesSummaryData> list;
            List<MinutesSummaryData> list2;
            MinutesListResponse myList = this.f116871a.f116819b.getMyList();
            MinutesSummaryData minutesSummaryData = null;
            if (!(myList == null || (list2 = myList.getList()) == null)) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (Intrinsics.areEqual(next.getObjectToken(), this.f116872b.getObjectToken())) {
                        minutesSummaryData = next;
                        break;
                    }
                }
                minutesSummaryData = minutesSummaryData;
            }
            if (minutesSummaryData != null) {
                MinutesListResponse myList2 = this.f116871a.f116819b.getMyList();
                if (!(myList2 == null || (list = myList2.getList()) == null)) {
                    list.remove(minutesSummaryData);
                }
                this.f116871a.f116820c.onNext(DataSource.MyList);
            }
        }
    }

    public MmListControl() {
        C68296b<DataSource> a = C68296b.m265052a();
        Intrinsics.checkExpressionValueIsNotNull(a, "PublishSubject.create<DataSource>()");
        this.f116820c = a;
        this.f116826n = LazyKt.lazy(C46400h.INSTANCE);
        this.f116827o = LazyKt.lazy(C46401i.INSTANCE);
        this.f116828p = true;
        this.f116830r = true;
        this.f116831s = true;
        this.f116832t = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    static final class ap implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116856a;

        /* renamed from: b */
        final /* synthetic */ MinutesSummaryData f116857b;

        ap(MmListControl mmListControl, MinutesSummaryData minutesSummaryData) {
            this.f116856a = mmListControl;
            this.f116857b = minutesSummaryData;
        }

        public final void run() {
            List<MinutesSummaryData> list;
            T t;
            MinutesListResponse myList = this.f116856a.f116819b.getMyList();
            if (myList != null && (list = myList.getList()) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getObjectToken(), this.f116857b.getObjectToken())) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    list.remove(t2);
                    String str = this.f116856a.f116818a;
                    C45855f.m181663b(str, "remove MyListItem target: " + ((Object) t2));
                    if (!this.f116856a.mo162986b().mo162898d()) {
                        list.add(0, this.f116857b);
                        String str2 = this.f116856a.f116818a;
                        C45855f.m181663b(str2, "add MyListItem target: " + this.f116857b);
                    } else if (!this.f116856a.mo163003f(DataSource.MyList)) {
                        list.add(this.f116857b);
                        String str3 = this.f116856a.f116818a;
                        C45855f.m181663b(str3, "add MyListItem target: " + this.f116857b);
                    }
                }
                this.f116856a.f116820c.onNext(DataSource.MyList);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    static final class aq implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116858a;

        /* renamed from: b */
        final /* synthetic */ MinutesSummaryData f116859b;

        aq(MmListControl mmListControl, MinutesSummaryData minutesSummaryData) {
            this.f116858a = mmListControl;
            this.f116859b = minutesSummaryData;
        }

        public final void run() {
            List<MinutesSummaryData> list;
            T t;
            MinutesListResponse shareList = this.f116858a.f116819b.getShareList();
            if (shareList != null && (list = shareList.getList()) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getObjectToken(), this.f116859b.getObjectToken())) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    list.remove(t2);
                    String str = this.f116858a.f116818a;
                    C45855f.m181663b(str, "remove ShareListItem target: " + ((Object) t2));
                    if (!this.f116858a.mo162986b().mo162900f()) {
                        list.add(0, this.f116859b);
                        String str2 = this.f116858a.f116818a;
                        C45855f.m181663b(str2, "add ShareListItem target: " + this.f116859b);
                    } else if (!this.f116858a.mo163003f(DataSource.ShareList)) {
                        list.add(this.f116859b);
                        String str3 = this.f116858a.f116818a;
                        C45855f.m181663b(str3, "add ShareListItem target: " + this.f116859b);
                    }
                }
                this.f116858a.f116820c.onNext(DataSource.ShareList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$b */
    public static final class RunnableC46393b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116860a;

        /* renamed from: b */
        final /* synthetic */ MinutesSummaryData f116861b;

        RunnableC46393b(MmListControl mmListControl, MinutesSummaryData minutesSummaryData) {
            this.f116860a = mmListControl;
            this.f116861b = minutesSummaryData;
        }

        public final void run() {
            List<MinutesSummaryData> list;
            T t;
            String str = this.f116860a.f116818a;
            C45855f.m181664c(str, "addOrDeleteHomeListItem, objectToken:" + this.f116861b.getObjectToken());
            MinutesListResponse homeList = this.f116860a.f116819b.getHomeList();
            if (homeList != null && (list = homeList.getList()) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getObjectToken(), this.f116861b.getObjectToken())) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 == null) {
                    C45855f.m181664c(this.f116860a.f116818a, "addHomeListItem");
                    list.add(this.f116861b);
                    if (list.size() > 1) {
                        CollectionsKt.sortWith(list, new C46394a());
                    }
                } else {
                    C45855f.m181664c(this.f116860a.f116818a, "deleteHomeListItem");
                    list.remove(t2);
                }
                this.f116860a.f116820c.onNext(DataSource.HomeList);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$b$a */
        public static final class C46394a<T> implements Comparator<T> {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(t2.getTime(), t.getTime());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$c */
    public static final class RunnableC46395c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116862a;

        /* renamed from: b */
        final /* synthetic */ DataSource f116863b;

        /* renamed from: c */
        final /* synthetic */ String f116864c;

        /* renamed from: d */
        final /* synthetic */ boolean f116865d;

        RunnableC46395c(MmListControl mmListControl, DataSource dataSource, String str, boolean z) {
            this.f116862a = mmListControl;
            this.f116863b = dataSource;
            this.f116864c = str;
            this.f116865d = z;
        }

        public final void run() {
            List<MinutesSummaryData> list;
            MinutesListResponse homeList;
            List<MinutesSummaryData> list2;
            List<MinutesSummaryData> list3;
            List<MinutesSummaryData> list4;
            List<MinutesSummaryData> list5;
            List<MinutesSummaryData> list6;
            MinutesListResponse trashList;
            List<MinutesSummaryData> list7;
            List<MinutesSummaryData> list8;
            int i = C46420a.f116890i[this.f116863b.ordinal()];
            T t = null;
            if (i == 1) {
                MinutesListResponse homeList2 = this.f116862a.f116819b.getHomeList();
                if (!(homeList2 == null || (list = homeList2.getList()) == null)) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (Intrinsics.areEqual(next.getObjectToken(), this.f116864c)) {
                            t = next;
                            break;
                        }
                    }
                    T t2 = t;
                    if (!(t2 == null || (homeList = this.f116862a.f116819b.getHomeList()) == null || (list2 = homeList.getList()) == null)) {
                        list2.remove(t2);
                    }
                }
                this.f116862a.mo163008i();
                this.f116862a.f116820c.onNext(DataSource.HomeList);
            } else if (i == 2) {
                MinutesListResponse shareList = this.f116862a.f116819b.getShareList();
                if (!(shareList == null || (list3 = shareList.getList()) == null)) {
                    Iterator<T> it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next2 = it2.next();
                        if (Intrinsics.areEqual(next2.getObjectToken(), this.f116864c)) {
                            t = next2;
                            break;
                        }
                    }
                    T t3 = t;
                    if (t3 != null) {
                        C45861b.m181700a().f115692c.mo161176a((Object) t3);
                        MinutesListResponse shareList2 = this.f116862a.f116819b.getShareList();
                        if (!(shareList2 == null || (list4 = shareList2.getList()) == null)) {
                            list4.remove(t3);
                        }
                    }
                }
                this.f116862a.f116820c.onNext(DataSource.ShareList);
            } else if (i == 3) {
                MinutesListResponse myList = this.f116862a.f116819b.getMyList();
                if (!(myList == null || (list5 = myList.getList()) == null)) {
                    Iterator<T> it3 = list5.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        T next3 = it3.next();
                        if (Intrinsics.areEqual(next3.getObjectToken(), this.f116864c)) {
                            t = next3;
                            break;
                        }
                    }
                    T t4 = t;
                    if (t4 != null) {
                        C45861b.m181700a().f115692c.mo161176a((Object) t4);
                        MinutesListResponse myList2 = this.f116862a.f116819b.getMyList();
                        if (!(myList2 == null || (list6 = myList2.getList()) == null)) {
                            list6.remove(t4);
                        }
                    }
                }
                this.f116862a.mo162972a().mo163250b(this.f116862a.f116819b.getMyList());
                this.f116862a.f116820c.onNext(DataSource.MyList);
            } else if (i == 4 && (trashList = this.f116862a.f116819b.getTrashList()) != null && (list7 = trashList.getList()) != null) {
                Iterator<T> it4 = list7.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    T next4 = it4.next();
                    if (Intrinsics.areEqual(next4.getObjectToken(), this.f116864c)) {
                        t = next4;
                        break;
                    }
                }
                T t5 = t;
                if (t5 != null) {
                    String str = this.f116862a.f116818a;
                    C45855f.m181663b(str, "restore target: " + ((Object) t5));
                    MinutesListResponse trashList2 = this.f116862a.f116819b.getTrashList();
                    if (!(trashList2 == null || (list8 = trashList2.getList()) == null)) {
                        list8.remove(t5);
                    }
                    this.f116862a.f116820c.onNext(DataSource.TrashList);
                    if (!this.f116865d) {
                        C45858j.m181677a((int) R.string.MMWeb_G_My_FileRestoredSingular_Toast);
                        this.f116862a.mo162982a(MinutesSummaryData.copy$default(t5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, t5.getCreateTime(), null, null, null, false, null, null, null, 267386879, null));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$d */
    public static final class RunnableC46396d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116866a;

        /* renamed from: b */
        final /* synthetic */ List f116867b;

        /* renamed from: c */
        final /* synthetic */ List f116868c;

        /* renamed from: d */
        final /* synthetic */ DataSource f116869d;

        /* renamed from: e */
        final /* synthetic */ Map f116870e;

        RunnableC46396d(MmListControl mmListControl, List list, List list2, DataSource dataSource, Map map) {
            this.f116866a = mmListControl;
            this.f116867b = list;
            this.f116868c = list2;
            this.f116869d = dataSource;
            this.f116870e = map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v16, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            boolean z;
            float f;
            String rate;
            Float floatOrNull;
            String current;
            Float floatOrNull2;
            List<MinutesStatusData> list = this.f116867b;
            if (list != null) {
                for (MinutesStatusData minutesStatusData : list) {
                    List list2 = this.f116868c;
                    MinutesSummaryData minutesSummaryData = null;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (Intrinsics.areEqual(((MinutesSummaryData) next).getObjectToken(), minutesStatusData.getObjectToken())) {
                                minutesSummaryData = next;
                                break;
                            }
                        }
                        minutesSummaryData = minutesSummaryData;
                    }
                    if (minutesSummaryData != null) {
                        boolean z2 = true;
                        if (this.f116869d == DataSource.TrashList || !minutesStatusData.getInTrash()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (this.f116869d != DataSource.TrashList || minutesStatusData.getInTrash()) {
                            z2 = false;
                        }
                        boolean a = ObjectStatus.Companion.mo161606a(minutesStatusData.getObjectStatus());
                        String str = this.f116866a.f116818a;
                        C45855f.m181664c(str, "isTransformToTrash: " + z + ", isDismissFromTrash: " + z2 + ", isDeleted:" + a);
                        if (a || z || z2) {
                            this.f116868c.remove(this.f116868c.indexOf(minutesSummaryData));
                            Map map = this.f116870e;
                            String objectToken = minutesSummaryData.getObjectToken();
                            if (map != null) {
                                C69121n.m265993j(map).remove(objectToken);
                                this.f116866a.f116820c.onNext(this.f116869d);
                                if (z2 && !a) {
                                    this.f116866a.mo162982a(MinutesSummaryData.copy$default(minutesSummaryData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, minutesSummaryData.getCreateTime(), null, null, null, false, null, null, null, 267386879, null));
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                            }
                        } else {
                            String str2 = this.f116866a.f116818a;
                            C45855f.m181663b(str2, "[bindStatus]  oldStatus: " + minutesSummaryData.getStatus() + " newStatus: " + minutesStatusData.getObjectStatus());
                            String str3 = this.f116866a.f116818a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("[bindStatus]  transcriptProgress: ");
                            sb.append(minutesStatusData.getTranscriptProgress());
                            C45855f.m181663b(str3, sb.toString());
                            MinutesTranscriptProgress transcriptProgress = minutesStatusData.getTranscriptProgress();
                            float f2 = BitmapDescriptorFactory.HUE_RED;
                            if (transcriptProgress == null || (current = transcriptProgress.getCurrent()) == null || (floatOrNull2 = StringsKt.toFloatOrNull(current)) == null) {
                                f = BitmapDescriptorFactory.HUE_RED;
                            } else {
                                f = floatOrNull2.floatValue();
                            }
                            MinutesTranscriptProgress transcriptProgress2 = minutesStatusData.getTranscriptProgress();
                            if (!(transcriptProgress2 == null || (rate = transcriptProgress2.getRate()) == null || (floatOrNull = StringsKt.toFloatOrNull(rate)) == null)) {
                                f2 = floatOrNull.floatValue();
                            }
                            float f3 = (float) 100;
                            this.f116866a.mo162984a(this.f116870e, minutesSummaryData, minutesStatusData, f / f3, f2 / f3);
                            minutesSummaryData.setStatus(minutesStatusData.getObjectStatus());
                            minutesSummaryData.setTopic(minutesStatusData.getTopic());
                            if (this.f116869d == DataSource.TrashList) {
                                minutesSummaryData.setTime(Long.valueOf(minutesStatusData.getExpireTime()));
                            }
                            minutesSummaryData.setDuration(minutesStatusData.getDuration());
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$ae */
    public static final class C46383ae<T> implements Consumer<Long> {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116840a;

        /* renamed from: b */
        final /* synthetic */ DataSource f116841b;

        C46383ae(MmListControl mmListControl, DataSource dataSource) {
            this.f116840a = mmListControl;
            this.f116841b = dataSource;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f116840a.mo163010j(this.f116841b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$ai */
    public static final class C46388ai extends Lambda implements Function1<MinutesListResponse, Unit> {
        final /* synthetic */ String $timestamp;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46388ai(MmListControl mmListControl, String str) {
            super(1);
            this.this$0 = mmListControl;
            this.$timestamp = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MinutesListResponse minutesListResponse) {
            invoke(minutesListResponse);
            return Unit.INSTANCE;
        }

        public final void invoke(MinutesListResponse minutesListResponse) {
            int i;
            Integer offset;
            MinutesListResponse shareList;
            List<MinutesSummaryData> list;
            List<MinutesSummaryData> list2;
            List<MinutesSummaryData> list3;
            Intrinsics.checkParameterIsNotNull(minutesListResponse, "response");
            MmAppreciableListTracker.f118526a.mo165389c();
            try {
                if (Intrinsics.areEqual(this.$timestamp, "0")) {
                    MinutesListResponse shareList2 = this.this$0.f116819b.getShareList();
                    if (!(shareList2 == null || (list3 = shareList2.getList()) == null)) {
                        list3.clear();
                    }
                    this.this$0.f116819b.setShareList(minutesListResponse);
                } else {
                    MinutesListResponse shareList3 = this.this$0.f116819b.getShareList();
                    if (shareList3 != null) {
                        shareList3.setOffset(minutesListResponse.getOffset());
                    }
                    MinutesListResponse shareList4 = this.this$0.f116819b.getShareList();
                    if (shareList4 != null) {
                        shareList4.setSize(minutesListResponse.getSize());
                    }
                    MinutesListResponse shareList5 = this.this$0.f116819b.getShareList();
                    if (shareList5 != null) {
                        shareList5.setTotal(minutesListResponse.getTotal());
                    }
                    MinutesListResponse shareList6 = this.this$0.f116819b.getShareList();
                    if (shareList6 != null) {
                        shareList6.setHasMore(minutesListResponse.getHasMore());
                    }
                    List<MinutesSummaryData> list4 = minutesListResponse.getList();
                    if (list4 != null) {
                        for (T t : list4) {
                            MinutesListResponse shareList7 = this.this$0.f116819b.getShareList();
                            MinutesSummaryData minutesSummaryData = null;
                            if (!(shareList7 == null || (list2 = shareList7.getList()) == null)) {
                                Iterator<T> it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    T next = it.next();
                                    if (next.same(t)) {
                                        minutesSummaryData = next;
                                        break;
                                    }
                                }
                                minutesSummaryData = minutesSummaryData;
                            }
                            if (!(minutesSummaryData != null || (shareList = this.this$0.f116819b.getShareList()) == null || (list = shareList.getList()) == null)) {
                                list.add(t);
                            }
                        }
                    }
                }
                MinutesListResponse shareList8 = this.this$0.f116819b.getShareList();
                if (shareList8 != null) {
                    MinutesListResponse shareList9 = this.this$0.f116819b.getShareList();
                    int i2 = 0;
                    if (shareList9 == null || (offset = shareList9.getOffset()) == null) {
                        i = 0;
                    } else {
                        i = offset.intValue();
                    }
                    Integer size = minutesListResponse.getSize();
                    if (size != null) {
                        i2 = size.intValue();
                    }
                    shareList8.setNextOffset(i + i2);
                }
            } catch (JsonSyntaxException e) {
                String str = this.this$0.f116818a;
                C45855f.m181666e(str, "[getShareList] JsonSyntaxException : " + e);
            }
            this.this$0.mo163009i(DataSource.ShareList);
            MmAppreciableListTracker.f118526a.mo165389c();
            this.this$0.f116820c.onNext(DataSource.ShareList);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class aj extends Lambda implements Function1<C47068a, Unit> {
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aj(MmListControl mmListControl) {
            super(1);
            this.this$0 = mmListControl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47068a aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            String str = this.this$0.f116818a;
            C45855f.m181666e(str, "[getShareList] [onError] error: " + aVar);
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.VideoConference, Scene.MinutesList, Event.minutes_load_list_error, ErrorType.Network, ErrorLevel.Exception, aVar.mo165306a(), null, "Shared", aVar.mo165308c(), false, null, null, null, 6144, null));
            this.this$0.f116820c.onNext(DataSource.ShareList);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class al<T> implements Consumer<DataSource> {

        /* renamed from: a */
        final /* synthetic */ Function0 f116847a;

        al(Function0 function0) {
            this.f116847a = function0;
        }

        /* renamed from: a */
        public final void accept(DataSource dataSource) {
            this.f116847a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class an extends Lambda implements Function1<MinutesListResponse, Unit> {
        final /* synthetic */ String $timestamp;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        an(MmListControl mmListControl, String str) {
            super(1);
            this.this$0 = mmListControl;
            this.$timestamp = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MinutesListResponse minutesListResponse) {
            invoke(minutesListResponse);
            return Unit.INSTANCE;
        }

        public final void invoke(final MinutesListResponse minutesListResponse) {
            Intrinsics.checkParameterIsNotNull(minutesListResponse, "response");
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.list.control.MmListControl.an.RunnableC463921 */

                /* renamed from: a */
                final /* synthetic */ an f116854a;

                {
                    this.f116854a = r1;
                }

                public final void run() {
                    int i;
                    Integer offset;
                    MinutesListResponse trashList;
                    List<MinutesSummaryData> list;
                    List<MinutesSummaryData> list2;
                    List<MinutesSummaryData> list3;
                    if (Intrinsics.areEqual(this.f116854a.$timestamp, "0")) {
                        MinutesListResponse trashList2 = this.f116854a.this$0.f116819b.getTrashList();
                        if (!(trashList2 == null || (list3 = trashList2.getList()) == null)) {
                            list3.clear();
                        }
                        this.f116854a.this$0.f116819b.setTrashList(minutesListResponse);
                    } else {
                        MinutesListResponse trashList3 = this.f116854a.this$0.f116819b.getTrashList();
                        if (trashList3 != null) {
                            trashList3.setOffset(minutesListResponse.getOffset());
                        }
                        MinutesListResponse trashList4 = this.f116854a.this$0.f116819b.getTrashList();
                        if (trashList4 != null) {
                            trashList4.setSize(minutesListResponse.getSize());
                        }
                        MinutesListResponse trashList5 = this.f116854a.this$0.f116819b.getTrashList();
                        if (trashList5 != null) {
                            trashList5.setTotal(minutesListResponse.getTotal());
                        }
                        MinutesListResponse trashList6 = this.f116854a.this$0.f116819b.getTrashList();
                        if (trashList6 != null) {
                            trashList6.setHasMore(minutesListResponse.getHasMore());
                        }
                        List<MinutesSummaryData> list4 = minutesListResponse.getList();
                        if (list4 != null) {
                            for (T t : list4) {
                                MinutesListResponse trashList7 = this.f116854a.this$0.f116819b.getTrashList();
                                MinutesSummaryData minutesSummaryData = null;
                                if (!(trashList7 == null || (list2 = trashList7.getList()) == null)) {
                                    Iterator<T> it = list2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        T next = it.next();
                                        if (next.same(t)) {
                                            minutesSummaryData = next;
                                            break;
                                        }
                                    }
                                    minutesSummaryData = minutesSummaryData;
                                }
                                if (!(minutesSummaryData != null || (trashList = this.f116854a.this$0.f116819b.getTrashList()) == null || (list = trashList.getList()) == null)) {
                                    list.add(t);
                                }
                            }
                        }
                    }
                    MinutesListResponse trashList8 = this.f116854a.this$0.f116819b.getTrashList();
                    if (trashList8 != null) {
                        MinutesListResponse trashList9 = this.f116854a.this$0.f116819b.getTrashList();
                        int i2 = 0;
                        if (trashList9 == null || (offset = trashList9.getOffset()) == null) {
                            i = 0;
                        } else {
                            i = offset.intValue();
                        }
                        Integer size = minutesListResponse.getSize();
                        if (size != null) {
                            i2 = size.intValue();
                        }
                        trashList8.setNextOffset(i + i2);
                    }
                    this.f116854a.this$0.f116820c.onNext(DataSource.TrashList);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class ao extends Lambda implements Function1<C47068a, Unit> {
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ao(MmListControl mmListControl) {
            super(1);
            this.this$0 = mmListControl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47068a aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            String str = this.this$0.f116818a;
            C45855f.m181666e(str, "[getTrashList] [onError] error: " + aVar);
            this.this$0.f116820c.onNext(DataSource.TrashList);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$f */
    public static final class C46398f extends Lambda implements Function1<MinutesListResponse, Unit> {
        final /* synthetic */ String $timestamp;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46398f(MmListControl mmListControl, String str) {
            super(1);
            this.this$0 = mmListControl;
            this.$timestamp = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MinutesListResponse minutesListResponse) {
            invoke(minutesListResponse);
            return Unit.INSTANCE;
        }

        public final void invoke(MinutesListResponse minutesListResponse) {
            int i;
            Integer offset;
            MinutesListResponse homeList;
            List<MinutesSummaryData> list;
            List<MinutesSummaryData> list2;
            List<MinutesSummaryData> list3;
            Intrinsics.checkParameterIsNotNull(minutesListResponse, "response");
            if (Intrinsics.areEqual(this.$timestamp, "0")) {
                MmAppreciableListTracker.f118526a.mo165388b();
                MinutesListResponse homeList2 = this.this$0.f116819b.getHomeList();
                if (!(homeList2 == null || (list3 = homeList2.getList()) == null)) {
                    list3.clear();
                }
                this.this$0.f116819b.setHomeList(minutesListResponse);
                String b = MmRecordManager.f117918g.mo164550b();
                if (b != null) {
                    this.this$0.mo162983a(b);
                }
            } else {
                MinutesListResponse homeList3 = this.this$0.f116819b.getHomeList();
                if (homeList3 != null) {
                    homeList3.setOffset(minutesListResponse.getOffset());
                }
                MinutesListResponse homeList4 = this.this$0.f116819b.getHomeList();
                if (homeList4 != null) {
                    homeList4.setSize(minutesListResponse.getSize());
                }
                MinutesListResponse homeList5 = this.this$0.f116819b.getHomeList();
                if (homeList5 != null) {
                    homeList5.setTotal(minutesListResponse.getTotal());
                }
                MinutesListResponse homeList6 = this.this$0.f116819b.getHomeList();
                if (homeList6 != null) {
                    homeList6.setHasMore(minutesListResponse.getHasMore());
                }
                List<MinutesSummaryData> list4 = minutesListResponse.getList();
                if (list4 != null) {
                    for (T t : list4) {
                        MinutesListResponse homeList7 = this.this$0.f116819b.getHomeList();
                        MinutesSummaryData minutesSummaryData = null;
                        if (!(homeList7 == null || (list2 = homeList7.getList()) == null)) {
                            Iterator<T> it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                if (next.same(t)) {
                                    minutesSummaryData = next;
                                    break;
                                }
                            }
                            minutesSummaryData = minutesSummaryData;
                        }
                        if (!(minutesSummaryData != null || (homeList = this.this$0.f116819b.getHomeList()) == null || (list = homeList.getList()) == null)) {
                            list.add(t);
                        }
                    }
                }
            }
            MinutesListResponse homeList8 = this.this$0.f116819b.getHomeList();
            if (homeList8 != null) {
                MinutesListResponse homeList9 = this.this$0.f116819b.getHomeList();
                int i2 = 0;
                if (homeList9 == null || (offset = homeList9.getOffset()) == null) {
                    i = 0;
                } else {
                    i = offset.intValue();
                }
                Integer size = minutesListResponse.getSize();
                if (size != null) {
                    i2 = size.intValue();
                }
                homeList8.setNextOffset(i + i2);
            }
            this.this$0.mo163009i(DataSource.HomeList);
            if (Intrinsics.areEqual(this.$timestamp, "0")) {
                MmAppreciableListTracker.f118526a.mo165389c();
            }
            this.this$0.f116820c.onNext(DataSource.HomeList);
            if (!MmRecordManager.f117918g.mo164549a()) {
                this.this$0.f116820c.onNext(DataSource.RecordReady);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$g */
    public static final class C46399g extends Lambda implements Function1<C47068a, Unit> {
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46399g(MmListControl mmListControl) {
            super(1);
            this.this$0 = mmListControl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47068a aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "it");
            this.this$0.f116820c.onNext(DataSource.RecordReady);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$k */
    public static final class C46404k extends Lambda implements Function1<C47068a, Unit> {
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46404k(MmListControl mmListControl) {
            super(1);
            this.this$0 = mmListControl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47068a aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            String str = this.this$0.f116818a;
            C45855f.m181666e(str, "[getMyList] [onError] error: " + aVar);
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.VideoConference, Scene.MinutesList, Event.minutes_load_list_error, ErrorType.Network, ErrorLevel.Exception, aVar.mo165306a(), null, "me", aVar.mo165308c(), false, null, null, null, 6144, null));
            this.this$0.f116820c.onNext(DataSource.MyList);
            if (!MmRecordManager.f117918g.mo164549a()) {
                this.this$0.f116820c.onNext(DataSource.RecordReady);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "msg", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$r */
    static final class C46411r extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46411r(MmListControl mmListControl, Context context) {
            super(1);
            this.this$0 = mmListControl;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.this$0.mo162976a(this.$context, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "msg", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$t */
    static final class C46413t extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46413t(MmListControl mmListControl, Context context) {
            super(1);
            this.this$0 = mmListControl;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.this$0.mo162976a(this.$context, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "msg", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$v */
    static final class C46415v extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46415v(MmListControl mmListControl, Context context) {
            super(1);
            this.this$0 = mmListControl;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.this$0.mo162976a(this.$context, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "msg", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$x */
    static final class C46417x extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46417x(MmListControl mmListControl, Context context) {
            super(1);
            this.this$0 = mmListControl;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.this$0.mo162976a(this.$context, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$z */
    static final class C46419z extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ Function1 $onResponse;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46419z(Function1 function1) {
            super(1);
            this.$onResponse = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            this.$onResponse.invoke(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$ag */
    public static final class C46385ag<T> implements Consumer<Long> {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116843a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f116844b;

        C46385ag(MmListControl mmListControl, Ref.BooleanRef booleanRef) {
            this.f116843a = mmListControl;
            this.f116844b = booleanRef;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.list.control.MmListControl.C46385ag.RunnableC463861 */

                /* renamed from: a */
                final /* synthetic */ C46385ag f116845a;

                {
                    this.f116845a = r1;
                }

                public final void run() {
                    List<MinutesSummaryData> list;
                    List<MinutesSummaryData> list2;
                    List<MinutesSummaryData> list3;
                    T t;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(this.f116845a.f116843a.f116819b.getProgressMap());
                    if (linkedHashMap.isEmpty()) {
                        if (this.f116845a.f116844b.element) {
                            this.f116845a.f116844b.element = false;
                            this.f116845a.f116843a.f116820c.onNext(DataSource.Progress);
                        }
                        Disposable disposable = this.f116845a.f116843a.f116822e;
                        if (disposable != null) {
                            disposable.dispose();
                            return;
                        }
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    MinutesListResponse myList = this.f116845a.f116843a.f116819b.getMyList();
                    if (myList == null || (list = myList.getList()) == null) {
                        list = CollectionsKt.emptyList();
                    }
                    arrayList.addAll(list);
                    MinutesListResponse shareList = this.f116845a.f116843a.f116819b.getShareList();
                    if (shareList == null || (list2 = shareList.getList()) == null) {
                        list2 = CollectionsKt.emptyList();
                    }
                    arrayList.addAll(list2);
                    MinutesListResponse homeList = this.f116845a.f116843a.f116819b.getHomeList();
                    if (homeList == null || (list3 = homeList.getList()) == null) {
                        list3 = CollectionsKt.emptyList();
                    }
                    arrayList.addAll(list3);
                    Set a = kotlin.collections.am.m265689a((Object[]) new Integer[]{Integer.valueOf(ObjectStatus.Complete.getValue()), Integer.valueOf(ObjectStatus.Failed.getValue()), Integer.valueOf(ObjectStatus.FileCorrupted.getValue())});
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        Pair pair = (Pair) entry.getValue();
                        ((Number) pair.component1()).intValue();
                        IProgressCalculator bVar = (IProgressCalculator) pair.component2();
                        Iterator<T> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            if (Intrinsics.areEqual(t.getObjectToken(), (String) entry.getKey())) {
                                break;
                            }
                        }
                        T t2 = t;
                        if (bVar.mo163322b()) {
                            String str = this.f116845a.f116843a.f116818a;
                            C45855f.m181663b(str, "[restartUpdateProgressTask] token:" + ((String) entry.getKey()) + " update progress");
                            bVar.mo163321a(elapsedRealtime);
                        } else if ((bVar instanceof CompleteProgressCalculatorImpl) || (t2 != null && CollectionsKt.contains(a, t2.getStatus()))) {
                            String str2 = this.f116845a.f116843a.f116818a;
                            C45855f.m181663b(str2, "[restartUpdateProgressTask2] remove token:" + ((String) entry.getKey()));
                            this.f116845a.f116843a.f116819b.getProgressMap().remove(entry.getKey());
                        }
                    }
                    this.f116845a.f116843a.f116820c.onNext(DataSource.Progress);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "test"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class ak<T> implements AbstractC68322n<DataSource> {

        /* renamed from: a */
        final /* synthetic */ DataSource f116846a;

        ak(DataSource dataSource) {
            this.f116846a = dataSource;
        }

        /* renamed from: a */
        public final boolean test(DataSource dataSource) {
            Intrinsics.checkParameterIsNotNull(dataSource, "it");
            if (dataSource == this.f116846a) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"isProcessing", "", UpdateKey.STATUS, "", "invoke", "(Ljava/lang/Integer;)Z"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class ar extends Lambda implements Function1<Integer, Boolean> {
        public static final ar INSTANCE = new ar();

        ar() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(invoke(num));
        }

        public final boolean invoke(Integer num) {
            if (!ObjectStatus.Companion.mo161607b(num)) {
                int value = ObjectStatus.WaitASR.getValue();
                if (num != null && num.intValue() == value) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: c */
    public final void mo162991c(MinutesSummaryData minutesSummaryData) {
        Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C45859k.m181685a(new RunnableC46397e(this, minutesSummaryData));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadCenter$MmAudioUploadData;", "test"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$ac */
    public static final class C46381ac<T> implements AbstractC68322n<MmAudioUploadCenter.MmAudioUploadData> {

        /* renamed from: a */
        public static final C46381ac f116837a = new C46381ac();

        C46381ac() {
        }

        /* renamed from: a */
        public final boolean test(MmAudioUploadCenter.MmAudioUploadData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "it");
            if (MmRecordManager.f117918g.mo164546a(aVar.mo164914a()) != MmRecordManager.RecordState.STOPPED || aVar.mo164915b() == MmAudioUploadManager.UploadState.UPLOAD_FINISHED) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/control/MmListControl$notifyAudioFinishedToServer$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$l */
    public static final class C46405l extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116875a;

        /* renamed from: b */
        final /* synthetic */ String f116876b;

        /* renamed from: a */
        public void mo161289a(String str) {
            C45855f.m181664c(this.f116875a.f116818a, "[setRecordStopped] succeed");
            MmAudioMonitor.m186477a(MmAudioMonitor.f118586a, true, this.f116876b, (String) null, (Integer) null, 12, (Object) null);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str;
            MmAudioMonitor mmAudioMonitor = MmAudioMonitor.f118586a;
            String str2 = this.f116876b;
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
            C45855f.m181666e(this.f116875a.f116818a, "[setRecordStopped] error: " + aVar);
        }

        C46405l(MmListControl mmListControl, String str) {
            this.f116875a = mmListControl;
            this.f116876b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/control/MmListControl$notifyUploadCompletedToServer$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$m */
    public static final class C46406m extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116877a;

        /* renamed from: b */
        final /* synthetic */ String f116878b;

        /* renamed from: a */
        public void mo161289a(String str) {
            C45855f.m181664c(this.f116877a.f116818a, "[notifyUploadCompletedToServer] succeed");
            MmRecordManager.f117918g.mo164548a(this.f116878b, ObjectStatus.Recording);
            MmAudioMonitor.m186479b(MmAudioMonitor.f118586a, true, this.f116878b, null, null, 12, null);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str;
            C45855f.m181666e(this.f116877a.f116818a, "[notifyUploadCompletedToServer] onError:" + aVar + ' ');
            MmAudioMonitor mmAudioMonitor = MmAudioMonitor.f118586a;
            String str2 = this.f116878b;
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

        C46406m(MmListControl mmListControl, String str) {
            this.f116877a = mmListControl;
            this.f116878b = str;
        }
    }

    /* renamed from: e */
    private final void m183604e(String str) {
        this.f116831s = Intrinsics.areEqual(str, "0");
        mo162972a().mo163249a(str, new an(this, str), new ao(this));
    }

    /* renamed from: b */
    public final void mo162988b(MinutesSummaryData minutesSummaryData) {
        Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C45859k.m181685a(new RunnableC46379aa(this, minutesSummaryData));
    }

    /* renamed from: c */
    public final void mo162992c(String str) {
        if (!StringsKt.isBlank(str)) {
            C47057a.m186244a(str, MmUpdateStatus.RECORD_FINISH, new C46405l(this, str));
        }
    }

    /* renamed from: d */
    public final void mo162996d(MinutesSummaryData minutesSummaryData) {
        Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C45859k.m181685a(new RunnableC46380ab(this, minutesSummaryData));
    }

    /* renamed from: f */
    public final void mo163002f(MinutesSummaryData minutesSummaryData) {
        Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (mo162986b().mo162899e() == MmListRankType.OPEN_TIME) {
            C45859k.m181685a(new aq(this, minutesSummaryData));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$af */
    public static final class C46384af<T> implements Consumer<Long> {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116842a;

        C46384af(MmListControl mmListControl) {
            this.f116842a = mmListControl;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            ArrayList<MinutesSummaryData> duration = this.f116842a.f116819b.getDuration();
            if (duration != null) {
                for (T t : duration) {
                    Long duration2 = t.getDuration();
                    if (duration2 != null) {
                        t.setDuration(Long.valueOf(duration2.longValue() + ((long) 1000)));
                    }
                }
            }
            this.f116842a.f116820c.onNext(DataSource.Duration);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "accept", "com/ss/android/lark/mm/module/list/control/MmListControl$pollRecordingStatus$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$o */
    public static final class C46408o<T> implements Consumer<Pair<? extends String, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116880a;

        C46408o(MmListControl mmListControl) {
            this.f116880a = mmListControl;
        }

        /* renamed from: a */
        public final void accept(Pair<String, String> pair) {
            MinutesSummaryData recording = this.f116880a.f116819b.getRecording();
            if (recording != null) {
                recording.setObjectToken(pair.getFirst());
            }
            MinutesSummaryData recording2 = this.f116880a.f116819b.getRecording();
            if (recording2 != null) {
                recording2.setTopic(pair.getSecond());
            }
            this.f116880a.f116820c.onNext(DataSource.Recording);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "accept", "com/ss/android/lark/mm/module/list/control/MmListControl$pollRecordingStatus$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$p */
    public static final class C46409p<T> implements Consumer<Pair<? extends String, ? extends Long>> {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116881a;

        C46409p(MmListControl mmListControl) {
            this.f116881a = mmListControl;
        }

        /* renamed from: a */
        public final void accept(Pair<String, Long> pair) {
            MinutesSummaryData recording = this.f116881a.f116819b.getRecording();
            if (recording != null) {
                recording.setObjectToken(pair.getFirst());
            }
            MinutesSummaryData recording2 = this.f116881a.f116819b.getRecording();
            if (recording2 != null) {
                recording2.setDuration(pair.getSecond());
            }
            this.f116881a.f116820c.onNext(DataSource.Recording);
        }
    }

    /* renamed from: d */
    public final void mo162997d(String str) {
        if (!StringsKt.isBlank(str)) {
            String str2 = this.f116818a;
            C45855f.m181664c(str2, "[notifyUploadCompletedToServer] start, token: " + str);
            C47057a.m186244a(str, MmUpdateStatus.UPLOAD_COMPLETED, new C46406m(this, str));
        }
    }

    /* renamed from: e */
    public final void mo162999e(DataSource dataSource) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        int i = C46420a.f116885d[dataSource.ordinal()];
        if (i == 1) {
            this.f116819b.setMyList(null);
        } else if (i == 2) {
            this.f116819b.setShareList(null);
        } else if (i == 3) {
            this.f116819b.setHomeList(null);
        } else if (i == 4) {
            this.f116819b.setTrashList(null);
        }
        m183605j();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "kotlin.jvm.PlatformType", "accept", "com/ss/android/lark/mm/module/list/control/MmListControl$pollRecordingStatus$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$n */
    public static final class C46407n<T> implements Consumer<Pair<? extends String, ? extends MmRecordManager.RecordState>> {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116879a;

        C46407n(MmListControl mmListControl) {
            this.f116879a = mmListControl;
        }

        /* renamed from: a */
        public final void accept(Pair<String, ? extends MmRecordManager.RecordState> pair) {
            MinutesSummaryData recording = this.f116879a.f116819b.getRecording();
            if (recording != null) {
                recording.setObjectToken(pair.getFirst());
            }
            MinutesSummaryData recording2 = this.f116879a.f116819b.getRecording();
            if (recording2 != null) {
                recording2.setRecordingStatus((MmRecordManager.RecordState) pair.getSecond());
            }
            if (((MmRecordManager.RecordState) pair.getSecond()) == MmRecordManager.RecordState.STOPPED) {
                this.f116879a.f116820c.onNext(DataSource.RecordReady);
            }
            this.f116879a.f116820c.onNext(DataSource.Recording);
        }
    }

    /* renamed from: b */
    public final MinutesListResponse mo162987b(DataSource dataSource) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        int i = C46420a.f116882a[dataSource.ordinal()];
        if (i == 1) {
            return this.f116819b.getHomeList();
        }
        if (i == 2) {
            return this.f116819b.getMyList();
        }
        if (i == 3) {
            return this.f116819b.getShareList();
        }
        if (i != 4) {
            return null;
        }
        return this.f116819b.getTrashList();
    }

    /* renamed from: c */
    public final boolean mo162993c(DataSource dataSource) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        int i = C46420a.f116883b[dataSource.ordinal()];
        if (i == 1) {
            return this.f116828p;
        }
        if (i == 2) {
            return this.f116830r;
        }
        if (i == 3) {
            return this.f116832t;
        }
        if (i != 4) {
            return false;
        }
        return this.f116831s;
    }

    /* renamed from: d */
    public final List<MinutesSummaryData> mo162995d(DataSource dataSource) {
        MinutesListResponse trashList;
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        int i = C46420a.f116884c[dataSource.ordinal()];
        if (i == 1) {
            MinutesListResponse myList = this.f116819b.getMyList();
            if (myList != null) {
                return myList.getList();
            }
            return null;
        } else if (i == 2) {
            MinutesListResponse shareList = this.f116819b.getShareList();
            if (shareList != null) {
                return shareList.getList();
            }
            return null;
        } else if (i == 3) {
            MinutesListResponse homeList = this.f116819b.getHomeList();
            if (homeList != null) {
                return homeList.getList();
            }
            return null;
        } else if (i == 4 && (trashList = this.f116819b.getTrashList()) != null) {
            return trashList.getList();
        } else {
            return null;
        }
    }

    /* renamed from: e */
    public final void mo163000e(MinutesSummaryData minutesSummaryData) {
        Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (mo162986b().mo162897c() == MmListRankType.OPEN_TIME) {
            C45859k.m181685a(new ap(this, minutesSummaryData));
        }
    }

    /* renamed from: f */
    public final boolean mo163003f(DataSource dataSource) {
        Boolean hasMore;
        Boolean hasMore2;
        Boolean hasMore3;
        MinutesListResponse trashList;
        Boolean hasMore4;
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        int i = C46420a.f116886e[dataSource.ordinal()];
        if (i == 1) {
            MinutesListResponse homeList = this.f116819b.getHomeList();
            if (homeList == null || (hasMore = homeList.getHasMore()) == null) {
                return false;
            }
            return hasMore.booleanValue();
        } else if (i == 2) {
            MinutesListResponse myList = this.f116819b.getMyList();
            if (myList == null || (hasMore2 = myList.getHasMore()) == null) {
                return false;
            }
            return hasMore2.booleanValue();
        } else if (i == 3) {
            MinutesListResponse shareList = this.f116819b.getShareList();
            if (shareList == null || (hasMore3 = shareList.getHasMore()) == null) {
                return false;
            }
            return hasMore3.booleanValue();
        } else if (i != 4 || (trashList = this.f116819b.getTrashList()) == null || (hasMore4 = trashList.getHasMore()) == null) {
            return false;
        } else {
            return hasMore4.booleanValue();
        }
    }

    /* renamed from: g */
    public final void mo163005g(DataSource dataSource) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        int i = C46420a.f116887f[dataSource.ordinal()];
        if (i == 1) {
            m183601a("0", mo162986b().mo162894b());
        } else if (i == 2) {
            m183600a("0", mo162986b().mo162897c().getValue(), mo162986b().mo162898d());
        } else if (i == 3) {
            m183603b("0", mo162986b().mo162899e().getValue(), mo162986b().mo162900f());
        } else if (i == 4) {
            m183604e("0");
        }
        mo162978a(dataSource, 2);
        mo163009i(dataSource);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadCenter$MmAudioUploadData;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$ad */
    public static final class C46382ad<T> implements Consumer<MmAudioUploadCenter.MmAudioUploadData> {

        /* renamed from: a */
        final /* synthetic */ MmListControl f116838a;

        /* renamed from: b */
        final /* synthetic */ DataSource f116839b;

        C46382ad(MmListControl mmListControl, DataSource dataSource) {
            this.f116838a = mmListControl;
            this.f116839b = dataSource;
        }

        /* renamed from: a */
        public final void accept(MmAudioUploadCenter.MmAudioUploadData aVar) {
            String str = this.f116838a.f116818a;
            C45855f.m181663b(str, "[restartPollStatus] data:" + aVar);
            List<MinutesSummaryData> d = this.f116838a.mo162995d(this.f116839b);
            MinutesSummaryData minutesSummaryData = null;
            if (d != null) {
                Iterator<T> it = d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (Intrinsics.areEqual(next.getObjectToken(), aVar.mo164914a())) {
                        minutesSummaryData = next;
                        break;
                    }
                }
                minutesSummaryData = minutesSummaryData;
            }
            if (minutesSummaryData != null && ObjectStatus.Companion.mo161609d(minutesSummaryData.getStatus())) {
                MmListControl mmListControl = this.f116838a;
                mmListControl.f116819b = ListModel.copy$default(mmListControl.f116819b, null, null, null, null, null, null, null, aVar.mo164914a(), aVar.mo164916c(), null, 639, null);
                this.f116838a.f116820c.onNext(DataSource.Uploading);
                this.f116838a.mo163006h();
                this.f116838a.mo163008i();
            }
        }
    }

    /* renamed from: b */
    public final void mo162989b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        IMmListDataRepo.C46422a.m183691a(mo162972a(), str, new C46387ah(this, str), (Function0) null, 4, (Object) null);
    }

    /* renamed from: h */
    public final void mo163007h(DataSource dataSource) {
        List<MinutesSummaryData> list;
        MinutesSummaryData minutesSummaryData;
        Long time;
        List<MinutesSummaryData> list2;
        MinutesSummaryData minutesSummaryData2;
        Long time2;
        List<MinutesSummaryData> list3;
        MinutesSummaryData minutesSummaryData3;
        Long time3;
        List<MinutesSummaryData> list4;
        MinutesSummaryData minutesSummaryData4;
        Long expireTime;
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        int i = C46420a.f116888g[dataSource.ordinal()];
        long j = 0;
        if (i == 1) {
            MinutesListResponse homeList = this.f116819b.getHomeList();
            if (!(homeList == null || (list = homeList.getList()) == null || (minutesSummaryData = (MinutesSummaryData) CollectionsKt.last((List) list)) == null || (time = minutesSummaryData.getTime()) == null)) {
                j = time.longValue();
            }
            m183601a(String.valueOf(j), mo162986b().mo162894b());
        } else if (i == 2) {
            MinutesListResponse myList = this.f116819b.getMyList();
            if (!(myList == null || (list2 = myList.getList()) == null || (minutesSummaryData2 = (MinutesSummaryData) CollectionsKt.last((List) list2)) == null || (time2 = minutesSummaryData2.getTime()) == null)) {
                j = time2.longValue();
            }
            m183600a(String.valueOf(j), mo162986b().mo162897c().getValue(), mo162986b().mo162898d());
        } else if (i == 3) {
            MinutesListResponse shareList = this.f116819b.getShareList();
            if (!(shareList == null || (list3 = shareList.getList()) == null || (minutesSummaryData3 = (MinutesSummaryData) CollectionsKt.last((List) list3)) == null || (time3 = minutesSummaryData3.getTime()) == null)) {
                j = time3.longValue();
            }
            m183603b(String.valueOf(j), mo162986b().mo162899e().getValue(), mo162986b().mo162900f());
        } else if (i == 4) {
            MinutesListResponse trashList = this.f116819b.getTrashList();
            if (!(trashList == null || (list4 = trashList.getList()) == null || (minutesSummaryData4 = (MinutesSummaryData) CollectionsKt.last((List) list4)) == null || (expireTime = minutesSummaryData4.getExpireTime()) == null)) {
                j = expireTime.longValue();
            }
            m183604e(String.valueOf(j));
        }
    }

    /* renamed from: j */
    public final void mo163010j(DataSource dataSource) {
        MinutesListResponse trashList;
        List<MinutesSummaryData> list;
        ArrayList arrayList = new ArrayList();
        int i = C46420a.f116891j[dataSource.ordinal()];
        List<MinutesSummaryData> list2 = null;
        if (i == 1) {
            MinutesListResponse homeList = this.f116819b.getHomeList();
            if (homeList != null) {
                list2 = homeList.getList();
            }
            m183602a(list2, arrayList);
        } else if (i == 2) {
            MinutesListResponse myList = this.f116819b.getMyList();
            if (myList != null) {
                list2 = myList.getList();
            }
            m183602a(list2, arrayList);
        } else if (i == 3) {
            MinutesListResponse shareList = this.f116819b.getShareList();
            if (shareList != null) {
                list2 = shareList.getList();
            }
            m183602a(list2, arrayList);
        } else if (!(i != 4 || (trashList = this.f116819b.getTrashList()) == null || (list = trashList.getList()) == null)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String objectToken = it.next().getObjectToken();
                if (objectToken != null) {
                    arrayList2.add(objectToken);
                }
            }
            arrayList.addAll(arrayList2);
        }
        String str = this.f116818a;
        C45855f.m181664c(str, "[syncStatus] start size: " + arrayList.size() + ", ds: " + dataSource);
        if (arrayList.size() != 0) {
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            AbstractC45897a lifecycleDependency = a.getLifecycleDependency();
            Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
            if (!lifecycleDependency.mo144571b()) {
                C45855f.m181664c(this.f116818a, "[syncStatus] return, because app is in background");
                return;
            }
            IMmDepend a2 = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
            IMmDepend.AbstractC45875c domainDepend = a2.getDomainDepend();
            Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
            C47057a.m186266a(domainDepend.mo144616a(), arrayList.subList(0, Math.min(arrayList.size(), 50)), new am(this, dataSource));
        }
    }

    /* renamed from: i */
    public final void mo163009i(DataSource dataSource) {
        List<MinutesSummaryData> list;
        ArrayList<MinutesSummaryData> duration;
        List<MinutesSummaryData> list2;
        ArrayList<MinutesSummaryData> duration2;
        MinutesListResponse shareList;
        List<MinutesSummaryData> list3;
        ArrayList<MinutesSummaryData> duration3;
        Disposable disposable = this.f116821d;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f116819b.setDuration(new ArrayList<>());
        int i = C46420a.f116889h[dataSource.ordinal()];
        if (i == 1) {
            MinutesListResponse homeList = this.f116819b.getHomeList();
            if (!(homeList == null || (list = homeList.getList()) == null)) {
                for (T t : list) {
                    int value = ObjectStatus.RealTimeRecording.getValue();
                    Integer status = t.getStatus();
                    if (status != null && value == status.intValue() && (!Intrinsics.areEqual((Object) t.isRecordingDevice(), (Object) true)) && (duration = this.f116819b.getDuration()) != null) {
                        duration.add(t);
                    }
                }
            }
        } else if (i == 2) {
            MinutesListResponse myList = this.f116819b.getMyList();
            if (!(myList == null || (list2 = myList.getList()) == null)) {
                for (T t2 : list2) {
                    int value2 = ObjectStatus.RealTimeRecording.getValue();
                    Integer status2 = t2.getStatus();
                    if (status2 != null && value2 == status2.intValue() && (!Intrinsics.areEqual((Object) t2.isRecordingDevice(), (Object) true)) && (duration2 = this.f116819b.getDuration()) != null) {
                        duration2.add(t2);
                    }
                }
            }
        } else if (!(i != 3 || (shareList = this.f116819b.getShareList()) == null || (list3 = shareList.getList()) == null)) {
            for (T t3 : list3) {
                int value3 = ObjectStatus.RealTimeRecording.getValue();
                Integer status3 = t3.getStatus();
                if (!(status3 == null || value3 != status3.intValue() || (duration3 = this.f116819b.getDuration()) == null)) {
                    duration3.add(t3);
                }
            }
        }
        Observable<Long> interval = Observable.interval(f116815h, TimeUnit.SECONDS);
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45893s threadDepend = a.getThreadDepend();
        Intrinsics.checkExpressionValueIsNotNull(threadDepend, "MmDepend.impl().threadDepend");
        this.f116821d = interval.subscribeOn(threadDepend.mo144598a()).subscribe(new C46384af(this));
    }

    /* renamed from: a */
    public final Map<String, Pair<Integer, Integer>> mo162974a(DataSource dataSource) {
        Pair<Integer, IProgressCalculator> pair;
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<MinutesSummaryData> d = mo162995d(dataSource);
        if (d != null) {
            ArrayList<MinutesSummaryData> arrayList = new ArrayList();
            for (T t : d) {
                if (CollectionsKt.contains(this.f116819b.getProgressMap().keySet(), t.getObjectToken())) {
                    arrayList.add(t);
                }
            }
            for (MinutesSummaryData minutesSummaryData : arrayList) {
                String objectToken = minutesSummaryData.getObjectToken();
                if (!(objectToken == null || (pair = this.f116819b.getProgressMap().get(objectToken)) == null)) {
                    linkedHashMap.put(objectToken, TuplesKt.to(pair.getFirst(), Integer.valueOf(pair.getSecond().mo163323c())));
                }
            }
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "response", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "<anonymous parameter 1>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.control.MmListControl$j */
    public static final class C46402j extends Lambda implements Function2<MinutesListResponse, Boolean, Unit> {
        final /* synthetic */ String $timestamp;
        final /* synthetic */ MmListControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46402j(MmListControl mmListControl, String str) {
            super(2);
            this.this$0 = mmListControl;
            this.$timestamp = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(MinutesListResponse minutesListResponse, Boolean bool) {
            invoke(minutesListResponse, bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final MinutesListResponse minutesListResponse, boolean z) {
            Intrinsics.checkParameterIsNotNull(minutesListResponse, "response");
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.list.control.MmListControl.C46402j.RunnableC464031 */

                /* renamed from: a */
                final /* synthetic */ C46402j f116873a;

                {
                    this.f116873a = r1;
                }

                public final void run() {
                    int i;
                    Integer offset;
                    List<MinutesSummaryData> list;
                    MinutesListResponse myList;
                    List<MinutesSummaryData> list2;
                    List<MinutesSummaryData> list3;
                    T t;
                    MinutesListResponse myList2;
                    List<MinutesSummaryData> list4;
                    List<MinutesSummaryData> list5;
                    T t2;
                    List<MinutesSummaryData> list6;
                    if (Intrinsics.areEqual(this.f116873a.$timestamp, "0")) {
                        MmAppreciableListTracker.f118526a.mo165388b();
                    }
                    T t3 = null;
                    if (Intrinsics.areEqual(this.f116873a.$timestamp, "0")) {
                        MinutesListResponse myList3 = this.f116873a.this$0.f116819b.getMyList();
                        if (!(myList3 == null || (list6 = myList3.getList()) == null)) {
                            list6.clear();
                        }
                        this.f116873a.this$0.f116819b.setMyList(minutesListResponse);
                        String b = MmRecordManager.f117918g.mo164550b();
                        if (b != null) {
                            this.f116873a.this$0.mo162983a(b);
                        }
                    } else {
                        MinutesListResponse myList4 = this.f116873a.this$0.f116819b.getMyList();
                        if (myList4 != null) {
                            myList4.setOffset(minutesListResponse.getOffset());
                        }
                        MinutesListResponse myList5 = this.f116873a.this$0.f116819b.getMyList();
                        if (myList5 != null) {
                            myList5.setSize(minutesListResponse.getSize());
                        }
                        MinutesListResponse myList6 = this.f116873a.this$0.f116819b.getMyList();
                        if (myList6 != null) {
                            myList6.setTotal(minutesListResponse.getTotal());
                        }
                        MinutesListResponse myList7 = this.f116873a.this$0.f116819b.getMyList();
                        if (myList7 != null) {
                            myList7.setHasMore(minutesListResponse.getHasMore());
                        }
                        List<MinutesSummaryData> list7 = minutesListResponse.getList();
                        if (list7 != null) {
                            for (T t4 : list7) {
                                MinutesListResponse myList8 = this.f116873a.this$0.f116819b.getMyList();
                                if (myList8 == null || (list5 = myList8.getList()) == null) {
                                    t = null;
                                } else {
                                    Iterator<T> it = list5.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            t2 = null;
                                            break;
                                        }
                                        t2 = it.next();
                                        if (t2.same(t4)) {
                                            break;
                                        }
                                    }
                                    t = t2;
                                }
                                if (!(t != null || (myList2 = this.f116873a.this$0.f116819b.getMyList()) == null || (list4 = myList2.getList()) == null)) {
                                    list4.add(t4);
                                }
                            }
                        }
                    }
                    MinutesListResponse myList9 = this.f116873a.this$0.f116819b.getMyList();
                    if (!(myList9 == null || (list = myList9.getList()) == null)) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            T next = it2.next();
                            if (Intrinsics.areEqual(next.getObjectToken(), this.f116873a.this$0.f116819b.getUploadingToken())) {
                                t3 = next;
                                break;
                            }
                        }
                        T t5 = t3;
                        if (!(t5 == null || (myList = this.f116873a.this$0.f116819b.getMyList()) == null || (list2 = myList.getList()) == null)) {
                            int indexOf = list2.indexOf(t5);
                            MinutesListResponse myList10 = this.f116873a.this$0.f116819b.getMyList();
                            if (!(myList10 == null || (list3 = myList10.getList()) == null)) {
                                list3.set(indexOf, MinutesSummaryData.copy$default(t5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, this.f116873a.this$0.f116819b.getUploadingProgress(), null, null, 234881023, null));
                            }
                        }
                    }
                    MinutesListResponse myList11 = this.f116873a.this$0.f116819b.getMyList();
                    if (myList11 != null) {
                        MinutesListResponse myList12 = this.f116873a.this$0.f116819b.getMyList();
                        int i2 = 0;
                        if (myList12 == null || (offset = myList12.getOffset()) == null) {
                            i = 0;
                        } else {
                            i = offset.intValue();
                        }
                        Integer size = minutesListResponse.getSize();
                        if (size != null) {
                            i2 = size.intValue();
                        }
                        myList11.setNextOffset(i + i2);
                    }
                    this.f116873a.this$0.mo163009i(DataSource.MyList);
                    if (Intrinsics.areEqual(this.f116873a.$timestamp, "0")) {
                        MmAppreciableListTracker.f118526a.mo165389c();
                    }
                    this.f116873a.this$0.f116820c.onNext(DataSource.MyList);
                    if (!MmRecordManager.f117918g.mo164549a()) {
                        this.f116873a.this$0.f116820c.onNext(DataSource.RecordReady);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private final void m183601a(String str, MmOwnerType mmOwnerType) {
        this.f116828p = Intrinsics.areEqual(str, "0");
        MmAppreciableListTracker.f118526a.mo165386a();
        mo162972a().mo163246a(str, mmOwnerType, new C46398f(this, str), new C46399g(this));
    }

    /* renamed from: a */
    private final void m183602a(List<MinutesSummaryData> list, List<String> list2) {
        if (list != null) {
            for (T t : list) {
                if (!ObjectStatus.Companion.mo161607b(t.getStatus()) && !ObjectStatus.Companion.mo161608c(t.getStatus())) {
                    Integer status = t.getStatus();
                    int value = ObjectStatus.WaitASR.getValue();
                    if (status != null) {
                        if (status.intValue() != value) {
                        }
                    }
                }
                String objectToken = t.getObjectToken();
                if (objectToken != null) {
                    list2.add(objectToken);
                }
            }
        }
    }

    /* renamed from: a */
    public final Disposable mo162973a(DataSource dataSource, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(dataSource, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(function0, "onChanged");
        Observable<DataSource> filter = this.f116820c.filter(new ak(dataSource));
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45893s threadDepend = a.getThreadDepend();
        Intrinsics.checkExpressionValueIsNotNull(threadDepend, "MmDepend.impl().threadDepend");
        Disposable subscribe = filter.subscribeOn(threadDepend.mo144598a()).observeOn(AndroidSchedulers.mainThread()).subscribe(new al(function0));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "dataSubject\n            …anged()\n                }");
        return subscribe;
    }

    /* renamed from: a */
    private final void m183600a(String str, int i, boolean z) {
        MmAppreciableListTracker.f118526a.mo165386a();
        this.f116830r = Intrinsics.areEqual(str, "0");
        mo162972a().mo163245a(str, i, z, new C46402j(this, str), new C46404k(this));
    }

    /* renamed from: b */
    private final void m183603b(String str, int i, boolean z) {
        this.f116832t = Intrinsics.areEqual(str, "0");
        MmAppreciableListTracker.f118526a.mo165386a();
        mo162972a().mo163244a(str, i, z, new C46388ai(this, str), new aj(this));
    }

    /* renamed from: a */
    public static /* synthetic */ void m183598a(MmListControl mmListControl, DataSource dataSource, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = f116814g;
        }
        mmListControl.mo162978a(dataSource, j);
    }

    /* renamed from: a */
    static /* synthetic */ void m183599a(MmListControl mmListControl, DataSource dataSource, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        mmListControl.mo162980a(dataSource, str, z);
    }
}
