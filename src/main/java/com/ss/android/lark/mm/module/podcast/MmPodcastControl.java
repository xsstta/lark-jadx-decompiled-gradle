package com.ss.android.lark.mm.module.podcast;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.common.utility.NetworkUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.mm.apm.MmApmAgent;
import com.ss.android.lark.mm.apm.MmApmDataInfo;
import com.ss.android.lark.mm.apm.power.MmPowerDataInfo;
import com.ss.android.lark.mm.apm.scene.MmApmMonitorScene;
import com.ss.android.lark.mm.base.MmActiveStateObservable;
import com.ss.android.lark.mm.depend.AbstractC45897a;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmPlaySettingInfo;
import com.ss.android.lark.mm.module.floatwindow.floating.permission.ForbidPodcastFloat;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.minifloatwindow.C46490a;
import com.ss.android.lark.mm.module.minifloatwindow.control.MiniControl;
import com.ss.android.lark.mm.module.minifloatwindow.control.MiniViewControl;
import com.ss.android.lark.mm.module.minifloatwindow.control.MiniViewControlAdapter;
import com.ss.android.lark.mm.module.minifloatwindow.floating.MiniType;
import com.ss.android.lark.mm.module.player.IMmVideoControlDepend;
import com.ss.android.lark.mm.module.player.MmVideoControl;
import com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolbarControl;
import com.ss.android.lark.mm.module.podcast.MmPodcastActivity;
import com.ss.android.lark.mm.module.podcast.initial.MmPodcastInitialControl;
import com.ss.android.lark.mm.module.podcast.subtitle.MmPodcastSubtitleControl;
import com.ss.android.lark.mm.module.podcast.titlebar.MmPodcastTitleBarControl;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.monitor.MmMonitorUtils;
import com.ss.android.lark.mm.utils.MmRandomUtil;
import com.ss.android.lark.mm.utils.UrlUtil;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68294a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0002mnB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010@\u001a\u00020,J\u0012\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020,H\u0002J\u0010\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u00020,H\u0002J\u0012\u0010F\u001a\u00020B2\b\u0010G\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u0004\u0018\u00010\u0006J\u0012\u0010K\u001a\u0004\u0018\u0001052\u0006\u0010G\u001a\u00020\tH\u0002J\n\u0010L\u001a\u0004\u0018\u00010?H\u0002J.\u0010M\u001a\u00020B2\u0006\u0010N\u001a\u0002012\u0010\b\u0002\u0010O\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010P2\n\b\u0002\u00108\u001a\u0004\u0018\u000109H\u0007J\b\u0010Q\u001a\u00020BH\u0002J\u0006\u0010+\u001a\u00020,J\u0006\u0010R\u001a\u00020,J\b\u0010S\u001a\u00020,H\u0002J\u0006\u0010.\u001a\u00020,J\u0006\u0010T\u001a\u00020,J\u0006\u0010U\u001a\u00020BJ\b\u0010V\u001a\u00020BH\u0016J\u001a\u0010W\u001a\u00020B2\b\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010Z\u001a\u00020,H\u0002J\u0010\u0010[\u001a\u00020B2\u0006\u0010G\u001a\u00020\tH\u0002J\u0006\u0010\\\u001a\u00020BJ\b\u0010]\u001a\u00020BH\u0002J\b\u0010^\u001a\u00020BH\u0002J\b\u0010_\u001a\u00020BH\u0002J\u0006\u0010`\u001a\u00020BJ\u0006\u0010a\u001a\u00020BJ\u0006\u0010b\u001a\u00020BJ\u000e\u0010c\u001a\u00020B2\u0006\u0010d\u001a\u00020,J\u0006\u0010e\u001a\u00020BJ\u0010\u0010f\u001a\u00020B2\u0006\u0010g\u001a\u00020\u000eH\u0002J\u0016\u0010h\u001a\u00020B2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010j\u001a\u00020\u000eJ\b\u0010k\u001a\u00020BH\u0002J\u0010\u0010l\u001a\u00020\u00122\u0006\u0010g\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u001e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000bR\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020,X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u0002\n\u0000¨\u0006o"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "()V", "apmListener", "Lcom/ss/android/lark/mm/apm/MmApmAgent$IMmApmDataListener;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "currentBaseInfoSub", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getCurrentBaseInfoSub", "()Lio/reactivex/subjects/BehaviorSubject;", "currentPlayState", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl$PlayState;", "getCurrentPlayState", "currentPosition", "", "currentProgress", "", "getCurrentProgress", "<set-?>", "currentTitle", "getCurrentTitle", "()Ljava/lang/String;", "value", "currentUrl", "setCurrentUrl", "(Ljava/lang/String;)V", "displayMode", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl$DisplayMode;", "getDisplayMode", "()Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl$DisplayMode;", "setDisplayMode", "(Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl$DisplayMode;)V", "displayModeSub", "getDisplayModeSub", "disposableTimer", "Lio/reactivex/disposables/Disposable;", "hitPointContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "host", "isCanAutoPlay", "", "isForceClosePodcast", "isPodcastMode", "listLinkInfo", "", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastLinkInfo;", "getListLinkInfo", "()Ljava/util/List;", "miniControl", "Lcom/ss/android/lark/mm/module/minifloatwindow/control/MiniControl;", "miniViewControl", "Lcom/ss/android/lark/mm/module/minifloatwindow/control/MiniViewControl;", "playSettingInfo", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmPlaySettingInfo;", "startTimeInMs", "timerExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "token", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "checkAllowShowFloatWindow", "destroyMiniViewControl", "", "isForced", "doLoadBaseInfo", "isAutoSwitchToNextWhenFailed", "generateHitPointContext", "baseInfo", "getCategoryJsonObject", "Lorg/json/JSONObject;", "getControlRegister", "getOrCreateMiniControl", "getViewControlRegister", "init", "currentLinkInfo", "listUrls", "", "initControls", "isNextBtnEnable", "isPlaying", "isPreBtnEnable", "onActivityStop", "onDestroy", "onSwitchPodcastFailed", "error", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "isNext", "onSwitchPodcastSucceed", "signalPodcastModeClose", "startMonitorPerformance", "stopPerfMonitor", "stopUploadAliveEvent", "switchNextPodcast", "switchPrePodcast", "trySwitchToDetail", "trySwitchToFloatWindow", "requestPermission", "turnOffPodcast", "updateControlsUrl", "url", "updateTopic", "objectToken", "newTopic", "uploadAliveEvent", "urlFindPosition", "DisplayMode", "PlayState", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmPodcastControl extends MmBaseControl {

    /* renamed from: a */
    public long f117627a;

    /* renamed from: b */
    public C47084f f117628b;

    /* renamed from: c */
    public final MmApmAgent.IMmApmDataListener f117629c;

    /* renamed from: d */
    private MmControlRegister f117630d;

    /* renamed from: e */
    private MmViewControlRegister f117631e;

    /* renamed from: f */
    private String f117632f = "";

    /* renamed from: g */
    private String f117633g = "";

    /* renamed from: h */
    private String f117634h = "";

    /* renamed from: i */
    private boolean f117635i;

    /* renamed from: j */
    private String f117636j = "";

    /* renamed from: k */
    private int f117637k;

    /* renamed from: l */
    private final List<MmPodcastLinkInfo> f117638l = new ArrayList();

    /* renamed from: m */
    private MmPlaySettingInfo f117639m;

    /* renamed from: n */
    private DisplayMode f117640n = DisplayMode.DETAIL;

    /* renamed from: o */
    private boolean f117641o;

    /* renamed from: p */
    private MiniViewControl f117642p;

    /* renamed from: q */
    private MiniControl f117643q;

    /* renamed from: r */
    private boolean f117644r = true;

    /* renamed from: s */
    private Disposable f117645s;

    /* renamed from: t */
    private final C47096b f117646t = new C47096b();

    /* renamed from: u */
    private final C68294a<MmBaseInfo> f117647u;

    /* renamed from: v */
    private final C68294a<Pair<String, Long>> f117648v;

    /* renamed from: w */
    private final C68294a<Pair<String, PlayState>> f117649w;

    /* renamed from: x */
    private final C68294a<DisplayMode> f117650x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl$DisplayMode;", "", "(Ljava/lang/String;I)V", "FLOAT_WINDOW", "DETAIL", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DisplayMode {
        FLOAT_WINDOW,
        DETAIL
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl$PlayState;", "", "(Ljava/lang/String;I)V", "LOADING", "PLAYING", "PAUSED", "TERMINATED", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum PlayState {
        LOADING,
        PLAYING,
        PAUSED,
        TERMINATED
    }

    /* renamed from: i */
    public final void mo164279i() {
        this.f117635i = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mm/module/podcast/MmPodcastControl$trySwitchToFloatWindow$1", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "getMContext", "Landroid/content/Context;", "getMmTimeExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "getRootView", "Landroid/view/View;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastControl$e */
    public static final class C46758e implements IMmViewControlContext {
        C46758e() {
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
    }

    /* renamed from: a */
    public final String mo164263a() {
        return this.f117636j;
    }

    /* renamed from: b */
    public final List<MmPodcastLinkInfo> mo164270b() {
        return this.f117638l;
    }

    /* renamed from: c */
    public final DisplayMode mo164273c() {
        return this.f117640n;
    }

    /* renamed from: d */
    public final C68294a<MmBaseInfo> mo164274d() {
        return this.f117647u;
    }

    /* renamed from: e */
    public final C68294a<Pair<String, Long>> mo164275e() {
        return this.f117648v;
    }

    /* renamed from: f */
    public final C68294a<Pair<String, PlayState>> mo164276f() {
        return this.f117649w;
    }

    /* renamed from: g */
    public final C68294a<DisplayMode> mo164277g() {
        return this.f117650x;
    }

    /* renamed from: y */
    public final boolean mo164289y() {
        return this.f117644r;
    }

    /* renamed from: F */
    private final void m185174F() {
        MmApmAgent.f115638a.mo161102a(this.f117629c);
    }

    /* renamed from: G */
    private final void m185175G() {
        MmApmAgent.f115638a.mo161104b(this.f117629c);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mm/module/podcast/MmPodcastControl$initControls$1$1", "Lcom/ss/android/lark/mm/module/player/IMmVideoControlDepend;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "isPodWin", "", "isPodcast", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastControl$d */
    public static final class C46757d implements IMmVideoControlDepend {

        /* renamed from: a */
        final /* synthetic */ MmPodcastControl f117656a;

        @Override // com.ss.android.lark.mm.module.player.IMmVideoControlDepend
        /* renamed from: a */
        public boolean mo161335a() {
            return true;
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoControlDepend
        /* renamed from: b */
        public boolean mo161336b() {
            if (this.f117656a.mo164273c() == DisplayMode.FLOAT_WINDOW) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoControlDepend
        /* renamed from: c */
        public MmBaseInfo mo161337c() {
            return this.f117656a.mo164274d().mo237947b();
        }

        C46757d(MmPodcastControl mmPodcastControl) {
            this.f117656a = mmPodcastControl;
        }
    }

    /* renamed from: B */
    private final MmViewControlRegister m185170B() {
        if (this.f117631e == null) {
            this.f117631e = new MmViewControlRegister();
        }
        return this.f117631e;
    }

    /* renamed from: h */
    public final boolean mo164278h() {
        if (!this.f117641o || this.f117635i) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastControl$g */
    public static final class C46760g extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmPodcastControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46760g(MmPodcastControl mmPodcastControl) {
            super(0);
            this.this$0 = mmPodcastControl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C45855f.m181664c("MmPodcastControl", "[trySwitchToFloatWindow] PodCast float window is forced to dismiss");
            this.this$0.mo164272b(true);
            this.this$0.mo164284t();
        }
    }

    /* renamed from: C */
    private final boolean m185171C() {
        MmVideoControl eVar;
        MmControlRegister s = mo164283s();
        if (s == null || (eVar = (MmVideoControl) s.mo161912a(MmVideoControl.class)) == null) {
            return false;
        }
        return eVar.mo164035i();
    }

    /* renamed from: l */
    public final boolean mo164281l() {
        boolean C = m185171C();
        this.f117641o = C;
        if (!C || this.f117640n == DisplayMode.FLOAT_WINDOW) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final MmControlRegister mo164283s() {
        if (this.f117630d == null) {
            MmControlRegister eVar = new MmControlRegister(this.f117633g);
            this.f117630d = eVar;
            if (eVar != null) {
                eVar.mo161913a();
            }
        }
        return this.f117630d;
    }

    /* renamed from: w */
    public final boolean mo164287w() {
        if (!(!this.f117638l.isEmpty()) || this.f117637k <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final boolean mo164288x() {
        int i;
        if (this.f117638l.size() <= 1 || (i = this.f117637k) < 0 || i >= this.f117638l.size() - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    private final void m185172D() {
        if (this.f117627a == 0) {
            this.f117627a = SystemClock.elapsedRealtime();
            Disposable disposable = this.f117645s;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f117645s = Observable.interval(60, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C46761h(this));
        }
    }

    /* renamed from: j */
    public final void mo164280j() {
        m185177a(this, false, 1, null);
        m185172D();
        this.f117640n = DisplayMode.DETAIL;
        MmPodcastActivity.Companion aVar = MmPodcastActivity.f117617b;
        Context a = C45851c.m181646a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
        aVar.mo164257a(a);
        this.f117650x.onNext(this.f117640n);
    }

    /* renamed from: r */
    public final void mo164282r() {
        if (mo164281l()) {
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            AbstractC45897a lifecycleDependency = a.getLifecycleDependency();
            Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
            Activity a2 = lifecycleDependency.mo144570a();
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl().lifecycl…ncy.topActivity ?: return");
                if (((ForbidPodcastFloat) a2.getClass().getAnnotation(ForbidPodcastFloat.class)) == null) {
                    mo164269a(true);
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo164284t() {
        MmVideoControl eVar;
        C45855f.m181664c("MmPodcastControl", "releasePlayer clearPodcastControl");
        this.f117649w.onNext(TuplesKt.to("", PlayState.TERMINATED));
        MmControlRegister s = mo164283s();
        if (!(s == null || (eVar = (MmVideoControl) s.mo161912a(MmVideoControl.class)) == null)) {
            eVar.mo161235k();
        }
        C45852d.m181651a().mo161153c();
    }

    public MmPodcastControl() {
        C68294a<MmBaseInfo> a = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a, "BehaviorSubject.create()");
        this.f117647u = a;
        C68294a<Pair<String, Long>> a2 = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "BehaviorSubject.create()");
        this.f117648v = a2;
        C68294a<Pair<String, PlayState>> a3 = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "BehaviorSubject.create()");
        this.f117649w = a3;
        C68294a<DisplayMode> a4 = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "BehaviorSubject.create()");
        this.f117650x = a4;
        this.f117629c = new C46752a(this);
    }

    /* renamed from: E */
    private final void m185173E() {
        MmMeetingBaseInfoControl mmMeetingBaseInfoControl;
        MmBaseInfo b;
        Disposable disposable = this.f117645s;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f117645s = null;
        MmControlRegister s = mo164283s();
        if (s != null && (mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) s.mo161912a(MmMeetingBaseInfoControl.class)) != null && (b = mmMeetingBaseInfoControl.mo161581b()) != null) {
            C47083e.m186425a(new C47084f(b.getMeetingId(), b.isOwner(), b.getObjectToken(), b.getObjectType(), b.isCanModify()), "vc_minutes_podcast_status", C47086i.m186432a().mo165411a("duration", SystemClock.elapsedRealtime() - this.f117627a).mo165421c());
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseControl
    /* renamed from: k */
    public void mo161235k() {
        List<MmBaseControl> b;
        super.mo161235k();
        m185175G();
        this.f117646t.mo165470a();
        m185173E();
        m185177a(this, false, 1, null);
        MmControlRegister s = mo164283s();
        if (!(s == null || (b = s.mo161917b()) == null)) {
            ArrayList<MmBaseControl> arrayList = new ArrayList();
            for (T t : b) {
                if (!(t instanceof MmPodcastControl)) {
                    arrayList.add(t);
                }
            }
            for (MmBaseControl hVar : arrayList) {
                hVar.mo161235k();
            }
        }
        MmControlRegister s2 = mo164283s();
        if (s2 != null) {
            s2.mo161920d();
        }
    }

    /* renamed from: u */
    public final void mo164285u() {
        MmVideoControl eVar;
        MmPodcastInitialControl dVar;
        this.f117649w.onNext(TuplesKt.to("", PlayState.LOADING));
        if (this.f117638l.isEmpty()) {
            MmControlRegister s = mo164283s();
            if (s != null && (dVar = (MmPodcastInitialControl) s.mo161912a(MmPodcastInitialControl.class)) != null) {
                dVar.mo164328c();
                return;
            }
            return;
        }
        int i = this.f117637k;
        if (i != -1 && i < this.f117638l.size() - 1) {
            List<MmPodcastLinkInfo> list = this.f117638l;
            int i2 = this.f117637k + 1;
            this.f117637k = i2;
            MmPodcastLinkInfo mmPodcastLinkInfo = list.get(i2);
            m185178a(mmPodcastLinkInfo.getUrl());
            this.f117636j = mmPodcastLinkInfo.getTitle();
            MmControlRegister s2 = mo164283s();
            if (!(s2 == null || (eVar = (MmVideoControl) s2.mo161912a(MmVideoControl.class)) == null)) {
                eVar.mo164033g();
            }
            m185181c(this.f117634h);
            m185182c(true);
        }
    }

    /* renamed from: v */
    public final void mo164286v() {
        MmVideoControl eVar;
        MmPodcastInitialControl dVar;
        this.f117649w.onNext(TuplesKt.to("", PlayState.LOADING));
        if (this.f117638l.isEmpty()) {
            MmControlRegister s = mo164283s();
            if (s != null && (dVar = (MmPodcastInitialControl) s.mo161912a(MmPodcastInitialControl.class)) != null) {
                dVar.mo164328c();
                return;
            }
            return;
        }
        int i = this.f117637k;
        if (i >= 1) {
            List<MmPodcastLinkInfo> list = this.f117638l;
            int i2 = i - 1;
            this.f117637k = i2;
            MmPodcastLinkInfo mmPodcastLinkInfo = list.get(i2);
            m185178a(mmPodcastLinkInfo.getUrl());
            this.f117636j = mmPodcastLinkInfo.getTitle();
            MmControlRegister s2 = mo164283s();
            if (!(s2 == null || (eVar = (MmVideoControl) s2.mo161912a(MmVideoControl.class)) == null)) {
                eVar.mo164033g();
            }
            m185181c(this.f117634h);
            m185182c(false);
        }
    }

    /* renamed from: z */
    public final JSONObject mo164290z() {
        boolean z;
        if (this.f117640n == DisplayMode.FLOAT_WINDOW) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scene", MmApmMonitorScene.MinutesPodcast.name());
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        AbstractC45897a lifecycleDependency = a.getLifecycleDependency();
        Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
        Activity a2 = lifecycleDependency.mo144570a();
        if (z && a2 != null) {
            jSONObject.put("sub_scene", a2.getClass().getName());
        }
        jSONObject.put("floating", z);
        return jSONObject;
    }

    /* renamed from: A */
    private final void m185169A() {
        List<MmBaseControl> b;
        MmControlRegister s = mo164283s();
        if (s != null) {
            s.mo161921e();
        }
        MmControlRegister s2 = mo164283s();
        if (s2 != null) {
            s2.mo161914a(this);
        }
        MmControlRegister s3 = mo164283s();
        if (s3 != null) {
            s3.mo161914a(new MmMeetingBaseInfoControl(this.f117634h, MmRandomUtil.f118636a.mo165494a(), false, null, 8, null));
        }
        MmControlRegister s4 = mo164283s();
        if (s4 != null) {
            s4.mo161914a(new MmPodcastInitialControl(this.f117634h));
        }
        MmControlRegister s5 = mo164283s();
        if (s5 != null) {
            s5.mo161914a(new MmPodcastTitleBarControl(this.f117634h));
        }
        MmControlRegister s6 = mo164283s();
        if (s6 != null) {
            s6.mo161914a(new MmVideoToolbarControl(this.f117634h, this.f117638l));
        }
        MmControlRegister s7 = mo164283s();
        if (s7 != null) {
            s7.mo161914a(new MmPodcastSubtitleControl(this.f117634h));
        }
        MmControlRegister s8 = mo164283s();
        if (s8 != null) {
            MmVideoControl eVar = new MmVideoControl(this.f117634h, this.f117639m, this.f117646t);
            eVar.mo164018a(new C46757d(this));
            s8.mo161914a(eVar);
        }
        MmControlRegister s9 = mo164283s();
        if (s9 != null && (b = s9.mo161917b()) != null) {
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                it.next().mo161236m();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/podcast/MmPodcastControl$apmListener$1", "Lcom/ss/android/lark/mm/apm/MmApmAgent$IMmApmDataListener;", "onOutputApmData", "", "apmData", "Lcom/ss/android/lark/mm/apm/MmApmDataInfo;", "onOutputPowerData", "powerData", "Lcom/ss/android/lark/mm/apm/power/MmPowerDataInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastControl$a */
    public static final class C46752a implements MmApmAgent.IMmApmDataListener {

        /* renamed from: a */
        final /* synthetic */ MmPodcastControl f117651a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46752a(MmPodcastControl mmPodcastControl) {
            this.f117651a = mmPodcastControl;
        }

        @Override // com.ss.android.lark.mm.apm.MmApmAgent.IMmApmDataListener
        /* renamed from: a */
        public void mo161111a(MmApmDataInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "apmData");
            MmMonitorUtils.m186469a(MmMonitorUtils.f118585a, this.f117651a.mo164290z(), bVar, (JSONObject) null, 4, (Object) null);
        }

        @Override // com.ss.android.lark.mm.apm.MmApmAgent.IMmApmDataListener
        /* renamed from: a */
        public void mo161112a(MmPowerDataInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "powerData");
            MmMonitorUtils.m186470a(MmMonitorUtils.f118585a, this.f117651a.mo164290z(), bVar, (JSONObject) null, 4, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastControl$b */
    public static final class C46753b extends Lambda implements Function1<MmBaseInfo, Unit> {
        final /* synthetic */ boolean $isAutoSwitchToNextWhenFailed;
        final /* synthetic */ MmPodcastControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46753b(MmPodcastControl mmPodcastControl, boolean z) {
            super(1);
            this.this$0 = mmPodcastControl;
            this.$isAutoSwitchToNextWhenFailed = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmBaseInfo mmBaseInfo) {
            invoke(mmBaseInfo);
            return Unit.INSTANCE;
        }

        public final void invoke(final MmBaseInfo mmBaseInfo) {
            Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.podcast.MmPodcastControl.C46753b.RunnableC467541 */

                /* renamed from: a */
                final /* synthetic */ C46753b f117652a;

                {
                    this.f117652a = r1;
                }

                public final void run() {
                    if (ObjectStatus.Companion.mo161608c(Integer.valueOf(mmBaseInfo.getObjectStatus())) || ObjectStatus.Companion.mo161607b(Integer.valueOf(mmBaseInfo.getObjectStatus()))) {
                        this.f117652a.this$0.mo164267a(C47068a.f118469d, this.f117652a.$isAutoSwitchToNextWhenFailed);
                    } else {
                        this.f117652a.this$0.mo164264a(mmBaseInfo);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastControl$c */
    public static final class C46755c extends Lambda implements Function1<C47068a, Unit> {
        final /* synthetic */ boolean $isAutoSwitchToNextWhenFailed;
        final /* synthetic */ MmPodcastControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46755c(MmPodcastControl mmPodcastControl, boolean z) {
            super(1);
            this.this$0 = mmPodcastControl;
            this.$isAutoSwitchToNextWhenFailed = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47068a aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(final C47068a aVar) {
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.podcast.MmPodcastControl.C46755c.RunnableC467561 */

                /* renamed from: a */
                final /* synthetic */ C46755c f117654a;

                {
                    this.f117654a = r1;
                }

                public final void run() {
                    this.f117654a.this$0.mo164267a(aVar, this.f117654a.$isAutoSwitchToNextWhenFailed);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo164265a(DisplayMode displayMode) {
        Intrinsics.checkParameterIsNotNull(displayMode, "<set-?>");
        this.f117640n = displayMode;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isSuccess", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastControl$f */
    public static final class C46759f extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ Ref.BooleanRef $isMakeCountChanged;
        final /* synthetic */ MmPodcastControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46759f(MmPodcastControl mmPodcastControl, Ref.BooleanRef booleanRef) {
            super(1);
            this.this$0 = mmPodcastControl;
            this.$isMakeCountChanged = booleanRef;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl;
            MmBaseInfo mmBaseInfo = null;
            if (z) {
                this.this$0.mo164265a(DisplayMode.FLOAT_WINDOW);
                this.this$0.mo164277g().onNext(this.this$0.mo164273c());
                MmPodcastControl mmPodcastControl = this.this$0;
                MmControlRegister s = mmPodcastControl.mo164283s();
                if (!(s == null || (mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) s.mo161912a(MmMeetingBaseInfoControl.class)) == null)) {
                    mmBaseInfo = mmMeetingBaseInfoControl.mo161581b();
                }
                mmPodcastControl.mo164271b(mmBaseInfo);
                C47083e.m186425a(this.this$0.f117628b, "vc_minutes_podcast_mini_view", C47086i.m186432a().mo165421c());
                if (!this.$isMakeCountChanged.element) {
                    this.$isMakeCountChanged.element = true;
                    MmApmAgent.f115638a.mo161106c(this.this$0.f117629c);
                    MmActiveStateObservable.f115698a.mo161186a();
                    return;
                }
                return;
            }
            C45855f.m181664c("MmPodcastControl", "[trySwitchToFloatWindow] failed");
            MmPodcastControl.m185177a(this.this$0, false, 1, null);
            this.this$0.mo164284t();
        }
    }

    /* renamed from: c */
    private final MiniControl m185180c(MmBaseInfo mmBaseInfo) {
        MiniControl dVar = this.f117643q;
        if (dVar == null) {
            this.f117643q = new MiniControl(mmBaseInfo);
        } else if (dVar != null) {
            dVar.mo163383a(mmBaseInfo);
        }
        return this.f117643q;
    }

    /* renamed from: b */
    public final void mo164271b(MmBaseInfo mmBaseInfo) {
        if (mmBaseInfo != null) {
            this.f117628b = new C47084f(mmBaseInfo.getMeetingId(), mmBaseInfo.isOwner(), mmBaseInfo.getObjectToken(), mmBaseInfo.getObjectType(), mmBaseInfo.isCanModify());
        }
    }

    /* renamed from: a */
    private final void m185178a(String str) {
        this.f117634h = str;
        this.f117632f = UrlUtil.f118671a.mo165518b(str);
        String a = UrlUtil.f118671a.mo165517a(str);
        this.f117633g = a;
        MmControlRegister eVar = this.f117630d;
        if (eVar != null) {
            eVar.mo161915a(a);
        }
    }

    /* renamed from: b */
    private final int m185179b(String str) {
        int size = this.f117638l.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual(this.f117638l.get(i).getUrl(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private final void m185182c(boolean z) {
        MmMeetingBaseInfoControl mmMeetingBaseInfoControl;
        MmControlRegister s = mo164283s();
        if (s != null && (mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) s.mo161912a(MmMeetingBaseInfoControl.class)) != null) {
            MmMeetingBaseInfoControl.m182198a(mmMeetingBaseInfoControl, new C46753b(this, z), new C46755c(this, z), false, false, 12, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastControl$h */
    public static final class C46761h<T> implements Consumer<Long> {

        /* renamed from: a */
        final /* synthetic */ MmPodcastControl f117657a;

        C46761h(MmPodcastControl mmPodcastControl) {
            this.f117657a = mmPodcastControl;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl;
            MmBaseInfo b;
            this.f117657a.f117627a = SystemClock.elapsedRealtime();
            MmControlRegister s = this.f117657a.mo164283s();
            if (s != null && (mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) s.mo161912a(MmMeetingBaseInfoControl.class)) != null && (b = mmMeetingBaseInfoControl.mo161581b()) != null) {
                C47083e.m186425a(new C47084f(b.getMeetingId(), b.isOwner(), b.getObjectToken(), b.getObjectType(), b.isCanModify()), "vc_minutes_podcast_status", C47086i.m186432a().mo165410a("duration", CalendarSearchResultRv.f82652c).mo165421c());
            }
        }
    }

    /* renamed from: c */
    private final void m185181c(String str) {
        MmVideoControl eVar;
        MmPodcastSubtitleControl fVar;
        MmVideoToolbarControl fVar2;
        MmPodcastTitleBarControl dVar;
        MmPodcastInitialControl dVar2;
        MmMeetingBaseInfoControl mmMeetingBaseInfoControl;
        MmControlRegister s = mo164283s();
        if (!(s == null || (mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) s.mo161912a(MmMeetingBaseInfoControl.class)) == null)) {
            mmMeetingBaseInfoControl.mo161575a(str);
        }
        MmControlRegister s2 = mo164283s();
        if (!(s2 == null || (dVar2 = (MmPodcastInitialControl) s2.mo161912a(MmPodcastInitialControl.class)) == null)) {
            dVar2.mo164325a(str);
        }
        MmControlRegister s3 = mo164283s();
        if (!(s3 == null || (dVar = (MmPodcastTitleBarControl) s3.mo161912a(MmPodcastTitleBarControl.class)) == null)) {
            dVar.mo164356a(str);
        }
        MmControlRegister s4 = mo164283s();
        if (!(s4 == null || (fVar2 = (MmVideoToolbarControl) s4.mo161912a(MmVideoToolbarControl.class)) == null)) {
            fVar2.mo164228a(str);
        }
        MmControlRegister s5 = mo164283s();
        if (!(s5 == null || (fVar = (MmPodcastSubtitleControl) s5.mo161912a(MmPodcastSubtitleControl.class)) == null)) {
            fVar.mo164426a(str);
        }
        MmControlRegister s6 = mo164283s();
        if (s6 != null && (eVar = (MmVideoControl) s6.mo161912a(MmVideoControl.class)) != null) {
            eVar.mo164021a(str);
        }
    }

    /* renamed from: a */
    public final void mo164264a(MmBaseInfo mmBaseInfo) {
        MmVideoControl eVar;
        MmVideoControl eVar2;
        MmPodcastInitialControl dVar;
        MmVideoControl eVar3;
        this.f117647u.onNext(mmBaseInfo);
        MmControlRegister s = mo164283s();
        if (!(s == null || (eVar3 = (MmVideoControl) s.mo161912a(MmVideoControl.class)) == null)) {
            eVar3.mo164033g();
        }
        MmControlRegister s2 = mo164283s();
        if (!(s2 == null || (dVar = (MmPodcastInitialControl) s2.mo161912a(MmPodcastInitialControl.class)) == null)) {
            dVar.mo164330e();
        }
        MmControlRegister s3 = mo164283s();
        if (!(s3 == null || (eVar2 = (MmVideoControl) s3.mo161912a(MmVideoControl.class)) == null)) {
            String topic = mmBaseInfo.getTopic();
            Intrinsics.checkExpressionValueIsNotNull(topic, "baseInfo.topic");
            eVar2.mo164022a(topic, mmBaseInfo.getDuration());
        }
        MmControlRegister s4 = mo164283s();
        if (s4 != null && (eVar = (MmVideoControl) s4.mo161912a(MmVideoControl.class)) != null) {
            String audioUrl = mmBaseInfo.getAudioUrl();
            Intrinsics.checkExpressionValueIsNotNull(audioUrl, "baseInfo.audioUrl");
            eVar.mo164026b(audioUrl);
        }
    }

    /* renamed from: b */
    public final void mo164272b(boolean z) {
        if (z) {
            MiniViewControl eVar = this.f117642p;
            if (eVar != null) {
                eVar.mo163386b();
                return;
            }
            return;
        }
        MiniViewControl eVar2 = this.f117642p;
        if (eVar2 != null) {
            eVar2.mo161245h();
        }
    }

    /* renamed from: a */
    public final void mo164269a(boolean z) {
        MmControlRegister s;
        MmViewControlRegister B;
        MmBaseInfo b = this.f117647u.mo237947b();
        if (b != null) {
            Intrinsics.checkExpressionValueIsNotNull(b, "currentBaseInfoSub.value ?: return");
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45896v videoChatDependency = a.getVideoChatDependency();
            Intrinsics.checkExpressionValueIsNotNull(videoChatDependency, "MmDepend.impl().videoChatDependency");
            if (videoChatDependency.mo144590b()) {
                mo164284t();
                return;
            }
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = false;
            MiniControl c = m185180c(b);
            if (c != null && (s = mo164283s()) != null && (B = m185170B()) != null) {
                s.mo161914a(c);
                MiniViewControl eVar = new MiniViewControl(new C46758e(), new MiniViewControlAdapter(B, s, c));
                this.f117642p = eVar;
                if (eVar != null) {
                    eVar.be_();
                }
                MiniViewControl eVar2 = this.f117642p;
                if (eVar2 != null) {
                    eVar2.mo163384a(MiniType.MINUTES_PODCAST, z, new C46759f(this, booleanRef), new C46760g(this));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo164267a(C47068a aVar, boolean z) {
        MmPodcastInitialControl dVar;
        MmPodcastInitialControl dVar2;
        MmPodcastInitialControl dVar3;
        if (aVar == null || aVar.mo165306a() == 0 || !NetworkUtils.isNetworkAvailable(C45851c.m181646a())) {
            MmControlRegister s = mo164283s();
            if (s != null && (dVar = (MmPodcastInitialControl) s.mo161912a(MmPodcastInitialControl.class)) != null) {
                dVar.mo164329d();
                return;
            }
            return;
        }
        this.f117638l.remove(this.f117637k);
        if (z) {
            if (mo164288x()) {
                mo164285u();
            } else if (this.f117638l.isEmpty()) {
                MmControlRegister s2 = mo164283s();
                if (s2 != null && (dVar3 = (MmPodcastInitialControl) s2.mo161912a(MmPodcastInitialControl.class)) != null) {
                    dVar3.mo164328c();
                }
            } else {
                int size = this.f117638l.size() - 1;
                this.f117637k = size;
                MmPodcastLinkInfo mmPodcastLinkInfo = this.f117638l.get(size);
                m185178a(mmPodcastLinkInfo.getUrl());
                this.f117636j = mmPodcastLinkInfo.getTitle();
                m185181c(this.f117634h);
                m185182c(false);
                this.f117644r = false;
                C45858j.m181677a((int) R.string.MMWeb_G_CouldNotPlayAudio);
            }
        } else if (mo164287w()) {
            mo164286v();
        } else if (this.f117638l.isEmpty()) {
            MmControlRegister s3 = mo164283s();
            if (s3 != null && (dVar2 = (MmPodcastInitialControl) s3.mo161912a(MmPodcastInitialControl.class)) != null) {
                dVar2.mo164328c();
            }
        } else {
            this.f117637k = 0;
            MmPodcastLinkInfo mmPodcastLinkInfo2 = this.f117638l.get(0);
            m185178a(mmPodcastLinkInfo2.getUrl());
            this.f117636j = mmPodcastLinkInfo2.getTitle();
            m185181c(this.f117634h);
            m185182c(true);
            this.f117644r = false;
            C45858j.m181677a((int) R.string.MMWeb_G_CouldNotPlayAudio);
        }
    }

    /* renamed from: a */
    public final void mo164268a(String str, String str2) {
        T t;
        MmVideoControl eVar;
        long j;
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        Intrinsics.checkParameterIsNotNull(str2, "newTopic");
        Iterator<T> it = this.f117638l.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(UrlUtil.f118671a.mo165517a(t.getUrl()), str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            t2.setTitle(str2);
            if (Intrinsics.areEqual(UrlUtil.f118671a.mo165517a(this.f117634h), str)) {
                this.f117636j = str2;
                MmControlRegister s = mo164283s();
                if (s != null && (eVar = (MmVideoControl) s.mo161912a(MmVideoControl.class)) != null) {
                    String str3 = this.f117636j;
                    MmBaseInfo b = this.f117647u.mo237947b();
                    if (b != null) {
                        j = b.getDuration();
                    } else {
                        j = 0;
                    }
                    eVar.mo164022a(str3, j);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo164266a(MmPodcastLinkInfo mmPodcastLinkInfo, List<MmPodcastLinkInfo> list, MmPlaySettingInfo mmPlaySettingInfo) {
        Intrinsics.checkParameterIsNotNull(mmPodcastLinkInfo, "currentLinkInfo");
        if (list != null) {
            this.f117638l.clear();
            this.f117638l.addAll(list);
        }
        if (!Intrinsics.areEqual(this.f117634h, mmPodcastLinkInfo.getUrl())) {
            this.f117639m = mmPlaySettingInfo;
            m185178a(mmPodcastLinkInfo.getUrl());
            this.f117636j = mmPodcastLinkInfo.getTitle();
            this.f117637k = m185179b(this.f117634h);
            m185169A();
            m185174F();
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            a.getContextDepend().mo144560a(C46490a.m183861a());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m185177a(MmPodcastControl mmPodcastControl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        mmPodcastControl.mo164272b(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.mm.module.podcast.MmPodcastControl */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m185176a(MmPodcastControl mmPodcastControl, MmPodcastLinkInfo mmPodcastLinkInfo, List list, MmPlaySettingInfo mmPlaySettingInfo, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            mmPlaySettingInfo = null;
        }
        mmPodcastControl.mo164266a(mmPodcastLinkInfo, list, mmPlaySettingInfo);
    }
}
