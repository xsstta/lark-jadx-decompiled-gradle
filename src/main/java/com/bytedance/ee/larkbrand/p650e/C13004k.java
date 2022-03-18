package com.bytedance.ee.larkbrand.p650e;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper;
import com.bytedance.ee.appstrategy.p240a.C4143a;
import com.bytedance.ee.bear.atfinder.AbstractC4272g;
import com.bytedance.ee.lark.infra.cookie.p620e.C12768c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12837a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.C12985d;
import com.bytedance.ee.larkbrand.C13070h;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.abtest.experiment.C12963f;
import com.bytedance.ee.larkbrand.abtest.experiment.C12966i;
import com.bytedance.ee.larkbrand.abtest.experiment.ProcessArchExperiment;
import com.bytedance.ee.larkbrand.p643a.p645b.C12955e;
import com.bytedance.ee.larkbrand.p654h.C13073a;
import com.bytedance.ee.larkbrand.permission.C13301k;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.bytedance.ee.larkbrand.utils.C13328a;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.bytedance.ee.larkbrand.utils.DebugHelper;
import com.bytedance.ee.larkbrand.utils.EditorAtSearchUtil;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.google.firebase.messaging.Constants;
import com.he.loader.SettingsProvider;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.manager.UpdateAppManager;
import com.tt.miniapp.p3327s.AbstractC66745e;
import com.tt.miniapp.settings.v2.handler.C66761ac;
import com.tt.miniapp.settings.v2.handler.C66765c;
import com.tt.miniapp.settings.v2.handler.C66773g;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.C67606d;
import com.tt.option.p3390k.AbstractC67648c;
import com.tt.p3256b.AbstractC65679a;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.pkg.IPkgDownloadInstallListener;
import com.tt.refer.common.pkg.IPkgMgrService;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.meta.GadgetBeanConverter;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.e.k */
public class C13004k extends C67606d {

    /* renamed from: a */
    private static final String[] f34605a = {"api.zjurl.cn", "api.larksuite.com", "api.feishu.cn", "internal-api-lark-api.feishu.cn", "internal-api-lark-file.feishu.cn", "oapi.zjurl.cn", "oapi.larksuite.com", "oapi.feishu.cn", "ee.bytedance.net", "file.zjurl.cn", "file.larksuite.com", "file.feishu.cn", "test-api.zjurl.cn", "test-api.larksuite.com", "test-api.feishu.cn", "bear-test.bytedance.net", "open.zjurl.cn", "open.larksuite.com", "open.feishu.cn", "feishu-staging.cn", "api-staging.zjurl.cn"};

    @Override // com.tt.option.C67606d
    public boolean getPayEnable() {
        return false;
    }

