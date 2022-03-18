package com.lynx.tasm.analytics;

import androidx.collection.C0525g;
import com.lynx.tasm.LynxPerfMetric;
import org.json.JSONObject;

public class LynxViewMonitor implements AbstractC26556b {

    /* renamed from: a */
    private int f65667a;

    /* renamed from: b */
    private C0525g<Long> f65668b = new C0525g<>();

    /* renamed from: c */
    private LynxPerfMetric f65669c;

    public @interface LynxViewMonitorEvents {
    }

    /* renamed from: b */
    private void m96268b() {
        if ((this.f65667a & 15) == 15 && this.f65669c != null) {
            C26558d.m96283a("lynx_rapid_render_perf", this);
        }
    }

    @Override // com.lynx.tasm.analytics.AbstractC26556b
    /* renamed from: a */
    public JSONObject mo94366a() {
        JSONObject jSONObject = this.f65669c.toJSONObject();
        C26558d.m96286a(jSONObject, "LynxViewInit", this.f65668b.mo3047a(1));
        C26558d.m96286a(jSONObject, "layout", this.f65668b.mo3047a(2));
        C26558d.m96286a(jSONObject, "onMeasure", this.f65668b.mo3047a(4));
        C26558d.m96286a(jSONObject, "renderTemplate", this.f65668b.mo3047a(8));
        return jSONObject;
    }

    /* renamed from: a */
    public void mo94368a(LynxPerfMetric lynxPerfMetric) {
        this.f65669c = lynxPerfMetric;
        m96268b();
    }

    /* renamed from: c */
    private boolean m96269c(int i) {
        if ((i & this.f65667a) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo94367a(int i) {
        if (m96269c(i)) {
            this.f65668b.mo3051b(i, Long.valueOf(C26557c.m96277a()));
        }
    }

    /* renamed from: b */
    public void mo94369b(int i) {
        if (m96269c(i)) {
            this.f65667a |= i;
            C0525g<Long> gVar = this.f65668b;
            gVar.mo3051b(i, Long.valueOf(C26557c.m96278a(gVar.mo3047a(i).longValue())));
            m96268b();
        }
    }
}
