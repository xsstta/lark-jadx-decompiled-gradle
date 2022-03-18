package com.bytedance.apm.battery.p132c.p133a;

import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.c.a.c */
public class C2815c extends AbstractC2814b {

    /* renamed from: a */
    public int f9006a;

    /* renamed from: b */
    public String f9007b;

    /* renamed from: a */
    public JSONObject mo12177a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("flags", this.f9006a);
            jSONObject.put("tag", this.f9007b);
            jSONObject.put("start_time", this.f9002d);
            jSONObject.put("end_time", this.f9003e);
            jSONObject.put("thread_name", this.f9004f);
            jSONObject.put("thread_stack", mo12176d());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        return "WakeLockInfo{flags=" + this.f9006a + ", tag=" + this.f9007b + ", startTime=" + this.f9002d + ", endTime=" + this.f9003e + ", threadName=" + this.f9004f + ", threadStack=" + mo12176d() + '}';
    }
}
