package com.bytedance.ee.larkbrand.p654h;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p626b.C12810b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.vesdk.C64034n;
import com.tt.miniapp.ac.C65727a;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67522b;
import com.tt.miniapphost.util.ProcessUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.h.a */
public class C13073a {

    /* renamed from: a */
    private static int f34742a;

    /* renamed from: b */
    private static int f34743b = Process.myPid();

    /* renamed from: c */
    private static String f34744c;

    static {
        String str;
        if (AppbrandContext.getInst().getApplicationContext() == null) {
            str = "";
        } else {
            str = ProcessUtil.getCurProcessName(AppbrandContext.getInst().getApplicationContext());
        }
        f34744c = str;
    }

    /* renamed from: b */
    public static void m53601b(IAppContext iAppContext) {
        C65727a.m257684a(iAppContext).mo230333a(f34742a, 1002, "close");
    }

    /* renamed from: a */
    public static void m53598a(IAppContext iAppContext) {
        String str;
        if (f34742a > 0) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("cmd", "set_connection_meta_info").put("payload", jSONObject2);
                AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
                String str2 = "";
                if (appInfo != null) {
                    String str3 = appInfo.appId;
                    str2 = appInfo.appName;
                    str = str3;
                } else {
                    str = str2;
                }
                jSONObject2.put("phoneBrand", C67043j.m261271a()).put("appName", str2).put("appId", str);
                C65727a.m257684a(iAppContext).mo230335a(f34742a, jSONObject.toString(), new C67522b());
            } catch (JSONException e) {
                AppBrandLogger.stacktrace(6, "LarkSocketManager", e.getStackTrace());
            }
        }
    }

    /* renamed from: a */
    public static void m53599a(JSONObject jSONObject, IAppContext iAppContext) {
        AppInfoEntity appInfo;
        if (jSONObject != null && (appInfo = C67432a.m262319a(iAppContext).getAppInfo()) != null && appInfo.isLocalTest()) {
            boolean optBoolean = jSONObject.optBoolean("allow");
            if (optBoolean) {
                m53602b(jSONObject.optString("wsUrl"), iAppContext);
            } else {
                m53601b(iAppContext);
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("allowLog", optBoolean);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (C67432a.m262319a(iAppContext).getJsBridge() != null) {
                C67432a.m262319a(iAppContext).getJsBridge().sendMsgToJsCore("onOpenLogStateChanged", jSONObject2.toString());
            }
        }
    }

    /* renamed from: b */
    private static void m53602b(String str, IAppContext iAppContext) {
        String str2;
        String str3;
        String str4;
        if (!TextUtils.isEmpty(str)) {
            if (f34742a != 0) {
                C65727a.m257684a(iAppContext).mo230333a(f34742a, CommonCode.StatusCode.API_CLIENT_EXPIRED, "reopen");
            }
            C12810b bVar = new C12810b();
            AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
            String a = C67043j.m261271a();
            String str5 = null;
            if (appInfo != null) {
                str2 = appInfo.appId;
                str3 = appInfo.appName;
            } else {
                str3 = null;
                str2 = null;
            }
            try {
                if (TextUtils.isEmpty(a)) {
                    str4 = null;
                } else {
                    str4 = URLEncoder.encode(a, "utf-8");
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str3)) {
                    str5 = URLEncoder.encode(str3, "utf-8");
                }
                StringBuilder sb = new StringBuilder(str);
                sb.append("?from=device");
                if (!TextUtils.isEmpty(str4)) {
                    sb.append("&phone_brand=");
                    sb.append(str4);
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb.append("&app_id=");
                    sb.append(str2);
                }
                if (!TextUtils.isEmpty(str5)) {
                    sb.append("&app_name=");
                    sb.append(str5);
                }
                AppBrandLogger.m52828d("LarkSocketManager", String.format("createConnect---dstWsUrl:%s", sb));
                bVar.f34201a = sb.toString();
                f34742a = C65727a.m257684a(iAppContext).mo230330a(bVar);
            } catch (UnsupportedEncodingException e) {
                AppBrandLogger.stacktrace(6, "LarkSocketManager", e.getStackTrace());
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static boolean m53600a(String str, IAppContext iAppContext) {
        String str2;
        AppBrandLogger.m52828d("LarkSocketManager", String.format("sendMsg---msg:%s", str));
        if (f34742a <= 0) {
            return false;
        }
        try {
            C67522b bVar = new C67522b();
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("cmd");
            JSONObject optJSONObject = jSONObject.optJSONObject("payload");
            if (optJSONObject == null) {
                return false;
            }
            if (!TextUtils.equals("log", optString)) {
                return true;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cmd", optString);
            jSONObject2.put("mid", C64034n.f161683a);
            JSONObject jSONObject3 = new JSONObject();
            AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
            String str3 = "";
            if (appInfo != null) {
                str3 = appInfo.appId;
                str2 = appInfo.appName;
            } else {
                str2 = str3;
            }
            jSONObject3.put("timestamp", optJSONObject.optString("timestamp")).put("level", optJSONObject.optString("level")).put("tag", optJSONObject.optString("tag")).put("content", optJSONObject.optString("content")).put("layer", "app").put("pId", f34743b).put("pName", f34744c).put("appId", str3).put("appName", str2);
            jSONObject2.put("payload", jSONObject3);
            return C65727a.m257684a(iAppContext).mo230335a(f34742a, jSONObject2.toString(), bVar);
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "LarkSocketManager", e.getStackTrace());
            return false;
        }
    }
}
