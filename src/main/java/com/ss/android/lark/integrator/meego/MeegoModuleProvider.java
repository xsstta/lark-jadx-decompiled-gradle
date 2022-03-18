package com.ss.android.lark.integrator.meego;

import android.content.Context;
import android.os.Message;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.meego.wrapper.MeegoModule;
import com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.LarkContext;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MeegoModuleProvider {

    /* renamed from: a */
    private static volatile MeegoModule f101510a;

    @ClaymoreImpl(IMeegoModuleDependency.class)
    public static class MeegoModuleDependency implements IMeegoModuleDependency {
        public final ICoreApi mCoreApi = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));
        private final IPassportApi mPassportApi = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));

        @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency
        public IMeegoModuleDependency.IBrowserDependency getBrowserDependency() {
            return new IMeegoModuleDependency.IBrowserDependency() {
                /* class com.ss.android.lark.integrator.meego.MeegoModuleProvider.MeegoModuleDependency.C398533 */

                @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency.IBrowserDependency
                /* renamed from: a */
                public void mo144527a(String str) {
                    MeegoModuleDependency.this.mCoreApi.openUrl(MeegoModuleDependency.this.getContext(), str);
                }
            };
        }

        @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency
        public IMeegoModuleDependency.IContactDependency getContactDependency() {
            return new IMeegoModuleDependency.IContactDependency() {
                /* class com.ss.android.lark.integrator.meego.MeegoModuleProvider.MeegoModuleDependency.C398522 */

                @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency.IContactDependency
                /* renamed from: a */
                public void mo144526a(Context context, Message message) {
                    MeegoModuleDependency.this.mCoreApi.startSelectMyGroupActivity(context, message);
                }
            };
        }

        @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency
        public Context getContext() {
            return LarkContext.getApplication();
        }

        @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency
        public String getDeviceId() {
            return this.mPassportApi.getDeviceId();
        }

        @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency
        public IMeegoModuleDependency.IFeatureGatingDependency getFeatureGatingDependency() {
            return new IMeegoModuleDependency.IFeatureGatingDependency() {
                /* class com.ss.android.lark.integrator.meego.MeegoModuleProvider.MeegoModuleDependency.C398511 */

                @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency.IFeatureGatingDependency
                /* renamed from: a */
                public boolean mo144525a(String str) {
                    return C37239a.m146648b().mo136951a(str);
                }
            };
        }

        @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency
        public boolean isGooglePlay() {
            return this.mPassportApi.isUsPackage();
        }

        @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency
        public String getSession() {
            return this.mPassportApi.getAccountManager().mo172424e();
        }

        @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency
        public String getTenantId() {
            return this.mPassportApi.getAccountManager().mo172427h();
        }

        @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency
        public boolean isBoeEnv() {
            if (this.mPassportApi.envType() == 2) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency
        public String getLanguage() {
            Locale cachedLanguageSetting = this.mCoreApi.getCachedLanguageSetting();
            return String.format("%s_%s", cachedLanguageSetting.getLanguage(), cachedLanguageSetting.getCountry());
        }

        @Override // com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency
        public Map<String, String> getAppInfo(Context context) {
            String str;
            boolean a = C57852m.m224554a(context);
            String valueOf = String.valueOf(C29410a.m108287a().mo104277a());
            String packageName = context.getPackageName();
            String a2 = C26246a.m94977a(context);
            String valueOf2 = String.valueOf(C26246a.m94979c(context));
            String deviceId = this.mPassportApi.getDeviceId();
            HashMap hashMap = new HashMap();
            hashMap.put("appId", valueOf);
            hashMap.put("appName", packageName);
            hashMap.put("appVersion", a2);
            if (a) {
                str = "local_test";
            } else {
                str = "normal";
            }
            hashMap.put("channel", str);
            hashMap.put("deviceId", deviceId);
            hashMap.put("updateVersionCode", valueOf2);
            return hashMap;
        }
    }

    static {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerSwitchTenantListener(new AbstractC49404s() {
            /* class com.ss.android.lark.integrator.meego.MeegoModuleProvider.C398501 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s
            /* renamed from: a */
            public void mo144512a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ void m158205b() {
                MeegoModuleProvider.m158204a().mo158732b();
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s
            /* renamed from: a */
            public void mo144513a(boolean z) {
                CoreThreadPool.getDefault().getCachedThreadPool().submit($$Lambda$MeegoModuleProvider$1$fVtmADhKxU9Q_A8A9QmxPdxDUE.INSTANCE);
            }
        });
    }

    /* renamed from: a */
    public static MeegoModule m158204a() {
        if (f101510a == null) {
            synchronized (MeegoModuleProvider.class) {
                if (f101510a == null) {
                    f101510a = new MeegoModule();
                }
            }
        }
        return f101510a;
    }
}
