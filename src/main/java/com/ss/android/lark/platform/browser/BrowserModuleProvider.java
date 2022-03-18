package com.ss.android.lark.platform.browser;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.Logger;
import com.bytedance.ee.larkwebview.p668b.AbstractC13397a;
import com.bytedance.ee.larkwebview.p668b.C13398b;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.dto.MetricIPCData;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.metriclogger.C24350k;
import com.larksuite.component.webview.container.C25822b;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.component.webview.container.p1169a.AbstractC25820a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.browser.AbstractC29553b;
import com.ss.android.lark.biz.core.api.browser.AbstractC29554c;
import com.ss.android.lark.biz.core.api.browser.PreviewRequest;
import com.ss.android.lark.biz.core.api.browser.PreviewV2Request;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.messenger.ShareItemHelper;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.dto.AbstractC29907a;
import com.ss.android.lark.browser.dto.MainDomainSessionWrapper;
import com.ss.android.lark.browser.dto.SessionInfo;
import com.ss.android.lark.browser.dto.StepCountInfo;
import com.ss.android.lark.browser.impl.translate.entity.C29953a;
import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;
import com.ss.android.lark.browser.manis.AppConfig;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.dependency.AbstractC36127m;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.image.service.IImageManisService;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.listener.AbstractC41583b;
import com.ss.android.lark.location.listener.AbstractC41584c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.ShareModel;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b;
import com.ss.android.lark.passport.signinsdk_api.idp.IGetIdpTokenCallback;
import com.ss.android.lark.platform.aa.C51657a;
import com.ss.android.lark.platform.ag.C51689a;
import com.ss.android.lark.platform.applink.C51707a;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.dybrid.OpenKAUrlChecker;
import com.ss.android.lark.platform.larksetting.LarkSettingModuleProvider;
import com.ss.android.lark.platform.map.MapModuleProvider;
import com.ss.android.lark.platform.p2489j.C51819a;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.platform.p2505u.C52013b;
import com.ss.android.lark.platform.p2508x.C52054a;
import com.ss.android.lark.platform.p2509y.C52063a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.platform.statistics.p2502b.C51963b;
import com.ss.android.lark.platform.statistics.perf.C51997c;
import com.ss.android.lark.profile.dto.ErrorResultWrapper;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.profile.service.IProfileManisService;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.DetectRequest;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.DetectResponse;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.GetTargetLangListResponse;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableError;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableLanguageInfo;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableTranslateSettingConfig;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.TransmissionData;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.WebTranslateRequest;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.WebTranslateResponse;
import com.ss.android.lark.stepcount.service.IStepCountManisService;
import com.ss.android.lark.ug.p2860d.C57397a;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.ViewUtils;
import ee.android.framework.manis.C68183b;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class BrowserModuleProvider {

    /* renamed from: a */
    private static volatile C29638a f128672a;

    /* renamed from: b */
    private static final Map<C29638a, AbstractC49379a> f128673b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final Map<C29638a, AbstractC29586u> f128674c = new ConcurrentHashMap();

    @ClaymoreImpl(IBrowserModuleDependency.class)
    public static class BrowserModuleDependencyImpl implements IBrowserModuleDependency {
        public boolean webApplicationCanDebug(String str) {
            return false;
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29883a getAppConfigDependency() {
            return new IBrowserModuleDependency.AbstractC29883a() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517867 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29883a
                /* renamed from: a */
                public int mo107657a() {
                    AppConfig appConfig = (AppConfig) C68183b.m264839a().mo237086a(LarkContext.getApplication(), AppConfig.class);
                    if (appConfig != null) {
                        return appConfig.getSampleTextMaxContentLength();
                    }
                    Log.m165389i("BrowserModuleProvider", "[isUrlEnableForWebTranslate], appConfig is null");
                    return 0;
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29883a
                /* renamed from: a */
                public boolean mo107658a(String str) {
                    AppConfig appConfig = (AppConfig) C68183b.m264839a().mo237086a(LarkContext.getApplication(), AppConfig.class);
                    if (appConfig != null) {
                        return appConfig.isUrlEnableForWebTranslate(str);
                    }
                    Log.m165389i("BrowserModuleProvider", "[isUrlEnableForWebTranslate], appConfig is null");
                    return true;
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public Context getContext() {
            return LarkContext.getApplication();
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29884b getDocsDependency() {
            return new IBrowserModuleDependency.AbstractC29884b() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass18 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29884b
                /* renamed from: b */
                public void mo107665b() {
                    C36083a.m141486a().getCCMDependency().mo132724g();
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29884b
                /* renamed from: c */
                public boolean mo107666c() {
                    return C36083a.m141486a().getCCMDependency().mo132728k();
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29884b
                /* renamed from: a */
                public Map<String, String> mo107660a() {
                    return C36083a.m141486a().getCCMDependency().mo132723f();
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29884b
                /* renamed from: a */
                public void mo107661a(boolean z) {
                    C36083a.m141486a().getCCMDependency().mo132719c(z);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29884b
                /* renamed from: a */
                public boolean mo107663a(String str) {
                    return C36083a.m141486a().getCCMDependency().mo132716b(str);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29884b
                /* renamed from: a */
                public boolean mo107664a(String str, Map<String, String> map) {
                    return C36083a.m141486a().getCCMDependency().mo132711a(str, map);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29884b
                /* renamed from: a */
                public String mo107659a(String str, String str2, Map<String, String> map) {
                    return C36083a.m141486a().getCCMDependency().mo132700a(str, str2, map);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29884b
                /* renamed from: a */
                public boolean mo107662a(Context context, String str, Map<String, String> map) {
                    return C36083a.m141486a().getCCMDependency().mo132710a(context, str, map);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29885c getForwardDependency() {
            return new IBrowserModuleDependency.AbstractC29885c() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517723 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29885c
                /* renamed from: a */
                public void mo107667a(Activity activity, String str, String str2, String str3, String str4, String str5) {
                    C36083a.m141486a().getOpenPlatformDependency().mo133009a(activity, str, str2, str3, str4, str5);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29888e getGuideDependency() {
            return new IBrowserModuleDependency.AbstractC29888e() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517878 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29888e
                /* renamed from: a */
                public GuideDelegate mo107672a(View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
                    return C57397a.m222529a().mo141241e().mo141291a(view, onClickListener, onClickListener2);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29902r getKAShareDependency() {
            return new IBrowserModuleDependency.AbstractC29902r() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517734 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29902r
                /* renamed from: a */
                public ArrayList<C25838g> mo107730a(Activity activity, Fragment fragment, IBrowserModuleDependency.AbstractC29897m mVar) {
                    return ShareItemHelper.f74495a.mo107264a(activity, fragment, mVar);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29889f getLanguageDependency() {
            return new IBrowserModuleDependency.AbstractC29889f() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass11 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29889f
                /* renamed from: a */
                public Locale mo107673a() {
                    return C36235a.m142710a().mo148281b().mo105659a();
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29889f
                /* renamed from: a */
                public void mo107674a(Context context) {
                    C36235a.m142710a().mo148283d().mo105895a("change_resync_session", context);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29890g getLittleAppDependency() {
            return new IBrowserModuleDependency.AbstractC29890g() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass13 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29890g
                /* renamed from: a */
                public boolean mo107676a(String str) {
                    return C36083a.m141486a().getOpenPlatformDependency().mo133036b(str);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29890g
                /* renamed from: a */
                public boolean mo107675a(Context context, String str, UrlParams.Source source) {
                    return C36083a.m141486a().getOpenPlatformDependency().mo133028a(context, str, source);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29890g
                /* renamed from: b */
                public void mo107677b(Context context, String str, UrlParams.Source source) {
                    C36083a.m141486a().getOpenPlatformDependency().mo133034b(context, str, source);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.ILocationDependency getLocationDependency() {
            return new IBrowserModuleDependency.ILocationDependency() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517745 */

                /* renamed from: a */
                final AbstractC41583b f128703a = MapModuleProvider.m201088a().getLocationClient(LarkContext.getApplication());

                /* renamed from: c */
                private final WeakHashMap<IBrowserModuleDependency.ILocationDependency.AbstractC29882a, AbstractC41584c> f128705c = new WeakHashMap<>();

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.ILocationDependency
                /* renamed from: a */
                public boolean mo107636a(final IBrowserModuleDependency.ILocationDependency.AbstractC29882a aVar) {
                    return this.f128703a.mo149526a(new AbstractC41584c() {
                        /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517745.C517751 */

                        @Override // com.ss.android.lark.location.listener.AbstractC41584c
                        public void onLocationChange(LarkLocation larkLocation, List<Location> list) {
                            aVar.onLocationChange(C517745.this.mo177897a(larkLocation));
                        }
                    });
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.ILocationDependency
                /* renamed from: b */
                public boolean mo107638b(IBrowserModuleDependency.ILocationDependency.AbstractC29882a aVar) {
                    this.f128705c.remove(aVar);
                    return this.f128703a.mo149532b(this.f128705c.get(aVar));
                }

                /* renamed from: a */
                public IBrowserModuleDependency.ILocationDependency.LarkLocation mo177897a(LarkLocation larkLocation) {
                    if (larkLocation == null) {
                        return null;
                    }
                    IBrowserModuleDependency.ILocationDependency.LarkLocation larkLocation2 = new IBrowserModuleDependency.ILocationDependency.LarkLocation(larkLocation);
                    larkLocation2.setLatitude(larkLocation.getLatitude());
                    larkLocation2.setLongitude(larkLocation.getLongitude());
                    larkLocation2.mo107641a(larkLocation.mo149606a());
                    larkLocation2.mo107647c(larkLocation.mo149612c());
                    larkLocation2.mo107649d(larkLocation.mo149614d());
                    larkLocation2.mo107644b(larkLocation.mo149610b());
                    larkLocation2.mo107651e(larkLocation.mo149616e());
                    larkLocation2.mo107653f(larkLocation.mo149618f());
                    larkLocation2.mo107642a(larkLocation.mo149623j());
                    larkLocation2.mo107640a(larkLocation.mo149620g());
                    larkLocation2.mo107645b(larkLocation.mo149624k());
                    return larkLocation2;
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.ILocationDependency
                /* renamed from: a */
                public boolean mo107637a(IBrowserModuleDependency.ILocationDependency.AbstractC29882a aVar, int i) {
                    $$Lambda$BrowserModuleProvider$BrowserModuleDependencyImpl$5$V1Q8eVGbUFcRN0O78FQsTcH6TH0 r1 = new AbstractC41584c(new WeakReference(aVar)) {
                        /* class com.ss.android.lark.platform.browser.$$Lambda$BrowserModuleProvider$BrowserModuleDependencyImpl$5$V1Q8eVGbUFcRN0O78FQsTcH6TH0 */
                        public final /* synthetic */ WeakReference f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // com.ss.android.lark.location.listener.AbstractC41584c
                        public final void onLocationChange(LarkLocation larkLocation, List list) {
                            BrowserModuleProvider.BrowserModuleDependencyImpl.C517745.this.m200761a(this.f$1, larkLocation, list);
                        }
                    };
                    this.f128705c.put(aVar, r1);
                    return this.f128703a.mo149527a(r1, i);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m200761a(WeakReference weakReference, LarkLocation larkLocation, List list) {
                    if (weakReference.get() != null) {
                        ((IBrowserModuleDependency.ILocationDependency.AbstractC29882a) weakReference.get()).onLocationChange(mo177897a(larkLocation));
                    }
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29891h getLoginDependency() {
            return new IBrowserModuleDependency.AbstractC29891h() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass16 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29891h
                /* renamed from: a */
                public boolean mo107681a(Context context, int i, IBrowserModuleDependency.AbstractC29891h.AbstractC29892a aVar) {
                    return false;
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29891h
                /* renamed from: d */
                public String mo107684d() {
                    return C36083a.m141486a().getPassportDependency().mo133085d();
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29891h
                /* renamed from: a */
                public boolean mo107680a() {
                    return C36083a.m141486a().getPassportDependency().mo133094m().mo172428i();
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29891h
                /* renamed from: b */
                public String mo107682b() {
                    return C36083a.m141486a().getPassportDependency().mo133094m().mo172424e();
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29891h
                /* renamed from: e */
                public String mo107685e() {
                    String g = C36083a.m141486a().getPassportDependency().mo133088g();
                    if (g == null) {
                        return "";
                    }
                    return g;
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29891h
                /* renamed from: f */
                public String mo107686f() {
                    return C36083a.m141486a().getPassportDependency().mo133094m().mo172427h();
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29891h
                /* renamed from: c */
                public HashMap<String, SessionInfo> mo107683c() {
                    Map<String, com.ss.android.lark.passport.signinsdk_api.account.SessionInfo> g = C36083a.m141486a().getPassportDependency().mo133094m().mo172426g();
                    HashMap<String, SessionInfo> hashMap = new HashMap<>(g.size());
                    for (String str : g.keySet()) {
                        com.ss.android.lark.passport.signinsdk_api.account.SessionInfo sessionInfo = g.get(str);
                        if (sessionInfo != null) {
                            hashMap.put(str, new SessionInfo(sessionInfo.getHostUrl(), sessionInfo.getSessionName(), sessionInfo.getSession()));
                        }
                    }
                    return hashMap;
                }

                /* renamed from: a */
                public void mo177895a(Context context) {
                    C36083a.m141486a().getPassportDependency().mo133100s().mo172412a(context, true, String.format(Locale.getDefault(), "IdpRefreshTokenInvalid makes logout. msg=%s", "ka refresh token invalid"), new AbstractC49338a() {
                        /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass16.C517702 */

                        @Override // com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a
                        public void onResult(boolean z) {
                        }
                    });
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29891h
                /* renamed from: a */
                public void mo107679a(final IGetDataCallback<String> iGetDataCallback) {
                    AbstractC49384b x = C36083a.m141486a().getPassportDependency().mo133105x();
                    if (x != null && x.mo171895d() != null) {
                        x.mo171895d().mo171960a(BrowserModuleDependencyImpl.this.getContext(), true, (IGetIdpTokenCallback<String>) new IGetIdpTokenCallback<String>() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass16.C517691 */

                            /* renamed from: a */
                            public void mo145132a(String str, int i, String str2) {
                                if (i == 0 || 1 == i) {
                                    iGetDataCallback.onSuccess(str);
                                    return;
                                }
                                iGetDataCallback.onError(new ErrorResult(i, str2));
                                if (3 == i) {
                                    Log.m165383e("BrowserModuleProvider", "getIdpIdentity error makes logout");
                                    AnonymousClass16 r2 = AnonymousClass16.this;
                                    r2.mo177895a(BrowserModuleDependencyImpl.this.getContext());
                                }
                            }
                        });
                    }
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29891h
                /* renamed from: a */
                public void mo107678a(Context context, IGetDataCallback<String> iGetDataCallback) {
                    C36083a.m141486a().getPassportDependency().mo133074b(context, iGetDataCallback);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29893i getMailDependency() {
            return new IBrowserModuleDependency.AbstractC29893i() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517712 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29893i
                /* renamed from: a */
                public boolean mo107688a(String str) {
                    return C36083a.m141486a().getMailDependency().mo132974b(str);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29893i
                /* renamed from: a */
                public boolean mo107687a(Context context, String str, Map<String, String> map) {
                    return C36083a.m141486a().getMailDependency().mo132971a(context, str, map);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29894j getMainDependency() {
            return new IBrowserModuleDependency.AbstractC29894j() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass15 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29894j
                /* renamed from: a */
                public void mo107689a(Context context) {
                    C36149a.m142162a().mo157098b().mo105705b(context);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29894j
                /* renamed from: b */
                public void mo107690b(Context context) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("transition", true);
                    C36149a.m142162a().mo157098b().mo105707b(context, C36099a.m141515a().mo130134c().mo130264b(), bundle);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public String getMainDomainForSimple() {
            return C36882a.m145561e();
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29898n getMineDependency() {
            return new IBrowserModuleDependency.AbstractC29898n() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517766 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29898n
                /* renamed from: a */
                public void mo107716a(String[] strArr, final IGetDataCallback<TranslateLanguage> iGetDataCallback) {
                    Application application = LarkContext.getApplication();
                    if (C26252ad.m94993b(application)) {
                        SettingModuleProvider.f129183h.mo178263a().mo185211a(strArr, new IGetDataCallback<ParcelableLanguageInfo>() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517766.C517771 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(ParcelableLanguageInfo parcelableLanguageInfo) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(C51789a.m200783a(parcelableLanguageInfo));
                                }
                            }
                        });
                        return;
                    }
                    TranslateProxy translateProxy = (TranslateProxy) C68183b.m264839a().mo237086a(application, TranslateProxy.class);
                    if (translateProxy != null) {
                        translateProxy.detectSourceLanguage(new TransmissionData(new DetectRequest(strArr)), new AbstractC54255a.AbstractC54256a() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517766.C517804 */

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54256a
                            public void onError(ParcelableError parcelableError) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(parcelableError.mo185697a());
                                }
                            }

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54256a
                            public void onSuccess(TransmissionData transmissionData) {
                                DetectResponse detectResponse = (DetectResponse) transmissionData.mo185733a(DetectResponse.CREATOR);
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(C51789a.m200783a(detectResponse.mo185683a().get(0)));
                                }
                            }
                        });
                    }
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29898n
                /* renamed from: a */
                public void mo107709a(Context context) {
                    SettingModuleProvider.f129183h.mo178263a().mo185217c(context);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29898n
                /* renamed from: a */
                public void mo107710a(final IGetDataCallback<List<TranslateLanguage>> iGetDataCallback) {
                    Application application = LarkContext.getApplication();
                    if (C26252ad.m94993b(application)) {
                        SettingModuleProvider.f129183h.mo178263a().mo185203a(new IGetDataCallback<List<ParcelableLanguageInfo>>() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517766.C517848 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(List<ParcelableLanguageInfo> list) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(C51789a.m200786a(list));
                                }
                            }
                        });
                        return;
                    }
                    TranslateProxy translateProxy = (TranslateProxy) C68183b.m264839a().mo237086a(application, TranslateProxy.class);
                    if (translateProxy != null) {
                        translateProxy.getTargetLangList(new AbstractC54255a.AbstractC54256a() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517766.C517859 */

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54256a
                            public void onError(ParcelableError parcelableError) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(parcelableError.mo185697a());
                                }
                            }

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54256a
                            public void onSuccess(TransmissionData transmissionData) {
                                GetTargetLangListResponse getTargetLangListResponse = (GetTargetLangListResponse) transmissionData.mo185733a(GetTargetLangListResponse.CREATOR);
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null && getTargetLangListResponse != null) {
                                    iGetDataCallback.onSuccess(C51789a.m200786a(getTargetLangListResponse.mo185690a()));
                                }
                            }
                        });
                    }
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29898n
                /* renamed from: a */
                public void mo107715a(boolean z, final IGetDataCallback<Void> iGetDataCallback) {
                    Application application = LarkContext.getApplication();
                    if (C26252ad.m94993b(application)) {
                        SettingModuleProvider.f129183h.mo178263a().mo185210a(z, new IGetDataCallback<Void>() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517766.AnonymousClass10 */

                            /* renamed from: a */
                            public void onSuccess(Void r2) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(r2);
                                }
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }
                        });
                        return;
                    }
                    TranslateProxy translateProxy = (TranslateProxy) C68183b.m264839a().mo237086a(application, TranslateProxy.class);
                    if (translateProxy != null) {
                        translateProxy.setAutoTranslate(z, new AbstractC54255a.AbstractC54257b() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517766.AnonymousClass11 */

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54257b
                            public void onError(ParcelableError parcelableError) {
                            }

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54257b
                            public void onSuccess() {
                            }
                        });
                    }
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29898n
                /* renamed from: a */
                public void mo107711a(TranslateLanguage translateLanguage, boolean z, final IGetDataCallback<Void> iGetDataCallback) {
                    Application application = LarkContext.getApplication();
                    if (C26252ad.m94993b(application)) {
                        SettingModuleProvider.f129183h.mo178263a().mo185205a(C51789a.m200785a(translateLanguage), z, (IGetDataCallback<Void>) null);
                        return;
                    }
                    TranslateProxy translateProxy = (TranslateProxy) C68183b.m264839a().mo237086a(application, TranslateProxy.class);
                    if (translateProxy != null) {
                        translateProxy.setUnTranslateThisLanguage(new TransmissionData(C51789a.m200785a(translateLanguage)), z, new AbstractC54255a.AbstractC54257b() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517766.C517782 */

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54257b
                            public void onSuccess() {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(null);
                                }
                            }

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54257b
                            public void onError(ParcelableError parcelableError) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(parcelableError.mo185697a());
                                }
                            }
                        });
                    }
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29898n
                /* renamed from: a */
                public void mo107712a(String str, String str2, final IGetDataCallback<C29953a> iGetDataCallback) {
                    Application application = LarkContext.getApplication();
                    if (C26252ad.m94993b(application)) {
                        SettingModuleProvider.f129183h.mo178263a().mo185206a(str, str2, new IGetDataCallback<ParcelableTranslateSettingConfig>() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517766.C517826 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(ParcelableTranslateSettingConfig parcelableTranslateSettingConfig) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(C51789a.m200784a(parcelableTranslateSettingConfig));
                                }
                            }
                        });
                        return;
                    }
                    TranslateProxy translateProxy = (TranslateProxy) C68183b.m264839a().mo237086a(application, TranslateProxy.class);
                    if (translateProxy != null) {
                        translateProxy.getWebTranslateSetting(str, str2, new AbstractC54255a.AbstractC54256a() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517766.C517837 */

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54256a
                            public void onError(ParcelableError parcelableError) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(parcelableError.mo185697a());
                                }
                            }

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54256a
                            public void onSuccess(TransmissionData transmissionData) {
                                ParcelableTranslateSettingConfig parcelableTranslateSettingConfig = (ParcelableTranslateSettingConfig) transmissionData.mo185733a(ParcelableTranslateSettingConfig.CREATOR);
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null && parcelableTranslateSettingConfig != null) {
                                    iGetDataCallback.onSuccess(C51789a.m200784a(parcelableTranslateSettingConfig));
                                }
                            }
                        });
                    }
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29898n
                /* renamed from: a */
                public void mo107714a(String str, boolean z, final IGetDataCallback<Void> iGetDataCallback) {
                    Application application = LarkContext.getApplication();
                    if (C26252ad.m94993b(application)) {
                        SettingModuleProvider.f129183h.mo178263a().mo185208a(str, z, (IGetDataCallback<Void>) null);
                        return;
                    }
                    TranslateProxy translateProxy = (TranslateProxy) C68183b.m264839a().mo237086a(application, TranslateProxy.class);
                    if (translateProxy != null) {
                        translateProxy.setUnTranslateThisSite(str, z, new AbstractC54255a.AbstractC54257b() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517766.C517793 */

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54257b
                            public void onSuccess() {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(null);
                                }
                            }

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54257b
                            public void onError(ParcelableError parcelableError) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(parcelableError.mo185697a());
                                }
                            }
                        });
                    }
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29898n
                /* renamed from: a */
                public void mo107713a(String str, String str2, String[] strArr, final IGetDataCallback<List<String>> iGetDataCallback) {
                    Application application = LarkContext.getApplication();
                    if (C26252ad.m94993b(application)) {
                        SettingModuleProvider.f129183h.mo178263a().mo185207a(str, str2, strArr, null, iGetDataCallback);
                        return;
                    }
                    TranslateProxy translateProxy = (TranslateProxy) C68183b.m264839a().mo237086a(application, TranslateProxy.class);
                    if (translateProxy != null) {
                        translateProxy.sendTranslateRequest(new TransmissionData(new WebTranslateRequest(str, str2, strArr)), new AbstractC54255a.AbstractC54256a() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517766.C517815 */

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54256a
                            public void onError(ParcelableError parcelableError) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(parcelableError.mo185697a());
                                }
                            }

                            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54256a
                            public void onSuccess(TransmissionData transmissionData) {
                                WebTranslateResponse webTranslateResponse = (WebTranslateResponse) transmissionData.mo185733a(WebTranslateResponse.CREATOR);
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null && webTranslateResponse != null) {
                                    iGetDataCallback.onSuccess(new ArrayList(webTranslateResponse.mo185749a()));
                                }
                            }
                        });
                    }
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public AbstractC29907a getPerfEnterChatMonitor() {
            return new AbstractC29907a() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517631 */

                @Override // com.ss.android.lark.browser.dto.AbstractC29907a
                /* renamed from: a */
                public void mo107770a() {
                    C51997c.m201743a("key_doc", ChatBundle.SourceType.PROFILE);
                }

                @Override // com.ss.android.lark.browser.dto.AbstractC29907a
                /* renamed from: b */
                public String mo107771b() {
                    C51997c.C51999a b = C51997c.m201747b("key_doc");
                    if (b != null) {
                        return b.mo178233a();
                    }
                    return null;
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29896l getQuicklyOpenUrlDependency() {
            return new IBrowserModuleDependency.AbstractC29896l() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.C517889 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29896l
                /* renamed from: a */
                public boolean mo107707a() {
                    return OpenKAUrlChecker.f128776a.mo177950a();
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29896l
                /* renamed from: a */
                public boolean mo107708a(Context context, UrlParams urlParams) {
                    return OpenKAUrlChecker.f128776a.mo177951a(urlParams);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29899o getVCDependency() {
            return new IBrowserModuleDependency.AbstractC29899o() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass12 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29899o
                /* renamed from: d */
                public boolean mo107724d(String str) {
                    return C36083a.m141486a().getVideoConferenceDependency().mo133147d(str);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29899o
                /* renamed from: b */
                public boolean mo107721b(String str) {
                    return C36083a.m141486a().getMinutesDependency().mo132984a(str);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29899o
                /* renamed from: c */
                public boolean mo107723c(String str) {
                    return C36083a.m141486a().getVideoConferenceDependency().mo133145c(str);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29899o
                /* renamed from: a */
                public boolean mo107719a(String str) {
                    return C36083a.m141486a().getVideoConferenceDependency().mo133140a(str);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29899o
                /* renamed from: a */
                public void mo107717a(Context context, String str) {
                    C36083a.m141486a().getVideoConferenceDependency().mo133132a(context, str);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29899o
                /* renamed from: b */
                public boolean mo107720b(Context context, String str, int i) {
                    return C36083a.m141486a().getVideoConferenceDependency().mo133139a(context, str, i);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29899o
                /* renamed from: c */
                public boolean mo107722c(Context context, String str, int i) {
                    return C36083a.m141486a().getVideoConferenceDependency().mo133143b(context, str, i);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29899o
                /* renamed from: a */
                public void mo107718a(Context context, String str, int i) {
                    C36083a.m141486a().getMinutesDependency().mo132982a(context, str, i);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29900p getWatermarkDependency() {
            return new IBrowserModuleDependency.AbstractC29900p() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass17 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29900p
                /* renamed from: a */
                public boolean mo107726a() {
                    return true;
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29900p
                /* renamed from: a */
                public void mo107725a(Dialog dialog) {
                    C51689a.m200461a().mo197363a(dialog);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29901q getWebAppDependency() {
            return new IBrowserModuleDependency.AbstractC29901q() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass14 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29901q
                /* renamed from: a */
                public AbstractInjectWebViewDelegate mo107727a() {
                    return C36083a.m141486a().getOpenPlatformDependency().mo133031b();
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29901q
                /* renamed from: a */
                public void mo107728a(Context context) {
                    C36083a.m141486a().getOpenPlatformDependency().mo133041d(context);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29901q
                /* renamed from: a */
                public boolean mo107729a(String str, UrlParams urlParams) {
                    return C36083a.m141486a().getOpenPlatformDependency().mo133030a(str, urlParams);
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public String getDeviceId() {
            return C36083a.m141486a().getPassportDependency().mo133090i();
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public int getEnvType() {
            return C36083a.m141486a().getEnvDependency().mo132692a();
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29886d getGeckoDependency() {
            return C36083a.m141486a().getCCMDependency().mo132722e();
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public AbstractC24152a getH5Service() {
            return C51819a.m200877a().mo86772b();
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public boolean isGooglePlay() {
            return C36083a.m141487b().isUsPackage();
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public boolean isInWebLeanMode() {
            return !UserSP.getInstance().getBoolean("app_config_sso", true);
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public boolean isOverseaTenantBrand() {
            return C36083a.m141486a().getPassportDependency().mo133089h();
        }

        public boolean isUsingTTWebView() {
            return C51657a.m200381a().mo194410b();
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public String getDocMainDomain() {
            if (!C26252ad.m94993b(LarkContext.getApplication())) {
                return C36882a.m145565i();
            }
            return C36882a.m145564h();
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public String getMainDomain() {
            if (!C26252ad.m94993b(LarkContext.getApplication())) {
                return C36882a.m145562f();
            }
            return C36882a.m145561e();
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public MainDomainSessionWrapper getMainDomainSession() {
            return new MainDomainSessionWrapper(C36882a.m145562f(), C36882a.m145565i(), getLoginDependency().mo107683c());
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public IBrowserModuleDependency.AbstractC29895k getManisDependency() {
            if (C26284k.m95185a(getContext()) && C26252ad.m94993b(getContext())) {
                ViewUtils.m224152b("please DO NOT call getManisDependency on main thread");
            }
            return new IBrowserModuleDependency.AbstractC29895k() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10 */

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: c */
                public List<String> mo107703c() {
                    AppConfig appConfig = (AppConfig) C68183b.m264839a().mo237086a(LarkContext.getApplication(), AppConfig.class);
                    if (appConfig == null) {
                        return new ArrayList();
                    }
                    return appConfig.getJSAPIWhiteList();
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: a */
                public Map<String, String> mo107692a() {
                    AppConfig appConfig = (AppConfig) C68183b.m264839a().mo237086a(LarkContext.getApplication(), AppConfig.class);
                    if (appConfig == null) {
                        return new HashMap();
                    }
                    return appConfig.getSchemaHandleList();
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: b */
                public List<String> mo107699b() {
                    AppConfig appConfig = (AppConfig) C68183b.m264839a().mo237086a(LarkContext.getApplication(), AppConfig.class);
                    if (appConfig == null) {
                        return new ArrayList();
                    }
                    return appConfig.getSecLinkWhiteList();
                }

                /* access modifiers changed from: private */
                /* renamed from: e */
                public static /* synthetic */ void m200696e(String str) {
                    C36149a.m142162a().mo157105c().openLostPage(str);
                }

                /* access modifiers changed from: private */
                /* renamed from: f */
                public static /* synthetic */ void m200697f(String str) {
                    AbstractC36232b.m142703a().mo178822c().startContactsProfileActivityByChatterId(str);
                }

                /* access modifiers changed from: private */
                /* renamed from: g */
                public static /* synthetic */ void m200698g(String str) {
                    C36083a.m141486a().getIMDependency().mo132920d(str);
                }

                /* access modifiers changed from: private */
                /* renamed from: h */
                public static /* synthetic */ void m200699h(String str) {
                    C36083a.m141486a().getIMDependency().mo132911c(str);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: a */
                public String mo107691a(DomainSettings.Alias alias) {
                    if (DynamicConfigModule.m145554c() == null) {
                        return "";
                    }
                    return DynamicConfigModule.m145554c().getDynamicDomain(alias.getValue());
                }

                /* access modifiers changed from: private */
                /* renamed from: c */
                public /* synthetic */ void m200694c(final IGetDataCallback iGetDataCallback) {
                    Logger.m15173i("BrowserModuleProvider", "path getProfile");
                    AbstractC36232b.m142703a().mo178822c().fetchUserProfile(C29638a.m109622a().getLoginDependency().mo107684d(), new IProfileManisService.AbstractC52889a() {
                        /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10.C517684 */

                        @Override // com.ss.android.lark.profile.service.IProfileManisService.AbstractC52889a
                        public void onError(ErrorResultWrapper errorResultWrapper) {
                            iGetDataCallback.onError(errorResultWrapper.f129588a);
                        }

                        @Override // com.ss.android.lark.profile.service.IProfileManisService.AbstractC52889a
                        public void onSuccess(ProfileResponse profileResponse) {
                            Profile profile = profileResponse.profile;
                            Logger.m15173i("BrowserModuleProvider", "path fetchUserProfile");
                            if (profile == null) {
                                onError(new ErrorResultWrapper(new ErrorResult("getProfile error")));
                            } else {
                                iGetDataCallback.onSuccess(new com.ss.android.lark.browser.dto.Profile(profile.getName(), profile.getGender(), profile.getEmail(), profile.getEmployeeId()));
                            }
                        }
                    });
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: d */
                public void mo107706d(String str) {
                    CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(str) {
                        /* class com.ss.android.lark.platform.browser.$$Lambda$BrowserModuleProvider$BrowserModuleDependencyImpl$10$RtB9CqybHqyFdEo7iFam_0p_FQM */
                        public final /* synthetic */ String f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void run() {
                            BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10.m200696e(this.f$0);
                        }
                    });
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: a */
                public void mo107694a(IGetDataCallback<com.ss.android.lark.browser.dto.Profile> iGetDataCallback) {
                    if (iGetDataCallback != null) {
                        CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(iGetDataCallback) {
                            /* class com.ss.android.lark.platform.browser.$$Lambda$BrowserModuleProvider$BrowserModuleDependencyImpl$10$qEOKlnx7Xa5_DBKW4vTMvy72sc */
                            public final /* synthetic */ IGetDataCallback f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10.this.m200694c((BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10) this.f$1);
                            }
                        });
                    }
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: b */
                public void mo107700b(final IGetDataCallback<StepCountInfo> iGetDataCallback) {
                    if (iGetDataCallback != null) {
                        CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable() {
                            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10.RunnableC517652 */

                            public void run() {
                                IStepCountManisService a = C52063a.m201976a().mo187771a(BrowserModuleDependencyImpl.this.getContext());
                                if (a != null) {
                                    if (!a.getStepCountAuthorized()) {
                                        a.setStepCountAuthorized(true);
                                    }
                                    a.getDayStepCount();
                                    Logger.m15173i("BrowserModuleProvider", "path getStepCount:" + a);
                                    StepCountInfo stepCountInfo = new StepCountInfo();
                                    stepCountInfo.mo107763a(a.getDayStepCount());
                                    iGetDataCallback.onSuccess(stepCountInfo);
                                }
                            }
                        });
                    }
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: c */
                public void mo107704c(String str) {
                    CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(str) {
                        /* class com.ss.android.lark.platform.browser.$$Lambda$BrowserModuleProvider$BrowserModuleDependencyImpl$10$Dvq3wr2c6KBODE9uNAS8YBXlw0k */
                        public final /* synthetic */ String f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void run() {
                            BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10.m200697f(this.f$0);
                        }
                    });
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: a */
                public void mo107695a(String str) {
                    CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(str) {
                        /* class com.ss.android.lark.platform.browser.$$Lambda$BrowserModuleProvider$BrowserModuleDependencyImpl$10$3I_37EWkrucZkLKjgye_mipdjq4 */
                        public final /* synthetic */ String f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void run() {
                            BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10.m200699h(this.f$0);
                        }
                    });
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: b */
                public void mo107701b(String str) {
                    CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(str) {
                        /* class com.ss.android.lark.platform.browser.$$Lambda$BrowserModuleProvider$BrowserModuleDependencyImpl$10$qExPn8cmsYkitVlujxb0wlJt4mw */
                        public final /* synthetic */ String f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void run() {
                            BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10.m200698g(this.f$0);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: d */
                public /* synthetic */ void m200695d(String str, final IGetDataCallback iGetDataCallback) {
                    C51854a.m201094a().mo142166b().uploadEncryptImage(str, false, false, new IImageManisService.AbstractC38924a() {
                        /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10.C517641 */

                        @Override // com.ss.android.lark.image.service.IImageManisService.AbstractC38924a
                        public void onError(com.ss.android.lark.image.service.ErrorResultWrapper errorResultWrapper) {
                            iGetDataCallback.onError(errorResultWrapper.f100013a);
                        }

                        @Override // com.ss.android.lark.image.service.IImageManisService.AbstractC38924a
                        public void onSuccess(EncryptImageData encryptImageData) {
                            IGetDataCallback iGetDataCallback = iGetDataCallback;
                            if (iGetDataCallback != null && encryptImageData != null) {
                                iGetDataCallback.onSuccess(encryptImageData.f73838b);
                            }
                        }
                    });
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: c */
                public void mo107705c(final String str, final IGetDataCallback<String> iGetDataCallback) {
                    CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable() {
                        /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10.RunnableC517663 */

                        public void run() {
                            C36083a.m141486a().getPassportDependency().mo133084c(str, new IGetDataCallback<SessionResult>() {
                                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10.RunnableC517663.C517671 */

                                @Override // com.larksuite.framework.callback.IGetDataCallback
                                public void onError(ErrorResult errorResult) {
                                    if (iGetDataCallback != null) {
                                        iGetDataCallback.onError(errorResult);
                                    }
                                }

                                /* renamed from: a */
                                public void onSuccess(SessionResult sessionResult) {
                                    String str;
                                    if (iGetDataCallback != null) {
                                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                                        if (sessionResult == null) {
                                            str = null;
                                        } else {
                                            str = sessionResult.token;
                                        }
                                        iGetDataCallback.onSuccess(str);
                                    }
                                }
                            });
                        }
                    });
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: a */
                public void mo107696a(String str, IGetDataCallback<String> iGetDataCallback) {
                    C36083a.m141486a().getOpenPlatformDependency().mo133018a(str, iGetDataCallback);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: b */
                public void mo107702b(String str, IGetDataCallback<String> iGetDataCallback) {
                    CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(str, iGetDataCallback) {
                        /* class com.ss.android.lark.platform.browser.$$Lambda$BrowserModuleProvider$BrowserModuleDependencyImpl$10$HRaOxNkTnV6Q3NVJgEC6FqbvFQ */
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ IGetDataCallback f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10.this.m200695d(this.f$1, this.f$2);
                        }
                    });
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: a */
                public void mo107693a(Activity activity, String str, IGetDataCallback<String> iGetDataCallback) {
                    C36083a.m141486a().getOpenPlatformDependency().mo133008a(activity, str, iGetDataCallback);
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: a */
                public void mo107698a(int[] iArr, boolean z, IGetDataCallback<String> iGetDataCallback) {
                    C36083a.m141486a().getOpenPlatformDependency().mo133024a(iArr, z, iGetDataCallback);
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public /* synthetic */ void m200693b(boolean z, long j, int i, int i2, List list, Map map) {
                    C24350k.m88901a(BrowserModuleDependencyImpl.this.getContext(), new MetricIPCData(z, j, i, i2, list, map));
                }

                @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29895k
                /* renamed from: a */
                public void mo107697a(boolean z, long j, int i, int i2, List<Integer> list, Map<String, Object> map) {
                    CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(z, j, i, i2, list, map) {
                        /* class com.ss.android.lark.platform.browser.$$Lambda$BrowserModuleProvider$BrowserModuleDependencyImpl$10$eHbd_QyfGjJcyYcJiCBmhSbDMI */
                        public final /* synthetic */ boolean f$1;
                        public final /* synthetic */ long f$2;
                        public final /* synthetic */ int f$3;
                        public final /* synthetic */ int f$4;
                        public final /* synthetic */ List f$5;
                        public final /* synthetic */ Map f$6;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r5;
                            this.f$4 = r6;
                            this.f$5 = r7;
                            this.f$6 = r8;
                        }

                        public final void run() {
                            BrowserModuleProvider.BrowserModuleDependencyImpl.AnonymousClass10.this.m200693b(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                        }
                    });
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public String getOpenApiUrl() {
            return String.format("%s/open-apis/", C36882a.m145563g());
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public boolean isMultiProcessStorage() {
            if (C51657a.m200381a().mo194410b() || Build.VERSION.SDK_INT >= 28) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public X509Certificate[] getTenantCertCertificate() {
            X509Certificate d = C52013b.m201803a().mo178256d(C36083a.m141486a().getPassportDependency().mo133094m().mo172419a().getTenantId());
            if (d == null) {
                Log.m165397w("BrowserModuleProvider", "getTenantCertCertificate failed, cert is empty");
                return null;
            }
            return new X509Certificate[]{d};
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public PrivateKey getTenantCertPrivateKey() {
            PrivateKey a = C52013b.m201803a().mo178253a(C36083a.m141486a().getPassportDependency().mo133094m().mo172419a().getTenantId());
            if (a != null) {
                return a;
            }
            Log.m165397w("BrowserModuleProvider", "getTenantCertPrivateKey failed, cert is empty");
            return null;
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public String getDocsDomain(String str) {
            return C36882a.m145557a(str);
        }

        public void reInjectWebViewRes(Context context) {
            C51657a.m200381a().mo194414d(context);
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public boolean isAppLink(Uri uri) {
            return C51707a.m200495a().mo103470a(uri);
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public boolean isFeatureGatingEnable(String str) {
            return C37239a.m146648b().mo136951a(str);
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public boolean onAppIntercept(Context context) {
            return C36083a.m141486a().getOpenPlatformDependency().mo133039c(context);
        }

        public void sendShareMessageToLark(Context context, ShareModel shareModel) {
            C52054a.m201947a().mo186842a(context, shareModel);
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public void openInternal(Context context, String str, int i) {
            C51707a.m200495a().mo103471b(context, str, i);
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public boolean canOpenInternal(Context context, String str, int i) {
            return C51707a.m200495a().mo103469a(context, str, i);
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public boolean startFileDetailActivity(Context context, String str, String str2) {
            return C36083a.m141486a().getMigrateTempDependency().mo132981a(context, str, str2);
        }

        public void downloadImageToLocal(String str, String str2, IGetDataCallback<File> iGetDataCallback) {
            C51854a.m201094a().mo142161a(LarkContext.getApplication(), str, str2, Integer.MIN_VALUE, Integer.MIN_VALUE, iGetDataCallback);
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            C36083a.m141486a().getOpenPlatformDependency().mo133020a(str, jSONObject, jSONObject2, jSONObject3);
        }

        public void startPreviewImage(Fragment fragment, List<PreviewRequest> list, int i, AbstractC29553b bVar) {
            C36083a.m141486a().getOpenPlatformDependency().mo133015a(fragment, list, i, bVar);
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency
        public void startPreviewImageV2(Fragment fragment, List<PreviewV2Request> list, int i, AbstractC29554c cVar) {
            C36083a.m141486a().getOpenPlatformDependency().mo133016a(fragment, list, i, cVar);
        }
    }

    /* renamed from: b */
    private static void m200669b() {
        C25822b.m93351a(new AbstractC25820a() {
            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.C517602 */

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: a */
            public Context mo91844a() {
                return LarkContext.getApplication();
            }

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: e */
            public void mo91853e() {
                C51963b.m201559a("webview_page_finish_time", Long.valueOf(System.currentTimeMillis()));
            }

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: g */
            public AbstractInjectWebViewDelegate mo91855g() {
                return C29638a.m109622a().getWebAppDependency().mo107727a();
            }

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: b */
            public String mo91849b() {
                if (DynamicConfigModule.m145554c() == null) {
                    return null;
                }
                return DynamicConfigModule.m145554c().getDynamicDomain(DomainSettings.Alias.SUITE_SECURITY_LINK.getValue());
            }

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: c */
            public List<String> mo91851c() {
                return ((AppConfig) C68183b.m264839a().mo237086a(LarkContext.getApplication(), AppConfig.class)).getSecLinkWhiteList();
            }

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: d */
            public String mo91852d() {
                return C36235a.m142710a().mo148282c().mo148303f().toLanguageTag();
            }

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: f */
            public boolean mo91854f() {
                AbstractC36127m openPlatformDependency = C36083a.m141486a().getOpenPlatformDependency();
                if (openPlatformDependency != null) {
                    return openPlatformDependency.mo133038c();
                }
                Log.m165383e("BrowserModuleProvider", "IOpenPlatformDependency is null !!!");
                return false;
            }

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: b */
            public void mo91850b(String str) {
                BrowserModuleProvider.m200667a().mo106848a(str);
            }

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: a */
            public long mo91843a(long j) {
                long m = LarkSettingModuleProvider.m200903a().mo148459m();
                return m <= 0 ? j : m;
            }

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: a */
            public boolean mo91848a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: a */
            public void mo91845a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                BrowserModuleProvider.m200667a().mo106849a(str, iGetDataCallback);
            }

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: a */
            public void mo91846a(String str, String str2, IGetDataCallback iGetDataCallback) {
                C51854a.m201094a().mo142161a(LarkContext.getApplication(), str, str2, Integer.MIN_VALUE, Integer.MIN_VALUE, iGetDataCallback);
            }

            @Override // com.larksuite.component.webview.container.p1169a.AbstractC25820a
            /* renamed from: a */
            public boolean mo91847a(Activity activity, String str, String str2, String str3, boolean z) {
                return C36083a.m141486a().getOpenPlatformDependency().mo133025a(activity, str, str2, str3, z);
            }
        });
        C13398b.m54467a(new AbstractC13397a() {
            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.C517613 */

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: a */
            public String mo22589a() {
                return null;
            }

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: b */
            public List<String> mo22592b() {
                return null;
            }

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: c */
            public String mo22593c() {
                return C36235a.m142710a().mo148282c().mo148303f().toLanguageTag();
            }

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: a */
            public boolean mo22591a(String str) {
                return C37239a.m146648b().mo136952a(str, false);
            }

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: a */
            public void mo22590a(String str, JSONObject jSONObject) {
                C36083a.m141486a().getOpenPlatformDependency().mo133019a(str, jSONObject);
            }
        });
    }

    /* renamed from: a */
    public static C29638a m200667a() {
        if (f128672a == null) {
            synchronized (BrowserModuleProvider.class) {
                if (f128672a == null) {
                    f128672a = new C29638a(LarkContext.getApplication());
                    m200668a(f128672a);
                    m200669b();
                }
            }
        }
        return f128672a;
    }

    /* renamed from: a */
    private static void m200668a(final C29638a aVar) {
        if (C26252ad.m94993b(LarkContext.getApplication())) {
            m200670b(aVar);
            C28513a.m104512a(new C28513a.AbstractC28514a() {
                /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.C517591 */

                @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
                public void onLoginStatusChanged(int i) {
                    if (i == 0) {
                        aVar.mo106852a(false, true);
                    } else if (i == 1 || i == 2) {
                        aVar.mo106852a(true, false);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private static void m200670b(final C29638a aVar) {
        C517624 r0 = new AbstractC49379a() {
            /* class com.ss.android.lark.platform.browser.BrowserModuleProvider.C517624 */

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
            public void onUserSwitchSuccess(C49382d dVar) {
                aVar.mo106852a(C36083a.m141486a().getPassportDependency().mo133094m().mo172428i(), true);
            }
        };
        f128673b.put(aVar, r0);
        C36083a.m141486a().getPassportDependency().mo133064a(r0);
    }
}
