package com.ss.android.lark.platform.p2476b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.applog.encryptor.EncryptorUtil;
import com.bytedance.applog.manager.DeviceRegisterParameterFactory;
import com.bytedance.p216c.AbstractC3586a;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26254af;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.applogbridge.model.InitConfig;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.dynamicconfig.service.impl.C36885b;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.platform.network.C51857a;
import com.ss.android.lark.platform.network.C51864e;
import com.ss.android.lark.statistics.C54931a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.lark.platform.b.a */
public class C51714a {
    /* renamed from: a */
    private static void m200519a() {
        AppLogProxy.initDataObserver();
        AppLogProxy.initSessionHook();
    }

    /* renamed from: c */
    private static AbstractC3586a m200526c() {
        return new AbstractC3586a() {
            /* class com.ss.android.lark.platform.p2476b.C51714a.C517151 */

            @Override // com.bytedance.p216c.AbstractC3586a
            /* renamed from: a */
            public byte[] mo14491a(byte[] bArr, int i) {
                if (bArr == null) {
                    return null;
                }
                return EncryptorUtil.m14355a(bArr, i);
            }
        };
    }

    /* renamed from: d */
    private static boolean m200527d() {
        return C37239a.m146648b().mo136951a("tt_log_settings");
    }

    /* renamed from: b */
    private static List<String> m200524b() {
        ArrayList arrayList = new ArrayList();
        String a = C36885b.m145580c().mo136165a("internal_api");
        if (TextUtils.isEmpty(a)) {
            return arrayList;
        }
        arrayList.add("https://" + a + "/collect/event/app/v1/");
        return arrayList;
    }

    /* renamed from: b */
    private static void m200525b(Context context) {
        m200519a();
        C36083a.m141486a().getPassportDependency().mo133096o();
    }

    /* renamed from: a */
    public static void m200520a(Context context) {
        if (C26252ad.m94993b(context)) {
            m200525b(context);
        }
        m200521a(context, PackageChannelManager.getBuildPackageChannel(context));
        if (C26252ad.m94993b(context)) {
            AppLogProxy.setAutoActiveState(true);
        }
    }

    /* renamed from: a */
    public static String m200518a(boolean z) {
        if (!z) {
            String string = C57744a.m224104a().getString("applog_host_sp", null);
            if (!TextUtils.isEmpty(string)) {
                Log.m165389i("AppLogInitor", "fetchAppLogDomain from cache , hit");
                return string;
            }
            Log.m165389i("AppLogInitor", "fetchAppLogDomain from cache , not hit , first launch");
        }
        String a = DynamicConfigModule.m145552b().mo136165a("tt_applog");
        C57744a.m224104a().putString("applog_host_sp", a);
        Log.m165389i("AppLogInitor", "fetchAppLogDomain from config and cache it");
        return a;
    }

    /* renamed from: a */
    private static void m200522a(Locale locale) {
        if (locale != null) {
            AppLogProxy.setAppLanguageAndRegion(locale.getLanguage(), locale.getCountry().toUpperCase());
        }
    }

    /* renamed from: a */
    private static void m200521a(Context context, String str) {
        if (C54931a.m213013e(context)) {
            str = "local_test";
        }
        if ("test_monkey".equals(PackageChannelManager.getBuildPackageChannel(LarkContext.getApplication()))) {
            AppLogProxy.setEventReportEnable(false);
        }
        C51857a aVar = null;
        AbstractC25990b a = C51864e.m201147a();
        if (a != null) {
            aVar = new C51857a(context, a);
        }
        String a2 = m200518a(false);
        InitConfig aVar2 = new InitConfig(C29410a.m108287a().mo104278b(), str, aVar, a2, m200524b(), m200527d(), m200526c());
        Log.m165389i("AppLogInitor", "init applog run domain=" + a2 + "; unit=" + C36083a.m141486a().getPassportDependency().mo133091j());
        if (C54931a.m213013e(context)) {
            AppLogProxy.setNewUserMode(context, true);
            try {
                Field declaredField = DeviceRegisterParameterFactory.class.getDeclaredField("sIsNewUserMode");
                declaredField.setAccessible(true);
                C26254af.m95006a(declaredField, (Object) true);
            } catch (Exception e) {
                Log.m165399w("AppLogInitor", e);
            }
        }
        AppLogProxy.init(context, aVar2);
        AppLogProxy.silenceInBackground(true);
        AppLogProxy.setAutoABConfig(false);
        m200522a(C36235a.m142710a().mo148282c().mo148297b());
        C36235a.m142710a().mo148282c().mo148290a($$Lambda$a$kBhkvgCfNDF8cZjJRFKP68OUsA.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m200523a(Locale locale, Locale locale2) {
        Log.m165379d("AppLogInitor", "language change from " + locale + " to " + locale2);
        m200522a(locale2);
    }
}
