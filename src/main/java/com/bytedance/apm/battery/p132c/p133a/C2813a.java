package com.bytedance.apm.battery.p132c.p133a;

import android.os.SystemClock;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.c.a.a */
public class C2813a extends AbstractC2814b {

    /* renamed from: a */
    public int f8999a;

    /* renamed from: b */
    public long f9000b;

    /* renamed from: c */
    public String f9001c;

    /* renamed from: b */
    public boolean mo12173b() {
        int i = this.f8999a;
        if (i == 2 || i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public long mo12172a() {
        int i = this.f8999a;
        if (i == 1 || i == 0) {
            return this.f9002d;
        }
        return (this.f9002d + System.currentTimeMillis()) - SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public JSONObject mo12174c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_time", this.f9002d);
            jSONObject.put("end_time", this.f9003e);
            jSONObject.put("thread_name", this.f9004f);
            jSONObject.put("thread_stack", mo12176d());
            jSONObject.put("interval", this.f9000b);
            jSONObject.put(ShareHitPoint.f121869d, this.f8999a);
            jSONObject.put("intent_info", this.f9001c);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        return "AlarmInfo{type=" + this.f8999a + ", interval=" + this.f9000b + ", intentInfo=" + this.f9001c + ", startTime=" + this.f9002d + ", endTime=" + this.f9003e + ", threadName=" + this.f9004f + ", threadStack=" + mo12176d() + '}';
    }
}
