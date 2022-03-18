package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.C2016b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.appsflyer.internal.q */
public final class C2027q {

    /* renamed from: com.appsflyer.internal.q$b */
    public interface AbstractC2029b {
        /* renamed from: Ι */
        void mo9992(String str, Exception exc);

        /* renamed from: Ι */
        void mo9993(String str, String str2);
    }

    /* renamed from: com.appsflyer.internal.q$4 */
    public static class C20284 implements InvocationHandler {

        /* renamed from: ı */
        private /* synthetic */ AbstractC2029b f6980;

        C20284() {
        }

        public C20284(AbstractC2029b bVar) {
            this.f6980 = bVar;
        }

        /* renamed from: ι */
        public static boolean m8925(Context context) {
            if (AppsFlyerLib.getInstance().isTrackingStopped()) {
                return false;
            }
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
                if (AFExecutor.ThreadFactoryC19774.m8713(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class))) {
                    return true;
                }
                AFLogger.afWarnLog("Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.");
                return false;
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th) {
                AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
            }
        }

        /* renamed from: ǃ */
        public static void m8924(Context context, String str) {
            if (str != null) {
                AFLogger.afInfoLog("updateServerUninstallToken called with: ".concat(String.valueOf(str)));
                C2016b.C2017d.C2018e r0 = C2016b.C2017d.C2018e.m8907(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
                SharedPreferences sharedPreferences = AppsFlyerLibCore.getSharedPreferences(context);
                if (!sharedPreferences.getBoolean("sentRegisterRequestToAF", false) || r0.f6915 == null || !r0.f6915.equals(str)) {
                    AppsFlyerProperties.getInstance().set("afUninstallToken", str);
                    if (AppsFlyerLibCore.m8770(sharedPreferences)) {
                        AppsFlyerLibCore.getInstance().mo9988(context, str);
                    }
                }
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String str;
            String str2;
            if (method.getName().equals("onLvlResult")) {
                if (objArr[0] != null) {
                    str = (String) objArr[0];
                } else {
                    str = null;
                }
                if (objArr[1] != null) {
                    str2 = (String) objArr[1];
                } else {
                    str2 = null;
                }
                AbstractC2029b bVar = this.f6980;
                if (bVar == null) {
                    AFLogger.afDebugLog("onLvlResult invocation succeeded, but listener is null");
                } else if (str != null && str2 != null) {
                    bVar.mo9993(str, str2);
                } else if (str2 == null) {
                    bVar.mo9992("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                } else {
                    bVar.mo9992("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                }
            } else if (method.getName().equals("onLvlFailure")) {
                AbstractC2029b bVar2 = this.f6980;
                if (bVar2 == null) {
                    AFLogger.afDebugLog("onLvlFailure: listener is null");
                } else if (objArr[0] != null) {
                    bVar2.mo9992("onLvlFailure with exception", (Exception) objArr[0]);
                } else {
                    bVar2.mo9992("onLvlFailure", new Exception("unknown"));
                }
            } else {
                AbstractC2029b bVar3 = this.f6980;
                if (bVar3 != null) {
                    bVar3.mo9992("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
                }
            }
            return null;
        }
    }

    C2027q() {
    }
}
