package com.tt.miniapp.manager.appinfo;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.option.p3392m.C67657c;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.manager.appinfo.a */
public class C66409a {
    /* renamed from: a */
    public static String m259640a(int i) {
        return i != 1 ? "mp_start_error" : "mp_preload_error";
    }

    /* renamed from: a */
    public static void m259644a(Context context, IAppContext iAppContext) {
        C66412d.m259646a(context, iAppContext);
    }

    /* renamed from: a */
    public static String m259641a(String str, Map<String, Object> map) {
        StringBuilder sb = new StringBuilder(str);
        boolean z = true;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (z) {
                sb.append("?");
                sb.append(entry.getKey());
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(entry.getValue());
                z = false;
            } else {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append(entry.getKey());
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(entry.getValue());
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static Map<String, Object> m259643a(Context context, Map<String, Object> map, IAppContext iAppContext) {
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        if (initParams != null) {
            map.put("aid", initParams.mo234510j());
            map.put("version_code", initParams.mo234500a());
            map.put("bdp_version_code", initParams.mo234500a());
            map.put("bdp_device_id", C67657c.m263250a());
            map.put("channel", initParams.mo234502b());
            map.put("device_platform", initParams.mo234503c());
            map.put("bdp_device_platform", initParams.mo234503c());
            map.put("os_version", initParams.mo234504d());
            map.put("tma_jssdk_version", C66399c.m259608a().mo231922b(context, iAppContext));
        }
        return map;
    }

    /* renamed from: a */
    public static C12830f m259639a(String str, Map<String, Object> map, String str2, IAppContext iAppContext) {
        String str3;
        C12827e eVar = new C12827e(str, "GET");
        eVar.mo48435a(map);
        C12827e convertMetaRequest = HostDependManager.getInst().convertMetaRequest(eVar);
        CrossProcessDataEntity f = C67556a.m262949f();
        if (f != null) {
            str3 = new C66467o.C66470b(f).f167782h;
        } else {
            str3 = null;
        }
        if (!TextUtils.isEmpty(str3)) {
            convertMetaRequest.mo48434a("x-tma-host-sessionid", str3);
        }
        convertMetaRequest.mo48438b(6000);
        convertMetaRequest.mo48439c(6000);
        convertMetaRequest.mo48429a(6000);
        if (str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("request_tag", str2);
                convertMetaRequest.mo48436a(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        C12830f a = C66434g.m259707a().mo231984a(convertMetaRequest, iAppContext);
        if (DebugUtil.debug()) {
            AppBrandLogger.m52830i("AppInfoHelper", "doRequest :  url is  ", convertMetaRequest.mo48450m(), " & value = ", a.mo48466d());
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0224, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0225, code lost:
        com.ss.android.lark.log.Log.m165384e("AppInfoHelper", "JSONException", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x027d, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x027e, code lost:
        r12.f167667c = com.tt.miniapp.errorcode.ErrorCode.META.UNKNOWN.getCode();
        com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e("AppInfoHelper", "", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x028f, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x027d A[ExcHandler: Exception (r9v2 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:12:0x008f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m259645a(java.lang.String r9, java.lang.String r10, int r11, com.tt.miniapp.manager.appinfo.C66410b r12, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r13) {
        /*
        // Method dump skipped, instructions count: 675
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.manager.appinfo.C66409a.m259645a(java.lang.String, java.lang.String, int, com.tt.miniapp.manager.appinfo.b, com.bytedance.ee.lark.infra.sandbox.context.IAppContext):boolean");
    }

    /* renamed from: a */
    public static Map<String, Object> m259642a(Context context, String str, String str2, String str3, String str4, IAppContext iAppContext) {
        HashMap hashMap = new HashMap();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, str4);
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str);
        hashMap.put("ttcode", URLEncoder.encode(str2));
        hashMap.put("sdk_version", 3420001);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("token", str3);
        }
        return m259643a(context, hashMap, iAppContext);
    }
}
