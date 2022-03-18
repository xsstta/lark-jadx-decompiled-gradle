package com.ss.android.lark.openplatform_api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.larksuite.component.blockit.C24062d;
import com.larksuite.component.blockit.entity.ActionType;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.component.blockit.props.AbstractC24131a;
import com.larksuite.component.blockit.props.C24135e;
import com.larksuite.component.blockit.todo.ITodoBlockViewClickListener;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.browser.AbstractC29553b;
import com.ss.android.lark.biz.core.api.browser.AbstractC29554c;
import com.ss.android.lark.biz.core.api.browser.PreviewRequest;
import com.ss.android.lark.biz.core.api.browser.PreviewV2Request;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.openapp.C34019a;
import com.ss.android.lark.chat.entity.p1662b.AbstractC33975a;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33991a;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.preload.p2519b.AbstractC52229a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

public interface IOpenPlatformApi {

    /* renamed from: com.ss.android.lark.openplatform_api.IOpenPlatformApi$a */
    public interface AbstractC48900a {
    }

    /* renamed from: com.ss.android.lark.openplatform_api.IOpenPlatformApi$b */
    public interface AbstractC48901b {
    }

    void afterAppOnCreate(Context context);

    boolean canOpen(String str);

    boolean canOpenAppLink(String str);

    boolean canOpenH5App(String str, UrlParams urlParams);

