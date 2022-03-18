package com.ss.android.lark.platform.offlinepush;

import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.ApmAgent;
import com.bytedance.common.utility.CommonHttpException;
import com.bytedance.common.utility.NetworkClient;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.http.response.BaseResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.applogbridge.listener.IConfigChangeListener;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p2997z.C59364a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.platform.ah.C51702c;
import com.ss.android.lark.platform.network.C51857a;
import com.ss.android.lark.platform.network.C51864e;
import com.ss.android.lark.platform.offlinepush.C51894a;
import com.ss.android.lark.platform.p2496p.C51907a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.setting.dto.NotificationSetting;
import com.ss.android.lark.setting.service.AbstractC54603d;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.message.p3002a.C59436a;
import com.ss.lark.android.module.offlinepush.AbstractC64262a;
import com.ss.lark.android.module.offlinepush.C64266c;
import com.ss.lark.android.module.offlinepush.C64279d;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.offlinepush.a */
public class C51894a {

    /* renamed from: a */
    public static volatile C51895a f128905a;

    /* renamed from: b */
    public static volatile boolean f128906b;

    /* renamed from: a */
    public static C51895a m201282a() {
        if (f128905a == null) {
            synchronized (C51894a.class) {
                if (f128905a == null) {
                    f128905a = new C51895a();
                }
                f128905a.mo178072b(LarkContext.getApplication());
            }
        }
        return f128905a;
    }

    /* renamed from: com.ss.android.lark.platform.offlinepush.a$a */
    public static class C51895a {

        /* renamed from: a */
        private Queue<Runnable> f128907a = new ConcurrentLinkedQueue();

        /* renamed from: c */
        public static void m201287c(Context context) {
            m201288i(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m201286a(Runnable runnable) {
            this.f128907a.add(runnable);
        }

        /* renamed from: e */
        public void mo178074e(final Context context) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.platform.offlinepush.C51894a.C51895a.RunnableC519004 */

                public void run() {
                    boolean z;
                    if (!C59364a.m230446b(context)) {
                        z = C51895a.this.mo178076g(context);
                    } else {
                        z = true;
                    }
                    if (z) {
                        C57865c.m224576a(new Runnable(context) {
                            /* class com.ss.android.lark.platform.offlinepush.$$Lambda$a$a$4$8xokCfs9wbcmGZ9d8TqiO4grYbQ */
                            public final /* synthetic */ Context f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C51894a.C51895a.RunnableC519004.this.m201304a(this.f$1);
                            }
                        });
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m201304a(Context context) {
                    C51895a.this.mo178075f(context);
                }
            });
        }

        /* renamed from: b */
        public void mo178072b(Context context) {
            if (!C51894a.f128906b) {
                C64266c.m252729a(new C64266c.AbstractC64278e() {
                    /* class com.ss.android.lark.platform.offlinepush.$$Lambda$a$a$sQv1nvkEzLnWRZQaz96DKwwZZTY */

                    @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64278e
                    public final void onTryConfigPush(Runnable runnable) {
                        C51894a.C51895a.this.m201286a((C51894a.C51895a) runnable);
                    }
                });
                m201284a(context);
            }
        }

