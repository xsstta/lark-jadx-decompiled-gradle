package com.bytedance.apm.p129b;

import com.bytedance.apm6.util.C3356f;
import com.bytedance.monitor.util.thread.AbstractRunnableC20192d;
import com.bytedance.monitor.util.thread.AsyncTaskType;
import com.bytedance.monitor.util.thread.C20176a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b.b */
public class C2787b {

    /* renamed from: a */
    private final String f8896a;

    /* renamed from: b */
    private List<AbstractC2790a> f8897b;

    /* renamed from: c */
    private boolean f8898c;

    /* renamed from: com.bytedance.apm.b.b$a */
    public interface AbstractC2790a {
        /* renamed from: a */
        void mo12096a(int i, String str, JSONObject jSONObject);

        /* renamed from: a */
        void mo12097a(String str, String str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.b.b$b */
    public static class C2791b {

        /* renamed from: a */
        public static final C2787b f8907a = new C2787b();
    }

    /* renamed from: a */
    public static C2787b m11791a() {
        return C2791b.f8907a;
    }

    private C2787b() {
        this.f8896a = "doctor";
        this.f8897b = new ArrayList();
        this.f8898c = false;
    }

    /* renamed from: a */
    public void mo12090a(final String str, final String str2) {
        if (!C3356f.m13964a(this.f8897b)) {
            final ArrayList arrayList = new ArrayList(this.f8897b);
            C20176a.m73641a().mo68322a(new AbstractRunnableC20192d() {
                /* class com.bytedance.apm.p129b.C2787b.C27881 */

                @Override // com.bytedance.monitor.util.thread.AbstractRunnableC20192d
                /* renamed from: a */
                public String mo12092a() {
                    return "doctor";
                }

                @Override // com.bytedance.monitor.util.thread.AbstractRunnableC20192d
                /* renamed from: b */
                public AsyncTaskType mo12093b() {
                    return AsyncTaskType.LIGHT_WEIGHT;
                }

                public void run() {
                    for (AbstractC2790a aVar : arrayList) {
                        aVar.mo12097a(str, str2);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo12091a(final String str, final JSONObject jSONObject) {
        if (!C3356f.m13964a(this.f8897b) && jSONObject != null) {
            final ArrayList arrayList = new ArrayList(this.f8897b);
            C20176a.m73641a().mo68322a(new AbstractRunnableC20192d() {
                /* class com.bytedance.apm.p129b.C2787b.C27892 */

                @Override // com.bytedance.monitor.util.thread.AbstractRunnableC20192d
                /* renamed from: a */
                public String mo12092a() {
                    return "doctor";
                }

                @Override // com.bytedance.monitor.util.thread.AbstractRunnableC20192d
                /* renamed from: b */
                public AsyncTaskType mo12093b() {
                    return AsyncTaskType.LIGHT_WEIGHT;
                }

                public void run() {
                    try {
                        JSONObject jSONObject = jSONObject.getJSONObject("DATA_DOCTOR");
                        jSONObject.put(str, System.currentTimeMillis());
                        int optInt = jSONObject.optInt("DATA_ID");
                        for (AbstractC2790a aVar : arrayList) {
                            aVar.mo12096a(optInt, str, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
