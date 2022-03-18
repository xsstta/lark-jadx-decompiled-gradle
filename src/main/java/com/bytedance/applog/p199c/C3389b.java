package com.bytedance.applog.p199c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.applog.C3368a;
import com.bytedance.applog.p197a.C3373e;
import com.bytedance.applog.util.C3469r;
import com.huawei.hms.adapter.internal.CommonCode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.c.b */
public class C3389b {

    /* renamed from: a */
    public static final int[] f10732a = {-1, -1};

    /* renamed from: b */
    public static final long[] f10733b = {-1, -1};

    /* renamed from: c */
    private static final String[] f10734c = {"aid", "region", "os", "package", "app_version", "sdk_version", "os_version", "device_model", CommonCode.MapKey.HAS_RESOLUTION, "language", "timezone", "access", "display_name", "channel", "carrier", "app_language", "app_region", "tz_name", "tz_offset", "install_id", "openudid", "mcc_mnc", "rom", "manifest_version_code", "device_manufacturer", "clientudid", "sig_hash", "display_density", "os_api", "update_version_code", "density_dpi", "version_code", "sim_serial_number", "release_build", "udid", "cpu_abi", "google_aid"};

    /* renamed from: d */
    private static final String[] f10735d = {"setOnce", "synchronize"};

    /* renamed from: b */
    private static JSONObject m14163b() {
        JSONObject q = C3368a.m14054q();
        try {
            JSONObject jSONObject = new JSONObject(q, f10734c);
            jSONObject.put("sdk_version", q.opt("sdk_version").toString());
            jSONObject.put("tz_offset", q.opt("tz_offset").toString());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    private static JSONObject m14161a() throws JSONException {
        JSONObject q = C3368a.m14054q();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("device_id", q.opt("device_id"));
        jSONObject.put("user_id", q.opt("user_id"));
        jSONObject.put("ssid", q.opt("ssid"));
        return jSONObject;
    }

    /* renamed from: a */
    private static String m14160a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("header", m14163b());
            jSONObject2.put("profile", jSONObject);
            jSONObject2.put("user", m14161a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject2.toString();
    }

    /* renamed from: a */
    public static void m14162a(C3373e eVar, final int i, final JSONObject jSONObject, final AbstractC3388a aVar, Handler handler, boolean z) {
        boolean z2;
        boolean z3;
        if (!z) {
            if (System.currentTimeMillis() - f10733b[i] > 60000) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jSONObject == null || f10732a[i] == jSONObject.toString().hashCode()) {
                z2 = false;
            } else {
                z2 = true;
            }
            C3469r.m14666a("exec " + i + ", " + z3 + ", " + z2, (Throwable) null);
            if (!z3) {
                if (aVar != null) {
                    aVar.mo13628a(4);
                    return;
                }
                return;
            }
        } else {
            z2 = true;
        }
        if (z2) {
            Context a = C3368a.m14003a();
            String i2 = C3368a.m14046i();
            String e = C3368a.m14042e();
            String g = eVar.mo13612f().mo13779g();
            if (!TextUtils.isEmpty(i2) && !TextUtils.isEmpty(e) && !TextUtils.isEmpty(g)) {
                String format = String.format("/service/api/v3/userprofile/%s/%s", e, f10735d[i]);
                RunnableC3391c cVar = new RunnableC3391c(g + format, e, m14160a(jSONObject), new AbstractC3388a() {
                    /* class com.bytedance.applog.p199c.C3389b.C33901 */

                    @Override // com.bytedance.applog.p199c.AbstractC3388a
                    /* renamed from: a */
                    public void mo13627a() {
                        C3389b.f10732a[i] = jSONObject.toString().hashCode();
                        C3389b.f10733b[i] = System.currentTimeMillis();
                        aVar.mo13627a();
                    }

                    @Override // com.bytedance.applog.p199c.AbstractC3388a
                    /* renamed from: a */
                    public void mo13628a(int i) {
                        aVar.mo13628a(i);
                    }
                }, a);
                if (handler != null) {
                    handler.post(cVar);
                    return;
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    C3469r.m14667a((Throwable) null);
                }
                cVar.run();
            } else if (aVar != null) {
                aVar.mo13628a(3);
            }
        } else if (aVar != null) {
            aVar.mo13627a();
        }
    }
}
