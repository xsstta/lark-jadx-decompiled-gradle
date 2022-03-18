package com.ss.android.lark.mail.impl.p2171h.p2173b;

import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42242i;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.l */
public class C42290l extends AbstractC42231a<C42242i> {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: b */
    public boolean mo152322b() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: d */
    public String mo152326d() {
        return "email_apm_labellist_load_start";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: e */
    public String mo152328e() {
        return "email_apm_labellist_load";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: e */
    public boolean mo152329e(String str) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C42242i mo152324c(String str) {
        return new C42242i();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: a */
    public JSONObject mo152315a(AbstractC42231a<C42242i>.C42232a aVar) {
        float f;
        float f2;
        C42242i iVar = (C42242i) mo152330f();
        C43767j.C43768a a = C43767j.m173489a().mo155933a("sence", aVar.f107521j).mo155930a("list_length", (float) aVar.f107511b).mo155930a("time_cost_ms", (float) aVar.f107512c).mo155933a(UpdateKey.STATUS, aVar.f107510a);
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (iVar != null) {
            f = (float) iVar.mo152340b("key_execute_request");
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        C43767j.C43768a a2 = a.mo155930a("execute_request_cost_time", f);
        if (iVar != null) {
            f2 = (float) iVar.mo152340b("key_rust_load_success");
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        C43767j.C43768a a3 = a2.mo155930a("rust_cost_time", f2);
        if (iVar != null) {
            f3 = (float) iVar.mo152340b("key_notify_result");
        }
        return a3.mo155930a("notify_result_cost_time", f3).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: b */
    public synchronized void mo152320b(AbstractC42231a.C42234b bVar, AbstractC42231a<C42242i>.C42232a aVar) {
        if (this.f107507b != null && TextUtils.equals(bVar.f107521j, "init") && this.f107507b.f107512c > 0 && C26284k.m95186b(C41816b.m166115a().mo150132b())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("latency", Long.valueOf(this.f107507b.f107512c));
                if (this.f107508c != null) {
                    for (Map.Entry<String, Long> entry : ((C42242i) this.f107508c).mo152343d().entrySet()) {
                        jSONObject.putOpt(entry.getKey(), entry.getValue());
                    }
                }
                MonitorUtils.monitorEvent("mail_startup_get_label_list_time", null, jSONObject, null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.mo152320b(bVar, aVar);
    }
}
