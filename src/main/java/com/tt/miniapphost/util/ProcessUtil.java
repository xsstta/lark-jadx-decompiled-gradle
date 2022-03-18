package com.tt.miniapphost.util;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.framework.utils.C26252ad;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.process.data.C67575a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.process.p3376b.C67566c;
import com.tt.miniapphost.process.p3379e.C67577a;
import org.json.JSONException;
import org.json.JSONObject;

public class ProcessUtil {

    /* renamed from: com.tt.miniapphost.util.ProcessUtil$a */
    public static class C67582a {

        /* renamed from: a */
        public Boolean f170406a;

        /* renamed from: b */
        public Boolean f170407b;

        /* renamed from: c */
        public Boolean f170408c;
    }

    public static String getProcess() {
        String curProcessName = getCurProcessName(AppbrandContext.getInst().getApplicationContext());
        if (curProcessName == null) {
            return "";
        }
        return curProcessName;
    }

    public static String getProcessIdentify() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (isMainProcess(applicationContext)) {
            return "hostProcess";
        }
        ISandboxEnvInfo b = C66645a.m260337a().mo232358b(getCurProcessName(applicationContext));
        if (b != null) {
            return b.getProcessIdentity();
        }
        if (isP0Process()) {
            return "p0";
        }
        return "";
    }

    public static void killCurrentMiniAppProcess() {
        AppBrandLogger.m52828d("ProcessUtil", "killCurrentMiniAppProcess");
        try {
            if (isMiniappProcess()) {
                Process.killProcess(Process.myPid());
                System.exit(0);
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ProcessUtil", e.getStackTrace());
        }
    }

    public static boolean isMiniappProcess() {
        C67582a aVar = ContextSingletonInstance.getInstance().processInstance;
        if (aVar.f170407b != null) {
            return aVar.f170407b.booleanValue();
        }
        try {
            if (MiniAppProcessUtils.isMiniAppProcess(getCurProcessName(AppbrandContext.getInst().getApplicationContext()))) {
                Boolean bool = true;
                aVar.f170407b = bool;
                return bool.booleanValue();
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("ProcessUtil", e);
        }
        Boolean bool2 = false;
        aVar.f170407b = bool2;
        return bool2.booleanValue();
    }

    public static boolean isP0Process() {
        C67582a aVar = ContextSingletonInstance.getInstance().processInstance;
        if (aVar.f170408c != null) {
            return aVar.f170408c.booleanValue();
        }
        try {
            if (getCurProcessName(AppbrandContext.getInst().getApplicationContext()).contains(":p0")) {
                Boolean bool = true;
                aVar.f170408c = bool;
                return bool.booleanValue();
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("ProcessUtil", e);
        }
        Boolean bool2 = false;
        aVar.f170408c = bool2;
        return bool2.booleanValue();
    }

    public static String getCurProcessName(Context context) {
        return C26252ad.m94992a(context);
    }

    public static C67577a generateAsyncIpcHandlerFromBundle(Bundle bundle) {
        String string = bundle.getString("ma_callerProcessIdentify");
        int i = bundle.getInt("ma_callbackId", 0);
        if (!TextUtils.isEmpty(string) && i != 0) {
            return new C67577a(new C67575a.C67576a(string, i));
        }
        DebugUtil.outputError("ProcessUtil", "generateAsyncIpcHandlerFromBundle error. processIdentify: " + string + " callbackId: " + i);
        return null;
    }

    public static C67577a generateAsyncIpcHandlerFromIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("ma_callerProcessIdentify");
        int intExtra = intent.getIntExtra("ma_callbackId", 0);
        if (!TextUtils.isEmpty(stringExtra) && intExtra != 0) {
            return new C67577a(new C67575a.C67576a(stringExtra, intExtra));
        }
        DebugUtil.outputError("ProcessUtil", "generateAsyncIpcHandlerFromIntent error. processIdentify: " + stringExtra + " callbackId: " + intExtra);
        return null;
    }

    public static C67577a generateAsyncIpcHandlerFromJSONObject(JSONObject jSONObject) {
        String optString = jSONObject.optString("ma_callerProcessIdentify");
        int optInt = jSONObject.optInt("ma_callbackId", 0);
        if (!TextUtils.isEmpty(optString) && optInt != 0) {
            return new C67577a(new C67575a.C67576a(optString, optInt));
        }
        DebugUtil.outputError("ProcessUtil", "generateAsyncIpcHandlerFromIntent error. processIdentify: " + optString + " callbackId: " + optInt);
        return null;
    }

    public static C67577a generateAsyncIpcHandlerFromUri(Uri uri) {
        int i;
        String queryParameter = uri.getQueryParameter("ma_callerProcessIdentify");
        try {
            i = Integer.parseInt(uri.getQueryParameter("ma_callbackId"));
        } catch (Exception e) {
            AppBrandLogger.m52829e("ProcessUtil", "generateAsyncIpcHandlerFromUri", e);
            i = 0;
        }
        if (!TextUtils.isEmpty(queryParameter) && i != 0) {
            return new C67577a(new C67575a.C67576a(queryParameter, i));
        }
        DebugUtil.outputError("ProcessUtil", "generateAsyncIpcHandlerFromIntent error. processIdentify: " + queryParameter + " callbackId: " + i);
        return null;
    }

    public static boolean isMainProcess(Context context) {
        C67582a aVar = ContextSingletonInstance.getInstance().processInstance;
        if (aVar.f170406a != null) {
            return aVar.f170406a.booleanValue();
        }
        String curProcessName = getCurProcessName(context);
        if (curProcessName != null && curProcessName.contains(":")) {
            Boolean bool = false;
            aVar.f170406a = bool;
            return bool.booleanValue();
        } else if (context == null || curProcessName == null) {
            return false;
        } else {
            Boolean valueOf = Boolean.valueOf(curProcessName.equals(context.getPackageName()));
            aVar.f170406a = valueOf;
            if (valueOf.booleanValue()) {
                return true;
            }
            return false;
        }
    }

    public static void fillCrossProcessCallbackIntent(Intent intent, AbstractC67565b bVar) {
        C67566c.m262973a().mo232256a(bVar);
        intent.putExtra("ma_callerProcessIdentify", getProcessIdentify());
        intent.putExtra("ma_callbackId", bVar.mo234709b());
    }

    public static void fillCrossProcessCallbackUri(Uri.Builder builder, AbstractC67565b bVar) {
        C67566c.m262973a().mo232256a(bVar);
        builder.appendQueryParameter("ma_callerProcessIdentify", getProcessIdentify());
        builder.appendQueryParameter("ma_callbackId", String.valueOf(bVar.mo234709b()));
    }

    public static void transferAsyncIpcHandlerInIntent(C67577a aVar, Intent intent) {
        C67575a.C67576a a = aVar.mo234766a();
        if (a != null) {
            intent.putExtra("ma_callerProcessIdentify", a.mo234764a());
            intent.putExtra("ma_callbackId", a.mo234765b());
        }
    }

    public static void fillCrossProcessCallbackJSONObject(JSONObject jSONObject, AbstractC67565b bVar) {
        C67566c.m262973a().mo232256a(bVar);
        try {
            jSONObject.put("ma_callerProcessIdentify", getProcessIdentify());
            jSONObject.put("ma_callbackId", bVar.mo234709b());
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ProcessUtil", "fillCrossProcessCallbackInformation fail", e);
        }
    }

    public static void transferAsyncIpcHandlerInJSONObject(C67577a aVar, JSONObject jSONObject) {
        C67575a.C67576a a = aVar.mo234766a();
        if (a != null) {
            try {
                jSONObject.put("ma_callerProcessIdentify", a.mo234764a());
                jSONObject.put("ma_callbackId", a.mo234765b());
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ProcessUtil", "transferAsyncIpcHandlerInJSONObject fail", e);
            }
        }
    }
}
