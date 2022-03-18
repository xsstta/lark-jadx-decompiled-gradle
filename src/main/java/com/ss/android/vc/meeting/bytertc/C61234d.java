package com.ss.android.vc.meeting.bytertc;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.bytertc.d */
public class C61234d {

    /* renamed from: a */
    public int f153385a = 3;

    /* renamed from: b */
    public int f153386b = 2;

    /* renamed from: c */
    public int f153387c = 15;

    /* renamed from: d */
    public int f153388d = 7;

    /* renamed from: e */
    public int f153389e = 10;

    /* renamed from: f */
    public int f153390f = 30;

    /* renamed from: a */
    public static C61234d m238212a(String str) {
        C61234d dVar = new C61234d();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                dVar.f153385a = jSONObject.getInt("minute_period");
                dVar.f153386b = jSONObject.getInt("max_ignore_count");
                dVar.f153387c = jSONObject.getInt("second_interval");
                JSONObject jSONObject2 = jSONArray.getJSONObject(1);
                dVar.f153388d = jSONObject2.getInt("day_period");
                dVar.f153389e = jSONObject2.getInt("max_ignore_count");
                dVar.f153390f = jSONObject2.getInt("no_warn_day");
            } catch (JSONException e) {
                C60700b.m235864f("VcHowlingSettingConfig", "[parse]", "parse VcHowlingSettingConfig fail " + e.toString());
            }
        }
        return dVar;
    }
}
