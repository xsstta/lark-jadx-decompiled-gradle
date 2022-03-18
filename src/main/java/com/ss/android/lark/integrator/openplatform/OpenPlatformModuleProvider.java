package com.ss.android.lark.integrator.openplatform;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ee.appstrategy.p240a.C4145c;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.plugin_annotation.bean.LKOpenApiBizDomain;
import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.webapp.AbstractC13753a;
import com.bytedance.ee.webapp.AbstractC13762b;
import com.bytedance.ee.webapp.AbstractC13794f;
import com.bytedance.ee.webapp.C13805h;
import com.bytedance.ee.webapp.C13808i;
import com.bytedance.ee.webapp.Source;
import com.bytedance.ee.webapp.dto.SessionInfo;
import com.bytedance.ee.webapp.v2.WebAppContainerDelegate;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.openplatform.core.p1106a.C24401b;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.component.webview.container.dto.C25830a;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.appcenter.business.activity.appdetail.AppDetailActivity;
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.p1262a.p1264b.C27552a;
import com.ss.android.appcenter.p1262a.p1264b.C27554b;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.appstrategy.service.AbstractC29242a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.aq;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.p1413a.C29642a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.impl.C29927b;
import com.ss.android.lark.browser.impl.C29939f;
import com.ss.android.lark.browser.p1411a.C29639e;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider;
import com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider;
import com.ss.android.lark.integrator.littleapp.C39824h;
import com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider;
import com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider;
import com.ss.android.lark.integrator.openplatform.plugin.LocationUpdatePlugin;
import com.ss.android.lark.integrator.openplatform.share.impl.ShareAppForwardFactory;
import com.ss.android.lark.integrator.p2020g.C39418a;
import com.ss.android.lark.integrator.p2020g.C39419b;
import com.ss.android.lark.integrator.plugin.GetUserInfoExPlugin;
import com.ss.android.lark.integrator.plugin.UGSharePlugin;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.service.ILittleAppService;
import com.ss.android.lark.littleapp.tempinfra.dependency.CommonDependencyImpl;
import com.ss.android.lark.littleapp.tempinfra.dependency.NetworkDependencyImpl;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.openapi.jsapi.AbstractC48762d;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.openplatform.openapp.BotOpenData;
import com.ss.android.lark.openplatform.openapp.ID_TYPE;
import com.ss.android.lark.openplatform.p2399a.AbstractC48793a;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppDataV2;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppType;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.openbusiness.AbstractC59446a;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.event.p3008a.C59597e;
import ee.android.framework.manis.p3450a.C68182c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

public class OpenPlatformModuleProvider {

    /* renamed from: a */
    public static volatile OpenPlatformModule f101614a;

    /* renamed from: b */
    public static ICoreApi f101615b = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: c */
    public static IIMApi f101616c = ((IIMApi) ApiUtils.getApi(IIMApi.class));

