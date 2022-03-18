package com.ss.android.lark.platform.settings;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.metriclogger.AbstractC24339c;
import com.larksuite.component.metriclogger.C24350k;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.az;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29582d;
import com.ss.android.lark.biz.im.api.AbstractC29628t;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.translate.TranslateLanguageSetting;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.dependency.AbstractC36119d;
import com.ss.android.lark.core.dependency.AbstractC36122g;
import com.ss.android.lark.core.dependency.AbstractC36123h;
import com.ss.android.lark.core.dependency.AbstractC36128n;
import com.ss.android.lark.core.dependency.AbstractC36132s;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.core.p1774k.C36187a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.language.C41115a;
import com.ss.android.lark.language.service.AbstractC41118a;
import com.ss.android.lark.larkconfig.p2098a.C41133c;
import com.ss.android.lark.larkconfig.p2102b.C41139d;
import com.ss.android.lark.larkconfig.userconfig.AbstractC41238h;
import com.ss.android.lark.larkconfig.userconfig.C41222c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceSetting;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor;
import com.ss.android.lark.platform.ab.C51659a;
import com.ss.android.lark.platform.ac.C51661a;
import com.ss.android.lark.platform.ae.C51677a;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.diskmanage.DiskManageProvider;
import com.ss.android.lark.platform.p2485f.C51804b;
import com.ss.android.lark.platform.p2496p.C51907a;
import com.ss.android.lark.platform.p2498r.C51947a;
import com.ss.android.lark.resource.C53138b;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.page.content.common.dto.MineDeviceSetting;
import com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a;
import com.ss.android.lark.setting.page.content.logout.NewLogoutComponent;
import com.ss.android.lark.setting.page.v1.AbstractC54553a;
import com.ss.android.lark.simple.C54866b;
import com.ss.android.lark.ug.p2874e.C57480a;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/platform/settings/SettingModuleProvider;", "", "()V", "Companion", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.w.a */
public class SettingModuleProvider {

    /* renamed from: a */
    public static final String f129176a = f129176a;

    /* renamed from: b */
    public static volatile C54115c f129177b;

    /* renamed from: c */
    public static final ConcurrentHashMap<C54115c, C28513a.AbstractC28515b> f129178c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final ConcurrentHashMap<C54115c, AbstractC49379a> f129179d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final ConcurrentHashMap<AbstractC54153a, AbstractC29628t> f129180e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static final ConcurrentHashMap<Object, AbstractC29540ab> f129181f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public static final ConcurrentHashMap<AbstractC54553a, az> f129182g = new ConcurrentHashMap<>();

    /* renamed from: h */
    public static final Companion f129183h = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010%\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0012\u0010&\u001a\u00020!2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/platform/settings/SettingModuleProvider$Companion;", "", "()V", "TAG", "", "accountChangeListenersMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/setting/SettingModule;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/OnUserSwitchListener;", "loginListenersMap", "Lcom/ss/android/lark/account_provider/integrator/LoginStatusContainer$ILoginStatusListenerOld;", "mLocalChangedListenerMap", "Lcom/ss/android/lark/setting/page/content/common/listener/ILocaleChangeObserver;", "Lcom/ss/android/lark/biz/core/api/IOnLanguageChangeListener;", "mPushTranslateSettingListenerMap", "Lcom/ss/android/lark/setting/page/content/common/listener/IPushTranslateSettingListener;", "Lcom/ss/android/lark/biz/im/api/IPushTranslateLanguageSettingListener;", "mUpgradeListenerMap", "Lcom/ss/android/lark/setting/page/v1/IUpgradeObserver;", "Lcom/ss/android/lark/biz/core/api/UpgradeListener;", "module", "getModule", "()Lcom/ss/android/lark/setting/SettingModule;", "sModule", "buileSettingLogoutEndContext", "Lcom/ss/android/lark/setting/page/content/logout/NewLogoutComponent$SettingLogoutEndContext;", "logoutEndContext", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "getDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency;", "context", "Landroid/content/Context;", "init", "", "registerAccountChangeListener", "registerLoginStatusChangedEventListener", "unRegisterAccountChangeListener", "unRegisterLoginStatusChangedEventListener", "uninit", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.w.a$a */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ù\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0014\u0010#\u001a\u0004\u0018\u00010\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000203H\u0016J\u001a\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u000106052\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010B\u001a\u00020\u0003H\u0016J\b\u0010C\u001a\u00020\u0003H\u0016J\b\u0010D\u001a\u00020\u0003H\u0016J\b\u0010E\u001a\u00020\u0003H\u0016J\b\u0010F\u001a\u00020\u0003H\u0016J\b\u0010G\u001a\u00020\u0003H\u0016J\b\u0010H\u001a\u00020\u0003H\u0016J\b\u0010I\u001a\u00020\u0003H\u0016J6\u0010J\u001a\u00020\u00102\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010N2\u0018\u0010O\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010Q\u0018\u00010PH\u0016J,\u0010R\u001a\u00020\u00102\b\u0010K\u001a\u0004\u0018\u00010L2\u0018\u0010O\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010Q\u0018\u00010PH\u0016J\u0010\u0010S\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u0003H\u0016J\b\u0010T\u001a\u00020\u0010H\u0016J\u001c\u0010U\u001a\u00020\u00102\b\u0010V\u001a\u0004\u0018\u00010\u00182\b\u0010W\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010X\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u0010Y\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0016\u0010Z\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016J\u0012\u0010[\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u0010\\\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u0010]\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010^\u001a\u00020\u0010H\u0016¨\u0006_"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency;", "checkToShowGuide", "", "key", "", "enableFeedMuteFilter", "geRustSdkLogSubPath", "getAiDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IAiDependency;", "getAppConfigDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IAppConfigDependency;", "getAutoTranslationFGKey", "getBrowserDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IBrowserDependency;", "getCanManualSize", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getChatDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IChatDependency;", "getContactDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IContactDependency;", "getContext", "Landroid/content/Context;", "getDeviceDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IDeviceDependency;", "getDingDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IDingDependency;", "getDocDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IDocDependency;", "getFeatureConfigDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IFeatureConfigDependency;", "getFeatureGatingDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IFeatureGatingDependency;", "getHelpRoomTipsUrl", "romType", "getLanguageDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ILanguageDependency;", "getLoginDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ILoginDependency;", "getMainDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IMainDependency;", "getMineDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IMineDependency;", "getMomentsName", "getNotificationDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$INotificationDependency;", "getObserverDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IObserverDependency;", "getPushDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IPushDependency;", "getRegisteredComponents", "", "Lcom/ss/android/lark/setting/export/IComponent;", "activity", "Landroid/app/Activity;", "getResourceDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IResourceDependency;", "getSimpleDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ISimpleDependency;", "getTranslateDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ITranslateDependency;", "getUpgradeDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IUpgradeDependency;", "isFeatureEnable", "isLogin", "isMailEnable", "isMomentsSettingEnable", "isOverSeaTenant", "isSmartComposeFgEnabled", "isSmartReplyFgEnabled", "isTodoSettingEnable", "isVideoChatSettingEnable", "metricErrorLogger", "id", "Lcom/larksuite/component/metriclogger/consts/domains/MetricId;", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "params", "", "", "metricLogger", "onLoginStatusChangedEvent", "resetFeedCache", "startAccountAndSecurity", "context", "pageName", "startCalendarSettingPage", "startEmailSettingPage", "startManualClean", "startMomentsSettingPage", "startTodoSettingPage", "startVideoChatSettingPage", "updateAppConfig", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.platform.w.a$a$a */
        public static final class C52017a implements ISettingDependency {

