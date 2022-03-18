package com.ss.android.lark.vcintegrator;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bytedance.ee.bear.doc.follow.AbstractC5415a;
import com.bytedance.ee.bear.facade.common.ExtensionActivityImpl;
import com.bytedance.ee.bear.lark.p421h.C8043a;
import com.bytedance.frameworks.baselib.network.http.AbstractC13978a;
import com.bytedance.frameworks.baselib.network.http.ok3.C14018a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.suite.R;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.C29538a;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ContentStateChangeCallback;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.ISettingsUpdateListener;
import com.ss.android.lark.biz.core.api.IUiModeService;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.biz.im.api.C29613e;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.biz.im.api.param.Params;
import com.ss.android.lark.browser.impl.C29935c;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.featuregating.p1846c.AbstractC37250a;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.integrator.minutes.C39876a;
import com.ss.android.lark.integrator.p2017d.C39399a;
import com.ss.android.lark.integrator.voip.VoIpModuleProvider;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.p1786d.AbstractC36428b;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.lark.passport.signinsdk_api.AbstractC49358c;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a;
import com.ss.android.lark.passport.signinsdk_api.entity.AccountInterceptorBean;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.vcintegrator.SubDependencies;
import com.ss.android.lark.vcintegrator.guide.GuideBridge;
import com.ss.android.lark.voip.service.AbstractC58001a;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.lifecycle.C60793b;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.AbstractC60875aa;
import com.ss.android.vc.dependency.AbstractC60876ab;
import com.ss.android.vc.dependency.AbstractC60877ac;
import com.ss.android.vc.dependency.AbstractC60879ad;
import com.ss.android.vc.dependency.AbstractC60880ae;
import com.ss.android.vc.dependency.AbstractC60881af;
import com.ss.android.vc.dependency.AbstractC60882ag;
import com.ss.android.vc.dependency.AbstractC60885b;
import com.ss.android.vc.dependency.AbstractC60886c;
import com.ss.android.vc.dependency.AbstractC60888d;
import com.ss.android.vc.dependency.AbstractC60889e;
import com.ss.android.vc.dependency.AbstractC60890f;
import com.ss.android.vc.dependency.AbstractC60891g;
import com.ss.android.vc.dependency.AbstractC60892h;
import com.ss.android.vc.dependency.AbstractC60893i;
import com.ss.android.vc.dependency.AbstractC60894j;
import com.ss.android.vc.dependency.AbstractC60895k;
import com.ss.android.vc.dependency.AbstractC60896l;
import com.ss.android.vc.dependency.AbstractC60897m;
import com.ss.android.vc.dependency.AbstractC60899n;
import com.ss.android.vc.dependency.AbstractC60900o;
import com.ss.android.vc.dependency.AbstractC60901p;
import com.ss.android.vc.dependency.AbstractC60902q;
import com.ss.android.vc.dependency.AbstractC60904r;
import com.ss.android.vc.dependency.AbstractC60905s;
import com.ss.android.vc.dependency.AbstractC60906t;
import com.ss.android.vc.dependency.AbstractC60907u;
import com.ss.android.vc.dependency.AbstractC60908v;
import com.ss.android.vc.dependency.AbstractC60911w;
import com.ss.android.vc.dependency.AbstractC60912x;
import com.ss.android.vc.dependency.AbstractC60914y;
import com.ss.android.vc.dependency.AbstractC60915z;
import com.ss.android.vc.dependency.C60874a;
import com.ss.android.vc.dependency.IAccountInterceptor;
import com.ss.android.vc.dependency.IReactionDependency;
import com.ss.android.vc.dependency.IRichTextDependency;
import com.ss.android.vc.dependency.VCNetworkLevel;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.aj;
import com.ss.android.vc.dependency.ak;
import com.ss.android.vc.dependency.am;
import com.ss.android.vc.dependency.an;
import com.ss.android.vc.dependency.ao;
import com.ss.android.vc.dependency.ap;
import com.ss.android.vc.dependency.aq;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.dto.NewGuideConfig;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.entity.follow.ILoadDocsThumbnailCallback;
import com.ss.android.vc.entity.follow.ThumbnailDetail;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.base.AbstractC61786d;
import com.ss.android.vc.meeting.module.preview.guest.MeetingPreviewGuestModel;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vcxp.C63791b;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

public class SubDependencies {

    /* renamed from: a */
    public static final IIMApi f142525a = ((IIMApi) ApiUtils.getApi(IIMApi.class));

