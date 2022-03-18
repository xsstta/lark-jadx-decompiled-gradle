package com.ss.android.lark.simple;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.platform.ah.C51702c;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.simple.SimpleModule;
import com.ss.android.lark.simple.web.SimpleModeUrlParam;
import com.ss.android.lark.ug.p2874e.C57480a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.simple.b */
public class C54866b {

    /* renamed from: com.ss.android.lark.simple.b$a */
    public static class C54876a {

        /* renamed from: a */
        public static final SimpleModule.ISimpleModuleDependency f135449a = C54866b.m212764a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static SimpleModule m212765a() {
        return new SimpleModule(C54876a.f135449a);
    }

    /* renamed from: a */
    public static SimpleModule.ISimpleModuleDependency m212764a(Application application) {
        return new SimpleModule.ISimpleModuleDependency() {
            /* class com.ss.android.lark.simple.C54866b.C548671 */

            @Override // com.ss.android.lark.simple.SimpleModule.ISimpleModuleDependency
            /* renamed from: a */
            public SimpleModule.ILoginDependency mo187090a() {
                return new SimpleModule.ILoginDependency() {
                    /* class com.ss.android.lark.simple.C54866b.C548671.C548736 */

                    @Override // com.ss.android.lark.simple.SimpleModule.ILoginDependency
                    /* renamed from: a */
                    public boolean mo187086a() {
                        return C36083a.m141486a().getPassportDependency().mo133094m().mo172428i();
                    }

                    @Override // com.ss.android.lark.simple.SimpleModule.ILoginDependency
                    /* renamed from: b */
                    public boolean mo187087b() {
                        return C36083a.m141486a().getPassportDependency().mo133094m().mo172421b().isSmallB();
                    }

                    @Override // com.ss.android.lark.simple.SimpleModule.ILoginDependency
                    /* renamed from: a */
                    public void mo187085a(Activity activity, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getPassportDependency().mo133074b(activity, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.simple.SimpleModule.ISimpleModuleDependency
            /* renamed from: b */
            public SimpleModule.IBrowserDependency mo187091b() {
                return new SimpleModule.IBrowserDependency() {
                    /* class com.ss.android.lark.simple.C54866b.C548671.C548747 */

                    @Override // com.ss.android.lark.simple.SimpleModule.IBrowserDependency
                    /* renamed from: a */
                    public void mo187080a() {
                        BrowserModuleProvider.m200667a().mo106863f();
                    }

                    /* renamed from: a */
                    private UrlParams m212785a(SimpleModeUrlParam aVar) {
                        return UrlParams.m108857a().mo105536f(aVar.mo187176a()).mo105538g(aVar.mo187177b()).mo105539h(aVar.mo187178c()).mo105530c(aVar.mo187179d()).mo105534e(aVar.mo187180e()).mo105532d(aVar.mo187181f()).mo105521a(aVar.mo187182g()).mo105535f(aVar.mo187183h()).mo105516a(aVar.mo187184i()).mo105517a(aVar.mo187185j()).mo105523a();
                    }

                    @Override // com.ss.android.lark.simple.SimpleModule.IBrowserDependency
                    /* renamed from: a */
                    public Fragment mo187079a(Context context, SimpleModeUrlParam aVar, String str) {
                        return BrowserModuleProvider.m200667a().mo106837a(context, str, m212785a(aVar));
                    }
                };
            }

            @Override // com.ss.android.lark.simple.SimpleModule.ISimpleModuleDependency
            /* renamed from: c */
            public SimpleModule.IMainDependency mo187092c() {
                return new SimpleModule.IMainDependency() {
                    /* class com.ss.android.lark.simple.C54866b.C548671.C548758 */

                    @Override // com.ss.android.lark.simple.SimpleModule.IMainDependency
                    /* renamed from: a */
                    public Intent mo187088a(Context context) {
                        return C36149a.m142162a().mo157098b().mo105697a(context, (String) null);
                    }
                };
            }

            @Override // com.ss.android.lark.simple.SimpleModule.ISimpleModuleDependency
            /* renamed from: d */
            public SimpleModule.IFeatureGatingDependency mo187093d() {
                return new SimpleModule.IFeatureGatingDependency() {
                    /* class com.ss.android.lark.simple.C54866b.C548671.C548725 */

                    @Override // com.ss.android.lark.simple.SimpleModule.IFeatureGatingDependency
                    /* renamed from: a */
                    public boolean mo187082a(String str, boolean z) {
                        return C37239a.m146648b().mo136952a(str, z);
                    }
                };
            }

            @Override // com.ss.android.lark.simple.SimpleModule.ISimpleModuleDependency
            /* renamed from: e */
            public SimpleModule.ISettingDependency mo187094e() {
                return new SimpleModule.ISettingDependency() {
                    /* class com.ss.android.lark.simple.C54866b.C548671.C548714 */

                    @Override // com.ss.android.lark.simple.SimpleModule.ISettingDependency
                    /* renamed from: a */
                    public void mo187089a(Activity activity) {
                        SettingModuleProvider.f129183h.mo178263a().mo185200a(activity);
                    }
                };
            }

            @Override // com.ss.android.lark.simple.SimpleModule.ISimpleModuleDependency
            /* renamed from: f */
            public SimpleModule.IGuideDependency mo187095f() {
                return new SimpleModule.IGuideDependency() {
                    /* class com.ss.android.lark.simple.C54866b.C548671.C548703 */

                    @Override // com.ss.android.lark.simple.SimpleModule.IGuideDependency
                    /* renamed from: b */
                    public void mo187084b(String str) {
                        C57480a.m223132a().mo141830f(str);
                    }

                    @Override // com.ss.android.lark.simple.SimpleModule.IGuideDependency
                    /* renamed from: a */
                    public boolean mo187083a(String str) {
                        return C57480a.m223132a().mo141828e(str);
                    }
                };
            }

            @Override // com.ss.android.lark.simple.SimpleModule.ISimpleModuleDependency
            /* renamed from: g */
            public SimpleModule.IWsChannelDependency mo187096g() {
                return new SimpleModule.IWsChannelDependency() {
                    /* class com.ss.android.lark.simple.C54866b.C548671.C548692 */

                    @Override // com.ss.android.lark.simple.SimpleModule.IWsChannelDependency
                    /* renamed from: a */
                    public void mo187099a(Context context) {
                        C51702c.m200484a().mo201590b(context);
                    }
                };
            }

            @Override // com.ss.android.lark.simple.SimpleModule.ISimpleModuleDependency
            /* renamed from: h */
            public SimpleModule.IDocDependency mo187097h() {
                return new SimpleModule.IDocDependency() {
                    /* class com.ss.android.lark.simple.C54866b.C548671.C548681 */

                    @Override // com.ss.android.lark.simple.SimpleModule.IDocDependency
                    /* renamed from: a */
                    public void mo187081a(Context context) {
                        C36083a.m141486a().getCCMDependency().mo132702a(context);
                    }
                };
            }

            @Override // com.ss.android.lark.simple.SimpleModule.ISimpleModuleDependency
            /* renamed from: i */
            public String mo187098i() {
                String a = DynamicConfigModule.m145551a(DomainSettings.Alias.BASIC_MODE);
                if (!m212766a(a)) {
                    Log.e("SimpleModuleProvider", "simple mode url host is empty");
                    return null;
                } else if (TextUtils.isEmpty(a) || TextUtils.isEmpty("/basic-mobile-page")) {
                    Log.e("SimpleModuleProvider", "simple mode url host or path is empty");
                    return null;
                } else {
                    return "https://" + a + "/basic-mobile-page";
                }
            }

            /* renamed from: a */
            private boolean m212766a(String str) {
                if (TextUtils.isEmpty(str) || TextUtils.equals(str, "unknown")) {
                    return false;
                }
                return true;
            }
        };
    }
}
