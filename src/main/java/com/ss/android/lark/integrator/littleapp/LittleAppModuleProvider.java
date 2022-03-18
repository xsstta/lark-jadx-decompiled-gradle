package com.ss.android.lark.integrator.littleapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebView;
import com.bytedance.ee.appstrategy.p240a.AbstractC4147e;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.OpenExternalMenu;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.integrator.dto.C7925a;
import com.bytedance.ee.lark.component.AbstractNativeComponent;
import com.bytedance.ee.lark.infra.cookie.p620e.C12763a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12784c;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13322k;
import com.bytedance.ee.webapp.render.demo.NativeMapComponent;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.appstrategy.service.AbstractC29242a;
import com.ss.android.lark.biz.core.api.FilePickerLaunchParams;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.au;
import com.ss.android.lark.biz.core.api.av;
import com.ss.android.lark.biz.im.api.AbstractC29622o;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider;
import com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider;
import com.ss.android.lark.integrator.littleapp.workerprovider.CommentWorkerProvider;
import com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.entity.ChatModel;
import com.ss.android.lark.littleapp.p2124b.AbstractC41301a;
import com.ss.android.lark.littleapp.service.ILittleAppService;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.dto.POIConfig;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.location.p2146b.AbstractC41567g;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.openplatform.openapp.BotOpenData;
import com.ss.android.lark.openplatform.openapp.ID_TYPE;
import com.ss.android.lark.openplatform.plus.C48850e;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49402q;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import com.tt.miniapp.launchaction.bean.MessageTriggerInfo;
import com.tt.refer.common.service.net.AbstractC67854b;
import com.tt.refer.common.service.net.entity.C67856a;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public class LittleAppModuleProvider {

    /* renamed from: a */
    public static volatile boolean f101338a;

    /* renamed from: b */
    public static IIMApi f101339b = ((IIMApi) ApiUtils.getApi(IIMApi.class));

    /* renamed from: c */
    public static ICoreApi f101340c = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: d */
    public static IPassportApi f101341d = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));

    /* renamed from: e */
    private static final Map<C41354g, AbstractC49379a> f101342e = new ConcurrentHashMap();

    /* renamed from: f */
    private static volatile C41354g f101343f;

    @ClaymoreImpl(AbstractC41301a.class)
    public static class LittleAppModuleDependencyImpl implements AbstractC41301a {
        Context context = LarkContext.getApplication();
        private final AtomicInteger passwordCallbackId = new AtomicInteger(0);
        private Map<AbstractC67854b, NetworkLevelListener> rustListeners = new ConcurrentHashMap();
        private Map<AbstractC67854b, av> ttnetListeners = new ConcurrentHashMap();

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public Context getContext() {
            return this.context;
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void addAccountListener() {
            LittleAppModuleProvider.m157934a(LittleAppModuleProvider.m157932a());
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void addLanAndEnvListener() {
            LittleAppModuleProvider.m157933a(LarkContext.getApplication());
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public AbstractC41301a.AbstractC41304c getAppStateDependency() {
            return new AbstractC41301a.AbstractC41304c() {
                /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.AnonymousClass12 */

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41304c
                /* renamed from: a */
                public boolean mo144237a() {
                    return LittleAppModuleProvider.f101340c.isAppRealForeground();
                }
            };
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public AbstractC41301a.AbstractC41302a getBrowserDependency() {
            return new AbstractC41301a.AbstractC41302a() {
                /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.AnonymousClass13 */

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41302a
                /* renamed from: a */
                public void mo144238a() {
                    if (C12763a.m52780a()) {
                        Log.m165389i("LittleAppModuleProvider", "delete cookie from cookie manager and  sync main domain!");
                        LittleAppModuleProvider.f101340c.syncMainDomainSessionCookie(true, 1);
                        return;
                    }
                    Log.m165389i("LittleAppModuleProvider", "not delete cookie from cookie manager and sync main domain only!");
                    LittleAppModuleProvider.f101340c.syncMainDomainSessionCookie();
                }
            };
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public String getDeviceId() {
            return LittleAppModuleProvider.f101341d.getDeviceId();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public int getEnvType() {
            return LittleAppModuleProvider.f101341d.envType();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public ILittleAppService.AbstractC41416a getInnerDependency() {
            return new C39801b();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public Locale getLanguageSetting() {
            return LittleAppModuleProvider.f101340c.getLanguageSetting();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public AbstractC41301a.AbstractC41306e getLoginDependency() {
            return new AbstractC41301a.AbstractC41306e() {
                /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.C397969 */

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41306e
                /* renamed from: a */
                public String mo144246a() {
                    return LittleAppModuleProvider.f101341d.getSession();
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41306e
                /* renamed from: b */
                public String mo144247b() {
                    return LittleAppModuleProvider.f101341d.getUserId();
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41306e
                /* renamed from: c */
                public String mo144248c() {
                    return LittleAppModuleProvider.f101341d.getTenantId();
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41306e
                /* renamed from: d */
                public boolean mo144249d() {
                    if (LittleAppModuleProvider.f101340c.getWatermarkStrategy() == 0) {
                        return true;
                    }
                    return false;
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41306e
                /* renamed from: e */
                public String mo144250e() {
                    Locale cacheLanguageSetting = LittleAppModuleProvider.f101340c.getCacheLanguageSetting();
                    String userNameEn = LittleAppModuleProvider.f101341d.getUser().getUserNameEn();
                    String userName = LittleAppModuleProvider.f101341d.getUser().getUserName();
                    if (cacheLanguageSetting == null || !Locale.ENGLISH.getLanguage().equals(cacheLanguageSetting.getLanguage()) || TextUtils.isEmpty(userNameEn)) {
                        return userName;
                    }
                    return userNameEn;
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41306e
                /* renamed from: f */
                public String mo144251f() {
                    if (LittleAppModuleProvider.f101341d.getUser() == null || TextUtils.isEmpty(LittleAppModuleProvider.f101341d.getUser().avatarKey)) {
                        return "";
                    }
                    return LittleAppModuleProvider.f101340c.getResUrlByResKey(LittleAppModuleProvider.f101341d.getUser().avatarKey, -1, -1);
                }
            };
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public AbstractC41301a.AbstractC41307f getMainDependency() {
            return new AbstractC41301a.AbstractC41307f() {
                /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.C397892 */

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41307f
                /* renamed from: b */
                public void mo144242b(String str) {
                    LittleAppModuleProvider.f101340c.notifyBootMileStoneFirstDataLoaded(str);
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41307f
                /* renamed from: c */
                public void mo144243c(String str) {
                    LittleAppModuleProvider.f101340c.notifyBootMileStoneFirstFrameDraw(str);
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41307f
                /* renamed from: d */
                public void mo144244d(String str) {
                    LittleAppModuleProvider.f101340c.notifyBootMileStoneFirstContentDraw(str);
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41307f
                /* renamed from: a */
                public TabType mo144241a(String str) {
                    return LittleAppModuleProvider.f101340c.getTabType(str);
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41307f
                /* renamed from: a */
                public Intent mo144240a(Context context, Bundle bundle, int i) {
                    return LittleAppModuleProvider.f101340c.getLaunchMainWindowIntent(context, bundle, i);
                }
            };
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public AbstractC41301a.AbstractC41308g getNotificationDependency() {
            return new AbstractC41301a.AbstractC41308g() {
                /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.AnonymousClass10 */

                /* renamed from: d */
                private String m157939d(int i) {
                    return "normal_v2";
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41308g
                /* renamed from: a */
                public AbstractNotification.AbstractC48496c<Notice> mo144232a() {
                    return LittleAppModuleProvider.f101340c.getDefaultNotificationHitPoint();
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41308g
                /* renamed from: a */
                public boolean mo144233a(int i) {
                    return LittleAppModuleProvider.f101340c.getNotificationSetting().mo105561b(m157939d(i));
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41308g
                /* renamed from: b */
                public boolean mo144234b(int i) {
                    return LittleAppModuleProvider.f101340c.getNotificationSetting().mo105562c(m157939d(i));
                }

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41308g
                /* renamed from: c */
                public String mo144235c(int i) {
                    return LittleAppModuleProvider.f101340c.getNotificationSetting().mo105560a(m157939d(i)).toString();
                }
            };
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public AbstractC41301a.AbstractC41312k getOpenPlatformDependency() {
            return new AbstractC41301a.AbstractC41312k() {
                /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.AnonymousClass15 */

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41312k
                /* renamed from: a */
                public MessageTriggerInfo mo144239a(String str, String str2) {
                    Pair<Long, List<String>> a = OpenPlatformModuleProvider.m158457a().mo170490a(str, str2);
                    if (a == null || a.second == null) {
                        return new MessageTriggerInfo(false, -1, null);
                    }
                    return new MessageTriggerInfo(true, ((Long) a.first).longValue(), (List) a.second);
                }
            };
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public long getProcessStartTime() {
            return LittleAppModuleProvider.f101340c.getNaturalBeginLaunchTime();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public AbstractC41301a.AbstractC41309h getSettingDependency() {
            return new AbstractC41301a.AbstractC41309h() {
                /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.AnonymousClass11 */

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41309h
                /* renamed from: a */
                public boolean mo144236a(boolean z) {
                    return LittleAppModuleProvider.f101340c.isNotificationShowDetail(z);
                }
            };
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public int getTTNetworkQualityType() {
            return LittleAppModuleProvider.f101340c.getNetworkQualityType();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public String getTTWebViewSoVersion() {
            return LittleAppModuleProvider.f101340c.getLoadSoVersion();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void initAuditSdk() {
            LittleAppModuleProvider.f101339b.initAuditSdk();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean isAotRunning() {
            return LittleAppModuleProvider.f101340c.isAotTaskRunning();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean isGooglePlay() {
            return LittleAppModuleProvider.f101341d.isUsPackage();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean isOverseaTenantBrand() {
            return LittleAppModuleProvider.f101341d.isOverseaTenantBrand();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean isUsingTTWebView() {
            return LittleAppModuleProvider.f101340c.isUsingTTWebView();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public List<AbstractC25558a> getAllBizWorkerProviders() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new CommentWorkerProvider());
            return arrayList;
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public <T extends AbstractNativeComponent> Map<String, Class<T>> getAllNativeComponentType() {
            HashMap hashMap = new HashMap();
            hashMap.put("map", NativeMapComponent.class);
            return hashMap;
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public int getCurNetworkLevel() {
            return LittleAppModuleProvider.f101340c.getCurNetWorkLevel().getValue();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public int getLarkAppId() {
            return C29410a.m108287a().mo104277a();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean isP0MergeToMainProc() {
            return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).isP0MergeToMainProc();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public C67856a getNetworkQuality() {
            au networkQuality = LittleAppModuleProvider.f101340c.getNetworkQuality();
            if (networkQuality != null) {
                return new C67856a(networkQuality.mo105611a(), networkQuality.mo105612b(), networkQuality.mo105613c());
            }
            return null;
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public long getServerTime() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long ntpTime = LittleAppModuleProvider.f101340c.getNtpTime();
            if (ntpTime - elapsedRealtime > 2592000) {
                return ntpTime;
            }
            return -1;
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void checkInitMainGadget() {
            if (LittleAppModuleProvider.f101338a) {
                AppBrandLogger.m52830i("LittleAppModuleProvider", "already init");
                return;
            }
            AppBrandLogger.m52830i("LittleAppModuleProvider", "checkInitMainGadget");
            LittleAppModuleProvider.f101338a = true;
            C39799a.m157970a(this.context);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void auditOpenMiniAppEvent(String str) {
            LittleAppModuleProvider.f101339b.auditOpenMiniAppEvent(str);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean checkToShow(String str) {
            return LittleAppModuleProvider.f101340c.checkToShow(str);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void completeGuide(String str) {
            LittleAppModuleProvider.f101340c.completeGuide(str);
        }

        public String getAMapKey(Context context2) {
            return LittleAppModuleProvider.f101340c.getApiKey(context2);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public String getDynamicDomain(DomainSettings.Alias alias) {
            return DynamicConfigModule.m145551a(alias);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public String getMiraPluginNativeDir(String str) {
            return LittleAppModuleProvider.f101340c.getPluginNativeLibraryDir(str);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public String getMiraPluginSoureFile(String str) {
            return LittleAppModuleProvider.f101340c.getSourceFile(str);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void installMiraClassLoader(String str) {
            LittleAppModuleProvider.f101340c.hookClassLoader(str);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean isMiraPluginInstalled(String str) {
            return LittleAppModuleProvider.f101340c.isPluginInstalled(str);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean isMiraPluginLoaded(String str) {
            return LittleAppModuleProvider.f101340c.isPluginLoaded(str);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void loadMiraPlugin(String str) {
            LittleAppModuleProvider.f101340c.loadPlugin(str);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void onCreateWebView(WebView webView) {
            LittleAppModuleProvider.f101340c.setWebViewTag(webView, "LittleAppWebView");
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void onGadgetDownloadFailed(String str) {
            AppCenterModuleProvider.m154360a().mo103306a(str);
        }

        public String getCiphertextInSendMsg(String str) {
            return OpenPlatformModuleProvider.m158457a().mo170507b(str);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean getFgValue(String str) {
            return C37239a.m146648b().mo136951a(str);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean onAppIntercept(Context context2) {
            return OpenPlatformModuleProvider.m158457a().mo170511d(context2);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean canOpen(String str) {
            if (LittleAppModuleProvider.f101340c.canOpenInternal(this.context, str, 7) || LittleAppModuleProvider.f101340c.isInterceptUrl(str) || canOpenCloudFile(str)) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean canOpenCloudFile(String str) {
            if (((ICCMApi) ApiUtils.getApi(ICCMApi.class)).canOpen(str)) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public double getBlankRate(String str) {
            return ((C39797a) LittleAppModuleProvider.f101340c.getAppConfig("blank_detect", new C39798b())).mo144252a();
        }

        public boolean getLocation(AbstractC41301a.AbstractC41311j jVar) {
            return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocation(this.context, new AbstractC41567g.AbstractC41568a() {
                /* class com.ss.android.lark.integrator.littleapp.$$Lambda$LittleAppModuleProvider$LittleAppModuleDependencyImpl$ZxREgtymVfKrhbEEY5tIpMRkmg */

                @Override // com.ss.android.lark.location.p2146b.AbstractC41567g.AbstractC41568a
                public final void onLocationChange(LarkLocation larkLocation) {
                    AbstractC41301a.AbstractC41311j.this.mo148751a(LittleAppModuleProvider.m157931a(larkLocation));
                }
            });
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void unRegisterLarkNetQualityListener(AbstractC67854b bVar) {
            if (bVar != null) {
                LittleAppModuleProvider.f101340c.unRegisterNetworkLevelListener(this.rustListeners.remove(bVar));
                LittleAppModuleProvider.f101340c.unRegisterNetworkQualityListener(this.ttnetListeners.remove(bVar));
            }
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public ChatModel getChatByTriggerCode(String str) {
            C48850e a = OpenPlatformModuleProvider.m158457a().mo170492a(str);
            if (a != null && a.mo170641a() != null) {
                return new ChatModel(a.mo170641a().mo202946e(), a.mo170641a().mo202947f(), a.mo170642b().getValue());
            }
            Log.m165383e("LittleAppModuleProvider", "trigger bean is null: ");
            return new ChatModel();
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void registerLarkNetQualityListener(final AbstractC67854b bVar) {
            if (bVar != null) {
                C397881 r0 = new NetworkLevelListener() {
                    /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.C397881 */

                    @Override // com.ss.android.lark.biz.core.api.NetworkLevelListener
                    public void onNetworkLevelChanged(NetworkLevelListener.NetworkLevel networkLevel) {
                        bVar.mo235489a(networkLevel.getValue());
                    }
                };
                C397947 r1 = new av() {
                    /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.C397947 */

                    @Override // com.ss.android.lark.biz.core.api.av
                    /* renamed from: a */
                    public void mo105614a(int i) {
                        bVar.mo235490b(i);
                    }
                };
                this.rustListeners.put(bVar, r0);
                this.ttnetListeners.put(bVar, r1);
                LittleAppModuleProvider.f101340c.registerNetworkLevelListener(r0);
                LittleAppModuleProvider.f101340c.registerNetworkQualityListener(r1);
            }
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public <T> T getAbTestValue(Class<? extends AbstractC28490a> cls, boolean z) {
            return (T) LittleAppModuleProvider.f101340c.getAbTestValue(cls, z);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public <V> void logBoostTracer(String str, V v) {
            LittleAppModuleProvider.f101340c.putKeyToBoostTracerMap(str, v);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void onGadgetDownloadFinish(String str, String str2) {
            AppCenterModuleProvider.m154360a().mo103309a(str, str2);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void getAppState(String str, final AbstractC41301a.AbstractC41303b bVar) {
            AppStrategyModuleProvider.m154406a().mo103647b().mo103691a(str, false, (AbstractC29242a.AbstractC29243a) new AbstractC29242a.AbstractC29243a() {
                /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.C397958 */

                @Override // com.ss.android.lark.appstrategy.service.AbstractC29242a.AbstractC29243a
                /* renamed from: a */
                public void mo103694a(int i) {
                    bVar.mo148748a(i);
                }

                @Override // com.ss.android.lark.appstrategy.service.AbstractC29242a.AbstractC29243a
                /* renamed from: a */
                public void mo103695a(String str) {
                    bVar.mo148749a(str);
                }
            });
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void getAppStrategyInfo(String str, AbstractC41301a.AbstractC41305d dVar) {
            AppStrategyModuleProvider.m154406a().mo103647b().mo103690a(str, false, (AbstractC4147e) new AbstractC4147e() {
                /* class com.ss.android.lark.integrator.littleapp.$$Lambda$LittleAppModuleProvider$LittleAppModuleDependencyImpl$9z6MRljugMu9ZRjoEwxdbmCnivw */

                @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4147e
                public final void onResult(String str) {
                    AbstractC41301a.AbstractC41305d.this.mo148750a(str);
                }
            });
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean startPasswordVerifyActivity(Context context2, final ILittleAppService.AbstractC41419d dVar) {
            int incrementAndGet = this.passwordCallbackId.incrementAndGet();
            LittleAppModuleProvider.f101341d.startSecurityVerify(context2, "appId" + incrementAndGet, "callbackId" + incrementAndGet, new AbstractC49402q() {
                /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.C397936 */

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49402q
                public void handleResult(Context context, String str) {
                    dVar.mo149133a(str);
                }
            });
            return true;
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void chooseLocation(Activity activity, String str) {
            POIConfig pOIConfig = new POIConfig();
            pOIConfig.setActionText(activity.getString(R.string.Lark_Legacy_Completed));
            pOIConfig.setSnapshot(false);
            pOIConfig.setSelfDefine(false);
            if (isGooglePlay() || TextUtils.isEmpty(str) || !"gcj02".equals(str)) {
                pOIConfig.setNeedWGSLatLng(true);
            } else {
                pOIConfig.setNeedWGSLatLng(false);
            }
            LittleAppModuleProvider.f101339b.fetchMapLocation(activity, 1111, pOIConfig, new AbstractC29622o() {
                /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.C397914 */

                @Override // com.ss.android.lark.biz.im.api.AbstractC29622o
                public void handleResult(Activity activity, POIInfo pOIInfo) {
                    Intent intent = new Intent();
                    intent.putExtra("extra_name", pOIInfo.getLocationName());
                    intent.putExtra("extra_address", pOIInfo.getLocationAddress());
                    intent.putExtra("extra_latitude", pOIInfo.getLatitude());
                    intent.putExtra("extra_longitude", pOIInfo.getLongitude());
                    activity.setResult(-1, intent);
                }
            }, true);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void getChatAvatar(List<String> list, AbstractC13322k.AbstractC13323a aVar) {
            Map<String, Chat> syncGetChatsByIds = LittleAppModuleProvider.f101339b.syncGetChatsByIds(list);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (syncGetChatsByIds != null) {
                for (String str : list) {
                    Chat chat = syncGetChatsByIds.get(str);
                    if (chat != null) {
                        arrayList.add(LittleAppModuleProvider.f101340c.getResUrlByResKey(chat.getAvatarKey(), -1, -1));
                        arrayList2.add(chat.getName());
                    }
                }
            }
            aVar.mo49149a(arrayList, arrayList2);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean openUrlByLark(Context context2, String str) {
            if (LittleAppModuleProvider.f101340c.canOpenInternal(context2, str, 7)) {
                LittleAppModuleProvider.f101340c.openInternal(context2, str, 7);
                return true;
            } else if (LittleAppModuleProvider.f101340c.openCustomUrl(context2, str)) {
                return true;
            } else {
                if (!((ICCMApi) ApiUtils.getApi(ICCMApi.class)).canOpen(str)) {
                    return false;
                }
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter("from", "micro_app");
                return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).open(context2, buildUpon.toString(), null, null);
            }
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public List<AbstractC13322k.C13325c> sendTextMessage(List<String> list, final String str) {
            if (CollectionUtils.isEmpty(list) || TextUtils.isEmpty(str)) {
                Log.m165389i("LittleAppModuleProvider", "send text message args invalid");
                return null;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(list.size());
            final List<AbstractC13322k.C13325c> synchronizedList = Collections.synchronizedList(new LinkedList());
            RichText b = C59029c.m229161b(str);
            for (final String str2 : list) {
                LittleAppModuleProvider.f101339b.sendMessage(((C29601ad.C29603a) C29601ad.m109464a().mo106659a(b).mo125332j(str2)).mo106660a(), (IGetDataCallback<String>) new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.C397925 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        countDownLatch.countDown();
                        synchronizedList.add(new AbstractC13322k.C13325c(str2, 0, null, str));
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("LittleAppModuleProvider", "send text message failed chatId=" + str2 + " err=" + errorResult.getDebugMsg());
                        countDownLatch.countDown();
                        synchronizedList.add(new AbstractC13322k.C13325c(str2, errorResult.getErrorCode(), errorResult.getDebugMsg(), str));
                    }
                });
            }
            try {
                countDownLatch.await(30000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Log.m165384e("LittleAppModuleProvider", "send text message failed", e);
            }
            return synchronizedList;
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void openBrowser(Activity activity, String str, String str2) {
            LittleAppModuleProvider.f101340c.openUrl(activity, str, UrlParams.m108857a().mo105519a(str2).mo105523a());
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void onGadgetCheckUpdateDone(String str, boolean z, String str2, String str3) {
            AppCenterModuleProvider.m154360a().mo103310a(str, z, str2, str3);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void monitorOpEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            C39824h.m158095a().mo144321a(getContext(), str, jSONObject, jSONObject2, jSONObject3);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void startChatterWindowActivityByChatterId(Context context2, String str, String str2, boolean z) {
            if (!z || !getFgValue("lark.feed.openapp.v2")) {
                LittleAppModuleProvider.f101339b.openChat(context2, ChatBundle.m109259a().mo105931b(str).mo105929a());
                if (DesktopUtil.m144301a(context2)) {
                    LittleAppModuleProvider.f101339b.peakFeedCard(str);
                    return;
                }
                return;
            }
            BotOpenData bVar = new BotOpenData(str, ID_TYPE.BOT_ID);
            bVar.mo170594a(str2);
            OpenPlatformModuleProvider.m158457a().mo170502a(bVar);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean startFileDetailActivity(Context context2, String str, String str2, boolean z) {
            String str3;
            if (context2 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return false;
            }
            FileContent fileContent = new FileContent();
            fileContent.setFilePath(str);
            fileContent.setKey(str);
            fileContent.setFileState(FileState.DONE);
            fileContent.setMime(str2);
            File file = new File(str);
            if (file.exists()) {
                str3 = file.getName();
            } else {
                str3 = "";
            }
            fileContent.setName(str3);
            LittleAppModuleProvider.f101340c.openLocalFileDetail(context2, fileContent, z);
            return true;
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void startDocSelectActivity(Activity activity, int i, int i2, String str, String str2) {
            ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).goDocsSelector(activity, null, i, str, i2, str2);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void startFilePickerActivity(Activity activity, int i, int i2, String str, String str2) {
            FilePickerLaunchParams fVar = new FilePickerLaunchParams(activity, i);
            fVar.mo105736a(i2);
            fVar.mo105745c(str);
            fVar.mo105747d(str2);
            LittleAppModuleProvider.f101340c.startPicker(fVar);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void openLarkPhotoPicker(Activity activity, int i, boolean z, boolean z2, boolean z3) {
            C58557a.m227127a().mo198514b(true).mo198530m(true).mo198532o(false).mo198506a(i).mo198526i(z3).mo198531n(z).mo198528k(z2).mo198510a(activity, 233);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void previewCard(Context context2, List<String> list, CardContent cardContent, boolean z, AbstractC13322k.AbstractC13324b bVar) {
            OpenPlatformModuleProvider.m158457a().mo170500a(context2, list, cardContent, z, new OpenPlatformModule.AbstractC48792b() {
                /* class com.ss.android.lark.integrator.littleapp.$$Lambda$LittleAppModuleProvider$LittleAppModuleDependencyImpl$Eutxkti0jBZsHKmdEDvcBpXnZE */

                @Override // com.ss.android.lark.openplatform.OpenPlatformModule.AbstractC48792b
                public final void onResult(boolean z, boolean z2, String str) {
                    AbstractC13322k.AbstractC13324b.this.mo49598a(z, z2, str);
                }
            });
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public boolean startDriveSDKActivity(final Context context2, String str, String str2, String str3, boolean z) {
            ArrayList arrayList;
            if (z) {
                ArrayList arrayList2 = new ArrayList(1);
                if (TTFileHelper.m264257a().isCryptoToastDisable() || !C12784c.m52844a()) {
                    arrayList2.add(new OpenExternalMenu((BinderMenuAction) null));
                } else {
                    arrayList2.add(new OpenExternalMenu(new BinderMenuAction.Stub() {
                        /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.AnonymousClass14 */

                        @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction.AbstractC5143a
                        public void action(Bundle bundle) {
                            Context context = context2;
                            if (context != null) {
                                Toast.showText(context.getApplicationContext(), context2.getResources().getString(R.string.OpenPlatform_Workplace_SafetyWarning_OpenFailed));
                            }
                        }
                    }));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).startDriveSDKActivity(context2, new C7925a(str, str2, str3, "1002", arrayList));
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void previewCard(Context context2, String str, String str2, CardContent cardContent, boolean z, AbstractC13322k.AbstractC13324b bVar) {
            OpenPlatformModuleProvider.m158457a().mo170498a(context2, str, str2, cardContent, z, new OpenPlatformModule.AbstractC48792b() {
                /* class com.ss.android.lark.integrator.littleapp.$$Lambda$LittleAppModuleProvider$LittleAppModuleDependencyImpl$EEIaWaaEV1PK1TP8WKzlbDnUW9M */

                @Override // com.ss.android.lark.openplatform.OpenPlatformModule.AbstractC48792b
                public final void onResult(boolean z, boolean z2, String str) {
                    AbstractC13322k.AbstractC13324b.this.mo49598a(z, z2, str);
                }
            });
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void getLocationInfo(Context context2, String str, float f, long j, String str2, long j2, final AbstractC67724a.AbstractC67726b bVar) {
            AppBrandLogger.m52830i("LittleAppModuleProvider", "getLocation start");
            C397903 r11 = new AbstractC41371j.AbstractC41380i() {
                /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.LittleAppModuleDependencyImpl.C397903 */

                @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
                /* renamed from: a */
                public void mo142998a() {
                }

                @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
                /* renamed from: a */
                public void mo143000a(String str, int i) {
                    bVar.mo88297a(str, i);
                }

                @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
                /* renamed from: a */
                public void mo142999a(Location location, String str, int i) {
                    bVar.mo88296a(location, str, i);
                }

                @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
                /* renamed from: a */
                public void mo143001a(ArrayList<Location> arrayList, Location location, String str, int i) {
                    bVar.mo88298a(arrayList, location, str, i);
                }
            };
            boolean isUsPackage = LittleAppModuleProvider.f101341d.isUsPackage();
            Log.m165389i("GetLocation", "::isGooglePlay:" + isUsPackage);
            C39815e.m158060a().mo144315a(context2, str, f, j, str2, j2, r11);
        }

        @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a
        public void openLocation(Activity activity, String str, String str2, double d, double d2, int i, String str3) {
            boolean z;
            if (isGooglePlay() || TextUtils.isEmpty(str3) || !"wgs84".equals(str3)) {
                z = false;
            } else {
                z = true;
            }
            LocationInfo a = new LocationInfo.C29595a(String.valueOf(d), String.valueOf(d2)).mo106513a(str).mo106516b(str2).mo106511a(i).mo106517b(z).mo106518c(z).mo106515a();
            Log.m165383e("LittleAppModuleProvider", "openLocation isNeedGCTLatLng:" + z);
            LittleAppModuleProvider.f101339b.openLocationStandAlone(activity, a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider$a */
    public static class C39797a extends C41152a {

        /* renamed from: a */
        private double f101369a;

        /* renamed from: a */
        public double mo144252a() {
            return this.f101369a;
        }

        C39797a(double d) {
            this.f101369a = d;
        }
    }

    /* renamed from: com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider$b */
    private static class C39798b implements AbstractC41160a {
        private C39798b() {
        }

        /* renamed from: a */
        public C39797a mo103073b(String str) {
            try {
                double d = new JSONObject(str).getDouble("blank_rate");
                Log.m165389i("LittleAppModuleProvider", "from setting get blank rate = " + d);
                return new C39797a(d);
            } catch (Exception e) {
                Log.m165384e("LittleAppModuleProvider", "BlankDetect config parse error", e);
                return new C39797a(0.05d);
            }
        }
    }

    /* renamed from: a */
    public static C41354g m157932a() {
        if (f101343f == null) {
            synchronized (LittleAppModuleProvider.class) {
                if (f101343f == null) {
                    f101343f = new C41354g();
                }
            }
        }
        return f101343f;
    }

    /* renamed from: a */
    public static AbstractC41301a.C41310i m157931a(LarkLocation larkLocation) {
        if (larkLocation == null) {
            return null;
        }
        return new AbstractC41301a.C41310i(larkLocation.getLatitude(), larkLocation.getLongitude(), larkLocation.mo149620g());
    }

    /* renamed from: a */
    public static void m157933a(final Context context) {
        if (C26252ad.m94993b(context)) {
            f101341d.registerLoginEnvChangeListener(new AbstractC49370a.AbstractC49371a() {
                /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.C397872 */

                @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a.AbstractC49371a
                /* renamed from: a */
                public boolean mo102729a() {
                    return false;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a.AbstractC49371a
                /* renamed from: a */
                public void mo102728a(boolean z, AbstractC49352d<String> dVar) {
                    Log.m165379d("LittleAppModuleProvider", "LoginEnv changed " + z);
                    LittleAppModuleProvider.m157932a().mo148937a(context, LittleAppModuleProvider.f101341d.oldSdkEnv());
                }
            });
            f101340c.registerLanguageChangeListener($$Lambda$LittleAppModuleProvider$kyyjmw_McnrvPLRyFmgmMsaz8IU.INSTANCE);
        }
    }

    /* renamed from: a */
    public static void m157934a(final C41354g gVar) {
        $$Lambda$LittleAppModuleProvider$a75CdQJDUNajGmfN8RrUlAeVws r0 = new AbstractC49379a() {
            /* class com.ss.android.lark.integrator.littleapp.$$Lambda$LittleAppModuleProvider$a75CdQJDUNajGmfN8RrUlAeVws */

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
                LittleAppModuleProvider.m157935a(C41354g.this, dVar);
            }
        };
        f101342e.put(gVar, r0);
        f101341d.registerUserSwitchListener(r0);
        C28513a.m104513a(new C28513a.AbstractC28515b() {
            /* class com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.C397861 */

            @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28515b
            public void onLoginStatusChanged(boolean z) {
                gVar.mo148941a(z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m157935a(C41354g gVar, C49382d dVar) {
        gVar.mo148936a(LarkContext.getApplication());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m157936a(Locale locale, Locale locale2) {
        Log.m165379d("LittleAppModuleProvider", "language change from " + locale + " to " + locale2);
        m157932a().mo148949h();
    }
}
