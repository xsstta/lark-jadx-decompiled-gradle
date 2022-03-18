package com.tt.miniapp.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.infra.network.C24951s;
import com.larksuite.component.openplatform.core.plugin.infra.network.OnNetworkStatusChangeUtil;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.refer.common.util.NetworkUtil;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.util.q */
public final class C67053q {
    /* renamed from: a */
    public static void m261324a(IAppContext iAppContext) {
        OnNetworkStatusChangeUtil.m90202a(iAppContext);
    }

    /* renamed from: b */
    public static String m261329b(Context context) {
        return NetworkUtil.m264004a(context);
    }

    /* renamed from: b */
    public static void m261330b(IAppContext iAppContext) {
        OnNetworkStatusChangeUtil.m90203b(iAppContext);
        C24951s.m90208a().mo88038b(iAppContext);
    }

    /* renamed from: a */
    public static byte[] m261327a(InputStream inputStream) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: c */
    public static String m261331c(Context context) {
        if (HostDependManager.getInst().getFeatureGating("gadget.api.networktype")) {
            return NetworkUtil.m264005a(context, (ConnectivityManager) context.getSystemService("connectivity"));
        }
        return NetworkUtil.m264006b(context);
    }

    /* renamed from: d */
    public static boolean m261333d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m261325a(Context context) {
        if (context == null) {
            return true;
        }
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
        if (allNetworkInfo != null) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.isAvailable() && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static List<String> m261332c(IAppContext iAppContext) {
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        if (appInfo == null || appInfo.domainMap == null) {
            return null;
        }
        return appInfo.domainMap.get("appids");
    }

    /* renamed from: f */
    public static boolean m261335f(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getState() != NetworkInfo.State.CONNECTED) {
                return false;
            }
            return true;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_NetUtils", e.getStackTrace());
            return false;
        }
    }

    /* renamed from: a */
    public static byte[] m261328a(String str) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(5000);
        return m261327a(httpURLConnection.getInputStream());
    }

    /* renamed from: e */
    public static final String m261334e(Context context) {
        String str = null;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                String typeName = activeNetworkInfo.getTypeName();
                if (!"MOBILE".equalsIgnoreCase(typeName)) {
                    str = typeName;
                } else {
                    str = activeNetworkInfo.getExtraInfo();
                    if (str == null) {
                        str = typeName + "#[]";
                    }
                }
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_NetUtils", e.getStackTrace());
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m261326a(String str, String str2, IAppContext iAppContext) {
        boolean z;
        AppBrandLogger.m52830i("tma_NetUtils", "isSafeDomain execute url is -> ", C67019aa.m261223a(str2));
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        if (appInfo != null && (!appInfo.isLocalTest() || appInfo.isAudit())) {
            HostDependManager inst = HostDependManager.getInst();
            if (!appInfo.isLocalTest() || appInfo.isAudit()) {
                z = true;
            } else {
                z = false;
            }
            if (inst.isCheckSafeDomain(z, str, str2, iAppContext)) {
                if (TextUtils.isEmpty(str)) {
                    AppBrandLogger.m52830i("tma_NetUtils", "type is empty return true!");
                    return true;
                } else if (TextUtils.isEmpty(str2)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "no url");
                        jSONObject.put("url", str2);
                    } catch (JSONException e) {
                        AppBrandLogger.stacktrace(6, "tma_NetUtils", e.getStackTrace());
                    }
                    AppBrandLogger.m52830i("tma_NetUtils", "isSafeDomain url is empty!");
                    C67509b.m262587a("mp_start_error", 1011, jSONObject, iAppContext);
                    return false;
                } else {
                    ArrayMap<String, List<String>> arrayMap = appInfo.domainMap;
                    if (arrayMap == null || arrayMap.isEmpty()) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put(ApiHandler.API_CALLBACK_ERRMSG, "mDomainMap null");
                            jSONObject2.put("url", str2);
                        } catch (JSONException e2) {
                            AppBrandLogger.stacktrace(6, "tma_NetUtils", e2.getStackTrace());
                        }
                        AppBrandLogger.m52830i("tma_NetUtils", "isSafeDomain->mDomainMap null ");
                        C67509b.m262587a("mp_start_error", 1011, jSONObject2, iAppContext);
                        return false;
                    }
                    Uri parse = Uri.parse(str2);
                    String host = parse.getHost();
                    AppBrandLogger.m52830i("tma_NetUtils", "host = ", host, " url ", str2);
                    if (TextUtils.equals(str, "request") || TextUtils.equals(str, "upload") || TextUtils.equals(str, "download")) {
                        if (!TextUtils.equals("https", parse.getScheme())) {
                            AppBrandLogger.m52828d("tma_NetUtils", "getScheme = ", parse.getScheme(), " url ", str2);
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put(ApiHandler.API_CALLBACK_ERRMSG, "not https");
                                jSONObject3.put("url", str2);
                                AppBrandLogger.m52830i("tma_NetUtils", "isSafeDomain-> not https.....");
                            } catch (JSONException e3) {
                                AppBrandLogger.stacktrace(6, "tma_NetUtils", e3.getStackTrace());
                            }
                            C67509b.m262587a("mp_start_error", 1011, jSONObject3, iAppContext);
                            return false;
                        }
                    } else if (TextUtils.equals(str, "socket")) {
                        if (!TextUtils.equals("wss", parse.getScheme())) {
                            AppBrandLogger.m52828d("tma_NetUtils", "getScheme = ", parse.getScheme(), " url ", str2);
                            JSONObject jSONObject4 = new JSONObject();
                            try {
                                jSONObject4.put(ApiHandler.API_CALLBACK_ERRMSG, "not wss");
                                jSONObject4.put("url", str2);
                                AppBrandLogger.m52830i("tma_NetUtils", "isSafeDomain-> not wss.....");
                            } catch (JSONException e4) {
                                AppBrandLogger.stacktrace(6, "tma_NetUtils", e4.getStackTrace());
                            }
                            C67509b.m262587a("mp_start_error", 1011, jSONObject4, iAppContext);
                            return false;
                        }
                    } else if (TextUtils.equals(str, "appids")) {
                        if (!arrayMap.containsKey(str)) {
                            return false;
                        }
                        List<String> list = arrayMap.get(str);
                        String queryParameter = parse.getQueryParameter("app_id");
                        if (list == null || !list.contains(queryParameter)) {
                            return false;
                        }
                        return true;
                    }
                    if (arrayMap.containsKey(str)) {
                        List<String> list2 = arrayMap.get(str);
                        if (list2 != null) {
                            if (!TextUtils.equals(str, "webview")) {
                                return list2.contains(host);
                            }
                            for (String str3 : list2) {
                                if (host != null && host.endsWith(str3)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put(ApiHandler.API_CALLBACK_ERRMSG, "not exits");
                        jSONObject5.put("url", str2);
                    } catch (JSONException e5) {
                        AppBrandLogger.stacktrace(6, "tma_NetUtils", e5.getStackTrace());
                    }
                    AppBrandLogger.m52830i("tma_NetUtils", "type is not exits ");
                    C67509b.m262587a("mp_start_error", 1011, jSONObject5, iAppContext);
                    return false;
                }
            }
        }
        AppBrandLogger.m52830i("tma_NetUtils", "isSafeDomain not check");
        return true;
    }
}
