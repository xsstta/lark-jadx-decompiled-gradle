package com.bytedance.ee.larkbrand.utils;

import android.app.Application;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.openplatform.core.plugin.messenger.location.C25224g;
import com.larksuite.component.openplatform.core.plugin.messenger.location.C25225h;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.event.C66035c;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67475d;
import com.tt.miniapphost.process.C67556a;
import com.tt.p3257c.C65680a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.utils.u */
public class C13377u {
    /* renamed from: a */
    public static boolean m54420a(String str, JSONObject jSONObject, IAppContext iAppContext) {
        JSONObject b = m54421b(iAppContext);
        try {
            b.put("event_name", str).put("event_data", jSONObject).put("from_app_launch_start_duration", AppbrandContext.getInst().getTracing().clientDuration("from_app_launch_start_duration"));
            if (C65680a.m257566a()) {
                C66035c.m258576a("mp_report_analytics", b);
                return true;
            }
            C67556a.m262937a("mp_report_analytics", b, 6);
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static void m54418a(String str, String str2, boolean z, IAppContext iAppContext) {
        JSONObject b = m54421b(iAppContext);
        try {
            b.put("api_name", str).put("auth_name", str2).put("has_auth", z).put("lark_version", C67043j.m261283f(AppbrandContext.getInst().getApplicationContext()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C67556a.m262937a("mp_organization_api_invoke", b, 6);
    }

    /* renamed from: a */
    public static void m54419a(boolean z, String str, long j, int i, String str2, IAppContext iAppContext) {
        JSONObject b = m54421b(iAppContext);
        try {
            b.put("use_expire_time", z);
            b.put("duration", j);
            b.put("error_code", i);
            b.put("error_msg", str2);
            b.put("result_type", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C67556a.m262937a("mp_check_session_result", b, 6);
    }

    /* renamed from: b */
    private static JSONObject m54421b(IAppContext iAppContext) {
        return C67475d.m262462b(iAppContext);
    }

    /* renamed from: a */
    public static void m54411a(IAppContext iAppContext) {
        JSONObject b = m54421b(iAppContext);
        try {
            b.put("app_capability_type", "MiniProgram");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C67556a.m262937a("app_share", b, 6);
    }

    /* renamed from: a */
    public static void m54412a(OPMonitor oPMonitor, IAppContext iAppContext) {
        if (AppbrandContext.getInst().getApplicationContext() != null) {
            oPMonitor.addCategoryValue("network_type", C67053q.m261329b(AppbrandContext.getInst().getApplicationContext()));
            oPMonitor.addCategoryValue("connected", Boolean.valueOf(C67053q.m261335f(AppbrandContext.getInst().getApplicationContext())));
            oPMonitor.addCategoryValue("trace_id", AppbrandContext.getInst().getTraceId());
        }
        if (iAppContext != null && !iAppContext.isDestroyed() && !iAppContext.isDestroying()) {
            oPMonitor.addCategoryValue("app_type", C67475d.m262448a(iAppContext.getAppType()));
            AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
            if (inst != null && inst.getAppInfo() != null) {
                oPMonitor.addCategoryValue("app_id", inst.getAppInfo().appId);
                oPMonitor.addCategoryValue("app_version", inst.getAppInfo().version);
            }
        }
    }

    /* renamed from: f */
    private static JSONObject m54426f(String str, long j, String str2, IAppContext iAppContext) {
        return C67475d.m262463c(str, j, str2, iAppContext);
    }

    /* renamed from: a */
    public static void m54415a(String str, long j, String str2, IAppContext iAppContext) {
        C67556a.m262937a("mp_enter_profile", m54426f(str, j, str2, iAppContext), 6);
    }

    /* renamed from: b */
    public static void m54422b(String str, long j, String str2, IAppContext iAppContext) {
        C67556a.m262937a("mp_enter_chat", m54426f(str, j, str2, iAppContext), 6);
    }

    /* renamed from: c */
    public static void m54423c(String str, long j, String str2, IAppContext iAppContext) {
        C67556a.m262937a("mp_choose_contact", m54426f(str, j, str2, iAppContext), 6);
    }

    /* renamed from: d */
    public static void m54424d(String str, long j, String str2, IAppContext iAppContext) {
        C67556a.m262937a("mp_choose_chat", m54426f(str, j, str2, iAppContext), 6);
    }

    /* renamed from: e */
    public static void m54425e(String str, long j, String str2, IAppContext iAppContext) {
        C67556a.m262937a("mp_get_open_id", m54426f(str, j, str2, iAppContext), 6);
    }

    /* renamed from: a */
    public static void m54417a(String str, String str2, String str3, IAppContext iAppContext) {
        JSONObject b = m54421b(iAppContext);
        try {
            b.put("hit_type", str).put("app_id", str2);
            if (!TextUtils.isEmpty(str3)) {
                b.put("app_version", str3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C67556a.m262937a("mp_push_meta_hit", b, 6);
    }

    /* renamed from: a */
    public static void m54414a(String str, long j, int i, String str2, IAppContext iAppContext) {
        JSONObject f = m54426f(str, j, str2, iAppContext);
        if (i != 0) {
            try {
                f.put("error_code", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        C67556a.m262937a("mp_sync_client_auth", f, 6);
    }

    /* renamed from: a */
    public static void m54416a(String str, String str2, String str3, int i, IAppContext iAppContext) {
        JSONObject b = m54421b(iAppContext);
        try {
            b.put("preload_type", str).put("app_id", str2);
            if (!TextUtils.isEmpty(str3)) {
                b.put("app_version", str3);
            }
            if (i >= 0) {
                b.put("download_times_one_app", i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C67556a.m262937a("mp_push_meta_hit", b, 6);
    }

    /* renamed from: a */
    public static void m54410a(long j, int i, float f, long j2, String str, long j3, float f2, List<Location> list, IAppContext iAppContext) {
        JSONObject f3 = m54426f("success", j, null, iAppContext);
        try {
            f3.put("timeout", j3).put("desired_accuracy", (double) f2);
            if (f > BitmapDescriptorFactory.HUE_RED) {
                f3.put("accuracy", (double) f);
            }
            if (j2 > 0) {
                f3.put("location_time", j2);
            }
            if (!TextUtils.isEmpty(str)) {
                f3.put("provider", str);
            }
            if (i > 0) {
                f3.put("location_type", i);
            }
            f3.put("api_time", System.currentTimeMillis());
            if (AppbrandContext.getInst().getApplicationContext() != null) {
                WifiManager wifiManager = (WifiManager) AppbrandContext.getInst().getApplicationContext().getSystemService("wifi");
                if (wifiManager != null) {
                    f3.put("wifi_status", wifiManager.isWifiEnabled());
                }
                LocationManager locationManager = (LocationManager) AppbrandContext.getInst().getApplicationContext().getSystemService("location");
                if (locationManager != null) {
                    f3.put("gps_status", locationManager.isProviderEnabled("gps"));
                    f3.put("network_status", locationManager.isProviderEnabled("network"));
                }
            }
            if (list != null && list.size() > 0) {
                f3.put("location_counts", list.size());
                if (list.size() > 1) {
                    JSONArray jSONArray = new JSONArray();
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Location location = list.get(i2);
                        if (location != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("accuracy", (double) location.getAccuracy()).put("location_time", location.getTime()).put("provider", location.getProvider());
                            jSONArray.put(jSONObject);
                        }
                    }
                    f3.put("location_list", jSONArray);
                }
            }
            C67556a.m262937a("mp_onlocationchange", f3, 6);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m54413a(String str, long j, int i, float f, long j2, String str2, long j3, String str3, float f2, int i2, String str4, int i3, String str5, ArrayList<C25225h> arrayList, IAppContext iAppContext) {
        JSONObject f3 = m54426f(str, j, str4, iAppContext);
        try {
            f3.put("timeout", j3).put("mode", str3).put("desired_accuracy", (double) f2);
            f3.put("change_count", i3);
            f3.put("location_from", str5);
            if (f > BitmapDescriptorFactory.HUE_RED) {
                f3.put("accuracy", (double) f);
            }
            if (j2 > 0) {
                f3.put("location_time", j2);
            }
            if (!TextUtils.isEmpty(str2)) {
                f3.put("provider", str2);
            }
            if (i > 0) {
                f3.put("location_type", i);
            }
            f3.put("api_time", System.currentTimeMillis());
            if (i2 != 0) {
                f3.put("error_code", i2);
            }
            Application applicationContext = AppbrandContext.getInst().getApplicationContext();
            if (applicationContext != null) {
                WifiManager wifiManager = (WifiManager) applicationContext.getSystemService("wifi");
                if (wifiManager != null) {
                    f3.put("wifi_status", wifiManager.isWifiEnabled());
                }
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                f3.put("gps_env", C25224g.m90647c(applicationContext));
                f3.put("wifi_env", C25224g.m90644a(applicationContext));
                f3.put("base_station_env", C25224g.m90646b(applicationContext));
                if (locationManager != null) {
                    f3.put("gps_status", locationManager.isProviderEnabled("gps"));
                    f3.put("network_status", locationManager.isProviderEnabled("network"));
                }
            }
            if (arrayList != null && arrayList.size() > 0) {
                f3.put("location_counts", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Location location = arrayList.get(i4).f61592a;
                    if (location != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("accuracy", (double) location.getAccuracy()).put("location_time", location.getTime()).put("provider", location.getProvider()).put("api_time", arrayList.get(i4).f61593b);
                        jSONArray.put(jSONObject);
                    }
                }
                f3.put("location_list", jSONArray);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C67556a.m262937a("mp_location_quality", f3, 6);
    }
}