    /* renamed from: b */
    public static final ICoreApi f142526b = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    public static class XDataCache implements AbstractC60880ae, AbstractC60885b, AbstractC60897m.AbstractC60898a, AbstractC60912x.AbstractC60913a {

        /* renamed from: a */
        IPassportApi f142618a;

        /* renamed from: b */
        private final C57953b f142619b;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$XDataCache$a */
        public static class C57952a {

            /* renamed from: a */
            public static final XDataCache f142620a = new XDataCache(null);
        }

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$XDataCache$b */
        public static class C57953b {

            /* renamed from: a */
            String f142621a;

            /* renamed from: b */
            String f142622b;

            /* renamed from: c */
            Boolean f142623c;

            /* renamed from: d */
            Locale f142624d;

            /* renamed from: e */
            Integer f142625e;

            /* renamed from: f */
            Boolean f142626f;

            /* renamed from: g */
            Integer f142627g;

            /* renamed from: h */
            String f142628h;

            private C57953b() {
            }

            /* synthetic */ C57953b(C579031 r1) {
                this();
            }
        }

        /* renamed from: a */
        public static XDataCache m224833a() {
            return C57952a.f142620a;
        }

        public String getDeviceIdX() {
            return this.f142618a.getDeviceId();
        }

        public int getLoginTypeX() {
            return this.f142618a.getLoginType();
        }

        public String getTenantIdX() {
            return this.f142618a.getTenantId();
        }

        public String getUserIdX() {
            return this.f142618a.getUserId();
        }

        public boolean isCustomerX() {
            return this.f142618a.isCustomer();
        }

        public Locale getCurrentLocaleX() {
            return LanguageDependency.m224774a().getLanguageSetting();
        }

        public int getTenantTagX() {
            return this.f142618a.getUser().getTenantTag();
        }

        public Boolean isOverseaTenantBrandX() {
            return Boolean.valueOf(this.f142618a.isOverseaTenantBrand());
        }

        private XDataCache() {
            this.f142618a = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
            this.f142619b = new C57953b(null);
            mo196487b();
        }

        /* renamed from: c */
        public String mo196488c() {
            if (TextUtils.isEmpty(this.f142619b.f142621a)) {
                this.f142619b.f142621a = getUserIdX();
            }
            return this.f142619b.f142621a;
        }

        /* renamed from: d */
        public String mo196489d() {
            if (TextUtils.isEmpty(this.f142619b.f142622b)) {
                this.f142619b.f142622b = getDeviceIdX();
            }
            return this.f142619b.f142622b;
        }

        /* renamed from: e */
        public Boolean mo196490e() {
            if (this.f142619b.f142623c == null) {
                this.f142619b.f142623c = isOverseaTenantBrandX();
            }
            return this.f142619b.f142623c;
        }

        /* renamed from: f */
        public int mo196491f() {
            if (this.f142619b.f142625e == null) {
                this.f142619b.f142625e = Integer.valueOf(getLoginTypeX());
            }
            return this.f142619b.f142625e.intValue();
        }

        /* renamed from: g */
        public boolean mo196492g() {
            if (this.f142619b.f142626f == null) {
                this.f142619b.f142626f = Boolean.valueOf(isCustomerX());
            }
            return this.f142619b.f142626f.booleanValue();
        }

        /* renamed from: h */
        public int mo196499h() {
            if (this.f142619b.f142627g == null) {
                this.f142619b.f142627g = Integer.valueOf(getTenantTagX());
            }
            return this.f142619b.f142627g.intValue();
        }

        /* renamed from: i */
        public String mo196500i() {
            if (TextUtils.isEmpty(this.f142619b.f142628h)) {
                this.f142619b.f142628h = getTenantIdX();
            }
            return this.f142619b.f142628h;
        }

        /* renamed from: b */
        public void mo196487b() {
            if (C26252ad.m94993b(LarkContext.getApplication())) {
                LoginChangeDependency.m224784a().addLoginChangeListener(this);
                LoginDependency.m224786a().registerChangeObserver(this);
                LanguageDependency.m224774a().registerLanguageChangeListener(this);
                DeviceChangeDependency.m224741a().registerChangeListener(this);
            }
        }

        /* synthetic */ XDataCache(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60885b
        public void onAccountChange(String str) {
            m224834a(str);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60897m.AbstractC60898a
        public void onDeviceIdChange(String str) {
            this.f142619b.f142622b = str;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60912x.AbstractC60913a
        public void onLoginStatusChangedEvent(int i) {
            String str;
            if (i != 0) {
                str = getUserIdX();
            } else {
                str = null;
            }
            m224834a(str);
        }

        /* renamed from: a */
        private void m224834a(String str) {
            this.f142619b.f142621a = str;
            this.f142619b.f142622b = getDeviceIdX();
            this.f142619b.f142623c = isOverseaTenantBrandX();
            this.f142619b.f142625e = Integer.valueOf(getLoginTypeX());
            this.f142619b.f142626f = Boolean.valueOf(isCustomerX());
            this.f142619b.f142627g = Integer.valueOf(getTenantTagX());
            this.f142619b.f142628h = getTenantIdX();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60880ae
        public void onLanguageChange(Locale locale, Locale locale2) {
            this.f142619b.f142624d = locale2;
        }
    }

    public static class AppEnvDependency implements AbstractC60888d {
        private AppEnvDependency() {
        }

        /* renamed from: a */
        public static AppEnvDependency m224721a() {
            return C57904a.f142528a;
        }

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$AppEnvDependency$a */
        public static class C57904a {

            /* renamed from: a */
            public static final AppEnvDependency f142528a;

            static {
                AppEnvDependency appEnvDependency = null;
                if (SubDependencies.m224720a()) {
                    appEnvDependency = new AppEnvDependency(null);
                }
                f142528a = appEnvDependency;
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60888d
        /* renamed from: b */
        public boolean mo196332b() {
            return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isUsPackage();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60888d
        /* renamed from: c */
        public boolean mo196333c() {
            return XDataCache.m224833a().mo196490e().booleanValue();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60888d
        /* renamed from: d */
        public String mo196334d() {
            return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).rustSdkLogSubPath();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60888d
        public boolean isPreReleaseEnv() {
            if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType() == 3) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60888d
        public boolean isProductionEnv() {
            if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType() == 1) {
                return true;
            }
            return false;
        }

        public boolean isStagingEnv() {
            if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType() == 2) {
                return true;
            }
            return false;
        }

        /* synthetic */ AppEnvDependency(C579031 r1) {
            this();
        }
    }

    public static class AppUpgradeDependency implements AbstractC60889e {

        /* renamed from: a */
        ICoreApi f142529a;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$AppUpgradeDependency$a */
        public static class C57905a {

            /* renamed from: a */
            public static final AppUpgradeDependency f142530a = new AppUpgradeDependency(null);
        }

        /* renamed from: a */
        public static AppUpgradeDependency m224725a() {
            return C57905a.f142530a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60889e
        public void checkNewVersion() {
            this.f142529a.checkNewVersion();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60889e
        public boolean isHasNewVersion() {
            return this.f142529a.isHasNewVersion();
        }

        private AppUpgradeDependency() {
            this.f142529a = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        }

        /* synthetic */ AppUpgradeDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60889e
        public void launchAppUpgrade(Context context) {
            this.f142529a.openAboutPage(context);
        }
    }

    public static class BrowserDependency implements AbstractC60890f {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$BrowserDependency$a */
        public static class C57906a {

            /* renamed from: a */
            public static final BrowserDependency f142531a = new BrowserDependency(null);
        }

        private BrowserDependency() {
        }

        /* renamed from: a */
        public static BrowserDependency m224726a() {
            return C57906a.f142531a;
        }

        /* synthetic */ BrowserDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60890f
        public void openUrlBrowser(Context context, String str) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUrl(context, str, UrlParams.m108857a().mo105523a(), ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getUrlParamsMap("VideoConference"));
        }
    }

    public static class CalendarDependency implements AbstractC60891g {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$CalendarDependency$a */
        public static class C57907a {

            /* renamed from: a */
            public static final CalendarDependency f142532a = new CalendarDependency(null);
        }

        private CalendarDependency() {
        }

        /* renamed from: a */
        public static CalendarDependency m224727a() {
            return C57907a.f142532a;
        }

        /* synthetic */ CalendarDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60891g
        public void openCalendarTab(Context context) {
            SubDependencies.f142526b.launchMainWindow(context, "calendar");
        }

        @Override // com.ss.android.vc.dependency.AbstractC60891g
        public String rRuleToRecurrence(String str) {
            return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getRepeatRuleAndEnd(str);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60891g
        public void openCalendarDetailPage(Context context, String str, String str2, long j, long j2) {
            ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).startEventDetailActivityFromAuthorizedAppLink(context, str, str2, j, j2);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60891g
        public void openCreateCalendarPage(Context context, String str, long j, long j2, boolean z) {
            ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).startCreateEventActivity(context, str, j, j2, z);
        }
    }

    public static class ChatDependency implements AbstractC60892h {

        /* renamed from: a */
        private final IIMApi f142533a;

        /* renamed from: b */
        private final ICoreApi f142534b;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$ChatDependency$a */
        public static class C57912a {

            /* renamed from: a */
            public static final ChatDependency f142543a = new ChatDependency(null);
        }

        /* renamed from: a */
        public static ChatDependency m224728a() {
            return C57912a.f142543a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public Chatter getLoginChatter() {
            return this.f142533a.getLoginChatter(true);
        }

        private ChatDependency() {
            this.f142533a = (IIMApi) ApiUtils.getApi(IIMApi.class);
            this.f142534b = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        }

        /* synthetic */ ChatDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public Map<String, OpenChatter> fromPbChatterMap(Map<String, com.bytedance.lark.pb.basic.v1.Chatter> map) {
            return this.f142533a.fromPbChatterMap(map);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public OpenChat getChatById(String str) {
            return this.f142533a.getOpenChatById(str);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public Chatter getChatterById(String str) {
            return this.f142533a.getChatterById(str);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public Map<String, Chatter> syncGetChattersByIds(List<String> list) {
            return this.f142533a.syncGetChattersByIds(list);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        /* renamed from: a */
        public boolean mo196347a(OpenChat openChat) {
            return this.f142533a.isAllowCreateVC(openChat);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public void getLoginChatter(final IGetDataCallback<OpenChatter> iGetDataCallback) {
            if (iGetDataCallback != null) {
                this.f142533a.getLoginChatter(true, new IGetDataCallback<Chatter>() {
                    /* class com.ss.android.lark.vcintegrator.SubDependencies.ChatDependency.C579092 */

                    /* renamed from: a */
                    public void onSuccess(Chatter chatter) {
                        iGetDataCallback.onSuccess(chatter);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }
                });
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public Map<String, OpenChat> syncGetChatsByIds(List<String> list) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Chat> entry : this.f142533a.syncGetChatsByIds(list).entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return hashMap;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        /* renamed from: a */
        public void mo196346a(Activity activity, String str) {
            this.f142533a.makeCall(activity, str);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public void emergencyCall(Activity activity, String str) {
            this.f142533a.emergencyCall(activity, str);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public void queryPhoneNumber(Activity activity, String str) {
            this.f142533a.queryPhoneNumber(activity, str);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public void createP2PChats(List<String> list, final IGetDataCallback<Map<String, ? extends OpenChat>> iGetDataCallback) {
            this.f142533a.putP2PChats(list, new IGetDataCallback<Map<String, ? extends OpenChat>>() {
                /* class com.ss.android.lark.vcintegrator.SubDependencies.ChatDependency.C579114 */

                /* renamed from: a */
                public void onSuccess(Map<String, ? extends OpenChat> map) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(map);
                    }
                }

                /* renamed from: a */
                public static /* synthetic */ void m224735a(ErrorResult errorResult) {
                    SubDependencies.f142525a.showNoIMPermissionDialog(errorResult.getDisplayMsg());
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (errorResult.getErrorCode() == 4052) {
                        UICallbackExecutor.execute(new Runnable() {
                            /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$ChatDependency$4$XWkPn8P271KbB4UrHgipPlFSBTI */

                            public final void run() {
                                SubDependencies.ChatDependency.C579114.lambda$XWkPn8P271KbB4UrHgipPlFSBTI(ErrorResult.this);
                            }
                        });
                        return;
                    }
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            });
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public void getChatById(String str, final IGetDataCallback<OpenChat> iGetDataCallback) {
            if (iGetDataCallback != null) {
                this.f142533a.getOpenChatById(str, new IGetDataCallback<Chat>() {
                    /* class com.ss.android.lark.vcintegrator.SubDependencies.ChatDependency.C579081 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        C26171w.m94675a(new Runnable(chat) {
                            /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$ChatDependency$1$e1ZOMhWKZrB2s7hnNu_Y5SvqCrY */
                            public final /* synthetic */ Chat f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                SubDependencies.ChatDependency.C579081.lambda$e1ZOMhWKZrB2s7hnNu_Y5SvqCrY(IGetDataCallback.this, this.f$1);
                            }
                        });
                    }
                });
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public void getChattersByIds(List<String> list, final IGetDataCallback<Map<String, OpenChatter>> iGetDataCallback) {
            if (iGetDataCallback != null) {
                this.f142533a.getChattersByIds(list, new IGetDataCallback<Map<String, Chatter>>() {
                    /* class com.ss.android.lark.vcintegrator.SubDependencies.ChatDependency.C579103 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(Map<String, Chatter> map) {
                        iGetDataCallback.onSuccess(new HashMap(map));
                    }
                });
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public void getChatterById(String str, IGetDataCallback<OpenChatter> iGetDataCallback) {
            this.f142533a.getAbsChatterById(str, iGetDataCallback);
        }

        public void openChatterById(Context context, String str) {
            this.f142533a.openChat(context, ChatBundle.m109259a().mo105931b(str).mo105923a(ChatBundle.SourceType.PROFILE).mo105929a());
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public void openChatById(Context context, String str) {
            this.f142533a.openChat(context, ChatBundle.m109259a().mo105927a(str).mo105923a(ChatBundle.SourceType.PROFILE).mo105929a());
            if (DesktopUtil.m144301a(context)) {
                this.f142534b.launchMainWindow(context);
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60892h
        public void sendMessage(String str, File file, IGetDataCallback<String> iGetDataCallback) {
            int chatLastPosition = this.f142533a.getChatLastPosition(str);
            this.f142533a.getLocalChat(str);
            if (iGetDataCallback != null) {
                this.f142533a.sendMessage(((C29613e.C29615a) ((C29613e.C29615a) C29613e.m109504a().mo125332j(str)).mo125328c(chatLastPosition)).mo106702a(file.getPath()).mo106704b(file.getName()).mo106703a(), iGetDataCallback);
            } else {
                this.f142533a.sendMessage(((C29613e.C29615a) ((C29613e.C29615a) C29613e.m109504a().mo125332j(str)).mo125328c(chatLastPosition)).mo106702a(file.getPath()).mo106704b(file.getName()).mo106703a());
            }
        }

        public void sendMessage(String str, String str2, IGetDataCallback<String> iGetDataCallback) {
            int chatLastPosition = this.f142533a.getChatLastPosition(str);
            this.f142533a.getLocalChat(str);
            if (iGetDataCallback != null) {
                this.f142533a.sendMessage(((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(str)).mo125328c(chatLastPosition)).mo106659a(C59029c.m229161b(str2)).mo106660a(), iGetDataCallback);
            } else {
                this.f142533a.sendMessage(((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(str)).mo125328c(chatLastPosition)).mo106659a(C59029c.m229161b(str2)).mo106660a());
            }
        }
    }

    public static class ChatterNameDependency implements AbstractC60893i {

        /* renamed from: a */
        IIMApi f142544a;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$ChatterNameDependency$a */
        public static class C57913a {

            /* renamed from: a */
            public static final ChatterNameDependency f142545a = new ChatterNameDependency(null);
        }

        /* renamed from: a */
        public static ChatterNameDependency m224737a() {
            return C57913a.f142545a;
        }

        private ChatterNameDependency() {
            this.f142544a = (IIMApi) ApiUtils.getApi(IIMApi.class);
        }

        /* synthetic */ ChatterNameDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60893i
        /* renamed from: a */
        public String mo196369a(OpenChatter openChatter) {
            return this.f142544a.getDisplayName(openChatter, ChatterNameDisplayRule.NAME);
        }

        public String getDisplayNameByAliasNickName(OpenChatter openChatter) {
            return this.f142544a.getDisplayName(openChatter, ChatterNameDisplayRule.ALIAS_NICKNAME_NAME);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60893i
        public String getDisplayNameByAliaskName(OpenChatter openChatter) {
            return this.f142544a.getDisplayName(openChatter, ChatterNameDisplayRule.ALIAS_NAME);
        }
    }

    public static class ContactDependency implements AbstractC60895k {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$ContactDependency$a */
        public static class C57914a {

            /* renamed from: a */
            public static final ContactDependency f142546a = new ContactDependency(null);
        }

        private ContactDependency() {
        }

        /* renamed from: a */
        public static ContactDependency m224739a() {
            return C57914a.f142546a;
        }

        /* synthetic */ ContactDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60895k
        public void sendFriendRequest(String str, String str2, String str3, String str4, String str5, ByteviewUser byteviewUser, IGetDataCallback<Boolean> iGetDataCallback) {
            ContactSource contactSource;
            ContactSource contactSource2;
            if (!C57782ag.m224241a(str4)) {
                contactSource2 = new ContactSource();
                contactSource2.setSourceType(5);
                contactSource2.setSourceName(str4);
                contactSource2.setSourceId(str5);
            } else if (byteviewUser != null) {
                ContactSource contactSource3 = new ContactSource();
                VideoChatUser userInfoInCache = UserInfoService.getUserInfoInCache(byteviewUser.getUserId(), byteviewUser.getParticipantType());
                if (userInfoInCache != null) {
                    contactSource3.setSourceType(5);
                    contactSource3.setSender(userInfoInCache.getName());
                    contactSource3.setSenderId(userInfoInCache.getId());
                    Log.m165379d("VideoChatModuleProvider", "[sendFriendRequest] sender = " + userInfoInCache.getName() + " senderId =" + userInfoInCache.getId());
                }
                contactSource = contactSource3;
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).sendFriendRequest(str, null, str2, str3, null, contactSource, iGetDataCallback);
            } else {
                contactSource2 = null;
            }
            contactSource = contactSource2;
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).sendFriendRequest(str, null, str2, str3, null, contactSource, iGetDataCallback);
        }
    }

    public static class CustomerServiceDependency implements AbstractC60896l {

        /* renamed from: a */
        IIMApi f142547a;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$CustomerServiceDependency$a */
        public static class C57915a {

            /* renamed from: a */
            public static final CustomerServiceDependency f142548a = new CustomerServiceDependency(null);
        }

        /* renamed from: a */
        public static CustomerServiceDependency m224740a() {
            return C57915a.f142548a;
        }

        private CustomerServiceDependency() {
            this.f142547a = (IIMApi) ApiUtils.getApi(IIMApi.class);
        }

        /* synthetic */ CustomerServiceDependency(C579031 r1) {
            this();
        }

        public String checkUrl(String str) {
            return this.f142547a.checkUrl(str);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60896l
        public void launchCustomerService(Context context) {
            this.f142547a.launchCustomerService(context, new Params(Params.ReferType.VideoChat), null);
        }
    }

    public static class DeviceChangeDependency implements AbstractC60897m {

        /* renamed from: a */
        IPassportApi f142549a;

        /* renamed from: b */
        ConcurrentHashMap<AbstractC60897m.AbstractC60898a, AbstractC49390d.AbstractC49391a> f142550b;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$DeviceChangeDependency$a */
        public static class C57916a {

            /* renamed from: a */
            public static final DeviceChangeDependency f142551a = new DeviceChangeDependency(null);
        }

        /* renamed from: a */
        public static DeviceChangeDependency m224741a() {
            return C57916a.f142551a;
        }

        private DeviceChangeDependency() {
            ConcurrentHashMap<AbstractC60897m.AbstractC60898a, AbstractC49390d.AbstractC49391a> concurrentHashMap;
            this.f142549a = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
            if (SubDependencies.m224720a()) {
                concurrentHashMap = new ConcurrentHashMap<>();
            } else {
                concurrentHashMap = null;
            }
            this.f142550b = concurrentHashMap;
        }

        /* synthetic */ DeviceChangeDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60897m
        public void registerChangeListener(AbstractC60897m.AbstractC60898a aVar) {
            $$Lambda$SubDependencies$DeviceChangeDependency$bNryFb4vf1N_VXkPGEgmyGugQY r0 = new AbstractC49390d.AbstractC49391a() {
                /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$DeviceChangeDependency$bNryFb4vf1N_VXkPGEgmyGugQY */

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d.AbstractC49391a
                public final void onDeviceIdChange(String str) {
                    SubDependencies.DeviceChangeDependency.m271057lambda$bNryFb4vf1N_VXkPGEgmyGugQY(AbstractC60897m.AbstractC60898a.this, str);
                }
            };
            this.f142550b.put(aVar, r0);
            this.f142549a.addDeviceIdChangeListener(r0);
        }

        public void unregisterChangeListener(AbstractC60897m.AbstractC60898a aVar) {
            AbstractC49390d.AbstractC49391a remove = this.f142550b.remove(aVar);
            if (remove != null) {
                this.f142549a.removeDeviceIdChangeListener(remove);
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m224742a(AbstractC60897m.AbstractC60898a aVar, String str) {
            if (aVar != null) {
                aVar.onDeviceIdChange(str);
            }
        }
    }

    public static class DocsDependency implements AbstractC60899n {

        /* renamed from: a */
        public ICCMApi f142552a;

        /* renamed from: b */
        private AbstractC61786d f142553b;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$DocsDependency$a */
        public static class C57919a {

            /* renamed from: a */
            public static final DocsDependency f142557a = new DocsDependency(null);
        }

        /* renamed from: a */
        public static DocsDependency m224743a() {
            return C57919a.f142557a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60899n
        /* renamed from: c */
        public AbstractC61786d mo196380c() {
            return this.f142553b;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60899n
        /* renamed from: b */
        public void mo196379b() {
            ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).checkAndInit();
        }

        private DocsDependency() {
            this.f142552a = (ICCMApi) ApiUtils.getApi(ICCMApi.class);
            this.f142553b = new AbstractC61786d() {
                /* class com.ss.android.lark.vcintegrator.SubDependencies.DocsDependency.C579171 */

                @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61786d
                /* renamed from: a */
                public void mo196383a() {
                    DocsDependency.this.f142552a.provideFollowSdk().mo17070a();
                }

                @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61786d
                /* renamed from: a */
                public ExtensionActivityImpl mo196382a(AppCompatActivity appCompatActivity) {
                    return DocsDependency.this.f142552a.provideFollowSdk().mo17069a(appCompatActivity);
                }

                @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61786d
                /* renamed from: a */
                public void mo196384a(Context context) {
                    DocsDependency.this.f142552a.provideFollowSdk().mo17071a(context);
                }

                @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61786d
                /* renamed from: a */
                public Fragment mo196381a(Context context, String str, boolean z, AbstractC5415a aVar) {
                    return DocsDependency.this.f142552a.provideFollowSdk().mo17068a(context, str, z, aVar);
                }
            };
        }

        /* synthetic */ DocsDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60899n
        /* renamed from: a */
        public void mo196378a(String str, Context context) {
            if (!TextUtils.isEmpty(str)) {
                C29935c.m110676a().mo107802a(context, str, UrlParams.m108857a().mo105523a(), (Map<String, String>) null);
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60899n
        /* renamed from: a */
        public void mo196377a(Context context, VcDoc vcDoc, ImageView imageView, boolean z, final ILoadDocsThumbnailCallback iLoadDocsThumbnailCallback) {
            C8043a.C8044a a = new C8043a.C8044a().mo31099a(context).mo31102a(vcDoc.getDocUrl()).mo31100a(imageView).mo31107b(z).mo31101a(new AbstractC2536f() {
                /* class com.ss.android.lark.vcintegrator.SubDependencies.DocsDependency.C579182 */

                @Override // com.bumptech.glide.request.AbstractC2536f
                /* renamed from: a */
                public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j jVar, boolean z) {
                    String str;
                    if (glideException == null) {
                        str = "";
                    } else {
                        str = glideException.toString();
                    }
                    C60700b.m235851b("[loadDocsThumbnail]", "[onLoadFialed]", str);
                    return iLoadDocsThumbnailCallback.onLoadFailed();
                }

                @Override // com.bumptech.glide.request.AbstractC2536f
                /* renamed from: a */
                public boolean mo11205a(Object obj, Object obj2, AbstractC2522j jVar, DataSource dataSource, boolean z) {
                    return iLoadDocsThumbnailCallback.onResourceReady();
                }
            });
            ThumbnailDetail thumbnailDetail = vcDoc.getThumbnailDetail();
            a.mo31103a(true).mo31111e("vc").mo31098a(thumbnailDetail.getCipherType().getNumber()).mo31106b(thumbnailDetail.getThumbnailUrl()).mo31109c(thumbnailDetail.getDecryptKey()).mo31110d(thumbnailDetail.getNonce());
            this.f142552a.loadThumbnail(a.mo31104a());
        }
    }

    public static class DynamicDomainDependency implements AbstractC60900o {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$DynamicDomainDependency$a */
        public static class C57920a {

            /* renamed from: a */
            public static final DynamicDomainDependency f142558a = new DynamicDomainDependency(null);
        }

        private DynamicDomainDependency() {
        }

        /* renamed from: a */
        public static DynamicDomainDependency m224754a() {
            return C57920a.f142558a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60900o
        /* renamed from: b */
        public List<String> mo196385b() {
            return DynamicConfigModule.m145553b(DomainSettings.Alias.RTC_FRONTIER);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60900o
        /* renamed from: c */
        public List<String> mo196386c() {
            return DynamicConfigModule.m145553b(DomainSettings.Alias.RTC_DECISION);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60900o
        /* renamed from: d */
        public List<String> mo196387d() {
            return DynamicConfigModule.m145553b(DomainSettings.Alias.RTC_DEFAULTIPS);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60900o
        public List<String> getAppLinkDomain() {
            return DynamicConfigModule.m145553b(DomainSettings.Alias.APPLINK_PEER);
        }

        public String getCdnDynamicDomain() {
            return DynamicConfigModule.m145551a(DomainSettings.Alias.CDN);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60900o
        public List<String> getDocDomainPool() {
            return DynamicConfigModule.m145553b(DomainSettings.Alias.DOCS_PEER);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60900o
        public List<String> getDocSpaceApi() {
            return DynamicConfigModule.m145553b(DomainSettings.Alias.DOCS_API);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60900o
        public String getDocSuiteDomain() {
            return C36882a.m145557a(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantId());
        }

        /* synthetic */ DynamicDomainDependency(C579031 r1) {
            this();
        }
    }

    public static class FeatureGatingDependency implements AbstractC60901p {

        /* renamed from: a */
        private final AbstractC37250a f142559a;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$FeatureGatingDependency$a */
        public static class C57921a {

            /* renamed from: a */
            public static final FeatureGatingDependency f142560a = new FeatureGatingDependency(null);
        }

        /* renamed from: a */
        public static FeatureGatingDependency m224758a() {
            return C57921a.f142560a;
        }

        public boolean isPreloadLayoutEnabled() {
            return SubDependencies.f142525a.isPreloadEnabled();
        }

        private FeatureGatingDependency() {
            this.f142559a = C37239a.m146648b();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60901p
        /* renamed from: b */
        public Map<String, Boolean> mo196394b() {
            HashMap hashMap = new HashMap();
            Set<String> a = C63634c.m249494a();
            if (a != null) {
                for (String str : a) {
                    hashMap.put(str, Boolean.valueOf(mo196393a(str)));
                }
            }
            return hashMap;
        }

        /* synthetic */ FeatureGatingDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60901p
        /* renamed from: a */
        public boolean mo196393a(String str) {
            return this.f142559a.mo136952a(str, C63634c.m249495a(str));
        }

        @Override // com.ss.android.vc.dependency.AbstractC60901p
        /* renamed from: b */
        public boolean mo196395b(String str) {
            return this.f142559a.mo136955b(str, C63634c.m249495a(str));
        }
    }

    public static class GuideDependency implements AbstractC60902q {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$GuideDependency$a */
        public static class C57922a {

            /* renamed from: a */
            public static final GuideDependency f142561a = new GuideDependency(null);
        }

        private GuideDependency() {
        }

        /* renamed from: a */
        public static GuideDependency m224762a() {
            return C57922a.f142561a;
        }

        /* synthetic */ GuideDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60902q
        public boolean checkToShow(String str) {
            return GuideBridge.f142662a.mo196591a(str);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60902q
        /* renamed from: a */
        public void mo196397a(Bitmap bitmap) {
            if (SubDependencies.m224720a()) {
                SubDependencies.f142526b.openVcWelcomeGuide(bitmap);
                return;
            }
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocate);
            openVcWelcomeGuideX(allocate.array(), bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        }

        @Override // com.ss.android.vc.dependency.AbstractC60902q
        /* renamed from: a */
        public void mo196398a(NewGuideConfig newGuideConfig, AbstractC60902q.AbstractC60903a aVar) {
            GuideBridge.f142662a.mo196589a(newGuideConfig, aVar);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60902q
        public void completeGuide(String str, boolean z) {
            GuideBridge.f142662a.mo196590a(str, z);
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m224763a(View view, GuideDelegate gVar) {
            gVar.mo141659b();
            completeGuide("android_vc_new_onboarding", true);
        }

        /* access modifiers changed from: public */
        /* renamed from: c */
        private /* synthetic */ void m224765c(View view, GuideDelegate gVar) {
            gVar.mo141659b();
            completeGuide("android_vc_new_onboarding", true);
        }

        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m224764b(View view, GuideDelegate gVar) {
            gVar.mo141659b();
            VideoChatModuleDependency.getUGDependency().mo196473b();
            completeGuide("android_vc_new_onboarding", true);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60902q
        /* renamed from: a */
        public void mo196399a(String str, NewGuideConfig newGuideConfig, AbstractC60902q.AbstractC60903a aVar) {
            if (str.equals("video_chat_main_tab")) {
                GuideBridge.f142662a.mo196587a(newGuideConfig, new ButtonConfig(ar.m236694a().getString(R.string.Lark_View_OkButton), new ButtonConfig.ButtonAction() {
                    /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$GuideDependency$8pIiC0EFTrRDEX7Fs2uS8K22hic */

                    @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
                    public final void onClick(View view, GuideDelegate gVar) {
                        SubDependencies.GuideDependency.lambda$8pIiC0EFTrRDEX7Fs2uS8K22hic(SubDependencies.GuideDependency.this, view, gVar);
                    }
                }), new ButtonConfig(ar.m236694a().getString(R.string.View_G_ViewNow), new ButtonConfig.ButtonAction() {
                    /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$GuideDependency$qtKqJQNTPIWwgPviIIIvCSac7Q */

                    @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
                    public final void onClick(View view, GuideDelegate gVar) {
                        SubDependencies.GuideDependency.m271058lambda$qtKqJQNTPIWwgPviIIIvCSac7Q(SubDependencies.GuideDependency.this, view, gVar);
                    }
                }));
            } else if (str.equals("video_chat_history")) {
                GuideBridge.f142662a.mo196587a(newGuideConfig, null, new ButtonConfig(ar.m236694a().getString(R.string.Lark_View_OkButton), new ButtonConfig.ButtonAction() {
                    /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$GuideDependency$j1i37DfB5Q5c52yoiRPXmjFEYFw */

                    @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
                    public final void onClick(View view, GuideDelegate gVar) {
                        SubDependencies.GuideDependency.lambda$j1i37DfB5Q5c52yoiRPXmjFEYFw(SubDependencies.GuideDependency.this, view, gVar);
                    }
                }));
            }
        }

        public void openVcWelcomeGuideX(byte[] bArr, int i, int i2, Bitmap.Config config) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            mo196397a(createBitmap);
        }
    }

    public static class ImageDependency implements AbstractC60905s {

        /* renamed from: a */
        ICoreApi f142562a;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$ImageDependency$a */
        public static class C57923a {

            /* renamed from: a */
            public static final ImageDependency f142563a = new ImageDependency(null);
        }

        /* renamed from: a */
        public static ImageDependency m224769a() {
            return C57923a.f142563a;
        }

        private ImageDependency() {
            this.f142562a = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        }

        /* synthetic */ ImageDependency(C579031 r1) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ void m224770a(Context context, String str, ImageView imageView) {
            ImageLoader.with(context).load(new File(str)).into(imageView);
        }

        private String getLocalPath(String str, String str2, Integer num, Integer num2) {
            ICoreApi iCoreApi = this.f142562a;
            if (num.intValue() <= num2.intValue()) {
                num = num2;
            }
            return iCoreApi.getAvatarPath(str2, str, num.intValue(), ar.m236694a().getResources().getDisplayMetrics().density);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60905s
        /* renamed from: a */
        public Bitmap mo196403a(Context context, String str, String str2, int i, int i2) {
            if (!C63791b.m250468b()) {
                try {
                    return ImageLoader.with(context).load(AvatarImage.Builder.obtain(str, str2, i, i2).build()).asBitmap().centerCrop().getBitmap(i, i2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return null;
                } catch (ExecutionException e2) {
                    e2.printStackTrace();
                    return null;
                }
            } else {
                try {
                    String localPath = getLocalPath(str, str2, Integer.valueOf(i), Integer.valueOf(i2));
                    if (localPath != null) {
                        return ImageLoader.with(context).load(new File(localPath)).asBitmap().getBitmap(i2, i2);
                    }
                    return null;
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                    return null;
                } catch (ExecutionException e4) {
                    e4.printStackTrace();
                    return null;
                }
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60905s
        /* renamed from: a */
        public void mo196404a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
            if (!C63791b.m250468b()) {
                this.f142562a.loadAvatarImage(context, imageView, str, str2, new LoadParams().mo105413a(i).mo105422b(i2));
                return;
            }
            imageView.setTag(str);
            String localPath = getLocalPath(str, str2, Integer.valueOf(i), Integer.valueOf(i2));
            if (localPath != null && !localPath.isEmpty() && str.equals(imageView.getTag())) {
                C26171w.m94675a(new Runnable(context, localPath, imageView) {
                    /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$ImageDependency$vpDOggjUDw_sNrRJwOby3x8YFAo */
                    public final /* synthetic */ Context f$0;
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ ImageView f$2;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        SubDependencies.ImageDependency.lambda$vpDOggjUDw_sNrRJwOby3x8YFAo(this.f$0, this.f$1, this.f$2);
                    }
                });
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60905s
        /* renamed from: a */
        public void mo196405a(Context context, String str, String str2, ImageView imageView, int i, int i2, int i3, int i4) {
            AvatarImage build = AvatarImage.Builder.obtain(str, str2, i, i2).build();
            ImageLoader.with(context).load(AvatarImage.Builder.obtain(str, str2, i3, i4).build()).thumbnail(ImageLoader.with(context).load(build)).into(imageView);
        }
    }

    public static class LanguageDependency implements AbstractC60906t {

        /* renamed from: a */
        private final ICoreApi f142564a;

        /* renamed from: b */
        private final ConcurrentHashMap<AbstractC60880ae, AbstractC29540ab> f142565b;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$LanguageDependency$a */
        public static class C57925a {

            /* renamed from: a */
            public static final LanguageDependency f142568a = new LanguageDependency(null);
        }

        /* renamed from: a */
        public static LanguageDependency m224774a() {
            return C57925a.f142568a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60906t
        public Locale getCacheLanguageSetting() {
            return this.f142564a.getCacheLanguageSetting();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60906t
        public Locale getLanguageSetting() {
            return this.f142564a.getLanguageSetting();
        }

        private LanguageDependency() {
            ICoreApi iCoreApi;
            ConcurrentHashMap<AbstractC60880ae, AbstractC29540ab> concurrentHashMap = null;
            if (SubDependencies.m224720a()) {
                iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            } else {
                iCoreApi = null;
            }
            this.f142564a = iCoreApi;
            this.f142565b = SubDependencies.m224720a() ? new ConcurrentHashMap<>() : concurrentHashMap;
        }

        /* synthetic */ LanguageDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60906t
        public void registerLanguageChangeListener(final AbstractC60880ae aeVar) {
            C579241 r0 = new AbstractC29540ab() {
                /* class com.ss.android.lark.vcintegrator.SubDependencies.LanguageDependency.C579241 */

                @Override // com.ss.android.lark.biz.core.api.AbstractC29540ab
                public void onLanguageChange(Locale locale, Locale locale2) {
                    aeVar.onLanguageChange(locale, locale2);
                }
            };
            this.f142565b.put(aeVar, r0);
            this.f142564a.registerLanguageChangeListener(r0);
        }
    }

    public static class LarkAppDependency implements AbstractC60907u {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$LarkAppDependency$a */
        public static class C57926a {

            /* renamed from: a */
            public static final LarkAppDependency f142569a = new LarkAppDependency(null);
        }

        private LarkAppDependency() {
        }

        /* renamed from: a */
        public static LarkAppDependency m224775a() {
            return C57926a.f142569a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60907u
        /* renamed from: b */
        public String mo196409b() {
            return LarkContext.getApplication().getString(R.string.Lark_App_Name);
        }

        /* synthetic */ LarkAppDependency(C579031 r1) {
            this();
        }
    }

    public static class LifeCycleDependency implements AbstractC60908v {

        /* renamed from: a */
        ICoreApi f142570a;

        /* renamed from: b */
        Map<AbstractC60908v.AbstractC60909a, C29538a> f142571b;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$LifeCycleDependency$a */
        public static class C57929a {

            /* renamed from: a */
            public static final LifeCycleDependency f142576a = new LifeCycleDependency(null);
        }

        /* renamed from: a */
        public static LifeCycleDependency m224777a() {
            return C57929a.f142576a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60908v
        /* renamed from: b */
        public Activity mo196414b() {
            return this.f142570a.getLastTopActivity();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60908v
        /* renamed from: c */
        public boolean mo196415c() {
            return this.f142570a.isAppRealForeground();
        }

        private LifeCycleDependency() {
            this.f142570a = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            this.f142571b = new HashMap();
        }

        /* synthetic */ LifeCycleDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60908v
        /* renamed from: a */
        public void mo196411a(IGetDataCallback<Activity> iGetDataCallback) {
            this.f142570a.getLastTopActivity(iGetDataCallback);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60908v
        /* renamed from: a */
        public void mo196412a(final AbstractC60908v.AbstractC60910b bVar) {
            this.f142570a.addLifecycleObserver(new AbstractC29586u() {
                /* class com.ss.android.lark.vcintegrator.SubDependencies.LifeCycleDependency.C579271 */

                @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
                public void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                    bVar.onAppLifecycleChanged(LifeCycleDependency.this.mo196410a(aVar), LifeCycleDependency.this.mo196410a(aVar2));
                }
            });
        }

        @Override // com.ss.android.vc.dependency.AbstractC60908v
        public void addActivityObserver(final AbstractC60908v.AbstractC60909a aVar) {
            C579282 r0 = new C29538a() {
                /* class com.ss.android.lark.vcintegrator.SubDependencies.LifeCycleDependency.C579282 */

                @Override // com.ss.android.lark.biz.core.api.C29538a
                public void onActivityDestroyed(Activity activity) {
                    aVar.mo208389e(activity);
                }

                @Override // com.ss.android.lark.biz.core.api.C29538a
                public void onActivityPaused(Activity activity) {
                    aVar.mo208386c(activity);
                }

                @Override // com.ss.android.lark.biz.core.api.C29538a
                public void onActivityResumed(Activity activity) {
                    aVar.mo208384b(activity);
                }

                @Override // com.ss.android.lark.biz.core.api.C29538a
                public void onActivityStarted(Activity activity) {
                    aVar.mo208382a(activity);
                }

                @Override // com.ss.android.lark.biz.core.api.C29538a
                public void onActivityStopped(Activity activity) {
                    aVar.mo208387d(activity);
                }

                @Override // com.ss.android.lark.biz.core.api.C29538a
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    aVar.mo208383a(activity, bundle);
                }

                @Override // com.ss.android.lark.biz.core.api.C29538a
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    aVar.mo208385b(activity, bundle);
                }
            };
            this.f142570a.addActivityObserver(r0);
            this.f142571b.put(aVar, r0);
        }

        /* renamed from: a */
        public C60793b mo196410a(AbstractC29586u.C29587a aVar) {
            if (aVar != null) {
                return new C60793b(aVar.mo105885a(), aVar.mo105886b(), aVar.mo105887c(), aVar.mo105888d());
            }
            return null;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60908v
        public void removeActivityObserver(AbstractC60908v.AbstractC60909a aVar) {
            C29538a aVar2 = this.f142571b.get(aVar);
            if (aVar2 != null) {
                this.f142570a.removeActivityObserver(aVar2);
                this.f142571b.remove(aVar);
            }
        }
    }

    public static class LittleAppDependency implements AbstractC60911w {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$LittleAppDependency$a */
        public static class C57930a {

            /* renamed from: a */
            public static final LittleAppDependency f142577a = new LittleAppDependency(null);
        }

        private LittleAppDependency() {
        }

        /* renamed from: a */
        public static LittleAppDependency m224783a() {
            return C57930a.f142577a;
        }

        /* synthetic */ LittleAppDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60911w
        public void startLittleAppActivity(Context context, String str) {
            ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).startMiniProgramActivity(context, str, CommonCode.StatusCode.API_CLIENT_EXPIRED);
        }
    }

    public static class LoginChangeDependency implements AbstractC60912x {

        /* renamed from: a */
        ConcurrentHashMap<AbstractC60912x.AbstractC60913a, C28513a.AbstractC28514a> f142578a;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$LoginChangeDependency$a */
        public static class C57931a {

            /* renamed from: a */
            public static final LoginChangeDependency f142579a = new LoginChangeDependency(null);
        }

        /* renamed from: a */
        public static LoginChangeDependency m224784a() {
            return C57931a.f142579a;
        }

        private LoginChangeDependency() {
            ConcurrentHashMap<AbstractC60912x.AbstractC60913a, C28513a.AbstractC28514a> concurrentHashMap;
            if (SubDependencies.m224720a()) {
                concurrentHashMap = new ConcurrentHashMap<>();
            } else {
                concurrentHashMap = null;
            }
            this.f142578a = concurrentHashMap;
        }

        /* synthetic */ LoginChangeDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60912x
        public void addLoginChangeListener(AbstractC60912x.AbstractC60913a aVar) {
            $$Lambda$SubDependencies$LoginChangeDependency$j89F4xd7vp4mndD1gq0tmOaz6qU r0 = new C28513a.AbstractC28514a() {
                /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$LoginChangeDependency$j89F4xd7vp4mndD1gq0tmOaz6qU */

                @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
                public final void onLoginStatusChanged(int i) {
                    SubDependencies.LoginChangeDependency.lambda$j89F4xd7vp4mndD1gq0tmOaz6qU(AbstractC60912x.AbstractC60913a.this, i);
                }
            };
            this.f142578a.put(aVar, r0);
            C28513a.m104512a(r0);
        }

        public void removeLoginChangeListener(AbstractC60912x.AbstractC60913a aVar) {
            C28513a.AbstractC28514a remove = this.f142578a.remove(aVar);
            if (remove != null) {
                C28513a.m104515b(remove);
            }
            VideoChatModule.m235665i().mo208201c();
        }
    }

    public static class LoginDependency implements AbstractC60914y {

        /* renamed from: a */
        IPassportApi f142580a;

        /* renamed from: b */
        ConcurrentHashMap<AbstractC60885b, AbstractC49379a> f142581b;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$LoginDependency$a */
        public static class C57935a {

            /* renamed from: a */
            public static final LoginDependency f142588a = new LoginDependency(null);
        }

        /* renamed from: a */
        public static LoginDependency m224786a() {
            return C57935a.f142588a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60914y
        public String getPassportHost() {
            return C36882a.m145558b();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60914y
        public String getSession() {
            return this.f142580a.getSession();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60914y
        public String getTenantId() {
            return this.f142580a.getTenantId();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60914y
        public boolean isCustomer() {
            return this.f142580a.isCustomer();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60914y
        public boolean isLogin() {
            return this.f142580a.isLogin();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60914y
        /* renamed from: b */
        public String mo196420b() {
            return XDataCache.m224833a().mo196488c();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60914y
        /* renamed from: c */
        public boolean mo196421c() {
            if (XDataCache.m224833a().mo196491f() == 2) {
                return true;
            }
            return false;
        }

        private LoginDependency() {
            ConcurrentHashMap<AbstractC60885b, AbstractC49379a> concurrentHashMap;
            this.f142580a = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
            if (SubDependencies.m224720a()) {
                concurrentHashMap = new ConcurrentHashMap<>();
            } else {
                concurrentHashMap = null;
            }
            this.f142581b = concurrentHashMap;
        }

        /* synthetic */ LoginDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60914y
        public void registerAccountInterceptor(final IAccountInterceptor iAccountInterceptor) {
            this.f142580a.registerInterceptor(new com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor() {
                /* class com.ss.android.lark.vcintegrator.SubDependencies.LoginDependency.C579343 */

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor
                /* renamed from: c */
                public int mo144656c() {
                    return iAccountInterceptor.interceptOnConfirm();
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor
                /* renamed from: d */
                public int mo144657d() {
                    return iAccountInterceptor.mo208724a();
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor
                /* renamed from: a */
                public boolean mo144654a() {
                    VideoChatModule.getVideoChatService().interruptFloatLive();
                    return iAccountInterceptor.needIntercept();
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor
                /* renamed from: b */
                public AccountInterceptorBean mo144655b() {
                    C60874a detail = iAccountInterceptor.getDetail();
                    if (detail == null) {
                        return null;
                    }
                    return new AccountInterceptorBean(detail.mo208729a(), detail.mo208730b(), detail.mo208731c(), detail.mo208732d());
                }
            });
        }

        @Override // com.ss.android.vc.dependency.AbstractC60914y
        public void registerChangeObserver(final AbstractC60885b bVar) {
            new IAccountChangeObserver.AbstractC49385a() {
                /* class com.ss.android.lark.vcintegrator.SubDependencies.LoginDependency.C579332 */

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver.AbstractC49385a
                public void onAccountChange(LoginInfo loginInfo) {
                    String str;
                    AbstractC60885b bVar = bVar;
                    if (loginInfo == null) {
                        str = null;
                    } else {
                        str = loginInfo.getUserId();
                    }
                    bVar.onAccountChange(str);
                }
            };
            $$Lambda$SubDependencies$LoginDependency$6xDPU0ZGodrjOO_3COFIAnXs0Xo r0 = new AbstractC49379a() {
                /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$LoginDependency$6xDPU0ZGodrjOO_3COFIAnXs0Xo */

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
                    SubDependencies.LoginDependency.lambda$6xDPU0ZGodrjOO_3COFIAnXs0Xo(AbstractC60885b.this, dVar);
                }
            };
            this.f142581b.put(bVar, r0);
            this.f142580a.registerUserSwitchListener(r0);
        }

        public void unRegisterChangeObservers(AbstractC60885b bVar) {
            AbstractC49379a remove = this.f142581b.remove(bVar);
            if (remove != null) {
                this.f142580a.unregisterUserSwitchListener(remove);
            }
            VideoChatModule.m235665i().mo208197b();
        }

        /* renamed from: a */
        public static /* synthetic */ void m224787a(AbstractC60885b bVar, C49382d dVar) {
            bVar.onAccountChange(dVar.f123937c.getUserId());
        }

        @Override // com.ss.android.vc.dependency.AbstractC60914y
        public void simplifyLogin(Context context, String str, String str2) {
            this.f142580a.simplifyLogin(context, str, str2);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60914y
        public void guestLogin(Context context, String str, String str2, final MeetingPreviewGuestModel.IGuestLoginCallback iGuestLoginCallback) {
            this.f142580a.guestLogin(context, str, str2, new AbstractC49358c() {
                /* class com.ss.android.lark.vcintegrator.SubDependencies.LoginDependency.C579321 */
            });
        }

        @Override // com.ss.android.vc.dependency.AbstractC60914y
        public void logoutWithoutLogin(Context context, boolean z, String str, MeetingPreviewGuestModel.ILogoutCallback iLogoutCallback) {
            IPassportApi iPassportApi = this.f142580a;
            iLogoutCallback.getClass();
            iPassportApi.logoutWithoutLogin(context, z, str, new AbstractC49338a() {
                /* class com.ss.android.lark.vcintegrator.$$Lambda$xhX7L7FlGwKYHOrjti1Cd66FOIU */

                @Override // com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a
                public final void onResult(boolean z) {
                    MeetingPreviewGuestModel.ILogoutCallback.this.onResult(z);
                }
            });
        }
    }

    public static class MailDependency implements AbstractC60915z {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$MailDependency$a */
        public static class C57936a {

            /* renamed from: a */
            public static final MailDependency f142589a = new MailDependency(null);
        }

        private MailDependency() {
        }

        /* renamed from: a */
        public static MailDependency m224794a() {
            return C57936a.f142589a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60915z
        /* renamed from: b */
        public String mo196433b() {
            Profile profile = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getProfile();
            if (profile != null) {
                return profile.getEmail();
            }
            return "";
        }

        /* synthetic */ MailDependency(C579031 r1) {
            this();
        }
    }

    public static class MainDependency implements AbstractC60875aa {

        /* renamed from: a */
        ICoreApi f142590a;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$MainDependency$a */
        public static class C57937a {

            /* renamed from: a */
            public static final MainDependency f142591a = new MainDependency(null);
        }

        /* renamed from: a */
        public static MainDependency m224796a() {
            return C57937a.f142591a;
        }

        private MainDependency() {
            this.f142590a = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        }

        /* synthetic */ MainDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60875aa
        public void launchMainWindow(Context context) {
            this.f142590a.launchMainWindow(context);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60875aa
        public void notifyBootMileStoneFirstContentDraw(String str) {
            this.f142590a.notifyBootMileStoneFirstContentDraw(str);
        }

        public void notifyBootMileStoneFirstDataLoaded(String str) {
            this.f142590a.notifyBootMileStoneFirstDataLoaded(str);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60875aa
        public void notifyBootMileStoneFirstFrameDraw(String str) {
            this.f142590a.notifyBootMileStoneFirstFrameDraw(str);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60875aa
        /* renamed from: a */
        public void mo196434a(Activity activity, IGetDataCallback<List<Pair<String, View>>> iGetDataCallback) {
            this.f142590a.findTabViews(activity, iGetDataCallback);
        }
    }

    public static class MinutesDependency implements AbstractC60876ab {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$MinutesDependency$a */
        public static class C57938a {

            /* renamed from: a */
            public static final MinutesDependency f142592a = new MinutesDependency(null);
        }

        private MinutesDependency() {
        }

        /* renamed from: a */
        public static MinutesDependency m224798a() {
            return C57938a.f142592a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60876ab
        /* renamed from: c */
        public void mo196441c() {
            C39876a.m158359b().mo161089d();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60876ab
        /* renamed from: e */
        public void mo196443e() {
            C39876a.m158359b().mo161091f();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60876ab
        /* renamed from: g */
        public void mo196445g() {
            C39399a.m155624a().mo149307c();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60876ab
        /* renamed from: b */
        public boolean mo196440b() {
            return C39876a.m158359b().mo161088c();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60876ab
        /* renamed from: d */
        public boolean mo196442d() {
            return C39876a.m158359b().mo161090e();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60876ab
        /* renamed from: f */
        public boolean mo196444f() {
            return C39399a.m155624a().mo149306b();
        }

        /* synthetic */ MinutesDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60876ab
        /* renamed from: a */
        public void mo196439a(Context context) {
            C39876a.m158359b().mo161083a(context, 16);
        }
    }

    public static final class MultiTaskDependency implements AbstractC60877ac {

        /* renamed from: a */
        private final ICoreApi f142593a;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$MultiTaskDependency$a */
        public static class C57939a {

            /* renamed from: a */
            public static final MultiTaskDependency f142594a = new MultiTaskDependency(null);
        }

        /* renamed from: a */
        public static MultiTaskDependency m224806a() {
            return C57939a.f142594a;
        }

        private MultiTaskDependency() {
            this.f142593a = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60877ac
        /* renamed from: b */
        public boolean mo196453b() {
            return this.f142593a.isMultitaskEnabled(LarkContext.getApplication());
        }

        /* synthetic */ MultiTaskDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60877ac
        /* renamed from: a */
        public void mo196447a(View view) {
            this.f142593a.addAppFloatView(view);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60877ac
        /* renamed from: b */
        public void mo196451b(View view) {
            this.f142593a.removeAppFloatView(view);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60877ac
        /* renamed from: a */
        public void mo196449a(AbstractC60877ac.AbstractC60878a aVar) {
            if (aVar == null) {
                this.f142593a.setContentStandAloneCallback(null);
                return;
            }
            ICoreApi iCoreApi = this.f142593a;
            aVar.getClass();
            iCoreApi.setContentStandAloneCallback(new ContentStateChangeCallback() {
                /* class com.ss.android.lark.vcintegrator.$$Lambda$gLhn135JqhAGiCxZ3APbk_l9QRI */

                @Override // com.ss.android.lark.biz.core.api.ContentStateChangeCallback
                public final void onContentStateChanged(boolean z) {
                    AbstractC60877ac.AbstractC60878a.this.onChanged(z);
                }
            });
        }

        @Override // com.ss.android.vc.dependency.AbstractC60877ac
        /* renamed from: a */
        public void mo196450a(String str) {
            this.f142593a.removeCustomViewAppFloat(str);
        }

        @Override // com.ss.android.vc.dependency.AbstractC60877ac
        /* renamed from: b */
        public void mo196452b(View view, Activity activity) {
            if (activity instanceof AppCompatActivity) {
                this.f142593a.removeActivityFloatWindow(view, (AppCompatActivity) activity);
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60877ac
        /* renamed from: a */
        public void mo196448a(View view, Activity activity) {
            if (activity instanceof AppCompatActivity) {
                this.f142593a.addActivityFloatWindow(view, (AppCompatActivity) activity);
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60877ac
        /* renamed from: a */
        public void mo196446a(Drawable drawable, int[] iArr, String str, int i, Runnable runnable) {
            this.f142593a.addCustomViewAppFloat(drawable, iArr, str, i, runnable);
        }
    }

    public static class NotificationDependency implements AbstractC60879ad {

        /* renamed from: a */
        ICoreApi f142595a;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$NotificationDependency$a */
        public static class C57940a {

            /* renamed from: a */
            public static final NotificationDependency f142596a = new NotificationDependency(null);
        }

        /* renamed from: a */
        public static NotificationDependency m224815a() {
            return C57940a.f142596a;
        }

        private NotificationDependency() {
            this.f142595a = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        }

        /* synthetic */ NotificationDependency(C579031 r1) {
            this();
        }

        private String getChannelType(Integer num) {
            int intValue = num.intValue();
            if (intValue == 10003 || intValue == 10005) {
                return "at_v2";
            }
            return "normal_v2";
        }

        @Override // com.ss.android.vc.dependency.AbstractC60879ad
        public boolean isSoundOn(int i) {
            return this.f142595a.getNotificationSetting().mo105562c(getChannelType(Integer.valueOf(i)));
        }

        @Override // com.ss.android.vc.dependency.AbstractC60879ad
        public boolean isVibrateOn(int i) {
            return this.f142595a.getNotificationSetting().mo105561b(getChannelType(Integer.valueOf(i)));
        }

        @Override // com.ss.android.vc.dependency.AbstractC60879ad
        public void cancelPromptNotification(String str) {
            if (!TextUtils.isEmpty(str)) {
                Notice notice = new Notice();
                notice.key = str;
                notice.state = 3;
                notice.type = 10005;
                notice.extra = new Notice.Extra();
                this.f142595a.pushNotice(notice);
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60879ad
        public void cancelRingNotification(C61303k kVar) {
            if (kVar != null && !TextUtils.isEmpty(kVar.mo212054c())) {
                Notice notice = new Notice();
                notice.key = kVar.mo212054c();
                notice.state = 3;
                notice.type = 10003;
                notice.extra = new Notice.Extra();
                this.f142595a.pushNotice(notice);
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60879ad
        public void pushPromptNotification(String str) {
            if (!TextUtils.isEmpty(str)) {
                Notice notice = new Notice();
                notice.key = str;
                notice.state = 1;
                notice.type = 10005;
                notice.extra = new Notice.Extra();
                this.f142595a.pushNotice(notice);
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60879ad
        public void pushRingNotification(C61303k kVar) {
            if (kVar != null && !TextUtils.isEmpty(kVar.mo212054c())) {
                Notice notice = new Notice();
                notice.key = kVar.mo212054c();
                notice.state = 1;
                notice.type = 10003;
                notice.extra = new Notice.Extra();
                this.f142595a.pushNotice(notice);
            }
        }
    }

    public static class PreloadXMLDependency implements AbstractC60881af {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$PreloadXMLDependency$a */
        public static class C57941a {

            /* renamed from: a */
            public static final PreloadXMLDependency f142597a = new PreloadXMLDependency(null);
        }

        private PreloadXMLDependency() {
        }

        /* renamed from: a */
        public static PreloadXMLDependency m224816a() {
            return C57941a.f142597a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60881af
        public boolean isPreloadEnabled() {
            return SubDependencies.f142525a.isPreloadEnabled();
        }

        /* synthetic */ PreloadXMLDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60881af
        /* renamed from: a */
        public void mo196461a(Integer[] numArr) {
            if (SubDependencies.f142525a.isPreloadEnabled()) {
                C36443k.m143598a(LarkContext.getApplication()).mo134319a(numArr);
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60881af
        /* renamed from: a */
        public void mo196460a(Map<Integer, Integer> map) {
            AbstractC36428b.C36430b a = C36443k.m143598a(LarkContext.getApplication()).mo134295a();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                a.mo134297a(entry.getKey().intValue(), entry.getValue().intValue());
            }
            a.mo134298a(new FrameLayout(LarkContext.getApplication()));
            a.mo134299a();
        }
    }

    public static class ReactionDependency implements IReactionDependency {

        /* renamed from: a */
        IIMApi f142598a;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$ReactionDependency$a */
        public static class C57942a {

            /* renamed from: a */
            public static final ReactionDependency f142599a = new ReactionDependency(null);
        }

        /* renamed from: a */
        public static ReactionDependency m224819a() {
            return C57942a.f142599a;
        }

        @Override // com.ss.android.vc.dependency.IReactionDependency
        public List<String> getRecentReactionList() {
            return this.f142598a.getRecentReactionList();
        }

        @Override // com.ss.android.vc.dependency.IReactionDependency
        public List<String> getWholeReactionList() {
            return this.f142598a.getWholeReactionList();
        }

        @Override // com.ss.android.vc.dependency.IReactionDependency
        public void syncReactionOrder() {
            this.f142598a.syncReactionOrder();
        }

        private ReactionDependency() {
            this.f142598a = (IIMApi) ApiUtils.getApi(IIMApi.class);
        }

        /* synthetic */ ReactionDependency(C579031 r1) {
            this();
        }
    }

    public static class RichTextDependency implements IRichTextDependency {

        /* renamed from: a */
        IIMApi f142600a;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$RichTextDependency$a */
        public static class C57943a {

            /* renamed from: a */
            public static final RichTextDependency f142601a = new RichTextDependency(null);
        }

        /* renamed from: a */
        public static RichTextDependency m224820a() {
            return C57943a.f142601a;
        }

        private RichTextDependency() {
            this.f142600a = (IIMApi) ApiUtils.getApi(IIMApi.class);
        }

        /* synthetic */ RichTextDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.IRichTextDependency
        public RichText parsePbFromRichText(com.ss.android.lark.widget.richtext.RichText richText) {
            return this.f142600a.parsePbFromRichText(richText);
        }

        @Override // com.ss.android.vc.dependency.IRichTextDependency
        public com.ss.android.lark.widget.richtext.RichText parseRichTextFromPb(RichText richText) {
            return this.f142600a.getRichText(richText);
        }
    }

    public static class SettingDependency implements aj {

        /* renamed from: a */
        ICoreApi f142602a;

        /* renamed from: b */
        private final ConcurrentHashMap<aj.AbstractC60884a, ISettingsUpdateListener> f142603b;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$SettingDependency$a */
        public static class C57944a {

            /* renamed from: a */
            public static final SettingDependency f142604a = new SettingDependency(null);
        }

        /* renamed from: a */
        public static SettingDependency m224821a() {
            return C57944a.f142604a;
        }

        @Override // com.ss.android.vc.dependency.aj
        public long getSyncNtpTimeMillis() {
            return this.f142602a.getNtpTime();
        }

        private SettingDependency() {
            this.f142602a = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            this.f142603b = new ConcurrentHashMap<>();
        }

        @Override // com.ss.android.vc.dependency.aj
        public boolean is24Hour() {
            if (this.f142602a.getLocalTimeFormat().mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
                return true;
            }
            return false;
        }

        /* synthetic */ SettingDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.aj
        public boolean isNotificationShowDetail(boolean z) {
            return this.f142602a.isNotificationShowDetail(z);
        }

        @Override // com.ss.android.vc.dependency.aj
        /* renamed from: b */
        public void mo196469b(aj.AbstractC60884a aVar) {
            if (aVar != null) {
                this.f142602a.removeSettingsUpdateListener(this.f142603b.get(aVar));
            }
        }

        @Override // com.ss.android.vc.dependency.aj
        /* renamed from: a */
        public void mo196468a(aj.AbstractC60884a aVar) {
            if (aVar != null) {
                aVar.getClass();
                $$Lambda$kvmB8cgmhZ9YOkX0I6xRtUYutLI r0 = new ISettingsUpdateListener() {
                    /* class com.ss.android.lark.vcintegrator.$$Lambda$kvmB8cgmhZ9YOkX0I6xRtUYutLI */

                    @Override // com.ss.android.lark.biz.core.api.ISettingsUpdateListener
                    public final void onSettingsUpdate() {
                        aj.AbstractC60884a.this.mo208735a();
                    }
                };
                this.f142603b.put(aVar, r0);
                this.f142602a.addSettingsUpdateListener(r0);
            }
        }
    }

    public static class UGDependency implements ak {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$UGDependency$a */
        public static class C57945a {

            /* renamed from: a */
            public static final UGDependency f142605a = new UGDependency(null);
        }

        private UGDependency() {
        }

        /* renamed from: a */
        public static UGDependency m224824a() {
            return C57945a.f142605a;
        }

        @Override // com.ss.android.vc.dependency.ak
        /* renamed from: b */
        public void mo196473b() {
            SubDependencies.f142526b.launchMainWindow(ar.m236694a(), "videochat");
        }

        /* synthetic */ UGDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.ak
        public void checkAndStartFlow(IGetDataCallback<Boolean> iGetDataCallback) {
            SubDependencies.f142526b.checkAndStartFlow(iGetDataCallback);
        }
    }

    public static class VideoChatConfigDependency implements am {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$VideoChatConfigDependency$a */
        public static class C57946a {

            /* renamed from: a */
            public static final VideoChatConfigDependency f142606a = new VideoChatConfigDependency(null);
        }

        private VideoChatConfigDependency() {
        }

        /* renamed from: a */
        public static VideoChatConfigDependency m224826a() {
            return C57946a.f142606a;
        }

        /* synthetic */ VideoChatConfigDependency(C579031 r1) {
            this();
        }
    }

    public static class VoIpDependency implements an {

        /* renamed from: a */
        private final AbstractC58001a f142607a;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$VoIpDependency$a */
        public static class C57947a {

            /* renamed from: a */
            public static final VoIpDependency f142608a = new VoIpDependency(null);
        }

        /* renamed from: a */
        public static VoIpDependency m224827a() {
            return C57947a.f142608a;
        }

        public void disableByteRtcEncryption() {
            this.f142607a.mo196630c();
        }

        @Override // com.ss.android.vc.dependency.an
        public void initVoIp() {
            VoIpModuleProvider.m158862a().mo196596a();
        }

        @Override // com.ss.android.vc.dependency.an
        public boolean isRinging() {
            return this.f142607a.mo196634g();
        }

        @Override // com.ss.android.vc.dependency.an
        public boolean hasMeetingOngoing() {
            return VoIpModuleProvider.m158862a().mo196605e();
        }

        private VoIpDependency() {
            AbstractC58001a aVar;
            if (SubDependencies.m224720a()) {
                aVar = VoIpModuleProvider.m158862a().mo196604d();
            } else {
                aVar = null;
            }
            this.f142607a = aVar;
        }

        @Override // com.ss.android.vc.dependency.an
        public boolean isFloatIconShown() {
            if (this.f142607a.mo196632e() || this.f142607a.mo196633f()) {
                return true;
            }
            return false;
        }

        /* synthetic */ VoIpDependency(C579031 r1) {
            this();
        }
    }

    public static class WatermarkDependency implements ao {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$WatermarkDependency$a */
        public static class C57948a {

            /* renamed from: a */
            public static final WatermarkDependency f142609a = new WatermarkDependency(null);
        }

        private WatermarkDependency() {
        }

        /* renamed from: a */
        public static WatermarkDependency m224828a() {
            return C57948a.f142609a;
        }

        /* synthetic */ WatermarkDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.ao
        /* renamed from: a */
        public void mo196480a(FrameLayout frameLayout, int i) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).attachGlobalWatermark(frameLayout);
        }
    }

    public static class WschannelDependency implements ap {

        /* renamed from: a */
        ICoreApi f142610a;

        /* renamed from: b */
        private final Map<aq, NetworkLevelListener> f142611b;

        /* renamed from: c */
        private final ConcurrentHashMap<AbstractC60894j, WSConnState.AbstractC29537a> f142612c;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$WschannelDependency$a */
        public static class C57951a {

            /* renamed from: a */
            public static final WschannelDependency f142617a = new WschannelDependency(null);
        }

        /* renamed from: a */
        public static WschannelDependency m224830a() {
            return C57951a.f142617a;
        }

        public VCNetworkLevel getCurNetWorkLevel() {
            return mo196481a(this.f142610a.getCurNetWorkLevel());
        }

        private WschannelDependency() {
            ConcurrentHashMap concurrentHashMap;
            ICoreApi iCoreApi;
            ConcurrentHashMap<AbstractC60894j, WSConnState.AbstractC29537a> concurrentHashMap2 = null;
            if (SubDependencies.m224720a()) {
                concurrentHashMap = new ConcurrentHashMap();
            } else {
                concurrentHashMap = null;
            }
            this.f142611b = concurrentHashMap;
            if (SubDependencies.m224720a()) {
                iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            } else {
                iCoreApi = null;
            }
            this.f142610a = iCoreApi;
            this.f142612c = SubDependencies.m224720a() ? new ConcurrentHashMap<>() : concurrentHashMap2;
        }

        /* synthetic */ WschannelDependency(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.ap
        public void addConnStateListener(final AbstractC60894j jVar) {
            if (!this.f142612c.contains(jVar)) {
                C579491 r0 = new WSConnState.AbstractC29537a() {
                    /* class com.ss.android.lark.vcintegrator.SubDependencies.WschannelDependency.C579491 */

                    @Override // com.ss.android.lark.biz.core.api.WSConnState.AbstractC29537a
                    /* renamed from: a */
                    public void mo102563a(WSConnState.ConnState connState) {
                        boolean z;
                        AbstractC60894j jVar = jVar;
                        if (connState == null || connState != WSConnState.ConnState.Connected) {
                            z = false;
                        } else {
                            z = true;
                        }
                        jVar.onConnStateChanged(z);
                    }
                };
                this.f142612c.put(jVar, r0);
                this.f142610a.addConnStateListener(r0);
            }
        }

        @Override // com.ss.android.vc.dependency.ap
        public void registerNetworkLevelListener(final aq aqVar) {
            if (aqVar != null) {
                C579502 r0 = new NetworkLevelListener() {
                    /* class com.ss.android.lark.vcintegrator.SubDependencies.WschannelDependency.C579502 */

                    @Override // com.ss.android.lark.biz.core.api.NetworkLevelListener
                    public void onNetworkLevelChanged(NetworkLevelListener.NetworkLevel networkLevel) {
                        aqVar.onNetworkLevelChanged(WschannelDependency.this.mo196481a(networkLevel));
                    }
                };
                this.f142610a.registerNetworkLevelListener(r0);
                this.f142611b.put(aqVar, r0);
            }
        }

        public void removeConnStateListener(AbstractC60894j jVar) {
            WSConnState.AbstractC29537a remove = this.f142612c.remove(jVar);
            if (remove != null) {
                this.f142610a.removeConnStateListener(remove);
            }
            VideoChatModule.m235665i().mo208187a();
        }

        @Override // com.ss.android.vc.dependency.ap
        public void unRegisterNetworkLevelListener(aq aqVar) {
            if (aqVar != null) {
                this.f142610a.unRegisterNetworkLevelListener(this.f142611b.remove(aqVar));
            }
        }

        /* renamed from: a */
        public VCNetworkLevel mo196481a(NetworkLevelListener.NetworkLevel networkLevel) {
            int i = C579031.f142527a[networkLevel.ordinal()];
            if (i == 1) {
                return VCNetworkLevel.NET_UNAVAILABLE;
            }
            if (i == 2) {
                return VCNetworkLevel.WEAK;
            }
            if (i == 3) {
                return VCNetworkLevel.EXCELLENT;
            }
            if (i == 4) {
                return VCNetworkLevel.SERVICE_UNAVAILABLE;
            }
            if (i != 5) {
                return null;
            }
            return VCNetworkLevel.EVALUATING;
        }
    }

    /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$a */
    public static class C57954a implements AbstractC60886c {

        /* renamed from: a */
        public final List<AbstractC60886c.AbstractC60887a> f142629a;

        /* renamed from: b */
        public final Object f142630b;

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$a$a */
        public static class C57956a {

            /* renamed from: a */
            public static final C57954a f142632a = new C57954a(null);
        }

        /* renamed from: a */
        public static C57954a m224843a() {
            return C57956a.f142632a;
        }

        private C57954a() {
            this.f142629a = new ArrayList();
            this.f142630b = new Object();
            ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            if (iCoreApi.getUiModeService().mo105602a()) {
                iCoreApi.getUiModeService().mo105601a(new IUiModeService.UiModeChangeListener() {
                    /* class com.ss.android.lark.vcintegrator.SubDependencies.C57954a.C579551 */

                    @Override // com.ss.android.lark.biz.core.api.IUiModeService.UiModeChangeListener
                    public void onNightModeChange(int i) {
                        synchronized (C57954a.this.f142630b) {
                            for (AbstractC60886c.AbstractC60887a aVar : C57954a.this.f142629a) {
                                aVar.mo208747a(i);
                            }
                        }
                    }
                });
            }
        }

        /* synthetic */ C57954a(C579031 r1) {
            this();
        }

        @Override // com.ss.android.vc.dependency.AbstractC60886c
        /* renamed from: b */
        public void mo196508b(AbstractC60886c.AbstractC60887a aVar) {
            synchronized (this.f142630b) {
                this.f142629a.remove(aVar);
            }
        }

        @Override // com.ss.android.vc.dependency.AbstractC60886c
        /* renamed from: a */
        public void mo196507a(AbstractC60886c.AbstractC60887a aVar) {
            synchronized (this.f142630b) {
                if (!this.f142629a.contains(aVar)) {
                    this.f142629a.add(aVar);
                }
            }
        }
    }

    /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$b */
    public static class C57957b implements AbstractC60904r {

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$b$a */
        public static class C57958a {

            /* renamed from: a */
            public static final C57957b f142633a = new C57957b();
        }

        /* renamed from: a */
        public static C57957b m224846a() {
            return C57958a.f142633a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60904r
        /* renamed from: b */
        public AbstractC13978a mo196509b() {
            return C14018a.m56755a(LarkContext.getApplication(), "");
        }
    }

    /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$c */
    public static class C57959c implements AbstractC60882ag {

        /* renamed from: a */
        ICoreApi f142634a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

        /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$c$a */
        public static class C57960a {

            /* renamed from: a */
            public static final C57959c f142635a = new C57959c();
        }

        /* renamed from: a */
        public static C57959c m224848a() {
            return C57960a.f142635a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60882ag
        /* renamed from: b */
        public boolean mo196512b() {
            return this.f142634a.isOpenUserCustomStatus();
        }

        /* renamed from: a */
        private List<Chatter.ChatterCustomStatus> m224849a(List<ChatterCustomStatus> list) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    ChatterCustomStatus chatterCustomStatus = list.get(i);
                    arrayList.add(new Chatter.ChatterCustomStatus(chatterCustomStatus.getTitle(), chatterCustomStatus.getIconKey(), "", Boolean.valueOf(chatterCustomStatus.isNotDisturbMode()), new StatusEffectiveInterval(Long.valueOf(chatterCustomStatus.getEffectiveInterval().getStartTime()), Long.valueOf(chatterCustomStatus.getEffectiveInterval().getEndTime()), Boolean.valueOf(chatterCustomStatus.getEffectiveInterval().isShowEndTime()))));
                }
            }
            return arrayList;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60882ag
        /* renamed from: a */
        public void mo196510a(String str, AbstractC60882ag.AbstractC60883a aVar) {
            C60735ab.m236018e(new Runnable(str, aVar) {
                /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$c$b3EFQYXA5Ns5B3xjCRNJBQcKh1g */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ AbstractC60882ag.AbstractC60883a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    SubDependencies.C57959c.lambda$b3EFQYXA5Ns5B3xjCRNJBQcKh1g(SubDependencies.C57959c.this, this.f$1, this.f$2);
                }
            });
        }

        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m224853b(List list, AbstractC60882ag.AbstractC60883a aVar) {
            String str;
            Chatter.ChatterCustomStatus openedUserStatus = this.f142634a.getOpenedUserStatus(m224849a(list));
            if (openedUserStatus != null) {
                str = openedUserStatus.icon_key;
            } else {
                str = "";
            }
            C60735ab.m236001a(new Runnable(str) {
                /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$c$dy4kqyEniPJhk11wWZkwh11Sc */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    SubDependencies.C57959c.m271060lambda$dy4kqyEniPJhk11wWZkwh11Sc(AbstractC60882ag.AbstractC60883a.this, this.f$1);
                }
            });
        }

        @Override // com.ss.android.vc.dependency.AbstractC60882ag
        /* renamed from: a */
        public void mo196511a(List<ChatterCustomStatus> list, AbstractC60882ag.AbstractC60883a aVar) {
            C60735ab.m236018e(new Runnable(list, aVar) {
                /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$c$AIamts2gAMOEOS6lbBtyFevMUH0 */
                public final /* synthetic */ List f$1;
                public final /* synthetic */ AbstractC60882ag.AbstractC60883a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    SubDependencies.C57959c.lambda$AIamts2gAMOEOS6lbBtyFevMUH0(SubDependencies.C57959c.this, this.f$1, this.f$2);
                }
            });
        }

        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m224852b(String str, AbstractC60882ag.AbstractC60883a aVar) {
            Chatter.ChatterCustomStatus chatterCustomStatus;
            String str2;
            com.ss.android.lark.chat.entity.chatter.Chatter chatterById = ChatDependency.m224728a().getChatterById(str);
            if (chatterById == null) {
                chatterCustomStatus = null;
            } else {
                chatterCustomStatus = this.f142634a.getOpenedUserStatus(m224849a(chatterById.getCustomStatus()));
            }
            if (chatterCustomStatus != null) {
                str2 = chatterCustomStatus.icon_key;
            } else {
                str2 = "";
            }
            C60735ab.m236001a(new Runnable(str2) {
                /* class com.ss.android.lark.vcintegrator.$$Lambda$SubDependencies$c$FpGmwIY7NrbAzPtPFdk3E9fvrk */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    SubDependencies.C57959c.m271059lambda$FpGmwIY7NrbAzPtPFdk3E9fvrk(AbstractC60882ag.AbstractC60883a.this, this.f$1);
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m224720a() {
        return C26252ad.m94993b(LarkContext.getApplication());
    }

    /* renamed from: com.ss.android.lark.vcintegrator.SubDependencies$1 */
    public static /* synthetic */ class C579031 {

        /* renamed from: a */
        static final /* synthetic */ int[] f142527a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel[] r0 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.vcintegrator.SubDependencies.C579031.f142527a = r0
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.NET_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.vcintegrator.SubDependencies.C579031.f142527a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.WEAK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.vcintegrator.SubDependencies.C579031.f142527a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.EXCELLENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.vcintegrator.SubDependencies.C579031.f142527a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.SERVICE_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.vcintegrator.SubDependencies.C579031.f142527a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.EVALUATING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.vcintegrator.SubDependencies.C579031.<clinit>():void");
        }
    }
}
