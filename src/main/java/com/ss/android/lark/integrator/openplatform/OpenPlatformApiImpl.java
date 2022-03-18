package com.ss.android.lark.integrator.openplatform;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.nativeMoudule.photo.PhotoPreviewActivity;
import com.bytedance.ee.larkbrand.network.glide.GlideRequest;
import com.bytedance.ee.ref.card.C13518b;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.component.blockit.C24062d;
import com.larksuite.component.blockit.entity.ActionType;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.component.blockit.props.AbstractC24131a;
import com.larksuite.component.blockit.props.C24135e;
import com.larksuite.component.blockit.todo.ITodoBlockViewClickListener;
import com.larksuite.component.openplatform.core.plugin.passport.C25464i;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.aj;
import com.ss.android.lark.biz.core.api.browser.AbstractC29553b;
import com.ss.android.lark.biz.core.api.browser.AbstractC29554c;
import com.ss.android.lark.biz.core.api.browser.PreviewRequest;
import com.ss.android.lark.biz.core.api.browser.PreviewV2Request;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.openapp.C34019a;
import com.ss.android.lark.chat.entity.p1662b.AbstractC33975a;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33991a;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider;
import com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider;
import com.ss.android.lark.integrator.blockit.C39126a;
import com.ss.android.lark.integrator.littleapp.C39799a;
import com.ss.android.lark.integrator.littleapp.C39824h;
import com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider;
import com.ss.android.lark.integrator.openplatform.p2045b.C39941a;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.entity.RouteDriveSDKModel;
import com.ss.android.lark.littleapp.service.ILittleAppService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.openplatform.openapp.BotOpenData;
import com.ss.android.lark.openplatform.openapp.ID_TYPE;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppDataV2;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppType;
import com.ss.android.lark.openplatform_api.AbstractC48902a;
import com.ss.android.lark.openplatform_api.AbstractC48903b;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.p2567s.p2568a.p2576h.C53209a;
import com.ss.android.lark.p2567s.p2568a.p2576h.C53210b;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.preload.p2519b.AbstractC52229a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.openbusiness.data.AppShortCutChatData;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.refer.common.base.AppType;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

