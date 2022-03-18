package com.ss.android.lark.mm.module.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.apm.MmApmAgent;
import com.ss.android.lark.mm.apm.MmApmDataInfo;
import com.ss.android.lark.mm.apm.power.MmPowerDataInfo;
import com.ss.android.lark.mm.apm.scene.MmApmMonitorScene;
import com.ss.android.lark.mm.base.MmActiveStateObservable;
import com.ss.android.lark.mm.base.MmBaseActivity;
import com.ss.android.lark.mm.depend.AbstractC45897a;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.detail.main.IMmDetailInquirer;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.main.MmDetailControl;
import com.ss.android.lark.mm.module.detail.main.MmDetailViewControl;
import com.ss.android.lark.mm.module.detail.main.MmDetailViewControlAdapter;
import com.ss.android.lark.mm.module.detail.search.MmDetailSearchViewControl;
import com.ss.android.lark.mm.module.detail.search.MmDetailSearchViewControlAdapter;
import com.ss.android.lark.mm.module.detail.search.MmSearchControl;
import com.ss.android.lark.mm.module.detail.startup.MmDetailStartUpViewControl;
import com.ss.android.lark.mm.module.detail.startup.MmDetailStartUpViewControlAdapter;
import com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleControl;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmPlaySettingInfo;
import com.ss.android.lark.mm.module.detail.summary.MmSummaryControl;
import com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarInquirer;
import com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarControl;
import com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarViewControl;
import com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarViewControlAdapter;
import com.ss.android.lark.mm.module.detail.toolbar.MmDetailToolbarControlAdapter;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.player.IMmVideoControlDepend;
import com.ss.android.lark.mm.module.player.IMmVideoDependency;
import com.ss.android.lark.mm.module.player.IMmVideoInquirer;
import com.ss.android.lark.mm.module.player.IMmVideoListener;
import com.ss.android.lark.mm.module.player.MmVideoControl;
import com.ss.android.lark.mm.module.player.MmVideoViewControl;
import com.ss.android.lark.mm.module.player.MmVideoViewControlAdapter;
import com.ss.android.lark.mm.module.player.p2308a.C46587a;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarInquirer;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener;
import com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolbarControl;
import com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolbarViewControl;
import com.ss.android.lark.mm.module.podcast.MmPodcastControl;
import com.ss.android.lark.mm.module.podcast.MmPodcastLinkInfo;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.model.Language;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.StatisticsUtil;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableDetailTracker;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider;
import com.ss.android.lark.mm.statistics.hitpoint.MmTimedHitPointEvent;
import com.ss.android.lark.mm.statistics.monitor.MmMonitorUtils;
import com.ss.android.lark.mm.utils.MmRandomUtil;
import com.ss.android.lark.mm.utils.UrlUtil;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 [2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001[B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u00102\u001a\u000200H\u0002J\u0010\u00103\u001a\u0002002\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u00104\u001a\u0002002\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u00105\u001a\u00020!H\u0016J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\u0017H\u0016J\b\u00109\u001a\u00020\u0017H\u0016J\b\u0010:\u001a\u00020;H\u0016J\n\u0010<\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u00020\u001fH\u0016J\b\u0010@\u001a\u00020!H\u0016J\b\u0010A\u001a\u00020\u0017H\u0016J\b\u0010B\u001a\u00020\u0017H\u0016J\b\u0010C\u001a\u00020&H\u0002J\b\u0010D\u001a\u000200H\u0002J\b\u0010E\u001a\u000200H\u0016J\u0010\u0010F\u001a\u0002002\u0006\u0010G\u001a\u00020\bH\u0002J\u0012\u0010H\u001a\u0002002\b\u0010I\u001a\u0004\u0018\u00010JH\u0014J\b\u0010K\u001a\u000200H\u0014J\b\u0010L\u001a\u000200H\u0002J\u0010\u0010M\u001a\u0002002\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u0002002\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u000200H\u0014J\b\u0010T\u001a\u000200H\u0014J\b\u0010U\u001a\u000200H\u0014J\b\u0010V\u001a\u000200H\u0014J\b\u0010W\u001a\u00020\u0012H\u0002J\b\u0010X\u001a\u000200H\u0002J\b\u0010Y\u001a\u000200H\u0002J\b\u0010Z\u001a\u000200H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030(0\u0014X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8FX\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,¨\u0006\\"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/MmDetailActivity;", "Lcom/ss/android/lark/mm/base/MmBaseActivity;", "Lcom/ss/android/lark/mm/module/detail/IMmDetailCommonDataProvider;", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContextProvider;", "Lcom/ss/android/lark/mm/apm/MmApmAgent$IMmApmDataListener;", "()V", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "getControlRegister", "()Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "setControlRegister", "(Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;)V", "hitPointContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "isUseLocalAudio", "", "listInfoList", "", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastLinkInfo;", "mHost", "", "mToken", "pageAliveEvent", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmTimedHitPointEvent;", "playSettingInfo", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmPlaySettingInfo;", "requestId", "rootView", "Landroid/view/View;", ShareHitPoint.f121868c, "", "url", "videoControl", "Lcom/ss/android/lark/mm/module/player/MmVideoControl;", "videoViewControl", "Lcom/ss/android/lark/mm/module/player/MmVideoViewControl;", "viewControlList", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "getViewControlRegister", "()Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "viewControlRegister$delegate", "Lkotlin/Lazy;", "afterInflateModules", "", "checkIsRecording", "clearControl", "enterNormalDetailPage", "generateHitPointContext", "getBottomPanelY", "getCommonExtraData", "Lorg/json/JSONObject;", "getFromSource", "getHost", "getMContext", "Landroid/content/Context;", "getMmHitPointContext", "getMmTimeExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "getRootView", "getTabPositionY", "getToken", "getUrl", "inflateVideoViewControlIfNeed", "initViewControls", "onBackPressed", "onBaseInfoLoaded", "it", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onError", "onOutputApmData", "apmData", "Lcom/ss/android/lark/mm/apm/MmApmDataInfo;", "onOutputPowerData", "powerData", "Lcom/ss/android/lark/mm/apm/power/MmPowerDataInfo;", "onPause", "onResume", "onStart", "onStop", "shouldStartMonitorPerformance", "startMonitorPerf", "stopPerfMonitor", "triggerMonitorPerf", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmDetailActivity extends MmBaseActivity implements MmApmAgent.IMmApmDataListener, IMmViewControlContext, IMmDetailCommonDataProvider, MmHitPointContextProvider {

    /* renamed from: d */
    public static final Companion f115761d = new Companion(null);

    /* renamed from: b */
    public MmControlRegister f115762b;

    /* renamed from: c */
    public MmBaseInfo f115763c;

    /* renamed from: e */
    private String f115764e = "";

    /* renamed from: f */
    private int f115765f;

    /* renamed from: g */
    private View f115766g;

    /* renamed from: h */
    private String f115767h = "";

    /* renamed from: i */
    private String f115768i = "";

    /* renamed from: j */
    private final List<MmPodcastLinkInfo> f115769j = new ArrayList();

    /* renamed from: k */
    private final Lazy f115770k = LazyKt.lazy(new C45926g(this));

    /* renamed from: l */
    private C47084f f115771l;

    /* renamed from: m */
    private MmPlaySettingInfo f115772m;

    /* renamed from: n */
    private final List<MmBaseViewControl<?, ?>> f115773n = new ArrayList();

    /* renamed from: o */
    private boolean f115774o;

    /* renamed from: p */
    private MmTimedHitPointEvent f115775p;

    /* renamed from: q */
    private MmVideoViewControl f115776q;

    /* renamed from: r */
    private MmVideoControl f115777r;

    /* renamed from: s */
    private String f115778s = "";

    /* renamed from: t */
    private HashMap f115779t;

    @JvmStatic
    /* renamed from: a */
    public static final void m181970a(Context context, String str, int i) {
        Companion.m182008a(f115761d, context, str, i, null, null, null, 56, null);
    }

    /* renamed from: a */
    public Context mo161314a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.mm.base.MmBaseActivity
    /* renamed from: a */
    public View mo161162a(int i) {
        if (this.f115779t == null) {
            this.f115779t = new HashMap();
        }
        View view = (View) this.f115779t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f115779t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo161316a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m181972a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m181969a(this, configuration);
    }

    public AssetManager getAssets() {
        return m181975c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m181973b(this);
    }

    /* renamed from: h */
    public final MmViewControlRegister mo161325h() {
        return (MmViewControlRegister) this.f115770k.getValue();
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: n */
    public Context mo161232n() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m181971a(this);
    }

    /* renamed from: q */
    public Resources mo161331q() {
        return super.getResources();
    }

    /* renamed from: r */
    public AssetManager mo161332r() {
        return super.getAssets();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/MmDetailActivity$Companion;", "", "()V", "MM_LIST_INFO_EXTRA", "", "MM_PLAY_SETTING_INFO_EXTRA", "MM_REQUEST_ID", "MM_SOURCE_EXTRA", "MM_URL_EXTRA", "startActivity", "", "context", "Landroid/content/Context;", "url", ShareHitPoint.f121868c, "", "listInfo", "", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastLinkInfo;", "playSettingInfo", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmPlaySettingInfo;", "requestId", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.MmDetailActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo161333a(Context context, String str, int i, List<MmPodcastLinkInfo> list, MmPlaySettingInfo mmPlaySettingInfo, String str2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "url");
            Intrinsics.checkParameterIsNotNull(str2, "requestId");
            MmAppreciableDetailTracker.m186381a();
            MmDetailPreload.f116093a.mo161866a(str, str2);
            Intent intent = new Intent(context, MmDetailActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("mm_url_extra", str);
            intent.putExtra("mm_source_extra", i);
            intent.putExtra("mm_request_id", str2);
            if (list != null) {
                if (list != null) {
                    intent.putExtra("mm_list_info_extra", (ArrayList) list);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.lark.mm.module.podcast.MmPodcastLinkInfo> /* = java.util.ArrayList<com.ss.android.lark.mm.module.podcast.MmPodcastLinkInfo> */");
                }
            }
            if (mmPlaySettingInfo != null) {
                intent.putExtra("mm_play_setting_info_extra", mmPlaySettingInfo);
            }
            context.startActivity(intent);
        }

        /* renamed from: a */
        public static /* synthetic */ void m182008a(Companion aVar, Context context, String str, int i, List list, MmPlaySettingInfo mmPlaySettingInfo, String str2, int i2, Object obj) {
            List list2;
            MmPlaySettingInfo mmPlaySettingInfo2;
            String str3;
            if ((i2 & 8) != 0) {
                list2 = null;
            } else {
                list2 = list;
            }
            if ((i2 & 16) != 0) {
                mmPlaySettingInfo2 = null;
            } else {
                mmPlaySettingInfo2 = mmPlaySettingInfo;
            }
            if ((i2 & 32) != 0) {
                str3 = MmRandomUtil.f118636a.mo165494a();
            } else {
                str3 = str2;
            }
            aVar.mo161333a(context, str, i, list2, mmPlaySettingInfo2, str3);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
    /* renamed from: a */
    public String mo161315a() {
        return this.f115767h;
    }

    @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
    public String bc_() {
        return this.f115768i;
    }

    @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
    /* renamed from: d */
    public String mo161321d() {
        return this.f115764e;
    }

    @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider, com.ss.android.lark.mm.module.framework.IMmViewControlContext, com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider
    /* renamed from: e */
    public C47084f mo161231e() {
        return this.f115771l;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mm/module/detail/MmDetailActivity$inflateVideoViewControlIfNeed$1$1", "Lcom/ss/android/lark/mm/module/player/IMmVideoControlDepend;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "isPodWin", "", "isPodcast", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.MmDetailActivity$c */
    public static final class C45922c implements IMmVideoControlDepend {

        /* renamed from: a */
        final /* synthetic */ MmDetailActivity f115781a;

        @Override // com.ss.android.lark.mm.module.player.IMmVideoControlDepend
        /* renamed from: a */
        public boolean mo161335a() {
            return false;
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoControlDepend
        /* renamed from: b */
        public boolean mo161336b() {
            return false;
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoControlDepend
        /* renamed from: c */
        public MmBaseInfo mo161337c() {
            return this.f115781a.f115763c;
        }

        C45922c(MmDetailActivity mmDetailActivity) {
            this.f115781a = mmDetailActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mm/module/detail/MmDetailActivity$onCreate$3", "Lcom/ss/android/lark/mm/module/detail/startup/MmDetailStartUpViewControl$IMmDetailStartUpViewControlListener;", "onInitialFailed", "", "onInitialSucceed", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.MmDetailActivity$e */
    public static final class C45924e implements MmDetailStartUpViewControl.IMmDetailStartUpViewControlListener {

        /* renamed from: a */
        final /* synthetic */ MmDetailActivity f115782a;

        @Override // com.ss.android.lark.mm.module.detail.startup.MmDetailStartUpViewControl.IMmDetailStartUpViewControlListener
        /* renamed from: a */
        public void mo161339a() {
            this.f115782a.mo161327j();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45924e(MmDetailActivity mmDetailActivity) {
            this.f115782a = mmDetailActivity;
        }

        @Override // com.ss.android.lark.mm.module.detail.startup.MmDetailStartUpViewControl.IMmDetailStartUpViewControlListener
        /* renamed from: a */
        public void mo161340a(MmBaseInfo mmBaseInfo) {
            Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
            this.f115782a.f115763c = mmBaseInfo;
            this.f115782a.mo161317a(mmBaseInfo);
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: p */
    public C47096b mo161234p() {
        return mo161164b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.MmDetailActivity$b */
    public static final class RunnableC45921b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmDetailActivity f115780a;

        RunnableC45921b(MmDetailActivity mmDetailActivity) {
            this.f115780a = mmDetailActivity;
        }

        public final void run() {
            C45855f.m181664c("MmDetailActivity", "[afterInflateModules]");
            this.f115780a.mo161328k();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.MmDetailActivity$g */
    public static final class C45926g extends Lambda implements Function0<MmViewControlRegister> {
        final /* synthetic */ MmDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45926g(MmDetailActivity mmDetailActivity) {
            super(0);
            this.this$0 = mmDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmViewControlRegister invoke() {
            MmViewControlRegister kVar = new MmViewControlRegister();
            kVar.mo161263a(new C45927a(this));
            return kVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/mm/module/detail/MmDetailActivity$viewControlRegister$2$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.MmDetailActivity$g$a */
        public static final class C45927a extends Lambda implements Function1<String, Unit> {
            final /* synthetic */ C45926g this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45927a(C45926g gVar) {
                super(1);
                this.this$0 = gVar;
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
                if (Intrinsics.areEqual(str, IMmVideoListener.class.getName()) || Intrinsics.areEqual(str, IMmVideoInquirer.class.getName())) {
                    this.this$0.this$0.mo161328k();
                }
            }
        }
    }

    /* renamed from: t */
    private final void m181979t() {
        C45859k.m181686a(new RunnableC45921b(this), 100);
    }

    /* renamed from: v */
    private final void m181981v() {
        MmApmAgent.f115638a.mo161102a(this);
    }

    /* renamed from: x */
    private final void m181983x() {
        MmApmAgent.f115638a.mo161104b(this);
    }

    @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
    /* renamed from: c */
    public String mo161319c() {
        return StatisticsUtil.f118514a.mo165377a(this.f115764e, this.f115765f);
    }

    /* renamed from: i */
    public final MmControlRegister mo161326i() {
        MmControlRegister eVar = this.f115762b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        return eVar;
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: o */
    public View mo161233o() {
        View view = this.f115766g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }

    /* renamed from: w */
    private final void m181982w() {
        if (!MmApmAgent.f115638a.mo161109f()) {
            MmApmAgent.f115638a.mo161106c(new C45925f(this));
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
    /* renamed from: f */
    public int mo161322f() {
        IMmDetailInquirer bVar = (IMmDetailInquirer) mo161325h().mo161259a(IMmDetailInquirer.class);
        if (bVar != null) {
            return bVar.mo161898a();
        }
        return 0;
    }

    @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
    /* renamed from: g */
    public int mo161323g() {
        IMmVideoToolbarInquirer bVar = (IMmVideoToolbarInquirer) mo161325h().mo161259a(IMmVideoToolbarInquirer.class);
        if (bVar != null) {
            return bVar.mo164205a();
        }
        return 0;
    }

    /* renamed from: j */
    public final void mo161327j() {
        List<MmBaseViewControl<?, ?>> list = this.f115773n;
        MmDetailActivity mmDetailActivity = this;
        MmViewControlRegister h = mo161325h();
        MmControlRegister eVar = this.f115762b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        MmDetailTitleBarViewControl mmDetailTitleBarViewControl = new MmDetailTitleBarViewControl(mmDetailActivity, new MmDetailTitleBarViewControlAdapter(h, eVar, new MmDetailTitleBarControl(this.f115767h, this.f115768i)));
        mmDetailTitleBarViewControl.be_();
        list.add(mmDetailTitleBarViewControl);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        C45855f.m181664c("MmDetailActivity", "onBackPressed");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        if (supportFragmentManager.getBackStackEntryCount() == 0) {
            super.onBackPressed();
        } else {
            getSupportFragmentManager().popBackStack();
        }
    }

    /* renamed from: u */
    private final void m181980u() {
        MmControlRegister eVar = this.f115762b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        String name = MmDetailTitleBarControl.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "MmDetailTitleBarControl::class.java.name");
        eVar.mo161918b(name);
        MmControlRegister eVar2 = this.f115762b;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        String name2 = MmVideoControl.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name2, "MmVideoControl::class.java.name");
        eVar2.mo161918b(name2);
        MmControlRegister eVar3 = this.f115762b;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        String name3 = MmVideoToolbarControl.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name3, "MmVideoToolbarControl::class.java.name");
        eVar3.mo161918b(name3);
        MmControlRegister eVar4 = this.f115762b;
        if (eVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        String name4 = MmDetailControl.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name4, "MmDetailControl::class.java.name");
        eVar4.mo161918b(name4);
        MmControlRegister eVar5 = this.f115762b;
        if (eVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        String name5 = MmSearchControl.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name5, "MmSearchControl::class.java.name");
        eVar5.mo161918b(name5);
    }

    /* renamed from: l */
    public void mo161329l() {
        super.onStop();
        C45855f.m181664c("MmDetailActivity", "onStop");
        Iterator<T> it = this.f115773n.iterator();
        while (it.hasNext()) {
            it.next().mo161250z();
        }
        MmControlRegister eVar = this.f115762b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        Iterator<T> it2 = eVar.mo161917b().iterator();
        while (it2.hasNext()) {
            it2.next().mo161239p();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        C45855f.m181664c("MmDetailActivity", "onDestroy");
        mo161164b().mo165470a();
        m181983x();
        MmControlRegister eVar = this.f115762b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        Iterator<T> it = eVar.mo161917b().iterator();
        while (it.hasNext()) {
            it.next().mo161235k();
        }
        MmControlRegister eVar2 = this.f115762b;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        eVar2.mo161920d();
        Iterator<T> it2 = this.f115773n.iterator();
        while (it2.hasNext()) {
            it2.next().mo161245h();
        }
        if (this.f115774o) {
            MmActiveStateObservable.f115698a.mo161189b(this.f115768i);
        }
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        a.getMagicDependency().mo144591a("MmDetailActivity");
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity
    public void onPause() {
        super.onPause();
        C45855f.m181664c("MmDetailActivity", "onPause");
        m181982w();
        MmTimedHitPointEvent mmTimedHitPointEvent = this.f115775p;
        if (mmTimedHitPointEvent != null) {
            mmTimedHitPointEvent.mo165405b();
        }
        Iterator<T> it = this.f115773n.iterator();
        while (it.hasNext()) {
            it.next().mo161249y();
        }
        MmControlRegister eVar = this.f115762b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        Iterator<T> it2 = eVar.mo161917b().iterator();
        while (it2.hasNext()) {
            it2.next().mo161238o();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity
    public void onResume() {
        super.onResume();
        MmTimedHitPointEvent mmTimedHitPointEvent = this.f115775p;
        if (mmTimedHitPointEvent != null) {
            mmTimedHitPointEvent.mo165403a();
        }
        C45855f.m181664c("MmDetailActivity", "onResume");
        m181981v();
        Iterator<T> it = this.f115773n.iterator();
        while (it.hasNext()) {
            it.next().mo161241A();
        }
        MmControlRegister eVar = this.f115762b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        Iterator<T> it2 = eVar.mo161917b().iterator();
        while (it2.hasNext()) {
            it2.next().mo161240q();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        C45855f.m181664c("MmDetailActivity", "onStart");
        Iterator<T> it = this.f115773n.iterator();
        while (it.hasNext()) {
            it.next().mo161248x();
        }
        MmControlRegister eVar = this.f115762b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        Iterator<T> it2 = eVar.mo161917b().iterator();
        while (it2.hasNext()) {
            it2.next().mo161237n();
        }
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        a.getMagicDependency().mo144592a("MmDetailActivity", this, MapsKt.emptyMap());
    }

    /* renamed from: s */
    private final void m181978s() {
        m181980u();
        this.f115773n.clear();
        List<MmBaseViewControl<?, ?>> list = this.f115773n;
        MmDetailActivity mmDetailActivity = this;
        MmViewControlRegister h = mo161325h();
        MmControlRegister eVar = this.f115762b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        MmDetailTitleBarControl dVar = new MmDetailTitleBarControl(this.f115767h, this.f115768i);
        dVar.mo161236m();
        MmDetailTitleBarViewControl mmDetailTitleBarViewControl = new MmDetailTitleBarViewControl(mmDetailActivity, new MmDetailTitleBarViewControlAdapter(h, eVar, dVar));
        mmDetailTitleBarViewControl.be_();
        list.add(mmDetailTitleBarViewControl);
        List<MmBaseViewControl<?, ?>> list2 = this.f115773n;
        MmViewControlRegister h2 = mo161325h();
        MmControlRegister eVar2 = this.f115762b;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        MmVideoToolbarControl fVar = new MmVideoToolbarControl(this.f115764e, this.f115769j);
        fVar.mo161236m();
        MmVideoToolbarViewControl gVar = new MmVideoToolbarViewControl(mmDetailActivity, new MmDetailToolbarControlAdapter(h2, eVar2, fVar));
        gVar.be_();
        list2.add(gVar);
        List<MmBaseViewControl<?, ?>> list3 = this.f115773n;
        MmViewControlRegister h3 = mo161325h();
        MmControlRegister eVar3 = this.f115762b;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        MmDetailControl fVar2 = new MmDetailControl(this.f115764e);
        fVar2.mo161236m();
        MmDetailViewControl hVar = new MmDetailViewControl(mmDetailActivity, new MmDetailViewControlAdapter(h3, eVar3, fVar2));
        hVar.be_();
        list3.add(hVar);
        List<MmBaseViewControl<?, ?>> list4 = this.f115773n;
        MmViewControlRegister h4 = mo161325h();
        MmControlRegister eVar4 = this.f115762b;
        if (eVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        MmSearchControl gVar2 = new MmSearchControl(this.f115767h, this.f115768i);
        gVar2.mo161236m();
        MmDetailSearchViewControl eVar5 = new MmDetailSearchViewControl(mmDetailActivity, new MmDetailSearchViewControlAdapter(h4, eVar4, gVar2));
        eVar5.be_();
        list4.add(eVar5);
    }

    /* renamed from: y */
    private final boolean m181984y() {
        boolean z;
        boolean k = C45852d.m181651a().mo161150a(this.f115768i).mo164532k();
        C45852d a = C45852d.m181651a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
        if (a.mo161151b().mo164273c() == MmPodcastControl.DisplayMode.FLOAT_WINDOW) {
            z = true;
        } else {
            z = false;
        }
        IMmDepend a2 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
        AbstractC45897a lifecycleDependency = a2.getLifecycleDependency();
        Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
        Activity a3 = lifecycleDependency.mo144570a();
        if (a3 != null) {
            Intrinsics.checkExpressionValueIsNotNull(a3, "MmDepend.impl().lifecycl…pActivity ?: return false");
            boolean areEqual = Intrinsics.areEqual(a3.getClass().getName(), MmDetailActivity.class.getName());
            C45855f.m181664c("MmDetailActivity", "[shouldStartMonitorPerformance], because isRecordingFloatWindowMode: " + k + ", " + "isPodcastFloatWindowMode: " + z + ", " + "isOnCurrentPage: " + areEqual);
            if (k || z || !areEqual) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final MmVideoViewControl mo161328k() {
        String str;
        C45855f.m181664c("MmDetailActivity", "[inflateVideoViewControlIfNeed] " + this.f115776q);
        if (this.f115776q == null) {
            MmVideoControl eVar = new MmVideoControl(this.f115764e, this.f115772m, mo161164b());
            eVar.mo164018a(new C45922c(this));
            eVar.mo161236m();
            this.f115777r = eVar;
            MmDetailActivity mmDetailActivity = this;
            MmViewControlRegister h = mo161325h();
            MmControlRegister eVar2 = this.f115762b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
            }
            MmVideoControl eVar3 = this.f115777r;
            if (eVar3 == null) {
                Intrinsics.throwNpe();
            }
            MmVideoViewControl fVar = new MmVideoViewControl(mmDetailActivity, new MmVideoViewControlAdapter(h, eVar2, eVar3));
            fVar.be_();
            this.f115776q = fVar;
            IMmVideoToolbarListener cVar = (IMmVideoToolbarListener) mo161325h().mo161266d(IMmVideoToolbarListener.class);
            if (cVar != null) {
                MmVideoViewControl fVar2 = this.f115776q;
                if (fVar2 == null) {
                    Intrinsics.throwNpe();
                }
                cVar.mo164213a(((IMmVideoDependency) fVar2.mo161247w()).mo163630g());
            }
            MmVideoControl eVar4 = this.f115777r;
            if (eVar4 != null) {
                eVar4.mo164038r();
            }
            IMmVideoToolbarListener cVar2 = (IMmVideoToolbarListener) mo161325h().mo161266d(IMmVideoToolbarListener.class);
            if (cVar2 != null) {
                MmBaseInfo mmBaseInfo = this.f115763c;
                if (mmBaseInfo == null || (str = mmBaseInfo.getObjectToken()) == null) {
                    str = "";
                }
                cVar2.mo164210a((long) C46587a.m184217b(str), false);
            }
            List<MmBaseViewControl<?, ?>> list = this.f115773n;
            MmVideoViewControl fVar3 = this.f115776q;
            if (fVar3 == null) {
                Intrinsics.throwNpe();
            }
            list.add(fVar3);
        }
        MmVideoViewControl fVar4 = this.f115776q;
        if (fVar4 == null) {
            Intrinsics.throwNpe();
        }
        return fVar4;
    }

    /* renamed from: m */
    public final JSONObject mo161330m() {
        MmBaseInfo mmBaseInfo;
        boolean z;
        boolean z2;
        long j;
        MmControlRegister eVar = this.f115762b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) eVar.mo161912a(MmMeetingBaseInfoControl.class);
        MmTranslateLangType mmTranslateLangType = null;
        if (mmMeetingBaseInfoControl != null) {
            mmBaseInfo = mmMeetingBaseInfoControl.mo161581b();
        } else {
            mmBaseInfo = null;
        }
        MmControlRegister eVar2 = this.f115762b;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        MmTranslateControl dVar = (MmTranslateControl) eVar2.mo161912a(MmTranslateControl.class);
        if (dVar != null) {
            mmTranslateLangType = dVar.mo161280a();
        }
        boolean z3 = false;
        if (mmTranslateLangType != MmTranslateLangType.DEFAULT) {
            z = true;
        } else {
            z = false;
        }
        IMmDetailTitleBarInquirer bVar = (IMmDetailTitleBarInquirer) mo161325h().mo161259a(IMmDetailTitleBarInquirer.class);
        if (bVar == null || !bVar.mo162725f()) {
            z2 = false;
        } else {
            z2 = true;
        }
        MmVideoControl eVar3 = this.f115777r;
        if (eVar3 != null && eVar3.mo164036j()) {
            z3 = true;
        }
        MmControlRegister eVar4 = this.f115762b;
        if (eVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
        }
        MmMeetingSubtitleControl dVar2 = (MmMeetingSubtitleControl) eVar4.mo161912a(MmMeetingSubtitleControl.class);
        if (dVar2 != null) {
            j = dVar2.mo162308d();
        } else {
            j = 0;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("objectToken", this.f115768i);
        if (mmBaseInfo != null) {
            jSONObject.put("hasVideo", mmBaseInfo.isVideoType());
            jSONObject.put("contentSize", j);
            jSONObject.put("mediaDuration", mmBaseInfo.getDuration());
            jSONObject.put("isInTranslationMode", z);
            jSONObject.put("isInLandScape", z3);
            jSONObject.put("isSmallVideoViewShown", z2);
        }
        return jSONObject;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/mm/module/detail/MmDetailActivity$onCreate$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.MmDetailActivity$d */
    static final class C45923d extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ MmDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45923d(MmDetailActivity mmDetailActivity) {
            super(1);
            this.this$0 = mmDetailActivity;
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
            if (Intrinsics.areEqual(str, MmVideoControl.class.getName())) {
                this.this$0.mo161328k();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/MmDetailActivity$triggerMonitorPerf$1", "Lcom/ss/android/lark/mm/apm/MmApmAgent$IMmApmDataListener;", "onOutputApmData", "", "apmData", "Lcom/ss/android/lark/mm/apm/MmApmDataInfo;", "onOutputPowerData", "powerData", "Lcom/ss/android/lark/mm/apm/power/MmPowerDataInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.MmDetailActivity$f */
    public static final class C45925f implements MmApmAgent.IMmApmDataListener {

        /* renamed from: a */
        final /* synthetic */ MmDetailActivity f115783a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45925f(MmDetailActivity mmDetailActivity) {
            this.f115783a = mmDetailActivity;
        }

        @Override // com.ss.android.lark.mm.apm.MmApmAgent.IMmApmDataListener
        /* renamed from: a */
        public void mo161111a(MmApmDataInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "apmData");
            MmMonitorUtils aVar = MmMonitorUtils.f118585a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", MmApmMonitorScene.MinutesDetail.name());
            aVar.mo165440a(jSONObject, bVar, this.f115783a.mo161330m());
        }

        @Override // com.ss.android.lark.mm.apm.MmApmAgent.IMmApmDataListener
        /* renamed from: a */
        public void mo161112a(MmPowerDataInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "powerData");
            MmMonitorUtils aVar = MmMonitorUtils.f118585a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", MmApmMonitorScene.MinutesDetail.name());
            aVar.mo165441a(jSONObject, bVar, this.f115783a.mo161330m());
        }
    }

    /* renamed from: b */
    public static Resources m181973b(MmDetailActivity mmDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mmDetailActivity);
        }
        return mmDetailActivity.mo161331q();
    }

    /* renamed from: c */
    public static AssetManager m181975c(MmDetailActivity mmDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mmDetailActivity);
        }
        return mmDetailActivity.mo161332r();
    }

    /* renamed from: d */
    private final void m181977d(MmBaseInfo mmBaseInfo) {
        this.f115771l = new C47084f(mmBaseInfo.getMeetingId(), mmBaseInfo.isOwner(), mmBaseInfo.getObjectToken(), mmBaseInfo.getObjectType(), mmBaseInfo.isCanModify());
    }

    /* renamed from: c */
    private final boolean m181976c(MmBaseInfo mmBaseInfo) {
        MmRecordManager.Companion aVar = MmRecordManager.f117918g;
        String objectToken = mmBaseInfo.getObjectToken();
        Intrinsics.checkExpressionValueIsNotNull(objectToken, "baseInfo.objectToken");
        MmRecordManager.RecordState a = aVar.mo164546a(objectToken);
        if (a == MmRecordManager.RecordState.UNKNOWN) {
            return ObjectStatus.Companion.mo161610e(Integer.valueOf(mmBaseInfo.getObjectStatus()));
        }
        if (a != MmRecordManager.RecordState.STOPPED) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m181971a(MmDetailActivity mmDetailActivity) {
        mmDetailActivity.mo161329l();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MmDetailActivity mmDetailActivity2 = mmDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mmDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private final void m181974b(MmBaseInfo mmBaseInfo) {
        boolean z;
        String videoUrlWithLocal;
        C45855f.m181664c("MmDetailActivity", "enter normal page");
        m181977d(mmBaseInfo);
        MmTimedHitPointEvent mmTimedHitPointEvent = this.f115775p;
        if (mmTimedHitPointEvent != null) {
            mmTimedHitPointEvent.mo165404a(this.f115771l);
        }
        MmTimedHitPointEvent mmTimedHitPointEvent2 = this.f115775p;
        if (mmTimedHitPointEvent2 != null) {
            String topic = mmBaseInfo.getTopic();
            Intrinsics.checkExpressionValueIsNotNull(topic, "baseInfo.topic");
            mmTimedHitPointEvent2.mo165402a("title", topic);
        }
        if (mmBaseInfo.isCompletedState()) {
            C47083e.m186425a(mo161231e(), "vc_mm_page_view", C47086i.m186432a().mo165413a("page_name", "detail_page").mo165413a("from_source", mo161319c()).mo165421c());
            C47083e.m186425a(mo161231e(), "vc_minutes_detail_view", C47086i.m186432a().mo165426h("detail_page").mo165421c());
        } else {
            C47083e.m186425a(mo161231e(), "vc_mm_page_view", C47086i.m186432a().mo165413a("page_name", "pre_detail_page").mo165421c());
            C47083e.m186425a(mo161231e(), "vc_minutes_detail_view", C47086i.m186432a().mo165426h("pre_detail_page").mo165421c());
        }
        String videoUrl = mmBaseInfo.getVideoUrl();
        boolean z2 = false;
        if (videoUrl == null || StringsKt.isBlank(videoUrl)) {
            z = true;
        } else {
            z = false;
        }
        if (z && (videoUrlWithLocal = mmBaseInfo.getVideoUrlWithLocal()) != null && (!StringsKt.isBlank(videoUrlWithLocal))) {
            z2 = true;
        }
        this.f115774o = z2;
        if (z2) {
            MmActiveStateObservable cVar = MmActiveStateObservable.f115698a;
            String objectToken = mmBaseInfo.getObjectToken();
            Intrinsics.checkExpressionValueIsNotNull(objectToken, "baseInfo.objectToken");
            cVar.mo161187a(objectToken);
        }
        m181978s();
        m181979t();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C45855f.m181664c("MmDetailActivity", "onCreate");
        C45855f.m181664c("MmAppreciableDetailTracker", "onCreate");
        setContentView(R.layout.mm_activity_detail);
        bd_();
        View findViewById = findViewById(R.id.detailSelectableRootView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "this.findViewById(R.id.detailSelectableRootView)");
        this.f115766g = findViewById;
        String stringExtra = getIntent().getStringExtra("mm_url_extra");
        if (stringExtra != null) {
            this.f115764e = stringExtra;
            C45855f.m181663b("MmDetailActivity", "url: " + this.f115764e);
            String stringExtra2 = getIntent().getStringExtra("mm_request_id");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.f115778s = stringExtra2;
            this.f115765f = getIntent().getIntExtra("mm_source_extra", 0);
            this.f115767h = UrlUtil.f118671a.mo165518b(this.f115764e);
            this.f115768i = UrlUtil.f118671a.mo165517a(this.f115764e);
            Serializable serializableExtra = getIntent().getSerializableExtra("mm_play_setting_info_extra");
            if (!(serializableExtra instanceof MmPlaySettingInfo)) {
                serializableExtra = null;
            }
            this.f115772m = (MmPlaySettingInfo) serializableExtra;
            Serializable serializableExtra2 = getIntent().getSerializableExtra("mm_list_info_extra");
            if (serializableExtra2 != null && (serializableExtra2 instanceof ArrayList)) {
                this.f115769j.addAll((ArrayList) serializableExtra2);
            }
            MmTimedHitPointEvent mmTimedHitPointEvent = new MmTimedHitPointEvent(mo161164b(), "predefine_page_alive", "duration", null, 8, null);
            mmTimedHitPointEvent.mo165402a("url", this.f115764e);
            this.f115775p = mmTimedHitPointEvent;
            MmControlRegister eVar = new MmControlRegister(this.f115768i);
            eVar.mo161913a();
            eVar.mo161916a(new C45923d(this));
            this.f115762b = eVar;
            this.f115773n.clear();
            MmControlRegister eVar2 = this.f115762b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
            }
            eVar2.mo161914a(new MmMeetingSubtitleControl(this.f115767h, this.f115768i, this.f115764e, this.f115778s));
            MmControlRegister eVar3 = this.f115762b;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
            }
            eVar3.mo161914a(new MmSummaryControl(this.f115767h, this.f115768i, this.f115764e, this.f115778s));
            MmDetailActivity mmDetailActivity = this;
            MmViewControlRegister h = mo161325h();
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = new MmMeetingBaseInfoControl(this.f115764e, this.f115778s, true, mo161164b());
            MmControlRegister eVar4 = this.f115762b;
            if (eVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlRegister");
            }
            MmDetailStartUpViewControl dVar = new MmDetailStartUpViewControl(mmDetailActivity, new MmDetailStartUpViewControlAdapter(h, mmMeetingBaseInfoControl, eVar4));
            dVar.be_();
            this.f115773n.add(dVar);
            dVar.mo161416a(new C45924e(this));
            MmDetailStartUpViewControl.m182126a(dVar, false, 1, null);
        }
    }

    @Override // com.ss.android.lark.mm.apm.MmApmAgent.IMmApmDataListener
    /* renamed from: a */
    public void mo161111a(MmApmDataInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "apmData");
        if (m181984y()) {
            MmMonitorUtils aVar = MmMonitorUtils.f118585a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", MmApmMonitorScene.MinutesDetail.name());
            aVar.mo165440a(jSONObject, bVar, mo161330m());
        }
    }

    @Override // com.ss.android.lark.mm.apm.MmApmAgent.IMmApmDataListener
    /* renamed from: a */
    public void mo161112a(MmPowerDataInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "powerData");
        if (m181984y()) {
            MmMonitorUtils aVar = MmMonitorUtils.f118585a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", MmApmMonitorScene.MinutesDetail.name());
            aVar.mo165441a(jSONObject, bVar, mo161330m());
        }
    }

    /* renamed from: a */
    public final void mo161317a(MmBaseInfo mmBaseInfo) {
        C45855f.m181663b("MmDetailActivity", "baseInfo status: " + mmBaseInfo.getObjectStatus() + ", token: " + mmBaseInfo.getObjectToken() + ", videoUrl: " + mmBaseInfo.getVideoUrl());
        if (m181976c(mmBaseInfo)) {
            C45855f.m181664c("MmDetailActivity", "enter recording page");
            C45852d.m181651a().mo161150a(mmBaseInfo.getObjectToken()).mo164519a(mmBaseInfo, new Language());
            C45852d.m181651a().mo161150a(mmBaseInfo.getObjectToken()).mo164529h();
            finish();
            return;
        }
        C45852d a = C45852d.m181651a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
        if (a.mo161151b().mo164278h()) {
            C45855f.m181664c("MmDetailActivity", "should turn off podcast: " + mmBaseInfo.isUncompletedRecordingType());
            if (mmBaseInfo.isUncompletedRecordingType()) {
                C45855f.m181664c("MmDetailActivity", "turn off podcast");
                C45852d a2 = C45852d.m181651a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "MmControl.of()");
                a2.mo161151b().mo164284t();
                m181974b(mmBaseInfo);
                return;
            }
            C45855f.m181664c("MmDetailActivity", "enter podcast mode");
            C45852d a3 = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "MmControl.of()");
            MmPodcastControl b = a3.mo161151b();
            String str = this.f115764e;
            String topic = mmBaseInfo.getTopic();
            Intrinsics.checkExpressionValueIsNotNull(topic, "it.topic");
            MmPodcastControl.m185176a(b, new MmPodcastLinkInfo(str, topic), this.f115769j, null, 4, null);
            C45852d a4 = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a4, "MmControl.of()");
            a4.mo161151b().mo164280j();
            finish();
            return;
        }
        m181974b(mmBaseInfo);
    }

    /* renamed from: a */
    public static void m181972a(MmDetailActivity mmDetailActivity, Context context) {
        mmDetailActivity.mo161316a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mmDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m181969a(MmDetailActivity mmDetailActivity, Configuration configuration) {
        Context a = mmDetailActivity.mo161314a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
