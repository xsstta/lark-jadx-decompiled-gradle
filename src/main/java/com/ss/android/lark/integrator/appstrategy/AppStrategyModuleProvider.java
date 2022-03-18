package com.ss.android.lark.integrator.appstrategy;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.bytedance.ee.webapp.v2.AbstractC13836d;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.webview.container.impl.WebContainerActivity;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appstrategy.C29231a;
import com.ss.android.lark.appstrategy.dto.SimpleLocation;
import com.ss.android.lark.appstrategy.p1374a.AbstractC29232a;
import com.ss.android.lark.biz.core.api.AbstractC29561h;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider;
import com.ss.android.lark.integrator.littleapp.C39817f;
import com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.LarkContext;
import ee.android.framework.manis.p3450a.C68182c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

public class AppStrategyModuleProvider {

    /* renamed from: a */
    private static final Map<C29231a, AbstractC49379a> f100400a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final Map<C29231a, AbstractC29561h> f100401b = new ConcurrentHashMap();

    /* renamed from: c */
    private static volatile C29231a f100402c;

    @ClaymoreImpl(AbstractC29232a.class)
    public static class AppStrategyModuleDependency implements AbstractC29232a {
        ICoreApi mCoreApi = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));
        IIMApi mIMApi = ((IIMApi) ApiUtils.getApi(IIMApi.class));
        IPassportApi mPassportApi = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        public Context getContext() {
            return LarkContext.getApplication();
        }

        public int getEnvType() {
            return this.mPassportApi.envType();
        }

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        public Locale getLocale() {
            return this.mCoreApi.getLanguageSetting();
        }

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        public AbstractC29232a.AbstractC29233a getLoginDependency() {
            return new AbstractC29232a.AbstractC29233a() {
                /* class com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider.AppStrategyModuleDependency.C391111 */

                @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a.AbstractC29233a
                /* renamed from: a */
                public String mo103665a() {
                    return AppStrategyModuleDependency.this.mPassportApi.getUserId();
                }

                @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a.AbstractC29233a
                /* renamed from: b */
                public String mo103666b() {
                    return AppStrategyModuleDependency.this.mPassportApi.getSession();
                }
            };
        }

        public String getMinaHost() {
            return DynamicConfigModule.m145551a(DomainSettings.Alias.MINA);
        }

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        public long getNtpTime() {
            return this.mCoreApi.getNtpTime();
        }

        public Activity getTopActivity() {
            return this.mCoreApi.getTopActivity();
        }

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        public boolean isAppRealForeground() {
            return this.mCoreApi.isAppFront();
        }

        public boolean isGooglePlay() {
            return this.mPassportApi.isUsPackage();
        }

        public boolean isOverseaTenantBrand() {
            return this.mPassportApi.isOverseaTenantBrand();
        }

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        public Activity getCheckedBrowserActivity() {
            Activity lastTopActivity = this.mCoreApi.getLastTopActivity();
            if (lastTopActivity instanceof WebContainerActivity) {
                return lastTopActivity;
            }
            return null;
        }

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        public String getDeviceId() {
            return C57859q.m224566b(this.mPassportApi.getDeviceId());
        }

        public boolean getFgValue(String str) {
            return C37239a.m146648b().mo136951a(str);
        }

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        @Nullable
        public WeakReference<AbstractC13836d> getWebAppFragment(String str) {
            return OpenPlatformModuleProvider.m158457a().mo170509c(str);
        }

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        public String getDomain(DomainSettings.Alias alias) {
            List<String> b = DynamicConfigModule.m145553b(alias);
            if (b == null || b.size() <= 0) {
                return "";
            }
            return b.get(0);
        }

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        public void getLocation(final IGetDataCallback<SimpleLocation> iGetDataCallback) {
            C39817f.m158080a(LarkContext.getApplication(), "wgs84", 100.0f, 5000, "high_accuracy", 0, new AbstractC41371j.AbstractC41380i() {
                /* class com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider.AppStrategyModuleDependency.C391122 */

                @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
                /* renamed from: a */
                public void mo142998a() {
                }

                @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
                /* renamed from: a */
                public void mo143001a(ArrayList<Location> arrayList, Location location, String str, int i) {
                }

                @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
                /* renamed from: a */
                public void mo143000a(String str, int i) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("get location err,msg " + str + " errCode " + i));
                    }
                }

                @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
                /* renamed from: a */
                public void mo142999a(Location location, String str, int i) {
                    Log.m165389i("getlocation", " success la:" + location.getLatitude() + " longi:" + location.getLongitude() + " acc:" + location.getAccuracy() + " type:" + str + " locationType:" + i);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(new SimpleLocation(location.getLatitude(), location.getLongitude(), (double) location.getAccuracy()));
                    }
                }
            });
        }

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        public void openUrl(Context context, String str) {
            this.mCoreApi.openUrl(context, str);
        }

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        public void startChatActivityByChatterId(Context context, String str) {
            if (C68182c.m264835b(context)) {
                this.mIMApi.openChat(context, ChatBundle.m109259a().mo105931b(str).mo105929a());
            } else {
                this.mIMApi.ipcOpenChatByChatterId(str);
            }
        }

        @Override // com.ss.android.lark.appstrategy.p1374a.AbstractC29232a
        public void openApplyVisibleActivity(Context context, String str, String str2) {
            AppCenterModuleProvider.m154360a().mo103301a(context, str, str2);
        }
    }

    /* renamed from: a */
    public static C29231a m154406a() {
        if (f100402c == null) {
            synchronized (AppStrategyModuleProvider.class) {
                if (f100402c == null) {
                    f100402c = new C29231a();
                    m154407a(f100402c);
                    m154409b(f100402c);
                }
            }
        }
        return f100402c;
    }

    /* renamed from: a */
    private static void m154407a(C29231a aVar) {
        $$Lambda$AppStrategyModuleProvider$L9kFyF5ATy5Ms1lE4w_2HCmqE0 r0 = new AbstractC49379a() {
            /* class com.ss.android.lark.integrator.appstrategy.$$Lambda$AppStrategyModuleProvider$L9kFyF5ATy5Ms1lE4w_2HCmqE0 */

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
                C29231a.this.mo103651f();
            }
        };
        f100400a.put(aVar, r0);
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerUserSwitchListener(r0);
    }

    /* renamed from: b */
    private static void m154409b(final C29231a aVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addLifecycleObserver(new AbstractC29586u() {
            /* class com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider.C391101 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
            public void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                if (aVar2.mo105887c() != aVar.mo105887c() && aVar2.mo105887c()) {
                    aVar.mo103649d();
                }
            }
        });
    }
}
