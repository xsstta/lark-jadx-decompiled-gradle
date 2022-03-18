package com.ss.android.lark.ccm_api;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.ee.bear.basesdk.api.AbstractC4385i;
import com.bytedance.ee.bear.basesdk.api.AbstractC4388l;
import com.bytedance.ee.bear.basesdk.api.AbstractC4390n;
import com.bytedance.ee.bear.basesdk.api.IDarkMode;
import com.bytedance.ee.bear.basesdk.apisupport.AbstractC4434t;
import com.bytedance.ee.bear.contract.drive.AbstractC5138b;
import com.bytedance.ee.bear.contract.route.lark.SpaceMultipleDriveFileRouteBean;
import com.bytedance.ee.bear.contract.route.lark.SpaceRouteBean;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.integrator.dto.C7925a;
import com.bytedance.ee.bear.integrator.dto.FileClickModel;
import com.bytedance.ee.bear.lark.notification.docfeed.AbstractC8055g;
import com.bytedance.ee.bear.lark.p421h.C8043a;
import com.bytedance.ee.bear.search.AbstractC10816c;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.base.activity.C29525a;
import com.ss.android.lark.biz.im.api.AbstractC29625q;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.p1664d.AbstractC33987b;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33992b;
import com.ss.android.lark.chat.entity.page.IDocPageLoader;
import com.ss.android.lark.chat.entity.page.IDocPageProvider;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.doc.entity.AbstractC36839d;
import com.ss.android.lark.doc.entity.C36836a;
import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.preload.AbstractC52220a;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface ICCMApi {

    /* renamed from: com.ss.android.lark.ccm_api.ICCMApi$a */
    public static class C32801a {

        /* renamed from: a */
        public String f84174a;

        /* renamed from: b */
        public String f84175b;
    }

    /* renamed from: com.ss.android.lark.ccm_api.ICCMApi$b */
    public interface AbstractC32802b {
        /* renamed from: a */
        void mo120920a();

        /* renamed from: a */
        void mo120921a(Map<String, Map<String, DocPermPair.PermType>> map);

        /* renamed from: b */
        void mo120922b();
    }

    void addExtension(String str, C29525a aVar);

    void addListenerToDriveSaveStateEventPush(AbstractC29625q qVar);

    AbstractC4434t apiGroups();

    boolean canOpen(String str);

    void checkAndInit();

    void clearCache(IGetDataCallback<Boolean> iGetDataCallback);

    void convertDocToken(String str, IGetDataCallback<C32801a> iGetDataCallback);

    void createDoc(Activity activity);

    AbstractC36839d createDocCardViewBinder(Context context);

    void createDocFeed(String str, DocType docType, IGetDataCallback<C36836a> iGetDataCallback);

    void createDocPageExtension(String str, AppCompatActivity appCompatActivity);

    AbstractC44552i createDocTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController);

    void destroyDocPage(String str);

    boolean dispatchDocPageKeyEvent(String str, KeyEvent keyEvent);

    boolean dispatchDocPageTouchEvent(String str, MotionEvent motionEvent);

    void doDocPermAuthBeforeChatP2pToGroup(Activity activity, Map<String, Map<String, DocResult>> map, AbstractC32802b bVar);

    void downloadFullResource(Context context);

    int driveCancelDownload(String[] strArr);

    int driveCancelUpload(String[] strArr);

    String driveDownload(String str, String str2, String str3, String str4, int i, AbstractC5138b.AbstractC5139a aVar);

    String driveDownloadNormal(String str, String str2, int i, boolean z, AbstractC5138b.AbstractC5139a aVar);

    String driveUpload(Uri uri, String str, String str2, String str3, AbstractC5138b.AbstractC5140b bVar);

    String driveUpload(String str, String str2, String str3, String str4, AbstractC5138b.AbstractC5140b bVar);

    void fetchAppSetting();

    <T> T findExtension(String str, Class<T> cls);

    void forceStopKeepAliveService(Context context);

    String geWikiPageName();

    List<AbstractC28490a> getAbTestExperiments();

    Map<String, String> getAutoInitModuleConfigMap();

    IDiskCleanTask getCCMDiskCleanTask();

    String getCCMInnerFilePath(Context context, Biz biz, String str);

    void getCacheSize(IGetDataCallback<Long> iGetDataCallback);

    Map<String, String> getDocArgs(String str);

    Map<String, String> getDocArgsMessage();

    Map<String, String> getDocArgsMessage(boolean z, boolean z2, boolean z3, String str);

    Map<String, String> getDocArgsMessageCard();

    Map<String, String> getDocArgsOther();

    AbstractC36839d getDocCardViewBinder(Context context);

    int getDocFilterIcon(DocType docType);

    int getDocIcon(int i, String str);

    int getDocIcon(DocType docType, String str);

    int getDocInlineBlueIcon(int i);

    int getDocInlineBlueIcon(DocType docType);

    int getDocInlineGrayIcon(int i);

    int getDocInlineGrayIcon(DocType docType);

    int getDocInlineIcon(DocType docType, int i);

    int getDocInlineLightBlueIcon(int i);

    int getDocInlineLightBlueIcon(DocType docType);

    int getDocInlineWhiteIcon(DocType docType);

    int getDocMiniIcon(DocType docType);

    AbstractC8055g getDocModelParser();

    IDocPageLoader getDocPageLoader(String str);

    String getDocPageName();

    IDocPageProvider getDocPageProvider();

    IPlusItem getDocSendKBPlusItem(Context context, Chat chat);

    String getDocUrlWithFromQuery(String str, String str2);

    String getDocUrlWithId(String str, String str2);

    String getDocUrlWithParams(String str, Map<String, String> map);

    String getDocUrlWithQuerys(String str, Map<String, String> map);

    Collection<? extends AbstractC52220a> getDocsIdleActions();

    void getDrivePreviewUrl(String str, String str2, int i, IGetDataCallback<String> iGetDataCallback);

    void getDrivePreviewUrl(String str, String str2, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback);

    AbstractC4385i getDriveSdkWrapper();

    Map<Integer, Integer> getLayoutResIdMap();

    IPlusItem getSendKBPlugin(Context context, Chat chat);

    Map<String, AbstractC29186b> getSpaceKitAppLinkHandlers(Context context);

    Map<String, String> getThirdPartyModuleConfigMap();

    Map<String, String> getThirdPartyPrefixModuleConfigMap();

    Map<String, String> getUrlParamsMap(String str);

    Map<String, Boolean> getWikiFeatureGatingConfig();

    int getWikiIcon(int i, String str);

    int getWikiIcon(DocType docType, String str);

    AbstractC44552i getWikiTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController);

    void goDocsSelector(Context context, C36516a aVar, int i, String str, int i2, String str2);

    void initDocPlugin(Context context);

    void initProcessorDoInit(String str);

    void injectSessionCookies();

    boolean isEnableWikiTab();

    boolean isP0MergeToMainProc();

    void jumpSearchDocs(String str, String str2, String str3);

    void jumpSearchWiki(String str, String str2);

    void loadThumbnail(C8043a aVar);

    AbstractC10816c makeDocForLarkGlobalSearch(boolean z);

    AbstractC10816c makeWikiForLarkGlobalSearch();

    void onAppStatusConfigurationChanged(Application application, Configuration configuration);

    void onConfigurationChanged(String str, Configuration configuration);

    void onDocPageActivityResult(String str, int i, int i2, Intent intent);

    boolean onDocPageBackPressed(String str);

    void onLoginStatusChangedEvent(int i);

    boolean open(Context context, String str, int i, int i2, Map<String, String> map);

    boolean open(Context context, String str, String str2, Map<String, String> map);

    boolean open(SpaceMultipleDriveFileRouteBean spaceMultipleDriveFileRouteBean);

    boolean open(String str, String str2, Map<String, String> map);

    boolean open(String str, Map<String, String> map);

    void openDocs(SpaceRouteBean spaceRouteBean);

    void openFileReader(FileClickModel fileClickModel, String str);

    DocResult parseDocResultFromPb(String str, C14928Entity entity);

    String[] parseDocUrl(String str);

    void preloadDoc(List<String> list);

    void preloadDocFromFeed(List<String> list);

    void preloadDocPage(String str, Context context);

    void preloadDocSdk(Context context, int i);

    void preloadSpacePageUI(Context context);

    void preloadWikiTabPageData(Context context);

    IDarkMode provideDarkMode();

    AbstractC4385i provideDriveSdk();

    AbstractC4388l provideFollowSdk();

    Collection<? extends AbstractNotification> provideNotificationImpls();

    AbstractC4390n providePermissionProvider();

    void pullDocFeed(String str, IGetDataCallback<DocFeed> iGetDataCallback);

    void registerAnnouncementCloseListener(AbstractC33987b bVar);

    void registerPushSaveToNutStateListener(AbstractC33992b bVar);

    void reloadTabPageSpecUrl(AbstractC44552i iVar, boolean z);

    boolean removeExtension(String str, C29525a aVar);

    void removeListenerToDriveSaveStateEventPush(AbstractC29625q qVar);

    void saveToNutStore(String str, String str2, String str3, int i, IGetDataCallback<String> iGetDataCallback);

    void saveToNutStore(String str, String str2, String str3, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback);

    void setCCMConfig(String str);

    void setIsAppInFront(boolean z);

    void setOnWebViewCreateListener(AbstractC32803a aVar);

    void setupServices(Context context);

    void startDocSelectActivity(Activity activity, C36516a aVar, int i, int i2, String str, String str2);

    boolean startDriveSDKActivity(Context context, C7925a aVar);

    C36836a syncPullDocFeedsByIds(List<String> list);

    void timingCleanData(long j);

    void unRegisterAnnouncementCloseListener(AbstractC33987b bVar);

    void unRegisterPushSaveToNutStateListener(AbstractC33992b bVar);
}
