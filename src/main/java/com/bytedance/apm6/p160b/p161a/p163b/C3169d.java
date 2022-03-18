package com.bytedance.apm6.p160b.p161a.p163b;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.util.C3355e;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.b.a.b.d */
public class C3169d {

    /* renamed from: a */
    private static long f10168a = -1;

    /* renamed from: a */
    static long m13257a(long j) {
        if (j < 0) {
            return 0;
        }
        return j >> 16;
    }

    /* renamed from: a */
    public static long m13256a() {
        if (f10168a == -1) {
            f10168a = (C3318a.m13824c() << 16) | ((long) Process.myPid());
        }
        return f10168a;
    }

    /* renamed from: a */
    public static C3163a m13258a(byte[] bArr) {
        try {
            C3163a aVar = new C3163a();
            JSONObject jSONObject = new JSONObject(new String(bArr));
            aVar.mo13176n(C3355e.m13951a(jSONObject, "version_code"));
            aVar.mo13178o(C3355e.m13951a(jSONObject, "version_name"));
            aVar.mo13174m(C3355e.m13951a(jSONObject, "manifest_version_code"));
            aVar.mo13170k(C3355e.m13951a(jSONObject, "update_version_code"));
            aVar.mo13172l(C3355e.m13951a(jSONObject, "app_version"));
            aVar.mo13141a(C3355e.m13951a(jSONObject, "os"));
            aVar.mo13146b(C3355e.m13951a(jSONObject, "device_platform"));
            aVar.mo13150c(C3355e.m13951a(jSONObject, "os_version"));
            aVar.mo13139a(C3355e.m13957b(jSONObject, "os_api"));
            aVar.mo13154d(C3355e.m13951a(jSONObject, "device_model"));
            aVar.mo13157e(C3355e.m13951a(jSONObject, "device_brand"));
            aVar.mo13160f(C3355e.m13951a(jSONObject, "device_manufacturer"));
            aVar.mo13162g(C3355e.m13951a(jSONObject, "process_name"));
            aVar.mo13140a(C3355e.m13960c(jSONObject, "sid"));
            aVar.mo13164h(C3355e.m13951a(jSONObject, "rom_version"));
            aVar.mo13182q(C3355e.m13951a(jSONObject, "package"));
            aVar.mo13184r(C3355e.m13951a(jSONObject, "monitor_version"));
            aVar.mo13168j(C3355e.m13951a(jSONObject, "channel"));
            aVar.mo13144b(C3355e.m13957b(jSONObject, "aid"));
            aVar.mo13166i(C3355e.m13951a(jSONObject, "device_id"));
            aVar.mo13149c(C3355e.m13960c(jSONObject, "phone_startup_time"));
            aVar.mo13180p(C3355e.m13951a(jSONObject, "release_build"));
            aVar.mo13145b(C3355e.m13960c(jSONObject, "uid"));
            aVar.mo13186s(C3355e.m13951a(jSONObject, "verify_info"));
            aVar.mo13188t(C3355e.m13951a(jSONObject, "current_update_version_code"));
            if (jSONObject.has("config_time")) {
                aVar.mo13153d((long) C3355e.m13957b(jSONObject, "config_time"));
            }
            try {
                aVar.mo13151c(new JSONObject((String) jSONObject.remove("filters")));
            } catch (Exception unused) {
            }
            aVar.mo13147b(jSONObject);
            return aVar;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m13259a(C3163a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (aVar.mo13193x() != null) {
                jSONObject = C3355e.m13954a(jSONObject, aVar.mo13193x());
            }
            if (aVar.mo13192w() != null) {
                jSONObject = C3355e.m13954a(jSONObject, aVar.mo13192w());
            }
            jSONObject.put("version_code", aVar.mo13161g());
            jSONObject.put("version_name", aVar.mo13163h());
            jSONObject.put("manifest_version_code", aVar.mo13158f());
            jSONObject.put("update_version_code", aVar.mo13152d());
            jSONObject.put("app_version", aVar.mo13155e());
            jSONObject.put("os", aVar.mo13167j());
            jSONObject.put("device_platform", aVar.mo13169k());
            jSONObject.put("os_version", aVar.mo13171l());
            jSONObject.put("os_api", aVar.mo13173m());
            jSONObject.put("device_model", aVar.mo13175n());
            jSONObject.put("device_brand", aVar.mo13177o());
            jSONObject.put("device_manufacturer", aVar.mo13179p());
            jSONObject.put("process_name", aVar.mo13181q());
            jSONObject.put("sid", aVar.mo13183r());
            jSONObject.put("rom_version", aVar.mo13185s());
            jSONObject.put("package", aVar.mo13187t());
            jSONObject.put("monitor_version", aVar.mo13190u());
            jSONObject.put("channel", aVar.mo13148c());
            jSONObject.put("aid", aVar.mo13138a());
            if (!TextUtils.isEmpty(aVar.mo13143b())) {
                jSONObject.put("device_id", aVar.mo13143b());
            }
            jSONObject.put("uid", aVar.mo13191v());
            jSONObject.put("phone_startup_time", aVar.mo13194y());
            jSONObject.put("release_build", aVar.mo13165i());
            if (aVar.mo13135C() != -1) {
                jSONObject.put("config_time", String.valueOf(aVar.mo13135C()));
            }
            if (!TextUtils.isEmpty(aVar.mo13195z())) {
                jSONObject.put("verify_info", aVar.mo13195z());
            }
            jSONObject.put("current_update_version_code", aVar.mo13134B());
            if (aVar.mo13136D() != -1) {
                jSONObject.put("ntp_time", aVar.mo13136D());
            }
            if (aVar.mo13137E() != -1) {
                jSONObject.put("ntp_offset", aVar.mo13137E());
            }
            if (aVar.mo13133A() != null) {
                jSONObject.put("filters", aVar.mo13133A());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
