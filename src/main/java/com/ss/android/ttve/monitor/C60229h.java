package com.ss.android.ttve.monitor;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.vesdk.C63929ab;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.h */
public class C60229h {

    /* renamed from: a */
    public static int f150339a = 0;

    /* renamed from: b */
    public static int f150340b = 1;

    /* renamed from: c */
    private static WeakReference<IMonitor> f150341c = null;

    /* renamed from: d */
    private static String f150342d = "";

    /* renamed from: e */
    private static boolean f150343e = true;

    /* renamed from: a */
    public static void m234100a(boolean z) {
        C60223e.m234076a(z);
    }

    /* renamed from: a */
    public static boolean m234102a(String str, String str2, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Long.valueOf(j));
        return m234103a(str, str2, hashMap);
    }

    /* renamed from: a */
    public static boolean m234101a(String str, String str2, float f) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Float.valueOf(f));
        return m234103a(str, str2, hashMap);
    }

    /* renamed from: a */
    public static boolean m234103a(String str, String str2, Map map) {
        return m234104a(f150341c, str, str2, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m234097a(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0013 }
            r1.<init>(r4)     // Catch:{ JSONException -> 0x0013 }
            boolean r4 = com.ss.android.ttve.monitor.C60229h.f150343e     // Catch:{ JSONException -> 0x0010 }
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "service"
            r1.put(r4, r3)     // Catch:{ JSONException -> 0x0010 }
            goto L_0x0018
        L_0x0010:
            r4 = move-exception
            r0 = r1
            goto L_0x0014
        L_0x0013:
            r4 = move-exception
        L_0x0014:
            r4.printStackTrace()
            r1 = r0
        L_0x0018:
            boolean r4 = com.ss.android.ttve.monitor.C60229h.f150343e
            if (r4 == 0) goto L_0x0022
            java.lang.ref.WeakReference<com.ss.android.ttve.monitor.IMonitor> r3 = com.ss.android.ttve.monitor.C60229h.f150341c
            m234108b(r3, r2, r1)
            goto L_0x0027
        L_0x0022:
            java.lang.ref.WeakReference<com.ss.android.ttve.monitor.IMonitor> r2 = com.ss.android.ttve.monitor.C60229h.f150341c
            m234106a(r2, r3, r1)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.monitor.C60229h.m234097a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    private static boolean m234105a(WeakReference<IMonitor> weakReference, String str, Map map) {
        if (weakReference == null || weakReference.get() == null) {
            C63929ab.m250980d("TEMonitor", "monitorEventToBusiness business monitor invalid");
            return false;
        } else if (TextUtils.isEmpty(str) || map == null) {
            C63929ab.m250980d("TEMonitor", "monitorEventToBusiness param invalid");
            return false;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                m234099a(map, jSONObject);
                return m234106a(weakReference, str, jSONObject);
            } catch (JSONException e) {
                C63929ab.m250980d("TEMonitor", "monitorEventToBusiness json err: " + e);
                return false;
            }
        }
    }

    /* renamed from: a */
    private static boolean m234106a(WeakReference<IMonitor> weakReference, String str, JSONObject jSONObject) {
        if (weakReference == null || weakReference.get() == null) {
            C63929ab.m250980d("TEMonitor", "monitorEventJsonToBusiness business monitor invalid");
            return false;
        } else if (TextUtils.isEmpty(str) || jSONObject == null) {
            C63929ab.m250980d("TEMonitor", "monitorEventJsonToBusiness param invalid");
            return false;
        } else {
            try {
                weakReference.get().monitorLog(str, jSONObject);
                return true;
            } catch (Exception e) {
                C63929ab.m250980d("TEMonitor", "Something happened when monitor log: " + e);
                return true;
            }
        }
    }

    /* renamed from: a */
    private static boolean m234104a(WeakReference<IMonitor> weakReference, String str, String str2, Map map) {
        if (!f150343e) {
            return m234105a(weakReference, str2, map);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
            if (!str2.equals("iesve_veeditor_record_finish") && !str2.equals("iesve_veeditor_composition_finish") && !str2.equals("iesve_veeditor_edit") && !str2.equals("iesve_veeditor_cut")) {
                if (!str2.equals("iesve_veeditor_frame_report")) {
                    m234099a(map, jSONObject);
                    m234108b(weakReference, str, jSONObject);
                    return true;
                }
            }
            m234098a(str2, map, jSONObject);
            m234108b(weakReference, str, jSONObject);
            return true;
        } catch (JSONException unused) {
            C63929ab.m250976b("TEMonitor", "No monitor callback, skip");
            return false;
        }
    }

    /* renamed from: a */
    public static void m234099a(Map map, JSONObject jSONObject) throws JSONException {
        int i;
        for (String str : map.keySet()) {
            if (str.startsWith("iesve_")) {
                i = C60232j.m234117a(str);
            } else {
                i = C60232j.m234117a(str);
            }
            if (i == 1) {
                try {
                    jSONObject.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                } catch (Exception unused) {
                    C63929ab.m250980d("TEMonitor", "Parse int error:" + map.get(str));
                }
            } else if (i == 2) {
                try {
                    jSONObject.put(str, (double) Float.parseFloat(String.valueOf(map.get(str))));
                } catch (Exception unused2) {
                    C63929ab.m250980d("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject.put(str, map.get(str));
            }
        }
    }

    /* renamed from: a */
    private static void m234098a(String str, Map map, JSONObject jSONObject) throws JSONException {
        int i;
        for (String str2 : map.keySet()) {
            if (str.equals("iesve_veeditor_record_finish") || str.equals("iesve_veeditor_composition_finish") || str.equals("iesve_veeditor_edit") || str.equals("iesve_veeditor_cut")) {
                i = C60232j.m234117a(str2);
            } else {
                i = C60232j.m234117a(str2);
            }
            if (i == 1) {
                try {
                    jSONObject.put(str2, Integer.parseInt(String.valueOf(map.get(str2))));
                } catch (Exception unused) {
                    C63929ab.m250980d("TEMonitor", "Parse int error:" + map.get(str2));
                }
            } else if (i == 2) {
                try {
                    jSONObject.put(str2, (double) Float.parseFloat(String.valueOf(map.get(str2))));
                } catch (Exception unused2) {
                    C63929ab.m250980d("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject.put(str2, map.get(str2));
            }
        }
    }

    /* renamed from: a */
    public static String m234087a() {
        return C60223e.m234068a();
    }

    /* renamed from: a */
    public static void m234088a(int i) {
        TEMonitorInvoker.nativeMonitorPerf(i);
    }

    /* renamed from: b */
    public static void m234107b(int i) {
        TEMonitorInvoker.nativeMonitorPerfWithType(i);
    }

    /* renamed from: d */
    public static void m234110d(int i) {
        TEMonitorInvoker.nativeReset(i);
    }

    /* renamed from: e */
    public static Map<String, String> m234111e(int i) {
        return TEMonitorInvoker.nativeGetMapByType(i);
    }

    /* renamed from: a */
    private static int m234086a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("completed")) {
                return jSONObject.getInt("completed");
            }
            return 0;
        } catch (JSONException e) {
            C63929ab.m250980d("TEMonitor", "get complete filed error!");
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: c */
    public static void m234109c(int i) {
        if (i == 0) {
            m234090a(0, "te_record_err_code", 0L);
        } else if (i == 1) {
            m234090a(1, "te_edit_err_code", 0L);
            m234090a(1, "te_composition_err_code", 0L);
        }
    }

    /* renamed from: a */
    public static void m234093a(IMonitor iMonitor) {
        f150341c = new WeakReference<>(iMonitor);
    }

    /* renamed from: a */
    public static void m234092a(Context context, String str) {
        TEMonitorInvoker.nativeInit();
        C60223e.m234072a(context.getApplicationContext(), str, null, null);
    }

    /* renamed from: a */
    public static void m234094a(String str, double d) {
        if (TextUtils.isEmpty(str)) {
            C63929ab.m250978c("TEMonitor", "perfDouble: key is null");
        } else {
            TEMonitorInvoker.nativePerfDouble(str, d);
        }
    }

    /* renamed from: a */
    public static void m234095a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            C63929ab.m250978c("TEMonitor", "perfLong: key is null");
        } else {
            TEMonitorInvoker.nativePerfLong(str, j);
        }
    }

    /* renamed from: a */
    public static void m234096a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C63929ab.m250978c("TEMonitor", "perfString: key is null");
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        TEMonitorInvoker.nativePerfString(str, str2);
    }

    /* renamed from: a */
    public static void m234089a(int i, String str, double d) {
        if (TextUtils.isEmpty(str)) {
            C63929ab.m250978c("TEMonitor", "perfDouble: key is null");
        } else {
            TEMonitorInvoker.nativePerfDouble(i, str, d);
        }
    }

    /* renamed from: a */
    public static void m234090a(int i, String str, long j) {
        if (TextUtils.isEmpty(str)) {
            Log.w("TEMonitor", "perfLong: key is null");
        } else {
            TEMonitorInvoker.nativePerfLong(i, str, j);
        }
    }

    /* renamed from: b */
    private static void m234108b(WeakReference<IMonitor> weakReference, String str, JSONObject jSONObject) {
        int i;
        String str2 = "sdk_video_edit_compose";
        if (jSONObject != null) {
            i = m234086a(jSONObject);
            try {
                if (jSONObject.has("service")) {
                    str2 = jSONObject.getString("service");
                }
                if (str2.equals("iesve_veeditor_record_finish") || str2.equals("iesve_veeditor_composition_finish")) {
                    if ("".equals(f150342d)) {
                        f150342d = m234087a() + "_" + System.currentTimeMillis();
                    }
                    jSONObject.put("te_record_compose_vid", f150342d);
                }
                if (str2.equals("iesve_veeditor_composition_finish")) {
                    f150342d = "";
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            i = 0;
        }
        C60223e.m234074a(str2, i, jSONObject);
        if (weakReference != null && weakReference.get() != null) {
            try {
                weakReference.get().monitorLog(str, jSONObject);
            } catch (Exception e2) {
                Log.e("TEMonitor", "Something happened when monitor log", e2);
            }
        }
    }

    /* renamed from: a */
    public static void m234091a(int i, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C63929ab.m250978c("TEMonitor", "perfString: key is null");
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        TEMonitorInvoker.nativePerfString(i, str, str2);
    }
}
