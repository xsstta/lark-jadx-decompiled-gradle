package com.ss.android.lark.mail.impl.p2171h.p2173b;

import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42249p;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.w */
public class C42321w extends AbstractC42231a<C42249p> {

    /* renamed from: d */
    private boolean f107627d;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: d */
    public String mo152326d() {
        return "email_apm_threadlist_load_start";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: e */
    public String mo152328e() {
        return "email_apm_threadlist_load";
    }

    /* renamed from: a */
    public void mo152444a(boolean z) {
        this.f107627d = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C42249p mo152324c(String str) {
        return new C42249p();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: a */
    public JSONObject mo152315a(AbstractC42231a<C42249p>.C42232a aVar) {
        return C43767j.m173489a().mo155933a("sence", aVar.f107521j).mo155930a("list_length", (float) aVar.f107511b).mo155930a("time_cost_ms", (float) aVar.f107512c).mo155933a(UpdateKey.STATUS, aVar.f107510a).mo155931a("from_db", this.f107627d ? 1 : 0).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: b */
    public synchronized void mo152320b(AbstractC42231a.C42234b bVar, AbstractC42231a<C42249p>.C42232a aVar) {
        if (this.f107507b != null && TextUtils.equals(bVar.f107521j, "init") && this.f107507b.f107512c > 0 && C26284k.m95186b(C41816b.m166115a().mo150132b())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("latency", Long.valueOf(this.f107507b.f107512c));
                if (this.f107508c != null) {
                    for (Map.Entry<String, Long> entry : ((C42249p) this.f107508c).mo152343d().entrySet()) {
                        jSONObject.putOpt(entry.getKey(), entry.getValue());
                    }
                }
                MonitorUtils.monitorEvent("mail_startup_get_thread_list_time", null, jSONObject, null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.mo152320b(bVar, aVar);
    }
}
