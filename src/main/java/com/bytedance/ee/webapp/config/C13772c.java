package com.bytedance.ee.webapp.config;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.webapp.C13802g;
import com.ss.android.lark.http.p1953b.C38763d;
import com.ss.android.lark.openapi.permission.bean.PermissionModel;
import com.ss.android.lark.openapi.permission.http.verify.C48772b;
import com.ss.android.lark.openapi.permission.http.verify.VerifyResponse;
import com.tt.miniapp.settings.v2.handler.C66759ab;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.bytedance.ee.webapp.config.c */
public class C13772c {
    /* renamed from: a */
    public static boolean m55813a() {
        boolean equals = TextUtils.equals(WebappAuthStrategyCreator.f35997a.mo50783a(), "url");
        boolean a = C13802g.m55926a().mo50866b().mo50838a("openplatform.api.url_config_use_strategy");
        AppBrandLogger.m52830i("AuthUtils", "configUrlLevel: ", equals + " ---- useUrlConfigStrategy: " + a);
        if (!equals || a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m55812a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String fragment = Uri.parse(str).getFragment();
        if (TextUtils.isEmpty(fragment)) {
            return str;
        }
        int indexOf = str.indexOf("#" + fragment);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: b */
    public static boolean m55814b(String str) {
        String b = C66759ab.m260590a().mo232665b();
        if (TextUtils.isEmpty(b)) {
            AppBrandLogger.m52829e("AuthUtils", "authPassList is empty");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("AuthUtils", "appId is empty");
            return false;
        } else {
            try {
                JSONArray jSONArray = new JSONArray(b);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (str.equals((String) jSONArray.get(i))) {
                        return true;
                    }
                }
            } catch (JSONException e) {
                AppBrandLogger.m52829e("AuthUtils", "isInWhiteAppId：" + str + " -> JSONException", e);
            }
            return false;
        }
    }

    /* renamed from: c */
    public static String m55815c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String query = Uri.parse(str).getQuery();
        if (!TextUtils.isEmpty(query)) {
            int indexOf = str.indexOf("?" + query);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
        }
        String fragment = Uri.parse(str).getFragment();
        if (TextUtils.isEmpty(fragment)) {
            return str;
        }
        int indexOf2 = str.indexOf("#" + fragment);
        if (indexOf2 != -1) {
            return str.substring(0, indexOf2);
        }
        return str;
    }

    /* renamed from: a */
    public static PermissionModel m55811a(C48772b bVar, VerifyResponse verifyResponse) {
        if (bVar == null || verifyResponse == null) {
            AppBrandLogger.m52829e("AuthUtils", "requestModel or response is null");
            return null;
        }
        PermissionModel permissionModel = new PermissionModel();
        permissionModel.setAppId(bVar.mo170349a());
        permissionModel.setTenantId(bVar.mo170353e());
        permissionModel.setSignature(bVar.mo170352d());
        permissionModel.setNonceStr(bVar.mo170351c());
        permissionModel.setUrl(C38763d.m153060a(bVar.mo170354f()));
        permissionModel.setTimestamp(bVar.mo170350b());
        permissionModel.setJsApiList((ArrayList) bVar.mo170355g());
        if (verifyResponse.mDataNode != null) {
            permissionModel.setApiSession(verifyResponse.mDataNode.mJsSDKSession);
        }
        return permissionModel;
    }
}
