package com.tt.miniapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.menu.AbstractC13135b;
import com.bytedance.ee.larkbrand.menu.C13141f;
import com.bytedance.ee.larkbrand.menu.WorkplaceConfigResponse;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.he.jsbinding.snapshot.ISnapshotService;
import com.he.jsbinding.snapshot.SnapshotServiceImpl;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.openplatform.core.container.p1118a.p1119a.AbstractC24460a;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.ApiHandlerManager;
import com.tt.frontendapiinterface.IActivityLife;
import com.tt.frontendapiinterface.IBackPressedListener;
import com.tt.frontendapiinterface.IKeyboardObserver;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.C65807c;
import com.tt.miniapp.C66205j;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.aa.C65722b;
import com.tt.miniapp.debug.PerformanceService;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.errorcode.ErrorType;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.event.C66037e;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.event.p3280a.C66019a;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapp.jsbridge.C66240d;
import com.tt.miniapp.jsbridge.JsRuntimeManager;
import com.tt.miniapp.launchaction.AbstractC66304c;
import com.tt.miniapp.launchaction.C66305d;
import com.tt.miniapp.launchaction.View$OnClickListenerC66306e;
import com.tt.miniapp.launchschedule.LaunchScheduler;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f;
import com.tt.miniapp.p3276d.p3278b.AbstractC65979a;
import com.tt.miniapp.p3293h.C66194c;
import com.tt.miniapp.p3294i.C66203a;
import com.tt.miniapp.p3299l.C66284a;
import com.tt.miniapp.p3307n.C66493a;
import com.tt.miniapp.p3323q.C66683f;
import com.tt.miniapp.p3323q.Choreographer$FrameCallbackC66679d;
import com.tt.miniapp.p3323q.HandlerC66687g;
import com.tt.miniapp.p3327s.AbstractC66736a;
import com.tt.miniapp.p3327s.AbstractC66737b;
import com.tt.miniapp.p3327s.AbstractC66738c;
import com.tt.miniapp.p3331t.AbstractC66891k;
import com.tt.miniapp.p3331t.C66890j;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.preload.PreloadManager;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.progress.AbstractC66659a;
import com.tt.miniapp.progress.AbstractC66660b;
import com.tt.miniapp.render.RenderEngineManager;
import com.tt.miniapp.util.AbstractView$OnClickListenerC67042i;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.util.C67049n;
import com.tt.miniapp.util.C67054r;
import com.tt.miniapp.util.C67068y;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.view.BaseLaunchLoadingView;
import com.tt.miniapp.view.SizeDetectFrameLayout;
import com.tt.miniapp.view.swipeback.C67224a;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67549i;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3370d.AbstractC67477a;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.p3371e.AbstractC67514d;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.util.C67588f;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.option.p3389j.AbstractC67645c;
import com.tt.option.ui.HostOptionUiDepend;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.p */
public class C66546p extends AbstractC65993e implements IActivityLife, IKeyboardObserver, C65807c.AbstractC65808a, AbstractC66660b, C67068y.AbstractC67069a, SizeDetectFrameLayout.AbstractC67139a, AbstractC67477a {

    /* renamed from: A */
    private View f168016A;

    /* renamed from: B */
    private volatile boolean f168017B = false;

    /* renamed from: C */
    private int f168018C = -1;

    /* renamed from: D */
    private boolean f168019D = false;

    /* renamed from: E */
    private boolean f168020E = false;

    /* renamed from: F */
    private String f168021F = "normal";

    /* renamed from: G */
    private AbstractC66738c f168022G;

    /* renamed from: H */
    private AbstractC66736a f168023H;

    /* renamed from: I */
    private View f168024I;

    /* renamed from: J */
    private View$OnClickListenerC66306e f168025J;

    /* renamed from: K */
    private AbstractC66304c f168026K;

    /* renamed from: L */
    private UDEmptyState f168027L;

    /* renamed from: M */
    private List<IKeyboardObserver> f168028M = new ArrayList();

    /* renamed from: N */
    private boolean f168029N = false;

    /* renamed from: O */
    private boolean f168030O = false;

    /* renamed from: P */
    private List<C66557b> f168031P = new ArrayList();

    /* renamed from: Q */
    private C66557b f168032Q;

    /* renamed from: R */
    private AppbrandFragment f168033R;

    /* renamed from: u */
    public C66493a f168034u;

    /* renamed from: v */
    public C66661q f168035v;

    /* renamed from: w */
    private SizeDetectFrameLayout f168036w;

    /* renamed from: x */
    private FragmentManager f168037x;

    /* renamed from: y */
    private AbstractC24460a f168038y = new C65790b();