    /* renamed from: d */
    public static IPassportApi f101617d = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));

    @ClaymoreImpl(AbstractC48793a.class)
    public static class OpenPlatformModuleDependencyImpl implements AbstractC48793a {
        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void auditInitSdk() {
            OpenPlatformModuleProvider.f101616c.initAuditSdk();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public AbstractC48793a.AbstractC48794a getAppCenterDependency() {
            return new AbstractC48793a.AbstractC48794a() {
                /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399338 */

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48794a
                /* renamed from: a */
                public void mo144967a(Context context) {
                    AppCenterModuleProvider.m154360a().mo103300a(context);
                }
            };
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public AbstractC48793a.AbstractC48796c getBrowserDependency() {
            return new AbstractC48793a.AbstractC48796c() {
                /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399274 */

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48796c
                /* renamed from: a */
                public String mo144948a() {
                    return OpenPlatformModuleProvider.f101615b.getOpenApiUrl();
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48796c
                /* renamed from: c */
                public void mo144957c(String str) {
                    C29927b.m110647a(C29638a.m109622a().getLoginDependency(), str);
                }

                /* renamed from: a */
                private C13808i m158490a(final C27552a aVar) {
                    if (aVar == null) {
                        return null;
                    }
                    C13808i iVar = new C13808i();
                    iVar.mo50872a(aVar.f68762b);
                    iVar.mo50874a(aVar.f68761a);
                    iVar.mo50875a(aVar.f68763c);
                    iVar.mo50883e(aVar.f68764d);
                    iVar.mo50881d(aVar.f68765e);
                    iVar.mo50877b(aVar.f68766f);
                    iVar.mo50878c(aVar.f68767g);
                    iVar.mo50873a(new View.OnClickListener() {
                        /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399274.View$OnClickListenerC399292 */

                        public void onClick(View view) {
                            aVar.f68768h.onClick(null);
                        }
                    });
                    return iVar;
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48796c
                /* renamed from: b */
                public C13808i mo144956b(String str) {
                    List<C27552a> a = AppCenterModuleProvider.m154360a().mo103298a(LarkContext.getApplication(), str);
                    if (a == null) {
                        return null;
                    }
                    for (C27552a aVar : a) {
                        if (aVar.f68762b == 6) {
                            return m158490a(aVar);
                        }
                    }
                    return null;
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48796c
                /* renamed from: a */
                public boolean mo144955a(String str) {
                    return C37239a.m146648b().mo136951a(str);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m158491a(AbstractC13753a aVar, C27552a aVar2) {
                    aVar.mo50713a(m158490a(aVar2));
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48796c
                /* renamed from: a */
                public void mo144951a(Context context, String str) {
                    OpenPlatformModuleProvider.f101615b.openUrl(context, str);
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48796c
                /* renamed from: a */
                public void mo144953a(String str, AbstractC13753a aVar) {
                    AppCenterModuleProvider.m154360a().mo103308a(str, new C27554b.AbstractC27562b(aVar) {
                        /* class com.ss.android.lark.integrator.openplatform.$$Lambda$OpenPlatformModuleProvider$OpenPlatformModuleDependencyImpl$4$n1AqNZZ3HYVzK5J2pFq8VLMbqqw */
                        public final /* synthetic */ AbstractC13753a f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // com.ss.android.appcenter.p1262a.p1264b.C27554b.AbstractC27562b
                        public final void onSuccess(C27552a aVar) {
                            OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399274.this.m158491a((OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399274) this.f$1, (AbstractC13753a) aVar);
                        }
                    });
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48796c
                /* renamed from: a */
                public void mo144954a(String str, IGetDataCallback<String> iGetDataCallback) {
                    C29638a.m109622a().getManisDependency().mo107702b(str, iGetDataCallback);
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48796c
                /* renamed from: a */
                public ArrayList<C25838g> mo144949a(Activity activity, Fragment fragment, final AbstractC13794f.AbstractC13797c cVar) {
                    return C29638a.m109622a().getKAShareDependency().mo107730a(activity, fragment, new IBrowserModuleDependency.AbstractC29897m() {
                        /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399274.C399281 */

                        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29897m
                        public void itemClicked(int i) {
                            cVar.itemClicked(i);
                        }
                    });
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48796c
                /* renamed from: a */
                public void mo144952a(Context context, String str, String str2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("app_id", str2);
                    OpenPlatformModuleProvider.f101615b.openUrl(context, str, UrlParams.m108857a().mo105516a(bundle).mo105523a());
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48796c
                /* renamed from: a */
                public void mo144950a(Activity activity, String str, String str2, String str3, String str4, String str5) {
                    if (activity == null) {
                        Log.m165383e("OpenPlatformModuleProvider", "gotoSharedH5Page, activity is null");
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
            };
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public Context getContext() {
            return LarkContext.getApplication();
        }

        public String getDeviceId() {
            return OpenPlatformModuleProvider.f101617d.getDeviceId();
        }

        public AbstractC48793a.AbstractC48797d getDocDependency() {
            return new AbstractC48793a.AbstractC48797d() {
                /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399305 */
            };
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public AbstractC48793a.AbstractC48798e getGadgetDependency() {
            return new AbstractC48793a.AbstractC48798e() {
                /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399316 */

                /* renamed from: b */
                private final ILittleAppService f101630b = LittleAppModuleProvider.m157932a().mo148943b();

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48798e
                /* renamed from: a */
                public void mo144960a() {
                    this.f101630b.mo149144a();
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48798e
                /* renamed from: a */
                public int mo144959a(int i) {
                    return this.f101630b.mo149141a(i);
                }

                /* renamed from: a */
                private int m158502a(Source source) {
                    if (source == null) {
                        return 1000;
                    }
                    if (source.getValue() == UrlParams.Source.APP_CARD_FOOTER_LINK.getValue()) {
                        return 1511;
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
                    if (source.getValue() != UrlParams.Source.APP_P2P_CHAT.getValue() && source.getValue() == UrlParams.Source.APP_GROUP_CHAT.getValue()) {
                    }
                    return 1000;
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48798e
                /* renamed from: a */
                public void mo144961a(Context context, String str, Source source) {
                    this.f101630b.mo149151a(context, str, m158502a(source));
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48798e
                /* renamed from: a */
                public void mo144962a(Context context, String str, String str2, int i) {
                    this.f101630b.mo149152a(context, str, str2, i);
                }
            };
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public Locale getLanguageSetting() {
            return OpenPlatformModuleProvider.f101615b.getLanguageSetting();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public Activity getLastTopActivity() {
            return OpenPlatformModuleProvider.f101615b.getLastTopActivity();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public String getLocale() {
            return C28183g.m103240a();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public AbstractC48793a.AbstractC48799f getMainDependency() {
            return new AbstractC48793a.AbstractC48799f() {
                /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399327 */

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48799f
                /* renamed from: a */
                public TabType mo144963a(String str) {
                    return OpenPlatformModuleProvider.f101615b.getTabType(str);
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48799f
                /* renamed from: b */
                public void mo144964b(String str) {
                    OpenPlatformModuleProvider.f101615b.notifyBootMileStoneFirstDataLoaded(str);
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48799f
                /* renamed from: c */
                public void mo144965c(String str) {
                    OpenPlatformModuleProvider.f101615b.notifyBootMileStoneFirstFrameDraw(str);
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48799f
                /* renamed from: d */
                public void mo144966d(String str) {
                    OpenPlatformModuleProvider.f101615b.notifyBootMileStoneFirstContentDraw(str);
                }
            };
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public OpenPlatformModule getModule() {
            return OpenPlatformModuleProvider.m158457a();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public AbstractC25990b getOkHttpClient() {
            return OpenPlatformModuleProvider.f101615b.getLarkHttpClient();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public String getOpenAppHost() {
            return DynamicConfigModule.m145551a(DomainSettings.Alias.OPEN_APPCENTER3);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public String getOpenHost() {
            return DynamicConfigModule.m145551a(DomainSettings.Alias.OPEN);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public String getSession() {
            return OpenPlatformModuleProvider.f101617d.getSession();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public AbstractC13794f.AbstractC13798d getTenantCertDependency() {
            return new C39418a();
        }

        public String getTenantCode() {
            return OpenPlatformModuleProvider.f101617d.getTenantCode();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public String getTenantId() {
            return OpenPlatformModuleProvider.f101617d.getTenantId();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public AbstractC13794f.AbstractC13799e getUrlIntercepterDependency() {
            return new AbstractC13794f.AbstractC13799e() {
                /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399252 */

                @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13799e
                /* renamed from: a */
                public boolean mo50858a(String str) {
                    return C29639e.m109680a(str);
                }

                @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13799e
                /* renamed from: a */
                public boolean mo50857a(Context context, String str) {
                    return C29639e.m109678a(context, str);
                }
            };
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public String getUserId() {
            return OpenPlatformModuleProvider.f101617d.getUserId();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public C25830a getWebAppInjector() {
            return OpenPlatformModuleProvider.f101615b.getWebAppInjector();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public AbstractC13794f.AbstractC13800f getWebLeanModeDependency() {
            return new AbstractC13794f.AbstractC13800f() {
                /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.AnonymousClass10 */

                @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13800f
                /* renamed from: a */
                public boolean mo50861a() {
                    return C29939f.m110697a().mo107815b();
                }

                @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13800f
                /* renamed from: a */
                public void mo50859a(Activity activity) {
                    C29939f.m110697a().mo107814b(activity);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m158479a(Activity activity, AbstractInjectWebViewDelegate.AbstractC25823a aVar) {
                    C29939f.m110697a().mo107812a(activity);
                    C29939f.m110697a().mo107813a(new Runnable() {
                        /* class com.ss.android.lark.integrator.openplatform.$$Lambda$OpenPlatformModuleProvider$OpenPlatformModuleDependencyImpl$10$J5_26f8Qi8p8vch73DUs1YtjOC4 */

                        public final void run() {
                            AbstractInjectWebViewDelegate.AbstractC25823a.this.proceed();
                        }
                    });
                }

                @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13800f
                /* renamed from: a */
                public void mo50860a(AbstractInjectWebViewDelegate.AbstractC25823a aVar, Activity activity) {
                    new Handler(Looper.getMainLooper()).post(new Runnable(activity, aVar) {
                        /* class com.ss.android.lark.integrator.openplatform.$$Lambda$OpenPlatformModuleProvider$OpenPlatformModuleDependencyImpl$10$dhcRJRxlksbqxaBjHORZvgWr2I */
                        public final /* synthetic */ Activity f$0;
                        public final /* synthetic */ AbstractInjectWebViewDelegate.AbstractC25823a f$1;

                        {
                            this.f$0 = r1;
                            this.f$1 = r2;
                        }

                        public final void run() {
                            OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.AnonymousClass10.m158479a(this.f$0, this.f$1);
                        }
                    });
                }
            };
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public AbstractC48762d getWebPermissionChecker() {
            return new C29642a();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public AbstractC13794f.AbstractC13801g getWebTranslateDependency() {
            return new C39419b();
        }

        public boolean isLogin() {
            return OpenPlatformModuleProvider.f101617d.isLogin();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public boolean isOverseaTenantBrand() {
            return OpenPlatformModuleProvider.f101617d.isOverseaTenantBrand();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public boolean canOpenWorkplace() {
            return OpenPlatformModuleProvider.f101615b.isTabEnable("appCenter");
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public String getAppEnv() {
            if (OpenPlatformModuleProvider.f101617d.envType() != 2) {
                return "release";
            }
            return "staging";
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public String getAppVersionName() {
            return C26246a.m94977a(getContext());
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public boolean isDeskTopMode() {
            return DesktopUtil.m144301a(LarkContext.getApplication());
        }

        public boolean isNetWorkAvailable() {
            return NetworkUtils.isNetworkAvailable(LarkContext.getApplication());
        }

        public boolean isStagingEnv() {
            if (OpenPlatformModuleProvider.f101617d.envType() == 2) {
                return true;
            }
            return false;
        }

        public HashMap<String, SessionInfo> getSessions() {
            Map<String, com.ss.android.lark.passport.signinsdk_api.account.SessionInfo> sessions = OpenPlatformModuleProvider.f101617d.getSessions();
            HashMap<String, SessionInfo> hashMap = new HashMap<>(sessions.size());
            for (String str : sessions.keySet()) {
                com.ss.android.lark.passport.signinsdk_api.account.SessionInfo sessionInfo = sessions.get(str);
                if (sessionInfo != null) {
                    hashMap.put(str, new SessionInfo(sessionInfo.getHostUrl(), sessionInfo.getSessionName(), sessionInfo.getSession()));
                }
            }
            return hashMap;
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public List<LKPluginConfig> getAllPluginConfigs() {
            LinkedList linkedList = new LinkedList();
            linkedList.add(new LKPluginConfig.C25571a().mo88746a(LocationUpdatePlugin.class).mo88748a(Arrays.asList("startLocationUpdate", "stopLocationUpdate")).mo88742a(PluginEnv.APP_ENV).mo88749a());
            linkedList.addAll(OpenPlatformModule.m192199g());
            linkedList.addAll(C41354g.m163941i());
            linkedList.addAll(OpenPlatformModuleProvider.f101616c.getAllPluginConfigs());
            linkedList.add(new LKPluginConfig.C25571a().mo88745a(new GetUserInfoExPlugin()).mo88741a(LKOpenApiBizDomain.MESSENGER).mo88749a());
            linkedList.add(new LKPluginConfig.C25571a().mo88745a(new UGSharePlugin()).mo88741a(LKOpenApiBizDomain.MESSENGER).mo88749a());
            linkedList.addAll(C29638a.m109629h());
            linkedList.addAll(AppCenterModule.m107049k());
            return linkedList;
        }

        public void sendEvent(String str) {
            Statistics.sendEvent(str);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public boolean checkToShow(String str) {
            return OpenPlatformModuleProvider.f101615b.checkToShow(str);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void completeGuide(String str) {
            OpenPlatformModuleProvider.f101615b.completeGuide(str);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public String getDynamicDomain(DomainSettings.Alias alias) {
            return DynamicConfigModule.m145551a(alias);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void getTriggerCode(Function1<? super String, Unit> function1) {
            OpenPlatformModuleProvider.f101616c.getTriggerCode(function1);
        }

        public String getUrlFromKey(String str) {
            return OpenPlatformModuleProvider.f101615b.getResUrlByResKey(str, -1, -1);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public boolean isFeatureOn(String str) {
            return OpenPlatformModuleProvider.f101615b.isOn(str);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void openWorkplace(Context context) {
            OpenPlatformModuleProvider.f101615b.launchMainWindow(context, "appCenter");
        }

        public Map<String, Chat> syncGetChatsByIds(List<String> list) {
            return OpenPlatformModuleProvider.f101616c.syncGetChatsByIds(list);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void auditOpenMiniAppEvent(String str) {
            if (str != null) {
                OpenPlatformModuleProvider.f101616c.auditOpenMiniAppEvent(str);
            } else {
                C13479a.m54758a("OpenPlatformModuleProvider", "webapp auditOpenMiniAppEvent , appId is null");
            }
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public boolean getFgValue(String str) {
            return C37239a.m146648b().mo136952a(str, getFgDefault(str));
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void onContainerCreated(WebAppContainerDelegate webAppContainerDelegate) {
            C13805h.m55929a().mo50867a(new AbstractC13762b() {
                /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399263 */

                @Override // com.bytedance.ee.webapp.AbstractC13762b
                /* renamed from: b */
                public void mo50750b(WebView webView, Context context, String str, Map<String, String> map) {
                    for (aq aqVar : OpenPlatformModuleProvider.f101615b.getWebLifecycleListeners().values()) {
                        if (aqVar != null) {
                            aqVar.mo102650b(webView, context, str, map);
                        }
                    }
                }

                @Override // com.bytedance.ee.webapp.AbstractC13762b
                /* renamed from: a */
                public void mo50749a(WebView webView, Context context, String str, Map<String, String> map) {
                    for (aq aqVar : OpenPlatformModuleProvider.f101615b.getWebLifecycleListeners().values()) {
                        if (aqVar != null) {
                            aqVar.mo102649a(webView, context, str, map);
                        }
                    }
                }

                @Override // com.bytedance.ee.webapp.AbstractC13762b
                /* renamed from: a */
                public void mo50747a(WebView webView, Context context, String str, SslError sslError, Map<String, String> map) {
                    for (aq aqVar : OpenPlatformModuleProvider.f101615b.getWebLifecycleListeners().values()) {
                        if (aqVar != null) {
                            aqVar.mo102647a(webView, context, str, sslError, map);
                        }
                    }
                }

                @Override // com.bytedance.ee.webapp.AbstractC13762b
                /* renamed from: a */
                public void mo50748a(WebView webView, Context context, String str, String str2, Map<String, String> map) {
                    for (aq aqVar : OpenPlatformModuleProvider.f101615b.getWebLifecycleListeners().values()) {
                        if (aqVar != null) {
                            aqVar.mo102648a(webView, context, str, str2, map);
                        }
                    }
                }
            });
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void registerWebLifecycleListener(final AbstractC48793a.AbstractC48800g gVar) {
            OpenPlatformModuleProvider.f101615b.registerWebLifecycleListener(new aq() {
                /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399349 */

                @Override // com.ss.android.lark.biz.core.api.aq
                /* renamed from: a */
                public void mo102647a(WebView webView, Context context, String str, SslError sslError, Map<String, String> map) {
                }

                @Override // com.ss.android.lark.biz.core.api.aq
                /* renamed from: a */
                public void mo102648a(WebView webView, Context context, String str, String str2, Map<String, String> map) {
                }

                @Override // com.ss.android.lark.biz.core.api.aq
                /* renamed from: b */
                public void mo102650b(WebView webView, Context context, String str, Map<String, String> map) {
                    gVar.mo170523a(webView, context, str, map);
                }

                @Override // com.ss.android.lark.biz.core.api.aq
                /* renamed from: a */
                public void mo102649a(WebView webView, Context context, String str, Map<String, String> map) {
                    AppStrategyModuleProvider.m154406a().mo103648c().mo103698a(webView, context, str, map);
                    gVar.mo170524b(webView, context, str, map);
                }
            });
        }

        private boolean getFgDefault(String str) {
            Boolean bool = OpenPlatformModule.m192196b().get(str);
            if (bool == null) {
                C13479a.m54775e("OpenPlatformModuleProvider", "getFgDefault " + str + "not in the map so return true");
                bool = Boolean.TRUE;
            }
            return bool.booleanValue();
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void launchMainWindow(Fragment fragment) {
            Bundle arguments = fragment.getArguments();
            if (arguments != null && UrlParams.Source.getSource(arguments.getInt(ShareHitPoint.f121868c, UrlParams.Source.APP.getValue())) == UrlParams.Source.SPLASH) {
                OpenPlatformModuleProvider.f101615b.launchMainWindow(fragment.getActivity());
            }
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void startChatWindowByOpenData(BotOpenData bVar) {
            ChatBundle.C29590a a = ChatBundle.m109259a();
            if (bVar.mo170592a() != -1) {
                a.mo105920a(bVar.mo170592a());
            }
            if (bVar.mo170598e() == ID_TYPE.BOT_ID) {
                a.mo105931b(bVar.mo170597d());
            } else if (bVar.mo170598e() == ID_TYPE.CHAT_ID) {
                a.mo105927a(bVar.mo170597d());
            }
            if (bVar.mo170595b()) {
                a.mo105935d(bVar.mo170596c());
            }
            if (!TextUtils.isEmpty(bVar.mo170601g())) {
                a.mo105923a(ChatBundle.SourceType.fromValue(bVar.mo170601g()));
            }
            if (!TextUtils.isEmpty(bVar.mo170600f())) {
                a.mo105933c(bVar.mo170600f());
            }
            a.mo105941h(true);
            OpenPlatformModuleProvider.f101616c.openChat(LarkContext.getApplication(), a.mo105929a());
        }

        public void getMessagesByIds(List<String> list, IGetDataCallback<List<Message>> iGetDataCallback) {
            OpenPlatformModuleProvider.f101616c.getMessagesByIds(list, iGetDataCallback);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void sendEvent(String str, JSONObject jSONObject) {
            Statistics.sendEvent(str, jSONObject);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public String generateUrlWithAction(String str, String str2) {
            return LittleAppModuleProvider.m157932a().mo148935a(str, "message_action", str2);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public View getCardView(Context context, CardContent cardContent) {
            if (context == null || cardContent == null) {
                return null;
            }
            return OpenPlatformModuleProvider.f101616c.getCardViewFromContent(context, cardContent);
        }

        public void peekFeed(String str, int i) {
            OpenPlatformModuleProvider.f101616c.peakFeedCard(str, FeedCard.Type.forNumber(i));
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void getBotAppStrategyInfo(String str, final AbstractC48793a.AbstractC48795b bVar) {
            AppStrategyModuleProvider.m154406a().mo103647b().mo103688a(str, new AbstractC29242a.AbstractC29244b() {
                /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.C399241 */

                @Override // com.ss.android.lark.appstrategy.service.AbstractC29242a.AbstractC29244b
                /* renamed from: a */
                public void mo103696a(String str) {
                    bVar.mo170521a(str);
                }

                @Override // com.ss.android.lark.appstrategy.service.AbstractC29242a.AbstractC29244b
                /* renamed from: a */
                public void mo103697a(String str, C4145c cVar) {
                    bVar.mo170522a(str, cVar);
                }
            });
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void openAboutActivity(Context context, String str) {
            AppCenterModuleProvider.m154360a().mo103303a(context, str, "", new HashMap(), 1, "");
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void startChatActivityByChatterId(Context context, String str) {
            if (C68182c.m264835b(context)) {
                OpenPlatformModuleProvider.f101616c.openChat(context, ChatBundle.m109259a().mo105931b(str).mo105929a());
            } else {
                OpenPlatformModuleProvider.f101616c.ipcOpenChatByChatterId(str);
            }
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void openApplyVisibleActivity(Context context, String str, String str2) {
            AppCenterModuleProvider.m154360a().mo103301a(context, str, str2);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void openByAppLinkWithScene(Context context, String str, int i) {
            OpenPlatformModuleProvider.f101615b.openInternal(context, str, i);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void startChatWindowActivityByChatIdAndPos(Context context, String str, int i) {
            OpenPlatformModuleProvider.f101616c.openChat(context, ChatBundle.m109259a().mo105927a(str).mo105920a(i).mo105929a());
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void monitorOpEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            C39824h.m158095a().mo144321a(getContext(), str, jSONObject, jSONObject2, jSONObject3);
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void sendShareAppV2(Context context, ShareAppDataV2 shareAppDataV2, ShareAppType shareAppType, int i) {
            if (shareAppDataV2 != null) {
                OpenPlatformModuleProvider.f101615b.forwardWithTemplate(context, ShareAppForwardFactory.m158559a(context, shareAppDataV2, shareAppType), i);
            }
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void sendShareCardMessage(ShareAppDataV2 shareAppDataV2, ShareAppType shareAppType, List<String> list, String str, IGetDataCallback<Boolean> iGetDataCallback) {
            if (shareAppDataV2 != null) {
                ShareAppForwardFactory.m158560a(shareAppDataV2, shareAppType, list, str, iGetDataCallback);
            }
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void openGadgetFromPlusMenu(Context context, String str, String str2, boolean z, Function1<String, Void> function1) {
            getTriggerCode(new Function1(str, str2, context, z) {
                /* class com.ss.android.lark.integrator.openplatform.$$Lambda$OpenPlatformModuleProvider$OpenPlatformModuleDependencyImpl$CzJplFzlfJ45wWA6VAPop8P1_Ko */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ Context f$3;
                public final /* synthetic */ boolean f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl.lambda$openGadgetFromPlusMenu$0(Function1.this, this.f$1, this.f$2, this.f$3, this.f$4, (String) obj);
                }
            });
        }

        @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a
        public void startWebPage(Context context, String str, String str2, boolean z, String str3, String str4) {
            Bundle bundle = new Bundle();
            bundle.putString("app_icon_key", str2);
            bundle.putBoolean("is_web_app", z);
            bundle.putString("app_id", str4);
            OpenPlatformModuleProvider.f101615b.openUrl(context, str, UrlParams.m108857a().mo105519a(str3).mo105516a(bundle).mo105523a());
        }

        static /* synthetic */ Unit lambda$openGadgetFromPlusMenu$0(Function1 function1, String str, String str2, Context context, boolean z, String str3) {
            String str4;
            function1.invoke(str3);
            String urlWithTriggerCode = OpenPlatformModuleProvider.f101616c.getUrlWithTriggerCode(str, str3);
            C41354g a = LittleAppModuleProvider.m157932a();
            if (Uri.parse(urlWithTriggerCode).getQueryParameterNames().contains("bdp_launch_query")) {
                str4 = a.mo148935a(urlWithTriggerCode, str2, (String) null);
            } else {
                str4 = a.mo148935a(urlWithTriggerCode, str2, str3);
            }
            int i = 1510;
            if (OpenPlatformModuleProvider.f101615b.canOpenInternal(context, str4, 0)) {
                ICoreApi iCoreApi = OpenPlatformModuleProvider.f101615b;
                if (!z) {
                    i = 1509;
                }
                iCoreApi.openInternal(context, str4, i);
            } else {
                String a2 = a.mo148935a(str4, str2, (String) null);
                if (!z) {
                    i = 1509;
                }
                a.mo148938a(context, a2, i);
            }
            return null;
        }
    }

    /* renamed from: b */
    public static AbstractC48793a m158459b() {
        return (AbstractC48793a) ApiUtils.getApi(AbstractC48793a.class);
    }

    /* renamed from: d */
    private static void m158461d() {
        C59480b.m230866a(new AbstractC59446a() {
            /* class com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.C399231 */

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: d */
            public Context mo144878d() {
                return LarkContext.getApplication();
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public String mo144867a() {
                return OpenPlatformModuleProvider.m158459b().getUserId();
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: b */
            public String mo144875b() {
                return OpenPlatformModuleProvider.m158459b().getLocale();
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: c */
            public Locale mo144877c() {
                return OpenPlatformModuleProvider.m158459b().getLanguageSetting();
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: e */
            public Locale mo144879e() {
                return OpenPlatformModuleProvider.m158459b().getLanguageSetting();
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: f */
            public String mo144880f() {
                return OpenPlatformModuleProvider.m158459b().getSession();
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: g */
            public String mo144881g() {
                return OpenPlatformModuleProvider.m158459b().getTenantId();
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public String mo144868a(DomainSettings.Alias alias) {
                return OpenPlatformModuleProvider.m158459b().getDynamicDomain(alias);
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public void mo144869a(Context context, String str) {
                OpenPlatformModuleProvider.m158459b().startChatActivityByChatterId(context, str);
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public void mo144874a(OpbScene opbScene, C59597e eVar) {
                OpenPlatformModuleProvider.f101614a.mo170503a(opbScene, eVar);
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: b */
            public void mo144876b(Context context, String str, int i) {
                OpenPlatformModuleProvider.m158459b().startChatWindowActivityByChatIdAndPos(context, str, i);
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public void mo144870a(Context context, String str, int i) {
                OpenPlatformModuleProvider.m158459b().openByAppLinkWithScene(context, str, i);
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public void mo144871a(Context context, String str, Source source) {
                OpenPlatformModuleProvider.m158459b().getGadgetDependency().mo144961a(context, str, source);
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public void mo144872a(Context context, String str, String str2, boolean z) {
                AppDetailActivity.m100818a(context, str, str2, z);
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public void mo144873a(Context context, String str, String str2, boolean z, String str3, String str4) {
                OpenPlatformModuleProvider.m158459b().startWebPage(context, str, str2, z, str3, str4);
            }
        });
    }

    /* renamed from: a */
    public static OpenPlatformModule m158457a() {
        if (f101614a == null) {
            synchronized (OpenPlatformModuleProvider.class) {
                if (f101614a == null) {
                    f101614a = new OpenPlatformModule();
                    m158461d();
                    m158458a(LarkContext.getApplication());
                    m158460c();
                }
            }
        }
        return f101614a;
    }

    /* renamed from: c */
    private static void m158460c() {
        List<LKPluginConfig> allPluginConfigs = OpenPlatformModule.m192198d().getAllPluginConfigs();
        C24401b.m89051c().mo87131a(LarkContext.getApplication());
        for (LKPluginConfig lKPluginConfig : allPluginConfigs) {
            if (lKPluginConfig != null) {
                C13479a.m54764b("OpenPlatformModuleProvider", "plugin config :" + lKPluginConfig.toString());
                C24401b.m89051c().mo87132a(lKPluginConfig);
            } else {
                C13479a.m54764b("OpenPlatformModuleProvider", "plugin config is null");
            }
        }
    }

    /* renamed from: a */
    private static void m158458a(Context context) {
        DependencyMgr.m52810a(new CommonDependencyImpl(context), new NetworkDependencyImpl());
    }
}
