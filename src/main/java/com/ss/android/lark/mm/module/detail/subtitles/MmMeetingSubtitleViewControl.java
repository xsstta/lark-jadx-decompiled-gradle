package com.ss.android.lark.mm.module.detail.subtitles;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.AbstractC26401f;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.ss.android.lark.mm.depend.AbstractC45897a;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.C45950b;
import com.ss.android.lark.mm.module.detail.MmDetailErrorFactory;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency;
import com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.MmEditSpeakerProxy;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.MmEditStateManager;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmSubtitleDataAdapter;
import com.ss.android.lark.mm.module.detail.subtitles.model.ParagraphHighlightInfoViewModel;
import com.ss.android.lark.mm.module.detail.subtitles.model.SentenceHighlightInfoViewModel;
import com.ss.android.lark.mm.module.detail.subtitles.model.response.ReplyCommentRes;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.player.p2308a.C46587a;
import com.ss.android.lark.mm.module.share.model.PermissionStatus;
import com.ss.android.lark.mm.module.translate.RvHidingScrollListener;
import com.ss.android.lark.mm.p2288b.C45850b;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableDetailTracker;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47085h;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47114n;
import com.ss.android.lark.mm.utils.ktextensions.C47108b;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.MmLoadingView;
import com.ss.android.lark.mm.widget.pullrefresh.MmRefreshHeadView;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68315g;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004:\u0002\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\b\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000204H\u0002J\b\u00106\u001a\u000204H\u0002J.\u00107\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u00010<2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002090>H\u0002J\b\u0010?\u001a\u00020\u0000H\u0016J\b\u0010@\u001a\u00020\u0000H\u0016J\b\u0010A\u001a\u000204H\u0002J\b\u0010B\u001a\u000204H\u0003J\b\u0010C\u001a\u000204H\u0002J\u0010\u0010D\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u000204H\u0002J \u0010H\u001a\b\u0012\u0004\u0012\u00020F0I2\u0006\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020\u001cH\u0002J\u0018\u0010M\u001a\u0002042\u0006\u0010N\u001a\u00020 2\u0006\u0010O\u001a\u00020PH\u0016J \u0010Q\u001a\u0002042\u0006\u0010R\u001a\u00020<2\u0006\u0010S\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020\u001cH\u0016J\u001e\u0010U\u001a\u0002042\u0006\u0010J\u001a\u00020K2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020W0VH\u0016J\u0010\u0010X\u001a\u0002042\u0006\u0010N\u001a\u00020 H\u0016J\b\u0010Y\u001a\u000204H\u0016J\b\u0010Z\u001a\u000204H\u0016J\b\u0010[\u001a\u000204H\u0016J\u0012\u0010\\\u001a\u0002042\b\u0010]\u001a\u0004\u0018\u00010^H\u0016J\u0010\u0010_\u001a\u0002042\u0006\u0010`\u001a\u00020 H\u0016J\u0010\u0010a\u001a\u0002042\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010b\u001a\u0002042\b\u0010c\u001a\u0004\u0018\u00010dH\u0016J\u0018\u0010e\u001a\u0002042\u0006\u0010f\u001a\u00020#2\u0006\u0010g\u001a\u00020\u001cH\u0016J\u0018\u0010h\u001a\u0002042\u0006\u0010N\u001a\u00020 2\u0006\u0010i\u001a\u00020\u001cH\u0016J\u0018\u0010j\u001a\u0002042\u0006\u0010N\u001a\u00020 2\u0006\u0010k\u001a\u00020lH\u0016J6\u0010m\u001a\u0002042\b\u0010n\u001a\u0004\u0018\u00010o2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020<0V2\u0014\u0010q\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u000209\u0018\u00010rH\u0016J\u0018\u0010s\u001a\u0002042\u0006\u0010t\u001a\u00020\u00142\u0006\u0010u\u001a\u00020 H\u0016J\b\u0010v\u001a\u000204H\u0016J\b\u0010w\u001a\u000204H\u0016J\b\u0010x\u001a\u000204H\u0016J\b\u0010y\u001a\u000204H\u0016J\b\u0010z\u001a\u000204H\u0016J\b\u0010{\u001a\u000204H\u0016J\b\u0010|\u001a\u000204H\u0016J\b\u0010}\u001a\u000204H\u0016J\u0010\u0010~\u001a\u0002042\u0006\u0010\u001a\u00020\u001cH\u0016J\t\u0010\u0001\u001a\u000204H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0004\n\u0002\u0010!R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b%\u0010&R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020 00X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u00101\u001a\u000602R\u00020\u0000X.¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleListener;", "Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleDependency;", "Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "adapter", "Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitlesAdapter;", "backGroundHandler", "Landroid/os/Handler;", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "currentFindResult", "Ljava/util/LinkedList;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/SentenceHighlightInfoViewModel;", "filterParagraphs", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "handlerThread", "Landroid/os/HandlerThread;", "getHandlerThread", "()Landroid/os/HandlerThread;", "handlerThread$delegate", "Lkotlin/Lazy;", "isFinding", "", "isVideoPlayerCompletelyVisible", "lastFindResult", "lastObjectStatus", "", "Ljava/lang/Integer;", "lastPlayingTs", "", "mainHandler", "getMainHandler", "()Landroid/os/Handler;", "mainHandler$delegate", "mmEditSpeakerProxy", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerProxy;", "simpleThrottleUtil", "Lcom/ss/android/lark/mm/utils/MmSimpleThrottleUtil;", "getSimpleThrottleUtil", "()Lcom/ss/android/lark/mm/utils/MmSimpleThrottleUtil;", "simpleThrottleUtil$delegate", "syncParaPositions", "", "viewHolder", "Lcom/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControl$MmSubtitleViewHolder;", "addScrollListener", "", "checkNeedShowReSyncLayout", "clearLoading", "findTargetMentionComment", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail;", "mentionCommentId", "", "originComments", "", "getMmInquirer", "getMmListener", "initData", "initRecyclerView", "initViews", "isShowEmptyView", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "jumpToComments", "loadSubtitles", "Lio/reactivex/Single;", "translateLangType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "isFromNetwork", "onChangeCurrentFocusComment", "adapterPosition", "highlightRange", "Lkotlin/ranges/IntRange;", "onChangeKeyword", "content", "auto", "keyword", "onChangeTranslateLang", "", "", "onCommentDialogDismiss", "onCreate", "onDestroy", "onExitOriginTextDialog", "onFindResult", "findResponse", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "onFindResultFocusChange", "index", "onFindingStateChange", "onMmStatusChange", UpdateKey.STATUS, "Lcom/ss/android/lark/mm/module/share/model/PermissionStatus;", "onPlaying", "timeStamp", "isByUser", "onPostCommentDialogDismiss", "isPostSucceed", "onPostCommentSuc", "res", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/response/ReplyCommentRes;", "onPushChangeParaComment", Comment.f24093e, "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "needUpdateParaIds", "commentMap", "Ljava/util/HashMap;", "onPushChangeSubtitlePara", "para", "paraPosition", "onReBindSubtitle", "onRefresh", "onSeekManual", "onStartFind", "onStartPlay", "onStopFind", "onStopPlay", "onStopScroll", "onVideoPlayerCompletelyVisibleChange", "isCompletelyVisible", "refreshData", "MmSubtitleViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e */
public final class MmMeetingSubtitleViewControl extends MmBaseViewControl<IMmMeetingSubtitleListener, IMmMeetingSubtitleDependency> implements IMmMeetingSubtitleInquirer, IMmMeetingSubtitleListener {

    /* renamed from: a */
    public MmSubtitleViewHolder f116385a;

    /* renamed from: b */
    public MmSubtitlesAdapter f116386b;

    /* renamed from: c */
    public final LinkedList<MmMeetingParagraph> f116387c = new LinkedList<>();

    /* renamed from: d */
    public final List<Integer> f116388d = new ArrayList();

    /* renamed from: e */
    public final MmBaseInfo f116389e;

    /* renamed from: f */
    public LinkedList<SentenceHighlightInfoViewModel> f116390f;

    /* renamed from: g */
    public final LinkedList<SentenceHighlightInfoViewModel> f116391g;

    /* renamed from: h */
    public long f116392h;

    /* renamed from: i */
    public MmEditSpeakerProxy f116393i;

    /* renamed from: j */
    public final IMmViewControlContext f116394j;

    /* renamed from: k */
    public final MmBaseViewControlAdapter<IMmMeetingSubtitleListener, IMmMeetingSubtitleDependency> f116395k;

    /* renamed from: l */
    private boolean f116396l;

    /* renamed from: m */
    private boolean f116397m;

    /* renamed from: n */
    private final Lazy f116398n = LazyKt.lazy(C46184c.INSTANCE);

    /* renamed from: o */
    private Handler f116399o;

    /* renamed from: p */
    private final Lazy f116400p = LazyKt.lazy(C46196k.INSTANCE);

    /* renamed from: q */
    private final Lazy f116401q = LazyKt.lazy(C46211t.INSTANCE);

    /* renamed from: r */
    private Integer f116402r;

    /* renamed from: B */
    private final HandlerThread m182914B() {
        return (HandlerThread) this.f116398n.getValue();
    }

    /* renamed from: C */
    private final C47114n m182915C() {
        return (C47114n) this.f116401q.getValue();
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: g */
    public void mo162290g() {
    }

    /* renamed from: n */
    public final Handler mo162325n() {
        return (Handler) this.f116400p.getValue();
    }

    /* renamed from: t */
    public MmMeetingSubtitleViewControl mo161243c() {
        return this;
    }

    /* renamed from: u */
    public MmMeetingSubtitleViewControl mo161244e() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\u0006\u0010#\u001a\u00020 J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J\b\u0010'\u001a\u00020 H\u0002J\u0006\u0010(\u001a\u00020 J\u0006\u0010)\u001a\u00020 J\u0006\u0010*\u001a\u00020 J\u0006\u0010+\u001a\u00020 J\u0006\u0010,\u001a\u00020 R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControl$MmSubtitleViewHolder;", "", "rootView", "Landroid/view/View;", "(Lcom/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControl;Landroid/view/View;)V", "bottomReSyncLayout", "bottomReSyncTextView", "bottomReSyncView", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "emptyContainer", "Landroid/widget/FrameLayout;", "getEmptyContainer", "()Landroid/widget/FrameLayout;", "loadingView", "Lcom/ss/android/lark/mm/widget/MmLoadingView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "refreshLayout", "Lcom/lcodecore/tkrefreshlayout/TwinklingRefreshLayout;", "getRefreshLayout", "()Lcom/lcodecore/tkrefreshlayout/TwinklingRefreshLayout;", "getRootView", "()Landroid/view/View;", "topReSyncLayout", "topReSyncTextView", "topReSyncView", "dismissAsLoading", "", "dismissBottomReSyncLayout", "dismissTopReSyncLayout", "initRefreshLayout", "isReachBottom", "", "isReachTop", "reSyncPlayPosition", "restoreReSyncPosition", "showAsrLoading", "showBottomReSyncLayout", "showTopReSyncLayout", "upReSyncPositionWhenSearching", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$a */
    public final class MmSubtitleViewHolder {

        /* renamed from: a */
        public final View f116403a;

        /* renamed from: b */
        public final View f116404b;

        /* renamed from: c */
        public final View f116405c;

        /* renamed from: d */
        public final View f116406d;

        /* renamed from: e */
        public final View f116407e;

        /* renamed from: f */
        public final View f116408f;

        /* renamed from: g */
        final /* synthetic */ MmMeetingSubtitleViewControl f116409g;

        /* renamed from: h */
        private final RecyclerView f116410h;

        /* renamed from: i */
        private final TwinklingRefreshLayout f116411i;

        /* renamed from: j */
        private final FrameLayout f116412j;

        /* renamed from: k */
        private final MmLoadingView f116413k;

        /* renamed from: l */
        private final ConstraintLayout f116414l;

        /* renamed from: m */
        private final View f116415m;

        /* renamed from: a */
        public final RecyclerView mo162333a() {
            return this.f116410h;
        }

        /* renamed from: b */
        public final TwinklingRefreshLayout mo162334b() {
            return this.f116411i;
        }

        /* renamed from: c */
        public final FrameLayout mo162335c() {
            return this.f116412j;
        }

        /* renamed from: f */
        public final void mo162338f() {
            this.f116403a.setVisibility(8);
        }

        /* renamed from: h */
        public final void mo162340h() {
            this.f116406d.setVisibility(8);
        }

        /* renamed from: k */
        public final boolean mo162343k() {
            return !this.f116410h.canScrollVertically(1);
        }

        /* renamed from: l */
        public final void mo162344l() {
            this.f116413k.mo165613a();
            this.f116413k.setVisibility(8);
        }

        /* renamed from: i */
        public final void mo162341i() {
            this.f116413k.setVisibility(0);
            MmLoadingView mmLoadingView = this.f116413k;
            String string = this.f116415m.getContext().getString(R.string.MMWeb_G_TranscriptionInProgress);
            Intrinsics.checkExpressionValueIsNotNull(string, "rootView.context.getStri…_TranscriptionInProgress)");
            mmLoadingView.mo165614a(string);
        }

        /* renamed from: j */
        public final boolean mo162342j() {
            RecyclerView.LayoutManager layoutManager = this.f116410h.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager == null || linearLayoutManager.findFirstCompletelyVisibleItemPosition() != 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$a$b */
        public static final class C46181b extends Lambda implements Function0<Unit> {
            final /* synthetic */ MmSubtitleViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46181b(MmSubtitleViewHolder aVar) {
                super(0);
                this.this$0 = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f116408f.setVisibility(8);
                this.this$0.f116407e.setPadding(0, 0, 0, 0);
                ViewGroup.LayoutParams layoutParams = this.this$0.f116407e.getLayoutParams();
                layoutParams.width = C57582a.m223600a(48);
                layoutParams.height = C57582a.m223600a(48);
                this.this$0.f116407e.setLayoutParams(layoutParams);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$a$c */
        public static final class C46182c extends Lambda implements Function0<Unit> {
            final /* synthetic */ MmSubtitleViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46182c(MmSubtitleViewHolder aVar) {
                super(0);
                this.this$0 = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f116405c.setVisibility(8);
                this.this$0.f116404b.setPadding(0, 0, 0, 0);
                ViewGroup.LayoutParams layoutParams = this.this$0.f116404b.getLayoutParams();
                layoutParams.width = C57582a.m223600a(48);
                layoutParams.height = C57582a.m223600a(48);
                this.this$0.f116404b.setLayoutParams(layoutParams);
            }
        }

        /* renamed from: e */
        public final void mo162337e() {
            C46182c cVar = new C46182c(this);
            this.f116403a.setVisibility(0);
            C45859k.m181687b(new RunnableC46254g(cVar));
            C45859k.m181686a(new RunnableC46254g(cVar), 3000);
        }

        /* renamed from: g */
        public final void mo162339g() {
            C46181b bVar = new C46181b(this);
            this.f116406d.setVisibility(0);
            C45859k.m181687b(new RunnableC46254g(bVar));
            C45859k.m181686a(new RunnableC46254g(bVar), 3000);
        }

        /* renamed from: d */
        public final void mo162336d() {
            int i;
            MmSubtitlesAdapter mmSubtitlesAdapter = this.f116409g.f116386b;
            if (mmSubtitlesAdapter != null) {
                this.f116410h.stopScroll();
                mmSubtitlesAdapter.mo162169a(MmSubtitlesAdapter.ScrollMode.AutoFlipPage);
                if (!mmSubtitlesAdapter.mo162162a().isEmpty()) {
                    RecyclerView.LayoutManager layoutManager = this.f116410h.getLayoutManager();
                    if (layoutManager != null) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        int intValue = ((Number) CollectionsKt.last((List) mmSubtitlesAdapter.mo162162a())).intValue();
                        Rect b = mmSubtitlesAdapter.mo162181b();
                        if (b != null) {
                            i = b.top;
                        } else {
                            i = 0;
                        }
                        linearLayoutManager.scrollToPositionWithOffset(intValue, -i);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
            }
        }

        /* renamed from: m */
        public final void mo162345m() {
            MmMeetingSubtitleViewControl.m182919a(this.f116409g).f116411i.setOnRefreshListener(new C46180a(this));
            MmMeetingSubtitleViewControl.m182919a(this.f116409g).f116411i.setNestedScrollingEnabled(false);
            MmRefreshHeadView mmRefreshHeadView = new MmRefreshHeadView(this.f116409g.f116394j.mo161232n());
            mmRefreshHeadView.setProgressBackgroundColorSchemeResource(R.color.bg_body);
            MmMeetingSubtitleViewControl.m182919a(this.f116409g).f116411i.setHeaderView(mmRefreshHeadView);
            MmMeetingSubtitleViewControl.m182919a(this.f116409g).f116411i.setHeaderHeight(48.0f);
            MmMeetingSubtitleViewControl.m182919a(this.f116409g).f116411i.setOverScrollHeight(10.0f);
            MmMeetingSubtitleViewControl.m182919a(this.f116409g).f116411i.setEnableRefresh(true);
            MmMeetingSubtitleViewControl.m182919a(this.f116409g).f116411i.setEnableLoadmore(false);
            MmMeetingSubtitleViewControl.m182919a(this.f116409g).f116411i.setEnableOverScroll(false);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControl$MmSubtitleViewHolder$initRefreshLayout$1", "Lcom/lcodecore/tkrefreshlayout/RefreshListenerAdapter;", "onPullingDown", "", "refreshLayout", "Lcom/lcodecore/tkrefreshlayout/TwinklingRefreshLayout;", "fraction", "", "onRefresh", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$a$a */
        public static final class C46180a extends AbstractC26401f {

            /* renamed from: a */
            final /* synthetic */ MmSubtitleViewHolder f116416a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C46180a(MmSubtitleViewHolder aVar) {
                this.f116416a = aVar;
            }

            @Override // com.lcodecore.tkrefreshlayout.AbstractC26401f, com.lcodecore.tkrefreshlayout.AbstractC26400e
            /* renamed from: a */
            public void mo93516a(TwinklingRefreshLayout twinklingRefreshLayout) {
                super.mo93516a(twinklingRefreshLayout);
                this.f116416a.f116409g.mo162326o();
            }

            @Override // com.lcodecore.tkrefreshlayout.AbstractC26401f, com.lcodecore.tkrefreshlayout.AbstractC26400e
            /* renamed from: a */
            public void mo93517a(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
                super.mo93517a(twinklingRefreshLayout, f);
                ((IMmMeetingSubtitleDependency) this.f116416a.f116409g.mo161247w()).mo162270v();
                MmSubtitlesAdapter mmSubtitlesAdapter = this.f116416a.f116409g.f116386b;
                if (mmSubtitlesAdapter != null) {
                    MmSubtitlesAdapter.m182737a(mmSubtitlesAdapter, false, 1, null);
                }
            }
        }

        public MmSubtitleViewHolder(MmMeetingSubtitleViewControl eVar, View view) {
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f116409g = eVar;
            this.f116415m = view;
            View findViewById = view.findViewById(R.id.recyclerView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.recyclerView)");
            this.f116410h = (RecyclerView) findViewById;
            View findViewById2 = view.findViewById(R.id.swipeRefreshLayout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.swipeRefreshLayout)");
            this.f116411i = (TwinklingRefreshLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.emptyContainer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.emptyContainer)");
            this.f116412j = (FrameLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.transcriptionLoadingView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.…transcriptionLoadingView)");
            this.f116413k = (MmLoadingView) findViewById4;
            View findViewById5 = view.findViewById(R.id.layout_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.layout_container)");
            this.f116414l = (ConstraintLayout) findViewById5;
            View findViewById6 = view.findViewById(R.id.topReSyncLayout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById(R.id.topReSyncLayout)");
            this.f116403a = findViewById6;
            View findViewById7 = view.findViewById(R.id.topReSyncView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.findViewById(R.id.topReSyncView)");
            this.f116404b = findViewById7;
            View findViewById8 = view.findViewById(R.id.topReSyncTextView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "rootView.findViewById(R.id.topReSyncTextView)");
            this.f116405c = findViewById8;
            View findViewById9 = view.findViewById(R.id.bottomReSyncLayout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById9, "rootView.findViewById(R.id.bottomReSyncLayout)");
            this.f116406d = findViewById9;
            View findViewById10 = view.findViewById(R.id.bottomReSyncView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById10, "rootView.findViewById(R.id.bottomReSyncView)");
            this.f116407e = findViewById10;
            View findViewById11 = view.findViewById(R.id.bottomReSyncTextView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById11, "rootView.findViewById(R.id.bottomReSyncTextView)");
            this.f116408f = findViewById11;
            C47110e.m186573a(findViewById6, new Function1<View, Unit>(this) {
                /* class com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleViewControl.MmSubtitleViewHolder.C461781 */
                final /* synthetic */ MmSubtitleViewHolder this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke(view);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view) {
                    Intrinsics.checkParameterIsNotNull(view, "it");
                    C47083e.m186425a(C47085h.m186430a(this.this$0.f116409g.f116389e), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("return_to_video_position").mo165416b().mo165413a("location", "subtitle_above").mo165421c());
                    this.this$0.f116403a.setVisibility(8);
                    if (this.this$0.f116409g.f116386b != null) {
                        this.this$0.mo162336d();
                    }
                }
            });
            C47110e.m186573a(findViewById9, new Function1<View, Unit>(this) {
                /* class com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleViewControl.MmSubtitleViewHolder.C461792 */
                final /* synthetic */ MmSubtitleViewHolder this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke(view);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view) {
                    Intrinsics.checkParameterIsNotNull(view, "it");
                    C47083e.m186425a(C47085h.m186430a(this.this$0.f116409g.f116389e), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("return_to_video_position").mo165416b().mo165413a("location", "subtitle_below").mo165421c());
                    this.this$0.f116406d.setVisibility(8);
                    this.this$0.mo162336d();
                }
            });
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: l */
    public void mo162294l() {
        mo162326o();
    }

    /* renamed from: a */
    public final boolean mo162324a(MmMeetingSubtitles mmMeetingSubtitles) {
        if (mmMeetingSubtitles.getParagraphs() != null && !mmMeetingSubtitles.getParagraphs().isEmpty()) {
            return false;
        }
        MmDetailErrorFactory cVar = MmDetailErrorFactory.f115916a;
        MmSubtitleViewHolder aVar = this.f116385a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        cVar.mo161622b(aVar.mo162335c());
        MmSubtitleViewHolder aVar2 = this.f116385a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar2.mo162334b().setEnableRefresh(false);
        mo162327p();
        return true;
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: a */
    public void mo162286a(boolean z) {
        boolean z2;
        this.f116397m = z;
        MmSubtitleViewHolder aVar = this.f116385a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        TwinklingRefreshLayout b = aVar.mo162334b();
        if (this.f116397m && !this.f116396l) {
            MmSubtitleViewHolder aVar2 = this.f116385a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
            }
            if (aVar2.mo162342j()) {
                z2 = true;
                b.setEnableRefresh(z2);
            }
        }
        z2 = false;
        b.setEnableRefresh(z2);
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: a */
    public void mo162285a(PermissionStatus permissionStatus) {
        Integer objectStatus;
        MmBaseInfo mmBaseInfo;
        Integer num = this.f116402r;
        int value = ObjectStatus.WaitASR.getValue();
        if (num != null && num.intValue() == value) {
            Integer objectStatus2 = permissionStatus != null ? permissionStatus.getObjectStatus() : null;
            int value2 = ObjectStatus.Complete.getValue();
            if (objectStatus2 != null && objectStatus2.intValue() == value2 && (mmBaseInfo = this.f116389e) != null && !mmBaseInfo.isRecordingObjectType()) {
                mo162326o();
            }
        }
        this.f116402r = Integer.valueOf((permissionStatus == null || (objectStatus = permissionStatus.getObjectStatus()) == null) ? -1 : objectStatus.intValue());
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: a */
    public void mo162280a(long j, boolean z) {
        MmSubtitlesAdapter mmSubtitlesAdapter;
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        AbstractC45897a lifecycleDependency = a.getLifecycleDependency();
        Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
        if (lifecycleDependency.mo144571b()) {
            if (z && (mmSubtitlesAdapter = this.f116386b) != null) {
                mmSubtitlesAdapter.mo162169a(MmSubtitlesAdapter.ScrollMode.AutoFlipPage);
            }
            MmMeetingSubtitles c = this.f116395k.mo161230c().mo162251c();
            if (c != null && c.getParagraphs() != null && !c.getParagraphs().isEmpty()) {
                Handler handler = this.f116399o;
                if (handler == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("backGroundHandler");
                }
                handler.post(new RunnableC46200n(this, j, c, z));
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: a */
    public void mo162282a(FindResponse findResponse) {
        Handler handler = this.f116399o;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backGroundHandler");
        }
        handler.post(new RunnableC46197l(this, findResponse));
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: a */
    public void mo162284a(MmTranslateLangType mmTranslateLangType, List<? extends Object> list) {
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLangType");
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
        if (mmSubtitlesAdapter != null) {
            Object obj = list.get(0);
            if (obj != null) {
                List<MmMeetingParagraph> paragraphs = ((MmMeetingSubtitles) obj).getParagraphs();
                Object obj2 = list.get(1);
                if (obj2 != null) {
                    List<String> list2 = (List) obj2;
                    Object obj3 = list.get(2);
                    if (obj3 != null) {
                        mmSubtitlesAdapter.mo162176a(paragraphs, list2, (MmComment) obj3);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mm.module.detail.comment.model.MmComment");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles");
            }
        }
        MmSubtitlesAdapter mmSubtitlesAdapter2 = this.f116386b;
        if (mmSubtitlesAdapter2 != null) {
            mmSubtitlesAdapter2.mo162173a(mmTranslateLangType);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: a */
    public void mo162283a(MmMeetingParagraph mmMeetingParagraph, int i) {
        Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "para");
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
        if (mmSubtitlesAdapter != null) {
            MmSubtitlesAdapter.m182735a(mmSubtitlesAdapter, mmMeetingParagraph, i, false, 4, (Object) null);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: a */
    public void mo162281a(MmComment mmComment, List<String> list, HashMap<String, MmComment.MmCommentInfo> hashMap) {
        Intrinsics.checkParameterIsNotNull(list, "needUpdateParaIds");
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
        if (mmSubtitlesAdapter != null) {
            MmSubtitlesAdapter.m182734a(mmSubtitlesAdapter, mmComment, (List) list, false, 4, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/HandlerThread;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$c */
    static final class C46184c extends Lambda implements Function0<HandlerThread> {
        public static final C46184c INSTANCE = new C46184c();

        C46184c() {
            super(0);
        }

        public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
            return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HandlerThread invoke() {
            return new_android_os_HandlerThread_by_knot("mm_t1");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControl$initData$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$d */
    public static final class RunnableC46185d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116418a;

        RunnableC46185d(MmMeetingSubtitleViewControl eVar) {
            this.f116418a = eVar;
        }

        public final void run() {
            this.f116418a.mo162329r();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/utils/MmSimpleThrottleUtil;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$t */
    static final class C46211t extends Lambda implements Function0<C47114n> {
        public static final C46211t INSTANCE = new C46211t();

        C46211t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C47114n invoke() {
            return new C47114n();
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: i */
    public void mo162291i() {
        m182921b(true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControl$addScrollListener$1", "Lcom/ss/android/lark/mm/module/translate/RvHidingScrollListener;", "onHide", "", "onScrollStateChanged", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "onShow", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$b */
    public static final class C46183b extends RvHidingScrollListener {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116417a;

        @Override // com.ss.android.lark.mm.module.translate.RvHidingScrollListener
        /* renamed from: a */
        public void mo161310a() {
            ((IMmMeetingSubtitleDependency) this.f116417a.mo161247w()).mo162267s();
        }

        @Override // com.ss.android.lark.mm.module.translate.RvHidingScrollListener
        /* renamed from: b */
        public void mo161311b() {
            ((IMmMeetingSubtitleDependency) this.f116417a.mo161247w()).mo162268t();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46183b(MmMeetingSubtitleViewControl eVar) {
            this.f116417a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                try {
                    float computeVerticalScrollOffset = ((float) recyclerView.computeVerticalScrollOffset()) / ((float) (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent()));
                    if (computeVerticalScrollOffset < ((float) 0)) {
                        computeVerticalScrollOffset = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (computeVerticalScrollOffset > 1.0f) {
                        computeVerticalScrollOffset = 1.0f;
                    }
                    C47083e.m186425a(C47085h.m186430a(this.f116417a.f116389e), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("subtitle_progress").mo165412a("rate_of_subtitle_progress", Float.valueOf(computeVerticalScrollOffset)).mo165416b().mo165421c());
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.ss.android.lark.mm.module.translate.RvHidingScrollListener, androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f116417a.mo162330s();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControl$initRecyclerView$2", "Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitlesAdapter$MmTransAdapterDepend;", "canComment", "", "getBottomPanelHeight", "", "getContext", "Landroid/content/Context;", "getRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getTopTabLayoutPositionY", "isOriginalTextDialogShowing", "isPlaying", "isUnCompletedRecording", "isUnCompletedStatus", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$g */
    public static final class C46188g implements MmSubtitlesAdapter.MmTransAdapterDepend {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116421a;

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterDepend
        /* renamed from: a */
        public Context mo162220a() {
            return this.f116421a.f116394j.mo161232n();
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterDepend
        /* renamed from: b */
        public RecyclerView mo162221b() {
            return MmMeetingSubtitleViewControl.m182919a(this.f116421a).mo162333a();
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterDepend
        /* renamed from: d */
        public int mo162223d() {
            return ((IMmMeetingSubtitleDependency) this.f116421a.mo161247w()).mo162257i();
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterDepend
        /* renamed from: e */
        public boolean mo162224e() {
            return ((IMmMeetingSubtitleDependency) this.f116421a.mo161247w()).mo162258j();
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterDepend
        /* renamed from: f */
        public boolean mo162225f() {
            return ((IMmMeetingSubtitleDependency) this.f116421a.mo161247w()).mo162263o();
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterDepend
        /* renamed from: c */
        public int mo162222c() {
            return ((IMmMeetingSubtitleDependency) this.f116421a.mo161247w()).mo162235a(this.f116421a.f116394j.mo161232n());
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterDepend
        /* renamed from: g */
        public boolean mo162226g() {
            MmBaseInfo a = ((IMmMeetingSubtitleDependency) this.f116421a.mo161247w()).mo162237a();
            if (a == null || a.getObjectStatus() != ObjectStatus.Complete.getValue()) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterDepend
        /* renamed from: h */
        public boolean mo162227h() {
            MmBaseInfo a = ((IMmMeetingSubtitleDependency) this.f116421a.mo161247w()).mo162237a();
            if (a == null || !a.isUncompletedRecordingType()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterDepend
        /* renamed from: i */
        public boolean mo162228i() {
            MmBaseInfo a = ((IMmMeetingSubtitleDependency) this.f116421a.mo161247w()).mo162237a();
            if (a == null || !a.isCanComment()) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46188g(MmMeetingSubtitleViewControl eVar) {
            this.f116421a = eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$k */
    static final class C46196k extends Lambda implements Function0<Handler> {
        public static final C46196k INSTANCE = new C46196k();

        C46196k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$m */
    static final class RunnableC46199m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116439a;

        /* renamed from: b */
        final /* synthetic */ int f116440b;

        RunnableC46199m(MmMeetingSubtitleViewControl eVar, int i) {
            this.f116439a = eVar;
            this.f116440b = i;
        }

        public final void run() {
            MmSubtitlesAdapter mmSubtitlesAdapter = this.f116439a.f116386b;
            if (mmSubtitlesAdapter != null) {
                mmSubtitlesAdapter.mo162193f(this.f116440b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$o */
    static final class RunnableC46202o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116447a;

        /* renamed from: b */
        final /* synthetic */ int f116448b;

        RunnableC46202o(MmMeetingSubtitleViewControl eVar, int i) {
            this.f116447a = eVar;
            this.f116448b = i;
        }

        public final void run() {
            MmSubtitlesAdapter mmSubtitlesAdapter = this.f116447a.f116386b;
            if (mmSubtitlesAdapter != null) {
                mmSubtitlesAdapter.mo162182b(this.f116448b);
            }
        }
    }

    /* renamed from: D */
    private final void m182916D() {
        m182918F();
        MmSubtitleViewHolder aVar = this.f116385a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo162345m();
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: b */
    public void mo162287b() {
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
        if (mmSubtitlesAdapter != null) {
            mmSubtitlesAdapter.mo162169a(MmSubtitlesAdapter.ScrollMode.AutoFlipPage);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: j */
    public void mo162292j() {
        m182921b(false);
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
        if (mmSubtitlesAdapter != null) {
            mmSubtitlesAdapter.mo162192f();
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: k */
    public void mo162293k() {
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
        if (mmSubtitlesAdapter != null) {
            mmSubtitlesAdapter.mo162188d(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$n */
    public static final class RunnableC46200n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116441a;

        /* renamed from: b */
        final /* synthetic */ long f116442b;

        /* renamed from: c */
        final /* synthetic */ MmMeetingSubtitles f116443c;

        /* renamed from: d */
        final /* synthetic */ boolean f116444d;

        RunnableC46200n(MmMeetingSubtitleViewControl eVar, long j, MmMeetingSubtitles mmMeetingSubtitles, boolean z) {
            this.f116441a = eVar;
            this.f116442b = j;
            this.f116443c = mmMeetingSubtitles;
            this.f116444d = z;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControl$onPlaying$1$3$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$n$a */
        static final class RunnableC46201a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ List f116445a;

            /* renamed from: b */
            final /* synthetic */ RunnableC46200n f116446b;

            RunnableC46201a(List list, RunnableC46200n nVar) {
                this.f116445a = list;
                this.f116446b = nVar;
            }

            public final void run() {
                MmSubtitlesAdapter mmSubtitlesAdapter = this.f116446b.f116441a.f116386b;
                if (mmSubtitlesAdapter != null) {
                    List<MmMeetingParagraph> paragraphs = this.f116446b.f116443c.getParagraphs();
                    Intrinsics.checkExpressionValueIsNotNull(paragraphs, "subtitles.paragraphs");
                    mmSubtitlesAdapter.mo162177a(paragraphs, this.f116445a, this.f116446b.f116444d);
                }
            }
        }

        public final void run() {
            int i;
            List<MmMeetingParagraph> paragraphs;
            if (this.f116441a.f116392h >= this.f116442b || !(!this.f116441a.f116388d.isEmpty())) {
                i = 0;
            } else {
                i = this.f116441a.f116388d.get(0).intValue();
            }
            List<Integer> a = MmSubtitleDataAdapter.f116552a.mo162567a(this.f116442b, this.f116443c, this.f116441a.f116387c, i);
            if (a != null) {
                this.f116441a.f116388d.clear();
                this.f116441a.f116388d.addAll(a);
                this.f116441a.f116391g.clear();
                List<Integer> list = a;
                ArrayList<MmMeetingParagraph> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f116443c.getParagraphs().get(it.next().intValue()));
                }
                for (MmMeetingParagraph mmMeetingParagraph : arrayList) {
                    LinkedList<SentenceHighlightInfoViewModel> linkedList = this.f116441a.f116391g;
                    Intrinsics.checkExpressionValueIsNotNull(mmMeetingParagraph, "it");
                    linkedList.addAll(mmMeetingParagraph.getSyncHighLightModel());
                }
                if (!this.f116441a.f116390f.containsAll(this.f116441a.f116391g)) {
                    C45859k.m181685a(new RunnableC46201a(a, this));
                }
                this.f116441a.f116392h = this.f116442b;
                this.f116441a.f116390f.clear();
                this.f116441a.f116390f.addAll(this.f116441a.f116391g);
            } else if (!C45850b.m181645a() || (paragraphs = this.f116443c.getParagraphs()) == null || !(!paragraphs.isEmpty())) {
                C45855f.m181666e("MmSubtitleViewControl", "[timeStampToHighlightMode], token:" + C45950b.m182104a(this.f116441a.f116394j.mo161232n()).bc_() + " , result is null ts:" + this.f116442b);
            } else {
                throw new IllegalStateException("timestamp(" + this.f116442b + ") highlight result must not be null!!!");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$l */
    static final class RunnableC46197l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116435a;

        /* renamed from: b */
        final /* synthetic */ FindResponse f116436b;

        RunnableC46197l(MmMeetingSubtitleViewControl eVar, FindResponse findResponse) {
            this.f116435a = eVar;
            this.f116436b = findResponse;
        }

        public final void run() {
            final ParagraphHighlightInfoViewModel a = MmSubtitleDataAdapter.f116552a.mo162566a(this.f116436b, ((IMmMeetingSubtitleDependency) this.f116435a.mo161247w()).mo162251c());
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleViewControl.RunnableC46197l.RunnableC461981 */

                /* renamed from: a */
                final /* synthetic */ RunnableC46197l f116437a;

                {
                    this.f116437a = r1;
                }

                public final void run() {
                    MmSubtitlesAdapter mmSubtitlesAdapter = this.f116437a.f116435a.f116386b;
                    if (mmSubtitlesAdapter != null) {
                        mmSubtitlesAdapter.mo162172a(a);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: f */
    public void mo162289f() {
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
        if (mmSubtitlesAdapter != null) {
            mmSubtitlesAdapter.mo162169a(MmSubtitlesAdapter.ScrollMode.AutoFlipPage);
        }
        MmSubtitlesAdapter mmSubtitlesAdapter2 = this.f116386b;
        if (mmSubtitlesAdapter2 != null) {
            mmSubtitlesAdapter2.mo162186c(true);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: m */
    public void mo162295m() {
        List<MmMeetingParagraph> list;
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
        if (mmSubtitlesAdapter != null) {
            MmMeetingSubtitles c = ((IMmMeetingSubtitleDependency) mo161247w()).mo162251c();
            if (c != null) {
                list = c.getParagraphs();
            } else {
                list = null;
            }
            mmSubtitlesAdapter.mo162175a(list);
        }
    }

    /* renamed from: r */
    public final void mo162329r() {
        MmSubtitleViewHolder aVar = this.f116385a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo162333a().addOnScrollListener(new C46183b(this));
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: a */
    public void mo162275a() {
        MmSubtitleViewHolder aVar = this.f116385a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo162333a().stopNestedScroll(1);
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: h */
    public void mo161245h() {
        super.mo161245h();
        MmEditSpeakerProxy bVar = this.f116393i;
        if (bVar != null) {
            bVar.mo162392e();
        }
        m182914B().quitSafely();
        C45855f.m181664c("MmSubtitleViewControl", "onDestroy");
        MmEditStateManager f = ((IMmMeetingSubtitleDependency) mo161247w()).mo162254f();
        if (f != null) {
            f.mo162475k();
        }
        ((IMmMeetingSubtitleDependency) mo161247w()).mo162271w();
    }

    /* renamed from: p */
    public final void mo162327p() {
        MmSubtitleViewHolder aVar = this.f116385a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo162344l();
        if (((IMmMeetingSubtitleDependency) mo161247w()).mo162262n()) {
            ((IMmMeetingSubtitleDependency) mo161247w()).mo162266r();
        }
        MmSubtitleViewHolder aVar2 = this.f116385a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar2.mo162334b().mo93527f();
    }

    /* renamed from: F */
    private final void m182918F() {
        MmSubtitleViewHolder aVar = this.f116385a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo162333a().setLayoutManager(new MmMeetingSubtitleViewControl$initRecyclerView$1(this, this.f116394j.mo161232n()));
        this.f116386b = new MmSubtitlesAdapter(new C46188g(this), new C46189h(this));
        MmSubtitleViewHolder aVar2 = this.f116385a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar2.mo162333a().setItemAnimator(null);
        MmSubtitleViewHolder aVar3 = this.f116385a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar3.mo162333a().setAdapter(this.f116386b);
        MmSubtitleViewHolder aVar4 = this.f116385a;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar4.mo162333a().setOnTouchListener(new View$OnTouchListenerC46190i(this));
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        C45855f.m181664c("MmSubtitleViewControl", "onCreate");
        m182914B().start();
        this.f116399o = new Handler(m182914B().getLooper());
        this.f116385a = new MmSubtitleViewHolder(this, this.f116394j.mo161233o());
        m182916D();
        this.f116393i = new MmEditSpeakerProxy(this.f116394j.mo161232n(), this.f116386b, this, (IMmMeetingSubtitleDependency) mo161247w());
        MmBaseInfo mmBaseInfo = this.f116389e;
        if (mmBaseInfo == null || !mmBaseInfo.isWaitingAsrState() || this.f116389e.isRecordingObjectType()) {
            m182917E();
            return;
        }
        MmAppreciableDetailTracker.f118515a.mo165380d();
        MmSubtitleViewHolder aVar = this.f116385a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo162341i();
        MmAppreciableDetailTracker.f118515a.mo165381e();
        MmAppreciableDetailTracker.m186382f();
    }

    /* renamed from: o */
    public final void mo162326o() {
        MmTranslateLangType p = ((IMmMeetingSubtitleDependency) mo161247w()).mo162264p();
        Disposable subscribe = Single.zip(m182920a(p, true), ((IMmMeetingSubtitleDependency) mo161247w()).mo162238a(p), ((IMmMeetingSubtitleDependency) mo161247w()).mo162248b(p), ((IMmMeetingSubtitleDependency) mo161247w()).mo162247b(), C46207q.f116456a).observeOn(AndroidSchedulers.mainThread()).subscribe(new C46208r(this), new C46209s(this));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "Single.zip(loadSubtitles…ding()\n                })");
        C47108b.m186566a(subscribe, this.f116394j.mo161232n());
    }

    /* renamed from: q */
    public final void mo162328q() {
        Map<String, MmComment.MmCommentInfo> comments;
        Collection<MmComment.MmCommentInfo> values;
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        String l = ((IMmMeetingSubtitleDependency) mo161247w()).mo162260l();
        MmComment e = ((IMmMeetingSubtitleDependency) mo161247w()).mo162253e();
        if (e != null && (comments = e.getComments()) != null && (values = comments.values()) != null && ((IMmMeetingSubtitleDependency) mo161247w()).mo162259k()) {
            String str = l;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C45857i.m181676a(new RunnableC46191j(this, l, values, currentTimeMillis));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$j */
    public static final class RunnableC46191j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116424a;

        /* renamed from: b */
        final /* synthetic */ String f116425b;

        /* renamed from: c */
        final /* synthetic */ Collection f116426c;

        /* renamed from: d */
        final /* synthetic */ long f116427d;

        RunnableC46191j(MmMeetingSubtitleViewControl eVar, String str, Collection collection, long j) {
            this.f116424a = eVar;
            this.f116425b = str;
            this.f116426c = collection;
            this.f116427d = j;
        }

        public final void run() {
            final Integer num;
            List<MmMeetingParagraph> paragraphs;
            int i;
            Pair<MmComment.MmCommentInfo, MmComment.MmCommentInfo.CommentDetail> a = this.f116424a.mo162323a(this.f116425b, this.f116426c);
            if (a == null) {
                C45859k.m181685a(RunnableC461921.f116428a);
                return;
            }
            MmSubtitlesAdapter mmSubtitlesAdapter = this.f116424a.f116386b;
            if (mmSubtitlesAdapter != null) {
                String pid = a.getFirst().getPid();
                Intrinsics.checkExpressionValueIsNotNull(pid, "target.first.pid");
                num = mmSubtitlesAdapter.mo162161a(pid);
            } else {
                num = null;
            }
            if (num == null || num.intValue() < 0) {
                C45855f.m181666e("MmSubtitleViewControl", a.getFirst().getPid() + " can't find target adapterPosition");
                C45859k.m181685a(RunnableC461932.f116429a);
                return;
            }
            final int indexOf = a.getFirst().getComment_list().indexOf(a.getSecond());
            if (indexOf >= 0) {
                MmMeetingSubtitles c = ((IMmMeetingSubtitleDependency) this.f116424a.mo161247w()).mo162251c();
                if (c != null && (paragraphs = c.getParagraphs()) != null) {
                    MmSubtitlesAdapter mmSubtitlesAdapter2 = this.f116424a.f116386b;
                    if (mmSubtitlesAdapter2 != null) {
                        i = mmSubtitlesAdapter2.mo162187d(num.intValue());
                    } else {
                        i = 0;
                    }
                    final MmMeetingParagraph mmMeetingParagraph = paragraphs.get(i);
                    if (mmMeetingParagraph != null) {
                        C45859k.m181686a(new Runnable(this) {
                            /* class com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleViewControl.RunnableC46191j.RunnableC461943 */

                            /* renamed from: a */
                            final /* synthetic */ RunnableC46191j f116430a;

                            {
                                this.f116430a = r1;
                            }

                            public final void run() {
                                ((IMmMeetingSubtitleDependency) this.f116430a.f116424a.mo161247w()).mo162243a(mmMeetingParagraph, num.intValue(), indexOf, this.f116430a.f116425b, ((IMmMeetingSubtitleDependency) this.f116430a.f116424a.mo161247w()).mo162261m());
                                C45855f.m181664c("MmSubtitleViewControl", "[jumpToComments] spend time: " + (System.currentTimeMillis() - this.f116430a.f116427d));
                            }
                        }, 200);
                        return;
                    }
                    return;
                }
                return;
            }
            C45859k.m181685a(RunnableC461954.f116434a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$p */
    static final class RunnableC46203p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116449a;

        /* renamed from: b */
        final /* synthetic */ ReplyCommentRes f116450b;

        /* renamed from: c */
        final /* synthetic */ int f116451c;

        RunnableC46203p(MmMeetingSubtitleViewControl eVar, ReplyCommentRes replyCommentRes, int i) {
            this.f116449a = eVar;
            this.f116450b = replyCommentRes;
            this.f116451c = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
            r0 = r1.get(r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 146
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleViewControl.RunnableC46203p.run():void");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$p$a */
        public static final class C46206a<T> implements Comparator<T> {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(t2.getCreate_time()), Long.valueOf(t.getCreate_time()));
            }
        }
    }

    /* renamed from: E */
    private final void m182917E() {
        C45855f.m181664c("MmAppreciableDetailTracker", "subtitle init data");
        MmTranslateLangType p = ((IMmMeetingSubtitleDependency) mo161247w()).mo162264p();
        MmMeetingSubtitles c = ((IMmMeetingSubtitleDependency) mo161247w()).mo162251c();
        if (c != null) {
            C45855f.m181664c("MmAppreciableDetailTracker", "subtitle init data finish");
            MmAppreciableDetailTracker.f118515a.mo165380d();
            if (mo162324a(c)) {
                MmAppreciableDetailTracker.f118515a.mo165381e();
                MmAppreciableDetailTracker.m186382f();
                return;
            }
            MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
            if (mmSubtitlesAdapter != null) {
                mmSubtitlesAdapter.mo162176a(c.getParagraphs(), ((IMmMeetingSubtitleDependency) mo161247w()).mo162255g(), (MmComment) null);
            }
            MmSubtitleViewHolder aVar = this.f116385a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
            }
            TwinklingRefreshLayout b = aVar.mo162334b();
            MmSubtitleViewHolder aVar2 = this.f116385a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
            }
            b.setEnableRefresh(aVar2.mo162342j());
            MmBaseInfo mmBaseInfo = this.f116389e;
            if (mmBaseInfo != null) {
                mo162280a((long) C46587a.m184217b(mmBaseInfo.getObjectToken()), true);
            }
            C45859k.m181686a(new RunnableC46185d(this), 200);
            MmAppreciableDetailTracker.f118515a.mo165381e();
            MmAppreciableDetailTracker.m186382f();
            mo162327p();
        }
        Disposable subscribe = ((IMmMeetingSubtitleDependency) mo161247w()).mo162248b(p).observeOn(AndroidSchedulers.mainThread()).subscribe(new C46186e(this), C46187f.f116420a);
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "getDependency().getComme…:$it\")\n                })");
        C47108b.m186566a(subscribe, this.f116394j.mo161232n());
    }

    /* renamed from: s */
    public final void mo162330s() {
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
        if (mmSubtitlesAdapter != null && !mmSubtitlesAdapter.mo162162a().isEmpty()) {
            int i = ((IMmMeetingSubtitleDependency) mo161247w()).mo162257i();
            int h = ((IMmMeetingSubtitleDependency) mo161247w()).mo162256h();
            int g = mmSubtitlesAdapter.mo162194g();
            int intValue = ((Number) CollectionsKt.last((List) mmSubtitlesAdapter.mo162162a())).intValue();
            MmSubtitleViewHolder aVar = this.f116385a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
            }
            RecyclerView.LayoutManager layoutManager = aVar.mo162333a().getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (i <= g && h >= g && findFirstVisibleItemPosition <= intValue && findLastVisibleItemPosition >= intValue) {
                    C45855f.m181663b("MmSubtitleViewControl", "in visible area");
                    MmSubtitleViewHolder aVar2 = this.f116385a;
                    if (aVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
                    }
                    aVar2.mo162338f();
                    MmSubtitleViewHolder aVar3 = this.f116385a;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
                    }
                    aVar3.mo162340h();
                } else if (g < i || intValue < findFirstVisibleItemPosition) {
                    C45855f.m181663b("MmSubtitleViewControl", "above");
                    MmSubtitleViewHolder aVar4 = this.f116385a;
                    if (aVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
                    }
                    aVar4.mo162337e();
                } else {
                    MmSubtitleViewHolder aVar5 = this.f116385a;
                    if (aVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
                    }
                    if (!aVar5.mo162343k()) {
                        C45855f.m181663b("MmSubtitleViewControl", "bottom");
                        MmSubtitleViewHolder aVar6 = this.f116385a;
                        if (aVar6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
                        }
                        aVar6.mo162339g();
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J0\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bH\u0016¨\u0006\u0018"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControl$initRecyclerView$3", "Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitlesAdapter$MmTransAdapterCallback;", "onFindKeyword", "", "keyword", "", "onPostComment", "start", "", "end", "quote", "paragraph", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "adapterPosition", "onSeek", "timeStamp", "", "onShowSuggestedSpeakerDialog", "paraPosition", "paragraphId", "currentSpeakerUserId", "onViewParaComments", "locationPosition", "showOriginalTextDialog", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$h */
    public static final class C46189h implements MmSubtitlesAdapter.MmTransAdapterCallback {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116422a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46189h(MmMeetingSubtitleViewControl eVar) {
            this.f116422a = eVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterCallback
        /* renamed from: a */
        public void mo162219a(String str) {
            ((IMmMeetingSubtitleDependency) this.f116422a.mo161247w()).mo162244a(str);
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterCallback
        /* renamed from: a */
        public void mo162214a(int i) {
            List<MmMeetingParagraph> paragraphs;
            MmMeetingSubtitles d = ((IMmMeetingSubtitleDependency) this.f116422a.mo161247w()).mo162252d();
            if (d != null && (paragraphs = d.getParagraphs()) != null && (!paragraphs.isEmpty())) {
                MmMeetingParagraph mmMeetingParagraph = d.getParagraphs().get(i);
                Intrinsics.checkExpressionValueIsNotNull(mmMeetingParagraph, "subtitle.paragraphs[paraPosition]");
                ((IMmMeetingSubtitleDependency) this.f116422a.mo161247w()).mo162242a(mmMeetingParagraph);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterCallback
        /* renamed from: a */
        public void mo162218a(long j) {
            String objectToken;
            MmMeetingSubtitleViewControl.m182919a(this.f116422a).mo162340h();
            MmMeetingSubtitleViewControl.m182919a(this.f116422a).mo162338f();
            ((IMmMeetingSubtitleDependency) this.f116422a.mo161247w()).mo162241a(j);
            MmBaseInfo a = ((IMmMeetingSubtitleDependency) this.f116422a.mo161247w()).mo162237a();
            if (a != null && (objectToken = a.getObjectToken()) != null) {
                C46587a.m184215a(objectToken, (int) j);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterCallback
        /* renamed from: a */
        public void mo162215a(int i, int i2) {
            List<MmMeetingParagraph> paragraphs;
            int i3;
            C47083e.m186423a(this.f116422a.f116394j.mo161232n(), "vc_mm_click_button", C47086i.m186432a().mo165409a("view_comment").mo165421c());
            C47083e.m186423a(this.f116422a.f116394j.mo161232n(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("view_comment").mo165423e("none").mo165421c());
            MmMeetingSubtitles c = this.f116422a.f116395k.mo161230c().mo162251c();
            if (c != null && (paragraphs = c.getParagraphs()) != null) {
                MmSubtitlesAdapter mmSubtitlesAdapter = this.f116422a.f116386b;
                if (mmSubtitlesAdapter != null) {
                    i3 = mmSubtitlesAdapter.mo162187d(i);
                } else {
                    i3 = 0;
                }
                MmMeetingParagraph mmMeetingParagraph = paragraphs.get(i3);
                if (mmMeetingParagraph != null) {
                    IMmMeetingSubtitleDependency.C46168a.m182852a(this.f116422a.f116395k.mo161230c(), mmMeetingParagraph, i, i2, null, null, 24, null);
                }
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterCallback
        /* renamed from: a */
        public void mo162217a(int i, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "paragraphId");
            Intrinsics.checkParameterIsNotNull(str2, "currentSpeakerUserId");
            MmEditSpeakerProxy bVar = this.f116422a.f116393i;
            if (bVar != null) {
                bVar.mo162387a(this.f116422a.f116394j.mo161232n(), str, str2);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MmTransAdapterCallback
        /* renamed from: a */
        public void mo162216a(int i, int i2, String str, MmMeetingParagraph mmMeetingParagraph, int i3) {
            Intrinsics.checkParameterIsNotNull(str, "quote");
            Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "paragraph");
            ((IMmMeetingSubtitleDependency) this.f116422a.mo161247w()).mo162265q();
            ((IMmMeetingSubtitleDependency) this.f116422a.mo161247w()).mo162240a(i, i2, str, mmMeetingParagraph, i3);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$e */
    public static final class C46186e<T> implements Consumer<MmComment> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116419a;

        C46186e(MmMeetingSubtitleViewControl eVar) {
            this.f116419a = eVar;
        }

        /* renamed from: a */
        public final void accept(MmComment mmComment) {
            MmSubtitlesAdapter mmSubtitlesAdapter = this.f116419a.f116386b;
            if (mmSubtitlesAdapter != null) {
                mmSubtitlesAdapter.mo162167a(mmComment);
            }
            this.f116419a.mo162328q();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MmSubtitleViewHolder m182919a(MmMeetingSubtitleViewControl eVar) {
        MmSubtitleViewHolder aVar = eVar.f116385a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$f */
    public static final class C46187f<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C46187f f116420a = new C46187f();

        C46187f() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C45855f.m181666e("MmSubtitleViewControl", "load keywords & comments failed, error:" + th);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: b */
    public void mo162288b(int i) {
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
        if (mmSubtitlesAdapter != null) {
            mmSubtitlesAdapter.mo162166a(i, (IntRange) null);
        }
        MmSubtitlesAdapter mmSubtitlesAdapter2 = this.f116386b;
        if (mmSubtitlesAdapter2 != null) {
            mmSubtitlesAdapter2.mo162163a(i);
        }
    }

    /* renamed from: b */
    private final void m182921b(boolean z) {
        boolean z2;
        this.f116396l = z;
        MmSubtitleViewHolder aVar = this.f116385a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        TwinklingRefreshLayout b = aVar.mo162334b();
        if (!z && this.f116397m) {
            MmSubtitleViewHolder aVar2 = this.f116385a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
            }
            if (aVar2.mo162342j()) {
                z2 = true;
                b.setEnableRefresh(z2);
            }
        }
        z2 = false;
        b.setEnableRefresh(z2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$s */
    public static final class C46209s<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116458a;

        C46209s(MmMeetingSubtitleViewControl eVar) {
            this.f116458a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C45855f.m181666e("MmSubtitleViewControl", "loadData failed, " + th);
            MmMeetingSubtitleViewControl.m182919a(this.f116458a).mo162334b().setEnableRefresh(false);
            MmSubtitlesAdapter mmSubtitlesAdapter = this.f116458a.f116386b;
            if (mmSubtitlesAdapter != null && mmSubtitlesAdapter.getItemCount() == 0) {
                MmDetailErrorFactory.f115916a.mo161618a(this.f116458a.f116394j.mo161232n(), C45950b.m182104a(this.f116458a.f116394j.mo161232n()).mo161319c(), MmMeetingSubtitleViewControl.m182919a(this.f116458a).mo162335c(), ((IMmMeetingSubtitleDependency) this.f116458a.mo161247w()).mo162237a(), new Function0<Unit>(this) {
                    /* class com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleViewControl.C46209s.C462101 */
                    final /* synthetic */ C46209s this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final void invoke() {
                        this.this$0.f116458a.mo162326o();
                    }
                });
            }
            this.f116458a.mo162327p();
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: a */
    public void mo162276a(int i) {
        m182915C().mo165502a(new RunnableC46199m(this, i));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007 \b*\u001c\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Triple;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "", "", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$r */
    public static final class C46208r<T> implements Consumer<Triple<? extends MmMeetingSubtitles, ? extends List<? extends String>, ? extends MmComment>> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116457a;

        C46208r(MmMeetingSubtitleViewControl eVar) {
            this.f116457a = eVar;
        }

        /* renamed from: a */
        public final void accept(Triple<? extends MmMeetingSubtitles, ? extends List<String>, ? extends MmComment> triple) {
            if (!this.f116457a.mo162324a((MmMeetingSubtitles) triple.getFirst())) {
                MmSubtitlesAdapter mmSubtitlesAdapter = this.f116457a.f116386b;
                if (mmSubtitlesAdapter != null) {
                    mmSubtitlesAdapter.mo162176a(((MmMeetingSubtitles) triple.getFirst()).getParagraphs(), (List) triple.getSecond(), (MmComment) triple.getThird());
                }
                MmMeetingSubtitleViewControl.m182919a(this.f116457a).mo162334b().setEnableRefresh(MmMeetingSubtitleViewControl.m182919a(this.f116457a).mo162342j());
                MmBaseInfo mmBaseInfo = this.f116457a.f116389e;
                if (mmBaseInfo != null) {
                    long b = (long) C46587a.m184217b(mmBaseInfo.getObjectToken());
                    ((IMmMeetingSubtitleDependency) this.f116457a.mo161247w()).mo162241a(b);
                    this.f116457a.mo162280a(b, false);
                }
                ((IMmMeetingSubtitleDependency) this.f116457a.mo161247w()).mo162269u();
                this.f116457a.mo162327p();
                ((IMmMeetingSubtitleDependency) this.f116457a.mo161247w()).mo162274z();
            }
        }
    }

    /* renamed from: a */
    private final Single<MmMeetingSubtitles> m182920a(MmTranslateLangType mmTranslateLangType, boolean z) {
        Single<MmMeetingSubtitles> observeOn = ((IMmMeetingSubtitleDependency) mo161247w()).mo162239a(mmTranslateLangType, z).observeOn(LarkRxSchedulers.computation());
        Intrinsics.checkExpressionValueIsNotNull(observeOn, "getDependency().loadSubt…Schedulers.computation())");
        return observeOn;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$i */
    public static final class View$OnTouchListenerC46190i implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControl f116423a;

        View$OnTouchListenerC46190i(MmMeetingSubtitleViewControl eVar) {
            this.f116423a = eVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() != 2) {
                return false;
            }
            MmSubtitlesAdapter mmSubtitlesAdapter = this.f116423a.f116386b;
            if (mmSubtitlesAdapter != null) {
                mmSubtitlesAdapter.mo162169a(MmSubtitlesAdapter.ScrollMode.Keep);
            }
            MmSubtitlesAdapter mmSubtitlesAdapter2 = this.f116423a.f116386b;
            if (mmSubtitlesAdapter2 == null) {
                return false;
            }
            mmSubtitlesAdapter2.mo162180a(true);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmMeetingSubtitleViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmMeetingSubtitleListener, IMmMeetingSubtitleDependency> jVar) {
        super(gVar, jVar);
        Integer num;
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f116394j = gVar;
        this.f116395k = jVar;
        MmBaseInfo a = jVar.mo161230c().mo162237a();
        this.f116389e = a;
        if (a != null) {
            num = Integer.valueOf(a.getObjectStatus());
        } else {
            num = null;
        }
        this.f116402r = num;
        this.f116390f = new LinkedList<>();
        this.f116391g = new LinkedList<>();
    }

    /* renamed from: a */
    public final Pair<MmComment.MmCommentInfo, MmComment.MmCommentInfo.CommentDetail> mo162323a(String str, Collection<MmComment.MmCommentInfo> collection) {
        ArrayList arrayList;
        boolean z;
        List<MmMeetingParagraph> paragraphs;
        MmMeetingSubtitles c = ((IMmMeetingSubtitleDependency) mo161247w()).mo162251c();
        if (c == null || (paragraphs = c.getParagraphs()) == null) {
            arrayList = null;
        } else {
            List<MmMeetingParagraph> list = paragraphs;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (T t : list) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                arrayList2.add(t.getPid());
            }
            arrayList = arrayList2;
        }
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (MmComment.MmCommentInfo mmCommentInfo : collection) {
                if (arrayList != null && arrayList.contains(mmCommentInfo.getPid())) {
                    for (MmComment.MmCommentInfo.CommentDetail commentDetail : mmCommentInfo.getComment_list()) {
                        Intrinsics.checkExpressionValueIsNotNull(commentDetail, "commentDetail");
                        if (Intrinsics.areEqual(commentDetail.getComment_id(), str)) {
                            return TuplesKt.to(mmCommentInfo, commentDetail);
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: a */
    public void mo162277a(int i, ReplyCommentRes replyCommentRes) {
        Intrinsics.checkParameterIsNotNull(replyCommentRes, "res");
        Handler handler = this.f116399o;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backGroundHandler");
        }
        handler.post(new RunnableC46203p(this, replyCommentRes, i));
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: a */
    public void mo162278a(int i, IntRange kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "highlightRange");
        this.f116395k.mo161230c().mo162265q();
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
        if (mmSubtitlesAdapter != null) {
            MmSubtitlesAdapter.m182736a(mmSubtitlesAdapter, kVar, i, false, 4, (Object) null);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener
    /* renamed from: a */
    public void mo162279a(int i, boolean z) {
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116386b;
        if (mmSubtitlesAdapter != null) {
            mmSubtitlesAdapter.mo162166a(i, (IntRange) null);
        }
        if (!z) {
            MmSubtitlesAdapter mmSubtitlesAdapter2 = this.f116386b;
            if (mmSubtitlesAdapter2 != null) {
                mmSubtitlesAdapter2.mo162163a(i);
            }
            mo162325n().postDelayed(new RunnableC46202o(this, i), 100);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "", "", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "subtitles", "keywords", Comment.f24093e, "<anonymous parameter 3>", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.e$q */
    public static final class C46207q<T1, T2, T3, T4, R> implements AbstractC68315g<MmMeetingSubtitles, List<? extends String>, MmComment, MmBaseInfo, Triple<? extends MmMeetingSubtitles, ? extends List<? extends String>, ? extends MmComment>> {

        /* renamed from: a */
        public static final C46207q f116456a = new C46207q();

        C46207q() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.AbstractC68315g
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Triple<? extends MmMeetingSubtitles, ? extends List<? extends String>, ? extends MmComment> mo161434a(MmMeetingSubtitles mmMeetingSubtitles, List<? extends String> list, MmComment mmComment, MmBaseInfo mmBaseInfo) {
            return mo162367a(mmMeetingSubtitles, (List<String>) list, mmComment, mmBaseInfo);
        }

        /* renamed from: a */
        public final Triple<MmMeetingSubtitles, List<String>, MmComment> mo162367a(MmMeetingSubtitles mmMeetingSubtitles, List<String> list, MmComment mmComment, MmBaseInfo mmBaseInfo) {
            Intrinsics.checkParameterIsNotNull(mmMeetingSubtitles, "subtitles");
            Intrinsics.checkParameterIsNotNull(list, "keywords");
            Intrinsics.checkParameterIsNotNull(mmComment, Comment.f24093e);
            Intrinsics.checkParameterIsNotNull(mmBaseInfo, "<anonymous parameter 3>");
            return new Triple<>(mmMeetingSubtitles, list, mmComment);
        }
    }
}
