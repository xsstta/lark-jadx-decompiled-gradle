package com.ss.android.lark.mail.impl.p2171h.p2173b;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a;
import com.ss.android.lark.mail.impl.utils.C43767j;
import com.tt.frontendapiinterface.ApiHandler;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.r */
public class C42310r extends AbstractC42231a<AbstractC42235a> {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: c */
    public AbstractC42235a mo152324c(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: d */
    public String mo152326d() {
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: e */
    public String mo152328e() {
        return "email_apm_rust_call";
    }

    /* renamed from: h */
    public void mo152437h(String str) {
        if (this.f107507b != null) {
            this.f107507b.f107516g = str;
            mo152318a(ApiHandler.API_CALLBACK_EXCEPTION, 0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: a */
    public JSONObject mo152315a(AbstractC42231a<AbstractC42235a>.C42232a aVar) {
        if ("success".equals(aVar.f107510a)) {
            return C43767j.m173489a().mo155933a("command", aVar.f107521j).mo155930a("time_cost_ms", (float) aVar.f107512c).mo155933a(UpdateKey.STATUS, aVar.f107510a).mo155934a();
        }
        return C43767j.m173489a().mo155933a("command", aVar.f107521j).mo155930a("time_cost_ms", (float) aVar.f107512c).mo155933a(UpdateKey.STATUS, aVar.f107510a).mo155933a("error_message", aVar.f107516g).mo155934a();
    }
}