        /* renamed from: d */
        public void mo178073d(final Context context) {
            C64266c.m252729a((C64266c.AbstractC64278e) null);
            CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
                /* class com.ss.android.lark.platform.offlinepush.C51894a.C51895a.RunnableC518982 */

                public void run() {
                    boolean z = true;
                    if (C59436a.m230734c(context) != 1) {
                        z = false;
                    }
                    if (!z || !C59436a.m230733b((String) null)) {
                        C51895a.this.mo178075f(context);
                    } else {
                        C51895a.this.mo178074e(context);
                    }
                    C51907a.m201314a().mo169320b().mo169511a();
                    C51895a.this.mo178077h(context);
                }
            }, 5, TimeUnit.SECONDS);
        }

        /* renamed from: f */
        public void mo178075f(Context context) {
            m201289j(context);
            for (Runnable runnable : this.f128907a) {
                runnable.run();
            }
            this.f128907a.clear();
        }

        /* renamed from: i */
        private static void m201288i(Context context) {
            if (C26252ad.m94993b(context)) {
                int c = C29410a.m108287a().mo104279c();
                if (c <= 0) {
                    c = C29410a.m108287a().mo104277a();
                }
                String a = C51894a.m201283a(context);
                C64266c.m252724a(c);
                C64266c.m252731a(a);
                C64266c.m252728a(context, true);
            }
        }

        /* renamed from: j */
        private static void m201289j(final Context context) {
            IDeviceService p;
            C518993 r0 = new IGetDataCallback<IDeviceService.Country>() {
                /* class com.ss.android.lark.platform.offlinepush.C51894a.C51895a.C518993 */

                /* renamed from: a */
                public void onSuccess(IDeviceService.Country country) {
                    if (country != null) {
                        Context context = context;
                        C64266c.m252727a(context, C51894a.m201283a(context), country.getIsoCode());
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("Initor", "err = " + errorResult.toString());
                }
            };
            if (C36083a.m141486a().getPassportDependency().mo133094m().mo172428i() && (p = C36083a.m141486a().getPassportDependency().mo133097p()) != null) {
                p.getGeoInfo(null, r0);
            }
        }

        /* renamed from: g */
        public boolean mo178076g(final Context context) {
            if (!UserSP.getInstance().getBoolean("key_need_show_hms_dialog", true)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(UIUtils.getString(context, R.string.Lark_Legacy_HuaweiMobileServiceDesc1));
            sb.append('\n');
            sb.append(UIUtils.getString(context, R.string.Lark_Legacy_HuaweiMobileServiceDesc2));
            UserSP.getInstance().putBoolean("key_need_show_hms_dialog", false);
            new C25639g(context).mo89237b(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_HuaweiMobileServiceTitle)).mo89242c(sb).mo89253l(3).mo89247e(false).mo89224a(R.id.lkui_dialog_btn_center, R.string.Lark_Legacy_HuaweiMobileServiceBtn, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.platform.offlinepush.C51894a.C51895a.DialogInterface$OnClickListenerC519015 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    C57865c.m224576a(new Runnable() {
                        /* class com.ss.android.lark.platform.offlinepush.C51894a.C51895a.DialogInterface$OnClickListenerC519015.RunnableC519021 */

                        public void run() {
                            C51895a.this.mo178075f(context);
                        }
                    });
                }
            }).mo89244d();
            return false;
        }

        /* renamed from: h */
        public void mo178077h(Context context) {
            int i;
            int i2;
            final JSONObject jSONObject = new JSONObject();
            int c = C59436a.m230734c(context);
            IDeviceManager q = C36083a.m141486a().getPassportDependency().mo133098q();
            if (Build.VERSION.SDK_INT >= 28) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    try {
                        jSONObject.put("is_background_restriction", activityManager.isBackgroundRestricted());
                    } catch (JSONException e) {
                        Log.m165383e("Initor", e.getMessage());
                    }
                }
                try {
                    UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
                    if (usageStatsManager != null) {
                        jSONObject.put("app_standard_by_bucket", usageStatsManager.getAppStandbyBucket());
                    }
                } catch (Throwable unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager != null) {
                        jSONObject.put("ignore_battery_opt", powerManager.isIgnoringBatteryOptimizations(context.getPackageName()));
                    }
                } catch (Throwable unused2) {
                }
            }
            int i3 = 1;
            try {
                jSONObject.put("sys_notification_status", c);
                if (q != null) {
                    if (q.mo171040h()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    jSONObject.put("is_close_notify_after_pc_login", i);
                    if (q.mo171041i()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    jSONObject.put("is_close_notify_at_message", i2);
                }
            } catch (JSONException e2) {
                Log.m165389i("Initor", e2.toString());
            }
            AbstractC54603d e3 = SettingModuleProvider.f129183h.mo178263a().mo185219e();
            if (e3 != null) {
                try {
                    if (!e3.mo186574g()) {
                        i3 = 0;
                    }
                    jSONObject.put("is_current_zen_mode", i3);
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
                e3.mo186540a(new IGetDataCallback<NotificationSetting>() {
                    /* class com.ss.android.lark.platform.offlinepush.C51894a.C51895a.C519036 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Statistics.sendEvent("lark_android_dev_sys_notification", jSONObject);
                    }

                    /* renamed from: a */
                    public void onSuccess(NotificationSetting notificationSetting) {
                        if (notificationSetting != null) {
                            try {
                                jSONObject.put("receive_message_type", notificationSetting.settingType);
                            } catch (JSONException e) {
                                Log.m165383e("Initor", e.getMessage());
                                return;
                            }
                        }
                        Statistics.sendEvent("lark_android_dev_sys_notification", jSONObject);
                    }
                });
                return;
            }
            Statistics.sendEvent("lark_android_dev_sys_notification", jSONObject);
        }

        /* renamed from: a */
        public static void m201284a(final Context context) {
            String str;
            C51894a.f128906b = true;
            int c = C29410a.m108287a().mo104279c();
            String d = C36083a.m141486a().getThirdPartyInfoDependency().mo133113d();
            String e = C36083a.m141486a().getThirdPartyInfoDependency().mo133114e();
            String f = C36083a.m141486a().getThirdPartyInfoDependency().mo133115f();
            String g = C36083a.m141486a().getThirdPartyInfoDependency().mo133116g();
            String h = C36083a.m141486a().getThirdPartyInfoDependency().mo133117h();
            String i = C36083a.m141486a().getThirdPartyInfoDependency().mo133118i();
            try {
                str = UIHelper.getString(R.string.Lark_Legacy_AppNameRelease);
            } catch (NullPointerException e2) {
                Log.m165398w("Initor", "offline push init warning", e2);
                str = "";
            }
            String buildPackageChannel = PackageChannelManager.getBuildPackageChannel(context);
            C64279d.C64281a aVar = new C64279d.C64281a(context);
            if (c <= 0) {
                c = C29410a.m108287a().mo104277a();
            }
            C64266c.m252730a(aVar.mo222745a(c).mo222749a(str).mo222752b(buildPackageChannel).mo222754c(C26246a.m94977a(context)).mo222751b(C26246a.m94978b(context)).mo222753c(C26246a.m94979c(context)).mo222755d(d).mo222756e(e).mo222757f(f).mo222758g(g).mo222759h(h).mo222760i(i).mo222746a(new C51904b(context, C51864e.m201147a())).mo222747a(new C51905b()).mo222748a(new C51906c()).mo222761j(C51894a.m201283a(context)).mo222750a(), new C64266c.AbstractC64274a() {
                /* class com.ss.android.lark.platform.offlinepush.C51894a.C51895a.C518961 */

                @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64274a
                /* renamed from: a */
                public void mo178078a(Context context) {
                    C59364a.m230445a(context);
                }

                @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64274a
                /* renamed from: a */
                public void mo178079a(final AbstractC64262a aVar) {
                    if (C57765ac.m224193g(context)) {
                        Log.m165389i("Initor", "Error: wsChannel process call addConfigChangeListener() for config offlinePush");
                    } else {
                        AppLogProxy.addConfigChangeListener(new IConfigChangeListener() {
                            /* class com.ss.android.lark.platform.offlinepush.C51894a.C51895a.C518961.C518971 */

                            @Override // com.ss.android.lark.applogbridge.listener.IConfigChangeListener
                            /* renamed from: a */
                            public void mo103493a(boolean z, JSONObject jSONObject) {
                                aVar.mo222725a(z, jSONObject);
                            }
                        });
                    }
                }

                @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64274a
                /* renamed from: a */
                public void mo178083a(Map<String, String> map) {
                    if (C57765ac.m224193g(context)) {
                        Log.m165389i("Initor", "Error: wsChannel process call getSsidGroup() for config offlinePush");
                        return;
                    }
                    AppLogProxy.getSsidGroup(map);
                    String B = C36083a.m141486a().getPassportDependency().mo133043B();
                    if (!TextUtils.isEmpty(B)) {
                        map.put("device_login_id", B);
                    }
                    Log.m165389i("Initor", "loginDeviceId: " + B);
                    String deviceId = C36083a.m141486a().getPassportDependency().mo133096o().getDeviceId();
                    if (!TextUtils.isEmpty(deviceId)) {
                        map.put("device_id", deviceId);
                    }
                }

                @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64274a
                /* renamed from: a */
                public void mo178081a(String str, JSONObject jSONObject) {
                    if (!C57765ac.m224193g(context)) {
                        Statistics.sendEvent(str, jSONObject);
                    } else {
                        C51702c.m200484a().mo201588a(str, jSONObject);
                    }
                }

                @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64274a
                /* renamed from: a */
                public void mo178082a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                    ApmAgent.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
                }

                @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64274a
                /* renamed from: a */
                public void mo178080a(String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
                    if (!C57765ac.m224193g(context)) {
                        AppLogProxy.onEvent(str, str2, str3, j, j2, jSONObject);
                    } else {
                        C51702c.m200484a().mo201587a(str, str2, str3, j, j2, jSONObject);
                    }
                }
            });
            Log.m165389i("Initor", "offline push init");
            if (C26252ad.m94993b(context)) {
                C36083a.m141486a().getPassportDependency().mo133096o().addDeviceIdChangeListener(new AbstractC49390d.AbstractC49391a(context) {
                    /* class com.ss.android.lark.platform.offlinepush.$$Lambda$a$a$O625iSB1TN_y7xJmmR8uc9jEWBk */
                    public final /* synthetic */ Context f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d.AbstractC49391a
                    public final void onDeviceIdChange(String str) {
                        C51894a.C51895a.m201285a(this.f$0, str);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m201285a(Context context, String str) {
            if (!TextUtils.isEmpty(str)) {
                m201288i(context);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.offlinepush.a$b */
    public static class C51904b extends C51857a {
        /* renamed from: a */
        private String m201306a(String str) {
            if (str.startsWith("http")) {
                return str;
            }
            return "https://" + str;
        }

        public C51904b(Context context, AbstractC25990b bVar) {
            super(context, bVar);
        }

        @Override // com.ss.android.lark.platform.network.C51857a
        /* renamed from: a */
        public BaseResponse mo178023a(String str, Map<String, String> map) {
            return super.mo178023a(m201306a(str), map);
        }

        @Override // com.bytedance.common.utility.NetworkClient, com.ss.android.lark.platform.network.C51857a
        public String get(String str, Map<String, String> map, NetworkClient.ReqContext reqContext) throws Exception {
            return super.get(m201306a(str), map, reqContext);
        }

        @Override // com.ss.android.lark.platform.network.C51857a
        /* renamed from: a */
        public BaseResponse mo178024a(String str, byte[] bArr, Map<String, String> map) {
            return super.mo178024a(m201306a(str), bArr, map);
        }

        @Override // com.bytedance.common.utility.NetworkClient, com.ss.android.lark.platform.network.C51857a
        public String post(String str, List<Pair<String, String>> list, Map<String, String> map, NetworkClient.ReqContext reqContext) throws CommonHttpException {
            return super.post(m201306a(str), list, map, reqContext);
        }

        @Override // com.bytedance.common.utility.NetworkClient
        public byte[] postDataStream(String str, byte[] bArr, Map<String, String> map, NetworkClient.ReqContext reqContext) throws CommonHttpException {
            return super.postDataStream(m201306a(str), bArr, map, reqContext);
        }

        @Override // com.bytedance.common.utility.NetworkClient, com.ss.android.lark.platform.network.C51857a
        public String post(String str, byte[] bArr, Map<String, String> map, NetworkClient.ReqContext reqContext) throws CommonHttpException {
            return super.post(m201306a(str), bArr, map, reqContext);
        }

        @Override // com.bytedance.common.utility.NetworkClient, com.ss.android.lark.platform.network.C51857a
        public String post(String str, byte[] bArr, boolean z, String str2, boolean z2) throws CommonHttpException {
            return super.post(m201306a(str), bArr, z, str2, z2);
        }
    }

    /* renamed from: a */
    public static String m201283a(Context context) {
        if (C26252ad.m94993b(context)) {
            String a = DynamicConfigModule.m145551a(DomainSettings.Alias.TTPUSH);
            Log.m165389i("InitOfflinePushModulePr", "load offline push sdk host from config , in main process");
            return a;
        }
        String dynamicDomain = DynamicConfigModule.m145554c().getDynamicDomain(DomainSettings.Alias.TTPUSH.getValue());
        Log.m165389i("InitOfflinePushModulePr", "load offline push sdk host from config , in wschannel process");
        return dynamicDomain;
    }
}
