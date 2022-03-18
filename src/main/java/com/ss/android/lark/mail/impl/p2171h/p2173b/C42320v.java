package com.ss.android.lark.mail.impl.p2171h.p2173b;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42248o;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.v */
public class C42320v extends AbstractC42231a<C42248o> {

    /* renamed from: d */
    private long f107621d;

    /* renamed from: e */
    private long f107622e;

    /* renamed from: f */
    private long f107623f;

    /* renamed from: g */
    private long f107624g;

    /* renamed from: h */
    private long f107625h;

    /* renamed from: i */
    private long f107626i;

    @Override // com.ss.android.lark.mail.impl.p2171h.p2175c.AbstractC42340a, com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: c */
    public boolean mo152325c() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: d */
    public String mo152326d() {
        return "email_apm_send_draft_start";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: e */
    public String mo152328e() {
        return "email_apm_send_draft";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: e */
    public boolean mo152329e(String str) {
        return false;
    }

    /* renamed from: m */
    private void m168995m() {
        this.f107626i = 0;
    }

    /* renamed from: g */
    public void mo152410g() {
        this.f107621d = System.currentTimeMillis();
    }

    /* renamed from: h */
    public void mo152439h() {
        if (this.f107788m != null) {
            this.f107622e = System.currentTimeMillis() - this.f107621d;
        }
    }

    /* renamed from: i */
    public void mo152440i() {
        if (this.f107788m != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f107623f = currentTimeMillis;
            this.f107625h = (currentTimeMillis - ((AbstractC42231a.C42234b) this.f107788m).f107520i) - this.f107622e;
        }
    }

    /* renamed from: j */
    public void mo152441j() {
        if (this.f107626i == 0) {
            this.f107626i = System.currentTimeMillis();
        }
        if (this.f107507b != null) {
            this.f107507b.mo152334b();
        }
    }

    /* renamed from: k */
    public void mo152442k() {
        if (this.f107507b != null) {
            this.f107507b.f107510a = "user_cancel";
            mo152317a((AbstractC42231a.C42234b) this.f107788m, this.f107507b);
            m168995m();
        }
    }

    /* renamed from: l */
    public void mo152443l() {
        if (this.f107507b != null) {
            this.f107507b.f107510a = "blocking";
            mo152317a((AbstractC42231a.C42234b) this.f107788m, this.f107507b);
            m168995m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C42248o mo152324c(String str) {
        return new C42248o(false);
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: b */
    public synchronized void mo152321b(String str) {
        super.mo152321b(str);
        m168995m();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: a */
    public JSONObject mo152315a(AbstractC42231a<C42248o>.C42232a aVar) {
        if (this.f107626i > 0) {
            long j = aVar.f107512c;
            if (this.f107623f - this.f107626i > 0) {
                aVar.f107512c -= this.f107623f - this.f107626i;
            }
            if (aVar.f107512c <= 0) {
                aVar.f107512c = j;
            }
            m168995m();
        }
        this.f107624g = System.currentTimeMillis() - this.f107623f;
        return C43767j.m173489a().mo155930a("mail_body_length", (float) aVar.f107511b).mo155930a("time_get_html_ms", (float) this.f107622e).mo155930a("time_cost_ms", (float) aVar.f107512c).mo155933a(UpdateKey.STATUS, aVar.f107510a).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: b */
    public synchronized void mo152320b(AbstractC42231a.C42234b bVar, AbstractC42231a<C42248o>.C42232a aVar) {
        if (this.f107507b != null && this.f107507b.f107512c > 0 && C26284k.m95186b(C41816b.m166115a().mo150132b())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("latency", Long.valueOf(this.f107507b.f107512c));
                jSONObject.putOpt("get_html_cost_time", Long.valueOf(this.f107622e));
                jSONObject.putOpt("rust_cost_time", Long.valueOf(this.f107624g));
                jSONObject.putOpt("check_cost_time", Long.valueOf(this.f107625h));
                if (this.f107508c != null) {
                    for (Map.Entry<String, Long> entry : ((C42248o) this.f107508c).mo152343d().entrySet()) {
                        jSONObject.putOpt(entry.getKey(), entry.getValue());
                    }
                }
                MonitorUtils.monitorEvent("mail_send_draft_time", null, jSONObject, null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.mo152320b(bVar, aVar);
    }
}
