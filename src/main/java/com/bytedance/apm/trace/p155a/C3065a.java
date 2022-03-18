package com.bytedance.apm.trace.p155a;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p139e.C2922b;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3118f;
import com.bytedance.apm6.p184h.p185a.C3330b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.trace.a.a */
public class C3065a implements C3047b.AbstractC3052b {

    /* renamed from: a */
    public final HashMap<String, C3067a> f9848a;

    /* renamed from: b */
    private boolean f9849b;

    /* renamed from: com.bytedance.apm.trace.a.a$b */
    private static class C3068b {

        /* renamed from: a */
        public static final C3065a f9857a = new C3065a();
    }

    /* renamed from: a */
    public static C3065a m12801a() {
        return C3068b.f9857a;
    }

    /* renamed from: com.bytedance.apm.trace.a.a$a */
    private static class C3067a {

        /* renamed from: a */
        public String f9853a;

        /* renamed from: b */
        public float f9854b;

        /* renamed from: c */
        private long f9855c = System.currentTimeMillis();

        /* renamed from: d */
        private int f9856d = 1;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo12920a() {
            int i = this.f9856d;
            if (i > 0) {
                return this.f9854b / ((float) i);
            }
            return -1.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12921a(float f) {
            this.f9854b += f;
            this.f9856d++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo12922a(long j) {
            if (j - this.f9855c > 120000) {
                return true;
            }
            return false;
        }

        C3067a(String str, float f) {
            this.f9853a = str;
            this.f9854b = f;
        }
    }

    private C3065a() {
        this.f9848a = new HashMap<>();
        this.f9849b = true;
        C3047b.m12756a().mo12883a(this);
    }

    @Override // com.bytedance.apm.p153n.C3047b.AbstractC3052b
    public void onTimeEvent(long j) {
        if (!this.f9848a.isEmpty()) {
            Iterator<Map.Entry<String, C3067a>> it = this.f9848a.entrySet().iterator();
            int b = C3118f.m12991b();
            while (it.hasNext()) {
                Map.Entry<String, C3067a> next = it.next();
                String key = next.getKey();
                C3067a value = next.getValue();
                if (value.mo12922a(j)) {
                    it.remove();
                    float a = value.mo12920a();
                    boolean z = false;
                    if (C2785b.m11769j()) {
                        String str = C2922b.f9428c;
                        C2925e.m12374c(str, "aggregate fps: " + key + " , value: " + a);
                    }
                    if (a > BitmapDescriptorFactory.HUE_RED) {
                        float f = (float) b;
                        if (a > f) {
                            a = f;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("fps", (double) a);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("scene", key);
                            C2753f fVar = new C2753f("fps", key, jSONObject, jSONObject2, null);
                            C3330b.m13886a(fVar, true);
                            JSONObject jSONObject3 = fVar.f8851f;
                            jSONObject3.put("refresh_rate", b);
                            if (this.f9849b) {
                                this.f9849b = false;
                                jSONObject3.put("device_max_refresh_rate", C3118f.m12992c());
                                if (!C3118f.m12993d()) {
                                    z = true;
                                }
                                jSONObject3.put("refresh_rate_restricted", z);
                            }
                            C2741a.m11630c().mo11785a(fVar);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo12918a(final String str, final float f) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.trace.p155a.C3065a.RunnableC30661 */

            public void run() {
                C3067a aVar = C3065a.this.f9848a.get(str);
                if (aVar == null) {
                    C3065a.this.f9848a.put(str, new C3067a(str, f));
                    return;
                }
                aVar.mo12921a(f);
            }
        });
    }
}