            /* renamed from: a */
            final /* synthetic */ Context f129184a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getAiDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IAiDependency;", "isSmartCorrectionFgEnabled", "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$a */
            public static final class C52018a implements ISettingDependency.IAiDependency {
                C52018a() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IAiDependency
                /* renamed from: a */
                public boolean mo178315a() {
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    AbstractC36122g iMDependency = a.getIMDependency();
                    Intrinsics.checkExpressionValueIsNotNull(iMDependency, "CoreModule.getDependency().imDependency");
                    return iMDependency.mo132797S();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u000bH\u0016J*\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getAppConfigDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IAppConfigDependency;", "getUniversalUserSettingConfig", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "key", "", "pullAppConfig", "", "server", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "updateUniversalUserSettingConfig", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$b */
            public static final class C52019b implements ISettingDependency.IAppConfigDependency {
                C52019b() {
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getAppConfigDependency$1$pullAppConfig$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/biz/core/api/AppConfig;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "appConfig", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$b$a */
                public static final class C52020a implements IGetDataCallback<AppConfig> {

                    /* renamed from: a */
                    final /* synthetic */ IGetDataCallback f129185a;

                    C52020a(IGetDataCallback iGetDataCallback) {
                        this.f129185a = iGetDataCallback;
                    }

                    /* renamed from: a */
                    public void onSuccess(AppConfig appConfig) {
                        Intrinsics.checkParameterIsNotNull(appConfig, "appConfig");
                        IGetDataCallback iGetDataCallback = this.f129185a;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(true);
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        IGetDataCallback iGetDataCallback = this.f129185a;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(false);
                        }
                    }
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IAppConfigDependency
                /* renamed from: a */
                public UniversalUserSetting mo178316a(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "key");
                    C41139d a = C51659a.m200385a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "UniversalUserSettingModuleProvider.getModule()");
                    return a.mo148385a().mo148377a(str);
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IAppConfigDependency
                /* renamed from: a */
                public void mo178318a(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
                    C41133c a = C51804b.m200825a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "ConfigModuleProvider.getModule()");
                    a.mo148365b().mo148370a(z, new C52020a(iGetDataCallback));
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IAppConfigDependency
                /* renamed from: a */
                public void mo178317a(String str, long j, IGetDataCallback<UniversalUserSetting> iGetDataCallback) {
                    Intrinsics.checkParameterIsNotNull(str, "key");
                    C41139d a = C51659a.m200385a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "UniversalUserSettingModuleProvider.getModule()");
                    a.mo148385a().mo148379a(str, j, iGetDataCallback);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getBrowserDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IBrowserDependency;", "openUrl", "", "context", "Landroid/content/Context;", "url", "", "inLKPAppBrowser", "", "warmUpP0Process", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$c */
            public static final class C52021c implements ISettingDependency.IBrowserDependency {
                C52021c() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IBrowserDependency
                /* renamed from: a */
                public void mo178320a(Context context) {
                    BrowserModuleProvider.m200667a().mo106840a(context);
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IBrowserDependency
                /* renamed from: a */
                public void mo178321a(Context context, String str, boolean z) {
                    if (!z) {
                        BrowserModuleProvider.m200667a().mo106842a(context, str);
                    } else {
                        BrowserModuleProvider.m200667a().mo106843a(context, str, 0);
                    }
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getChatDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IChatDependency;", "getLoginChatter", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "resetCache", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$d */
            public static final class C52022d implements ISettingDependency.IChatDependency {
                C52022d() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IChatDependency
                /* renamed from: a */
                public void mo178322a() {
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    a.getIMDependency().mo132965z();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IChatDependency
                /* renamed from: a */
                public void mo178323a(IGetDataCallback<Chatter> iGetDataCallback) {
                    Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    a.getIMDependency().mo132878a(true, iGetDataCallback);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getContactDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IContactDependency;", "startPrivacySetting", "", "context", "Landroid/content/Context;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$e */
            public static final class C52023e implements ISettingDependency.IContactDependency {
                C52023e() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IContactDependency
                /* renamed from: a */
                public void mo178324a(Context context) {
                    Intrinsics.checkParameterIsNotNull(context, "context");
                    C35358a a = C36099a.m141515a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "ContactModuleProvider.getModule()");
                    a.mo130130b().mo130272c(context);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J.\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getDeviceDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IDeviceDependency;", "getDeviceId", "", "putDeviceSetting", "", "deviceId", "localeIdentifier", "dataCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/common/dto/MineDeviceSetting;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$f */
            public static final class C52024f implements ISettingDependency.IDeviceDependency {
                C52024f() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IDeviceDependency
                /* renamed from: a */
                public String mo178325a() {
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    AbstractC36128n passportDependency = a.getPassportDependency();
                    Intrinsics.checkExpressionValueIsNotNull(passportDependency, "CoreModule.getDependency().passportDependency");
                    String i = passportDependency.mo133090i();
                    Intrinsics.checkExpressionValueIsNotNull(i, "CoreModule.getDependency…ssportDependency.deviceId");
                    return i;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getDeviceDependency$1$putDeviceSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/entity/DeviceSetting;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "deviceSetting", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$f$a */
                public static final class C52025a implements IGetDataCallback<DeviceSetting> {

                    /* renamed from: a */
                    final /* synthetic */ IGetDataCallback f129186a;

                    C52025a(IGetDataCallback iGetDataCallback) {
                        this.f129186a = iGetDataCallback;
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
                        IGetDataCallback iGetDataCallback = this.f129186a;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(DeviceSetting deviceSetting) {
                        Intrinsics.checkParameterIsNotNull(deviceSetting, "deviceSetting");
                        MineDeviceSetting mineDeviceSetting = new MineDeviceSetting();
                        mineDeviceSetting.setLocaleIdentifier(deviceSetting.getLocaleIdentifier());
                        IGetDataCallback iGetDataCallback = this.f129186a;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(mineDeviceSetting);
                        }
                    }
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IDeviceDependency
                /* renamed from: a */
                public void mo178326a(String str, String str2, IGetDataCallback<MineDeviceSetting> iGetDataCallback) {
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    AbstractC36128n passportDependency = a.getPassportDependency();
                    Intrinsics.checkExpressionValueIsNotNull(passportDependency, "CoreModule.getDependency().passportDependency");
                    passportDependency.mo133097p().putDeviceSetting(str, str2, new C52025a(iGetDataCallback));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getDingDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IDingDependency;", "addAddressBookInfo", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "removeAddressBookInfo", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$g */
            public static final class C52026g implements ISettingDependency.IDingDependency {
                C52026g() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IDingDependency
                /* renamed from: a */
                public void mo178328a() {
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    a.getIMDependency().mo132955p();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IDingDependency
                /* renamed from: a */
                public void mo178329a(IGetDataCallback<?> iGetDataCallback) {
                    Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    a.getIMDependency().mo132835a(iGetDataCallback);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u0016J\u001a\u0010\u0007\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getDocDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IDocDependency;", "clearDocCache", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getDocCacheSize", "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$h */
            public static final class C52027h implements ISettingDependency.IDocDependency {
                C52027h() {
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$h$a */
                static final class RunnableC52028a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ IGetDataCallback f129187a;

                    RunnableC52028a(IGetDataCallback iGetDataCallback) {
                        this.f129187a = iGetDataCallback;
                    }

                    public final void run() {
                        AbstractC36119d a = C36083a.m141486a();
                        Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                        a.getCCMDependency().mo132714b(this.f129187a);
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$h$b */
                static final class RunnableC52029b implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ IGetDataCallback f129188a;

                    RunnableC52029b(IGetDataCallback iGetDataCallback) {
                        this.f129188a = iGetDataCallback;
                    }

                    public final void run() {
                        AbstractC36119d a = C36083a.m141486a();
                        Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                        a.getCCMDependency().mo132705a(this.f129188a);
                    }
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IDocDependency
                /* renamed from: a */
                public void mo178330a(IGetDataCallback<Long> iGetDataCallback) {
                    C57865c.m224576a(new RunnableC52029b(iGetDataCallback));
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IDocDependency
                /* renamed from: b */
                public void mo178331b(IGetDataCallback<Boolean> iGetDataCallback) {
                    C57865c.m224576a(new RunnableC52028a(iGetDataCallback));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getFeatureConfigDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IFeatureConfigDependency;", "isSpeechRecognitionEnable", "", "isTranslateEnable", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$i */
            public static final class C52030i implements ISettingDependency.IFeatureConfigDependency {
                C52030i() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IFeatureConfigDependency
                /* renamed from: a */
                public boolean mo178334a() {
                    return C37239a.m146648b().mo136951a("suite_translation");
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IFeatureConfigDependency
                /* renamed from: b */
                public boolean mo178335b() {
                    return C37239a.m146648b().mo136951a("suite_voice2text");
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getFeatureGatingDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IFeatureGatingDependency;", "isEnable", "", "featureName", "", "isFeatureJapanLanguageEnable", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$j */
            public static final class C52031j implements ISettingDependency.IFeatureGatingDependency {
                C52031j() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IFeatureGatingDependency
                /* renamed from: a */
                public boolean mo178336a() {
                    return C37239a.m146649c().mo136941a("japan_lang");
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IFeatureGatingDependency
                /* renamed from: a */
                public boolean mo178337a(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "featureName");
                    return C37239a.m146648b().mo136951a(str);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getMainDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IMainDependency;", "getSingleLogoutRequestCode", "", "launchMainWindow", "", "context", "Landroid/content/Context;", "page", "", "bundle", "Landroid/os/Bundle;", "launchNewMainWindow", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$m */
            public static final class C52038m implements ISettingDependency.IMainDependency {
                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IMainDependency
                /* renamed from: a */
                public int mo178362a() {
                    return 31417;
                }

                C52038m() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IMainDependency
                /* renamed from: a */
                public void mo178363a(Context context) {
                    C44134a a = C36149a.m142162a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "MainModuleProvider.getModule()");
                    a.mo157098b().mo105708c(context);
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IMainDependency
                /* renamed from: a */
                public void mo178364a(Context context, String str, Bundle bundle) {
                    C44134a a = C36149a.m142162a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "MainModuleProvider.getModule()");
                    a.mo157098b().mo105707b(context, str, bundle);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getMineDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IMineDependency;", "startUserCustomStatusSettingPage", "", "context", "Landroid/content/Context;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$n */
            public static final class C52039n implements ISettingDependency.IMineDependency {
                C52039n() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IMineDependency
                /* renamed from: a */
                public void mo178365a(Context context) {
                    Intrinsics.checkParameterIsNotNull(context, "context");
                    C36187a.m142438a().mo160272c(context);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getNotificationDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$INotificationDependency;", "hideNotificationSettingIfNecessary", "", "startNotificationSettingV2", "", "context", "Landroid/content/Context;", "highLight", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$o */
            public static final class C52040o implements ISettingDependency.INotificationDependency {
                C52040o() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.INotificationDependency
                /* renamed from: a */
                public boolean mo178367a() {
                    return C51907a.m201314a().mo169329j();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.INotificationDependency
                /* renamed from: a */
                public void mo178366a(Context context, boolean z) {
                    C51907a.m201314a().mo169319a(context, z);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getObserverDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IObserverDependency;", "addUpgradeObserver", "", "observer", "Lcom/ss/android/lark/setting/page/v1/IUpgradeObserver;", "removeUpgradeObserver", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$p */
            public static final class C52041p implements ISettingDependency.IObserverDependency {
                C52041p() {
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getObserverDependency$1$addUpgradeObserver$upgradeListener$1", "Lcom/ss/android/lark/biz/core/api/UpgradeListener;", "onNoticeLevelChange", "", "strong", "", "onNoticeNewVersion", "hasNewVersion", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$p$a */
                public static final class C52042a implements az {

                    /* renamed from: a */
                    final /* synthetic */ AbstractC54553a f129197a;

                    C52042a(AbstractC54553a aVar) {
                        this.f129197a = aVar;
                    }

                    @Override // com.ss.android.lark.biz.core.api.az
                    /* renamed from: a */
                    public void mo105622a(boolean z) {
                        this.f129197a.mo186421a(z);
                    }

                    @Override // com.ss.android.lark.biz.core.api.az
                    /* renamed from: b */
                    public void mo105623b(boolean z) {
                        this.f129197a.mo186422b(z);
                    }
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IObserverDependency
                /* renamed from: a */
                public void mo178368a(AbstractC54553a aVar) {
                    if (aVar != null) {
                        C52042a aVar2 = new C52042a(aVar);
                        SettingModuleProvider.f129182g.put(aVar, aVar2);
                        C51661a.m200388a().mo195604a(aVar2);
                    }
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IObserverDependency
                /* renamed from: b */
                public void mo178369b(AbstractC54553a aVar) {
                    az remove;
                    if (aVar != null && (remove = SettingModuleProvider.f129182g.remove(aVar)) != null) {
                        C51661a.m200388a().mo195607b(remove);
                    }
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getPushDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IPushDependency;", "addListenerToPushTranslateSettingDispatcher", "", "listener", "Lcom/ss/android/lark/setting/page/content/common/listener/IPushTranslateSettingListener;", "removeListenerToPushTranslateSettingDispatcher", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$q */
            public static final class C52043q implements ISettingDependency.IPushDependency {
                C52043q() {
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\fH\u0016J\u001c\u0010\r\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getPushDependency$1$addListenerToPushTranslateSettingDispatcher$pushTranslateLanguageSettingListener$1", "Lcom/ss/android/lark/biz/im/api/IPushTranslateLanguageSettingListener;", "onPushDisableAutoTranslateLanguages", "", "languageKeys", "", "", "onPushGlobalAutoTranslateScope", "globalAutoTranslateScope", "", "onPushSpecificAutoTranslateScopeChanged", "displaySetting", "", "onPushSpecificDisplayChanged", "onPushTranslateDisplayRules", "translateSetting", "Lcom/ss/android/lark/chat/entity/translate/TranslateLanguageSetting;", "onPushTranslateLanguageSetting", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$q$a */
                public static final class C52044a implements AbstractC29628t {

                    /* renamed from: a */
                    final /* synthetic */ AbstractC54153a f129198a;

                    C52044a(AbstractC54153a aVar) {
                        this.f129198a = aVar;
                    }

                    @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
                    /* renamed from: a */
                    public void mo106752a(int i) {
                        AbstractC54153a aVar = this.f129198a;
                        if (aVar != null) {
                            aVar.mo185338a(i);
                        }
                    }

                    @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
                    /* renamed from: a */
                    public void mo106754a(List<String> list) {
                        Intrinsics.checkParameterIsNotNull(list, "languageKeys");
                        AbstractC54153a aVar = this.f129198a;
                        if (aVar != null) {
                            aVar.mo185341a(list);
                        }
                    }

                    @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
                    /* renamed from: b */
                    public void mo106757b(Map<String, Integer> map) {
                        Intrinsics.checkParameterIsNotNull(map, "displaySetting");
                        AbstractC54153a aVar = this.f129198a;
                        if (aVar != null) {
                            aVar.mo185343b(map);
                        }
                    }

                    @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
                    /* renamed from: a */
                    public void mo106753a(TranslateLanguageSetting translateLanguageSetting) {
                        Intrinsics.checkParameterIsNotNull(translateLanguageSetting, "translateSetting");
                        AbstractC54153a aVar = this.f129198a;
                        if (aVar != null) {
                            aVar.mo185340a(C36187a.m142440a(translateLanguageSetting));
                        }
                    }

                    @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
                    /* renamed from: b */
                    public void mo106756b(TranslateLanguageSetting translateLanguageSetting) {
                        Intrinsics.checkParameterIsNotNull(translateLanguageSetting, "translateSetting");
                        AbstractC54153a aVar = this.f129198a;
                        if (aVar != null) {
                            aVar.mo185339a(translateLanguageSetting.getGlobalDisplayConfig(), translateLanguageSetting.getDisplayConfigMap());
                        }
                    }

                    @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
                    /* renamed from: a */
                    public void mo106755a(Map<String, Integer> map) {
                        Intrinsics.checkParameterIsNotNull(map, "displaySetting");
                        AbstractC54153a aVar = this.f129198a;
                        if (aVar != null) {
                            aVar.mo185342a(map);
                        }
                    }
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IPushDependency
                /* renamed from: a */
                public void mo178370a(AbstractC54153a aVar) {
                    C52044a aVar2 = new C52044a(aVar);
                    if (aVar != null) {
                        SettingModuleProvider.f129180e.put(aVar, aVar2);
                    }
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    a.getIMDependency().mo132849a(aVar2);
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IPushDependency
                /* renamed from: b */
                public void mo178371b(AbstractC54153a aVar) {
                    ConcurrentHashMap<AbstractC54153a, AbstractC29628t> concurrentHashMap = SettingModuleProvider.f129180e;
                    if (concurrentHashMap != null) {
                        AbstractC29628t tVar = (AbstractC29628t) C69121n.m265993j(concurrentHashMap).remove(aVar);
                        if (tVar != null) {
                            AbstractC36119d a = C36083a.m141486a();
                            Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                            a.getIMDependency().mo132897b(tVar);
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getSimpleDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ISimpleDependency;", "isSimpleEntranceEnable", "", "switchOnSimpleMode", "", "activity", "Landroid/app/Activity;", "callback", "Lkotlin/Function1;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$s */
            public static final class C52046s implements ISettingDependency.ISimpleDependency {
                C52046s() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ISimpleDependency
                /* renamed from: a */
                public boolean mo178375a() {
                    return C54866b.m212765a().mo187072a().mo187134a();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ISimpleDependency
                /* renamed from: a */
                public void mo178374a(Activity activity, Function1<? super Boolean, Unit> function1) {
                    Intrinsics.checkParameterIsNotNull(activity, "activity");
                    C54866b.m212765a().mo187074a(activity, 1, false, function1);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0017J\b\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0007H\u0016J(\u0010\u000e\u001a\u00020\u00052\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016J \u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016J8\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0018\u0010\u0016\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016¨\u0006\u0018"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getTranslateDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ITranslateDependency;", "getLanguage", "Ljava/util/Locale;", "getTranslateLanguages", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/common/dto/MineTranslateLanguageSetting;", "isAutoTranslateEnableViaBilling", "", "setAutoTranslateScope", "globalScope", "", "setDisAutoTranslateLanguages", "languageKeyList", "", "", "setTargetTranslateLanguage", "languageKey", "setTranslateDisplayRule", "globalDisplayRule", "displayRuleMap", "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$t */
            public static final class C52047t implements ISettingDependency.ITranslateDependency {
                C52047t() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ITranslateDependency
                /* renamed from: a */
                public Locale mo178376a() {
                    C41115a a = C36235a.m142710a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "LanguageModuleProvider.getModule()");
                    AbstractC29551a b = a.mo148281b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "LanguageModuleProvider.getModule().localeCache");
                    Locale a2 = b.mo105659a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "LanguageModuleProvider.g…che.cachedLanguageSetting");
                    return a2;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getTranslateDependency$1$setDisAutoTranslateLanguages$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$t$a */
                public static final class C52048a implements IGetDataCallback<Boolean> {

                    /* renamed from: a */
                    final /* synthetic */ IGetDataCallback f129200a;

                    C52048a(IGetDataCallback iGetDataCallback) {
                        this.f129200a = iGetDataCallback;
                    }

                    /* renamed from: a */
                    public void mo178380a(boolean z) {
                        this.f129200a.onSuccess(Boolean.valueOf(z));
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        this.f129200a.onError(errorResult);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public /* synthetic */ void onSuccess(Boolean bool) {
                        mo178380a(bool.booleanValue());
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getTranslateDependency$1$setTargetTranslateLanguage$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$t$b */
                public static final class C52049b implements IGetDataCallback<Boolean> {

                    /* renamed from: a */
                    final /* synthetic */ IGetDataCallback f129201a;

                    C52049b(IGetDataCallback iGetDataCallback) {
                        this.f129201a = iGetDataCallback;
                    }

                    /* renamed from: a */
                    public void mo178381a(boolean z) {
                        this.f129201a.onSuccess(Boolean.valueOf(z));
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
                        this.f129201a.onError(errorResult);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public /* synthetic */ void onSuccess(Boolean bool) {
                        mo178381a(bool.booleanValue());
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getTranslateDependency$1$setTranslateDisplayRule$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$t$c */
                public static final class C52050c implements IGetDataCallback<Boolean> {

                    /* renamed from: a */
                    final /* synthetic */ IGetDataCallback f129202a;

                    C52050c(IGetDataCallback iGetDataCallback) {
                        this.f129202a = iGetDataCallback;
                    }

                    /* renamed from: a */
                    public void mo178382a(boolean z) {
                        this.f129202a.onSuccess(Boolean.valueOf(z));
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        this.f129202a.onError(errorResult);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public /* synthetic */ void onSuccess(Boolean bool) {
                        mo178382a(bool.booleanValue());
                    }
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ITranslateDependency
                /* renamed from: a */
                public void mo178378a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                    Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    a.getIMDependency().mo132938g(str, new C52049b(iGetDataCallback));
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ITranslateDependency
                /* renamed from: a */
                public void mo178379a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
                    Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    a.getIMDependency().mo132913c(list, new C52048a(iGetDataCallback));
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ITranslateDependency
                /* renamed from: a */
                public void mo178377a(int i, Map<String, Integer> map, IGetDataCallback<Boolean> iGetDataCallback) {
                    Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    a.getIMDependency().mo132815a(i, map, new C52050c(iGetDataCallback));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getUpgradeDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IUpgradeDependency;", "cancelStrongNotice", "", "isHasNewVersion", "", "startAboutLark", "context", "Landroid/content/Context;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$u */
            public static final class C52051u implements ISettingDependency.IUpgradeDependency {
                C52051u() {
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IUpgradeDependency
                /* renamed from: b */
                public void mo178385b() {
                    C51661a.m200388a().mo195608c();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IUpgradeDependency
                /* renamed from: a */
                public boolean mo178384a() {
                    C57607a a = C51661a.m200388a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModuleProvider.getModule()");
                    return a.mo195610e();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IUpgradeDependency
                /* renamed from: a */
                public void mo178383a(Context context) {
                    C51661a.m200388a().mo195602a(context);
                }
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: C */
            public Context mo178267C() {
                return this.f129184a;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J\u001c\u0010\u001d\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u001f\u001a\u00020\fH\u0016J\u0012\u0010 \u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010!\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u0016\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getLanguageDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ILanguageDependency;", "languageSettingService", "Lcom/ss/android/lark/language/service/ILanguageSettingService;", "kotlin.jvm.PlatformType", "localeCache", "Lcom/ss/android/lark/biz/core/api/language/ILocaleCache;", "addLocalChangedObserver", "", "observer", "Lcom/ss/android/lark/setting/page/content/common/listener/ILocaleChangeObserver;", "changeAppLanguage", "", "context", "Landroid/app/Application;", "locale", "Ljava/util/Locale;", "getLanguageLocalTag", "", "getLanguageSetting", "getSupportedLanguageSetting", "", "getSystemLanguageSetting", "getSystemLanguageSettingImpl", "isEn", "isEnableLanguageBeforeLogin", "isFollowSystemLanguage", "isGooglePlay", "isJp", "isSameWithSetting", "Landroid/content/Context;", "isZh", "removeLocalChangedObserver", "saveLanguageSetting", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$k */
            public static final class C52032k implements ISettingDependency.ILanguageDependency {

                /* renamed from: a */
                private final AbstractC41118a f129189a;

                /* renamed from: b */
                private final AbstractC29551a f129190b;

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: j */
                public boolean mo178351j() {
                    return this.f129189a.mo148309l();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: a */
                public Locale mo178339a() {
                    AbstractC41118a aVar = this.f129189a;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "languageSettingService");
                    return aVar.mo148297b();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: b */
                public boolean mo178343b() {
                    AbstractC29551a aVar = this.f129190b;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "localeCache");
                    return aVar.mo105664e();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: c */
                public boolean mo178344c() {
                    AbstractC29551a aVar = this.f129190b;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "localeCache");
                    return aVar.mo105661b();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: d */
                public boolean mo178345d() {
                    AbstractC29551a aVar = this.f129190b;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "localeCache");
                    return aVar.mo105665f();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: e */
                public Locale mo178346e() {
                    AbstractC41118a aVar = this.f129189a;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "languageSettingService");
                    return aVar.mo148300c();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: f */
                public List<Locale> mo178347f() {
                    AbstractC41118a aVar = this.f129189a;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "languageSettingService");
                    return aVar.mo148302e();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: g */
                public Locale mo178348g() {
                    AbstractC41118a aVar = this.f129189a;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "languageSettingService");
                    return aVar.mo148286a();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: h */
                public boolean mo178349h() {
                    AbstractC41118a aVar = this.f129189a;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "languageSettingService");
                    return aVar.mo148305h();
                }

                C52032k() {
                    C41115a a = C36235a.m142710a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "LanguageModuleProvider.getModule()");
                    this.f129189a = a.mo148282c();
                    C41115a a2 = C36235a.m142710a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "LanguageModuleProvider.getModule()");
                    this.f129190b = a2.mo148281b();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: i */
                public boolean mo178350i() {
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    AbstractC36128n passportDependency = a.getPassportDependency();
                    Intrinsics.checkExpressionValueIsNotNull(passportDependency, "CoreModule.getDependency().passportDependency");
                    return passportDependency.mo133042A();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: a */
                public String mo178338a(Locale locale) {
                    return this.f129189a.mo148296b(locale);
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: b */
                public void mo178342b(Locale locale) {
                    this.f129189a.mo148291a(locale);
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: a */
                public boolean mo178340a(Application application, Locale locale) {
                    Intrinsics.checkParameterIsNotNull(application, "context");
                    C41115a a = C36235a.m142710a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "LanguageModuleProvider.getModule()");
                    a.mo148283d().mo105893a("change_locale_setting", application, locale);
                    return this.f129189a.mo148292a(application, locale);
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILanguageDependency
                /* renamed from: a */
                public boolean mo178341a(Context context, Locale locale) {
                    return this.f129189a.mo148293a(context, locale);
                }
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: a */
            public ISettingDependency.IDocDependency mo178274a() {
                return new C52027h();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: c */
            public ISettingDependency.IDeviceDependency mo178286c() {
                return new C52024f();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: d */
            public ISettingDependency.ILanguageDependency mo178289d() {
                return new C52032k();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: e */
            public ISettingDependency.IFeatureGatingDependency mo178291e() {
                return new C52031j();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: f */
            public ISettingDependency.IChatDependency mo178293f() {
                return new C52022d();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: g */
            public ISettingDependency.IMainDependency mo178295g() {
                return new C52038m();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: h */
            public ISettingDependency.IFeatureConfigDependency mo178296h() {
                return new C52030i();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: i */
            public ISettingDependency.ITranslateDependency mo178297i() {
                return new C52047t();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: j */
            public ISettingDependency.IPushDependency mo178298j() {
                return new C52043q();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: k */
            public ISettingDependency.IBrowserDependency mo178299k() {
                return new C52021c();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: l */
            public ISettingDependency.IUpgradeDependency mo178300l() {
                return new C52051u();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: m */
            public ISettingDependency.INotificationDependency mo178301m() {
                return new C52040o();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: n */
            public ISettingDependency.ILoginDependency mo178302n() {
                return new C52033l();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: o */
            public ISettingDependency.IObserverDependency mo178303o() {
                return new C52041p();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: p */
            public ISettingDependency.IDingDependency mo178304p() {
                return new C52026g();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: q */
            public ISettingDependency.IAppConfigDependency mo178305q() {
                return new C52019b();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: r */
            public ISettingDependency.IContactDependency mo178306r() {
                return new C52023e();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: s */
            public ISettingDependency.ISimpleDependency mo178307s() {
                return new C52046s();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: t */
            public ISettingDependency.IAiDependency mo178308t() {
                return new C52018a();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: u */
            public ISettingDependency.IMineDependency mo178309u() {
                return new C52039n();
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0016\u0010\u0013\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0016J\u001e\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H\u0016J\u001e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0016J&\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0016R\u0016\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getLoginDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ILoginDependency;", "mAccountManager", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IAccountManager;", "kotlin.jvm.PlatformType", "getAllValidUserList", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "getForegroundTenant", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo;", "getForegroundUser", "interceptAccount", "", "context", "Landroid/content/Context;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "isPrimaryHost", "logoutAllUsers", "Lcom/ss/android/lark/setting/page/content/logout/NewLogoutComponent$SettingLogoutEndContext;", "logoutAndLogin", "", "logoutUser", "userId", "switchToNextValidUser", "switchReason", "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$l */
            public static final class C52033l implements ISettingDependency.ILoginDependency {

                /* renamed from: a */
                private final AbstractC49389b f129191a;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onInterceptEnd"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$l$a */
                static final class C52034a implements IAccountInterceptor.AbstractC49386a {

                    /* renamed from: a */
                    final /* synthetic */ IGetDataCallback f129192a;

                    C52034a(IGetDataCallback iGetDataCallback) {
                        this.f129192a = iGetDataCallback;
                    }

                    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor.AbstractC49386a
                    /* renamed from: b */
                    public /* synthetic */ void mo133324b() {
                        IAccountInterceptor.AbstractC49386a.CC.$default$b(this);
                    }

                    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor.AbstractC49386a
                    /* renamed from: a */
                    public final void mo133323a() {
                        this.f129192a.onSuccess(true);
                    }
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILoginDependency
                /* renamed from: a */
                public boolean mo178356a() {
                    AbstractC49389b bVar = this.f129191a;
                    Intrinsics.checkExpressionValueIsNotNull(bVar, "mAccountManager");
                    return bVar.mo172430k();
                }

                C52033l() {
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    AbstractC36128n passportDependency = a.getPassportDependency();
                    Intrinsics.checkExpressionValueIsNotNull(passportDependency, "CoreModule.getDependency().passportDependency");
                    this.f129191a = passportDependency.mo133094m();
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILoginDependency
                /* renamed from: b */
                public List<User> mo178357b() {
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    AbstractC36128n passportDependency = a.getPassportDependency();
                    Intrinsics.checkExpressionValueIsNotNull(passportDependency, "CoreModule.getDependency().passportDependency");
                    List<User> E = passportDependency.mo133046E();
                    Intrinsics.checkExpressionValueIsNotNull(E, "CoreModule.getDependency…pendency.allValidUserList");
                    return E;
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILoginDependency
                /* renamed from: c */
                public TenantInfo mo178359c() {
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    AbstractC36128n passportDependency = a.getPassportDependency();
                    Intrinsics.checkExpressionValueIsNotNull(passportDependency, "CoreModule.getDependency().passportDependency");
                    return passportDependency.mo133048G();
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getLoginDependency$1$logoutAllUsers$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$l$b */
                public static final class C52035b implements IGetDataCallback<C49376b> {

                    /* renamed from: a */
                    final /* synthetic */ IGetDataCallback f129193a;

                    C52035b(IGetDataCallback iGetDataCallback) {
                        this.f129193a = iGetDataCallback;
                    }

                    /* renamed from: a */
                    public void onSuccess(C49376b bVar) {
                        IGetDataCallback iGetDataCallback;
                        if (bVar != null && (iGetDataCallback = this.f129193a) != null) {
                            iGetDataCallback.onSuccess(SettingModuleProvider.f129183h.mo178264a(bVar));
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        IGetDataCallback iGetDataCallback = this.f129193a;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getLoginDependency$1$logoutUser$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$l$d */
                public static final class C52037d implements IGetDataCallback<C49376b> {

                    /* renamed from: a */
                    final /* synthetic */ IGetDataCallback f129196a;

                    C52037d(IGetDataCallback iGetDataCallback) {
                        this.f129196a = iGetDataCallback;
                    }

                    /* renamed from: a */
                    public void onSuccess(C49376b bVar) {
                        IGetDataCallback iGetDataCallback;
                        if (bVar != null && (iGetDataCallback = this.f129196a) != null) {
                            iGetDataCallback.onSuccess(SettingModuleProvider.f129183h.mo178264a(bVar));
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        IGetDataCallback iGetDataCallback = this.f129196a;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "success", "", "onResult"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.platform.w.a$a$a$l$c */
                static final class C52036c implements AbstractC49338a {

                    /* renamed from: a */
                    final /* synthetic */ IGetDataCallback f129194a;

                    /* renamed from: b */
                    final /* synthetic */ Context f129195b;

                    C52036c(IGetDataCallback iGetDataCallback, Context context) {
                        this.f129194a = iGetDataCallback;
                        this.f129195b = context;
                    }

                    @Override // com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a
                    public final void onResult(boolean z) {
                        if (!z) {
                            Log.m165389i(SettingModuleProvider.f129176a, "logout error");
                            this.f129194a.onError(new ErrorResult(-1, ""));
                            return;
                        }
                        Log.m165389i(SettingModuleProvider.f129176a, "logout success");
                        SettingModuleProvider.f129183h.mo178262a(this.f129195b).mo178281a(false);
                        this.f129194a.onSuccess("");
                    }
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILoginDependency
                /* renamed from: a */
                public void mo178354a(IGetDataCallback<NewLogoutComponent.SettingLogoutEndContext> iGetDataCallback) {
                    Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    a.getPassportDependency().mo133063a(new C52035b(iGetDataCallback));
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILoginDependency
                /* renamed from: a */
                public void mo178353a(Context context, IGetDataCallback<String> iGetDataCallback) {
                    Intrinsics.checkParameterIsNotNull(context, "context");
                    Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    AbstractC36128n passportDependency = a.getPassportDependency();
                    Intrinsics.checkExpressionValueIsNotNull(passportDependency, "CoreModule.getDependency().passportDependency");
                    passportDependency.mo133100s().mo172412a(context, false, "User makes logout. Mine system setting logout", new C52036c(iGetDataCallback, context));
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILoginDependency
                /* renamed from: b */
                public void mo178358b(Context context, IGetDataCallback<Boolean> iGetDataCallback) {
                    Intrinsics.checkParameterIsNotNull(context, "context");
                    Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    AbstractC36128n passportDependency = a.getPassportDependency();
                    Intrinsics.checkExpressionValueIsNotNull(passportDependency, "CoreModule.getDependency().passportDependency");
                    passportDependency.mo133102u().mo171619a(context, new C52034a(iGetDataCallback));
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILoginDependency
                /* renamed from: a */
                public void mo178355a(String str, IGetDataCallback<NewLogoutComponent.SettingLogoutEndContext> iGetDataCallback) {
                    Intrinsics.checkParameterIsNotNull(str, "userId");
                    Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    a.getPassportDependency().mo133080b(str, new C52037d(iGetDataCallback));
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.ILoginDependency
                /* renamed from: a */
                public void mo178352a(Context context, int i, IGetDataCallback<User> iGetDataCallback) {
                    Intrinsics.checkParameterIsNotNull(context, "context");
                    Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    a.getPassportDependency().mo133073b(context, i, iGetDataCallback);
                }
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: A */
            public boolean mo178265A() {
                AbstractC36128n passportDependency = C36083a.m141486a().getPassportDependency();
                Intrinsics.checkExpressionValueIsNotNull(passportDependency, "CoreModule.getDependency().getPassportDependency()");
                return passportDependency.mo133089h();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: B */
            public String mo178266B() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                AbstractC36123h mailDependency = a.getMailDependency();
                Intrinsics.checkExpressionValueIsNotNull(mailDependency, "CoreModule.getDependency().mailDependency");
                String c = mailDependency.mo132975c();
                Intrinsics.checkExpressionValueIsNotNull(c, "CoreModule.getDependency…ency.autoTranslationFGKey");
                return c;
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: D */
            public boolean mo178268D() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                AbstractC36122g iMDependency = a.getIMDependency();
                Intrinsics.checkExpressionValueIsNotNull(iMDependency, "CoreModule.getDependency().imDependency");
                return iMDependency.mo132795Q();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: E */
            public boolean mo178269E() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                AbstractC36122g iMDependency = a.getIMDependency();
                Intrinsics.checkExpressionValueIsNotNull(iMDependency, "CoreModule.getDependency().imDependency");
                return iMDependency.mo132796R();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: F */
            public String mo178270F() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                return a.getEnvDependency().mo132695c();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: G */
            public void mo178271G() {
                C41222c a = C51677a.m200443a();
                Intrinsics.checkExpressionValueIsNotNull(a, "UserConfigModuleProvider.getModule()");
                a.mo148569c().mo148564e();
                C41222c a2 = C51677a.m200443a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "UserConfigModuleProvider.getModule()");
                a2.mo148569c().mo148560b();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: H */
            public void mo178272H() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                a.getIMDependency().mo132936g();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: I */
            public boolean mo178273I() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                return a.getIMDependency().mo132942h();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: b */
            public ISettingDependency.IResourceDependency mo178282b() {
                C53138b a = C51947a.m201491a();
                Intrinsics.checkExpressionValueIsNotNull(a, "ResourceModuleProvider.getModule()");
                return new C52045r(a.mo181472a());
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: v */
            public boolean mo178310v() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                AbstractC36132s videoConferenceDependency = a.getVideoConferenceDependency();
                Intrinsics.checkExpressionValueIsNotNull(videoConferenceDependency, "CoreModule.getDependency…videoConferenceDependency");
                return videoConferenceDependency.mo133148e();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: w */
            public boolean mo178311w() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                AbstractC36123h mailDependency = a.getMailDependency();
                Intrinsics.checkExpressionValueIsNotNull(mailDependency, "CoreModule.getDependency().mailDependency");
                return mailDependency.mo132973b();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: x */
            public boolean mo178312x() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                return a.getTodoDependency().mo133130c();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: y */
            public boolean mo178313y() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                return a.getMomentsDependency().mo132988a();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: z */
            public String mo178314z() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                return a.getMomentsDependency().mo132989b();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: a */
            public void mo178281a(boolean z) {
                C28513a.m104514a(z);
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u0016J\u001a\u0010\u0007\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/settings/SettingModuleProvider$Companion$getDependency$1$getResourceDependency$1", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IResourceDependency;", "clearResources", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getResourcesSize", "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.platform.w.a$a$a$r */
            public static final class C52045r implements ISettingDependency.IResourceDependency {

                /* renamed from: a */
                final /* synthetic */ AbstractC29582d f129199a;

                C52045r(AbstractC29582d dVar) {
                    this.f129199a = dVar;
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IResourceDependency
                /* renamed from: a */
                public void mo178372a(IGetDataCallback<String> iGetDataCallback) {
                    this.f129199a.mo105870a(iGetDataCallback);
                }

                @Override // com.ss.android.lark.setting.dependency.ISettingDependency.IResourceDependency
                /* renamed from: b */
                public void mo178373b(IGetDataCallback<Float> iGetDataCallback) {
                    this.f129199a.mo105880b(iGetDataCallback);
                }
            }

            C52017a(Context context) {
                this.f129184a = context;
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: b */
            public void mo178284b(IGetDataCallback<String> iGetDataCallback) {
                Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                DiskManageProvider.f128752a.mo177936a().mo177935b(iGetDataCallback);
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: c */
            public boolean mo178288c(String str) {
                Intrinsics.checkParameterIsNotNull(str, "key");
                return C37239a.m146648b().mo136951a(str);
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: c */
            public void mo178287c(Activity activity) {
                if (activity != null) {
                    AbstractC36119d a = C36083a.m141486a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                    a.getTodoDependency().mo133124a(activity);
                }
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: d */
            public void mo178290d(Activity activity) {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                a.getVideoConferenceDependency().mo133131a(activity);
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: e */
            public void mo178292e(Activity activity) {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                a.getMailDependency().mo132967a(activity);
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: f */
            public void mo178294f(Activity activity) {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                a.getMomentsDependency().mo132986a(activity);
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: a */
            public String mo178275a(String str) {
                C41222c a = C51677a.m200443a();
                Intrinsics.checkExpressionValueIsNotNull(a, "UserConfigModuleProvider.getModule()");
                AbstractC41238h c = a.mo148569c();
                Intrinsics.checkExpressionValueIsNotNull(c, "UserConfigModuleProvider…ule().appUserConfigModule");
                C29550b f = c.mo148565f();
                if (f == null || str == null) {
                    return null;
                }
                return f.mo105624a(str);
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: b */
            public void mo178283b(Activity activity) {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                a.getCalendarDependency().mo132732a(activity);
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: a */
            public List<AbstractC54125a> mo178276a(Activity activity) {
                ArrayList arrayList = new ArrayList();
                List<AbstractC54125a> b = C51661a.m200388a().mo195605b(activity);
                Intrinsics.checkExpressionValueIsNotNull(b, "UpgradeModuleProvider.ge…ttingComponents(activity)");
                arrayList.addAll(b);
                List<AbstractC54125a> a = C51907a.m201314a().mo169317a(activity);
                Intrinsics.checkExpressionValueIsNotNull(a, "NotificationModuleProvid…ttingComponents(activity)");
                arrayList.addAll(a);
                List<AbstractC54125a> a2 = C36099a.m141515a().mo130124a(activity);
                Intrinsics.checkExpressionValueIsNotNull(a2, "ContactModuleProvider.ge…ttingComponents(activity)");
                arrayList.addAll(a2);
                AbstractC36119d a3 = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "CoreModule.getDependency()");
                a3.getOpenFeatureDependency().mo132991a(activity, arrayList);
                return arrayList;
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: b */
            public boolean mo178285b(String str) {
                Intrinsics.checkParameterIsNotNull(str, "key");
                return C57480a.m223132a().mo141828e(str);
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: a */
            public void mo178280a(IGetDataCallback<Boolean> iGetDataCallback) {
                Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                DiskManageProvider.f128752a.mo177936a().mo177933a(iGetDataCallback);
                BrowserModuleProvider.m200667a().mo106861d();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: a */
            public void mo178277a(Context context, String str) {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                a.getPassportDependency().mo133059a(context, str);
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: a */
            public void mo178279a(C24341b bVar, Map<String, ? extends Object> map) {
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                AbstractC24339c a = C24350k.m88900a(bVar);
                if (map != null) {
                    for (String str : map.keySet()) {
                        a.mo87077a(str, map.get(str));
                    }
                }
                a.mo87079a();
            }

            @Override // com.ss.android.lark.setting.dependency.ISettingDependency
            /* renamed from: a */
            public void mo178278a(C24341b bVar, ErrorResult errorResult, Map<String, ? extends Object> map) {
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                AbstractC24339c a = C24350k.m88900a(bVar);
                if (map != null) {
                    for (String str : map.keySet()) {
                        a.mo87077a(str, map.get(str));
                    }
                }
                if (errorResult != null) {
                    a.mo87080b(errorResult.getErrorCode());
                    a.mo87076a(errorResult.getDisplayMsg());
                }
                a.mo87079a();
            }
        }

        private Companion() {
        }

        /* renamed from: a */
        public final C54115c mo178263a() {
            if (SettingModuleProvider.f129177b == null) {
                synchronized (SettingModuleProvider.class) {
                    if (SettingModuleProvider.f129177b == null) {
                        Companion aVar = SettingModuleProvider.f129183h;
                        Application application = LarkContext.getApplication();
                        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
                        SettingModuleProvider.f129177b = new C54115c(aVar.mo178262a(application));
                        SettingModuleProvider.f129183h.m201809a(SettingModuleProvider.f129177b);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            C54115c cVar = SettingModuleProvider.f129177b;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            return cVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isLogin", "", "onLoginStatusChanged"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.platform.w.a$a$c */
        public static final class C52053c implements C28513a.AbstractC28515b {

            /* renamed from: a */
            final /* synthetic */ C54115c f129204a;

            C52053c(C54115c cVar) {
                this.f129204a = cVar;
            }

            @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28515b
            public final void onLoginStatusChanged(boolean z) {
                this.f129204a.mo185209a(z);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ISettingDependency mo178262a(Context context) {
            return new C52017a(context);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "onUserSwitchSuccess"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.platform.w.a$a$b */
        public static final class C52052b implements AbstractC49379a {

            /* renamed from: a */
            final /* synthetic */ C54115c f129203a;

            C52052b(C54115c cVar) {
                this.f129203a = cVar;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public /* synthetic */ void mo102549a(C49380b bVar) {
                AbstractC49379a.CC.$default$a(this, bVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public /* synthetic */ void mo102550a(C49381c cVar) {
                AbstractC49379a.CC.$default$a(this, cVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            public final void onUserSwitchSuccess(C49382d dVar) {
                Intrinsics.checkParameterIsNotNull(dVar, "it");
                this.f129203a.mo185226l();
            }
        }

        /* renamed from: a */
        private final void m201809a(C54115c cVar) {
            if (cVar != null) {
                Companion aVar = this;
                aVar.m201810b(cVar);
                aVar.m201811c(cVar);
            }
        }

        /* renamed from: b */
        private final void m201810b(C54115c cVar) {
            C52053c cVar2 = new C52053c(cVar);
            SettingModuleProvider.f129178c.put(cVar, cVar2);
            C28513a.m104513a(cVar2);
        }

        /* renamed from: c */
        private final void m201811c(C54115c cVar) {
            C52052b bVar = new C52052b(cVar);
            SettingModuleProvider.f129179d.put(cVar, bVar);
            AbstractC36119d a = C36083a.m141486a();
            Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
            a.getPassportDependency().mo133064a(bVar);
        }

        /* renamed from: a */
        public final NewLogoutComponent.SettingLogoutEndContext mo178264a(C49376b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "logoutEndContext");
            return new NewLogoutComponent.SettingLogoutEndContext(bVar.f123924a);
        }
    }
}
