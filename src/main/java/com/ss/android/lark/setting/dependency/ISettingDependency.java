package com.ss.android.lark.setting.dependency;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.page.content.common.dto.MineDeviceSetting;
import com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a;
import com.ss.android.lark.setting.page.content.logout.NewLogoutComponent;
import com.ss.android.lark.setting.page.v1.AbstractC54553a;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b#\bf\u0018\u00002\u00020\u0001:\u0015^_`abcdefghijklmnopqrJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\"H&J\u0014\u0010#\u001a\u0004\u0018\u00010\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0005H&J\b\u0010%\u001a\u00020&H&J\b\u0010'\u001a\u00020(H&J\b\u0010)\u001a\u00020*H&J\b\u0010+\u001a\u00020,H&J\b\u0010-\u001a\u00020\u0005H&J\b\u0010.\u001a\u00020/H&J\b\u00100\u001a\u000201H&J\b\u00102\u001a\u000203H&J\u001a\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u000106052\b\u00107\u001a\u0004\u0018\u000108H&J\b\u00109\u001a\u00020:H&J\b\u0010;\u001a\u00020<H&J\b\u0010=\u001a\u00020>H&J\b\u0010?\u001a\u00020@H&J\u0010\u0010A\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010B\u001a\u00020\u0003H&J\b\u0010C\u001a\u00020\u0003H&J\b\u0010D\u001a\u00020\u0003H&J\b\u0010E\u001a\u00020\u0003H&J\b\u0010F\u001a\u00020\u0003H&J\b\u0010G\u001a\u00020\u0003H&J\b\u0010H\u001a\u00020\u0003H&J\b\u0010I\u001a\u00020\u0003H&J6\u0010J\u001a\u00020\u00102\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010N2\u0018\u0010O\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010PH&J,\u0010Q\u001a\u00020\u00102\b\u0010K\u001a\u0004\u0018\u00010L2\u0018\u0010O\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010PH&J\u0010\u0010R\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u0003H&J\b\u0010S\u001a\u00020\u0010H&J\u001c\u0010T\u001a\u00020\u00102\b\u0010U\u001a\u0004\u0018\u00010\u00182\b\u0010V\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010W\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H&J\u0012\u0010X\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H&J\u0016\u0010Y\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H&J\u0012\u0010Z\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H&J\u0012\u0010[\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H&J\u0012\u0010\\\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H&J\b\u0010]\u001a\u00020\u0010H&¨\u0006s"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency;", "", "checkToShowGuide", "", "key", "", "enableFeedMuteFilter", "geRustSdkLogSubPath", "getAiDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IAiDependency;", "getAppConfigDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IAppConfigDependency;", "getAutoTranslationFGKey", "getBrowserDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IBrowserDependency;", "getCanManualSize", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getChatDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IChatDependency;", "getContactDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IContactDependency;", "getContext", "Landroid/content/Context;", "getDeviceDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IDeviceDependency;", "getDingDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IDingDependency;", "getDocDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IDocDependency;", "getFeatureConfigDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IFeatureConfigDependency;", "getFeatureGatingDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IFeatureGatingDependency;", "getHelpRoomTipsUrl", "romType", "getLanguageDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ILanguageDependency;", "getLoginDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ILoginDependency;", "getMainDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IMainDependency;", "getMineDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IMineDependency;", "getMomentsName", "getNotificationDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$INotificationDependency;", "getObserverDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IObserverDependency;", "getPushDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IPushDependency;", "getRegisteredComponents", "", "Lcom/ss/android/lark/setting/export/IComponent;", "activity", "Landroid/app/Activity;", "getResourceDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IResourceDependency;", "getSimpleDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ISimpleDependency;", "getTranslateDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ITranslateDependency;", "getUpgradeDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IUpgradeDependency;", "isFeatureEnable", "isLogin", "isMailEnable", "isMomentsSettingEnable", "isOverSeaTenant", "isSmartComposeFgEnabled", "isSmartReplyFgEnabled", "isTodoSettingEnable", "isVideoChatSettingEnable", "metricErrorLogger", "id", "Lcom/larksuite/component/metriclogger/consts/domains/MetricId;", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "params", "", "metricLogger", "onLoginStatusChangedEvent", "resetFeedCache", "startAccountAndSecurity", "context", "pageName", "startCalendarSettingPage", "startEmailSettingPage", "startManualClean", "startMomentsSettingPage", "startTodoSettingPage", "startVideoChatSettingPage", "updateAppConfig", "IAiDependency", "IAppConfigDependency", "IBrowserDependency", "IChatDependency", "IContactDependency", "IDeviceDependency", "IDingDependency", "IDocDependency", "IFeatureConfigDependency", "IFeatureGatingDependency", "ILanguageDependency", "ILoginDependency", "IMainDependency", "IMineDependency", "INotificationDependency", "IObserverDependency", "IPushDependency", "IResourceDependency", "ISimpleDependency", "ITranslateDependency", "IUpgradeDependency", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.a.a */
public interface ISettingDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IAiDependency;", "", "isSmartCorrectionFgEnabled", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$a */
    public interface IAiDependency {
        /* renamed from: a */
        boolean mo178315a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u000bH&J*\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IAppConfigDependency;", "", "getUniversalUserSettingConfig", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "key", "", "pullAppConfig", "", "server", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "updateUniversalUserSettingConfig", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$b */
    public interface IAppConfigDependency {
        /* renamed from: a */
        UniversalUserSetting mo178316a(String str);

        /* renamed from: a */
        void mo178317a(String str, long j, IGetDataCallback<UniversalUserSetting> iGetDataCallback);

        /* renamed from: a */
        void mo178318a(boolean z, IGetDataCallback<Boolean> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IBrowserDependency;", "", "openUrl", "", "context", "Landroid/content/Context;", "url", "", "inLKPAppBrowser", "", "warmUpP0Process", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$c */
    public interface IBrowserDependency {
        /* renamed from: a */
        void mo178320a(Context context);

        /* renamed from: a */
        void mo178321a(Context context, String str, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IChatDependency;", "", "getLoginChatter", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "resetCache", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$d */
    public interface IChatDependency {
        /* renamed from: a */
        void mo178322a();

        /* renamed from: a */
        void mo178323a(IGetDataCallback<Chatter> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IContactDependency;", "", "startPrivacySetting", "", "context", "Landroid/content/Context;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$e */
    public interface IContactDependency {
        /* renamed from: a */
        void mo178324a(Context context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J.\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IDeviceDependency;", "", "getDeviceId", "", "putDeviceSetting", "", "deviceId", "localeIdentifier", "dataCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/common/dto/MineDeviceSetting;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$f */
    public interface IDeviceDependency {
        /* renamed from: a */
        String mo178325a();

        /* renamed from: a */
        void mo178326a(String str, String str2, IGetDataCallback<MineDeviceSetting> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IDingDependency;", "", "addAddressBookInfo", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "removeAddressBookInfo", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$g */
    public interface IDingDependency {
        /* renamed from: a */
        void mo178328a();

        /* renamed from: a */
        void mo178329a(IGetDataCallback<?> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IDocDependency;", "", "clearDocCache", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getDocCacheSize", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$h */
    public interface IDocDependency {
        /* renamed from: a */
        void mo178330a(IGetDataCallback<Long> iGetDataCallback);

        /* renamed from: b */
        void mo178331b(IGetDataCallback<Boolean> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IFeatureConfigDependency;", "", "isSpeechRecognitionEnable", "", "isTranslateEnable", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$i */
    public interface IFeatureConfigDependency {
        /* renamed from: a */
        boolean mo178334a();

        /* renamed from: b */
        boolean mo178335b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IFeatureGatingDependency;", "", "isEnable", "", "featureName", "", "isFeatureJapanLanguageEnable", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$j */
    public interface IFeatureGatingDependency {
        /* renamed from: a */
        boolean mo178336a();

        /* renamed from: a */
        boolean mo178337a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0010H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u000bH&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u0013\u001a\u00020\u0007H&J\b\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0007H&J\u001c\u0010\u0018\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00192\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u001a\u001a\u00020\u0007H&J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$ILanguageDependency;", "", "addLocalChangedObserver", "", "observer", "Lcom/ss/android/lark/setting/page/content/common/listener/ILocaleChangeObserver;", "changeAppLanguage", "", "context", "Landroid/app/Application;", "locale", "Ljava/util/Locale;", "getLanguageLocalTag", "", "getLanguageSetting", "getSupportedLanguageSetting", "", "getSystemLanguageSetting", "getSystemLanguageSettingImpl", "isEn", "isEnableLanguageBeforeLogin", "isFollowSystemLanguage", "isGooglePlay", "isJp", "isSameWithSetting", "Landroid/content/Context;", "isZh", "removeLocalChangedObserver", "saveLanguageSetting", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$k */
    public interface ILanguageDependency {
        /* renamed from: a */
        String mo178338a(Locale locale);

        /* renamed from: a */
        Locale mo178339a();

        /* renamed from: a */
        boolean mo178340a(Application application, Locale locale);

        /* renamed from: a */
        boolean mo178341a(Context context, Locale locale);

        /* renamed from: b */
        void mo178342b(Locale locale);

        /* renamed from: b */
        boolean mo178343b();

        /* renamed from: c */
        boolean mo178344c();

        /* renamed from: d */
        boolean mo178345d();

        /* renamed from: e */
        Locale mo178346e();

        /* renamed from: f */
        List<Locale> mo178347f();

        /* renamed from: g */
        Locale mo178348g();

        /* renamed from: h */
        boolean mo178349h();

        /* renamed from: i */
        boolean mo178350i();

        /* renamed from: j */
        boolean mo178351j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0004H&J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\b\u0010\u000f\u001a\u00020\u000eH&J\u0016\u0010\u0010\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00110\rH&J\u001e\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00130\rH&J\u001e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00110\rH&J&\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH&¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$ILoginDependency;", "", "getAllValidUserList", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "getForegroundTenant", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo;", "getForegroundUser", "interceptAccount", "", "context", "Landroid/content/Context;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "isPrimaryHost", "logoutAllUsers", "Lcom/ss/android/lark/setting/page/content/logout/NewLogoutComponent$SettingLogoutEndContext;", "logoutAndLogin", "", "logoutUser", "userId", "switchToNextValidUser", "switchReason", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$l */
    public interface ILoginDependency {
        /* renamed from: a */
        void mo178352a(Context context, int i, IGetDataCallback<User> iGetDataCallback);

        /* renamed from: a */
        void mo178353a(Context context, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo178354a(IGetDataCallback<NewLogoutComponent.SettingLogoutEndContext> iGetDataCallback);

        /* renamed from: a */
        void mo178355a(String str, IGetDataCallback<NewLogoutComponent.SettingLogoutEndContext> iGetDataCallback);

        /* renamed from: a */
        boolean mo178356a();

        /* renamed from: b */
        List<User> mo178357b();

        /* renamed from: b */
        void mo178358b(Context context, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        TenantInfo mo178359c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IMainDependency;", "", "getSingleLogoutRequestCode", "", "launchMainWindow", "", "context", "Landroid/content/Context;", "page", "", "bundle", "Landroid/os/Bundle;", "launchNewMainWindow", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$m */
    public interface IMainDependency {
        /* renamed from: a */
        int mo178362a();

        /* renamed from: a */
        void mo178363a(Context context);

        /* renamed from: a */
        void mo178364a(Context context, String str, Bundle bundle);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IMineDependency;", "", "startUserCustomStatusSettingPage", "", "context", "Landroid/content/Context;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$n */
    public interface IMineDependency {
        /* renamed from: a */
        void mo178365a(Context context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$INotificationDependency;", "", "hideNotificationSettingIfNecessary", "", "startNotificationSettingV2", "", "context", "Landroid/content/Context;", "highLight", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$o */
    public interface INotificationDependency {
        /* renamed from: a */
        void mo178366a(Context context, boolean z);

        /* renamed from: a */
        boolean mo178367a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IObserverDependency;", "", "addUpgradeObserver", "", "observer", "Lcom/ss/android/lark/setting/page/v1/IUpgradeObserver;", "removeUpgradeObserver", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$p */
    public interface IObserverDependency {
        /* renamed from: a */
        void mo178368a(AbstractC54553a aVar);

        /* renamed from: b */
        void mo178369b(AbstractC54553a aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IPushDependency;", "", "addListenerToPushTranslateSettingDispatcher", "", "listener", "Lcom/ss/android/lark/setting/page/content/common/listener/IPushTranslateSettingListener;", "removeListenerToPushTranslateSettingDispatcher", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$q */
    public interface IPushDependency {
        /* renamed from: a */
        void mo178370a(AbstractC54153a aVar);

        /* renamed from: b */
        void mo178371b(AbstractC54153a aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IResourceDependency;", "", "clearResources", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getResourcesSize", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$r */
    public interface IResourceDependency {
        /* renamed from: a */
        void mo178372a(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        void mo178373b(IGetDataCallback<Float> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$ISimpleDependency;", "", "isSimpleEntranceEnable", "", "switchOnSimpleMode", "", "activity", "Landroid/app/Activity;", "callback", "Lkotlin/Function1;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$s */
    public interface ISimpleDependency {
        /* renamed from: a */
        void mo178374a(Activity activity, Function1<? super Boolean, Unit> function1);

        /* renamed from: a */
        boolean mo178375a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\nH&J\"\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0007H&J(\u0010\u000e\u001a\u00020\u00052\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H&J \u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H&J8\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0018\u0010\u0016\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$ITranslateDependency;", "", "getLanguage", "Ljava/util/Locale;", "getTranslateLanguages", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/common/dto/MineTranslateLanguageSetting;", "isAutoTranslateEnableViaBilling", "", "setAutoTranslateScope", "globalScope", "", "setDisAutoTranslateLanguages", "languageKeyList", "", "", "setTargetTranslateLanguage", "languageKey", "setTranslateDisplayRule", "globalDisplayRule", "displayRuleMap", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$t */
    public interface ITranslateDependency {
        /* renamed from: a */
        Locale mo178376a();

        /* renamed from: a */
        void mo178377a(int i, Map<String, Integer> map, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo178378a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo178379a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/setting/dependency/ISettingDependency$IUpgradeDependency;", "", "cancelStrongNotice", "", "isHasNewVersion", "", "startAboutLark", "context", "Landroid/content/Context;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.a.a$u */
    public interface IUpgradeDependency {
        /* renamed from: a */
        void mo178383a(Context context);

        /* renamed from: a */
        boolean mo178384a();

        /* renamed from: b */
        void mo178385b();
    }

    /* renamed from: A */
    boolean mo178265A();

    /* renamed from: B */
    String mo178266B();

    /* renamed from: C */
    Context mo178267C();

    /* renamed from: D */
    boolean mo178268D();

    /* renamed from: E */
    boolean mo178269E();

    /* renamed from: F */
    String mo178270F();

    /* renamed from: G */
    void mo178271G();

    /* renamed from: H */
    void mo178272H();

    /* renamed from: I */
    boolean mo178273I();

    /* renamed from: a */
    IDocDependency mo178274a();

    /* renamed from: a */
    String mo178275a(String str);

    /* renamed from: a */
    List<AbstractC54125a> mo178276a(Activity activity);

    /* renamed from: a */
    void mo178277a(Context context, String str);

    /* renamed from: a */
    void mo178278a(C24341b bVar, ErrorResult errorResult, Map<String, ? extends Object> map);

    /* renamed from: a */
    void mo178279a(C24341b bVar, Map<String, ? extends Object> map);

    /* renamed from: a */
    void mo178280a(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo178281a(boolean z);

    /* renamed from: b */
    IResourceDependency mo178282b();

    /* renamed from: b */
    void mo178283b(Activity activity);

    /* renamed from: b */
    void mo178284b(IGetDataCallback<String> iGetDataCallback);

    /* renamed from: b */
    boolean mo178285b(String str);

    /* renamed from: c */
    IDeviceDependency mo178286c();

    /* renamed from: c */
    void mo178287c(Activity activity);

    /* renamed from: c */
    boolean mo178288c(String str);

    /* renamed from: d */
    ILanguageDependency mo178289d();

    /* renamed from: d */
    void mo178290d(Activity activity);

    /* renamed from: e */
    IFeatureGatingDependency mo178291e();

    /* renamed from: e */
    void mo178292e(Activity activity);

    /* renamed from: f */
    IChatDependency mo178293f();

    /* renamed from: f */
    void mo178294f(Activity activity);

    /* renamed from: g */
    IMainDependency mo178295g();

    /* renamed from: h */
    IFeatureConfigDependency mo178296h();

    /* renamed from: i */
    ITranslateDependency mo178297i();

    /* renamed from: j */
    IPushDependency mo178298j();

    /* renamed from: k */
    IBrowserDependency mo178299k();

    /* renamed from: l */
    IUpgradeDependency mo178300l();

    /* renamed from: m */
    INotificationDependency mo178301m();

    /* renamed from: n */
    ILoginDependency mo178302n();

    /* renamed from: o */
    IObserverDependency mo178303o();

    /* renamed from: p */
    IDingDependency mo178304p();

    /* renamed from: q */
    IAppConfigDependency mo178305q();

    /* renamed from: r */
    IContactDependency mo178306r();

    /* renamed from: s */
    ISimpleDependency mo178307s();

    /* renamed from: t */
    IAiDependency mo178308t();

    /* renamed from: u */
    IMineDependency mo178309u();

    /* renamed from: v */
    boolean mo178310v();

    /* renamed from: w */
    boolean mo178311w();

    /* renamed from: x */
    boolean mo178312x();

    /* renamed from: y */
    boolean mo178313y();

    /* renamed from: z */
    String mo178314z();
}