@ClaymoreImpl(IOpenPlatformApi.class)
public class OpenPlatformApiImpl implements IOpenPlatformApi {
    int PRELOAD_FROM_APP_FEED = 1;
    int PRELOAD_FROM_CHAT_BOT = 2;
    final AppCenterModule appCenterModule = AppCenterModuleProvider.m154360a();
    private final ILittleAppService littleAppService = LittleAppModuleProvider.m157932a().mo148943b();
    private List<AbstractC52229a> mPreloadTasks = new ArrayList();

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void getOpenAppFeed(String str, IGetDataCallback<C34019a> iGetDataCallback) {
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void registerOpenAppListener(String str, AbstractC33991a aVar) {
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void registerOpenAppListener(String str, IOpenPlatformApi.AbstractC48900a aVar) {
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void registerQRCodeScannerFactory(IOpenPlatformApi.AbstractC48901b bVar) {
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void unRegisterOpenAppListener(String str, AbstractC33991a aVar) {
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void unRegisterOpenAppListener(String str, IOpenPlatformApi.AbstractC48900a aVar) {
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public Map<String, String> getAutoInitModuleConfigMap() {
        return C53209a.f131545a;
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void getOpenPlatformModule() {
        OpenPlatformModuleProvider.m158457a();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public Map<String, String> getThirdPartyModuleConfigMap() {
        return C53209a.f131546b;
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public Map<String, String> getThirdPartyPrefixModuleConfigMap() {
        return C53209a.f131547c;
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public List<AbstractC28490a> getAbTestExperiments() {
        return C41354g.m163940g();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public C24062d getBlockitInstance() {
        return C39126a.m154429a();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public Map<? extends String, ? extends Boolean> getFeatureConfigMap() {
        return OpenPlatformModule.m192197c();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public ILaunchTask getInitOPMonitorTask() {
        return new InitOPMonitorTask();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public ILaunchTask getInitOPMonitorTaskForSimple() {
        return new InitOPMonitorTaskForSimple();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public IQRCodeScanResultHandler getLittleAppQRCodeScanResultHandler() {
        return new IQRCodeScanResultHandler() {
            /* class com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.C399203 */

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, aj ajVar, int i) {
                int i2;
                if (i == 2) {
                    i2 = 1012;
                } else if (i == 3) {
                    i2 = 1013;
                } else {
                    i2 = 1011;
                }
                return LittleAppModuleProvider.m157932a().mo148942a(str, ajVar.mo105591a(), i2);
            }
        };
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void initAppCenterModule() {
        AppCenterModuleProvider.m154360a().mo103312b();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void initSdkRequestProcessor() {
        AppStrategyModuleProvider.m154406a().mo103650e();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void preloadAppCenterData() {
        AppCenterModuleProvider.m154360a().mo103317d();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void registerWebLifecycleListener() {
        AppCenterModuleProvider.m154360a().mo103322g();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void unInitAppCenterModule() {
        AppCenterModuleProvider.m154360a().mo103315c();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public String getAppCenterPageName() {
        return AppCenterModuleProvider.m154360a().mo103320f();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public IDiskCleanTask getDiskCleanTask() {
        return LittleAppModuleProvider.m157932a().mo148945c();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public OkHttpClient getOkHttpClient() {
        return LittleAppModuleProvider.m157932a().mo148946d();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public Collection<? extends String> getSyncKeys() {
        return AppCenterModuleProvider.m154360a().mo103325j();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public AbstractInjectWebViewDelegate getWebAppDelegate() {
        return OpenPlatformModuleProvider.m158457a().mo170514f().mo170697a();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void killAllProcess() {
        LittleAppModuleProvider.m157932a().mo148943b().mo149172b();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void onPreTaskStart() {
        AppStrategyModuleProvider.m154406a().mo103647b().mo103693b();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public Collection<? extends AbstractNotification> provideNotificationImpls() {
        return LittleAppModuleProvider.m157932a().mo148947e();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void registerAppStrategyOnlinePush() {
        AppStrategyModuleProvider.m154406a().mo103647b().mo103687a();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void registerLittleAppOnlinePush() {
        LittleAppModuleProvider.m157932a().mo148943b().mo149185d();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean useNewMessageAction() {
        return OpenPlatformModuleProvider.m158457a().mo170513e();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void initCardEnv(Context context) {
        C13518b.m54918a(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void initMiniApp(Context context) {
        C39799a.m157970a(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void initProcessorDoInit(String str) {
        C53210b.m205845a(str);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void initWebAppP0(Context context) {
        C39799a.m157972b(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public String getAppDeactivatedWords(Context context) {
        return this.appCenterModule.mo103316d(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public String getAppDeletedDesc(Context context) {
        return this.appCenterModule.mo103318e(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public String getAppOfflineDesc(Context context) {
        return this.appCenterModule.mo103321f(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public String getNoAccessBtn(Context context) {
        return this.appCenterModule.mo103314c(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public String getNoAccessWords(Context context) {
        return this.appCenterModule.mo103311b(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void initOpenPlatformModule(Context context) {
        OpenPlatformModuleProvider.m158457a().mo170494a(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void initWebDependency(Context context) {
        OpenPlatformModuleProvider.m158457a().mo170508b(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean canOpen(String str) {
        return LittleAppModuleProvider.m157932a().mo148943b().mo149183c(str);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean canOpenAppLink(String str) {
        return LittleAppModuleProvider.m157932a().mo148943b().mo149171a(str);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean isMiniProcess(Context context) {
        return LittleAppModuleProvider.m157932a().mo148944b(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean isTabMode(String str) {
        return OpenPlatformModuleProvider.m158457a().mo170512d(str);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void notifyAppStrategyOnLoginStatusChanged(boolean z) {
        AppStrategyModuleProvider.m154406a().mo103647b().mo103692a(z);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean onAppIntercpte(Context context) {
        return OpenPlatformModuleProvider.m158457a().mo170511d(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openDebugPanel(Context context) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149173b(context);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void preloadBotChatLittleApp(Context context) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149148a(context, 4, "chat_bot_create");
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void preloadCardLittleApp(Context context) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149148a(context, 2, "chat_bot_create");
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void preloadProcessFromHelpDesk(Context context) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149148a(context, 1, "help_desk");
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void preloadProcessFromMessageCard(Context context) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149148a(context, 2, "msg_card");
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void preloadProcessFromQR(Context context) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149148a(context, 6, "qr_scan");
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void enterBotChatByBotId(String str) {
        OpenPlatformModuleProvider.m158457a().mo170502a(new BotOpenData(str, ID_TYPE.BOT_ID, true, "contact_home", ChatBundle.SourceType.PROFILE.getValue()));
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public Map<? extends String, ? extends AbstractC29186b> getAppLinkHandlers(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(LittleAppModuleProvider.m157932a().mo148943b().mo149184d(context));
        hashMap.putAll(OpenPlatformModuleProvider.m158457a().mo170510c(context));
        return hashMap;
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public List<AbstractC52229a> getPreloadTasks(int i) {
        if (C37239a.m146648b().mo136951a("open.platform.disable.preload.task")) {
            Log.m165389i("OpenPlatformApiImpl", "preload tasks has been block by fg");
            return null;
        }
        if (this.mPreloadTasks.isEmpty()) {
            this.mPreloadTasks.add(new C39941a(i));
        }
        return this.mPreloadTasks;
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void preloadProcessFromFeed(int i) {
        if (i == this.PRELOAD_FROM_APP_FEED) {
            LittleAppModuleProvider.m157932a().mo148943b().mo149148a(LarkContext.getApplication(), 5, "app_feed");
        } else {
            LittleAppModuleProvider.m157932a().mo148943b().mo149148a(LarkContext.getApplication(), 3, "chat_bot_clicked");
        }
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void afterAppOnCreate(Context context) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).perfBoostBeginSection("init_mini_app");
        IAppContext a = C39799a.m157970a(context);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).perfBoostEndSection();
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).preLoadImageModule();
        C39935a.m158524d();
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(context, a) {
            /* class com.ss.android.lark.integrator.openplatform.$$Lambda$OpenPlatformApiImpl$qiFrRruIjrog6N1Lu3VuZsyQkP8 */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ IAppContext f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C39935a.m158519a(this.f$0, this.f$1);
            }
        });
        C39935a.m158521a(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId());
        C39935a.m158525e();
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerRustNetLevelPushOnly(context);
        C39935a.m158518a(context);
        C39935a.m158517a();
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void triggerRefreshCache(Chat chat) {
        boolean z;
        if (chat == null || chat.isSecret()) {
            StringBuilder sb = new StringBuilder();
            sb.append("chat null or secret not refresh cache: ");
            if (chat == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            Log.m165383e("OpenPlatformApiImpl", sb.toString());
            return;
        }
        OpenPlatformModuleProvider.m158457a().mo170504a(new AppShortCutChatData(chat.isCrossWithKa(), chat.isCrossTenant(), chat.isP2PChat(), chat.isGroup(), chat.getId(), chat.getName(), chat.getAvatarKey()));
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public int getScene(UrlParams.Source source) {
        if (source == null) {
            return 1000;
        }
        if (source.getValue() == UrlParams.Source.APP_CARD_GROUP.getValue()) {
            return 1010;
        }
        if (source.getValue() == UrlParams.Source.APP_CARD_SINGLE.getValue()) {
            return 1009;
        }
        if (source.getValue() == UrlParams.Source.APP_CARD_LINK_SINGLE.getValue()) {
            return 1007;
        }
        if (source.getValue() == UrlParams.Source.APP_CARD_LINK_GROUP.getValue()) {
            return 1008;
        }
        if (source.getValue() == UrlParams.Source.APP_P2P_CHAT.getValue()) {
            return 1009;
        }
        if (source.getValue() == UrlParams.Source.APP_GROUP_CHAT.getValue()) {
            return 1010;
        }
        if (source.getValue() == UrlParams.Source.APP_CARD_FOOTER_LINK.getValue()) {
            return 1511;
        }
        if (source.getValue() == UrlParams.Source.APP_THREAD_TOPIC.getValue()) {
            return 1514;
        }
        if (source.getValue() == UrlParams.Source.QR.getValue()) {
            return 1011;
        }
        if (source.getValue() == UrlParams.Source.SCAN_CAMERA.getValue()) {
            return 1013;
        }
        if (source.getValue() == UrlParams.Source.SCAN_PARSE.getValue()) {
            return 1012;
        }
        return 1000;
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void handleFinish(Context context, String str) {
        this.littleAppService.mo149150a(context, str);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void insertAilabThreeElement(String str, IGetDataCallback<String> iGetDataCallback) {
        AppCenterModuleProvider.m154360a().mo103307a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void mountBlockById(ViewGroup viewGroup, String str) {
        C39126a.m154429a().mo86319a(viewGroup, str);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openMiniApp(Context context, String str) {
        this.littleAppService.mo149151a(context, str, 1000);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void requestAvatarAppList(Context context, IGetDataCallback<String> iGetDataCallback) {
        OpenPlatformModuleProvider.m158457a().mo170495a(context, iGetDataCallback);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void unRegisterProps(String str, AbstractC24131a aVar) {
        C39126a.m154429a().mo86322a(str, aVar);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean openAppBrandFromMain(Context context, String str) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149151a(context, str, CommonCode.StatusCode.API_CLIENT_EXPIRED);
        return true;
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openBulletSchema(Context context, String str) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).openBulletSchema(context, str);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openMiniAppByUriFromSearch(Context context, String str) {
        LittleAppModuleProvider.m157932a().mo148942a(str, context, 1005);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void preloadProcessFromFirstScreenShow(Context context, IGetDataCallback<Boolean> iGetDataCallback) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149149a(context, 8, "first_screen_show", iGetDataCallback);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void preloadProcessFromLarkIdle(Context context, IGetDataCallback<Boolean> iGetDataCallback) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149149a(context, 9, "lark_idle", iGetDataCallback);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void startMiniProgramActivity(Context context, String str) {
        LittleAppModuleProvider.m157932a().mo148938a(context, str, CommonCode.StatusCode.API_CLIENT_EXPIRED);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void enterBotChatByBotIdFromSearch(String str, boolean z) {
        OpenPlatformModuleProvider.m158457a().mo170502a(new BotOpenData(str, ID_TYPE.BOT_ID, z, "search_result", ChatBundle.SourceType.SEARCH.getValue()));
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openVoteMiniApp(Context context, String str) {
        openMiniApp(context, "sslocal://microapp?app_id=tt26b3500eb9998b36&start_page=pages/vote-index/index?groupid=" + str);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void getAsyncGadgetPlusItems(Chat chat, final AbstractC33975a aVar) {
        OpenPlatformModuleProvider.m158457a().mo170505a(new AppShortCutChatData(chat.isCrossWithKa(), chat.isCrossTenant(), chat.isP2PChat(), chat.isGroup(), chat.getId(), chat.getName(), chat.getAvatarKey()), new OpenPlatformModule.AbstractC48791a() {
            /* class com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.C399214 */

            @Override // com.ss.android.lark.openplatform.OpenPlatformModule.AbstractC48791a
            /* renamed from: a */
            public void mo144864a(String str) {
            }

            @Override // com.ss.android.lark.openplatform.OpenPlatformModule.AbstractC48791a
            /* renamed from: a */
            public void mo144865a(List<IPlusItem> list) {
                aVar.mo123762a(list);
            }

            @Override // com.ss.android.lark.openplatform.OpenPlatformModule.AbstractC48791a
            /* renamed from: a */
            public void mo144866a(List<IPlusItem> list, List<IPlusItem> list2) {
                aVar.mo123763a(list, list2);
            }
        });
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openCreateActionMiniApp(Context context, String str) {
        String str2;
        if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType() == 2) {
            str2 = "cli_9d230f08c66b5101";
        } else if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isOverseaTenantBrand()) {
            str2 = "cli_9d3bb7fdac38d106";
        } else {
            str2 = "cli_9d0efd483037d108";
        }
        openMiniApp(context, String.format("sslocal://microapp?app_id=%s&start_page=%s", str2, str));
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean openLittleAppFromMain(Context context, Bundle bundle) {
        String string = bundle.getString("appId");
        String string2 = bundle.getString("schema");
        String string3 = bundle.getString("last_notification_seq_id");
        if (TextUtils.isEmpty(string)) {
            C53241h.m205894a("LittleAppNotification", "appId is null!");
            return false;
        }
        LittleAppModuleProvider.m157932a().mo148943b().mo149153a(context, string, string2, 1002, string3);
        return true;
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean canOpenH5App(String str, UrlParams urlParams) {
        Bundle bundle = urlParams.f73900j;
        String str2 = urlParams.f73892b;
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            try {
                str2 = Uri.parse(str).getQueryParameter("app_id");
            } catch (UnsupportedOperationException unused) {
                Log.m165383e("OpenPlatformApiImpl", "WebAppDependency->canOpen UnsupportedOperationException");
            } catch (Exception e) {
                Log.m165383e("OpenPlatformApiImpl", "WebAppDependency->canOpen error:" + e.getMessage());
            }
        }
        boolean z = false;
        if (bundle != null) {
            if (TextUtils.isEmpty(str2)) {
                str2 = bundle.getString("app_id");
            }
            z = bundle.getBoolean("is_web_app", false);
        }
        return OpenPlatformModuleProvider.m158457a().mo170514f().mo170698a(str, str2, z);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void preloadTabPageData(Context context, String str) {
        if (LittleAppModuleProvider.m157932a() != null) {
            AppType f = LittleAppModuleProvider.m157932a().mo148948f();
            if (AppType.GadgetAPP == f || AppType.WebGadgetAPP == f) {
                C41354g.m163939a().getMainDependency().mo144242b(str);
            }
            if (AppType.GadgetAPP == f) {
                C67448a.m262353a().mo234184c();
                C41354g.m163939a().checkInitMainGadget();
                AppBrandLogger.m52828d("OpenPlatformApiImpl", "preloadTabPageData");
                C66645a.m260337a().mo232355a(IAppSandboxEnvManagerService.SandBoxEnvType.MAIN_PROCESS).preloadEmptySandboxEnv();
            }
        }
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void doCheckFace(Activity activity, String str, IGetDataCallback<String> iGetDataCallback) {
        AppCenterModuleProvider.m154360a().mo103299a(activity, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void getBlockViewById(String str, ITodoBlockViewClickListener aVar, IGetDataCallback<View> iGetDataCallback) {
        C39126a.m154429a().mo86321a(str, aVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openAddGroupBotPage(Context context, String str, boolean z) {
        OpenPlatformModuleProvider.m158457a().mo170499a(context, str, z);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void startAppDetailActivity(Context context, String str, boolean z) {
        AppCenterModuleProvider.m154360a().mo103304a(context, str, z);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void startMiniProgramActivity(Context context, String str, int i) {
        LittleAppModuleProvider.m157932a().mo148938a(context, str, i);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public AbstractC44552i createAppCenterPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return AppCenterModuleProvider.m154360a().mo103297a(context, eVar, iTitleController);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public AbstractC44552i createWebAppPageSpec(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo) {
        return OpenPlatformModuleProvider.m158457a().mo170491a(context, iTitleController, tabAppInfo);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void miniAppLogin(Context context, String str, final AbstractC48903b bVar) {
        LittleAppModuleProvider.m157932a().mo148939a(context, str, new C25464i.AbstractC25468c() {
            /* class com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.C399225 */

            @Override // com.larksuite.component.openplatform.core.plugin.passport.C25464i.AbstractC25468c
            /* renamed from: a */
            public void mo88614a(String str) {
                AbstractC48903b bVar = bVar;
                if (bVar != null) {
                    bVar.mo142973a(str);
                }
            }

            @Override // com.larksuite.component.openplatform.core.plugin.passport.C25464i.AbstractC25468c
            /* renamed from: a */
            public void mo88615a(JSONObject jSONObject) {
                AbstractC48903b bVar = bVar;
                if (bVar != null) {
                    bVar.mo142974a(jSONObject);
                }
            }
        });
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C39824h.m158095a().mo144324a(str, jSONObject, (JSONObject) null);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openAppBrand(Context context, String str, int i) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149151a(context, str, i);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean openUrl(Context context, String str, int i) {
        return LittleAppModuleProvider.m157932a().mo148943b().mo149178b(context, str, i);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void enterBotChatByChatIdFromSearch(String str, boolean z, int i) {
        BotOpenData bVar = new BotOpenData(str, ID_TYPE.CHAT_ID, z, "search_result", ChatBundle.SourceType.SEARCH.getValue());
        bVar.mo170593a(i);
        OpenPlatformModuleProvider.m158457a().mo170502a(bVar);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean openAppBrandFromMain(Context context, String str, String str2) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149152a(context, str, str2, CommonCode.StatusCode.API_CLIENT_EXPIRED);
        return true;
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean openUrl(Context context, String str, UrlParams.Source source) {
        return LittleAppModuleProvider.m157932a().mo148943b().mo149178b(context, str, getScene(source));
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void startScanQRCodeActivity(int[] iArr, boolean z, IGetDataCallback<String> iGetDataCallback) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        AppCenterModuleProvider.m154360a().mo103305a(LarkContext.getApplication(), iArr2, z, new AppCenterModule.AbstractC29127a() {
            /* class com.ss.android.lark.integrator.openplatform.$$Lambda$OpenPlatformApiImpl$L9Y7asSUEX2BKYCFmQd1wDE8aGI */

            @Override // com.ss.android.lark.appcenter.wrapper.AppCenterModule.AbstractC29127a
            public final boolean handleResult(Context context, String str, int i) {
                return OpenPlatformApiImpl.lambda$startScanQRCodeActivity$0(IGetDataCallback.this, context, str, i);
            }
        });
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openTicketMiniApp(Context context, String str, String str2) {
        String helpDeskAppid = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getHelpDeskAppid();
        String format = String.format("pages/mobile/index?chat_id=%s&locale=%s", str, str2);
        try {
            format = URLEncoder.encode(format, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        openMiniApp(context, String.format("sslocal://microapp?app_id=%s&start_page=%s", helpDeskAppid, format));
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void doActions(Context context, ActionType actionType, BlockEntity blockEntity, BlockExtra blockExtra) {
        C39126a.m154429a().mo86317a(context, actionType, blockEntity, blockExtra);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void generateBlockID(Domain domain, String str, BlockTypeID blockTypeID, IGetDataCallback<String> iGetDataCallback) {
        C39126a.m154429a().mo86316a(domain, str, blockTypeID, iGetDataCallback);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void generateBlockIDFromLocal(Domain domain, String str, BlockTypeID blockTypeID, IGetDataCallback<String> iGetDataCallback) {
        C39126a.m154429a().mo86324b(domain, str, blockTypeID, iGetDataCallback);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C39824h.m158095a().mo144325a(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openBotUsePermissionPage(Context context, String str, String str2, String str3) {
        this.appCenterModule.mo103302a(context, str, str2, str3);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openMessageAction(Context context, String str, List<String> list, List<Integer> list2) {
        OpenPlatformModuleProvider.m158457a().mo170501a(context, list, list2, str);
    }

    static /* synthetic */ boolean lambda$startScanQRCodeActivity$0(IGetDataCallback iGetDataCallback, Context context, String str, int i) {
        if (iGetDataCallback == null) {
            return false;
        }
        iGetDataCallback.onSuccess(str);
        return true;
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public AbstractC44552i createMiniAppPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController, TabAppInfo tabAppInfo) {
        return LittleAppModuleProvider.m157932a().mo148934a(context, eVar, iTitleController, tabAppInfo);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void onPageStartedLoad(WebView webView, Context context, String str, Map<String, String> map) {
        AppStrategyModuleProvider.m154406a().mo103648c().mo103698a(webView, context, str, map);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openAppBrandFromSearch(String str, String str2, String str3, String str4) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149155a(LarkContext.getApplication(), str, str2, str3, 1005, str4);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openLittleAppFromFeed(Context context, String str, String str2, String str3) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149153a(context, str, str2, 1002, str3);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void startPreviewImage(Fragment fragment, List<PreviewRequest> list, int i, final AbstractC29553b bVar) {
        ArrayList arrayList = new ArrayList();
        for (PreviewRequest previewRequest : list) {
            arrayList.add(new GlideRequest(previewRequest.url, previewRequest.header, previewRequest.method, previewRequest.body));
        }
        LittleAppModuleProvider.m157932a().mo148940a(fragment, arrayList, i, new PhotoPreviewActivity.AbstractC13169b() {
            /* class com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.C399181 */

            @Override // com.bytedance.ee.larkbrand.nativeMoudule.photo.PhotoPreviewActivity.AbstractC13169b
            /* renamed from: a */
            public void mo48929a(int i, String str) {
                bVar.mo105680a(i, str);
            }
        });
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void startPreviewImageV2(Fragment fragment, List<PreviewV2Request> list, int i, final AbstractC29554c cVar) {
        ArrayList arrayList = new ArrayList();
        for (PreviewV2Request previewV2Request : list) {
            arrayList.add(new GlideRequest(previewV2Request.url, previewV2Request.header, previewV2Request.method, previewV2Request.body));
        }
        LittleAppModuleProvider.m157932a().mo148940a(fragment, arrayList, i, new PhotoPreviewActivity.AbstractC13169b() {
            /* class com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.C399192 */

            @Override // com.bytedance.ee.larkbrand.nativeMoudule.photo.PhotoPreviewActivity.AbstractC13169b
            /* renamed from: a */
            public void mo48929a(int i, String str) {
                cVar.mo105681a(i, str);
            }
        });
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openMiniApp(Context context, String str, String str2, String str3, String str4) {
        this.littleAppService.mo149155a(context, str, str2, str3, 1000, str4);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void registerProps(String str, ViewGroup viewGroup, C24135e eVar, BlockExtra blockExtra, AbstractC24131a aVar) {
        C39126a.m154429a().mo86320a(str, viewGroup, eVar, blockExtra, aVar);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public boolean tryOpenFilePreviewActivity(Activity activity, String str, String str2, String str3, boolean z) {
        return this.littleAppService.mo149162a(activity, new RouteDriveSDKModel(str, str2, str3, z));
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openAppBrandFromDefault(Context context, String str, String str2, String str3, String str4) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149155a(context, str, str2, str3, 1000, str4);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void gotoShareH5AppPage(Activity activity, String str, String str2, String str3, String str4) {
        if (activity == null) {
            Log.m165383e("OpenPlatformApiImpl", "gotoShareH5AppPage, activity is null");
            return;
        }
        ShareAppDataV2 shareAppDataV2 = new ShareAppDataV2();
        shareAppDataV2.setHref(str);
        shareAppDataV2.setAndroidHref(str);
        shareAppDataV2.setTitle(str3);
        shareAppDataV2.setImgKey(str4);
        shareAppDataV2.setAppId(str2);
        OpenPlatformModuleProvider.m158457a().mo170496a(activity, shareAppDataV2, ShareAppType.SHARE_APP_PAGE, -1);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void openLittleAppFromFeed(Context context, String str, String str2, String str3, String str4) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149155a(context, str, str2, str3, 1002, str4);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void previewCard(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC48902a aVar) {
        OpenPlatformModuleProvider.m158457a().mo170500a(context, list, cardContent, z, new OpenPlatformModule.AbstractC48792b() {
            /* class com.ss.android.lark.integrator.openplatform.$$Lambda$OpenPlatformApiImpl$u13x_3OhZ6U9qF1zA4oaGOWySA */

            @Override // com.ss.android.lark.openplatform.OpenPlatformModule.AbstractC48792b
            public final void onResult(boolean z, boolean z2, String str) {
                AbstractC48902a.this.onResult(z, z2, str);
            }
        });
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void previewCard(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC48902a aVar) {
        OpenPlatformModuleProvider.m158457a().mo170498a(context, str, str2, cardContent, z, new OpenPlatformModule.AbstractC48792b() {
            /* class com.ss.android.lark.integrator.openplatform.$$Lambda$OpenPlatformApiImpl$QvqdqCkrpnQ6Wg_czB8I6x0xnA */

            @Override // com.ss.android.lark.openplatform.OpenPlatformModule.AbstractC48792b
            public final void onResult(boolean z, boolean z2, String str) {
                AbstractC48902a.this.onResult(z, z2, str);
            }
        });
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public void gotoSharedH5Page(Activity activity, String str, String str2, String str3, String str4, String str5) {
        if (activity == null) {
            Log.m165383e("OpenPlatformApiImpl", "gotoSharedH5Page, activity is null");
            return;
        }
        ShareAppDataV2 shareAppDataV2 = new ShareAppDataV2();
        shareAppDataV2.setAppId(str);
        shareAppDataV2.setHref(str2);
        shareAppDataV2.setAndroidHref(str2);
        shareAppDataV2.setTitle(str3);
        shareAppDataV2.setImgKey(str4);
        shareAppDataV2.setDesc(str5);
        OpenPlatformModuleProvider.m158457a().mo170496a(activity, shareAppDataV2, ShareAppType.SHARE_APP_H5, -1);
    }

    @Override // com.ss.android.lark.openplatform_api.IOpenPlatformApi
    public BlockEntity generateBlock(String str, BlockTypeID blockTypeID, String str2, String str3, String str4, String str5, String str6) {
        return C39126a.m154429a().mo86315a(str, blockTypeID, str2, str3, str4, str5, str6);
    }
}
