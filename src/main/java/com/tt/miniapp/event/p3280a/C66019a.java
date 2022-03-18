package com.tt.miniapp.event.p3280a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.a.a */
public class C66019a {

    /* renamed from: a */
    private static volatile JSONObject f166681a;

    /* renamed from: b */
    private static JSONObject m258529b(IAppContext iAppContext) throws Exception {
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        String schema = AppbrandApplicationImpl.getInst(iAppContext).getSchema();
        if (appInfo == null || TextUtils.isEmpty(schema)) {
            AppBrandLogger.m52829e("OriginHelper", "null appInfo or empty schema");
            return null;
        }
        AppBrandLogger.m52828d("OriginHelper", "schema: " + schema);
        String queryParameter = Uri.parse(schema).getQueryParameter("origin_entrance");
        if (TextUtils.isEmpty(queryParameter)) {
            return m258528a(appInfo, new JSONObject());
        }
        return new JSONObject(queryParameter);
    }

    /* renamed from: a */
    public static JSONObject m258527a(IAppContext iAppContext) {
        if (f166681a != null) {
            AppBrandLogger.m52828d("OriginHelper", "cache OriginJson: " + f166681a);
            return f166681a;
        }
        synchronized (C66019a.class) {
            if (f166681a != null) {
                AppBrandLogger.m52828d("OriginHelper", "cache OriginJson: " + f166681a);
                return f166681a;
            }
            try {
                f166681a = m258529b(iAppContext);
            } catch (Exception e) {
                AppBrandLogger.eWithThrowable("OriginHelper", "buildOriginFailed", e);
                f166681a = null;
            }
        }
        AppBrandLogger.m52828d("OriginHelper", "getOriginJson: " + f166681a);
        if (f166681a == null) {
            return null;
        }
        return f166681a;
    }

    /* renamed from: a */
    private static Uri m258525a(Uri uri, IAppContext iAppContext) {
        JSONObject a;
        if (uri.getQueryParameter("origin_entrance") != null || (a = m258527a(iAppContext)) == null) {
            return uri;
        }
        return uri.buildUpon().appendQueryParameter("origin_entrance", a.toString()).build();
    }

    /* renamed from: a */
    public static String m258526a(String str, IAppContext iAppContext) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return m258525a(Uri.parse(str), iAppContext).toString();
    }

    /* renamed from: a */
    private static JSONObject m258528a(AppInfoEntity appInfoEntity, JSONObject jSONObject) throws JSONException {
        jSONObject.put("oe_launch_from", CharacterUtils.null2Empty(appInfoEntity.launchFrom));
        jSONObject.put("oe_location", CharacterUtils.null2Empty(appInfoEntity.location));
        return jSONObject;
    }
}
