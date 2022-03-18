package com.ss.android.lark.passport.infra.service;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.webkit.WebView;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.ss.android.lark.passport.infra.p2421a.AbstractC49004a;
import com.ss.android.lark.passport.infra.p2421a.AbstractC49005b;
import com.ss.android.lark.passport.signinsdk_api.AbstractC49340b;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49339b;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49354b;
import com.ss.android.lark.passport.signinsdk_api.base.network.IFetcher;
import com.ss.android.lark.passport.signinsdk_api.entity.CommonEnv;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49401o;
import com.ss.android.lark.passport.signinsdk_api.p2454b.AbstractC49341a;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49406a;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49410c;
import java.io.File;
import java.security.KeyStoreException;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.passport.infra.service.k */
public interface AbstractC49127k {
    void addFeedFirstLoadListener(AbstractC49004a aVar);

    void addLocaleSelectListener(AbstractC49339b bVar);

    void asyncMakeUserOffline(IGetDataCallback<Boolean> iGetDataCallback);

    void asyncMakeUserOnline(String str, String str2, String str3, String str4, IGetDataCallback<Boolean> iGetDataCallback);

    void checkNewOnBoardingStatus(IGetDataCallback<Bundle> iGetDataCallback);

    void checkUserProtocol(Activity activity, AbstractC49340b bVar);

    void cleanDataOnResign();

    void cleanIMLoginUser();

    void closeOfflinePush();

    void createStore(Context context, String str, String str2, String str3);

    byte[] decryptFile(File file) throws KeyStoreException;

    boolean encryptFile(File file);

    void exitH5Service();

    void featureGatingClear();

    void featureGatingInit();

    void featureGatingReload();

    String generateContextId();

    Drawable getAppIcon();

    int getAppId();

    String getApplogDomain();

    String getAppsFlyerUID();

    String getBuildPackageChannel(Context context);

    void getCaptchaToken(String str, String str2, String str3, String str4, AbstractC49352d<String> dVar);

    String getCaptchaTokenSync(String str, String str2, String str3, String str4);

    CommonEnv getCommonEnv();

    String getDisplayName(String str);

    int getEnvType();

    int getExistActivityNumber();

    AbstractC49354b getHttpExecutor();

    IFetcher getHttpFetcher();

    String getLanguageLocalTag(Locale locale);

    Locale getLanguageSetting();

    AbstractC25990b getLarkHttpClient();

    void getLastTopActivity(IGetDataCallback<Activity> iGetDataCallback);

    String getLoginTypeChannel();

    Map<String, String> getPassportExtraRegisterParams();

    String getPattern();

    String getPrivacyPolicyUrl();

    AbstractC49341a getPush();

    String getRequestId();

    String getServiceTermUrl();

    Activity getTopActivity();

    String getUserAgent();

    String getUserUnit();

    void initWaterMark();

    boolean isAppForeground();

    boolean isDefaultTab(String str);

    boolean isEnableGoogleSdk();

    boolean isFgEnable(String str);

    boolean isFollowSystemLanguage();

    boolean isLeanModeOn();

    boolean isNetWorkUnAvailable();

    boolean isOverSeaTenant();

    boolean isPrivateKABuildPackage();

    boolean isPrivateKaPkg();

    boolean isTTWebView();

    boolean isUsPackage();

    boolean isWsChannelProcess(Context context);

    void killAllLittleApps();

    void killVoIp(String str);

    void launchMainActivity(Context context);

    void launchMainWindow(Context context, User user, Bundle bundle);

    void loadAppConfig(IGetDataCallback<Boolean> iGetDataCallback);

    void loadSystemMessageTemplates(String str, boolean z);

    void loadTabConfigFromServer(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

    void onHostEnvClear();

    void onHostEnvClear(AbstractC49352d<String> dVar);

    void onLoginCallback(Context context, User user, Bundle bundle);

    void onLogoutStart();

    void onTenantSwitchLoadingShow(boolean z);

    void onTriggerLoginInfoChangedStart(boolean z);

    void openH5Url(Context context, Bundle bundle);

    void openLanguageSettingPage(Context context, Bundle bundle);

    void openMoneyH5Page(Context context, String str);

    void registerMineChangedListener(AbstractC49005b bVar);

    void registerNetworkChangeListener(Function1<Boolean, Unit> function1);

    void registerPlugin(H5PluginConfig h5PluginConfig);

    void removeFeedFirstLoadListener(AbstractC49004a aVar);

    void removeLocaleSelectListener(AbstractC49339b bVar);

    void resetEverything();

    void saveLanguageSetting(Locale locale);

    void setLoginUser(String str, IGetDataCallback<Unit> iGetDataCallback);

    void setWebViewRenderGoneListener(WebView webView, AbstractC49401o oVar);

    void startNewOnBoarding();

    void startScanQRCodeActivity(Context context, int[] iArr, AbstractC49410c cVar, AbstractC49406a aVar);

    void unRegisterMineChangedListener(AbstractC49005b bVar);

    void unregisterNetworkChangeListener(Function1<Boolean, Unit> function1);

    void updateLoginUsers(LoginInfo loginInfo);

    void updateTimeZone(String str);
}
