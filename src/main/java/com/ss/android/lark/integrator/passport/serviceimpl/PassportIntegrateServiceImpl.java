package com.ss.android.lark.integrator.passport.serviceimpl;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.tool.v1.GetCaptchaEncryptedTokenRequest;
import com.bytedance.lark.pb.tool.v1.GetCaptchaEncryptedTokenResponse;
import com.bytedance.lark.pb.tool.v1.MakeUserOfflineRequest;
import com.bytedance.lark.pb.tool.v1.MakeUserOfflineResponse;
import com.bytedance.lark.pb.tool.v1.MakeUserOnlineRequest;
import com.bytedance.lark.pb.tool.v1.MakeUserOnlineResponse;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.dybrid.h5api.api.C24160c;
import com.larksuite.component.dybrid.h5api.api.C24162e;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.biz.core.api.AbstractC29569m;
import com.ss.android.lark.biz.core.api.AbstractC29571p;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.aj;
import com.ss.android.lark.biz.core.api.ak;
import com.ss.android.lark.biz.im.api.AbstractC29617j;
import com.ss.android.lark.biz.im.api.AbstractC29627s;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.ccm_api.SpacekitConst;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.http.p1953b.C38762c;
import com.ss.android.lark.integrator.p2019f.C39407c;
import com.ss.android.lark.integrator.passport.C39952a;
import com.ss.android.lark.integrator.passport.C39954b;
import com.ss.android.lark.integrator.passport.env.AppEnv;
import com.ss.android.lark.integrator.passport.env.C39957a;
import com.ss.android.lark.integrator.passport.lazy.C39959a;
import com.ss.android.lark.integrator.passport.lazy.init.C39969a;
import com.ss.android.lark.integrator.passport.lazy.init.C39970b;
import com.ss.android.lark.integrator.passport.lazy.init.C39985e;
import com.ss.android.lark.integrator.passport.lazy.init.RustFetcher;
import com.ss.android.lark.integrator.passport.p2046a.C39953a;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.env.p2419a.C49001c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.p2421a.AbstractC49004a;
import com.ss.android.lark.passport.infra.p2421a.AbstractC49005b;
import com.ss.android.lark.passport.infra.service.AbstractC49127k;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49219v;
import com.ss.android.lark.passport.infra.util.security.C49213b;
import com.ss.android.lark.passport.signinsdk_api.AbstractC49340b;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49339b;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49354b;
import com.ss.android.lark.passport.signinsdk_api.base.network.IFetcher;
import com.ss.android.lark.passport.signinsdk_api.entity.CommonEnv;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49401o;
import com.ss.android.lark.passport.signinsdk_api.p2454b.AbstractC49341a;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49406a;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49410c;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.vc.api.IVCApi;
import com.ss.lark.android.module.offlinepush.C64266c;
import java.io.File;
import java.io.IOException;
import java.security.KeyStoreException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@ClaymoreImpl(AbstractC49127k.class)
public class PassportIntegrateServiceImpl implements AbstractC49127k {
    public final AtomicBoolean isNetworkAvailable = new AtomicBoolean(!isNetWorkUnAvailable());
    public final PassportLog log = PassportLog.f123351c.mo171474a();
    private final ICCMApi mCCMApi = ((ICCMApi) ApiUtils.getApi(ICCMApi.class));
    public final ICoreApi mCoreApi = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));
    private final Map<AbstractC49004a, AbstractC29617j> mFeedFirstLoadListeners = new ConcurrentHashMap();
    private final AbstractC49354b mHttpExecutor = new C39985e();
    private final IFetcher mHttpFetcher = new RustFetcher();
    public final IIMApi mIMApi = ((IIMApi) ApiUtils.getApi(IIMApi.class));
    private final Map<Function1<Boolean, Unit>, NetworkLevelListener> mNetworkChangeListeners = new ConcurrentHashMap();
    private final IOpenPlatformApi mOpenPlatformApi = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class));
    private final IPassportApi mPassportApi = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));
    private final C39970b mPush = new C39970b();
    private final Map<AbstractC49005b, AbstractC29627s> mPushMineChangedListeners = new ConcurrentHashMap();
    private final IVCApi mVCApi = ((IVCApi) ApiUtils.getApi(IVCApi.class));

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public Drawable getAppIcon() {
        return null;
    }

    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl$a */
    private static class C40007a implements aj.AbstractC29546a {

        /* renamed from: a */
        public AbstractC49407b.AbstractC49408a f101747a;

        private C40007a() {
        }

        @Override // com.ss.android.lark.biz.core.api.aj.AbstractC29546a
        /* renamed from: a */
        public void mo105595a(Activity activity) {
            AbstractC49407b.AbstractC49408a aVar = this.f101747a;
            if (aVar != null) {
                aVar.onActivityDestory(activity);
            }
        }
    }

    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl$d */
    private static class C40010d implements aj.AbstractC29547b {

        /* renamed from: a */
        public AbstractC49407b.AbstractC49409b f101753a;

        private C40010d() {
        }

        @Override // com.ss.android.lark.biz.core.api.aj.AbstractC29547b
        /* renamed from: a */
        public void mo105596a(View view) {
            AbstractC49407b.AbstractC49409b bVar = this.f101753a;
            if (bVar != null) {
                bVar.mo172452a(view);
            }
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public AbstractC49354b getHttpExecutor() {
        return this.mHttpExecutor;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public IFetcher getHttpFetcher() {
        return this.mHttpFetcher;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public AbstractC49341a getPush() {
        return this.mPush;
    }

    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl$c */
    private class C40009c implements AbstractC49407b {

        /* renamed from: b */
        private final aj f101750b;

        /* renamed from: c */
        private final C40007a f101751c;

        /* renamed from: d */
        private final C40010d f101752d;

        @Override // com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b
        /* renamed from: a */
        public Context mo145304a() {
            return this.f101750b.mo105591a();
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b
        /* renamed from: a */
        public void mo145305a(NetworkErrorResult networkErrorResult) {
            this.f101750b.mo105594b();
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b
        /* renamed from: a */
        public void mo145306a(AbstractC49407b.AbstractC49408a aVar) {
            this.f101751c.f101747a = aVar;
        }

        public C40009c(aj ajVar) {
            this.f101750b = ajVar;
            C40007a aVar = new C40007a();
            this.f101751c = aVar;
            C40010d dVar = new C40010d();
            this.f101752d = dVar;
            ajVar.mo105592a(aVar);
            ajVar.mo105593a(dVar);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void cleanIMLoginUser() {
        this.mIMApi.setLoginUser(null);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void closeOfflinePush() {
        C64266c.m252736b(LarkContext.getApplication());
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void featureGatingClear() {
        C37239a.m146648b().mo136956c();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void featureGatingInit() {
        C37239a.m146648b().mo136950a();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void featureGatingReload() {
        C37239a.m146648b().mo136953b();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String generateContextId() {
        return C53234a.m205877a();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getApplogDomain() {
        return this.mCoreApi.fetchAppLogDomain(true);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public int getExistActivityNumber() {
        return this.mCoreApi.getExistActivityNumber();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public Locale getLanguageSetting() {
        return this.mCoreApi.getLanguageSetting();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public AbstractC25990b getLarkHttpClient() {
        return this.mCoreApi.getLarkHttpClient();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getPrivacyPolicyUrl() {
        return this.mCoreApi.getPolicyUrlBeforeLogin();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getServiceTermUrl() {
        return this.mCoreApi.getServiceTermUrlBeforeLogin();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public Activity getTopActivity() {
        return this.mCoreApi.getTopActivity();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void initWaterMark() {
        this.mCoreApi.resetWaterMark();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isAppForeground() {
        return this.mCoreApi.isAppRealForeground();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isFollowSystemLanguage() {
        return this.mCoreApi.isFollowSystemLanguage();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isLeanModeOn() {
        return this.mIMApi.isLeanModeOn();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isTTWebView() {
        return this.mCoreApi.isUsingTTWebView();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isUsPackage() {
        return C39954b.m158574a();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void killAllLittleApps() {
        this.mOpenPlatformApi.killAllProcess();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void startNewOnBoarding() {
        this.mCoreApi.startFlow();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void exitH5Service() {
        AbstractC24152a h5Service = this.mCoreApi.getH5Service();
        if (h5Service != null) {
            h5Service.exitService();
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public int getAppId() {
        return C29410a.m108287a().mo104277a();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getAppsFlyerUID() {
        return C39953a.m158573a(LarkContext.getApplication());
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public int getEnvType() {
        return C39957a.m158583a(LarkContext.getApplication()).mo145139d();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getRequestId() {
        return getStagingFeatureId(LarkContext.getApplication());
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getUserAgent() {
        return C57824f.m224460a(LarkContext.getApplication(), null, this.mCoreApi.getLanguageSetting());
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getUserUnit() {
        return C39957a.m158583a(LarkContext.getApplication()).mo145140e();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isNetWorkUnAvailable() {
        if (this.mCoreApi.getCurNetWorkLevel() == NetworkLevelListener.NetworkLevel.NET_UNAVAILABLE) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void onLogoutStart() {
        this.mCCMApi.onLoginStatusChangedEvent(SpacekitConst.LoginEvent.BeforeLogout.ordinal());
    }

    private CommonEnv.LanguageEnv getLanguageEnv() {
        return new CommonEnv.LanguageEnv(this.mCoreApi.getLanguageSetting(), new CommonEnv.AbstractC49361a() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.AnonymousClass12 */
        });
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void cleanDataOnResign() {
        String[] strArr = {"key_profile"};
        for (int i = 0; i < 1; i++) {
            C57744a.m224104a().putString(strArr[i], "");
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public CommonEnv getCommonEnv() {
        CommonEnv commonEnv = new CommonEnv(getLanguageEnv());
        commonEnv.setOverSea(C39954b.m158574a());
        return commonEnv;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getLoginTypeChannel() {
        if (TextUtils.equals(C39952a.f101658a, "SSO")) {
            return "SSO";
        }
        if (TextUtils.equals(C39952a.f101658a, "STANDARD")) {
            return "STANDARD";
        }
        return "";
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public Map<String, String> getPassportExtraRegisterParams() {
        HashMap hashMap = new HashMap();
        String currentAttribution = this.mCoreApi.getCurrentAttribution();
        if (currentAttribution == null) {
            currentAttribution = "";
        }
        hashMap.put("ug_source", currentAttribution);
        return hashMap;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getPattern() {
        String attributionConfig = this.mCoreApi.getAttributionConfig("login_pattern");
        if (TextUtils.isEmpty(attributionConfig)) {
            return "";
        }
        return attributionConfig;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isOverSeaTenant() {
        boolean isLarkPackage = ServiceFinder.m193748c().isLarkPackage();
        boolean e = C49001c.m192990e();
        if ((!isLarkPackage || !e) && (isLarkPackage || e)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isPrivateKABuildPackage() {
        if (!PackageChannelManager.isKABuildPackage(LarkContext.getApplication()) || PackageChannelManager.getDeployMode(LarkContext.getApplication()) == 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isPrivateKaPkg() {
        if (!PackageChannelManager.isKABuildPackage(LarkContext.getApplication()) || PackageChannelManager.getDeployMode(LarkContext.getApplication()) == 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void onHostEnvClear() {
        this.mCoreApi.setEnv(this.mPassportApi.envType(), this.mPassportApi.getUserUnit(), null);
    }

    public void updateTimeFormatFromServer() {
        if (!this.mCoreApi.isSettingV2Enable()) {
            this.mCoreApi.getTimeFormatFromServer(new IGetDataCallback<TimeFormatSetting>() {
                /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.C400036 */

                /* renamed from: a */
                public void onSuccess(TimeFormatSetting timeFormatSetting) {
                    PassportIntegrateServiceImpl.this.mCoreApi.updateTimeFormatSetting(timeFormatSetting);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    PassportLog passportLog = PassportIntegrateServiceImpl.this.log;
                    passportLog.mo171471d("PassportIntegrateServiceImpl", "get time format failed：" + errorResult.getDebugMsg());
                }
            });
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isEnableGoogleSdk() {
        boolean z;
        if (!C26284k.m95186b(LarkContext.getApplication()) || C26284k.m95185a(LarkContext.getApplication())) {
            z = false;
        } else {
            z = true;
        }
        boolean isLarkPackage = ServiceFinder.m193748c().isLarkPackage();
        boolean e = C49001c.m192990e();
        if (!isLarkPackage || !e || z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void resetEverything() {
        this.log.mo171465b("n_action_logout_all_clear_data", "clear_data, resetEverything");
        this.mOpenPlatformApi.killAllProcess();
        this.mCoreApi.setLauncherBadgeCount(LarkContext.getApplication(), 0);
        Statistics.setEmptyTeaAgentCustomHeader();
        this.mCoreApi.clearNotification();
    }

    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl$b */
    private static class C40008b implements IGetDataCallback<String> {

        /* renamed from: a */
        AbstractC49352d<String> f101748a;

        public C40008b(AbstractC49352d<String> dVar) {
            this.f101748a = dVar;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            AbstractC49352d<String> dVar = this.f101748a;
            if (dVar != null) {
                dVar.mo145179a(str);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            AbstractC49352d<String> dVar;
            if (errorResult != null && (dVar = this.f101748a) != null) {
                dVar.mo145178a(new NetworkErrorResult(errorResult.getErrorCode(), errorResult.getDisplayMsg()));
            }
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void addLocaleSelectListener(AbstractC49339b bVar) {
        this.mCoreApi.addLocaleSelectListener(bVar);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getBuildPackageChannel(Context context) {
        return PackageChannelManager.getBuildPackageChannel(context);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getLanguageLocalTag(Locale locale) {
        return this.mCoreApi.getLanguageLocalTag(locale);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void getLastTopActivity(IGetDataCallback<Activity> iGetDataCallback) {
        this.mCoreApi.getLastTopActivity(iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isDefaultTab(String str) {
        return this.mCoreApi.isDefaultTab(str);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isWsChannelProcess(Context context) {
        return C57765ac.m224193g(context);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void killVoIp(String str) {
        this.mVCApi.logout();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void launchMainActivity(Context context) {
        this.mCoreApi.startMainActivity(context);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void loadAppConfig(IGetDataCallback<Boolean> iGetDataCallback) {
        this.mCoreApi.loadAppConfigTabConfig(iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void onHostEnvClear(AbstractC49352d<String> dVar) {
        C39959a.m158588a().mo101417a(dVar);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void removeLocaleSelectListener(AbstractC49339b bVar) {
        this.mCoreApi.removeLocaleSelectListener(bVar);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void saveLanguageSetting(Locale locale) {
        this.mCoreApi.saveLanguageSetting(locale);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void updateTimeZone(String str) {
        this.mIMApi.updateTimeZone(str);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void addFeedFirstLoadListener(final AbstractC49004a aVar) {
        C400025 r0 = new AbstractC29617j() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.C400025 */

            @Override // com.ss.android.lark.biz.im.api.AbstractC29617j
            /* renamed from: a */
            public void mo106725a() {
                PassportIntegrateServiceImpl.this.log.mo171465b("PassportIntegrateServiceImpl", "addFeedFirstLoadListener");
                if (aVar != null) {
                    PassportIntegrateServiceImpl.this.log.mo171465b("PassportIntegrateServiceImpl", "add, onFirstLoadedComplete");
                    aVar.mo171104a();
                }
            }
        };
        this.mFeedFirstLoadListeners.put(aVar, r0);
        this.mIMApi.addFeedFirstLoadListener(r0);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void checkNewOnBoardingStatus(IGetDataCallback<Bundle> iGetDataCallback) {
        this.mCoreApi.reloadGuideIfNeed();
        this.mCoreApi.checkFlowStatus(iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public byte[] decryptFile(File file) throws KeyStoreException {
        C49213b.m194023a();
        return this.mCoreApi.decryptFile(file);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean encryptFile(File file) {
        C49213b.m194023a();
        return this.mCoreApi.encryptFile(file);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getDisplayName(String str) {
        return this.mIMApi.getDisplayName(this.mIMApi.getChatterById(str), ChatterNameDisplayRule.NAME);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public boolean isFgEnable(String str) {
        return C37239a.m146648b().mo136951a(str);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void onTriggerLoginInfoChangedStart(boolean z) {
        Activity topActivity = this.mCoreApi.getTopActivity();
        if (topActivity != null) {
            C39407c.m155641a(topActivity, z, this.log);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void registerMineChangedListener(final AbstractC49005b bVar) {
        C400004 r0 = new AbstractC29627s() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.C400004 */

            @Override // com.ss.android.lark.biz.im.api.AbstractC29627s
            public void onPushMineChatterChanged(final Chatter chatter, Chat chat) {
                CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                    /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.C400004.RunnableC400011 */

                    public void run() {
                        bVar.mo171105a(C39969a.m158598a(chatter));
                    }
                });
            }
        };
        this.mPushMineChangedListeners.put(bVar, r0);
        this.mIMApi.addPushMineChatterChangedListener(r0);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void registerNetworkChangeListener(final Function1<Boolean, Unit> function1) {
        C399993 r0 = new NetworkLevelListener() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.C399993 */

            @Override // com.ss.android.lark.biz.core.api.NetworkLevelListener
            public void onNetworkLevelChanged(NetworkLevelListener.NetworkLevel networkLevel) {
                boolean z;
                if (networkLevel != NetworkLevelListener.NetworkLevel.NET_UNAVAILABLE) {
                    z = true;
                } else {
                    z = false;
                }
                if (PassportIntegrateServiceImpl.this.isNetworkAvailable.compareAndSet(!z, z)) {
                    function1.invoke(Boolean.valueOf(z));
                }
            }
        };
        this.mNetworkChangeListeners.put(function1, r0);
        this.mCoreApi.registerNetworkLevelListener(r0);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void registerPlugin(H5PluginConfig h5PluginConfig) {
        AbstractC24152a h5Service = this.mCoreApi.getH5Service();
        if (h5Service != null) {
            h5Service.addPluginConfig(h5PluginConfig);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void unRegisterMineChangedListener(AbstractC49005b bVar) {
        AbstractC29627s remove = this.mPushMineChangedListeners.remove(bVar);
        if (remove != null) {
            this.mIMApi.removePushMineChatterChangedListener(remove);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void unregisterNetworkChangeListener(Function1<Boolean, Unit> function1) {
        NetworkLevelListener networkLevelListener = this.mNetworkChangeListeners.get(function1);
        if (networkLevelListener != null) {
            this.mCoreApi.unRegisterNetworkLevelListener(networkLevelListener);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void updateLoginUsers(final LoginInfo loginInfo) {
        this.mIMApi.getChatterById(loginInfo.getUserId(), new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.C399961 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                PassportLog passportLog = PassportIntegrateServiceImpl.this.log;
                passportLog.mo171471d("PassportIntegrateServiceImpl", "updateLoginInfo for update avatarKey userId=" + loginInfo.getUserId() + " failed: " + errorResult.getMessage() + "userId is:" + loginInfo.getUserId());
                PassportIntegrateServiceImpl.this.mIMApi.setLoginUserId(loginInfo.getUserId());
            }

            /* renamed from: a */
            public void onSuccess(final Chatter chatter) {
                if (ServiceFinder.m193744a().getUserService(chatter.getId()) == null) {
                    PassportLog passportLog = PassportIntegrateServiceImpl.this.log;
                    passportLog.mo171471d("PassportIntegrateServiceImpl", "get chatter by id, chatter id: " + chatter.getId() + ", not found");
                    return;
                }
                ServiceFinder.m193744a().updateUser(chatter.getId(), "update login user, refresh avatar key and url", new Function1<User, Unit>() {
                    /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.C399961.C399971 */

                    /* renamed from: a */
                    public Unit invoke(User user) {
                        List<String> avatarUrls = chatter.getAvatarUrls();
                        if (avatarUrls != null && !avatarUrls.isEmpty()) {
                            user.avatarUrl = avatarUrls.get(0);
                        }
                        user.avatarKey = chatter.getAvatarKey();
                        return null;
                    }
                });
                PassportIntegrateServiceImpl.this.mIMApi.setLoginUser(chatter);
                PassportLog passportLog2 = PassportIntegrateServiceImpl.this.log;
                passportLog2.mo171465b("PassportIntegrateServiceImpl", "updateLoginInfo for update avatarKey userId=" + loginInfo.getUserId() + " tenantId=" + loginInfo.getTenantId() + " tenantCode=" + loginInfo.getTenantCode());
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void asyncMakeUserOffline(IGetDataCallback<Boolean> iGetDataCallback) {
        MakeUserOfflineRequest.C19715a aVar = new MakeUserOfflineRequest.C19715a();
        this.log.mo171465b("r_action_make_user_offline", "start offline");
        SdkSender.asynSendRequestNonWrap(Command.MAKE_USER_OFFLINE, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.$$Lambda$PassportIntegrateServiceImpl$kYKQQD9lse14W1j5ookr3Xw2Jk */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return PassportIntegrateServiceImpl.this.lambda$asyncMakeUserOffline$0$PassportIntegrateServiceImpl(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void removeFeedFirstLoadListener(AbstractC49004a aVar) {
        AbstractC29617j remove = this.mFeedFirstLoadListeners.remove(aVar);
        if (remove != null) {
            this.log.mo171465b("PassportIntegrateServiceImpl", "removeFeedFirstLoadListener");
            this.mIMApi.removeFeedFirstLoadListener(remove);
        }
    }

    private String getStagingFeatureId(Context context) {
        boolean z;
        if (AppEnv.m158575a().mo145139d() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "";
        }
        String a = C38762c.m153059a();
        return a + PreferenceManager.getDefaultSharedPreferences(context).getString("staging_feature_id", "");
    }

    public /* synthetic */ Boolean lambda$asyncMakeUserOffline$0$PassportIntegrateServiceImpl(byte[] bArr) throws IOException {
        boolean z;
        try {
            this.log.mo171471d("r_action_make_user_offline", "offline success");
            if (bArr == null || MakeUserOfflineResponse.ADAPTER.decode(bArr) == null) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (IOException e) {
            this.log.mo171462a("r_action_make_user_offline", "asyncMakeUserOffline parse data error", e);
            return false;
        }
    }

    public /* synthetic */ Boolean lambda$asyncMakeUserOnline$1$PassportIntegrateServiceImpl(byte[] bArr) throws IOException {
        boolean z;
        if (bArr != null) {
            try {
                this.log.mo171465b("r_action_make_user_online", "online success");
                MakeUserOnlineResponse decode = MakeUserOnlineResponse.ADAPTER.decode(bArr);
                if (decode != null) {
                    PassportLog passportLog = this.log;
                    passportLog.mo171465b("r_action_make_user_online", "MAKE_USER_ONLINE response valid:" + decode.is_valid);
                }
                if (decode == null || !decode.is_valid.booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            } catch (IOException e) {
                this.log.mo171462a("r_action_make_user_online", "asyncMakeUserOnline parse data error", e);
                return false;
            }
        } else {
            this.log.mo171471d("r_action_make_user_online", "data is null");
            return false;
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void onTenantSwitchLoadingShow(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            PassportLog passportLog = this.log;
            passportLog.mo171465b("PerfQuickSwitchUserLog", "onTenantSwitchLoadingShow start time = " + currentTimeMillis);
            this.mCoreApi.getPerfQuickSwitchUserMonitor().mo105367c(currentTimeMillis);
            return;
        }
        PassportLog passportLog2 = this.log;
        passportLog2.mo171465b("PerfQuickSwitchUserLog", "onTenantSwitchLoadingShow end time = " + currentTimeMillis);
        this.mCoreApi.getPerfQuickSwitchUserMonitor().mo105366b(currentTimeMillis);
        this.mCoreApi.getPerfQuickSwitchUserMonitor().mo105368d(currentTimeMillis);
        this.mCoreApi.endPerfQuickSwitchUserMonitor();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void loadSystemMessageTemplates(String str, boolean z) {
        this.mIMApi.loadSystemMessageTemplates(str, z);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void openLanguageSettingPage(Context context, Bundle bundle) {
        this.mCoreApi.openLanguageSettingPage(context, bundle);
    }

    public void openMeetingCodeInputPage(Context context, String str) {
        this.mVCApi.openMeetingCodeInputPage(context, str);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void openMoneyH5Page(Context context, String str) {
        this.mIMApi.openMoneyH5Page(context, str);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void checkUserProtocol(Activity activity, final AbstractC49340b bVar) {
        this.mCoreApi.checkUserProtocol(activity, new AbstractC29571p() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.C400058 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29571p
            /* renamed from: a */
            public void mo105814a(boolean z) {
                bVar.mo172132a(z);
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void setLoginUser(String str, final IGetDataCallback<Unit> iGetDataCallback) {
        this.mIMApi.getChatterById(str, new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.C400047 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Chatter chatter) {
                PassportIntegrateServiceImpl.this.mIMApi.setLoginUser(chatter);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(null);
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void openH5Url(Context context, Bundle bundle) {
        C24160c cVar = new C24160c(bundle);
        AbstractC24152a h5Service = this.mCoreApi.getH5Service();
        if (h5Service == null) {
            this.log.mo171471d("PassportIntegrateServiceImpl", "openDybridUrl getH5service == null");
        } else {
            h5Service.startH5Page(new C24162e(context), cVar);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void setWebViewRenderGoneListener(WebView webView, final AbstractC49401o oVar) {
        if (webView != null && oVar != null) {
            new TTWebViewExtension(webView).setRenderProcessGoneListener((IWebViewExtension.RenderProcessGoneListener) new IWebViewExtension.RenderProcessGoneListener() {
                /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.AnonymousClass11 */

                @Override // com.bytedance.lynx.webview.glue.sdk112.IRenderProcessGoneListenersdk112
                public boolean onRenderProcessGone(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
                    AbstractC49401o oVar = oVar;
                    if (oVar == null || !oVar.mo172446a(webView, tTRenderProcessGoneDetail.didCrash(), tTRenderProcessGoneDetail.rendererPriority())) {
                        return false;
                    }
                    return true;
                }
            });
        }
    }

    public void resetStatisticsHeaderInfo(String str, User user) {
        String str2;
        if (user == null) {
            this.log.mo171471d("PassportIntegrateServiceImpl", "user is null");
            return;
        }
        String a = C57859q.m224565a(user.userId);
        if (user.tenant == null || TextUtils.isEmpty(user.tenant.tenantId)) {
            str2 = "";
        } else {
            str2 = user.tenant.tenantId;
        }
        Statistics.resetTeaAgentCustomHeader(a, str, C57859q.m224565a(str2), RomUtils.m94954i().mo93345b(), RomUtils.m94954i().mo93346c());
    }

    public void updateTabConfigAndOnBoarding(C49219v vVar, User user) {
        if (user == null || vVar == null) {
            this.log.mo171471d("PassportIntegrateServiceImpl", "targetUser or mGuard is null");
            return;
        }
        checkNewOnBoardingStatus(vVar.mo171742a("onboarding", Bundle.class));
        updateTimeFormatFromServer();
        IGetDataCallback<Boolean> a = vVar.mo171742a("dynamic-tab", Boolean.class);
        IGetDataCallback<Boolean> a2 = vVar.mo171742a("appconfig", Boolean.class);
        loadTabConfigFromServer(user.getUserId(), user.getTenantId(), a);
        loadAppConfig(a2);
        String id = TimeZone.getDefault().getID();
        PassportLog passportLog = this.log;
        passportLog.mo171465b("n_action_online_succ", "updateTimeZone, switchAccount : " + id);
        updateTimeZone(id);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void loadTabConfigFromServer(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        this.mCoreApi.loadTabConfig(true, str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void launchMainWindow(Context context, User user, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("key_source_from", 1);
        this.mCoreApi.launchMainWindow(context, "", bundle);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void onLoginCallback(Context context, User user, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("key_source_from", 1);
        this.mCoreApi.launchMainWindow(context, "", bundle);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void createStore(Context context, String str, String str2, String str3) {
        this.mCoreApi.createStore(context, str, str2, str3);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void startScanQRCodeActivity(Context context, int[] iArr, final AbstractC49410c cVar, final AbstractC49406a aVar) {
        this.mCoreApi.startScanQRCodeActivity(context, iArr, new ak() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.C400069 */

            @Override // com.ss.android.lark.biz.core.api.ak
            /* renamed from: a */
            public boolean mo105597a() {
                AbstractC49410c cVar = cVar;
                if (cVar == null || !cVar.mo172453a()) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, aj ajVar, int i) {
                C40009c cVar = new C40009c(ajVar);
                AbstractC49410c cVar2 = cVar;
                if (cVar2 == null || !cVar2.mo172454a(str, cVar, i)) {
                    return false;
                }
                return true;
            }
        }, new AbstractC29569m() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.AnonymousClass10 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29569m
            /* renamed from: a */
            public View mo105778a(aj ajVar, FrameLayout frameLayout) {
                C40009c cVar = new C40009c(ajVar);
                AbstractC49406a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo172450a(cVar, frameLayout);
                }
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public String getCaptchaTokenSync(String str, String str2, String str3, String str4) {
        return (String) SdkSender.syncSend(Command.GET_CAPTCHA_ENCRYPTED_TOKEN, new GetCaptchaEncryptedTokenRequest.C19697a().mo66780a(str).mo66782b(str2).mo66783c(str3).mo66784d(str4), new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.C399982 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return GetCaptchaEncryptedTokenResponse.ADAPTER.decode(bArr).token;
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void getCaptchaToken(String str, String str2, String str3, String str4, AbstractC49352d<String> dVar) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CAPTCHA_ENCRYPTED_TOKEN, new GetCaptchaEncryptedTokenRequest.C19697a().mo66780a(str).mo66782b(str2).mo66783c(str3).mo66784d(str4), new C40008b(dVar), new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl.AnonymousClass13 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return GetCaptchaEncryptedTokenResponse.ADAPTER.decode(bArr).token;
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49127k
    public void asyncMakeUserOnline(String str, String str2, String str3, String str4, IGetDataCallback<Boolean> iGetDataCallback) {
        this.log.mo171465b("r_action_make_user_online", "start invoke online");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.log.mo171471d("r_action_make_user_online", "accessToken Or userId is null");
            return;
        }
        MakeUserOnlineRequest.C19723a a = new MakeUserOnlineRequest.C19723a().mo66840a(str).mo66842b(str3).mo66843c(str4).mo66839a(Long.valueOf(Long.parseLong(str2))).mo66838a(new MakeUserOnlineRequest.NamedUserExtraInfo(MakeUserOnlineRequest.NamedUserExtraInfo.TenantTag.UNDEFINED, new HashMap()));
        this.log.mo171465b("r_action_make_user_online", "start rust online");
        SdkSender.asynSendRequestNonWrap(Command.MAKE_USER_ONLINE, a, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.integrator.passport.serviceimpl.$$Lambda$PassportIntegrateServiceImpl$hoTTpPfOrmDgkoG2KL9rSy6dYu4 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return PassportIntegrateServiceImpl.this.lambda$asyncMakeUserOnline$1$PassportIntegrateServiceImpl(bArr);
            }
        });
    }
}