    AbstractC44552i createAppCenterPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController);

    AbstractC44552i createMiniAppPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController, TabAppInfo tabAppInfo);

    AbstractC44552i createWebAppPageSpec(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo);

    void doActions(Context context, ActionType actionType, BlockEntity blockEntity, BlockExtra blockExtra);

    void doCheckFace(Activity activity, String str, IGetDataCallback<String> iGetDataCallback);

    void enterBotChatByBotId(String str);

    void enterBotChatByBotIdFromSearch(String str, boolean z);

    void enterBotChatByChatIdFromSearch(String str, boolean z, int i);

    BlockEntity generateBlock(String str, BlockTypeID blockTypeID, String str2, String str3, String str4, String str5, String str6);

    void generateBlockID(Domain domain, String str, BlockTypeID blockTypeID, IGetDataCallback<String> iGetDataCallback);

    void generateBlockIDFromLocal(Domain domain, String str, BlockTypeID blockTypeID, IGetDataCallback<String> iGetDataCallback);

    List<AbstractC28490a> getAbTestExperiments();

    String getAppCenterPageName();

    String getAppDeactivatedWords(Context context);

    String getAppDeletedDesc(Context context);

    Map<? extends String, ? extends AbstractC29186b> getAppLinkHandlers(Context context);

    String getAppOfflineDesc(Context context);

    void getAsyncGadgetPlusItems(Chat chat, AbstractC33975a aVar);

    Map<String, String> getAutoInitModuleConfigMap();

    void getBlockViewById(String str, ITodoBlockViewClickListener aVar, IGetDataCallback<View> iGetDataCallback);

    C24062d getBlockitInstance();

    IDiskCleanTask getDiskCleanTask();

    Map<? extends String, ? extends Boolean> getFeatureConfigMap();

    ILaunchTask getInitOPMonitorTask();

    ILaunchTask getInitOPMonitorTaskForSimple();

    IQRCodeScanResultHandler getLittleAppQRCodeScanResultHandler();

    String getNoAccessBtn(Context context);

    String getNoAccessWords(Context context);

    OkHttpClient getOkHttpClient();

    void getOpenAppFeed(String str, IGetDataCallback<C34019a> iGetDataCallback);

    void getOpenPlatformModule();

    List<AbstractC52229a> getPreloadTasks(int i);

    int getScene(UrlParams.Source source);

    Collection<? extends String> getSyncKeys();

    Map<String, String> getThirdPartyModuleConfigMap();

    Map<String, String> getThirdPartyPrefixModuleConfigMap();

    AbstractInjectWebViewDelegate getWebAppDelegate();

    void gotoShareH5AppPage(Activity activity, String str, String str2, String str3, String str4);

    void gotoSharedH5Page(Activity activity, String str, String str2, String str3, String str4, String str5);

    void handleFinish(Context context, String str);

    void initAppCenterModule();

    void initCardEnv(Context context);

    void initMiniApp(Context context);

    void initOpenPlatformModule(Context context);

    void initProcessorDoInit(String str);

    void initSdkRequestProcessor();

    void initWebAppP0(Context context);

    void initWebDependency(Context context);

    void insertAilabThreeElement(String str, IGetDataCallback<String> iGetDataCallback);

    boolean isMiniProcess(Context context);

    boolean isTabMode(String str);

    void killAllProcess();

    void miniAppLogin(Context context, String str, AbstractC48903b bVar);

    void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void mountBlockById(ViewGroup viewGroup, String str);

    void notifyAppStrategyOnLoginStatusChanged(boolean z);

    boolean onAppIntercpte(Context context);

    void onPageStartedLoad(WebView webView, Context context, String str, Map<String, String> map);

    void onPreTaskStart();

    void openAddGroupBotPage(Context context, String str, boolean z);

    void openAppBrand(Context context, String str, int i);

    void openAppBrandFromDefault(Context context, String str, String str2, String str3, String str4);

    boolean openAppBrandFromMain(Context context, String str);

    boolean openAppBrandFromMain(Context context, String str, String str2);

    void openAppBrandFromSearch(String str, String str2, String str3, String str4);

    void openBotUsePermissionPage(Context context, String str, String str2, String str3);

    void openBulletSchema(Context context, String str);

    void openCreateActionMiniApp(Context context, String str);

    void openDebugPanel(Context context);

    void openLittleAppFromFeed(Context context, String str, String str2, String str3);

    void openLittleAppFromFeed(Context context, String str, String str2, String str3, String str4);

    boolean openLittleAppFromMain(Context context, Bundle bundle);

    void openMessageAction(Context context, String str, List<String> list, List<Integer> list2);

    void openMiniApp(Context context, String str);

    void openMiniApp(Context context, String str, String str2, String str3, String str4);

    void openMiniAppByUriFromSearch(Context context, String str);

    void openTicketMiniApp(Context context, String str, String str2);

    boolean openUrl(Context context, String str, int i);

    boolean openUrl(Context context, String str, UrlParams.Source source);

    void openVoteMiniApp(Context context, String str);

    void preloadAppCenterData();

    void preloadBotChatLittleApp(Context context);

    void preloadCardLittleApp(Context context);

    void preloadProcessFromFeed(int i);

    void preloadProcessFromFirstScreenShow(Context context, IGetDataCallback<Boolean> iGetDataCallback);

    void preloadProcessFromHelpDesk(Context context);

    void preloadProcessFromLarkIdle(Context context, IGetDataCallback<Boolean> iGetDataCallback);

    void preloadProcessFromMessageCard(Context context);

    void preloadProcessFromQR(Context context);

    void preloadTabPageData(Context context, String str);

    void previewCard(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC48902a aVar);

    void previewCard(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC48902a aVar);

    Collection<? extends AbstractNotification> provideNotificationImpls();

    void registerAppStrategyOnlinePush();

    void registerLittleAppOnlinePush();

    void registerOpenAppListener(String str, AbstractC33991a aVar);

    void registerOpenAppListener(String str, AbstractC48900a aVar);

    void registerProps(String str, ViewGroup viewGroup, C24135e eVar, BlockExtra blockExtra, AbstractC24131a aVar);

    void registerQRCodeScannerFactory(AbstractC48901b bVar);

    void registerWebLifecycleListener();

    void requestAvatarAppList(Context context, IGetDataCallback<String> iGetDataCallback);

    void startAppDetailActivity(Context context, String str, boolean z);

    void startMiniProgramActivity(Context context, String str);

    void startMiniProgramActivity(Context context, String str, int i);

    void startPreviewImage(Fragment fragment, List<PreviewRequest> list, int i, AbstractC29553b bVar);

    void startPreviewImageV2(Fragment fragment, List<PreviewV2Request> list, int i, AbstractC29554c cVar);

    void startScanQRCodeActivity(int[] iArr, boolean z, IGetDataCallback<String> iGetDataCallback);

    void triggerRefreshCache(Chat chat);

    boolean tryOpenFilePreviewActivity(Activity activity, String str, String str2, String str3, boolean z);

    void unInitAppCenterModule();

    void unRegisterOpenAppListener(String str, AbstractC33991a aVar);

    void unRegisterOpenAppListener(String str, AbstractC48900a aVar);

    void unRegisterProps(String str, AbstractC24131a aVar);

    boolean useNewMessageAction();
}