    /* renamed from: z */
    private C66205j f168039z;

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void miniAppDownloadInstallProgress(int i) {
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: z */
    public void mo232137z() {
    }

    /* renamed from: B */
    public List<C66557b> mo232110B() {
        return this.f168031P;
    }

    /* renamed from: D */
    public C66661q mo232112D() {
        return this.f168035v;
    }

    /* renamed from: F */
    public C66493a mo232114F() {
        return this.f168034u;
    }

    @Override // com.tt.frontendapiinterface.IActivityLife
    public void goback() {
        mo232135x();
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: a */
    public boolean mo232119a(int i, int i2, Intent intent) {
        ApiHandler extResultHandler;
        AbstractC67645c fileChooseHandler;
        if (C65722b.m257660a(this.f166594p).mo230314a(i, i2, intent)) {
            return true;
        }
        Map<String, AbstractC67550j> a = C67549i.m262706a(this.f166594p).mo234574a();
        if (a != null) {
            for (AbstractC67550j jVar : a.values()) {
                if (jVar.mo49465a(i, i2, intent)) {
                    return true;
                }
            }
        }
        boolean z = false;
        if (i == 5 && i2 == 51 && intent != null) {
            Map map = (Map) intent.getSerializableExtra("extra_change_permission_map");
            AbstractC67733a aVar = (AbstractC67733a) this.f166594p.findServiceByInterface(AbstractC67733a.class);
            for (Map.Entry entry : map.entrySet()) {
                aVar.mo50183b(((Integer) entry.getKey()).intValue(), ((Boolean) entry.getValue()).booleanValue());
                AppBrandLogger.m52830i("TTAppbrandTabUI", "change permission ", entry.getKey(), " ", entry.getValue());
            }
            if (map.size() > 0) {
                HostDependManager.getInst().syncPermissionToService(this.f166594p);
            }
            return true;
        }
        if (i == 11) {
            Fragment fragment = null;
            if (mo232133v() > 0) {
                List<C66557b> list = this.f168031P;
                fragment = list.get(list.size() - 1).f168057b;
            }
            if ((fragment instanceof RenderViewManager.IRender) && (fileChooseHandler = ((RenderViewManager.IRender) fragment).getFileChooseHandler()) != null) {
                fileChooseHandler.mo230667a(i, i2, intent);
            }
        }
        for (ApiHandler apiHandler : new ArrayList(ApiHandlerManager.getInst(this.f166594p).getActivityResultApiHandler())) {
            if (apiHandler.onActivityResult(i, i2, intent)) {
                z = true;
            }
        }
        for (AbstractC65803f fVar : new ArrayList(ApiHandlerManager.getInst(this.f166594p).getNewActivityResultApiHandler())) {
            if (fVar.handleActivityResult(i, i2, intent)) {
                z = true;
            }
        }
        return (z || (extResultHandler = ApiHandlerManager.getInst(this.f166594p).getExtResultHandler()) == null) ? z : extResultHandler.onActivityResult(i, i2, intent);
    }

    @Override // com.tt.miniapphost.AbstractC67497e, com.tt.miniapp.AbstractC65993e
    /* renamed from: a */
    public void mo230999a(Intent intent) {
        super.mo230999a(intent);
        Bundle extras = intent.getExtras();
        AppBrandLogger.m52830i("StartApp", "onNewIntent");
        LarkInnerEventHelper.mpAppContainerLoaded(1, this.f166594p);
        if (extras == null || !extras.containsKey("microapp_url")) {
            AppBrandLogger.m52829e("TTAppbrandTabUI", "onNewIntent fail, intent == ", extras);
            return;
        }
        AppInfoEntity appInfo = this.f166581c.getAppInfo();
        if (appInfo == null) {
            AppBrandLogger.m52829e("TTAppbrandTabUI", "onNewIntent fail, mAppInfo is null ");
            return;
        }
        this.f168025J.mo231761a(appInfo, false);
        if (!TextUtils.isEmpty(appInfo.startPage)) {
            String str = appInfo.startPage;
            String g = mo231014g();
            C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(this.f166594p).getRouteEventCtrl();
            if (routeEventCtrl == null || !routeEventCtrl.mo232872a(str, g)) {
                C66588h a = C66588h.m260183a();
                if (a != null) {
                    a.mo232190a((Activity) this.f166580b, true);
                    return;
                }
                return;
            }
            try {
                if (mo230995a() != null) {
                    AppbrandApplicationImpl.getInst(this.f166594p).getRouteEventCtrl().mo232870a();
                    mo230995a().f165499f = false;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", m259998g(str));
                    this.f166581c.onShow();
                    this.f166595q = true;
                    mo230506c(jSONObject.toString());
                    AppBrandLogger.m52830i("TTAppbrandTabUI", "handledPage ", m259998g(str), " currentPage ", g);
                    C66588h a2 = C66588h.m260183a();
                    if (a2 != null) {
                        a2.mo232190a((Activity) this.f166580b, false);
                    }
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("TTAppbrandTabUI", "onNewIntent", e);
            }
        } else {
            C66588h a3 = C66588h.m260183a();
            if (a3 != null) {
                a3.mo232190a((Activity) this.f166580b, true);
            }
        }
    }

    @Override // com.tt.miniapphost.AbstractC67497e, com.tt.miniapp.AbstractC65993e
    /* renamed from: a */
    public void mo231002a(Bundle bundle, Bundle bundle2) {
        super.mo231002a(bundle, bundle2);
        AppBrandLogger.m52830i("StartApp", "onCreate");
        LarkInnerEventHelper.mpAppContainerLoaded(bundle == null ? 0 : 2, this.f166594p);
        TimeLogger.getInstance(this.f166594p).logTimeDuration("TTAppbrandTabUI_onCreate");
        this.f168035v = new C66661q(this.f168038y, this.f166594p);
        this.f168037x.beginTransaction().add(R.id.microapp_m_no_tab_real_content, this.f168035v).commitAllowingStateLoss();
        ((LaunchScheduler) this.f166581c.getService(LaunchScheduler.class)).initPerformance();
        View preloadedView = ((PreloadManager) AppbrandApplicationImpl.getInst(this.f166594p).getService(PreloadManager.class)).getPreloadedView(0);
        if (preloadedView == null) {
            try {
                View inflate = LayoutInflater.from(AppbrandContext.getInst().getApplicationContext()).inflate(R.layout.microapp_m_activity_ttappbrand, (ViewGroup) null);
                this.f168024I = inflate;
                AbstractC66736a aVar = this.f168023H;
                if (aVar != null) {
                    aVar.mo87356a(inflate);
                } else {
                    this.f166580b.setContentView(this.f168024I);
                }
            } catch (Throwable th) {
                AppBrandLogger.m52829e("TTAppbrandTabUI", th);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "microapp setContentView fail ");
                    jSONObject.put("throwable", th.toString());
                    C67509b.m262587a("mp_start_error", 5000, jSONObject, this.f166594p);
                    Thread.sleep(200);
                } catch (Exception unused) {
                    AppBrandLogger.m52829e("TTAppbrandTabUI", th);
                }
                AbstractC67514d a = new C67500a(C67501b.ax, this.f166594p).mo234325a(this.f166594p.getAppId());
                a.setErrorMessage("setContentView(inflate) error: " + th.getMessage()).setError(th).flush();
                this.f166580b.finish();
                return;
            }
        } else {
            C67590h.m263088c(preloadedView);
            try {
                this.f168024I = preloadedView;
                AbstractC66736a aVar2 = this.f168023H;
                if (aVar2 != null) {
                    aVar2.mo87356a(preloadedView);
                } else {
                    this.f166580b.setContentView(preloadedView);
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("TTAppbrandTabUI", "mActivity.setContentView(homeloadingView) exception:" + e);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(ApiHandler.API_CALLBACK_ERRMSG, "microapp set homeloadingView fail ");
                    jSONObject2.put("throwable", e.toString());
                    C67509b.m262587a("mp_start_error", 5000, jSONObject2, this.f166594p);
                    Thread.sleep(200);
                } catch (Exception unused2) {
                    AppBrandLogger.m52829e("TTAppbrandTabUI", e);
                }
                this.f166580b.finish();
                AbstractC67514d a2 = new C67500a(C67501b.ax, this.f166594p).mo234325a(this.f166594p.getAppId());
                a2.setErrorMessage("setContentView(preloaded) error: " + e.getMessage()).setError(e).flush();
                return;
            }
        }
        AbstractC66659a i = mo231016i();
        i.setOnProgressChangedListener(this);
        i.start();
        if (!this.f166594p.isEmbedContainer() || C25529d.m91167h(this.f166594p)) {
            C66205j jVar = new C66205j(this.f166580b, m259987P());
            this.f168039z = jVar;
            jVar.mo231547a(true);
            this.f168039z.mo231549b(true);
        } else {
            AppBrandLogger.m52830i("TTAppbrandTabUI", "embed container, disable immersed status bar helper");
        }
        AppInfoEntity appInfo = this.f166581c.getAppInfo();
        C66020b.m258530a("mp_load_start", this.f166594p).mo231090a("launch_type", appInfo.launchType).mo231092a();
        m259978G();
        ((PreloadManager) AppbrandApplicationImpl.getInst(this.f166594p).getService(PreloadManager.class)).preloadOnActivityInit();
        AppbrandApplicationImpl.getInst(this.f166594p).setActivityLife(this);
        HandlerC66687g monitorHandler = ((PerformanceService) AppbrandApplicationImpl.getInst(this.f166594p).getService(PerformanceService.class)).getMonitorHandler();
        if (monitorHandler != null) {
            monitorHandler.mo232437a(new Choreographer$FrameCallbackC66679d(Choreographer.getInstance(), this.f166594p));
        }
        AppbrandApplicationImpl.getInst(this.f166594p).setAppRouter(new C65807c(this));
        this.f168018C = this.f166580b.getRequestedOrientation();
        m259999h(appInfo.appId);
        C67479c.m262467a().mo234226a(this);
        C67068y.m261381a(this);
        if (C25529d.m91167h(this.f166594p) && ((LaunchScheduler) this.f166581c.getService(LaunchScheduler.class)).isSSBOPENLaunching()) {
            m259979H();
            mo232132u();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.AbstractC65993e
    /* renamed from: a */
    public void mo230996a(int i) {
        if (i == 2) {
            HostDependManager.getInst().showUnSupportView(this.f166580b, this.f166581c.getSchema(), new HostOptionUiDepend.AbstractC67695g() {
                /* class com.tt.miniapp.C66546p.C665537 */

                @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67695g
                /* renamed from: a */
                public void mo231034a() {
                    if (C66546p.this.f166580b != null) {
                        C67224a.f169674a = "others";
                        C67224a.f169675b = true;
                        C67070z.m261391a(C66546p.this.f166580b, 6, C66546p.this.f166594p);
                    }
                }
            }, this.f166594p);
            return;
        }
        mo232132u();
        boolean a = this.f168025J.mo231760a(this.f166581c.getAppInfo());
        AppBrandLogger.m52830i("TTAppbrandTabUI", "show not action support:" + a);
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: a */
    public void mo232118a(boolean z) {
        if (this.f166588j != null) {
            this.f166588j.setEnableGesture(z);
        }
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: a */
    public void mo232117a(String str, String str2) {
        if (this.f168036w != null) {
            UDEmptyState uDEmptyState = new UDEmptyState(this.f166580b);
            this.f168027L = uDEmptyState;
            uDEmptyState.setImageRes(2131234581);
            this.f168027L.setImageSize(Float.valueOf(this.f166580b.getResources().getDimension(R.dimen.microapp_m_menu_indicator_height)));
            this.f168027L.setDesc(str2);
            this.f168027L.setSecondaryText(this.f166580b.getString(R.string.microapp_m_retry_later));
            this.f168027L.setSecondaryClickListener(new View.OnClickListener() {
                /* class com.tt.miniapp.C66546p.AnonymousClass10 */

                public void onClick(View view) {
                    LarkInnerEventHelper.mpLoadingExit("retry", C66546p.this.f166594p);
                    C67224a.f169674a = "others";
                    C67224a.f169675b = true;
                    C66612a.m260227a(AppbrandApplicationImpl.getInst(C66546p.this.f166594p).getAppInfo().appId, AppbrandApplicationImpl.getInst(C66546p.this.f166594p).getSchema(), false);
                }
            });
            this.f168027L.setContainer(this.f168036w);
        }
    }

    @Override // com.tt.miniapp.C65807c.AbstractC65808a
    /* renamed from: a */
    public ApiCallResult.Builder mo230504a(String str) {
        AppBrandLogger.m52830i("TTAppbrandTabUI", "navigateTo ");
        if (mo232133v() >= 10) {
            return ApiCallResult.Builder.createFail("navigateTo").extraInfo(ApiCode.NAVIGATETO_OVER_PAGE_COUNT_LIMIT.msg).errorCode(ApiCode.NAVIGATETO_OVER_PAGE_COUNT_LIMIT.code).appendResponseData("code", 1);
        }
        C67054r.C67055a a = C67054r.m261336a(str);
        if (!C67054r.m261340a(a.f169029c, this.f166594p)) {
            return ApiCallResult.Builder.createFail("navigateTo").extraInfo(ApiCode.NAVIGATETO_PAGE_NOT_EXIST.msg).errorCode(ApiCode.NAVIGATETO_PAGE_NOT_EXIST.code);
        }
        if (C67054r.m261341a(a.f169027a, mo230995a())) {
            return ApiCallResult.Builder.createFail("navigateTo").extraInfo(ApiCode.NAVIGATETO_NAVIGATE_TAB_PAGE.msg).errorCode(ApiCode.NAVIGATETO_NAVIGATE_TAB_PAGE.code).appendResponseData("code", 1);
        }
        FragmentTransaction beginTransaction = this.f168037x.beginTransaction();
        Fragment fragment = null;
        C66557b bVar = this.f168032Q;
        if (bVar != null) {
            fragment = bVar.f168057b;
        }
        if (mo230995a() != null && TextUtils.equals(a.f169029c, mo230995a().f165497d)) {
            mo230995a().f165499f = true;
        }
        AppBrandLogger.m52830i("TTAppbrandTabUI", "navigateTo HidePrePageTrans ", str);
        C66557b bVar2 = new C66557b(a.f169027a, m259989a(beginTransaction, a.f169027a, "navigateTo", new C66556a(fragment)), false);
        this.f168032Q = bVar2;
        bVar2.f168059d = false;
        this.f168031P.add(bVar2);
        return ApiCallResult.Builder.createOk("navigateTo").appendResponseData("code", 0);
    }

    /* renamed from: P */
    private C66205j.C66206a m259987P() {
        return new C66205j.C66206a();
    }

    @Override // com.tt.frontendapiinterface.IActivityLife
    public int getCurrentPageSize() {
        return mo232133v();
    }

    /* renamed from: v */
    public int mo232133v() {
        return this.f168031P.size();
    }

    /* renamed from: I */
    private void m259980I() {
        AppbrandContext.getMainHandler().postDelayed(new Runnable() {
            /* class com.tt.miniapp.$$Lambda$p$SSnkyfgfw5qcFLkjQiZEP1YlTQs */

            public final void run() {
                C66546p.this.m259988Q();
            }
        }, 5000);
    }

    @Override // com.tt.frontendapiinterface.IActivityLife
    public boolean isTabFragment() {
        C66557b bVar = this.f168032Q;
        if (bVar != null) {
            return bVar.f168058c;
        }
        return true;
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void onLoadMainJsSuccess() {
        mo231016i().updateStatus(5);
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void onRemoteDebugOpen() {
        ((JsRuntimeManager) this.f166581c.getService(JsRuntimeManager.class)).initTMARuntime(this.f166580b);
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void onUpdateFailed() {
        AppBrandLogger.m52830i("TTAppbrandTabUI", "onUpdateFailed!");
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void onUpdateReady() {
        AppBrandLogger.m52830i("TTAppbrandTabUI", "onUpdateReady!");
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: r */
    public boolean mo232129r() {
        if (this.f168031P.size() <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public boolean mo232130s() {
        C66557b bVar = this.f168032Q;
        if (bVar != null) {
            return bVar.f168059d;
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo232131t() {
        C66557b bVar = this.f168032Q;
        if (bVar != null) {
            return bVar.f168060e;
        }
        return false;
    }

    /* renamed from: J */
    private void m259981J() {
        if (this.f166594p.mo234169i()) {
            AppbrandApplicationImpl.getInst(this.f166594p).setActivityLife(this);
            AppbrandApplicationImpl.getInst(this.f166594p).setAppRouter(new C65807c(this));
        }
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: A */
    public AbstractC66202i mo232109A() {
        Fragment C = mo232111C();
        if (C instanceof AppbrandFragment) {
            return ((AppbrandFragment) C).getTitleBar();
        }
        return C65966d.f166500g;
    }

    /* renamed from: C */
    public Fragment mo232111C() {
        Fragment fragment;
        C66557b bVar = this.f168032Q;
        if (bVar == null || (fragment = bVar.f168057b) == null) {
            return null;
        }
        if (fragment instanceof C66661q) {
            return ((C66661q) fragment).mo232397f();
        }
        return fragment;
    }

    @Override // com.tt.miniapphost.AbstractC67497e, com.tt.miniapp.AbstractC65993e
    /* renamed from: d */
    public void mo231011d() {
        super.mo231011d();
        AppBrandLogger.m52830i("TTAppbrandTabUI", "onPause");
        this.f168034u.mo232067a((IKeyboardObserver) null);
        this.f168018C = this.f166580b.getRequestedOrientation();
    }

    @Override // com.tt.miniapphost.AbstractC67497e, com.tt.miniapp.AbstractC65993e
    /* renamed from: m */
    public void mo231020m() {
        super.mo231020m();
        Fragment C = mo232111C();
        if (C instanceof AppbrandFragment) {
            ((AppbrandFragment) C).onPostResume();
        }
    }

    @Override // com.tt.miniapphost.p3370d.AbstractC67477a
    public void onLanguageChange() {
        if (this.f166581c.getAppInfo() != null) {
            this.f166589k.mo49126a(this.f166581c.getAppInfo());
        }
    }

    /* renamed from: u */
    public void mo232132u() {
        if (this.f166586h) {
            this.f166586h = false;
            if (this.f166589k != null) {
                this.f166589k.mo49128b();
            }
            AbstractC66738c cVar = this.f168022G;
            if (cVar != null) {
                cVar.mo232569a();
            }
        }
    }

    /* renamed from: com.tt.miniapp.p$a */
    static class C66556a implements AbstractC66187h {

        /* renamed from: a */
        private Fragment f168055a;

        @Override // com.tt.miniapp.AbstractC66187h
        /* renamed from: a */
        public void mo231524a() {
            Fragment fragment = this.f168055a;
            if (fragment != null) {
                AppBrandLogger.m52830i("TTAppbrandTabUI", " HidePrePageTrans hide ", fragment);
                FragmentTransaction fragmentTransaction = null;
                if (this.f168055a.getFragmentManager() != null) {
                    fragmentTransaction = this.f168055a.getFragmentManager().beginTransaction();
                }
                Fragment fragment2 = this.f168055a;
                if (fragment2 instanceof AbstractC66891k) {
                    ((AbstractC66891k) fragment2).doWithOutCommitByAnimationEnd(fragmentTransaction);
                }
                if (fragmentTransaction != null) {
                    fragmentTransaction.commitAllowingStateLoss();
                }
            }
        }

        C66556a(Fragment fragment) {
            this.f168055a = fragment;
            if (fragment instanceof AbstractC66891k) {
                ((AbstractC66891k) fragment).offerHideToQueue();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.p$c */
    public static class C66558c implements AbstractC66187h {

        /* renamed from: a */
        private List<Fragment> f168061a;

        @Override // com.tt.miniapp.AbstractC66187h
        /* renamed from: a */
        public void mo231524a() {
            List<Fragment> list = this.f168061a;
            if (list != null && list.size() > 0) {
                FragmentManager fragmentManager = this.f168061a.get(0).getFragmentManager();
                FragmentTransaction fragmentTransaction = null;
                if (fragmentManager != null) {
                    fragmentTransaction = fragmentManager.beginTransaction();
                }
                for (Fragment fragment : this.f168061a) {
                    if (fragment instanceof AbstractC66891k) {
                        ((AbstractC66891k) fragment).doWithOutCommitByAnimationEnd(fragmentTransaction);
                    }
                }
                if (fragmentTransaction != null) {
                    fragmentTransaction.commitAllowingStateLoss();
                }
            }
        }

        C66558c(List<Fragment> list) {
            this.f168061a = list;
            for (Fragment fragment : list) {
                if (fragment instanceof AbstractC66891k) {
                    if (fragment instanceof C66661q) {
                        ((C66661q) fragment).offerRemoveToQueue();
                    } else if (fragment instanceof AppbrandFragment) {
                        ((AppbrandFragment) fragment).offerRemoveToQueue();
                    }
                }
            }
        }
    }

    /* renamed from: com.tt.miniapp.p$d */
    static class C66559d implements AbstractC66187h {

        /* renamed from: a */
        private Fragment f168062a;

        @Override // com.tt.miniapp.AbstractC66187h
        /* renamed from: a */
        public void mo231524a() {
            Fragment fragment = this.f168062a;
            if (fragment != null) {
                AppBrandLogger.m52830i("TTAppbrandTabUI", " RemovePrePageTrans remove ", fragment);
                FragmentTransaction fragmentTransaction = null;
                if (this.f168062a.getFragmentManager() != null) {
                    fragmentTransaction = this.f168062a.getFragmentManager().beginTransaction();
                }
                Fragment fragment2 = this.f168062a;
                if (fragment2 instanceof AbstractC66891k) {
                    ((AbstractC66891k) fragment2).doWithOutCommitByAnimationEnd(fragmentTransaction);
                }
                if (fragmentTransaction != null) {
                    fragmentTransaction.commitAllowingStateLoss();
                }
            }
        }

        C66559d(Fragment fragment) {
            this.f168062a = fragment;
            if (fragment instanceof AbstractC66891k) {
                ((AbstractC66891k) fragment).offerRemoveToQueue();
            }
        }
    }

    @Override // com.tt.miniapphost.AbstractC67497e, com.tt.miniapp.AbstractC65993e
    /* renamed from: f */
    public void mo231013f() {
        super.mo231013f();
        C66493a aVar = this.f168034u;
        if (aVar != null) {
            aVar.mo232068b();
            this.f168034u = null;
        }
        C66205j jVar = this.f168039z;
        if (jVar != null) {
            jVar.mo231546a();
            this.f168039z = null;
        }
        this.f168035v = null;
        this.f168033R = null;
        this.f168036w = null;
        this.f168032Q = null;
        if (mo231016i() != null) {
            mo231016i().stop();
        }
        AppBrandLogger.m52830i("TTAppbrandTabUI", "onDestroy");
        C66036d.m258584a("micro app onDestroy called", this.f166594p);
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67434b, com.tt.miniapp.AbstractC65993e
    /* renamed from: g */
    public String mo231014g() {
        C66557b bVar = this.f168032Q;
        if (bVar == null) {
            return "";
        }
        if (!bVar.f168058c || this.f168032Q.f168057b == null) {
            return this.f168032Q.f168056a;
        }
        return ((C66661q) this.f168032Q.f168057b).mo232393c();
    }

    @Override // com.tt.miniapphost.AbstractC67497e, com.tt.miniapp.AbstractC65993e
    /* renamed from: n */
    public void mo231024n() {
        super.mo231024n();
        List<C66557b> list = this.f168031P;
        if (list != null) {
            for (C66557b bVar : list) {
                Fragment fragment = bVar.f168057b;
                if (fragment instanceof AppbrandFragment) {
                    ((AppbrandFragment) fragment).onUserLeaveHint();
                }
            }
        }
    }

    /* renamed from: o */
    public void mo232126o() {
        if (this.f166589k.getParent() != null && C67590h.m263085b(this.f166589k) && !TextUtils.isEmpty(this.f166590l)) {
            this.f168036w.removeViewAt(this.f168036w.indexOfChild(this.f166589k));
            this.f166589k = null;
            m259978G();
            this.f166589k.mo49127a(this.f166590l, this.f166591m, "false");
        }
    }

    /* renamed from: q */
    public void mo232128q() {
        AppBrandLogger.m52830i("TTAppbrandTabUI", "onDOMReady: " + mo231014g());
        TimeLogger.getInstance(this.f166594p).stopScheduleFlush();
        m259983L();
    }

    @Override // com.tt.miniapp.util.C67068y.AbstractC67069a
    /* renamed from: w */
    public View mo232134w() {
        if (!HostDependManager.getInst().getFeatureGating("openplatform.gadget.disalbe.find.root.content", false)) {
            AppBrandLogger.m52830i("TTAppbrandTabUI", "getActivityRootView by content view");
            return this.f168024I;
        }
        AppBrandLogger.m52830i("TTAppbrandTabUI", "getActivityRootView by R.id.content");
        if (this.f166580b == null) {
            return null;
        }
        return this.f166580b.findViewById(16908290);
    }

    /* renamed from: H */
    private void m259979H() {
        if (mo230995a() != null) {
            String str = mo230995a().f165497d;
            AppInfoEntity appInfo = this.f166581c.getAppInfo();
            if (!TextUtils.isEmpty(appInfo.startPage)) {
                str = appInfo.startPage;
            }
            m260000i(str);
            m259980I();
            new C67500a("op_attach_first_page", C67501b.aA, this.f166594p).setDuration(System.currentTimeMillis() - this.f166585g.getMillisAfterStart()).flush();
        }
    }

    /* renamed from: K */
    private void m259982K() {
        if (this.f168020E) {
            this.f168020E = false;
            C66037e.m258610a(this.f166594p).mo231119b("success");
            C66036d.m258579a(TimeMeter.stop(this.f166585g), "success", "", TimeMeter.stop(this.f166593o), C66037e.m258610a(this.f166594p).mo231114a(), this.f166594p);
            LarkInnerEventHelper.mpAppLaunchResult(this.f168021F, "success", null, null, null, null, this.f166594p);
            this.f166579a = this.f166582d.mo234095c();
            C66020b.m258530a("openplatform_mp_launch_status", this.f166594p).mo231090a("duration", Long.valueOf(this.f166579a)).mo231091a(C66019a.m258527a(this.f166594p)).mo231092a();
        }
    }

    /* renamed from: N */
    private int m259985N() {
        int i;
        Exception e;
        try {
            Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) this.f166580b.getSystemService("activity")).getProcessMemoryInfo(new int[]{Process.myPid()});
            if (processMemoryInfo == null || processMemoryInfo.length <= 0) {
                return 0;
            }
            i = processMemoryInfo[0].getTotalPss();
            try {
                AppBrandLogger.m52828d("TTAppbrandTabUI", "totalPss:" + i);
            } catch (Exception e2) {
                e = e2;
            }
            return i;
        } catch (Exception e3) {
            e = e3;
            i = 0;
            e.printStackTrace();
            return i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m259988Q() {
        boolean z;
        String str;
        if (mo232109A() == null || !mo232109A().mo230941b()) {
            z = false;
        } else {
            z = true;
        }
        if (this.f166594p == null) {
            str = "";
        } else {
            str = this.f166594p.getAppId();
        }
        AppBrandLogger.m52830i("TTAppbrandTabUI", "tryShowNotification " + str + " , isCustomTitleBar = " + z);
        this.f168026K.mo231758a(str, z, 0);
    }

    /* renamed from: E */
    public void mo232113E() {
        AppbrandFragment appbrandFragment;
        Fragment C = mo232111C();
        if (C instanceof AppbrandFragment) {
            appbrandFragment = (AppbrandFragment) C;
        } else if (C instanceof C66661q) {
            appbrandFragment = (AppbrandFragment) ((C66661q) C).mo232397f();
        } else {
            appbrandFragment = null;
        }
        if (appbrandFragment != null) {
            ((LaunchScheduler) this.f166581c.getService(LaunchScheduler.class)).onClose(this.f166580b.getWindow().getDecorView(), appbrandFragment.getTitleBarHeight() + C67588f.m263060a(this.f166580b));
            return;
        }
        AppBrandLogger.m52830i("TTAppbrandTabUI", "handleBackEvent but dest fragment = null");
    }

    @Override // com.tt.miniapphost.AbstractC67497e, com.tt.miniapp.AbstractC65993e
    /* renamed from: c */
    public void mo231009c() {
        super.mo231009c();
        this.f166594p.mo234159a(this);
        m259981J();
        AppBrandLogger.m52830i("TTAppbrandTabUI", "onResume");
        if (this.f168018C != this.f166580b.getRequestedOrientation()) {
            this.f166580b.setRequestedOrientation(this.f168018C);
        }
        this.f168034u.mo232067a(this);
        try {
            View childAt = mo231019l().getChildAt(0);
            if (childAt != null && !childAt.isShown()) {
                childAt.setVisibility(0);
            }
            if (childAt != null && childAt.getX() > BitmapDescriptorFactory.HUE_RED) {
                childAt.layout(0, childAt.getTop(), childAt.getRight() - childAt.getLeft(), childAt.getBottom());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        m259982K();
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void onPreloadEnd() {
        TimeLogger.getInstance(this.f166594p).logTimeDuration("TTAppbrandTabUI_onPreloadEnd");
        AppBrandLogger.m52830i("TTAppbrandTabUI", "onPreloadEnd ", Long.valueOf(this.f166585g.getMillisAfterStart()));
        if (this.f166580b != null && this.f168017B) {
            this.f168017B = false;
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.C66546p.RunnableC665526 */

                public void run() {
                    C66546p.this.mo232127p();
                }
            });
            AppBrandLogger.m52830i("TTAppbrandTabUI", "onPreloadEnd mActivity != null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo232135x() {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.C66546p.mo232135x():void");
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: y */
    public void mo232136y() {
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.f166594p).getRenderViewManager();
        boolean z = false;
        if (renderViewManager != null) {
            RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
            if (currentIRender != null) {
                Iterator<IBackPressedListener> it = currentIRender.getBackPressedListener().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().onBackPressed()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } else {
            AppBrandLogger.m52829e("TTAppbrandTabUI", "webViewManager == null");
        }
        if (!z) {
            m259990a(1, "back_from_user", true);
        }
    }

    /* renamed from: G */
    private void m259978G() {
        AbstractC65979a aVar;
        this.f168034u = new C66493a(this.f166580b, this.f166594p);
        SizeDetectFrameLayout sizeDetectFrameLayout = (SizeDetectFrameLayout) this.f168024I.findViewById(R.id.tma_root_layout);
        this.f168036w = sizeDetectFrameLayout;
        FrameLayout frameLayout = (FrameLayout) sizeDetectFrameLayout.findViewById(R.id.no_status_bar_slot_view);
        if (frameLayout != null) {
            if (ProcessUtil.isMiniappProcess()) {
                frameLayout.setPadding(0, C67043j.m261285g(this.f166580b), 0, 0);
            }
            frameLayout.setClickable(false);
        }
        this.f168036w.setWindowSizeListener(this);
        this.f168036w.post(new Runnable() {
            /* class com.tt.miniapp.C66546p.RunnableC665471 */

            public void run() {
                if (C66546p.this.f168034u != null) {
                    C66546p.this.f168034u.mo232066a();
                }
            }
        });
        C67485a a = C67485a.m262488a(this.f166594p);
        if (!(a == null || (aVar = (AbstractC65979a) a.mo234274D().mo230962a(AbstractC65979a.class)) == null)) {
            this.f166589k = aVar.mo49121a();
        }
        if (this.f166589k == null) {
            if (ProcessUtil.isMainProcess(this.f166580b)) {
                this.f166589k = (BaseLaunchLoadingView) ((PreloadManager) AppbrandApplicationImpl.getInst(this.f166594p).getService(PreloadManager.class)).getPreloadedView(6);
            } else {
                this.f166589k = (BaseLaunchLoadingView) ((PreloadManager) AppbrandApplicationImpl.getInst(this.f166594p).getService(PreloadManager.class)).getPreloadedView(1);
            }
        }
        this.f166589k.setLoadStartTime(this.f166585g);
        this.f166589k.mo49125a(this.f166580b);
        if (this.f166589k.getParent() == null) {
            this.f168036w.addView(this.f166589k);
        }
        this.f168016A = this.f166589k.findViewById(R.id.microapp_m_titlebar_capsule_back);
        this.f166589k.mo49126a(this.f166581c.getAppInfo());
        View view = this.f168016A;
        if (view != null) {
            view.setOnClickListener(new AbstractView$OnClickListenerC67042i() {
                /* class com.tt.miniapp.C66546p.C665504 */

                @Override // com.tt.miniapp.util.AbstractView$OnClickListenerC67042i
                /* renamed from: a */
                public void mo232142a(View view) {
                    C66020b.m258530a("mp_close_btn_click", C66546p.this.f166594p).mo231092a();
                    AppBrandLogger.m52829e("TTAppbrandTabUI", "mCloseBtn");
                    if (C67590h.m263085b(C66546p.this.f166589k) && C66546p.this.f166581c.getAppInfo() != null) {
                        AppBrandLogger.m52830i("TTAppbrandTabUI", "mCloseBtn cancel");
                        LarkInnerEventHelper.mpLoadingExit("close_btn", C66546p.this.f166594p);
                        C66036d.m258597b(TimeMeter.stop(C66546p.this.f166585g), "cancel", "exit_close", TimeMeter.stop(C66546p.this.f166593o), C66037e.m258610a(C66546p.this.f166594p).mo231114a(), C66546p.this.f166594p);
                    }
                    AppbrandApplicationImpl.getInst(C66546p.this.f166594p).setStopReason("click_close_btn");
                    C67224a.f169674a = "btn";
                    C67224a.f169675b = false;
                    C67070z.m261391a(C66546p.this.f166580b, 12, C66546p.this.f166594p);
                }
            });
        }
    }

    /* renamed from: L */
    private void m259983L() {
        long j;
        long j2;
        String str;
        if (!this.f168019D) {
            boolean z = true;
            this.f168019D = true;
            long clientDurationTagEnd = AppbrandContext.getInst().getTracing().clientDurationTagEnd("from_app_launch_start_duration");
            boolean z2 = false;
            AppBrandLogger.m52830i("TTAppbrandTabUI", "key:from_app_launch_start_duration fromAppLaunchStartDuration:" + clientDurationTagEnd);
            if (PreloadManager.testProcessInitTime != 0) {
                long currentTimeMillis = System.currentTimeMillis() - PreloadManager.testProcessInitTime;
                long activityServiceDiffDuration = PreloadManager.getActivityServiceDiffDuration();
                AppBrandLogger.m52828d("TTAppbrandTabUI", "test activity and service diff:" + activityServiceDiffDuration);
                j = activityServiceDiffDuration;
                j2 = currentTimeMillis;
            } else {
                j2 = 0;
                j = 0;
            }
            AppBrandLogger.m52828d("TTAppbrandTabUI", "test coldLaunchDuration:" + j2);
            if (PreloadManager.sPreloadInitTime != 0) {
                if (System.currentTimeMillis() - clientDurationTagEnd <= PreloadManager.sPreloadInitTime) {
                    z = false;
                }
                z2 = z;
            }
            String name = ((RenderEngineManager) AppbrandApplicationImpl.getInst(this.f166594p).getService(RenderEngineManager.class)).getTypeFromPageUrl(mo231014g()).name();
            if (this.f166596r) {
                str = C63954b.f161494a;
            } else {
                str = AbstractC60044a.f149675a;
            }
            C66036d.m258596a(z2, str, TimeMeter.nowAfterStart(this.f166585g), clientDurationTagEnd, j2, j, name, this.f166594p);
            C67866g.m264028a(new Runnable() {
                /* class com.tt.miniapp.$$Lambda$p$mZ7_R7cljagiKizzHhnT9nehvwE */

                public final void run() {
                    C66546p.this.m259984M();
                }
            }, 5000);
            ((LaunchScheduler) this.f166581c.getService(LaunchScheduler.class)).onFirstRenderDone();
            C67554l.m262725b().mo234580a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m259984M() {
        try {
            String curProcessName = ProcessUtil.getCurProcessName(this.f166580b);
            if (curProcessName != null && curProcessName.startsWith("demo.testbrand")) {
                int N = m259985N();
                Runtime.getRuntime().gc();
                int N2 = m259985N();
                int memoryClass = ((ActivityManager) this.f166580b.getSystemService("activity")).getMemoryClass() * 1024;
                long round = Math.round((((double) N2) * 1000.0d) / ((double) memoryClass));
                AppBrandLogger.m52830i("TTAppbrandTabUI", "DomReady pss:" + N + " gc:" + N2 + " max:" + memoryClass + " radio:" + round);
                C66020b.m258530a("mp_load_domready_memory", this.f166594p).mo231090a("total_pss", Integer.valueOf(N)).mo231090a("total_pss_gc", Integer.valueOf(N2)).mo231090a("max_memory_allocation", Integer.valueOf(memoryClass)).mo231090a("avg_memory_ratio", Long.valueOf(round)).mo231092a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: O */
    private void m259986O() {
        String str = "snapshot";
        if (C66240d.m259242a()) {
            if (!((JsRuntimeManager) this.f166581c.getService(JsRuntimeManager.class)).isSnapshotJsRuntime()) {
                str = "normal";
            }
            m259994a(str, false, "FalconJSRuntime");
            return;
        }
        ISnapshotService iSnapshotService = (ISnapshotService) AppbrandApplicationImpl.getInst(this.f166594p).getService(SnapshotServiceImpl.class);
        AppInfoEntity appInfo = C67432a.m262319a(this.f166594p).getAppInfo();
        if (appInfo != null) {
            boolean checkSnapshotExist = iSnapshotService.checkSnapshotExist(appInfo.version);
            if (!iSnapshotService.enableSnapshot(appInfo.version, appInfo.isPreview()) || !checkSnapshotExist) {
                AppBrandLogger.m52830i("TTAppbrandTabUI", "reportResult LAUNCH_NORMAL");
                str = "normal";
            } else if (iSnapshotService.isEnableStandardSnapshot()) {
                AppBrandLogger.m52830i("TTAppbrandTabUI", "reportResult LAUNCH_STANDARD_SNAPSHOT");
                str = "standard_snapshot";
            } else {
                AppBrandLogger.m52830i("TTAppbrandTabUI", "reportResult LAUNCH_SNAPSHOT");
            }
            m259994a(str, checkSnapshotExist, iSnapshotService.getLaunchModelReason());
        }
    }

    /* renamed from: p */
    public void mo232127p() {
        int i;
        TimeLogger.getInstance(this.f166594p).logTimeDuration("TTAppbrandTabUI_showFirstPage");
        AppBrandLogger.m52830i("TTAppbrandTabUI", "showFirstPage onSuccess ", Long.valueOf(this.f166585g.getMillisAfterStart()));
        this.f168017B = false;
        m259986O();
        ((LaunchScheduler) this.f166581c.getService(LaunchScheduler.class)).setStartSuccess(this.f166585g.getMillisAfterStart());
        mo231016i().updateStatus(9);
        mo231016i().stop();
        mo232132u();
        mo231012e();
        if (mo230995a() == null) {
            i = null;
        } else if ("portrait".equals(mo230995a().f165498e)) {
            i = 0;
        } else {
            i = 1;
        }
        AppInfoEntity appInfo = this.f166581c.getAppInfo();
        C67556a.m262930a(appInfo, appInfo.isGame(), i);
        this.f166583e = System.currentTimeMillis();
        C66612a.m260221a(this.f166594p);
    }

    /* renamed from: a */
    public void mo232116a(AbstractC24460a aVar) {
        this.f168038y = aVar;
    }

    /* renamed from: d */
    public void mo232122d(int i) {
        this.f168018C = i;
    }

    @Override // com.tt.miniapp.progress.AbstractC66660b
    /* renamed from: f */
    public void mo232124f(int i) {
        mo230997a(0, i);
    }

    @Override // com.tt.frontendapiinterface.IActivityLife
    public void registerKeyboardListener(IKeyboardObserver iKeyboardObserver) {
        if (iKeyboardObserver != null) {
            this.f168028M.add(iKeyboardObserver);
        }
    }

    @Override // com.tt.frontendapiinterface.IActivityLife
    public void setKeepScreenOn(boolean z) {
        this.f168036w.setKeepScreenOn(z);
    }

    @Override // com.tt.frontendapiinterface.IActivityLife
    public void unRegisterKeyboardListener(IKeyboardObserver iKeyboardObserver) {
        if (iKeyboardObserver != null) {
            this.f168028M.remove(iKeyboardObserver);
        }
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: e */
    public View mo232123e(int i) {
        if (this.f166588j != null) {
            return this.f166588j.findViewById(i);
        }
        return null;
    }

    /* renamed from: g */
    private String m259998g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return ((LaunchScheduler) this.f166581c.getService(LaunchScheduler.class)).getNormalStartPage(str);
        }
        return "";
    }

    /* renamed from: h */
    private void m259999h(String str) {
        final AbstractC13135b bVar = (AbstractC13135b) this.f166594p.findServiceByInterface(AbstractC13135b.class);
        bVar.mo49186a(str, new C13141f.AbstractC13143a() {
            /* class com.tt.miniapp.C66546p.C665515 */

            @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
            /* renamed from: a */
            public void mo49198a(ErrorResult errorResult, C13141f.C13144b bVar) {
                new C67500a("mp_containerActions_onFavoriteLoad", C67501b.f170254v, C66546p.this.f166594p).addCategoryValue("action_error_type", "network_error").flush();
            }

            @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
            /* renamed from: a */
            public void mo49197a(SendHttpResponse sendHttpResponse, C13141f.C13144b bVar) {
                try {
                    WorkplaceConfigResponse workplaceConfigResponse = (WorkplaceConfigResponse) new Gson().fromJson(sendHttpResponse.json_body, WorkplaceConfigResponse.class);
                    if (workplaceConfigResponse != null && workplaceConfigResponse.getCode() == 0) {
                        if (workplaceConfigResponse.getData() != null) {
                            bVar.mo49187a(workplaceConfigResponse.getData().isUserCommon);
                            return;
                        }
                    }
                    new C67500a("mp_containerActions_onFavoriteLoad", C67501b.f170254v, C66546p.this.f166594p).addCategoryValue("action_error_type", "data_error").flush();
                } catch (JsonSyntaxException e) {
                    AppBrandLogger.m52829e("TTAppbrandTabUI", e);
                }
            }
        });
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e, com.tt.miniapp.AbstractC65993e
    public void miniAppDownloadInstallFail(String str) {
        super.miniAppDownloadInstallFail(str);
        AppBrandLogger.m52830i("TTAppbrandTabUI", "miniAppDownloadInstallFail, errMsg: " + str);
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void onCheckForUpdate(AppInfoEntity appInfoEntity) {
        AppBrandLogger.m52830i("TTAppbrandTabUI", "onCheckForUpdate:", appInfoEntity);
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void onPkgDownloadDone(boolean z) {
        AppBrandLogger.m52828d("TTAppbrandTabUI", "onPkgDownloadSuccess");
        ((RenderViewManager) this.f166581c.getService(RenderViewManager.class)).publishPkgDownloadDone(z);
    }

    @Override // com.tt.miniapphost.AbstractC67497e, com.tt.miniapp.AbstractC65993e
    /* renamed from: b */
    public void mo231007b(int i) {
        super.mo231007b(i);
        Fragment C = mo232111C();
        if (C instanceof AppbrandFragment) {
            ((AppbrandFragment) C).onTrimMemory(i);
        }
    }

    @Override // com.tt.miniapp.C65807c.AbstractC65808a
    /* renamed from: e */
    public ApiCallResult.Builder mo230508e(String str) {
        AppBrandLogger.m52830i("TTAppbrandTabUI", "navigateBack ");
        m259990a(C67054r.m261336a(str).f169028b, "back_from_js", false);
        return ApiCallResult.Builder.createOk("navigateBack").appendResponseData("code", 0);
    }

    /* renamed from: i */
    private void m260000i(String str) {
        TimeLogger.getInstance(this.f166594p).logTimeDuration("TTAppbrandTabUI_initView");
        AppBrandLogger.m52830i("TTAppbrandTabUI", "initView, entryPath: ", str);
        AppConfig a = mo230995a();
        if (a == null) {
            AppBrandLogger.m52829e("TTAppbrandTabUI", "initView, appConfig is null");
            C67509b.m262586a("initView_appConfig_null", 6009, this.f166594p);
            C66194c.m259173a(ErrorCode.MAIN.PARSE_APPCONFIG_ERROR.getCode(), this.f166594p);
            return;
        }
        boolean a2 = C67054r.m261341a(str, a);
        if (a2) {
            m259996b(str, "appLaunch");
        } else {
            m259993a(str, "appLaunch", (AbstractC66187h) null);
        }
        m259992a(a, a2);
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void miniAppInstallSuccess(int i) {
        TimeLogger.getInstance(this.f166594p).logTimeDuration("TTAppbrandTabUI_miniAppInstallSuccess");
        TimeLogger.getInstance(this.f166594p).logTimeDuration("TTAppbrandTabUI_miniAppDownloadInstallSuccess");
        AppBrandLogger.m52830i("TTAppbrandTabUI", "miniAppDownloadInstallSuccess ", Long.valueOf(this.f166585g.getMillisAfterStart()));
        mo231016i().updateStatus(2);
        this.f168025J.mo231762b(this.f166581c.getAppInfo());
        this.f168017B = true;
        m259979H();
    }

    @Override // com.tt.miniapp.C65807c.AbstractC65808a
    /* renamed from: b */
    public ApiCallResult.Builder mo230505b(String str) {
        AppBrandLogger.m52830i("TTAppbrandTabUI", "redirectTo ", str);
        C67054r.C67055a a = C67054r.m261336a(str);
        if (C67054r.m261341a(a.f169027a, mo230995a())) {
            return ApiCallResult.Builder.createFail("redirectTo").extraInfo(ApiCode.REDIRECTTO_REDIRECT_TAB_PAGE.msg).errorCode(ApiCode.REDIRECTTO_REDIRECT_TAB_PAGE.code);
        }
        if (!C67054r.m261340a(a.f169029c, this.f166594p)) {
            return ApiCallResult.Builder.createFail("redirectTo").extraInfo(ApiCode.REDIRECTTO_PAGE_NOT_EXIST.msg).errorCode(ApiCode.REDIRECTTO_PAGE_NOT_EXIST.code);
        }
        FragmentTransaction beginTransaction = this.f168037x.beginTransaction();
        AbstractC66187h hVar = null;
        C66557b bVar = this.f168032Q;
        if (bVar != null) {
            if (bVar.f168058c) {
                AppBrandLogger.m52830i("TTAppbrandTabUI", "redirectTo HidePrePageTrans ");
                hVar = new C66556a(this.f168032Q.f168057b);
            } else {
                AppBrandLogger.m52830i("TTAppbrandTabUI", "redirectTo RemovePrePageTrans ");
                hVar = new C66559d(this.f168032Q.f168057b);
            }
        }
        if (mo230995a() != null && TextUtils.equals(a.f169029c, mo230995a().f165497d)) {
            mo230995a().f165499f = true;
        }
        int size = this.f168031P.size() - 1;
        C66557b bVar2 = new C66557b(a.f169027a, m259989a(beginTransaction, a.f169027a, "redirectTo", hVar), false);
        this.f168032Q = bVar2;
        bVar2.f168059d = true;
        if (!this.f168031P.isEmpty()) {
            this.f168031P.remove(size);
        }
        this.f168031P.add(bVar2);
        return ApiCallResult.Builder.createOk("redirectTo").appendResponseData("code", 0);
    }

    @Override // com.tt.miniapp.C65807c.AbstractC65808a
    /* renamed from: c */
    public ApiCallResult.Builder mo230506c(String str) {
        AppBrandLogger.m52830i("TTAppbrandTabUI", "reLaunch ");
        C67054r.C67055a a = C67054r.m261336a(str);
        if (!C67054r.m261340a(a.f169029c, this.f166594p)) {
            return ApiCallResult.Builder.createFail("reLaunch").extraInfo(ApiCode.RELAUNCH_PAGE_NOT_EXIST.msg).errorCode(ApiCode.RELAUNCH_PAGE_NOT_EXIST.code);
        }
        ArrayList<Fragment> arrayList = new ArrayList();
        for (C66557b bVar : this.f168031P) {
            arrayList.add(bVar.f168057b);
        }
        this.f168031P.clear();
        this.f168032Q = null;
        boolean a2 = C67054r.m261341a(a.f169029c, AppbrandApplicationImpl.getInst(this.f166594p).getAppConfig());
        if (a2) {
            FragmentTransaction fragmentTransaction = null;
            for (Fragment fragment : arrayList) {
                if (fragmentTransaction == null) {
                    fragmentTransaction = this.f168037x.beginTransaction();
                }
                fragmentTransaction.remove(fragment);
            }
            if (fragmentTransaction != null) {
                fragmentTransaction.commitAllowingStateLoss();
            }
            this.f168035v = null;
            this.f168030O = false;
            m259996b(a.f169027a, "reLaunch");
        } else {
            this.f168030O = false;
            this.f168035v = null;
            m259993a(a.f169027a, "reLaunch", new C66558c(arrayList));
        }
        m259992a(AppbrandApplicationImpl.getInst(this.f166594p).getAppConfig(), a2);
        AppBrandLogger.m52830i("TTAppbrandTabUI", "reLaunch pageRouterParams.url ", a.f169027a);
        if (mo230995a() != null) {
            if (TextUtils.equals(a.f169029c, mo230995a().f165497d)) {
                mo230995a().f165499f = true;
            } else {
                mo230995a().f165499f = false;
            }
        }
        this.f168032Q.f168060e = true;
        return ApiCallResult.Builder.createOk("reLaunch").appendResponseData("code", 0);
    }

    @Override // com.tt.miniapp.C65807c.AbstractC65808a
    /* renamed from: d */
    public ApiCallResult.Builder mo230507d(String str) {
        boolean z;
        AppBrandLogger.m52830i("TTAppbrandTabUI", "switchTab ");
        C67054r.C67055a a = C67054r.m261336a(str);
        if (!C67054r.m261340a(a.f169029c, this.f166594p)) {
            return ApiCallResult.Builder.createFail("switchTab").extraInfo(ApiCode.SWITCHTAB_PAGE_NOT_EXIST.msg).errorCode(ApiCode.SWITCHTAB_PAGE_NOT_EXIST.code);
        }
        if (mo230995a() == null || mo230995a().mo230041b() == null || mo230995a().mo230041b().f165540f == null) {
            z = false;
        } else {
            Iterator<AppConfig.C65691f.C65692a> it = mo230995a().mo230041b().f165540f.iterator();
            z = false;
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().f165541a, a.f169029c)) {
                    z = true;
                }
            }
        }
        if (!z) {
            return ApiCallResult.Builder.createFail("switchTab").extraInfo(ApiCode.SWITCHTAB_SWITCH_NON_TAB.msg).errorCode(ApiCode.SWITCHTAB_SWITCH_NON_TAB.code).appendResponseData("code", 1);
        }
        FragmentTransaction beginTransaction = this.f168037x.beginTransaction();
        for (C66557b bVar : this.f168031P) {
            if (bVar.f168058c) {
                m259995b(beginTransaction, bVar.f168057b);
            } else {
                beginTransaction.setCustomAnimations(0, R.anim.microapp_i_slide_out_right);
                m259997c(beginTransaction, bVar.f168057b);
            }
        }
        beginTransaction.commitAllowingStateLoss();
        this.f168031P.clear();
        this.f168032Q = null;
        m259996b(a.f169027a, "switchTab");
        return ApiCallResult.Builder.createOk("switchTab").appendResponseData("code", 0);
    }

    /* renamed from: f */
    public void mo232125f(String str) {
        if (!this.f166594p.isEmbedContainer()) {
            String errorDesc = ((GadgetErrorRecoveryManager) AppbrandApplicationImpl.getInst(this.f166594p).getService(GadgetErrorRecoveryManager.class)).getErrorDesc(ErrorType.APP_FILE_RUN_ERROR, ErrorCode.WEBVIEW.RECEIVE_WEBVIEW_ERROR.getCode());
            AppBrandLogger.m52830i("TTAppbrandTabUI", "TTAppbrandTabUI postError desc :" + errorDesc + ", mArgs" + str);
            HostDependManager.getInst().showModal(this.f166580b, null, this.f166580b.getString(R.string.OpenPlatform_GadgetErr_AppErrorTtl), errorDesc, true, this.f166580b.getString(R.string.microapp_m_map_dialog_cancel), "", this.f166580b.getString(R.string.OpenPlatform_GadgetErr_RetryBttn), "", new AbstractC67550j.AbstractC67551a<Integer>() {
                /* class com.tt.miniapp.C66546p.C665559 */

                /* renamed from: a */
                public void onNativeModuleCall(Integer num) {
                    if (num.intValue() == 1) {
                        C66612a.m260227a(AppbrandApplicationImpl.getInst(C66546p.this.f166594p).getAppInfo().appId, AppbrandApplicationImpl.getInst(C66546p.this.f166594p).getSchema(), false);
                    }
                }
            }, this.f166580b);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "WebView postError：" + str);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("TTAppbrandTabUI", "postError", e);
        }
        C67509b.m262587a("mp_start_error", 5000, jSONObject, this.f166594p);
        if (!this.f168019D) {
            C66194c.m259173a(ErrorCode.WEBVIEW.RECEIVE_WEBVIEW_ERROR.getCode(), this.f166594p);
        }
    }

    @Override // com.tt.miniapp.view.SizeDetectFrameLayout.AbstractC67139a
    /* renamed from: b */
    public void mo232121b(int i, int i2) {
        C67049n.m261308a(this.f166580b, this.f166594p);
    }

    /* renamed from: a */
    private void m259991a(FragmentTransaction fragmentTransaction, Fragment fragment) {
        if (fragment instanceof AbstractC66891k) {
            ((AbstractC66891k) fragment).executeShowWithOutCommit(fragmentTransaction);
        }
    }

    /* renamed from: b */
    private void m259995b(FragmentTransaction fragmentTransaction, Fragment fragment) {
        if (fragment instanceof AbstractC66891k) {
            ((AbstractC66891k) fragment).executeHideWithOutCommit(fragmentTransaction);
        }
    }

    /* renamed from: c */
    private void m259997c(FragmentTransaction fragmentTransaction, Fragment fragment) {
        if (fragment instanceof AbstractC66891k) {
            ((AbstractC66891k) fragment).executeRemoveWithOutCommit(fragmentTransaction);
        }
    }

    /* renamed from: a */
    public void mo232115a(final int i, boolean z) {
        RunnableC665493 r0 = new Runnable() {
            /* class com.tt.miniapp.C66546p.RunnableC665493 */

            public void run() {
                C67070z.m261391a(C66546p.this.f166580b, i, C66546p.this.f166594p);
                AppBrandLogger.m52830i("TTAppbrandTabUI", " moveTaskToBack ");
                C66546p.this.mo232113E();
            }
        };
        if (!z) {
            C66284a.m259352a(this.f166580b, r0, this.f166594p);
        } else {
            r0.run();
        }
    }

    /* renamed from: b */
    public ApiCallResult.Builder mo232120b(String str, boolean z) {
        AppBrandLogger.m52830i("TTAppbrandTabUI", "reLaunch ", Boolean.valueOf(z));
        return mo230506c(str);
    }

    @Override // com.tt.frontendapiinterface.IKeyboardObserver
    public void onKeyboardHeightChanged(int i, int i2) {
        AppBrandLogger.m52830i("TTAppbrandTabUI", "onKeyboardHeightChanged height ", Integer.valueOf(i), " orientation ", Integer.valueOf(i2));
        for (IKeyboardObserver iKeyboardObserver : this.f168028M) {
            iKeyboardObserver.onKeyboardHeightChanged(i, i2);
        }
    }

    /* renamed from: a */
    private void m259992a(AppConfig appConfig, boolean z) {
        if (this.f166594p == null || this.f166594p.isDestroyed()) {
            AppBrandLogger.m52830i("TTAppbrandTabUI", "checkTabBarConfig app context is destroyed");
            return;
        }
        if (this.f166594p.getExtra("tab_bar_ready") != null) {
            int intValue = ((Integer) this.f166594p.getExtra("tab_bar_ready")).intValue();
            if (intValue == 2) {
                AppBrandLogger.m52830i("TTAppbrandTabUI", "tab bar already ready");
                return;
            } else if (intValue == 0) {
                AppBrandLogger.m52830i("TTAppbrandTabUI", "no tab bar");
                return;
            }
        }
        if (appConfig == null || appConfig.mo230041b() == null || appConfig.mo230041b().f165540f == null || appConfig.mo230041b().f165540f.size() <= 0) {
            C25529d.m91142a((IAppContext) this.f166594p, 0, true);
        } else if (z) {
            C25529d.m91142a((IAppContext) this.f166594p, 2, true);
        } else {
            C25529d.m91142a((IAppContext) this.f166594p, 1, true);
        }
    }

    /* renamed from: b */
    private void m259996b(final String str, final String str2) {
        TimeLogger.getInstance(this.f166594p).logTimeDuration("TTAppbrandTabUI_showTabPage");
        AppBrandLogger.m52830i("TTAppbrandTabUI", "showTabPage, url: ", str, ", openType: ", str2, ", tabAdded ", Boolean.valueOf(this.f168030O));
        if (!this.f168030O) {
            if (this.f168035v == null) {
                this.f168035v = new C66661q(this.f168038y, this.f166594p);
                this.f168037x.beginTransaction().add(R.id.microapp_m_no_tab_real_content, this.f168035v).commitAllowingStateLoss();
            }
            AppbrandFragment a = this.f168038y.mo87275a(this.f166580b, str, this.f166594p);
            a.updateRouterParams(str, str2);
            this.f168038y.mo87276a(str, a);
            this.f168035v.mo232385a(str, str2);
            C66557b bVar = new C66557b("page_tab", this.f168035v, true);
            this.f168031P.add(bVar);
            this.f168032Q = bVar;
            bVar.f168059d = false;
            this.f168030O = true;
        } else {
            C66557b bVar2 = new C66557b("page_tab", this.f168035v, true);
            FragmentTransaction beginTransaction = this.f168037x.beginTransaction();
            if (beginTransaction == null) {
                AppBrandLogger.m52830i("TTAppbrandTabUI", " fragmentTransaction == null ");
                return;
            }
            List<Fragment> fragments = this.f168037x.getFragments();
            if (fragments != null) {
                for (int i = 0; i < fragments.size(); i++) {
                    Fragment fragment = fragments.get(i);
                    if (fragment instanceof AppbrandFragment) {
                        AppBrandLogger.m52830i("TTAppbrandTabUI", "remove ", fragment);
                        beginTransaction.remove(fragment);
                    }
                }
            }
            m259991a(beginTransaction, this.f168035v);
            beginTransaction.commitAllowingStateLoss();
            this.f168031P.add(bVar2);
            this.f168032Q = bVar2;
            bVar2.f168059d = false;
            AppBrandLogger.m52830i("TTAppbrandTabUI", "size:", Integer.valueOf(this.f168037x.getFragments().size()));
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str2, "appLaunch")) {
            AppBrandLogger.m52830i("TTAppbrandTabUI", " TextUtils.isEmpty(url) ", str, " ", str2);
            return;
        }
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.C66546p.RunnableC665548 */

            public void run() {
                AppBrandLogger.m52830i("TTAppbrandTabUI", " showTab ", str);
                if (C66546p.this.f168035v != null) {
                    C66546p.this.f168035v.mo232394c(str, str2);
                }
            }
        });
    }

    /* renamed from: com.tt.miniapp.p$b */
    public static class C66557b {

        /* renamed from: a */
        public String f168056a;

        /* renamed from: b */
        public Fragment f168057b;

        /* renamed from: c */
        public boolean f168058c;

        /* renamed from: d */
        public boolean f168059d;

        /* renamed from: e */
        public boolean f168060e;

        public C66557b(String str, Fragment fragment, boolean z) {
            this.f168056a = str;
            this.f168057b = fragment;
            this.f168058c = z;
        }
    }

    @Override // com.tt.miniapphost.AbstractC67497e, com.tt.miniapp.AbstractC65993e
    /* renamed from: a */
    public void mo230998a(int i, String[] strArr, int[] iArr) {
        if (((i >> 16) & 65535) == 0) {
            C66588h.m260183a().mo232192a(this.f166580b, strArr, iArr);
        }
        Fragment C = mo232111C();
        if (C instanceof AppbrandFragment) {
            ((AppbrandFragment) C).onActivityRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* renamed from: a */
    private void m259993a(String str, String str2, AbstractC66187h hVar) {
        AppBrandLogger.m52830i("TTAppbrandTabUI", "showPage, url: ", str, ", openType: ", str2, ", pageEntryList size: ", Integer.valueOf(this.f168031P.size()));
        TimeLogger.getInstance(this.f166594p).logTimeDuration("TTAppbrandTabUI_showPage");
        C66557b bVar = new C66557b(str, m259989a(this.f168037x.beginTransaction(), str, str2, hVar), false);
        this.f168031P.add(bVar);
        this.f168032Q = bVar;
        bVar.f168059d = false;
    }

    /* renamed from: a */
    private void m259990a(int i, String str, final boolean z) {
        String str2;
        String str3;
        char c = 0;
        int i2 = 1;
        AppBrandLogger.m52830i("TTAppbrandTabUI", " goBack ", Integer.valueOf(i));
        int v = mo232133v();
        int i3 = -1;
        if (i < v) {
            FragmentTransaction beginTransaction = this.f168037x.beginTransaction();
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    break;
                } else if (this.f168031P.isEmpty()) {
                    Object[] objArr = new Object[1];
                    objArr[c] = "go back pageEntryList.isEmpty()";
                    AppBrandLogger.m52829e("TTAppbrandTabUI", objArr);
                    break;
                } else {
                    List<C66557b> list = this.f168031P;
                    C66557b bVar = list.get(list.size() - 1);
                    if (bVar.f168058c) {
                        m259995b(beginTransaction, bVar.f168057b);
                    } else {
                        if (!z) {
                            beginTransaction.setCustomAnimations(0, R.anim.microapp_i_slide_out_right);
                        }
                        m259997c(beginTransaction, bVar.f168057b);
                    }
                    this.f168031P.remove(this.f168031P.size() - 1);
                    i4++;
                    c = 0;
                }
            }
            if (!this.f168031P.isEmpty()) {
                List<C66557b> list2 = this.f168031P;
                Fragment fragment = list2.get(list2.size() - 1).f168057b;
                if (fragment instanceof AppbrandFragment) {
                    ((AppbrandFragment) fragment).setOpenType("navigateBack");
                } else if (fragment instanceof C66661q) {
                    ((C66661q) fragment).mo232389b("navigateBack");
                }
                m259991a(beginTransaction, fragment);
                beginTransaction.commitAllowingStateLoss();
                List<C66557b> list3 = this.f168031P;
                this.f168032Q = list3.get(list3.size() - 1);
                return;
            }
            AppBrandLogger.m52829e("TTAppbrandTabUI", "go back pageEntryList.size() ", Integer.valueOf(this.f168031P.size()));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "go back home pageEntryList.isEmpty()");
                if (this.f166581c.getAppInfo() != null) {
                    i3 = this.f166581c.getAppInfo().appId;
                }
                jSONObject.put("appId", i3);
                C67509b.m262587a("mp_start_error", 4001, jSONObject, this.f166594p);
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "TTAppbrandTabUI", e.getStackTrace());
            }
        } else {
            AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f166594p).getAppConfig();
            if (appConfig != null) {
                appConfig.f165499f = false;
            }
            FragmentTransaction beginTransaction2 = this.f168037x.beginTransaction();
            int i5 = v - 1;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    break;
                } else if (this.f168031P.isEmpty()) {
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = "go back home pageEntryList.isEmpty()";
                    AppBrandLogger.m52829e("TTAppbrandTabUI", objArr2);
                    break;
                } else {
                    List<C66557b> list4 = this.f168031P;
                    C66557b bVar2 = list4.get(list4.size() - 1);
                    if (bVar2.f168058c) {
                        m259995b(beginTransaction2, bVar2.f168057b);
                    } else {
                        if (!z) {
                            beginTransaction2.setCustomAnimations(0, R.anim.microapp_i_slide_out_right);
                        }
                        m259997c(beginTransaction2, bVar2.f168057b);
                    }
                    i2 = 1;
                    this.f168031P.remove(this.f168031P.size() - 1);
                    i6++;
                }
            }
            if (this.f168031P.isEmpty()) {
                Object[] objArr3 = new Object[i2];
                objArr3[0] = "go back home pageEntryList.isEmpty()";
                AppBrandLogger.m52829e("TTAppbrandTabUI", objArr3);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(ApiHandler.API_CALLBACK_ERRMSG, "go back home pageEntryList.isEmpty()");
                    if (this.f166581c.getAppInfo() != null) {
                        i3 = this.f166581c.getAppInfo().appId;
                    }
                    jSONObject2.put("appId", i3);
                    C67509b.m262587a("mp_start_error", 4000, jSONObject2, this.f166594p);
                } catch (Exception e2) {
                    AppBrandLogger.stacktrace(6, "TTAppbrandTabUI", e2.getStackTrace());
                }
                if (mo230995a() != null && !TextUtils.isEmpty(mo230995a().f165497d)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("url", mo230995a().f165497d);
                        mo230506c(jSONObject3.toString());
                    } catch (Exception e3) {
                        AppBrandLogger.m52829e("TTAppbrandTabUI", "onNewIntent", e3);
                    }
                } else if (this.f166580b != null) {
                    if (C67590h.m263085b(this.f166589k) && this.f166581c.getAppInfo() != null) {
                        AppBrandLogger.m52830i("TTAppbrandTabUI", "onBackPressed cancel");
                        if (z) {
                            str2 = "swipe_back";
                        } else {
                            str2 = "key_back";
                        }
                        LarkInnerEventHelper.mpLoadingExit(str2, this.f166594p);
                        long stop = TimeMeter.stop(this.f166585g);
                        if (z) {
                            str3 = "exit_swipe";
                        } else {
                            str3 = "exit_back";
                        }
                        C66036d.m258597b(stop, "cancel", str3, TimeMeter.stop(this.f166593o), C66037e.m258610a(this.f166594p).mo231114a(), this.f166594p);
                    }
                    C67070z.m261391a(this.f166580b, 9, this.f166594p);
                }
            } else if ("back_from_js".equals(str)) {
                List<C66557b> list5 = this.f168031P;
                this.f168032Q = list5.get(list5.size() - 1);
                if (C67054r.m261339a(this.f166581c.getAppInfo(), mo230995a())) {
                    Fragment fragment2 = this.f168032Q.f168057b;
                    if (fragment2 instanceof AppbrandFragment) {
                        ((AppbrandFragment) fragment2).setOpenType("navigateBack");
                    } else if (fragment2 instanceof C66661q) {
                        ((C66661q) fragment2).mo232389b("navigateBack");
                    }
                    m259991a(beginTransaction2, fragment2);
                    beginTransaction2.commitAllowingStateLoss();
                    return;
                }
                AppbrandApplicationImpl.getInst(this.f166594p).setStopReason("backpress");
                C67224a.f169674a = "back";
                C67224a.f169675b = false;
                C67070z.m261391a(this.f166580b, 9, this.f166594p);
                AppBrandLogger.m52830i("TTAppbrandTabUI", " moveTaskToBack ");
                mo232113E();
            } else if ("back_from_user".equals(str)) {
                AppbrandApplicationImpl.getInst(this.f166594p).setStopReason("backpress");
                C67224a.f169674a = "back";
                C67224a.f169675b = false;
                if (C66236a.m259226b(this.f166594p)) {
                    C66203a.m259184a(this.f166594p).mo231544a(true, new Runnable() {
                        /* class com.tt.miniapp.C66546p.RunnableC665482 */

                        public void run() {
                            C66546p.this.mo232115a(9, z);
                        }
                    });
                } else {
                    mo232115a(9, z);
                }
            }
        }
    }

    /* renamed from: a */
    private void m259994a(String str, boolean z, String str2) {
        String str3;
        C66037e.m258610a(this.f166594p).mo231122e();
        TimeMeter.stop(this.f166585g);
        TimeMeter.stop(this.f166593o);
        if (TextUtils.isEmpty(str)) {
            str3 = "normal";
        } else {
            str3 = str;
        }
        this.f168021F = str3;
        boolean z2 = !HostDependManager.getInst().getFeatureGating("openplatform.gadget.disable.force.report.success", false);
        boolean z3 = !AppbrandApplicationImpl.getInst(this.f166594p).getForeBackgroundManager().mo231961c();
        if (z3 || z2) {
            C66037e.m258610a(this.f166594p).mo231119b("success");
            C66036d.m258579a(TimeMeter.stop(this.f166585g), "success", "", TimeMeter.stop(this.f166593o), C66037e.m258610a(this.f166594p).mo231114a(), this.f166594p);
            LarkInnerEventHelper.mpAppLaunchResult(str3, "success", null, 0, null, null, this.f166594p);
            this.f166579a = this.f166582d.mo234095c();
            C66683f.m260434a(this.f166579a, this.f166594p);
            C66020b.m258530a("openplatform_mp_launch_status", this.f166594p).mo231090a("duration", Long.valueOf(this.f166579a)).mo231090a("launch_mode", str3).mo231090a("snapshot_exist", Boolean.valueOf(z)).mo231090a("launch_mode_reason", str2).mo231091a(C66019a.m258527a(this.f166594p)).mo231092a();
            AppBrandLogger.m52830i("TTAppbrandTabUI", "forceReportResult : " + z2 + " tryReportResult : " + z3);
            return;
        }
        this.f168020E = true;
    }

    /* renamed from: a */
    private AppbrandFragment m259989a(FragmentTransaction fragmentTransaction, String str, String str2, AbstractC66187h hVar) {
        AppBrandLogger.m52830i("TTAppbrandTabUI", "addFragment ", str, " openType ", str2, " ");
        AppbrandFragment a = this.f168038y.mo87275a(this.f166580b, str, this.f166594p);
        a.updateRouterParams(str, str2);
        AppbrandFragment appbrandFragment = this.f168033R;
        if (appbrandFragment == null || this.f168029N) {
            if (!str2.equals("reLaunch") && !str2.equals("redirectTo") && !str2.equals("appLaunch")) {
                fragmentTransaction.setCustomAnimations(R.anim.microapp_i_slide_in_right, 0);
                if (hVar != null) {
                    a.setPageTrans(hVar);
                }
            } else if (hVar != null) {
                hVar.mo231524a();
            }
            fragmentTransaction.add(R.id.microapp_m_no_tab_real_content, a);
            fragmentTransaction.commitAllowingStateLoss();
            TimeLogger.getInstance(this.f166594p).logTimeDuration("TTAppbrandTabUI_addFragment");
            return a;
        }
        this.f168029N = true;
        return appbrandFragment;
    }

    public C66546p(FragmentActivity fragmentActivity, FragmentManager fragmentManager, AbstractC67433a aVar, AbstractC66737b bVar, AbstractC66738c cVar, AbstractC66736a aVar2) {
        super(fragmentActivity, aVar, bVar);
        if (fragmentManager != null) {
            this.f168037x = fragmentManager;
        } else {
            this.f168037x = fragmentActivity.getSupportFragmentManager();
        }
        this.f168022G = cVar;
        this.f168023H = aVar2;
        this.f168025J = new View$OnClickListenerC66306e(fragmentActivity, aVar);
        this.f168026K = new C66305d(fragmentActivity, aVar);
        AppbrandApplicationImpl.getInst(aVar).getTimeLineReporter().recordLaunchStartTime();
    }
}
