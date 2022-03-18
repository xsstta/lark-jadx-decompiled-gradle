package com.bytedance.crash.util;

import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.runtime.C3864m;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.File;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.y */
public class C3969y {
    /* renamed from: a */
    public static boolean m16550a(int i) {
        return false;
    }

    /* renamed from: b */
    public static int m16552b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 16;
        }
        if (i == 3) {
            return 32;
        }
        if (i == 4) {
            return 64;
        }
        if (i != 5) {
            return 0;
        }
        return SmActions.ACTION_ONTHECALL_EXIT;
    }

    /* renamed from: a */
    public static boolean m16551a(File file) {
        return file.exists() && file.length() > 128;
    }

    /* renamed from: a */
    private static void m16548a(JSONObject jSONObject, JSONObject jSONObject2, File file) {
        if (file != null) {
            m16545a("has_logcat_file", m16551a(new File(file, "logcat.txt")), jSONObject, jSONObject2);
            C3742b.m15432a(jSONObject, "filters", "logcat_type", new File(file, "logerr.txt").exists() ? "native" : "java");
            m16545a("has_maps_file", m16551a(new File(file, "maps.txt")), jSONObject, jSONObject2);
            m16545a("has_pthread_key_file", m16551a(new File(file, "pthread_key_info.txt")), jSONObject, jSONObject2);
            m16545a("has_pthread_key_map_file", m16551a(new File(file, "pthread_key_map.txt")), jSONObject, jSONObject2);
            m16545a("has_envinfo_file", m16551a(new File(file, "envinfo.txt")), jSONObject, jSONObject2);
            m16545a("has_meminfo_file", m16551a(new File(file, "meminfo.txt")), jSONObject, jSONObject2);
            m16545a("has_threads_file", m16551a(new File(file, "threads.txt")), jSONObject, jSONObject2);
            m16545a("has_pthreads_file", m16551a(C3962t.m16515j(file)), jSONObject, jSONObject2);
            m16545a("has_malloc_file", m16551a(C3962t.m16512i(file)), jSONObject, jSONObject2);
            m16545a("has_fds_file", m16551a(new File(file, "fds.txt")), jSONObject, jSONObject2);
            m16545a("has_view_tree", m16551a(new File(file, "threads.txt")), jSONObject, jSONObject2);
        }
    }

    /* renamed from: a */
    private static void m16547a(JSONObject jSONObject, JSONObject jSONObject2) {
        m16554c(jSONObject, jSONObject2);
        m16555d(jSONObject, jSONObject2);
        m16556e(jSONObject, jSONObject2);
    }

    /* renamed from: a */
    private static void m16549a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        long j;
        m16543a(jSONObject.optString("sdk_version_name"), "sdk_version_name", jSONObject3);
        m16543a(jSONObject.optString("sdk_version"), "sdk_version", jSONObject3);
        m16541a("Android", jSONObject.optString("os"), "os", jSONObject3);
        m16543a(jSONObject.optString("os_version"), "os_version", jSONObject3);
        m16543a(jSONObject.optString("os_api"), "os_api", jSONObject3);
        m16543a(jSONObject.optString("device_model"), "device_model", jSONObject3);
        m16543a(jSONObject.optString("device_brand"), "device_brand", jSONObject3);
        m16543a(jSONObject.optString("device_manufacturer"), "device_manufacturer", jSONObject3);
        m16543a(jSONObject.optString("cpu_abi"), "cpu_abi", jSONObject3);
        m16543a(jSONObject.optString("package"), "package", jSONObject3);
        m16543a(jSONObject.optString("package"), "package", jSONObject3);
        m16543a(jSONObject.optString("unique_key"), "unique_key", jSONObject3);
        if (jSONObject.optLong("version_get_time") == 0) {
            j = 0;
        } else {
            j = jSONObject.optLong("version_get_time") - jSONObject2.optLong("crash_time");
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        C3742b.m15432a(jSONObject2, "filters", "version_get_time", i == 0 ? "normal" : i < 0 ? "old" : "new");
        m16540a(j, "version_get_time", jSONObject3, jSONObject4);
        int optInt = jSONObject.optInt("first_update_launch", -1);
        m16543a(optInt == -1 ? null : "value", "first_update_launch", jSONObject3);
        C3742b.m15432a(jSONObject2, "filters", "first_update_launch", String.valueOf(optInt));
    }

    /* renamed from: a */
    private static void m16544a(String str, JSONObject jSONObject) {
        try {
            jSONObject.put(str, 1);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: g */
    private static void m16558g(JSONObject jSONObject, JSONObject jSONObject2) {
        m16542a(jSONObject.opt("launch_did"), "launch_did", jSONObject2);
    }

    /* renamed from: a */
    public static int m16538a(Object obj, int i) {
        if (obj == null) {
            return i;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt(String.valueOf(obj));
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    /* renamed from: e */
    private static void m16556e(JSONObject jSONObject, JSONObject jSONObject2) {
        m16542a(jSONObject.opt("battery"), "battery", jSONObject2);
        m16542a(jSONObject.opt("filters"), "filters", jSONObject2);
    }

    /* renamed from: c */
    private static void m16554c(JSONObject jSONObject, JSONObject jSONObject2) {
        m16542a(jSONObject.opt("miniapp_id"), "miniapp_id", jSONObject2);
        m16542a(jSONObject.opt("plugin_info"), "plugin_info", jSONObject2);
        m16542a(jSONObject.opt("process_name"), "process_name", jSONObject2);
        m16542a(jSONObject.opt("plugin_info"), "plugin_info", jSONObject2);
    }

    /* renamed from: b */
    private static void m16553b(JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        boolean z = true;
        try {
            i = !new JSONObject(jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).optString("mainStackFromTrace").trim().startsWith("at");
        } catch (Throwable unused) {
            i = -1;
        }
        m16541a((Object) 1, (Object) Integer.valueOf(i), "has_native_stack", jSONObject2);
        if (i != 1) {
            z = false;
        }
        C3742b.m15432a(jSONObject, "filters", "has_native_stack", String.valueOf(z));
    }

    /* renamed from: d */
    private static void m16555d(JSONObject jSONObject, JSONObject jSONObject2) {
        m16542a(jSONObject.opt("pid"), "pid", jSONObject2);
        m16542a(jSONObject.opt("app_start_time"), "app_start_time", jSONObject2);
        m16542a(jSONObject.opt("app_start_time_readable"), "app_start_time_readable", jSONObject2);
        m16542a(jSONObject.opt("patch_info"), "patch_info", jSONObject2);
        m16542a(jSONObject.opt("is_background"), "is_background", jSONObject2);
        m16542a(jSONObject.opt("activity_trace"), "activity_trace", jSONObject2);
        m16542a(jSONObject.opt("custom_long"), "custom_long", jSONObject2);
        m16542a(jSONObject.opt("custom"), "custom", jSONObject2);
        if (jSONObject.optJSONObject("custom_long") != null) {
            m16542a(jSONObject.optJSONObject("custom_long").opt("activity_track"), "activity_track", jSONObject2);
        }
    }

    /* renamed from: f */
    private static void m16557f(JSONObject jSONObject, JSONObject jSONObject2) {
        m16542a(jSONObject.opt("logcat"), "logcat", jSONObject2);
        C3742b.m15432a(jSONObject, "filters", "has_logcat", String.valueOf(!C3955q.m16454a(jSONObject, "logcat")));
        m16542a(jSONObject.opt("crash_time"), "crash_time", jSONObject2);
        m16542a(jSONObject.opt("crash_uuid"), "crash_uuid", jSONObject2);
        m16542a(jSONObject.opt("storage"), "storage", jSONObject2);
        m16542a(jSONObject.opt("filters"), "filters", jSONObject2);
        if (jSONObject.opt("filters") != null) {
            m16542a(jSONObject.optJSONObject("filters").opt("sdk_version"), "filters:sdk_version", jSONObject2);
            m16542a(jSONObject.optJSONObject("filters").opt("is_root"), "filters:is_root", jSONObject2);
            m16542a(jSONObject.optJSONObject("filters").opt("is_64_devices"), "filters:is_64_devices", jSONObject2);
            m16542a(jSONObject.optJSONObject("filters").opt("is_64_runtime"), "filters:is_64_runtime", jSONObject2);
            m16542a(jSONObject.optJSONObject("filters").opt("is_x86_devices"), "filters:is_x86_devices", jSONObject2);
            m16542a(jSONObject.optJSONObject("filters").opt("kernel_version"), "filters:kernel_version", jSONObject2);
        }
    }

    /* renamed from: a */
    public static void m16546a(JSONObject jSONObject, File file) {
        CrashType crashType;
        JSONObject jSONObject2;
        CrashType crashType2;
        Object opt = jSONObject.opt(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        if (opt == null) {
            C3968x.m16532a("UPLOAD_CHECK", "upload data empty");
        } else if (optJSONObject == null) {
            C3968x.m16532a("UPLOAD_CHECK", "upload header empty");
        } else {
            if (opt instanceof JSONArray) {
                crashType = CrashType.LAUNCH;
                C3968x.m16532a("UPLOAD_CHECK", "check launch ");
                jSONObject2 = ((JSONArray) opt).optJSONObject(0);
                m16558g(jSONObject2, jSONObject3);
            } else {
                if (jSONObject.optInt("is_anr") == 1) {
                    crashType2 = CrashType.ANR;
                    m16553b(jSONObject, jSONObject3);
                    C3968x.m16532a("UPLOAD_CHECK", "check anr ");
                } else if (jSONObject.optInt("is_native_crash") == 1) {
                    crashType2 = CrashType.NATIVE;
                    C3968x.m16532a("UPLOAD_CHECK", "check native ");
                } else if (jSONObject.optInt("is_dart") == 1) {
                    CrashType crashType3 = CrashType.DART;
                    C3968x.m16532a("UPLOAD_CHECK", "check dart ");
                    return;
                } else {
                    crashType2 = CrashType.JAVA;
                    C3968x.m16532a("UPLOAD_CHECK", "check java ");
                }
                jSONObject2 = jSONObject;
                crashType = crashType2;
            }
            C3955q.m16447a(jSONObject3, "crash_type", crashType);
            C3955q.m16447a(jSONObject3, "succ_step", Integer.valueOf(jSONObject2.optInt("succ_step", -1)));
            m16557f(jSONObject2, jSONObject3);
            m16549a(optJSONObject, jSONObject2, jSONObject3, jSONObject4);
            m16547a(jSONObject2, jSONObject3);
            m16548a(jSONObject2, jSONObject3, file);
            C3864m.m16007a("crash_data_check", jSONObject3, jSONObject4);
        }
    }

    /* renamed from: a */
    public static Long m16539a(Map<? super String, Long> map, String str, Long l) {
        if (str == null || map == null) {
            return -1L;
        }
        Long l2 = map.get(str);
        if (l2 != null) {
            l = Long.valueOf(l2.longValue() + l.longValue());
        }
        map.put(str, l);
        return l;
    }

    /* renamed from: a */
    private static void m16542a(Object obj, String str, JSONObject jSONObject) {
        if (obj == null) {
            m16544a("err_null_" + str, jSONObject);
        }
    }

    /* renamed from: a */
    private static void m16543a(String str, String str2, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            m16544a("err_empty_" + str2, jSONObject);
        }
    }

    /* renamed from: a */
    private static void m16540a(long j, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (j != 0) {
            C3955q.m16447a(jSONObject2, str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    private static void m16541a(Object obj, Object obj2, String str, JSONObject jSONObject) {
        if (obj == obj2) {
            return;
        }
        if (obj == null) {
            m16544a("err_" + str + "_not_" + obj, jSONObject);
        } else if (!obj.equals(obj2)) {
            m16544a("err_" + str + "_not_" + obj, jSONObject);
        }
    }

    /* renamed from: a */
    private static void m16545a(String str, boolean z, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!z) {
            m16544a(str + "_false", jSONObject2);
        }
        C3742b.m15432a(jSONObject, "filters", str, String.valueOf(z));
    }
}