    @Override // com.tt.option.C67606d
    public C67606d.AbstractC67609b createBlockLoadingCallback() {
        return new C67606d.AbstractC67609b() {
            /* class com.bytedance.ee.larkbrand.p650e.C13004k.C130051 */

            /* renamed from: a */
            public volatile CountDownLatch f34606a;

            /* renamed from: b */
            public volatile CountDownLatch f34607b;

            @Override // com.tt.option.C67606d.AbstractC67609b
            /* renamed from: a */
            public long mo48977a(String str) {
                AppBrandLogger.m52830i("BlockLoadingCallback", "blockLoading enter");
                if ("preview".equals(str)) {
                    AppBrandLogger.m52830i("BlockLoadingCallback", "do not block preview");
                    return 0;
                } else if (this.f34606a == null) {
                    AppBrandLogger.m52830i("BlockLoadingCallback", "blockLoading, mCountDownLatch == null");
                    return 0;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        if (!this.f34606a.await(5, TimeUnit.SECONDS)) {
                            AppBrandLogger.m52831w("BlockLoadingCallback", "callbackCountDownLatch timeout");
                        }
                        AppBrandLogger.m52830i("BlockLoadingCallback", "blockLoading, await done");
                    } catch (InterruptedException e) {
                        AppBrandLogger.eWithThrowable("BlockLoadingCallback", "external checker interrupted", e);
                    }
                    if (this.f34607b != null) {
                        try {
                            this.f34607b.await();
                        } catch (InterruptedException e2) {
                            AppBrandLogger.eWithThrowable("BlockLoadingCallback", "dialogCountDownLatch interrupted", e2);
                        }
                    }
                    AppBrandLogger.m52830i("BlockLoadingCallback", "block loading time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    return System.currentTimeMillis() - currentTimeMillis;
                }
            }

            @Override // com.tt.option.C67606d.AbstractC67609b
            /* renamed from: a */
            public void mo48978a(String str, final String str2, final C67606d.AbstractC67609b.AbstractC67610a aVar, final IAppContext iAppContext) {
                if ("preview".equals(str)) {
                    AppBrandLogger.m52830i("BlockLoadingCallback", "do not check preview");
                } else if (!C67556a.m262941a("lark_external_check")) {
                    AppBrandLogger.m52830i("BlockLoadingCallback", "external check handler not exist");
                } else {
                    this.f34606a = new CountDownLatch(1);
                    AppBrandLogger.m52830i("BlockLoadingCallback", "callbackCountDownLatch init done");
                    final long currentTimeMillis = System.currentTimeMillis();
                    C13374s.m54387a(str2, (AbstractC67565b) new AbstractC67565b(false) {
                        /* class com.bytedance.ee.larkbrand.p650e.C13004k.C130051.C130061 */

                        @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                        /* renamed from: a */
                        public void mo48979a() {
                            AppBrandLogger.m52829e("BlockLoadingCallback", "onCallProcessDead");
                            C130051.this.f34606a.countDown();
                            C13328a.m54245a(iAppContext, C4143a.m17242a(10104, "client.open_platform.gadget.app_strategy.ma", System.currentTimeMillis() - currentTimeMillis, 0, 0, "ipc failed", str2, "ma", true, null));
                        }

                        @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                        /* renamed from: a */
                        public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                            final String str;
                            AppBrandLogger.m52830i("BlockLoadingCallback", "onIpcCallback");
                            C130051.this.f34607b = new CountDownLatch(1);
                            C130051.this.f34606a.countDown();
                            if (crossProcessDataEntity != null) {
                                str = crossProcessDataEntity.mo234744b("hostExternalCheckData");
                            } else {
                                str = null;
                            }
                            HashMap<String, Serializable> a = C4143a.m17242a(10101, "client.open_platform.gadget.app_strategy.ma", System.currentTimeMillis() - currentTimeMillis, 0, 0, "data is null", str2, "ma", true, null);
                            if (TextUtils.isEmpty(str)) {
                                C130051.this.f34607b.countDown();
                                a.put("code", 10101);
                                a.put("error_msg", "ma container resp null");
                                C13328a.m54245a(iAppContext, a);
                                AppBrandLogger.m52830i("BlockLoadingCallback", "requestExternalCheck, data is empty");
                                return;
                            }
                            try {
                                OpenAppStrategyDataWrapper a2 = OpenAppStrategyDataWrapper.m17241a(new JSONObject(str));
                                if (a2 == null || TextUtils.isEmpty(a2.f12591d)) {
                                    AppBrandLogger.m52830i("BlockLoadingCallback", "data wrapper content is null");
                                    C130051.this.f34607b.countDown();
                                    if (a2 == null || a2.f12592e == null || a2.f12592e.isEmpty()) {
                                        a.put("error_msg", "data wrapper key field null");
                                        C13328a.m54245a(iAppContext, a);
                                        return;
                                    }
                                    C13328a.m54245a(iAppContext, a2.f12592e);
                                    return;
                                }
                                if (a2.f12592e == null || a2.f12592e.isEmpty()) {
                                    C13328a.m54245a(iAppContext, a);
                                } else {
                                    C13328a.m54245a(iAppContext, a2.f12592e);
                                }
                                C67866g.m264026a(new Action() {
                                    /* class com.bytedance.ee.larkbrand.p650e.C13004k.C130051.C130061.C130071 */

                                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                                    public void act() {
                                        aVar.mo231791b();
                                        C13328a.m54248b(iAppContext.getCurrentActivity(), str, str2, new C13328a.AbstractC13334a() {
                                            /* class com.bytedance.ee.larkbrand.p650e.C13004k.C130051.C130061.C130071.C130081 */

                                            @Override // com.bytedance.ee.larkbrand.utils.C13328a.AbstractC13334a
                                            /* renamed from: a */
                                            public void mo48981a(boolean z) {
                                                AppBrandLogger.m52830i("BlockLoadingCallback", "onResult, shouldCloseMiniApp: " + z);
                                                if (z) {
                                                    AppBrandLogger.m52830i("BlockLoadingCallback", "close mini app", str2);
                                                    aVar.mo231790a();
                                                }
                                                C130051.this.f34607b.countDown();
                                            }
                                        }, iAppContext);
                                        AppBrandLogger.m52830i("BlockLoadingCallback", "host callback", str);
                                    }
                                }, C67554l.m262725b(), false);
                            } catch (JSONException e) {
                                AppBrandLogger.eWithThrowable("BlockLoadingCallback", "requestExternalCheck", e);
                                C130051.this.f34607b.countDown();
                                a.put("code", 10100);
                                a.put("error_msg", "mini app container resp to json err");
                                C13328a.m54245a(iAppContext, a);
                            }
                        }
                    }, true);
                }
            }
        };
    }

    @Override // com.tt.option.C67606d
    public SettingsProvider getSettingsProvider() {
        return C13070h.m53597a();
    }

    @Override // com.tt.option.C67606d
    public int getMiniAppProcessCount() {
        int i;
        ProcessArchExperiment processArchExperiment = (ProcessArchExperiment) SettingManager.getInstance().get(ProcessArchExperiment.class);
        if (processArchExperiment != null) {
            i = processArchExperiment.f34512a;
        } else {
            i = 0;
        }
        AppBrandLogger.m52828d("LarkOptionLowPriorityDependImpl", "ProcessArchConfig count = " + i);
        return i;
    }

    @Override // com.tt.option.C67606d
    public boolean isPreRenderApp() {
        if (ProcessUtil.isMiniappProcess()) {
            AppBrandLogger.m52828d("LarkOptionLowPriorityDependImpl", "isPreRenderApp in miniProcess!");
            JSONObject b = C13374s.m54395b("pre_render_config");
            if (b != null) {
                return C12963f.m53374a(b);
            }
            return false;
        }
        AppBrandLogger.m52828d("LarkOptionLowPriorityDependImpl", "isPreRenderApp in hostProcess!");
        return C12963f.m53376c();
    }

    @Override // com.tt.option.C67606d
    public boolean isPreloadSp() {
        if (ProcessUtil.isMiniappProcess()) {
            AppBrandLogger.m52828d("LarkOptionLowPriorityDependImpl", "isPreloadSp in miniProcess!");
            JSONObject b = C13374s.m54395b("preloadSP");
            if (b != null) {
                return C12966i.m53383a(b);
            }
            return false;
        }
        AppBrandLogger.m52828d("LarkOptionLowPriorityDependImpl", "isPreloadSp in hostProcess!");
        return C12966i.m53385c();
    }

    @Override // com.tt.option.C67606d
    public AbstractC65679a getMiniAppLifeCycleInstance(IAppContext iAppContext) {
        return C13042x.m53512a(iAppContext);
    }

    /* renamed from: a */
    private String m53462a(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @Override // com.tt.option.C67606d
    public boolean getFeatureGating(String str) {
        return LarkExtensionManager.getInstance().getExtension().getFeatureGating(str);
    }

    @Override // com.tt.option.C67606d
    public void onCreateWebView(WebView webView) {
        LarkExtensionManager.getInstance().getExtension().mo49604a(webView);
    }

    /* renamed from: b */
    private boolean m53465b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : f34605a) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tt.option.C67606d
    public double getBlankRate(String str) {
        return Double.valueOf(C12782a.m52838b("blank_rate", String.valueOf(0.05d))).doubleValue();
    }

    @Override // com.tt.option.C67606d
    public void syncWebViewLoginCookie(String str) {
        String a;
        if (!TextUtils.isEmpty(str) && (a = m53462a(str)) != null) {
            C12985d a2 = C12985d.m53431a();
            a2.mo48903a(true);
            if (m53465b(a)) {
                C66467o.C66470b bVar = null;
                CrossProcessDataEntity f = C67556a.m262949f();
                if (f != null) {
                    bVar = new C66467o.C66470b(f);
                }
                if (bVar != null && !TextUtils.isEmpty(bVar.f167782h)) {
                    if ("open.zjurl.cn".equals(a) || "open.larksuite.com".equals(a) || "open.feishu.cn".equals(a)) {
                        m53463a(str, a, "osession", bVar.f167782h);
                    } else {
                        m53463a(str, a, "session", bVar.f167782h);
                    }
                }
            }
            a2.mo48904b();
        }
    }

    @Override // com.tt.option.C67606d
    public boolean startAboutActivity(Activity activity, IAppContext iAppContext) {
        mo48957a(iAppContext, activity);
        return true;
    }

    @Override // com.tt.option.C67606d
    public boolean getFeatureGating(String str, boolean z) {
        return LarkExtensionManager.getInstance().getExtension().getFeatureGating(str, z);
    }

    @Override // com.tt.option.C67606d
    public void onWebViewComponentDestroyed(WebView webView, IAppContext iAppContext) {
        ArrayList<String> a;
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        if (appInfo != null && !TextUtils.isEmpty(appInfo.appId) && (a = C66773g.m260618a().mo232679a(appInfo.appId)) != null) {
            C12985d a2 = C12985d.m53431a();
            Iterator<String> it = a.iterator();
            while (it.hasNext()) {
                a2.mo48901a(it.next());
            }
        }
    }

    @Override // com.tt.option.C67606d
    public List<AbstractC67648c> replaceMenuItems(List<AbstractC67648c> list, IAppContext iAppContext) {
        ArrayList arrayList = new ArrayList();
        m53464a(arrayList, iAppContext);
        if (list != null) {
            for (AbstractC67648c cVar : list) {
                if (!"share".equals(cVar.mo48982a()) || (!C67432a.m262319a(iAppContext).getAppInfo().appId.equals("tt06bd70009997ab3e") && LarkExtensionManager.getInstance().getExtension().mo49614i())) {
                    arrayList.add(cVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m53464a(List<AbstractC67648c> list, final IAppContext iAppContext) {
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        if (appInfo != null && !TextUtils.isEmpty(appInfo.encryptextra)) {
            int i = 1;
            try {
                AppBrandLogger.m52830i("LarkOptionLowPriorityDependImpl", "appinfo extra:" + appInfo.encryptextra);
                JSONObject jSONObject = new JSONObject(appInfo.encryptextra);
                final String optString = jSONObject.optString("botid");
                if (!TextUtils.isEmpty(optString)) {
                    list.add(0, new AbstractC67648c() {
                        /* class com.bytedance.ee.larkbrand.p650e.C13004k.C130092 */

                        @Override // com.tt.option.p3390k.AbstractC67648c
                        /* renamed from: a */
                        public String mo48982a() {
                            return "enter_bot";
                        }
                    });
                } else {
                    i = 0;
                }
                boolean optBoolean = jSONObject.optBoolean("feedback");
                boolean featureGating = LarkExtensionManager.getInstance().getExtension().getFeatureGating("microapp.ui.feedback");
                if (optBoolean && featureGating) {
                    list.add(i, new AbstractC67648c() {
                        /* class com.bytedance.ee.larkbrand.p650e.C13004k.C130103 */

                        @Override // com.tt.option.p3390k.AbstractC67648c
                        /* renamed from: a */
                        public String mo48982a() {
                            return "enter_feedBack";
                        }
                    });
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo48957a(IAppContext iAppContext, Activity activity) {
        String str;
        AbstractC67565b d = C13301k.m54149a().mo49536d(iAppContext);
        HashMap hashMap = new HashMap();
        if (d != null) {
            hashMap.put("update", C13374s.m54383a(d));
        }
        String g = ((AbstractC67709b.AbstractC67710a) ((AbstractC67709b) iAppContext.findServiceByInterface(AbstractC67709b.class)).mo235130i()).mo235054g(iAppContext.getAppId());
        ExtensionWrapper extension = LarkExtensionManager.getInstance().getExtension();
        String str2 = C67432a.m262319a(iAppContext).getAppInfo().appId;
        String str3 = C67432a.m262319a(iAppContext).getAppInfo().version;
        if (g == null) {
            str = "";
        } else {
            str = g;
        }
        extension.mo49603a(activity, str2, str3, str, hashMap);
    }

    @Override // com.tt.option.C67606d
    public <T> T getHostData(int i, T t, IAppContext iAppContext) {
        if (i == 2001) {
            return (T) C12768c.m52791a().mo48292b();
        }
        if (i == 2009) {
            return LarkExtensionManager.getInstance().getExtension().getFeatureGating("microapp.audio.encrypt") ? (T) Boolean.TRUE : (T) Boolean.FALSE;
        }
        if (i == 2003) {
            return (T) Boolean.TRUE;
        }
        if (i == 2006) {
            String b = C12782a.m52838b("vscode_connect_state", "");
            if (!TextUtils.isEmpty(b)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean optBoolean = new JSONObject(b).optBoolean("allow");
                    jSONObject.put("openLog", optBoolean);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("allowLog", optBoolean);
                    C67432a.m262319a(iAppContext).getJsBridge().sendMsgToJsCore("onOpenLogStateChanged", jSONObject2.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return (T) jSONObject.toString();
            }
        } else if (i == 2007) {
            return LarkExtensionManager.getInstance().getExtension().getFeatureGating("microapp.domain.dynamic") ? (T) C13374s.m54382a(DomainSettings.Alias.MP_REFER) : t;
        } else {
            boolean z = false;
            if (i == 2005) {
                boolean featureGating = LarkExtensionManager.getInstance().getExtension().getFeatureGating("microapp.webview.localstorage");
                AppBrandLogger.m52830i("LarkOptionLowPriorityDependImpl", "local storage fg:", Boolean.valueOf(featureGating));
                if (!featureGating || !LarkExtensionManager.getInstance().getExtension().isUsingTTWebView()) {
                    boolean a = C66761ac.m260594a().mo232667a(C67432a.m262319a(iAppContext).getAppInfo().appId);
                    AppBrandLogger.m52830i("LarkOptionLowPriorityDependImpl", C67432a.m262319a(iAppContext).getAppInfo().appId, "is in white list:", Boolean.valueOf(a));
                    return (T) new Boolean(a);
                }
                AppBrandLogger.m52830i("LarkOptionLowPriorityDependImpl", "is using ttwebview, fg");
                return (T) Boolean.TRUE;
            } else if (i == 2010) {
                return (T) Boolean.FALSE;
            } else {
                if (i == 2008) {
                    return (T) Boolean.TRUE;
                }
                if (i == 2011) {
                    if (AppbrandContext.getInst().getApplicationContext() != null) {
                        if (!LarkExtensionManager.getInstance().getExtension().getFeatureGating("microapp.debug.switch")) {
                            return (T) new Boolean(false);
                        }
                        z = AppbrandContext.getInst().getApplicationContext().getSharedPreferences("sp_debug", 0).getBoolean("webview_remote_debug", false);
                    }
                    return (T) new Boolean(z);
                } else if (i == 2022) {
                    return (T) C66765c.m260602a().mo232671a(t);
                } else {
                    if (i == 2023) {
                        return AppbrandContext.getInst().getApplicationContext() != null ? (T) Integer.valueOf(AppbrandContext.getInst().getApplicationContext().getSharedPreferences("sp_debug", 0).getInt("force_falcon_debug_config", DebugHelper.FalconDebugConfig.USE_FG.ordinal())) : (T) Integer.valueOf(DebugHelper.FalconDebugConfig.USE_FG.ordinal());
                    }
                }
            }
        }
        return (T) super.getHostData(i, t, iAppContext);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tt.option.C67606d
    public void serviceCommandAction(String str, String str2, final IAppContext iAppContext) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1599527681:
                if (str.equals("reDownlaod")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 234244007:
                if (str.equals("setRustEnv")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1527901065:
                if (str.equals("checknewapp")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1665953587:
                if (str.equals("updateVsLogState")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                AppBrandLogger.m52830i("LarkOptionLowPriorityDependImpl", "retry gadget download");
                AppInfoEntity updateAppInfo = C67432a.m262319a(iAppContext).getUpdateAppInfo();
                if (updateAppInfo == null) {
                    C13374s.m54389a("download_error", "", iAppContext);
                    AppBrandLogger.m52829e("LarkOptionLowPriorityDependImpl", "updateAppInfo is null!");
                    return;
                }
                ((IPkgMgrService) iAppContext.findServiceByInterface(IPkgMgrService.class)).downloadAndInstallPackage(iAppContext.getApplicationContext(), GadgetBeanConverter.convertAppInfoEntityToPackageEntity(updateAppInfo, iAppContext), 1, new IPkgDownloadInstallListener() {
                    /* class com.bytedance.ee.larkbrand.p650e.C13004k.C130125 */

                    @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                    public void onDownloading(int i, float f) {
                    }

                    @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                    public void onDownloadSuccess(int i, boolean z) {
                        AppBrandLogger.m52830i("LarkOptionLowPriorityDependImpl", "onDownloadSuccess....");
                    }

                    @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                    public void onFailed(int i, String str, String str2) {
                        C13374s.m54389a("download_error", "", iAppContext);
                    }

                    @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                    public void onInstallPkgSuccess(int i, String str, String str2) {
                        C13374s.m54389a("download_finish", C67432a.m262319a(iAppContext).getSchema(), iAppContext);
                    }
                });
                return;
            case 1:
                try {
                    int optInt = new JSONObject(str2).optInt("env", -1);
                    if (optInt > -1) {
                        C12837a.m53021a(optInt);
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("LarkOptionLowPriorityDependImpl", "setRustEnv", e);
                    return;
                }
            case 2:
                if (iAppContext == null) {
                    AppBrandLogger.m52830i("LarkOptionLowPriorityDependImpl", "check gadget update ignore : app context is null");
                    return;
                } else if (iAppContext.getCurrentActivity() == null) {
                    AppBrandLogger.m52830i("LarkOptionLowPriorityDependImpl", "check gadget update ignore : cur activity is null");
                    return;
                } else {
                    AbstractC66745e eVar = (AbstractC66745e) ((MiniappHostBase) iAppContext.getCurrentActivity()).getActivityProxy();
                    if (eVar == null) {
                        AppBrandLogger.m52830i("LarkOptionLowPriorityDependImpl", "check gadget update ignore : cur app view is null");
                        return;
                    }
                    AppBrandLogger.m52830i("LarkOptionLowPriorityDependImpl", "check gadget update");
                    final AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
                    UpdateAppManager.asyncUpdateApp(AppbrandContext.getInst().getApplicationContext(), appInfo, eVar, new UpdateAppManager.AbstractC66373a() {
                        /* class com.bytedance.ee.larkbrand.p650e.C13004k.C130114 */

                        @Override // com.tt.miniapp.manager.UpdateAppManager.AbstractC66373a
                        public void onUpdateFailed() {
                            C13374s.m54389a("download_error", "", iAppContext);
                        }

                        @Override // com.tt.miniapp.manager.UpdateAppManager.AbstractC66373a
                        public void onUpdateReady() {
                            C13374s.m54389a("download_finish", C67432a.m262319a(iAppContext).getSchema(), iAppContext);
                        }

                        @Override // com.tt.miniapp.manager.UpdateAppManager.AbstractC66373a
                        public void onCheckForUpdate(AppInfoEntity appInfoEntity) {
                            AppBrandLogger.m52830i("LarkOptionLowPriorityDependImpl", "onCheckForUpdate, md5: " + appInfo.md5 + "-" + appInfoEntity.md5 + " version: " + appInfo.version + "-" + appInfoEntity.version);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("current_ver", appInfo.version);
                                jSONObject.put("latest_ver", appInfoEntity.version);
                                if (TextUtils.equals(appInfo.md5, appInfoEntity.md5) || appInfo.versionCode == appInfoEntity.versionCode) {
                                    jSONObject.put("result_hasnew", false);
                                    C13374s.m54389a("check", jSONObject.toString(), iAppContext);
                                    return;
                                }
                                jSONObject.put("result_hasnew", true);
                                C13374s.m54389a("check", jSONObject.toString(), iAppContext);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }, iAppContext);
                    return;
                }
            case 3:
                try {
                    JSONObject optJSONObject = new JSONObject(str2).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (optJSONObject != null) {
                        C13073a.m53599a(optJSONObject, iAppContext);
                        return;
                    }
                    return;
                } catch (JSONException e2) {
                    AppBrandLogger.m52829e("LarkOptionLowPriorityDependImpl", "setRustEnv", e2);
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.tt.option.C67606d
    public void doEditorAtSearch(String str, String str2, AbstractC4272g gVar, IAppContext iAppContext) {
        new EditorAtSearchUtil(iAppContext).mo49662a(str, str2, gVar);
    }

    @Override // com.tt.option.C67606d
    public boolean isCheckSafeDomain(boolean z, String str, String str2, IAppContext iAppContext) {
        String str3;
        if (!z) {
            return false;
        }
        if (iAppContext.getAppType() == AppType.BlockitApp) {
            str3 = iAppContext.getAppId();
        } else {
            str3 = C67432a.m262319a(iAppContext).getAppInfo().appId;
        }
        return C12955e.m53356a(iAppContext).mo48856a(str3, str, str2);
    }

    /* renamed from: a */
    private void m53463a(String str, String str2, String str3, String str4) {
        C12985d a = C12985d.m53431a();
        a.mo48902a(str, str3 + ContainerUtils.KEY_VALUE_DELIMITER + str4 + ";max-age=-1");
        a.mo48902a(str, str3 + ContainerUtils.KEY_VALUE_DELIMITER + str4 + ";max-age=2534023007;domain=" + str2 + ";path = /");
    }
}
