package com.tt.miniapp.util;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.entity.AppInfoEntity;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.util.r */
public class C67054r {

    /* renamed from: com.tt.miniapp.util.r$a */
    public static class C67055a {

        /* renamed from: a */
        public String f169027a;

        /* renamed from: b */
        public int f169028b;

        /* renamed from: c */
        public String f169029c;
    }

    /* renamed from: a */
    public static boolean m261338a(IAppContext iAppContext) {
        AppConfig appConfig;
        ArrayList<AppConfig.C65691f.C65692a> arrayList;
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
        if (inst == null || (appConfig = inst.getAppConfig()) == null || (arrayList = appConfig.mo230041b().f165540f) == null || arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static JSONObject m261337a(Uri uri) {
        Set<String> queryParameterNames;
        JSONObject jSONObject = new JSONObject();
        if (!(uri == null || (queryParameterNames = uri.getQueryParameterNames()) == null)) {
            for (String str : queryParameterNames) {
                try {
                    jSONObject.put(str, uri.getQueryParameter(str));
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "PageUtil", e.getStackTrace());
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static String m261343b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains(".")) {
            str = str.substring(0, str.indexOf("."));
        }
        if (str.contains("?")) {
            str = str.substring(0, str.indexOf("?"));
        }
        if (str.contains(ContainerUtils.FIELD_DELIMITER)) {
            return str.substring(0, str.indexOf(ContainerUtils.FIELD_DELIMITER));
        }
        return str;
    }

    /* renamed from: a */
    public static C67055a m261336a(String str) {
        C67055a aVar = new C67055a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar.f169027a = jSONObject.optString("url", CharacterUtils.empty());
            if (!TextUtils.isEmpty(aVar.f169027a)) {
                int indexOf = aVar.f169027a.indexOf("?");
                if (indexOf > 0) {
                    aVar.f169029c = aVar.f169027a.substring(0, indexOf);
                } else {
                    aVar.f169029c = aVar.f169027a;
                }
            }
            aVar.f169028b = jSONObject.optInt("delta", 1);
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "PageUtil", e.getStackTrace());
        }
        return aVar;
    }

    /* renamed from: a */
    public static boolean m261339a(AppInfoEntity appInfoEntity, AppConfig appConfig) {
        String str;
        String str2 = "";
        if (appInfoEntity == null) {
            str = str2;
        } else {
            str = appInfoEntity.startPage;
        }
        if (appConfig != null) {
            str2 = appConfig.f165497d;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m261340a(String str, IAppContext iAppContext) {
        AppConfig appConfig;
        if (TextUtils.isEmpty(str) || (appConfig = AppbrandApplicationImpl.getInst(iAppContext).getAppConfig()) == null || appConfig.mo230042c() == null) {
            return false;
        }
        int indexOf = str.indexOf("?");
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        if (appConfig.mo230042c().indexOf(str) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m261341a(String str, AppConfig appConfig) {
        if (appConfig == null || appConfig.mo230041b() == null || appConfig.mo230041b().f165540f == null || TextUtils.isEmpty(str)) {
            return false;
        }
        int indexOf = str.indexOf("?");
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        for (AppConfig.C65691f.C65692a aVar : appConfig.mo230041b().f165540f) {
            if (TextUtils.equals(aVar.f165541a, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m261342a(String str, String str2) {
        try {
            Uri parse = Uri.parse("http://" + str);
            Uri parse2 = Uri.parse("http://" + str2);
            return m261337a(parse).toString().equals(m261337a(parse2).toString());
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "PageUtil", e.getStackTrace());
            return false;
        }
    }
}
