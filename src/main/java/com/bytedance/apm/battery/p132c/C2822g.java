package com.bytedance.apm.battery.p132c;

import android.os.IBinder;
import com.bytedance.apm.battery.C2795a;
import com.bytedance.apm.battery.config.C2824a;
import com.bytedance.apm.battery.p130a.AbstractC2801d;
import com.bytedance.apm.battery.p131b.C2807b;
import com.bytedance.apm.battery.p132c.p133a.C2815c;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2751d;
import com.bytedance.apm.p137c.C2878a;
import com.bytedance.apm.p143i.C2949b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.c.g */
public class C2822g extends AbstractC2811a<C2815c> implements AbstractC2801d {
    @Override // com.bytedance.apm.battery.p130a.AbstractC2801d
    /* renamed from: a */
    public String mo12131a() {
        return "android.os.IPowerManager";
    }

    public C2822g() {
        super("power");
    }

    /* renamed from: b */
    private void m11931b(Object[] objArr) {
        mo12170e();
        if (C2795a.m11824a().mo12125g() && objArr.length == 2 && objArr[0] != null && (objArr[0] instanceof IBinder)) {
            int hashCode = objArr[0].hashCode();
            C2815c cVar = (C2815c) this.f9015c.get(Integer.valueOf(hashCode));
            if (cVar != null) {
                cVar.f9003e = System.currentTimeMillis();
                this.f9015c.put(Integer.valueOf(hashCode), cVar);
            }
        }
    }

    /* renamed from: a */
    private void m11930a(Object[] objArr) {
        C2815c cVar;
        mo12169d();
        if (C2795a.m11824a().mo12125g() && objArr.length <= 6 && objArr.length >= 4 && objArr[0] != null && (objArr[0] instanceof IBinder)) {
            int hashCode = objArr[0].hashCode();
            if (!this.f9015c.containsKey(Integer.valueOf(hashCode))) {
                cVar = new C2815c();
                if (objArr[1] != null && (objArr[1] instanceof Integer)) {
                    cVar.f9006a = ((Integer) objArr[1]).intValue();
                    if (objArr[2] != null && (objArr[2] instanceof String)) {
                        cVar.f9007b = (String) objArr[2];
                        cVar.f9003e = -1;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                cVar = (C2815c) this.f9015c.get(Integer.valueOf(hashCode));
                if (cVar == null) {
                    return;
                }
            }
            cVar.f9005g = Thread.currentThread().getStackTrace();
            cVar.f9004f = Thread.currentThread().getName();
            cVar.f9002d = System.currentTimeMillis();
            this.f9015c.put(Integer.valueOf(hashCode), cVar);
        }
    }

    @Override // com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: a */
    public void mo12186a(C2807b bVar, C2878a aVar) {
        if (!mo12185f().equals(aVar.f9206b)) {
            return;
        }
        if (aVar.mo12338a()) {
            bVar.mo12158h(aVar.mo12342c());
        } else {
            bVar.mo12151c(aVar.mo12342c());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p132c.AbstractC2811a
    /* renamed from: a */
    public void mo12163a(double d, double d2) {
        int i;
        if (d >= ((double) C2824a.m11947c())) {
            i = 17;
        } else {
            i = 0;
        }
        if (d2 >= ((double) C2824a.m11944b())) {
            i |= 18;
        }
        if (i != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", i).put("total_hold_time", d).put("total_acquire_count", d2);
                if (this.f9015c != null && this.f9015c.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (C2815c cVar : this.f9015c.values()) {
                        jSONArray.put(cVar.mo12177a());
                    }
                    jSONObject.put("detail", jSONArray);
                }
                C2949b.m12422a(jSONObject, "battery_trace");
                C2741a.m11630c().mo11785a(new C2751d("battery_trace", jSONObject));
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12165a(C2815c cVar, long j) {
        if (j >= C2824a.m11941a()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_type", "battery_trace");
                jSONObject.put("issue_type", 16).put("single_hold_time", j).put("wake_lock_info", cVar.toString());
                C2949b.m12422a(jSONObject, "battery_trace");
                C2741a.m11630c().mo11785a(new C2751d("battery_trace", jSONObject));
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @Override // com.bytedance.apm.battery.p130a.AbstractC2801d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo12132a(java.lang.Object r1, java.lang.reflect.Method r2, java.lang.Object[] r3) {
        /*
            r0 = this;
            monitor-enter(r0)
            java.lang.String r1 = r2.getName()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            java.lang.String r2 = "acquireWakeLock"
            boolean r2 = r2.equals(r1)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            if (r2 == 0) goto L_0x0011
            r0.m11930a(r3)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            goto L_0x0020
        L_0x0011:
            java.lang.String r2 = "releaseWakeLock"
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            if (r1 == 0) goto L_0x0020
            r0.m11931b(r3)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            goto L_0x0020
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0020:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.p132c.C2822g.mo12132a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):void");
    }
}
