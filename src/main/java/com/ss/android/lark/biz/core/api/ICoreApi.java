package com.ss.android.lark.biz.core.api;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.bytedance.lark.pb.contact.v1.InvitationSource;
import com.bytedance.lark.pb.im.v1.ContentType;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.webview.container.dto.C25830a;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.C29187c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29572q;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.IMineController;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.biz.core.api.browser.AbstractC29552a;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.core.api.magic.IMagicLifecycleListener;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b;
import com.ss.android.lark.biz.core.api.p1405e.AbstractC29559a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29579a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29580b;
import com.ss.android.lark.biz.core.api.resource.AbstractC29581c;
import com.ss.android.lark.biz.core.api.resource.AbstractC29582d;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.SelectedData;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.fcm_export.IFCMModule;
import com.ss.android.lark.forward.dto.CalendarForwardData;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.TodoForwardData;
import com.ss.android.lark.forward.dto.template.ForwardEnhancedView;
import com.ss.android.lark.forward.dto.template.IForwardSelectListener;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.location.dto.LocationClientConfig;
import com.ss.android.lark.location.listener.AbstractC41583b;
import com.ss.android.lark.location.p2146b.AbstractC41558b;
import com.ss.android.lark.location.p2146b.AbstractC41559c;
import com.ss.android.lark.location.p2146b.AbstractC41561d;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.location.p2146b.AbstractC41567g;
import com.ss.android.lark.location.p2146b.AbstractC41569h;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.AbstractC44546c;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.C48499a;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.openapi.jsapi.entity.ShareModel;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49339b;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.searchcommon.dto.C53892a;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import io.reactivex.Observable;
import java.io.File;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okio.ByteString;

public interface ICoreApi {

    /* renamed from: com.ss.android.lark.biz.core.api.ICoreApi$a */
    public interface AbstractC29533a {
    }

    void addActivityFloatWindow(View view, AppCompatActivity appCompatActivity);

    void addActivityObserver(C29538a aVar);

    void addAppFloatView(View view);

    void addAppLifecycleObserver(AbstractC29586u uVar);

    void addBackToFrontEventListener(AbstractC29561h hVar);

    void addChatHistorySideMenuClickHitPoint(String str);

    void addConnStateListener(WSConnState.AbstractC29537a aVar);

    void addCustomViewAppFloat(Drawable drawable, int[] iArr, String str, int i, Runnable runnable);

    void addDownloadTask(C29556e eVar);

    void addFrontToBackEventListener(AbstractC29585t tVar);

    void addLifeCycleObserver(AbstractC29586u uVar);

    void addLifecycleObserver(AbstractC29586u uVar);

    void addLocaleSelectListener(AbstractC49339b bVar);

    void addPushContactStateListener(AbstractC29543ag agVar);

    void addPushFileUploadListener(AbstractC29544ah ahVar);

    void addPushPushResourceListener(AbstractC29580b bVar);

    void addPushResourceDownloadProgressListener(AbstractC29579a aVar);

    void addPushResourceUploadProgressListener(AbstractC29581c cVar);

    void addSettingsUpdateListener(ISettingsUpdateListener amVar);

