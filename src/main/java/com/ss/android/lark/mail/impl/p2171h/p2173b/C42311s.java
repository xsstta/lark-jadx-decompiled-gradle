package com.ss.android.lark.mail.impl.p2171h.p2173b;

import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a;
import com.ss.android.lark.mail.impl.utils.C43767j;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.s */
public class C42311s extends AbstractC42231a<AbstractC42235a> {
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
        return "email_apm_searchlist_load_start";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: e */
    public String mo152328e() {
        return "email_apm_searchlist_load";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: a */
    public JSONObject mo152315a(AbstractC42231a<AbstractC42235a>.C42232a aVar) {
        return C43767j.m173489a().mo155930a("time_cost_ms", (float) aVar.f107512c).mo155933a(UpdateKey.STATUS, aVar.f107510a).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: d */
    public void mo152327d(String str) {
        if (this.f107788m == null) {
            return;
        }
        if ((this.f107506a == null || this.f107506a.equals("def_bid")) && this.f107788m != null && this.f107507b != null) {
            if (((AbstractC42231a.C42234b) this.f107788m).f107520i == 0 || !TextUtils.isEmpty(this.f107507b.f107510a) || System.currentTimeMillis() - ((AbstractC42231a.C42234b) this.f107788m).f107520i <= 1000) {
                mo152320b((AbstractC42231a.C42234b) this.f107788m, this.f107507b);
                return;
            }
            this.f107507b.f107510a = "re_input";
            mo152317a((AbstractC42231a.C42234b) this.f107788m, this.f107507b);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: b */
    public synchronized void mo152320b(AbstractC42231a.C42234b bVar, AbstractC42231a<AbstractC42235a>.C42232a aVar) {
        if (this.f107507b != null && this.f107507b.f107512c > 0 && C26284k.m95186b(C41816b.m166115a().mo150132b())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("latency", Long.valueOf(this.f107507b.f107512c));
                MonitorUtils.monitorEvent("mail_search_time", null, jSONObject, null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.mo152320b(bVar, aVar);
    }
}
