package com.bytedance.applog.p200d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.applog.AbstractC3395d;
import com.bytedance.applog.C3368a;
import com.bytedance.applog.C3426k;
import com.bytedance.applog.p197a.C3373e;
import com.bytedance.applog.util.C3466o;
import com.bytedance.applog.util.C3469r;
import com.bytedance.applog.util.C3470s;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.dr.C4000c;
import com.huawei.hms.adapter.internal.CommonCode;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.d.b */
public class C3398b {

    /* renamed from: a */
    public static AbstractC3395d f10770a;

    /* renamed from: b */
    private static final String[] f10771b = {"ab_version", "device_brand", "language", "os_api", CommonCode.MapKey.HAS_RESOLUTION, "google_aid", "carrier", "install_id", "app_name", "app_version", "device_model", "density_dpi", "mcc_mnc", "sim_region", "device_id", "openudid", "clientudid", "aid", "bd_did", "sdk_version_code"};

    /* renamed from: c */
    private static final String[] f10772c = {"ab_version", "device_brand", "language", "os_api", CommonCode.MapKey.HAS_RESOLUTION, "google_aid", "carrier", "iid", "app_name", "version_name", "device_type", "dpi", "mcc_mnc", "sim_region", "device_id", "openudid", "clientudid", "aid", "bd_did", "sdk_version_code"};

    /* renamed from: a */
    public static <T> T m14188a(JSONObject jSONObject, String str, T t) {
        if (jSONObject == null) {
            return (T) C3368a.m14030b(str, (Object) t);
        }
        T t2 = null;
        Object opt = jSONObject.opt(str);
        if (opt != null) {
            t2 = (T) opt;
        }
        return t2 == null ? t : t2;
    }

    /* renamed from: a */
    public static String[] m14191a(C3373e eVar, JSONObject jSONObject, boolean z) {
        String[] strArr;
        C3426k f = eVar.mo13612f();
        if (z) {
            strArr = f.mo13776d();
        } else {
            strArr = f.mo13775c();
        }
        int length = strArr.length;
        String[] strArr2 = new String[length];
        boolean f2 = C3368a.m14043f();
        for (int i = 0; i < length; i++) {
            strArr2[i] = strArr[i];
            if (f2) {
                strArr2[i] = strArr2[i] + "?tt_data=a";
            }
            strArr2[i] = m14189a(eVar.mo13607b(), jSONObject, new StringBuilder(strArr2[i]), true);
            strArr2[i] = C3396a.m14178a(strArr2[i], C3396a.f10762b);
        }
        return strArr2;
    }

    /* renamed from: a */
    public static String m14189a(Context context, JSONObject jSONObject, StringBuilder sb, boolean z) {
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return sb2;
        }
        HashMap hashMap = new HashMap(f10771b.length + 10);
        m14190a(context, jSONObject, z, hashMap);
        if (sb2.indexOf(63) < 0) {
            sb.append('?');
        }
        C3470s.m14675a(sb, hashMap, "UTF-8");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m14190a(Context context, JSONObject jSONObject, boolean z, Map<String, String> map) {
        int i = 0;
        while (true) {
            String[] strArr = f10771b;
            if (i >= strArr.length) {
                break;
            }
            if ("os_api".equals(strArr[i]) || "density_dpi".equals(strArr[i]) || "sdk_version_code".equals(strArr[i])) {
                Integer num = (Integer) m14188a(jSONObject, strArr[i], (Object) null);
                if (num != null) {
                    map.put(f10772c[i], num.toString());
                }
            } else {
                String str = (String) m14188a(jSONObject, strArr[i], (Object) null);
                if (!TextUtils.isEmpty(str)) {
                    map.put(f10772c[i], str);
                }
            }
            i++;
        }
        C3466o.m14656a(jSONObject, map);
        try {
            AbstractC3395d dVar = f10770a;
            HashMap<String, String> a = dVar == null ? null : dVar.mo13651a();
            if (a != null && !a.isEmpty()) {
                for (Map.Entry<String, String> entry : a.entrySet()) {
                    if (entry != null) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                            map.put(key, value);
                        }
                    }
                }
            }
        } catch (Exception e) {
            C3469r.m14667a(e);
        }
        if (z) {
            map.put("ssmix", AbstractC60044a.f149675a);
        }
        String networkAccessType = NetworkUtils.getNetworkAccessType(context);
        if (!TextUtils.isEmpty(networkAccessType)) {
            map.put("ac", networkAccessType);
        }
        String str2 = (String) C3368a.m14030b("tweaked_channel", (Object) "");
        if (TextUtils.isEmpty(str2)) {
            str2 = (String) C3368a.m14030b("channel", (Object) "");
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("channel", str2);
        }
        String str3 = (String) m14188a(jSONObject, "os_version", (Object) null);
        if (str3 != null && str3.length() > 10) {
            str3 = str3.substring(0, 10);
        }
        map.put("os_version", str3);
        map.put("_rticket", String.valueOf(System.currentTimeMillis()));
        map.put("device_platform", "android");
        String d = C3368a.m14041d();
        if (!TextUtils.isEmpty(d)) {
            map.put("ab_version", d);
        }
        int intValue = ((Integer) C3368a.m14030b("version_code", (Object) -1)).intValue();
        if (intValue != -1) {
            map.put("version_code", String.valueOf(intValue));
        }
        int intValue2 = ((Integer) C3368a.m14030b("manifest_version_code", (Object) -1)).intValue();
        if (intValue2 != -1) {
            map.put("manifest_version_code", String.valueOf(intValue2));
        }
        int intValue3 = ((Integer) C3368a.m14030b("update_version_code", (Object) -1)).intValue();
        if (intValue3 != -1) {
            map.put("update_version_code", String.valueOf(intValue3));
        }
        String a2 = C4000c.m16652a((JSONObject) m14188a(jSONObject, "oaid", (Object) null));
        if (!TextUtils.isEmpty(a2)) {
            map.put("oaid", a2);
        }
        String str4 = (String) m14188a(jSONObject, "cdid", (Object) null);
        if (!TextUtils.isEmpty(str4)) {
            map.put("cdid", str4);
        }
    }
}
