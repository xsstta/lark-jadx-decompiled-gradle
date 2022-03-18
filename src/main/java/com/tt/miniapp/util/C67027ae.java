package com.tt.miniapp.util;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3266c.C65809a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import java.util.List;
import java.util.Locale;

/* renamed from: com.tt.miniapp.util.ae */
public class C67027ae {
    /* renamed from: a */
    public static String m261237a(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return "";
        }
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return "";
        }
        return scheme;
    }

    /* renamed from: b */
    private static boolean m261240b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("tel") || lowerCase.equals("mailto") || lowerCase.equals("sms")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m261238a(String str, IAppContext iAppContext) {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
            intent.setFlags(268435456);
            Activity currentActivity = iAppContext.getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivity(intent);
            }
            return true;
        } catch (Exception e) {
            AppBrandLogger.m52829e("WebviewSchemaUtil", e);
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m261241b(String str, IAppContext iAppContext) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            Activity currentActivity = iAppContext.getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivity(intent);
            }
            return true;
        } catch (Exception e) {
            AppBrandLogger.m52829e("WebviewSchemaUtil", e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m261239a(String str, String str2, IAppContext iAppContext) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        if (lowerCase.startsWith("tel")) {
            try {
                C65809a.m257938a(iAppContext.getCurrentActivity(), str2);
                return true;
            } catch (Exception e) {
                AppBrandLogger.m52829e("WebviewSchemaUtil", "openSchema tel", e);
                return false;
            }
        } else if (lowerCase.startsWith("mailto")) {
            return m261238a(str2, iAppContext);
        } else {
            return m261241b(str2, iAppContext);
        }
    }

    /* renamed from: b */
    public static boolean m261242b(String str, String str2, IAppContext iAppContext) {
        ArrayMap<String, List<String>> arrayMap;
        AppBrandLogger.m52828d("WebviewSchemaUtil", "isWhiteList =  url ", str2);
        if (m261240b(str2)) {
            return true;
        }
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        if (appInfo == null || TextUtils.isEmpty(str2) || (arrayMap = appInfo.domainMap) == null || arrayMap.isEmpty() || !arrayMap.containsKey(str) || arrayMap.get(str) == null || !arrayMap.get(str).contains(str2)) {
            return false;
        }
        return true;
    }
}
