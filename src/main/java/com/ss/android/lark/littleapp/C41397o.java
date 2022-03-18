package com.ss.android.lark.littleapp;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.C13376t;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24459a;
import com.tt.refer.common.base.AppType;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.littleapp.o */
public class C41397o {

    /* renamed from: a */
    private static final List<String> f105252a = Arrays.asList("tt06bd70009997ab3e", "cli_9ccf3351bbb99101");

    /* renamed from: a */
    public static boolean m164169a(String str, String str2, IAppContext iAppContext) {
        boolean z;
        boolean z2;
        String str3 = null;
        if (iAppContext.getAppType() == AppType.BlockitApp) {
            AbstractC24459a aVar = (AbstractC24459a) iAppContext.findServiceByInterface(AbstractC24459a.class);
            if (aVar != null) {
                z = aVar.mo87272a();
                if (z) {
                    str3 = aVar.mo87274b();
                }
            } else {
                AppBrandLogger.m52830i("UrlOpenHelper", "cant found meta service ,skip check");
                return true;
            }
        } else {
            z = C13376t.m54406a(str, true);
            str3 = C13376t.m54403a(str, (String) null);
        }
        if (!z || m164170a(str, str2, str3) || f105252a.contains(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        AppBrandLogger.m52830i("UrlOpenHelper", " needCheckWhiteList " + z + " isInWhiteList " + z2);
        return z2;
    }

    /* renamed from: a */
    public static boolean m164170a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3)) {
            Uri parse = Uri.parse(str2);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            try {
                JSONArray jSONArray = new JSONArray(str3);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if ((!optJSONObject.has(HiAnalyticsConstant.HaKey.BI_KEY_APPID) || optJSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_APPID).equals(str)) && ((!optJSONObject.has("schema") || optJSONObject.optString("schema").equals(scheme)) && (!optJSONObject.has("host") || optJSONObject.optString("host").equals(host)))) {
                        return true;
                    }
                }
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("UrlOpenHelper", "", e);
            }
        } else {
            AppBrandLogger.m52829e("UrlOpenHelper", "openSchemaWhiteList is empty");
        }
        return false;
    }
}
