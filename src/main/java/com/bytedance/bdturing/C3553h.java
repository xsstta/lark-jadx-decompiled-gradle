package com.bytedance.bdturing;

import android.view.MotionEvent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.h */
public class C3553h {

    /* renamed from: c */
    private static long f11237c = 1000;

    /* renamed from: a */
    private long f11238a;

    /* renamed from: b */
    private long f11239b;

    /* renamed from: com.bytedance.bdturing.h$a */
    public interface AbstractC3554a {
        /* renamed from: a */
        void mo14252a(JSONObject jSONObject);
    }

    /* renamed from: b */
    public long mo14362b() {
        return this.f11238a;
    }

    /* renamed from: a */
    public void mo14360a() {
        this.f11238a = System.currentTimeMillis();
    }

    /* renamed from: c */
    private boolean m14997c() {
        if (System.currentTimeMillis() - this.f11239b < f11237c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private JSONObject m14996a(MotionEvent motionEvent) {
        JSONObject jSONObject = new JSONObject();
        float pressure = motionEvent.getPressure();
        float touchMajor = motionEvent.getTouchMajor();
        JSONArray jSONArray = new JSONArray();
        long j = this.f11239b - this.f11238a;
        try {
            jSONArray.put((double) motionEvent.getX());
            jSONArray.put((double) motionEvent.getY());
            jSONObject.put("force", (double) pressure);
            jSONObject.put("majorRadius", (double) touchMajor);
            jSONObject.put("click_coordinate", jSONArray);
            jSONObject.put("click_duration", j);
            jSONObject.put("operate_duration", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo14361a(MotionEvent motionEvent, AbstractC3554a aVar) {
        if (!m14997c()) {
            this.f11239b = System.currentTimeMillis();
            aVar.mo14252a(m14996a(motionEvent));
        }
    }
}
