package com.ss.android.ttve.monitor;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vesdk.keyvaluepair.C64030a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.e */
public class C60223e {

    /* renamed from: a */
    public static volatile boolean f150312a = false;

    /* renamed from: b */
    public static final Object f150313b = new Object();

    /* renamed from: c */
    public static boolean f150314c = false;

    /* renamed from: d */
    private static boolean f150315d = true;

    /* renamed from: e */
    private static Thread f150316e;

    /* renamed from: a */
    public static Thread m234070a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: b */
    public static void m234078b() {
        C60219c.m234050a();
    }

    /* renamed from: a */
    public static String m234068a() {
        return m234069a("device_id");
    }

    /* renamed from: c */
    private static void m234079c() {
        if (f150314c && !f150312a) {
            synchronized (f150313b) {
                while (!f150312a) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        f150313b.wait();
                        Log.w("MonitorUtils", "checkMonitorHasInited wait: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m234076a(boolean z) {
        f150315d = z;
    }

    /* renamed from: a */
    private static String m234069a(String str) {
        if (!f150315d) {
            Log.w("MonitorUtils", "getHeaderInfo: Monitor not enabled just return.");
            return null;
        }
        m234079c();
        return C60219c.m234049a(str);
    }

    /* renamed from: a */
    public static void m234071a(Context context) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        boolean z4;
        String str4;
        HashMap hashMap = new HashMap();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        boolean z5 = false;
        if (defaultSensor != null) {
            z = true;
        } else {
            z = false;
        }
        hashMap.put("te_sensor_type_gyroscope_exist", Boolean.valueOf(z));
        String str5 = null;
        if (defaultSensor != null) {
            str = defaultSensor.getName();
        } else {
            str = null;
        }
        hashMap.put("te_sensor_type_gyroscope_name", str);
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
        if (defaultSensor2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        hashMap.put("te_sensor_type_game_rotation_vector_exist", Boolean.valueOf(z2));
        if (defaultSensor2 != null) {
            str2 = defaultSensor2.getName();
        } else {
            str2 = null;
        }
        hashMap.put("te_sensor_type_game_rotation_vector_name", str2);
        Sensor defaultSensor3 = sensorManager.getDefaultSensor(11);
        if (defaultSensor3 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        hashMap.put("te_sensor_type_rotation_vector_exist", Boolean.valueOf(z3));
        if (defaultSensor3 != null) {
            str3 = defaultSensor3.getName();
        } else {
            str3 = null;
        }
        hashMap.put("te_sensor_type_rotation_vector_name", str3);
        Sensor defaultSensor4 = sensorManager.getDefaultSensor(9);
        if (defaultSensor4 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        hashMap.put("te_sensor_type_gravity_exist", Boolean.valueOf(z4));
        if (defaultSensor4 != null) {
            str4 = defaultSensor4.getName();
        } else {
            str4 = null;
        }
        hashMap.put("te_sensor_type_gravity_name", str4);
        Sensor defaultSensor5 = sensorManager.getDefaultSensor(1);
        if (defaultSensor5 != null) {
            z5 = true;
        }
        hashMap.put("te_sensor_type_accelerometer_exist", Boolean.valueOf(z5));
        if (defaultSensor5 != null) {
            str5 = defaultSensor5.getName();
        }
        hashMap.put("te_sensor_type_accelerometer_name", str5);
        C60229h.m234103a("iesve_veeditor_sensor_report", "iesve_veeditor_sensor_report", hashMap);
    }

    /* renamed from: a */
    private static void m234075a(String str, String str2) {
        if (!f150315d) {
            Log.w("MonitorUtils", "setHeaderInfo: Monitor not enabled just return.");
            return;
        }
        m234079c();
        C60219c.m234053a(str, str2);
    }

    /* renamed from: a */
    public static void m234073a(String str, int i, C64030a aVar) {
        JSONObject jSONObject;
        if (!f150315d) {
            Log.w("MonitorUtils", "monitorStatistics: Monitor not enabled just return.");
            return;
        }
        m234079c();
        if (aVar == null) {
            jSONObject = null;
        } else {
            jSONObject = aVar.mo221706a();
        }
        C60219c.m234052a(str, i, jSONObject);
    }

    /* renamed from: a */
    public static void m234074a(String str, int i, JSONObject jSONObject) {
        if (!f150315d) {
            Log.w("MonitorUtils", "monitorStatusRate: Monitor not enabled just return.");
        } else if (jSONObject == null) {
            Log.w("MonitorUtils", "monitorStatusRate: empty log data!");
        } else {
            m234079c();
            if (TextUtils.isEmpty(m234069a("device_id"))) {
                m234075a("device_id", "Unknown");
                Log.e("MonitorUtils", "Device id is empty, please set device id with 1. VESDK.setAppFiled or TEMonitor.setDeviceId(deviceid) before using SDK. \n 2. Use TEMonitor.setSDKMonitorEnable(false) to disable SDKMonitor.");
            }
            if (TextUtils.isEmpty(m234069a("user_id"))) {
                m234075a("user_id", "Unknown");
                Log.e("MonitorUtils", "User id is empty, please set user id with TEMonitor.setUserId(userid) before using SDK\n 2. Use TEMonitor.setSDKMonitorEnable(false) to disable SDKMonitor.");
            }
            if (TextUtils.isEmpty(m234069a("app_version"))) {
                m234075a("app_version", "Unknown");
                Log.e("MonitorUtils", "App version is empty, please set app version with TEMonitor.setAppVersion(version) before using SDK\n 2. Use TEMonitor.setSDKMonitorEnable(false) to disable SDKMonitor.");
            }
            try {
                for (Map.Entry<String, String> entry : C60225f.m234080a().entrySet()) {
                    String value = entry.getValue();
                    if (!C60225f.f150321a.contains(entry.getKey())) {
                        jSONObject.put("te_device_info_" + entry.getKey(), value);
                    } else if (!TextUtils.isEmpty(value)) {
                        try {
                            float parseFloat = Float.parseFloat(value);
                            jSONObject.put("te_device_info_" + entry.getKey(), (double) parseFloat);
                        } catch (Exception unused) {
                            Log.e("MonitorUtils", "Device info value is error key = " + entry.getKey());
                        }
                    }
                }
            } catch (JSONException e) {
                Log.e("MonitorUtils", "monitorStatusRate: json exception!", e);
            }
            C60219c.m234052a(str, i, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m234072a(final Context context, final String str, final String str2, final String str3) {
        if (!f150315d) {
            Log.w("MonitorUtils", "init: Monitor not enabled just return.");
            return;
        }
        m234078b();
        if (!f150314c) {
            C60219c.m234051a(context, str, str2, str3);
            f150312a = true;
        } else if (!f150312a && f150316e == null) {
            Thread a = m234070a(new Thread(new Runnable() {
                /* class com.ss.android.ttve.monitor.C60223e.RunnableC602241 */

                public void run() {
                    synchronized (C60223e.f150313b) {
                        C60219c.m234051a(context, str, str2, str3);
                        C60223e.f150312a = true;
                        C60223e.f150313b.notifyAll();
                    }
                }
            }));
            f150316e = a;
            a.start();
        }
    }

    /* renamed from: b */
    static JSONObject m234077b(Context context, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", str);
            try {
                jSONObject.put("app_version", context.getPackageManager().getPackageInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).versionName);
            } catch (PackageManager.NameNotFoundException e) {
                jSONObject.put("app_version", "vesdk:9.9.0.301");
                Log.e("MonitorUtils", "PackageManager.NameNotFoundException", e);
            }
            jSONObject.put("ve_version", "9.9.0.301");
            jSONObject.put("effect_version", "9.9.0_rel_1_lark_202111161500_9215fa605ba");
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("channel", "9.9.0.301");
            jSONObject.put("package_name", context.getPackageName());
            jSONObject.put("user_id", str2);
            jSONObject.put("version_code", str3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