    void agreeChatApplication(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    void asyncGetAvatarPath(String str, String str2, int i, float f, IGetDataCallback<String> iGetDataCallback);

    void asyncTraceBegin(long j, String str, int i);

    void asyncTraceBegin(String str, String str2);

    void asyncTraceEnd(long j, String str, int i);

    void asyncTraceEnd(String str, String str2);

    void attachBackgroundWatermark(View view);

    void attachDialogWatermark(Dialog dialog);

    void attachGlobalWatermark(Activity activity);

    void attachGlobalWatermark(Dialog dialog);

    void attachGlobalWatermark(FrameLayout frameLayout);

    void attachPartialWatermark(Activity activity);

    void attachWatermark(Activity activity);

    void beforeConfigurationChangedForLocale(Configuration configuration);

    void beginSection(String str, String str2, int i);

    boolean canOpenExternal(Context context, Uri uri);

    boolean canOpenInternal(Context context, String str, int i);

    void cancelDownloadMessageFile(String str, String str2, String str3, int i, IGetDataCallback<Boolean> iGetDataCallback);

    boolean changeAppLanguage(Context context, Locale locale);

    void checkAndStartFlow(IGetDataCallback<Boolean> iGetDataCallback);

    void checkContactRelationShip(String str, IGetDataCallback<UserRelationResponse> iGetDataCallback);

    void checkFCMDownloadWithDialog(Activity activity, CheckDownloadDialogCallback cVar);

    void checkFileState(String str, String str2, int i, int i2, IGetDataCallback<FileState> iGetDataCallback);

    void checkFileState(String str, String str2, int i, IGetDataCallback<FileState> iGetDataCallback);

    void checkFlowStatus(IGetDataCallback<Bundle> iGetDataCallback);

    void checkInviteMemberPermission(C57865c.AbstractC57871b<Boolean> bVar);

    void checkNewVersion();

    void checkNewVersionWithDialog(Context context, ay ayVar);

    boolean checkSoNeedUpdate(Context context, String str);

    boolean checkToShow(String str);

    void checkUserProtocol(Activity activity, AbstractC29571p pVar);

    void clearNotification();

    void closeFriendApplicationBanner(String str, IGetDataCallback<Boolean> iGetDataCallback);

    boolean completeGuide(String str);

    void compressImage(Context context, File file, boolean z, IGetDataCallback<C29548at> iGetDataCallback, Biz biz, Scene scene);

    boolean consumeGuide(String str);

    void createStore(Context context, String str, String str2, String str3);

    String decodeQRCode(Bitmap bitmap);

    String decodeQRCode(String str);

    byte[] decryptFile(File file) throws KeyStoreException;

    void detachWatermark(Activity activity);

    boolean didShowGuide(String str);

    void doAot(Context context);

    void downLoadMessageFile(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

    void downLoadMessageVideo(Context context, String str, String str2, String str3, int i, int i2, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

    void downLoadMessageVideo(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

    File downloadImage(Context context, String str, Object obj, int i, int i2, boolean z, boolean z2);

    void downloadImage(List<String> list, List<String> list2, int i, int i2, IGetDataCallback<List<Bitmap>> iGetDataCallback);

    void downloadImageAsync(Context context, String str, Object obj, int i, int i2, IGetDataCallback<File> iGetDataCallback);

    Bitmap encodeQRCode(String str, int i, int i2, int i3);

    boolean encryptFile(File file);

    void endPerfQuickSwitchUserMonitor();

    void endSection();

    void endSpan(String str);

    void evictMultitaskFloatWindow(Lifecycle lifecycle, View view);

    String fetchAppLogDomain(boolean z);

    void fetchUserProfile(String str, IGetDataCallback<ProfileResponse> iGetDataCallback);

    void fetchUserProfileByIdFromNet(String str, IGetDataCallback<ProfileResponse> iGetDataCallback);

    void fetchWebViewCore(boolean z);

    void fillTenantBadge(List<TenantInfo> list, List<TenantInfo.PendingUser> list2, IGetDataCallback<List<TenantInfo>> iGetDataCallback);

    void findTabViews(Activity activity, IGetDataCallback<List<Pair<String, View>>> iGetDataCallback);

    void forwardWithTemplate(Context context, ForwardTemplate forwardTemplate, int i);

    void forwardWithTemplateFromFragment(Context context, C36516a aVar, ForwardTemplate forwardTemplate, int i, int[] iArr, int[] iArr2);

    void generateDefaultDrawable(Context context, int i, float f, IGetDataCallback<Drawable> iGetDataCallback);

    void getABExperimentVersion(String str, IGetDataCallback<String> iGetDataCallback);

    <T> T getAbTestValue(Class<? extends AbstractC28490a> cls, boolean z);

    String getApiKey(Context context);

    C29550b getAppConfig();

    <T extends C41152a> T getAppConfig(String str, AbstractC41160a aVar);

    int getAppIconBadgeCount();

    C29187c getAppLink();

    String getAttributionConfig(String str);

    void getAuthChatter(int i, List<String> list, String str, IGetDataCallback<Map<String, Integer>> iGetDataCallback);

    Map<String, String> getAutoInitModuleConfigMap();

    String getAvatarPath(String str, String str2, int i, float f);

    BadgeStyle getBadgeStyleSetting();

    AbstractC29479b getBannerController(String str);

    long getBeginCreateApplicationTime();

    void getBrowserModule();

    Locale getCacheLanguageSetting();

    Locale getCacheLanguageSettingwithDefault();

    Locale getCachedLanguageSetting();

    long getCachedNtpTime();

    AbstractC41558b getCalendarMap();

    String getChatReactionSampleConfig();

    String getChatReadSampleConfig();

    PendingIntent getCommonNotificationIntent(Message message, boolean z, boolean z2);

    IContactsGroupController getContactGroupController();

    AbstractC29563j getContactHomeController();

    String getContactPageTag();

    UserRelationResponse getContactUserRelationShip(String str);

    AbstractC29565l getContactsSelectorController();

    Department getCurDepartment();

    NetworkLevelListener.NetworkLevel getCurNetWorkLevel();

    String getCurrentAttribution();

    int getCurrentDarkMode();

    NetworkType getCurrentNetworkType(Context context);

    Locale getDefaultLanguageSetting();

    AbstractNotification.AbstractC48496c<Notice> getDefaultNotificationHitPoint();

    String getDefaultTabName();

    BaseFragment getDepartmentDetailAsFragment();

    AbstractC29570n getDepartmentDetailController();

    IDepartmentDetailFragmentBuilder getDepartmentDetailFragmentBuilder(boolean z, boolean z2, PickType pickType, AbstractC29541ac acVar, boolean z3, boolean z4, boolean z5, Boolean bool);

    NotificationSettingDetail getDetail(String str);

    String getDomain(DomainSettings.Alias alias);

    List<String> getDomains(DomainSettings.Alias alias);

    AbstractC29575r getDownloadService();

    String getDynamicDomainByManis(DomainSettings.Alias alias);

    long getElapsedToLastForeground();

    long getElapsedToStart();

    AbstractC29583s getEmailContactController();

    String getEmojiImage(String str, String str2);

    void getEnableDingBySmsPhone(IGetDataCallback iGetDataCallback);

    int getExistActivityNumber();

    void getExternalContactAuth(List<String> list, int i, IGetDataCallback<Map<String, Integer>> iGetDataCallback);

    AppConfig.FeatureConfig getFeatureConfig(String str);

    String getFeiShuMiniAppLink();

    String getFilePathListKey();

    Fragment getForwardPickFragment(Context context, Bundle bundle, Chat chat);

    ForwardTemplate getForwardTemplate(Context context, Message message, ShareModel shareModel);

    String getGroupMessageIDKey();

    String getGroupStateKey();

    AbstractC24152a getH5Service();

    Map<String, String> getHandleSchemaList();

    String getHelpDeskAppid();

    AbstractC25990b getHttpClient();

    String getHybridMaterialConfig();

    as getIdlePositionLifecycle(Fragment fragment);

    Image getImage(com.bytedance.lark.pb.basic.v1.Image image);

    ByteString getInlinePreviewFromPb(ImageSet imageSet);

    String getInviteExternalPageTitle();

    String getKeyFromNotification();

    String getLanguageLocalTag(Locale locale);

    Locale getLanguageSetting();

    String getLanguageSettingCode();

    String getLanguageWithLocal();

    AbstractC25990b getLarkHttpClient();

    Activity getLastTopActivity();

    void getLastTopActivity(IGetDataCallback<Activity> iGetDataCallback);

    Intent getLaunchMainWindowIntent(Context context, Bundle bundle, int i);

    Intent getLaunchMainWindowIntent(Context context, String str);

    Intent getLaunchMainWindowIntent(Context context, String str, Bundle bundle);

    AbstractC41559c getLittleAppMap();

    String getLoadSoVersion();

    String getLocalSoVersion();

    TimeFormatSetting getLocalTimeFormat();

    AbstractC29551a getLocaleCache();

    Locale getLocaleFromConfiguration(Configuration configuration);

    AppCompatDelegate getLocaleHookDelegate(AppCompatDelegate appCompatDelegate);

    ILocaleWatcher getLocaleWatcher();

    boolean getLocation(Context context, AbstractC41567g.AbstractC41568a aVar);

    AbstractC41583b getLocationClient(Context context);

    AbstractC41583b getLocationClient(Context context, LocationClientConfig locationClientConfig);

    AbstractC41561d getLocationMessageMap();

    CharSequence getMainActivityName();

    AbstractC29555b getMainLauncher();

    ForwardEnhancedView getMessageCardEnhancedView();

    Image getMiddleFromPb(ImageSet imageSet);

    String getMiddleKeyFromPb(RichTextElement.ImageProperty imageProperty);

    void getMyPhoneNumber(IGetDataCallback<String> iGetDataCallback);

    long getNaturalBeginLaunchTime();

    boolean getNavMuteBadgeSetting();

    AbstractC29572q getNetworkMonitor();

    au getNetworkQuality();

    int getNetworkQualityType();

    AbstractC29539aa getNotificationSetting();

    String getNotificationSettingDetail(String str);

    long getNtpTime();

    long getNtpTime(long j);

    int getOneWayContactSelectLimit();

    String getOnlyLanguage();

    String getOpenApiUrl();

    Chatter.ChatterCustomStatus getOpenedUserStatus(List<Chatter.ChatterCustomStatus> list);

    boolean getP2pBuildGroupTipShowSetting();

    AbstractC41562e getPOIService();

    int getPackageId();

    AbstractC32812c getPerfEnterChatMonitor();

    IPerfQuickSwitchUserMonitor getPerfQuickSwitchUserMonitor();

    AbstractC41569h getPickLocationMap();

    String getPluginNativeLibraryDir(String str);

    String getPolicyUrlBeforeLogin();

    Profile getProfile();

    IPlusItem getProfileKBPlusItem(Chat chat);

    AbstractC29542ad getProfileLauncherService();

    IOpenMessageCellFactory getProfileMessageCellFactory();

    String getReactionImage(String str, String str2);

    String getResUrlByResKey(String str, int i, int i2);

    String getResUrlByResKey(String str, String str2, int i, int i2);

    AbstractC29582d getResourceService();

    Activity getRightActivity();

    long getRunningSpan(String str);

    Map<String, String> getSchemaHandleListByManis();

    ISearchLifecycleObserver getSearchLifecycleObserver();

    List<String> getSecLinkWhiteList();

    List<String> getSecurityWhiteListByManis();

    String getServiceTermUrlBeforeLogin();

    String getSourceFile(String str);

    List<String> getSupportShowBannerSourceList();

    int getTabIndex(String str);

    TabType getTabType(String str);

    <T extends View> T getTabView(String str);

    X509Certificate[] getTenantCertCertificate(String str);

    PrivateKey getTenantCertPrivateKey(String str);

    List<String> getTenantTrustHostList(String str);

    Map<String, String> getThirdPartyModuleConfigMap();

    Map<String, String> getThirdPartyPrefixModuleConfigMap();

    Image getThumbnailFromPb(ImageSet imageSet);

    String getThumbnailKeyFromPb(RichTextElement.ImageProperty imageProperty);

    void getTimeFormatFromServer(IGetDataCallback<TimeFormatSetting> iGetDataCallback);

    Activity getTopActivity();

    IUiModeService getUiModeService();

    UniversalUserSetting getUniversalUserSetting(String str);

    int getUpdateAvatarResultCode();

    WatermarkInfo getWatermarkInfo(Context context);

    int getWatermarkStrategy();

    C25830a getWebAppInjector();

    Map<aq, aq> getWebLifecycleListeners();

    void goCalendarShareSelectPage(Context context, CalendarForwardData calendarForwardData, int i);

    void goCalendarTransferSelectPage(Context context, CalendarForwardData calendarForwardData, int i);

    void goChatForwardSelectPage(Context context, FavoriteForwardData favoriteForwardData, int i, int i2);

    void goChatForwardSelectPage(Context context, FavoriteForwardData favoriteForwardData, int i, String str, int i2);

    void goChatForwardSelectPage(Context context, Message message, int i, String str);

    void goChatForwardSelectPage(Context context, Message message, int i, String str, String str2, String str3);

    void goChatForwardSelectPage(Context context, Message message, IForwardSelectListener iForwardSelectListener, String str, String str2, String str3);

    void goChatForwardSelectPage(Context context, Message message, String str, String str2, String str3);

    void goChatForwardSelectPage(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, boolean z, String str3);

    void goChatOneByOneForwardSelectPage(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, String str3);

    void goContactsGroupActivity(Context context, String str);

    void goExternalContactActivity(Context context);

    void goGroupShareForwardSelectPage(Context context, ShareDataForwardData shareDataForwardData, int i);

    void goGroupShareForwardSelectPage(Context context, Chat chat, int i);

    void goImageForwardSelectPage(Context context, ImageContent imageContent);

    void goImageForwardSelectPage(Context context, String str);

    void goImageForwardSelectPage(Context context, String str, int i);

    void goInviteInactiveParentListActivity(Context context, String str, String str2, String str3, int i);

    void goMineTranslationSettingPage(Context context);

    void goMomentsPostShareSelectPage(Context context, String str, String str2, int i, int i2);

    void goProfileShareForwardSelectPage(Context context, ProfileContent profileContent);

    void goShareFileCopySelectPage(Context context, String str, String str2, long j, boolean z, String str3);

    void goShareForwardSelectPage(Context context, ShareDataForwardData shareDataForwardData);

    void goShareForwardSelectPage(Context context, ShareTextForwardData shareTextForwardData);

    void goShareStickerSetSelectPage(Activity activity, String str);

    void goShareThreadTopicSelectPage(Context context, Message message, String str, String str2);

    void goShareVideoMeeting(Context context, String str, String str2);

    void goStickerForwardSelectPage(Context context, String str, StickerContent stickerContent);

    void goThreadForwardSelectPage(Context context, Chat chat, ArrayList<String> arrayList, String str, int i, String str2, String str3);

    void goToFolderInsideSearchPage(Context context, String str);

    void goTodoShareSelectPage(Context context, C36516a<?> aVar, TodoForwardData todoForwardData, int i);

    void gotoShareForwardSelectPage(Activity activity, String str, ShareModel shareModel);

    void gotoShareForwardSelectPage(Context context, Message message, ShareModel shareModel);

    void guidePrepare();

    Boolean hadGotInstallAttribution();

    void handleDepartmentDetailBackPressed();

    void handleSwitchTenant(Context context, Intent intent, String str);

    void hookClassLoader(String str);

    void initAppFloat(Application application);

    void initAppSettingV3();

    void initBrowserModule();

    void initBytecertSdk();

    void initDepartmentDetailController(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);

    void initDynamicResources(Context context);

    void initGuideMgrModule();

    void initGuideModule();

    void initKeyBoard();

    void initLanguageModule(Application application, AbstractC29540ab abVar);

    void initMagicModule();

    void initMainModule(Context context);

    void initNightMode(Context context);

    void initNotificationModule(Context context);

    void initProcessorDoInit(String str);

    void initPushMonitor();

    void initTTNet(Context context);

    void initWSNotificationModule();

    void initWebViewSDKBasic(Context context);

    void initWschannelProcess();

    void injectWebViewCoreResource(Application application);

    boolean isAllowSecret();

    boolean isAotTaskRunning();

    boolean isAppConfigOn(String str);

    boolean isAppFront();

    boolean isAppLink(Uri uri);

    boolean isAppRealForeground();

    boolean isAppreciableForwardError(ErrorResult errorResult);

    boolean isAuthorized();

    boolean isClientContactOptUi();

    boolean isCurrentUserInZenMode();

    boolean isDefaultTab(String str);

    boolean isDozeState();

    boolean isFloatingWindowEnabled();

    boolean isFollowSystemLanguage();

    boolean isFullWidthPunctuation();

    boolean isGlobalWaterMark();

    boolean isGuideFgEnabled(String str);

    boolean isHasNewVersion();

    boolean isInHouse(double d, double d2);

    boolean isInZenMode(long j);

    boolean isInstanceOfBaseContextWrapperDelegate(AppCompatDelegate appCompatDelegate);

    boolean isInstanceOfMainActivity(Context context);

    boolean isInterceptUrl(String str);

    boolean isInvitationUnionEnable();

    boolean isInviteExternalEnable();

    boolean isInviteMemberAdminEnable();

    boolean isInviteMemberEnable();

    boolean isLowMemoryDevice(Context context);

    boolean isMailSmartComposeEnabled();

    boolean isMedalEnabled();

    boolean isMessageAlignLeftAndRightEnable();

    boolean isMessengerEnterpriseTopicEnable();

    boolean isMessengerSmartComposeEnabled();

    boolean isMessengerSmartCorrectionEnabled();

    boolean isMultitaskEnabled(Application application);

    boolean isNeedShowCreateGroupGuide();

    boolean isNeedStrongNotice();

    boolean isNotificationShowDetail(boolean z);

    boolean isNotificationUndisturbed();

    boolean isOn(String str);

    boolean isOpenUserCustomStatus();

    boolean isPluginInstalled(String str);

    boolean isPluginLoaded(String str);

    boolean isSameWithSetting(Locale locale, Locale locale2);

    boolean isSandboxProcess(Context context);

    boolean isSettingKeyboardEnterSendEnable();

    boolean isSettingMessageAlignmentEnable();

    boolean isSettingV2Enable();

    boolean isSimpleModeOn(Context context);

    boolean isSmartReplyEnabled();

    boolean isSoundOn(String str);

    boolean isSystemTracerEnable();

    boolean isTTNetOn(Context context);

    boolean isTabEnable(String str);

    boolean isUseDiskManage();

    boolean isUsingTTWebView();

    boolean isVibrateOn(String str);

    void launchMainWindow(Context context);

    void launchMainWindow(Context context, String str);

    void launchMainWindow(Context context, String str, Bundle bundle);

    void loadAppConfig(boolean z, IGetDataCallback<AppConfig> iGetDataCallback);

    void loadAppConfigTabConfig(IGetDataCallback<Boolean> iGetDataCallback);

    void loadAttribution();

    void loadAvatarImage(Context context, ImageView imageView, String str, String str2, LoadParams loadParams);

    void loadEncryptImage(Context context, ImageView imageView, String str, LoadParams loadParams);

    IFCMModule loadFCMFromLocal();

    void loadLocalOrUrlImage(Context context, ImageView imageView, String str, LoadParams loadParams);

    void loadPlugin(String str);

    void loadTabConfig(boolean z, String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

    Fragment newContactMobileFragment(ContactMobileApi.ContactType contactType, ContactMobileApi.C35402a aVar, String str);

    void noticeClientEvent(boolean z);

    void noticeFirstScreenEvent(String str);

    void notifyBootMileStoneFirstContentDraw(String str);

    void notifyBootMileStoneFirstDataLoaded(String str);

    void notifyBootMileStoneFirstFrameDraw(String str);

    void notifyMainTabFragmentContentDraw(String str);

    void notifySettingModulehandleLoginStatusChangedEvent(boolean z);

    double[] obtainGCJLatLng(double d, double d2);

    void onAFConversionDataFail(String str);

    void onAFConversionDataSuccess(Map<String, Object> map);

    void onAppTerminate();

    void onGotDeviceID(String str);

    void onLocaleChange();

    void onUpdateDeviceEvent();

    void openAboutPage(Context context);

    void openAppLinkUrl(Context context, String str);

    void openChat(Activity activity, String str);

    void openChatInternalSearchPage(Context context, String str, boolean z, boolean z2);

    void openChatInternalSearchPage(Context context, String str, boolean z, boolean z2, int i);

    boolean openCustomUrl(Context context, String str);

    void openFeedMessageFilterSettingPage(Context context, int i);

    void openFeedMessageFilterSortPage(Context context, int i);

    void openGetPhotoMenu(Fragment fragment, Activity activity, ImageView imageView, int i, String str);

    void openInternal(Context context, String str, int i);

    void openInvitationUnionPage(Context context, String str);

    void openInviteExternalPage(Context context, String str, boolean z);

    void openInviteMemberGuidePage(Context context, String str, Bundle bundle);

    void openInviteMemberPageSmart(Context context, String str);

    void openInviteParentChannel(Context context, String str, String str2, InvitationSource invitationSource);

    void openLKPUrl(Context context, String str, int i);

    void openLanguageSettingPage(Context context, Bundle bundle);

    void openLocalFileDetail(Context context, FileContent fileContent, boolean z);

    void openMinePage(Context context);

    void openPickChatFilterPageFromDoc(Activity activity, ArrayList<String> arrayList, String str, int i);

    void openPickChatterFilterPageFromDoc(Activity activity, ArrayList<String> arrayList, String str, int i);

    boolean openPrivacyPolicy(Context context);

    void openSearchMainPageFromAllPin(Activity activity);

    void openSearchMainPageFromAppCenter(Context context, String str, String str2, int i);

    void openSearchMainPageFromCalendar(Context context, String str, String str2, int i);

    void openSearchMainPageFromFeed(Context context, String str, String str2, int i);

    void openSearchMainPageFromLynxCard(Context context, String str, String str2, int i);

    void openSearchMainPageFromMsgMenu(Context context, String str, String str2, int i);

    void openSearchMainPageFromPin(Activity activity, String str, String str2, int i);

    void openSearchMainPageFromSpace(Context context, String str, String str2, int i);

    void openSearchMainPageFromThread(Context context, String str, String str2, int i);

    void openSearchMainPageFromTodo(Context context, String str, String str2, int i);

    void openSearchMainPageFromWiki(Context context, String str, String str2, int i);

    void openSettingTeamName(Context context, String str, String str2);

    void openUgDebugPage(Context context);

    void openUpgradeTeamPage(Activity activity, String str, String str2);

    void openUrl(Context context, UrlParams urlParams);

    void openUrl(Context context, String str);

    void openUrl(Context context, String str, UrlParams urlParams);

    void openUrl(Context context, String str, UrlParams urlParams, Map<String, String> map);

    void openUrl(Context context, String str, UrlParams urlParams, Map<String, String> map, Map<String, String> map2);

    boolean openUserProtocol(Context context);

    void openVcWelcomeGuide(Bitmap bitmap);

    void openWelcomeToLarkPage(Context context, String str, Bundle bundle);

    void parseQRCode(String str, Activity activity);

    boolean parseQRCode(Context context, String str);

    void perfBoostBeginSection(String str);

    void perfBoostEndSection();

    void preLoadImageModule();

    void preLoadSettingV1FromLocal();

    void preloadDynamicConfig();

    void preloadUserSetting();

    void previewChatterAvatar(Context context, String str, String str2, View view);

    void previewGroupAvatar(Context context, String str, String str2, String str3, View view);

    void previewMomentsProfileBackground(Context context, String str, String str2, View view, String str3, String str4);

    void previewTopicGroupAvatar(Context context, String str, String str2, ImageView imageView);

    IMineController provideMineController();

    AbstractC29533a provideQRCodeScannerFactory();

    void pullDingAddressBookInfo(IGetDataCallback<List<String>> iGetDataCallback);

    void pullInviteActivityBanner(IGetDataCallback<InvitationServiceApi.InviteActivityBannerResult> iGetDataCallback);

    void pullInvitePermission4Banner(IGetDataCallback<InvitationServiceApi.InvitePermissionResult> iGetDataCallback);

    void pullTenantsBadge(IGetDataCallback iGetDataCallback);

    void pushNotice(Notice notice);

    void putBannerCloseStatus(String str);

    <V> void putKeyToBoostTracerMap(String str, V v);

    void putSearchFeedBack(String str, com.ss.android.lark.searchcommon.dto.Scene scene, List<C53892a> list, IGetDataCallback<Void> iGetDataCallback);

    void registerAccountBadgePush(IPushAccountBadgeListener aeVar);

    void registerAddFriendPush(IPushAddFriendListener afVar);

    void registerAppConfigCacheCallback(AbstractC29560g gVar);

    void registerAppConfigListener(IGetDataCallback<AppConfig> iGetDataCallback);

    void registerBadgeStyleObserver(AbstractC29562i iVar);

    void registerBootMileStoneListener(AbstractC44544a aVar);

    void registerComponentCallbacks(ComponentCallbacks2 componentCallbacks2);

    void registerDrawerListener(IMainDrawerListener xVar);

    void registerFileDownloadStateChangeListener(AbstractC29572q.AbstractC29573a aVar);

    void registerLanguageChangeListener(AbstractC29540ab abVar);

    void registerMagicLifecycle(String str, IMagicLifecycleListener bVar);

    void registerNavMuteBadgeObserver(AbstractC29589z zVar);

    void registerNetworkLevelListener(NetworkLevelListener networkLevelListener);

    void registerNetworkQualityListener(av avVar);

    void registerNetworkStateListener(AbstractC29572q.AbstractC29574b bVar);

    <T extends Notice, R extends C48499a> void registerNotification(int i, AbstractNotification<T, R> abstractNotification);

    void registerOnlinePush(Context context);

    void registerRustNetLevelPushOnly(Context context);

    void registerScenario(String str, Map<String, String> map, MagicViewContainer awVar, AbstractC29588w wVar);

    void registerSessionSyncedListener(AbstractC29552a aVar);

    void registerStoreStateListener(an anVar);

    void registerTenantInfoListener(AbstractC49405t tVar);

    void registerThirdShare();

    void registerTimeFormatSettingObserver(ao aoVar);

    void registerUpgradeListener(az azVar);

    void registerWatermarkInfoChangedListener(AbstractC29559a aVar);

    void registerWebLifecycleListener(aq aqVar);

    void registerZenSettingUpdateObserver(ar arVar);

    void reloadGuideIfNeed();

    void removeActivityFloatWindow(View view, AppCompatActivity appCompatActivity);

    void removeActivityObserver(C29538a aVar);

    void removeAppFloatView(View view);

    void removeAppLifecycleObserver(AbstractC29586u uVar);

    void removeBackToFrontEventListener(AbstractC29561h hVar);

    void removeConnStateListener(WSConnState.AbstractC29537a aVar);

    void removeCustomViewAppFloat(String str);

    void removeDownloadTask(String str, String str2);

    void removeFrontToBackEventListener(AbstractC29585t tVar);

    void removeGuidesIfNeeded(List<String> list);

    void removeLifeCycleObserver(AbstractC29586u uVar);

    void removeLifecycleObserver(AbstractC29586u uVar);

    void removeLocaleSelectListener(AbstractC49339b bVar);

    void removePushContactStateListener(AbstractC29543ag agVar);

    void removePushFileUploadListener(AbstractC29544ah ahVar);

    void removePushResourceDownloadProgressListener(AbstractC29579a aVar);

    void removePushResourceListener(AbstractC29580b bVar);

    void removePushResourceUploadProgressListener(AbstractC29581c cVar);

    void removeSettingsUpdateListener(ISettingsUpdateListener amVar);

    void report(String str, Map<String, Float> map, Map<String, String> map2, Map<String, String> map3, boolean z);

    void resetItemsSelectedStatus();

    void resetWaterMark();

    void saveLanguageSetting(Locale locale);

    void saveOrientation(int i, int i2);

    void searchDocForChat(String str, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback);

    void searchHelpDesks(String str, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback);

    void searchPinMessages(String str, String str2, long j, String str3, int i, IGetDataCallback<SearchResponse> iGetDataCallback);

    void searchUser(String str, String str2, boolean z, boolean z2, int i, int i2, boolean z3, List<ActionType> list, IGetDataCallback<SearchResponse> iGetDataCallback);

    void selectTargetsForForwardingMailToChat(Context context, int i, Bundle bundle, int i2, String str, String str2);

    void sendCalendarSettingClick();

    void sendFriendRequest(String str, String str2, String str3, String str4, String str5, ContactSource contactSource, IGetDataCallback<Boolean> iGetDataCallback);

    void sendInitGear();

    void sendLanguageSetting();

    void sendLinkClickEvent(String str, String str2);

    void sendMessage(String str, String str2, Map<String, String> map, IGetDataCallback<String> iGetDataCallback);

    void sendNotificationShowEvent(String str, String str2, long j, String str3, String str4);

    void sendTranslateRequest(String str, String str2, String[] strArr, ContentType contentType, IGetDataCallback<List<String>> iGetDataCallback);

    void setContainedChatters(List<String> list);

    void setContentStandAloneCallback(ContentStateChangeCallback dVar);

    Context setContextLocale(Context context, Locale locale);

    void setEnv(int i, String str, IGetDataCallback<Boolean> iGetDataCallback);

    void setGetFeedCardsV2End(long j);

    void setGetFeedCardsV2Start(long j);

    void setHideLoadingStart(long j);

    void setInAppBadgeCount(int i);

    void setIsDingAddressBookOn(boolean z);

    void setLauncherBadgeCount(Context context, int i);

    void setMiuiLauncherBadgeCount(Notification notification, int i);

    void setMonitorInited(boolean z);

    void setOrganizationListener(AbstractC29541ac acVar);

    void setPageChangeListener(Fragment fragment, IMineController.OnGotoOtherPageListener aVar);

    void setSelectedChatters(List<String> list);

    void setTargetDepartmentId(String str, String str2);

    void setTriggerLoginInfoChangedEnd(long j);

    void setWebViewTag(WebView webView, String str);

    void setupBadge(LKUIBadgeView lKUIBadgeView, int i, boolean z);

    void setupBlockUser(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    void setupNotificationListener();

    boolean shouldUseTTWebView();

    void showApplyCollabDialog(Context context, IInitBuilder<IInitBuilder.IApplyCollabDialogBuilder> aVar);

    void showBlockTipDialog(Context context, IInitBuilder<IInitBuilder.IBlockTipBuilder> aVar);

    void showChatInputTip(View view, int i);

    void showClickAvatarTip(View view, Activity activity, String str, String str2, View.OnClickListener onClickListener);

    void showCreateNewCalendarTipIfNeed(Activity activity, View view, View.OnClickListener onClickListener);

    void showGuideIfNeed(AbstractC44546c cVar);

    void showTenantPickTip(View view, Rect rect, String str, String str2, View.OnClickListener onClickListener);

    void showUpgradeToBigTeamUserTip(View view);

    void shutDownOtherProcessOnSimpleMode(Context context);

    void skipAuthorized();

    void start(String str, String str2);

    void startAppProfileByBotId(Context context, String str);

    void startChatImageResourceActivity(Context context, String str, boolean z);

    void startFlow();

    void startFromCardWithKeyChatWindow();

    void startFromCardWithKeyDoc();

    boolean startGuide(String str, C38708a aVar);

    boolean startGuides(List<String> list, C38708a aVar);

    void startMainActivity(Context context);

    void startNameCardProfile(Context context, String str, String str2, ContactSource contactSource);

    void startNotificationSetting(Context context, boolean z);

    void startPerfQuickSwitchUserMonitor(String str);

    void startPicker(Context context, FilePickerLaunchParams fVar, C36516a aVar, boolean z);

    void startPicker(FilePickerLaunchParams fVar);

    void startQrCodeScreenShot(Activity activity);

    void startReceivedFilesPicker(FilePickerLaunchParams fVar);

    void startScanQRCodeActivity(Activity activity);

    void startScanQRCodeActivity(Context context, int[] iArr, IQRCodeScanResultHandler iQRCodeScanResultHandler);

    void startScanQRCodeActivity(Context context, int[] iArr, IQRCodeScanResultHandler iQRCodeScanResultHandler, AbstractC29569m mVar);

    void startSelectMyGroupActivity(Context context, android.os.Message message);

    void startSelectedConfirm(Activity activity, List<SelectedData> list, int i);

    void startSelectedConfirm(Fragment fragment, List<SelectedData> list, int i);

    void startSpan(String str);

    void startSpan(String str, String str2);

    void startUserProfile(Context context, String str, String str2, ContactSource contactSource);

    void startWschannelService(Context context);

    void startWschannelServiceDelay(Context context, long j);

    void switchToOpenSearchTab(Activity activity, String str);

    void syncMainDomainSessionCookie();

    void syncMainDomainSessionCookie(boolean z, int i);

    String tenantDocDomain(String str);

    void traceNotificationShow(String str, String str2, long j, String str3, String str4);

    boolean tryLock(String str);

    void unInitGuideMgrModule();

    void unInitMainModule();

    void unInitRustTrackPushMonitor();

    void unRegisterAccountBadgePush(IPushAccountBadgeListener aeVar);

    void unRegisterAppConfigCacheCallback(AbstractC29560g gVar);

    void unRegisterBadgeStyleObserver(AbstractC29562i iVar);

    void unRegisterFileDownloadStateChangeListener(AbstractC29572q.AbstractC29573a aVar);

    void unRegisterLanguageChangeListener(AbstractC29540ab abVar);

    void unRegisterNavMuteBadgeObserver(AbstractC29589z zVar);

    void unRegisterNetworkLevelListener(NetworkLevelListener networkLevelListener);

    void unRegisterNetworkQualityListener(av avVar);

    void unRegisterNetworkStateListener(AbstractC29572q.AbstractC29574b bVar);

    void unRegisterStoreStateListener(an anVar);

    void unRegisterTenantInfoListener(AbstractC49405t tVar);

    void unRegisterTimeFormatSettingObserver(ao aoVar);

    void unRegisterUpgradeListener(az azVar);

    void unRegisterWatermarkInfoChangedListener(AbstractC29559a aVar);

    void unRegisterWebLifecycleListener(aq aqVar);

    void unRegisterZenSettingUpdateObserver(ar arVar);

    void unlock(String str);

    void unregisterAddFriendPush(IPushAddFriendListener afVar);

    void unregisterBootMileStoneListener(AbstractC44544a aVar);

    void unregisterComponentCallbacks(ComponentCallbacks2 componentCallbacks2);

    void unregisterDrawerListener(IMainDrawerListener xVar);

    void unregisterMagicLifecycle(String str);

    void unregisterScenario(String str);

    void updateAppBaseContext(Application application);

    Context updateContextForLanguage(Context context);

    void updateDynamicConfig();

    void updateInAppBadgeCount(Context context);

    void updateTimeFormatSetting(TimeFormatSetting timeFormatSetting);

    void uploadEncryptImage(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, IGetDataCallback<EncryptImageData> iGetDataCallback);

    Observable<EncryptImageData> uploadEncryptImageV2(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, Biz biz, Scene scene);

    void uploadGroupAvatar(String str, IGetDataCallback<String> iGetDataCallback);

    void uploadImage(String str, IGetDataCallback<Image> iGetDataCallback);

    void warmUpP0Process(Context context);
}
