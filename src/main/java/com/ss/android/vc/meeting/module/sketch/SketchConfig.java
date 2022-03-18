package com.ss.android.vc.meeting.module.sketch;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.net.service.VCSettingsService;
import org.json.JSONException;
import org.json.JSONObject;

public class SketchConfig {
    public static int GUEST_LOCAL_SHARE_AUTO_DISAPPEAR_TIME_DEFAULT = 3000;
    public static float comet_min_distance = 3.0f;
    public static float comet_weak_speed = 0.01f;
    public static int guest_local_shape_auto_disappear_time = 3000;
    public static float pencil_error_gap = 100.0f;
    public static int pencil_fitting_interval = 1000;
    public static float pencil_k = 0.5f;
    public static float pencil_min_distance = 3.0f;

    public static void getSetting() {
        String settings = VCSettingsService.getSettings("vc_sketch_config");
        if (TextUtils.isEmpty(settings)) {
            settings = "";
        }
        if (!TextUtils.isEmpty(settings)) {
            try {
                JSONObject jSONObject = new JSONObject(settings);
                JSONObject jSONObject2 = jSONObject.getJSONObject("pencil_config");
                pencil_min_distance = (float) jSONObject2.getDouble("min_distance");
                pencil_k = (float) jSONObject2.getDouble("k");
                pencil_error_gap = (float) jSONObject2.getDouble("error_gap");
                pencil_fitting_interval = jSONObject2.getInt("fitting_interval");
                JSONObject jSONObject3 = jSONObject.getJSONObject("comet_config");
                comet_weak_speed = (float) jSONObject3.getDouble("weak_speed");
                comet_min_distance = (float) jSONObject3.getDouble("min_distance");
                guest_local_shape_auto_disappear_time = jSONObject.optInt("guest_local_shape_auto_disappear_time", GUEST_LOCAL_SHARE_AUTO_DISAPPEAR_TIME_DEFAULT);
            } catch (JSONException unused) {
                C60700b.m235864f("SketchConfig", "[getSetting]", "json error!!! config = " + settings);
            }
        }
    }
}
