package com.ss.android.lark.mail_api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.preload.AbstractC52220a;
import com.ss.android.lark.setting.export.AbstractC54125a;
import java.util.Collection;
import java.util.Map;

public interface IMailApi {
    void afterAppOnCreate(Context context);

    void beforeAppOnCreate(Context context);

    boolean canOpen(String str);

    AbstractC44552i createTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController);

    Map<? extends String, ? extends AbstractC29186b> getAppLinkHandlers(Context context);

    Map<String, String> getAutoInitModuleConfigMap();

    String getAutoTranslationFGKey();

    IDiskCleanTask getDiskCleanTask();

    String getExternalMailtoKey();

    Intent getLaunchMailTransPageIntent(Intent intent, String str);

    AbstractC52220a getMailIdlePreloadActions();

    String getOpenMailFromNoticeKey();

    String getPackageName();

    AbstractC54125a getSettingComponent(Activity activity);

    Map<String, String> getThirdPartyModuleConfigMap();

    Map<String, String> getThirdPartyPrefixModuleConfigMap();

    void handleMailOfflinePushNotice(Intent intent, String str);

    void initMailModule(boolean z);

    void initProcessorDoInit(String str);

    boolean isGroupMailEnable();

    boolean isMailPushOptimizeFGOpen();

    boolean isMailSettingEnable();

    boolean isMailTabEnable();

    boolean isSupportMailTo();

    boolean open(Context context, String str, Map<String, String> map);

    void openEml(Context context, String str);

    boolean openMailFromNotify(Context context, Intent intent);

    void openMailToIntent(Context context, Intent intent);

    void preloadMainPageData(Context context);

    void preloadMainPageUIView(Context context);

    Collection<? extends AbstractNotification> provideNotificationImpls();

    void startEmailSettingPage(Activity activity);
}
