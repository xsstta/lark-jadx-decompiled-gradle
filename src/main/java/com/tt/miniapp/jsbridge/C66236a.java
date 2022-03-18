package com.tt.miniapp.jsbridge;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.data.C67488b;
import com.tt.option.ext.AbstractC67619e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.jsbridge.a */
public class C66236a {

    /* renamed from: a */
    private static List<String> f167188a = Arrays.asList("getAdSiteBaseInfo", "insertAdHTMLWebView", "updateAdHTMLWebView", "removeAdHTMLWebView");

    /* renamed from: b */
    private static List<String> f167189b = Arrays.asList("dealUserRelation", "createDownloadAppTask", "getUseDuration", "getGeneralInfo", "getUsageRecord", "preloadMiniProgram", "addShortcut", "showMorePanel", "setMenuButtonVisibility", "checkShortcut", "onBeforeCloseReturnSync");

    /* renamed from: a */
    public static boolean m259221a(IAppContext iAppContext) {
        return false;
    }

    /* renamed from: a */
    private static List<String> m259220a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m259226b(IAppContext iAppContext) {
        C67488b a = C67485a.m262488a(iAppContext).mo234280a();
        if (a.f170190q == null || !a.f170190q.contains("onBeforeCloseReturnSync")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m259228c(IAppContext iAppContext) {
        C67488b a = C67485a.m262488a(iAppContext).mo234280a();
        if (a.f170190q == null || !a.f170190q.contains("getUserInfo")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static JSONArray m259229d(IAppContext iAppContext) {
        C67488b a = C67485a.m262488a(iAppContext).mo234280a();
        if (a.f170191r == null) {
            a.f170191r = new JSONArray();
        }
        return a.f170191r;
    }

    /* renamed from: e */
    public static JSONArray m259231e(IAppContext iAppContext) {
        C67488b a = C67485a.m262488a(iAppContext).mo234280a();
        if (a.f170189p == null) {
            a.f170189p = new JSONArray();
        }
        return a.f170189p;
    }

    /* renamed from: a */
    private static String m259219a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str + ":fail " + "platform auth deny");
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ApiPermissionManager", e.getStackTrace());
            return "";
        }
    }

    /* renamed from: b */
    public static void m259225b(String str, IAppContext iAppContext) {
        C67488b a = C67485a.m262488a(iAppContext).mo234280a();
        if (TextUtils.isEmpty(str)) {
            a.f170187n = new ArrayList();
            return;
        }
        try {
            a.f170187n = m259220a(new JSONObject(str).optJSONArray("host_method_whitelist"));
        } catch (Exception e) {
            a.f170187n = new ArrayList();
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m259227c(String str, IAppContext iAppContext) {
        C67488b a = C67485a.m262488a(iAppContext).mo234280a();
        if (TextUtils.isEmpty(str)) {
            a.f170188o = new ArrayList();
            return;
        }
        try {
            a.f170188o = m259220a(new JSONArray(str));
        } catch (Exception e) {
            e.printStackTrace();
            a.f170188o = new ArrayList();
        }
    }

    /* renamed from: d */
    public static void m259230d(String str, IAppContext iAppContext) {
        C67488b a = C67485a.m262488a(iAppContext).mo234280a();
        if (TextUtils.isEmpty(str)) {
            a.f170190q = new ArrayList();
            return;
        }
        try {
            a.f170191r = new JSONArray(str);
            a.f170190q = m259220a(a.f170191r);
        } catch (Exception e) {
            e.printStackTrace();
            a.f170190q = new ArrayList();
        }
    }

    /* renamed from: a */
    public static boolean m259224a(String str, IAppContext iAppContext) {
        List<String> list = C67485a.m262488a(iAppContext).mo234280a().f170187n;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return list.contains(str);
    }

    /* renamed from: a */
    public static boolean m259222a(String str, int i, AbstractC67619e eVar, IAppContext iAppContext) {
        C67488b a = C67485a.m262488a(iAppContext).mo234280a();
        if (a.f170188o != null && a.f170188o.contains(str)) {
            C66036d.m258584a("intercept event:" + str, iAppContext);
            eVar.callback(i, m259219a(str));
            return true;
        } else if (!f167188a.contains(str) || AppbrandApplicationImpl.getInst(iAppContext).getAppInfo().isAdSite()) {
            return false;
        } else {
            if (a.f170190q == null || !a.f170190q.contains(str)) {
                C66036d.m258584a("intercept event:" + str, iAppContext);
                eVar.callback(i, m259219a(str));
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m259223a(String str, int i, String str2, IAppContext iAppContext) {
        boolean z;
        C67488b a = C67485a.m262488a(iAppContext).mo234280a();
        if (a.f170188o != null && a.f170188o.contains(str)) {
            AppBrandLogger.m52830i("ApiPermissionManager", "event：" + str + " in blackAPIList");
            StringBuilder sb = new StringBuilder();
            sb.append("intercept event:");
            sb.append(str);
            C66036d.m258584a(sb.toString(), iAppContext);
            C67432a.m262319a(iAppContext).getJsBridge().returnAsyncResult(i, str, m259219a(str), str2);
            return true;
        } else if (f167189b.contains(str) && (a.f170190q == null || !a.f170190q.contains(str))) {
            Object[] objArr = new Object[1];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("event:");
            sb2.append(str);
            sb2.append(" not whiteAPIList. ");
            if (a.f170190q == null) {
                z = true;
            } else {
                z = false;
            }
            sb2.append(z);
            objArr[0] = sb2.toString();
            AppBrandLogger.m52830i("ApiPermissionManager", objArr);
            C67432a.m262319a(iAppContext).getJsBridge().returnAsyncResult(i, str, m259219a(str), str2);
            C66036d.m258584a("intercept event:" + str, iAppContext);
            return true;
        } else if (!C25529d.m91159c(iAppContext, str)) {
            return false;
        } else {
            AppBrandLogger.m52830i("ApiPermissionManager", "event:" + str + " shouldIntercept JSCall");
            return true;
        }
    }
}
